package ea;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import backtraceio.library.services.BacktraceMetrics;
import com.google.android.gms.games.PlayerEntity;
import com.google.android.gms.games.internal.player.MostRecentGameInfoEntity;
import com.google.mlkit.common.MlKitException;
import com.google.mlkit.vision.barcode.common.Barcode;
import com.google.mlkit.vision.common.InputImage;

/* JADX INFO: loaded from: classes.dex */
public class a0 implements Parcelable.Creator {
    public PlayerEntity a(Parcel parcel) {
        int iD = p9.b.D(parcel);
        String strH = null;
        String strH2 = null;
        Uri uri = null;
        Uri uri2 = null;
        String strH3 = null;
        String strH4 = null;
        String strH5 = null;
        MostRecentGameInfoEntity mostRecentGameInfoEntity = null;
        m mVar = null;
        String strH6 = null;
        String strH7 = null;
        Uri uri3 = null;
        String strH8 = null;
        Uri uri4 = null;
        String strH9 = null;
        d0 d0Var = null;
        p pVar = null;
        String strH10 = null;
        int iW = 0;
        boolean zO = false;
        boolean zO2 = false;
        boolean zO3 = false;
        long jY = -1;
        long jY2 = 0;
        long jY3 = 0;
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
                    uri = (Uri) p9.b.g(parcel, iU, Uri.CREATOR);
                    break;
                case 4:
                    uri2 = (Uri) p9.b.g(parcel, iU, Uri.CREATOR);
                    break;
                case 5:
                    jY2 = p9.b.y(parcel, iU);
                    break;
                case 6:
                    iW = p9.b.w(parcel, iU);
                    break;
                case 7:
                    jY3 = p9.b.y(parcel, iU);
                    break;
                case 8:
                    strH3 = p9.b.h(parcel, iU);
                    break;
                case 9:
                    strH4 = p9.b.h(parcel, iU);
                    break;
                case 10:
                case 11:
                case 12:
                case 13:
                case 17:
                case 26:
                case 27:
                case 28:
                case BacktraceMetrics.defaultTimeIntervalInMin /* 30 */:
                case 31:
                case Barcode.FORMAT_EAN_13 /* 32 */:
                case 34:
                default:
                    p9.b.C(parcel, iU);
                    break;
                case 14:
                    strH5 = p9.b.h(parcel, iU);
                    break;
                case 15:
                    mostRecentGameInfoEntity = (MostRecentGameInfoEntity) p9.b.g(parcel, iU, MostRecentGameInfoEntity.CREATOR);
                    break;
                case 16:
                    mVar = (m) p9.b.g(parcel, iU, m.CREATOR);
                    break;
                case MlKitException.UNSUPPORTED /* 18 */:
                    zO = p9.b.o(parcel, iU);
                    break;
                case 19:
                    zO2 = p9.b.o(parcel, iU);
                    break;
                case 20:
                    strH6 = p9.b.h(parcel, iU);
                    break;
                case 21:
                    strH7 = p9.b.h(parcel, iU);
                    break;
                case 22:
                    uri3 = (Uri) p9.b.g(parcel, iU, Uri.CREATOR);
                    break;
                case 23:
                    strH8 = p9.b.h(parcel, iU);
                    break;
                case 24:
                    uri4 = (Uri) p9.b.g(parcel, iU, Uri.CREATOR);
                    break;
                case 25:
                    strH9 = p9.b.h(parcel, iU);
                    break;
                case 29:
                    jY = p9.b.y(parcel, iU);
                    break;
                case 33:
                    d0Var = (d0) p9.b.g(parcel, iU, d0.CREATOR);
                    break;
                case InputImage.IMAGE_FORMAT_YUV_420_888 /* 35 */:
                    pVar = (p) p9.b.g(parcel, iU, p.CREATOR);
                    break;
                case 36:
                    zO3 = p9.b.o(parcel, iU);
                    break;
                case 37:
                    strH10 = p9.b.h(parcel, iU);
                    break;
            }
        }
        p9.b.m(parcel, iD);
        return new PlayerEntity(strH, strH2, uri, uri2, jY2, iW, jY3, strH3, strH4, strH5, mostRecentGameInfoEntity, mVar, zO, zO2, strH6, strH7, uri3, strH8, uri4, strH9, jY, d0Var, pVar, zO3, strH10);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new PlayerEntity[i10];
    }
}
