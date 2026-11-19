package da;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public class a0 extends p9.a {

    @NonNull
    public static final Parcelable.Creator<a0> CREATOR = new d1();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NonNull
    public static final a0 f11983h = new a0(a.SUPPORTED.toString(), null);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NonNull
    public static final a0 f11984i = new a0(a.NOT_SUPPORTED.toString(), null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NonNull
    public final a f11985f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f11986g;

    public enum a implements Parcelable {
        PRESENT("present"),
        SUPPORTED("supported"),
        NOT_SUPPORTED("not-supported");


        @NonNull
        public static final Parcelable.Creator<a> CREATOR = new c1();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NonNull
        public final String f11990a;

        a(String str) {
            this.f11990a = str;
        }

        @NonNull
        public static a a(@NonNull String str) throws b {
            for (a aVar : values()) {
                if (str.equals(aVar.f11990a)) {
                    return aVar;
                }
            }
            throw new b(str);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // java.lang.Enum
        @NonNull
        public String toString() {
            return this.f11990a;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@NonNull Parcel parcel, int i10) {
            parcel.writeString(this.f11990a);
        }
    }

    public static class b extends Exception {
        public b(@NonNull String str) {
            super(String.format("TokenBindingStatus %s not supported", str));
        }
    }

    public a0(@NonNull String str, String str2) {
        o9.s.l(str);
        try {
            this.f11985f = a.a(str);
            this.f11986g = str2;
        } catch (b e10) {
            throw new IllegalArgumentException(e10);
        }
    }

    public String A3() {
        return this.f11986g;
    }

    @NonNull
    public String B3() {
        return this.f11985f.toString();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof a0)) {
            return false;
        }
        a0 a0Var = (a0) obj;
        return fb.l0.a(this.f11985f, a0Var.f11985f) && fb.l0.a(this.f11986g, a0Var.f11986g);
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.f11985f, this.f11986g});
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i10) {
        int iA = p9.c.a(parcel);
        p9.c.v(parcel, 2, B3(), false);
        p9.c.v(parcel, 3, A3(), false);
        p9.c.b(parcel, iA);
    }
}
