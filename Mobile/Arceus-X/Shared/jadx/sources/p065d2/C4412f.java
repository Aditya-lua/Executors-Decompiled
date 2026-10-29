package p065d2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: d2.f */
/* JADX INFO: loaded from: classes.dex */
public class C4412f implements InterfaceC4410d {

    /* JADX INFO: renamed from: d */
    public AbstractC4422p f18329d;

    /* JADX INFO: renamed from: f */
    public int f18331f;

    /* JADX INFO: renamed from: g */
    public int f18332g;

    /* JADX INFO: renamed from: a */
    public InterfaceC4410d f18326a = null;

    /* JADX INFO: renamed from: b */
    public boolean f18327b = false;

    /* JADX INFO: renamed from: c */
    public boolean f18328c = false;

    /* JADX INFO: renamed from: e */
    public a f18330e = a.UNKNOWN;

    /* JADX INFO: renamed from: h */
    public int f18333h = 1;

    /* JADX INFO: renamed from: i */
    public C4413g f18334i = null;

    /* JADX INFO: renamed from: j */
    public boolean f18335j = false;

    /* JADX INFO: renamed from: k */
    public List<InterfaceC4410d> f18336k = new ArrayList();

    /* JADX INFO: renamed from: l */
    public List<C4412f> f18337l = new ArrayList();

    /* JADX INFO: renamed from: d2.f$a */
    public enum a {
        UNKNOWN,
        HORIZONTAL_DIMENSION,
        VERTICAL_DIMENSION,
        LEFT,
        RIGHT,
        TOP,
        BOTTOM,
        BASELINE
    }

    public C4412f(AbstractC4422p abstractC4422p) {
        this.f18329d = abstractC4422p;
    }

    @Override // p065d2.InterfaceC4410d
    /* JADX INFO: renamed from: a */
    public void mo22153a(InterfaceC4410d interfaceC4410d) {
        Iterator<C4412f> it = this.f18337l.iterator();
        while (it.hasNext()) {
            if (!it.next().f18335j) {
                return;
            }
        }
        this.f18328c = true;
        InterfaceC4410d interfaceC4410d2 = this.f18326a;
        if (interfaceC4410d2 != null) {
            interfaceC4410d2.mo22153a(this);
        }
        if (this.f18327b) {
            this.f18329d.mo22153a(this);
            return;
        }
        C4412f c4412f = null;
        int i10 = 0;
        for (C4412f c4412f2 : this.f18337l) {
            if (!(c4412f2 instanceof C4413g)) {
                i10++;
                c4412f = c4412f2;
            }
        }
        if (c4412f != null && i10 == 1 && c4412f.f18335j) {
            C4413g c4413g = this.f18334i;
            if (c4413g != null) {
                if (!c4413g.f18335j) {
                    return;
                } else {
                    this.f18331f = this.f18333h * c4413g.f18332g;
                }
            }
            mo22178d(c4412f.f18332g + this.f18331f);
        }
        InterfaceC4410d interfaceC4410d3 = this.f18326a;
        if (interfaceC4410d3 != null) {
            interfaceC4410d3.mo22153a(this);
        }
    }

    /* JADX INFO: renamed from: b */
    public void m22176b(InterfaceC4410d interfaceC4410d) {
        this.f18336k.add(interfaceC4410d);
        if (this.f18335j) {
            interfaceC4410d.mo22153a(interfaceC4410d);
        }
    }

    /* JADX INFO: renamed from: c */
    public void m22177c() {
        this.f18337l.clear();
        this.f18336k.clear();
        this.f18335j = false;
        this.f18332g = 0;
        this.f18328c = false;
        this.f18327b = false;
    }

    /* JADX INFO: renamed from: d */
    public void mo22178d(int i10) {
        if (this.f18335j) {
            return;
        }
        this.f18335j = true;
        this.f18332g = i10;
        for (InterfaceC4410d interfaceC4410d : this.f18336k) {
            interfaceC4410d.mo22153a(interfaceC4410d);
        }
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f18329d.f18379b.m7804t());
        sb2.append(":");
        sb2.append(this.f18330e);
        sb2.append("(");
        sb2.append(this.f18335j ? Integer.valueOf(this.f18332g) : "unresolved");
        sb2.append(") <t=");
        sb2.append(this.f18337l.size());
        sb2.append(":d=");
        sb2.append(this.f18336k.size());
        sb2.append(">");
        return sb2.toString();
    }
}
