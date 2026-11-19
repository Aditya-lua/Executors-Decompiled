package da;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public class k extends p9.a {

    @NonNull
    public static final Parcelable.Creator<k> CREATOR = new u1();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final b f12052f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Boolean f12053g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final c0 f12054h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final z f12055i;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public b f12056a;
        public Boolean b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public z f12057c;

        @NonNull
        public k a() {
            b bVar = this.f12056a;
            String string = bVar == null ? null : bVar.toString();
            Boolean bool = this.b;
            z zVar = this.f12057c;
            return new k(string, bool, null, zVar == null ? null : zVar.toString());
        }

        @NonNull
        public a b(b bVar) {
            this.f12056a = bVar;
            return this;
        }

        @NonNull
        public a c(Boolean bool) {
            this.b = bool;
            return this;
        }

        @NonNull
        public a d(z zVar) {
            this.f12057c = zVar;
            return this;
        }
    }

    public k(String str, Boolean bool, String str2, String str3) {
        b bVarA;
        z zVarA = null;
        if (str == null) {
            bVarA = null;
        } else {
            try {
                bVarA = b.a(str);
            } catch (b.a | h1 | z.a e10) {
                throw new IllegalArgumentException(e10);
            }
        }
        this.f12052f = bVarA;
        this.f12053g = bool;
        this.f12054h = str2 == null ? null : c0.a(str2);
        if (str3 != null) {
            zVarA = z.a(str3);
        }
        this.f12055i = zVarA;
    }

    public String A3() {
        b bVar = this.f12052f;
        if (bVar == null) {
            return null;
        }
        return bVar.toString();
    }

    public Boolean B3() {
        return this.f12053g;
    }

    public z C3() {
        z zVar = this.f12055i;
        if (zVar != null) {
            return zVar;
        }
        Boolean bool = this.f12053g;
        if (bool == null || !bool.booleanValue()) {
            return null;
        }
        return z.RESIDENT_KEY_REQUIRED;
    }

    public String D3() {
        z zVarC3 = C3();
        if (zVarC3 == null) {
            return null;
        }
        return zVarC3.toString();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return o9.q.b(this.f12052f, kVar.f12052f) && o9.q.b(this.f12053g, kVar.f12053g) && o9.q.b(this.f12054h, kVar.f12054h) && o9.q.b(C3(), kVar.C3());
    }

    public int hashCode() {
        return o9.q.c(this.f12052f, this.f12053g, this.f12054h, C3());
    }

    @NonNull
    public final String toString() {
        z zVar = this.f12055i;
        c0 c0Var = this.f12054h;
        return "AuthenticatorSelectionCriteria{\n attachment=" + String.valueOf(this.f12052f) + ", \n requireResidentKey=" + this.f12053g + ", \n requireUserVerification=" + String.valueOf(c0Var) + ", \n residentKeyRequirement=" + String.valueOf(zVar) + "\n }";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i10) {
        int iA = p9.c.a(parcel);
        p9.c.v(parcel, 2, A3(), false);
        p9.c.e(parcel, 3, B3(), false);
        c0 c0Var = this.f12054h;
        p9.c.v(parcel, 4, c0Var == null ? null : c0Var.toString(), false);
        p9.c.v(parcel, 5, D3(), false);
        p9.c.b(parcel, iA);
    }
}
