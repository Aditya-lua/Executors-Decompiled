package ga;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.games.PlayerEntity;
import com.google.android.gms.games.event.EventEntity;

/* JADX INFO: loaded from: classes.dex */
public final class b implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iD = p9.b.D(parcel);
        boolean zO = false;
        String strH = null;
        String strH2 = null;
        String strH3 = null;
        Uri uri = null;
        String strH4 = null;
        PlayerEntity playerEntity = null;
        String strH5 = null;
        long jY = 0;
        while (parcel.dataPosition() < iD) {
            int iU = p9.b.u(parcel);
            switch (p9.b.n(iU)) {
                case 1:
                    strH = p9.b.h(parcel, iU);
                    break;
                case 2:
                    strH2 = p9.b.h(parcel, iU);
                    break;
                case 3:
                    strH3 = p9.b.h(parcel, iU);
                    break;
                case 4:
                    uri = (Uri) p9.b.g(parcel, iU, Uri.CREATOR);
                    break;
                case 5:
                    strH4 = p9.b.h(parcel, iU);
                    break;
                case 6:
                    playerEntity = (PlayerEntity) p9.b.g(parcel, iU, PlayerEntity.CREATOR);
                    break;
                case 7:
                    jY = p9.b.y(parcel, iU);
                    break;
                case 8:
                    strH5 = p9.b.h(parcel, iU);
                    break;
                case 9:
                    zO = p9.b.o(parcel, iU);
                    break;
                default:
                    p9.b.C(parcel, iU);
                    break;
            }
        }
        p9.b.m(parcel, iD);
        return new EventEntity(strH, strH2, strH3, uri, strH4, playerEntity, jY, strH5, zO);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new EventEntity[i10];
    }
}
