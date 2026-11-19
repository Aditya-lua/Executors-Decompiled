package ta;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public final class h implements Parcelable.Creator<g> {
    public static void c(g gVar, Parcel parcel, int i10) {
        int iA = p9.c.a(parcel);
        p9.c.c(parcel, 1, gVar.getIsDeleted());
        p9.c.b(parcel, iA);
    }

    @Override // android.os.Parcelable.Creator
    @NonNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public g createFromParcel(@NonNull Parcel parcel) {
        int iD = p9.b.D(parcel);
        boolean zO = false;
        while (parcel.dataPosition() < iD) {
            int iU = p9.b.u(parcel);
            if (p9.b.n(iU) != 1) {
                p9.b.C(parcel, iU);
            } else {
                zO = p9.b.o(parcel, iU);
            }
        }
        p9.b.m(parcel, iD);
        return new g(zO);
    }

    @Override // android.os.Parcelable.Creator
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public g[] newArray(int i10) {
        return new g[i10];
    }
}
