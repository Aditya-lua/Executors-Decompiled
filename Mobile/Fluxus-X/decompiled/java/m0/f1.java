package m0;

import android.util.Log;
import g0.r1;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class f1 implements b1, androidx.camera.core.b.a, l1.a {
    public final c0 b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public d0 f22599c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public y0 f22600d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List<y0> f22601e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Deque<l1> f22598a = new ArrayDeque();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f22602f = false;

    public class a implements r0.c<Void> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ n f22603a;

        public a(n nVar) {
            this.f22603a = nVar;
        }

        @Override // r0.c
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(Void r10) {
            f1.this.b.c();
        }

        @Override // r0.c
        public void onFailure(Throwable th2) {
            if (this.f22603a.b()) {
                return;
            }
            int iF = this.f22603a.a().get(0).f();
            if (th2 instanceof g0.h1) {
                f1.this.f22599c.j(b1.a.c(iF, (g0.h1) th2));
            } else {
                f1.this.f22599c.j(b1.a.c(iF, new g0.h1(2, "Failed to submit capture request", th2)));
            }
            f1.this.b.c();
        }
    }

    public f1(c0 c0Var) {
        p0.z.b();
        this.b = c0Var;
        this.f22601e = new ArrayList();
    }

    public static /* synthetic */ void h(f1 f1Var) {
        f1Var.f22600d = null;
        f1Var.j();
    }

    @Override // androidx.camera.core.b.a
    public void a(androidx.camera.core.d dVar) {
        q0.c.e().execute(new Runnable() { // from class: m0.e1
            @Override // java.lang.Runnable
            public final void run() {
                this.f22596a.j();
            }
        });
    }

    @Override // m0.b1
    public void b(l1 l1Var) {
        p0.z.b();
        this.f22598a.offer(l1Var);
        j();
    }

    @Override // m0.b1
    public void c() {
        p0.z.b();
        g0.h1 h1Var = new g0.h1(3, "Camera is closed.", null);
        Iterator<l1> it = this.f22598a.iterator();
        while (it.hasNext()) {
            it.next().x(h1Var);
        }
        this.f22598a.clear();
        ArrayList arrayList = new ArrayList(this.f22601e);
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((y0) obj).m(h1Var);
        }
    }

    @Override // m0.b1
    public void d(d0 d0Var) {
        p0.z.b();
        this.f22599c = d0Var;
        d0Var.k(this);
    }

    @Override // m0.b1
    public void e() {
        p0.z.b();
        this.f22602f = false;
        j();
    }

    @Override // m0.l1.a
    public void f(l1 l1Var) {
        p0.z.b();
        r1.a("TakePictureManagerImpl", "Add a new request for retrying.");
        this.f22598a.addFirst(l1Var);
        j();
    }

    public boolean i() {
        return this.f22600d != null;
    }

    public void j() {
        p0.z.b();
        Log.d("TakePictureManagerImpl", "Issue the next TakePictureRequest.");
        if (i()) {
            Log.d("TakePictureManagerImpl", "There is already a request in-flight.");
            return;
        }
        if (this.f22602f) {
            Log.d("TakePictureManagerImpl", "The class is paused.");
            return;
        }
        if (this.f22599c.h() == 0) {
            Log.d("TakePictureManagerImpl", "Too many acquire images. Close image to be able to process next.");
            return;
        }
        l1 l1VarPoll = this.f22598a.poll();
        if (l1VarPoll == null) {
            Log.d("TakePictureManagerImpl", "No new request.");
            return;
        }
        y0 y0Var = new y0(l1VarPoll, this);
        l(y0Var);
        x2.c<n, v0> cVarE = this.f22599c.e(l1VarPoll, y0Var, y0Var.p());
        n nVar = cVarE.f36145a;
        Objects.requireNonNull(nVar);
        v0 v0Var = cVarE.b;
        Objects.requireNonNull(v0Var);
        this.f22599c.m(v0Var);
        y0Var.t(k(nVar));
    }

    public final pe.x<Void> k(n nVar) {
        p0.z.b();
        this.b.b();
        pe.x<Void> xVarA = this.b.a(nVar.a());
        r0.n.j(xVarA, new a(nVar), q0.c.e());
        return xVarA;
    }

    public final void l(final y0 y0Var) {
        x2.g.i(!i());
        this.f22600d = y0Var;
        y0Var.p().a(new Runnable() { // from class: m0.c1
            @Override // java.lang.Runnable
            public final void run() {
                f1.h(this.f22586a);
            }
        }, q0.c.b());
        this.f22601e.add(y0Var);
        y0Var.q().a(new Runnable() { // from class: m0.d1
            @Override // java.lang.Runnable
            public final void run() {
                this.f22594a.f22601e.remove(y0Var);
            }
        }, q0.c.b());
    }

    @Override // m0.b1
    public void pause() {
        p0.z.b();
        this.f22602f = true;
        y0 y0Var = this.f22600d;
        if (y0Var != null) {
            y0Var.n();
        }
    }
}
