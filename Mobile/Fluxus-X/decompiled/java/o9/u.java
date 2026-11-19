package o9;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public class u extends p9.a {

    @NonNull
    public static final Parcelable.Creator<u> CREATOR = new c1();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f27045f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f27046g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f27047h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f27048i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f27049j;

    public u(int i10, boolean z10, boolean z11, int i11, int i12) {
        this.f27045f = i10;
        this.f27046g = z10;
        this.f27047h = z11;
        this.f27048i = i11;
        this.f27049j = i12;
    }

    public int A3() {
        return this.f27048i;
    }

    public int B3() {
        return this.f27049j;
    }

    public boolean C3() {
        return this.f27046g;
    }

    public boolean D3() {
        return this.f27047h;
    }

    public int E3() {
        return this.f27045f;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i10) {
        int iA = p9.c.a(parcel);
        p9.c.n(parcel, 1, E3());
        p9.c.c(parcel, 2, C3());
        p9.c.c(parcel, 3, D3());
        p9.c.n(parcel, 4, A3());
        p9.c.n(parcel, 5, B3());
        p9.c.b(parcel, iA);
    }
}
