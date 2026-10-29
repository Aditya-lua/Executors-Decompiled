package ne;

import ie.AbstractC6792r;
import ie.AbstractC6807y0;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.logging.Level;
import java.util.logging.Logger;
import p169he.C6384n;

/* JADX INFO: renamed from: ne.g */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC9421g<InputT, OutputT> extends AbstractC9423h<OutputT> {

    /* JADX INFO: renamed from: o */
    public static final Logger f33932o = Logger.getLogger(AbstractC9421g.class.getName());

    /* JADX INFO: renamed from: l */
    public AbstractC6792r<? extends InterfaceFutureC9440x<? extends InputT>> f33933l;

    /* JADX INFO: renamed from: m */
    public final boolean f33934m;

    /* JADX INFO: renamed from: n */
    public final boolean f33935n;

    /* JADX INFO: renamed from: ne.g$a */
    public enum a {
        OUTPUT_FUTURE_DONE,
        ALL_INPUT_FUTURES_PROCESSED
    }

    public AbstractC9421g(AbstractC6792r<? extends InterfaceFutureC9440x<? extends InputT>> abstractC6792r, boolean z10, boolean z11) {
        super(abstractC6792r.size());
        this.f33933l = (AbstractC6792r) C6384n.m27928l(abstractC6792r);
        this.f33934m = z10;
        this.f33935n = z11;
    }

    /* JADX INFO: renamed from: P */
    public static /* synthetic */ void m37214P(AbstractC9421g abstractC9421g, InterfaceFutureC9440x interfaceFutureC9440x, int i10) {
        abstractC9421g.getClass();
        try {
            if (interfaceFutureC9440x.isCancelled()) {
                abstractC9421g.f33933l = null;
                abstractC9421g.cancel(false);
            } else {
                abstractC9421g.m37219S(i10, interfaceFutureC9440x);
            }
        } finally {
            abstractC9421g.m37220T(null);
        }
    }

    /* JADX INFO: renamed from: Q */
    public static boolean m37215Q(Set<Throwable> set, Throwable th2) {
        while (th2 != null) {
            if (!set.add(th2)) {
                return false;
            }
            th2 = th2.getCause();
        }
        return true;
    }

    /* JADX INFO: renamed from: X */
    public static void m37216X(Throwable th2) {
        f33932o.log(Level.SEVERE, th2 instanceof Error ? "Input Future failed with Error" : "Got more than one input Future failure. Logging failures after the first", th2);
    }

    @Override // ne.AbstractC9411b
    /* JADX INFO: renamed from: A */
    public final String mo37138A() {
        AbstractC6792r<? extends InterfaceFutureC9440x<? extends InputT>> abstractC6792r = this.f33933l;
        if (abstractC6792r == null) {
            return super.mo37138A();
        }
        String strValueOf = String.valueOf(abstractC6792r);
        StringBuilder sb2 = new StringBuilder(strValueOf.length() + 8);
        sb2.append("futures=");
        sb2.append(strValueOf);
        return sb2.toString();
    }

    @Override // ne.AbstractC9423h
    /* JADX INFO: renamed from: K */
    public final void mo37217K(Set<Throwable> set) {
        C6384n.m27928l(set);
        if (isCancelled()) {
            return;
        }
        Throwable thMo37174c = mo37174c();
        Objects.requireNonNull(thMo37174c);
        m37215Q(set, thMo37174c);
    }

    /* JADX INFO: renamed from: R */
    public abstract void mo37218R(int i10, InputT inputt);

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: ne.g<InputT, OutputT> */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: S */
    public final void m37219S(int i10, Future<? extends InputT> future) {
        try {
            mo37218R(i10, C9435s.m37261f(future));
        } catch (ExecutionException e10) {
            m37222V(e10.getCause());
        } catch (Throwable th2) {
            m37222V(th2);
        }
    }

    /* JADX INFO: renamed from: T */
    public final void m37220T(AbstractC6792r<? extends Future<? extends InputT>> abstractC6792r) {
        int iM37238M = m37238M();
        C6384n.m27935s(iM37238M >= 0, "Less than 0 remaining futures");
        if (iM37238M == 0) {
            m37224Y(abstractC6792r);
        }
    }

    /* JADX INFO: renamed from: U */
    public abstract void mo37221U();

    /* JADX INFO: renamed from: V */
    public final void m37222V(Throwable th2) {
        C6384n.m27928l(th2);
        if (this.f33934m && !mo37170E(th2) && m37215Q(m37239N(), th2)) {
            m37216X(th2);
        } else if (th2 instanceof Error) {
            m37216X(th2);
        }
    }

    /* JADX INFO: renamed from: W */
    public final void m37223W() {
        Objects.requireNonNull(this.f33933l);
        if (this.f33933l.isEmpty()) {
            mo37221U();
            return;
        }
        if (!this.f33934m) {
            final AbstractC6792r<? extends InterfaceFutureC9440x<? extends InputT>> abstractC6792r = this.f33935n ? this.f33933l : null;
            Runnable runnable = new Runnable() { // from class: ne.f
                @Override // java.lang.Runnable
                public final void run() {
                    this.f33919a.m37220T(abstractC6792r);
                }
            };
            AbstractC6807y0<? extends InterfaceFutureC9440x<? extends InputT>> it = this.f33933l.iterator();
            while (it.hasNext()) {
                it.next().mo37173a(runnable, C9410a0.m37145a());
            }
            return;
        }
        AbstractC6807y0<? extends InterfaceFutureC9440x<? extends InputT>> it2 = this.f33933l.iterator();
        final int i10 = 0;
        while (it2.hasNext()) {
            final InterfaceFutureC9440x<? extends InputT> next = it2.next();
            next.mo37173a(new Runnable() { // from class: ne.e
                @Override // java.lang.Runnable
                public final void run() {
                    AbstractC9421g.m37214P(this.f33916a, next, i10);
                }
            }, C9410a0.m37145a());
            i10++;
        }
    }

    /* JADX INFO: renamed from: Y */
    public final void m37224Y(AbstractC6792r<? extends Future<? extends InputT>> abstractC6792r) {
        if (abstractC6792r != null) {
            AbstractC6807y0<? extends Future<? extends InputT>> it = abstractC6792r.iterator();
            int i10 = 0;
            while (it.hasNext()) {
                Future<? extends InputT> next = it.next();
                if (!next.isCancelled()) {
                    m37219S(i10, next);
                }
                i10++;
            }
        }
        m37237L();
        mo37221U();
        mo37225Z(a.ALL_INPUT_FUTURES_PROCESSED);
    }

    /* JADX INFO: renamed from: Z */
    public void mo37225Z(a aVar) {
        C6384n.m27928l(aVar);
        this.f33933l = null;
    }

    @Override // ne.AbstractC9411b
    /* JADX INFO: renamed from: o */
    public final void mo37141o() {
        super.mo37141o();
        AbstractC6792r<? extends InterfaceFutureC9440x<? extends InputT>> abstractC6792r = this.f33933l;
        mo37225Z(a.OUTPUT_FUTURE_DONE);
        if (isCancelled() && (abstractC6792r != null)) {
            boolean zM37172G = m37172G();
            AbstractC6807y0<? extends InterfaceFutureC9440x<? extends InputT>> it = abstractC6792r.iterator();
            while (it.hasNext()) {
                it.next().cancel(zM37172G);
            }
        }
    }
}
