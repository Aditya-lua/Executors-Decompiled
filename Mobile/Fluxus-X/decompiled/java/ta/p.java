package ta;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public final class p implements Parcelable.Creator<o> {
    public static void c(o oVar, Parcel parcel, int i10) {
        int iA = p9.c.a(parcel);
        p9.c.v(parcel, 1, oVar.getCom.appsflyer.sdk_base.referrer.Payload.TYPE java.lang.String(), false);
        p9.c.f(parcel, 2, oVar.getData(), false);
        p9.c.b(parcel, iA);
    }

    @Override // android.os.Parcelable.Creator
    @NonNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public o createFromParcel(@NonNull Parcel parcel) {
        int iD = p9.b.D(parcel);
        String strH = null;
        Bundle bundleB = null;
        while (parcel.dataPosition() < iD) {
            int iU = p9.b.u(parcel);
            int iN = p9.b.n(iU);
            if (iN == 1) {
                strH = p9.b.h(parcel, iU);
            } else if (iN != 2) {
                p9.b.C(parcel, iU);
            } else {
                bundleB = p9.b.b(parcel, iU);
            }
        }
        p9.b.m(parcel, iD);
        return new o(strH, bundleB);
    }

    @Override // android.os.Parcelable.Creator
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public o[] newArray(int i10) {
        return new o[i10];
    }
}
