package ne;

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
public abstract class b<V> extends oe.a implements x<V> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final boolean f27082d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Logger f27083e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final AbstractC0463b f27084f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Object f27085g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile Object f27086a;
    public volatile e b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile l f27087c;

    /* JADX INFO: renamed from: ne.b$b, reason: collision with other inner class name */
    public static abstract class AbstractC0463b {
        public AbstractC0463b() {
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
        public static final c f27088c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final c f27089d;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f27090a;
        public final Throwable b;

        static {
            if (b.f27082d) {
                f27089d = null;
                f27088c = null;
            } else {
                f27089d = new c(false, null);
                f27088c = new c(true, null);
            }
        }

        public c(boolean z10, Throwable th2) {
            this.f27090a = z10;
            this.b = th2;
        }
    }

    public static final class d {
        public static final d b = new d(new a("Failure occurred while trying to finish a future."));

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Throwable f27091a;

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
            this.f27091a = (Throwable) he.n.l(th2);
        }
    }

    public static final class f extends AbstractC0463b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final AtomicReferenceFieldUpdater<l, Thread> f27095a;
        public final AtomicReferenceFieldUpdater<l, l> b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final AtomicReferenceFieldUpdater<b, l> f27096c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final AtomicReferenceFieldUpdater<b, e> f27097d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final AtomicReferenceFieldUpdater<b, Object> f27098e;

        public f(AtomicReferenceFieldUpdater<l, Thread> atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater<l, l> atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater<b, l> atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater<b, e> atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater<b, Object> atomicReferenceFieldUpdater5) {
            super();
            this.f27095a = atomicReferenceFieldUpdater;
            this.b = atomicReferenceFieldUpdater2;
            this.f27096c = atomicReferenceFieldUpdater3;
            this.f27097d = atomicReferenceFieldUpdater4;
            this.f27098e = atomicReferenceFieldUpdater5;
        }

        @Override // ne.b.AbstractC0463b
        public boolean a(b<?> bVar, e eVar, e eVar2) {
            return y1.b.a(this.f27097d, bVar, eVar, eVar2);
        }

        @Override // ne.b.AbstractC0463b
        public boolean b(b<?> bVar, Object obj, Object obj2) {
            return y1.b.a(this.f27098e, bVar, obj, obj2);
        }

        @Override // ne.b.AbstractC0463b
        public boolean c(b<?> bVar, l lVar, l lVar2) {
            return y1.b.a(this.f27096c, bVar, lVar, lVar2);
        }

        @Override // ne.b.AbstractC0463b
        public e d(b<?> bVar, e eVar) {
            return this.f27097d.getAndSet(bVar, eVar);
        }

        @Override // ne.b.AbstractC0463b
        public l e(b<?> bVar, l lVar) {
            return this.f27096c.getAndSet(bVar, lVar);
        }

        @Override // ne.b.AbstractC0463b
        public void f(l lVar, l lVar2) {
            this.b.lazySet(lVar, lVar2);
        }

        @Override // ne.b.AbstractC0463b
        public void g(l lVar, Thread thread) {
            this.f27095a.lazySet(lVar, thread);
        }
    }

    public static final class g<V> implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final b<V> f27099a;
        public final x<? extends V> b;

        public g(b<V> bVar, x<? extends V> xVar) {
            this.f27099a = bVar;
            this.b = xVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f27099a.f27086a != this) {
                return;
            }
            if (b.f27084f.b(this.f27099a, this, b.w(this.b))) {
                b.t(this.f27099a);
            }
        }
    }

    public static final class h extends AbstractC0463b {
        public h() {
            super();
        }

        @Override // ne.b.AbstractC0463b
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

        @Override // ne.b.AbstractC0463b
        public boolean b(b<?> bVar, Object obj, Object obj2) {
            synchronized (bVar) {
                try {
                    if (bVar.f27086a != obj) {
                        return false;
                    }
                    bVar.f27086a = obj2;
                    return true;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // ne.b.AbstractC0463b
        public boolean c(b<?> bVar, l lVar, l lVar2) {
            synchronized (bVar) {
                try {
                    if (bVar.f27087c != lVar) {
                        return false;
                    }
                    bVar.f27087c = lVar2;
                    return true;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // ne.b.AbstractC0463b
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

        @Override // ne.b.AbstractC0463b
        public l e(b<?> bVar, l lVar) {
            l lVar2;
            synchronized (bVar) {
                try {
                    lVar2 = bVar.f27087c;
                    if (lVar2 != lVar) {
                        bVar.f27087c = lVar;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return lVar2;
        }

        @Override // ne.b.AbstractC0463b
        public void f(l lVar, l lVar2) {
            lVar.b = lVar2;
        }

        @Override // ne.b.AbstractC0463b
        public void g(l lVar, Thread thread) {
            lVar.f27106a = thread;
        }
    }

    public interface i<V> extends x<V> {
    }

    public static abstract class j<V> extends b<V> implements i<V> {
        @Override // ne.b, ne.x
        public void a(Runnable runnable, Executor executor) {
            super.a(runnable, executor);
        }

        @Override // ne.b, java.util.concurrent.Future
        public final boolean cancel(boolean z10) {
            return super.cancel(z10);
        }

        @Override // ne.b, java.util.concurrent.Future
        public V get() {
            return (V) super.get();
        }

        @Override // ne.b, java.util.concurrent.Future
        public final boolean isCancelled() {
            return super.isCancelled();
        }

        @Override // ne.b, java.util.concurrent.Future
        public boolean isDone() {
            return super.isDone();
        }

        @Override // ne.b, java.util.concurrent.Future
        public V get(long j10, TimeUnit timeUnit) {
            return (V) super.get(j10, timeUnit);
        }
    }

    public static final class k extends AbstractC0463b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Unsafe f27100a;
        public static final long b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final long f27101c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final long f27102d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final long f27103e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final long f27104f;

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
                f27101c = unsafe.objectFieldOffset(b.class.getDeclaredField("c"));
                b = unsafe.objectFieldOffset(b.class.getDeclaredField("b"));
                f27102d = unsafe.objectFieldOffset(b.class.getDeclaredField("a"));
                f27103e = unsafe.objectFieldOffset(l.class.getDeclaredField("a"));
                f27104f = unsafe.objectFieldOffset(l.class.getDeclaredField("b"));
                f27100a = unsafe;
            } catch (Exception e11) {
                he.u.j(e11);
                throw new RuntimeException(e11);
            }
        }

        public k() {
            super();
        }

        @Override // ne.b.AbstractC0463b
        public boolean a(b<?> bVar, e eVar, e eVar2) {
            return com.google.android.gms.internal.mlkit_vision_barcode.a.a(f27100a, bVar, b, eVar, eVar2);
        }

        @Override // ne.b.AbstractC0463b
        public boolean b(b<?> bVar, Object obj, Object obj2) {
            return com.google.android.gms.internal.mlkit_vision_barcode.a.a(f27100a, bVar, f27102d, obj, obj2);
        }

        @Override // ne.b.AbstractC0463b
        public boolean c(b<?> bVar, l lVar, l lVar2) {
            return com.google.android.gms.internal.mlkit_vision_barcode.a.a(f27100a, bVar, f27101c, lVar, lVar2);
        }

        @Override // ne.b.AbstractC0463b
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

        @Override // ne.b.AbstractC0463b
        public l e(b<?> bVar, l lVar) {
            l lVar2;
            do {
                lVar2 = bVar.f27087c;
                if (lVar == lVar2) {
                    break;
                }
            } while (!c(bVar, lVar2, lVar));
            return lVar2;
        }

        @Override // ne.b.AbstractC0463b
        public void f(l lVar, l lVar2) {
            f27100a.putObject(lVar, f27104f, lVar2);
        }

        @Override // ne.b.AbstractC0463b
        public void g(l lVar, Thread thread) {
            f27100a.putObject(lVar, f27103e, thread);
        }
    }

    public static final class l {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final l f27105c = new l(false);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public volatile Thread f27106a;
        public volatile l b;

        public l(boolean z10) {
        }

        public void a(l lVar) {
            b.f27084f.f(this, lVar);
        }

        public void b() {
            Thread thread = this.f27106a;
            if (thread != null) {
                this.f27106a = null;
                LockSupport.unpark(thread);
            }
        }

        public l() {
            b.f27084f.g(this, Thread.currentThread());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v14, types: [java.util.logging.Logger] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r5v0, types: [ne.b$a] */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r5v3 */
    static {
        boolean z10;
        Throwable th2;
        AbstractC0463b fVar;
        try {
            z10 = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
        } catch (SecurityException unused) {
            z10 = false;
        }
        f27082d = z10;
        f27083e = Logger.getLogger(b.class.getName());
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
        f27084f = fVar;
        if (r8 != 0) {
            ?? r10 = f27083e;
            Level level = Level.SEVERE;
            r10.log(level, "UnsafeAtomicHelper is broken!", th2);
            r10.log(level, "SafeAtomicHelper is broken!", r8);
        }
        f27085g = new Object();
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
                eVar = eVarS.f27094c;
                Runnable runnable = eVarS.f27093a;
                Objects.requireNonNull(runnable);
                Runnable runnable2 = runnable;
                if (runnable2 instanceof g) {
                    g gVar = (g) runnable2;
                    bVar = gVar.f27099a;
                    if (bVar.f27086a == gVar) {
                        if (f27084f.b(bVar, gVar, w(gVar.b))) {
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
            Logger logger = f27083e;
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
            Object cVar = ((b) xVar).f27086a;
            if (cVar instanceof c) {
                c cVar2 = (c) cVar;
                if (cVar2.f27090a) {
                    cVar = cVar2.b != null ? new c(false, cVar2.b) : c.f27089d;
                }
            }
            Objects.requireNonNull(cVar);
            return cVar;
        }
        if ((xVar instanceof oe.a) && (thA = oe.b.a((oe.a) xVar)) != null) {
            return new d(thA);
        }
        boolean zIsCancelled = xVar.isCancelled();
        if ((!f27082d) && zIsCancelled) {
            c cVar3 = c.f27089d;
            Objects.requireNonNull(cVar3);
            return cVar3;
        }
        try {
            Object objX = x(xVar);
            if (!zIsCancelled) {
                return objX == null ? f27085g : objX;
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
        for (l lVarE = f27084f.e(this, l.f27105c); lVarE != null; lVarE = lVarE.b) {
            lVarE.b();
        }
    }

    public final void C(l lVar) {
        lVar.f27106a = null;
        while (true) {
            l lVar2 = this.f27087c;
            if (lVar2 == l.f27105c) {
                return;
            }
            l lVar3 = null;
            while (lVar2 != null) {
                l lVar4 = lVar2.b;
                if (lVar2.f27106a != null) {
                    lVar3 = lVar2;
                } else if (lVar3 != null) {
                    lVar3.b = lVar4;
                    if (lVar3.f27106a == null) {
                    }
                } else if (!f27084f.c(this, lVar2, lVar4)) {
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
            v5 = (V) f27085g;
        }
        if (!f27084f.b(this, null, v5)) {
            return false;
        }
        t(this);
        return true;
    }

    public boolean E(Throwable th2) {
        if (!f27084f.b(this, null, new d((Throwable) he.n.l(th2)))) {
            return false;
        }
        t(this);
        return true;
    }

    public boolean F(x<? extends V> xVar) {
        d dVar;
        he.n.l(xVar);
        Object obj = this.f27086a;
        if (obj == null) {
            if (xVar.isDone()) {
                if (!f27084f.b(this, null, w(xVar))) {
                    return false;
                }
                t(this);
                return true;
            }
            g gVar = new g(this, xVar);
            if (f27084f.b(this, null, gVar)) {
                try {
                    xVar.a(gVar, ne.l.INSTANCE);
                } catch (Throwable th2) {
                    try {
                        dVar = new d(th2);
                    } catch (Throwable unused) {
                        dVar = d.b;
                    }
                    f27084f.b(this, gVar, dVar);
                }
                return true;
            }
            obj = this.f27086a;
        }
        if (obj instanceof c) {
            xVar.cancel(((c) obj).f27090a);
        }
        return false;
    }

    public final boolean G() {
        Object obj = this.f27086a;
        return (obj instanceof c) && ((c) obj).f27090a;
    }

    @Override // ne.x
    public void a(Runnable runnable, Executor executor) {
        e eVar;
        he.n.m(runnable, "Runnable was null.");
        he.n.m(executor, "Executor was null.");
        if (!isDone() && (eVar = this.b) != e.f27092d) {
            e eVar2 = new e(runnable, executor);
            do {
                eVar2.f27094c = eVar;
                if (f27084f.a(this, eVar, eVar2)) {
                    return;
                } else {
                    eVar = this.b;
                }
            } while (eVar != e.f27092d);
        }
        u(runnable, executor);
    }

    @Override // oe.a
    public final Throwable c() {
        if (!(this instanceof i)) {
            return null;
        }
        Object obj = this.f27086a;
        if (obj instanceof d) {
            return ((d) obj).f27091a;
        }
        return null;
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z10) {
        c cVar;
        Object obj = this.f27086a;
        if (!(obj == null) && !(obj instanceof g)) {
            return false;
        }
        if (f27082d) {
            cVar = new c(z10, new CancellationException("Future.cancel() was called."));
        } else {
            cVar = z10 ? c.f27088c : c.f27089d;
            Objects.requireNonNull(cVar);
        }
        b<V> bVar = this;
        boolean z11 = false;
        while (true) {
            if (f27084f.b(bVar, obj, cVar)) {
                if (z10) {
                    bVar.y();
                }
                t(bVar);
                if (obj instanceof g) {
                    x<? extends V> xVar = ((g) obj).b;
                    if (xVar instanceof i) {
                        bVar = (b) xVar;
                        obj = bVar.f27086a;
                        if ((obj == null) | (obj instanceof g)) {
                            z11 = true;
                        }
                    } else {
                        xVar.cancel(z10);
                    }
                }
                return true;
            }
            obj = bVar.f27086a;
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
        Object obj = this.f27086a;
        if ((obj != null) && (!(obj instanceof g))) {
            return v(obj);
        }
        long jNanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            l lVar = this.f27087c;
            if (lVar != l.f27105c) {
                l lVar2 = new l();
                while (true) {
                    lVar2.a(lVar);
                    if (f27084f.c(this, lVar, lVar2)) {
                        do {
                            c0.a(this, nanos);
                            if (Thread.interrupted()) {
                                C(lVar2);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.f27086a;
                            if ((obj2 != null) && (!(obj2 instanceof g))) {
                                return v(obj2);
                            }
                            nanos = jNanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        C(lVar2);
                        break;
                    }
                    lVar = this.f27087c;
                    if (lVar == l.f27105c) {
                    }
                }
            }
            Object obj3 = this.f27086a;
            Objects.requireNonNull(obj3);
            return v(obj3);
        }
        while (nanos > 0) {
            Object obj4 = this.f27086a;
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
        return this.f27086a instanceof c;
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        Object obj = this.f27086a;
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
        Object obj = this.f27086a;
        if (obj instanceof g) {
            sb2.append(", setFuture=[");
            q(sb2, ((g) obj).b);
            sb2.append("]");
        } else {
            try {
                string = he.r.a(A());
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
        e eVarD = f27084f.d(this, e.f27092d);
        while (eVarD != null) {
            e eVar3 = eVarD.f27094c;
            eVarD.f27094c = eVar2;
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
            throw new ExecutionException(((d) obj).f27091a);
        }
        return obj == f27085g ? (V) b0.b() : obj;
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
        public static final e f27092d = new e();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Runnable f27093a;
        public final Executor b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public e f27094c;

        public e(Runnable runnable, Executor executor) {
            this.f27093a = runnable;
            this.b = executor;
        }

        public e() {
            this.f27093a = null;
            this.b = null;
        }
    }

    @Override // java.util.concurrent.Future
    public V get() throws InterruptedException {
        Object obj;
        if (!Thread.interrupted()) {
            Object obj2 = this.f27086a;
            if ((obj2 != null) & (!(obj2 instanceof g))) {
                return v(obj2);
            }
            l lVar = this.f27087c;
            if (lVar != l.f27105c) {
                l lVar2 = new l();
                do {
                    lVar2.a(lVar);
                    if (f27084f.c(this, lVar, lVar2)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.f27086a;
                            } else {
                                C(lVar2);
                                throw new InterruptedException();
                            }
                        } while (!((obj != null) & (!(obj instanceof g))));
                        return v(obj);
                    }
                    lVar = this.f27087c;
                } while (lVar != l.f27105c);
            }
            Object obj3 = this.f27086a;
            Objects.requireNonNull(obj3);
            return v(obj3);
        }
        throw new InterruptedException();
    }
}
