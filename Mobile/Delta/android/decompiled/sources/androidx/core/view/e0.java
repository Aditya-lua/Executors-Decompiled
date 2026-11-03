package androidx.core.view;

import android.graphics.Point;
import android.view.RoundedCorner;

/* JADX INFO: loaded from: classes.dex */
public final class e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f1703a;
    public final int b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Point f1704c;

    public e0(int i10, int i11, int i12, int i13) {
        this.f1703a = i10;
        this.b = i11;
        this.f1704c = new Point(i12, i13);
    }

    public static int f(int i10) {
        if (i10 == 0) {
            return 0;
        }
        int i11 = 1;
        if (i10 != 1) {
            i11 = 2;
            if (i10 != 2) {
                if (i10 == 3) {
                    return 3;
                }
                throw new IllegalArgumentException("Invalid position: " + i10);
            }
        }
        return i11;
    }

    public static int g(int i10) {
        if (i10 == 0) {
            return 0;
        }
        int i11 = 1;
        if (i10 != 1) {
            i11 = 2;
            if (i10 != 2) {
                if (i10 == 3) {
                    return 3;
                }
                throw new IllegalArgumentException("Invalid position: " + i10);
            }
        }
        return i11;
    }

    public static RoundedCorner h(e0 e0Var) {
        if (e0Var == null) {
            return null;
        }
        d0.a();
        return c0.a(g(e0Var.c()), e0Var.e(), e0Var.a(), e0Var.b());
    }

    public static e0 i(RoundedCorner roundedCorner) {
        if (roundedCorner != null) {
            return new e0(f(roundedCorner.getPosition()), roundedCorner.getRadius(), roundedCorner.getCenter());
        }
        return null;
    }

    public int a() {
        return this.f1704c.x;
    }

    public int b() {
        return this.f1704c.y;
    }

    public int c() {
        return this.f1703a;
    }

    public final String d(int i10) {
        if (i10 == 0) {
            return "TopLeft";
        }
        if (i10 == 1) {
            return "TopRight";
        }
        if (i10 != 2) {
            return i10 != 3 ? "Invalid" : "BottomLeft";
        }
        return "BottomRight";
    }

    public int e() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof e0) {
            e0 e0Var = (e0) obj;
            if (this.f1703a == e0Var.f1703a && this.b == e0Var.b && this.f1704c.equals(e0Var.f1704c)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return (((this.f1703a * 31) + this.b) * 31) + this.f1704c.hashCode();
    }

    public String toString() {
        return "RoundedCornerCompat{position=" + d(this.f1703a) + ", radius=" + this.b + ", center=" + this.f1704c + '}';
    }

    public e0(int i10, int i11, Point point) {
        this(i10, i11, point.x, point.y);
    }
}
