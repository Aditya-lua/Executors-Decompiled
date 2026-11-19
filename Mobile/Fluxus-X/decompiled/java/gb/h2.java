package gb;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;

/* JADX INFO: loaded from: classes.dex */
public abstract class h2 extends r implements i2 {
    public h2() {
        super("com.google.android.gms.games.internal.connect.IGamesConnectCallbacks");
    }

    @Override // gb.r
    public final boolean r2(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 != 2) {
            return false;
        }
        Status status = (Status) l0.b(parcel, Status.CREATOR);
        f2 f2Var = (f2) l0.b(parcel, f2.CREATOR);
        l0.e(parcel);
        k1(status, f2Var);
        return true;
    }
}
