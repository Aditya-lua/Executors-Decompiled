package ta;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public final class r0 implements Parcelable.Creator<q0> {
    public static void c(q0 q0Var, Parcel parcel, int i10) {
        p9.c.b(parcel, p9.c.a(parcel));
    }

    @Override // android.os.Parcelable.Creator
    @NonNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public q0 createFromParcel(@NonNull Parcel parcel) {
        int iD = p9.b.D(parcel);
        while (parcel.dataPosition() < iD) {
            int iU = p9.b.u(parcel);
            p9.b.n(iU);
            p9.b.C(parcel, iU);
        }
        p9.b.m(parcel, iD);
        return new q0();
    }

    @Override // android.os.Parcelable.Creator
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public q0[] newArray(int i10) {
        return new q0[i10];
    }
}
