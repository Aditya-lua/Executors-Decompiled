package p214ja;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.games.internal.player.ProfileSettingsEntity;
import com.google.android.gms.games.internal.player.StockProfileImageEntity;
import com.google.android.gms.games.internal.player.zzh;
import p325o9.C9717a;

/* JADX INFO: renamed from: ja.d */
/* JADX INFO: loaded from: classes.dex */
public final class C7125d implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iM38424D = C9717a.m38424D(parcel);
        Status status = null;
        String strM38434h = null;
        StockProfileImageEntity stockProfileImageEntity = null;
        zzh zzhVar = null;
        Boolean boolM38442p = null;
        boolean zM38441o = false;
        boolean zM38441o2 = false;
        boolean zM38441o3 = false;
        boolean zM38441o4 = false;
        boolean zM38441o5 = false;
        int iM38449w = 0;
        boolean zM38441o6 = false;
        boolean zM38441o7 = false;
        int iM38449w2 = 0;
        int iM38449w3 = 0;
        boolean zM38441o8 = false;
        while (parcel.dataPosition() < iM38424D) {
            int iM38447u = C9717a.m38447u(parcel);
            switch (C9717a.m38440n(iM38447u)) {
                case 1:
                    status = (Status) C9717a.m38433g(parcel, iM38447u, Status.CREATOR);
                    break;
                case 2:
                    strM38434h = C9717a.m38434h(parcel, iM38447u);
                    break;
                case 3:
                    zM38441o = C9717a.m38441o(parcel, iM38447u);
                    break;
                case 4:
                    zM38441o2 = C9717a.m38441o(parcel, iM38447u);
                    break;
                case 5:
                    zM38441o3 = C9717a.m38441o(parcel, iM38447u);
                    break;
                case 6:
                    stockProfileImageEntity = (StockProfileImageEntity) C9717a.m38433g(parcel, iM38447u, StockProfileImageEntity.CREATOR);
                    break;
                case 7:
                    zM38441o4 = C9717a.m38441o(parcel, iM38447u);
                    break;
                case 8:
                    zM38441o5 = C9717a.m38441o(parcel, iM38447u);
                    break;
                case 9:
                    iM38449w = C9717a.m38449w(parcel, iM38447u);
                    break;
                case 10:
                    zM38441o6 = C9717a.m38441o(parcel, iM38447u);
                    break;
                case 11:
                    zM38441o7 = C9717a.m38441o(parcel, iM38447u);
                    break;
                case 12:
                    iM38449w2 = C9717a.m38449w(parcel, iM38447u);
                    break;
                case 13:
                    iM38449w3 = C9717a.m38449w(parcel, iM38447u);
                    break;
                case 14:
                    zM38441o8 = C9717a.m38441o(parcel, iM38447u);
                    break;
                case 15:
                    zzhVar = (zzh) C9717a.m38433g(parcel, iM38447u, zzh.CREATOR);
                    break;
                case 16:
                    boolM38442p = C9717a.m38442p(parcel, iM38447u);
                    break;
                default:
                    C9717a.m38423C(parcel, iM38447u);
                    break;
            }
        }
        C9717a.m38439m(parcel, iM38424D);
        return new ProfileSettingsEntity(status, strM38434h, zM38441o, zM38441o2, zM38441o3, stockProfileImageEntity, zM38441o4, zM38441o5, iM38449w, zM38441o6, zM38441o7, iM38449w2, iM38449w3, zM38441o8, zzhVar, boolM38442p);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new ProfileSettingsEntity[i10];
    }
}
