package sa;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.identitycredentials.PendingGetCredentialHandle;

/* JADX INFO: loaded from: classes.dex */
public final class r implements Parcelable.Creator<PendingGetCredentialHandle> {
    public static void c(PendingGetCredentialHandle pendingGetCredentialHandle, Parcel parcel, int i10) {
        int iA = o9.b.a(parcel);
        o9.b.t(parcel, 1, pendingGetCredentialHandle.getPendingIntent(), i10, false);
        o9.b.b(parcel, iA);
    }

    @Override // android.os.Parcelable.Creator
    @NonNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public PendingGetCredentialHandle createFromParcel(@NonNull Parcel parcel) {
        int iD = o9.a.D(parcel);
        PendingIntent pendingIntent = null;
        while (parcel.dataPosition() < iD) {
            int iU = o9.a.u(parcel);
            if (o9.a.n(iU) != 1) {
                o9.a.C(parcel, iU);
            } else {
                pendingIntent = (PendingIntent) o9.a.g(parcel, iU, PendingIntent.CREATOR);
            }
        }
        o9.a.m(parcel, iD);
        return new PendingGetCredentialHandle(pendingIntent);
    }

    @Override // android.os.Parcelable.Creator
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public PendingGetCredentialHandle[] newArray(int i10) {
        return new PendingGetCredentialHandle[i10];
    }
}
