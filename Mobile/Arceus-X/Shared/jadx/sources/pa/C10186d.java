package pa;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.games.GameEntity;
import com.google.android.gms.games.PlayerEntity;
import com.google.android.gms.games.snapshot.SnapshotMetadataEntity;
import p325o9.C9717a;

/* JADX INFO: renamed from: pa.d */
/* JADX INFO: loaded from: classes.dex */
public final class C10186d implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iM38424D = C9717a.m38424D(parcel);
        GameEntity gameEntity = null;
        PlayerEntity playerEntity = null;
        String strM38434h = null;
        Uri uri = null;
        String strM38434h2 = null;
        String strM38434h3 = null;
        String strM38434h4 = null;
        String strM38434h5 = null;
        String strM38434h6 = null;
        long jM38451y = 0;
        long jM38451y2 = 0;
        long jM38451y3 = 0;
        boolean zM38441o = false;
        float fM38445s = 0.0f;
        while (parcel.dataPosition() < iM38424D) {
            int iM38447u = C9717a.m38447u(parcel);
            switch (C9717a.m38440n(iM38447u)) {
                case 1:
                    gameEntity = (GameEntity) C9717a.m38433g(parcel, iM38447u, GameEntity.CREATOR);
                    break;
                case 2:
                    playerEntity = (PlayerEntity) C9717a.m38433g(parcel, iM38447u, PlayerEntity.CREATOR);
                    break;
                case 3:
                    strM38434h = C9717a.m38434h(parcel, iM38447u);
                    break;
                case 4:
                default:
                    C9717a.m38423C(parcel, iM38447u);
                    break;
                case 5:
                    uri = (Uri) C9717a.m38433g(parcel, iM38447u, Uri.CREATOR);
                    break;
                case 6:
                    strM38434h2 = C9717a.m38434h(parcel, iM38447u);
                    break;
                case 7:
                    strM38434h3 = C9717a.m38434h(parcel, iM38447u);
                    break;
                case 8:
                    strM38434h4 = C9717a.m38434h(parcel, iM38447u);
                    break;
                case 9:
                    jM38451y = C9717a.m38451y(parcel, iM38447u);
                    break;
                case 10:
                    jM38451y2 = C9717a.m38451y(parcel, iM38447u);
                    break;
                case 11:
                    fM38445s = C9717a.m38445s(parcel, iM38447u);
                    break;
                case 12:
                    strM38434h5 = C9717a.m38434h(parcel, iM38447u);
                    break;
                case 13:
                    zM38441o = C9717a.m38441o(parcel, iM38447u);
                    break;
                case 14:
                    jM38451y3 = C9717a.m38451y(parcel, iM38447u);
                    break;
                case 15:
                    strM38434h6 = C9717a.m38434h(parcel, iM38447u);
                    break;
            }
        }
        C9717a.m38439m(parcel, iM38424D);
        return new SnapshotMetadataEntity(gameEntity, playerEntity, strM38434h, uri, strM38434h2, strM38434h3, strM38434h4, jM38451y, jM38451y2, fM38445s, strM38434h5, zM38441o, jM38451y3, strM38434h6);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new SnapshotMetadataEntity[i10];
    }
}
