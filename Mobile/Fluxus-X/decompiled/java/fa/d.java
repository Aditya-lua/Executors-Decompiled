package fa;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.games.PlayerEntity;
import com.google.android.gms.games.achievement.AchievementEntity;
import com.google.mlkit.common.MlKitException;

/* JADX INFO: loaded from: classes.dex */
public final class d implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iD = p9.b.D(parcel);
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
            int iU = p9.b.u(parcel);
            switch (p9.b.n(iU)) {
                case 1:
                    strH = p9.b.h(parcel, iU);
                    break;
                case 2:
                    iW = p9.b.w(parcel, iU);
                    break;
                case 3:
                    strH2 = p9.b.h(parcel, iU);
                    break;
                case 4:
                    strH3 = p9.b.h(parcel, iU);
                    break;
                case 5:
                    uri = (Uri) p9.b.g(parcel, iU, Uri.CREATOR);
                    break;
                case 6:
                    strH4 = p9.b.h(parcel, iU);
                    break;
                case 7:
                    uri2 = (Uri) p9.b.g(parcel, iU, Uri.CREATOR);
                    break;
                case 8:
                    strH5 = p9.b.h(parcel, iU);
                    break;
                case 9:
                    iW2 = p9.b.w(parcel, iU);
                    break;
                case 10:
                    strH6 = p9.b.h(parcel, iU);
                    break;
                case 11:
                    playerEntity = (PlayerEntity) p9.b.g(parcel, iU, PlayerEntity.CREATOR);
                    break;
                case 12:
                    iW3 = p9.b.w(parcel, iU);
                    break;
                case 13:
                    iW4 = p9.b.w(parcel, iU);
                    break;
                case 14:
                    strH7 = p9.b.h(parcel, iU);
                    break;
                case 15:
                    jY = p9.b.y(parcel, iU);
                    break;
                case 16:
                    jY2 = p9.b.y(parcel, iU);
                    break;
                case 17:
                    fS = p9.b.s(parcel, iU);
                    break;
                case MlKitException.UNSUPPORTED /* 18 */:
                    strH8 = p9.b.h(parcel, iU);
                    break;
                default:
                    p9.b.C(parcel, iU);
                    break;
            }
        }
        p9.b.m(parcel, iD);
        return new AchievementEntity(strH, iW, strH2, strH3, uri, strH4, uri2, strH5, iW2, strH6, playerEntity, iW3, iW4, strH7, jY, jY2, fS, strH8);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new AchievementEntity[i10];
    }
}
