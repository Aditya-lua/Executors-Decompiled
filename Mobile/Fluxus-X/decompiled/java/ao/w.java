package ao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class w {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public StringBuilder f3144e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f3145f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public char f3146g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public StringBuilder f3147h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public b f3141a = b.START_DEFINITION;
    public final List<fo.i> b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List<eo.p> f3142c = new ArrayList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List<eo.y> f3143d = new ArrayList();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f3148i = false;

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f3149a;

        static {
            int[] iArr = new int[b.values().length];
            f3149a = iArr;
            try {
                iArr[b.START_DEFINITION.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f3149a[b.LABEL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f3149a[b.DESTINATION.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f3149a[b.START_TITLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f3149a[b.TITLE.ordinal()] = 5;
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

    public void a(eo.y yVar) {
        this.f3143d.add(yVar);
    }

    public final boolean b(go.i iVar) {
        iVar.r();
        go.h hVarO = iVar.o();
        if (!co.e.b(iVar)) {
            return false;
        }
        String strC = iVar.d(hVarO, iVar.o()).c();
        if (strC.startsWith("<")) {
            strC = strC.substring(1, strC.length() - 1);
        }
        this.f3145f = strC;
        int iR = iVar.r();
        if (!iVar.e()) {
            this.f3148i = true;
            this.b.clear();
        } else if (iR == 0) {
            return false;
        }
        this.f3141a = b.START_TITLE;
        return true;
    }

    public final void c() {
        if (this.f3148i) {
            String strE = co.c.e(this.f3145f);
            StringBuilder sb2 = this.f3147h;
            eo.p pVar = new eo.p(this.f3144e.toString(), strE, sb2 != null ? co.c.e(sb2.toString()) : null);
            pVar.l(this.f3143d);
            this.f3143d.clear();
            this.f3142c.add(pVar);
            this.f3144e = null;
            this.f3148i = false;
            this.f3145f = null;
            this.f3147h = null;
        }
    }

    public List<eo.p> d() {
        c();
        return this.f3142c;
    }

    public fo.j e() {
        return fo.j.h(this.b);
    }

    public List<eo.y> f() {
        return this.f3143d;
    }

    public final boolean g(go.i iVar) {
        go.h hVarO = iVar.o();
        if (!co.e.d(iVar)) {
            return false;
        }
        this.f3144e.append(iVar.d(hVarO, iVar.o()).c());
        if (!iVar.e()) {
            this.f3144e.append('\n');
            return true;
        }
        if (!iVar.i(']') || !iVar.i(':') || this.f3144e.length() > 999 || co.c.c(this.f3144e.toString()).isEmpty()) {
            return false;
        }
        this.f3141a = b.DESTINATION;
        iVar.r();
        return true;
    }

    public void h(fo.i iVar) {
        boolean zK;
        this.b.add(iVar);
        if (this.f3141a == b.PARAGRAPH) {
            return;
        }
        go.i iVarK = go.i.k(fo.j.g(iVar));
        while (iVarK.e()) {
            int i10 = a.f3149a[this.f3141a.ordinal()];
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
                    throw new IllegalStateException("Unknown parsing state: " + this.f3141a);
                }
                zK = m(iVarK);
            }
            if (!zK) {
                this.f3141a = b.PARAGRAPH;
                c();
                return;
            }
        }
    }

    public List<eo.y> j(int i10) {
        List<eo.y> list = this.f3143d;
        List<eo.y> listUnmodifiableList = Collections.unmodifiableList(new ArrayList(list.subList(Math.max(list.size() - i10, 0), this.f3143d.size())));
        i(i10, this.b);
        i(i10, this.f3143d);
        return listUnmodifiableList;
    }

    public final boolean k(go.i iVar) {
        c();
        iVar.r();
        if (!iVar.i('[')) {
            return false;
        }
        this.f3141a = b.LABEL;
        this.f3144e = new StringBuilder();
        if (iVar.e()) {
            return true;
        }
        this.f3144e.append('\n');
        return true;
    }

    public final boolean l(go.i iVar) {
        iVar.r();
        if (!iVar.e()) {
            this.f3141a = b.START_DEFINITION;
            return true;
        }
        this.f3146g = (char) 0;
        char cL = iVar.l();
        if (cL == '\"' || cL == '\'') {
            this.f3146g = cL;
        } else if (cL == '(') {
            this.f3146g = ')';
        }
        if (this.f3146g != 0) {
            this.f3141a = b.TITLE;
            this.f3147h = new StringBuilder();
            iVar.h();
            if (!iVar.e()) {
                this.f3147h.append('\n');
            }
        } else {
            this.f3141a = b.START_DEFINITION;
        }
        return true;
    }

    public final boolean m(go.i iVar) {
        go.h hVarO = iVar.o();
        if (!co.e.f(iVar, this.f3146g)) {
            this.f3147h = null;
            return false;
        }
        this.f3147h.append(iVar.d(hVarO, iVar.o()).c());
        if (!iVar.e()) {
            this.f3147h.append('\n');
            return true;
        }
        iVar.h();
        iVar.r();
        if (iVar.e()) {
            this.f3147h = null;
            return false;
        }
        this.f3148i = true;
        this.b.clear();
        this.f3141a = b.START_DEFINITION;
        return true;
    }
}
