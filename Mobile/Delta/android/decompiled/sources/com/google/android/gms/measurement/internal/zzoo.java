package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;
import java.util.List;
import nb.vd;
import nb.za;
import o9.b;

/* JADX INFO: loaded from: classes.dex */
public final class zzoo extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzoo> CREATOR = new vd();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final List f7436f;

    public zzoo(List list) {
        this.f7436f = list;
    }

    public static zzoo a(za... zaVarArr) {
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(Integer.valueOf(zaVarArr[0].zza()));
        return new zzoo(arrayList);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        List list = this.f7436f;
        int iA = b.a(parcel);
        b.p(parcel, 1, list, false);
        b.b(parcel, iA);
    }
}
