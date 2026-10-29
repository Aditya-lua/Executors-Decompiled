package nb;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.measurement.internal.zzaf;
import com.google.android.gms.measurement.internal.zzah;
import com.google.android.gms.measurement.internal.zzao;
import com.google.android.gms.measurement.internal.zzbg;
import com.google.android.gms.measurement.internal.zzoo;
import com.google.android.gms.measurement.internal.zzpl;
import com.google.android.gms.measurement.internal.zzr;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class a5 extends com.google.android.gms.internal.measurement.o0 implements d5 {
    public a5(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.internal.IMeasurementService");
    }

    @Override // nb.d5
    public final zzao D1(zzr zzrVar) {
        Parcel parcelS2 = s2();
        com.google.android.gms.internal.measurement.q0.c(parcelS2, zzrVar);
        Parcel parcelR2 = r2(21, parcelS2);
        zzao zzaoVar = (zzao) com.google.android.gms.internal.measurement.q0.b(parcelR2, zzao.CREATOR);
        parcelR2.recycle();
        return zzaoVar;
    }

    @Override // nb.d5
    public final String E0(zzr zzrVar) {
        Parcel parcelS2 = s2();
        com.google.android.gms.internal.measurement.q0.c(parcelS2, zzrVar);
        Parcel parcelR2 = r2(11, parcelS2);
        String string = parcelR2.readString();
        parcelR2.recycle();
        return string;
    }

    @Override // nb.d5
    public final void F1(Bundle bundle, zzr zzrVar) {
        Parcel parcelS2 = s2();
        com.google.android.gms.internal.measurement.q0.c(parcelS2, bundle);
        com.google.android.gms.internal.measurement.q0.c(parcelS2, zzrVar);
        t2(19, parcelS2);
    }

    @Override // nb.d5
    public final void J(zzr zzrVar, zzoo zzooVar, j5 j5Var) {
        Parcel parcelS2 = s2();
        com.google.android.gms.internal.measurement.q0.c(parcelS2, zzrVar);
        com.google.android.gms.internal.measurement.q0.c(parcelS2, zzooVar);
        com.google.android.gms.internal.measurement.q0.d(parcelS2, j5Var);
        t2(29, parcelS2);
    }

    @Override // nb.d5
    public final void K1(zzr zzrVar) {
        Parcel parcelS2 = s2();
        com.google.android.gms.internal.measurement.q0.c(parcelS2, zzrVar);
        t2(4, parcelS2);
    }

    @Override // nb.d5
    public final List M(String str, String str2, String str3) {
        Parcel parcelS2 = s2();
        parcelS2.writeString(null);
        parcelS2.writeString(str2);
        parcelS2.writeString(str3);
        Parcel parcelR2 = r2(17, parcelS2);
        ArrayList arrayListCreateTypedArrayList = parcelR2.createTypedArrayList(zzah.CREATOR);
        parcelR2.recycle();
        return arrayListCreateTypedArrayList;
    }

    @Override // nb.d5
    public final void R(zzr zzrVar) {
        Parcel parcelS2 = s2();
        com.google.android.gms.internal.measurement.q0.c(parcelS2, zzrVar);
        t2(25, parcelS2);
    }

    @Override // nb.d5
    public final void S1(zzr zzrVar) {
        Parcel parcelS2 = s2();
        com.google.android.gms.internal.measurement.q0.c(parcelS2, zzrVar);
        t2(27, parcelS2);
    }

    @Override // nb.d5
    public final void X(zzbg zzbgVar, zzr zzrVar) {
        Parcel parcelS2 = s2();
        com.google.android.gms.internal.measurement.q0.c(parcelS2, zzbgVar);
        com.google.android.gms.internal.measurement.q0.c(parcelS2, zzrVar);
        t2(1, parcelS2);
    }

    @Override // nb.d5
    public final void Y(zzr zzrVar) {
        Parcel parcelS2 = s2();
        com.google.android.gms.internal.measurement.q0.c(parcelS2, zzrVar);
        t2(6, parcelS2);
    }

    @Override // nb.d5
    public final void Y0(long j10, String str, String str2, String str3) {
        Parcel parcelS2 = s2();
        parcelS2.writeLong(j10);
        parcelS2.writeString(str);
        parcelS2.writeString(str2);
        parcelS2.writeString(str3);
        t2(10, parcelS2);
    }

    @Override // nb.d5
    public final List Y1(String str, String str2, boolean z10, zzr zzrVar) {
        Parcel parcelS2 = s2();
        parcelS2.writeString(str);
        parcelS2.writeString(str2);
        ClassLoader classLoader = com.google.android.gms.internal.measurement.q0.f6744a;
        parcelS2.writeInt(z10 ? 1 : 0);
        com.google.android.gms.internal.measurement.q0.c(parcelS2, zzrVar);
        Parcel parcelR2 = r2(14, parcelS2);
        ArrayList arrayListCreateTypedArrayList = parcelR2.createTypedArrayList(zzpl.CREATOR);
        parcelR2.recycle();
        return arrayListCreateTypedArrayList;
    }

    @Override // nb.d5
    public final void Z0(zzr zzrVar) {
        Parcel parcelS2 = s2();
        com.google.android.gms.internal.measurement.q0.c(parcelS2, zzrVar);
        t2(18, parcelS2);
    }

    @Override // nb.d5
    public final void e0(zzr zzrVar) {
        Parcel parcelS2 = s2();
        com.google.android.gms.internal.measurement.q0.c(parcelS2, zzrVar);
        t2(26, parcelS2);
    }

    @Override // nb.d5
    public final List e2(String str, String str2, zzr zzrVar) {
        Parcel parcelS2 = s2();
        parcelS2.writeString(str);
        parcelS2.writeString(str2);
        com.google.android.gms.internal.measurement.q0.c(parcelS2, zzrVar);
        Parcel parcelR2 = r2(16, parcelS2);
        ArrayList arrayListCreateTypedArrayList = parcelR2.createTypedArrayList(zzah.CREATOR);
        parcelR2.recycle();
        return arrayListCreateTypedArrayList;
    }

    @Override // nb.d5
    public final byte[] h0(zzbg zzbgVar, String str) {
        Parcel parcelS2 = s2();
        com.google.android.gms.internal.measurement.q0.c(parcelS2, zzbgVar);
        parcelS2.writeString(str);
        Parcel parcelR2 = r2(9, parcelS2);
        byte[] bArrCreateByteArray = parcelR2.createByteArray();
        parcelR2.recycle();
        return bArrCreateByteArray;
    }

    @Override // nb.d5
    public final void k1(zzr zzrVar, Bundle bundle, g5 g5Var) {
        Parcel parcelS2 = s2();
        com.google.android.gms.internal.measurement.q0.c(parcelS2, zzrVar);
        com.google.android.gms.internal.measurement.q0.c(parcelS2, bundle);
        com.google.android.gms.internal.measurement.q0.d(parcelS2, g5Var);
        t2(31, parcelS2);
    }

    @Override // nb.d5
    public final void m0(zzpl zzplVar, zzr zzrVar) {
        Parcel parcelS2 = s2();
        com.google.android.gms.internal.measurement.q0.c(parcelS2, zzplVar);
        com.google.android.gms.internal.measurement.q0.c(parcelS2, zzrVar);
        t2(2, parcelS2);
    }

    @Override // nb.d5
    public final List o(String str, String str2, String str3, boolean z10) {
        Parcel parcelS2 = s2();
        parcelS2.writeString(null);
        parcelS2.writeString(str2);
        parcelS2.writeString(str3);
        ClassLoader classLoader = com.google.android.gms.internal.measurement.q0.f6744a;
        parcelS2.writeInt(z10 ? 1 : 0);
        Parcel parcelR2 = r2(15, parcelS2);
        ArrayList arrayListCreateTypedArrayList = parcelR2.createTypedArrayList(zzpl.CREATOR);
        parcelR2.recycle();
        return arrayListCreateTypedArrayList;
    }

    @Override // nb.d5
    public final void p2(zzr zzrVar) {
        Parcel parcelS2 = s2();
        com.google.android.gms.internal.measurement.q0.c(parcelS2, zzrVar);
        t2(20, parcelS2);
    }

    @Override // nb.d5
    public final void q(zzah zzahVar, zzr zzrVar) {
        Parcel parcelS2 = s2();
        com.google.android.gms.internal.measurement.q0.c(parcelS2, zzahVar);
        com.google.android.gms.internal.measurement.q0.c(parcelS2, zzrVar);
        t2(12, parcelS2);
    }

    @Override // nb.d5
    public final void w1(zzr zzrVar, zzaf zzafVar) {
        Parcel parcelS2 = s2();
        com.google.android.gms.internal.measurement.q0.c(parcelS2, zzrVar);
        com.google.android.gms.internal.measurement.q0.c(parcelS2, zzafVar);
        t2(30, parcelS2);
    }
}
