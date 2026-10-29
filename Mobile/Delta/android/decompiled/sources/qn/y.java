package qn;

import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f29502a;
    public final int b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f29503c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f29504d;

    public y(int i10, int i11, int i12, int i13) {
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
            this.f29502a = i10;
            this.b = i11;
            this.f29503c = i12;
            this.f29504d = i13;
            return;
        }
        throw new IllegalArgumentException("length " + i13 + " must be >= 0");
    }

    public static y e(int i10, int i11, int i12, int i13) {
        return new y(i10, i11, i12, i13);
    }

    public int a() {
        return this.b;
    }

    public int b() {
        return this.f29503c;
    }

    public int c() {
        return this.f29504d;
    }

    public int d() {
        return this.f29502a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            y yVar = (y) obj;
            if (this.f29502a == yVar.f29502a && this.b == yVar.b && this.f29503c == yVar.f29503c && this.f29504d == yVar.f29504d) {
                return true;
            }
        }
        return false;
    }

    public y f(int i10) {
        return g(i10, this.f29504d);
    }

    public y g(int i10, int i11) {
        if (i10 < 0) {
            throw new IndexOutOfBoundsException("beginIndex " + i10 + " + must be >= 0");
        }
        int i12 = this.f29504d;
        if (i10 > i12) {
            throw new IndexOutOfBoundsException("beginIndex " + i10 + " must be <= length " + this.f29504d);
        }
        if (i11 < 0) {
            throw new IndexOutOfBoundsException("endIndex " + i11 + " + must be >= 0");
        }
        if (i11 > i12) {
            throw new IndexOutOfBoundsException("endIndex " + i11 + " must be <= length " + this.f29504d);
        }
        if (i10 <= i11) {
            return (i10 == 0 && i11 == i12) ? this : new y(this.f29502a, this.b + i10, this.f29503c + i10, i11 - i10);
        }
        throw new IndexOutOfBoundsException("beginIndex " + i10 + " must be <= endIndex " + i11);
    }

    public int hashCode() {
        return Objects.hash(Integer.valueOf(this.f29502a), Integer.valueOf(this.b), Integer.valueOf(this.f29503c), Integer.valueOf(this.f29504d));
    }

    public String toString() {
        return "SourceSpan{line=" + this.f29502a + ", column=" + this.b + ", input=" + this.f29503c + ", length=" + this.f29504d + "}";
    }
}
