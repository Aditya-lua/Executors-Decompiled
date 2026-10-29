package ka;

import android.content.pm.ShortcutInfo;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.games.internal.v2.appshortcuts.zzg;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class f implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iD = o9.a.D(parcel);
        ArrayList<String> arrayListJ = null;
        ArrayList arrayListL = null;
        ArrayList<String> arrayListJ2 = null;
        ArrayList<String> arrayListJ3 = null;
        while (parcel.dataPosition() < iD) {
            int iU = o9.a.u(parcel);
            int iN = o9.a.n(iU);
            if (iN == 1) {
                arrayListJ = o9.a.j(parcel, iU);
            } else if (iN == 2) {
                arrayListL = o9.a.l(parcel, iU, ShortcutInfo.CREATOR);
            } else if (iN == 3) {
                arrayListJ2 = o9.a.j(parcel, iU);
            } else if (iN != 4) {
                o9.a.C(parcel, iU);
            } else {
                arrayListJ3 = o9.a.j(parcel, iU);
            }
        }
        o9.a.m(parcel, iD);
        return new zzg(arrayListJ, arrayListL, arrayListJ2, arrayListJ3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzg[i10];
    }
}
