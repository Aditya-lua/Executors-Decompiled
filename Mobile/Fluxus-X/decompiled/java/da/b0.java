package da;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public class b0 extends p9.a {

    @NonNull
    public static final Parcelable.Creator<b0> CREATOR = new f1();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f11995f;

    public b0(boolean z10) {
        this.f11995f = z10;
    }

    public boolean A3() {
        return this.f11995f;
    }

    public boolean equals(Object obj) {
        return (obj instanceof b0) && this.f11995f == ((b0) obj).f11995f;
    }

    public int hashCode() {
        return o9.q.c(Boolean.valueOf(this.f11995f));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i10) {
        int iA = p9.c.a(parcel);
        p9.c.c(parcel, 1, A3());
        p9.c.b(parcel, iA);
    }
}
