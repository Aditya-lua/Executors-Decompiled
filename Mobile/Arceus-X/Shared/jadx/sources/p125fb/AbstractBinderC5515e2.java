package p125fb;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.games_v2.zzs;

/* JADX INFO: renamed from: fb.e2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractBinderC5515e2 extends BinderC5553q implements InterfaceC5519f2 {
    public AbstractBinderC5515e2() {
        super("com.google.android.gms.games.internal.connect.IGamesConnectCallbacks");
    }

    @Override // p125fb.BinderC5553q
    /* JADX INFO: renamed from: r2 */
    public final boolean mo25172r2(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 != 2) {
            return false;
        }
        Status status = (Status) C5536k0.m25206b(parcel, Status.CREATOR);
        zzs zzsVar = (zzs) C5536k0.m25206b(parcel, zzs.CREATOR);
        C5536k0.m25209e(parcel);
        mo25177t0(status, zzsVar);
        return true;
    }
}
