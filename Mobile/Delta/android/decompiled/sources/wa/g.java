package wa;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.appset.zza;

/* JADX INFO: loaded from: classes.dex */
public final class g extends a implements IInterface {
    public g(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.appset.internal.IAppSetService");
    }

    public final void t2(zza zzaVar, f fVar) {
        Parcel parcelR2 = r2();
        c.b(parcelR2, zzaVar);
        c.c(parcelR2, fVar);
        s2(1, parcelR2);
    }
}
