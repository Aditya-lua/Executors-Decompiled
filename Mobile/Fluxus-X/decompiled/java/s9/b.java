package s9;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public class b extends p9.a {

    @NonNull
    public static final Parcelable.Creator<b> CREATOR = new i();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f31248f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f31249g;

    public b(boolean z10, int i10) {
        this.f31248f = z10;
        this.f31249g = i10;
    }

    public boolean A3() {
        return this.f31248f;
    }

    public int B3() {
        return this.f31249g;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i10) {
        int iA = p9.c.a(parcel);
        p9.c.c(parcel, 1, A3());
        p9.c.n(parcel, 2, B3());
        p9.c.b(parcel, iA);
    }
}
