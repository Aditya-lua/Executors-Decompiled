package com.google.android.gms.games;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.apps.common.proguard.UsedByReflection;
import com.google.android.gms.games.internal.GamesDowngradeableSafeParcel;
import ea.e;
import ea.t;
import o9.q;
import p9.c;

/* JADX INFO: loaded from: classes.dex */
@UsedByReflection("GamesGmsClientImpl.java")
public final class GameEntity extends GamesDowngradeableSafeParcel implements e {

    @NonNull
    public static final Parcelable.Creator<GameEntity> CREATOR = new t();
    public final String A;
    public final boolean B;
    public final boolean C;
    public final boolean D;
    public final String E;
    public final boolean F;
    public final boolean G;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f6190h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f6191i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f6192j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final String f6193k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final String f6194l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final String f6195m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Uri f6196n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Uri f6197o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Uri f6198p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final boolean f6199q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final boolean f6200r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final String f6201s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final int f6202t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final int f6203u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final int f6204v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final boolean f6205w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final boolean f6206x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final String f6207y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final String f6208z;

    public GameEntity(@NonNull e eVar) {
        this.f6190h = eVar.T1();
        this.f6192j = eVar.d0();
        this.f6193k = eVar.R0();
        this.f6194l = eVar.getDescription();
        this.f6195m = eVar.k0();
        this.f6191i = eVar.m();
        this.f6196n = eVar.h();
        this.f6207y = eVar.getIconImageUrl();
        this.f6197o = eVar.E();
        this.f6208z = eVar.getHiResImageUrl();
        this.f6198p = eVar.E1();
        this.A = eVar.getFeaturedImageUrl();
        this.f6199q = eVar.zza();
        this.f6200r = eVar.zze();
        this.f6201s = eVar.zzf();
        this.f6202t = 1;
        this.f6203u = eVar.Q0();
        this.f6204v = eVar.h2();
        this.f6205w = eVar.c();
        this.f6206x = eVar.zzh();
        this.B = eVar.zzb();
        this.C = eVar.zzc();
        this.D = eVar.G0();
        this.E = eVar.E0();
        this.F = eVar.u1();
        this.G = eVar.zzd();
    }

    public static int D3(e eVar) {
        return q.c(eVar.T1(), eVar.m(), eVar.d0(), eVar.R0(), eVar.getDescription(), eVar.k0(), eVar.h(), eVar.E(), eVar.E1(), Boolean.valueOf(eVar.zza()), Boolean.valueOf(eVar.zze()), eVar.zzf(), Integer.valueOf(eVar.Q0()), Integer.valueOf(eVar.h2()), Boolean.valueOf(eVar.c()), Boolean.valueOf(eVar.zzh()), Boolean.valueOf(eVar.zzb()), Boolean.valueOf(eVar.zzc()), Boolean.valueOf(eVar.G0()), eVar.E0(), Boolean.valueOf(eVar.u1()), Boolean.valueOf(eVar.zzd()));
    }

    public static boolean E3(e eVar, Object obj) {
        if (!(obj instanceof e)) {
            return false;
        }
        if (eVar == obj) {
            return true;
        }
        e eVar2 = (e) obj;
        return q.b(eVar2.T1(), eVar.T1()) && q.b(eVar2.m(), eVar.m()) && q.b(eVar2.d0(), eVar.d0()) && q.b(eVar2.R0(), eVar.R0()) && q.b(eVar2.getDescription(), eVar.getDescription()) && q.b(eVar2.k0(), eVar.k0()) && q.b(eVar2.h(), eVar.h()) && q.b(eVar2.E(), eVar.E()) && q.b(eVar2.E1(), eVar.E1()) && q.b(Boolean.valueOf(eVar2.zza()), Boolean.valueOf(eVar.zza())) && q.b(Boolean.valueOf(eVar2.zze()), Boolean.valueOf(eVar.zze())) && q.b(eVar2.zzf(), eVar.zzf()) && q.b(Integer.valueOf(eVar2.Q0()), Integer.valueOf(eVar.Q0())) && q.b(Integer.valueOf(eVar2.h2()), Integer.valueOf(eVar.h2())) && q.b(Boolean.valueOf(eVar2.c()), Boolean.valueOf(eVar.c())) && q.b(Boolean.valueOf(eVar2.zzh()), Boolean.valueOf(eVar.zzh())) && q.b(Boolean.valueOf(eVar2.zzb()), Boolean.valueOf(eVar.zzb())) && q.b(Boolean.valueOf(eVar2.zzc()), Boolean.valueOf(eVar.zzc())) && q.b(Boolean.valueOf(eVar2.G0()), Boolean.valueOf(eVar.G0())) && q.b(eVar2.E0(), eVar.E0()) && q.b(Boolean.valueOf(eVar2.u1()), Boolean.valueOf(eVar.u1())) && q.b(Boolean.valueOf(eVar2.zzd()), Boolean.valueOf(eVar.zzd()));
    }

    public static String F3(e eVar) {
        return q.d(eVar).a("ApplicationId", eVar.T1()).a("DisplayName", eVar.m()).a("PrimaryCategory", eVar.d0()).a("SecondaryCategory", eVar.R0()).a("Description", eVar.getDescription()).a("DeveloperName", eVar.k0()).a("IconImageUri", eVar.h()).a("IconImageUrl", eVar.getIconImageUrl()).a("HiResImageUri", eVar.E()).a("HiResImageUrl", eVar.getHiResImageUrl()).a("FeaturedImageUri", eVar.E1()).a("FeaturedImageUrl", eVar.getFeaturedImageUrl()).a("PlayEnabledGame", Boolean.valueOf(eVar.zza())).a("InstanceInstalled", Boolean.valueOf(eVar.zze())).a("InstancePackageName", eVar.zzf()).a("AchievementTotalCount", Integer.valueOf(eVar.Q0())).a("LeaderboardCount", Integer.valueOf(eVar.h2())).a("AreSnapshotsEnabled", Boolean.valueOf(eVar.G0())).a("ThemeColor", eVar.E0()).a("HasGamepadSupport", Boolean.valueOf(eVar.u1())).toString();
    }

    @Override // ea.e
    @NonNull
    public Uri E() {
        return this.f6197o;
    }

    @Override // ea.e
    @NonNull
    public String E0() {
        return this.E;
    }

    @Override // ea.e
    @NonNull
    public Uri E1() {
        return this.f6198p;
    }

    @Override // ea.e
    public boolean G0() {
        return this.D;
    }

    @Override // ea.e
    public int Q0() {
        return this.f6203u;
    }

    @Override // ea.e
    @NonNull
    public String R0() {
        return this.f6193k;
    }

    @Override // ea.e
    @NonNull
    public String T1() {
        return this.f6190h;
    }

    @Override // ea.e
    public final boolean c() {
        return this.f6205w;
    }

    @Override // ea.e
    @NonNull
    public String d0() {
        return this.f6192j;
    }

    public boolean equals(Object obj) {
        return E3(this, obj);
    }

    @Override // ea.e
    @NonNull
    public String getDescription() {
        return this.f6194l;
    }

    @Override // ea.e
    @NonNull
    public String getFeaturedImageUrl() {
        return this.A;
    }

    @Override // ea.e
    @NonNull
    public String getHiResImageUrl() {
        return this.f6208z;
    }

    @Override // ea.e
    @NonNull
    public String getIconImageUrl() {
        return this.f6207y;
    }

    @Override // ea.e
    @NonNull
    public Uri h() {
        return this.f6196n;
    }

    @Override // ea.e
    public int h2() {
        return this.f6204v;
    }

    public int hashCode() {
        return D3(this);
    }

    @Override // ea.e
    @NonNull
    public String k0() {
        return this.f6195m;
    }

    @Override // ea.e
    @NonNull
    public String m() {
        return this.f6191i;
    }

    @NonNull
    public String toString() {
        return F3(this);
    }

    @Override // ea.e
    public boolean u1() {
        return this.F;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i10) {
        if (B3()) {
            parcel.writeString(this.f6190h);
            parcel.writeString(this.f6191i);
            parcel.writeString(this.f6192j);
            parcel.writeString(this.f6193k);
            parcel.writeString(this.f6194l);
            parcel.writeString(this.f6195m);
            Uri uri = this.f6196n;
            parcel.writeString(uri == null ? null : uri.toString());
            Uri uri2 = this.f6197o;
            parcel.writeString(uri2 == null ? null : uri2.toString());
            Uri uri3 = this.f6198p;
            parcel.writeString(uri3 != null ? uri3.toString() : null);
            parcel.writeInt(this.f6199q ? 1 : 0);
            parcel.writeInt(this.f6200r ? 1 : 0);
            parcel.writeString(this.f6201s);
            parcel.writeInt(this.f6202t);
            parcel.writeInt(this.f6203u);
            parcel.writeInt(this.f6204v);
            return;
        }
        int iA = c.a(parcel);
        c.v(parcel, 1, T1(), false);
        c.v(parcel, 2, m(), false);
        c.v(parcel, 3, d0(), false);
        c.v(parcel, 4, R0(), false);
        c.v(parcel, 5, getDescription(), false);
        c.v(parcel, 6, k0(), false);
        c.t(parcel, 7, h(), i10, false);
        c.t(parcel, 8, E(), i10, false);
        c.t(parcel, 9, E1(), i10, false);
        c.c(parcel, 10, this.f6199q);
        c.c(parcel, 11, this.f6200r);
        c.v(parcel, 12, this.f6201s, false);
        c.n(parcel, 13, this.f6202t);
        c.n(parcel, 14, Q0());
        c.n(parcel, 15, h2());
        c.c(parcel, 16, this.f6205w);
        c.c(parcel, 17, this.f6206x);
        c.v(parcel, 18, getIconImageUrl(), false);
        c.v(parcel, 19, getHiResImageUrl(), false);
        c.v(parcel, 20, getFeaturedImageUrl(), false);
        c.c(parcel, 21, this.B);
        c.c(parcel, 22, this.C);
        c.c(parcel, 23, G0());
        c.v(parcel, 24, E0(), false);
        c.c(parcel, 25, u1());
        c.c(parcel, 28, this.G);
        c.b(parcel, iA);
    }

    @Override // ea.e
    public final boolean zza() {
        return this.f6199q;
    }

    @Override // ea.e
    public final boolean zzb() {
        return this.B;
    }

    @Override // ea.e
    public final boolean zzc() {
        return this.C;
    }

    @Override // ea.e
    public final boolean zzd() {
        return this.G;
    }

    @Override // ea.e
    public final boolean zze() {
        return this.f6200r;
    }

    @Override // ea.e
    @NonNull
    public final String zzf() {
        return this.f6201s;
    }

    @Override // ea.e
    public final boolean zzh() {
        return this.f6206x;
    }

    public GameEntity(String str, String str2, String str3, String str4, String str5, String str6, Uri uri, Uri uri2, Uri uri3, boolean z10, boolean z11, String str7, int i10, int i11, int i12, boolean z12, boolean z13, String str8, String str9, String str10, boolean z14, boolean z15, boolean z16, String str11, boolean z17, boolean z18) {
        this.f6190h = str;
        this.f6191i = str2;
        this.f6192j = str3;
        this.f6193k = str4;
        this.f6194l = str5;
        this.f6195m = str6;
        this.f6196n = uri;
        this.f6207y = str8;
        this.f6197o = uri2;
        this.f6208z = str9;
        this.f6198p = uri3;
        this.A = str10;
        this.f6199q = z10;
        this.f6200r = z11;
        this.f6201s = str7;
        this.f6202t = i10;
        this.f6203u = i11;
        this.f6204v = i12;
        this.f6205w = z12;
        this.f6206x = z13;
        this.B = z14;
        this.C = z15;
        this.D = z16;
        this.E = str11;
        this.F = z17;
        this.G = z18;
    }
}
