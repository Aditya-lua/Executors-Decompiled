package ia;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.games.GameEntity;
import com.google.android.gms.games.internal.experience.ExperienceEventEntity;

/* JADX INFO: loaded from: classes.dex */
public final class b implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iD = p9.b.D(parcel);
        int iW = 0;
        int iW2 = 0;
        long jY = 0;
        long jY2 = 0;
        long jY3 = 0;
        String strH = null;
        GameEntity gameEntity = null;
        String strH2 = null;
        String strH3 = null;
        String strH4 = null;
        Uri uri = null;
        while (parcel.dataPosition() < iD) {
            int iU = p9.b.u(parcel);
            switch (p9.b.n(iU)) {
                case 1:
                    strH = p9.b.h(parcel, iU);
                    break;
                case 2:
                    gameEntity = (GameEntity) p9.b.g(parcel, iU, GameEntity.CREATOR);
                    break;
                case 3:
                    strH2 = p9.b.h(parcel, iU);
                    break;
                case 4:
                    strH3 = p9.b.h(parcel, iU);
                    break;
                case 5:
                    strH4 = p9.b.h(parcel, iU);
                    break;
                case 6:
                    uri = (Uri) p9.b.g(parcel, iU, Uri.CREATOR);
                    break;
                case 7:
                    jY = p9.b.y(parcel, iU);
                    break;
                case 8:
                    jY2 = p9.b.y(parcel, iU);
                    break;
                case 9:
                    jY3 = p9.b.y(parcel, iU);
                    break;
                case 10:
                    iW = p9.b.w(parcel, iU);
                    break;
                case 11:
                    iW2 = p9.b.w(parcel, iU);
                    break;
                default:
                    p9.b.C(parcel, iU);
                    break;
            }
        }
        p9.b.m(parcel, iD);
        return new ExperienceEventEntity(strH, gameEntity, strH2, strH3, strH4, uri, jY, jY2, jY3, iW, iW2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new ExperienceEventEntity[i10];
    }
}
