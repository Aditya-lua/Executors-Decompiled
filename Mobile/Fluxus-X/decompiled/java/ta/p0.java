package ta;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public final class p0 implements Parcelable.Creator<o0> {
    public static void c(o0 o0Var, Parcel parcel, int i10) {
        int iA = p9.c.a(parcel);
        p9.c.v(parcel, 1, o0Var.getCom.appsflyer.sdk_base.referrer.Payload.TYPE java.lang.String(), false);
        p9.c.v(parcel, 2, o0Var.getOrigin(), false);
        p9.c.f(parcel, 3, o0Var.getRequestData(), false);
        p9.c.b(parcel, iA);
    }

    @Override // android.os.Parcelable.Creator
    @NonNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public o0 createFromParcel(@NonNull Parcel parcel) {
        int iD = p9.b.D(parcel);
        String strH = null;
        String strH2 = null;
        Bundle bundleB = null;
        while (parcel.dataPosition() < iD) {
            int iU = p9.b.u(parcel);
            int iN = p9.b.n(iU);
            if (iN == 1) {
                strH = p9.b.h(parcel, iU);
            } else if (iN == 2) {
                strH2 = p9.b.h(parcel, iU);
            } else if (iN != 3) {
                p9.b.C(parcel, iU);
            } else {
                bundleB = p9.b.b(parcel, iU);
            }
        }
        p9.b.m(parcel, iD);
        return new o0(strH, strH2, bundleB);
    }

    @Override // android.os.Parcelable.Creator
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public o0[] newArray(int i10) {
        return new o0[i10];
    }
}
