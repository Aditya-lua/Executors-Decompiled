package com.google.android.gms.games.internal.experience;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.apps.common.proguard.UsedByReflection;
import com.google.android.gms.games.Game;
import com.google.android.gms.games.GameEntity;
import com.google.android.gms.games.internal.zzg;
import ha.a;
import n9.k;
import o9.b;

/* JADX INFO: loaded from: classes.dex */
@UsedByReflection("GamesGmsClientImpl.java")
public final class ExperienceEventEntity extends zzg implements ExperienceEvent {

    @NonNull
    public static final Parcelable.Creator<ExperienceEventEntity> CREATOR = new a();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f6204f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final GameEntity f6205g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f6206h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f6207i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f6208j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Uri f6209k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final long f6210l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final long f6211m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final long f6212n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f6213o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final int f6214p;

    public ExperienceEventEntity(String str, GameEntity gameEntity, String str2, String str3, String str4, Uri uri, long j10, long j11, long j12, int i10, int i11) {
        this.f6204f = str;
        this.f6205g = gameEntity;
        this.f6206h = str2;
        this.f6207i = str3;
        this.f6208j = str4;
        this.f6209k = uri;
        this.f6210l = j10;
        this.f6211m = j11;
        this.f6212n = j12;
        this.f6213o = i10;
        this.f6214p = i11;
    }

    @Override // com.google.android.gms.games.internal.experience.ExperienceEvent
    public final long c() {
        return this.f6211m;
    }

    @Override // com.google.android.gms.games.internal.experience.ExperienceEvent
    public final int d() {
        return this.f6213o;
    }

    @Override // com.google.android.gms.games.internal.experience.ExperienceEvent
    public final int e() {
        return this.f6214p;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ExperienceEvent)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        ExperienceEvent experienceEvent = (ExperienceEvent) obj;
        return k.b(experienceEvent.zza(), this.f6204f) && k.b(experienceEvent.zzb(), this.f6205g) && k.b(experienceEvent.zzc(), this.f6206h) && k.b(experienceEvent.zzd(), this.f6207i) && k.b(experienceEvent.getIconImageUrl(), getIconImageUrl()) && k.b(experienceEvent.zze(), this.f6209k) && k.b(Long.valueOf(experienceEvent.zzf()), Long.valueOf(this.f6210l)) && k.b(Long.valueOf(experienceEvent.c()), Long.valueOf(this.f6211m)) && k.b(Long.valueOf(experienceEvent.zzh()), Long.valueOf(this.f6212n)) && k.b(Integer.valueOf(experienceEvent.d()), Integer.valueOf(this.f6213o)) && k.b(Integer.valueOf(experienceEvent.e()), Integer.valueOf(this.f6214p));
    }

    @Override // com.google.android.gms.games.internal.experience.ExperienceEvent
    @NonNull
    public String getIconImageUrl() {
        return this.f6208j;
    }

    public final int hashCode() {
        return k.c(this.f6204f, this.f6205g, this.f6206h, this.f6207i, getIconImageUrl(), this.f6209k, Long.valueOf(this.f6210l), Long.valueOf(this.f6211m), Long.valueOf(this.f6212n), Integer.valueOf(this.f6213o), Integer.valueOf(this.f6214p));
    }

    @NonNull
    public final String toString() {
        return k.d(this).a("ExperienceId", this.f6204f).a("Game", this.f6205g).a("DisplayTitle", this.f6206h).a("DisplayDescription", this.f6207i).a("IconImageUrl", getIconImageUrl()).a("IconImageUri", this.f6209k).a("CreatedTimestamp", Long.valueOf(this.f6210l)).a("XpEarned", Long.valueOf(this.f6211m)).a("CurrentXp", Long.valueOf(this.f6212n)).a("Type", Integer.valueOf(this.f6213o)).a("NewLevel", Integer.valueOf(this.f6214p)).toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i10) {
        String str = this.f6204f;
        int iA = b.a(parcel);
        b.v(parcel, 1, str, false);
        b.t(parcel, 2, this.f6205g, i10, false);
        b.v(parcel, 3, this.f6206h, false);
        b.v(parcel, 4, this.f6207i, false);
        b.v(parcel, 5, getIconImageUrl(), false);
        b.t(parcel, 6, this.f6209k, i10, false);
        b.r(parcel, 7, this.f6210l);
        b.r(parcel, 8, this.f6211m);
        b.r(parcel, 9, this.f6212n);
        b.n(parcel, 10, this.f6213o);
        b.n(parcel, 11, this.f6214p);
        b.b(parcel, iA);
    }

    @Override // com.google.android.gms.games.internal.experience.ExperienceEvent
    @NonNull
    public final String zza() {
        return this.f6204f;
    }

    @Override // com.google.android.gms.games.internal.experience.ExperienceEvent
    @NonNull
    public final Game zzb() {
        return this.f6205g;
    }

    @Override // com.google.android.gms.games.internal.experience.ExperienceEvent
    @NonNull
    public final String zzc() {
        return this.f6206h;
    }

    @Override // com.google.android.gms.games.internal.experience.ExperienceEvent
    @NonNull
    public final String zzd() {
        return this.f6207i;
    }

    @Override // com.google.android.gms.games.internal.experience.ExperienceEvent
    @NonNull
    public final Uri zze() {
        return this.f6209k;
    }

    @Override // com.google.android.gms.games.internal.experience.ExperienceEvent
    public final long zzf() {
        return this.f6210l;
    }

    @Override // com.google.android.gms.games.internal.experience.ExperienceEvent
    public final long zzh() {
        return this.f6212n;
    }
}
