package gb;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class f2 extends p9.a {
    public static final Parcelable.Creator<f2> CREATOR = new g2();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f17620f;

    public f2(String str) {
        this.f17620f = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof f2) {
            return o9.q.b(this.f17620f, ((f2) obj).f17620f);
        }
        return false;
    }

    public final int hashCode() {
        return o9.q.c(this.f17620f);
    }

    public final String toString() {
        return o9.q.d(this).a("gameRunToken", this.f17620f).toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        String str = this.f17620f;
        int iA = p9.c.a(parcel);
        p9.c.v(parcel, 1, str, false);
        p9.c.b(parcel, iA);
    }

    public final String zza() {
        return this.f17620f;
    }
}
