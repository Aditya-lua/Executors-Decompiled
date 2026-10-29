package p214ja;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.games.internal.player.StockProfileImageEntity;
import p325o9.C9717a;

/* JADX INFO: renamed from: ja.f */
/* JADX INFO: loaded from: classes.dex */
public final class C7127f implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iM38424D = C9717a.m38424D(parcel);
        String strM38434h = "";
        String strM38434h2 = null;
        Uri uri = null;
        while (parcel.dataPosition() < iM38424D) {
            int iM38447u = C9717a.m38447u(parcel);
            int iM38440n = C9717a.m38440n(iM38447u);
            if (iM38440n == 1) {
                strM38434h2 = C9717a.m38434h(parcel, iM38447u);
            } else if (iM38440n == 2) {
                uri = (Uri) C9717a.m38433g(parcel, iM38447u, Uri.CREATOR);
            } else if (iM38440n != 3) {
                C9717a.m38423C(parcel, iM38447u);
            } else {
                strM38434h = C9717a.m38434h(parcel, iM38447u);
            }
        }
        C9717a.m38439m(parcel, iM38424D);
        return new StockProfileImageEntity(strM38434h2, uri, strM38434h);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new StockProfileImageEntity[i10];
    }
}
