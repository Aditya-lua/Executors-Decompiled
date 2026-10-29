package p012ab;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;

/* JADX INFO: renamed from: ab.o */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractBinderC0118o extends BinderC0107d implements InterfaceC0119p {
    public AbstractBinderC0118o() {
        super("com.google.android.gms.auth.blockstore.internal.IStoreBytesCallback");
    }

    @Override // p012ab.BinderC0107d
    /* JADX INFO: renamed from: r2 */
    public final boolean mo307r2(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 != 1) {
            return false;
        }
        Status status = (Status) C0108e.m310a(parcel, Status.CREATOR);
        int i12 = parcel.readInt();
        m308s2(parcel);
        mo322v(status, i12);
        return true;
    }
}
