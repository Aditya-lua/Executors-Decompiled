package com.google.android.gms.common.data;

import android.database.CursorIndexOutOfBoundsException;
import android.database.CursorWindow;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepName;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.HashMap;
import n9.h;
import o9.s;
import p9.c;

/* JADX INFO: loaded from: classes.dex */
@KeepName
public final class DataHolder extends p9.a implements Closeable {

    @NonNull
    public static final Parcelable.Creator<DataHolder> CREATOR = new h();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final a f6140p = new com.google.android.gms.common.data.a(new String[0], null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f6141f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String[] f6142g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Bundle f6143h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final CursorWindow[] f6144i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f6145j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Bundle f6146k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int[] f6147l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f6148m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f6149n = false;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f6150o = true;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String[] f6151a;
        public final ArrayList b = new ArrayList();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final HashMap f6152c = new HashMap();
    }

    public DataHolder(int i10, String[] strArr, CursorWindow[] cursorWindowArr, int i11, Bundle bundle) {
        this.f6141f = i10;
        this.f6142g = strArr;
        this.f6144i = cursorWindowArr;
        this.f6145j = i11;
        this.f6146k = bundle;
    }

    public int A3(@NonNull String str, int i10, int i11) {
        K3(str, i10);
        return this.f6144i[i11].getInt(i10, this.f6143h.getInt(str));
    }

    public long B3(@NonNull String str, int i10, int i11) {
        K3(str, i10);
        return this.f6144i[i11].getLong(i10, this.f6143h.getInt(str));
    }

    public Bundle C3() {
        return this.f6146k;
    }

    public int D3() {
        return this.f6145j;
    }

    @NonNull
    public String E3(@NonNull String str, int i10, int i11) {
        K3(str, i10);
        return this.f6144i[i11].getString(i10, this.f6143h.getInt(str));
    }

    public int F3(int i10) {
        int length;
        int i11 = 0;
        s.p(i10 >= 0 && i10 < this.f6148m);
        while (true) {
            int[] iArr = this.f6147l;
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

    public boolean G3(@NonNull String str) {
        return this.f6143h.containsKey(str);
    }

    public boolean H3(@NonNull String str, int i10, int i11) {
        K3(str, i10);
        return this.f6144i[i11].isNull(i10, this.f6143h.getInt(str));
    }

    public final float I3(@NonNull String str, int i10, int i11) {
        K3(str, i10);
        return this.f6144i[i11].getFloat(i10, this.f6143h.getInt(str));
    }

    public final void J3() {
        this.f6143h = new Bundle();
        int i10 = 0;
        int i11 = 0;
        while (true) {
            String[] strArr = this.f6142g;
            if (i11 >= strArr.length) {
                break;
            }
            this.f6143h.putInt(strArr[i11], i11);
            i11++;
        }
        this.f6147l = new int[this.f6144i.length];
        int numRows = 0;
        while (true) {
            CursorWindow[] cursorWindowArr = this.f6144i;
            if (i10 >= cursorWindowArr.length) {
                this.f6148m = numRows;
                return;
            }
            this.f6147l[i10] = numRows;
            numRows += this.f6144i[i10].getNumRows() - (numRows - cursorWindowArr[i10].getStartPosition());
            i10++;
        }
    }

    public final void K3(String str, int i10) {
        Bundle bundle = this.f6143h;
        if (bundle == null || !bundle.containsKey(str)) {
            throw new IllegalArgumentException("No such column: ".concat(String.valueOf(str)));
        }
        if (isClosed()) {
            throw new IllegalArgumentException("Buffer is closed.");
        }
        if (i10 < 0 || i10 >= this.f6148m) {
            throw new CursorIndexOutOfBoundsException(i10, this.f6148m);
        }
    }

    public boolean a(@NonNull String str, int i10, int i11) {
        K3(str, i10);
        return this.f6144i[i11].getLong(i10, this.f6143h.getInt(str)) == 1;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        synchronized (this) {
            try {
                if (!this.f6149n) {
                    this.f6149n = true;
                    int i10 = 0;
                    while (true) {
                        CursorWindow[] cursorWindowArr = this.f6144i;
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
            if (this.f6150o && this.f6144i.length > 0 && !isClosed()) {
                close();
                Log.e("DataBuffer", "Internal data leak within a DataBuffer object detected!  Be sure to explicitly call release() on all DataBuffer extending objects when you are done with them. (internal object: " + toString() + ")");
            }
        } finally {
            super.finalize();
        }
    }

    public int getCount() {
        return this.f6148m;
    }

    public boolean isClosed() {
        boolean z10;
        synchronized (this) {
            z10 = this.f6149n;
        }
        return z10;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i10) {
        String[] strArr = this.f6142g;
        int iA = c.a(parcel);
        c.w(parcel, 1, strArr, false);
        c.y(parcel, 2, this.f6144i, i10, false);
        c.n(parcel, 3, D3());
        c.f(parcel, 4, C3(), false);
        c.n(parcel, 1000, this.f6141f);
        c.b(parcel, iA);
        if ((i10 & 1) != 0) {
            close();
        }
    }
}
