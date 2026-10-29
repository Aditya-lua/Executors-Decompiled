package da;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.games.PlayerLevel;
import com.google.android.gms.games.PlayerLevelInfo;

/* JADX INFO: loaded from: classes.dex */
public final class t implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iD = o9.a.D(parcel);
        PlayerLevel playerLevel = null;
        PlayerLevel playerLevel2 = null;
        long jY = 0;
        long jY2 = 0;
        while (parcel.dataPosition() < iD) {
            int iU = o9.a.u(parcel);
            int iN = o9.a.n(iU);
            if (iN == 1) {
                jY = o9.a.y(parcel, iU);
            } else if (iN == 2) {
                jY2 = o9.a.y(parcel, iU);
            } else if (iN == 3) {
                playerLevel = (PlayerLevel) o9.a.g(parcel, iU, PlayerLevel.CREATOR);
            } else if (iN != 4) {
                o9.a.C(parcel, iU);
            } else {
                playerLevel2 = (PlayerLevel) o9.a.g(parcel, iU, PlayerLevel.CREATOR);
            }
        }
        o9.a.m(parcel, iD);
        return new PlayerLevelInfo(jY, jY2, playerLevel, playerLevel2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new PlayerLevelInfo[i10];
    }
}
