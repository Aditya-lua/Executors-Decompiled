package androidx.recyclerview.widget;

import java.util.ArrayList;
import java.util.List;
import p533x2.C12635e;
import p533x2.InterfaceC12634d;

/* JADX INFO: renamed from: androidx.recyclerview.widget.a */
/* JADX INFO: loaded from: classes.dex */
public final class C1050a implements C1062m.a {

    /* JADX INFO: renamed from: a */
    public InterfaceC12634d<b> f4119a;

    /* JADX INFO: renamed from: b */
    public final ArrayList<b> f4120b;

    /* JADX INFO: renamed from: c */
    public final ArrayList<b> f4121c;

    /* JADX INFO: renamed from: d */
    public final a f4122d;

    /* JADX INFO: renamed from: e */
    public Runnable f4123e;

    /* JADX INFO: renamed from: f */
    public final boolean f4124f;

    /* JADX INFO: renamed from: g */
    public final C1062m f4125g;

    /* JADX INFO: renamed from: h */
    public int f4126h;

    /* JADX INFO: renamed from: androidx.recyclerview.widget.a$a */
    public interface a {
        /* JADX INFO: renamed from: a */
        void mo5458a(int i10, int i11);

        /* JADX INFO: renamed from: b */
        void mo5459b(b bVar);

        /* JADX INFO: renamed from: c */
        void mo5460c(b bVar);

        /* JADX INFO: renamed from: d */
        void mo5461d(int i10, int i11);

        /* JADX INFO: renamed from: e */
        void mo5462e(int i10, int i11, Object obj);

        /* JADX INFO: renamed from: f */
        RecyclerView.AbstractC1023f0 mo5463f(int i10);

        /* JADX INFO: renamed from: g */
        void mo5464g(int i10, int i11);

        /* JADX INFO: renamed from: h */
        void mo5465h(int i10, int i11);
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.a$b */
    public static final class b {

        /* JADX INFO: renamed from: a */
        public int f4127a;

        /* JADX INFO: renamed from: b */
        public int f4128b;

        /* JADX INFO: renamed from: c */
        public Object f4129c;

        /* JADX INFO: renamed from: d */
        public int f4130d;

        public b(int i10, int i11, int i12, Object obj) {
            this.f4127a = i10;
            this.f4128b = i11;
            this.f4130d = i12;
            this.f4129c = obj;
        }

        /* JADX INFO: renamed from: a */
        public String m5855a() {
            int i10 = this.f4127a;
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
            int i10 = this.f4127a;
            if (i10 != bVar.f4127a) {
                return false;
            }
            if (i10 == 8 && Math.abs(this.f4130d - this.f4128b) == 1 && this.f4130d == bVar.f4128b && this.f4128b == bVar.f4130d) {
                return true;
            }
            if (this.f4130d != bVar.f4130d || this.f4128b != bVar.f4128b) {
                return false;
            }
            Object obj2 = this.f4129c;
            if (obj2 != null) {
                if (!obj2.equals(bVar.f4129c)) {
                    return false;
                }
            } else if (bVar.f4129c != null) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return (((this.f4127a * 31) + this.f4128b) * 31) + this.f4130d;
        }

        public String toString() {
            return Integer.toHexString(System.identityHashCode(this)) + "[" + m5855a() + ",s:" + this.f4128b + "c:" + this.f4130d + ",p:" + this.f4129c + "]";
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1050a(a aVar) {
        this(aVar, false);
    }

    @Override // androidx.recyclerview.widget.C1062m.a
    /* JADX INFO: renamed from: a */
    public b mo5829a(int i10, int i11, int i12, Object obj) {
        b bVarMo47067b = this.f4119a.mo47067b();
        if (bVarMo47067b == null) {
            return new b(i10, i11, i12, obj);
        }
        bVarMo47067b.f4127a = i10;
        bVarMo47067b.f4128b = i11;
        bVarMo47067b.f4130d = i12;
        bVarMo47067b.f4129c = obj;
        return bVarMo47067b;
    }

    @Override // androidx.recyclerview.widget.C1062m.a
    /* JADX INFO: renamed from: b */
    public void mo5830b(b bVar) {
        if (this.f4124f) {
            return;
        }
        bVar.f4129c = null;
        this.f4119a.mo47066a(bVar);
    }

    /* JADX INFO: renamed from: c */
    public final void m5831c(b bVar) {
        m5850v(bVar);
    }

    /* JADX INFO: renamed from: d */
    public final void m5832d(b bVar) {
        m5850v(bVar);
    }

    /* JADX INFO: renamed from: e */
    public int m5833e(int i10) {
        int size = this.f4120b.size();
        for (int i11 = 0; i11 < size; i11++) {
            b bVar = this.f4120b.get(i11);
            int i12 = bVar.f4127a;
            if (i12 != 1) {
                if (i12 == 2) {
                    int i13 = bVar.f4128b;
                    if (i13 <= i10) {
                        int i14 = bVar.f4130d;
                        if (i13 + i14 > i10) {
                            return -1;
                        }
                        i10 -= i14;
                    } else {
                        continue;
                    }
                } else if (i12 == 8) {
                    int i15 = bVar.f4128b;
                    if (i15 == i10) {
                        i10 = bVar.f4130d;
                    } else {
                        if (i15 < i10) {
                            i10--;
                        }
                        if (bVar.f4130d <= i10) {
                            i10++;
                        }
                    }
                }
            } else if (bVar.f4128b <= i10) {
                i10 += bVar.f4130d;
            }
        }
        return i10;
    }

    /* JADX INFO: renamed from: f */
    public final void m5834f(b bVar) {
        boolean z10;
        byte b10;
        int i10 = bVar.f4128b;
        int i11 = bVar.f4130d + i10;
        byte b11 = -1;
        int i12 = i10;
        int i13 = 0;
        while (i12 < i11) {
            if (this.f4122d.mo5463f(i12) != null || m5836h(i12)) {
                if (b11 == 0) {
                    m5839k(mo5829a(2, i10, i13, null));
                    z10 = true;
                } else {
                    z10 = false;
                }
                b10 = 1;
            } else {
                if (b11 == 1) {
                    m5850v(mo5829a(2, i10, i13, null));
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
        if (i13 != bVar.f4130d) {
            mo5830b(bVar);
            bVar = mo5829a(2, i10, i13, null);
        }
        if (b11 == 0) {
            m5839k(bVar);
        } else {
            m5850v(bVar);
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m5835g(b bVar) {
        int i10 = bVar.f4128b;
        int i11 = bVar.f4130d + i10;
        int i12 = 0;
        byte b10 = -1;
        int i13 = i10;
        while (i10 < i11) {
            if (this.f4122d.mo5463f(i10) != null || m5836h(i10)) {
                if (b10 == 0) {
                    m5839k(mo5829a(4, i13, i12, bVar.f4129c));
                    i13 = i10;
                    i12 = 0;
                }
                b10 = 1;
            } else {
                if (b10 == 1) {
                    m5850v(mo5829a(4, i13, i12, bVar.f4129c));
                    i13 = i10;
                    i12 = 0;
                }
                b10 = 0;
            }
            i12++;
            i10++;
        }
        if (i12 != bVar.f4130d) {
            Object obj = bVar.f4129c;
            mo5830b(bVar);
            bVar = mo5829a(4, i13, i12, obj);
        }
        if (b10 == 0) {
            m5839k(bVar);
        } else {
            m5850v(bVar);
        }
    }

    /* JADX INFO: renamed from: h */
    public final boolean m5836h(int i10) {
        int size = this.f4121c.size();
        for (int i11 = 0; i11 < size; i11++) {
            b bVar = this.f4121c.get(i11);
            int i12 = bVar.f4127a;
            if (i12 == 8) {
                if (m5842n(bVar.f4130d, i11 + 1) == i10) {
                    return true;
                }
            } else if (i12 == 1) {
                int i13 = bVar.f4128b;
                int i14 = bVar.f4130d + i13;
                while (i13 < i14) {
                    if (m5842n(i13, i11 + 1) == i10) {
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

    /* JADX INFO: renamed from: i */
    public void m5837i() {
        int size = this.f4121c.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f4122d.mo5460c(this.f4121c.get(i10));
        }
        m5852x(this.f4121c);
        this.f4126h = 0;
    }

    /* JADX INFO: renamed from: j */
    public void m5838j() {
        m5837i();
        int size = this.f4120b.size();
        for (int i10 = 0; i10 < size; i10++) {
            b bVar = this.f4120b.get(i10);
            int i11 = bVar.f4127a;
            if (i11 == 1) {
                this.f4122d.mo5460c(bVar);
                this.f4122d.mo5464g(bVar.f4128b, bVar.f4130d);
            } else if (i11 == 2) {
                this.f4122d.mo5460c(bVar);
                this.f4122d.mo5465h(bVar.f4128b, bVar.f4130d);
            } else if (i11 == 4) {
                this.f4122d.mo5460c(bVar);
                this.f4122d.mo5462e(bVar.f4128b, bVar.f4130d, bVar.f4129c);
            } else if (i11 == 8) {
                this.f4122d.mo5460c(bVar);
                this.f4122d.mo5458a(bVar.f4128b, bVar.f4130d);
            }
            Runnable runnable = this.f4123e;
            if (runnable != null) {
                runnable.run();
            }
        }
        m5852x(this.f4120b);
        this.f4126h = 0;
    }

    /* JADX INFO: renamed from: k */
    public final void m5839k(b bVar) {
        int i10;
        int i11 = bVar.f4127a;
        if (i11 == 1 || i11 == 8) {
            throw new IllegalArgumentException("should not dispatch add or move for pre layout");
        }
        int iM5854z = m5854z(bVar.f4128b, i11);
        int i12 = bVar.f4128b;
        int i13 = bVar.f4127a;
        if (i13 == 2) {
            i10 = 0;
        } else {
            if (i13 != 4) {
                throw new IllegalArgumentException("op should be remove or update." + bVar);
            }
            i10 = 1;
        }
        int i14 = 1;
        for (int i15 = 1; i15 < bVar.f4130d; i15++) {
            int iM5854z2 = m5854z(bVar.f4128b + (i10 * i15), bVar.f4127a);
            int i16 = bVar.f4127a;
            if (i16 == 2 ? iM5854z2 != iM5854z : !(i16 == 4 && iM5854z2 == iM5854z + 1)) {
                b bVarMo5829a = mo5829a(i16, iM5854z, i14, bVar.f4129c);
                m5840l(bVarMo5829a, i12);
                mo5830b(bVarMo5829a);
                if (bVar.f4127a == 4) {
                    i12 += i14;
                }
                i14 = 1;
                iM5854z = iM5854z2;
            } else {
                i14++;
            }
        }
        Object obj = bVar.f4129c;
        mo5830b(bVar);
        if (i14 > 0) {
            b bVarMo5829a2 = mo5829a(bVar.f4127a, iM5854z, i14, obj);
            m5840l(bVarMo5829a2, i12);
            mo5830b(bVarMo5829a2);
        }
    }

    /* JADX INFO: renamed from: l */
    public void m5840l(b bVar, int i10) {
        this.f4122d.mo5459b(bVar);
        int i11 = bVar.f4127a;
        if (i11 == 2) {
            this.f4122d.mo5465h(i10, bVar.f4130d);
        } else {
            if (i11 != 4) {
                throw new IllegalArgumentException("only remove and update ops can be dispatched in first pass");
            }
            this.f4122d.mo5462e(i10, bVar.f4130d, bVar.f4129c);
        }
    }

    /* JADX INFO: renamed from: m */
    public int m5841m(int i10) {
        return m5842n(i10, 0);
    }

    /* JADX INFO: renamed from: n */
    public int m5842n(int i10, int i11) {
        int size = this.f4121c.size();
        while (i11 < size) {
            b bVar = this.f4121c.get(i11);
            int i12 = bVar.f4127a;
            if (i12 == 8) {
                int i13 = bVar.f4128b;
                if (i13 == i10) {
                    i10 = bVar.f4130d;
                } else {
                    if (i13 < i10) {
                        i10--;
                    }
                    if (bVar.f4130d <= i10) {
                        i10++;
                    }
                }
            } else {
                int i14 = bVar.f4128b;
                if (i14 > i10) {
                    continue;
                } else if (i12 == 2) {
                    int i15 = bVar.f4130d;
                    if (i10 < i14 + i15) {
                        return -1;
                    }
                    i10 -= i15;
                } else if (i12 == 1) {
                    i10 += bVar.f4130d;
                }
            }
            i11++;
        }
        return i10;
    }

    /* JADX INFO: renamed from: o */
    public boolean m5843o(int i10) {
        return (i10 & this.f4126h) != 0;
    }

    /* JADX INFO: renamed from: p */
    public boolean m5844p() {
        return this.f4120b.size() > 0;
    }

    /* JADX INFO: renamed from: q */
    public boolean m5845q() {
        return (this.f4121c.isEmpty() || this.f4120b.isEmpty()) ? false : true;
    }

    /* JADX INFO: renamed from: r */
    public boolean m5846r(int i10, int i11, Object obj) {
        if (i11 < 1) {
            return false;
        }
        this.f4120b.add(mo5829a(4, i10, i11, obj));
        this.f4126h |= 4;
        return this.f4120b.size() == 1;
    }

    /* JADX INFO: renamed from: s */
    public boolean m5847s(int i10, int i11) {
        if (i11 < 1) {
            return false;
        }
        this.f4120b.add(mo5829a(1, i10, i11, null));
        this.f4126h |= 1;
        return this.f4120b.size() == 1;
    }

    /* JADX INFO: renamed from: t */
    public boolean m5848t(int i10, int i11, int i12) {
        if (i10 == i11) {
            return false;
        }
        if (i12 != 1) {
            throw new IllegalArgumentException("Moving more than 1 item is not supported yet");
        }
        this.f4120b.add(mo5829a(8, i10, i11, null));
        this.f4126h |= 8;
        return this.f4120b.size() == 1;
    }

    /* JADX INFO: renamed from: u */
    public boolean m5849u(int i10, int i11) {
        if (i11 < 1) {
            return false;
        }
        this.f4120b.add(mo5829a(2, i10, i11, null));
        this.f4126h |= 2;
        return this.f4120b.size() == 1;
    }

    /* JADX INFO: renamed from: v */
    public final void m5850v(b bVar) {
        this.f4121c.add(bVar);
        int i10 = bVar.f4127a;
        if (i10 == 1) {
            this.f4122d.mo5464g(bVar.f4128b, bVar.f4130d);
            return;
        }
        if (i10 == 2) {
            this.f4122d.mo5461d(bVar.f4128b, bVar.f4130d);
            return;
        }
        if (i10 == 4) {
            this.f4122d.mo5462e(bVar.f4128b, bVar.f4130d, bVar.f4129c);
        } else {
            if (i10 == 8) {
                this.f4122d.mo5458a(bVar.f4128b, bVar.f4130d);
                return;
            }
            throw new IllegalArgumentException("Unknown update op type for " + bVar);
        }
    }

    /* JADX INFO: renamed from: w */
    public void m5851w() {
        this.f4125g.m5999b(this.f4120b);
        int size = this.f4120b.size();
        for (int i10 = 0; i10 < size; i10++) {
            b bVar = this.f4120b.get(i10);
            int i11 = bVar.f4127a;
            if (i11 == 1) {
                m5831c(bVar);
            } else if (i11 == 2) {
                m5834f(bVar);
            } else if (i11 == 4) {
                m5835g(bVar);
            } else if (i11 == 8) {
                m5832d(bVar);
            }
            Runnable runnable = this.f4123e;
            if (runnable != null) {
                runnable.run();
            }
        }
        this.f4120b.clear();
    }

    /* JADX INFO: renamed from: x */
    public void m5852x(List<b> list) {
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            mo5830b(list.get(i10));
        }
        list.clear();
    }

    /* JADX INFO: renamed from: y */
    public void m5853y() {
        m5852x(this.f4120b);
        m5852x(this.f4121c);
        this.f4126h = 0;
    }

    /* JADX INFO: renamed from: z */
    public final int m5854z(int i10, int i11) {
        int i12;
        int i13;
        for (int size = this.f4121c.size() - 1; size >= 0; size--) {
            b bVar = this.f4121c.get(size);
            int i14 = bVar.f4127a;
            if (i14 == 8) {
                int i15 = bVar.f4128b;
                int i16 = bVar.f4130d;
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
                            bVar.f4128b = i15 + 1;
                            bVar.f4130d = i16 + 1;
                        } else if (i11 == 2) {
                            bVar.f4128b = i15 - 1;
                            bVar.f4130d = i16 - 1;
                        }
                    }
                } else if (i13 == i15) {
                    if (i11 == 1) {
                        bVar.f4130d = i16 + 1;
                    } else if (i11 == 2) {
                        bVar.f4130d = i16 - 1;
                    }
                    i10++;
                } else {
                    if (i11 == 1) {
                        bVar.f4128b = i15 + 1;
                    } else if (i11 == 2) {
                        bVar.f4128b = i15 - 1;
                    }
                    i10--;
                }
            } else {
                int i17 = bVar.f4128b;
                if (i17 <= i10) {
                    if (i14 == 1) {
                        i10 -= bVar.f4130d;
                    } else if (i14 == 2) {
                        i10 += bVar.f4130d;
                    }
                } else if (i11 == 1) {
                    bVar.f4128b = i17 + 1;
                } else if (i11 == 2) {
                    bVar.f4128b = i17 - 1;
                }
            }
        }
        for (int size2 = this.f4121c.size() - 1; size2 >= 0; size2--) {
            b bVar2 = this.f4121c.get(size2);
            if (bVar2.f4127a == 8) {
                int i18 = bVar2.f4130d;
                if (i18 == bVar2.f4128b || i18 < 0) {
                    this.f4121c.remove(size2);
                    mo5830b(bVar2);
                }
            } else if (bVar2.f4130d <= 0) {
                this.f4121c.remove(size2);
                mo5830b(bVar2);
            }
        }
        return i10;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public C1050a(a aVar, boolean z10) {
        this.f4119a = new C12635e(30);
        this.f4120b = new ArrayList<>();
        this.f4121c = new ArrayList<>();
        this.f4126h = 0;
        this.f4122d = aVar;
        this.f4124f = z10;
        this.f4125g = new C1062m(this);
    }
}
