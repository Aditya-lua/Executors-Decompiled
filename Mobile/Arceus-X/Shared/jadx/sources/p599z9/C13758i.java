package p599z9;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import p074db.C4519a;
import p074db.C4533o;
import p571y9.InterfaceC13133a;

/* JADX INFO: renamed from: z9.i */
/* JADX INFO: loaded from: classes.dex */
public final class C13758i extends C4519a implements IInterface {
    public C13758i(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.dynamite.IDynamiteLoaderV2");
    }

    /* JADX INFO: renamed from: t2 */
    public final InterfaceC13133a m50168t2(InterfaceC13133a interfaceC13133a, String str, int i10, InterfaceC13133a interfaceC13133a2) {
        Parcel parcelM22482s2 = m22482s2();
        C4533o.m22505d(parcelM22482s2, interfaceC13133a);
        parcelM22482s2.writeString(str);
        parcelM22482s2.writeInt(i10);
        C4533o.m22505d(parcelM22482s2, interfaceC13133a2);
        Parcel parcelM22481r2 = m22481r2(2, parcelM22482s2);
        InterfaceC13133a interfaceC13133aM48741s2 = InterfaceC13133a.a.m48741s2(parcelM22481r2.readStrongBinder());
        parcelM22481r2.recycle();
        return interfaceC13133aM48741s2;
    }

    /* JADX INFO: renamed from: u2 */
    public final InterfaceC13133a m50169u2(InterfaceC13133a interfaceC13133a, String str, int i10, InterfaceC13133a interfaceC13133a2) {
        Parcel parcelM22482s2 = m22482s2();
        C4533o.m22505d(parcelM22482s2, interfaceC13133a);
        parcelM22482s2.writeString(str);
        parcelM22482s2.writeInt(i10);
        C4533o.m22505d(parcelM22482s2, interfaceC13133a2);
        Parcel parcelM22481r2 = m22481r2(3, parcelM22482s2);
        InterfaceC13133a interfaceC13133aM48741s2 = InterfaceC13133a.a.m48741s2(parcelM22481r2.readStrongBinder());
        parcelM22481r2.recycle();
        return interfaceC13133aM48741s2;
    }
}
