package da;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public class t extends p9.a {

    @NonNull
    public static final Parcelable.Creator<t> CREATOR = new v0();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NonNull
    public final v f12133f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NonNull
    public final l f12134g;

    public t(@NonNull String str, int i10) {
        o9.s.l(str);
        try {
            this.f12133f = v.a(str);
            o9.s.l(Integer.valueOf(i10));
            try {
                this.f12134g = l.a(i10);
            } catch (l.a e10) {
                throw new IllegalArgumentException(e10);
            }
        } catch (v.a e11) {
            throw new IllegalArgumentException(e11);
        }
    }

    public int A3() {
        return this.f12134g.f();
    }

    @NonNull
    public String B3() {
        return this.f12133f.toString();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        return this.f12133f.equals(tVar.f12133f) && this.f12134g.equals(tVar.f12134g);
    }

    public int hashCode() {
        return o9.q.c(this.f12133f, this.f12134g);
    }

    @NonNull
    public final String toString() {
        l lVar = this.f12134g;
        return "PublicKeyCredentialParameters{\n type=" + String.valueOf(this.f12133f) + ", \n algorithm=" + String.valueOf(lVar) + "\n }";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i10) {
        int iA = p9.c.a(parcel);
        p9.c.v(parcel, 2, B3(), false);
        p9.c.q(parcel, 3, Integer.valueOf(A3()), false);
        p9.c.b(parcel, iA);
    }
}
