package gb;

import android.os.BadParcelableException;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: renamed from: gb.b */
/* JADX INFO: loaded from: classes.dex */
public class BinderC6082b extends Binder implements IInterface {
    public BinderC6082b(String str) {
        attachInterface(this, str);
    }

    @Override // android.os.IInterface
    public IBinder asBinder() {
        return this;
    }

    @Override // android.os.Binder
    public boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (m26948t2(i10, parcel, parcel2, i11)) {
            return true;
        }
        return mo26946r2(i10, parcel, parcel2, i11);
    }

    /* JADX INFO: renamed from: r2 */
    public boolean mo26946r2(int i10, Parcel parcel, Parcel parcel2, int i11) {
        throw null;
    }

    /* JADX INFO: renamed from: s2 */
    public void m26947s2(Parcel parcel) {
        int i10 = C6083c.f23383a;
        int iDataAvail = parcel.dataAvail();
        if (iDataAvail <= 0) {
            return;
        }
        StringBuilder sb2 = new StringBuilder(String.valueOf(iDataAvail).length() + 45);
        sb2.append("Parcel data not fully consumed, unread size: ");
        sb2.append(iDataAvail);
        throw new BadParcelableException(sb2.toString());
    }

    /* JADX INFO: renamed from: t2 */
    public final boolean m26948t2(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 > 16777215) {
            return super.onTransact(i10, parcel, parcel2, i11);
        }
        parcel.enforceInterface(getInterfaceDescriptor());
        return false;
    }
}
