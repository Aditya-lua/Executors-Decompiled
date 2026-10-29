package com.google.android.gms.internal.play_billing;

import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.m1 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2572m1<V> extends AbstractC2638s1<V> {
    /* JADX INFO: renamed from: m */
    public static Object m11570m(Object obj) throws ExecutionException {
        if (obj instanceof C2517h1) {
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(((C2517h1) obj).f9027b);
            throw cancellationException;
        }
        if (obj instanceof C2539j1) {
            throw new ExecutionException(((C2539j1) obj).f9051a);
        }
        if (obj == AbstractC2638s1.f9220d) {
            return null;
        }
        return obj;
    }

    /* JADX INFO: renamed from: q */
    public static boolean m11572q(Object obj) {
        return !(obj instanceof RunnableC2528i1);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r7v0, resolved type: com.google.android.gms.internal.play_billing.i2 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: t */
    public static Object m11573t(InterfaceFutureC2529i2 interfaceFutureC2529i2) {
        Throwable thMo11577c;
        if (interfaceFutureC2529i2 instanceof InterfaceC2561l1) {
            Object c2517h1 = ((AbstractC2572m1) interfaceFutureC2529i2).f9224a;
            if (c2517h1 instanceof C2517h1) {
                C2517h1 c2517h2 = (C2517h1) c2517h1;
                if (c2517h2.f9026a) {
                    Throwable th2 = c2517h2.f9027b;
                    c2517h1 = th2 != null ? new C2517h1(false, th2) : C2517h1.f9025d;
                }
            }
            Objects.requireNonNull(c2517h1);
            return c2517h1;
        }
        if ((interfaceFutureC2529i2 instanceof AbstractC2595o2) && (thMo11577c = ((AbstractC2595o2) interfaceFutureC2529i2).mo11577c()) != null) {
            return new C2539j1(thMo11577c);
        }
        boolean zIsCancelled = interfaceFutureC2529i2.isCancelled();
        if ((!AbstractC2638s1.f9222f) && zIsCancelled) {
            C2517h1 c2517h3 = C2517h1.f9025d;
            Objects.requireNonNull(c2517h3);
            return c2517h3;
        }
        try {
            Object objM11574u = m11574u(interfaceFutureC2529i2);
            if (!zIsCancelled) {
                return objM11574u == null ? AbstractC2638s1.f9220d : objM11574u;
            }
            return new C2517h1(false, new IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: " + String.valueOf(interfaceFutureC2529i2)));
        } catch (Error | Exception e10) {
            return new C2539j1(e10);
        } catch (CancellationException e11) {
            return !zIsCancelled ? new C2539j1(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: ".concat(String.valueOf(interfaceFutureC2529i2)), e11)) : new C2517h1(false, e11);
        } catch (ExecutionException e12) {
            return zIsCancelled ? new C2517h1(false, new IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: ".concat(String.valueOf(interfaceFutureC2529i2)), e12)) : new C2539j1(e12.getCause());
        }
    }

    /* JADX INFO: renamed from: u */
    public static Object m11574u(Future future) {
        Object obj;
        boolean z10 = false;
        while (true) {
            try {
                obj = future.get();
                break;
            } catch (InterruptedException unused) {
                z10 = true;
            } catch (Throwable th2) {
                if (z10) {
                    Thread.currentThread().interrupt();
                }
                throw th2;
            }
        }
        if (z10) {
            Thread.currentThread().interrupt();
        }
        return obj;
    }

    /* JADX INFO: renamed from: w */
    public static void m11575w(AbstractC2572m1 abstractC2572m1, boolean z10) {
        C2550k1 c2550k1 = null;
        while (true) {
            abstractC2572m1.m11715i();
            abstractC2572m1.mo11579p();
            C2550k1 c2550k2 = c2550k1;
            C2550k1 c2550k1M11712e = abstractC2572m1.m11712e(C2550k1.f9057d);
            C2550k1 c2550k3 = c2550k2;
            while (c2550k1M11712e != null) {
                C2550k1 c2550k4 = c2550k1M11712e.f9060c;
                c2550k1M11712e.f9060c = c2550k3;
                c2550k3 = c2550k1M11712e;
                c2550k1M11712e = c2550k4;
            }
            while (c2550k3 != null) {
                Runnable runnable = c2550k3.f9058a;
                C2550k1 c2550k5 = c2550k3.f9060c;
                Objects.requireNonNull(runnable);
                Runnable runnable2 = runnable;
                if (runnable2 instanceof RunnableC2528i1) {
                    RunnableC2528i1 runnableC2528i1 = (RunnableC2528i1) runnable2;
                    abstractC2572m1 = runnableC2528i1.f9045a;
                    if (abstractC2572m1.f9224a == runnableC2528i1 && AbstractC2638s1.m11710k(abstractC2572m1, runnableC2528i1, m11573t(runnableC2528i1.f9046b))) {
                        c2550k1 = c2550k5;
                    }
                } else {
                    Executor executor = c2550k3.f9059b;
                    Objects.requireNonNull(executor);
                    m11576x(runnable2, executor);
                }
                c2550k3 = c2550k5;
            }
            return;
        }
    }

    /* JADX INFO: renamed from: x */
    public static void m11576x(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (Exception e10) {
            AbstractC2638s1.f9221e.m11443a().logp(Level.SEVERE, "com.google.common.util.concurrent.AbstractFuture", "executeListener", "RuntimeException while executing runnable " + String.valueOf(runnable) + " with executor " + String.valueOf(executor), (Throwable) e10);
        }
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceFutureC2529i2
    /* JADX INFO: renamed from: b */
    public final void mo11419b(Runnable runnable, Executor executor) {
        C2550k1 c2550k1;
        C2691x.m11817c(executor, "Executor was null.");
        if (!isDone() && (c2550k1 = this.f9225b) != C2550k1.f9057d) {
            C2550k1 c2550k2 = new C2550k1(runnable, executor);
            do {
                c2550k2.f9060c = c2550k1;
                if (m11716j(c2550k1, c2550k2)) {
                    return;
                } else {
                    c2550k1 = this.f9225b;
                }
            } while (c2550k1 != C2550k1.f9057d);
        }
        m11576x(runnable, executor);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC2595o2
    /* JADX INFO: renamed from: c */
    public final Throwable mo11577c() {
        if (!(this instanceof InterfaceC2561l1)) {
            return null;
        }
        Object obj = this.f9224a;
        if (obj instanceof C2539j1) {
            return ((C2539j1) obj).f9051a;
        }
        return null;
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z10) {
        C2517h1 c2517h1;
        Object obj = this.f9224a;
        if (!(obj instanceof RunnableC2528i1) && !(obj == null)) {
            return false;
        }
        if (AbstractC2638s1.f9222f) {
            c2517h1 = new C2517h1(z10, new CancellationException("Future.cancel() was called."));
        } else {
            c2517h1 = z10 ? C2517h1.f9024c : C2517h1.f9025d;
            Objects.requireNonNull(c2517h1);
        }
        AbstractC2572m1<V> abstractC2572m1 = this;
        boolean z11 = false;
        while (true) {
            if (AbstractC2638s1.m11710k(abstractC2572m1, obj, c2517h1)) {
                m11575w(abstractC2572m1, z10);
                if (obj instanceof RunnableC2528i1) {
                    InterfaceFutureC2529i2<? extends V> interfaceFutureC2529i2 = ((RunnableC2528i1) obj).f9046b;
                    if (interfaceFutureC2529i2 instanceof InterfaceC2561l1) {
                        abstractC2572m1 = (AbstractC2572m1) interfaceFutureC2529i2;
                        obj = abstractC2572m1.f9224a;
                        if (!(obj == null) && !(obj instanceof RunnableC2528i1)) {
                            return true;
                        }
                        z11 = true;
                    } else {
                        interfaceFutureC2529i2.cancel(z10);
                    }
                }
                return true;
            }
            obj = abstractC2572m1.f9224a;
            if (m11572q(obj)) {
                return z11;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.concurrent.Future
    public final Object get() {
        return m11713f();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f9224a instanceof C2517h1;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        Object obj = this.f9224a;
        return (obj != null) & m11572q(obj);
    }

    /* JADX INFO: renamed from: n */
    public String mo11578n() {
        throw null;
    }

    /* JADX INFO: renamed from: p */
    public void mo11579p() {
    }

    /* JADX INFO: renamed from: r */
    public final boolean m11580r(Throwable th2) {
        if (!AbstractC2638s1.m11710k(this, null, new C2539j1(th2))) {
            return false;
        }
        m11575w(this, false);
        return true;
    }

    /* JADX INFO: renamed from: s */
    public final boolean m11581s(InterfaceFutureC2529i2 interfaceFutureC2529i2) {
        C2539j1 c2539j1;
        Object obj = this.f9224a;
        if (obj == null) {
            if (interfaceFutureC2529i2.isDone()) {
                if (!AbstractC2638s1.m11710k(this, null, m11573t(interfaceFutureC2529i2))) {
                    return false;
                }
                m11575w(this, false);
                return true;
            }
            RunnableC2528i1 runnableC2528i1 = new RunnableC2528i1(this, interfaceFutureC2529i2);
            if (AbstractC2638s1.m11710k(this, null, runnableC2528i1)) {
                try {
                    interfaceFutureC2529i2.mo11419b(runnableC2528i1, EnumC2704y1.INSTANCE);
                } catch (Throwable th2) {
                    try {
                        c2539j1 = new C2539j1(th2);
                    } catch (Error | Exception unused) {
                        c2539j1 = C2539j1.f9050b;
                    }
                    AbstractC2638s1.m11710k(this, runnableC2528i1, c2539j1);
                }
                return true;
            }
            obj = this.f9224a;
        }
        if (obj instanceof C2517h1) {
            interfaceFutureC2529i2.cancel(((C2517h1) obj).f9026a);
        }
        return false;
    }

    public final String toString() {
        String strConcat;
        StringBuilder sb2 = new StringBuilder();
        if (getClass().getName().startsWith("com.google.common.util.concurrent.")) {
            sb2.append(getClass().getSimpleName());
        } else {
            sb2.append(getClass().getName());
        }
        sb2.append('@');
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append("[status=");
        if (this.f9224a instanceof C2517h1) {
            sb2.append("CANCELLED");
        } else if (isDone()) {
            m11582v(sb2);
        } else {
            int length = sb2.length();
            sb2.append("PENDING");
            Object obj = this.f9224a;
            if (obj instanceof RunnableC2528i1) {
                sb2.append(", setFuture=[");
                InterfaceFutureC2529i2<? extends V> interfaceFutureC2529i2 = ((RunnableC2528i1) obj).f9046b;
                try {
                    if (interfaceFutureC2529i2 == this) {
                        sb2.append("this future");
                    } else {
                        sb2.append(interfaceFutureC2529i2);
                    }
                } catch (Throwable th2) {
                    C2540j2.m11507a(th2);
                    sb2.append("Exception thrown from implementation: ");
                    sb2.append(th2.getClass());
                }
                sb2.append("]");
            } else {
                try {
                    strConcat = C2439a0.m11165a(mo11578n());
                } catch (Throwable th3) {
                    C2540j2.m11507a(th3);
                    strConcat = "Exception thrown from implementation: ".concat(String.valueOf(th3.getClass()));
                }
                if (strConcat != null) {
                    sb2.append(", info=[");
                    sb2.append(strConcat);
                    sb2.append("]");
                }
            }
            if (isDone()) {
                sb2.delete(length, sb2.length());
                m11582v(sb2);
            }
        }
        sb2.append("]");
        return sb2.toString();
    }

    /* JADX INFO: renamed from: v */
    public final void m11582v(StringBuilder sb2) {
        try {
            Object objM11574u = m11574u(this);
            sb2.append("SUCCESS, result=[");
            if (objM11574u == null) {
                sb2.append("null");
            } else if (objM11574u == this) {
                sb2.append("this future");
            } else {
                sb2.append(objM11574u.getClass().getName());
                sb2.append("@");
                sb2.append(Integer.toHexString(System.identityHashCode(objM11574u)));
            }
            sb2.append("]");
        } catch (CancellationException unused) {
            sb2.append("CANCELLED");
        } catch (ExecutionException e10) {
            sb2.append("FAILURE, cause=[");
            sb2.append(e10.getCause());
            sb2.append("]");
        } catch (Exception e11) {
            sb2.append("UNKNOWN, cause=[");
            sb2.append(e11.getClass());
            sb2.append(" thrown from get()]");
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @Override // java.util.concurrent.Future
    public final Object get(long j10, TimeUnit timeUnit) {
        return m11714g(j10, timeUnit);
    }
}
