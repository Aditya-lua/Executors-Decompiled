package fa;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.games.PlayerEntity;
import com.google.android.gms.games.event.EventEntity;

/* JADX INFO: loaded from: classes.dex */
public final class a implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iD = o9.a.D(parcel);
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
            int iU = o9.a.u(parcel);
            switch (o9.a.n(iU)) {
                case 1:
                    strH = o9.a.h(parcel, iU);
                    break;
                case 2:
                    strH2 = o9.a.h(parcel, iU);
                    break;
                case 3:
                    strH3 = o9.a.h(parcel, iU);
                    break;
                case 4:
                    uri = (Uri) o9.a.g(parcel, iU, Uri.CREATOR);
                    break;
                case 5:
                    strH4 = o9.a.h(parcel, iU);
                    break;
                case 6:
                    playerEntity = (PlayerEntity) o9.a.g(parcel, iU, PlayerEntity.CREATOR);
                    break;
                case 7:
                    jY = o9.a.y(parcel, iU);
                    break;
                case 8:
                    strH5 = o9.a.h(parcel, iU);
                    break;
                case 9:
                    zO = o9.a.o(parcel, iU);
                    break;
                default:
                    o9.a.C(parcel, iU);
                    break;
            }
        }
        o9.a.m(parcel, iD);
        return new EventEntity(strH, strH2, strH3, uri, strH4, playerEntity, jY, strH5, zO);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new EventEntity[i10];
    }
}
