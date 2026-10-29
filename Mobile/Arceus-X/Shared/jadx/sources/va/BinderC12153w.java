package va;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: renamed from: va.w */
/* JADX INFO: loaded from: classes.dex */
public class BinderC12153w extends Binder implements IInterface {
    public BinderC12153w(String str) {
        attachInterface(this, "com.google.android.gms.appdatasearch.internal.ILightweightAppDataSearchCallbacks");
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
        return mo44954r2(i10, parcel, parcel2, i11);
    }

    /* JADX INFO: renamed from: r2 */
    public boolean mo44954r2(int i10, Parcel parcel, Parcel parcel2, int i11) {
        throw null;
    }
}
