package pa;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.data.BitmapTeleporter;
import com.google.android.gms.games.snapshot.SnapshotMetadataChangeEntity;

/* JADX INFO: loaded from: classes.dex */
public final class c implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iD = o9.a.D(parcel);
        String strH = null;
        Long lZ = null;
        BitmapTeleporter bitmapTeleporter = null;
        Uri uri = null;
        Long lZ2 = null;
        while (parcel.dataPosition() < iD) {
            int iU = o9.a.u(parcel);
            int iN = o9.a.n(iU);
            if (iN == 1) {
                strH = o9.a.h(parcel, iU);
            } else if (iN == 2) {
                lZ = o9.a.z(parcel, iU);
            } else if (iN == 4) {
                uri = (Uri) o9.a.g(parcel, iU, Uri.CREATOR);
            } else if (iN == 5) {
                bitmapTeleporter = (BitmapTeleporter) o9.a.g(parcel, iU, BitmapTeleporter.CREATOR);
            } else if (iN != 6) {
                o9.a.C(parcel, iU);
            } else {
                lZ2 = o9.a.z(parcel, iU);
            }
        }
        o9.a.m(parcel, iD);
        return new SnapshotMetadataChangeEntity(strH, lZ, bitmapTeleporter, uri, lZ2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new SnapshotMetadataChangeEntity[i10];
    }
}
