package s9;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public class g extends p9.a {

    @NonNull
    public static final Parcelable.Creator<g> CREATOR = new l();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f31255f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f31256g;

    public g(int i10) {
        this(i10, false);
    }

    public int A3() {
        return this.f31255f;
    }

    public final boolean B3() {
        return this.f31256g;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i10) {
        int iA = p9.c.a(parcel);
        p9.c.n(parcel, 1, A3());
        p9.c.c(parcel, 2, this.f31256g);
        p9.c.b(parcel, iA);
    }

    public g(int i10, boolean z10) {
        this.f31255f = i10;
        this.f31256g = z10;
    }
}
