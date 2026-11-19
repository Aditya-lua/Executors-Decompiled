package eo;

import com.github.luben.zstd.BuildConfig;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public abstract class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public s f13866a = null;
    public s b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public s f13867c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public s f13868d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public s f13869e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public List<y> f13870f = null;

    public abstract void a(d0 d0Var);

    public void b(y yVar) {
        if (this.f13870f == null) {
            this.f13870f = new ArrayList();
        }
        this.f13870f.add(yVar);
    }

    public void c(s sVar) {
        sVar.n();
        sVar.k(this);
        s sVar2 = this.f13867c;
        if (sVar2 != null) {
            sVar2.f13869e = sVar;
            sVar.f13868d = sVar2;
        } else {
            this.b = sVar;
        }
        this.f13867c = sVar;
    }

    public s d() {
        return this.b;
    }

    public s e() {
        return this.f13867c;
    }

    public s f() {
        return this.f13869e;
    }

    public s g() {
        return this.f13866a;
    }

    public List<y> h() {
        List<y> list = this.f13870f;
        return list != null ? Collections.unmodifiableList(list) : Collections.EMPTY_LIST;
    }

    public void i(s sVar) {
        sVar.n();
        s sVar2 = this.f13869e;
        sVar.f13869e = sVar2;
        if (sVar2 != null) {
            sVar2.f13868d = sVar;
        }
        sVar.f13868d = this;
        this.f13869e = sVar;
        s sVar3 = this.f13866a;
        sVar.f13866a = sVar3;
        if (sVar.f13869e == null) {
            sVar3.f13867c = sVar;
        }
    }

    public void j(s sVar) {
        sVar.n();
        s sVar2 = this.f13868d;
        sVar.f13868d = sVar2;
        if (sVar2 != null) {
            sVar2.f13869e = sVar;
        }
        sVar.f13869e = this;
        this.f13868d = sVar;
        s sVar3 = this.f13866a;
        sVar.f13866a = sVar3;
        if (sVar.f13868d == null) {
            sVar3.b = sVar;
        }
    }

    public void k(s sVar) {
        this.f13866a = sVar;
    }

    public void l(List<y> list) {
        if (list.isEmpty()) {
            this.f13870f = null;
        } else {
            this.f13870f = new ArrayList(list);
        }
    }

    public String m() {
        return BuildConfig.FLAVOR;
    }

    public void n() {
        s sVar = this.f13868d;
        if (sVar != null) {
            sVar.f13869e = this.f13869e;
        } else {
            s sVar2 = this.f13866a;
            if (sVar2 != null) {
                sVar2.b = this.f13869e;
            }
        }
        s sVar3 = this.f13869e;
        if (sVar3 != null) {
            sVar3.f13868d = sVar;
        } else {
            s sVar4 = this.f13866a;
            if (sVar4 != null) {
                sVar4.f13867c = sVar;
            }
        }
        this.f13866a = null;
        this.f13869e = null;
        this.f13868d = null;
    }

    public String toString() {
        return getClass().getSimpleName() + "{" + m() + "}";
    }
}
