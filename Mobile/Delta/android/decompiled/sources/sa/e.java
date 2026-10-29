package sa;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.identitycredentials.CreateCredentialHandle;
import com.google.android.gms.identitycredentials.CreateCredentialResponse;

/* JADX INFO: loaded from: classes.dex */
public final class e implements Parcelable.Creator<CreateCredentialHandle> {
    public static void c(CreateCredentialHandle createCredentialHandle, Parcel parcel, int i10) {
        int iA = o9.b.a(parcel);
        o9.b.t(parcel, 1, createCredentialHandle.getPendingIntent(), i10, false);
        o9.b.t(parcel, 2, createCredentialHandle.getCreateCredentialResponse(), i10, false);
        o9.b.b(parcel, iA);
    }

    @Override // android.os.Parcelable.Creator
    @NonNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public CreateCredentialHandle createFromParcel(@NonNull Parcel parcel) {
        int iD = o9.a.D(parcel);
        PendingIntent pendingIntent = null;
        CreateCredentialResponse createCredentialResponse = null;
        while (parcel.dataPosition() < iD) {
            int iU = o9.a.u(parcel);
            int iN = o9.a.n(iU);
            if (iN == 1) {
                pendingIntent = (PendingIntent) o9.a.g(parcel, iU, PendingIntent.CREATOR);
            } else if (iN != 2) {
                o9.a.C(parcel, iU);
            } else {
                createCredentialResponse = (CreateCredentialResponse) o9.a.g(parcel, iU, CreateCredentialResponse.CREATOR);
            }
        }
        o9.a.m(parcel, iD);
        return new CreateCredentialHandle(pendingIntent, createCredentialResponse);
    }

    @Override // android.os.Parcelable.Creator
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public CreateCredentialHandle[] newArray(int i10) {
        return new CreateCredentialHandle[i10];
    }
}
