package androidx.core.view;

import android.graphics.Point;
import android.view.RoundedCorner;

/* JADX INFO: renamed from: androidx.core.view.e0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0595e0 {

    /* JADX INFO: renamed from: a */
    public final int f2410a;

    /* JADX INFO: renamed from: b */
    public final int f2411b;

    /* JADX INFO: renamed from: c */
    public final Point f2412c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0595e0(int i10, int i11, int i12, int i13) {
        this.f2410a = i10;
        this.f2411b = i11;
        this.f2412c = new Point(i12, i13);
    }

    /* JADX INFO: renamed from: f */
    public static int m2881f(int i10) {
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

    /* JADX INFO: renamed from: g */
    public static int m2882g(int i10) {
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

    /* JADX INFO: renamed from: h */
    public static RoundedCorner m2883h(C0595e0 c0595e0) {
        if (c0595e0 == null) {
            return null;
        }
        C0592d0.m2841a();
        return C0589c0.m2819a(m2882g(c0595e0.m2887c()), c0595e0.m2889e(), c0595e0.m2885a(), c0595e0.m2886b());
    }

    /* JADX INFO: renamed from: i */
    public static C0595e0 m2884i(RoundedCorner roundedCorner) {
        if (roundedCorner != null) {
            return new C0595e0(m2881f(roundedCorner.getPosition()), roundedCorner.getRadius(), roundedCorner.getCenter());
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    public int m2885a() {
        return this.f2412c.x;
    }

    /* JADX INFO: renamed from: b */
    public int m2886b() {
        return this.f2412c.y;
    }

    /* JADX INFO: renamed from: c */
    public int m2887c() {
        return this.f2410a;
    }

    /* JADX INFO: renamed from: d */
    public final String m2888d(int i10) {
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

    /* JADX INFO: renamed from: e */
    public int m2889e() {
        return this.f2411b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C0595e0) {
            C0595e0 c0595e0 = (C0595e0) obj;
            if (this.f2410a == c0595e0.f2410a && this.f2411b == c0595e0.f2411b && this.f2412c.equals(c0595e0.f2412c)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return (((this.f2410a * 31) + this.f2411b) * 31) + this.f2412c.hashCode();
    }

    public String toString() {
        return "RoundedCornerCompat{position=" + m2888d(this.f2410a) + ", radius=" + this.f2411b + ", center=" + this.f2412c + '}';
    }

    public C0595e0(int i10, int i11, Point point) {
        this(i10, i11, point.x, point.y);
    }
}
