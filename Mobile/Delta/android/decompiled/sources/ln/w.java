package ln;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class w {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public StringBuilder f23741e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f23742f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public char f23743g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public StringBuilder f23744h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public b f23738a = b.START_DEFINITION;
    public final List<pn.i> b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List<on.p> f23739c = new ArrayList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List<on.y> f23740d = new ArrayList();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f23745i = false;

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f23746a;

        static {
            int[] iArr = new int[b.values().length];
            f23746a = iArr;
            try {
                iArr[b.START_DEFINITION.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f23746a[b.LABEL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f23746a[b.DESTINATION.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f23746a[b.START_TITLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f23746a[b.TITLE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public enum b {
        START_DEFINITION,
        LABEL,
        DESTINATION,
        START_TITLE,
        TITLE,
        PARAGRAPH
    }

    public static <T> void i(int i10, List<T> list) {
        if (i10 >= list.size()) {
            list.clear();
            return;
        }
        for (int i11 = 0; i11 < i10; i11++) {
            list.remove(list.size() - 1);
        }
    }

    public void a(on.y yVar) {
        this.f23740d.add(yVar);
    }

    public final boolean b(qn.i iVar) {
        iVar.r();
        qn.h hVarO = iVar.o();
        if (!nn.e.b(iVar)) {
            return false;
        }
        String strC = iVar.d(hVarO, iVar.o()).c();
        if (strC.startsWith("<")) {
            strC = strC.substring(1, strC.length() - 1);
        }
        this.f23742f = strC;
        int iR = iVar.r();
        if (!iVar.e()) {
            this.f23745i = true;
            this.b.clear();
        } else if (iR == 0) {
            return false;
        }
        this.f23738a = b.START_TITLE;
        return true;
    }

    public final void c() {
        if (this.f23745i) {
            String strE = nn.c.e(this.f23742f);
            StringBuilder sb2 = this.f23744h;
            on.p pVar = new on.p(this.f23741e.toString(), strE, sb2 != null ? nn.c.e(sb2.toString()) : null);
            pVar.l(this.f23740d);
            this.f23740d.clear();
            this.f23739c.add(pVar);
            this.f23741e = null;
            this.f23745i = false;
            this.f23742f = null;
            this.f23744h = null;
        }
    }

    public List<on.p> d() {
        c();
        return this.f23739c;
    }

    public pn.j e() {
        return pn.j.g(this.b);
    }

    public List<on.y> f() {
        return this.f23740d;
    }

    public final boolean g(qn.i iVar) {
        qn.h hVarO = iVar.o();
        if (!nn.e.d(iVar)) {
            return false;
        }
        this.f23741e.append(iVar.d(hVarO, iVar.o()).c());
        if (!iVar.e()) {
            this.f23741e.append('\n');
            return true;
        }
        if (!iVar.i(']') || !iVar.i(':') || this.f23741e.length() > 999 || nn.c.c(this.f23741e.toString()).isEmpty()) {
            return false;
        }
        this.f23738a = b.DESTINATION;
        iVar.r();
        return true;
    }

    public void h(pn.i iVar) {
        boolean zK;
        this.b.add(iVar);
        if (this.f23738a == b.PARAGRAPH) {
            return;
        }
        qn.i iVarK = qn.i.k(pn.j.h(iVar));
        while (iVarK.e()) {
            int i10 = a.f23746a[this.f23738a.ordinal()];
            if (i10 == 1) {
                zK = k(iVarK);
            } else if (i10 == 2) {
                zK = g(iVarK);
            } else if (i10 == 3) {
                zK = b(iVarK);
            } else if (i10 == 4) {
                zK = l(iVarK);
            } else {
                if (i10 != 5) {
                    throw new IllegalStateException("Unknown parsing state: " + this.f23738a);
                }
                zK = m(iVarK);
            }
            if (!zK) {
                this.f23738a = b.PARAGRAPH;
                c();
                return;
            }
        }
    }

    public List<on.y> j(int i10) {
        List<on.y> list = this.f23740d;
        List<on.y> listUnmodifiableList = Collections.unmodifiableList(new ArrayList(list.subList(Math.max(list.size() - i10, 0), this.f23740d.size())));
        i(i10, this.b);
        i(i10, this.f23740d);
        return listUnmodifiableList;
    }

    public final boolean k(qn.i iVar) {
        c();
        iVar.r();
        if (!iVar.i('[')) {
            return false;
        }
        this.f23738a = b.LABEL;
        this.f23741e = new StringBuilder();
        if (iVar.e()) {
            return true;
        }
        this.f23741e.append('\n');
        return true;
    }

    public final boolean l(qn.i iVar) {
        iVar.r();
        if (!iVar.e()) {
            this.f23738a = b.START_DEFINITION;
            return true;
        }
        this.f23743g = (char) 0;
        char cL = iVar.l();
        if (cL == '\"' || cL == '\'') {
            this.f23743g = cL;
        } else if (cL == '(') {
            this.f23743g = ')';
        }
        if (this.f23743g != 0) {
            this.f23738a = b.TITLE;
            this.f23744h = new StringBuilder();
            iVar.h();
            if (!iVar.e()) {
                this.f23744h.append('\n');
            }
        } else {
            this.f23738a = b.START_DEFINITION;
        }
        return true;
    }

    public final boolean m(qn.i iVar) {
        qn.h hVarO = iVar.o();
        if (!nn.e.f(iVar, this.f23743g)) {
            this.f23744h = null;
            return false;
        }
        this.f23744h.append(iVar.d(hVarO, iVar.o()).c());
        if (!iVar.e()) {
            this.f23744h.append('\n');
            return true;
        }
        iVar.h();
        iVar.r();
        if (iVar.e()) {
            this.f23744h = null;
            return false;
        }
        this.f23745i = true;
        this.b.clear();
        this.f23738a = b.START_DEFINITION;
        return true;
    }
}
