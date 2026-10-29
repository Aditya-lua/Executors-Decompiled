package com.google.android.gms.internal.play_billing;

import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes.dex */
public abstract class s1<V> extends o2 implements i2<V> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Object f7227d = new Object();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final h2 f7228e = new h2(m1.class);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final boolean f7229f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final n1 f7230g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile Object f7231a;
    public volatile k1 b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile r1 f7232c;

    static {
        boolean z10;
        Throwable th2;
        Throwable th3;
        n1 p1Var;
        try {
            z10 = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
        } catch (SecurityException unused) {
            z10 = false;
        }
        f7229f = z10;
        String property = System.getProperty("java.runtime.name", "");
        w1 w1Var = null;
        if (property == null || property.contains("Android")) {
            try {
                p1Var = new q1(w1Var);
            } catch (Error | Exception e10) {
                try {
                    p1Var = new o1(w1Var);
                    th2 = null;
                    th3 = e10;
                } catch (Error | Exception e11) {
                    th2 = e11;
                    th3 = e10;
                    p1Var = new p1(w1Var);
                }
            }
        } else {
            try {
                p1Var = new o1(w1Var);
            } catch (NoClassDefFoundError unused2) {
                p1Var = new p1(w1Var);
            }
        }
        th2 = null;
        th3 = null;
        f7230g = p1Var;
        if (th2 != null) {
            h2 h2Var = f7228e;
            Logger loggerA = h2Var.a();
            Level level = Level.SEVERE;
            loggerA.logp(level, "com.google.common.util.concurrent.AbstractFutureState", "<clinit>", "UnsafeAtomicHelper is broken!", th3);
            h2Var.a().logp(level, "com.google.common.util.concurrent.AbstractFutureState", "<clinit>", "AtomicReferenceFieldUpdaterAtomicHelper is broken!", th2);
        }
    }

    public static boolean k(s1 s1Var, Object obj, Object obj2) {
        return f7230g.f(s1Var, obj, obj2);
    }

    public final void d(r1 r1Var) {
        r1Var.f7222a = null;
        while (true) {
            r1 r1Var2 = this.f7232c;
            if (r1Var2 != r1.f7221c) {
                r1 r1Var3 = null;
                while (r1Var2 != null) {
                    r1 r1Var4 = r1Var2.b;
                    if (r1Var2.f7222a != null) {
                        r1Var3 = r1Var2;
                    } else if (r1Var3 != null) {
                        r1Var3.b = r1Var4;
                        if (r1Var3.f7222a == null) {
                        }
                    } else if (!f7230g.g(this, r1Var2, r1Var4)) {
                    }
                    r1Var2 = r1Var4;
                }
                return;
            }
            return;
        }
    }

    public final k1 e(k1 k1Var) {
        return f7230g.a(this, k1Var);
    }

    public final Object f() throws InterruptedException {
        Object obj;
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj2 = this.f7231a;
        if ((obj2 != null) && m1.q(obj2)) {
            return m1.m(obj2);
        }
        r1 r1Var = this.f7232c;
        if (r1Var != r1.f7221c) {
            r1 r1Var2 = new r1();
            do {
                n1 n1Var = f7230g;
                n1Var.c(r1Var2, r1Var);
                if (n1Var.g(this, r1Var, r1Var2)) {
                    do {
                        LockSupport.park(this);
                        if (Thread.interrupted()) {
                            d(r1Var2);
                            throw new InterruptedException();
                        }
                        obj = this.f7231a;
                    } while (!((obj != null) & m1.q(obj)));
                    return m1.m(obj);
                }
                r1Var = this.f7232c;
            } while (r1Var != r1.f7221c);
        }
        Object obj3 = this.f7231a;
        Objects.requireNonNull(obj3);
        return m1.m(obj3);
    }

    public final Object g(long j10, TimeUnit timeUnit) throws InterruptedException, TimeoutException {
        long nanos = timeUnit.toNanos(j10);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.f7231a;
        boolean z10 = true;
        if ((obj != null) && m1.q(obj)) {
            return m1.m(obj);
        }
        long jNanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            r1 r1Var = this.f7232c;
            if (r1Var != r1.f7221c) {
                r1 r1Var2 = new r1();
                while (true) {
                    n1 n1Var = f7230g;
                    n1Var.c(r1Var2, r1Var);
                    if (n1Var.g(this, r1Var, r1Var2)) {
                        do {
                            LockSupport.parkNanos(this, Math.min(nanos, 2147483647999999999L));
                            if (Thread.interrupted()) {
                                d(r1Var2);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.f7231a;
                            if ((obj2 != null) && m1.q(obj2)) {
                                return m1.m(obj2);
                            }
                            nanos = jNanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        d(r1Var2);
                        break;
                    }
                    r1Var = this.f7232c;
                    if (r1Var == r1.f7221c) {
                    }
                }
            }
            Object obj3 = this.f7231a;
            Objects.requireNonNull(obj3);
            return m1.m(obj3);
        }
        while (nanos > 0) {
            Object obj4 = this.f7231a;
            if ((obj4 != null) && m1.q(obj4)) {
                return m1.m(obj4);
            }
            if (Thread.interrupted()) {
                throw new InterruptedException();
            }
            nanos = jNanoTime - System.nanoTime();
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

    public final void i() {
        for (r1 r1VarB = f7230g.b(this, r1.f7221c); r1VarB != null; r1VarB = r1VarB.b) {
            Thread thread = r1VarB.f7222a;
            if (thread != null) {
                r1VarB.f7222a = null;
                LockSupport.unpark(thread);
            }
        }
    }

    public final boolean j(k1 k1Var, k1 k1Var2) {
        return f7230g.e(this, k1Var, k1Var2);
    }
}
