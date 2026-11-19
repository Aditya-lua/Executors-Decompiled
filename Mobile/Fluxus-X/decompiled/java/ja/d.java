package ja;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.games.internal.game.ScreenshotEntity;

/* JADX INFO: loaded from: classes.dex */
public final class d implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iD = p9.b.D(parcel);
        int iW = 0;
        Uri uri = null;
        int iW2 = 0;
        while (parcel.dataPosition() < iD) {
            int iU = p9.b.u(parcel);
            int iN = p9.b.n(iU);
            if (iN == 1) {
                uri = (Uri) p9.b.g(parcel, iU, Uri.CREATOR);
            } else if (iN == 2) {
                iW = p9.b.w(parcel, iU);
            } else if (iN != 3) {
                p9.b.C(parcel, iU);
            } else {
                iW2 = p9.b.w(parcel, iU);
            }
        }
        p9.b.m(parcel, iD);
        return new ScreenshotEntity(uri, iW, iW2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new ScreenshotEntity[i10];
    }
}
