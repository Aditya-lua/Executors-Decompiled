package p271lf;

import android.os.IBinder;
import android.os.Parcel;
import com.google.firebase.appindexing.internal.zza;
import com.google.firebase.appindexing.internal.zzg;
import p268l9.InterfaceC8036g;
import va.C12111a;
import va.C12154x;

/* JADX INFO: renamed from: lf.b */
/* JADX INFO: loaded from: classes2.dex */
public final class C8130b extends C12111a implements InterfaceC8132d {
    public C8130b(IBinder iBinder) {
        super(iBinder, "com.google.firebase.appindexing.internal.IAppIndexingService");
    }

    @Override // p271lf.InterfaceC8132d
    /* JADX INFO: renamed from: o0 */
    public final zza mo33351o0(InterfaceC8036g interfaceC8036g, zzg zzgVar) {
        Parcel parcelM44948r2 = m44948r2();
        C12154x.m44982d(parcelM44948r2, interfaceC8036g);
        C12154x.m44981c(parcelM44948r2, zzgVar);
        Parcel parcelM44949s2 = m44949s2(8, parcelM44948r2);
        zza zzaVar = (zza) C12154x.m44979a(parcelM44949s2, zza.CREATOR);
        parcelM44949s2.recycle();
        return zzaVar;
    }
}
