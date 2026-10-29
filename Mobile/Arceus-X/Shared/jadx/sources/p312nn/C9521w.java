package p312nn;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p388qn.C10620p;
import p388qn.C10629y;
import p418rn.C10934i;
import p418rn.C10935j;
import pn.C10297c;
import pn.C10299e;
import sn.C11424h;
import sn.C11425i;

/* JADX INFO: renamed from: nn.w */
/* JADX INFO: loaded from: classes3.dex */
public class C9521w {

    /* JADX INFO: renamed from: e */
    public StringBuilder f34284e;

    /* JADX INFO: renamed from: f */
    public String f34285f;

    /* JADX INFO: renamed from: g */
    public char f34286g;

    /* JADX INFO: renamed from: h */
    public StringBuilder f34287h;

    /* JADX INFO: renamed from: a */
    public b f34280a = b.START_DEFINITION;

    /* JADX INFO: renamed from: b */
    public final List<C10934i> f34281b = new ArrayList();

    /* JADX INFO: renamed from: c */
    public final List<C10620p> f34282c = new ArrayList();

    /* JADX INFO: renamed from: d */
    public final List<C10629y> f34283d = new ArrayList();

    /* JADX INFO: renamed from: i */
    public boolean f34288i = false;

    /* JADX INFO: renamed from: nn.w$a */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f34289a;

        static {
            int[] iArr = new int[b.values().length];
            f34289a = iArr;
            try {
                iArr[b.START_DEFINITION.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f34289a[b.LABEL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f34289a[b.DESTINATION.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f34289a[b.START_TITLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f34289a[b.TITLE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    /* JADX INFO: renamed from: nn.w$b */
    public enum b {
        START_DEFINITION,
        LABEL,
        DESTINATION,
        START_TITLE,
        TITLE,
        PARAGRAPH
    }

    /* JADX INFO: renamed from: i */
    public static <T> void m37584i(int i10, List<T> list) {
        if (i10 >= list.size()) {
            list.clear();
            return;
        }
        for (int i11 = 0; i11 < i10; i11++) {
            list.remove(list.size() - 1);
        }
    }

    /* JADX INFO: renamed from: a */
    public void m37585a(C10629y c10629y) {
        this.f34283d.add(c10629y);
    }

    /* JADX INFO: renamed from: b */
    public final boolean m37586b(C11425i c11425i) {
        c11425i.m42811r();
        C11424h c11424hM42808o = c11425i.m42808o();
        if (!C10299e.m39569b(c11425i)) {
            return false;
        }
        String strM41535c = c11425i.m42798d(c11424hM42808o, c11425i.m42808o()).m41535c();
        if (strM41535c.startsWith("<")) {
            strM41535c = strM41535c.substring(1, strM41535c.length() - 1);
        }
        this.f34285f = strM41535c;
        int iM42811r = c11425i.m42811r();
        if (!c11425i.m42799e()) {
            this.f34288i = true;
            this.f34281b.clear();
        } else if (iM42811r == 0) {
            return false;
        }
        this.f34280a = b.START_TITLE;
        return true;
    }

    /* JADX INFO: renamed from: c */
    public final void m37587c() {
        if (this.f34288i) {
            String strM39565e = C10297c.m39565e(this.f34285f);
            StringBuilder sb2 = this.f34287h;
            C10620p c10620p = new C10620p(this.f34284e.toString(), strM39565e, sb2 != null ? C10297c.m39565e(sb2.toString()) : null);
            c10620p.m40705l(this.f34283d);
            this.f34283d.clear();
            this.f34282c.add(c10620p);
            this.f34284e = null;
            this.f34288i = false;
            this.f34285f = null;
            this.f34287h = null;
        }
    }

    /* JADX INFO: renamed from: d */
    public List<C10620p> m37588d() {
        m37587c();
        return this.f34282c;
    }

    /* JADX INFO: renamed from: e */
    public C10935j m37589e() {
        return C10935j.m41532g(this.f34281b);
    }

    /* JADX INFO: renamed from: f */
    public List<C10629y> m37590f() {
        return this.f34283d;
    }

    /* JADX INFO: renamed from: g */
    public final boolean m37591g(C11425i c11425i) {
        C11424h c11424hM42808o = c11425i.m42808o();
        if (!C10299e.m39571d(c11425i)) {
            return false;
        }
        this.f34284e.append(c11425i.m42798d(c11424hM42808o, c11425i.m42808o()).m41535c());
        if (!c11425i.m42799e()) {
            this.f34284e.append('\n');
            return true;
        }
        if (!c11425i.m42803i(']') || !c11425i.m42803i(':') || this.f34284e.length() > 999 || C10297c.m39563c(this.f34284e.toString()).isEmpty()) {
            return false;
        }
        this.f34280a = b.DESTINATION;
        c11425i.m42811r();
        return true;
    }

    /* JADX INFO: renamed from: h */
    public void m37592h(C10934i c10934i) {
        boolean zM37594k;
        this.f34281b.add(c10934i);
        if (this.f34280a == b.PARAGRAPH) {
            return;
        }
        C11425i c11425iM42794k = C11425i.m42794k(C10935j.m41533h(c10934i));
        while (c11425iM42794k.m42799e()) {
            int i10 = a.f34289a[this.f34280a.ordinal()];
            if (i10 == 1) {
                zM37594k = m37594k(c11425iM42794k);
            } else if (i10 == 2) {
                zM37594k = m37591g(c11425iM42794k);
            } else if (i10 == 3) {
                zM37594k = m37586b(c11425iM42794k);
            } else if (i10 == 4) {
                zM37594k = m37595l(c11425iM42794k);
            } else {
                if (i10 != 5) {
                    throw new IllegalStateException("Unknown parsing state: " + this.f34280a);
                }
                zM37594k = m37596m(c11425iM42794k);
            }
            if (!zM37594k) {
                this.f34280a = b.PARAGRAPH;
                m37587c();
                return;
            }
        }
    }

    /* JADX INFO: renamed from: j */
    public List<C10629y> m37593j(int i10) {
        List<C10629y> list = this.f34283d;
        List<C10629y> listUnmodifiableList = Collections.unmodifiableList(new ArrayList(list.subList(Math.max(list.size() - i10, 0), this.f34283d.size())));
        m37584i(i10, this.f34281b);
        m37584i(i10, this.f34283d);
        return listUnmodifiableList;
    }

    /* JADX INFO: renamed from: k */
    public final boolean m37594k(C11425i c11425i) {
        m37587c();
        c11425i.m42811r();
        if (!c11425i.m42803i('[')) {
            return false;
        }
        this.f34280a = b.LABEL;
        this.f34284e = new StringBuilder();
        if (c11425i.m42799e()) {
            return true;
        }
        this.f34284e.append('\n');
        return true;
    }

    /* JADX INFO: renamed from: l */
    public final boolean m37595l(C11425i c11425i) {
        c11425i.m42811r();
        if (!c11425i.m42799e()) {
            this.f34280a = b.START_DEFINITION;
            return true;
        }
        this.f34286g = (char) 0;
        char cM42805l = c11425i.m42805l();
        if (cM42805l == '\"' || cM42805l == '\'') {
            this.f34286g = cM42805l;
        } else if (cM42805l == '(') {
            this.f34286g = ')';
        }
        if (this.f34286g != 0) {
            this.f34280a = b.TITLE;
            this.f34287h = new StringBuilder();
            c11425i.m42802h();
            if (!c11425i.m42799e()) {
                this.f34287h.append('\n');
            }
        } else {
            this.f34280a = b.START_DEFINITION;
        }
        return true;
    }

    /* JADX INFO: renamed from: m */
    public final boolean m37596m(C11425i c11425i) {
        C11424h c11424hM42808o = c11425i.m42808o();
        if (!C10299e.m39573f(c11425i, this.f34286g)) {
            this.f34287h = null;
            return false;
        }
        this.f34287h.append(c11425i.m42798d(c11424hM42808o, c11425i.m42808o()).m41535c());
        if (!c11425i.m42799e()) {
            this.f34287h.append('\n');
            return true;
        }
        c11425i.m42802h();
        c11425i.m42811r();
        if (c11425i.m42799e()) {
            this.f34287h = null;
            return false;
        }
        this.f34288i = true;
        this.f34281b.clear();
        this.f34280a = b.START_DEFINITION;
        return true;
    }
}
