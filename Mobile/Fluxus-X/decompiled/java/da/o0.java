package da;

import android.os.Parcel;
import android.os.Parcelable;
import fb.e4;
import fb.m3;

/* JADX INFO: loaded from: classes.dex */
public final class o0 extends p9.a {
    public static final Parcelable.Creator<o0> CREATOR = new p0();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final e4 f12084j = e4.h(1);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final e4 f12085k = e4.h(2);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final e4 f12086l = e4.h(3);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final e4 f12087m = e4.h(4);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final m3 f12088f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final m3 f12089g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final m3 f12090h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f12091i;

    public o0(m3 m3Var, m3 m3Var2, m3 m3Var3, int i10) {
        this.f12088f = m3Var;
        this.f12089g = m3Var2;
        this.f12090h = m3Var3;
        this.f12091i = i10;
    }

    public final byte[] A3() {
        m3 m3Var = this.f12088f;
        if (m3Var == null) {
            return null;
        }
        return m3Var.n();
    }

    public final byte[] B3() {
        m3 m3Var = this.f12090h;
        if (m3Var == null) {
            return null;
        }
        return m3Var.n();
    }

    public final byte[] C3() {
        m3 m3Var = this.f12089g;
        if (m3Var == null) {
            return null;
        }
        return m3Var.n();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof o0)) {
            return false;
        }
        o0 o0Var = (o0) obj;
        return o9.q.b(this.f12088f, o0Var.f12088f) && o9.q.b(this.f12089g, o0Var.f12089g) && o9.q.b(this.f12090h, o0Var.f12090h) && this.f12091i == o0Var.f12091i;
    }

    public final int hashCode() {
        return o9.q.c(this.f12088f, this.f12089g, this.f12090h, Integer.valueOf(this.f12091i));
    }

    public final String toString() {
        return "HmacSecretExtension{coseKeyAgreement=" + v9.c.b(A3()) + ", saltEnc=" + v9.c.b(C3()) + ", saltAuth=" + v9.c.b(B3()) + ", getPinUvAuthProtocol=" + this.f12091i + "}";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = p9.c.a(parcel);
        p9.c.g(parcel, 1, A3(), false);
        p9.c.g(parcel, 2, C3(), false);
        p9.c.g(parcel, 3, B3(), false);
        p9.c.n(parcel, 4, this.f12091i);
        p9.c.b(parcel, iA);
    }
}
