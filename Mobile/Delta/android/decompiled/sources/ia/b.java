package ia;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.games.internal.game.GameBadgeEntity;

/* JADX INFO: loaded from: classes.dex */
public class b implements Parcelable.Creator {
    public GameBadgeEntity a(Parcel parcel) {
        int iD = o9.a.D(parcel);
        String strH = null;
        Uri uri = null;
        int iW = 0;
        String strH2 = null;
        while (parcel.dataPosition() < iD) {
            int iU = o9.a.u(parcel);
            int iN = o9.a.n(iU);
            if (iN == 1) {
                iW = o9.a.w(parcel, iU);
            } else if (iN == 2) {
                strH = o9.a.h(parcel, iU);
            } else if (iN == 3) {
                strH2 = o9.a.h(parcel, iU);
            } else if (iN != 4) {
                o9.a.C(parcel, iU);
            } else {
                uri = (Uri) o9.a.g(parcel, iU, Uri.CREATOR);
            }
        }
        o9.a.m(parcel, iD);
        return new GameBadgeEntity(iW, strH, strH2, uri);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new GameBadgeEntity[i10];
    }
}
