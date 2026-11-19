package qa;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.games.GameEntity;
import com.google.android.gms.games.PlayerEntity;
import com.google.android.gms.games.snapshot.SnapshotMetadataEntity;

/* JADX INFO: loaded from: classes.dex */
public final class g implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iD = p9.b.D(parcel);
        GameEntity gameEntity = null;
        PlayerEntity playerEntity = null;
        String strH = null;
        Uri uri = null;
        String strH2 = null;
        String strH3 = null;
        String strH4 = null;
        String strH5 = null;
        String strH6 = null;
        long jY = 0;
        long jY2 = 0;
        long jY3 = 0;
        boolean zO = false;
        float fS = 0.0f;
        while (parcel.dataPosition() < iD) {
            int iU = p9.b.u(parcel);
            switch (p9.b.n(iU)) {
                case 1:
                    gameEntity = (GameEntity) p9.b.g(parcel, iU, GameEntity.CREATOR);
                    break;
                case 2:
                    playerEntity = (PlayerEntity) p9.b.g(parcel, iU, PlayerEntity.CREATOR);
                    break;
                case 3:
                    strH = p9.b.h(parcel, iU);
                    break;
                case 4:
                default:
                    p9.b.C(parcel, iU);
                    break;
                case 5:
                    uri = (Uri) p9.b.g(parcel, iU, Uri.CREATOR);
                    break;
                case 6:
                    strH2 = p9.b.h(parcel, iU);
                    break;
                case 7:
                    strH3 = p9.b.h(parcel, iU);
                    break;
                case 8:
                    strH4 = p9.b.h(parcel, iU);
                    break;
                case 9:
                    jY = p9.b.y(parcel, iU);
                    break;
                case 10:
                    jY2 = p9.b.y(parcel, iU);
                    break;
                case 11:
                    fS = p9.b.s(parcel, iU);
                    break;
                case 12:
                    strH5 = p9.b.h(parcel, iU);
                    break;
                case 13:
                    zO = p9.b.o(parcel, iU);
                    break;
                case 14:
                    jY3 = p9.b.y(parcel, iU);
                    break;
                case 15:
                    strH6 = p9.b.h(parcel, iU);
                    break;
            }
        }
        p9.b.m(parcel, iD);
        return new SnapshotMetadataEntity(gameEntity, playerEntity, strH, uri, strH2, strH3, strH4, jY, jY2, fS, strH5, zO, jY3, strH6);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new SnapshotMetadataEntity[i10];
    }
}
