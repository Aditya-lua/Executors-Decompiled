package p305n9;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.internal.GetServiceRequest;

/* JADX INFO: renamed from: n9.m0 */
/* JADX INFO: loaded from: classes.dex */
public final class C8954m0 implements InterfaceC8941i {

    /* JADX INFO: renamed from: a */
    public final IBinder f32623a;

    public C8954m0(IBinder iBinder) {
        this.f32623a = iBinder;
    }

    @Override // p305n9.InterfaceC8941i
    /* JADX INFO: renamed from: R */
    public final void mo36019R(InterfaceC8938h interfaceC8938h, GetServiceRequest getServiceRequest) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
            parcelObtain.writeStrongBinder(interfaceC8938h != null ? interfaceC8938h.asBinder() : null);
            if (getServiceRequest != null) {
                parcelObtain.writeInt(1);
                C8928d1.m35978a(getServiceRequest, parcelObtain, 0);
            } else {
                parcelObtain.writeInt(0);
            }
            this.f32623a.transact(46, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f32623a;
    }
}
