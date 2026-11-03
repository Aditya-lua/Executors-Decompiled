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
    public final GameEntity f6310f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final PlayerEntity f6311g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f6312h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Uri f6313i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f6314j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final String f6315k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final String f6316l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final long f6317m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final long f6318n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final float f6319o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final String f6320p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final boolean f6321q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final long f6322r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final String f6323s;

    public SnapshotMetadataEntity(GameEntity gameEntity, PlayerEntity playerEntity, String str, Uri uri, String str2, String str3, String str4, long j10, long j11, float f10, String str5, boolean z10, long j12, String str6) {
        this.f6310f = gameEntity;
        this.f6311g = playerEntity;
        this.f6312h = str;
        this.f6313i = uri;
        this.f6314j = str2;
        this.f6319o = f10;
        this.f6315k = str3;
        this.f6316l = str4;
        this.f6317m = j10;
        this.f6318n = j11;
        this.f6320p = str5;
        this.f6321q = z10;
        this.f6322r = j12;
        this.f6323s = str6;
    }

    public static int a(SnapshotMetadata snapshotMetadata) {
        return k.c(snapshotMetadata.u3(), snapshotMetadata.V0(), snapshotMetadata.q3(), snapshotMetadata.O0(), Float.valueOf(snapshotMetadata.j3()), snapshotMetadata.zza(), snapshotMetadata.getDescription(), Long.valueOf(snapshotMetadata.d0()), Long.valueOf(snapshotMetadata.V1()), snapshotMetadata.A1(), Boolean.valueOf(snapshotMetadata.P2()), Long.valueOf(snapshotMetadata.w0()), snapshotMetadata.C2());
    }

    public static boolean v3(SnapshotMetadata snapshotMetadata, Object obj) {
        if (!(obj instanceof SnapshotMetadata)) {
            return false;
        }
        if (snapshotMetadata == obj) {
            return true;
        }
        SnapshotMetadata snapshotMetadata2 = (SnapshotMetadata) obj;
        return k.b(snapshotMetadata2.u3(), snapshotMetadata.u3()) && k.b(snapshotMetadata2.V0(), snapshotMetadata.V0()) && k.b(snapshotMetadata2.q3(), snapshotMetadata.q3()) && k.b(snapshotMetadata2.O0(), snapshotMetadata.O0()) && k.b(Float.valueOf(snapshotMetadata2.j3()), Float.valueOf(snapshotMetadata.j3())) && k.b(snapshotMetadata2.zza(), snapshotMetadata.zza()) && k.b(snapshotMetadata2.getDescription(), snapshotMetadata.getDescription()) && k.b(Long.valueOf(snapshotMetadata2.d0()), Long.valueOf(snapshotMetadata.d0())) && k.b(Long.valueOf(snapshotMetadata2.V1()), Long.valueOf(snapshotMetadata.V1())) && k.b(snapshotMetadata2.A1(), snapshotMetadata.A1()) && k.b(Boolean.valueOf(snapshotMetadata2.P2()), Boolean.valueOf(snapshotMetadata.P2())) && k.b(Long.valueOf(snapshotMetadata2.w0()), Long.valueOf(snapshotMetadata.w0())) && k.b(snapshotMetadata2.C2(), snapshotMetadata.C2());
    }

    public static String w3(SnapshotMetadata snapshotMetadata) {
        return k.d(snapshotMetadata).a("Game", snapshotMetadata.u3()).a("Owner", snapshotMetadata.V0()).a("SnapshotId", snapshotMetadata.q3()).a("CoverImageUri", snapshotMetadata.O0()).a("CoverImageUrl", snapshotMetadata.getCoverImageUrl()).a("CoverImageAspectRatio", Float.valueOf(snapshotMetadata.j3())).a("Description", snapshotMetadata.getDescription()).a("LastModifiedTimestamp", Long.valueOf(snapshotMetadata.d0())).a("PlayedTime", Long.valueOf(snapshotMetadata.V1())).a("UniqueName", snapshotMetadata.A1()).a("ChangePending", Boolean.valueOf(snapshotMetadata.P2())).a("ProgressValue", Long.valueOf(snapshotMetadata.w0())).a("DeviceName", snapshotMetadata.C2()).toString();
    }

    @Override // com.google.android.gms.games.snapshot.SnapshotMetadata
    @NonNull
    public String A1() {
        return this.f6320p;
    }

    @Override // com.google.android.gms.games.snapshot.SnapshotMetadata
    @NonNull
    public String C2() {
        return this.f6323s;
    }

    @Override // com.google.android.gms.games.snapshot.SnapshotMetadata
    public Uri O0() {
        return this.f6313i;
    }

    @Override // com.google.android.gms.games.snapshot.SnapshotMetadata
    public boolean P2() {
        return this.f6321q;
    }

    @Override // com.google.android.gms.games.snapshot.SnapshotMetadata
    @NonNull
    public Player V0() {
        return this.f6311g;
    }

    @Override // com.google.android.gms.games.snapshot.SnapshotMetadata
    public long V1() {
        return this.f6318n;
    }

    @Override // com.google.android.gms.games.snapshot.SnapshotMetadata
    public long d0() {
        return this.f6317m;
    }

    public boolean equals(Object obj) {
        return v3(this, obj);
    }

    @Override // com.google.android.gms.games.snapshot.SnapshotMetadata
    public String getCoverImageUrl() {
        return this.f6314j;
    }

    @Override // com.google.android.gms.games.snapshot.SnapshotMetadata
    @NonNull
    public String getDescription() {
        return this.f6316l;
    }

    public int hashCode() {
        return a(this);
    }

    @Override // com.google.android.gms.games.snapshot.SnapshotMetadata
    public float j3() {
        return this.f6319o;
    }

    @Override // com.google.android.gms.games.snapshot.SnapshotMetadata
    @NonNull
    public String q3() {
        return this.f6312h;
    }

    @NonNull
    public String toString() {
        return w3(this);
    }

    @Override // com.google.android.gms.games.snapshot.SnapshotMetadata
    @NonNull
    public Game u3() {
        return this.f6310f;
    }

    @Override // com.google.android.gms.games.snapshot.SnapshotMetadata
    public long w0() {
        return this.f6322r;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i10) {
        int iA = b.a(parcel);
        b.t(parcel, 1, u3(), i10, false);
        b.t(parcel, 2, V0(), i10, false);
        b.v(parcel, 3, q3(), false);
        b.t(parcel, 5, O0(), i10, false);
        b.v(parcel, 6, getCoverImageUrl(), false);
        b.v(parcel, 7, this.f6315k, false);
        b.v(parcel, 8, getDescription(), false);
        b.r(parcel, 9, d0());
        b.r(parcel, 10, V1());
        b.k(parcel, 11, j3());
        b.v(parcel, 12, A1(), false);
        b.c(parcel, 13, P2());
        b.r(parcel, 14, w0());
        b.v(parcel, 15, C2(), false);
        b.b(parcel, iA);
    }

    @Override // com.google.android.gms.games.snapshot.SnapshotMetadata
    @NonNull
    public final String zza() {
        return this.f6315k;
    }

    public SnapshotMetadataEntity(@NonNull SnapshotMetadata snapshotMetadata) {
        PlayerEntity playerEntity = new PlayerEntity(snapshotMetadata.V0());
        this.f6310f = new GameEntity(snapshotMetadata.u3());
        this.f6311g = playerEntity;
        this.f6312h = snapshotMetadata.q3();
        this.f6313i = snapshotMetadata.O0();
        this.f6314j = snapshotMetadata.getCoverImageUrl();
        this.f6319o = snapshotMetadata.j3();
        this.f6315k = snapshotMetadata.zza();
        this.f6316l = snapshotMetadata.getDescription();
        this.f6317m = snapshotMetadata.d0();
        this.f6318n = snapshotMetadata.V1();
        this.f6320p = snapshotMetadata.A1();
        this.f6321q = snapshotMetadata.P2();
        this.f6322r = snapshotMetadata.w0();
        this.f6323s = snapshotMetadata.C2();
    }
}
