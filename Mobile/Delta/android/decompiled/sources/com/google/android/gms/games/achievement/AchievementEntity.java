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
    public final String f6177f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f6178g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f6179h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f6180i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Uri f6181j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final String f6182k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Uri f6183l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final String f6184m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f6185n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final String f6186o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final PlayerEntity f6187p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final int f6188q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final int f6189r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final String f6190s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final long f6191t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final long f6192u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final float f6193v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final String f6194w;

    public AchievementEntity(@NonNull Achievement achievement) {
        String strD0 = achievement.D0();
        this.f6177f = strD0;
        this.f6178g = achievement.getType();
        this.f6179h = achievement.getName();
        String description = achievement.getDescription();
        this.f6180i = description;
        this.f6181j = achievement.H();
        this.f6182k = achievement.getUnlockedImageUrl();
        this.f6183l = achievement.D2();
        this.f6184m = achievement.getRevealedImageUrl();
        Player playerZzb = achievement.zzb();
        if (playerZzb != null) {
            this.f6187p = new PlayerEntity(playerZzb);
        } else {
            this.f6187p = null;
        }
        this.f6188q = achievement.getState();
        this.f6191t = achievement.d1();
        this.f6192u = achievement.o2();
        this.f6193v = achievement.zzc();
        this.f6194w = achievement.zza();
        if (achievement.getType() == 1) {
            this.f6185n = achievement.n1();
            this.f6186o = achievement.H1();
            this.f6189r = achievement.J2();
            this.f6190s = achievement.W1();
        } else {
            this.f6185n = 0;
            this.f6186o = null;
            this.f6189r = 0;
            this.f6190s = null;
        }
        n9.b.a(strD0);
        n9.b.a(description);
    }

    public static int a(Achievement achievement) {
        int iJ2;
        int iN1;
        if (achievement.getType() == 1) {
            iJ2 = achievement.J2();
            iN1 = achievement.n1();
        } else {
            iJ2 = 0;
            iN1 = 0;
        }
        return k.c(achievement.D0(), achievement.zza(), achievement.getName(), Integer.valueOf(achievement.getType()), achievement.getDescription(), Long.valueOf(achievement.o2()), Integer.valueOf(achievement.getState()), Long.valueOf(achievement.d1()), achievement.zzb(), Integer.valueOf(iJ2), Integer.valueOf(iN1));
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
        return (achievement.getType() != 1 || (achievement2.J2() == achievement.J2() && achievement2.n1() == achievement.n1())) && achievement2.o2() == achievement.o2() && achievement2.getState() == achievement.getState() && achievement2.d1() == achievement.d1() && k.b(achievement2.D0(), achievement.D0()) && k.b(achievement2.zza(), achievement.zza()) && k.b(achievement2.getName(), achievement.getName()) && k.b(achievement2.getDescription(), achievement.getDescription()) && k.b(achievement2.zzb(), achievement.zzb()) && achievement2.zzc() == achievement.zzc();
    }

    public static String w3(Achievement achievement) {
        k.a aVarA = k.d(achievement).a("Id", achievement.D0()).a("Game Id", achievement.zza()).a("Type", Integer.valueOf(achievement.getType())).a("Name", achievement.getName()).a("Description", achievement.getDescription()).a("Player", achievement.zzb()).a("State", Integer.valueOf(achievement.getState())).a("Rarity Percent", Float.valueOf(achievement.zzc()));
        if (achievement.getType() == 1) {
            aVarA.a("CurrentSteps", Integer.valueOf(achievement.J2()));
            aVarA.a("TotalSteps", Integer.valueOf(achievement.n1()));
        }
        return aVarA.toString();
    }

    @Override // com.google.android.gms.games.achievement.Achievement
    @NonNull
    public String D0() {
        return this.f6177f;
    }

    @Override // com.google.android.gms.games.achievement.Achievement
    public Uri D2() {
        return this.f6183l;
    }

    @Override // com.google.android.gms.games.achievement.Achievement
    public Uri H() {
        return this.f6181j;
    }

    @Override // com.google.android.gms.games.achievement.Achievement
    public String H1() {
        n9.b.b(getType() == 1);
        return this.f6186o;
    }

    @Override // com.google.android.gms.games.achievement.Achievement
    public int J2() {
        n9.b.b(getType() == 1);
        return this.f6189r;
    }

    @Override // com.google.android.gms.games.achievement.Achievement
    public String W1() {
        n9.b.b(getType() == 1);
        return this.f6190s;
    }

    @Override // com.google.android.gms.games.achievement.Achievement
    public long d1() {
        return this.f6191t;
    }

    public boolean equals(Object obj) {
        return v3(this, obj);
    }

    @Override // com.google.android.gms.games.achievement.Achievement
    @NonNull
    public String getDescription() {
        return this.f6180i;
    }

    @Override // com.google.android.gms.games.achievement.Achievement
    @NonNull
    public String getName() {
        return this.f6179h;
    }

    @Override // com.google.android.gms.games.achievement.Achievement
    public String getRevealedImageUrl() {
        return this.f6184m;
    }

    @Override // com.google.android.gms.games.achievement.Achievement
    public int getState() {
        return this.f6188q;
    }

    @Override // com.google.android.gms.games.achievement.Achievement
    public int getType() {
        return this.f6178g;
    }

    @Override // com.google.android.gms.games.achievement.Achievement
    public String getUnlockedImageUrl() {
        return this.f6182k;
    }

    public int hashCode() {
        return a(this);
    }

    @Override // com.google.android.gms.games.achievement.Achievement
    public int n1() {
        n9.b.b(getType() == 1);
        return this.f6185n;
    }

    @Override // com.google.android.gms.games.achievement.Achievement
    public long o2() {
        return this.f6192u;
    }

    @NonNull
    public String toString() {
        return w3(this);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i10) {
        int iA = o9.b.a(parcel);
        o9.b.v(parcel, 1, D0(), false);
        o9.b.n(parcel, 2, getType());
        o9.b.v(parcel, 3, getName(), false);
        o9.b.v(parcel, 4, getDescription(), false);
        o9.b.t(parcel, 5, H(), i10, false);
        o9.b.v(parcel, 6, getUnlockedImageUrl(), false);
        o9.b.t(parcel, 7, D2(), i10, false);
        o9.b.v(parcel, 8, getRevealedImageUrl(), false);
        o9.b.n(parcel, 9, this.f6185n);
        o9.b.v(parcel, 10, this.f6186o, false);
        o9.b.t(parcel, 11, this.f6187p, i10, false);
        o9.b.n(parcel, 12, getState());
        o9.b.n(parcel, 13, this.f6189r);
        o9.b.v(parcel, 14, this.f6190s, false);
        o9.b.r(parcel, 15, d1());
        o9.b.r(parcel, 16, o2());
        o9.b.k(parcel, 17, this.f6193v);
        o9.b.v(parcel, 18, this.f6194w, false);
        o9.b.b(parcel, iA);
    }

    @Override // com.google.android.gms.games.achievement.Achievement
    @NonNull
    public final String zza() {
        return this.f6194w;
    }

    @Override // com.google.android.gms.games.achievement.Achievement
    public final Player zzb() {
        return this.f6187p;
    }

    @Override // com.google.android.gms.games.achievement.Achievement
    public final float zzc() {
        return this.f6193v;
    }

    public AchievementEntity(String str, int i10, String str2, String str3, Uri uri, String str4, Uri uri2, String str5, int i11, String str6, PlayerEntity playerEntity, int i12, int i13, String str7, long j10, long j11, float f10, String str8) {
        this.f6177f = str;
        this.f6178g = i10;
        this.f6179h = str2;
        this.f6180i = str3;
        this.f6181j = uri;
        this.f6182k = str4;
        this.f6183l = uri2;
        this.f6184m = str5;
        this.f6185n = i11;
        this.f6186o = str6;
        this.f6187p = playerEntity;
        this.f6188q = i12;
        this.f6189r = i13;
        this.f6190s = str7;
        this.f6191t = j10;
        this.f6192u = j11;
        this.f6193v = f10;
        this.f6194w = str8;
    }
}
