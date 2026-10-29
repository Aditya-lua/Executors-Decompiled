package com.google.android.gms.internal.play_billing;

import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.s9 */
/* JADX INFO: loaded from: classes.dex */
public class C2646s9 implements InterfaceFutureC2529i2 {

    /* JADX INFO: renamed from: d */
    public static final boolean f9377d = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));

    /* JADX INFO: renamed from: e */
    public static final Logger f9378e = Logger.getLogger(C2646s9.class.getName());

    /* JADX INFO: renamed from: f */
    public static final AbstractC2693x1 f9379f;

    /* JADX INFO: renamed from: g */
    public static final Object f9380g;

    /* JADX INFO: renamed from: a */
    public volatile Object f9381a;

    /* JADX INFO: renamed from: b */
    public volatile C2554k5 f9382b;

    /* JADX INFO: renamed from: c */
    public volatile C2624q9 f9383c;

    static {
        AbstractC2693x1 c2514g9;
        try {
            c2514g9 = new C2501f7(AtomicReferenceFieldUpdater.newUpdater(C2624q9.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(C2624q9.class, C2624q9.class, "b"), AtomicReferenceFieldUpdater.newUpdater(C2646s9.class, C2624q9.class, "c"), AtomicReferenceFieldUpdater.newUpdater(C2646s9.class, C2554k5.class, "b"), AtomicReferenceFieldUpdater.newUpdater(C2646s9.class, Object.class, "a"));
            th = null;
        } catch (Throwable th2) {
            th = th2;
            c2514g9 = new C2514g9();
        }
        Throwable th3 = th;
        f9379f = c2514g9;
        if (th3 != null) {
            f9378e.logp(Level.SEVERE, "com.android.billingclient.util.concurrent.AbstractResolvableFuture", "<clinit>", "SafeAtomicHelper is broken!", th3);
        }
        f9380g = new Object();
    }

    /* JADX INFO: renamed from: d */
    public static void m11726d(C2646s9 c2646s9) {
        C2624q9 c2624q9;
        AbstractC2693x1 abstractC2693x1;
        C2554k5 c2554k5;
        do {
            c2624q9 = c2646s9.f9383c;
            abstractC2693x1 = f9379f;
        } while (!abstractC2693x1.mo11412e(c2646s9, c2624q9, C2624q9.f9206c));
        while (c2624q9 != null) {
            Thread thread = c2624q9.f9207a;
            if (thread != null) {
                c2624q9.f9207a = null;
                LockSupport.unpark(thread);
            }
            c2624q9 = c2624q9.f9208b;
        }
        do {
            c2554k5 = c2646s9.f9382b;
        } while (!abstractC2693x1.mo11410c(c2646s9, c2554k5, C2554k5.f9066d));
        C2554k5 c2554k6 = null;
        while (c2554k5 != null) {
            C2554k5 c2554k7 = c2554k5.f9069c;
            c2554k5.f9069c = c2554k6;
            c2554k6 = c2554k5;
            c2554k5 = c2554k7;
        }
        while (c2554k6 != null) {
            Runnable runnable = c2554k6.f9067a;
            C2554k5 c2554k8 = c2554k6.f9069c;
            if (runnable instanceof RunnableC2502f8) {
                throw null;
            }
            m11727g(runnable, c2554k6.f9068b);
            c2554k6 = c2554k8;
        }
    }

    /* JADX INFO: renamed from: g */
    public static void m11727g(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e10) {
            f9378e.logp(Level.SEVERE, "com.android.billingclient.util.concurrent.AbstractResolvableFuture", "executeListener", "RuntimeException while executing runnable " + String.valueOf(runnable) + " with executor " + String.valueOf(executor), (Throwable) e10);
        }
    }

    /* JADX INFO: renamed from: i */
    public static final Object m11728i(Object obj) throws ExecutionException {
        if (obj instanceof C2617q2) {
            Throwable th2 = ((C2617q2) obj).f9204a;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th2);
            throw cancellationException;
        }
        if (obj instanceof C2575m4) {
            throw new ExecutionException(((C2575m4) obj).f9156a);
        }
        if (obj == f9380g) {
            return null;
        }
        return obj;
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceFutureC2529i2
    /* JADX INFO: renamed from: b */
    public final void mo11419b(Runnable runnable, Executor executor) {
        executor.getClass();
        C2554k5 c2554k5 = this.f9382b;
        C2554k5 c2554k6 = C2554k5.f9066d;
        if (c2554k5 != c2554k6) {
            C2554k5 c2554k7 = new C2554k5(runnable, executor);
            do {
                c2554k7.f9069c = c2554k5;
                if (f9379f.mo11410c(this, c2554k5, c2554k7)) {
                    return;
                } else {
                    c2554k5 = this.f9382b;
                }
            } while (c2554k5 != c2554k6);
        }
        m11727g(runnable, executor);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: com.google.android.gms.internal.play_billing.s9 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: c */
    public String mo11729c() {
        if (this.f9381a instanceof RunnableC2502f8) {
            return "setFuture=[null]";
        }
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z10) {
        C2617q2 c2617q2;
        Object obj = this.f9381a;
        if ((obj instanceof RunnableC2502f8) | (obj == null)) {
            if (f9377d) {
                c2617q2 = new C2617q2(z10, new CancellationException("Future.cancel() was called."));
            } else {
                c2617q2 = z10 ? C2617q2.f9202b : C2617q2.f9203c;
            }
            while (!f9379f.mo11411d(this, obj, c2617q2)) {
                obj = this.f9381a;
                if (!(obj instanceof RunnableC2502f8)) {
                }
            }
            m11726d(this);
            if (obj instanceof RunnableC2502f8) {
                throw null;
            }
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: e */
    public boolean mo11730e(Object obj) {
        if (obj == null) {
            obj = f9380g;
        }
        if (!f9379f.mo11411d(this, null, obj)) {
            return false;
        }
        m11726d(this);
        return true;
    }

    /* JADX INFO: renamed from: f */
    public final void m11731f(StringBuilder sb2) {
        V v5;
        boolean z10 = false;
        while (true) {
            try {
                try {
                    v5 = get();
                    break;
                } catch (InterruptedException unused) {
                    z10 = true;
                } catch (Throwable th2) {
                    if (z10) {
                        Thread.currentThread().interrupt();
                    }
                    throw th2;
                }
            } catch (CancellationException unused2) {
                sb2.append("CANCELLED");
                return;
            } catch (RuntimeException e10) {
                sb2.append("UNKNOWN, cause=[");
                sb2.append(e10.getClass());
                sb2.append(" thrown from get()]");
                return;
            } catch (ExecutionException e11) {
                sb2.append("FAILURE, cause=[");
                sb2.append(e11.getCause());
                sb2.append("]");
                return;
            }
        }
        if (z10) {
            Thread.currentThread().interrupt();
        }
        sb2.append("SUCCESS, result=[");
        sb2.append(v5 == this ? "this future" : String.valueOf(v5));
        sb2.append("]");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.concurrent.Future
    public final Object get() throws InterruptedException {
        Object obj;
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj2 = this.f9381a;
        if ((obj2 != null) && (!(obj2 instanceof RunnableC2502f8))) {
            return m11728i(obj2);
        }
        C2624q9 c2624q9 = this.f9383c;
        C2624q9 c2624q10 = C2624q9.f9206c;
        if (c2624q9 != c2624q10) {
            C2624q9 c2624q11 = new C2624q9();
            do {
                AbstractC2693x1 abstractC2693x1 = f9379f;
                abstractC2693x1.mo11408a(c2624q11, c2624q9);
                if (abstractC2693x1.mo11412e(this, c2624q9, c2624q11)) {
                    do {
                        LockSupport.park(this);
                        if (Thread.interrupted()) {
                            m11732h(c2624q11);
                            throw new InterruptedException();
                        }
                        obj = this.f9381a;
                    } while (!((obj != null) & (!(obj instanceof RunnableC2502f8))));
                    return m11728i(obj);
                }
                c2624q9 = this.f9383c;
            } while (c2624q9 != c2624q10);
        }
        return m11728i(this.f9381a);
    }

    /* JADX INFO: renamed from: h */
    public final void m11732h(C2624q9 c2624q9) {
        c2624q9.f9207a = null;
        while (true) {
            C2624q9 c2624q10 = this.f9383c;
            if (c2624q10 != C2624q9.f9206c) {
                C2624q9 c2624q11 = null;
                while (c2624q10 != null) {
                    C2624q9 c2624q12 = c2624q10.f9208b;
                    if (c2624q10.f9207a != null) {
                        c2624q11 = c2624q10;
                    } else if (c2624q11 != null) {
                        c2624q11.f9208b = c2624q12;
                        if (c2624q11.f9207a == null) {
                        }
                    } else if (!f9379f.mo11412e(this, c2624q10, c2624q12)) {
                    }
                    c2624q10 = c2624q12;
                }
                return;
            }
            return;
        }
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f9381a instanceof C2617q2;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        Object obj = this.f9381a;
        return (obj != null) & (!(obj instanceof RunnableC2502f8));
    }

    public final String toString() {
        String strConcat;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        sb2.append("[status=");
        if (this.f9381a instanceof C2617q2) {
            sb2.append("CANCELLED");
        } else if (isDone()) {
            m11731f(sb2);
        } else {
            try {
                strConcat = mo11729c();
            } catch (RuntimeException e10) {
                strConcat = "Exception thrown from implementation: ".concat(String.valueOf(e10.getClass()));
            }
            if (strConcat != null && !strConcat.isEmpty()) {
                sb2.append("PENDING, info=[");
                sb2.append(strConcat);
                sb2.append("]");
            } else if (isDone()) {
                m11731f(sb2);
            } else {
                sb2.append("PENDING");
            }
        }
        sb2.append("]");
        return sb2.toString();
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j10, TimeUnit timeUnit) throws InterruptedException, TimeoutException {
        boolean z10;
        long nanos = timeUnit.toNanos(j10);
        if (!Thread.interrupted()) {
            Object obj = this.f9381a;
            if ((obj != null) & (!(obj instanceof RunnableC2502f8))) {
                return m11728i(obj);
            }
            long jNanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
            if (nanos >= 1000) {
                C2624q9 c2624q9 = this.f9383c;
                C2624q9 c2624q10 = C2624q9.f9206c;
                if (c2624q9 != c2624q10) {
                    C2624q9 c2624q11 = new C2624q9();
                    z10 = true;
                    while (true) {
                        AbstractC2693x1 abstractC2693x1 = f9379f;
                        abstractC2693x1.mo11408a(c2624q11, c2624q9);
                        if (abstractC2693x1.mo11412e(this, c2624q9, c2624q11)) {
                            do {
                                LockSupport.parkNanos(this, nanos);
                                if (!Thread.interrupted()) {
                                    Object obj2 = this.f9381a;
                                    if ((obj2 != null) & (!(obj2 instanceof RunnableC2502f8))) {
                                        return m11728i(obj2);
                                    }
                                    nanos = jNanoTime - System.nanoTime();
                                } else {
                                    m11732h(c2624q11);
                                    throw new InterruptedException();
                                }
                            } while (nanos >= 1000);
                            m11732h(c2624q11);
                            break;
                        }
                        c2624q9 = this.f9383c;
                        if (c2624q9 == c2624q10) {
                        }
                    }
                }
                return m11728i(this.f9381a);
            }
            z10 = true;
            while (nanos > 0) {
                Object obj3 = this.f9381a;
                if ((obj3 != null ? z10 : false) & (!(obj3 instanceof RunnableC2502f8))) {
                    return m11728i(obj3);
                }
                if (!Thread.interrupted()) {
                    nanos = jNanoTime - System.nanoTime();
                } else {
                    throw new InterruptedException();
                }
            }
            String string = toString();
            String string2 = timeUnit.toString();
            Locale locale = Locale.ROOT;
            String lowerCase = string2.toLowerCase(locale);
            String strConcat = "Waited " + j10 + " " + timeUnit.toString().toLowerCase(locale);
            if (nanos + 1000 < 0) {
                String strConcat2 = strConcat.concat(" (plus ");
                long j11 = -nanos;
                long jConvert = timeUnit.convert(j11, TimeUnit.NANOSECONDS);
                long nanos2 = j11 - timeUnit.toNanos(jConvert);
                if (jConvert != 0 && nanos2 <= 1000) {
                    z10 = false;
                }
                if (jConvert > 0) {
                    String strConcat3 = strConcat2 + jConvert + " " + lowerCase;
                    if (z10) {
                        strConcat3 = strConcat3.concat(",");
                    }
                    strConcat2 = strConcat3.concat(" ");
                }
                if (z10) {
                    strConcat2 = strConcat2 + nanos2 + " nanoseconds ";
                }
                strConcat = strConcat2.concat("delay)");
            }
            if (isDone()) {
                throw new TimeoutException(strConcat.concat(" but future completed as timeout expired"));
            }
            throw new TimeoutException(strConcat + " for " + string);
        }
        throw new InterruptedException();
    }
}
