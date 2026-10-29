package p243ka;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.PersistableBundle;
import com.google.android.gms.games.internal.p049v2.appshortcuts.zzi;
import p325o9.C9717a;

/* JADX INFO: renamed from: ka.g */
/* JADX INFO: loaded from: classes.dex */
public final class C7521g implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iM38424D = C9717a.m38424D(parcel);
        String strM38434h = null;
        PersistableBundle persistableBundle = null;
        Boolean boolM38442p = null;
        Boolean boolM38442p2 = null;
        while (parcel.dataPosition() < iM38424D) {
            int iM38447u = C9717a.m38447u(parcel);
            int iM38440n = C9717a.m38440n(iM38447u);
            if (iM38440n == 1) {
                strM38434h = C9717a.m38434h(parcel, iM38447u);
            } else if (iM38440n == 2) {
                persistableBundle = (PersistableBundle) C9717a.m38433g(parcel, iM38447u, PersistableBundle.CREATOR);
            } else if (iM38440n == 3) {
                boolM38442p = C9717a.m38442p(parcel, iM38447u);
            } else if (iM38440n != 4) {
                C9717a.m38423C(parcel, iM38447u);
            } else {
                boolM38442p2 = C9717a.m38442p(parcel, iM38447u);
            }
        }
        C9717a.m38439m(parcel, iM38424D);
        return new zzi(strM38434h, persistableBundle, boolM38442p, boolM38442p2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzi[i10];
    }
}
