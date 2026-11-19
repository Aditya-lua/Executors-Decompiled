package da;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public final class m0 extends p9.a {
    public static final Parcelable.Creator<m0> CREATOR = new n0();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NonNull
    public final String f12067f;

    public m0(@NonNull String str) {
        this.f12067f = (String) o9.s.l(str);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof m0) {
            return this.f12067f.equals(((m0) obj).f12067f);
        }
        return false;
    }

    public final int hashCode() {
        return o9.q.c(this.f12067f);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        String str = this.f12067f;
        int iA = p9.c.a(parcel);
        p9.c.v(parcel, 1, str, false);
        p9.c.b(parcel, iA);
    }
}
