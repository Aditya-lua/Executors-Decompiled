package ia;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.games.internal.game.ScreenshotEntity;

/* JADX INFO: loaded from: classes.dex */
public final class c implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iD = o9.a.D(parcel);
        int iW = 0;
        Uri uri = null;
        int iW2 = 0;
        while (parcel.dataPosition() < iD) {
            int iU = o9.a.u(parcel);
            int iN = o9.a.n(iU);
            if (iN == 1) {
                uri = (Uri) o9.a.g(parcel, iU, Uri.CREATOR);
            } else if (iN == 2) {
                iW = o9.a.w(parcel, iU);
            } else if (iN != 3) {
                o9.a.C(parcel, iU);
            } else {
                iW2 = o9.a.w(parcel, iU);
            }
        }
        o9.a.m(parcel, iD);
        return new ScreenshotEntity(uri, iW, iW2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new ScreenshotEntity[i10];
    }
}
