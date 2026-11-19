package ta;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public final class z implements Parcelable.Creator<y> {
    public static void c(y yVar, Parcel parcel, int i10) {
        int iA = p9.c.a(parcel);
        p9.c.t(parcel, 1, yVar.getCredential(), i10, false);
        p9.c.b(parcel, iA);
    }

    @Override // android.os.Parcelable.Creator
    @NonNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public y createFromParcel(@NonNull Parcel parcel) {
        int iD = p9.b.D(parcel);
        o oVar = null;
        while (parcel.dataPosition() < iD) {
            int iU = p9.b.u(parcel);
            if (p9.b.n(iU) != 1) {
                p9.b.C(parcel, iU);
            } else {
                oVar = (o) p9.b.g(parcel, iU, o.CREATOR);
            }
        }
        p9.b.m(parcel, iD);
        return new y(oVar);
    }

    @Override // android.os.Parcelable.Creator
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public y[] newArray(int i10) {
        return new y[i10];
    }
}
