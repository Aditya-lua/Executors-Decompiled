package p512wa;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.appset.zza;

/* JADX INFO: renamed from: wa.g */
/* JADX INFO: loaded from: classes.dex */
public final class C12334g extends C12328a implements IInterface {
    public C12334g(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.appset.internal.IAppSetService");
    }

    /* JADX INFO: renamed from: t2 */
    public final void m46190t2(zza zzaVar, InterfaceC12333f interfaceC12333f) {
        Parcel parcelM46183r2 = m46183r2();
        C12330c.m46187b(parcelM46183r2, zzaVar);
        C12330c.m46188c(parcelM46183r2, interfaceC12333f);
        m46184s2(1, parcelM46183r2);
    }
}
