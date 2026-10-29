package p243ka;

import android.content.pm.ShortcutInfo;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.games.internal.p049v2.appshortcuts.zzg;
import java.util.ArrayList;
import p325o9.C9717a;

/* JADX INFO: renamed from: ka.f */
/* JADX INFO: loaded from: classes.dex */
public final class C7520f implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iM38424D = C9717a.m38424D(parcel);
        ArrayList<String> arrayListM38436j = null;
        ArrayList arrayListM38438l = null;
        ArrayList<String> arrayListM38436j2 = null;
        ArrayList<String> arrayListM38436j3 = null;
        while (parcel.dataPosition() < iM38424D) {
            int iM38447u = C9717a.m38447u(parcel);
            int iM38440n = C9717a.m38440n(iM38447u);
            if (iM38440n == 1) {
                arrayListM38436j = C9717a.m38436j(parcel, iM38447u);
            } else if (iM38440n == 2) {
                arrayListM38438l = C9717a.m38438l(parcel, iM38447u, ShortcutInfo.CREATOR);
            } else if (iM38440n == 3) {
                arrayListM38436j2 = C9717a.m38436j(parcel, iM38447u);
            } else if (iM38440n != 4) {
                C9717a.m38423C(parcel, iM38447u);
            } else {
                arrayListM38436j3 = C9717a.m38436j(parcel, iM38447u);
            }
        }
        C9717a.m38439m(parcel, iM38424D);
        return new zzg(arrayListM38436j, arrayListM38438l, arrayListM38436j2, arrayListM38436j3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzg[i10];
    }
}
