package da;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.games.GameEntity;

/* JADX INFO: loaded from: classes.dex */
public class l implements Parcelable.Creator {
    public GameEntity a(Parcel parcel) {
        int iD = o9.a.D(parcel);
        boolean zO = false;
        boolean zO2 = false;
        int iW = 0;
        int iW2 = 0;
        int iW3 = 0;
        boolean zO3 = false;
        boolean zO4 = false;
        boolean zO5 = false;
        boolean zO6 = false;
        boolean zO7 = false;
        boolean zO8 = false;
        boolean zO9 = false;
        String strH = null;
        String strH2 = null;
        String strH3 = null;
        String strH4 = null;
        String strH5 = null;
        String strH6 = null;
        Uri uri = null;
        Uri uri2 = null;
        Uri uri3 = null;
        String strH7 = null;
        String strH8 = null;
        String strH9 = null;
        String strH10 = null;
        String strH11 = null;
        while (parcel.dataPosition() < iD) {
            int iU = o9.a.u(parcel);
            int iN = o9.a.n(iU);
            if (iN != 28) {
                switch (iN) {
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
                        strH4 = o9.a.h(parcel, iU);
                        break;
                    case 5:
                        strH5 = o9.a.h(parcel, iU);
                        break;
                    case 6:
                        strH6 = o9.a.h(parcel, iU);
                        break;
                    case 7:
                        uri = (Uri) o9.a.g(parcel, iU, Uri.CREATOR);
                        break;
                    case 8:
                        uri2 = (Uri) o9.a.g(parcel, iU, Uri.CREATOR);
                        break;
                    case 9:
                        uri3 = (Uri) o9.a.g(parcel, iU, Uri.CREATOR);
                        break;
                    case 10:
                        zO = o9.a.o(parcel, iU);
                        break;
                    case 11:
                        zO2 = o9.a.o(parcel, iU);
                        break;
                    case 12:
                        strH7 = o9.a.h(parcel, iU);
                        break;
                    case 13:
                        iW = o9.a.w(parcel, iU);
                        break;
                    case 14:
                        iW2 = o9.a.w(parcel, iU);
                        break;
                    case 15:
                        iW3 = o9.a.w(parcel, iU);
                        break;
                    case 16:
                        zO3 = o9.a.o(parcel, iU);
                        break;
                    case 17:
                        zO4 = o9.a.o(parcel, iU);
                        break;
                    case 18:
                        strH8 = o9.a.h(parcel, iU);
                        break;
                    case 19:
                        strH9 = o9.a.h(parcel, iU);
                        break;
                    case 20:
                        strH10 = o9.a.h(parcel, iU);
                        break;
                    case 21:
                        zO5 = o9.a.o(parcel, iU);
                        break;
                    case 22:
                        zO6 = o9.a.o(parcel, iU);
                        break;
                    case 23:
                        zO7 = o9.a.o(parcel, iU);
                        break;
                    case 24:
                        strH11 = o9.a.h(parcel, iU);
                        break;
                    case 25:
                        zO8 = o9.a.o(parcel, iU);
                        break;
                    default:
                        o9.a.C(parcel, iU);
                        break;
                }
            } else {
                zO9 = o9.a.o(parcel, iU);
            }
        }
        o9.a.m(parcel, iD);
        return new GameEntity(strH, strH2, strH3, strH4, strH5, strH6, uri, uri2, uri3, zO, zO2, strH7, iW, iW2, iW3, zO3, zO4, strH8, strH9, strH10, zO5, zO6, zO7, strH11, zO8, zO9);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new GameEntity[i10];
    }
}
