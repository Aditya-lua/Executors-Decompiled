package qa;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.games.snapshot.SnapshotContentsEntity;
import com.google.android.gms.games.snapshot.SnapshotEntity;
import com.google.android.gms.games.snapshot.SnapshotMetadataEntity;

/* JADX INFO: loaded from: classes.dex */
public final class e implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iD = p9.b.D(parcel);
        SnapshotMetadataEntity snapshotMetadataEntity = null;
        SnapshotContentsEntity snapshotContentsEntity = null;
        while (parcel.dataPosition() < iD) {
            int iU = p9.b.u(parcel);
            int iN = p9.b.n(iU);
            if (iN == 1) {
                snapshotMetadataEntity = (SnapshotMetadataEntity) p9.b.g(parcel, iU, SnapshotMetadataEntity.CREATOR);
            } else if (iN != 3) {
                p9.b.C(parcel, iU);
            } else {
                snapshotContentsEntity = (SnapshotContentsEntity) p9.b.g(parcel, iU, SnapshotContentsEntity.CREATOR);
            }
        }
        p9.b.m(parcel, iD);
        return new SnapshotEntity(snapshotMetadataEntity, snapshotContentsEntity);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new SnapshotEntity[i10];
    }
}
