package ja;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.games.internal.game.GameBadgeEntity;

/* JADX INFO: loaded from: classes.dex */
public class c implements Parcelable.Creator {
    public GameBadgeEntity a(Parcel parcel) {
        int iD = p9.b.D(parcel);
        String strH = null;
        Uri uri = null;
        int iW = 0;
        String strH2 = null;
        while (parcel.dataPosition() < iD) {
            int iU = p9.b.u(parcel);
            int iN = p9.b.n(iU);
            if (iN == 1) {
                iW = p9.b.w(parcel, iU);
            } else if (iN == 2) {
                strH = p9.b.h(parcel, iU);
            } else if (iN == 3) {
                strH2 = p9.b.h(parcel, iU);
            } else if (iN != 4) {
                p9.b.C(parcel, iU);
            } else {
                uri = (Uri) p9.b.g(parcel, iU, Uri.CREATOR);
            }
        }
        p9.b.m(parcel, iD);
        return new GameBadgeEntity(iW, strH, strH2, uri);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new GameBadgeEntity[i10];
    }
}
