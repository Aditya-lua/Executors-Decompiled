package s9;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import o9.s;

/* JADX INFO: loaded from: classes.dex */
public class h extends p9.a {

    @NonNull
    public static final Parcelable.Creator<h> CREATOR = new m();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f31257f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f31258g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Long f31259h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Long f31260i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f31261j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final a f31262k;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f31263a;
        public final long b;

        public a(long j10, long j11) {
            s.o(j11);
            this.f31263a = j10;
            this.b = j11;
        }
    }

    public h(int i10, int i11, Long l10, Long l11, int i12) {
        this.f31257f = i10;
        this.f31258g = i11;
        this.f31259h = l10;
        this.f31260i = l11;
        this.f31261j = i12;
        this.f31262k = (l10 == null || l11 == null || l11.longValue() == 0) ? null : new a(l10.longValue(), l11.longValue());
    }

    public int A3() {
        return this.f31261j;
    }

    public int B3() {
        return this.f31258g;
    }

    public int C3() {
        return this.f31257f;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i10) {
        int iA = p9.c.a(parcel);
        p9.c.n(parcel, 1, C3());
        p9.c.n(parcel, 2, B3());
        p9.c.s(parcel, 3, this.f31259h, false);
        p9.c.s(parcel, 4, this.f31260i, false);
        p9.c.n(parcel, 5, A3());
        p9.c.b(parcel, iA);
    }
}
