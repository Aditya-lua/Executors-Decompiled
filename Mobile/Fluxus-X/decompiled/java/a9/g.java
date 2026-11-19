package a9;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public class g extends p9.a {

    @NonNull
    public static final Parcelable.Creator<g> CREATOR = new v();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final k f369f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f370g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f371h;

    @Deprecated
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public k f372a;
        public String b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f373c;

        @NonNull
        public g a() {
            return new g(this.f372a, this.b, this.f373c);
        }

        @NonNull
        public a b(@NonNull k kVar) {
            this.f372a = kVar;
            return this;
        }

        @NonNull
        public final a c(@NonNull String str) {
            this.b = str;
            return this;
        }

        @NonNull
        public final a d(int i10) {
            this.f373c = i10;
            return this;
        }
    }

    public g(k kVar, String str, int i10) {
        this.f369f = (k) o9.s.l(kVar);
        this.f370g = str;
        this.f371h = i10;
    }

    @NonNull
    public static a A3() {
        return new a();
    }

    @NonNull
    public static a C3(@NonNull g gVar) {
        o9.s.l(gVar);
        a aVarA3 = A3();
        aVarA3.b(gVar.B3());
        aVarA3.d(gVar.f371h);
        String str = gVar.f370g;
        if (str != null) {
            aVarA3.c(str);
        }
        return aVarA3;
    }

    @NonNull
    public k B3() {
        return this.f369f;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return o9.q.b(this.f369f, gVar.f369f) && o9.q.b(this.f370g, gVar.f370g) && this.f371h == gVar.f371h;
    }

    public int hashCode() {
        return o9.q.c(this.f369f, this.f370g);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i10) {
        int iA = p9.c.a(parcel);
        p9.c.t(parcel, 1, B3(), i10, false);
        p9.c.v(parcel, 2, this.f370g, false);
        p9.c.n(parcel, 3, this.f371h);
        p9.c.b(parcel, iA);
    }
}
