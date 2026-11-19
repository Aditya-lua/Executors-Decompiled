package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.github.luben.zstd.BuildConfig;

/* JADX INFO: loaded from: classes.dex */
public abstract class b1 extends SQLiteOpenHelper {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b1(Context context, String str, SQLiteDatabase.CursorFactory cursorFactory, int i10) {
        super(context, true == str.equals(BuildConfig.FLAVOR) ? null : str, (SQLiteDatabase.CursorFactory) null, 1);
        e1 e1Var = e1.f6484a;
        y0.a();
    }
}
