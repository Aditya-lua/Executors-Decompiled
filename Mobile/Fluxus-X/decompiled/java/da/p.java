package da;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public class p extends p9.a {

    @NonNull
    public static final Parcelable.Creator<p> CREATOR = new l0();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f12092f;

    public p(boolean z10) {
        this.f12092f = z10;
    }

    public boolean A3() {
        return this.f12092f;
    }

    public boolean equals(Object obj) {
        return (obj instanceof p) && this.f12092f == ((p) obj).A3();
    }

    public int hashCode() {
        return o9.q.c(Boolean.valueOf(this.f12092f));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i10) {
        int iA = p9.c.a(parcel);
        p9.c.c(parcel, 1, A3());
        p9.c.b(parcel, iA);
    }
}
