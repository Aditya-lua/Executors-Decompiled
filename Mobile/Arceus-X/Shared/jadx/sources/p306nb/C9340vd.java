package p306nb;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.measurement.internal.zzoo;
import java.util.ArrayList;
import p325o9.C9717a;

/* JADX INFO: renamed from: nb.vd */
/* JADX INFO: loaded from: classes.dex */
public final class C9340vd implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iM38424D = C9717a.m38424D(parcel);
        ArrayList<Integer> arrayListM38432f = null;
        while (parcel.dataPosition() < iM38424D) {
            int iM38447u = C9717a.m38447u(parcel);
            if (C9717a.m38440n(iM38447u) != 1) {
                C9717a.m38423C(parcel, iM38447u);
            } else {
                arrayListM38432f = C9717a.m38432f(parcel, iM38447u);
            }
        }
        C9717a.m38439m(parcel, iM38424D);
        return new zzoo(arrayListM38432f);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzoo[i10];
    }
}
