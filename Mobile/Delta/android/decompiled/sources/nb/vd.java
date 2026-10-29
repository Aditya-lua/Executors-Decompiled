package nb;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.measurement.internal.zzoo;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class vd implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iD = o9.a.D(parcel);
        ArrayList<Integer> arrayListF = null;
        while (parcel.dataPosition() < iD) {
            int iU = o9.a.u(parcel);
            if (o9.a.n(iU) != 1) {
                o9.a.C(parcel, iU);
            } else {
                arrayListF = o9.a.f(parcel, iU);
            }
        }
        o9.a.m(parcel, iD);
        return new zzoo(arrayListF);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzoo[i10];
    }
}
