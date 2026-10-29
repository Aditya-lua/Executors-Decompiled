package com.google.android.gms.games.snapshot;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.apps.common.proguard.UsedByReflection;
import com.google.android.gms.games.Game;
import com.google.android.gms.games.GameEntity;
import com.google.android.gms.games.Player;
import com.google.android.gms.games.PlayerEntity;
import com.google.android.gms.games.internal.zzg;
import n9.k;
import o9.b;
import pa.d;

/* JADX INFO: loaded from: classes.dex */
@UsedByReflection("GamesGmsClientImpl.java")
public final class SnapshotMetadataEntity extends zzg implements SnapshotMetadata {

    @NonNull
    public static final Parcelable.Creator<SnapshotMetadataEntity> CREATOR = new d();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final GameEntity f6237f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final PlayerEntity f6238g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f6239h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Uri f6240i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f6241j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final String f6242k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final String f6243l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final long f6244m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final long f6245n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final float f6246o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final String f6247p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final boolean f6248q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final long f6249r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final String f6250s;

    public SnapshotMetadataEntity(GameEntity gameEntity, PlayerEntity playerEntity, String str, Uri uri, String str2, String str3, String str4, long j10, long j11, float f10, String str5, boolean z10, long j12, String str6) {
        this.f6237f = gameEntity;
        this.f6238g = playerEntity;
        this.f6239h = str;
        this.f6240i = uri;
        this.f6241j = str2;
        this.f6246o = f10;
        this.f6242k = str3;
        this.f6243l = str4;
        this.f6244m = j10;
        this.f6245n = j11;
        this.f6247p = str5;
        this.f6248q = z10;
        this.f6249r = j12;
        this.f6250s = str6;
    }

    public static int a(SnapshotMetadata snapshotMetadata) {
        return k.c(snapshotMetadata.u3(), snapshotMetadata.Z0(), snapshotMetadata.q3(), snapshotMetadata.S0(), Float.valueOf(snapshotMetadata.h3()), snapshotMetadata.zza(), snapshotMetadata.getDescription(), Long.valueOf(snapshotMetadata.f0()), Long.valueOf(snapshotMetadata.V1()), snapshotMetadata.C1(), Boolean.valueOf(snapshotMetadata.Q2()), Long.valueOf(snapshotMetadata.A0()), snapshotMetadata.B2());
    }

    public static boolean v3(SnapshotMetadata snapshotMetadata, Object obj) {
        if (!(obj instanceof SnapshotMetadata)) {
            return false;
        }
        if (snapshotMetadata == obj) {
            return true;
        }
        SnapshotMetadata snapshotMetadata2 = (SnapshotMetadata) obj;
        return k.b(snapshotMetadata2.u3(), snapshotMetadata.u3()) && k.b(snapshotMetadata2.Z0(), snapshotMetadata.Z0()) && k.b(snapshotMetadata2.q3(), snapshotMetadata.q3()) && k.b(snapshotMetadata2.S0(), snapshotMetadata.S0()) && k.b(Float.valueOf(snapshotMetadata2.h3()), Float.valueOf(snapshotMetadata.h3())) && k.b(snapshotMetadata2.zza(), snapshotMetadata.zza()) && k.b(snapshotMetadata2.getDescription(), snapshotMetadata.getDescription()) && k.b(Long.valueOf(snapshotMetadata2.f0()), Long.valueOf(snapshotMetadata.f0())) && k.b(Long.valueOf(snapshotMetadata2.V1()), Long.valueOf(snapshotMetadata.V1())) && k.b(snapshotMetadata2.C1(), snapshotMetadata.C1()) && k.b(Boolean.valueOf(snapshotMetadata2.Q2()), Boolean.valueOf(snapshotMetadata.Q2())) && k.b(Long.valueOf(snapshotMetadata2.A0()), Long.valueOf(snapshotMetadata.A0())) && k.b(snapshotMetadata2.B2(), snapshotMetadata.B2());
    }

    public static String w3(SnapshotMetadata snapshotMetadata) {
        return k.d(snapshotMetadata).a("Game", snapshotMetadata.u3()).a("Owner", snapshotMetadata.Z0()).a("SnapshotId", snapshotMetadata.q3()).a("CoverImageUri", snapshotMetadata.S0()).a("CoverImageUrl", snapshotMetadata.getCoverImageUrl()).a("CoverImageAspectRatio", Float.valueOf(snapshotMetadata.h3())).a("Description", snapshotMetadata.getDescription()).a("LastModifiedTimestamp", Long.valueOf(snapshotMetadata.f0())).a("PlayedTime", Long.valueOf(snapshotMetadata.V1())).a("UniqueName", snapshotMetadata.C1()).a("ChangePending", Boolean.valueOf(snapshotMetadata.Q2())).a("ProgressValue", Long.valueOf(snapshotMetadata.A0())).a("DeviceName", snapshotMetadata.B2()).toString();
    }

    @Override // com.google.android.gms.games.snapshot.SnapshotMetadata
    public long A0() {
        return this.f6249r;
    }

    @Override // com.google.android.gms.games.snapshot.SnapshotMetadata
    @NonNull
    public String B2() {
        return this.f6250s;
    }

    @Override // com.google.android.gms.games.snapshot.SnapshotMetadata
    @NonNull
    public String C1() {
        return this.f6247p;
    }

    @Override // com.google.android.gms.games.snapshot.SnapshotMetadata
    public boolean Q2() {
        return this.f6248q;
    }

    @Override // com.google.android.gms.games.snapshot.SnapshotMetadata
    public Uri S0() {
        return this.f6240i;
    }

    @Override // com.google.android.gms.games.snapshot.SnapshotMetadata
    public long V1() {
        return this.f6245n;
    }

    @Override // com.google.android.gms.games.snapshot.SnapshotMetadata
    @NonNull
    public Player Z0() {
        return this.f6238g;
    }

    public boolean equals(Object obj) {
        return v3(this, obj);
    }

    @Override // com.google.android.gms.games.snapshot.SnapshotMetadata
    public long f0() {
        return this.f6244m;
    }

    @Override // com.google.android.gms.games.snapshot.SnapshotMetadata
    public String getCoverImageUrl() {
        return this.f6241j;
    }

    @Override // com.google.android.gms.games.snapshot.SnapshotMetadata
    @NonNull
    public String getDescription() {
        return this.f6243l;
    }

    @Override // com.google.android.gms.games.snapshot.SnapshotMetadata
    public float h3() {
        return this.f6246o;
    }

    public int hashCode() {
        return a(this);
    }

    @Override // com.google.android.gms.games.snapshot.SnapshotMetadata
    @NonNull
    public String q3() {
        return this.f6239h;
    }

    @NonNull
    public String toString() {
        return w3(this);
    }

    @Override // com.google.android.gms.games.snapshot.SnapshotMetadata
    @NonNull
    public Game u3() {
        return this.f6237f;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i10) {
        int iA = b.a(parcel);
        b.t(parcel, 1, u3(), i10, false);
        b.t(parcel, 2, Z0(), i10, false);
        b.v(parcel, 3, q3(), false);
        b.t(parcel, 5, S0(), i10, false);
        b.v(parcel, 6, getCoverImageUrl(), false);
        b.v(parcel, 7, this.f6242k, false);
        b.v(parcel, 8, getDescription(), false);
        b.r(parcel, 9, f0());
        b.r(parcel, 10, V1());
        b.k(parcel, 11, h3());
        b.v(parcel, 12, C1(), false);
        b.c(parcel, 13, Q2());
        b.r(parcel, 14, A0());
        b.v(parcel, 15, B2(), false);
        b.b(parcel, iA);
    }

    @Override // com.google.android.gms.games.snapshot.SnapshotMetadata
    @NonNull
    public final String zza() {
        return this.f6242k;
    }

    public SnapshotMetadataEntity(@NonNull SnapshotMetadata snapshotMetadata) {
        PlayerEntity playerEntity = new PlayerEntity(snapshotMetadata.Z0());
        this.f6237f = new GameEntity(snapshotMetadata.u3());
        this.f6238g = playerEntity;
        this.f6239h = snapshotMetadata.q3();
        this.f6240i = snapshotMetadata.S0();
        this.f6241j = snapshotMetadata.getCoverImageUrl();
        this.f6246o = snapshotMetadata.h3();
        this.f6242k = snapshotMetadata.zza();
        this.f6243l = snapshotMetadata.getDescription();
        this.f6244m = snapshotMetadata.f0();
        this.f6245n = snapshotMetadata.V1();
        this.f6247p = snapshotMetadata.C1();
        this.f6248q = snapshotMetadata.Q2();
        this.f6249r = snapshotMetadata.A0();
        this.f6250s = snapshotMetadata.B2();
    }
}
