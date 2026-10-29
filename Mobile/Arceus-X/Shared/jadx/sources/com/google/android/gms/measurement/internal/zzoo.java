package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;
import java.util.List;
import p306nb.C9340vd;
import p306nb.EnumC9401za;
import p325o9.C9718b;

/* JADX INFO: loaded from: classes.dex */
public final class zzoo extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzoo> CREATOR = new C9340vd();

    /* JADX INFO: renamed from: f */
    public final List f9516f;

    public zzoo(List list) {
        this.f9516f = list;
    }

    /* JADX INFO: renamed from: a */
    public static zzoo m11884a(EnumC9401za... enumC9401zaArr) {
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(Integer.valueOf(enumC9401zaArr[0].zza()));
        return new zzoo(arrayList);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        List list = this.f9516f;
        int iM38457a = C9718b.m38457a(parcel);
        C9718b.m38472p(parcel, 1, list, false);
        C9718b.m38458b(parcel, iM38457a);
    }
}
