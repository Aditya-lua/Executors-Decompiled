package p388qn;

import java.util.Objects;

/* JADX INFO: renamed from: qn.y */
/* JADX INFO: loaded from: classes3.dex */
public class C10629y {

    /* JADX INFO: renamed from: a */
    public final int f38103a;

    /* JADX INFO: renamed from: b */
    public final int f38104b;

    /* JADX INFO: renamed from: c */
    public final int f38105c;

    /* JADX INFO: renamed from: d */
    public final int f38106d;

    public C10629y(int i10, int i11, int i12, int i13) {
        if (i10 < 0) {
            throw new IllegalArgumentException("lineIndex " + i10 + " must be >= 0");
        }
        if (i11 < 0) {
            throw new IllegalArgumentException("columnIndex " + i11 + " must be >= 0");
        }
        if (i12 < 0) {
            throw new IllegalArgumentException("inputIndex " + i12 + " must be >= 0");
        }
        if (i13 >= 0) {
            this.f38103a = i10;
            this.f38104b = i11;
            this.f38105c = i12;
            this.f38106d = i13;
            return;
        }
        throw new IllegalArgumentException("length " + i13 + " must be >= 0");
    }

    /* JADX INFO: renamed from: e */
    public static C10629y m40715e(int i10, int i11, int i12, int i13) {
        return new C10629y(i10, i11, i12, i13);
    }

    /* JADX INFO: renamed from: a */
    public int m40716a() {
        return this.f38104b;
    }

    /* JADX INFO: renamed from: b */
    public int m40717b() {
        return this.f38105c;
    }

    /* JADX INFO: renamed from: c */
    public int m40718c() {
        return this.f38106d;
    }

    /* JADX INFO: renamed from: d */
    public int m40719d() {
        return this.f38103a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            C10629y c10629y = (C10629y) obj;
            if (this.f38103a == c10629y.f38103a && this.f38104b == c10629y.f38104b && this.f38105c == c10629y.f38105c && this.f38106d == c10629y.f38106d) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public C10629y m40720f(int i10) {
        return m40721g(i10, this.f38106d);
    }

    /* JADX INFO: renamed from: g */
    public C10629y m40721g(int i10, int i11) {
        if (i10 < 0) {
            throw new IndexOutOfBoundsException("beginIndex " + i10 + " + must be >= 0");
        }
        int i12 = this.f38106d;
        if (i10 > i12) {
            throw new IndexOutOfBoundsException("beginIndex " + i10 + " must be <= length " + this.f38106d);
        }
        if (i11 < 0) {
            throw new IndexOutOfBoundsException("endIndex " + i11 + " + must be >= 0");
        }
        if (i11 > i12) {
            throw new IndexOutOfBoundsException("endIndex " + i11 + " must be <= length " + this.f38106d);
        }
        if (i10 <= i11) {
            return (i10 == 0 && i11 == i12) ? this : new C10629y(this.f38103a, this.f38104b + i10, this.f38105c + i10, i11 - i10);
        }
        throw new IndexOutOfBoundsException("beginIndex " + i10 + " must be <= endIndex " + i11);
    }

    public int hashCode() {
        return Objects.hash(Integer.valueOf(this.f38103a), Integer.valueOf(this.f38104b), Integer.valueOf(this.f38105c), Integer.valueOf(this.f38106d));
    }

    public String toString() {
        return "SourceSpan{line=" + this.f38103a + ", column=" + this.f38104b + ", input=" + this.f38105c + ", length=" + this.f38106d + "}";
    }
}
