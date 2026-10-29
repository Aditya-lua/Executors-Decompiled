package sa;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.identitycredentials.Credential;
import com.google.android.gms.identitycredentials.GetCredentialResponse;
import p325o9.C9717a;
import p325o9.C9718b;

/* JADX INFO: renamed from: sa.n */
/* JADX INFO: loaded from: classes.dex */
public final class C11233n implements Parcelable.Creator<GetCredentialResponse> {
    /* JADX INFO: renamed from: c */
    public static void m42277c(GetCredentialResponse getCredentialResponse, Parcel parcel, int i10) {
        int iM38457a = C9718b.m38457a(parcel);
        C9718b.m38476t(parcel, 1, getCredentialResponse.getCredential(), i10, false);
        C9718b.m38458b(parcel, iM38457a);
    }

    /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
    @Override // android.os.Parcelable.Creator
    @NonNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public GetCredentialResponse createFromParcel(@NonNull Parcel parcel) {
        int iM38424D = C9717a.m38424D(parcel);
        Credential credential = null;
        while (parcel.dataPosition() < iM38424D) {
            int iM38447u = C9717a.m38447u(parcel);
            if (C9717a.m38440n(iM38447u) != 1) {
                C9717a.m38423C(parcel, iM38447u);
            } else {
                credential = (Credential) C9717a.m38433g(parcel, iM38447u, Credential.CREATOR);
            }
        }
        C9717a.m38439m(parcel, iM38424D);
        return new GetCredentialResponse(credential);
    }

    /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
    @Override // android.os.Parcelable.Creator
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public GetCredentialResponse[] newArray(int i10) {
        return new GetCredentialResponse[i10];
    }
}
