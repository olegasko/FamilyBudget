package com.example.android.familybudget.data;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;


public class BudgetDbHelper extends SQLiteOpenHelper {

    public static final String DATABASE_NAME = "budget.db";
    public static final int DATABASE_VERSION = 1;
    public static final String TEXT_TYPE = " TEXT";
    public static final String INTEGER_TYPE = " INTEGER";
    public static final String REAL_TYPE = " REAL";
    public static final String COMMA_SEPARATOR = ", ";
    public static final String PRIMARY_KEY_AUTOINCREMENT = " PRIMARY KEY AUTOINCREMENT";

    public BudgetDbHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase database) {
        database.execSQL("CREATE TABLE " + BudgetContract.BudgetEntry.TABLE_NAME + "("
        + BudgetContract.BudgetEntry._ID +  INTEGER_TYPE + PRIMARY_KEY_AUTOINCREMENT + COMMA_SEPARATOR
        + BudgetContract.BudgetEntry.COLUMN_DATA + INTEGER_TYPE + COMMA_SEPARATOR
        + BudgetContract.BudgetEntry.COLUMN_AMOUNT + REAL_TYPE + COMMA_SEPARATOR
        + BudgetContract.BudgetEntry.COLUMN_IN_OUTCOME + INTEGER_TYPE + COMMA_SEPARATOR
        + BudgetContract.BudgetEntry.SPENDING_TYPE + TEXT_TYPE + ");");

    }

    @Override
    public void onUpgrade(SQLiteDatabase database, int oldVersion, int newVersion) {

    }
}
