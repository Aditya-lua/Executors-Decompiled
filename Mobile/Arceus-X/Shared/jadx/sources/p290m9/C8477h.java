package p290m9;

import android.database.CursorWindow;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.data.DataHolder;
import p325o9.C9717a;

/* JADX INFO: renamed from: m9.h */
/* JADX INFO: loaded from: classes.dex */
public final class C8477h implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iM38424D = C9717a.m38424D(parcel);
        String[] strArrM38435i = null;
        CursorWindow[] cursorWindowArr = null;
        Bundle bundleM38428b = null;
        int iM38449w = 0;
        int iM38449w2 = 0;
        while (parcel.dataPosition() < iM38424D) {
            int iM38447u = C9717a.m38447u(parcel);
            int iM38440n = C9717a.m38440n(iM38447u);
            if (iM38440n == 1) {
                strArrM38435i = C9717a.m38435i(parcel, iM38447u);
            } else if (iM38440n == 2) {
                cursorWindowArr = (CursorWindow[]) C9717a.m38437k(parcel, iM38447u, CursorWindow.CREATOR);
            } else if (iM38440n == 3) {
                iM38449w2 = C9717a.m38449w(parcel, iM38447u);
            } else if (iM38440n == 4) {
                bundleM38428b = C9717a.m38428b(parcel, iM38447u);
            } else if (iM38440n != 1000) {
                C9717a.m38423C(parcel, iM38447u);
            } else {
                iM38449w = C9717a.m38449w(parcel, iM38447u);
            }
        }
        C9717a.m38439m(parcel, iM38424D);
        DataHolder dataHolder = new DataHolder(iM38449w, strArrM38435i, cursorWindowArr, iM38449w2, bundleM38428b);
        dataHolder.m9192E3();
        return dataHolder;
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new DataHolder[i10];
    }
}
