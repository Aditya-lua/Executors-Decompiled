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
import ne.x;

/* JADX INFO: loaded from: classes.dex */
public abstract class a<V> implements x<V> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final boolean f36326d = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Logger f36327e = Logger.getLogger(a.class.getName());

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final b f36328f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Object f36329g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile Object f36330a;
    public volatile e b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile i f36331c;

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
        public static final c f36332c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final c f36333d;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f36334a;
        public final Throwable b;

        static {
            if (a.f36326d) {
                f36333d = null;
                f36332c = null;
            } else {
                f36333d = new c(false, null);
                f36332c = new c(true, null);
            }
        }

        public c(boolean z10, Throwable th2) {
            this.f36334a = z10;
            this.b = th2;
        }
    }

    public static final class d {
        public static final d b = new d(new C0664a("Failure occurred while trying to finish a future."));

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Throwable f36335a;

        /* JADX INFO: renamed from: y1.a$d$a, reason: collision with other inner class name */
        public class C0664a extends Throwable {
            public C0664a(String str) {
                super(str);
            }

            @Override // java.lang.Throwable
            public synchronized Throwable fillInStackTrace() {
                return this;
            }
        }

        public d(Throwable th2) {
            this.f36335a = (Throwable) a.h(th2);
        }
    }

    public static final class e {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final e f36336d = new e(null, null);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Runnable f36337a;
        public final Executor b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public e f36338c;

        public e(Runnable runnable, Executor executor) {
            this.f36337a = runnable;
            this.b = executor;
        }
    }

    public static final class f extends b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final AtomicReferenceFieldUpdater<i, Thread> f36339a;
        public final AtomicReferenceFieldUpdater<i, i> b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final AtomicReferenceFieldUpdater<a, i> f36340c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final AtomicReferenceFieldUpdater<a, e> f36341d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final AtomicReferenceFieldUpdater<a, Object> f36342e;

        public f(AtomicReferenceFieldUpdater<i, Thread> atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater<i, i> atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater<a, i> atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater<a, e> atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater<a, Object> atomicReferenceFieldUpdater5) {
            super();
            this.f36339a = atomicReferenceFieldUpdater;
            this.b = atomicReferenceFieldUpdater2;
            this.f36340c = atomicReferenceFieldUpdater3;
            this.f36341d = atomicReferenceFieldUpdater4;
            this.f36342e = atomicReferenceFieldUpdater5;
        }

        @Override // y1.a.b
        public boolean a(a<?> aVar, e eVar, e eVar2) {
            return y1.b.a(this.f36341d, aVar, eVar, eVar2);
        }

        @Override // y1.a.b
        public boolean b(a<?> aVar, Object obj, Object obj2) {
            return y1.b.a(this.f36342e, aVar, obj, obj2);
        }

        @Override // y1.a.b
        public boolean c(a<?> aVar, i iVar, i iVar2) {
            return y1.b.a(this.f36340c, aVar, iVar, iVar2);
        }

        @Override // y1.a.b
        public void d(i iVar, i iVar2) {
            this.b.lazySet(iVar, iVar2);
        }

        @Override // y1.a.b
        public void e(i iVar, Thread thread) {
            this.f36339a.lazySet(iVar, thread);
        }
    }

    public static final class g<V> implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final a<V> f36343a;
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
                    if (aVar.f36330a != obj) {
                        return false;
                    }
                    aVar.f36330a = obj2;
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
                    if (aVar.f36331c != iVar) {
                        return false;
                    }
                    aVar.f36331c = iVar2;
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
            iVar.f36345a = thread;
        }
    }

    public static final class i {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final i f36344c = new i(false);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public volatile Thread f36345a;
        public volatile i b;

        public i(boolean z10) {
        }

        public void a(i iVar) {
            a.f36328f.d(this, iVar);
        }

        public void b() {
            Thread thread = this.f36345a;
            if (thread != null) {
                this.f36345a = null;
                LockSupport.unpark(thread);
            }
        }

        public i() {
            a.f36328f.e(this, Thread.currentThread());
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
        f36328f = hVar;
        if (th != null) {
            f36327e.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        f36329g = new Object();
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
    public static void l(a<?> aVar) {
        e eVar = null;
        while (true) {
            aVar.v();
            aVar.d();
            e eVarJ = aVar.j(eVar);
            while (eVarJ != null) {
                eVar = eVarJ.f36338c;
                Runnable runnable = eVarJ.f36337a;
                if (runnable instanceof g) {
                    g gVar = (g) runnable;
                    aVar = gVar.f36343a;
                    if (aVar.f36330a == gVar) {
                        if (f36328f.b(aVar, gVar, q(gVar.b))) {
                        }
                    } else {
                        continue;
                    }
                } else {
                    n(runnable, eVarJ.b);
                }
                eVarJ = eVar;
            }
            return;
        }
    }

    private static void n(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e10) {
            f36327e.log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e10);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private V o(Object obj) throws ExecutionException {
        if (obj instanceof c) {
            throw e("Task was cancelled.", ((c) obj).b);
        }
        if (obj instanceof d) {
            throw new ExecutionException(((d) obj).f36335a);
        }
        if (obj == f36329g) {
            return null;
        }
        return obj;
    }

    public static Object q(x<?> xVar) {
        if (xVar instanceof a) {
            Object obj = ((a) xVar).f36330a;
            if (!(obj instanceof c)) {
                return obj;
            }
            c cVar = (c) obj;
            if (cVar.f36334a) {
                return cVar.b != null ? new c(false, cVar.b) : c.f36333d;
            }
            return obj;
        }
        boolean zIsCancelled = xVar.isCancelled();
        if ((!f36326d) && zIsCancelled) {
            return c.f36333d;
        }
        try {
            Object objR = r(xVar);
            return objR == null ? f36329g : objR;
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
        V v5;
        boolean z10 = false;
        while (true) {
            try {
                v5 = future.get();
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
        return v5;
    }

    private void v() {
        i iVar;
        do {
            iVar = this.f36331c;
        } while (!f36328f.c(this, iVar, i.f36344c));
        while (iVar != null) {
            iVar.b();
            iVar = iVar.b;
        }
    }

    public final boolean A() {
        Object obj = this.f36330a;
        return (obj instanceof c) && ((c) obj).f36334a;
    }

    @Override // ne.x
    public final void a(Runnable runnable, Executor executor) {
        h(runnable);
        h(executor);
        e eVar = this.b;
        if (eVar != e.f36336d) {
            e eVar2 = new e(runnable, executor);
            do {
                eVar2.f36338c = eVar;
                if (f36328f.a(this, eVar, eVar2)) {
                    return;
                } else {
                    eVar = this.b;
                }
            } while (eVar != e.f36336d);
        }
        n(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z10) {
        c cVar;
        Object obj = this.f36330a;
        if (!(obj == null) && !(obj instanceof g)) {
            return false;
        }
        if (f36326d) {
            cVar = new c(z10, new CancellationException("Future.cancel() was called."));
        } else {
            cVar = z10 ? c.f36332c : c.f36333d;
        }
        a<V> aVar = this;
        boolean z11 = false;
        while (true) {
            if (f36328f.b(aVar, obj, cVar)) {
                if (z10) {
                    aVar.s();
                }
                l(aVar);
                if (obj instanceof g) {
                    x<? extends V> xVar = ((g) obj).b;
                    if (xVar instanceof a) {
                        aVar = (a) xVar;
                        obj = aVar.f36330a;
                        if ((obj == null) | (obj instanceof g)) {
                            z11 = true;
                        }
                    } else {
                        xVar.cancel(z10);
                    }
                }
                return true;
            }
            obj = aVar.f36330a;
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
        Object obj = this.f36330a;
        if ((obj != null) && (!(obj instanceof g))) {
            return o(obj);
        }
        long jNanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            i iVar = this.f36331c;
            if (iVar != i.f36344c) {
                i iVar2 = new i();
                while (true) {
                    iVar2.a(iVar);
                    if (f36328f.c(this, iVar, iVar2)) {
                        do {
                            LockSupport.parkNanos(this, nanos);
                            if (Thread.interrupted()) {
                                w(iVar2);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.f36330a;
                            if ((obj2 != null) && (!(obj2 instanceof g))) {
                                return o(obj2);
                            }
                            nanos = jNanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        w(iVar2);
                        break;
                    }
                    iVar = this.f36331c;
                    if (iVar == i.f36344c) {
                    }
                }
            }
            return o(this.f36330a);
        }
        while (nanos > 0) {
            Object obj3 = this.f36330a;
            if ((obj3 != null) && (!(obj3 instanceof g))) {
                return o(obj3);
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
        return this.f36330a instanceof c;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        Object obj = this.f36330a;
        return (!(obj instanceof g)) & (obj != null);
    }

    public final e j(e eVar) {
        e eVar2;
        do {
            eVar2 = this.b;
        } while (!f36328f.a(this, eVar2, e.f36336d));
        e eVar3 = eVar;
        e eVar4 = eVar2;
        while (eVar4 != null) {
            e eVar5 = eVar4.f36338c;
            eVar4.f36338c = eVar3;
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
        Object obj = this.f36330a;
        if (obj instanceof g) {
            return "setFuture=[" + z(((g) obj).b) + "]";
        }
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
    }

    public final void w(i iVar) {
        iVar.f36345a = null;
        while (true) {
            i iVar2 = this.f36331c;
            if (iVar2 == i.f36344c) {
                return;
            }
            i iVar3 = null;
            while (iVar2 != null) {
                i iVar4 = iVar2.b;
                if (iVar2.f36345a != null) {
                    iVar3 = iVar2;
                } else if (iVar3 != null) {
                    iVar3.b = iVar4;
                    if (iVar3.f36345a == null) {
                    }
                } else if (!f36328f.c(this, iVar2, iVar4)) {
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
    public boolean x(V v5) {
        if (v5 == null) {
            v5 = (V) f36329g;
        }
        if (!f36328f.b(this, null, v5)) {
            return false;
        }
        l(this);
        return true;
    }

    public boolean y(Throwable th2) {
        if (!f36328f.b(this, null, new d((Throwable) h(th2)))) {
            return false;
        }
        l(this);
        return true;
    }

    public final String z(Object obj) {
        return obj == this ? "this future" : String.valueOf(obj);
    }

    @Override // java.util.concurrent.Future
    public final V get() throws InterruptedException {
        Object obj;
        if (!Thread.interrupted()) {
            Object obj2 = this.f36330a;
            if ((obj2 != null) & (!(obj2 instanceof g))) {
                return o(obj2);
            }
            i iVar = this.f36331c;
            if (iVar != i.f36344c) {
                i iVar2 = new i();
                do {
                    iVar2.a(iVar);
                    if (f36328f.c(this, iVar, iVar2)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.f36330a;
                            } else {
                                w(iVar2);
                                throw new InterruptedException();
                            }
                        } while (!((obj != null) & (!(obj instanceof g))));
                        return o(obj);
                    }
                    iVar = this.f36331c;
                } while (iVar != i.f36344c);
            }
            return o(this.f36330a);
        }
        throw new InterruptedException();
    }
}
