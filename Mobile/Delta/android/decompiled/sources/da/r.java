package da;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.games.PlayerEntity;
import com.google.android.gms.games.PlayerLevelInfo;
import com.google.android.gms.games.internal.player.MostRecentGameInfoEntity;
import com.google.android.gms.games.zza;
import com.google.android.gms.games.zzo;

/* JADX INFO: loaded from: classes.dex */
public class r implements Parcelable.Creator {
    public PlayerEntity a(Parcel parcel) {
        int iD = o9.a.D(parcel);
        String strH = null;
        String strH2 = null;
        Uri uri = null;
        Uri uri2 = null;
        String strH3 = null;
        String strH4 = null;
        String strH5 = null;
        MostRecentGameInfoEntity mostRecentGameInfoEntity = null;
        PlayerLevelInfo playerLevelInfo = null;
        String strH6 = null;
        String strH7 = null;
        Uri uri3 = null;
        String strH8 = null;
        Uri uri4 = null;
        String strH9 = null;
        zzo zzoVar = null;
        zza zzaVar = null;
        String strH10 = null;
        int iW = 0;
        boolean zO = false;
        boolean zO2 = false;
        boolean zO3 = false;
        long jY = -1;
        long jY2 = 0;
        long jY3 = 0;
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
                    uri = (Uri) o9.a.g(parcel, iU, Uri.CREATOR);
                    break;
                case 4:
                    uri2 = (Uri) o9.a.g(parcel, iU, Uri.CREATOR);
                    break;
                case 5:
                    jY2 = o9.a.y(parcel, iU);
                    break;
                case 6:
                    iW = o9.a.w(parcel, iU);
                    break;
                case 7:
                    jY3 = o9.a.y(parcel, iU);
                    break;
                case 8:
                    strH3 = o9.a.h(parcel, iU);
                    break;
                case 9:
                    strH4 = o9.a.h(parcel, iU);
                    break;
                case 10:
                case 11:
                case 12:
                case 13:
                case 17:
                case 26:
                case 27:
                case 28:
                case 30:
                case 31:
                case 32:
                case 34:
                default:
                    o9.a.C(parcel, iU);
                    break;
                case 14:
                    strH5 = o9.a.h(parcel, iU);
                    break;
                case 15:
                    mostRecentGameInfoEntity = (MostRecentGameInfoEntity) o9.a.g(parcel, iU, MostRecentGameInfoEntity.CREATOR);
                    break;
                case 16:
                    playerLevelInfo = (PlayerLevelInfo) o9.a.g(parcel, iU, PlayerLevelInfo.CREATOR);
                    break;
                case 18:
                    zO = o9.a.o(parcel, iU);
                    break;
                case 19:
                    zO2 = o9.a.o(parcel, iU);
                    break;
                case 20:
                    strH6 = o9.a.h(parcel, iU);
                    break;
                case 21:
                    strH7 = o9.a.h(parcel, iU);
                    break;
                case 22:
                    uri3 = (Uri) o9.a.g(parcel, iU, Uri.CREATOR);
                    break;
                case 23:
                    strH8 = o9.a.h(parcel, iU);
                    break;
                case 24:
                    uri4 = (Uri) o9.a.g(parcel, iU, Uri.CREATOR);
                    break;
                case 25:
                    strH9 = o9.a.h(parcel, iU);
                    break;
                case 29:
                    jY = o9.a.y(parcel, iU);
                    break;
                case 33:
                    zzoVar = (zzo) o9.a.g(parcel, iU, zzo.CREATOR);
                    break;
                case 35:
                    zzaVar = (zza) o9.a.g(parcel, iU, zza.CREATOR);
                    break;
                case 36:
                    zO3 = o9.a.o(parcel, iU);
                    break;
                case 37:
                    strH10 = o9.a.h(parcel, iU);
                    break;
            }
        }
        o9.a.m(parcel, iD);
        return new PlayerEntity(strH, strH2, uri, uri2, jY2, iW, jY3, strH3, strH4, strH5, mostRecentGameInfoEntity, playerLevelInfo, zO, zO2, strH6, strH7, uri3, strH8, uri4, strH9, jY, zzoVar, zzaVar, zO3, strH10);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new PlayerEntity[i10];
    }
}
