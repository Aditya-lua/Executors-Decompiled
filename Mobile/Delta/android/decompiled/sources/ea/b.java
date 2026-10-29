package ea;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.games.PlayerEntity;
import com.google.android.gms.games.achievement.AchievementEntity;

/* JADX INFO: loaded from: classes.dex */
public final class b implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iD = o9.a.D(parcel);
        String strH = null;
        String strH2 = null;
        String strH3 = null;
        Uri uri = null;
        String strH4 = null;
        Uri uri2 = null;
        String strH5 = null;
        String strH6 = null;
        PlayerEntity playerEntity = null;
        String strH7 = null;
        String strH8 = null;
        float fS = -1.0f;
        long jY = 0;
        long jY2 = 0;
        int iW = 0;
        int iW2 = 0;
        int iW3 = 0;
        int iW4 = 0;
        while (parcel.dataPosition() < iD) {
            int iU = o9.a.u(parcel);
            switch (o9.a.n(iU)) {
                case 1:
                    strH = o9.a.h(parcel, iU);
                    break;
                case 2:
                    iW = o9.a.w(parcel, iU);
                    break;
                case 3:
                    strH2 = o9.a.h(parcel, iU);
                    break;
                case 4:
                    strH3 = o9.a.h(parcel, iU);
                    break;
                case 5:
                    uri = (Uri) o9.a.g(parcel, iU, Uri.CREATOR);
                    break;
                case 6:
                    strH4 = o9.a.h(parcel, iU);
                    break;
                case 7:
                    uri2 = (Uri) o9.a.g(parcel, iU, Uri.CREATOR);
                    break;
                case 8:
                    strH5 = o9.a.h(parcel, iU);
                    break;
                case 9:
                    iW2 = o9.a.w(parcel, iU);
                    break;
                case 10:
                    strH6 = o9.a.h(parcel, iU);
                    break;
                case 11:
                    playerEntity = (PlayerEntity) o9.a.g(parcel, iU, PlayerEntity.CREATOR);
                    break;
                case 12:
                    iW3 = o9.a.w(parcel, iU);
                    break;
                case 13:
                    iW4 = o9.a.w(parcel, iU);
                    break;
                case 14:
                    strH7 = o9.a.h(parcel, iU);
                    break;
                case 15:
                    jY = o9.a.y(parcel, iU);
                    break;
                case 16:
                    jY2 = o9.a.y(parcel, iU);
                    break;
                case 17:
                    fS = o9.a.s(parcel, iU);
                    break;
                case 18:
                    strH8 = o9.a.h(parcel, iU);
                    break;
                default:
                    o9.a.C(parcel, iU);
                    break;
            }
        }
        o9.a.m(parcel, iD);
        return new AchievementEntity(strH, iW, strH2, strH3, uri, strH4, uri2, strH5, iW2, strH6, playerEntity, iW3, iW4, strH7, jY, jY2, fS, strH8);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new AchievementEntity[i10];
    }
}
