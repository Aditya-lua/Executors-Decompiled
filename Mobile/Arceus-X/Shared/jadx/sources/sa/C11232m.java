package sa;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.ResultReceiver;
import androidx.annotation.NonNull;
import com.google.android.gms.identitycredentials.CredentialOption;
import com.google.android.gms.identitycredentials.GetCredentialRequest;
import java.util.ArrayList;
import p325o9.C9717a;
import p325o9.C9718b;

/* JADX INFO: renamed from: sa.m */
/* JADX INFO: loaded from: classes.dex */
public final class C11232m implements Parcelable.Creator<GetCredentialRequest> {
    /* JADX INFO: renamed from: c */
    public static void m42274c(GetCredentialRequest getCredentialRequest, Parcel parcel, int i10) {
        int iM38457a = C9718b.m38457a(parcel);
        C9718b.m38482z(parcel, 1, getCredentialRequest.m9557v3(), false);
        C9718b.m38462f(parcel, 2, getCredentialRequest.getData(), false);
        C9718b.m38478v(parcel, 3, getCredentialRequest.getOrigin(), false);
        C9718b.m38476t(parcel, 4, getCredentialRequest.getResultReceiver(), i10, false);
        C9718b.m38458b(parcel, iM38457a);
    }

    /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
    @Override // android.os.Parcelable.Creator
    @NonNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public GetCredentialRequest createFromParcel(@NonNull Parcel parcel) {
        int iM38424D = C9717a.m38424D(parcel);
        ArrayList arrayListM38438l = null;
        Bundle bundleM38428b = null;
        String strM38434h = null;
        ResultReceiver resultReceiver = null;
        while (parcel.dataPosition() < iM38424D) {
            int iM38447u = C9717a.m38447u(parcel);
            int iM38440n = C9717a.m38440n(iM38447u);
            if (iM38440n == 1) {
                arrayListM38438l = C9717a.m38438l(parcel, iM38447u, CredentialOption.CREATOR);
            } else if (iM38440n == 2) {
                bundleM38428b = C9717a.m38428b(parcel, iM38447u);
            } else if (iM38440n == 3) {
                strM38434h = C9717a.m38434h(parcel, iM38447u);
            } else if (iM38440n != 4) {
                C9717a.m38423C(parcel, iM38447u);
            } else {
                resultReceiver = (ResultReceiver) C9717a.m38433g(parcel, iM38447u, ResultReceiver.CREATOR);
            }
        }
        C9717a.m38439m(parcel, iM38424D);
        return new GetCredentialRequest(arrayListM38438l, bundleM38428b, strM38434h, resultReceiver);
    }

    /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
    @Override // android.os.Parcelable.Creator
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public GetCredentialRequest[] newArray(int i10) {
        return new GetCredentialRequest[i10];
    }
}
