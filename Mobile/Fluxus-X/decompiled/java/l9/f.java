package l9;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public final class f extends p9.a {

    @NonNull
    public static final Parcelable.Creator<f> CREATOR;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NonNull
    public static final f f21995j;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f21996f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f21997g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f21998h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f21999i;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f22000a = -1;
        public int b = -1;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f22001c = 0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f22002d = true;

        @NonNull
        public f a() {
            return new f(this.f22000a, this.b, this.f22001c, this.f22002d);
        }

        @NonNull
        public a b(int i10) {
            this.f22000a = i10;
            return this;
        }

        @NonNull
        public a c(int i10) {
            this.b = i10;
            return this;
        }

        @NonNull
        public a d(boolean z10) {
            this.f22002d = z10;
            return this;
        }

        @NonNull
        public a e(int i10) {
            this.f22001c = i10;
            return this;
        }
    }

    static {
        a aVarA3 = A3();
        aVarA3.b(-1);
        aVarA3.c(-1);
        aVarA3.e(0);
        aVarA3.d(true);
        f21995j = aVarA3.a();
        CREATOR = new x();
    }

    public f(int i10, int i11, int i12, boolean z10) {
        this.f21996f = i10;
        this.f21997g = i11;
        this.f21998h = i12;
        this.f21999i = z10;
    }

    @NonNull
    public static a A3() {
        return new a();
    }

    @NonNull
    public static final a B3(@NonNull Context context) {
        return A3();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.f21996f == fVar.f21996f && this.f21997g == fVar.f21997g && this.f21998h == fVar.f21998h && this.f21999i == fVar.f21999i;
    }

    public final int hashCode() {
        return o9.q.c(Integer.valueOf(this.f21996f), Integer.valueOf(this.f21997g), Integer.valueOf(this.f21998h), Boolean.valueOf(this.f21999i));
    }

    @NonNull
    public final String toString() {
        int i10 = this.f21996f;
        int length = String.valueOf(i10).length();
        int i11 = this.f21997g;
        int length2 = String.valueOf(i11).length();
        int i12 = this.f21998h;
        int length3 = String.valueOf(i12).length();
        boolean z10 = this.f21999i;
        StringBuilder sb2 = new StringBuilder(length + 55 + length2 + 19 + length3 + 13 + String.valueOf(z10).length() + 1);
        sb2.append("ComplianceOptions{callerProductId=");
        sb2.append(i10);
        sb2.append(", dataOwnerProductId=");
        sb2.append(i11);
        sb2.append(", processingReason=");
        sb2.append(i12);
        sb2.append(", isUserData=");
        sb2.append(z10);
        sb2.append("}");
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i10) {
        int i11 = this.f21996f;
        int iA = p9.c.a(parcel);
        p9.c.n(parcel, 1, i11);
        p9.c.n(parcel, 2, this.f21997g);
        p9.c.n(parcel, 3, this.f21998h);
        p9.c.c(parcel, 4, this.f21999i);
        p9.c.b(parcel, iA);
    }
}
