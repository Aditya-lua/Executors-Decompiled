package com.google.firebase.appindexing.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.internal.appindex.zzk;
import kf.f;
import o9.b;

/* JADX INFO: loaded from: classes2.dex */
public final class zzg extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzg> CREATOR = new f();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f8683f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Thing[] f8684g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String[] f8685h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String[] f8686i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final zzk f8687j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final String f8688k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final String f8689l;

    public zzg(int i10, Thing[] thingArr, String[] strArr, String[] strArr2, zzk zzkVar, String str, String str2) {
        if (i10 != 0 && i10 != 1 && i10 != 2 && i10 != 3 && i10 != 4 && i10 != 6 && i10 != 7) {
            i10 = 0;
        }
        this.f8683f = i10;
        this.f8684g = thingArr;
        this.f8685h = strArr;
        this.f8686i = strArr2;
        this.f8687j = zzkVar;
        this.f8688k = str;
        this.f8689l = str2;
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
        b.n(parcel, 1, this.f8683f);
        b.y(parcel, 2, this.f8684g, i10, false);
        b.w(parcel, 3, this.f8685h, false);
        b.w(parcel, 5, this.f8686i, false);
        b.t(parcel, 6, this.f8687j, i10, false);
        b.v(parcel, 7, this.f8688k, false);
        b.v(parcel, 8, this.f8689l, false);
        b.b(parcel, iA);
    }
}
