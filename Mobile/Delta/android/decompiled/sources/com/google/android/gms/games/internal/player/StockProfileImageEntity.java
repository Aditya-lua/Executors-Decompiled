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
    public final String f6171f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Uri f6172g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f6173h;

    public StockProfileImageEntity(@NonNull String str, @NonNull Uri uri, @NonNull String str2) {
        this.f6171f = str;
        this.f6172g = uri;
        this.f6173h = str2;
    }

    @Override // com.google.android.gms.games.internal.player.StockProfileImage
    @NonNull
    public String E0() {
        return this.f6171f;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof StockProfileImage)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        StockProfileImage stockProfileImage = (StockProfileImage) obj;
        return k.b(this.f6171f, stockProfileImage.E0()) && k.b(this.f6172g, stockProfileImage.zza()) && k.b(this.f6173h, stockProfileImage.zzb());
    }

    public final int hashCode() {
        return k.c(this.f6171f, this.f6172g);
    }

    @NonNull
    public final String toString() {
        return k.d(this).a("ImageId", this.f6171f).a("ImageUri", this.f6172g).a("A11yLabel", this.f6173h).toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i10) {
        int iA = b.a(parcel);
        b.v(parcel, 1, E0(), false);
        b.t(parcel, 2, this.f6172g, i10, false);
        b.v(parcel, 3, this.f6173h, false);
        b.b(parcel, iA);
    }

    @Override // com.google.android.gms.games.internal.player.StockProfileImage
    @NonNull
    public final Uri zza() {
        return this.f6172g;
    }

    @Override // com.google.android.gms.games.internal.player.StockProfileImage
    @NonNull
    public final String zzb() {
        return this.f6173h;
    }
}
