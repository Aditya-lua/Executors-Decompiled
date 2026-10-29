package be;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: renamed from: be.h1 */
/* JADX INFO: loaded from: classes2.dex */
public class BinderC1328h1 extends Binder implements IInterface {
    public BinderC1328h1(String str) {
        attachInterface(this, "com.google.android.play.core.splitinstall.protocol.ISplitInstallServiceCallback");
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 <= 16777215) {
            parcel.enforceInterface(getInterfaceDescriptor());
        } else if (super.onTransact(i10, parcel, parcel2, i11)) {
            return true;
        }
        return mo7167r2(i10, parcel, parcel2, i11);
    }

    /* JADX INFO: renamed from: r2 */
    public boolean mo7167r2(int i10, Parcel parcel, Parcel parcel2, int i11) {
        throw null;
    }
}
