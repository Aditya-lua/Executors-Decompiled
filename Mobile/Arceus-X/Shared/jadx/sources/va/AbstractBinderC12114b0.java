package va;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;

/* JADX INFO: renamed from: va.b0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractBinderC12114b0 extends BinderC12153w implements InterfaceC12116c0 {
    public AbstractBinderC12114b0() {
        super("com.google.android.gms.appdatasearch.internal.ILightweightAppDataSearchCallbacks");
    }

    @Override // va.BinderC12153w
    /* JADX INFO: renamed from: r2 */
    public final boolean mo44954r2(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 != 1) {
            return false;
        }
        Status status = (Status) C12154x.m44979a(parcel, Status.CREATOR);
        C12154x.m44980b(parcel);
        mo44956f(status);
        return true;
    }
}
