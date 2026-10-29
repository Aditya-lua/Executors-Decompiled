package sa;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.identitycredentials.CreateCredentialHandle;
import com.google.android.gms.identitycredentials.CreateCredentialResponse;
import p325o9.C9717a;
import p325o9.C9718b;

/* JADX INFO: renamed from: sa.e */
/* JADX INFO: loaded from: classes.dex */
public final class C11224e implements Parcelable.Creator<CreateCredentialHandle> {
    /* JADX INFO: renamed from: c */
    public static void m42252c(CreateCredentialHandle createCredentialHandle, Parcel parcel, int i10) {
        int iM38457a = C9718b.m38457a(parcel);
        C9718b.m38476t(parcel, 1, createCredentialHandle.getPendingIntent(), i10, false);
        C9718b.m38476t(parcel, 2, createCredentialHandle.getCreateCredentialResponse(), i10, false);
        C9718b.m38458b(parcel, iM38457a);
    }

    /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
    @Override // android.os.Parcelable.Creator
    @NonNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public CreateCredentialHandle createFromParcel(@NonNull Parcel parcel) {
        int iM38424D = C9717a.m38424D(parcel);
        PendingIntent pendingIntent = null;
        CreateCredentialResponse createCredentialResponse = null;
        while (parcel.dataPosition() < iM38424D) {
            int iM38447u = C9717a.m38447u(parcel);
            int iM38440n = C9717a.m38440n(iM38447u);
            if (iM38440n == 1) {
                pendingIntent = (PendingIntent) C9717a.m38433g(parcel, iM38447u, PendingIntent.CREATOR);
            } else if (iM38440n != 2) {
                C9717a.m38423C(parcel, iM38447u);
            } else {
                createCredentialResponse = (CreateCredentialResponse) C9717a.m38433g(parcel, iM38447u, CreateCredentialResponse.CREATOR);
            }
        }
        C9717a.m38439m(parcel, iM38424D);
        return new CreateCredentialHandle(pendingIntent, createCredentialResponse);
    }

    /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
    @Override // android.os.Parcelable.Creator
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public CreateCredentialHandle[] newArray(int i10) {
        return new CreateCredentialHandle[i10];
    }
}
