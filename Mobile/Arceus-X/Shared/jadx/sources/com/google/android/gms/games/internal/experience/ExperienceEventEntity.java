package com.google.android.gms.games.internal.experience;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.apps.common.proguard.UsedByReflection;
import com.google.android.gms.games.Game;
import com.google.android.gms.games.GameEntity;
import com.google.android.gms.games.internal.zzg;
import p165ha.C6326a;
import p305n9.C8947k;
import p325o9.C9718b;

/* JADX INFO: loaded from: classes.dex */
@UsedByReflection("GamesGmsClientImpl.java")
public final class ExperienceEventEntity extends zzg implements ExperienceEvent {

    @NonNull
    public static final Parcelable.Creator<ExperienceEventEntity> CREATOR = new C6326a();

    /* JADX INFO: renamed from: f */
    public final String f7847f;

    /* JADX INFO: renamed from: g */
    public final GameEntity f7848g;

    /* JADX INFO: renamed from: h */
    public final String f7849h;

    /* JADX INFO: renamed from: i */
    public final String f7850i;

    /* JADX INFO: renamed from: j */
    public final String f7851j;

    /* JADX INFO: renamed from: k */
    public final Uri f7852k;

    /* JADX INFO: renamed from: l */
    public final long f7853l;

    /* JADX INFO: renamed from: m */
    public final long f7854m;

    /* JADX INFO: renamed from: n */
    public final long f7855n;

    /* JADX INFO: renamed from: o */
    public final int f7856o;

    /* JADX INFO: renamed from: p */
    public final int f7857p;

    public ExperienceEventEntity(String str, GameEntity gameEntity, String str2, String str3, String str4, Uri uri, long j10, long j11, long j12, int i10, int i11) {
        this.f7847f = str;
        this.f7848g = gameEntity;
        this.f7849h = str2;
        this.f7850i = str3;
        this.f7851j = str4;
        this.f7852k = uri;
        this.f7853l = j10;
        this.f7854m = j11;
        this.f7855n = j12;
        this.f7856o = i10;
        this.f7857p = i11;
    }

    @Override // com.google.android.gms.games.internal.experience.ExperienceEvent
    /* JADX INFO: renamed from: c */
    public final long mo9434c() {
        return this.f7854m;
    }

    @Override // com.google.android.gms.games.internal.experience.ExperienceEvent
    /* JADX INFO: renamed from: d */
    public final int mo9435d() {
        return this.f7856o;
    }

    @Override // com.google.android.gms.games.internal.experience.ExperienceEvent
    /* JADX INFO: renamed from: e */
    public final int mo9436e() {
        return this.f7857p;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ExperienceEvent)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        ExperienceEvent experienceEvent = (ExperienceEvent) obj;
        return C8947k.m36026b(experienceEvent.zza(), this.f7847f) && C8947k.m36026b(experienceEvent.zzb(), this.f7848g) && C8947k.m36026b(experienceEvent.zzc(), this.f7849h) && C8947k.m36026b(experienceEvent.zzd(), this.f7850i) && C8947k.m36026b(experienceEvent.getIconImageUrl(), getIconImageUrl()) && C8947k.m36026b(experienceEvent.zze(), this.f7852k) && C8947k.m36026b(Long.valueOf(experienceEvent.zzf()), Long.valueOf(this.f7853l)) && C8947k.m36026b(Long.valueOf(experienceEvent.mo9434c()), Long.valueOf(this.f7854m)) && C8947k.m36026b(Long.valueOf(experienceEvent.zzh()), Long.valueOf(this.f7855n)) && C8947k.m36026b(Integer.valueOf(experienceEvent.mo9435d()), Integer.valueOf(this.f7856o)) && C8947k.m36026b(Integer.valueOf(experienceEvent.mo9436e()), Integer.valueOf(this.f7857p));
    }

    @Override // com.google.android.gms.games.internal.experience.ExperienceEvent
    @NonNull
    public String getIconImageUrl() {
        return this.f7851j;
    }

    public final int hashCode() {
        return C8947k.m36027c(this.f7847f, this.f7848g, this.f7849h, this.f7850i, getIconImageUrl(), this.f7852k, Long.valueOf(this.f7853l), Long.valueOf(this.f7854m), Long.valueOf(this.f7855n), Integer.valueOf(this.f7856o), Integer.valueOf(this.f7857p));
    }

    @NonNull
    public final String toString() {
        return C8947k.m36028d(this).m36029a("ExperienceId", this.f7847f).m36029a("Game", this.f7848g).m36029a("DisplayTitle", this.f7849h).m36029a("DisplayDescription", this.f7850i).m36029a("IconImageUrl", getIconImageUrl()).m36029a("IconImageUri", this.f7852k).m36029a("CreatedTimestamp", Long.valueOf(this.f7853l)).m36029a("XpEarned", Long.valueOf(this.f7854m)).m36029a("CurrentXp", Long.valueOf(this.f7855n)).m36029a("Type", Integer.valueOf(this.f7856o)).m36029a("NewLevel", Integer.valueOf(this.f7857p)).toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i10) {
        String str = this.f7847f;
        int iM38457a = C9718b.m38457a(parcel);
        C9718b.m38478v(parcel, 1, str, false);
        C9718b.m38476t(parcel, 2, this.f7848g, i10, false);
        C9718b.m38478v(parcel, 3, this.f7849h, false);
        C9718b.m38478v(parcel, 4, this.f7850i, false);
        C9718b.m38478v(parcel, 5, getIconImageUrl(), false);
        C9718b.m38476t(parcel, 6, this.f7852k, i10, false);
        C9718b.m38474r(parcel, 7, this.f7853l);
        C9718b.m38474r(parcel, 8, this.f7854m);
        C9718b.m38474r(parcel, 9, this.f7855n);
        C9718b.m38470n(parcel, 10, this.f7856o);
        C9718b.m38470n(parcel, 11, this.f7857p);
        C9718b.m38458b(parcel, iM38457a);
    }

    @Override // com.google.android.gms.games.internal.experience.ExperienceEvent
    @NonNull
    public final String zza() {
        return this.f7847f;
    }

    @Override // com.google.android.gms.games.internal.experience.ExperienceEvent
    @NonNull
    public final Game zzb() {
        return this.f7848g;
    }

    @Override // com.google.android.gms.games.internal.experience.ExperienceEvent
    @NonNull
    public final String zzc() {
        return this.f7849h;
    }

    @Override // com.google.android.gms.games.internal.experience.ExperienceEvent
    @NonNull
    public final String zzd() {
        return this.f7850i;
    }

    @Override // com.google.android.gms.games.internal.experience.ExperienceEvent
    @NonNull
    public final Uri zze() {
        return this.f7852k;
    }

    @Override // com.google.android.gms.games.internal.experience.ExperienceEvent
    public final long zzf() {
        return this.f7853l;
    }

    @Override // com.google.android.gms.games.internal.experience.ExperienceEvent
    public final long zzh() {
        return this.f7855n;
    }
}
