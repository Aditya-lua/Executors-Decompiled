package qn;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public abstract class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public s f29493a = null;
    public s b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public s f29494c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public s f29495d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public s f29496e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public List<y> f29497f = null;

    public abstract void a(d0 d0Var);

    public void b(y yVar) {
        if (this.f29497f == null) {
            this.f29497f = new ArrayList();
        }
        this.f29497f.add(yVar);
    }

    public void c(s sVar) {
        sVar.n();
        sVar.k(this);
        s sVar2 = this.f29494c;
        if (sVar2 != null) {
            sVar2.f29496e = sVar;
            sVar.f29495d = sVar2;
        } else {
            this.b = sVar;
        }
        this.f29494c = sVar;
    }

    public s d() {
        return this.b;
    }

    public s e() {
        return this.f29494c;
    }

    public s f() {
        return this.f29496e;
    }

    public s g() {
        return this.f29493a;
    }

    public List<y> h() {
        List<y> list = this.f29497f;
        return list != null ? Collections.unmodifiableList(list) : Collections.EMPTY_LIST;
    }

    public void i(s sVar) {
        sVar.n();
        s sVar2 = this.f29496e;
        sVar.f29496e = sVar2;
        if (sVar2 != null) {
            sVar2.f29495d = sVar;
        }
        sVar.f29495d = this;
        this.f29496e = sVar;
        s sVar3 = this.f29493a;
        sVar.f29493a = sVar3;
        if (sVar.f29496e == null) {
            sVar3.f29494c = sVar;
        }
    }

    public void j(s sVar) {
        sVar.n();
        s sVar2 = this.f29495d;
        sVar.f29495d = sVar2;
        if (sVar2 != null) {
            sVar2.f29496e = sVar;
        }
        sVar.f29496e = this;
        this.f29495d = sVar;
        s sVar3 = this.f29493a;
        sVar.f29493a = sVar3;
        if (sVar.f29495d == null) {
            sVar3.b = sVar;
        }
    }

    public void k(s sVar) {
        this.f29493a = sVar;
    }

    public void l(List<y> list) {
        if (list.isEmpty()) {
            this.f29497f = null;
        } else {
            this.f29497f = new ArrayList(list);
        }
    }

    public String m() {
        return "";
    }

    public void n() {
        s sVar = this.f29495d;
        if (sVar != null) {
            sVar.f29496e = this.f29496e;
        } else {
            s sVar2 = this.f29493a;
            if (sVar2 != null) {
                sVar2.b = this.f29496e;
            }
        }
        s sVar3 = this.f29496e;
        if (sVar3 != null) {
            sVar3.f29495d = sVar;
        } else {
            s sVar4 = this.f29493a;
            if (sVar4 != null) {
                sVar4.f29494c = sVar;
            }
        }
        this.f29493a = null;
        this.f29496e = null;
        this.f29495d = null;
    }

    public String toString() {
        return getClass().getSimpleName() + "{" + m() + "}";
    }
}
