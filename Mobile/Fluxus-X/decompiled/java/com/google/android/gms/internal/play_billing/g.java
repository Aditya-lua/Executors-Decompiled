package com.google.android.gms.internal.play_billing;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public class g implements IInterface {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final IBinder f7049a;
    public final String b;

    public g(IBinder iBinder, String str) {
        this.f7049a = iBinder;
        this.b = str;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f7049a;
    }

    public final Parcel r2() {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(this.b);
        return parcelObtain;
    }

    public final Parcel s2(int i10, Parcel parcel) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            try {
                this.f7049a.transact(i10, parcel, parcelObtain, 0);
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

    public final void t2(int i10, Parcel parcel) {
        try {
            this.f7049a.transact(i10, parcel, null, 1);
        } finally {
            parcel.recycle();
        }
    }
}
