package pa;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.games.snapshot.SnapshotContentsEntity;
import com.google.android.gms.games.snapshot.SnapshotEntity;
import com.google.android.gms.games.snapshot.SnapshotMetadataEntity;

/* JADX INFO: loaded from: classes.dex */
public final class b implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iD = o9.a.D(parcel);
        SnapshotMetadataEntity snapshotMetadataEntity = null;
        SnapshotContentsEntity snapshotContentsEntity = null;
        while (parcel.dataPosition() < iD) {
            int iU = o9.a.u(parcel);
            int iN = o9.a.n(iU);
            if (iN == 1) {
                snapshotMetadataEntity = (SnapshotMetadataEntity) o9.a.g(parcel, iU, SnapshotMetadataEntity.CREATOR);
            } else if (iN != 3) {
                o9.a.C(parcel, iU);
            } else {
                snapshotContentsEntity = (SnapshotContentsEntity) o9.a.g(parcel, iU, SnapshotContentsEntity.CREATOR);
            }
        }
        o9.a.m(parcel, iD);
        return new SnapshotEntity(snapshotMetadataEntity, snapshotContentsEntity);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new SnapshotEntity[i10];
    }
}
