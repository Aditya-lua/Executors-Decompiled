package sa;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import ha.p;
import o9.q;
import p9.c;

/* JADX INFO: loaded from: classes.dex */
public final class a extends p {

    @NonNull
    public static final Parcelable.Creator<a> CREATOR = new b();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f31264f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f31265g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f31266h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean[] f31267i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean[] f31268j;

    public a(boolean z10, boolean z11, boolean z12, @NonNull boolean[] zArr, @NonNull boolean[] zArr2) {
        this.f31264f = z10;
        this.f31265g = z11;
        this.f31266h = z12;
        this.f31267i = zArr;
        this.f31268j = zArr2;
    }

    @NonNull
    public boolean[] A3() {
        return this.f31267i;
    }

    @NonNull
    public boolean[] B3() {
        return this.f31268j;
    }

    public boolean C3() {
        return this.f31264f;
    }

    public boolean D3() {
        return this.f31265g;
    }

    public boolean E3() {
        return this.f31266h;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        a aVar = (a) obj;
        return q.b(aVar.A3(), A3()) && q.b(aVar.B3(), B3()) && q.b(Boolean.valueOf(aVar.C3()), Boolean.valueOf(C3())) && q.b(Boolean.valueOf(aVar.D3()), Boolean.valueOf(D3())) && q.b(Boolean.valueOf(aVar.E3()), Boolean.valueOf(E3()));
    }

    public int hashCode() {
        return q.c(A3(), B3(), Boolean.valueOf(C3()), Boolean.valueOf(D3()), Boolean.valueOf(E3()));
    }

    @NonNull
    public String toString() {
        return q.d(this).a("SupportedCaptureModes", A3()).a("SupportedQualityLevels", B3()).a("CameraSupported", Boolean.valueOf(C3())).a("MicSupported", Boolean.valueOf(D3())).a("StorageWriteSupported", Boolean.valueOf(E3())).toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i10) {
        int iA = c.a(parcel);
        c.c(parcel, 1, C3());
        c.c(parcel, 2, D3());
        c.c(parcel, 3, E3());
        c.d(parcel, 4, A3(), false);
        c.d(parcel, 5, B3(), false);
        c.b(parcel, iA);
    }
}
