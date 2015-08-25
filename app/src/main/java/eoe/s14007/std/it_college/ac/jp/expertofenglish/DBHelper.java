package eoe.s14007.std.it_college.ac.jp.expertofenglish;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.sql.SQLException;


public class DBHelper extends SQLiteOpenHelper {
    private static final String TAG = "DBHelper";
    private static final String SRC_DATABASE_NAME = "EnglishMaster.sqlite3";  // assetsフォルダにあるdbのファイル名
    private static final String DATABASE_NAME = "EnglishMaster";  // コピー先のDB名
    private static final int DATABASE_VERSION = 1;

    private final Context context;
    private final File databasePath;
    private boolean createDatabase = false;

    public DBHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
        this.context = context;
        this.databasePath = context.getDatabasePath(DATABASE_NAME);
    }

    @Override
    public synchronized SQLiteDatabase getWritableDatabase() {
        SQLiteDatabase database = super.getWritableDatabase();
        if (createDatabase) {
            try {
                database = copyDatabase(database);
            } catch (IOException e) {
                Log.wtf(TAG, e);
                database.close();
            }
        }
        return database;
    }

    private SQLiteDatabase copyDatabase(SQLiteDatabase database) throws IOException {
        // dbがひらきっぱなしなので、書き換えできるように閉じる
        database.close();

        // コピー！
        InputStream input = context.getAssets().open(SRC_DATABASE_NAME);
        OutputStream output = new FileOutputStream(databasePath);
        copy(input, output);

        createDatabase = false;
        // dbを閉じたので、また開く
        return super.getWritableDatabase();

    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        super.onOpen(db);
        // getWritableDatabase()したときに呼ばれてくるので、
        // 初期化する必要があることを保存する
        this.createDatabase = true;
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        String s = "DROP TABLE IF EXISTS " + SRC_DATABASE_NAME;
        db.execSQL(s);
    }

    // CopyUtilsからのコピペ
    private static int copy(InputStream input, OutputStream output) throws IOException {
        byte[] buffer = new byte[1024 * 4];
        int count = 0;
        int n;
        while (-1 != (n = input.read(buffer))) {
            output.write(buffer, 0, n);
            count += n;
        }
        return count;
    }
}