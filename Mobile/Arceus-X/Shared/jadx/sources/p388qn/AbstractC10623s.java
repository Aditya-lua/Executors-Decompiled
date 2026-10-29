package p388qn;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: qn.s */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC10623s {

    /* JADX INFO: renamed from: a */
    public AbstractC10623s f38091a = null;

    /* JADX INFO: renamed from: b */
    public AbstractC10623s f38092b = null;

    /* JADX INFO: renamed from: c */
    public AbstractC10623s f38093c = null;

    /* JADX INFO: renamed from: d */
    public AbstractC10623s f38094d = null;

    /* JADX INFO: renamed from: e */
    public AbstractC10623s f38095e = null;

    /* JADX INFO: renamed from: f */
    public List<C10629y> f38096f = null;

    /* JADX INFO: renamed from: a */
    public abstract void mo40637a(InterfaceC10608d0 interfaceC10608d0);

    /* JADX INFO: renamed from: b */
    public void m40698b(C10629y c10629y) {
        if (this.f38096f == null) {
            this.f38096f = new ArrayList();
        }
        this.f38096f.add(c10629y);
    }

    /* JADX INFO: renamed from: c */
    public void mo40695c(AbstractC10623s abstractC10623s) {
        abstractC10623s.m40706n();
        abstractC10623s.mo40635k(this);
        AbstractC10623s abstractC10623s2 = this.f38093c;
        if (abstractC10623s2 != null) {
            abstractC10623s2.f38095e = abstractC10623s;
            abstractC10623s.f38094d = abstractC10623s2;
        } else {
            this.f38092b = abstractC10623s;
        }
        this.f38093c = abstractC10623s;
    }

    /* JADX INFO: renamed from: d */
    public AbstractC10623s m40699d() {
        return this.f38092b;
    }

    /* JADX INFO: renamed from: e */
    public AbstractC10623s m40700e() {
        return this.f38093c;
    }

    /* JADX INFO: renamed from: f */
    public AbstractC10623s m40701f() {
        return this.f38095e;
    }

    /* JADX INFO: renamed from: g */
    public AbstractC10623s mo40634g() {
        return this.f38091a;
    }

    /* JADX INFO: renamed from: h */
    public List<C10629y> m40702h() {
        List<C10629y> list = this.f38096f;
        return list != null ? Collections.unmodifiableList(list) : Collections.EMPTY_LIST;
    }

    /* JADX INFO: renamed from: i */
    public void m40703i(AbstractC10623s abstractC10623s) {
        abstractC10623s.m40706n();
        AbstractC10623s abstractC10623s2 = this.f38095e;
        abstractC10623s.f38095e = abstractC10623s2;
        if (abstractC10623s2 != null) {
            abstractC10623s2.f38094d = abstractC10623s;
        }
        abstractC10623s.f38094d = this;
        this.f38095e = abstractC10623s;
        AbstractC10623s abstractC10623s3 = this.f38091a;
        abstractC10623s.f38091a = abstractC10623s3;
        if (abstractC10623s.f38095e == null) {
            abstractC10623s3.f38093c = abstractC10623s;
        }
    }

    /* JADX INFO: renamed from: j */
    public void m40704j(AbstractC10623s abstractC10623s) {
        abstractC10623s.m40706n();
        AbstractC10623s abstractC10623s2 = this.f38094d;
        abstractC10623s.f38094d = abstractC10623s2;
        if (abstractC10623s2 != null) {
            abstractC10623s2.f38095e = abstractC10623s;
        }
        abstractC10623s.f38095e = this;
        this.f38094d = abstractC10623s;
        AbstractC10623s abstractC10623s3 = this.f38091a;
        abstractC10623s.f38091a = abstractC10623s3;
        if (abstractC10623s.f38094d == null) {
            abstractC10623s3.f38092b = abstractC10623s;
        }
    }

    /* JADX INFO: renamed from: k */
    public void mo40635k(AbstractC10623s abstractC10623s) {
        this.f38091a = abstractC10623s;
    }

    /* JADX INFO: renamed from: l */
    public void m40705l(List<C10629y> list) {
        if (list.isEmpty()) {
            this.f38096f = null;
        } else {
            this.f38096f = new ArrayList(list);
        }
    }

    /* JADX INFO: renamed from: m */
    public String mo40638m() {
        return "";
    }

    /* JADX INFO: renamed from: n */
    public void m40706n() {
        AbstractC10623s abstractC10623s = this.f38094d;
        if (abstractC10623s != null) {
            abstractC10623s.f38095e = this.f38095e;
        } else {
            AbstractC10623s abstractC10623s2 = this.f38091a;
            if (abstractC10623s2 != null) {
                abstractC10623s2.f38092b = this.f38095e;
            }
        }
        AbstractC10623s abstractC10623s3 = this.f38095e;
        if (abstractC10623s3 != null) {
            abstractC10623s3.f38094d = abstractC10623s;
        } else {
            AbstractC10623s abstractC10623s4 = this.f38091a;
            if (abstractC10623s4 != null) {
                abstractC10623s4.f38093c = abstractC10623s;
            }
        }
        this.f38091a = null;
        this.f38095e = null;
        this.f38094d = null;
    }

    public String toString() {
        return getClass().getSimpleName() + "{" + mo40638m() + "}";
    }
}
