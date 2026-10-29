package com.google.android.gms.internal.measurement;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.o0 */
/* JADX INFO: loaded from: classes.dex */
public class C2220o0 implements IInterface {

    /* JADX INFO: renamed from: a */
    public final IBinder f8517a;

    /* JADX INFO: renamed from: b */
    public final String f8518b;

    public C2220o0(IBinder iBinder, String str) {
        this.f8517a = iBinder;
        this.f8518b = str;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f8517a;
    }

    /* JADX INFO: renamed from: r2 */
    public final Parcel m10473r2(int i10, Parcel parcel) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            try {
                this.f8517a.transact(i10, parcel, parcelObtain, 0);
                parcelObtain.readException();
                parcel.recycle();
                return parcelObtain;
            } catch (RuntimeException e10) {
                parcelObtain.recycle();
                throw e10;
            }
        } catch (Throwable th2) {
            parcel.recycle();
            throw th2;
        }
    }

    /* JADX INFO: renamed from: s2 */
    public final Parcel m10474s2() {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(this.f8518b);
        return parcelObtain;
    }

    /* JADX INFO: renamed from: t2 */
    public final void m10475t2(int i10, Parcel parcel) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            this.f8517a.transact(i10, parcel, parcelObtain, 0);
            parcelObtain.readException();
        } finally {
            parcel.recycle();
            parcelObtain.recycle();
        }
    }

    /* JADX INFO: renamed from: u2 */
    public final void m10476u2(int i10, Parcel parcel) {
        try {
            this.f8517a.transact(2, parcel, null, 1);
        } finally {
            parcel.recycle();
        }
    }
}
