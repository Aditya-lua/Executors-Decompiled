package com.google.android.gms.games.snapshot;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.apps.common.proguard.UsedByReflection;
import com.google.android.gms.games.GameEntity;
import com.google.android.gms.games.PlayerEntity;
import ea.e;
import ea.k;
import ha.p;
import o9.q;
import qa.c;
import qa.g;

/* JADX INFO: loaded from: classes.dex */
@UsedByReflection("GamesGmsClientImpl.java")
public final class SnapshotMetadataEntity extends p implements c {

    @NonNull
    public static final Parcelable.Creator<SnapshotMetadataEntity> CREATOR = new g();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final GameEntity f6335f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final PlayerEntity f6336g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f6337h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Uri f6338i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f6339j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final String f6340k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final String f6341l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final long f6342m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final long f6343n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final float f6344o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final String f6345p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final boolean f6346q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final long f6347r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final String f6348s;

    public SnapshotMetadataEntity(GameEntity gameEntity, PlayerEntity playerEntity, String str, Uri uri, String str2, String str3, String str4, long j10, long j11, float f10, String str5, boolean z10, long j12, String str6) {
        this.f6335f = gameEntity;
        this.f6336g = playerEntity;
        this.f6337h = str;
        this.f6338i = uri;
        this.f6339j = str2;
        this.f6344o = f10;
        this.f6340k = str3;
        this.f6341l = str4;
        this.f6342m = j10;
        this.f6343n = j11;
        this.f6345p = str5;
        this.f6346q = z10;
        this.f6347r = j12;
        this.f6348s = str6;
    }

    public static boolean A3(c cVar, Object obj) {
        if (!(obj instanceof c)) {
            return false;
        }
        if (cVar == obj) {
            return true;
        }
        c cVar2 = (c) obj;
        return q.b(cVar2.z3(), cVar.z3()) && q.b(cVar2.Z0(), cVar.Z0()) && q.b(cVar2.v3(), cVar.v3()) && q.b(cVar2.T0(), cVar.T0()) && q.b(Float.valueOf(cVar2.o3()), Float.valueOf(cVar.o3())) && q.b(cVar2.zza(), cVar.zza()) && q.b(cVar2.getDescription(), cVar.getDescription()) && q.b(Long.valueOf(cVar2.i0()), Long.valueOf(cVar.i0())) && q.b(Long.valueOf(cVar2.Y1()), Long.valueOf(cVar.Y1())) && q.b(cVar2.D1(), cVar.D1()) && q.b(Boolean.valueOf(cVar2.U2()), Boolean.valueOf(cVar.U2())) && q.b(Long.valueOf(cVar2.A0()), Long.valueOf(cVar.A0())) && q.b(cVar2.F2(), cVar.F2());
    }

    public static String B3(c cVar) {
        return q.d(cVar).a("Game", cVar.z3()).a("Owner", cVar.Z0()).a("SnapshotId", cVar.v3()).a("CoverImageUri", cVar.T0()).a("CoverImageUrl", cVar.getCoverImageUrl()).a("CoverImageAspectRatio", Float.valueOf(cVar.o3())).a("Description", cVar.getDescription()).a("LastModifiedTimestamp", Long.valueOf(cVar.i0())).a("PlayedTime", Long.valueOf(cVar.Y1())).a("UniqueName", cVar.D1()).a("ChangePending", Boolean.valueOf(cVar.U2())).a("ProgressValue", Long.valueOf(cVar.A0())).a("DeviceName", cVar.F2()).toString();
    }

    public static int a(c cVar) {
        return q.c(cVar.z3(), cVar.Z0(), cVar.v3(), cVar.T0(), Float.valueOf(cVar.o3()), cVar.zza(), cVar.getDescription(), Long.valueOf(cVar.i0()), Long.valueOf(cVar.Y1()), cVar.D1(), Boolean.valueOf(cVar.U2()), Long.valueOf(cVar.A0()), cVar.F2());
    }

    @Override // qa.c
    public long A0() {
        return this.f6347r;
    }

    @Override // qa.c
    @NonNull
    public String D1() {
        return this.f6345p;
    }

    @Override // qa.c
    @NonNull
    public String F2() {
        return this.f6348s;
    }

    @Override // qa.c
    public Uri T0() {
        return this.f6338i;
    }

    @Override // qa.c
    public boolean U2() {
        return this.f6346q;
    }

    @Override // qa.c
    public long Y1() {
        return this.f6343n;
    }

    @Override // qa.c
    @NonNull
    public k Z0() {
        return this.f6336g;
    }

    public boolean equals(Object obj) {
        return A3(this, obj);
    }

    @Override // qa.c
    public String getCoverImageUrl() {
        return this.f6339j;
    }

    @Override // qa.c
    @NonNull
    public String getDescription() {
        return this.f6341l;
    }

    public int hashCode() {
        return a(this);
    }

    @Override // qa.c
    public long i0() {
        return this.f6342m;
    }

    @Override // qa.c
    public float o3() {
        return this.f6344o;
    }

    @NonNull
    public String toString() {
        return B3(this);
    }

    @Override // qa.c
    @NonNull
    public String v3() {
        return this.f6337h;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i10) {
        int iA = p9.c.a(parcel);
        p9.c.t(parcel, 1, z3(), i10, false);
        p9.c.t(parcel, 2, Z0(), i10, false);
        p9.c.v(parcel, 3, v3(), false);
        p9.c.t(parcel, 5, T0(), i10, false);
        p9.c.v(parcel, 6, getCoverImageUrl(), false);
        p9.c.v(parcel, 7, this.f6340k, false);
        p9.c.v(parcel, 8, getDescription(), false);
        p9.c.r(parcel, 9, i0());
        p9.c.r(parcel, 10, Y1());
        p9.c.k(parcel, 11, o3());
        p9.c.v(parcel, 12, D1(), false);
        p9.c.c(parcel, 13, U2());
        p9.c.r(parcel, 14, A0());
        p9.c.v(parcel, 15, F2(), false);
        p9.c.b(parcel, iA);
    }

    @Override // qa.c
    @NonNull
    public e z3() {
        return this.f6335f;
    }

    @Override // qa.c
    @NonNull
    public final String zza() {
        return this.f6340k;
    }

    public SnapshotMetadataEntity(@NonNull c cVar) {
        PlayerEntity playerEntity = new PlayerEntity(cVar.Z0());
        this.f6335f = new GameEntity(cVar.z3());
        this.f6336g = playerEntity;
        this.f6337h = cVar.v3();
        this.f6338i = cVar.T0();
        this.f6339j = cVar.getCoverImageUrl();
        this.f6344o = cVar.o3();
        this.f6340k = cVar.zza();
        this.f6341l = cVar.getDescription();
        this.f6342m = cVar.i0();
        this.f6343n = cVar.Y1();
        this.f6345p = cVar.D1();
        this.f6346q = cVar.U2();
        this.f6347r = cVar.A0();
        this.f6348s = cVar.F2();
    }
}
