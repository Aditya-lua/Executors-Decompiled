package ta;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.ResultReceiver;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public final class l implements Parcelable.Creator<k> {
    public static void c(k kVar, Parcel parcel, int i10) {
        int iA = p9.c.a(parcel);
        p9.c.v(parcel, 1, kVar.getCom.appsflyer.sdk_base.referrer.Payload.TYPE java.lang.String(), false);
        p9.c.f(parcel, 2, kVar.getCredentialData(), false);
        p9.c.f(parcel, 3, kVar.getCandidateQueryData(), false);
        p9.c.v(parcel, 4, kVar.getOrigin(), false);
        p9.c.v(parcel, 5, kVar.getRequestJson(), false);
        p9.c.t(parcel, 6, kVar.getResultReceiver(), i10, false);
        p9.c.b(parcel, iA);
    }

    @Override // android.os.Parcelable.Creator
    @NonNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public k createFromParcel(@NonNull Parcel parcel) {
        int iD = p9.b.D(parcel);
        String strH = null;
        Bundle bundleB = null;
        Bundle bundleB2 = null;
        String strH2 = null;
        String strH3 = null;
        ResultReceiver resultReceiver = null;
        while (parcel.dataPosition() < iD) {
            int iU = p9.b.u(parcel);
            switch (p9.b.n(iU)) {
                case 1:
                    strH = p9.b.h(parcel, iU);
                    break;
                case 2:
                    bundleB = p9.b.b(parcel, iU);
                    break;
                case 3:
                    bundleB2 = p9.b.b(parcel, iU);
                    break;
                case 4:
                    strH2 = p9.b.h(parcel, iU);
                    break;
                case 5:
                    strH3 = p9.b.h(parcel, iU);
                    break;
                case 6:
                    resultReceiver = (ResultReceiver) p9.b.g(parcel, iU, ResultReceiver.CREATOR);
                    break;
                default:
                    p9.b.C(parcel, iU);
                    break;
            }
        }
        p9.b.m(parcel, iD);
        return new k(strH, bundleB, bundleB2, strH2, strH3, resultReceiver);
    }

    @Override // android.os.Parcelable.Creator
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public k[] newArray(int i10) {
        return new k[i10];
    }
}
