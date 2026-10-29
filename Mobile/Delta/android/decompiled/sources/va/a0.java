package va;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.appindex.zzk;

/* JADX INFO: loaded from: classes.dex */
public final class a0 extends a implements IInterface {
    public a0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.appdatasearch.internal.ILightweightAppDataSearch");
    }

    public final void u2(c0 c0Var, zzk[] zzkVarArr) {
        Parcel parcelR2 = r2();
        x.d(parcelR2, c0Var);
        parcelR2.writeTypedArray(zzkVarArr, 0);
        t2(7, parcelR2);
    }
}
