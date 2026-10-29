package va;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.appindex.zzk;

/* JADX INFO: renamed from: va.a0 */
/* JADX INFO: loaded from: classes.dex */
public final class C12112a0 extends C12111a implements IInterface {
    public C12112a0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.appdatasearch.internal.ILightweightAppDataSearch");
    }

    /* JADX INFO: renamed from: u2 */
    public final void m44951u2(InterfaceC12116c0 interfaceC12116c0, zzk[] zzkVarArr) {
        Parcel parcelM44948r2 = m44948r2();
        C12154x.m44982d(parcelM44948r2, interfaceC12116c0);
        parcelM44948r2.writeTypedArray(zzkVarArr, 0);
        m44950t2(7, parcelM44948r2);
    }
}
