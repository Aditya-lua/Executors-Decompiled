package com.google.android.gms.games.internal.player;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.apps.common.proguard.UsedByReflection;
import com.google.android.gms.games.internal.zzg;
import ja.a;
import n9.k;

/* JADX INFO: loaded from: classes.dex */
@UsedByReflection("GamesGmsClientImpl.java")
public final class MostRecentGameInfoEntity extends zzg implements zza {

    @NonNull
    public static final Parcelable.Creator<MostRecentGameInfoEntity> CREATOR = new a();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f6222f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f6223g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f6224h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Uri f6225i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Uri f6226j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Uri f6227k;

    public MostRecentGameInfoEntity(zza zzaVar) {
        this.f6222f = zzaVar.zza();
        this.f6223g = zzaVar.zzb();
        this.f6224h = zzaVar.zzc();
        this.f6225i = zzaVar.zzd();
        this.f6226j = zzaVar.zze();
        this.f6227k = zzaVar.zzf();
    }

    public static int a(zza zzaVar) {
        return k.c(zzaVar.zza(), zzaVar.zzb(), Long.valueOf(zzaVar.zzc()), zzaVar.zzd(), zzaVar.zze(), zzaVar.zzf());
    }

    public static boolean v3(zza zzaVar, Object obj) {
        if (!(obj instanceof zza)) {
            return false;
        }
        if (zzaVar == obj) {
            return true;
        }
        zza zzaVar2 = (zza) obj;
        return k.b(zzaVar2.zza(), zzaVar.zza()) && k.b(zzaVar2.zzb(), zzaVar.zzb()) && k.b(Long.valueOf(zzaVar2.zzc()), Long.valueOf(zzaVar.zzc())) && k.b(zzaVar2.zzd(), zzaVar.zzd()) && k.b(zzaVar2.zze(), zzaVar.zze()) && k.b(zzaVar2.zzf(), zzaVar.zzf());
    }

    public static String w3(zza zzaVar) {
        return k.d(zzaVar).a("GameId", zzaVar.zza()).a("GameName", zzaVar.zzb()).a("ActivityTimestampMillis", Long.valueOf(zzaVar.zzc())).a("GameIconUri", zzaVar.zzd()).a("GameHiResUri", zzaVar.zze()).a("GameFeaturedUri", zzaVar.zzf()).toString();
    }

    public final boolean equals(Object obj) {
        return v3(this, obj);
    }

    public final int hashCode() {
        return a(this);
    }

    @NonNull
    public final String toString() {
        return w3(this);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i10) {
        a.a(this, parcel, i10);
    }

    @Override // com.google.android.gms.games.internal.player.zza
    @NonNull
    public final String zza() {
        return this.f6222f;
    }

    @Override // com.google.android.gms.games.internal.player.zza
    @NonNull
    public final String zzb() {
        return this.f6223g;
    }

    @Override // com.google.android.gms.games.internal.player.zza
    public final long zzc() {
        return this.f6224h;
    }

    @Override // com.google.android.gms.games.internal.player.zza
    @NonNull
    public final Uri zzd() {
        return this.f6225i;
    }

    @Override // com.google.android.gms.games.internal.player.zza
    @NonNull
    public final Uri zze() {
        return this.f6226j;
    }

    @Override // com.google.android.gms.games.internal.player.zza
    @NonNull
    public final Uri zzf() {
        return this.f6227k;
    }

    public MostRecentGameInfoEntity(String str, String str2, long j10, Uri uri, Uri uri2, Uri uri3) {
        this.f6222f = str;
        this.f6223g = str2;
        this.f6224h = j10;
        this.f6225i = uri;
        this.f6226j = uri2;
        this.f6227k = uri3;
    }
}
