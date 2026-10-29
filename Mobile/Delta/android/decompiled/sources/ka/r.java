package ka;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.games.internal.v2.appshortcuts.zzi;
import com.google.android.gms.games.internal.v2.appshortcuts.zzr;
import fb.k0;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class r extends fb.a implements IInterface {
    public r(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.games.internal.v2.appshortcuts.IAppShortcutsService");
    }

    public final void t2(t tVar, zzr zzrVar, List list, List list2) {
        Parcel parcelR2 = r2();
        k0.d(parcelR2, tVar);
        k0.c(parcelR2, zzrVar);
        parcelR2.writeTypedList(list);
        parcelR2.writeTypedList(list2);
        s2(3, parcelR2);
    }

    public final void u2(t tVar, zzr zzrVar, zzi zziVar) {
        Parcel parcelR2 = r2();
        k0.d(parcelR2, tVar);
        k0.c(parcelR2, zzrVar);
        k0.c(parcelR2, zziVar);
        s2(4, parcelR2);
    }
}
