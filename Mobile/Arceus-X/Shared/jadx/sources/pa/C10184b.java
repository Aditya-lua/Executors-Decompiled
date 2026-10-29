package pa;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.games.snapshot.SnapshotContentsEntity;
import com.google.android.gms.games.snapshot.SnapshotEntity;
import com.google.android.gms.games.snapshot.SnapshotMetadataEntity;
import p325o9.C9717a;

/* JADX INFO: renamed from: pa.b */
/* JADX INFO: loaded from: classes.dex */
public final class C10184b implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iM38424D = C9717a.m38424D(parcel);
        SnapshotMetadataEntity snapshotMetadataEntity = null;
        SnapshotContentsEntity snapshotContentsEntity = null;
        while (parcel.dataPosition() < iM38424D) {
            int iM38447u = C9717a.m38447u(parcel);
            int iM38440n = C9717a.m38440n(iM38447u);
            if (iM38440n == 1) {
                snapshotMetadataEntity = (SnapshotMetadataEntity) C9717a.m38433g(parcel, iM38447u, SnapshotMetadataEntity.CREATOR);
            } else if (iM38440n != 3) {
                C9717a.m38423C(parcel, iM38447u);
            } else {
                snapshotContentsEntity = (SnapshotContentsEntity) C9717a.m38433g(parcel, iM38447u, SnapshotContentsEntity.CREATOR);
            }
        }
        C9717a.m38439m(parcel, iM38424D);
        return new SnapshotEntity(snapshotMetadataEntity, snapshotContentsEntity);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new SnapshotEntity[i10];
    }
}
