package com.google.android.gms.internal.play_billing;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.g */
/* JADX INFO: loaded from: classes.dex */
public class C2504g implements IInterface {

    /* JADX INFO: renamed from: a */
    public final IBinder f8979a;

    /* JADX INFO: renamed from: b */
    public final String f8980b;

    public C2504g(IBinder iBinder, String str) {
        this.f8979a = iBinder;
        this.f8980b = str;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f8979a;
    }

    /* JADX INFO: renamed from: r2 */
    public final Parcel m11415r2() {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(this.f8980b);
        return parcelObtain;
    }

    /* JADX INFO: renamed from: s2 */
    public final Parcel m11416s2(int i10, Parcel parcel) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            try {
                this.f8979a.transact(i10, parcel, parcelObtain, 0);
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

    /* JADX INFO: renamed from: t2 */
    public final void m11417t2(int i10, Parcel parcel) {
        try {
            this.f8979a.transact(i10, parcel, null, 1);
        } finally {
            parcel.recycle();
        }
    }
}
