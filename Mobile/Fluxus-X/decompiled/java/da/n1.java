package da;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import fb.m3;

/* JADX INFO: loaded from: classes.dex */
public final class n1 extends p9.a {
    public static final Parcelable.Creator<n1> CREATOR = new o1();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final m3 f12081f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final m3 f12082g;

    public n1(m3 m3Var, m3 m3Var2) {
        this.f12081f = m3Var;
        this.f12082g = m3Var2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof n1)) {
            return false;
        }
        n1 n1Var = (n1) obj;
        return o9.q.b(this.f12081f, n1Var.f12081f) && o9.q.b(this.f12082g, n1Var.f12082g);
    }

    public final int hashCode() {
        return o9.q.c(this.f12081f, this.f12082g);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i10) {
        m3 m3Var = this.f12081f;
        int iA = p9.c.a(parcel);
        p9.c.g(parcel, 1, m3Var == null ? null : m3Var.n(), false);
        m3 m3Var2 = this.f12082g;
        p9.c.g(parcel, 2, m3Var2 != null ? m3Var2.n() : null, false);
        p9.c.b(parcel, iA);
    }
}
