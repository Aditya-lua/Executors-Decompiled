package com.google.android.gms.games.snapshot;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.apps.common.proguard.UsedByReflection;
import com.google.android.gms.games.internal.zzg;
import p305n9.C8947k;
import p325o9.C9718b;
import pa.C10184b;

/* JADX INFO: loaded from: classes.dex */
@UsedByReflection("GamesGmsClientImpl.java")
public final class SnapshotEntity extends zzg implements Snapshot {

    @NonNull
    public static final Parcelable.Creator<SnapshotEntity> CREATOR = new C10184b();

    /* JADX INFO: renamed from: f */
    public final SnapshotMetadataEntity f7950f;

    /* JADX INFO: renamed from: g */
    public final SnapshotContentsEntity f7951g;

    public SnapshotEntity(@NonNull SnapshotMetadata snapshotMetadata, @NonNull SnapshotContentsEntity snapshotContentsEntity) {
        this.f7950f = new SnapshotMetadataEntity(snapshotMetadata);
        this.f7951g = snapshotContentsEntity;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Snapshot)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        Snapshot snapshot = (Snapshot) obj;
        return C8947k.m36026b(snapshot.getMetadata(), getMetadata()) && C8947k.m36026b(snapshot.mo9494m3(), mo9494m3());
    }

    @Override // com.google.android.gms.games.snapshot.Snapshot
    @NonNull
    public SnapshotMetadata getMetadata() {
        return this.f7950f;
    }

    public int hashCode() {
        return C8947k.m36027c(getMetadata(), mo9494m3());
    }

    @Override // com.google.android.gms.games.snapshot.Snapshot
    /* JADX INFO: renamed from: m3 */
    public SnapshotContents mo9494m3() {
        SnapshotContentsEntity snapshotContentsEntity = this.f7951g;
        if (snapshotContentsEntity.isClosed()) {
            return null;
        }
        return snapshotContentsEntity;
    }

    @NonNull
    public String toString() {
        return C8947k.m36028d(this).m36029a("Metadata", getMetadata()).m36029a("HasContents", Boolean.valueOf(mo9494m3() != null)).toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i10) {
        int iM38457a = C9718b.m38457a(parcel);
        C9718b.m38476t(parcel, 1, getMetadata(), i10, false);
        C9718b.m38476t(parcel, 3, mo9494m3(), i10, false);
        C9718b.m38458b(parcel, iM38457a);
    }
}
