package p599z9;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import p074db.C4519a;
import p074db.C4533o;
import p571y9.InterfaceC13133a;

/* JADX INFO: renamed from: z9.h */
/* JADX INFO: loaded from: classes.dex */
public final class C13757h extends C4519a implements IInterface {
    public C13757h(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.dynamite.IDynamiteLoader");
    }

    /* JADX INFO: renamed from: t2 */
    public final InterfaceC13133a m50161t2(InterfaceC13133a interfaceC13133a, String str, int i10) {
        Parcel parcelM22482s2 = m22482s2();
        C4533o.m22505d(parcelM22482s2, interfaceC13133a);
        parcelM22482s2.writeString(str);
        parcelM22482s2.writeInt(i10);
        Parcel parcelM22481r2 = m22481r2(2, parcelM22482s2);
        InterfaceC13133a interfaceC13133aM48741s2 = InterfaceC13133a.a.m48741s2(parcelM22481r2.readStrongBinder());
        parcelM22481r2.recycle();
        return interfaceC13133aM48741s2;
    }

    /* JADX INFO: renamed from: u2 */
    public final int m50162u2(InterfaceC13133a interfaceC13133a, String str, boolean z10) {
        Parcel parcelM22482s2 = m22482s2();
        C4533o.m22505d(parcelM22482s2, interfaceC13133a);
        parcelM22482s2.writeString(str);
        parcelM22482s2.writeInt(z10 ? 1 : 0);
        Parcel parcelM22481r2 = m22481r2(3, parcelM22482s2);
        int i10 = parcelM22481r2.readInt();
        parcelM22481r2.recycle();
        return i10;
    }

    /* JADX INFO: renamed from: v2 */
    public final InterfaceC13133a m50163v2(InterfaceC13133a interfaceC13133a, String str, int i10) {
        Parcel parcelM22482s2 = m22482s2();
        C4533o.m22505d(parcelM22482s2, interfaceC13133a);
        parcelM22482s2.writeString(str);
        parcelM22482s2.writeInt(i10);
        Parcel parcelM22481r2 = m22481r2(4, parcelM22482s2);
        InterfaceC13133a interfaceC13133aM48741s2 = InterfaceC13133a.a.m48741s2(parcelM22481r2.readStrongBinder());
        parcelM22481r2.recycle();
        return interfaceC13133aM48741s2;
    }

    /* JADX INFO: renamed from: w2 */
    public final int m50164w2(InterfaceC13133a interfaceC13133a, String str, boolean z10) {
        Parcel parcelM22482s2 = m22482s2();
        C4533o.m22505d(parcelM22482s2, interfaceC13133a);
        parcelM22482s2.writeString(str);
        parcelM22482s2.writeInt(z10 ? 1 : 0);
        Parcel parcelM22481r2 = m22481r2(5, parcelM22482s2);
        int i10 = parcelM22481r2.readInt();
        parcelM22481r2.recycle();
        return i10;
    }

    /* JADX INFO: renamed from: x2 */
    public final int m50165x2() {
        Parcel parcelM22481r2 = m22481r2(6, m22482s2());
        int i10 = parcelM22481r2.readInt();
        parcelM22481r2.recycle();
        return i10;
    }

    /* JADX INFO: renamed from: y2 */
    public final InterfaceC13133a m50166y2(InterfaceC13133a interfaceC13133a, String str, boolean z10, long j10) {
        Parcel parcelM22482s2 = m22482s2();
        C4533o.m22505d(parcelM22482s2, interfaceC13133a);
        parcelM22482s2.writeString(str);
        parcelM22482s2.writeInt(z10 ? 1 : 0);
        parcelM22482s2.writeLong(j10);
        Parcel parcelM22481r2 = m22481r2(7, parcelM22482s2);
        InterfaceC13133a interfaceC13133aM48741s2 = InterfaceC13133a.a.m48741s2(parcelM22481r2.readStrongBinder());
        parcelM22481r2.recycle();
        return interfaceC13133aM48741s2;
    }

    /* JADX INFO: renamed from: z2 */
    public final InterfaceC13133a m50167z2(InterfaceC13133a interfaceC13133a, String str, int i10, InterfaceC13133a interfaceC13133a2) {
        Parcel parcelM22482s2 = m22482s2();
        C4533o.m22505d(parcelM22482s2, interfaceC13133a);
        parcelM22482s2.writeString(str);
        parcelM22482s2.writeInt(i10);
        C4533o.m22505d(parcelM22482s2, interfaceC13133a2);
        Parcel parcelM22481r2 = m22481r2(8, parcelM22482s2);
        InterfaceC13133a interfaceC13133aM48741s2 = InterfaceC13133a.a.m48741s2(parcelM22481r2.readStrongBinder());
        parcelM22481r2.recycle();
        return interfaceC13133aM48741s2;
    }
}
