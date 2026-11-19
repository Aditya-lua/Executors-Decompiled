package y1;

import androidx.annotation.NonNull;
import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;
import pe.x;

/* JADX INFO: loaded from: classes.dex */
public abstract class a<V> implements x<V> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final boolean f37165d = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Logger f37166e = Logger.getLogger(a.class.getName());

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final b f37167f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Object f37168g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile Object f37169a;
    public volatile e b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile i f37170c;

    public static abstract class b {
        public b() {
        }

        public abstract boolean a(a<?> aVar, e eVar, e eVar2);

        public abstract boolean b(a<?> aVar, Object obj, Object obj2);

        public abstract boolean c(a<?> aVar, i iVar, i iVar2);

        public abstract void d(i iVar, i iVar2);

        public abstract void e(i iVar, Thread thread);
    }

    public static final class c {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final c f37171c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final c f37172d;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f37173a;
        public final Throwable b;

        static {
            if (a.f37165d) {
                f37172d = null;
                f37171c = null;
            } else {
                f37172d = new c(false, null);
                f37171c = new c(true, null);
            }
        }

        public c(boolean z10, Throwable th2) {
            this.f37173a = z10;
            this.b = th2;
        }
    }

    public static final class d {
        public static final d b = new d(new C0760a("Failure occurred while trying to finish a future."));

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Throwable f37174a;

        /* JADX INFO: renamed from: y1.a$d$a, reason: collision with other inner class name */
        public class C0760a extends Throwable {
            public C0760a(String str) {
                super(str);
            }

            @Override // java.lang.Throwable
            public synchronized Throwable fillInStackTrace() {
                return this;
            }
        }

        public d(Throwable th2) {
            this.f37174a = (Throwable) a.h(th2);
        }
    }

    public static final class e {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final e f37175d = new e(null, null);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Runnable f37176a;
        public final Executor b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public e f37177c;

        public e(Runnable runnable, Executor executor) {
            this.f37176a = runnable;
            this.b = executor;
        }
    }

    public static final class f extends b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final AtomicReferenceFieldUpdater<i, Thread> f37178a;
        public final AtomicReferenceFieldUpdater<i, i> b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final AtomicReferenceFieldUpdater<a, i> f37179c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final AtomicReferenceFieldUpdater<a, e> f37180d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final AtomicReferenceFieldUpdater<a, Object> f37181e;

        public f(AtomicReferenceFieldUpdater<i, Thread> atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater<i, i> atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater<a, i> atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater<a, e> atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater<a, Object> atomicReferenceFieldUpdater5) {
            super();
            this.f37178a = atomicReferenceFieldUpdater;
            this.b = atomicReferenceFieldUpdater2;
            this.f37179c = atomicReferenceFieldUpdater3;
            this.f37180d = atomicReferenceFieldUpdater4;
            this.f37181e = atomicReferenceFieldUpdater5;
        }

        @Override // y1.a.b
        public boolean a(a<?> aVar, e eVar, e eVar2) {
            return y1.b.a(this.f37180d, aVar, eVar, eVar2);
        }

        @Override // y1.a.b
        public boolean b(a<?> aVar, Object obj, Object obj2) {
            return y1.b.a(this.f37181e, aVar, obj, obj2);
        }

        @Override // y1.a.b
        public boolean c(a<?> aVar, i iVar, i iVar2) {
            return y1.b.a(this.f37179c, aVar, iVar, iVar2);
        }

        @Override // y1.a.b
        public void d(i iVar, i iVar2) {
            this.b.lazySet(iVar, iVar2);
        }

        @Override // y1.a.b
        public void e(i iVar, Thread thread) {
            this.f37178a.lazySet(iVar, thread);
        }
    }

    public static final class g<V> implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final a<V> f37182a;
        public final x<? extends V> b;
    }

    public static final class h extends b {
        public h() {
            super();
        }

        @Override // y1.a.b
        public boolean a(a<?> aVar, e eVar, e eVar2) {
            synchronized (aVar) {
                try {
                    if (aVar.b != eVar) {
                        return false;
                    }
                    aVar.b = eVar2;
                    return true;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // y1.a.b
        public boolean b(a<?> aVar, Object obj, Object obj2) {
            synchronized (aVar) {
                try {
                    if (aVar.f37169a != obj) {
                        return false;
                    }
                    aVar.f37169a = obj2;
                    return true;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // y1.a.b
        public boolean c(a<?> aVar, i iVar, i iVar2) {
            synchronized (aVar) {
                try {
                    if (aVar.f37170c != iVar) {
                        return false;
                    }
                    aVar.f37170c = iVar2;
                    return true;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // y1.a.b
        public void d(i iVar, i iVar2) {
            iVar.b = iVar2;
        }

        @Override // y1.a.b
        public void e(i iVar, Thread thread) {
            iVar.f37184a = thread;
        }
    }

    public static final class i {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final i f37183c = new i(false);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public volatile Thread f37184a;
        public volatile i b;

        public i(boolean z10) {
        }

        public void a(i iVar) {
            a.f37167f.d(this, iVar);
        }

        public void b() {
            Thread thread = this.f37184a;
            if (thread != null) {
                this.f37184a = null;
                LockSupport.unpark(thread);
            }
        }

        public i() {
            a.f37167f.e(this, Thread.currentThread());
        }
    }

    static {
        b hVar;
        try {
            hVar = new f(AtomicReferenceFieldUpdater.newUpdater(i.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(i.class, i.class, "b"), AtomicReferenceFieldUpdater.newUpdater(a.class, i.class, "c"), AtomicReferenceFieldUpdater.newUpdater(a.class, e.class, "b"), AtomicReferenceFieldUpdater.newUpdater(a.class, Object.class, "a"));
            th = null;
        } catch (Throwable th2) {
            th = th2;
            hVar = new h();
        }
        f37167f = hVar;
        if (th != null) {
            f37166e.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        f37168g = new Object();
    }

    private void c(StringBuilder sb2) {
        try {
            Object objR = r(this);
            sb2.append("SUCCESS, result=[");
            sb2.append(z(objR));
            sb2.append("]");
        } catch (CancellationException unused) {
            sb2.append("CANCELLED");
        } catch (RuntimeException e10) {
            sb2.append("UNKNOWN, cause=[");
            sb2.append(e10.getClass());
            sb2.append(" thrown from get()]");
        } catch (ExecutionException e11) {
            sb2.append("FAILURE, cause=[");
            sb2.append(e11.getCause());
            sb2.append("]");
        }
    }

    private static CancellationException e(String str, Throwable th2) {
        CancellationException cancellationException = new CancellationException(str);
        cancellationException.initCause(th2);
        return cancellationException;
    }

    @NonNull
    public static <T> T h(T t8) {
        t8.getClass();
        return t8;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static void m(a<?> aVar) {
        e eVar = null;
        while (true) {
            aVar.v();
            aVar.d();
            e eVarK = aVar.k(eVar);
            while (eVarK != null) {
                eVar = eVarK.f37177c;
                Runnable runnable = eVarK.f37176a;
                if (runnable instanceof g) {
                    g gVar = (g) runnable;
                    aVar = gVar.f37182a;
                    if (aVar.f37169a == gVar) {
                        if (f37167f.b(aVar, gVar, q(gVar.b))) {
                        }
                    } else {
                        continue;
                    }
                } else {
                    o(runnable, eVarK.b);
                }
                eVarK = eVar;
            }
            return;
        }
    }

    private static void o(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e10) {
            f37166e.log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e10);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private V p(Object obj) throws ExecutionException {
        if (obj instanceof c) {
            throw e("Task was cancelled.", ((c) obj).b);
        }
        if (obj instanceof d) {
            throw new ExecutionException(((d) obj).f37174a);
        }
        if (obj == f37168g) {
            return null;
        }
        return obj;
    }

    public static Object q(x<?> xVar) {
        if (xVar instanceof a) {
            Object obj = ((a) xVar).f37169a;
            if (!(obj instanceof c)) {
                return obj;
            }
            c cVar = (c) obj;
            if (cVar.f37173a) {
                return cVar.b != null ? new c(false, cVar.b) : c.f37172d;
            }
            return obj;
        }
        boolean zIsCancelled = xVar.isCancelled();
        if ((!f37165d) && zIsCancelled) {
            return c.f37172d;
        }
        try {
            Object objR = r(xVar);
            return objR == null ? f37168g : objR;
        } catch (CancellationException e10) {
            if (zIsCancelled) {
                return new c(false, e10);
            }
            return new d(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: " + xVar, e10));
        } catch (ExecutionException e11) {
            return new d(e11.getCause());
        } catch (Throwable th2) {
            return new d(th2);
        }
    }

    public static <V> V r(Future<V> future) {
        V v8;
        boolean z10 = false;
        while (true) {
            try {
                v8 = future.get();
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
        return v8;
    }

    private void v() {
        i iVar;
        do {
            iVar = this.f37170c;
        } while (!f37167f.c(this, iVar, i.f37183c));
        while (iVar != null) {
            iVar.b();
            iVar = iVar.b;
        }
    }

    public final boolean A() {
        Object obj = this.f37169a;
        return (obj instanceof c) && ((c) obj).f37173a;
    }

    @Override // pe.x
    public final void a(Runnable runnable, Executor executor) {
        h(runnable);
        h(executor);
        e eVar = this.b;
        if (eVar != e.f37175d) {
            e eVar2 = new e(runnable, executor);
            do {
                eVar2.f37177c = eVar;
                if (f37167f.a(this, eVar, eVar2)) {
                    return;
                } else {
                    eVar = this.b;
                }
            } while (eVar != e.f37175d);
        }
        o(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z10) {
        c cVar;
        Object obj = this.f37169a;
        if (!(obj == null) && !(obj instanceof g)) {
            return false;
        }
        if (f37165d) {
            cVar = new c(z10, new CancellationException("Future.cancel() was called."));
        } else {
            cVar = z10 ? c.f37171c : c.f37172d;
        }
        a<V> aVar = this;
        boolean z11 = false;
        while (true) {
            if (f37167f.b(aVar, obj, cVar)) {
                if (z10) {
                    aVar.s();
                }
                m(aVar);
                if (obj instanceof g) {
                    x<? extends V> xVar = ((g) obj).b;
                    if (xVar instanceof a) {
                        aVar = (a) xVar;
                        obj = aVar.f37169a;
                        if ((obj == null) | (obj instanceof g)) {
                            z11 = true;
                        }
                    } else {
                        xVar.cancel(z10);
                    }
                }
                return true;
            }
            obj = aVar.f37169a;
            if (!(obj instanceof g)) {
                return z11;
            }
        }
    }

    public void d() {
    }

    @Override // java.util.concurrent.Future
    public final V get(long j10, TimeUnit timeUnit) throws InterruptedException, TimeoutException {
        long nanos = timeUnit.toNanos(j10);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.f37169a;
        if ((obj != null) && (!(obj instanceof g))) {
            return p(obj);
        }
        long jNanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            i iVar = this.f37170c;
            if (iVar != i.f37183c) {
                i iVar2 = new i();
                while (true) {
                    iVar2.a(iVar);
                    if (f37167f.c(this, iVar, iVar2)) {
                        do {
                            LockSupport.parkNanos(this, nanos);
                            if (Thread.interrupted()) {
                                w(iVar2);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.f37169a;
                            if ((obj2 != null) && (!(obj2 instanceof g))) {
                                return p(obj2);
                            }
                            nanos = jNanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        w(iVar2);
                        break;
                    }
                    iVar = this.f37170c;
                    if (iVar == i.f37183c) {
                    }
                }
            }
            return p(this.f37169a);
        }
        while (nanos > 0) {
            Object obj3 = this.f37169a;
            if ((obj3 != null) && (!(obj3 instanceof g))) {
                return p(obj3);
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
        String str = "Waited " + j10 + " " + timeUnit.toString().toLowerCase(locale);
        if (nanos + 1000 < 0) {
            String str2 = str + " (plus ";
            long j11 = -nanos;
            long jConvert = timeUnit.convert(j11, TimeUnit.NANOSECONDS);
            long nanos2 = j11 - timeUnit.toNanos(jConvert);
            boolean z10 = jConvert == 0 || nanos2 > 1000;
            if (jConvert > 0) {
                String str3 = str2 + jConvert + " " + lowerCase;
                if (z10) {
                    str3 = str3 + ",";
                }
                str2 = str3 + " ";
            }
            if (z10) {
                str2 = str2 + nanos2 + " nanoseconds ";
            }
            str = str2 + "delay)";
        }
        if (isDone()) {
            throw new TimeoutException(str + " but future completed as timeout expired");
        }
        throw new TimeoutException(str + " for " + string);
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f37169a instanceof c;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        Object obj = this.f37169a;
        return (!(obj instanceof g)) & (obj != null);
    }

    public final e k(e eVar) {
        e eVar2;
        do {
            eVar2 = this.b;
        } while (!f37167f.a(this, eVar2, e.f37175d));
        e eVar3 = eVar;
        e eVar4 = eVar2;
        while (eVar4 != null) {
            e eVar5 = eVar4.f37177c;
            eVar4.f37177c = eVar3;
            eVar3 = eVar4;
            eVar4 = eVar5;
        }
        return eVar3;
    }

    public void s() {
    }

    public String toString() {
        String strU;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        sb2.append("[status=");
        if (isCancelled()) {
            sb2.append("CANCELLED");
        } else if (isDone()) {
            c(sb2);
        } else {
            try {
                strU = u();
            } catch (RuntimeException e10) {
                strU = "Exception thrown from implementation: " + e10.getClass();
            }
            if (strU != null && !strU.isEmpty()) {
                sb2.append("PENDING, info=[");
                sb2.append(strU);
                sb2.append("]");
            } else if (isDone()) {
                c(sb2);
            } else {
                sb2.append("PENDING");
            }
        }
        sb2.append("]");
        return sb2.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public String u() {
        Object obj = this.f37169a;
        if (obj instanceof g) {
            return "setFuture=[" + z(((g) obj).b) + "]";
        }
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
    }

    public final void w(i iVar) {
        iVar.f37184a = null;
        while (true) {
            i iVar2 = this.f37170c;
            if (iVar2 == i.f37183c) {
                return;
            }
            i iVar3 = null;
            while (iVar2 != null) {
                i iVar4 = iVar2.b;
                if (iVar2.f37184a != null) {
                    iVar3 = iVar2;
                } else if (iVar3 != null) {
                    iVar3.b = iVar4;
                    if (iVar3.f37184a == null) {
                    }
                } else if (!f37167f.c(this, iVar2, iVar4)) {
                }
                iVar2 = iVar4;
            }
            return;
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public boolean x(V v8) {
        if (v8 == null) {
            v8 = (V) f37168g;
        }
        if (!f37167f.b(this, null, v8)) {
            return false;
        }
        m(this);
        return true;
    }

    public boolean y(Throwable th2) {
        if (!f37167f.b(this, null, new d((Throwable) h(th2)))) {
            return false;
        }
        m(this);
        return true;
    }

    public final String z(Object obj) {
        return obj == this ? "this future" : String.valueOf(obj);
    }

    @Override // java.util.concurrent.Future
    public final V get() throws InterruptedException {
        Object obj;
        if (!Thread.interrupted()) {
            Object obj2 = this.f37169a;
            if ((obj2 != null) & (!(obj2 instanceof g))) {
                return p(obj2);
            }
            i iVar = this.f37170c;
            if (iVar != i.f37183c) {
                i iVar2 = new i();
                do {
                    iVar2.a(iVar);
                    if (f37167f.c(this, iVar, iVar2)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.f37169a;
                            } else {
                                w(iVar2);
                                throw new InterruptedException();
                            }
                        } while (!((obj != null) & (!(obj instanceof g))));
                        return p(obj);
                    }
                    iVar = this.f37170c;
                } while (iVar != i.f37183c);
            }
            return p(this.f37169a);
        }
        throw new InterruptedException();
    }
}
