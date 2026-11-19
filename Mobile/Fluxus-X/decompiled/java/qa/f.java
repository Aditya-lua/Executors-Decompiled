package qa;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.data.BitmapTeleporter;
import com.google.android.gms.games.snapshot.SnapshotMetadataChangeEntity;

/* JADX INFO: loaded from: classes.dex */
public final class f implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iD = p9.b.D(parcel);
        String strH = null;
        Long lZ = null;
        BitmapTeleporter bitmapTeleporter = null;
        Uri uri = null;
        Long lZ2 = null;
        while (parcel.dataPosition() < iD) {
            int iU = p9.b.u(parcel);
            int iN = p9.b.n(iU);
            if (iN == 1) {
                strH = p9.b.h(parcel, iU);
            } else if (iN == 2) {
                lZ = p9.b.z(parcel, iU);
            } else if (iN == 4) {
                uri = (Uri) p9.b.g(parcel, iU, Uri.CREATOR);
            } else if (iN == 5) {
                bitmapTeleporter = (BitmapTeleporter) p9.b.g(parcel, iU, BitmapTeleporter.CREATOR);
            } else if (iN != 6) {
                p9.b.C(parcel, iU);
            } else {
                lZ2 = p9.b.z(parcel, iU);
            }
        }
        p9.b.m(parcel, iD);
        return new SnapshotMetadataChangeEntity(strH, lZ, bitmapTeleporter, uri, lZ2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new SnapshotMetadataChangeEntity[i10];
    }
}
