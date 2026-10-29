package com.google.android.gms.games.internal.v2.appshortcuts;

import android.content.ComponentName;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import ka.o;
import o9.b;

/* JADX INFO: loaded from: classes.dex */
public final class zzr extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzr> CREATOR = new o();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f6195f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f6196g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f6197h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ComponentName f6198i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f6199j;

    public zzr(long j10, String str, int i10, ComponentName componentName, String str2) {
        this.f6195f = j10;
        this.f6196g = str;
        this.f6197h = i10;
        this.f6198i = componentName;
        this.f6199j = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = b.a(parcel);
        b.r(parcel, 1, this.f6195f);
        b.v(parcel, 2, this.f6196g, false);
        b.n(parcel, 3, this.f6197h);
        b.t(parcel, 4, this.f6198i, i10, false);
        b.v(parcel, 5, this.f6199j, false);
        b.b(parcel, iA);
    }

    public final int zza() {
        return this.f6197h;
    }

    public final String zzb() {
        return this.f6199j;
    }
}
