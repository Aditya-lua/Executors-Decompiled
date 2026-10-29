package com.google.android.gms.games;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.apps.common.proguard.UsedByReflection;
import com.google.android.gms.games.internal.GamesDowngradeableSafeParcel;
import com.google.android.gms.games.internal.player.MostRecentGameInfoEntity;
import p073da.C4513q;
import p305n9.C8920b;
import p305n9.C8947k;
import p325o9.C9718b;

/* JADX INFO: loaded from: classes.dex */
@UsedByReflection("GamesGmsClientImpl.java")
public final class PlayerEntity extends GamesDowngradeableSafeParcel implements Player {

    @NonNull
    public static final Parcelable.Creator<PlayerEntity> CREATOR = new C4513q();

    /* JADX INFO: renamed from: A */
    public final String f7783A;

    /* JADX INFO: renamed from: B */
    public final long f7784B;

    /* JADX INFO: renamed from: C */
    public final zzo f7785C;

    /* JADX INFO: renamed from: D */
    public final zza f7786D;

    /* JADX INFO: renamed from: E */
    public final boolean f7787E;

    /* JADX INFO: renamed from: F */
    public final String f7788F;

    /* JADX INFO: renamed from: h */
    public final String f7789h;

    /* JADX INFO: renamed from: i */
    public final String f7790i;

    /* JADX INFO: renamed from: j */
    public final Uri f7791j;

    /* JADX INFO: renamed from: k */
    public final Uri f7792k;

    /* JADX INFO: renamed from: l */
    public final long f7793l;

    /* JADX INFO: renamed from: m */
    public final int f7794m;

    /* JADX INFO: renamed from: n */
    public final long f7795n;

    /* JADX INFO: renamed from: o */
    public final String f7796o;

    /* JADX INFO: renamed from: p */
    public final String f7797p;

    /* JADX INFO: renamed from: q */
    public final String f7798q;

    /* JADX INFO: renamed from: r */
    public final MostRecentGameInfoEntity f7799r;

    /* JADX INFO: renamed from: s */
    public final PlayerLevelInfo f7800s;

    /* JADX INFO: renamed from: t */
    public final boolean f7801t;

    /* JADX INFO: renamed from: u */
    public final boolean f7802u;

    /* JADX INFO: renamed from: v */
    public final String f7803v;

    /* JADX INFO: renamed from: w */
    public final String f7804w;

    /* JADX INFO: renamed from: x */
    public final Uri f7805x;

    /* JADX INFO: renamed from: y */
    public final String f7806y;

    /* JADX INFO: renamed from: z */
    public final Uri f7807z;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public PlayerEntity(@NonNull Player player) {
        String strMo9396k3 = player.mo9396k3();
        this.f7789h = strMo9396k3;
        String strMo9397l = player.mo9397l();
        this.f7790i = strMo9397l;
        this.f7791j = player.mo9395h();
        this.f7796o = player.getIconImageUrl();
        this.f7792k = player.mo9387B();
        this.f7797p = player.getHiResImageUrl();
        long jMo9389a0 = player.mo9389a0();
        this.f7793l = jMo9389a0;
        this.f7794m = player.zze();
        this.f7795n = player.mo9398r0();
        this.f7798q = player.getTitle();
        this.f7801t = player.zzf();
        com.google.android.gms.games.internal.player.zza zzaVarZzh = player.zzh();
        this.f7799r = zzaVarZzh == null ? null : new MostRecentGameInfoEntity(zzaVarZzh);
        this.f7800s = player.mo9399z0();
        this.f7802u = player.zzd();
        this.f7803v = player.zzb();
        this.f7804w = player.zzc();
        this.f7805x = player.mo9388I1();
        this.f7806y = player.getBannerImageLandscapeUrl();
        this.f7807z = player.mo9394e0();
        this.f7783A = player.getBannerImagePortraitUrl();
        this.f7784B = player.mo9391d();
        PlayerRelationshipInfo playerRelationshipInfoMo9392d1 = player.mo9392d1();
        this.f7785C = playerRelationshipInfoMo9392d1 == null ? null : new zzo(playerRelationshipInfoMo9392d1.freeze());
        CurrentPlayerInfo currentPlayerInfoMo9393d2 = player.mo9393d2();
        this.f7786D = currentPlayerInfoMo9393d2 != null ? (zza) currentPlayerInfoMo9393d2.freeze() : null;
        this.f7787E = player.mo9390c();
        this.f7788F = player.zza();
        C8920b.m35955a(strMo9396k3);
        C8920b.m35955a(strMo9397l);
        C8920b.m35956b(jMo9389a0 > 0);
    }

    /* JADX INFO: renamed from: A3 */
    public static String m9400A3(Player player) {
        C8947k.a aVarM36029a = C8947k.m36028d(player).m36029a("PlayerId", player.mo9396k3()).m36029a("DisplayName", player.mo9397l()).m36029a("HasDebugAccess", Boolean.valueOf(player.zzd())).m36029a("IconImageUri", player.mo9395h()).m36029a("IconImageUrl", player.getIconImageUrl()).m36029a("HiResImageUri", player.mo9387B()).m36029a("HiResImageUrl", player.getHiResImageUrl()).m36029a("RetrievedTimestamp", Long.valueOf(player.mo9389a0())).m36029a("Title", player.getTitle()).m36029a("LevelInfo", player.mo9399z0()).m36029a("GamerTag", player.zzb()).m36029a("Name", player.zzc()).m36029a("BannerImageLandscapeUri", player.mo9388I1()).m36029a("BannerImageLandscapeUrl", player.getBannerImageLandscapeUrl()).m36029a("BannerImagePortraitUri", player.mo9394e0()).m36029a("BannerImagePortraitUrl", player.getBannerImagePortraitUrl()).m36029a("CurrentPlayerInfo", player.mo9393d2()).m36029a("TotalUnlockedAchievement", Long.valueOf(player.mo9391d()));
        if (player.mo9390c()) {
            aVarM36029a.m36029a("AlwaysAutoSignIn", Boolean.valueOf(player.mo9390c()));
        }
        if (player.mo9392d1() != null) {
            aVarM36029a.m36029a("RelationshipInfo", player.mo9392d1());
        }
        if (player.zza() != null) {
            aVarM36029a.m36029a("GamePlayerId", player.zza());
        }
        return aVarM36029a.toString();
    }

    /* JADX INFO: renamed from: y3 */
    public static int m9404y3(Player player) {
        return C8947k.m36027c(player.mo9396k3(), player.mo9397l(), Boolean.valueOf(player.zzd()), player.mo9395h(), player.mo9387B(), Long.valueOf(player.mo9389a0()), player.getTitle(), player.mo9399z0(), player.zzb(), player.zzc(), player.mo9388I1(), player.mo9394e0(), Long.valueOf(player.mo9391d()), player.mo9392d1(), player.mo9393d2(), Boolean.valueOf(player.mo9390c()), player.zza());
    }

    /* JADX INFO: renamed from: z3 */
    public static boolean m9405z3(Player player, Object obj) {
        if (!(obj instanceof Player)) {
            return false;
        }
        if (player == obj) {
            return true;
        }
        Player player2 = (Player) obj;
        return C8947k.m36026b(player2.mo9396k3(), player.mo9396k3()) && C8947k.m36026b(player2.mo9397l(), player.mo9397l()) && C8947k.m36026b(Boolean.valueOf(player2.zzd()), Boolean.valueOf(player.zzd())) && C8947k.m36026b(player2.mo9395h(), player.mo9395h()) && C8947k.m36026b(player2.mo9387B(), player.mo9387B()) && C8947k.m36026b(Long.valueOf(player2.mo9389a0()), Long.valueOf(player.mo9389a0())) && C8947k.m36026b(player2.getTitle(), player.getTitle()) && C8947k.m36026b(player2.mo9399z0(), player.mo9399z0()) && C8947k.m36026b(player2.zzb(), player.zzb()) && C8947k.m36026b(player2.zzc(), player.zzc()) && C8947k.m36026b(player2.mo9388I1(), player.mo9388I1()) && C8947k.m36026b(player2.mo9394e0(), player.mo9394e0()) && C8947k.m36026b(Long.valueOf(player2.mo9391d()), Long.valueOf(player.mo9391d())) && C8947k.m36026b(player2.mo9393d2(), player.mo9393d2()) && C8947k.m36026b(player2.mo9392d1(), player.mo9392d1()) && C8947k.m36026b(Boolean.valueOf(player2.mo9390c()), Boolean.valueOf(player.mo9390c())) && C8947k.m36026b(player2.zza(), player.zza());
    }

    @Override // com.google.android.gms.games.Player
    /* JADX INFO: renamed from: B */
    public Uri mo9387B() {
        return this.f7792k;
    }

    @Override // com.google.android.gms.games.Player
    /* JADX INFO: renamed from: I1 */
    public Uri mo9388I1() {
        return this.f7805x;
    }

    @Override // com.google.android.gms.games.Player
    /* JADX INFO: renamed from: a0 */
    public long mo9389a0() {
        return this.f7793l;
    }

    @Override // com.google.android.gms.games.Player
    /* JADX INFO: renamed from: c */
    public final boolean mo9390c() {
        return this.f7787E;
    }

    @Override // com.google.android.gms.games.Player
    /* JADX INFO: renamed from: d */
    public final long mo9391d() {
        return this.f7784B;
    }

    @Override // com.google.android.gms.games.Player
    /* JADX INFO: renamed from: d1 */
    public PlayerRelationshipInfo mo9392d1() {
        return this.f7785C;
    }

    @Override // com.google.android.gms.games.Player
    @NonNull
    /* JADX INFO: renamed from: d2 */
    public CurrentPlayerInfo mo9393d2() {
        return this.f7786D;
    }

    @Override // com.google.android.gms.games.Player
    /* JADX INFO: renamed from: e0 */
    public Uri mo9394e0() {
        return this.f7807z;
    }

    public boolean equals(Object obj) {
        return m9405z3(this, obj);
    }

    @Override // com.google.android.gms.games.Player
    public String getBannerImageLandscapeUrl() {
        return this.f7806y;
    }

    @Override // com.google.android.gms.games.Player
    public String getBannerImagePortraitUrl() {
        return this.f7783A;
    }

    @Override // com.google.android.gms.games.Player
    public String getHiResImageUrl() {
        return this.f7797p;
    }

    @Override // com.google.android.gms.games.Player
    public String getIconImageUrl() {
        return this.f7796o;
    }

    @Override // com.google.android.gms.games.Player
    public String getTitle() {
        return this.f7798q;
    }

    @Override // com.google.android.gms.games.Player
    /* JADX INFO: renamed from: h */
    public Uri mo9395h() {
        return this.f7791j;
    }

    public int hashCode() {
        return m9404y3(this);
    }

    @Override // com.google.android.gms.games.Player
    @NonNull
    /* JADX INFO: renamed from: k3 */
    public String mo9396k3() {
        return this.f7789h;
    }

    @Override // com.google.android.gms.games.Player
    @NonNull
    /* JADX INFO: renamed from: l */
    public String mo9397l() {
        return this.f7790i;
    }

    @Override // com.google.android.gms.games.Player
    /* JADX INFO: renamed from: r0 */
    public long mo9398r0() {
        return this.f7795n;
    }

    @NonNull
    public String toString() {
        return m9400A3(this);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i10) {
        if (m9208w3()) {
            parcel.writeString(this.f7789h);
            parcel.writeString(this.f7790i);
            Uri uri = this.f7791j;
            parcel.writeString(uri == null ? null : uri.toString());
            Uri uri2 = this.f7792k;
            parcel.writeString(uri2 != null ? uri2.toString() : null);
            parcel.writeLong(this.f7793l);
            return;
        }
        int iM38457a = C9718b.m38457a(parcel);
        C9718b.m38478v(parcel, 1, mo9396k3(), false);
        C9718b.m38478v(parcel, 2, mo9397l(), false);
        C9718b.m38476t(parcel, 3, mo9395h(), i10, false);
        C9718b.m38476t(parcel, 4, mo9387B(), i10, false);
        C9718b.m38474r(parcel, 5, mo9389a0());
        C9718b.m38470n(parcel, 6, this.f7794m);
        C9718b.m38474r(parcel, 7, mo9398r0());
        C9718b.m38478v(parcel, 8, getIconImageUrl(), false);
        C9718b.m38478v(parcel, 9, getHiResImageUrl(), false);
        C9718b.m38478v(parcel, 14, getTitle(), false);
        C9718b.m38476t(parcel, 15, this.f7799r, i10, false);
        C9718b.m38476t(parcel, 16, mo9399z0(), i10, false);
        C9718b.m38459c(parcel, 18, this.f7801t);
        C9718b.m38459c(parcel, 19, this.f7802u);
        C9718b.m38478v(parcel, 20, this.f7803v, false);
        C9718b.m38478v(parcel, 21, this.f7804w, false);
        C9718b.m38476t(parcel, 22, mo9388I1(), i10, false);
        C9718b.m38478v(parcel, 23, getBannerImageLandscapeUrl(), false);
        C9718b.m38476t(parcel, 24, mo9394e0(), i10, false);
        C9718b.m38478v(parcel, 25, getBannerImagePortraitUrl(), false);
        C9718b.m38474r(parcel, 29, this.f7784B);
        C9718b.m38476t(parcel, 33, mo9392d1(), i10, false);
        C9718b.m38476t(parcel, 35, mo9393d2(), i10, false);
        C9718b.m38459c(parcel, 36, this.f7787E);
        C9718b.m38478v(parcel, 37, this.f7788F, false);
        C9718b.m38458b(parcel, iM38457a);
    }

    @Override // com.google.android.gms.games.Player
    /* JADX INFO: renamed from: z0 */
    public PlayerLevelInfo mo9399z0() {
        return this.f7800s;
    }

    @Override // com.google.android.gms.games.Player
    public final String zza() {
        return this.f7788F;
    }

    @Override // com.google.android.gms.games.Player
    public final String zzb() {
        return this.f7803v;
    }

    @Override // com.google.android.gms.games.Player
    @NonNull
    public final String zzc() {
        return this.f7804w;
    }

    @Override // com.google.android.gms.games.Player
    public final boolean zzd() {
        return this.f7802u;
    }

    @Override // com.google.android.gms.games.Player
    public final int zze() {
        return this.f7794m;
    }

    @Override // com.google.android.gms.games.Player
    public final boolean zzf() {
        return this.f7801t;
    }

    @Override // com.google.android.gms.games.Player
    public final com.google.android.gms.games.internal.player.zza zzh() {
        return this.f7799r;
    }

    public PlayerEntity(String str, String str2, Uri uri, Uri uri2, long j10, int i10, long j11, String str3, String str4, String str5, MostRecentGameInfoEntity mostRecentGameInfoEntity, PlayerLevelInfo playerLevelInfo, boolean z10, boolean z11, String str6, String str7, Uri uri3, String str8, Uri uri4, String str9, long j12, zzo zzoVar, zza zzaVar, boolean z12, String str10) {
        this.f7789h = str;
        this.f7790i = str2;
        this.f7791j = uri;
        this.f7796o = str3;
        this.f7792k = uri2;
        this.f7797p = str4;
        this.f7793l = j10;
        this.f7794m = i10;
        this.f7795n = j11;
        this.f7798q = str5;
        this.f7801t = z10;
        this.f7799r = mostRecentGameInfoEntity;
        this.f7800s = playerLevelInfo;
        this.f7802u = z11;
        this.f7803v = str6;
        this.f7804w = str7;
        this.f7805x = uri3;
        this.f7806y = str8;
        this.f7807z = uri4;
        this.f7783A = str9;
        this.f7784B = j12;
        this.f7785C = zzoVar;
        this.f7786D = zzaVar;
        this.f7787E = z12;
        this.f7788F = str10;
    }
}
