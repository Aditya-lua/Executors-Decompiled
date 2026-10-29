package pa;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.data.BitmapTeleporter;
import com.google.android.gms.games.snapshot.SnapshotMetadataChangeEntity;
import p325o9.C9717a;

/* JADX INFO: renamed from: pa.c */
/* JADX INFO: loaded from: classes.dex */
public final class C10185c implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iM38424D = C9717a.m38424D(parcel);
        String strM38434h = null;
        Long lM38452z = null;
        BitmapTeleporter bitmapTeleporter = null;
        Uri uri = null;
        Long lM38452z2 = null;
        while (parcel.dataPosition() < iM38424D) {
            int iM38447u = C9717a.m38447u(parcel);
            int iM38440n = C9717a.m38440n(iM38447u);
            if (iM38440n == 1) {
                strM38434h = C9717a.m38434h(parcel, iM38447u);
            } else if (iM38440n == 2) {
                lM38452z = C9717a.m38452z(parcel, iM38447u);
            } else if (iM38440n == 4) {
                uri = (Uri) C9717a.m38433g(parcel, iM38447u, Uri.CREATOR);
            } else if (iM38440n == 5) {
                bitmapTeleporter = (BitmapTeleporter) C9717a.m38433g(parcel, iM38447u, BitmapTeleporter.CREATOR);
            } else if (iM38440n != 6) {
                C9717a.m38423C(parcel, iM38447u);
            } else {
                lM38452z2 = C9717a.m38452z(parcel, iM38447u);
            }
        }
        C9717a.m38439m(parcel, iM38424D);
        return new SnapshotMetadataChangeEntity(strM38434h, lM38452z, bitmapTeleporter, uri, lM38452z2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new SnapshotMetadataChangeEntity[i10];
    }
}
