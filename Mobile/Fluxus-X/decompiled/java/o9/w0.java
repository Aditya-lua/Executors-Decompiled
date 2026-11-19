package o9;

import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public final class w0 implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final IBinder f27058a;

    public w0(IBinder iBinder) {
        this.f27058a = iBinder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f27058a;
    }

    @Override // o9.n
    public final void h1(m mVar, h hVar) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
            parcelObtain.writeStrongBinder(mVar != null ? mVar.asBinder() : null);
            if (hVar != null) {
                parcelObtain.writeInt(1);
                o1.a(hVar, parcelObtain, 0);
            } else {
                parcelObtain.writeInt(0);
            }
            this.f27058a.transact(46, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }
}
