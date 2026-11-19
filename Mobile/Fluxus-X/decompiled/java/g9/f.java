package g9;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public final class f implements Parcelable.Creator<e> {
    public static void c(e eVar, Parcel parcel, int i10) {
        int iA = p9.c.a(parcel);
        p9.c.f(parcel, 1, eVar.getRequestBundle(), false);
        p9.c.b(parcel, iA);
    }

    @Override // android.os.Parcelable.Creator
    @NonNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public e createFromParcel(@NonNull Parcel parcel) {
        int iD = p9.b.D(parcel);
        Bundle bundleB = null;
        while (parcel.dataPosition() < iD) {
            int iU = p9.b.u(parcel);
            if (p9.b.n(iU) != 1) {
                p9.b.C(parcel, iU);
            } else {
                bundleB = p9.b.b(parcel, iU);
            }
        }
        p9.b.m(parcel, iD);
        return new e(bundleB);
    }

    @Override // android.os.Parcelable.Creator
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public e[] newArray(int i10) {
        return new e[i10];
    }
}
