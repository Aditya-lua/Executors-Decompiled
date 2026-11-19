package o9;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public class g extends p9.a {

    @NonNull
    public static final Parcelable.Creator<g> CREATOR = new n1();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final u f26954f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f26955g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f26956h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int[] f26957i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f26958j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int[] f26959k;

    public g(@NonNull u uVar, boolean z10, boolean z11, int[] iArr, int i10, int[] iArr2) {
        this.f26954f = uVar;
        this.f26955g = z10;
        this.f26956h = z11;
        this.f26957i = iArr;
        this.f26958j = i10;
        this.f26959k = iArr2;
    }

    public int A3() {
        return this.f26958j;
    }

    public int[] B3() {
        return this.f26957i;
    }

    public int[] C3() {
        return this.f26959k;
    }

    public boolean D3() {
        return this.f26955g;
    }

    public boolean E3() {
        return this.f26956h;
    }

    @NonNull
    public final u F3() {
        return this.f26954f;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i10) {
        int iA = p9.c.a(parcel);
        p9.c.t(parcel, 1, this.f26954f, i10, false);
        p9.c.c(parcel, 2, D3());
        p9.c.c(parcel, 3, E3());
        p9.c.o(parcel, 4, B3(), false);
        p9.c.n(parcel, 5, A3());
        p9.c.o(parcel, 6, C3(), false);
        p9.c.b(parcel, iA);
    }
}
