package p432s9;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.moduleinstall.internal.ApiFeatureRequest;
import java.util.ArrayList;
import p325o9.C9717a;

/* JADX INFO: renamed from: s9.e */
/* JADX INFO: loaded from: classes.dex */
public final class C11202e implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iM38424D = C9717a.m38424D(parcel);
        ArrayList arrayListM38438l = null;
        String strM38434h = null;
        boolean zM38441o = false;
        String strM38434h2 = null;
        while (parcel.dataPosition() < iM38424D) {
            int iM38447u = C9717a.m38447u(parcel);
            int iM38440n = C9717a.m38440n(iM38447u);
            if (iM38440n == 1) {
                arrayListM38438l = C9717a.m38438l(parcel, iM38447u, Feature.CREATOR);
            } else if (iM38440n == 2) {
                zM38441o = C9717a.m38441o(parcel, iM38447u);
            } else if (iM38440n == 3) {
                strM38434h2 = C9717a.m38434h(parcel, iM38447u);
            } else if (iM38440n != 4) {
                C9717a.m38423C(parcel, iM38447u);
            } else {
                strM38434h = C9717a.m38434h(parcel, iM38447u);
            }
        }
        C9717a.m38439m(parcel, iM38424D);
        return new ApiFeatureRequest(arrayListM38438l, zM38441o, strM38434h2, strM38434h);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new ApiFeatureRequest[i10];
    }
}
