package fb;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.games_v2.zzq;

/* JADX INFO: loaded from: classes.dex */
public final class g2 extends a implements IInterface {
    public g2(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.games.internal.connect.IGamesConnectService");
    }

    public final void t2(f2 f2Var, zzq zzqVar) {
        Parcel parcelR2 = r2();
        k0.d(parcelR2, f2Var);
        k0.c(parcelR2, zzqVar);
        s2(2, parcelR2);
    }
}
