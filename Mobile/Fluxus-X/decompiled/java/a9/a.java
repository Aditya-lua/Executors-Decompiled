package a9;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public final class a extends p9.a {

    @NonNull
    public static final Parcelable.Creator<a> CREATOR = new l();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final e f318f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final b f319g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f320h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f321i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f322j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final d f323k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final c f324l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final boolean f325m;

    /* JADX INFO: renamed from: a9.a$a, reason: collision with other inner class name */
    @Deprecated
    public static final class C0008a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public e f326a;
        public b b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public d f327c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public c f328d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public String f329e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public boolean f330f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f331g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public boolean f332h;

        public C0008a() {
            e.C0012a c0012aA3 = e.A3();
            c0012aA3.b(false);
            this.f326a = c0012aA3.a();
            b.C0009a c0009aA3 = b.A3();
            c0009aA3.g(false);
            this.b = c0009aA3.b();
            d.C0011a c0011aA3 = d.A3();
            c0011aA3.d(false);
            this.f327c = c0011aA3.a();
            c.C0010a c0010aA3 = c.A3();
            c0010aA3.c(false);
            this.f328d = c0010aA3.a();
        }

        @NonNull
        public a a() {
            return new a(this.f326a, this.b, this.f329e, this.f330f, this.f331g, this.f327c, this.f328d, this.f332h);
        }

        @NonNull
        public C0008a b(boolean z10) {
            this.f330f = z10;
            return this;
        }

        @NonNull
        public C0008a c(@NonNull b bVar) {
            this.b = (b) o9.s.l(bVar);
            return this;
        }

        @NonNull
        public C0008a d(@NonNull c cVar) {
            this.f328d = (c) o9.s.l(cVar);
            return this;
        }

        @NonNull
        @Deprecated
        public C0008a e(@NonNull d dVar) {
            this.f327c = (d) o9.s.l(dVar);
            return this;
        }

        @NonNull
        public C0008a f(@NonNull e eVar) {
            this.f326a = (e) o9.s.l(eVar);
            return this;
        }

        @NonNull
        public C0008a g(boolean z10) {
            this.f332h = z10;
            return this;
        }

        @NonNull
        public final C0008a h(@NonNull String str) {
            this.f329e = str;
            return this;
        }

        @NonNull
        public final C0008a i(int i10) {
            this.f331g = i10;
            return this;
        }
    }

    @Deprecated
    public static final class b extends p9.a {

        @NonNull
        public static final Parcelable.Creator<b> CREATOR = new r();

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final boolean f333f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final String f334g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final String f335h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final boolean f336i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final String f337j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final List f338k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final boolean f339l;

        /* JADX INFO: renamed from: a9.a$b$a, reason: collision with other inner class name */
        public static final class C0009a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public boolean f340a = false;
            public String b = null;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public String f341c = null;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public boolean f342d = true;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public String f343e = null;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public List f344f = null;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            public boolean f345g = false;

            @NonNull
            public C0009a a(@NonNull String str, List<String> list) {
                this.f343e = (String) o9.s.m(str, "linkedServiceId must be provided if you want to associate linked accounts.");
                this.f344f = list;
                return this;
            }

            @NonNull
            public b b() {
                return new b(this.f340a, this.b, this.f341c, this.f342d, this.f343e, this.f344f, this.f345g);
            }

            @NonNull
            public C0009a c(boolean z10) {
                this.f342d = z10;
                return this;
            }

            @NonNull
            public C0009a d(String str) {
                this.f341c = str;
                return this;
            }

            @NonNull
            @Deprecated
            public C0009a e(boolean z10) {
                this.f345g = z10;
                return this;
            }

            @NonNull
            public C0009a f(@NonNull String str) {
                this.b = o9.s.f(str);
                return this;
            }

            @NonNull
            public C0009a g(boolean z10) {
                this.f340a = z10;
                return this;
            }
        }

        public b(boolean z10, String str, String str2, boolean z11, String str3, List list, boolean z12) {
            boolean z13 = true;
            if (z11 && z12) {
                z13 = false;
            }
            o9.s.b(z13, "filterByAuthorizedAccounts and requestVerifiedPhoneNumber must not both be true; the Verified Phone Number feature only works in sign-ups.");
            this.f333f = z10;
            if (z10) {
                o9.s.m(str, "serverClientId must be provided if Google ID tokens are requested");
            }
            this.f334g = str;
            this.f335h = str2;
            this.f336i = z11;
            Parcelable.Creator<a> creator = a.CREATOR;
            ArrayList arrayList = null;
            if (list != null && !list.isEmpty()) {
                arrayList = new ArrayList(list);
                Collections.sort(arrayList);
            }
            this.f338k = arrayList;
            this.f337j = str3;
            this.f339l = z12;
        }

        @NonNull
        public static C0009a A3() {
            return new C0009a();
        }

        public boolean B3() {
            return this.f336i;
        }

        public List<String> C3() {
            return this.f338k;
        }

        public String D3() {
            return this.f337j;
        }

        public String E3() {
            return this.f335h;
        }

        public String F3() {
            return this.f334g;
        }

        public boolean G3() {
            return this.f333f;
        }

        @Deprecated
        public boolean H3() {
            return this.f339l;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f333f == bVar.f333f && o9.q.b(this.f334g, bVar.f334g) && o9.q.b(this.f335h, bVar.f335h) && this.f336i == bVar.f336i && o9.q.b(this.f337j, bVar.f337j) && o9.q.b(this.f338k, bVar.f338k) && this.f339l == bVar.f339l;
        }

        public int hashCode() {
            return o9.q.c(Boolean.valueOf(this.f333f), this.f334g, this.f335h, Boolean.valueOf(this.f336i), this.f337j, this.f338k, Boolean.valueOf(this.f339l));
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@NonNull Parcel parcel, int i10) {
            int iA = p9.c.a(parcel);
            p9.c.c(parcel, 1, G3());
            p9.c.v(parcel, 2, F3(), false);
            p9.c.v(parcel, 3, E3(), false);
            p9.c.c(parcel, 4, B3());
            p9.c.v(parcel, 5, D3(), false);
            p9.c.x(parcel, 6, C3(), false);
            p9.c.c(parcel, 7, H3());
            p9.c.b(parcel, iA);
        }
    }

    @Deprecated
    public static final class c extends p9.a {

        @NonNull
        public static final Parcelable.Creator<c> CREATOR = new s();

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final boolean f346f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final String f347g;

        /* JADX INFO: renamed from: a9.a$c$a, reason: collision with other inner class name */
        public static final class C0010a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public boolean f348a = false;
            public String b;

            @NonNull
            public c a() {
                return new c(this.f348a, this.b);
            }

            @NonNull
            public C0010a b(@NonNull String str) {
                this.b = str;
                return this;
            }

            @NonNull
            public C0010a c(boolean z10) {
                this.f348a = z10;
                return this;
            }
        }

        public c(boolean z10, String str) {
            if (z10) {
                o9.s.l(str);
            }
            this.f346f = z10;
            this.f347g = str;
        }

        @NonNull
        public static C0010a A3() {
            return new C0010a();
        }

        @NonNull
        public String B3() {
            return this.f347g;
        }

        public boolean C3() {
            return this.f346f;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.f346f == cVar.f346f && o9.q.b(this.f347g, cVar.f347g);
        }

        public int hashCode() {
            return o9.q.c(Boolean.valueOf(this.f346f), this.f347g);
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@NonNull Parcel parcel, int i10) {
            int iA = p9.c.a(parcel);
            p9.c.c(parcel, 1, C3());
            p9.c.v(parcel, 2, B3(), false);
            p9.c.b(parcel, iA);
        }
    }

    @Deprecated
    public static final class d extends p9.a {

        @NonNull
        public static final Parcelable.Creator<d> CREATOR = new t();

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final boolean f349f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final byte[] f350g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final String f351h;

        /* JADX INFO: renamed from: a9.a$d$a, reason: collision with other inner class name */
        public static final class C0011a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public boolean f352a = false;
            public byte[] b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public String f353c;

            @NonNull
            public d a() {
                return new d(this.f352a, this.b, this.f353c);
            }

            @NonNull
            public C0011a b(@NonNull byte[] bArr) {
                this.b = bArr;
                return this;
            }

            @NonNull
            public C0011a c(@NonNull String str) {
                this.f353c = str;
                return this;
            }

            @NonNull
            public C0011a d(boolean z10) {
                this.f352a = z10;
                return this;
            }
        }

        public d(boolean z10, byte[] bArr, String str) {
            if (z10) {
                o9.s.l(bArr);
                o9.s.l(str);
            }
            this.f349f = z10;
            this.f350g = bArr;
            this.f351h = str;
        }

        @NonNull
        public static C0011a A3() {
            return new C0011a();
        }

        @NonNull
        public byte[] B3() {
            return this.f350g;
        }

        @NonNull
        public String C3() {
            return this.f351h;
        }

        public boolean D3() {
            return this.f349f;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return this.f349f == dVar.f349f && Arrays.equals(this.f350g, dVar.f350g) && Objects.equals(this.f351h, dVar.f351h);
        }

        public int hashCode() {
            return (Objects.hash(Boolean.valueOf(this.f349f), this.f351h) * 31) + Arrays.hashCode(this.f350g);
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@NonNull Parcel parcel, int i10) {
            int iA = p9.c.a(parcel);
            p9.c.c(parcel, 1, D3());
            p9.c.g(parcel, 2, B3(), false);
            p9.c.v(parcel, 3, C3(), false);
            p9.c.b(parcel, iA);
        }
    }

    @Deprecated
    public static final class e extends p9.a {

        @NonNull
        public static final Parcelable.Creator<e> CREATOR = new u();

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final boolean f354f;

        /* JADX INFO: renamed from: a9.a$e$a, reason: collision with other inner class name */
        public static final class C0012a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public boolean f355a = false;

            @NonNull
            public e a() {
                return new e(this.f355a);
            }

            @NonNull
            public C0012a b(boolean z10) {
                this.f355a = z10;
                return this;
            }
        }

        public e(boolean z10) {
            this.f354f = z10;
        }

        @NonNull
        public static C0012a A3() {
            return new C0012a();
        }

        public boolean B3() {
            return this.f354f;
        }

        public boolean equals(Object obj) {
            return (obj instanceof e) && this.f354f == ((e) obj).f354f;
        }

        public int hashCode() {
            return o9.q.c(Boolean.valueOf(this.f354f));
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@NonNull Parcel parcel, int i10) {
            int iA = p9.c.a(parcel);
            p9.c.c(parcel, 1, B3());
            p9.c.b(parcel, iA);
        }
    }

    public a(e eVar, b bVar, String str, boolean z10, int i10, d dVar, c cVar, boolean z11) {
        this.f318f = (e) o9.s.l(eVar);
        this.f319g = (b) o9.s.l(bVar);
        this.f320h = str;
        this.f321i = z10;
        this.f322j = i10;
        if (dVar == null) {
            d.C0011a c0011aA3 = d.A3();
            c0011aA3.d(false);
            dVar = c0011aA3.a();
        }
        this.f323k = dVar;
        if (cVar == null) {
            c.C0010a c0010aA3 = c.A3();
            c0010aA3.c(false);
            cVar = c0010aA3.a();
        }
        this.f324l = cVar;
        this.f325m = z11;
    }

    @NonNull
    public static C0008a A3() {
        return new C0008a();
    }

    @NonNull
    public static C0008a H3(@NonNull a aVar) {
        o9.s.l(aVar);
        C0008a c0008aA3 = A3();
        c0008aA3.c(aVar.B3());
        c0008aA3.f(aVar.E3());
        c0008aA3.e(aVar.D3());
        c0008aA3.d(aVar.C3());
        c0008aA3.b(aVar.f321i);
        c0008aA3.i(aVar.f322j);
        c0008aA3.g(aVar.f325m);
        String str = aVar.f320h;
        if (str != null) {
            c0008aA3.h(str);
        }
        return c0008aA3;
    }

    @NonNull
    public b B3() {
        return this.f319g;
    }

    @NonNull
    public c C3() {
        return this.f324l;
    }

    @NonNull
    public d D3() {
        return this.f323k;
    }

    @NonNull
    public e E3() {
        return this.f318f;
    }

    public boolean F3() {
        return this.f325m;
    }

    public boolean G3() {
        return this.f321i;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return o9.q.b(this.f318f, aVar.f318f) && o9.q.b(this.f319g, aVar.f319g) && o9.q.b(this.f323k, aVar.f323k) && o9.q.b(this.f324l, aVar.f324l) && o9.q.b(this.f320h, aVar.f320h) && this.f321i == aVar.f321i && this.f322j == aVar.f322j && this.f325m == aVar.f325m;
    }

    public int hashCode() {
        return o9.q.c(this.f318f, this.f319g, this.f323k, this.f324l, this.f320h, Boolean.valueOf(this.f321i), Integer.valueOf(this.f322j), Boolean.valueOf(this.f325m));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i10) {
        int iA = p9.c.a(parcel);
        p9.c.t(parcel, 1, E3(), i10, false);
        p9.c.t(parcel, 2, B3(), i10, false);
        p9.c.v(parcel, 3, this.f320h, false);
        p9.c.c(parcel, 4, G3());
        p9.c.n(parcel, 5, this.f322j);
        p9.c.t(parcel, 6, D3(), i10, false);
        p9.c.t(parcel, 7, C3(), i10, false);
        p9.c.c(parcel, 8, F3());
        p9.c.b(parcel, iA);
    }
}
