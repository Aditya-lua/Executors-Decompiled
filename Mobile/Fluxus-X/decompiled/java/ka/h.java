package ka;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.games.internal.player.ProfileSettingsEntity;
import com.google.android.gms.games.internal.player.StockProfileImageEntity;

/* JADX INFO: loaded from: classes.dex */
public final class h implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iD = p9.b.D(parcel);
        Status status = null;
        String strH = null;
        StockProfileImageEntity stockProfileImageEntity = null;
        i iVar = null;
        Boolean boolP = null;
        boolean zO = false;
        boolean zO2 = false;
        boolean zO3 = false;
        boolean zO4 = false;
        boolean zO5 = false;
        int iW = 0;
        boolean zO6 = false;
        boolean zO7 = false;
        int iW2 = 0;
        int iW3 = 0;
        boolean zO8 = false;
        while (parcel.dataPosition() < iD) {
            int iU = p9.b.u(parcel);
            switch (p9.b.n(iU)) {
                case 1:
                    status = (Status) p9.b.g(parcel, iU, Status.CREATOR);
                    break;
                case 2:
                    strH = p9.b.h(parcel, iU);
                    break;
                case 3:
                    zO = p9.b.o(parcel, iU);
                    break;
                case 4:
                    zO2 = p9.b.o(parcel, iU);
                    break;
                case 5:
                    zO3 = p9.b.o(parcel, iU);
                    break;
                case 6:
                    stockProfileImageEntity = (StockProfileImageEntity) p9.b.g(parcel, iU, StockProfileImageEntity.CREATOR);
                    break;
                case 7:
                    zO4 = p9.b.o(parcel, iU);
                    break;
                case 8:
                    zO5 = p9.b.o(parcel, iU);
                    break;
                case 9:
                    iW = p9.b.w(parcel, iU);
                    break;
                case 10:
                    zO6 = p9.b.o(parcel, iU);
                    break;
                case 11:
                    zO7 = p9.b.o(parcel, iU);
                    break;
                case 12:
                    iW2 = p9.b.w(parcel, iU);
                    break;
                case 13:
                    iW3 = p9.b.w(parcel, iU);
                    break;
                case 14:
                    zO8 = p9.b.o(parcel, iU);
                    break;
                case 15:
                    iVar = (i) p9.b.g(parcel, iU, i.CREATOR);
                    break;
                case 16:
                    boolP = p9.b.p(parcel, iU);
                    break;
                default:
                    p9.b.C(parcel, iU);
                    break;
            }
        }
        p9.b.m(parcel, iD);
        return new ProfileSettingsEntity(status, strH, zO, zO2, zO3, stockProfileImageEntity, zO4, zO5, iW, zO6, zO7, iW2, iW3, zO8, iVar, boolP);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new ProfileSettingsEntity[i10];
    }
}
