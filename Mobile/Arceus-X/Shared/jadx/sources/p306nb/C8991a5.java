package p306nb;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.measurement.C2220o0;
import com.google.android.gms.internal.measurement.C2256q0;
import com.google.android.gms.measurement.internal.zzaf;
import com.google.android.gms.measurement.internal.zzah;
import com.google.android.gms.measurement.internal.zzao;
import com.google.android.gms.measurement.internal.zzbg;
import com.google.android.gms.measurement.internal.zzoo;
import com.google.android.gms.measurement.internal.zzpl;
import com.google.android.gms.measurement.internal.zzr;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: nb.a5 */
/* JADX INFO: loaded from: classes.dex */
public final class C8991a5 extends C2220o0 implements InterfaceC9042d5 {
    public C8991a5(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.internal.IMeasurementService");
    }

    @Override // p306nb.InterfaceC9042d5
    /* JADX INFO: renamed from: A0 */
    public final String mo36089A0(zzr zzrVar) {
        Parcel parcelM10474s2 = m10474s2();
        C2256q0.m10549c(parcelM10474s2, zzrVar);
        Parcel parcelM10473r2 = m10473r2(11, parcelM10474s2);
        String string = parcelM10473r2.readString();
        parcelM10473r2.recycle();
        return string;
    }

    @Override // p306nb.InterfaceC9042d5
    /* JADX INFO: renamed from: C1 */
    public final zzao mo36090C1(zzr zzrVar) {
        Parcel parcelM10474s2 = m10474s2();
        C2256q0.m10549c(parcelM10474s2, zzrVar);
        Parcel parcelM10473r2 = m10473r2(21, parcelM10474s2);
        zzao zzaoVar = (zzao) C2256q0.m10548b(parcelM10473r2, zzao.CREATOR);
        parcelM10473r2.recycle();
        return zzaoVar;
    }

    @Override // p306nb.InterfaceC9042d5
    /* JADX INFO: renamed from: E1 */
    public final void mo36091E1(Bundle bundle, zzr zzrVar) {
        Parcel parcelM10474s2 = m10474s2();
        C2256q0.m10549c(parcelM10474s2, bundle);
        C2256q0.m10549c(parcelM10474s2, zzrVar);
        m10475t2(19, parcelM10474s2);
    }

    @Override // p306nb.InterfaceC9042d5
    /* JADX INFO: renamed from: H */
    public final void mo36092H(zzr zzrVar, zzoo zzooVar, InterfaceC9140j5 interfaceC9140j5) {
        Parcel parcelM10474s2 = m10474s2();
        C2256q0.m10549c(parcelM10474s2, zzrVar);
        C2256q0.m10549c(parcelM10474s2, zzooVar);
        C2256q0.m10550d(parcelM10474s2, interfaceC9140j5);
        m10475t2(29, parcelM10474s2);
    }

    @Override // p306nb.InterfaceC9042d5
    /* JADX INFO: renamed from: K */
    public final List mo36093K(String str, String str2, String str3) {
        Parcel parcelM10474s2 = m10474s2();
        parcelM10474s2.writeString(null);
        parcelM10474s2.writeString(str2);
        parcelM10474s2.writeString(str3);
        Parcel parcelM10473r2 = m10473r2(17, parcelM10474s2);
        ArrayList arrayListCreateTypedArrayList = parcelM10473r2.createTypedArrayList(zzah.CREATOR);
        parcelM10473r2.recycle();
        return arrayListCreateTypedArrayList;
    }

    @Override // p306nb.InterfaceC9042d5
    /* JADX INFO: renamed from: K1 */
    public final void mo36094K1(zzr zzrVar) {
        Parcel parcelM10474s2 = m10474s2();
        C2256q0.m10549c(parcelM10474s2, zzrVar);
        m10475t2(4, parcelM10474s2);
    }

    @Override // p306nb.InterfaceC9042d5
    /* JADX INFO: renamed from: P */
    public final void mo36095P(zzr zzrVar) {
        Parcel parcelM10474s2 = m10474s2();
        C2256q0.m10549c(parcelM10474s2, zzrVar);
        m10475t2(25, parcelM10474s2);
    }

    @Override // p306nb.InterfaceC9042d5
    /* JADX INFO: renamed from: S1 */
    public final void mo36096S1(zzr zzrVar) {
        Parcel parcelM10474s2 = m10474s2();
        C2256q0.m10549c(parcelM10474s2, zzrVar);
        m10475t2(27, parcelM10474s2);
    }

    @Override // p306nb.InterfaceC9042d5
    /* JADX INFO: renamed from: V */
    public final void mo36097V(zzbg zzbgVar, zzr zzrVar) {
        Parcel parcelM10474s2 = m10474s2();
        C2256q0.m10549c(parcelM10474s2, zzbgVar);
        C2256q0.m10549c(parcelM10474s2, zzrVar);
        m10475t2(1, parcelM10474s2);
    }

    @Override // p306nb.InterfaceC9042d5
    /* JADX INFO: renamed from: V0 */
    public final void mo36098V0(long j10, String str, String str2, String str3) {
        Parcel parcelM10474s2 = m10474s2();
        parcelM10474s2.writeLong(j10);
        parcelM10474s2.writeString(str);
        parcelM10474s2.writeString(str2);
        parcelM10474s2.writeString(str3);
        m10475t2(10, parcelM10474s2);
    }

    @Override // p306nb.InterfaceC9042d5
    /* JADX INFO: renamed from: W */
    public final void mo36099W(zzr zzrVar) {
        Parcel parcelM10474s2 = m10474s2();
        C2256q0.m10549c(parcelM10474s2, zzrVar);
        m10475t2(6, parcelM10474s2);
    }

    @Override // p306nb.InterfaceC9042d5
    /* JADX INFO: renamed from: W0 */
    public final void mo36100W0(zzr zzrVar) {
        Parcel parcelM10474s2 = m10474s2();
        C2256q0.m10549c(parcelM10474s2, zzrVar);
        m10475t2(18, parcelM10474s2);
    }

    @Override // p306nb.InterfaceC9042d5
    /* JADX INFO: renamed from: Y1 */
    public final List mo36101Y1(String str, String str2, boolean z10, zzr zzrVar) {
        Parcel parcelM10474s2 = m10474s2();
        parcelM10474s2.writeString(str);
        parcelM10474s2.writeString(str2);
        ClassLoader classLoader = C2256q0.f8588a;
        parcelM10474s2.writeInt(z10 ? 1 : 0);
        C2256q0.m10549c(parcelM10474s2, zzrVar);
        Parcel parcelM10473r2 = m10473r2(14, parcelM10474s2);
        ArrayList arrayListCreateTypedArrayList = parcelM10473r2.createTypedArrayList(zzpl.CREATOR);
        parcelM10473r2.recycle();
        return arrayListCreateTypedArrayList;
    }

    @Override // p306nb.InterfaceC9042d5
    /* JADX INFO: renamed from: c0 */
    public final void mo36102c0(zzr zzrVar) {
        Parcel parcelM10474s2 = m10474s2();
        C2256q0.m10549c(parcelM10474s2, zzrVar);
        m10475t2(26, parcelM10474s2);
    }

    @Override // p306nb.InterfaceC9042d5
    /* JADX INFO: renamed from: e0 */
    public final byte[] mo36103e0(zzbg zzbgVar, String str) {
        Parcel parcelM10474s2 = m10474s2();
        C2256q0.m10549c(parcelM10474s2, zzbgVar);
        parcelM10474s2.writeString(str);
        Parcel parcelM10473r2 = m10473r2(9, parcelM10474s2);
        byte[] bArrCreateByteArray = parcelM10473r2.createByteArray();
        parcelM10473r2.recycle();
        return bArrCreateByteArray;
    }

    @Override // p306nb.InterfaceC9042d5
    /* JADX INFO: renamed from: e2 */
    public final List mo36104e2(String str, String str2, zzr zzrVar) {
        Parcel parcelM10474s2 = m10474s2();
        parcelM10474s2.writeString(str);
        parcelM10474s2.writeString(str2);
        C2256q0.m10549c(parcelM10474s2, zzrVar);
        Parcel parcelM10473r2 = m10473r2(16, parcelM10474s2);
        ArrayList arrayListCreateTypedArrayList = parcelM10473r2.createTypedArrayList(zzah.CREATOR);
        parcelM10473r2.recycle();
        return arrayListCreateTypedArrayList;
    }

    @Override // p306nb.InterfaceC9042d5
    /* JADX INFO: renamed from: g1 */
    public final void mo36105g1(zzr zzrVar, Bundle bundle, InterfaceC9092g5 interfaceC9092g5) {
        Parcel parcelM10474s2 = m10474s2();
        C2256q0.m10549c(parcelM10474s2, zzrVar);
        C2256q0.m10549c(parcelM10474s2, bundle);
        C2256q0.m10550d(parcelM10474s2, interfaceC9092g5);
        m10475t2(31, parcelM10474s2);
    }

    @Override // p306nb.InterfaceC9042d5
    /* JADX INFO: renamed from: j0 */
    public final void mo36106j0(zzpl zzplVar, zzr zzrVar) {
        Parcel parcelM10474s2 = m10474s2();
        C2256q0.m10549c(parcelM10474s2, zzplVar);
        C2256q0.m10549c(parcelM10474s2, zzrVar);
        m10475t2(2, parcelM10474s2);
    }

    @Override // p306nb.InterfaceC9042d5
    /* JADX INFO: renamed from: o */
    public final List mo36107o(String str, String str2, String str3, boolean z10) {
        Parcel parcelM10474s2 = m10474s2();
        parcelM10474s2.writeString(null);
        parcelM10474s2.writeString(str2);
        parcelM10474s2.writeString(str3);
        ClassLoader classLoader = C2256q0.f8588a;
        parcelM10474s2.writeInt(z10 ? 1 : 0);
        Parcel parcelM10473r2 = m10473r2(15, parcelM10474s2);
        ArrayList arrayListCreateTypedArrayList = parcelM10473r2.createTypedArrayList(zzpl.CREATOR);
        parcelM10473r2.recycle();
        return arrayListCreateTypedArrayList;
    }

    @Override // p306nb.InterfaceC9042d5
    /* JADX INFO: renamed from: p2 */
    public final void mo36108p2(zzr zzrVar) {
        Parcel parcelM10474s2 = m10474s2();
        C2256q0.m10549c(parcelM10474s2, zzrVar);
        m10475t2(20, parcelM10474s2);
    }

    @Override // p306nb.InterfaceC9042d5
    /* JADX INFO: renamed from: q */
    public final void mo36109q(zzah zzahVar, zzr zzrVar) {
        Parcel parcelM10474s2 = m10474s2();
        C2256q0.m10549c(parcelM10474s2, zzahVar);
        C2256q0.m10549c(parcelM10474s2, zzrVar);
        m10475t2(12, parcelM10474s2);
    }

    @Override // p306nb.InterfaceC9042d5
    /* JADX INFO: renamed from: u1 */
    public final void mo36110u1(zzr zzrVar, zzaf zzafVar) {
        Parcel parcelM10474s2 = m10474s2();
        C2256q0.m10549c(parcelM10474s2, zzrVar);
        C2256q0.m10549c(parcelM10474s2, zzafVar);
        m10475t2(30, parcelM10474s2);
    }
}
