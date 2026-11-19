package ta;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.github.luben.zstd.BuildConfig;

/* JADX INFO: loaded from: classes.dex */
public final class r implements Parcelable.Creator<q> {
    public static void c(q qVar, Parcel parcel, int i10) {
        int iA = p9.c.a(parcel);
        p9.c.v(parcel, 1, qVar.getCom.appsflyer.sdk_base.referrer.Payload.TYPE java.lang.String(), false);
        p9.c.f(parcel, 2, qVar.getCredentialRetrievalData(), false);
        p9.c.f(parcel, 3, qVar.getCandidateQueryData(), false);
        p9.c.v(parcel, 4, qVar.getRequestMatcher(), false);
        p9.c.v(parcel, 5, qVar.getRequestType(), false);
        p9.c.v(parcel, 6, qVar.getProtocolType(), false);
        p9.c.b(parcel, iA);
    }

    @Override // android.os.Parcelable.Creator
    @NonNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public q createFromParcel(@NonNull Parcel parcel) {
        int iD = p9.b.D(parcel);
        String strH = BuildConfig.FLAVOR;
        String strH2 = strH;
        String strH3 = strH2;
        Bundle bundleB = null;
        Bundle bundleB2 = null;
        String strH4 = null;
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
                    strH4 = p9.b.h(parcel, iU);
                    break;
                case 5:
                    strH2 = p9.b.h(parcel, iU);
                    break;
                case 6:
                    strH3 = p9.b.h(parcel, iU);
                    break;
                default:
                    p9.b.C(parcel, iU);
                    break;
            }
        }
        p9.b.m(parcel, iD);
        return new q(strH, bundleB, bundleB2, strH4, strH2, strH3);
    }

    @Override // android.os.Parcelable.Creator
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public q[] newArray(int i10) {
        return new q[i10];
    }
}
