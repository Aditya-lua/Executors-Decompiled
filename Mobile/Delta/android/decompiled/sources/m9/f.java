package m9;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.common.data.BitmapTeleporter;

/* JADX INFO: loaded from: classes.dex */
public final class f implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iD = o9.a.D(parcel);
        int iW = 0;
        ParcelFileDescriptor parcelFileDescriptor = null;
        int iW2 = 0;
        while (parcel.dataPosition() < iD) {
            int iU = o9.a.u(parcel);
            int iN = o9.a.n(iU);
            if (iN == 1) {
                iW = o9.a.w(parcel, iU);
            } else if (iN == 2) {
                parcelFileDescriptor = (ParcelFileDescriptor) o9.a.g(parcel, iU, ParcelFileDescriptor.CREATOR);
            } else if (iN != 3) {
                o9.a.C(parcel, iU);
            } else {
                iW2 = o9.a.w(parcel, iU);
            }
        }
        o9.a.m(parcel, iD);
        return new BitmapTeleporter(iW, parcelFileDescriptor, iW2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new BitmapTeleporter[i10];
    }
}
