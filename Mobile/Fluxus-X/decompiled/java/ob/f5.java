package ob;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class f5 extends com.google.android.gms.internal.measurement.o0 implements i5 {
    public f5(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.internal.IMeasurementService");
    }

    @Override // ob.i5
    public final void F1(i iVar, hf hfVar) {
        Parcel parcelS2 = s2();
        com.google.android.gms.internal.measurement.q0.c(parcelS2, iVar);
        com.google.android.gms.internal.measurement.q0.c(parcelS2, hfVar);
        t2(12, parcelS2);
    }

    @Override // ob.i5
    public final void G(bf bfVar, hf hfVar) {
        Parcel parcelS2 = s2();
        com.google.android.gms.internal.measurement.q0.c(parcelS2, bfVar);
        com.google.android.gms.internal.measurement.q0.c(parcelS2, hfVar);
        t2(2, parcelS2);
    }

    @Override // ob.i5
    public final void H(hf hfVar, Bundle bundle, l5 l5Var) {
        Parcel parcelS2 = s2();
        com.google.android.gms.internal.measurement.q0.c(parcelS2, hfVar);
        com.google.android.gms.internal.measurement.q0.c(parcelS2, bundle);
        com.google.android.gms.internal.measurement.q0.d(parcelS2, l5Var);
        t2(31, parcelS2);
    }

    @Override // ob.i5
    public final void H0(hf hfVar) {
        Parcel parcelS2 = s2();
        com.google.android.gms.internal.measurement.q0.c(parcelS2, hfVar);
        t2(6, parcelS2);
    }

    @Override // ob.i5
    public final void I0(hf hfVar) {
        Parcel parcelS2 = s2();
        com.google.android.gms.internal.measurement.q0.c(parcelS2, hfVar);
        t2(26, parcelS2);
    }

    @Override // ob.i5
    public final List L(String str, String str2, String str3) {
        Parcel parcelS2 = s2();
        parcelS2.writeString(null);
        parcelS2.writeString(str2);
        parcelS2.writeString(str3);
        Parcel parcelR2 = r2(17, parcelS2);
        ArrayList arrayListCreateTypedArrayList = parcelR2.createTypedArrayList(i.CREATOR);
        parcelR2.recycle();
        return arrayListCreateTypedArrayList;
    }

    @Override // ob.i5
    public final void L1(Bundle bundle, hf hfVar) {
        Parcel parcelS2 = s2();
        com.google.android.gms.internal.measurement.q0.c(parcelS2, bundle);
        com.google.android.gms.internal.measurement.q0.c(parcelS2, hfVar);
        t2(19, parcelS2);
    }

    @Override // ob.i5
    public final void O(hf hfVar) {
        Parcel parcelS2 = s2();
        com.google.android.gms.internal.measurement.q0.c(parcelS2, hfVar);
        t2(20, parcelS2);
    }

    @Override // ob.i5
    public final byte[] V1(i0 i0Var, String str) {
        Parcel parcelS2 = s2();
        com.google.android.gms.internal.measurement.q0.c(parcelS2, i0Var);
        parcelS2.writeString(str);
        Parcel parcelR2 = r2(9, parcelS2);
        byte[] bArrCreateByteArray = parcelR2.createByteArray();
        parcelR2.recycle();
        return bArrCreateByteArray;
    }

    @Override // ob.i5
    public final p Y(hf hfVar) {
        Parcel parcelS2 = s2();
        com.google.android.gms.internal.measurement.q0.c(parcelS2, hfVar);
        Parcel parcelR2 = r2(21, parcelS2);
        p pVar = (p) com.google.android.gms.internal.measurement.q0.b(parcelR2, p.CREATOR);
        parcelR2.recycle();
        return pVar;
    }

    @Override // ob.i5
    public final String Y0(hf hfVar) {
        Parcel parcelS2 = s2();
        com.google.android.gms.internal.measurement.q0.c(parcelS2, hfVar);
        Parcel parcelR2 = r2(11, parcelS2);
        String string = parcelR2.readString();
        parcelR2.recycle();
        return string;
    }

    @Override // ob.i5
    public final void d0(hf hfVar, g gVar) {
        Parcel parcelS2 = s2();
        com.google.android.gms.internal.measurement.q0.c(parcelS2, hfVar);
        com.google.android.gms.internal.measurement.q0.c(parcelS2, gVar);
        t2(30, parcelS2);
    }

    @Override // ob.i5
    public final void d1(long j10, String str, String str2, String str3) {
        Parcel parcelS2 = s2();
        parcelS2.writeLong(j10);
        parcelS2.writeString(str);
        parcelS2.writeString(str2);
        parcelS2.writeString(str3);
        t2(10, parcelS2);
    }

    @Override // ob.i5
    public final void i0(hf hfVar) {
        Parcel parcelS2 = s2();
        com.google.android.gms.internal.measurement.q0.c(parcelS2, hfVar);
        t2(4, parcelS2);
    }

    @Override // ob.i5
    public final List l1(String str, String str2, hf hfVar) {
        Parcel parcelS2 = s2();
        parcelS2.writeString(str);
        parcelS2.writeString(str2);
        com.google.android.gms.internal.measurement.q0.c(parcelS2, hfVar);
        Parcel parcelR2 = r2(16, parcelS2);
        ArrayList arrayListCreateTypedArrayList = parcelR2.createTypedArrayList(i.CREATOR);
        parcelR2.recycle();
        return arrayListCreateTypedArrayList;
    }

    @Override // ob.i5
    public final List o(String str, String str2, String str3, boolean z10) {
        Parcel parcelS2 = s2();
        parcelS2.writeString(null);
        parcelS2.writeString(str2);
        parcelS2.writeString(str3);
        ClassLoader classLoader = com.google.android.gms.internal.measurement.q0.f6782a;
        parcelS2.writeInt(z10 ? 1 : 0);
        Parcel parcelR2 = r2(15, parcelS2);
        ArrayList arrayListCreateTypedArrayList = parcelR2.createTypedArrayList(bf.CREATOR);
        parcelR2.recycle();
        return arrayListCreateTypedArrayList;
    }

    @Override // ob.i5
    public final void q(hf hfVar) {
        Parcel parcelS2 = s2();
        com.google.android.gms.internal.measurement.q0.c(parcelS2, hfVar);
        t2(27, parcelS2);
    }

    @Override // ob.i5
    public final void t0(hf hfVar) {
        Parcel parcelS2 = s2();
        com.google.android.gms.internal.measurement.q0.c(parcelS2, hfVar);
        t2(25, parcelS2);
    }

    @Override // ob.i5
    public final void v(hf hfVar) {
        Parcel parcelS2 = s2();
        com.google.android.gms.internal.measurement.q0.c(parcelS2, hfVar);
        t2(18, parcelS2);
    }

    @Override // ob.i5
    public final List x1(String str, String str2, boolean z10, hf hfVar) {
        Parcel parcelS2 = s2();
        parcelS2.writeString(str);
        parcelS2.writeString(str2);
        ClassLoader classLoader = com.google.android.gms.internal.measurement.q0.f6782a;
        parcelS2.writeInt(z10 ? 1 : 0);
        com.google.android.gms.internal.measurement.q0.c(parcelS2, hfVar);
        Parcel parcelR2 = r2(14, parcelS2);
        ArrayList arrayListCreateTypedArrayList = parcelR2.createTypedArrayList(bf.CREATOR);
        parcelR2.recycle();
        return arrayListCreateTypedArrayList;
    }

    @Override // ob.i5
    public final void y(hf hfVar, ce ceVar, o5 o5Var) {
        Parcel parcelS2 = s2();
        com.google.android.gms.internal.measurement.q0.c(parcelS2, hfVar);
        com.google.android.gms.internal.measurement.q0.c(parcelS2, ceVar);
        com.google.android.gms.internal.measurement.q0.d(parcelS2, o5Var);
        t2(29, parcelS2);
    }

    @Override // ob.i5
    public final void y1(i0 i0Var, hf hfVar) {
        Parcel parcelS2 = s2();
        com.google.android.gms.internal.measurement.q0.c(parcelS2, i0Var);
        com.google.android.gms.internal.measurement.q0.c(parcelS2, hfVar);
        t2(1, parcelS2);
    }
}
