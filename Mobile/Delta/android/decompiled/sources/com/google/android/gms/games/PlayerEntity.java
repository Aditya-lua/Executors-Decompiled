package com.google.android.gms.games;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.apps.common.proguard.UsedByReflection;
import com.google.android.gms.games.internal.GamesDowngradeableSafeParcel;
import com.google.android.gms.games.internal.player.MostRecentGameInfoEntity;
import da.q;
import n9.b;
import n9.k;

/* JADX INFO: loaded from: classes.dex */
@UsedByReflection("GamesGmsClientImpl.java")
public final class PlayerEntity extends GamesDowngradeableSafeParcel implements Player {

    @NonNull
    public static final Parcelable.Creator<PlayerEntity> CREATOR = new q();
    public final String A;
    public final long B;
    public final zzo C;
    public final zza D;
    public final boolean E;
    public final String F;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f6073h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f6074i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Uri f6075j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Uri f6076k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final long f6077l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f6078m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final long f6079n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final String f6080o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final String f6081p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final String f6082q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final MostRecentGameInfoEntity f6083r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final PlayerLevelInfo f6084s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final boolean f6085t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final boolean f6086u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final String f6087v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final String f6088w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final Uri f6089x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final String f6090y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final Uri f6091z;

    public PlayerEntity(@NonNull Player player) {
        String strK3 = player.k3();
        this.f6073h = strK3;
        String strL = player.l();
        this.f6074i = strL;
        this.f6075j = player.h();
        this.f6080o = player.getIconImageUrl();
        this.f6076k = player.B();
        this.f6081p = player.getHiResImageUrl();
        long jA0 = player.a0();
        this.f6077l = jA0;
        this.f6078m = player.zze();
        this.f6079n = player.r0();
        this.f6082q = player.getTitle();
        this.f6085t = player.zzf();
        com.google.android.gms.games.internal.player.zza zzaVarZzh = player.zzh();
        this.f6083r = zzaVarZzh == null ? null : new MostRecentGameInfoEntity(zzaVarZzh);
        this.f6084s = player.z0();
        this.f6086u = player.zzd();
        this.f6087v = player.zzb();
        this.f6088w = player.zzc();
        this.f6089x = player.I1();
        this.f6090y = player.getBannerImageLandscapeUrl();
        this.f6091z = player.e0();
        this.A = player.getBannerImagePortraitUrl();
        this.B = player.d();
        PlayerRelationshipInfo playerRelationshipInfoC1 = player.c1();
        this.C = playerRelationshipInfoC1 == null ? null : new zzo(playerRelationshipInfoC1.freeze());
        CurrentPlayerInfo currentPlayerInfoD2 = player.d2();
        this.D = currentPlayerInfoD2 != null ? (zza) currentPlayerInfoD2.freeze() : null;
        this.E = player.c();
        this.F = player.zza();
        b.a(strK3);
        b.a(strL);
        b.b(jA0 > 0);
    }

    public static String A3(Player player) {
        k.a aVarA = k.d(player).a("PlayerId", player.k3()).a("DisplayName", player.l()).a("HasDebugAccess", Boolean.valueOf(player.zzd())).a("IconImageUri", player.h()).a("IconImageUrl", player.getIconImageUrl()).a("HiResImageUri", player.B()).a("HiResImageUrl", player.getHiResImageUrl()).a("RetrievedTimestamp", Long.valueOf(player.a0())).a("Title", player.getTitle()).a("LevelInfo", player.z0()).a("GamerTag", player.zzb()).a("Name", player.zzc()).a("BannerImageLandscapeUri", player.I1()).a("BannerImageLandscapeUrl", player.getBannerImageLandscapeUrl()).a("BannerImagePortraitUri", player.e0()).a("BannerImagePortraitUrl", player.getBannerImagePortraitUrl()).a("CurrentPlayerInfo", player.d2()).a("TotalUnlockedAchievement", Long.valueOf(player.d()));
        if (player.c()) {
            aVarA.a("AlwaysAutoSignIn", Boolean.valueOf(player.c()));
        }
        if (player.c1() != null) {
            aVarA.a("RelationshipInfo", player.c1());
        }
        if (player.zza() != null) {
            aVarA.a("GamePlayerId", player.zza());
        }
        return aVarA.toString();
    }

    public static int y3(Player player) {
        return k.c(player.k3(), player.l(), Boolean.valueOf(player.zzd()), player.h(), player.B(), Long.valueOf(player.a0()), player.getTitle(), player.z0(), player.zzb(), player.zzc(), player.I1(), player.e0(), Long.valueOf(player.d()), player.c1(), player.d2(), Boolean.valueOf(player.c()), player.zza());
    }

    public static boolean z3(Player player, Object obj) {
        if (!(obj instanceof Player)) {
            return false;
        }
        if (player == obj) {
            return true;
        }
        Player player2 = (Player) obj;
        return k.b(player2.k3(), player.k3()) && k.b(player2.l(), player.l()) && k.b(Boolean.valueOf(player2.zzd()), Boolean.valueOf(player.zzd())) && k.b(player2.h(), player.h()) && k.b(player2.B(), player.B()) && k.b(Long.valueOf(player2.a0()), Long.valueOf(player.a0())) && k.b(player2.getTitle(), player.getTitle()) && k.b(player2.z0(), player.z0()) && k.b(player2.zzb(), player.zzb()) && k.b(player2.zzc(), player.zzc()) && k.b(player2.I1(), player.I1()) && k.b(player2.e0(), player.e0()) && k.b(Long.valueOf(player2.d()), Long.valueOf(player.d())) && k.b(player2.d2(), player.d2()) && k.b(player2.c1(), player.c1()) && k.b(Boolean.valueOf(player2.c()), Boolean.valueOf(player.c())) && k.b(player2.zza(), player.zza());
    }

    @Override // com.google.android.gms.games.Player
    public Uri B() {
        return this.f6076k;
    }

    @Override // com.google.android.gms.games.Player
    public Uri I1() {
        return this.f6089x;
    }

    @Override // com.google.android.gms.games.Player
    public long a0() {
        return this.f6077l;
    }

    @Override // com.google.android.gms.games.Player
    public final boolean c() {
        return this.E;
    }

    @Override // com.google.android.gms.games.Player
    public PlayerRelationshipInfo c1() {
        return this.C;
    }

    @Override // com.google.android.gms.games.Player
    public final long d() {
        return this.B;
    }

    @Override // com.google.android.gms.games.Player
    @NonNull
    public CurrentPlayerInfo d2() {
        return this.D;
    }

    @Override // com.google.android.gms.games.Player
    public Uri e0() {
        return this.f6091z;
    }

    public boolean equals(Object obj) {
        return z3(this, obj);
    }

    @Override // com.google.android.gms.games.Player
    public String getBannerImageLandscapeUrl() {
        return this.f6090y;
    }

    @Override // com.google.android.gms.games.Player
    public String getBannerImagePortraitUrl() {
        return this.A;
    }

    @Override // com.google.android.gms.games.Player
    public String getHiResImageUrl() {
        return this.f6081p;
    }

    @Override // com.google.android.gms.games.Player
    public String getIconImageUrl() {
        return this.f6080o;
    }

    @Override // com.google.android.gms.games.Player
    public String getTitle() {
        return this.f6082q;
    }

    @Override // com.google.android.gms.games.Player
    public Uri h() {
        return this.f6075j;
    }

    public int hashCode() {
        return y3(this);
    }

    @Override // com.google.android.gms.games.Player
    @NonNull
    public String k3() {
        return this.f6073h;
    }

    @Override // com.google.android.gms.games.Player
    @NonNull
    public String l() {
        return this.f6074i;
    }

    @Override // com.google.android.gms.games.Player
    public long r0() {
        return this.f6079n;
    }

    @NonNull
    public String toString() {
        return A3(this);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i10) {
        if (w3()) {
            parcel.writeString(this.f6073h);
            parcel.writeString(this.f6074i);
            Uri uri = this.f6075j;
            parcel.writeString(uri == null ? null : uri.toString());
            Uri uri2 = this.f6076k;
            parcel.writeString(uri2 != null ? uri2.toString() : null);
            parcel.writeLong(this.f6077l);
            return;
        }
        int iA = o9.b.a(parcel);
        o9.b.v(parcel, 1, k3(), false);
        o9.b.v(parcel, 2, l(), false);
        o9.b.t(parcel, 3, h(), i10, false);
        o9.b.t(parcel, 4, B(), i10, false);
        o9.b.r(parcel, 5, a0());
        o9.b.n(parcel, 6, this.f6078m);
        o9.b.r(parcel, 7, r0());
        o9.b.v(parcel, 8, getIconImageUrl(), false);
        o9.b.v(parcel, 9, getHiResImageUrl(), false);
        o9.b.v(parcel, 14, getTitle(), false);
        o9.b.t(parcel, 15, this.f6083r, i10, false);
        o9.b.t(parcel, 16, z0(), i10, false);
        o9.b.c(parcel, 18, this.f6085t);
        o9.b.c(parcel, 19, this.f6086u);
        o9.b.v(parcel, 20, this.f6087v, false);
        o9.b.v(parcel, 21, this.f6088w, false);
        o9.b.t(parcel, 22, I1(), i10, false);
        o9.b.v(parcel, 23, getBannerImageLandscapeUrl(), false);
        o9.b.t(parcel, 24, e0(), i10, false);
        o9.b.v(parcel, 25, getBannerImagePortraitUrl(), false);
        o9.b.r(parcel, 29, this.B);
        o9.b.t(parcel, 33, c1(), i10, false);
        o9.b.t(parcel, 35, d2(), i10, false);
        o9.b.c(parcel, 36, this.E);
        o9.b.v(parcel, 37, this.F, false);
        o9.b.b(parcel, iA);
    }

    @Override // com.google.android.gms.games.Player
    public PlayerLevelInfo z0() {
        return this.f6084s;
    }

    @Override // com.google.android.gms.games.Player
    public final String zza() {
        return this.F;
    }

    @Override // com.google.android.gms.games.Player
    public final String zzb() {
        return this.f6087v;
    }

    @Override // com.google.android.gms.games.Player
    @NonNull
    public final String zzc() {
        return this.f6088w;
    }

    @Override // com.google.android.gms.games.Player
    public final boolean zzd() {
        return this.f6086u;
    }

    @Override // com.google.android.gms.games.Player
    public final int zze() {
        return this.f6078m;
    }

    @Override // com.google.android.gms.games.Player
    public final boolean zzf() {
        return this.f6085t;
    }

    @Override // com.google.android.gms.games.Player
    public final com.google.android.gms.games.internal.player.zza zzh() {
        return this.f6083r;
    }

    public PlayerEntity(String str, String str2, Uri uri, Uri uri2, long j10, int i10, long j11, String str3, String str4, String str5, MostRecentGameInfoEntity mostRecentGameInfoEntity, PlayerLevelInfo playerLevelInfo, boolean z10, boolean z11, String str6, String str7, Uri uri3, String str8, Uri uri4, String str9, long j12, zzo zzoVar, zza zzaVar, boolean z12, String str10) {
        this.f6073h = str;
        this.f6074i = str2;
        this.f6075j = uri;
        this.f6080o = str3;
        this.f6076k = uri2;
        this.f6081p = str4;
        this.f6077l = j10;
        this.f6078m = i10;
        this.f6079n = j11;
        this.f6082q = str5;
        this.f6085t = z10;
        this.f6083r = mostRecentGameInfoEntity;
        this.f6084s = playerLevelInfo;
        this.f6086u = z11;
        this.f6087v = str6;
        this.f6088w = str7;
        this.f6089x = uri3;
        this.f6090y = str8;
        this.f6091z = uri4;
        this.A = str9;
        this.B = j12;
        this.C = zzoVar;
        this.D = zzaVar;
        this.E = z12;
        this.F = str10;
    }
}
