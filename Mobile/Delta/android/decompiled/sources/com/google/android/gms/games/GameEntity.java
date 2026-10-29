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
    public final String f6054h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f6055i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f6056j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final String f6057k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final String f6058l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final String f6059m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Uri f6060n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Uri f6061o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Uri f6062p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final boolean f6063q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final boolean f6064r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final String f6065s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final int f6066t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final int f6067u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final int f6068v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final boolean f6069w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final boolean f6070x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final String f6071y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final String f6072z;

    public GameEntity(@NonNull Game game) {
        this.f6054h = game.Q1();
        this.f6056j = game.Z();
        this.f6057k = game.Q0();
        this.f6058l = game.getDescription();
        this.f6059m = game.i0();
        this.f6055i = game.l();
        this.f6060n = game.h();
        this.f6071y = game.getIconImageUrl();
        this.f6061o = game.B();
        this.f6072z = game.getHiResImageUrl();
        this.f6062p = game.D1();
        this.A = game.getFeaturedImageUrl();
        this.f6063q = game.zza();
        this.f6064r = game.zze();
        this.f6065s = game.zzf();
        this.f6066t = 1;
        this.f6067u = game.P0();
        this.f6068v = game.e2();
        this.f6069w = game.c();
        this.f6070x = game.zzh();
        this.B = game.zzb();
        this.C = game.zzc();
        this.D = game.F0();
        this.E = game.D0();
        this.F = game.t1();
        this.G = game.zzd();
    }

    public static String A3(Game game) {
        return n9.k.d(game).a("ApplicationId", game.Q1()).a("DisplayName", game.l()).a("PrimaryCategory", game.Z()).a("SecondaryCategory", game.Q0()).a("Description", game.getDescription()).a("DeveloperName", game.i0()).a("IconImageUri", game.h()).a("IconImageUrl", game.getIconImageUrl()).a("HiResImageUri", game.B()).a("HiResImageUrl", game.getHiResImageUrl()).a("FeaturedImageUri", game.D1()).a("FeaturedImageUrl", game.getFeaturedImageUrl()).a("PlayEnabledGame", Boolean.valueOf(game.zza())).a("InstanceInstalled", Boolean.valueOf(game.zze())).a("InstancePackageName", game.zzf()).a("AchievementTotalCount", Integer.valueOf(game.P0())).a("LeaderboardCount", Integer.valueOf(game.e2())).a("AreSnapshotsEnabled", Boolean.valueOf(game.F0())).a("ThemeColor", game.D0()).a("HasGamepadSupport", Boolean.valueOf(game.t1())).toString();
    }

    public static int y3(Game game) {
        return n9.k.c(game.Q1(), game.l(), game.Z(), game.Q0(), game.getDescription(), game.i0(), game.h(), game.B(), game.D1(), Boolean.valueOf(game.zza()), Boolean.valueOf(game.zze()), game.zzf(), Integer.valueOf(game.P0()), Integer.valueOf(game.e2()), Boolean.valueOf(game.c()), Boolean.valueOf(game.zzh()), Boolean.valueOf(game.zzb()), Boolean.valueOf(game.zzc()), Boolean.valueOf(game.F0()), game.D0(), Boolean.valueOf(game.t1()), Boolean.valueOf(game.zzd()));
    }

    public static boolean z3(Game game, Object obj) {
        if (!(obj instanceof Game)) {
            return false;
        }
        if (game == obj) {
            return true;
        }
        Game game2 = (Game) obj;
        return n9.k.b(game2.Q1(), game.Q1()) && n9.k.b(game2.l(), game.l()) && n9.k.b(game2.Z(), game.Z()) && n9.k.b(game2.Q0(), game.Q0()) && n9.k.b(game2.getDescription(), game.getDescription()) && n9.k.b(game2.i0(), game.i0()) && n9.k.b(game2.h(), game.h()) && n9.k.b(game2.B(), game.B()) && n9.k.b(game2.D1(), game.D1()) && n9.k.b(Boolean.valueOf(game2.zza()), Boolean.valueOf(game.zza())) && n9.k.b(Boolean.valueOf(game2.zze()), Boolean.valueOf(game.zze())) && n9.k.b(game2.zzf(), game.zzf()) && n9.k.b(Integer.valueOf(game2.P0()), Integer.valueOf(game.P0())) && n9.k.b(Integer.valueOf(game2.e2()), Integer.valueOf(game.e2())) && n9.k.b(Boolean.valueOf(game2.c()), Boolean.valueOf(game.c())) && n9.k.b(Boolean.valueOf(game2.zzh()), Boolean.valueOf(game.zzh())) && n9.k.b(Boolean.valueOf(game2.zzb()), Boolean.valueOf(game.zzb())) && n9.k.b(Boolean.valueOf(game2.zzc()), Boolean.valueOf(game.zzc())) && n9.k.b(Boolean.valueOf(game2.F0()), Boolean.valueOf(game.F0())) && n9.k.b(game2.D0(), game.D0()) && n9.k.b(Boolean.valueOf(game2.t1()), Boolean.valueOf(game.t1())) && n9.k.b(Boolean.valueOf(game2.zzd()), Boolean.valueOf(game.zzd()));
    }

    @Override // com.google.android.gms.games.Game
    @NonNull
    public Uri B() {
        return this.f6061o;
    }

    @Override // com.google.android.gms.games.Game
    @NonNull
    public String D0() {
        return this.E;
    }

    @Override // com.google.android.gms.games.Game
    @NonNull
    public Uri D1() {
        return this.f6062p;
    }

    @Override // com.google.android.gms.games.Game
    public boolean F0() {
        return this.D;
    }

    @Override // com.google.android.gms.games.Game
    public int P0() {
        return this.f6067u;
    }

    @Override // com.google.android.gms.games.Game
    @NonNull
    public String Q0() {
        return this.f6057k;
    }

    @Override // com.google.android.gms.games.Game
    @NonNull
    public String Q1() {
        return this.f6054h;
    }

    @Override // com.google.android.gms.games.Game
    @NonNull
    public String Z() {
        return this.f6056j;
    }

    @Override // com.google.android.gms.games.Game
    public final boolean c() {
        return this.f6069w;
    }

    @Override // com.google.android.gms.games.Game
    public int e2() {
        return this.f6068v;
    }

    public boolean equals(Object obj) {
        return z3(this, obj);
    }

    @Override // com.google.android.gms.games.Game
    @NonNull
    public String getDescription() {
        return this.f6058l;
    }

    @Override // com.google.android.gms.games.Game
    @NonNull
    public String getFeaturedImageUrl() {
        return this.A;
    }

    @Override // com.google.android.gms.games.Game
    @NonNull
    public String getHiResImageUrl() {
        return this.f6072z;
    }

    @Override // com.google.android.gms.games.Game
    @NonNull
    public String getIconImageUrl() {
        return this.f6071y;
    }

    @Override // com.google.android.gms.games.Game
    @NonNull
    public Uri h() {
        return this.f6060n;
    }

    public int hashCode() {
        return y3(this);
    }

    @Override // com.google.android.gms.games.Game
    @NonNull
    public String i0() {
        return this.f6059m;
    }

    @Override // com.google.android.gms.games.Game
    @NonNull
    public String l() {
        return this.f6055i;
    }

    @Override // com.google.android.gms.games.Game
    public boolean t1() {
        return this.F;
    }

    @NonNull
    public String toString() {
        return A3(this);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i10) {
        if (w3()) {
            parcel.writeString(this.f6054h);
            parcel.writeString(this.f6055i);
            parcel.writeString(this.f6056j);
            parcel.writeString(this.f6057k);
            parcel.writeString(this.f6058l);
            parcel.writeString(this.f6059m);
            Uri uri = this.f6060n;
            parcel.writeString(uri == null ? null : uri.toString());
            Uri uri2 = this.f6061o;
            parcel.writeString(uri2 == null ? null : uri2.toString());
            Uri uri3 = this.f6062p;
            parcel.writeString(uri3 != null ? uri3.toString() : null);
            parcel.writeInt(this.f6063q ? 1 : 0);
            parcel.writeInt(this.f6064r ? 1 : 0);
            parcel.writeString(this.f6065s);
            parcel.writeInt(this.f6066t);
            parcel.writeInt(this.f6067u);
            parcel.writeInt(this.f6068v);
            return;
        }
        int iA = b.a(parcel);
        b.v(parcel, 1, Q1(), false);
        b.v(parcel, 2, l(), false);
        b.v(parcel, 3, Z(), false);
        b.v(parcel, 4, Q0(), false);
        b.v(parcel, 5, getDescription(), false);
        b.v(parcel, 6, i0(), false);
        b.t(parcel, 7, h(), i10, false);
        b.t(parcel, 8, B(), i10, false);
        b.t(parcel, 9, D1(), i10, false);
        b.c(parcel, 10, this.f6063q);
        b.c(parcel, 11, this.f6064r);
        b.v(parcel, 12, this.f6065s, false);
        b.n(parcel, 13, this.f6066t);
        b.n(parcel, 14, P0());
        b.n(parcel, 15, e2());
        b.c(parcel, 16, this.f6069w);
        b.c(parcel, 17, this.f6070x);
        b.v(parcel, 18, getIconImageUrl(), false);
        b.v(parcel, 19, getHiResImageUrl(), false);
        b.v(parcel, 20, getFeaturedImageUrl(), false);
        b.c(parcel, 21, this.B);
        b.c(parcel, 22, this.C);
        b.c(parcel, 23, F0());
        b.v(parcel, 24, D0(), false);
        b.c(parcel, 25, t1());
        b.c(parcel, 28, this.G);
        b.b(parcel, iA);
    }

    @Override // com.google.android.gms.games.Game
    public final boolean zza() {
        return this.f6063q;
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
        return this.f6064r;
    }

    @Override // com.google.android.gms.games.Game
    @NonNull
    public final String zzf() {
        return this.f6065s;
    }

    @Override // com.google.android.gms.games.Game
    public final boolean zzh() {
        return this.f6070x;
    }

    public GameEntity(String str, String str2, String str3, String str4, String str5, String str6, Uri uri, Uri uri2, Uri uri3, boolean z10, boolean z11, String str7, int i10, int i11, int i12, boolean z12, boolean z13, String str8, String str9, String str10, boolean z14, boolean z15, boolean z16, String str11, boolean z17, boolean z18) {
        this.f6054h = str;
        this.f6055i = str2;
        this.f6056j = str3;
        this.f6057k = str4;
        this.f6058l = str5;
        this.f6059m = str6;
        this.f6060n = uri;
        this.f6071y = str8;
        this.f6061o = uri2;
        this.f6072z = str9;
        this.f6062p = uri3;
        this.A = str10;
        this.f6063q = z10;
        this.f6064r = z11;
        this.f6065s = str7;
        this.f6066t = i10;
        this.f6067u = i11;
        this.f6068v = i12;
        this.f6069w = z12;
        this.f6070x = z13;
        this.B = z14;
        this.C = z15;
        this.D = z16;
        this.E = str11;
        this.F = z17;
        this.G = z18;
    }
}
