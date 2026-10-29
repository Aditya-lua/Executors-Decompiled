package hb;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ClientIdentity;
import com.google.android.gms.internal.location.zzj;
import com.google.android.gms.location.zzs;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class w implements Parcelable.Creator<zzj> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ zzj createFromParcel(Parcel parcel) {
        int iD = o9.a.D(parcel);
        zzs zzsVar = zzj.f6360j;
        List<ClientIdentity> listL = zzj.f6359i;
        String strH = null;
        while (parcel.dataPosition() < iD) {
            int iU = o9.a.u(parcel);
            int iN = o9.a.n(iU);
            if (iN == 1) {
                zzsVar = (zzs) o9.a.g(parcel, iU, zzs.CREATOR);
            } else if (iN == 2) {
                listL = o9.a.l(parcel, iU, ClientIdentity.CREATOR);
            } else if (iN != 3) {
                o9.a.C(parcel, iU);
            } else {
                strH = o9.a.h(parcel, iU);
            }
        }
        o9.a.m(parcel, iD);
        return new zzj(zzsVar, listL, strH);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ zzj[] newArray(int i10) {
        return new zzj[i10];
    }
}
