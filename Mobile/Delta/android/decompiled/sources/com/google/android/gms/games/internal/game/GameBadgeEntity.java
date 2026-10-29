package com.google.android.gms.games.internal.game;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.apps.common.proguard.UsedByReflection;
import com.google.android.gms.games.internal.GamesDowngradeableSafeParcel;
import ia.a;
import n9.k;
import o9.b;

/* JADX INFO: loaded from: classes.dex */
@UsedByReflection("GamesGmsClientImpl.java")
public final class GameBadgeEntity extends GamesDowngradeableSafeParcel implements zza {

    @NonNull
    public static final Parcelable.Creator<GameBadgeEntity> CREATOR = new a();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f6142h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f6143i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f6144j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Uri f6145k;

    public GameBadgeEntity(int i10, String str, String str2, Uri uri) {
        this.f6142h = i10;
        this.f6143i = str;
        this.f6144j = str2;
        this.f6145k = uri;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zza)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        zza zzaVar = (zza) obj;
        return k.b(Integer.valueOf(zzaVar.zza()), this.f6143i) && k.b(zzaVar.zzb(), this.f6145k);
    }

    public final int hashCode() {
        return k.c(Integer.valueOf(this.f6142h), this.f6143i, this.f6144j, this.f6145k);
    }

    @NonNull
    public final String toString() {
        return k.d(this).a("Type", Integer.valueOf(this.f6142h)).a("Title", this.f6143i).a("Description", this.f6144j).a("IconImageUri", this.f6145k).toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i10) {
        if (w3()) {
            parcel.writeInt(this.f6142h);
            parcel.writeString(this.f6143i);
            parcel.writeString(this.f6144j);
            Uri uri = this.f6145k;
            parcel.writeString(uri == null ? null : uri.toString());
            return;
        }
        int iA = b.a(parcel);
        b.n(parcel, 1, this.f6142h);
        b.v(parcel, 2, this.f6143i, false);
        b.v(parcel, 3, this.f6144j, false);
        b.t(parcel, 4, this.f6145k, i10, false);
        b.b(parcel, iA);
    }

    @Override // com.google.android.gms.games.internal.game.zza
    public final int zza() {
        return this.f6142h;
    }

    @Override // com.google.android.gms.games.internal.game.zza
    @NonNull
    public final String zzb() {
        return this.f6144j;
    }
}
