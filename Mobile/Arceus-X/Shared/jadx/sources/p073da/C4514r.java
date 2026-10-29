package p073da;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.games.PlayerEntity;
import com.google.android.gms.games.PlayerLevelInfo;
import com.google.android.gms.games.internal.player.MostRecentGameInfoEntity;
import com.google.android.gms.games.zza;
import com.google.android.gms.games.zzo;
import p325o9.C9717a;

/* JADX INFO: renamed from: da.r */
/* JADX INFO: loaded from: classes.dex */
public class C4514r implements Parcelable.Creator {
    /* JADX INFO: renamed from: a */
    public PlayerEntity mo22479a(Parcel parcel) {
        int iM38424D = C9717a.m38424D(parcel);
        String strM38434h = null;
        String strM38434h2 = null;
        Uri uri = null;
        Uri uri2 = null;
        String strM38434h3 = null;
        String strM38434h4 = null;
        String strM38434h5 = null;
        MostRecentGameInfoEntity mostRecentGameInfoEntity = null;
        PlayerLevelInfo playerLevelInfo = null;
        String strM38434h6 = null;
        String strM38434h7 = null;
        Uri uri3 = null;
        String strM38434h8 = null;
        Uri uri4 = null;
        String strM38434h9 = null;
        zzo zzoVar = null;
        zza zzaVar = null;
        String strM38434h10 = null;
        int iM38449w = 0;
        boolean zM38441o = false;
        boolean zM38441o2 = false;
        boolean zM38441o3 = false;
        long jM38451y = -1;
        long jM38451y2 = 0;
        long jM38451y3 = 0;
        while (parcel.dataPosition() < iM38424D) {
            int iM38447u = C9717a.m38447u(parcel);
            switch (C9717a.m38440n(iM38447u)) {
                case 1:
                    strM38434h = C9717a.m38434h(parcel, iM38447u);
                    break;
                case 2:
                    strM38434h2 = C9717a.m38434h(parcel, iM38447u);
                    break;
                case 3:
                    uri = (Uri) C9717a.m38433g(parcel, iM38447u, Uri.CREATOR);
                    break;
                case 4:
                    uri2 = (Uri) C9717a.m38433g(parcel, iM38447u, Uri.CREATOR);
                    break;
                case 5:
                    jM38451y2 = C9717a.m38451y(parcel, iM38447u);
                    break;
                case 6:
                    iM38449w = C9717a.m38449w(parcel, iM38447u);
                    break;
                case 7:
                    jM38451y3 = C9717a.m38451y(parcel, iM38447u);
                    break;
                case 8:
                    strM38434h3 = C9717a.m38434h(parcel, iM38447u);
                    break;
                case 9:
                    strM38434h4 = C9717a.m38434h(parcel, iM38447u);
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
                    C9717a.m38423C(parcel, iM38447u);
                    break;
                case 14:
                    strM38434h5 = C9717a.m38434h(parcel, iM38447u);
                    break;
                case 15:
                    mostRecentGameInfoEntity = (MostRecentGameInfoEntity) C9717a.m38433g(parcel, iM38447u, MostRecentGameInfoEntity.CREATOR);
                    break;
                case 16:
                    playerLevelInfo = (PlayerLevelInfo) C9717a.m38433g(parcel, iM38447u, PlayerLevelInfo.CREATOR);
                    break;
                case 18:
                    zM38441o = C9717a.m38441o(parcel, iM38447u);
                    break;
                case 19:
                    zM38441o2 = C9717a.m38441o(parcel, iM38447u);
                    break;
                case 20:
                    strM38434h6 = C9717a.m38434h(parcel, iM38447u);
                    break;
                case 21:
                    strM38434h7 = C9717a.m38434h(parcel, iM38447u);
                    break;
                case 22:
                    uri3 = (Uri) C9717a.m38433g(parcel, iM38447u, Uri.CREATOR);
                    break;
                case 23:
                    strM38434h8 = C9717a.m38434h(parcel, iM38447u);
                    break;
                case 24:
                    uri4 = (Uri) C9717a.m38433g(parcel, iM38447u, Uri.CREATOR);
                    break;
                case 25:
                    strM38434h9 = C9717a.m38434h(parcel, iM38447u);
                    break;
                case 29:
                    jM38451y = C9717a.m38451y(parcel, iM38447u);
                    break;
                case 33:
                    zzoVar = (zzo) C9717a.m38433g(parcel, iM38447u, zzo.CREATOR);
                    break;
                case 35:
                    zzaVar = (zza) C9717a.m38433g(parcel, iM38447u, zza.CREATOR);
                    break;
                case 36:
                    zM38441o3 = C9717a.m38441o(parcel, iM38447u);
                    break;
                case 37:
                    strM38434h10 = C9717a.m38434h(parcel, iM38447u);
                    break;
            }
        }
        C9717a.m38439m(parcel, iM38424D);
        return new PlayerEntity(strM38434h, strM38434h2, uri, uri2, jM38451y2, iM38449w, jM38451y3, strM38434h3, strM38434h4, strM38434h5, mostRecentGameInfoEntity, playerLevelInfo, zM38441o, zM38441o2, strM38434h6, strM38434h7, uri3, strM38434h8, uri4, strM38434h9, jM38451y, zzoVar, zzaVar, zM38441o3, strM38434h10);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new PlayerEntity[i10];
    }
}
