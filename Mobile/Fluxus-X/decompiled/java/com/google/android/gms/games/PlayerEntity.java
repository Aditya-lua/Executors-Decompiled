package com.google.android.gms.games;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.apps.common.proguard.UsedByReflection;
import com.google.android.gms.games.internal.GamesDowngradeableSafeParcel;
import com.google.android.gms.games.internal.player.MostRecentGameInfoEntity;
import ea.d;
import ea.d0;
import ea.k;
import ea.m;
import ea.o;
import ea.p;
import ea.z;
import ka.b;
import o9.c;
import o9.q;

/* JADX INFO: loaded from: classes.dex */
@UsedByReflection("GamesGmsClientImpl.java")
public final class PlayerEntity extends GamesDowngradeableSafeParcel implements k {

    @NonNull
    public static final Parcelable.Creator<PlayerEntity> CREATOR = new z();
    public final String A;
    public final long B;
    public final d0 C;
    public final p D;
    public final boolean E;
    public final String F;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f6209h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f6210i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Uri f6211j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Uri f6212k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final long f6213l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f6214m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final long f6215n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final String f6216o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final String f6217p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final String f6218q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final MostRecentGameInfoEntity f6219r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final m f6220s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final boolean f6221t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final boolean f6222u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final String f6223v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final String f6224w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final Uri f6225x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final String f6226y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final Uri f6227z;

    public PlayerEntity(@NonNull k kVar) {
        String strR3 = kVar.r3();
        this.f6209h = strR3;
        String strM = kVar.m();
        this.f6210i = strM;
        this.f6211j = kVar.h();
        this.f6216o = kVar.getIconImageUrl();
        this.f6212k = kVar.E();
        this.f6217p = kVar.getHiResImageUrl();
        long jE0 = kVar.e0();
        this.f6213l = jE0;
        this.f6214m = kVar.zze();
        this.f6215n = kVar.s0();
        this.f6218q = kVar.getTitle();
        this.f6221t = kVar.zzf();
        b bVarZzh = kVar.zzh();
        this.f6219r = bVarZzh == null ? null : new MostRecentGameInfoEntity(bVarZzh);
        this.f6220s = kVar.z0();
        this.f6222u = kVar.zzd();
        this.f6223v = kVar.zzb();
        this.f6224w = kVar.zzc();
        this.f6225x = kVar.I1();
        this.f6226y = kVar.getBannerImageLandscapeUrl();
        this.f6227z = kVar.h0();
        this.A = kVar.getBannerImagePortraitUrl();
        this.B = kVar.d();
        o oVarC1 = kVar.c1();
        this.C = oVarC1 == null ? null : new d0(oVarC1.freeze());
        d dVarG2 = kVar.g2();
        this.D = dVarG2 != null ? (p) dVarG2.freeze() : null;
        this.E = kVar.c();
        this.F = kVar.zza();
        c.a(strR3);
        c.a(strM);
        c.b(jE0 > 0);
    }

    public static int D3(k kVar) {
        return q.c(kVar.r3(), kVar.m(), Boolean.valueOf(kVar.zzd()), kVar.h(), kVar.E(), Long.valueOf(kVar.e0()), kVar.getTitle(), kVar.z0(), kVar.zzb(), kVar.zzc(), kVar.I1(), kVar.h0(), Long.valueOf(kVar.d()), kVar.c1(), kVar.g2(), Boolean.valueOf(kVar.c()), kVar.zza());
    }

    public static boolean E3(k kVar, Object obj) {
        if (!(obj instanceof k)) {
            return false;
        }
        if (kVar == obj) {
            return true;
        }
        k kVar2 = (k) obj;
        return q.b(kVar2.r3(), kVar.r3()) && q.b(kVar2.m(), kVar.m()) && q.b(Boolean.valueOf(kVar2.zzd()), Boolean.valueOf(kVar.zzd())) && q.b(kVar2.h(), kVar.h()) && q.b(kVar2.E(), kVar.E()) && q.b(Long.valueOf(kVar2.e0()), Long.valueOf(kVar.e0())) && q.b(kVar2.getTitle(), kVar.getTitle()) && q.b(kVar2.z0(), kVar.z0()) && q.b(kVar2.zzb(), kVar.zzb()) && q.b(kVar2.zzc(), kVar.zzc()) && q.b(kVar2.I1(), kVar.I1()) && q.b(kVar2.h0(), kVar.h0()) && q.b(Long.valueOf(kVar2.d()), Long.valueOf(kVar.d())) && q.b(kVar2.g2(), kVar.g2()) && q.b(kVar2.c1(), kVar.c1()) && q.b(Boolean.valueOf(kVar2.c()), Boolean.valueOf(kVar.c())) && q.b(kVar2.zza(), kVar.zza());
    }

    public static String F3(k kVar) {
        q.a aVarA = q.d(kVar).a("PlayerId", kVar.r3()).a("DisplayName", kVar.m()).a("HasDebugAccess", Boolean.valueOf(kVar.zzd())).a("IconImageUri", kVar.h()).a("IconImageUrl", kVar.getIconImageUrl()).a("HiResImageUri", kVar.E()).a("HiResImageUrl", kVar.getHiResImageUrl()).a("RetrievedTimestamp", Long.valueOf(kVar.e0())).a("Title", kVar.getTitle()).a("LevelInfo", kVar.z0()).a("GamerTag", kVar.zzb()).a("Name", kVar.zzc()).a("BannerImageLandscapeUri", kVar.I1()).a("BannerImageLandscapeUrl", kVar.getBannerImageLandscapeUrl()).a("BannerImagePortraitUri", kVar.h0()).a("BannerImagePortraitUrl", kVar.getBannerImagePortraitUrl()).a("CurrentPlayerInfo", kVar.g2()).a("TotalUnlockedAchievement", Long.valueOf(kVar.d()));
        if (kVar.c()) {
            aVarA.a("AlwaysAutoSignIn", Boolean.valueOf(kVar.c()));
        }
        if (kVar.c1() != null) {
            aVarA.a("RelationshipInfo", kVar.c1());
        }
        if (kVar.zza() != null) {
            aVarA.a("GamePlayerId", kVar.zza());
        }
        return aVarA.toString();
    }

    @Override // ea.k
    public Uri E() {
        return this.f6212k;
    }

    @Override // ea.k
    public Uri I1() {
        return this.f6225x;
    }

    @Override // ea.k
    public final boolean c() {
        return this.E;
    }

    @Override // ea.k
    public o c1() {
        return this.C;
    }

    @Override // ea.k
    public final long d() {
        return this.B;
    }

    @Override // ea.k
    public long e0() {
        return this.f6213l;
    }

    public boolean equals(Object obj) {
        return E3(this, obj);
    }

    @Override // ea.k
    @NonNull
    public d g2() {
        return this.D;
    }

    @Override // ea.k
    public String getBannerImageLandscapeUrl() {
        return this.f6226y;
    }

    @Override // ea.k
    public String getBannerImagePortraitUrl() {
        return this.A;
    }

    @Override // ea.k
    public String getHiResImageUrl() {
        return this.f6217p;
    }

    @Override // ea.k
    public String getIconImageUrl() {
        return this.f6216o;
    }

    @Override // ea.k
    public String getTitle() {
        return this.f6218q;
    }

    @Override // ea.k
    public Uri h() {
        return this.f6211j;
    }

    @Override // ea.k
    public Uri h0() {
        return this.f6227z;
    }

    public int hashCode() {
        return D3(this);
    }

    @Override // ea.k
    @NonNull
    public String m() {
        return this.f6210i;
    }

    @Override // ea.k
    @NonNull
    public String r3() {
        return this.f6209h;
    }

    @Override // ea.k
    public long s0() {
        return this.f6215n;
    }

    @NonNull
    public String toString() {
        return F3(this);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i10) {
        if (B3()) {
            parcel.writeString(this.f6209h);
            parcel.writeString(this.f6210i);
            Uri uri = this.f6211j;
            parcel.writeString(uri == null ? null : uri.toString());
            Uri uri2 = this.f6212k;
            parcel.writeString(uri2 != null ? uri2.toString() : null);
            parcel.writeLong(this.f6213l);
            return;
        }
        int iA = p9.c.a(parcel);
        p9.c.v(parcel, 1, r3(), false);
        p9.c.v(parcel, 2, m(), false);
        p9.c.t(parcel, 3, h(), i10, false);
        p9.c.t(parcel, 4, E(), i10, false);
        p9.c.r(parcel, 5, e0());
        p9.c.n(parcel, 6, this.f6214m);
        p9.c.r(parcel, 7, s0());
        p9.c.v(parcel, 8, getIconImageUrl(), false);
        p9.c.v(parcel, 9, getHiResImageUrl(), false);
        p9.c.v(parcel, 14, getTitle(), false);
        p9.c.t(parcel, 15, this.f6219r, i10, false);
        p9.c.t(parcel, 16, z0(), i10, false);
        p9.c.c(parcel, 18, this.f6221t);
        p9.c.c(parcel, 19, this.f6222u);
        p9.c.v(parcel, 20, this.f6223v, false);
        p9.c.v(parcel, 21, this.f6224w, false);
        p9.c.t(parcel, 22, I1(), i10, false);
        p9.c.v(parcel, 23, getBannerImageLandscapeUrl(), false);
        p9.c.t(parcel, 24, h0(), i10, false);
        p9.c.v(parcel, 25, getBannerImagePortraitUrl(), false);
        p9.c.r(parcel, 29, this.B);
        p9.c.t(parcel, 33, c1(), i10, false);
        p9.c.t(parcel, 35, g2(), i10, false);
        p9.c.c(parcel, 36, this.E);
        p9.c.v(parcel, 37, this.F, false);
        p9.c.b(parcel, iA);
    }

    @Override // ea.k
    public m z0() {
        return this.f6220s;
    }

    @Override // ea.k
    public final String zza() {
        return this.F;
    }

    @Override // ea.k
    public final String zzb() {
        return this.f6223v;
    }

    @Override // ea.k
    @NonNull
    public final String zzc() {
        return this.f6224w;
    }

    @Override // ea.k
    public final boolean zzd() {
        return this.f6222u;
    }

    @Override // ea.k
    public final int zze() {
        return this.f6214m;
    }

    @Override // ea.k
    public final boolean zzf() {
        return this.f6221t;
    }

    @Override // ea.k
    public final b zzh() {
        return this.f6219r;
    }

    public PlayerEntity(String str, String str2, Uri uri, Uri uri2, long j10, int i10, long j11, String str3, String str4, String str5, MostRecentGameInfoEntity mostRecentGameInfoEntity, m mVar, boolean z10, boolean z11, String str6, String str7, Uri uri3, String str8, Uri uri4, String str9, long j12, d0 d0Var, p pVar, boolean z12, String str10) {
        this.f6209h = str;
        this.f6210i = str2;
        this.f6211j = uri;
        this.f6216o = str3;
        this.f6212k = uri2;
        this.f6217p = str4;
        this.f6213l = j10;
        this.f6214m = i10;
        this.f6215n = j11;
        this.f6218q = str5;
        this.f6221t = z10;
        this.f6219r = mostRecentGameInfoEntity;
        this.f6220s = mVar;
        this.f6222u = z11;
        this.f6223v = str6;
        this.f6224w = str7;
        this.f6225x = uri3;
        this.f6226y = str8;
        this.f6227z = uri4;
        this.A = str9;
        this.B = j12;
        this.C = d0Var;
        this.D = pVar;
        this.E = z12;
        this.F = str10;
    }
}
