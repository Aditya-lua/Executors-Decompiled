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

/* JADX INFO: loaded from: classes.dex */
public class s9 implements i2 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final boolean f7385d = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Logger f7386e = Logger.getLogger(s9.class.getName());

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final x1 f7387f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Object f7388g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile Object f7389a;
    public volatile k5 b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile q9 f7390c;

    static {
        x1 g9Var;
        try {
            g9Var = new f7(AtomicReferenceFieldUpdater.newUpdater(q9.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(q9.class, q9.class, "b"), AtomicReferenceFieldUpdater.newUpdater(s9.class, q9.class, "c"), AtomicReferenceFieldUpdater.newUpdater(s9.class, k5.class, "b"), AtomicReferenceFieldUpdater.newUpdater(s9.class, Object.class, "a"));
            th = null;
        } catch (Throwable th2) {
            th = th2;
            g9Var = new g9();
        }
        Throwable th3 = th;
        f7387f = g9Var;
        if (th3 != null) {
            f7386e.logp(Level.SEVERE, "com.android.billingclient.util.concurrent.AbstractResolvableFuture", "<clinit>", "SafeAtomicHelper is broken!", th3);
        }
        f7388g = new Object();
    }

    public static void d(s9 s9Var) {
        q9 q9Var;
        x1 x1Var;
        k5 k5Var;
        do {
            q9Var = s9Var.f7390c;
            x1Var = f7387f;
        } while (!x1Var.e(s9Var, q9Var, q9.f7292c));
        while (q9Var != null) {
            Thread thread = q9Var.f7293a;
            if (thread != null) {
                q9Var.f7293a = null;
                LockSupport.unpark(thread);
            }
            q9Var = q9Var.b;
        }
        do {
            k5Var = s9Var.b;
        } while (!x1Var.c(s9Var, k5Var, k5.f7195d));
        k5 k5Var2 = null;
        while (k5Var != null) {
            k5 k5Var3 = k5Var.f7197c;
            k5Var.f7197c = k5Var2;
            k5Var2 = k5Var;
            k5Var = k5Var3;
        }
        while (k5Var2 != null) {
            Runnable runnable = k5Var2.f7196a;
            k5 k5Var4 = k5Var2.f7197c;
            if (runnable instanceof f8) {
                throw null;
            }
            g(runnable, k5Var2.b);
            k5Var2 = k5Var4;
        }
    }

    public static void g(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e10) {
            f7386e.logp(Level.SEVERE, "com.android.billingclient.util.concurrent.AbstractResolvableFuture", "executeListener", "RuntimeException while executing runnable " + String.valueOf(runnable) + " with executor " + String.valueOf(executor), (Throwable) e10);
        }
    }

    public static final Object i(Object obj) throws ExecutionException {
        if (obj instanceof q2) {
            Throwable th2 = ((q2) obj).f7290a;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th2);
            throw cancellationException;
        }
        if (obj instanceof m4) {
            throw new ExecutionException(((m4) obj).f7254a);
        }
        if (obj == f7388g) {
            return null;
        }
        return obj;
    }

    @Override // com.google.android.gms.internal.play_billing.i2
    public final void b(Runnable runnable, Executor executor) {
        executor.getClass();
        k5 k5Var = this.b;
        k5 k5Var2 = k5.f7195d;
        if (k5Var != k5Var2) {
            k5 k5Var3 = new k5(runnable, executor);
            do {
                k5Var3.f7197c = k5Var;
                if (f7387f.c(this, k5Var, k5Var3)) {
                    return;
                } else {
                    k5Var = this.b;
                }
            } while (k5Var != k5Var2);
        }
        g(runnable, executor);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public String c() {
        if (this.f7389a instanceof f8) {
            return "setFuture=[null]";
        }
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z10) {
        q2 q2Var;
        Object obj = this.f7389a;
        if ((obj instanceof f8) | (obj == null)) {
            if (f7385d) {
                q2Var = new q2(z10, new CancellationException("Future.cancel() was called."));
            } else {
                q2Var = z10 ? q2.b : q2.f7289c;
            }
            while (!f7387f.d(this, obj, q2Var)) {
                obj = this.f7389a;
                if (!(obj instanceof f8)) {
                }
            }
            d(this);
            if (obj instanceof f8) {
                throw null;
            }
            return true;
        }
        return false;
    }

    public boolean e(Object obj) {
        if (obj == null) {
            obj = f7388g;
        }
        if (!f7387f.d(this, null, obj)) {
            return false;
        }
        d(this);
        return true;
    }

    public final void f(StringBuilder sb2) {
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

    @Override // java.util.concurrent.Future
    public final Object get() throws InterruptedException {
        Object obj;
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj2 = this.f7389a;
        if ((obj2 != null) && (!(obj2 instanceof f8))) {
            return i(obj2);
        }
        q9 q9Var = this.f7390c;
        q9 q9Var2 = q9.f7292c;
        if (q9Var != q9Var2) {
            q9 q9Var3 = new q9();
            do {
                x1 x1Var = f7387f;
                x1Var.a(q9Var3, q9Var);
                if (x1Var.e(this, q9Var, q9Var3)) {
                    do {
                        LockSupport.park(this);
                        if (Thread.interrupted()) {
                            h(q9Var3);
                            throw new InterruptedException();
                        }
                        obj = this.f7389a;
                    } while (!((obj != null) & (!(obj instanceof f8))));
                    return i(obj);
                }
                q9Var = this.f7390c;
            } while (q9Var != q9Var2);
        }
        return i(this.f7389a);
    }

    public final void h(q9 q9Var) {
        q9Var.f7293a = null;
        while (true) {
            q9 q9Var2 = this.f7390c;
            if (q9Var2 != q9.f7292c) {
                q9 q9Var3 = null;
                while (q9Var2 != null) {
                    q9 q9Var4 = q9Var2.b;
                    if (q9Var2.f7293a != null) {
                        q9Var3 = q9Var2;
                    } else if (q9Var3 != null) {
                        q9Var3.b = q9Var4;
                        if (q9Var3.f7293a == null) {
                        }
                    } else if (!f7387f.e(this, q9Var2, q9Var4)) {
                    }
                    q9Var2 = q9Var4;
                }
                return;
            }
            return;
        }
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f7389a instanceof q2;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        Object obj = this.f7389a;
        return (obj != null) & (!(obj instanceof f8));
    }

    public final String toString() {
        String strConcat;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        sb2.append("[status=");
        if (this.f7389a instanceof q2) {
            sb2.append("CANCELLED");
        } else if (isDone()) {
            f(sb2);
        } else {
            try {
                strConcat = c();
            } catch (RuntimeException e10) {
                strConcat = "Exception thrown from implementation: ".concat(String.valueOf(e10.getClass()));
            }
            if (strConcat != null && !strConcat.isEmpty()) {
                sb2.append("PENDING, info=[");
                sb2.append(strConcat);
                sb2.append("]");
            } else if (isDone()) {
                f(sb2);
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
            Object obj = this.f7389a;
            if ((obj != null) & (!(obj instanceof f8))) {
                return i(obj);
            }
            long jNanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
            if (nanos >= 1000) {
                q9 q9Var = this.f7390c;
                q9 q9Var2 = q9.f7292c;
                if (q9Var != q9Var2) {
                    q9 q9Var3 = new q9();
                    z10 = true;
                    while (true) {
                        x1 x1Var = f7387f;
                        x1Var.a(q9Var3, q9Var);
                        if (x1Var.e(this, q9Var, q9Var3)) {
                            do {
                                LockSupport.parkNanos(this, nanos);
                                if (!Thread.interrupted()) {
                                    Object obj2 = this.f7389a;
                                    if ((obj2 != null) & (!(obj2 instanceof f8))) {
                                        return i(obj2);
                                    }
                                    nanos = jNanoTime - System.nanoTime();
                                } else {
                                    h(q9Var3);
                                    throw new InterruptedException();
                                }
                            } while (nanos >= 1000);
                            h(q9Var3);
                            break;
                        }
                        q9Var = this.f7390c;
                        if (q9Var == q9Var2) {
                        }
                    }
                }
                return i(this.f7389a);
            }
            z10 = true;
            while (nanos > 0) {
                Object obj3 = this.f7389a;
                if ((obj3 != null ? z10 : false) & (!(obj3 instanceof f8))) {
                    return i(obj3);
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
