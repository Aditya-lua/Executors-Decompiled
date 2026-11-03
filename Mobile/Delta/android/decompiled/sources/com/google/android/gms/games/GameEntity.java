package com.google.android.gms.games;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.apps.common.proguard.UsedByReflection;
import com.google.android.gms.games.internal.GamesDowngradeableSafeParcel;
import da.k;
import o9.b;

/* JADX INFO: loaded from: classes.dex */
@UsedByReflection("GamesGmsClientImpl.java")
public final class GameEntity extends GamesDowngradeableSafeParcel implements Game {

    @NonNull
    public static final Parcelable.Creator<GameEntity> CREATOR = new k();
    public final String A;
    public final boolean B;
    public final boolean C;
    public final boolean D;
    public final String E;
    public final boolean F;
    public final boolean G;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f6127h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f6128i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f6129j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final String f6130k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final String f6131l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final String f6132m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Uri f6133n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Uri f6134o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Uri f6135p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final boolean f6136q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final boolean f6137r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final String f6138s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final int f6139t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final int f6140u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final int f6141v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final boolean f6142w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final boolean f6143x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final String f6144y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final String f6145z;

    public GameEntity(@NonNull Game game) {
        this.f6127h = game.P1();
        this.f6129j = game.Y();
        this.f6130k = game.M0();
        this.f6131l = game.getDescription();
        this.f6132m = game.f0();
        this.f6128i = game.l();
        this.f6133n = game.h();
        this.f6144y = game.getIconImageUrl();
        this.f6134o = game.A();
        this.f6145z = game.getHiResImageUrl();
        this.f6135p = game.B1();
        this.A = game.getFeaturedImageUrl();
        this.f6136q = game.zza();
        this.f6137r = game.zze();
        this.f6138s = game.zzf();
        this.f6139t = 1;
        this.f6140u = game.L0();
        this.f6141v = game.f2();
        this.f6142w = game.c();
        this.f6143x = game.zzh();
        this.B = game.zzb();
        this.C = game.zzc();
        this.D = game.B0();
        this.E = game.z0();
        this.F = game.r1();
        this.G = game.zzd();
    }

    public static String A3(Game game) {
        return n9.k.d(game).a("ApplicationId", game.P1()).a("DisplayName", game.l()).a("PrimaryCategory", game.Y()).a("SecondaryCategory", game.M0()).a("Description", game.getDescription()).a("DeveloperName", game.f0()).a("IconImageUri", game.h()).a("IconImageUrl", game.getIconImageUrl()).a("HiResImageUri", game.A()).a("HiResImageUrl", game.getHiResImageUrl()).a("FeaturedImageUri", game.B1()).a("FeaturedImageUrl", game.getFeaturedImageUrl()).a("PlayEnabledGame", Boolean.valueOf(game.zza())).a("InstanceInstalled", Boolean.valueOf(game.zze())).a("InstancePackageName", game.zzf()).a("AchievementTotalCount", Integer.valueOf(game.L0())).a("LeaderboardCount", Integer.valueOf(game.f2())).a("AreSnapshotsEnabled", Boolean.valueOf(game.B0())).a("ThemeColor", game.z0()).a("HasGamepadSupport", Boolean.valueOf(game.r1())).toString();
    }

    public static int y3(Game game) {
        return n9.k.c(game.P1(), game.l(), game.Y(), game.M0(), game.getDescription(), game.f0(), game.h(), game.A(), game.B1(), Boolean.valueOf(game.zza()), Boolean.valueOf(game.zze()), game.zzf(), Integer.valueOf(game.L0()), Integer.valueOf(game.f2()), Boolean.valueOf(game.c()), Boolean.valueOf(game.zzh()), Boolean.valueOf(game.zzb()), Boolean.valueOf(game.zzc()), Boolean.valueOf(game.B0()), game.z0(), Boolean.valueOf(game.r1()), Boolean.valueOf(game.zzd()));
    }

    public static boolean z3(Game game, Object obj) {
        if (!(obj instanceof Game)) {
            return false;
        }
        if (game == obj) {
            return true;
        }
        Game game2 = (Game) obj;
        return n9.k.b(game2.P1(), game.P1()) && n9.k.b(game2.l(), game.l()) && n9.k.b(game2.Y(), game.Y()) && n9.k.b(game2.M0(), game.M0()) && n9.k.b(game2.getDescription(), game.getDescription()) && n9.k.b(game2.f0(), game.f0()) && n9.k.b(game2.h(), game.h()) && n9.k.b(game2.A(), game.A()) && n9.k.b(game2.B1(), game.B1()) && n9.k.b(Boolean.valueOf(game2.zza()), Boolean.valueOf(game.zza())) && n9.k.b(Boolean.valueOf(game2.zze()), Boolean.valueOf(game.zze())) && n9.k.b(game2.zzf(), game.zzf()) && n9.k.b(Integer.valueOf(game2.L0()), Integer.valueOf(game.L0())) && n9.k.b(Integer.valueOf(game2.f2()), Integer.valueOf(game.f2())) && n9.k.b(Boolean.valueOf(game2.c()), Boolean.valueOf(game.c())) && n9.k.b(Boolean.valueOf(game2.zzh()), Boolean.valueOf(game.zzh())) && n9.k.b(Boolean.valueOf(game2.zzb()), Boolean.valueOf(game.zzb())) && n9.k.b(Boolean.valueOf(game2.zzc()), Boolean.valueOf(game.zzc())) && n9.k.b(Boolean.valueOf(game2.B0()), Boolean.valueOf(game.B0())) && n9.k.b(game2.z0(), game.z0()) && n9.k.b(Boolean.valueOf(game2.r1()), Boolean.valueOf(game.r1())) && n9.k.b(Boolean.valueOf(game2.zzd()), Boolean.valueOf(game.zzd()));
    }

    @Override // com.google.android.gms.games.Game
    @NonNull
    public Uri A() {
        return this.f6134o;
    }

    @Override // com.google.android.gms.games.Game
    public boolean B0() {
        return this.D;
    }

    @Override // com.google.android.gms.games.Game
    @NonNull
    public Uri B1() {
        return this.f6135p;
    }

    @Override // com.google.android.gms.games.Game
    public int L0() {
        return this.f6140u;
    }

    @Override // com.google.android.gms.games.Game
    @NonNull
    public String M0() {
        return this.f6130k;
    }

    @Override // com.google.android.gms.games.Game
    @NonNull
    public String P1() {
        return this.f6127h;
    }

    @Override // com.google.android.gms.games.Game
    @NonNull
    public String Y() {
        return this.f6129j;
    }

    @Override // com.google.android.gms.games.Game
    public final boolean c() {
        return this.f6142w;
    }

    public boolean equals(Object obj) {
        return z3(this, obj);
    }

    @Override // com.google.android.gms.games.Game
    @NonNull
    public String f0() {
        return this.f6132m;
    }

    @Override // com.google.android.gms.games.Game
    public int f2() {
        return this.f6141v;
    }

    @Override // com.google.android.gms.games.Game
    @NonNull
    public String getDescription() {
        return this.f6131l;
    }

    @Override // com.google.android.gms.games.Game
    @NonNull
    public String getFeaturedImageUrl() {
        return this.A;
    }

    @Override // com.google.android.gms.games.Game
    @NonNull
    public String getHiResImageUrl() {
        return this.f6145z;
    }

    @Override // com.google.android.gms.games.Game
    @NonNull
    public String getIconImageUrl() {
        return this.f6144y;
    }

    @Override // com.google.android.gms.games.Game
    @NonNull
    public Uri h() {
        return this.f6133n;
    }

    public int hashCode() {
        return y3(this);
    }

    @Override // com.google.android.gms.games.Game
    @NonNull
    public String l() {
        return this.f6128i;
    }

    @Override // com.google.android.gms.games.Game
    public boolean r1() {
        return this.F;
    }

    @NonNull
    public String toString() {
        return A3(this);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i10) {
        if (w3()) {
            parcel.writeString(this.f6127h);
            parcel.writeString(this.f6128i);
            parcel.writeString(this.f6129j);
            parcel.writeString(this.f6130k);
            parcel.writeString(this.f6131l);
            parcel.writeString(this.f6132m);
            Uri uri = this.f6133n;
            parcel.writeString(uri == null ? null : uri.toString());
            Uri uri2 = this.f6134o;
            parcel.writeString(uri2 == null ? null : uri2.toString());
            Uri uri3 = this.f6135p;
            parcel.writeString(uri3 != null ? uri3.toString() : null);
            parcel.writeInt(this.f6136q ? 1 : 0);
            parcel.writeInt(this.f6137r ? 1 : 0);
            parcel.writeString(this.f6138s);
            parcel.writeInt(this.f6139t);
            parcel.writeInt(this.f6140u);
            parcel.writeInt(this.f6141v);
            return;
        }
        int iA = b.a(parcel);
        b.v(parcel, 1, P1(), false);
        b.v(parcel, 2, l(), false);
        b.v(parcel, 3, Y(), false);
        b.v(parcel, 4, M0(), false);
        b.v(parcel, 5, getDescription(), false);
        b.v(parcel, 6, f0(), false);
        b.t(parcel, 7, h(), i10, false);
        b.t(parcel, 8, A(), i10, false);
        b.t(parcel, 9, B1(), i10, false);
        b.c(parcel, 10, this.f6136q);
        b.c(parcel, 11, this.f6137r);
        b.v(parcel, 12, this.f6138s, false);
        b.n(parcel, 13, this.f6139t);
        b.n(parcel, 14, L0());
        b.n(parcel, 15, f2());
        b.c(parcel, 16, this.f6142w);
        b.c(parcel, 17, this.f6143x);
        b.v(parcel, 18, getIconImageUrl(), false);
        b.v(parcel, 19, getHiResImageUrl(), false);
        b.v(parcel, 20, getFeaturedImageUrl(), false);
        b.c(parcel, 21, this.B);
        b.c(parcel, 22, this.C);
        b.c(parcel, 23, B0());
        b.v(parcel, 24, z0(), false);
        b.c(parcel, 25, r1());
        b.c(parcel, 28, this.G);
        b.b(parcel, iA);
    }

    @Override // com.google.android.gms.games.Game
    @NonNull
    public String z0() {
        return this.E;
    }

    @Override // com.google.android.gms.games.Game
    public final boolean zza() {
        return this.f6136q;
    }

    @Override // com.google.android.gms.games.Game
    public final boolean zzb() {
        return this.B;
    }

    @Override // com.google.android.gms.games.Game
    public final boolean zzc() {
        return this.C;
    }

    @Override // com.google.android.gms.games.Game
    public final boolean zzd() {
        return this.G;
    }

    @Override // com.google.android.gms.games.Game
    public final boolean zze() {
        return this.f6137r;
    }

    @Override // com.google.android.gms.games.Game
    @NonNull
    public final String zzf() {
        return this.f6138s;
    }

    @Override // com.google.android.gms.games.Game
    public final boolean zzh() {
        return this.f6143x;
    }

    public GameEntity(String str, String str2, String str3, String str4, String str5, String str6, Uri uri, Uri uri2, Uri uri3, boolean z10, boolean z11, String str7, int i10, int i11, int i12, boolean z12, boolean z13, String str8, String str9, String str10, boolean z14, boolean z15, boolean z16, String str11, boolean z17, boolean z18) {
        this.f6127h = str;
        this.f6128i = str2;
        this.f6129j = str3;
        this.f6130k = str4;
        this.f6131l = str5;
        this.f6132m = str6;
        this.f6133n = uri;
        this.f6144y = str8;
        this.f6134o = uri2;
        this.f6145z = str9;
        this.f6135p = uri3;
        this.A = str10;
        this.f6136q = z10;
        this.f6137r = z11;
        this.f6138s = str7;
        this.f6139t = i10;
        this.f6140u = i11;
        this.f6141v = i12;
        this.f6142w = z12;
        this.f6143x = z13;
        this.B = z14;
        this.C = z15;
        this.D = z16;
        this.E = str11;
        this.F = z17;
        this.G = z18;
    }
}
