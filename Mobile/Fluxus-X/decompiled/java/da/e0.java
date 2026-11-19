package da;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public class e0 extends p9.a {

    @NonNull
    public static final Parcelable.Creator<e0> CREATOR = new j1();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f12033f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final short f12034g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final short f12035h;

    public e0(int i10, short s8, short s10) {
        this.f12033f = i10;
        this.f12034g = s8;
        this.f12035h = s10;
    }

    public short A3() {
        return this.f12034g;
    }

    public short B3() {
        return this.f12035h;
    }

    public int C3() {
        return this.f12033f;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof e0)) {
            return false;
        }
        e0 e0Var = (e0) obj;
        return this.f12033f == e0Var.f12033f && this.f12034g == e0Var.f12034g && this.f12035h == e0Var.f12035h;
    }

    public int hashCode() {
        return o9.q.c(Integer.valueOf(this.f12033f), Short.valueOf(this.f12034g), Short.valueOf(this.f12035h));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i10) {
        int iA = p9.c.a(parcel);
        p9.c.n(parcel, 1, C3());
        p9.c.u(parcel, 2, A3());
        p9.c.u(parcel, 3, B3());
        p9.c.b(parcel, iA);
    }
}
