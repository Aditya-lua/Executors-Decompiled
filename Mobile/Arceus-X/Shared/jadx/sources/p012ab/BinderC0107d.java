package p012ab;

import android.os.BadParcelableException;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: renamed from: ab.d */
/* JADX INFO: loaded from: classes.dex */
public class BinderC0107d extends Binder implements IInterface {
    public BinderC0107d(String str) {
        attachInterface(this, str);
    }

    @Override // android.os.IInterface
    public IBinder asBinder() {
        return this;
    }

    @Override // android.os.Binder
    public boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (m309t2(i10, parcel, parcel2, i11)) {
            return true;
        }
        return mo307r2(i10, parcel, parcel2, i11);
    }

    /* JADX INFO: renamed from: r2 */
    public boolean mo307r2(int i10, Parcel parcel, Parcel parcel2, int i11) {
        throw null;
    }

    /* JADX INFO: renamed from: s2 */
    public void m308s2(Parcel parcel) {
        int i10 = C0108e.f376a;
        int iDataAvail = parcel.dataAvail();
        if (iDataAvail <= 0) {
            return;
        }
        throw new BadParcelableException("Parcel data not fully consumed, unread size: " + iDataAvail);
    }

    /* JADX INFO: renamed from: t2 */
    public final boolean m309t2(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 > 16777215) {
            return super.onTransact(i10, parcel, parcel2, i11);
        }
        parcel.enforceInterface(getInterfaceDescriptor());
        return false;
    }
}
