package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.b1 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1981b1 extends SQLiteOpenHelper {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC1981b1(Context context, String str, SQLiteDatabase.CursorFactory cursorFactory, int i10) {
        super(context, true == str.equals("") ? null : str, (SQLiteDatabase.CursorFactory) null, 1);
        AbstractC2038e1 abstractC2038e1 = AbstractC2038e1.f8155a;
        C2400y0.m10991a();
    }
}
