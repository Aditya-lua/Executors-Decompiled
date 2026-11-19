package f9;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import o9.s;

/* JADX INFO: loaded from: classes.dex */
public class f extends p9.a {

    @NonNull
    public static final Parcelable.Creator<f> CREATOR = new k();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final byte[] f15713f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f15714g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f15715h;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public byte[] f15716a;
        public boolean b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f15717c = "com.google.android.gms.auth.blockstore.DEFAULT_BYTES_DATA_KEY";

        @NonNull
        public f a() {
            return new f(this.f15716a, this.b, this.f15717c);
        }

        @NonNull
        public a b(@NonNull byte[] bArr) {
            this.f15716a = bArr;
            return this;
        }

        @NonNull
        public a c(@NonNull String str) {
            s.g(str, "key cannot be null or empty");
            this.f15717c = str;
            return this;
        }

        @NonNull
        public a d(boolean z10) {
            this.b = z10;
            return this;
        }
    }

    public f(byte[] bArr, boolean z10, String str) {
        this.f15713f = bArr;
        this.f15714g = z10;
        this.f15715h = str;
    }

    @NonNull
    public byte[] A3() {
        return this.f15713f;
    }

    @NonNull
    public String B3() {
        return this.f15715h;
    }

    public boolean C3() {
        return this.f15714g;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i10) {
        int iA = p9.c.a(parcel);
        p9.c.g(parcel, 1, A3(), false);
        p9.c.c(parcel, 2, C3());
        p9.c.v(parcel, 3, B3(), false);
        p9.c.b(parcel, iA);
    }
}
