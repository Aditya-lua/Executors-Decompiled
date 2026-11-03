package com.google.android.gms.games.internal.player;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.apps.common.proguard.UsedByReflection;
import com.google.android.gms.games.internal.zzg;
import ja.f;
import n9.k;
import o9.b;

/* JADX INFO: loaded from: classes.dex */
@UsedByReflection("GamesGmsClientImpl.java")
public final class StockProfileImageEntity extends zzg implements StockProfileImage {

    @NonNull
    public static final Parcelable.Creator<StockProfileImageEntity> CREATOR = new f();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f6244f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Uri f6245g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f6246h;

    public StockProfileImageEntity(@NonNull String str, @NonNull Uri uri, @NonNull String str2) {
        this.f6244f = str;
        this.f6245g = uri;
        this.f6246h = str2;
    }

    @Override // com.google.android.gms.games.internal.player.StockProfileImage
    @NonNull
    public String A0() {
        return this.f6244f;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof StockProfileImage)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        StockProfileImage stockProfileImage = (StockProfileImage) obj;
        return k.b(this.f6244f, stockProfileImage.A0()) && k.b(this.f6245g, stockProfileImage.zza()) && k.b(this.f6246h, stockProfileImage.zzb());
    }

    public final int hashCode() {
        return k.c(this.f6244f, this.f6245g);
    }

    @NonNull
    public final String toString() {
        return k.d(this).a("ImageId", this.f6244f).a("ImageUri", this.f6245g).a("A11yLabel", this.f6246h).toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i10) {
        int iA = b.a(parcel);
        b.v(parcel, 1, A0(), false);
        b.t(parcel, 2, this.f6245g, i10, false);
        b.v(parcel, 3, this.f6246h, false);
        b.b(parcel, iA);
    }

    @Override // com.google.android.gms.games.internal.player.StockProfileImage
    @NonNull
    public final Uri zza() {
        return this.f6245g;
    }

    @Override // com.google.android.gms.games.internal.player.StockProfileImage
    @NonNull
    public final String zzb() {
        return this.f6246h;
    }
}
