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
    public final String f6149f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f6150g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f6151h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Uri f6152i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Uri f6153j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Uri f6154k;

    public MostRecentGameInfoEntity(zza zzaVar) {
        this.f6149f = zzaVar.zza();
        this.f6150g = zzaVar.zzb();
        this.f6151h = zzaVar.zzc();
        this.f6152i = zzaVar.zzd();
        this.f6153j = zzaVar.zze();
        this.f6154k = zzaVar.zzf();
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
        return this.f6149f;
    }

    @Override // com.google.android.gms.games.internal.player.zza
    @NonNull
    public final String zzb() {
        return this.f6150g;
    }

    @Override // com.google.android.gms.games.internal.player.zza
    public final long zzc() {
        return this.f6151h;
    }

    @Override // com.google.android.gms.games.internal.player.zza
    @NonNull
    public final Uri zzd() {
        return this.f6152i;
    }

    @Override // com.google.android.gms.games.internal.player.zza
    @NonNull
    public final Uri zze() {
        return this.f6153j;
    }

    @Override // com.google.android.gms.games.internal.player.zza
    @NonNull
    public final Uri zzf() {
        return this.f6154k;
    }

    public MostRecentGameInfoEntity(String str, String str2, long j10, Uri uri, Uri uri2, Uri uri3) {
        this.f6149f = str;
        this.f6150g = str2;
        this.f6151h = j10;
        this.f6152i = uri;
        this.f6153j = uri2;
        this.f6154k = uri3;
    }
}
