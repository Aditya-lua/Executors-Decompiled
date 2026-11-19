package a9;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public class e extends p9.a {

    @NonNull
    public static final Parcelable.Creator<e> CREATOR = new q();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f358f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f359g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f360h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f361i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f362j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f363k;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f364a;
        public String b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f365c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public String f366d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f367e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f368f;

        @NonNull
        public e a() {
            return new e(this.f364a, this.b, this.f365c, this.f366d, this.f367e, this.f368f);
        }

        @NonNull
        public a b(String str) {
            this.b = str;
            return this;
        }

        @NonNull
        public a c(String str) {
            this.f366d = str;
            return this;
        }

        @NonNull
        @Deprecated
        public a d(boolean z10) {
            this.f367e = z10;
            return this;
        }

        @NonNull
        public a e(@NonNull String str) {
            o9.s.l(str);
            this.f364a = str;
            return this;
        }

        @NonNull
        public final a f(String str) {
            this.f365c = str;
            return this;
        }

        @NonNull
        public final a g(int i10) {
            this.f368f = i10;
            return this;
        }
    }

    public e(String str, String str2, String str3, String str4, boolean z10, int i10) {
        o9.s.l(str);
        this.f358f = str;
        this.f359g = str2;
        this.f360h = str3;
        this.f361i = str4;
        this.f362j = z10;
        this.f363k = i10;
    }

    @NonNull
    public static a A3() {
        return new a();
    }

    @NonNull
    public static a F3(@NonNull e eVar) {
        o9.s.l(eVar);
        a aVarA3 = A3();
        aVarA3.e(eVar.D3());
        aVarA3.c(eVar.C3());
        aVarA3.b(eVar.B3());
        aVarA3.d(eVar.f362j);
        aVarA3.g(eVar.f363k);
        String str = eVar.f360h;
        if (str != null) {
            aVarA3.f(str);
        }
        return aVarA3;
    }

    public String B3() {
        return this.f359g;
    }

    public String C3() {
        return this.f361i;
    }

    @NonNull
    public String D3() {
        return this.f358f;
    }

    @Deprecated
    public boolean E3() {
        return this.f362j;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return o9.q.b(this.f358f, eVar.f358f) && o9.q.b(this.f361i, eVar.f361i) && o9.q.b(this.f359g, eVar.f359g) && o9.q.b(Boolean.valueOf(this.f362j), Boolean.valueOf(eVar.f362j)) && this.f363k == eVar.f363k;
    }

    public int hashCode() {
        return o9.q.c(this.f358f, this.f359g, this.f361i, Boolean.valueOf(this.f362j), Integer.valueOf(this.f363k));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i10) {
        int iA = p9.c.a(parcel);
        p9.c.v(parcel, 1, D3(), false);
        p9.c.v(parcel, 2, B3(), false);
        p9.c.v(parcel, 3, this.f360h, false);
        p9.c.v(parcel, 4, C3(), false);
        p9.c.c(parcel, 5, E3());
        p9.c.n(parcel, 6, this.f363k);
        p9.c.b(parcel, iA);
    }
}
