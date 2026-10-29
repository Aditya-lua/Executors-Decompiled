package com.google.android.gms.games.snapshot;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.apps.common.proguard.UsedByReflection;
import com.google.android.gms.games.internal.zzg;
import n9.k;
import pa.b;

/* JADX INFO: loaded from: classes.dex */
@UsedByReflection("GamesGmsClientImpl.java")
public final class SnapshotEntity extends zzg implements Snapshot {

    @NonNull
    public static final Parcelable.Creator<SnapshotEntity> CREATOR = new b();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final SnapshotMetadataEntity f6230f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final SnapshotContentsEntity f6231g;

    public SnapshotEntity(@NonNull SnapshotMetadata snapshotMetadata, @NonNull SnapshotContentsEntity snapshotContentsEntity) {
        this.f6230f = new SnapshotMetadataEntity(snapshotMetadata);
        this.f6231g = snapshotContentsEntity;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Snapshot)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        Snapshot snapshot = (Snapshot) obj;
        return k.b(snapshot.getMetadata(), getMetadata()) && k.b(snapshot.m3(), m3());
    }

    @Override // com.google.android.gms.games.snapshot.Snapshot
    @NonNull
    public SnapshotMetadata getMetadata() {
        return this.f6230f;
    }

    public int hashCode() {
        return k.c(getMetadata(), m3());
    }

    @Override // com.google.android.gms.games.snapshot.Snapshot
    public SnapshotContents m3() {
        SnapshotContentsEntity snapshotContentsEntity = this.f6231g;
        if (snapshotContentsEntity.isClosed()) {
            return null;
        }
        return snapshotContentsEntity;
    }

    @NonNull
    public String toString() {
        return k.d(this).a("Metadata", getMetadata()).a("HasContents", Boolean.valueOf(m3() != null)).toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i10) {
        int iA = o9.b.a(parcel);
        o9.b.t(parcel, 1, getMetadata(), i10, false);
        o9.b.t(parcel, 3, m3(), i10, false);
        o9.b.b(parcel, iA);
    }
}
