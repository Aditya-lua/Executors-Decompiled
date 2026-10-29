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
import p305n9.C8947k;
import p325o9.C9718b;
import pa.C10186d;

/* JADX INFO: loaded from: classes.dex */
@UsedByReflection("GamesGmsClientImpl.java")
public final class SnapshotMetadataEntity extends zzg implements SnapshotMetadata {

    @NonNull
    public static final Parcelable.Creator<SnapshotMetadataEntity> CREATOR = new C10186d();

    /* JADX INFO: renamed from: f */
    public final GameEntity f7957f;

    /* JADX INFO: renamed from: g */
    public final PlayerEntity f7958g;

    /* JADX INFO: renamed from: h */
    public final String f7959h;

    /* JADX INFO: renamed from: i */
    public final Uri f7960i;

    /* JADX INFO: renamed from: j */
    public final String f7961j;

    /* JADX INFO: renamed from: k */
    public final String f7962k;

    /* JADX INFO: renamed from: l */
    public final String f7963l;

    /* JADX INFO: renamed from: m */
    public final long f7964m;

    /* JADX INFO: renamed from: n */
    public final long f7965n;

    /* JADX INFO: renamed from: o */
    public final float f7966o;

    /* JADX INFO: renamed from: p */
    public final String f7967p;

    /* JADX INFO: renamed from: q */
    public final boolean f7968q;

    /* JADX INFO: renamed from: r */
    public final long f7969r;

    /* JADX INFO: renamed from: s */
    public final String f7970s;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public SnapshotMetadataEntity(GameEntity gameEntity, PlayerEntity playerEntity, String str, Uri uri, String str2, String str3, String str4, long j10, long j11, float f10, String str5, boolean z10, long j12, String str6) {
        this.f7957f = gameEntity;
        this.f7958g = playerEntity;
        this.f7959h = str;
        this.f7960i = uri;
        this.f7961j = str2;
        this.f7966o = f10;
        this.f7962k = str3;
        this.f7963l = str4;
        this.f7964m = j10;
        this.f7965n = j11;
        this.f7967p = str5;
        this.f7968q = z10;
        this.f7969r = j12;
        this.f7970s = str6;
    }

    /* JADX INFO: renamed from: a */
    public static int m9506a(SnapshotMetadata snapshotMetadata) {
        return C8947k.m36027c(snapshotMetadata.mo9505u3(), snapshotMetadata.mo9501Z0(), snapshotMetadata.mo9504q3(), snapshotMetadata.mo9499S0(), Float.valueOf(snapshotMetadata.mo9503h3()), snapshotMetadata.zza(), snapshotMetadata.getDescription(), Long.valueOf(snapshotMetadata.mo9502f0()), Long.valueOf(snapshotMetadata.mo9500V1()), snapshotMetadata.mo9497C1(), Boolean.valueOf(snapshotMetadata.mo9498Q2()), Long.valueOf(snapshotMetadata.mo9495A0()), snapshotMetadata.mo9496B2());
    }

    /* JADX INFO: renamed from: v3 */
    public static boolean m9507v3(SnapshotMetadata snapshotMetadata, Object obj) {
        if (!(obj instanceof SnapshotMetadata)) {
            return false;
        }
        if (snapshotMetadata == obj) {
            return true;
        }
        SnapshotMetadata snapshotMetadata2 = (SnapshotMetadata) obj;
        return C8947k.m36026b(snapshotMetadata2.mo9505u3(), snapshotMetadata.mo9505u3()) && C8947k.m36026b(snapshotMetadata2.mo9501Z0(), snapshotMetadata.mo9501Z0()) && C8947k.m36026b(snapshotMetadata2.mo9504q3(), snapshotMetadata.mo9504q3()) && C8947k.m36026b(snapshotMetadata2.mo9499S0(), snapshotMetadata.mo9499S0()) && C8947k.m36026b(Float.valueOf(snapshotMetadata2.mo9503h3()), Float.valueOf(snapshotMetadata.mo9503h3())) && C8947k.m36026b(snapshotMetadata2.zza(), snapshotMetadata.zza()) && C8947k.m36026b(snapshotMetadata2.getDescription(), snapshotMetadata.getDescription()) && C8947k.m36026b(Long.valueOf(snapshotMetadata2.mo9502f0()), Long.valueOf(snapshotMetadata.mo9502f0())) && C8947k.m36026b(Long.valueOf(snapshotMetadata2.mo9500V1()), Long.valueOf(snapshotMetadata.mo9500V1())) && C8947k.m36026b(snapshotMetadata2.mo9497C1(), snapshotMetadata.mo9497C1()) && C8947k.m36026b(Boolean.valueOf(snapshotMetadata2.mo9498Q2()), Boolean.valueOf(snapshotMetadata.mo9498Q2())) && C8947k.m36026b(Long.valueOf(snapshotMetadata2.mo9495A0()), Long.valueOf(snapshotMetadata.mo9495A0())) && C8947k.m36026b(snapshotMetadata2.mo9496B2(), snapshotMetadata.mo9496B2());
    }

    /* JADX INFO: renamed from: w3 */
    public static String m9508w3(SnapshotMetadata snapshotMetadata) {
        return C8947k.m36028d(snapshotMetadata).m36029a("Game", snapshotMetadata.mo9505u3()).m36029a("Owner", snapshotMetadata.mo9501Z0()).m36029a("SnapshotId", snapshotMetadata.mo9504q3()).m36029a("CoverImageUri", snapshotMetadata.mo9499S0()).m36029a("CoverImageUrl", snapshotMetadata.getCoverImageUrl()).m36029a("CoverImageAspectRatio", Float.valueOf(snapshotMetadata.mo9503h3())).m36029a("Description", snapshotMetadata.getDescription()).m36029a("LastModifiedTimestamp", Long.valueOf(snapshotMetadata.mo9502f0())).m36029a("PlayedTime", Long.valueOf(snapshotMetadata.mo9500V1())).m36029a("UniqueName", snapshotMetadata.mo9497C1()).m36029a("ChangePending", Boolean.valueOf(snapshotMetadata.mo9498Q2())).m36029a("ProgressValue", Long.valueOf(snapshotMetadata.mo9495A0())).m36029a("DeviceName", snapshotMetadata.mo9496B2()).toString();
    }

    @Override // com.google.android.gms.games.snapshot.SnapshotMetadata
    /* JADX INFO: renamed from: A0 */
    public long mo9495A0() {
        return this.f7969r;
    }

    @Override // com.google.android.gms.games.snapshot.SnapshotMetadata
    @NonNull
    /* JADX INFO: renamed from: B2 */
    public String mo9496B2() {
        return this.f7970s;
    }

    @Override // com.google.android.gms.games.snapshot.SnapshotMetadata
    @NonNull
    /* JADX INFO: renamed from: C1 */
    public String mo9497C1() {
        return this.f7967p;
    }

    @Override // com.google.android.gms.games.snapshot.SnapshotMetadata
    /* JADX INFO: renamed from: Q2 */
    public boolean mo9498Q2() {
        return this.f7968q;
    }

    @Override // com.google.android.gms.games.snapshot.SnapshotMetadata
    /* JADX INFO: renamed from: S0 */
    public Uri mo9499S0() {
        return this.f7960i;
    }

    @Override // com.google.android.gms.games.snapshot.SnapshotMetadata
    /* JADX INFO: renamed from: V1 */
    public long mo9500V1() {
        return this.f7965n;
    }

    @Override // com.google.android.gms.games.snapshot.SnapshotMetadata
    @NonNull
    /* JADX INFO: renamed from: Z0 */
    public Player mo9501Z0() {
        return this.f7958g;
    }

    public boolean equals(Object obj) {
        return m9507v3(this, obj);
    }

    @Override // com.google.android.gms.games.snapshot.SnapshotMetadata
    /* JADX INFO: renamed from: f0 */
    public long mo9502f0() {
        return this.f7964m;
    }

    @Override // com.google.android.gms.games.snapshot.SnapshotMetadata
    public String getCoverImageUrl() {
        return this.f7961j;
    }

    @Override // com.google.android.gms.games.snapshot.SnapshotMetadata
    @NonNull
    public String getDescription() {
        return this.f7963l;
    }

    @Override // com.google.android.gms.games.snapshot.SnapshotMetadata
    /* JADX INFO: renamed from: h3 */
    public float mo9503h3() {
        return this.f7966o;
    }

    public int hashCode() {
        return m9506a(this);
    }

    @Override // com.google.android.gms.games.snapshot.SnapshotMetadata
    @NonNull
    /* JADX INFO: renamed from: q3 */
    public String mo9504q3() {
        return this.f7959h;
    }

    @NonNull
    public String toString() {
        return m9508w3(this);
    }

    @Override // com.google.android.gms.games.snapshot.SnapshotMetadata
    @NonNull
    /* JADX INFO: renamed from: u3 */
    public Game mo9505u3() {
        return this.f7957f;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i10) {
        int iM38457a = C9718b.m38457a(parcel);
        C9718b.m38476t(parcel, 1, mo9505u3(), i10, false);
        C9718b.m38476t(parcel, 2, mo9501Z0(), i10, false);
        C9718b.m38478v(parcel, 3, mo9504q3(), false);
        C9718b.m38476t(parcel, 5, mo9499S0(), i10, false);
        C9718b.m38478v(parcel, 6, getCoverImageUrl(), false);
        C9718b.m38478v(parcel, 7, this.f7962k, false);
        C9718b.m38478v(parcel, 8, getDescription(), false);
        C9718b.m38474r(parcel, 9, mo9502f0());
        C9718b.m38474r(parcel, 10, mo9500V1());
        C9718b.m38467k(parcel, 11, mo9503h3());
        C9718b.m38478v(parcel, 12, mo9497C1(), false);
        C9718b.m38459c(parcel, 13, mo9498Q2());
        C9718b.m38474r(parcel, 14, mo9495A0());
        C9718b.m38478v(parcel, 15, mo9496B2(), false);
        C9718b.m38458b(parcel, iM38457a);
    }

    @Override // com.google.android.gms.games.snapshot.SnapshotMetadata
    @NonNull
    public final String zza() {
        return this.f7962k;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public SnapshotMetadataEntity(@NonNull SnapshotMetadata snapshotMetadata) {
        PlayerEntity playerEntity = new PlayerEntity(snapshotMetadata.mo9501Z0());
        this.f7957f = new GameEntity(snapshotMetadata.mo9505u3());
        this.f7958g = playerEntity;
        this.f7959h = snapshotMetadata.mo9504q3();
        this.f7960i = snapshotMetadata.mo9499S0();
        this.f7961j = snapshotMetadata.getCoverImageUrl();
        this.f7966o = snapshotMetadata.mo9503h3();
        this.f7962k = snapshotMetadata.zza();
        this.f7963l = snapshotMetadata.getDescription();
        this.f7964m = snapshotMetadata.mo9502f0();
        this.f7965n = snapshotMetadata.mo9500V1();
        this.f7967p = snapshotMetadata.mo9497C1();
        this.f7968q = snapshotMetadata.mo9498Q2();
        this.f7969r = snapshotMetadata.mo9495A0();
        this.f7970s = snapshotMetadata.mo9496B2();
    }
}
