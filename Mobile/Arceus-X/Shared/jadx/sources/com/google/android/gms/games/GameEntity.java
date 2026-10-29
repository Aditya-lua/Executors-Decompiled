package com.google.android.gms.games;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.apps.common.proguard.UsedByReflection;
import com.google.android.gms.games.internal.GamesDowngradeableSafeParcel;
import p073da.C4507k;
import p305n9.C8947k;
import p325o9.C9718b;

/* JADX INFO: loaded from: classes.dex */
@UsedByReflection("GamesGmsClientImpl.java")
public final class GameEntity extends GamesDowngradeableSafeParcel implements Game {

    @NonNull
    public static final Parcelable.Creator<GameEntity> CREATOR = new C4507k();

    /* JADX INFO: renamed from: A */
    public final String f7757A;

    /* JADX INFO: renamed from: B */
    public final boolean f7758B;

    /* JADX INFO: renamed from: C */
    public final boolean f7759C;

    /* JADX INFO: renamed from: D */
    public final boolean f7760D;

    /* JADX INFO: renamed from: E */
    public final String f7761E;

    /* JADX INFO: renamed from: F */
    public final boolean f7762F;

    /* JADX INFO: renamed from: G */
    public final boolean f7763G;

    /* JADX INFO: renamed from: h */
    public final String f7764h;

    /* JADX INFO: renamed from: i */
    public final String f7765i;

    /* JADX INFO: renamed from: j */
    public final String f7766j;

    /* JADX INFO: renamed from: k */
    public final String f7767k;

    /* JADX INFO: renamed from: l */
    public final String f7768l;

    /* JADX INFO: renamed from: m */
    public final String f7769m;

    /* JADX INFO: renamed from: n */
    public final Uri f7770n;

    /* JADX INFO: renamed from: o */
    public final Uri f7771o;

    /* JADX INFO: renamed from: p */
    public final Uri f7772p;

    /* JADX INFO: renamed from: q */
    public final boolean f7773q;

    /* JADX INFO: renamed from: r */
    public final boolean f7774r;

    /* JADX INFO: renamed from: s */
    public final String f7775s;

    /* JADX INFO: renamed from: t */
    public final int f7776t;

    /* JADX INFO: renamed from: u */
    public final int f7777u;

    /* JADX INFO: renamed from: v */
    public final int f7778v;

    /* JADX INFO: renamed from: w */
    public final boolean f7779w;

    /* JADX INFO: renamed from: x */
    public final boolean f7780x;

    /* JADX INFO: renamed from: y */
    public final String f7781y;

    /* JADX INFO: renamed from: z */
    public final String f7782z;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public GameEntity(@NonNull Game game) {
        this.f7764h = game.mo9373Q1();
        this.f7766j = game.mo9374Z();
        this.f7767k = game.mo9372Q0();
        this.f7768l = game.getDescription();
        this.f7769m = game.mo9378i0();
        this.f7765i = game.mo9379l();
        this.f7770n = game.mo9377h();
        this.f7781y = game.getIconImageUrl();
        this.f7771o = game.mo9367B();
        this.f7782z = game.getHiResImageUrl();
        this.f7772p = game.mo9369D1();
        this.f7757A = game.getFeaturedImageUrl();
        this.f7773q = game.zza();
        this.f7774r = game.zze();
        this.f7775s = game.zzf();
        this.f7776t = 1;
        this.f7777u = game.mo9371P0();
        this.f7778v = game.mo9376e2();
        this.f7779w = game.mo9375c();
        this.f7780x = game.zzh();
        this.f7758B = game.zzb();
        this.f7759C = game.zzc();
        this.f7760D = game.mo9370F0();
        this.f7761E = game.mo9368D0();
        this.f7762F = game.mo9380u1();
        this.f7763G = game.zzd();
    }

    /* JADX INFO: renamed from: A3 */
    public static String m9381A3(Game game) {
        return C8947k.m36028d(game).m36029a("ApplicationId", game.mo9373Q1()).m36029a("DisplayName", game.mo9379l()).m36029a("PrimaryCategory", game.mo9374Z()).m36029a("SecondaryCategory", game.mo9372Q0()).m36029a("Description", game.getDescription()).m36029a("DeveloperName", game.mo9378i0()).m36029a("IconImageUri", game.mo9377h()).m36029a("IconImageUrl", game.getIconImageUrl()).m36029a("HiResImageUri", game.mo9367B()).m36029a("HiResImageUrl", game.getHiResImageUrl()).m36029a("FeaturedImageUri", game.mo9369D1()).m36029a("FeaturedImageUrl", game.getFeaturedImageUrl()).m36029a("PlayEnabledGame", Boolean.valueOf(game.zza())).m36029a("InstanceInstalled", Boolean.valueOf(game.zze())).m36029a("InstancePackageName", game.zzf()).m36029a("AchievementTotalCount", Integer.valueOf(game.mo9371P0())).m36029a("LeaderboardCount", Integer.valueOf(game.mo9376e2())).m36029a("AreSnapshotsEnabled", Boolean.valueOf(game.mo9370F0())).m36029a("ThemeColor", game.mo9368D0()).m36029a("HasGamepadSupport", Boolean.valueOf(game.mo9380u1())).toString();
    }

    /* JADX INFO: renamed from: y3 */
    public static int m9385y3(Game game) {
        return C8947k.m36027c(game.mo9373Q1(), game.mo9379l(), game.mo9374Z(), game.mo9372Q0(), game.getDescription(), game.mo9378i0(), game.mo9377h(), game.mo9367B(), game.mo9369D1(), Boolean.valueOf(game.zza()), Boolean.valueOf(game.zze()), game.zzf(), Integer.valueOf(game.mo9371P0()), Integer.valueOf(game.mo9376e2()), Boolean.valueOf(game.mo9375c()), Boolean.valueOf(game.zzh()), Boolean.valueOf(game.zzb()), Boolean.valueOf(game.zzc()), Boolean.valueOf(game.mo9370F0()), game.mo9368D0(), Boolean.valueOf(game.mo9380u1()), Boolean.valueOf(game.zzd()));
    }

    /* JADX INFO: renamed from: z3 */
    public static boolean m9386z3(Game game, Object obj) {
        if (!(obj instanceof Game)) {
            return false;
        }
        if (game == obj) {
            return true;
        }
        Game game2 = (Game) obj;
        return C8947k.m36026b(game2.mo9373Q1(), game.mo9373Q1()) && C8947k.m36026b(game2.mo9379l(), game.mo9379l()) && C8947k.m36026b(game2.mo9374Z(), game.mo9374Z()) && C8947k.m36026b(game2.mo9372Q0(), game.mo9372Q0()) && C8947k.m36026b(game2.getDescription(), game.getDescription()) && C8947k.m36026b(game2.mo9378i0(), game.mo9378i0()) && C8947k.m36026b(game2.mo9377h(), game.mo9377h()) && C8947k.m36026b(game2.mo9367B(), game.mo9367B()) && C8947k.m36026b(game2.mo9369D1(), game.mo9369D1()) && C8947k.m36026b(Boolean.valueOf(game2.zza()), Boolean.valueOf(game.zza())) && C8947k.m36026b(Boolean.valueOf(game2.zze()), Boolean.valueOf(game.zze())) && C8947k.m36026b(game2.zzf(), game.zzf()) && C8947k.m36026b(Integer.valueOf(game2.mo9371P0()), Integer.valueOf(game.mo9371P0())) && C8947k.m36026b(Integer.valueOf(game2.mo9376e2()), Integer.valueOf(game.mo9376e2())) && C8947k.m36026b(Boolean.valueOf(game2.mo9375c()), Boolean.valueOf(game.mo9375c())) && C8947k.m36026b(Boolean.valueOf(game2.zzh()), Boolean.valueOf(game.zzh())) && C8947k.m36026b(Boolean.valueOf(game2.zzb()), Boolean.valueOf(game.zzb())) && C8947k.m36026b(Boolean.valueOf(game2.zzc()), Boolean.valueOf(game.zzc())) && C8947k.m36026b(Boolean.valueOf(game2.mo9370F0()), Boolean.valueOf(game.mo9370F0())) && C8947k.m36026b(game2.mo9368D0(), game.mo9368D0()) && C8947k.m36026b(Boolean.valueOf(game2.mo9380u1()), Boolean.valueOf(game.mo9380u1())) && C8947k.m36026b(Boolean.valueOf(game2.zzd()), Boolean.valueOf(game.zzd()));
    }

    @Override // com.google.android.gms.games.Game
    @NonNull
    /* JADX INFO: renamed from: B */
    public Uri mo9367B() {
        return this.f7771o;
    }

    @Override // com.google.android.gms.games.Game
    @NonNull
    /* JADX INFO: renamed from: D0 */
    public String mo9368D0() {
        return this.f7761E;
    }

    @Override // com.google.android.gms.games.Game
    @NonNull
    /* JADX INFO: renamed from: D1 */
    public Uri mo9369D1() {
        return this.f7772p;
    }

    @Override // com.google.android.gms.games.Game
    /* JADX INFO: renamed from: F0 */
    public boolean mo9370F0() {
        return this.f7760D;
    }

    @Override // com.google.android.gms.games.Game
    /* JADX INFO: renamed from: P0 */
    public int mo9371P0() {
        return this.f7777u;
    }

    @Override // com.google.android.gms.games.Game
    @NonNull
    /* JADX INFO: renamed from: Q0 */
    public String mo9372Q0() {
        return this.f7767k;
    }

    @Override // com.google.android.gms.games.Game
    @NonNull
    /* JADX INFO: renamed from: Q1 */
    public String mo9373Q1() {
        return this.f7764h;
    }

    @Override // com.google.android.gms.games.Game
    @NonNull
    /* JADX INFO: renamed from: Z */
    public String mo9374Z() {
        return this.f7766j;
    }

    @Override // com.google.android.gms.games.Game
    /* JADX INFO: renamed from: c */
    public final boolean mo9375c() {
        return this.f7779w;
    }

    @Override // com.google.android.gms.games.Game
    /* JADX INFO: renamed from: e2 */
    public int mo9376e2() {
        return this.f7778v;
    }

    public boolean equals(Object obj) {
        return m9386z3(this, obj);
    }

    @Override // com.google.android.gms.games.Game
    @NonNull
    public String getDescription() {
        return this.f7768l;
    }

    @Override // com.google.android.gms.games.Game
    @NonNull
    public String getFeaturedImageUrl() {
        return this.f7757A;
    }

    @Override // com.google.android.gms.games.Game
    @NonNull
    public String getHiResImageUrl() {
        return this.f7782z;
    }

    @Override // com.google.android.gms.games.Game
    @NonNull
    public String getIconImageUrl() {
        return this.f7781y;
    }

    @Override // com.google.android.gms.games.Game
    @NonNull
    /* JADX INFO: renamed from: h */
    public Uri mo9377h() {
        return this.f7770n;
    }

    public int hashCode() {
        return m9385y3(this);
    }

    @Override // com.google.android.gms.games.Game
    @NonNull
    /* JADX INFO: renamed from: i0 */
    public String mo9378i0() {
        return this.f7769m;
    }

    @Override // com.google.android.gms.games.Game
    @NonNull
    /* JADX INFO: renamed from: l */
    public String mo9379l() {
        return this.f7765i;
    }

    @NonNull
    public String toString() {
        return m9381A3(this);
    }

    @Override // com.google.android.gms.games.Game
    /* JADX INFO: renamed from: u1 */
    public boolean mo9380u1() {
        return this.f7762F;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i10) {
        if (m9208w3()) {
            parcel.writeString(this.f7764h);
            parcel.writeString(this.f7765i);
            parcel.writeString(this.f7766j);
            parcel.writeString(this.f7767k);
            parcel.writeString(this.f7768l);
            parcel.writeString(this.f7769m);
            Uri uri = this.f7770n;
            parcel.writeString(uri == null ? null : uri.toString());
            Uri uri2 = this.f7771o;
            parcel.writeString(uri2 == null ? null : uri2.toString());
            Uri uri3 = this.f7772p;
            parcel.writeString(uri3 != null ? uri3.toString() : null);
            parcel.writeInt(this.f7773q ? 1 : 0);
            parcel.writeInt(this.f7774r ? 1 : 0);
            parcel.writeString(this.f7775s);
            parcel.writeInt(this.f7776t);
            parcel.writeInt(this.f7777u);
            parcel.writeInt(this.f7778v);
            return;
        }
        int iM38457a = C9718b.m38457a(parcel);
        C9718b.m38478v(parcel, 1, mo9373Q1(), false);
        C9718b.m38478v(parcel, 2, mo9379l(), false);
        C9718b.m38478v(parcel, 3, mo9374Z(), false);
        C9718b.m38478v(parcel, 4, mo9372Q0(), false);
        C9718b.m38478v(parcel, 5, getDescription(), false);
        C9718b.m38478v(parcel, 6, mo9378i0(), false);
        C9718b.m38476t(parcel, 7, mo9377h(), i10, false);
        C9718b.m38476t(parcel, 8, mo9367B(), i10, false);
        C9718b.m38476t(parcel, 9, mo9369D1(), i10, false);
        C9718b.m38459c(parcel, 10, this.f7773q);
        C9718b.m38459c(parcel, 11, this.f7774r);
        C9718b.m38478v(parcel, 12, this.f7775s, false);
        C9718b.m38470n(parcel, 13, this.f7776t);
        C9718b.m38470n(parcel, 14, mo9371P0());
        C9718b.m38470n(parcel, 15, mo9376e2());
        C9718b.m38459c(parcel, 16, this.f7779w);
        C9718b.m38459c(parcel, 17, this.f7780x);
        C9718b.m38478v(parcel, 18, getIconImageUrl(), false);
        C9718b.m38478v(parcel, 19, getHiResImageUrl(), false);
        C9718b.m38478v(parcel, 20, getFeaturedImageUrl(), false);
        C9718b.m38459c(parcel, 21, this.f7758B);
        C9718b.m38459c(parcel, 22, this.f7759C);
        C9718b.m38459c(parcel, 23, mo9370F0());
        C9718b.m38478v(parcel, 24, mo9368D0(), false);
        C9718b.m38459c(parcel, 25, mo9380u1());
        C9718b.m38459c(parcel, 28, this.f7763G);
        C9718b.m38458b(parcel, iM38457a);
    }

    @Override // com.google.android.gms.games.Game
    public final boolean zza() {
        return this.f7773q;
    }

    @Override // com.google.android.gms.games.Game
    public final boolean zzb() {
        return this.f7758B;
    }

    @Override // com.google.android.gms.games.Game
    public final boolean zzc() {
        return this.f7759C;
    }

    @Override // com.google.android.gms.games.Game
    public final boolean zzd() {
        return this.f7763G;
    }

    @Override // com.google.android.gms.games.Game
    public final boolean zze() {
        return this.f7774r;
    }

    @Override // com.google.android.gms.games.Game
    @NonNull
    public final String zzf() {
        return this.f7775s;
    }

    @Override // com.google.android.gms.games.Game
    public final boolean zzh() {
        return this.f7780x;
    }

    public GameEntity(String str, String str2, String str3, String str4, String str5, String str6, Uri uri, Uri uri2, Uri uri3, boolean z10, boolean z11, String str7, int i10, int i11, int i12, boolean z12, boolean z13, String str8, String str9, String str10, boolean z14, boolean z15, boolean z16, String str11, boolean z17, boolean z18) {
        this.f7764h = str;
        this.f7765i = str2;
        this.f7766j = str3;
        this.f7767k = str4;
        this.f7768l = str5;
        this.f7769m = str6;
        this.f7770n = uri;
        this.f7781y = str8;
        this.f7771o = uri2;
        this.f7782z = str9;
        this.f7772p = uri3;
        this.f7757A = str10;
        this.f7773q = z10;
        this.f7774r = z11;
        this.f7775s = str7;
        this.f7776t = i10;
        this.f7777u = i11;
        this.f7778v = i12;
        this.f7779w = z12;
        this.f7780x = z13;
        this.f7758B = z14;
        this.f7759C = z15;
        this.f7760D = z16;
        this.f7761E = str11;
        this.f7762F = z17;
        this.f7763G = z18;
    }
}
