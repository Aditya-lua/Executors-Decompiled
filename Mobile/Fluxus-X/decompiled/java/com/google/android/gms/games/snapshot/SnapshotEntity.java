package com.google.android.gms.games.snapshot;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.apps.common.proguard.UsedByReflection;
import ha.p;
import o9.q;
import qa.a;
import qa.b;
import qa.c;
import qa.e;

/* JADX INFO: loaded from: classes.dex */
@UsedByReflection("GamesGmsClientImpl.java")
public final class SnapshotEntity extends p implements a {

    @NonNull
    public static final Parcelable.Creator<SnapshotEntity> CREATOR = new e();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final SnapshotMetadataEntity f6328f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final SnapshotContentsEntity f6329g;

    public SnapshotEntity(@NonNull c cVar, @NonNull SnapshotContentsEntity snapshotContentsEntity) {
        this.f6328f = new SnapshotMetadataEntity(cVar);
        this.f6329g = snapshotContentsEntity;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        a aVar = (a) obj;
        return q.b(aVar.getMetadata(), getMetadata()) && q.b(aVar.s3(), s3());
    }

    @Override // qa.a
    @NonNull
    public c getMetadata() {
        return this.f6328f;
    }

    public int hashCode() {
        return q.c(getMetadata(), s3());
    }

    @Override // qa.a
    public b s3() {
        SnapshotContentsEntity snapshotContentsEntity = this.f6329g;
        if (snapshotContentsEntity.isClosed()) {
            return null;
        }
        return snapshotContentsEntity;
    }

    @NonNull
    public String toString() {
        return q.d(this).a("Metadata", getMetadata()).a("HasContents", Boolean.valueOf(s3() != null)).toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i10) {
        int iA = p9.c.a(parcel);
        p9.c.t(parcel, 1, getMetadata(), i10, false);
        p9.c.t(parcel, 3, s3(), i10, false);
        p9.c.b(parcel, iA);
    }
}
