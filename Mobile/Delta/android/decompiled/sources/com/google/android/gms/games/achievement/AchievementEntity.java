package com.google.android.gms.games.achievement;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.apps.common.proguard.UsedByReflection;
import com.google.android.gms.games.Player;
import com.google.android.gms.games.PlayerEntity;
import com.google.android.gms.games.internal.zzg;
import ea.b;
import n9.k;

/* JADX INFO: loaded from: classes.dex */
@UsedByReflection("GamesGmsClientImpl.java")
public final class AchievementEntity extends zzg implements Achievement {

    @NonNull
    public static final Parcelable.Creator<AchievementEntity> CREATOR = new b();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f6104f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f6105g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f6106h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f6107i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Uri f6108j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final String f6109k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Uri f6110l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final String f6111m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f6112n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final String f6113o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final PlayerEntity f6114p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final int f6115q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final int f6116r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final String f6117s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final long f6118t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final long f6119u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final float f6120v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final String f6121w;

    public AchievementEntity(@NonNull Achievement achievement) {
        String strH0 = achievement.H0();
        this.f6104f = strH0;
        this.f6105g = achievement.getType();
        this.f6106h = achievement.getName();
        String description = achievement.getDescription();
        this.f6107i = description;
        this.f6108j = achievement.H();
        this.f6109k = achievement.getUnlockedImageUrl();
        this.f6110l = achievement.C2();
        this.f6111m = achievement.getRevealedImageUrl();
        Player playerZzb = achievement.zzb();
        if (playerZzb != null) {
            this.f6114p = new PlayerEntity(playerZzb);
        } else {
            this.f6114p = null;
        }
        this.f6115q = achievement.getState();
        this.f6118t = achievement.h1();
        this.f6119u = achievement.n2();
        this.f6120v = achievement.zzc();
        this.f6121w = achievement.zza();
        if (achievement.getType() == 1) {
            this.f6112n = achievement.p1();
            this.f6113o = achievement.J1();
            this.f6116r = achievement.J2();
            this.f6117s = achievement.W1();
        } else {
            this.f6112n = 0;
            this.f6113o = null;
            this.f6116r = 0;
            this.f6117s = null;
        }
        n9.b.a(strH0);
        n9.b.a(description);
    }

    public static int a(Achievement achievement) {
        int iJ2;
        int iP1;
        if (achievement.getType() == 1) {
            iJ2 = achievement.J2();
            iP1 = achievement.p1();
        } else {
            iJ2 = 0;
            iP1 = 0;
        }
        return k.c(achievement.H0(), achievement.zza(), achievement.getName(), Integer.valueOf(achievement.getType()), achievement.getDescription(), Long.valueOf(achievement.n2()), Integer.valueOf(achievement.getState()), Long.valueOf(achievement.h1()), achievement.zzb(), Integer.valueOf(iJ2), Integer.valueOf(iP1));
    }

    public static boolean v3(Achievement achievement, Object obj) {
        if (!(obj instanceof Achievement)) {
            return false;
        }
        if (achievement == obj) {
            return true;
        }
        Achievement achievement2 = (Achievement) obj;
        if (achievement2.getType() != achievement.getType()) {
            return false;
        }
        return (achievement.getType() != 1 || (achievement2.J2() == achievement.J2() && achievement2.p1() == achievement.p1())) && achievement2.n2() == achievement.n2() && achievement2.getState() == achievement.getState() && achievement2.h1() == achievement.h1() && k.b(achievement2.H0(), achievement.H0()) && k.b(achievement2.zza(), achievement.zza()) && k.b(achievement2.getName(), achievement.getName()) && k.b(achievement2.getDescription(), achievement.getDescription()) && k.b(achievement2.zzb(), achievement.zzb()) && achievement2.zzc() == achievement.zzc();
    }

    public static String w3(Achievement achievement) {
        k.a aVarA = k.d(achievement).a("Id", achievement.H0()).a("Game Id", achievement.zza()).a("Type", Integer.valueOf(achievement.getType())).a("Name", achievement.getName()).a("Description", achievement.getDescription()).a("Player", achievement.zzb()).a("State", Integer.valueOf(achievement.getState())).a("Rarity Percent", Float.valueOf(achievement.zzc()));
        if (achievement.getType() == 1) {
            aVarA.a("CurrentSteps", Integer.valueOf(achievement.J2()));
            aVarA.a("TotalSteps", Integer.valueOf(achievement.p1()));
        }
        return aVarA.toString();
    }

    @Override // com.google.android.gms.games.achievement.Achievement
    public Uri C2() {
        return this.f6110l;
    }

    @Override // com.google.android.gms.games.achievement.Achievement
    public Uri H() {
        return this.f6108j;
    }

    @Override // com.google.android.gms.games.achievement.Achievement
    @NonNull
    public String H0() {
        return this.f6104f;
    }

    @Override // com.google.android.gms.games.achievement.Achievement
    public String J1() {
        n9.b.b(getType() == 1);
        return this.f6113o;
    }

    @Override // com.google.android.gms.games.achievement.Achievement
    public int J2() {
        n9.b.b(getType() == 1);
        return this.f6116r;
    }

    @Override // com.google.android.gms.games.achievement.Achievement
    public String W1() {
        n9.b.b(getType() == 1);
        return this.f6117s;
    }

    public boolean equals(Object obj) {
        return v3(this, obj);
    }

    @Override // com.google.android.gms.games.achievement.Achievement
    @NonNull
    public String getDescription() {
        return this.f6107i;
    }

    @Override // com.google.android.gms.games.achievement.Achievement
    @NonNull
    public String getName() {
        return this.f6106h;
    }

    @Override // com.google.android.gms.games.achievement.Achievement
    public String getRevealedImageUrl() {
        return this.f6111m;
    }

    @Override // com.google.android.gms.games.achievement.Achievement
    public int getState() {
        return this.f6115q;
    }

    @Override // com.google.android.gms.games.achievement.Achievement
    public int getType() {
        return this.f6105g;
    }

    @Override // com.google.android.gms.games.achievement.Achievement
    public String getUnlockedImageUrl() {
        return this.f6109k;
    }

    @Override // com.google.android.gms.games.achievement.Achievement
    public long h1() {
        return this.f6118t;
    }

    public int hashCode() {
        return a(this);
    }

    @Override // com.google.android.gms.games.achievement.Achievement
    public long n2() {
        return this.f6119u;
    }

    @Override // com.google.android.gms.games.achievement.Achievement
    public int p1() {
        n9.b.b(getType() == 1);
        return this.f6112n;
    }

    @NonNull
    public String toString() {
        return w3(this);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i10) {
        int iA = o9.b.a(parcel);
        o9.b.v(parcel, 1, H0(), false);
        o9.b.n(parcel, 2, getType());
        o9.b.v(parcel, 3, getName(), false);
        o9.b.v(parcel, 4, getDescription(), false);
        o9.b.t(parcel, 5, H(), i10, false);
        o9.b.v(parcel, 6, getUnlockedImageUrl(), false);
        o9.b.t(parcel, 7, C2(), i10, false);
        o9.b.v(parcel, 8, getRevealedImageUrl(), false);
        o9.b.n(parcel, 9, this.f6112n);
        o9.b.v(parcel, 10, this.f6113o, false);
        o9.b.t(parcel, 11, this.f6114p, i10, false);
        o9.b.n(parcel, 12, getState());
        o9.b.n(parcel, 13, this.f6116r);
        o9.b.v(parcel, 14, this.f6117s, false);
        o9.b.r(parcel, 15, h1());
        o9.b.r(parcel, 16, n2());
        o9.b.k(parcel, 17, this.f6120v);
        o9.b.v(parcel, 18, this.f6121w, false);
        o9.b.b(parcel, iA);
    }

    @Override // com.google.android.gms.games.achievement.Achievement
    @NonNull
    public final String zza() {
        return this.f6121w;
    }

    @Override // com.google.android.gms.games.achievement.Achievement
    public final Player zzb() {
        return this.f6114p;
    }

    @Override // com.google.android.gms.games.achievement.Achievement
    public final float zzc() {
        return this.f6120v;
    }

    public AchievementEntity(String str, int i10, String str2, String str3, Uri uri, String str4, Uri uri2, String str5, int i11, String str6, PlayerEntity playerEntity, int i12, int i13, String str7, long j10, long j11, float f10, String str8) {
        this.f6104f = str;
        this.f6105g = i10;
        this.f6106h = str2;
        this.f6107i = str3;
        this.f6108j = uri;
        this.f6109k = str4;
        this.f6110l = uri2;
        this.f6111m = str5;
        this.f6112n = i11;
        this.f6113o = str6;
        this.f6114p = playerEntity;
        this.f6115q = i12;
        this.f6116r = i13;
        this.f6117s = str7;
        this.f6118t = j10;
        this.f6119u = j11;
        this.f6120v = f10;
        this.f6121w = str8;
    }
}
