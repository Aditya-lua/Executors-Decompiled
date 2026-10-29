package p512wa;

import android.os.Parcel;
import com.google.android.gms.appset.zzc;
import com.google.android.gms.common.api.Status;

/* JADX INFO: renamed from: wa.e */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractBinderC12332e extends BinderC12329b implements InterfaceC12333f {
    public AbstractBinderC12332e() {
        super("com.google.android.gms.appset.internal.IAppSetIdCallback");
    }

    @Override // p512wa.BinderC12329b
    /* JADX INFO: renamed from: r2 */
    public final boolean mo46185r2(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 != 1) {
            return false;
        }
        mo46189g0((Status) C12330c.m46186a(parcel, Status.CREATOR), (zzc) C12330c.m46186a(parcel, zzc.CREATOR));
        return true;
    }
}
