package p540x9;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.drive.Contents;
import com.google.android.gms.drive.DriveId;
import p325o9.C9717a;

/* JADX INFO: renamed from: x9.a */
/* JADX INFO: loaded from: classes.dex */
public final class C12773a implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iM38424D = C9717a.m38424D(parcel);
        ParcelFileDescriptor parcelFileDescriptor = null;
        DriveId driveId = null;
        String strM38434h = null;
        int iM38449w = 0;
        int iM38449w2 = 0;
        boolean zM38441o = false;
        while (parcel.dataPosition() < iM38424D) {
            int iM38447u = C9717a.m38447u(parcel);
            int iM38440n = C9717a.m38440n(iM38447u);
            if (iM38440n == 2) {
                parcelFileDescriptor = (ParcelFileDescriptor) C9717a.m38433g(parcel, iM38447u, ParcelFileDescriptor.CREATOR);
            } else if (iM38440n == 3) {
                iM38449w = C9717a.m38449w(parcel, iM38447u);
            } else if (iM38440n == 4) {
                iM38449w2 = C9717a.m38449w(parcel, iM38447u);
            } else if (iM38440n == 5) {
                driveId = (DriveId) C9717a.m38433g(parcel, iM38447u, DriveId.CREATOR);
            } else if (iM38440n == 7) {
                zM38441o = C9717a.m38441o(parcel, iM38447u);
            } else if (iM38440n != 8) {
                C9717a.m38423C(parcel, iM38447u);
            } else {
                strM38434h = C9717a.m38434h(parcel, iM38447u);
            }
        }
        C9717a.m38439m(parcel, iM38424D);
        return new Contents(parcelFileDescriptor, iM38449w, iM38449w2, driveId, zM38441o, strM38434h);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new Contents[i10];
    }
}
