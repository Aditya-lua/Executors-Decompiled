package qa;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.games.snapshot.SnapshotContentsEntity;

/* JADX INFO: loaded from: classes.dex */
public final class d implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iD = p9.b.D(parcel);
        y9.a aVar = null;
        while (parcel.dataPosition() < iD) {
            int iU = p9.b.u(parcel);
            if (p9.b.n(iU) != 1) {
                p9.b.C(parcel, iU);
            } else {
                aVar = (y9.a) p9.b.g(parcel, iU, y9.a.CREATOR);
            }
        }
        p9.b.m(parcel, iD);
        return new SnapshotContentsEntity(aVar);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new SnapshotContentsEntity[i10];
    }
}
