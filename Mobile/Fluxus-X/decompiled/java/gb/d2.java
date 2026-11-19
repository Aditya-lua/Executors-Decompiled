package gb;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class d2 extends p9.a {
    public static final Parcelable.Creator<d2> CREATOR = new e2();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f17612f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final k2 f17613g;

    public d2(int i10, k2 k2Var) {
        this.f17612f = i10;
        this.f17613g = k2Var;
    }

    public static d2 A3(int i10) {
        return new d2(i10, null);
    }

    public static d2 B3(int i10, k2 k2Var) {
        return new d2(i10, k2Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d2)) {
            return false;
        }
        d2 d2Var = (d2) obj;
        return this.f17612f == d2Var.f17612f && o9.q.b(this.f17613g, d2Var.f17613g);
    }

    public final int hashCode() {
        return o9.q.c(Integer.valueOf(this.f17612f), this.f17613g);
    }

    public final String toString() {
        return o9.q.d(this).a("signInType", Integer.valueOf(this.f17612f)).a("previousStepResolutionResult", this.f17613g).toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = p9.c.a(parcel);
        p9.c.n(parcel, 1, this.f17612f);
        p9.c.t(parcel, 2, this.f17613g, i10, false);
        p9.c.b(parcel, iA);
    }

    public final int zzc() {
        return this.f17612f;
    }

    public final boolean zzd() {
        return this.f17613g == null;
    }
}
