package com.google.firebase.appindexing.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.internal.appindex.zzk;
import lf.f;
import o9.b;

/* JADX INFO: loaded from: classes2.dex */
public final class zzg extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzg> CREATOR = new f();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f8757f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Thing[] f8758g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String[] f8759h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String[] f8760i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final zzk f8761j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final String f8762k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final String f8763l;

    public zzg(int i10, Thing[] thingArr, String[] strArr, String[] strArr2, zzk zzkVar, String str, String str2) {
        if (i10 != 0 && i10 != 1 && i10 != 2 && i10 != 3 && i10 != 4 && i10 != 6 && i10 != 7) {
            i10 = 0;
        }
        this.f8757f = i10;
        this.f8758g = thingArr;
        this.f8759h = strArr;
        this.f8760i = strArr2;
        this.f8761j = zzkVar;
        this.f8762k = str;
        this.f8763l = str2;
    }

    public static zzg v3() {
        return new zzg(4, null, null, null, null, null, null);
    }

    public static zzg w3(Thing... thingArr) {
        return new zzg(1, thingArr, null, null, null, null, null);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = b.a(parcel);
        b.n(parcel, 1, this.f8757f);
        b.y(parcel, 2, this.f8758g, i10, false);
        b.w(parcel, 3, this.f8759h, false);
        b.w(parcel, 5, this.f8760i, false);
        b.t(parcel, 6, this.f8761j, i10, false);
        b.v(parcel, 7, this.f8762k, false);
        b.v(parcel, 8, this.f8763l, false);
        b.b(parcel, iA);
    }
}
