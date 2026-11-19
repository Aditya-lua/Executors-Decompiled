package com.google.android.gms.games.internal.experience;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.apps.common.proguard.UsedByReflection;
import com.google.android.gms.games.GameEntity;
import ea.e;
import ha.p;
import ia.a;
import ia.b;
import o9.q;
import p9.c;

/* JADX INFO: loaded from: classes.dex */
@UsedByReflection("GamesGmsClientImpl.java")
public final class ExperienceEventEntity extends p implements a {

    @NonNull
    public static final Parcelable.Creator<ExperienceEventEntity> CREATOR = new b();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f6255f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final GameEntity f6256g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f6257h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f6258i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f6259j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Uri f6260k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final long f6261l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final long f6262m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final long f6263n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f6264o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final int f6265p;

    public ExperienceEventEntity(String str, GameEntity gameEntity, String str2, String str3, String str4, Uri uri, long j10, long j11, long j12, int i10, int i11) {
        this.f6255f = str;
        this.f6256g = gameEntity;
        this.f6257h = str2;
        this.f6258i = str3;
        this.f6259j = str4;
        this.f6260k = uri;
        this.f6261l = j10;
        this.f6262m = j11;
        this.f6263n = j12;
        this.f6264o = i10;
        this.f6265p = i11;
    }

    @Override // ia.a
    public final long c() {
        return this.f6262m;
    }

    @Override // ia.a
    public final int d() {
        return this.f6264o;
    }

    @Override // ia.a
    public final int e() {
        return this.f6265p;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        a aVar = (a) obj;
        return q.b(aVar.zza(), this.f6255f) && q.b(aVar.zzb(), this.f6256g) && q.b(aVar.zzc(), this.f6257h) && q.b(aVar.zzd(), this.f6258i) && q.b(aVar.getIconImageUrl(), getIconImageUrl()) && q.b(aVar.zze(), this.f6260k) && q.b(Long.valueOf(aVar.zzf()), Long.valueOf(this.f6261l)) && q.b(Long.valueOf(aVar.c()), Long.valueOf(this.f6262m)) && q.b(Long.valueOf(aVar.zzh()), Long.valueOf(this.f6263n)) && q.b(Integer.valueOf(aVar.d()), Integer.valueOf(this.f6264o)) && q.b(Integer.valueOf(aVar.e()), Integer.valueOf(this.f6265p));
    }

    @Override // ia.a
    @NonNull
    public String getIconImageUrl() {
        return this.f6259j;
    }

    public final int hashCode() {
        return q.c(this.f6255f, this.f6256g, this.f6257h, this.f6258i, getIconImageUrl(), this.f6260k, Long.valueOf(this.f6261l), Long.valueOf(this.f6262m), Long.valueOf(this.f6263n), Integer.valueOf(this.f6264o), Integer.valueOf(this.f6265p));
    }

    @NonNull
    public final String toString() {
        return q.d(this).a("ExperienceId", this.f6255f).a("Game", this.f6256g).a("DisplayTitle", this.f6257h).a("DisplayDescription", this.f6258i).a("IconImageUrl", getIconImageUrl()).a("IconImageUri", this.f6260k).a("CreatedTimestamp", Long.valueOf(this.f6261l)).a("XpEarned", Long.valueOf(this.f6262m)).a("CurrentXp", Long.valueOf(this.f6263n)).a("Type", Integer.valueOf(this.f6264o)).a("NewLevel", Integer.valueOf(this.f6265p)).toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i10) {
        String str = this.f6255f;
        int iA = c.a(parcel);
        c.v(parcel, 1, str, false);
        c.t(parcel, 2, this.f6256g, i10, false);
        c.v(parcel, 3, this.f6257h, false);
        c.v(parcel, 4, this.f6258i, false);
        c.v(parcel, 5, getIconImageUrl(), false);
        c.t(parcel, 6, this.f6260k, i10, false);
        c.r(parcel, 7, this.f6261l);
        c.r(parcel, 8, this.f6262m);
        c.r(parcel, 9, this.f6263n);
        c.n(parcel, 10, this.f6264o);
        c.n(parcel, 11, this.f6265p);
        c.b(parcel, iA);
    }

    @Override // ia.a
    @NonNull
    public final String zza() {
        return this.f6255f;
    }

    @Override // ia.a
    @NonNull
    public final e zzb() {
        return this.f6256g;
    }

    @Override // ia.a
    @NonNull
    public final String zzc() {
        return this.f6257h;
    }

    @Override // ia.a
    @NonNull
    public final String zzd() {
        return this.f6258i;
    }

    @Override // ia.a
    @NonNull
    public final Uri zze() {
        return this.f6260k;
    }

    @Override // ia.a
    public final long zzf() {
        return this.f6261l;
    }

    @Override // ia.a
    public final long zzh() {
        return this.f6263n;
    }
}
