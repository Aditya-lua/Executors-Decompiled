package p124fa;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.games.PlayerEntity;
import com.google.android.gms.games.event.EventEntity;
import p325o9.C9717a;

/* JADX INFO: renamed from: fa.a */
/* JADX INFO: loaded from: classes.dex */
public final class C5495a implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iM38424D = C9717a.m38424D(parcel);
        boolean zM38441o = false;
        String strM38434h = null;
        String strM38434h2 = null;
        String strM38434h3 = null;
        Uri uri = null;
        String strM38434h4 = null;
        PlayerEntity playerEntity = null;
        String strM38434h5 = null;
        long jM38451y = 0;
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
                    strM38434h3 = C9717a.m38434h(parcel, iM38447u);
                    break;
                case 4:
                    uri = (Uri) C9717a.m38433g(parcel, iM38447u, Uri.CREATOR);
                    break;
                case 5:
                    strM38434h4 = C9717a.m38434h(parcel, iM38447u);
                    break;
                case 6:
                    playerEntity = (PlayerEntity) C9717a.m38433g(parcel, iM38447u, PlayerEntity.CREATOR);
                    break;
                case 7:
                    jM38451y = C9717a.m38451y(parcel, iM38447u);
                    break;
                case 8:
                    strM38434h5 = C9717a.m38434h(parcel, iM38447u);
                    break;
                case 9:
                    zM38441o = C9717a.m38441o(parcel, iM38447u);
                    break;
                default:
                    C9717a.m38423C(parcel, iM38447u);
                    break;
            }
        }
        C9717a.m38439m(parcel, iM38424D);
        return new EventEntity(strM38434h, strM38434h2, strM38434h3, uri, strM38434h4, playerEntity, jM38451y, strM38434h5, zM38441o);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new EventEntity[i10];
    }
}
