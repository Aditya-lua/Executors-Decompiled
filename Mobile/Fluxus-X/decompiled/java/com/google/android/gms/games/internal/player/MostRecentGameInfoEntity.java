package com.google.android.gms.games.internal.player;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.apps.common.proguard.UsedByReflection;
import ha.p;
import ka.b;
import ka.c;
import o9.q;

/* JADX INFO: loaded from: classes.dex */
@UsedByReflection("GamesGmsClientImpl.java")
public final class MostRecentGameInfoEntity extends p implements b {

    @NonNull
    public static final Parcelable.Creator<MostRecentGameInfoEntity> CREATOR = new c();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f6273f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f6274g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f6275h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Uri f6276i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Uri f6277j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Uri f6278k;

    public MostRecentGameInfoEntity(b bVar) {
        this.f6273f = bVar.zza();
        this.f6274g = bVar.zzb();
        this.f6275h = bVar.zzc();
        this.f6276i = bVar.zzd();
        this.f6277j = bVar.zze();
        this.f6278k = bVar.zzf();
    }

    public static boolean A3(b bVar, Object obj) {
        if (!(obj instanceof b)) {
            return false;
        }
        if (bVar == obj) {
            return true;
        }
        b bVar2 = (b) obj;
        return q.b(bVar2.zza(), bVar.zza()) && q.b(bVar2.zzb(), bVar.zzb()) && q.b(Long.valueOf(bVar2.zzc()), Long.valueOf(bVar.zzc())) && q.b(bVar2.zzd(), bVar.zzd()) && q.b(bVar2.zze(), bVar.zze()) && q.b(bVar2.zzf(), bVar.zzf());
    }

    public static String B3(b bVar) {
        return q.d(bVar).a("GameId", bVar.zza()).a("GameName", bVar.zzb()).a("ActivityTimestampMillis", Long.valueOf(bVar.zzc())).a("GameIconUri", bVar.zzd()).a("GameHiResUri", bVar.zze()).a("GameFeaturedUri", bVar.zzf()).toString();
    }

    public static int a(b bVar) {
        return q.c(bVar.zza(), bVar.zzb(), Long.valueOf(bVar.zzc()), bVar.zzd(), bVar.zze(), bVar.zzf());
    }

    public final boolean equals(Object obj) {
        return A3(this, obj);
    }

    public final int hashCode() {
        return a(this);
    }

    @NonNull
    public final String toString() {
        return B3(this);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i10) {
        c.a(this, parcel, i10);
    }

    @Override // ka.b
    @NonNull
    public final String zza() {
        return this.f6273f;
    }

    @Override // ka.b
    @NonNull
    public final String zzb() {
        return this.f6274g;
    }

    @Override // ka.b
    public final long zzc() {
        return this.f6275h;
    }

    @Override // ka.b
    @NonNull
    public final Uri zzd() {
        return this.f6276i;
    }

    @Override // ka.b
    @NonNull
    public final Uri zze() {
        return this.f6277j;
    }

    @Override // ka.b
    @NonNull
    public final Uri zzf() {
        return this.f6278k;
    }

    public MostRecentGameInfoEntity(String str, String str2, long j10, Uri uri, Uri uri2, Uri uri3) {
        this.f6273f = str;
        this.f6274g = str2;
        this.f6275h = j10;
        this.f6276i = uri;
        this.f6277j = uri2;
        this.f6278k = uri3;
    }
}
