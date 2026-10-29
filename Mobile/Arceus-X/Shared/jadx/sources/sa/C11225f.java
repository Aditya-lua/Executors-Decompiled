package sa;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.ResultReceiver;
import androidx.annotation.NonNull;
import com.google.android.gms.identitycredentials.CreateCredentialRequest;
import p325o9.C9717a;
import p325o9.C9718b;

/* JADX INFO: renamed from: sa.f */
/* JADX INFO: loaded from: classes.dex */
public final class C11225f implements Parcelable.Creator<CreateCredentialRequest> {
    /* JADX INFO: renamed from: c */
    public static void m42255c(CreateCredentialRequest createCredentialRequest, Parcel parcel, int i10) {
        int iM38457a = C9718b.m38457a(parcel);
        C9718b.m38478v(parcel, 1, createCredentialRequest.getCom.appsflyer.sdk_base.referrer.Payload.TYPE java.lang.String(), false);
        C9718b.m38462f(parcel, 2, createCredentialRequest.getCredentialData(), false);
        C9718b.m38462f(parcel, 3, createCredentialRequest.getCandidateQueryData(), false);
        C9718b.m38478v(parcel, 4, createCredentialRequest.getOrigin(), false);
        C9718b.m38478v(parcel, 5, createCredentialRequest.getRequestJson(), false);
        C9718b.m38476t(parcel, 6, createCredentialRequest.getResultReceiver(), i10, false);
        C9718b.m38458b(parcel, iM38457a);
    }

    /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
    @Override // android.os.Parcelable.Creator
    @NonNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public CreateCredentialRequest createFromParcel(@NonNull Parcel parcel) {
        int iM38424D = C9717a.m38424D(parcel);
        String strM38434h = null;
        Bundle bundleM38428b = null;
        Bundle bundleM38428b2 = null;
        String strM38434h2 = null;
        String strM38434h3 = null;
        ResultReceiver resultReceiver = null;
        while (parcel.dataPosition() < iM38424D) {
            int iM38447u = C9717a.m38447u(parcel);
            switch (C9717a.m38440n(iM38447u)) {
                case 1:
                    strM38434h = C9717a.m38434h(parcel, iM38447u);
                    break;
                case 2:
                    bundleM38428b = C9717a.m38428b(parcel, iM38447u);
                    break;
                case 3:
                    bundleM38428b2 = C9717a.m38428b(parcel, iM38447u);
                    break;
                case 4:
                    strM38434h2 = C9717a.m38434h(parcel, iM38447u);
                    break;
                case 5:
                    strM38434h3 = C9717a.m38434h(parcel, iM38447u);
                    break;
                case 6:
                    resultReceiver = (ResultReceiver) C9717a.m38433g(parcel, iM38447u, ResultReceiver.CREATOR);
                    break;
                default:
                    C9717a.m38423C(parcel, iM38447u);
                    break;
            }
        }
        C9717a.m38439m(parcel, iM38424D);
        return new CreateCredentialRequest(strM38434h, bundleM38428b, bundleM38428b2, strM38434h2, strM38434h3, resultReceiver);
    }

    /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
    @Override // android.os.Parcelable.Creator
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public CreateCredentialRequest[] newArray(int i10) {
        return new CreateCredentialRequest[i10];
    }
}
