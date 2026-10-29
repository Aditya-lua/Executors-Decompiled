package pa;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.games.GameEntity;
import com.google.android.gms.games.PlayerEntity;
import com.google.android.gms.games.snapshot.SnapshotMetadataEntity;

/* JADX INFO: loaded from: classes.dex */
public final class d implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iD = o9.a.D(parcel);
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
            int iU = o9.a.u(parcel);
            switch (o9.a.n(iU)) {
                case 1:
                    gameEntity = (GameEntity) o9.a.g(parcel, iU, GameEntity.CREATOR);
                    break;
                case 2:
                    playerEntity = (PlayerEntity) o9.a.g(parcel, iU, PlayerEntity.CREATOR);
                    break;
                case 3:
                    strH = o9.a.h(parcel, iU);
                    break;
                case 4:
                default:
                    o9.a.C(parcel, iU);
                    break;
                case 5:
                    uri = (Uri) o9.a.g(parcel, iU, Uri.CREATOR);
                    break;
                case 6:
                    strH2 = o9.a.h(parcel, iU);
                    break;
                case 7:
                    strH3 = o9.a.h(parcel, iU);
                    break;
                case 8:
                    strH4 = o9.a.h(parcel, iU);
                    break;
                case 9:
                    jY = o9.a.y(parcel, iU);
                    break;
                case 10:
                    jY2 = o9.a.y(parcel, iU);
                    break;
                case 11:
                    fS = o9.a.s(parcel, iU);
                    break;
                case 12:
                    strH5 = o9.a.h(parcel, iU);
                    break;
                case 13:
                    zO = o9.a.o(parcel, iU);
                    break;
                case 14:
                    jY3 = o9.a.y(parcel, iU);
                    break;
                case 15:
                    strH6 = o9.a.h(parcel, iU);
                    break;
            }
        }
        o9.a.m(parcel, iD);
        return new SnapshotMetadataEntity(gameEntity, playerEntity, strH, uri, strH2, strH3, strH4, jY, jY2, fS, strH5, zO, jY3, strH6);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new SnapshotMetadataEntity[i10];
    }
}
