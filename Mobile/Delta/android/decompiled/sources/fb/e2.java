package fb;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.games_v2.zzs;

/* JADX INFO: loaded from: classes.dex */
public abstract class e2 extends q implements f2 {
    public e2() {
        super("com.google.android.gms.games.internal.connect.IGamesConnectCallbacks");
    }

    @Override // fb.q
    public final boolean r2(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 != 2) {
            return false;
        }
        Status status = (Status) k0.b(parcel, Status.CREATOR);
        zzs zzsVar = (zzs) k0.b(parcel, zzs.CREATOR);
        k0.e(parcel);
        v0(status, zzsVar);
        return true;
    }
}
