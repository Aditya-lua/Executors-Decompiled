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
import p290m9.C8477h;
import p305n9.C8953m;
import p325o9.C9718b;

/* JADX INFO: loaded from: classes.dex */
@KeepName
public final class DataHolder extends AbstractSafeParcelable implements Closeable {

    @NonNull
    public static final Parcelable.Creator<DataHolder> CREATOR = new C8477h();

    /* JADX INFO: renamed from: p */
    public static final C1900a f7438p = new C1901a(new String[0], null);

    /* JADX INFO: renamed from: f */
    public final int f7439f;

    /* JADX INFO: renamed from: g */
    public final String[] f7440g;

    /* JADX INFO: renamed from: h */
    public Bundle f7441h;

    /* JADX INFO: renamed from: i */
    public final CursorWindow[] f7442i;

    /* JADX INFO: renamed from: j */
    public final int f7443j;

    /* JADX INFO: renamed from: k */
    public final Bundle f7444k;

    /* JADX INFO: renamed from: l */
    public int[] f7445l;

    /* JADX INFO: renamed from: m */
    public int f7446m;

    /* JADX INFO: renamed from: n */
    public boolean f7447n = false;

    /* JADX INFO: renamed from: o */
    public boolean f7448o = true;

    /* JADX INFO: renamed from: com.google.android.gms.common.data.DataHolder$a */
    public static class C1900a {

        /* JADX INFO: renamed from: a */
        public final String[] f7449a;

        /* JADX INFO: renamed from: b */
        public final ArrayList f7450b = new ArrayList();

        /* JADX INFO: renamed from: c */
        public final HashMap f7451c = new HashMap();
    }

    public DataHolder(int i10, String[] strArr, CursorWindow[] cursorWindowArr, int i11, Bundle bundle) {
        this.f7439f = i10;
        this.f7440g = strArr;
        this.f7442i = cursorWindowArr;
        this.f7443j = i11;
        this.f7444k = bundle;
    }

    /* JADX INFO: renamed from: A3 */
    public int m9188A3(int i10) {
        int length;
        int i11 = 0;
        C8953m.m36051p(i10 >= 0 && i10 < this.f7446m);
        while (true) {
            int[] iArr = this.f7445l;
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

    /* JADX INFO: renamed from: B3 */
    public boolean m9189B3(@NonNull String str) {
        return this.f7441h.containsKey(str);
    }

    /* JADX INFO: renamed from: C3 */
    public boolean m9190C3(@NonNull String str, int i10, int i11) {
        m9193F3(str, i10);
        return this.f7442i[i11].isNull(i10, this.f7441h.getInt(str));
    }

    /* JADX INFO: renamed from: D3 */
    public final float m9191D3(@NonNull String str, int i10, int i11) {
        m9193F3(str, i10);
        return this.f7442i[i11].getFloat(i10, this.f7441h.getInt(str));
    }

    /* JADX INFO: renamed from: E3 */
    public final void m9192E3() {
        this.f7441h = new Bundle();
        int i10 = 0;
        int i11 = 0;
        while (true) {
            String[] strArr = this.f7440g;
            if (i11 >= strArr.length) {
                break;
            }
            this.f7441h.putInt(strArr[i11], i11);
            i11++;
        }
        this.f7445l = new int[this.f7442i.length];
        int numRows = 0;
        while (true) {
            CursorWindow[] cursorWindowArr = this.f7442i;
            if (i10 >= cursorWindowArr.length) {
                this.f7446m = numRows;
                return;
            }
            this.f7445l[i10] = numRows;
            numRows += this.f7442i[i10].getNumRows() - (numRows - cursorWindowArr[i10].getStartPosition());
            i10++;
        }
    }

    /* JADX INFO: renamed from: F3 */
    public final void m9193F3(String str, int i10) {
        Bundle bundle = this.f7441h;
        if (bundle == null || !bundle.containsKey(str)) {
            throw new IllegalArgumentException("No such column: ".concat(String.valueOf(str)));
        }
        if (isClosed()) {
            throw new IllegalArgumentException("Buffer is closed.");
        }
        if (i10 < 0 || i10 >= this.f7446m) {
            throw new CursorIndexOutOfBoundsException(i10, this.f7446m);
        }
    }

    /* JADX INFO: renamed from: a */
    public boolean m9194a(@NonNull String str, int i10, int i11) {
        m9193F3(str, i10);
        return this.f7442i[i11].getLong(i10, this.f7441h.getInt(str)) == 1;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        synchronized (this) {
            try {
                if (!this.f7447n) {
                    this.f7447n = true;
                    int i10 = 0;
                    while (true) {
                        CursorWindow[] cursorWindowArr = this.f7442i;
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
            if (this.f7448o && this.f7442i.length > 0 && !isClosed()) {
                close();
                Log.e("DataBuffer", "Internal data leak within a DataBuffer object detected!  Be sure to explicitly call release() on all DataBuffer extending objects when you are done with them. (internal object: " + toString() + ")");
            }
        } finally {
            super.finalize();
        }
    }

    public int getCount() {
        return this.f7446m;
    }

    public boolean isClosed() {
        boolean z10;
        synchronized (this) {
            z10 = this.f7447n;
        }
        return z10;
    }

    /* JADX INFO: renamed from: v3 */
    public int m9195v3(@NonNull String str, int i10, int i11) {
        m9193F3(str, i10);
        return this.f7442i[i11].getInt(i10, this.f7441h.getInt(str));
    }

    /* JADX INFO: renamed from: w3 */
    public long m9196w3(@NonNull String str, int i10, int i11) {
        m9193F3(str, i10);
        return this.f7442i[i11].getLong(i10, this.f7441h.getInt(str));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i10) {
        String[] strArr = this.f7440g;
        int iM38457a = C9718b.m38457a(parcel);
        C9718b.m38479w(parcel, 1, strArr, false);
        C9718b.m38481y(parcel, 2, this.f7442i, i10, false);
        C9718b.m38470n(parcel, 3, m9198y3());
        C9718b.m38462f(parcel, 4, m9197x3(), false);
        C9718b.m38470n(parcel, 1000, this.f7439f);
        C9718b.m38458b(parcel, iM38457a);
        if ((i10 & 1) != 0) {
            close();
        }
    }

    /* JADX INFO: renamed from: x3 */
    public Bundle m9197x3() {
        return this.f7444k;
    }

    /* JADX INFO: renamed from: y3 */
    public int m9198y3() {
        return this.f7443j;
    }

    @NonNull
    /* JADX INFO: renamed from: z3 */
    public String m9199z3(@NonNull String str, int i10, int i11) {
        m9193F3(str, i10);
        return this.f7442i[i11].getString(i10, this.f7441h.getInt(str));
    }
}
