package com.google.android.gms.games.achievement;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.apps.common.proguard.UsedByReflection;
import com.google.android.gms.games.Player;
import com.google.android.gms.games.PlayerEntity;
import com.google.android.gms.games.internal.zzg;
import p099ea.C4893b;
import p305n9.C8920b;
import p305n9.C8947k;
import p325o9.C9718b;

/* JADX INFO: loaded from: classes.dex */
@UsedByReflection("GamesGmsClientImpl.java")
public final class AchievementEntity extends zzg implements Achievement {

    @NonNull
    public static final Parcelable.Creator<AchievementEntity> CREATOR = new C4893b();

    /* JADX INFO: renamed from: f */
    public final String f7820f;

    /* JADX INFO: renamed from: g */
    public final int f7821g;

    /* JADX INFO: renamed from: h */
    public final String f7822h;

    /* JADX INFO: renamed from: i */
    public final String f7823i;

    /* JADX INFO: renamed from: j */
    public final Uri f7824j;

    /* JADX INFO: renamed from: k */
    public final String f7825k;

    /* JADX INFO: renamed from: l */
    public final Uri f7826l;

    /* JADX INFO: renamed from: m */
    public final String f7827m;

    /* JADX INFO: renamed from: n */
    public final int f7828n;

    /* JADX INFO: renamed from: o */
    public final String f7829o;

    /* JADX INFO: renamed from: p */
    public final PlayerEntity f7830p;

    /* JADX INFO: renamed from: q */
    public final int f7831q;

    /* JADX INFO: renamed from: r */
    public final int f7832r;

    /* JADX INFO: renamed from: s */
    public final String f7833s;

    /* JADX INFO: renamed from: t */
    public final long f7834t;

    /* JADX INFO: renamed from: u */
    public final long f7835u;

    /* JADX INFO: renamed from: v */
    public final float f7836v;

    /* JADX INFO: renamed from: w */
    public final String f7837w;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public AchievementEntity(@NonNull Achievement achievement) {
        String strMo9416H0 = achievement.mo9416H0();
        this.f7820f = strMo9416H0;
        this.f7821g = achievement.getType();
        this.f7822h = achievement.getName();
        String description = achievement.getDescription();
        this.f7823i = description;
        this.f7824j = achievement.mo9415H();
        this.f7825k = achievement.getUnlockedImageUrl();
        this.f7826l = achievement.mo9414C2();
        this.f7827m = achievement.getRevealedImageUrl();
        Player playerZzb = achievement.zzb();
        if (playerZzb != null) {
            this.f7830p = new PlayerEntity(playerZzb);
        } else {
            this.f7830p = null;
        }
        this.f7831q = achievement.getState();
        this.f7834t = achievement.mo9420i1();
        this.f7835u = achievement.mo9421n2();
        this.f7836v = achievement.zzc();
        this.f7837w = achievement.zza();
        if (achievement.getType() == 1) {
            this.f7828n = achievement.mo9422q1();
            this.f7829o = achievement.mo9417J1();
            this.f7832r = achievement.mo9418J2();
            this.f7833s = achievement.mo9419W1();
        } else {
            this.f7828n = 0;
            this.f7829o = null;
            this.f7832r = 0;
            this.f7833s = null;
        }
        C8920b.m35955a(strMo9416H0);
        C8920b.m35955a(description);
    }

    /* JADX INFO: renamed from: a */
    public static int m9423a(Achievement achievement) {
        int iMo9418J2;
        int iMo9422q1;
        if (achievement.getType() == 1) {
            iMo9418J2 = achievement.mo9418J2();
            iMo9422q1 = achievement.mo9422q1();
        } else {
            iMo9418J2 = 0;
            iMo9422q1 = 0;
        }
        return C8947k.m36027c(achievement.mo9416H0(), achievement.zza(), achievement.getName(), Integer.valueOf(achievement.getType()), achievement.getDescription(), Long.valueOf(achievement.mo9421n2()), Integer.valueOf(achievement.getState()), Long.valueOf(achievement.mo9420i1()), achievement.zzb(), Integer.valueOf(iMo9418J2), Integer.valueOf(iMo9422q1));
    }

    /* JADX INFO: renamed from: v3 */
    public static boolean m9424v3(Achievement achievement, Object obj) {
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
        return (achievement.getType() != 1 || (achievement2.mo9418J2() == achievement.mo9418J2() && achievement2.mo9422q1() == achievement.mo9422q1())) && achievement2.mo9421n2() == achievement.mo9421n2() && achievement2.getState() == achievement.getState() && achievement2.mo9420i1() == achievement.mo9420i1() && C8947k.m36026b(achievement2.mo9416H0(), achievement.mo9416H0()) && C8947k.m36026b(achievement2.zza(), achievement.zza()) && C8947k.m36026b(achievement2.getName(), achievement.getName()) && C8947k.m36026b(achievement2.getDescription(), achievement.getDescription()) && C8947k.m36026b(achievement2.zzb(), achievement.zzb()) && achievement2.zzc() == achievement.zzc();
    }

    /* JADX INFO: renamed from: w3 */
    public static String m9425w3(Achievement achievement) {
        C8947k.a aVarM36029a = C8947k.m36028d(achievement).m36029a("Id", achievement.mo9416H0()).m36029a("Game Id", achievement.zza()).m36029a("Type", Integer.valueOf(achievement.getType())).m36029a("Name", achievement.getName()).m36029a("Description", achievement.getDescription()).m36029a("Player", achievement.zzb()).m36029a("State", Integer.valueOf(achievement.getState())).m36029a("Rarity Percent", Float.valueOf(achievement.zzc()));
        if (achievement.getType() == 1) {
            aVarM36029a.m36029a("CurrentSteps", Integer.valueOf(achievement.mo9418J2()));
            aVarM36029a.m36029a("TotalSteps", Integer.valueOf(achievement.mo9422q1()));
        }
        return aVarM36029a.toString();
    }

    @Override // com.google.android.gms.games.achievement.Achievement
    /* JADX INFO: renamed from: C2 */
    public Uri mo9414C2() {
        return this.f7826l;
    }

    @Override // com.google.android.gms.games.achievement.Achievement
    /* JADX INFO: renamed from: H */
    public Uri mo9415H() {
        return this.f7824j;
    }

    @Override // com.google.android.gms.games.achievement.Achievement
    @NonNull
    /* JADX INFO: renamed from: H0 */
    public String mo9416H0() {
        return this.f7820f;
    }

    @Override // com.google.android.gms.games.achievement.Achievement
    /* JADX INFO: renamed from: J1 */
    public String mo9417J1() {
        C8920b.m35956b(getType() == 1);
        return this.f7829o;
    }

    @Override // com.google.android.gms.games.achievement.Achievement
    /* JADX INFO: renamed from: J2 */
    public int mo9418J2() {
        C8920b.m35956b(getType() == 1);
        return this.f7832r;
    }

    @Override // com.google.android.gms.games.achievement.Achievement
    /* JADX INFO: renamed from: W1 */
    public String mo9419W1() {
        C8920b.m35956b(getType() == 1);
        return this.f7833s;
    }

    public boolean equals(Object obj) {
        return m9424v3(this, obj);
    }

    @Override // com.google.android.gms.games.achievement.Achievement
    @NonNull
    public String getDescription() {
        return this.f7823i;
    }

    @Override // com.google.android.gms.games.achievement.Achievement
    @NonNull
    public String getName() {
        return this.f7822h;
    }

    @Override // com.google.android.gms.games.achievement.Achievement
    public String getRevealedImageUrl() {
        return this.f7827m;
    }

    @Override // com.google.android.gms.games.achievement.Achievement
    public int getState() {
        return this.f7831q;
    }

    @Override // com.google.android.gms.games.achievement.Achievement
    public int getType() {
        return this.f7821g;
    }

    @Override // com.google.android.gms.games.achievement.Achievement
    public String getUnlockedImageUrl() {
        return this.f7825k;
    }

    public int hashCode() {
        return m9423a(this);
    }

    @Override // com.google.android.gms.games.achievement.Achievement
    /* JADX INFO: renamed from: i1 */
    public long mo9420i1() {
        return this.f7834t;
    }

    @Override // com.google.android.gms.games.achievement.Achievement
    /* JADX INFO: renamed from: n2 */
    public long mo9421n2() {
        return this.f7835u;
    }

    @Override // com.google.android.gms.games.achievement.Achievement
    /* JADX INFO: renamed from: q1 */
    public int mo9422q1() {
        C8920b.m35956b(getType() == 1);
        return this.f7828n;
    }

    @NonNull
    public String toString() {
        return m9425w3(this);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i10) {
        int iM38457a = C9718b.m38457a(parcel);
        C9718b.m38478v(parcel, 1, mo9416H0(), false);
        C9718b.m38470n(parcel, 2, getType());
        C9718b.m38478v(parcel, 3, getName(), false);
        C9718b.m38478v(parcel, 4, getDescription(), false);
        C9718b.m38476t(parcel, 5, mo9415H(), i10, false);
        C9718b.m38478v(parcel, 6, getUnlockedImageUrl(), false);
        C9718b.m38476t(parcel, 7, mo9414C2(), i10, false);
        C9718b.m38478v(parcel, 8, getRevealedImageUrl(), false);
        C9718b.m38470n(parcel, 9, this.f7828n);
        C9718b.m38478v(parcel, 10, this.f7829o, false);
        C9718b.m38476t(parcel, 11, this.f7830p, i10, false);
        C9718b.m38470n(parcel, 12, getState());
        C9718b.m38470n(parcel, 13, this.f7832r);
        C9718b.m38478v(parcel, 14, this.f7833s, false);
        C9718b.m38474r(parcel, 15, mo9420i1());
        C9718b.m38474r(parcel, 16, mo9421n2());
        C9718b.m38467k(parcel, 17, this.f7836v);
        C9718b.m38478v(parcel, 18, this.f7837w, false);
        C9718b.m38458b(parcel, iM38457a);
    }

    @Override // com.google.android.gms.games.achievement.Achievement
    @NonNull
    public final String zza() {
        return this.f7837w;
    }

    @Override // com.google.android.gms.games.achievement.Achievement
    public final Player zzb() {
        return this.f7830p;
    }

    @Override // com.google.android.gms.games.achievement.Achievement
    public final float zzc() {
        return this.f7836v;
    }

    public AchievementEntity(String str, int i10, String str2, String str3, Uri uri, String str4, Uri uri2, String str5, int i11, String str6, PlayerEntity playerEntity, int i12, int i13, String str7, long j10, long j11, float f10, String str8) {
        this.f7820f = str;
        this.f7821g = i10;
        this.f7822h = str2;
        this.f7823i = str3;
        this.f7824j = uri;
        this.f7825k = str4;
        this.f7826l = uri2;
        this.f7827m = str5;
        this.f7828n = i11;
        this.f7829o = str6;
        this.f7830p = playerEntity;
        this.f7831q = i12;
        this.f7832r = i13;
        this.f7833s = str7;
        this.f7834t = j10;
        this.f7835u = j11;
        this.f7836v = f10;
        this.f7837w = str8;
    }
}
