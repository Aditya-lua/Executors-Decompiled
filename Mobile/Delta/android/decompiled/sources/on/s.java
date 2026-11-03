package on;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public abstract class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public s f28037a = null;
    public s b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public s f28038c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public s f28039d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public s f28040e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public List<y> f28041f = null;

    public abstract void a(d0 d0Var);

    public void b(y yVar) {
        if (this.f28041f == null) {
            this.f28041f = new ArrayList();
        }
        this.f28041f.add(yVar);
    }

    public void c(s sVar) {
        sVar.n();
        sVar.k(this);
        s sVar2 = this.f28038c;
        if (sVar2 != null) {
            sVar2.f28040e = sVar;
            sVar.f28039d = sVar2;
        } else {
            this.b = sVar;
        }
        this.f28038c = sVar;
    }

    public s d() {
        return this.b;
    }

    public s e() {
        return this.f28038c;
    }

    public s f() {
        return this.f28040e;
    }

    public s g() {
        return this.f28037a;
    }

    public List<y> h() {
        List<y> list = this.f28041f;
        return list != null ? Collections.unmodifiableList(list) : Collections.EMPTY_LIST;
    }

    public void i(s sVar) {
        sVar.n();
        s sVar2 = this.f28040e;
        sVar.f28040e = sVar2;
        if (sVar2 != null) {
            sVar2.f28039d = sVar;
        }
        sVar.f28039d = this;
        this.f28040e = sVar;
        s sVar3 = this.f28037a;
        sVar.f28037a = sVar3;
        if (sVar.f28040e == null) {
            sVar3.f28038c = sVar;
        }
    }

    public void j(s sVar) {
        sVar.n();
        s sVar2 = this.f28039d;
        sVar.f28039d = sVar2;
        if (sVar2 != null) {
            sVar2.f28040e = sVar;
        }
        sVar.f28040e = this;
        this.f28039d = sVar;
        s sVar3 = this.f28037a;
        sVar.f28037a = sVar3;
        if (sVar.f28039d == null) {
            sVar3.b = sVar;
        }
    }

    public void k(s sVar) {
        this.f28037a = sVar;
    }

    public void l(List<y> list) {
        if (list.isEmpty()) {
            this.f28041f = null;
        } else {
            this.f28041f = new ArrayList(list);
        }
    }

    public String m() {
        return "";
    }

    public void n() {
        s sVar = this.f28039d;
        if (sVar != null) {
            sVar.f28040e = this.f28040e;
        } else {
            s sVar2 = this.f28037a;
            if (sVar2 != null) {
                sVar2.b = this.f28040e;
            }
        }
        s sVar3 = this.f28040e;
        if (sVar3 != null) {
            sVar3.f28039d = sVar;
        } else {
            s sVar4 = this.f28037a;
            if (sVar4 != null) {
                sVar4.f28038c = sVar;
            }
        }
        this.f28037a = null;
        this.f28040e = null;
        this.f28039d = null;
    }

    public String toString() {
        return getClass().getSimpleName() + "{" + m() + "}";
    }
}
