package com.google.android.gms.common.data;

import android.database.CursorIndexOutOfBoundsException;
import android.database.CursorWindow;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.HashMap;
import m9.h;
import n9.m;
import o9.b;

/* JADX INFO: loaded from: classes.dex */
@KeepName
public final class DataHolder extends AbstractSafeParcelable implements Closeable {

    @NonNull
    public static final Parcelable.Creator<DataHolder> CREATOR = new h();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final a f5750p = new com.google.android.gms.common.data.a(new String[0], null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f5751f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String[] f5752g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Bundle f5753h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final CursorWindow[] f5754i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f5755j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Bundle f5756k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int[] f5757l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f5758m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f5759n = false;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f5760o = true;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String[] f5761a;
        public final ArrayList b = new ArrayList();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final HashMap f5762c = new HashMap();
    }

    public DataHolder(int i10, String[] strArr, CursorWindow[] cursorWindowArr, int i11, Bundle bundle) {
        this.f5751f = i10;
        this.f5752g = strArr;
        this.f5754i = cursorWindowArr;
        this.f5755j = i11;
        this.f5756k = bundle;
    }

    public int A3(int i10) {
        int length;
        int i11 = 0;
        m.p(i10 >= 0 && i10 < this.f5758m);
        while (true) {
            int[] iArr = this.f5757l;
            length = iArr.length;
            if (i11 >= length) {
                break;
            }
            if (i10 < iArr[i11]) {
                i11--;
                break;
            }
            i11++;
        }
        return i11 == length ? i11 - 1 : i11;
    }

    public boolean B3(@NonNull String str) {
        return this.f5753h.containsKey(str);
    }

    public boolean C3(@NonNull String str, int i10, int i11) {
        F3(str, i10);
        return this.f5754i[i11].isNull(i10, this.f5753h.getInt(str));
    }

    public final float D3(@NonNull String str, int i10, int i11) {
        F3(str, i10);
        return this.f5754i[i11].getFloat(i10, this.f5753h.getInt(str));
    }

    public final void E3() {
        this.f5753h = new Bundle();
        int i10 = 0;
        int i11 = 0;
        while (true) {
            String[] strArr = this.f5752g;
            if (i11 >= strArr.length) {
                break;
            }
            this.f5753h.putInt(strArr[i11], i11);
            i11++;
        }
        this.f5757l = new int[this.f5754i.length];
        int numRows = 0;
        while (true) {
            CursorWindow[] cursorWindowArr = this.f5754i;
            if (i10 >= cursorWindowArr.length) {
                this.f5758m = numRows;
                return;
            }
            this.f5757l[i10] = numRows;
            numRows += this.f5754i[i10].getNumRows() - (numRows - cursorWindowArr[i10].getStartPosition());
            i10++;
        }
    }

    public final void F3(String str, int i10) {
        Bundle bundle = this.f5753h;
        if (bundle == null || !bundle.containsKey(str)) {
            throw new IllegalArgumentException("No such column: ".concat(String.valueOf(str)));
        }
        if (isClosed()) {
            throw new IllegalArgumentException("Buffer is closed.");
        }
        if (i10 < 0 || i10 >= this.f5758m) {
            throw new CursorIndexOutOfBoundsException(i10, this.f5758m);
        }
    }

    public boolean a(@NonNull String str, int i10, int i11) {
        F3(str, i10);
        return this.f5754i[i11].getLong(i10, this.f5753h.getInt(str)) == 1;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        synchronized (this) {
            try {
                if (!this.f5759n) {
                    this.f5759n = true;
                    int i10 = 0;
                    while (true) {
                        CursorWindow[] cursorWindowArr = this.f5754i;
                        if (i10 >= cursorWindowArr.length) {
                            break;
                        }
                        cursorWindowArr[i10].close();
                        i10++;
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void finalize() throws Throwable {
        try {
            if (this.f5760o && this.f5754i.length > 0 && !isClosed()) {
                close();
                Log.e("DataBuffer", "Internal data leak within a DataBuffer object detected!  Be sure to explicitly call release() on all DataBuffer extending objects when you are done with them. (internal object: " + toString() + ")");
            }
        } finally {
            super.finalize();
        }
    }

    public int getCount() {
        return this.f5758m;
    }

    public boolean isClosed() {
        boolean z10;
        synchronized (this) {
            z10 = this.f5759n;
        }
        return z10;
    }

    public int v3(@NonNull String str, int i10, int i11) {
        F3(str, i10);
        return this.f5754i[i11].getInt(i10, this.f5753h.getInt(str));
    }

    public long w3(@NonNull String str, int i10, int i11) {
        F3(str, i10);
        return this.f5754i[i11].getLong(i10, this.f5753h.getInt(str));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i10) {
        String[] strArr = this.f5752g;
        int iA = b.a(parcel);
        b.w(parcel, 1, strArr, false);
        b.y(parcel, 2, this.f5754i, i10, false);
        b.n(parcel, 3, y3());
        b.f(parcel, 4, x3(), false);
        b.n(parcel, 1000, this.f5751f);
        b.b(parcel, iA);
        if ((i10 & 1) != 0) {
            close();
        }
    }

    public Bundle x3() {
        return this.f5756k;
    }

    public int y3() {
        return this.f5755j;
    }

    @NonNull
    public String z3(@NonNull String str, int i10, int i11) {
        F3(str, i10);
        return this.f5754i[i11].getString(i10, this.f5753h.getInt(str));
    }
}
