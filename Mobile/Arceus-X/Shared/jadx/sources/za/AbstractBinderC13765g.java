package za;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;

/* JADX INFO: renamed from: za.g */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractBinderC13765g extends BinderC13762d implements InterfaceC13766h {
    public AbstractBinderC13765g() {
        super("com.google.android.gms.auth.api.phone.internal.ISmsRetrieverResultCallback");
    }

    @Override // za.BinderC13762d
    /* JADX INFO: renamed from: r2 */
    public final boolean mo50172r2(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 != 1) {
            return false;
        }
        Status status = (Status) C13763e.m50173a(parcel, Status.CREATOR);
        C13763e.m50174b(parcel);
        mo50177f(status);
        return true;
    }
}
