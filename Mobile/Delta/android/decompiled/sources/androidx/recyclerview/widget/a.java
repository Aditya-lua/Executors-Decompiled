package androidx.recyclerview.widget;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class a implements m.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public x2.d<b> f2967a;
    public final ArrayList<b> b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList<b> f2968c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final InterfaceC0048a f2969d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Runnable f2970e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f2971f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final m f2972g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f2973h;

    /* JADX INFO: renamed from: androidx.recyclerview.widget.a$a, reason: collision with other inner class name */
    public interface InterfaceC0048a {
        void a(int i10, int i11);

        void b(b bVar);

        void c(b bVar);

        void d(int i10, int i11);

        void e(int i10, int i11, Object obj);

        RecyclerView.f0 f(int i10);

        void g(int i10, int i11);

        void h(int i10, int i11);
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f2974a;
        public int b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Object f2975c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f2976d;

        public b(int i10, int i11, int i12, Object obj) {
            this.f2974a = i10;
            this.b = i11;
            this.f2976d = i12;
            this.f2975c = obj;
        }

        public String a() {
            int i10 = this.f2974a;
            if (i10 == 1) {
                return "add";
            }
            if (i10 == 2) {
                return "rm";
            }
            if (i10 != 4) {
                return i10 != 8 ? "??" : "mv";
            }
            return "up";
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            int i10 = this.f2974a;
            if (i10 != bVar.f2974a) {
                return false;
            }
            if (i10 == 8 && Math.abs(this.f2976d - this.b) == 1 && this.f2976d == bVar.b && this.b == bVar.f2976d) {
                return true;
            }
            if (this.f2976d != bVar.f2976d || this.b != bVar.b) {
                return false;
            }
            Object obj2 = this.f2975c;
            if (obj2 != null) {
                if (!obj2.equals(bVar.f2975c)) {
                    return false;
                }
            } else if (bVar.f2975c != null) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return (((this.f2974a * 31) + this.b) * 31) + this.f2976d;
        }

        public String toString() {
            return Integer.toHexString(System.identityHashCode(this)) + "[" + a() + ",s:" + this.b + "c:" + this.f2976d + ",p:" + this.f2975c + "]";
        }
    }

    public a(InterfaceC0048a interfaceC0048a) {
        this(interfaceC0048a, false);
    }

    @Override // androidx.recyclerview.widget.m.a
    public b a(int i10, int i11, int i12, Object obj) {
        b bVarB = this.f2967a.b();
        if (bVarB == null) {
            return new b(i10, i11, i12, obj);
        }
        bVarB.f2974a = i10;
        bVarB.b = i11;
        bVarB.f2976d = i12;
        bVarB.f2975c = obj;
        return bVarB;
    }

    @Override // androidx.recyclerview.widget.m.a
    public void b(b bVar) {
        if (this.f2971f) {
            return;
        }
        bVar.f2975c = null;
        this.f2967a.a(bVar);
    }

    public final void c(b bVar) {
        v(bVar);
    }

    public final void d(b bVar) {
        v(bVar);
    }

    public int e(int i10) {
        int size = this.b.size();
        for (int i11 = 0; i11 < size; i11++) {
            b bVar = this.b.get(i11);
            int i12 = bVar.f2974a;
            if (i12 != 1) {
                if (i12 == 2) {
                    int i13 = bVar.b;
                    if (i13 <= i10) {
                        int i14 = bVar.f2976d;
                        if (i13 + i14 > i10) {
                            return -1;
                        }
                        i10 -= i14;
                    } else {
                        continue;
                    }
                } else if (i12 == 8) {
                    int i15 = bVar.b;
                    if (i15 == i10) {
                        i10 = bVar.f2976d;
                    } else {
                        if (i15 < i10) {
                            i10--;
                        }
                        if (bVar.f2976d <= i10) {
                            i10++;
                        }
                    }
                }
            } else if (bVar.b <= i10) {
                i10 += bVar.f2976d;
            }
        }
        return i10;
    }

    public final void f(b bVar) {
        boolean z10;
        byte b10;
        int i10 = bVar.b;
        int i11 = bVar.f2976d + i10;
        byte b11 = -1;
        int i12 = i10;
        int i13 = 0;
        while (i12 < i11) {
            if (this.f2969d.f(i12) != null || h(i12)) {
                if (b11 == 0) {
                    k(a(2, i10, i13, null));
                    z10 = true;
                } else {
                    z10 = false;
                }
                b10 = 1;
            } else {
                if (b11 == 1) {
                    v(a(2, i10, i13, null));
                    z10 = true;
                } else {
                    z10 = false;
                }
                b10 = 0;
            }
            if (z10) {
                i12 -= i13;
                i11 -= i13;
                i13 = 1;
            } else {
                i13++;
            }
            i12++;
            b11 = b10;
        }
        if (i13 != bVar.f2976d) {
            b(bVar);
            bVar = a(2, i10, i13, null);
        }
        if (b11 == 0) {
            k(bVar);
        } else {
            v(bVar);
        }
    }

    public final void g(b bVar) {
        int i10 = bVar.b;
        int i11 = bVar.f2976d + i10;
        int i12 = 0;
        byte b10 = -1;
        int i13 = i10;
        while (i10 < i11) {
            if (this.f2969d.f(i10) != null || h(i10)) {
                if (b10 == 0) {
                    k(a(4, i13, i12, bVar.f2975c));
                    i13 = i10;
                    i12 = 0;
                }
                b10 = 1;
            } else {
                if (b10 == 1) {
                    v(a(4, i13, i12, bVar.f2975c));
                    i13 = i10;
                    i12 = 0;
                }
                b10 = 0;
            }
            i12++;
            i10++;
        }
        if (i12 != bVar.f2976d) {
            Object obj = bVar.f2975c;
            b(bVar);
            bVar = a(4, i13, i12, obj);
        }
        if (b10 == 0) {
            k(bVar);
        } else {
            v(bVar);
        }
    }

    public final boolean h(int i10) {
        int size = this.f2968c.size();
        for (int i11 = 0; i11 < size; i11++) {
            b bVar = this.f2968c.get(i11);
            int i12 = bVar.f2974a;
            if (i12 == 8) {
                if (n(bVar.f2976d, i11 + 1) == i10) {
                    return true;
                }
            } else if (i12 == 1) {
                int i13 = bVar.b;
                int i14 = bVar.f2976d + i13;
                while (i13 < i14) {
                    if (n(i13, i11 + 1) == i10) {
                        return true;
                    }
                    i13++;
                }
            } else {
                continue;
            }
        }
        return false;
    }

    public void i() {
        int size = this.f2968c.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f2969d.c(this.f2968c.get(i10));
        }
        x(this.f2968c);
        this.f2973h = 0;
    }

    public void j() {
        i();
        int size = this.b.size();
        for (int i10 = 0; i10 < size; i10++) {
            b bVar = this.b.get(i10);
            int i11 = bVar.f2974a;
            if (i11 == 1) {
                this.f2969d.c(bVar);
                this.f2969d.g(bVar.b, bVar.f2976d);
            } else if (i11 == 2) {
                this.f2969d.c(bVar);
                this.f2969d.h(bVar.b, bVar.f2976d);
            } else if (i11 == 4) {
                this.f2969d.c(bVar);
                this.f2969d.e(bVar.b, bVar.f2976d, bVar.f2975c);
            } else if (i11 == 8) {
                this.f2969d.c(bVar);
                this.f2969d.a(bVar.b, bVar.f2976d);
            }
            Runnable runnable = this.f2970e;
            if (runnable != null) {
                runnable.run();
            }
        }
        x(this.b);
        this.f2973h = 0;
    }

    public final void k(b bVar) {
        int i10;
        int i11 = bVar.f2974a;
        if (i11 == 1 || i11 == 8) {
            throw new IllegalArgumentException("should not dispatch add or move for pre layout");
        }
        int iZ = z(bVar.b, i11);
        int i12 = bVar.b;
        int i13 = bVar.f2974a;
        if (i13 == 2) {
            i10 = 0;
        } else {
            if (i13 != 4) {
                throw new IllegalArgumentException("op should be remove or update." + bVar);
            }
            i10 = 1;
        }
        int i14 = 1;
        for (int i15 = 1; i15 < bVar.f2976d; i15++) {
            int iZ2 = z(bVar.b + (i10 * i15), bVar.f2974a);
            int i16 = bVar.f2974a;
            if (i16 == 2 ? iZ2 != iZ : !(i16 == 4 && iZ2 == iZ + 1)) {
                b bVarA = a(i16, iZ, i14, bVar.f2975c);
                l(bVarA, i12);
                b(bVarA);
                if (bVar.f2974a == 4) {
                    i12 += i14;
                }
                i14 = 1;
                iZ = iZ2;
            } else {
                i14++;
            }
        }
        Object obj = bVar.f2975c;
        b(bVar);
        if (i14 > 0) {
            b bVarA2 = a(bVar.f2974a, iZ, i14, obj);
            l(bVarA2, i12);
            b(bVarA2);
        }
    }

    public void l(b bVar, int i10) {
        this.f2969d.b(bVar);
        int i11 = bVar.f2974a;
        if (i11 == 2) {
            this.f2969d.h(i10, bVar.f2976d);
        } else {
            if (i11 != 4) {
                throw new IllegalArgumentException("only remove and update ops can be dispatched in first pass");
            }
            this.f2969d.e(i10, bVar.f2976d, bVar.f2975c);
        }
    }

    public int m(int i10) {
        return n(i10, 0);
    }

    public int n(int i10, int i11) {
        int size = this.f2968c.size();
        while (i11 < size) {
            b bVar = this.f2968c.get(i11);
            int i12 = bVar.f2974a;
            if (i12 == 8) {
                int i13 = bVar.b;
                if (i13 == i10) {
                    i10 = bVar.f2976d;
                } else {
                    if (i13 < i10) {
                        i10--;
                    }
                    if (bVar.f2976d <= i10) {
                        i10++;
                    }
                }
            } else {
                int i14 = bVar.b;
                if (i14 > i10) {
                    continue;
                } else if (i12 == 2) {
                    int i15 = bVar.f2976d;
                    if (i10 < i14 + i15) {
                        return -1;
                    }
                    i10 -= i15;
                } else if (i12 == 1) {
                    i10 += bVar.f2976d;
                }
            }
            i11++;
        }
        return i10;
    }

    public boolean o(int i10) {
        return (i10 & this.f2973h) != 0;
    }

    public boolean p() {
        return this.b.size() > 0;
    }

    public boolean q() {
        return (this.f2968c.isEmpty() || this.b.isEmpty()) ? false : true;
    }

    public boolean r(int i10, int i11, Object obj) {
        if (i11 < 1) {
            return false;
        }
        this.b.add(a(4, i10, i11, obj));
        this.f2973h |= 4;
        return this.b.size() == 1;
    }

    public boolean s(int i10, int i11) {
        if (i11 < 1) {
            return false;
        }
        this.b.add(a(1, i10, i11, null));
        this.f2973h |= 1;
        return this.b.size() == 1;
    }

    public boolean t(int i10, int i11, int i12) {
        if (i10 == i11) {
            return false;
        }
        if (i12 != 1) {
            throw new IllegalArgumentException("Moving more than 1 item is not supported yet");
        }
        this.b.add(a(8, i10, i11, null));
        this.f2973h |= 8;
        return this.b.size() == 1;
    }

    public boolean u(int i10, int i11) {
        if (i11 < 1) {
            return false;
        }
        this.b.add(a(2, i10, i11, null));
        this.f2973h |= 2;
        return this.b.size() == 1;
    }

    public final void v(b bVar) {
        this.f2968c.add(bVar);
        int i10 = bVar.f2974a;
        if (i10 == 1) {
            this.f2969d.g(bVar.b, bVar.f2976d);
            return;
        }
        if (i10 == 2) {
            this.f2969d.d(bVar.b, bVar.f2976d);
            return;
        }
        if (i10 == 4) {
            this.f2969d.e(bVar.b, bVar.f2976d, bVar.f2975c);
        } else {
            if (i10 == 8) {
                this.f2969d.a(bVar.b, bVar.f2976d);
                return;
            }
            throw new IllegalArgumentException("Unknown update op type for " + bVar);
        }
    }

    public void w() {
        this.f2972g.b(this.b);
        int size = this.b.size();
        for (int i10 = 0; i10 < size; i10++) {
            b bVar = this.b.get(i10);
            int i11 = bVar.f2974a;
            if (i11 == 1) {
                c(bVar);
            } else if (i11 == 2) {
                f(bVar);
            } else if (i11 == 4) {
                g(bVar);
            } else if (i11 == 8) {
                d(bVar);
            }
            Runnable runnable = this.f2970e;
            if (runnable != null) {
                runnable.run();
            }
        }
        this.b.clear();
    }

    public void x(List<b> list) {
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            b(list.get(i10));
        }
        list.clear();
    }

    public void y() {
        x(this.b);
        x(this.f2968c);
        this.f2973h = 0;
    }

    public final int z(int i10, int i11) {
        int i12;
        int i13;
        for (int size = this.f2968c.size() - 1; size >= 0; size--) {
            b bVar = this.f2968c.get(size);
            int i14 = bVar.f2974a;
            if (i14 == 8) {
                int i15 = bVar.b;
                int i16 = bVar.f2976d;
                if (i15 < i16) {
                    i13 = i15;
                    i12 = i16;
                } else {
                    i12 = i15;
                    i13 = i16;
                }
                if (i10 < i13 || i10 > i12) {
                    if (i10 < i15) {
                        if (i11 == 1) {
                            bVar.b = i15 + 1;
                            bVar.f2976d = i16 + 1;
                        } else if (i11 == 2) {
                            bVar.b = i15 - 1;
                            bVar.f2976d = i16 - 1;
                        }
                    }
                } else if (i13 == i15) {
                    if (i11 == 1) {
                        bVar.f2976d = i16 + 1;
                    } else if (i11 == 2) {
                        bVar.f2976d = i16 - 1;
                    }
                    i10++;
                } else {
                    if (i11 == 1) {
                        bVar.b = i15 + 1;
                    } else if (i11 == 2) {
                        bVar.b = i15 - 1;
                    }
                    i10--;
                }
            } else {
                int i17 = bVar.b;
                if (i17 <= i10) {
                    if (i14 == 1) {
                        i10 -= bVar.f2976d;
                    } else if (i14 == 2) {
                        i10 += bVar.f2976d;
                    }
                } else if (i11 == 1) {
                    bVar.b = i17 + 1;
                } else if (i11 == 2) {
                    bVar.b = i17 - 1;
                }
            }
        }
        for (int size2 = this.f2968c.size() - 1; size2 >= 0; size2--) {
            b bVar2 = this.f2968c.get(size2);
            if (bVar2.f2974a == 8) {
                int i18 = bVar2.f2976d;
                if (i18 == bVar2.b || i18 < 0) {
                    this.f2968c.remove(size2);
                    b(bVar2);
                }
            } else if (bVar2.f2976d <= 0) {
                this.f2968c.remove(size2);
                b(bVar2);
            }
        }
        return i10;
    }

    public a(InterfaceC0048a interfaceC0048a, boolean z10) {
        this.f2967a = new x2.e(30);
        this.b = new ArrayList<>();
        this.f2968c = new ArrayList<>();
        this.f2973h = 0;
        this.f2969d = interfaceC0048a;
        this.f2971f = z10;
        this.f2972g = new m(this);
    }
}
