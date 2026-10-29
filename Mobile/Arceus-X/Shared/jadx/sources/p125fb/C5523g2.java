package p125fb;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.games_v2.zzq;

/* JADX INFO: renamed from: fb.g2 */
/* JADX INFO: loaded from: classes.dex */
public final class C5523g2 extends C5496a implements IInterface {
    public C5523g2(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.games.internal.connect.IGamesConnectService");
    }

    /* JADX INFO: renamed from: t2 */
    public final void m25186t2(InterfaceC5519f2 interfaceC5519f2, zzq zzqVar) {
        Parcel parcelM25149r2 = m25149r2();
        C5536k0.m25208d(parcelM25149r2, interfaceC5519f2);
        C5536k0.m25207c(parcelM25149r2, zzqVar);
        m25150s2(2, parcelM25149r2);
    }
}
