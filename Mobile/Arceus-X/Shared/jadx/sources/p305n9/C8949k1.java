package p305n9;

import android.os.IBinder;
import android.os.Parcel;
import p074db.C4519a;
import p571y9.InterfaceC13133a;

/* JADX INFO: renamed from: n9.k1 */
/* JADX INFO: loaded from: classes.dex */
public final class C8949k1 extends C4519a implements InterfaceC8955m1 {
    public C8949k1(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.ICertData");
    }

    @Override // p305n9.InterfaceC8955m1
    public final InterfaceC13133a zzd() {
        Parcel parcelM22481r2 = m22481r2(1, m22482s2());
        InterfaceC13133a interfaceC13133aM48741s2 = InterfaceC13133a.a.m48741s2(parcelM22481r2.readStrongBinder());
        parcelM22481r2.recycle();
        return interfaceC13133aM48741s2;
    }

    @Override // p305n9.InterfaceC8955m1
    public final int zze() {
        Parcel parcelM22481r2 = m22481r2(2, m22482s2());
        int i10 = parcelM22481r2.readInt();
        parcelM22481r2.recycle();
        return i10;
    }
}
