package com.google.android.gms.internal.measurement;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.p0 */
/* JADX INFO: loaded from: classes.dex */
public class BinderC2238p0 extends Binder implements IInterface {
    public BinderC2238p0(String str) {
        attachInterface(this, str);
    }

    @Override // android.os.IInterface
    public IBinder asBinder() {
        return this;
    }

    @Override // android.os.Binder
    public boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 <= 16777215) {
            parcel.enforceInterface(getInterfaceDescriptor());
        } else if (super.onTransact(i10, parcel, parcel2, i11)) {
            return true;
        }
        return mo9842r2(i10, parcel, parcel2, i11);
    }

    /* JADX INFO: renamed from: r2 */
    public boolean mo9842r2(int i10, Parcel parcel, Parcel parcel2, int i11) {
        throw null;
    }
}
