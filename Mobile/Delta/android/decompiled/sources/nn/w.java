package nn;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class w {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public StringBuilder f26452e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f26453f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public char f26454g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public StringBuilder f26455h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public b f26449a = b.START_DEFINITION;
    public final List<rn.i> b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List<qn.p> f26450c = new ArrayList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List<qn.y> f26451d = new ArrayList();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f26456i = false;

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f26457a;

        static {
            int[] iArr = new int[b.values().length];
            f26457a = iArr;
            try {
                iArr[b.START_DEFINITION.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f26457a[b.LABEL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f26457a[b.DESTINATION.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f26457a[b.START_TITLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f26457a[b.TITLE.ordinal()] = 5;
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

    public void a(qn.y yVar) {
        this.f26451d.add(yVar);
    }

    public final boolean b(sn.i iVar) {
        iVar.r();
        sn.h hVarO = iVar.o();
        if (!pn.e.b(iVar)) {
            return false;
        }
        String strC = iVar.d(hVarO, iVar.o()).c();
        if (strC.startsWith("<")) {
            strC = strC.substring(1, strC.length() - 1);
        }
        this.f26453f = strC;
        int iR = iVar.r();
        if (!iVar.e()) {
            this.f26456i = true;
            this.b.clear();
        } else if (iR == 0) {
            return false;
        }
        this.f26449a = b.START_TITLE;
        return true;
    }

    public final void c() {
        if (this.f26456i) {
            String strE = pn.c.e(this.f26453f);
            StringBuilder sb2 = this.f26455h;
            qn.p pVar = new qn.p(this.f26452e.toString(), strE, sb2 != null ? pn.c.e(sb2.toString()) : null);
            pVar.l(this.f26451d);
            this.f26451d.clear();
            this.f26450c.add(pVar);
            this.f26452e = null;
            this.f26456i = false;
            this.f26453f = null;
            this.f26455h = null;
        }
    }

    public List<qn.p> d() {
        c();
        return this.f26450c;
    }

    public rn.j e() {
        return rn.j.g(this.b);
    }

    public List<qn.y> f() {
        return this.f26451d;
    }

    public final boolean g(sn.i iVar) {
        sn.h hVarO = iVar.o();
        if (!pn.e.d(iVar)) {
            return false;
        }
        this.f26452e.append(iVar.d(hVarO, iVar.o()).c());
        if (!iVar.e()) {
            this.f26452e.append('\n');
            return true;
        }
        if (!iVar.i(']') || !iVar.i(':') || this.f26452e.length() > 999 || pn.c.c(this.f26452e.toString()).isEmpty()) {
            return false;
        }
        this.f26449a = b.DESTINATION;
        iVar.r();
        return true;
    }

    public void h(rn.i iVar) {
        boolean zK;
        this.b.add(iVar);
        if (this.f26449a == b.PARAGRAPH) {
            return;
        }
        sn.i iVarK = sn.i.k(rn.j.h(iVar));
        while (iVarK.e()) {
            int i10 = a.f26457a[this.f26449a.ordinal()];
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
                    throw new IllegalStateException("Unknown parsing state: " + this.f26449a);
                }
                zK = m(iVarK);
            }
            if (!zK) {
                this.f26449a = b.PARAGRAPH;
                c();
                return;
            }
        }
    }

    public List<qn.y> j(int i10) {
        List<qn.y> list = this.f26451d;
        List<qn.y> listUnmodifiableList = Collections.unmodifiableList(new ArrayList(list.subList(Math.max(list.size() - i10, 0), this.f26451d.size())));
        i(i10, this.b);
        i(i10, this.f26451d);
        return listUnmodifiableList;
    }

    public final boolean k(sn.i iVar) {
        c();
        iVar.r();
        if (!iVar.i('[')) {
            return false;
        }
        this.f26449a = b.LABEL;
        this.f26452e = new StringBuilder();
        if (iVar.e()) {
            return true;
        }
        this.f26452e.append('\n');
        return true;
    }

    public final boolean l(sn.i iVar) {
        iVar.r();
        if (!iVar.e()) {
            this.f26449a = b.START_DEFINITION;
            return true;
        }
        this.f26454g = (char) 0;
        char cL = iVar.l();
        if (cL == '\"' || cL == '\'') {
            this.f26454g = cL;
        } else if (cL == '(') {
            this.f26454g = ')';
        }
        if (this.f26454g != 0) {
            this.f26449a = b.TITLE;
            this.f26455h = new StringBuilder();
            iVar.h();
            if (!iVar.e()) {
                this.f26455h.append('\n');
            }
        } else {
            this.f26449a = b.START_DEFINITION;
        }
        return true;
    }

    public final boolean m(sn.i iVar) {
        sn.h hVarO = iVar.o();
        if (!pn.e.f(iVar, this.f26454g)) {
            this.f26455h = null;
            return false;
        }
        this.f26455h.append(iVar.d(hVarO, iVar.o()).c());
        if (!iVar.e()) {
            this.f26455h.append('\n');
            return true;
        }
        iVar.h();
        iVar.r();
        if (iVar.e()) {
            this.f26455h = null;
            return false;
        }
        this.f26456i = true;
        this.b.clear();
        this.f26449a = b.START_DEFINITION;
        return true;
    }
}
