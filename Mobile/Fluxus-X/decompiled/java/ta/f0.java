package ta;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public final class f0 implements Parcelable.Creator<e0> {
    public static void c(e0 e0Var, Parcel parcel, int i10) {
        int iA = p9.c.a(parcel);
        p9.c.t(parcel, 1, e0Var.getPendingIntent(), i10, false);
        p9.c.b(parcel, iA);
    }

    @Override // android.os.Parcelable.Creator
    @NonNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public e0 createFromParcel(@NonNull Parcel parcel) {
        int iD = p9.b.D(parcel);
        PendingIntent pendingIntent = null;
        while (parcel.dataPosition() < iD) {
            int iU = p9.b.u(parcel);
            if (p9.b.n(iU) != 1) {
                p9.b.C(parcel, iU);
            } else {
                pendingIntent = (PendingIntent) p9.b.g(parcel, iU, PendingIntent.CREATOR);
            }
        }
        p9.b.m(parcel, iD);
        return new e0(pendingIntent);
    }

    @Override // android.os.Parcelable.Creator
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public e0[] newArray(int i10) {
        return new e0[i10];
    }
}
