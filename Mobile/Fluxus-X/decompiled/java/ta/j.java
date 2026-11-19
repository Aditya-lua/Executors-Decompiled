package ta;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public final class j implements Parcelable.Creator<i> {
    public static void c(i iVar, Parcel parcel, int i10) {
        int iA = p9.c.a(parcel);
        p9.c.t(parcel, 1, iVar.getPendingIntent(), i10, false);
        p9.c.t(parcel, 2, iVar.getCreateCredentialResponse(), i10, false);
        p9.c.b(parcel, iA);
    }

    @Override // android.os.Parcelable.Creator
    @NonNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public i createFromParcel(@NonNull Parcel parcel) {
        int iD = p9.b.D(parcel);
        PendingIntent pendingIntent = null;
        m mVar = null;
        while (parcel.dataPosition() < iD) {
            int iU = p9.b.u(parcel);
            int iN = p9.b.n(iU);
            if (iN == 1) {
                pendingIntent = (PendingIntent) p9.b.g(parcel, iU, PendingIntent.CREATOR);
            } else if (iN != 2) {
                p9.b.C(parcel, iU);
            } else {
                mVar = (m) p9.b.g(parcel, iU, m.CREATOR);
            }
        }
        p9.b.m(parcel, iD);
        return new i(pendingIntent, mVar);
    }

    @Override // android.os.Parcelable.Creator
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public i[] newArray(int i10) {
        return new i[i10];
    }
}
