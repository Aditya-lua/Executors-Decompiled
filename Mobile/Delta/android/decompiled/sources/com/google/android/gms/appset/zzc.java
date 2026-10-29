package com.google.android.gms.appset;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import o9.b;
import x8.e;

/* JADX INFO: loaded from: classes.dex */
public final class zzc extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzc> CREATOR = new e();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f5543f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f5544g;

    public zzc(String str, int i10) {
        this.f5543f = str;
        this.f5544g = i10;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = b.a(parcel);
        b.v(parcel, 1, this.f5543f, false);
        b.n(parcel, 2, this.f5544g);
        b.b(parcel, iA);
    }

    public final int zza() {
        return this.f5544g;
    }

    public final String zzb() {
        return this.f5543f;
    }
}
