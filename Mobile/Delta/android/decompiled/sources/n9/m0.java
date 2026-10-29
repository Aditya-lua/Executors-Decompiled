package n9;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.internal.GetServiceRequest;

/* JADX INFO: loaded from: classes.dex */
public final class m0 implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final IBinder f25289a;

    public m0(IBinder iBinder) {
        this.f25289a = iBinder;
    }

    @Override // n9.i
    public final void T(h hVar, GetServiceRequest getServiceRequest) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
            parcelObtain.writeStrongBinder(hVar != null ? hVar.asBinder() : null);
            if (getServiceRequest != null) {
                parcelObtain.writeInt(1);
                d1.a(getServiceRequest, parcelObtain, 0);
            } else {
                parcelObtain.writeInt(0);
            }
            this.f25289a.transact(46, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f25289a;
    }
}
