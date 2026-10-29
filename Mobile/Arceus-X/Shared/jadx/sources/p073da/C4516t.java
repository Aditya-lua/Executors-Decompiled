package p073da;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.games.PlayerLevel;
import com.google.android.gms.games.PlayerLevelInfo;
import p325o9.C9717a;

/* JADX INFO: renamed from: da.t */
/* JADX INFO: loaded from: classes.dex */
public final class C4516t implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iM38424D = C9717a.m38424D(parcel);
        PlayerLevel playerLevel = null;
        PlayerLevel playerLevel2 = null;
        long jM38451y = 0;
        long jM38451y2 = 0;
        while (parcel.dataPosition() < iM38424D) {
            int iM38447u = C9717a.m38447u(parcel);
            int iM38440n = C9717a.m38440n(iM38447u);
            if (iM38440n == 1) {
                jM38451y = C9717a.m38451y(parcel, iM38447u);
            } else if (iM38440n == 2) {
                jM38451y2 = C9717a.m38451y(parcel, iM38447u);
            } else if (iM38440n == 3) {
                playerLevel = (PlayerLevel) C9717a.m38433g(parcel, iM38447u, PlayerLevel.CREATOR);
            } else if (iM38440n != 4) {
                C9717a.m38423C(parcel, iM38447u);
            } else {
                playerLevel2 = (PlayerLevel) C9717a.m38433g(parcel, iM38447u, PlayerLevel.CREATOR);
            }
        }
        C9717a.m38439m(parcel, iM38424D);
        return new PlayerLevelInfo(jM38451y, jM38451y2, playerLevel, playerLevel2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new PlayerLevelInfo[i10];
    }
}
