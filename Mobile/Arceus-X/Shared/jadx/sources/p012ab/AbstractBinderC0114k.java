package p012ab;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;

/* JADX INFO: renamed from: ab.k */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractBinderC0114k extends BinderC0107d implements InterfaceC0115l {
    public AbstractBinderC0114k() {
        super("com.google.android.gms.auth.blockstore.internal.IIsEndToEndEncryptionAvailableCallback");
    }

    @Override // p012ab.BinderC0107d
    /* JADX INFO: renamed from: r2 */
    public final boolean mo307r2(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 != 1) {
            return false;
        }
        Status status = (Status) C0108e.m310a(parcel, Status.CREATOR);
        boolean zM313d = C0108e.m313d(parcel);
        m308s2(parcel);
        mo320h(status, zM313d);
        return true;
    }
}
