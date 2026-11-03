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
    public final String f6146h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f6147i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Uri f6148j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Uri f6149k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final long f6150l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f6151m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final long f6152n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final String f6153o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final String f6154p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final String f6155q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final MostRecentGameInfoEntity f6156r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final PlayerLevelInfo f6157s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final boolean f6158t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final boolean f6159u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final String f6160v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final String f6161w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final Uri f6162x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final String f6163y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final Uri f6164z;

    public PlayerEntity(@NonNull Player player) {
        String strM3 = player.m3();
        this.f6146h = strM3;
        String strL = player.l();
        this.f6147i = strL;
        this.f6148j = player.h();
        this.f6153o = player.getIconImageUrl();
        this.f6149k = player.A();
        this.f6154p = player.getHiResImageUrl();
        long jZ = player.Z();
        this.f6150l = jZ;
        this.f6151m = player.zze();
        this.f6152n = player.n0();
        this.f6155q = player.getTitle();
        this.f6158t = player.zzf();
        com.google.android.gms.games.internal.player.zza zzaVarZzh = player.zzh();
        this.f6156r = zzaVarZzh == null ? null : new MostRecentGameInfoEntity(zzaVarZzh);
        this.f6157s = player.v0();
        this.f6159u = player.zzd();
        this.f6160v = player.zzb();
        this.f6161w = player.zzc();
        this.f6162x = player.G1();
        this.f6163y = player.getBannerImageLandscapeUrl();
        this.f6164z = player.c0();
        this.A = player.getBannerImagePortraitUrl();
        this.B = player.d();
        PlayerRelationshipInfo playerRelationshipInfoY0 = player.Y0();
        this.C = playerRelationshipInfoY0 == null ? null : new zzo(playerRelationshipInfoY0.freeze());
        CurrentPlayerInfo currentPlayerInfoE2 = player.e2();
        this.D = currentPlayerInfoE2 != null ? (zza) currentPlayerInfoE2.freeze() : null;
        this.E = player.c();
        this.F = player.zza();
        b.a(strM3);
        b.a(strL);
        b.b(jZ > 0);
    }

    public static String A3(Player player) {
        k.a aVarA = k.d(player).a("PlayerId", player.m3()).a("DisplayName", player.l()).a("HasDebugAccess", Boolean.valueOf(player.zzd())).a("IconImageUri", player.h()).a("IconImageUrl", player.getIconImageUrl()).a("HiResImageUri", player.A()).a("HiResImageUrl", player.getHiResImageUrl()).a("RetrievedTimestamp", Long.valueOf(player.Z())).a("Title", player.getTitle()).a("LevelInfo", player.v0()).a("GamerTag", player.zzb()).a("Name", player.zzc()).a("BannerImageLandscapeUri", player.G1()).a("BannerImageLandscapeUrl", player.getBannerImageLandscapeUrl()).a("BannerImagePortraitUri", player.c0()).a("BannerImagePortraitUrl", player.getBannerImagePortraitUrl()).a("CurrentPlayerInfo", player.e2()).a("TotalUnlockedAchievement", Long.valueOf(player.d()));
        if (player.c()) {
            aVarA.a("AlwaysAutoSignIn", Boolean.valueOf(player.c()));
        }
        if (player.Y0() != null) {
            aVarA.a("RelationshipInfo", player.Y0());
        }
        if (player.zza() != null) {
            aVarA.a("GamePlayerId", player.zza());
        }
        return aVarA.toString();
    }

    public static int y3(Player player) {
        return k.c(player.m3(), player.l(), Boolean.valueOf(player.zzd()), player.h(), player.A(), Long.valueOf(player.Z()), player.getTitle(), player.v0(), player.zzb(), player.zzc(), player.G1(), player.c0(), Long.valueOf(player.d()), player.Y0(), player.e2(), Boolean.valueOf(player.c()), player.zza());
    }

    public static boolean z3(Player player, Object obj) {
        if (!(obj instanceof Player)) {
            return false;
        }
        if (player == obj) {
            return true;
        }
        Player player2 = (Player) obj;
        return k.b(player2.m3(), player.m3()) && k.b(player2.l(), player.l()) && k.b(Boolean.valueOf(player2.zzd()), Boolean.valueOf(player.zzd())) && k.b(player2.h(), player.h()) && k.b(player2.A(), player.A()) && k.b(Long.valueOf(player2.Z()), Long.valueOf(player.Z())) && k.b(player2.getTitle(), player.getTitle()) && k.b(player2.v0(), player.v0()) && k.b(player2.zzb(), player.zzb()) && k.b(player2.zzc(), player.zzc()) && k.b(player2.G1(), player.G1()) && k.b(player2.c0(), player.c0()) && k.b(Long.valueOf(player2.d()), Long.valueOf(player.d())) && k.b(player2.e2(), player.e2()) && k.b(player2.Y0(), player.Y0()) && k.b(Boolean.valueOf(player2.c()), Boolean.valueOf(player.c())) && k.b(player2.zza(), player.zza());
    }

    @Override // com.google.android.gms.games.Player
    public Uri A() {
        return this.f6149k;
    }

    @Override // com.google.android.gms.games.Player
    public Uri G1() {
        return this.f6162x;
    }

    @Override // com.google.android.gms.games.Player
    public PlayerRelationshipInfo Y0() {
        return this.C;
    }

    @Override // com.google.android.gms.games.Player
    public long Z() {
        return this.f6150l;
    }

    @Override // com.google.android.gms.games.Player
    public final boolean c() {
        return this.E;
    }

    @Override // com.google.android.gms.games.Player
    public Uri c0() {
        return this.f6164z;
    }

    @Override // com.google.android.gms.games.Player
    public final long d() {
        return this.B;
    }

    @Override // com.google.android.gms.games.Player
    @NonNull
    public CurrentPlayerInfo e2() {
        return this.D;
    }

    public boolean equals(Object obj) {
        return z3(this, obj);
    }

    @Override // com.google.android.gms.games.Player
    public String getBannerImageLandscapeUrl() {
        return this.f6163y;
    }

    @Override // com.google.android.gms.games.Player
    public String getBannerImagePortraitUrl() {
        return this.A;
    }

    @Override // com.google.android.gms.games.Player
    public String getHiResImageUrl() {
        return this.f6154p;
    }

    @Override // com.google.android.gms.games.Player
    public String getIconImageUrl() {
        return this.f6153o;
    }

    @Override // com.google.android.gms.games.Player
    public String getTitle() {
        return this.f6155q;
    }

    @Override // com.google.android.gms.games.Player
    public Uri h() {
        return this.f6148j;
    }

    public int hashCode() {
        return y3(this);
    }

    @Override // com.google.android.gms.games.Player
    @NonNull
    public String l() {
        return this.f6147i;
    }

    @Override // com.google.android.gms.games.Player
    @NonNull
    public String m3() {
        return this.f6146h;
    }

    @Override // com.google.android.gms.games.Player
    public long n0() {
        return this.f6152n;
    }

    @NonNull
    public String toString() {
        return A3(this);
    }

    @Override // com.google.android.gms.games.Player
    public PlayerLevelInfo v0() {
        return this.f6157s;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i10) {
        if (w3()) {
            parcel.writeString(this.f6146h);
            parcel.writeString(this.f6147i);
            Uri uri = this.f6148j;
            parcel.writeString(uri == null ? null : uri.toString());
            Uri uri2 = this.f6149k;
            parcel.writeString(uri2 != null ? uri2.toString() : null);
            parcel.writeLong(this.f6150l);
            return;
        }
        int iA = o9.b.a(parcel);
        o9.b.v(parcel, 1, m3(), false);
        o9.b.v(parcel, 2, l(), false);
        o9.b.t(parcel, 3, h(), i10, false);
        o9.b.t(parcel, 4, A(), i10, false);
        o9.b.r(parcel, 5, Z());
        o9.b.n(parcel, 6, this.f6151m);
        o9.b.r(parcel, 7, n0());
        o9.b.v(parcel, 8, getIconImageUrl(), false);
        o9.b.v(parcel, 9, getHiResImageUrl(), false);
        o9.b.v(parcel, 14, getTitle(), false);
        o9.b.t(parcel, 15, this.f6156r, i10, false);
        o9.b.t(parcel, 16, v0(), i10, false);
        o9.b.c(parcel, 18, this.f6158t);
        o9.b.c(parcel, 19, this.f6159u);
        o9.b.v(parcel, 20, this.f6160v, false);
        o9.b.v(parcel, 21, this.f6161w, false);
        o9.b.t(parcel, 22, G1(), i10, false);
        o9.b.v(parcel, 23, getBannerImageLandscapeUrl(), false);
        o9.b.t(parcel, 24, c0(), i10, false);
        o9.b.v(parcel, 25, getBannerImagePortraitUrl(), false);
        o9.b.r(parcel, 29, this.B);
        o9.b.t(parcel, 33, Y0(), i10, false);
        o9.b.t(parcel, 35, e2(), i10, false);
        o9.b.c(parcel, 36, this.E);
        o9.b.v(parcel, 37, this.F, false);
        o9.b.b(parcel, iA);
    }

    @Override // com.google.android.gms.games.Player
    public final String zza() {
        return this.F;
    }

    @Override // com.google.android.gms.games.Player
    public final String zzb() {
        return this.f6160v;
    }

    @Override // com.google.android.gms.games.Player
    @NonNull
    public final String zzc() {
        return this.f6161w;
    }

    @Override // com.google.android.gms.games.Player
    public final boolean zzd() {
        return this.f6159u;
    }

    @Override // com.google.android.gms.games.Player
    public final int zze() {
        return this.f6151m;
    }

    @Override // com.google.android.gms.games.Player
    public final boolean zzf() {
        return this.f6158t;
    }

    @Override // com.google.android.gms.games.Player
    public final com.google.android.gms.games.internal.player.zza zzh() {
        return this.f6156r;
    }

    public PlayerEntity(String str, String str2, Uri uri, Uri uri2, long j10, int i10, long j11, String str3, String str4, String str5, MostRecentGameInfoEntity mostRecentGameInfoEntity, PlayerLevelInfo playerLevelInfo, boolean z10, boolean z11, String str6, String str7, Uri uri3, String str8, Uri uri4, String str9, long j12, zzo zzoVar, zza zzaVar, boolean z12, String str10) {
        this.f6146h = str;
        this.f6147i = str2;
        this.f6148j = uri;
        this.f6153o = str3;
        this.f6149k = uri2;
        this.f6154p = str4;
        this.f6150l = j10;
        this.f6151m = i10;
        this.f6152n = j11;
        this.f6155q = str5;
        this.f6158t = z10;
        this.f6156r = mostRecentGameInfoEntity;
        this.f6157s = playerLevelInfo;
        this.f6159u = z11;
        this.f6160v = str6;
        this.f6161w = str7;
        this.f6162x = uri3;
        this.f6163y = str8;
        this.f6164z = uri4;
        this.A = str9;
        this.B = j12;
        this.C = zzoVar;
        this.D = zzaVar;
        this.E = z12;
        this.F = str10;
    }
}
