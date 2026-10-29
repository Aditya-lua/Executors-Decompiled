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
    public final String f6131f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final GameEntity f6132g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f6133h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f6134i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f6135j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Uri f6136k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final long f6137l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final long f6138m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final long f6139n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f6140o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final int f6141p;

    public ExperienceEventEntity(String str, GameEntity gameEntity, String str2, String str3, String str4, Uri uri, long j10, long j11, long j12, int i10, int i11) {
        this.f6131f = str;
        this.f6132g = gameEntity;
        this.f6133h = str2;
        this.f6134i = str3;
        this.f6135j = str4;
        this.f6136k = uri;
        this.f6137l = j10;
        this.f6138m = j11;
        this.f6139n = j12;
        this.f6140o = i10;
        this.f6141p = i11;
    }

    @Override // com.google.android.gms.games.internal.experience.ExperienceEvent
    public final long c() {
        return this.f6138m;
    }

    @Override // com.google.android.gms.games.internal.experience.ExperienceEvent
    public final int d() {
        return this.f6140o;
    }

    @Override // com.google.android.gms.games.internal.experience.ExperienceEvent
    public final int e() {
        return this.f6141p;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ExperienceEvent)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        ExperienceEvent experienceEvent = (ExperienceEvent) obj;
        return k.b(experienceEvent.zza(), this.f6131f) && k.b(experienceEvent.zzb(), this.f6132g) && k.b(experienceEvent.zzc(), this.f6133h) && k.b(experienceEvent.zzd(), this.f6134i) && k.b(experienceEvent.getIconImageUrl(), getIconImageUrl()) && k.b(experienceEvent.zze(), this.f6136k) && k.b(Long.valueOf(experienceEvent.zzf()), Long.valueOf(this.f6137l)) && k.b(Long.valueOf(experienceEvent.c()), Long.valueOf(this.f6138m)) && k.b(Long.valueOf(experienceEvent.zzh()), Long.valueOf(this.f6139n)) && k.b(Integer.valueOf(experienceEvent.d()), Integer.valueOf(this.f6140o)) && k.b(Integer.valueOf(experienceEvent.e()), Integer.valueOf(this.f6141p));
    }

    @Override // com.google.android.gms.games.internal.experience.ExperienceEvent
    @NonNull
    public String getIconImageUrl() {
        return this.f6135j;
    }

    public final int hashCode() {
        return k.c(this.f6131f, this.f6132g, this.f6133h, this.f6134i, getIconImageUrl(), this.f6136k, Long.valueOf(this.f6137l), Long.valueOf(this.f6138m), Long.valueOf(this.f6139n), Integer.valueOf(this.f6140o), Integer.valueOf(this.f6141p));
    }

    @NonNull
    public final String toString() {
        return k.d(this).a("ExperienceId", this.f6131f).a("Game", this.f6132g).a("DisplayTitle", this.f6133h).a("DisplayDescription", this.f6134i).a("IconImageUrl", getIconImageUrl()).a("IconImageUri", this.f6136k).a("CreatedTimestamp", Long.valueOf(this.f6137l)).a("XpEarned", Long.valueOf(this.f6138m)).a("CurrentXp", Long.valueOf(this.f6139n)).a("Type", Integer.valueOf(this.f6140o)).a("NewLevel", Integer.valueOf(this.f6141p)).toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i10) {
        String str = this.f6131f;
        int iA = b.a(parcel);
        b.v(parcel, 1, str, false);
        b.t(parcel, 2, this.f6132g, i10, false);
        b.v(parcel, 3, this.f6133h, false);
        b.v(parcel, 4, this.f6134i, false);
        b.v(parcel, 5, getIconImageUrl(), false);
        b.t(parcel, 6, this.f6136k, i10, false);
        b.r(parcel, 7, this.f6137l);
        b.r(parcel, 8, this.f6138m);
        b.r(parcel, 9, this.f6139n);
        b.n(parcel, 10, this.f6140o);
        b.n(parcel, 11, this.f6141p);
        b.b(parcel, iA);
    }

    @Override // com.google.android.gms.games.internal.experience.ExperienceEvent
    @NonNull
    public final String zza() {
        return this.f6131f;
    }

    @Override // com.google.android.gms.games.internal.experience.ExperienceEvent
    @NonNull
    public final Game zzb() {
        return this.f6132g;
    }

    @Override // com.google.android.gms.games.internal.experience.ExperienceEvent
    @NonNull
    public final String zzc() {
        return this.f6133h;
    }

    @Override // com.google.android.gms.games.internal.experience.ExperienceEvent
    @NonNull
    public final String zzd() {
        return this.f6134i;
    }

    @Override // com.google.android.gms.games.internal.experience.ExperienceEvent
    @NonNull
    public final Uri zze() {
        return this.f6136k;
    }

    @Override // com.google.android.gms.games.internal.experience.ExperienceEvent
    public final long zzf() {
        return this.f6137l;
    }

    @Override // com.google.android.gms.games.internal.experience.ExperienceEvent
    public final long zzh() {
        return this.f6139n;
    }
}
