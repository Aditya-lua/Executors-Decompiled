package ja;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.games.internal.player.ProfileSettingsEntity;
import com.google.android.gms.games.internal.player.StockProfileImageEntity;
import com.google.android.gms.games.internal.player.zzh;

/* JADX INFO: loaded from: classes.dex */
public final class d implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iD = o9.a.D(parcel);
        Status status = null;
        String strH = null;
        StockProfileImageEntity stockProfileImageEntity = null;
        zzh zzhVar = null;
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
            int iU = o9.a.u(parcel);
            switch (o9.a.n(iU)) {
                case 1:
                    status = (Status) o9.a.g(parcel, iU, Status.CREATOR);
                    break;
                case 2:
                    strH = o9.a.h(parcel, iU);
                    break;
                case 3:
                    zO = o9.a.o(parcel, iU);
                    break;
                case 4:
                    zO2 = o9.a.o(parcel, iU);
                    break;
                case 5:
                    zO3 = o9.a.o(parcel, iU);
                    break;
                case 6:
                    stockProfileImageEntity = (StockProfileImageEntity) o9.a.g(parcel, iU, StockProfileImageEntity.CREATOR);
                    break;
                case 7:
                    zO4 = o9.a.o(parcel, iU);
                    break;
                case 8:
                    zO5 = o9.a.o(parcel, iU);
                    break;
                case 9:
                    iW = o9.a.w(parcel, iU);
                    break;
                case 10:
                    zO6 = o9.a.o(parcel, iU);
                    break;
                case 11:
                    zO7 = o9.a.o(parcel, iU);
                    break;
                case 12:
                    iW2 = o9.a.w(parcel, iU);
                    break;
                case 13:
                    iW3 = o9.a.w(parcel, iU);
                    break;
                case 14:
                    zO8 = o9.a.o(parcel, iU);
                    break;
                case 15:
                    zzhVar = (zzh) o9.a.g(parcel, iU, zzh.CREATOR);
                    break;
                case 16:
                    boolP = o9.a.p(parcel, iU);
                    break;
                default:
                    o9.a.C(parcel, iU);
                    break;
            }
        }
        o9.a.m(parcel, iD);
        return new ProfileSettingsEntity(status, strH, zO, zO2, zO3, stockProfileImageEntity, zO4, zO5, iW, zO6, zO7, iW2, iW3, zO8, zzhVar, boolP);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new ProfileSettingsEntity[i10];
    }
}
