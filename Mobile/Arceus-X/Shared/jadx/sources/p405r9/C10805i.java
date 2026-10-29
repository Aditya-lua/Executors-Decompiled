package p405r9;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.moduleinstall.ModuleInstallStatusUpdate;
import p325o9.C9717a;

/* JADX INFO: renamed from: r9.i */
/* JADX INFO: loaded from: classes.dex */
public final class C10805i implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iM38424D = C9717a.m38424D(parcel);
        int iM38449w = 0;
        int iM38449w2 = 0;
        int iM38449w3 = 0;
        Long lM38452z = null;
        Long lM38452z2 = null;
        while (parcel.dataPosition() < iM38424D) {
            int iM38447u = C9717a.m38447u(parcel);
            int iM38440n = C9717a.m38440n(iM38447u);
            if (iM38440n == 1) {
                iM38449w = C9717a.m38449w(parcel, iM38447u);
            } else if (iM38440n == 2) {
                iM38449w2 = C9717a.m38449w(parcel, iM38447u);
            } else if (iM38440n == 3) {
                lM38452z = C9717a.m38452z(parcel, iM38447u);
            } else if (iM38440n == 4) {
                lM38452z2 = C9717a.m38452z(parcel, iM38447u);
            } else if (iM38440n != 5) {
                C9717a.m38423C(parcel, iM38447u);
            } else {
                iM38449w3 = C9717a.m38449w(parcel, iM38447u);
            }
        }
        C9717a.m38439m(parcel, iM38424D);
        return new ModuleInstallStatusUpdate(iM38449w, iM38449w2, lM38452z, lM38452z2, iM38449w3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new ModuleInstallStatusUpdate[i10];
    }
}
