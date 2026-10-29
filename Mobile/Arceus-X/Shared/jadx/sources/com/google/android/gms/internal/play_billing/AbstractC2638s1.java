package com.google.android.gms.internal.play_billing;

import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.s1 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2638s1<V> extends AbstractC2595o2 implements InterfaceFutureC2529i2<V> {

    /* JADX INFO: renamed from: d */
    public static final Object f9220d = new Object();

    /* JADX INFO: renamed from: e */
    public static final C2518h2 f9221e = new C2518h2(AbstractC2572m1.class);

    /* JADX INFO: renamed from: f */
    public static final boolean f9222f;

    /* JADX INFO: renamed from: g */
    public static final AbstractC2583n1 f9223g;

    /* JADX INFO: renamed from: a */
    public volatile Object f9224a;

    /* JADX INFO: renamed from: b */
    public volatile C2550k1 f9225b;

    /* JADX INFO: renamed from: c */
    public volatile C2627r1 f9226c;

    static {
        boolean z10;
        Throwable th2;
        Throwable th3;
        AbstractC2583n1 c2605p1;
        try {
            z10 = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
        } catch (SecurityException unused) {
            z10 = false;
        }
        f9222f = z10;
        String property = System.getProperty("java.runtime.name", "");
        C2682w1 c2682w1 = null;
        if (property == null || property.contains("Android")) {
            try {
                c2605p1 = new C2616q1(c2682w1);
            } catch (Error | Exception e10) {
                try {
                    c2605p1 = new C2594o1(c2682w1);
                    th2 = null;
                    th3 = e10;
                } catch (Error | Exception e11) {
                    th2 = e11;
                    th3 = e10;
                    c2605p1 = new C2605p1(c2682w1);
                }
            }
        } else {
            try {
                c2605p1 = new C2594o1(c2682w1);
            } catch (NoClassDefFoundError unused2) {
                c2605p1 = new C2605p1(c2682w1);
            }
        }
        th2 = null;
        th3 = null;
        f9223g = c2605p1;
        if (th2 != null) {
            C2518h2 c2518h2 = f9221e;
            Logger loggerM11443a = c2518h2.m11443a();
            Level level = Level.SEVERE;
            loggerM11443a.logp(level, "com.google.common.util.concurrent.AbstractFutureState", "<clinit>", "UnsafeAtomicHelper is broken!", th3);
            c2518h2.m11443a().logp(level, "com.google.common.util.concurrent.AbstractFutureState", "<clinit>", "AtomicReferenceFieldUpdaterAtomicHelper is broken!", th2);
        }
    }

    /* JADX INFO: renamed from: k */
    public static boolean m11710k(AbstractC2638s1 abstractC2638s1, Object obj, Object obj2) {
        return f9223g.mo11608f(abstractC2638s1, obj, obj2);
    }

    /* JADX INFO: renamed from: d */
    public final void m11711d(C2627r1 c2627r1) {
        c2627r1.f9211a = null;
        while (true) {
            C2627r1 c2627r2 = this.f9226c;
            if (c2627r2 != C2627r1.f9210c) {
                C2627r1 c2627r3 = null;
                while (c2627r2 != null) {
                    C2627r1 c2627r4 = c2627r2.f9212b;
                    if (c2627r2.f9211a != null) {
                        c2627r3 = c2627r2;
                    } else if (c2627r3 != null) {
                        c2627r3.f9212b = c2627r4;
                        if (c2627r3.f9211a == null) {
                        }
                    } else if (!f9223g.mo11609g(this, c2627r2, c2627r4)) {
                    }
                    c2627r2 = c2627r4;
                }
                return;
            }
            return;
        }
    }

    /* JADX INFO: renamed from: e */
    public final C2550k1 m11712e(C2550k1 c2550k1) {
        return f9223g.mo11603a(this, c2550k1);
    }

    /* JADX INFO: renamed from: f */
    public final Object m11713f() throws InterruptedException {
        Object obj;
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj2 = this.f9224a;
        if ((obj2 != null) && AbstractC2572m1.m11572q(obj2)) {
            return AbstractC2572m1.m11570m(obj2);
        }
        C2627r1 c2627r1 = this.f9226c;
        if (c2627r1 != C2627r1.f9210c) {
            C2627r1 c2627r2 = new C2627r1();
            do {
                AbstractC2583n1 abstractC2583n1 = f9223g;
                abstractC2583n1.mo11605c(c2627r2, c2627r1);
                if (abstractC2583n1.mo11609g(this, c2627r1, c2627r2)) {
                    do {
                        LockSupport.park(this);
                        if (Thread.interrupted()) {
                            m11711d(c2627r2);
                            throw new InterruptedException();
                        }
                        obj = this.f9224a;
                    } while (!((obj != null) & AbstractC2572m1.m11572q(obj)));
                    return AbstractC2572m1.m11570m(obj);
                }
                c2627r1 = this.f9226c;
            } while (c2627r1 != C2627r1.f9210c);
        }
        Object obj3 = this.f9224a;
        Objects.requireNonNull(obj3);
        return AbstractC2572m1.m11570m(obj3);
    }

    /* JADX INFO: renamed from: g */
    public final Object m11714g(long j10, TimeUnit timeUnit) throws InterruptedException, TimeoutException {
        long nanos = timeUnit.toNanos(j10);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.f9224a;
        boolean z10 = true;
        if ((obj != null) && AbstractC2572m1.m11572q(obj)) {
            return AbstractC2572m1.m11570m(obj);
        }
        long jNanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            C2627r1 c2627r1 = this.f9226c;
            if (c2627r1 != C2627r1.f9210c) {
                C2627r1 c2627r2 = new C2627r1();
                while (true) {
                    AbstractC2583n1 abstractC2583n1 = f9223g;
                    abstractC2583n1.mo11605c(c2627r2, c2627r1);
                    if (abstractC2583n1.mo11609g(this, c2627r1, c2627r2)) {
                        do {
                            LockSupport.parkNanos(this, Math.min(nanos, 2147483647999999999L));
                            if (Thread.interrupted()) {
                                m11711d(c2627r2);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.f9224a;
                            if ((obj2 != null) && AbstractC2572m1.m11572q(obj2)) {
                                return AbstractC2572m1.m11570m(obj2);
                            }
                            nanos = jNanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        m11711d(c2627r2);
                        break;
                    }
                    c2627r1 = this.f9226c;
                    if (c2627r1 == C2627r1.f9210c) {
                    }
                }
            }
            Object obj3 = this.f9224a;
            Objects.requireNonNull(obj3);
            return AbstractC2572m1.m11570m(obj3);
        }
        while (nanos > 0) {
            Object obj4 = this.f9224a;
            if ((obj4 != null) && AbstractC2572m1.m11572q(obj4)) {
                return AbstractC2572m1.m11570m(obj4);
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

    /* JADX INFO: renamed from: i */
    public final void m11715i() {
        for (C2627r1 c2627r1Mo11604b = f9223g.mo11604b(this, C2627r1.f9210c); c2627r1Mo11604b != null; c2627r1Mo11604b = c2627r1Mo11604b.f9212b) {
            Thread thread = c2627r1Mo11604b.f9211a;
            if (thread != null) {
                c2627r1Mo11604b.f9211a = null;
                LockSupport.unpark(thread);
            }
        }
    }

    /* JADX INFO: renamed from: j */
    public final boolean m11716j(C2550k1 c2550k1, C2550k1 c2550k2) {
        return f9223g.mo11607e(this, c2550k1, c2550k2);
    }
}
