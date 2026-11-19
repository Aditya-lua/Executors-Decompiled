package pe;

import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.logging.Level;
import java.util.logging.Logger;
import ke.y0;

/* JADX INFO: loaded from: classes2.dex */
public abstract class g<InputT, OutputT> extends h<OutputT> {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final Logger f29077o = Logger.getLogger(g.class.getName());

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public ke.r<? extends x<? extends InputT>> f29078l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final boolean f29079m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final boolean f29080n;

    public enum a {
        OUTPUT_FUTURE_DONE,
        ALL_INPUT_FUTURES_PROCESSED
    }

    public g(ke.r<? extends x<? extends InputT>> rVar, boolean z10, boolean z11) {
        super(rVar.size());
        this.f29078l = (ke.r) je.n.l(rVar);
        this.f29079m = z10;
        this.f29080n = z11;
    }

    public static /* synthetic */ void P(g gVar, x xVar, int i10) {
        gVar.getClass();
        try {
            if (xVar.isCancelled()) {
                gVar.f29078l = null;
                gVar.cancel(false);
            } else {
                gVar.S(i10, xVar);
            }
        } finally {
            gVar.T(null);
        }
    }

    public static boolean Q(Set<Throwable> set, Throwable th2) {
        while (th2 != null) {
            if (!set.add(th2)) {
                return false;
            }
            th2 = th2.getCause();
        }
        return true;
    }

    public static void X(Throwable th2) {
        f29077o.log(Level.SEVERE, th2 instanceof Error ? "Input Future failed with Error" : "Got more than one input Future failure. Logging failures after the first", th2);
    }

    @Override // pe.b
    public final String A() {
        ke.r<? extends x<? extends InputT>> rVar = this.f29078l;
        if (rVar == null) {
            return super.A();
        }
        String strValueOf = String.valueOf(rVar);
        StringBuilder sb2 = new StringBuilder(strValueOf.length() + 8);
        sb2.append("futures=");
        sb2.append(strValueOf);
        return sb2.toString();
    }

    @Override // pe.h
    public final void K(Set<Throwable> set) {
        je.n.l(set);
        if (isCancelled()) {
            return;
        }
        Throwable thC = c();
        Objects.requireNonNull(thC);
        Q(set, thC);
    }

    public abstract void R(int i10, InputT inputt);

    /* JADX WARN: Multi-variable type inference failed */
    public final void S(int i10, Future<? extends InputT> future) {
        try {
            R(i10, s.f(future));
        } catch (ExecutionException e10) {
            V(e10.getCause());
        } catch (Throwable th2) {
            V(th2);
        }
    }

    public final void T(ke.r<? extends Future<? extends InputT>> rVar) {
        int iM = M();
        je.n.s(iM >= 0, "Less than 0 remaining futures");
        if (iM == 0) {
            Y(rVar);
        }
    }

    public abstract void U();

    public final void V(Throwable th2) {
        je.n.l(th2);
        if (this.f29079m && !E(th2) && Q(N(), th2)) {
            X(th2);
        } else if (th2 instanceof Error) {
            X(th2);
        }
    }

    public final void W() {
        Objects.requireNonNull(this.f29078l);
        if (this.f29078l.isEmpty()) {
            U();
            return;
        }
        if (!this.f29079m) {
            final ke.r<? extends x<? extends InputT>> rVar = this.f29080n ? this.f29078l : null;
            Runnable runnable = new Runnable() { // from class: pe.f
                @Override // java.lang.Runnable
                public final void run() {
                    this.f29067a.T(rVar);
                }
            };
            y0<? extends x<? extends InputT>> it = this.f29078l.iterator();
            while (it.hasNext()) {
                it.next().a(runnable, a0.a());
            }
            return;
        }
        y0<? extends x<? extends InputT>> it2 = this.f29078l.iterator();
        final int i10 = 0;
        while (it2.hasNext()) {
            final x<? extends InputT> next = it2.next();
            next.a(new Runnable() { // from class: pe.e
                @Override // java.lang.Runnable
                public final void run() {
                    g.P(this.f29065a, next, i10);
                }
            }, a0.a());
            i10++;
        }
    }

    public final void Y(ke.r<? extends Future<? extends InputT>> rVar) {
        if (rVar != null) {
            y0<? extends Future<? extends InputT>> it = rVar.iterator();
            int i10 = 0;
            while (it.hasNext()) {
                Future<? extends InputT> next = it.next();
                if (!next.isCancelled()) {
                    S(i10, next);
                }
                i10++;
            }
        }
        L();
        U();
        Z(a.ALL_INPUT_FUTURES_PROCESSED);
    }

    public void Z(a aVar) {
        je.n.l(aVar);
        this.f29078l = null;
    }

    @Override // pe.b
    public final void o() {
        super.o();
        ke.r<? extends x<? extends InputT>> rVar = this.f29078l;
        Z(a.OUTPUT_FUTURE_DONE);
        if (isCancelled() && (rVar != null)) {
            boolean zG = G();
            y0<? extends x<? extends InputT>> it = rVar.iterator();
            while (it.hasNext()) {
                it.next().cancel(zG);
            }
        }
    }
}
