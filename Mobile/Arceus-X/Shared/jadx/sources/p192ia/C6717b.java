package p192ia;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.games.internal.game.GameBadgeEntity;
import p325o9.C9717a;

/* JADX INFO: renamed from: ia.b */
/* JADX INFO: loaded from: classes.dex */
public class C6717b implements Parcelable.Creator {
    /* JADX INFO: renamed from: a */
    public GameBadgeEntity mo28811a(Parcel parcel) {
        int iM38424D = C9717a.m38424D(parcel);
        String strM38434h = null;
        Uri uri = null;
        int iM38449w = 0;
        String strM38434h2 = null;
        while (parcel.dataPosition() < iM38424D) {
            int iM38447u = C9717a.m38447u(parcel);
            int iM38440n = C9717a.m38440n(iM38447u);
            if (iM38440n == 1) {
                iM38449w = C9717a.m38449w(parcel, iM38447u);
            } else if (iM38440n == 2) {
                strM38434h = C9717a.m38434h(parcel, iM38447u);
            } else if (iM38440n == 3) {
                strM38434h2 = C9717a.m38434h(parcel, iM38447u);
            } else if (iM38440n != 4) {
                C9717a.m38423C(parcel, iM38447u);
            } else {
                uri = (Uri) C9717a.m38433g(parcel, iM38447u, Uri.CREATOR);
            }
        }
        C9717a.m38439m(parcel, iM38424D);
        return new GameBadgeEntity(iM38449w, strM38434h, strM38434h2, uri);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new GameBadgeEntity[i10];
    }
}
