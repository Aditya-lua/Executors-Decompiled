package p305n9;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.zzp;
import com.google.android.gms.common.zzr;
import com.google.android.gms.common.zzt;
import p074db.C4519a;
import p074db.C4533o;
import p571y9.InterfaceC13133a;

/* JADX INFO: renamed from: n9.n0 */
/* JADX INFO: loaded from: classes.dex */
public final class C8957n0 extends C4519a implements InterfaceC8962p0 {
    public C8957n0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.IGoogleCertificatesApi");
    }

    @Override // p305n9.InterfaceC8962p0
    /* JADX INFO: renamed from: H1 */
    public final zzr mo36057H1(zzp zzpVar) {
        Parcel parcelM22482s2 = m22482s2();
        C4533o.m22504c(parcelM22482s2, zzpVar);
        Parcel parcelM22481r2 = m22481r2(6, parcelM22482s2);
        zzr zzrVar = (zzr) C4533o.m22503b(parcelM22481r2, zzr.CREATOR);
        parcelM22481r2.recycle();
        return zzrVar;
    }

    @Override // p305n9.InterfaceC8962p0
    /* JADX INFO: renamed from: L */
    public final boolean mo36058L(zzt zztVar, InterfaceC13133a interfaceC13133a) {
        Parcel parcelM22482s2 = m22482s2();
        C4533o.m22504c(parcelM22482s2, zztVar);
        C4533o.m22505d(parcelM22482s2, interfaceC13133a);
        Parcel parcelM22481r2 = m22481r2(5, parcelM22482s2);
        boolean zM22502a = C4533o.m22502a(parcelM22481r2);
        parcelM22481r2.recycle();
        return zM22502a;
    }

    @Override // p305n9.InterfaceC8962p0
    /* JADX INFO: renamed from: c */
    public final boolean mo36059c() {
        Parcel parcelM22481r2 = m22481r2(7, m22482s2());
        boolean zM22502a = C4533o.m22502a(parcelM22481r2);
        parcelM22481r2.recycle();
        return zM22502a;
    }

    @Override // p305n9.InterfaceC8962p0
    /* JADX INFO: renamed from: d2 */
    public final zzr mo36060d2(zzp zzpVar) {
        Parcel parcelM22482s2 = m22482s2();
        C4533o.m22504c(parcelM22482s2, zzpVar);
        Parcel parcelM22481r2 = m22481r2(8, parcelM22482s2);
        zzr zzrVar = (zzr) C4533o.m22503b(parcelM22481r2, zzr.CREATOR);
        parcelM22481r2.recycle();
        return zzrVar;
    }
}
