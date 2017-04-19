package com.example.android.familybudget.data;


import android.provider.BaseColumns;

public final class BudgetContract {

    public static final class BudgetEntry implements BaseColumns {

        public static final String TABLE_NAME = "Budget";

        public static final String _ID = BaseColumns._ID;
        public static final String COLUMN_DATA = "data";
        public static final String COLUMN_AMOUNT = "amount";
        public static final String COLUMN_IN_OUTCOME = "income_outcome";
        public static final String SPENDING_TYPE = "spending";

    }

}
