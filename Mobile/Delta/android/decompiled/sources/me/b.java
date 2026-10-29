package me;

import java.lang.reflect.Field;
import java.security.AccessController;
import java.security.PrivilegedActionException;
import java.security.PrivilegedExceptionAction;
import java.util.Locale;
import java.util.Objects;
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
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes2.dex */
public abstract class b<V> extends ne.a implements x<V> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final boolean f24074d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Logger f24075e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final AbstractC0427b f24076f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Object f24077g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile Object f24078a;
    public volatile e b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile l f24079c;

    /* JADX INFO: renamed from: me.b$b, reason: collision with other inner class name */
    public static abstract class AbstractC0427b {
        public AbstractC0427b() {
        }

        public abstract boolean a(b<?> bVar, e eVar, e eVar2);

        public abstract boolean b(b<?> bVar, Object obj, Object obj2);

        public abstract boolean c(b<?> bVar, l lVar, l lVar2);

        public abstract e d(b<?> bVar, e eVar);

        public abstract l e(b<?> bVar, l lVar);

        public abstract void f(l lVar, l lVar2);

        public abstract void g(l lVar, Thread thread);
    }

    public static final class c {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final c f24080c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final c f24081d;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f24082a;
        public final Throwable b;

        static {
            if (b.f24074d) {
                f24081d = null;
                f24080c = null;
            } else {
                f24081d = new c(false, null);
                f24080c = new c(true, null);
            }
        }

        public c(boolean z10, Throwable th2) {
            this.f24082a = z10;
            this.b = th2;
        }
    }

    public static final class d {
        public static final d b = new d(new a("Failure occurred while trying to finish a future."));

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Throwable f24083a;

        public class a extends Throwable {
            public a(String str) {
                super(str);
            }

            @Override // java.lang.Throwable
            public synchronized Throwable fillInStackTrace() {
                return this;
            }
        }

        public d(Throwable th2) {
            this.f24083a = (Throwable) ge.n.l(th2);
        }
    }

    public static final class f extends AbstractC0427b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final AtomicReferenceFieldUpdater<l, Thread> f24087a;
        public final AtomicReferenceFieldUpdater<l, l> b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final AtomicReferenceFieldUpdater<b, l> f24088c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final AtomicReferenceFieldUpdater<b, e> f24089d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final AtomicReferenceFieldUpdater<b, Object> f24090e;

        public f(AtomicReferenceFieldUpdater<l, Thread> atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater<l, l> atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater<b, l> atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater<b, e> atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater<b, Object> atomicReferenceFieldUpdater5) {
            super();
            this.f24087a = atomicReferenceFieldUpdater;
            this.b = atomicReferenceFieldUpdater2;
            this.f24088c = atomicReferenceFieldUpdater3;
            this.f24089d = atomicReferenceFieldUpdater4;
            this.f24090e = atomicReferenceFieldUpdater5;
        }

        @Override // me.b.AbstractC0427b
        public boolean a(b<?> bVar, e eVar, e eVar2) {
            return y1.b.a(this.f24089d, bVar, eVar, eVar2);
        }

        @Override // me.b.AbstractC0427b
        public boolean b(b<?> bVar, Object obj, Object obj2) {
            return y1.b.a(this.f24090e, bVar, obj, obj2);
        }

        @Override // me.b.AbstractC0427b
        public boolean c(b<?> bVar, l lVar, l lVar2) {
            return y1.b.a(this.f24088c, bVar, lVar, lVar2);
        }

        @Override // me.b.AbstractC0427b
        public e d(b<?> bVar, e eVar) {
            return this.f24089d.getAndSet(bVar, eVar);
        }

        @Override // me.b.AbstractC0427b
        public l e(b<?> bVar, l lVar) {
            return this.f24088c.getAndSet(bVar, lVar);
        }

        @Override // me.b.AbstractC0427b
        public void f(l lVar, l lVar2) {
            this.b.lazySet(lVar, lVar2);
        }

        @Override // me.b.AbstractC0427b
        public void g(l lVar, Thread thread) {
            this.f24087a.lazySet(lVar, thread);
        }
    }

    public static final class g<V> implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final b<V> f24091a;
        public final x<? extends V> b;

        public g(b<V> bVar, x<? extends V> xVar) {
            this.f24091a = bVar;
            this.b = xVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f24091a.f24078a != this) {
                return;
            }
            if (b.f24076f.b(this.f24091a, this, b.w(this.b))) {
                b.t(this.f24091a);
            }
        }
    }

    public static final class h extends AbstractC0427b {
        public h() {
            super();
        }

        @Override // me.b.AbstractC0427b
        public boolean a(b<?> bVar, e eVar, e eVar2) {
            synchronized (bVar) {
                try {
                    if (bVar.b != eVar) {
                        return false;
                    }
                    bVar.b = eVar2;
                    return true;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // me.b.AbstractC0427b
        public boolean b(b<?> bVar, Object obj, Object obj2) {
            synchronized (bVar) {
                try {
                    if (bVar.f24078a != obj) {
                        return false;
                    }
                    bVar.f24078a = obj2;
                    return true;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // me.b.AbstractC0427b
        public boolean c(b<?> bVar, l lVar, l lVar2) {
            synchronized (bVar) {
                try {
                    if (bVar.f24079c != lVar) {
                        return false;
                    }
                    bVar.f24079c = lVar2;
                    return true;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // me.b.AbstractC0427b
        public e d(b<?> bVar, e eVar) {
            e eVar2;
            synchronized (bVar) {
                try {
                    eVar2 = bVar.b;
                    if (eVar2 != eVar) {
                        bVar.b = eVar;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return eVar2;
        }

        @Override // me.b.AbstractC0427b
        public l e(b<?> bVar, l lVar) {
            l lVar2;
            synchronized (bVar) {
                try {
                    lVar2 = bVar.f24079c;
                    if (lVar2 != lVar) {
                        bVar.f24079c = lVar;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return lVar2;
        }

        @Override // me.b.AbstractC0427b
        public void f(l lVar, l lVar2) {
            lVar.b = lVar2;
        }

        @Override // me.b.AbstractC0427b
        public void g(l lVar, Thread thread) {
            lVar.f24098a = thread;
        }
    }

    public interface i<V> extends x<V> {
    }

    public static abstract class j<V> extends b<V> implements i<V> {
        @Override // me.b, me.x
        public void a(Runnable runnable, Executor executor) {
            super.a(runnable, executor);
        }

        @Override // me.b, java.util.concurrent.Future
        public final boolean cancel(boolean z10) {
            return super.cancel(z10);
        }

        @Override // me.b, java.util.concurrent.Future
        public V get() {
            return (V) super.get();
        }

        @Override // me.b, java.util.concurrent.Future
        public final boolean isCancelled() {
            return super.isCancelled();
        }

        @Override // me.b, java.util.concurrent.Future
        public boolean isDone() {
            return super.isDone();
        }

        @Override // me.b, java.util.concurrent.Future
        public V get(long j10, TimeUnit timeUnit) {
            return (V) super.get(j10, timeUnit);
        }
    }

    public static final class k extends AbstractC0427b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Unsafe f24092a;
        public static final long b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final long f24093c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final long f24094d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final long f24095e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final long f24096f;

        public class a implements PrivilegedExceptionAction<Unsafe> {
            @Override // java.security.PrivilegedExceptionAction
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public Unsafe run() throws IllegalAccessException {
                for (Field field : Unsafe.class.getDeclaredFields()) {
                    field.setAccessible(true);
                    Object obj = field.get(null);
                    if (Unsafe.class.isInstance(obj)) {
                        return (Unsafe) Unsafe.class.cast(obj);
                    }
                }
                throw new NoSuchFieldError("the Unsafe");
            }
        }

        static {
            Unsafe unsafe;
            try {
                try {
                    unsafe = Unsafe.getUnsafe();
                } catch (PrivilegedActionException e10) {
                    throw new RuntimeException("Could not initialize intrinsics", e10.getCause());
                }
            } catch (SecurityException unused) {
                unsafe = (Unsafe) AccessController.doPrivileged(new a());
            }
            try {
                f24093c = unsafe.objectFieldOffset(b.class.getDeclaredField("c"));
                b = unsafe.objectFieldOffset(b.class.getDeclaredField("b"));
                f24094d = unsafe.objectFieldOffset(b.class.getDeclaredField("a"));
                f24095e = unsafe.objectFieldOffset(l.class.getDeclaredField("a"));
                f24096f = unsafe.objectFieldOffset(l.class.getDeclaredField("b"));
                f24092a = unsafe;
            } catch (Exception e11) {
                ge.u.j(e11);
                throw new RuntimeException(e11);
            }
        }

        public k() {
            super();
        }

        @Override // me.b.AbstractC0427b
        public boolean a(b<?> bVar, e eVar, e eVar2) {
            return com.google.android.gms.internal.mlkit_vision_barcode.a.a(f24092a, bVar, b, eVar, eVar2);
        }

        @Override // me.b.AbstractC0427b
        public boolean b(b<?> bVar, Object obj, Object obj2) {
            return com.google.android.gms.internal.mlkit_vision_barcode.a.a(f24092a, bVar, f24094d, obj, obj2);
        }

        @Override // me.b.AbstractC0427b
        public boolean c(b<?> bVar, l lVar, l lVar2) {
            return com.google.android.gms.internal.mlkit_vision_barcode.a.a(f24092a, bVar, f24093c, lVar, lVar2);
        }

        @Override // me.b.AbstractC0427b
        public e d(b<?> bVar, e eVar) {
            e eVar2;
            do {
                eVar2 = bVar.b;
                if (eVar == eVar2) {
                    break;
                }
            } while (!a(bVar, eVar2, eVar));
            return eVar2;
        }

        @Override // me.b.AbstractC0427b
        public l e(b<?> bVar, l lVar) {
            l lVar2;
            do {
                lVar2 = bVar.f24079c;
                if (lVar == lVar2) {
                    break;
                }
            } while (!c(bVar, lVar2, lVar));
            return lVar2;
        }

        @Override // me.b.AbstractC0427b
        public void f(l lVar, l lVar2) {
            f24092a.putObject(lVar, f24096f, lVar2);
        }

        @Override // me.b.AbstractC0427b
        public void g(l lVar, Thread thread) {
            f24092a.putObject(lVar, f24095e, thread);
        }
    }

    public static final class l {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final l f24097c = new l(false);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public volatile Thread f24098a;
        public volatile l b;

        public l(boolean z10) {
        }

        public void a(l lVar) {
            b.f24076f.f(this, lVar);
        }

        public void b() {
            Thread thread = this.f24098a;
            if (thread != null) {
                this.f24098a = null;
                LockSupport.unpark(thread);
            }
        }

        public l() {
            b.f24076f.g(this, Thread.currentThread());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v14, types: [java.util.logging.Logger] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r5v0, types: [me.b$a] */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r5v3 */
    static {
        boolean z10;
        Throwable th2;
        AbstractC0427b fVar;
        try {
            z10 = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
        } catch (SecurityException unused) {
            z10 = false;
        }
        f24074d = z10;
        f24075e = Logger.getLogger(b.class.getName());
        ?? r8 = 0;
        r8 = 0;
        try {
            fVar = new k();
            th2 = null;
        } catch (Throwable th3) {
            th2 = th3;
            try {
                fVar = new f(AtomicReferenceFieldUpdater.newUpdater(l.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(l.class, l.class, "b"), AtomicReferenceFieldUpdater.newUpdater(b.class, l.class, "c"), AtomicReferenceFieldUpdater.newUpdater(b.class, e.class, "b"), AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "a"));
            } catch (Throwable th4) {
                h hVar = new h();
                r8 = th4;
                fVar = hVar;
            }
        }
        f24076f = fVar;
        if (r8 != 0) {
            ?? r10 = f24075e;
            Level level = Level.SEVERE;
            r10.log(level, "UnsafeAtomicHelper is broken!", th2);
            r10.log(level, "SafeAtomicHelper is broken!", r8);
        }
        f24077g = new Object();
    }

    public static CancellationException r(String str, Throwable th2) {
        CancellationException cancellationException = new CancellationException(str);
        cancellationException.initCause(th2);
        return cancellationException;
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
    public static void t(b<?> bVar) {
        e eVar = null;
        while (true) {
            bVar.B();
            bVar.o();
            e eVarS = bVar.s(eVar);
            while (eVarS != null) {
                eVar = eVarS.f24086c;
                Runnable runnable = eVarS.f24085a;
                Objects.requireNonNull(runnable);
                Runnable runnable2 = runnable;
                if (runnable2 instanceof g) {
                    g gVar = (g) runnable2;
                    bVar = gVar.f24091a;
                    if (bVar.f24078a == gVar) {
                        if (f24076f.b(bVar, gVar, w(gVar.b))) {
                        }
                    } else {
                        continue;
                    }
                } else {
                    Executor executor = eVarS.b;
                    Objects.requireNonNull(executor);
                    u(runnable2, executor);
                }
                eVarS = eVar;
            }
            return;
        }
    }

    public static void u(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e10) {
            Logger logger = f24075e;
            Level level = Level.SEVERE;
            String strValueOf = String.valueOf(runnable);
            String strValueOf2 = String.valueOf(executor);
            StringBuilder sb2 = new StringBuilder(strValueOf.length() + 57 + strValueOf2.length());
            sb2.append("RuntimeException while executing runnable ");
            sb2.append(strValueOf);
            sb2.append(" with executor ");
            sb2.append(strValueOf2);
            logger.log(level, sb2.toString(), (Throwable) e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static Object w(x<?> xVar) {
        Throwable thA;
        if (xVar instanceof i) {
            Object cVar = ((b) xVar).f24078a;
            if (cVar instanceof c) {
                c cVar2 = (c) cVar;
                if (cVar2.f24082a) {
                    cVar = cVar2.b != null ? new c(false, cVar2.b) : c.f24081d;
                }
            }
            Objects.requireNonNull(cVar);
            return cVar;
        }
        if ((xVar instanceof ne.a) && (thA = ne.b.a((ne.a) xVar)) != null) {
            return new d(thA);
        }
        boolean zIsCancelled = xVar.isCancelled();
        if ((!f24074d) && zIsCancelled) {
            c cVar3 = c.f24081d;
            Objects.requireNonNull(cVar3);
            return cVar3;
        }
        try {
            Object objX = x(xVar);
            if (!zIsCancelled) {
                return objX == null ? f24077g : objX;
            }
            String strValueOf = String.valueOf(xVar);
            StringBuilder sb2 = new StringBuilder(strValueOf.length() + 84);
            sb2.append("get() did not throw CancellationException, despite reporting isCancelled() == true: ");
            sb2.append(strValueOf);
            return new c(false, new IllegalArgumentException(sb2.toString()));
        } catch (CancellationException e10) {
            if (zIsCancelled) {
                return new c(false, e10);
            }
            String strValueOf2 = String.valueOf(xVar);
            StringBuilder sb3 = new StringBuilder(strValueOf2.length() + 77);
            sb3.append("get() threw CancellationException, despite reporting isCancelled() == false: ");
            sb3.append(strValueOf2);
            return new d(new IllegalArgumentException(sb3.toString(), e10));
        } catch (ExecutionException e11) {
            if (!zIsCancelled) {
                return new d(e11.getCause());
            }
            String strValueOf3 = String.valueOf(xVar);
            StringBuilder sb4 = new StringBuilder(strValueOf3.length() + 84);
            sb4.append("get() did not throw CancellationException, despite reporting isCancelled() == true: ");
            sb4.append(strValueOf3);
            return new c(false, new IllegalArgumentException(sb4.toString(), e11));
        } catch (Throwable th2) {
            return new d(th2);
        }
    }

    private static <V> V x(Future<V> future) {
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

    /* JADX WARN: Multi-variable type inference failed */
    public String A() {
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        long delay = ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS);
        StringBuilder sb2 = new StringBuilder(41);
        sb2.append("remaining delay=[");
        sb2.append(delay);
        sb2.append(" ms]");
        return sb2.toString();
    }

    public final void B() {
        for (l lVarE = f24076f.e(this, l.f24097c); lVarE != null; lVarE = lVarE.b) {
            lVarE.b();
        }
    }

    public final void C(l lVar) {
        lVar.f24098a = null;
        while (true) {
            l lVar2 = this.f24079c;
            if (lVar2 == l.f24097c) {
                return;
            }
            l lVar3 = null;
            while (lVar2 != null) {
                l lVar4 = lVar2.b;
                if (lVar2.f24098a != null) {
                    lVar3 = lVar2;
                } else if (lVar3 != null) {
                    lVar3.b = lVar4;
                    if (lVar3.f24098a == null) {
                    }
                } else if (!f24076f.c(this, lVar2, lVar4)) {
                }
                lVar2 = lVar4;
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
    public boolean D(V v5) {
        if (v5 == null) {
            v5 = (V) f24077g;
        }
        if (!f24076f.b(this, null, v5)) {
            return false;
        }
        t(this);
        return true;
    }

    public boolean E(Throwable th2) {
        if (!f24076f.b(this, null, new d((Throwable) ge.n.l(th2)))) {
            return false;
        }
        t(this);
        return true;
    }

    public boolean F(x<? extends V> xVar) {
        d dVar;
        ge.n.l(xVar);
        Object obj = this.f24078a;
        if (obj == null) {
            if (xVar.isDone()) {
                if (!f24076f.b(this, null, w(xVar))) {
                    return false;
                }
                t(this);
                return true;
            }
            g gVar = new g(this, xVar);
            if (f24076f.b(this, null, gVar)) {
                try {
                    xVar.a(gVar, me.l.INSTANCE);
                } catch (Throwable th2) {
                    try {
                        dVar = new d(th2);
                    } catch (Throwable unused) {
                        dVar = d.b;
                    }
                    f24076f.b(this, gVar, dVar);
                }
                return true;
            }
            obj = this.f24078a;
        }
        if (obj instanceof c) {
            xVar.cancel(((c) obj).f24082a);
        }
        return false;
    }

    public final boolean G() {
        Object obj = this.f24078a;
        return (obj instanceof c) && ((c) obj).f24082a;
    }

    @Override // me.x
    public void a(Runnable runnable, Executor executor) {
        e eVar;
        ge.n.m(runnable, "Runnable was null.");
        ge.n.m(executor, "Executor was null.");
        if (!isDone() && (eVar = this.b) != e.f24084d) {
            e eVar2 = new e(runnable, executor);
            do {
                eVar2.f24086c = eVar;
                if (f24076f.a(this, eVar, eVar2)) {
                    return;
                } else {
                    eVar = this.b;
                }
            } while (eVar != e.f24084d);
        }
        u(runnable, executor);
    }

    @Override // ne.a
    public final Throwable c() {
        if (!(this instanceof i)) {
            return null;
        }
        Object obj = this.f24078a;
        if (obj instanceof d) {
            return ((d) obj).f24083a;
        }
        return null;
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z10) {
        c cVar;
        Object obj = this.f24078a;
        if (!(obj == null) && !(obj instanceof g)) {
            return false;
        }
        if (f24074d) {
            cVar = new c(z10, new CancellationException("Future.cancel() was called."));
        } else {
            cVar = z10 ? c.f24080c : c.f24081d;
            Objects.requireNonNull(cVar);
        }
        b<V> bVar = this;
        boolean z11 = false;
        while (true) {
            if (f24076f.b(bVar, obj, cVar)) {
                if (z10) {
                    bVar.y();
                }
                t(bVar);
                if (obj instanceof g) {
                    x<? extends V> xVar = ((g) obj).b;
                    if (xVar instanceof i) {
                        bVar = (b) xVar;
                        obj = bVar.f24078a;
                        if ((obj == null) | (obj instanceof g)) {
                            z11 = true;
                        }
                    } else {
                        xVar.cancel(z10);
                    }
                }
                return true;
            }
            obj = bVar.f24078a;
            if (!(obj instanceof g)) {
                return z11;
            }
        }
    }

    @Override // java.util.concurrent.Future
    public V get(long j10, TimeUnit timeUnit) throws InterruptedException, TimeoutException {
        long nanos = timeUnit.toNanos(j10);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.f24078a;
        if ((obj != null) && (!(obj instanceof g))) {
            return v(obj);
        }
        long jNanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            l lVar = this.f24079c;
            if (lVar != l.f24097c) {
                l lVar2 = new l();
                while (true) {
                    lVar2.a(lVar);
                    if (f24076f.c(this, lVar, lVar2)) {
                        do {
                            c0.a(this, nanos);
                            if (Thread.interrupted()) {
                                C(lVar2);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.f24078a;
                            if ((obj2 != null) && (!(obj2 instanceof g))) {
                                return v(obj2);
                            }
                            nanos = jNanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        C(lVar2);
                        break;
                    }
                    lVar = this.f24079c;
                    if (lVar == l.f24097c) {
                    }
                }
            }
            Object obj3 = this.f24078a;
            Objects.requireNonNull(obj3);
            return v(obj3);
        }
        while (nanos > 0) {
            Object obj4 = this.f24078a;
            if ((obj4 != null) && (!(obj4 instanceof g))) {
                return v(obj4);
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
        String lowerCase2 = timeUnit.toString().toLowerCase(locale);
        StringBuilder sb2 = new StringBuilder(String.valueOf(lowerCase2).length() + 28);
        sb2.append("Waited ");
        sb2.append(j10);
        sb2.append(" ");
        sb2.append(lowerCase2);
        String string3 = sb2.toString();
        if (nanos + 1000 < 0) {
            String strConcat = String.valueOf(string3).concat(" (plus ");
            long j11 = -nanos;
            long jConvert = timeUnit.convert(j11, TimeUnit.NANOSECONDS);
            long nanos2 = j11 - timeUnit.toNanos(jConvert);
            boolean z10 = jConvert == 0 || nanos2 > 1000;
            if (jConvert > 0) {
                String strValueOf = String.valueOf(strConcat);
                StringBuilder sb3 = new StringBuilder(strValueOf.length() + 21 + String.valueOf(lowerCase).length());
                sb3.append(strValueOf);
                sb3.append(jConvert);
                sb3.append(" ");
                sb3.append(lowerCase);
                String string4 = sb3.toString();
                if (z10) {
                    string4 = String.valueOf(string4).concat(",");
                }
                strConcat = String.valueOf(string4).concat(" ");
            }
            if (z10) {
                String strValueOf2 = String.valueOf(strConcat);
                StringBuilder sb4 = new StringBuilder(strValueOf2.length() + 33);
                sb4.append(strValueOf2);
                sb4.append(nanos2);
                sb4.append(" nanoseconds ");
                strConcat = sb4.toString();
            }
            string3 = String.valueOf(strConcat).concat("delay)");
        }
        if (isDone()) {
            throw new TimeoutException(String.valueOf(string3).concat(" but future completed as timeout expired"));
        }
        StringBuilder sb5 = new StringBuilder(String.valueOf(string3).length() + 5 + String.valueOf(string).length());
        sb5.append(string3);
        sb5.append(" for ");
        sb5.append(string);
        throw new TimeoutException(sb5.toString());
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return this.f24078a instanceof c;
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        Object obj = this.f24078a;
        return (!(obj instanceof g)) & (obj != null);
    }

    public final void m(StringBuilder sb2) {
        try {
            Object objX = x(this);
            sb2.append("SUCCESS, result=[");
            p(sb2, objX);
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

    public final void n(StringBuilder sb2) {
        String string;
        int length = sb2.length();
        sb2.append("PENDING");
        Object obj = this.f24078a;
        if (obj instanceof g) {
            sb2.append(", setFuture=[");
            q(sb2, ((g) obj).b);
            sb2.append("]");
        } else {
            try {
                string = ge.r.a(A());
            } catch (RuntimeException | StackOverflowError e10) {
                String strValueOf = String.valueOf(e10.getClass());
                StringBuilder sb3 = new StringBuilder(strValueOf.length() + 38);
                sb3.append("Exception thrown from implementation: ");
                sb3.append(strValueOf);
                string = sb3.toString();
            }
            if (string != null) {
                sb2.append(", info=[");
                sb2.append(string);
                sb2.append("]");
            }
        }
        if (isDone()) {
            sb2.delete(length, sb2.length());
            m(sb2);
        }
    }

    public void o() {
    }

    public final void p(StringBuilder sb2, Object obj) {
        if (obj == null) {
            sb2.append("null");
        } else {
            if (obj == this) {
                sb2.append("this future");
                return;
            }
            sb2.append(obj.getClass().getName());
            sb2.append("@");
            sb2.append(Integer.toHexString(System.identityHashCode(obj)));
        }
    }

    public final void q(StringBuilder sb2, Object obj) {
        try {
            if (obj == this) {
                sb2.append("this future");
            } else {
                sb2.append(obj);
            }
        } catch (RuntimeException e10) {
            e = e10;
            sb2.append("Exception thrown from implementation: ");
            sb2.append(e.getClass());
        } catch (StackOverflowError e11) {
            e = e11;
            sb2.append("Exception thrown from implementation: ");
            sb2.append(e.getClass());
        }
    }

    public final e s(e eVar) {
        e eVar2 = eVar;
        e eVarD = f24076f.d(this, e.f24084d);
        while (eVarD != null) {
            e eVar3 = eVarD.f24086c;
            eVarD.f24086c = eVar2;
            eVar2 = eVarD;
            eVarD = eVar3;
        }
        return eVar2;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        if (getClass().getName().startsWith("com.google.common.util.concurrent.")) {
            sb2.append(getClass().getSimpleName());
        } else {
            sb2.append(getClass().getName());
        }
        sb2.append('@');
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append("[status=");
        if (isCancelled()) {
            sb2.append("CANCELLED");
        } else if (isDone()) {
            m(sb2);
        } else {
            n(sb2);
        }
        sb2.append("]");
        return sb2.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final V v(Object obj) throws ExecutionException {
        if (obj instanceof c) {
            throw r("Task was cancelled.", ((c) obj).b);
        }
        if (obj instanceof d) {
            throw new ExecutionException(((d) obj).f24083a);
        }
        return obj == f24077g ? (V) b0.b() : obj;
    }

    public void y() {
    }

    public final void z(Future<?> future) {
        if ((future != null) && isCancelled()) {
            future.cancel(G());
        }
    }

    public static final class e {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final e f24084d = new e();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Runnable f24085a;
        public final Executor b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public e f24086c;

        public e(Runnable runnable, Executor executor) {
            this.f24085a = runnable;
            this.b = executor;
        }

        public e() {
            this.f24085a = null;
            this.b = null;
        }
    }

    @Override // java.util.concurrent.Future
    public V get() throws InterruptedException {
        Object obj;
        if (!Thread.interrupted()) {
            Object obj2 = this.f24078a;
            if ((obj2 != null) & (!(obj2 instanceof g))) {
                return v(obj2);
            }
            l lVar = this.f24079c;
            if (lVar != l.f24097c) {
                l lVar2 = new l();
                do {
                    lVar2.a(lVar);
                    if (f24076f.c(this, lVar, lVar2)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.f24078a;
                            } else {
                                C(lVar2);
                                throw new InterruptedException();
                            }
                        } while (!((obj != null) & (!(obj instanceof g))));
                        return v(obj);
                    }
                    lVar = this.f24079c;
                } while (lVar != l.f24097c);
            }
            Object obj3 = this.f24078a;
            Objects.requireNonNull(obj3);
            return v(obj3);
        }
        throw new InterruptedException();
    }
}
