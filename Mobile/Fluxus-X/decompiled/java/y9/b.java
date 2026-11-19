package y9;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.drive.DriveId;

/* JADX INFO: loaded from: classes.dex */
public final class b implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iD = p9.b.D(parcel);
        ParcelFileDescriptor parcelFileDescriptor = null;
        DriveId driveId = null;
        String strH = null;
        int iW = 0;
        int iW2 = 0;
        boolean zO = false;
        while (parcel.dataPosition() < iD) {
            int iU = p9.b.u(parcel);
            int iN = p9.b.n(iU);
            if (iN == 2) {
                parcelFileDescriptor = (ParcelFileDescriptor) p9.b.g(parcel, iU, ParcelFileDescriptor.CREATOR);
            } else if (iN == 3) {
                iW = p9.b.w(parcel, iU);
            } else if (iN == 4) {
                iW2 = p9.b.w(parcel, iU);
            } else if (iN == 5) {
                driveId = (DriveId) p9.b.g(parcel, iU, DriveId.CREATOR);
            } else if (iN == 7) {
                zO = p9.b.o(parcel, iU);
            } else if (iN != 8) {
                p9.b.C(parcel, iU);
            } else {
                strH = p9.b.h(parcel, iU);
            }
        }
        p9.b.m(parcel, iD);
        return new a(parcelFileDescriptor, iW, iW2, driveId, zO, strH);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new a[i10];
    }
}
