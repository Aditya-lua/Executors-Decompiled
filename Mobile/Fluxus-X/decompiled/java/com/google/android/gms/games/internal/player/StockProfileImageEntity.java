package com.google.android.gms.games.internal.player;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.apps.common.proguard.UsedByReflection;
import ha.p;
import ka.a;
import ka.k;
import o9.q;
import p9.c;

/* JADX INFO: loaded from: classes.dex */
@UsedByReflection("GamesGmsClientImpl.java")
public final class StockProfileImageEntity extends p implements a {

    @NonNull
    public static final Parcelable.Creator<StockProfileImageEntity> CREATOR = new k();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f6295f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Uri f6296g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f6297h;

    public StockProfileImageEntity(@NonNull String str, @NonNull Uri uri, @NonNull String str2) {
        this.f6295f = str;
        this.f6296g = uri;
        this.f6297h = str2;
    }

    @Override // ka.a
    @NonNull
    public String F0() {
        return this.f6295f;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        a aVar = (a) obj;
        return q.b(this.f6295f, aVar.F0()) && q.b(this.f6296g, aVar.zza()) && q.b(this.f6297h, aVar.zzb());
    }

    public final int hashCode() {
        return q.c(this.f6295f, this.f6296g);
    }

    @NonNull
    public final String toString() {
        return q.d(this).a("ImageId", this.f6295f).a("ImageUri", this.f6296g).a("A11yLabel", this.f6297h).toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i10) {
        int iA = c.a(parcel);
        c.v(parcel, 1, F0(), false);
        c.t(parcel, 2, this.f6296g, i10, false);
        c.v(parcel, 3, this.f6297h, false);
        c.b(parcel, iA);
    }

    @Override // ka.a
    @NonNull
    public final Uri zza() {
        return this.f6296g;
    }

    @Override // ka.a
    @NonNull
    public final String zzb() {
        return this.f6297h;
    }
}
