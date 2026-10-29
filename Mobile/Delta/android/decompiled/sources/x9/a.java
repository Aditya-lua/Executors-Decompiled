package x9;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.drive.Contents;
import com.google.android.gms.drive.DriveId;

/* JADX INFO: loaded from: classes.dex */
public final class a implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iD = o9.a.D(parcel);
        ParcelFileDescriptor parcelFileDescriptor = null;
        DriveId driveId = null;
        String strH = null;
        int iW = 0;
        int iW2 = 0;
        boolean zO = false;
        while (parcel.dataPosition() < iD) {
            int iU = o9.a.u(parcel);
            int iN = o9.a.n(iU);
            if (iN == 2) {
                parcelFileDescriptor = (ParcelFileDescriptor) o9.a.g(parcel, iU, ParcelFileDescriptor.CREATOR);
            } else if (iN == 3) {
                iW = o9.a.w(parcel, iU);
            } else if (iN == 4) {
                iW2 = o9.a.w(parcel, iU);
            } else if (iN == 5) {
                driveId = (DriveId) o9.a.g(parcel, iU, DriveId.CREATOR);
            } else if (iN == 7) {
                zO = o9.a.o(parcel, iU);
            } else if (iN != 8) {
                o9.a.C(parcel, iU);
            } else {
                strH = o9.a.h(parcel, iU);
            }
        }
        o9.a.m(parcel, iD);
        return new Contents(parcelFileDescriptor, iW, iW2, driveId, zO, strH);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new Contents[i10];
    }
}
