package ne;

import com.google.android.gms.internal.mlkit_vision_barcode.C2435a;
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
import p169he.C6384n;
import p169he.C6388r;
import p169he.C6391u;
import p329oe.AbstractC9725a;
import p329oe.C9726b;
import p563y1.C12996b;
import sun.misc.Unsafe;

/* JADX INFO: renamed from: ne.b */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC9411b<V> extends AbstractC9725a implements InterfaceFutureC9440x<V> {

    /* JADX INFO: renamed from: d */
    public static final boolean f33881d;

    /* JADX INFO: renamed from: e */
    public static final Logger f33882e;

    /* JADX INFO: renamed from: f */
    public static final b f33883f;

    /* JADX INFO: renamed from: g */
    public static final Object f33884g;

    /* JADX INFO: renamed from: a */
    public volatile Object f33885a;

    /* JADX INFO: renamed from: b */
    public volatile e f33886b;

    /* JADX INFO: renamed from: c */
    public volatile l f33887c;

    /* JADX INFO: renamed from: ne.b$b */
    public static abstract class b {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public b() {
        }

        /* JADX INFO: renamed from: a */
        public abstract boolean mo37183a(AbstractC9411b<?> abstractC9411b, e eVar, e eVar2);

        /* JADX INFO: renamed from: b */
        public abstract boolean mo37184b(AbstractC9411b<?> abstractC9411b, Object obj, Object obj2);

        /* JADX INFO: renamed from: c */
        public abstract boolean mo37185c(AbstractC9411b<?> abstractC9411b, l lVar, l lVar2);

        /* JADX INFO: renamed from: d */
        public abstract e mo37186d(AbstractC9411b<?> abstractC9411b, e eVar);

        /* JADX INFO: renamed from: e */
        public abstract l mo37187e(AbstractC9411b<?> abstractC9411b, l lVar);

        /* JADX INFO: renamed from: f */
        public abstract void mo37188f(l lVar, l lVar2);

        /* JADX INFO: renamed from: g */
        public abstract void mo37189g(l lVar, Thread thread);
    }

    /* JADX INFO: renamed from: ne.b$c */
    public static final class c {

        /* JADX INFO: renamed from: c */
        public static final c f33888c;

        /* JADX INFO: renamed from: d */
        public static final c f33889d;

        /* JADX INFO: renamed from: a */
        public final boolean f33890a;

        /* JADX INFO: renamed from: b */
        public final Throwable f33891b;

        static {
            if (AbstractC9411b.f33881d) {
                f33889d = null;
                f33888c = null;
            } else {
                f33889d = new c(false, null);
                f33888c = new c(true, null);
            }
        }

        public c(boolean z10, Throwable th2) {
            this.f33890a = z10;
            this.f33891b = th2;
        }
    }

    /* JADX INFO: renamed from: ne.b$d */
    public static final class d {

        /* JADX INFO: renamed from: b */
        public static final d f33892b = new d(new a("Failure occurred while trying to finish a future."));

        /* JADX INFO: renamed from: a */
        public final Throwable f33893a;

        /* JADX INFO: renamed from: ne.b$d$a */
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
            this.f33893a = (Throwable) C6384n.m27928l(th2);
        }
    }

    /* JADX INFO: renamed from: ne.b$f */
    public static final class f extends b {

        /* JADX INFO: renamed from: a */
        public final AtomicReferenceFieldUpdater<l, Thread> f33898a;

        /* JADX INFO: renamed from: b */
        public final AtomicReferenceFieldUpdater<l, l> f33899b;

        /* JADX INFO: renamed from: c */
        public final AtomicReferenceFieldUpdater<AbstractC9411b, l> f33900c;

        /* JADX INFO: renamed from: d */
        public final AtomicReferenceFieldUpdater<AbstractC9411b, e> f33901d;

        /* JADX INFO: renamed from: e */
        public final AtomicReferenceFieldUpdater<AbstractC9411b, Object> f33902e;

        public f(AtomicReferenceFieldUpdater<l, Thread> atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater<l, l> atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater<AbstractC9411b, l> atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater<AbstractC9411b, e> atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater<AbstractC9411b, Object> atomicReferenceFieldUpdater5) {
            super();
            this.f33898a = atomicReferenceFieldUpdater;
            this.f33899b = atomicReferenceFieldUpdater2;
            this.f33900c = atomicReferenceFieldUpdater3;
            this.f33901d = atomicReferenceFieldUpdater4;
            this.f33902e = atomicReferenceFieldUpdater5;
        }

        @Override // ne.AbstractC9411b.b
        /* JADX INFO: renamed from: a */
        public boolean mo37183a(AbstractC9411b<?> abstractC9411b, e eVar, e eVar2) {
            return C12996b.m48310a(this.f33901d, abstractC9411b, eVar, eVar2);
        }

        @Override // ne.AbstractC9411b.b
        /* JADX INFO: renamed from: b */
        public boolean mo37184b(AbstractC9411b<?> abstractC9411b, Object obj, Object obj2) {
            return C12996b.m48310a(this.f33902e, abstractC9411b, obj, obj2);
        }

        @Override // ne.AbstractC9411b.b
        /* JADX INFO: renamed from: c */
        public boolean mo37185c(AbstractC9411b<?> abstractC9411b, l lVar, l lVar2) {
            return C12996b.m48310a(this.f33900c, abstractC9411b, lVar, lVar2);
        }

        @Override // ne.AbstractC9411b.b
        /* JADX INFO: renamed from: d */
        public e mo37186d(AbstractC9411b<?> abstractC9411b, e eVar) {
            return this.f33901d.getAndSet(abstractC9411b, eVar);
        }

        @Override // ne.AbstractC9411b.b
        /* JADX INFO: renamed from: e */
        public l mo37187e(AbstractC9411b<?> abstractC9411b, l lVar) {
            return this.f33900c.getAndSet(abstractC9411b, lVar);
        }

        @Override // ne.AbstractC9411b.b
        /* JADX INFO: renamed from: f */
        public void mo37188f(l lVar, l lVar2) {
            this.f33899b.lazySet(lVar, lVar2);
        }

        @Override // ne.AbstractC9411b.b
        /* JADX INFO: renamed from: g */
        public void mo37189g(l lVar, Thread thread) {
            this.f33898a.lazySet(lVar, thread);
        }
    }

    /* JADX INFO: renamed from: ne.b$g */
    public static final class g<V> implements Runnable {

        /* JADX INFO: renamed from: a */
        public final AbstractC9411b<V> f33903a;

        /* JADX INFO: renamed from: b */
        public final InterfaceFutureC9440x<? extends V> f33904b;

        public g(AbstractC9411b<V> abstractC9411b, InterfaceFutureC9440x<? extends V> interfaceFutureC9440x) {
            this.f33903a = abstractC9411b;
            this.f33904b = interfaceFutureC9440x;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f33903a.f33885a != this) {
                return;
            }
            if (AbstractC9411b.f33883f.mo37184b(this.f33903a, this, AbstractC9411b.m37165w(this.f33904b))) {
                AbstractC9411b.m37163t(this.f33903a);
            }
        }
    }

    /* JADX INFO: renamed from: ne.b$h */
    public static final class h extends b {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public h() {
            super();
        }

        @Override // ne.AbstractC9411b.b
        /* JADX INFO: renamed from: a */
        public boolean mo37183a(AbstractC9411b<?> abstractC9411b, e eVar, e eVar2) {
            synchronized (abstractC9411b) {
                try {
                    if (abstractC9411b.f33886b != eVar) {
                        return false;
                    }
                    abstractC9411b.f33886b = eVar2;
                    return true;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // ne.AbstractC9411b.b
        /* JADX INFO: renamed from: b */
        public boolean mo37184b(AbstractC9411b<?> abstractC9411b, Object obj, Object obj2) {
            synchronized (abstractC9411b) {
                try {
                    if (abstractC9411b.f33885a != obj) {
                        return false;
                    }
                    abstractC9411b.f33885a = obj2;
                    return true;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // ne.AbstractC9411b.b
        /* JADX INFO: renamed from: c */
        public boolean mo37185c(AbstractC9411b<?> abstractC9411b, l lVar, l lVar2) {
            synchronized (abstractC9411b) {
                try {
                    if (abstractC9411b.f33887c != lVar) {
                        return false;
                    }
                    abstractC9411b.f33887c = lVar2;
                    return true;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // ne.AbstractC9411b.b
        /* JADX INFO: renamed from: d */
        public e mo37186d(AbstractC9411b<?> abstractC9411b, e eVar) {
            e eVar2;
            synchronized (abstractC9411b) {
                try {
                    eVar2 = abstractC9411b.f33886b;
                    if (eVar2 != eVar) {
                        abstractC9411b.f33886b = eVar;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return eVar2;
        }

        @Override // ne.AbstractC9411b.b
        /* JADX INFO: renamed from: e */
        public l mo37187e(AbstractC9411b<?> abstractC9411b, l lVar) {
            l lVar2;
            synchronized (abstractC9411b) {
                try {
                    lVar2 = abstractC9411b.f33887c;
                    if (lVar2 != lVar) {
                        abstractC9411b.f33887c = lVar;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return lVar2;
        }

        @Override // ne.AbstractC9411b.b
        /* JADX INFO: renamed from: f */
        public void mo37188f(l lVar, l lVar2) {
            lVar.f33913b = lVar2;
        }

        @Override // ne.AbstractC9411b.b
        /* JADX INFO: renamed from: g */
        public void mo37189g(l lVar, Thread thread) {
            lVar.f33912a = thread;
        }
    }

    /* JADX INFO: renamed from: ne.b$i */
    public interface i<V> extends InterfaceFutureC9440x<V> {
    }

    /* JADX INFO: renamed from: ne.b$j */
    public static abstract class j<V> extends AbstractC9411b<V> implements i<V> {
        @Override // ne.AbstractC9411b, ne.InterfaceFutureC9440x
        /* JADX INFO: renamed from: a */
        public void mo37173a(Runnable runnable, Executor executor) {
            super.mo37173a(runnable, executor);
        }

        @Override // ne.AbstractC9411b, java.util.concurrent.Future
        public final boolean cancel(boolean z10) {
            return super.cancel(z10);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Override // ne.AbstractC9411b, java.util.concurrent.Future
        public V get() {
            return (V) super.get();
        }

        @Override // ne.AbstractC9411b, java.util.concurrent.Future
        public final boolean isCancelled() {
            return super.isCancelled();
        }

        @Override // ne.AbstractC9411b, java.util.concurrent.Future
        public boolean isDone() {
            return super.isDone();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        @Override // ne.AbstractC9411b, java.util.concurrent.Future
        public V get(long j10, TimeUnit timeUnit) {
            return (V) super.get(j10, timeUnit);
        }
    }

    /* JADX INFO: renamed from: ne.b$k */
    public static final class k extends b {

        /* JADX INFO: renamed from: a */
        public static final Unsafe f33905a;

        /* JADX INFO: renamed from: b */
        public static final long f33906b;

        /* JADX INFO: renamed from: c */
        public static final long f33907c;

        /* JADX INFO: renamed from: d */
        public static final long f33908d;

        /* JADX INFO: renamed from: e */
        public static final long f33909e;

        /* JADX INFO: renamed from: f */
        public static final long f33910f;

        /* JADX INFO: renamed from: ne.b$k$a */
        public class a implements PrivilegedExceptionAction<Unsafe> {
            /* JADX DEBUG: Method merged with bridge method: run()Ljava/lang/Object; */
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
                f33907c = unsafe.objectFieldOffset(AbstractC9411b.class.getDeclaredField("c"));
                f33906b = unsafe.objectFieldOffset(AbstractC9411b.class.getDeclaredField("b"));
                f33908d = unsafe.objectFieldOffset(AbstractC9411b.class.getDeclaredField("a"));
                f33909e = unsafe.objectFieldOffset(l.class.getDeclaredField("a"));
                f33910f = unsafe.objectFieldOffset(l.class.getDeclaredField("b"));
                f33905a = unsafe;
            } catch (Exception e11) {
                C6391u.m27970j(e11);
                throw new RuntimeException(e11);
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public k() {
            super();
        }

        @Override // ne.AbstractC9411b.b
        /* JADX INFO: renamed from: a */
        public boolean mo37183a(AbstractC9411b<?> abstractC9411b, e eVar, e eVar2) {
            return C2435a.m11162a(f33905a, abstractC9411b, f33906b, eVar, eVar2);
        }

        @Override // ne.AbstractC9411b.b
        /* JADX INFO: renamed from: b */
        public boolean mo37184b(AbstractC9411b<?> abstractC9411b, Object obj, Object obj2) {
            return C2435a.m11162a(f33905a, abstractC9411b, f33908d, obj, obj2);
        }

        @Override // ne.AbstractC9411b.b
        /* JADX INFO: renamed from: c */
        public boolean mo37185c(AbstractC9411b<?> abstractC9411b, l lVar, l lVar2) {
            return C2435a.m11162a(f33905a, abstractC9411b, f33907c, lVar, lVar2);
        }

        @Override // ne.AbstractC9411b.b
        /* JADX INFO: renamed from: d */
        public e mo37186d(AbstractC9411b<?> abstractC9411b, e eVar) {
            e eVar2;
            do {
                eVar2 = abstractC9411b.f33886b;
                if (eVar == eVar2) {
                    break;
                }
            } while (!mo37183a(abstractC9411b, eVar2, eVar));
            return eVar2;
        }

        @Override // ne.AbstractC9411b.b
        /* JADX INFO: renamed from: e */
        public l mo37187e(AbstractC9411b<?> abstractC9411b, l lVar) {
            l lVar2;
            do {
                lVar2 = abstractC9411b.f33887c;
                if (lVar == lVar2) {
                    break;
                }
            } while (!mo37185c(abstractC9411b, lVar2, lVar));
            return lVar2;
        }

        @Override // ne.AbstractC9411b.b
        /* JADX INFO: renamed from: f */
        public void mo37188f(l lVar, l lVar2) {
            f33905a.putObject(lVar, f33910f, lVar2);
        }

        @Override // ne.AbstractC9411b.b
        /* JADX INFO: renamed from: g */
        public void mo37189g(l lVar, Thread thread) {
            f33905a.putObject(lVar, f33909e, thread);
        }
    }

    /* JADX INFO: renamed from: ne.b$l */
    public static final class l {

        /* JADX INFO: renamed from: c */
        public static final l f33911c = new l(false);

        /* JADX INFO: renamed from: a */
        public volatile Thread f33912a;

        /* JADX INFO: renamed from: b */
        public volatile l f33913b;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public l(boolean z10) {
        }

        /* JADX INFO: renamed from: a */
        public void m37191a(l lVar) {
            AbstractC9411b.f33883f.mo37188f(this, lVar);
        }

        /* JADX INFO: renamed from: b */
        public void m37192b() {
            Thread thread = this.f33912a;
            if (thread != null) {
                this.f33912a = null;
                LockSupport.unpark(thread);
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public l() {
            AbstractC9411b.f33883f.mo37189g(this, Thread.currentThread());
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
        b fVar;
        try {
            z10 = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
        } catch (SecurityException unused) {
            z10 = false;
        }
        f33881d = z10;
        f33882e = Logger.getLogger(AbstractC9411b.class.getName());
        ?? r8 = 0;
        r8 = 0;
        try {
            fVar = new k();
            th2 = null;
        } catch (Throwable th3) {
            th2 = th3;
            try {
                fVar = new f(AtomicReferenceFieldUpdater.newUpdater(l.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(l.class, l.class, "b"), AtomicReferenceFieldUpdater.newUpdater(AbstractC9411b.class, l.class, "c"), AtomicReferenceFieldUpdater.newUpdater(AbstractC9411b.class, e.class, "b"), AtomicReferenceFieldUpdater.newUpdater(AbstractC9411b.class, Object.class, "a"));
            } catch (Throwable th4) {
                h hVar = new h();
                r8 = th4;
                fVar = hVar;
            }
        }
        f33883f = fVar;
        if (r8 != 0) {
            ?? r10 = f33882e;
            Level level = Level.SEVERE;
            r10.log(level, "UnsafeAtomicHelper is broken!", th2);
            r10.log(level, "SafeAtomicHelper is broken!", r8);
        }
        f33884g = new Object();
    }

    /* JADX INFO: renamed from: r */
    public static CancellationException m37162r(String str, Throwable th2) {
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
    /* JADX INFO: renamed from: t */
    public static void m37163t(AbstractC9411b<?> abstractC9411b) {
        e eVar = null;
        while (true) {
            abstractC9411b.m37167B();
            abstractC9411b.mo37141o();
            e eVarM37179s = abstractC9411b.m37179s(eVar);
            while (eVarM37179s != null) {
                eVar = eVarM37179s.f33897c;
                Runnable runnable = eVarM37179s.f33895a;
                Objects.requireNonNull(runnable);
                Runnable runnable2 = runnable;
                if (runnable2 instanceof g) {
                    g gVar = (g) runnable2;
                    abstractC9411b = gVar.f33903a;
                    if (abstractC9411b.f33885a == gVar) {
                        if (f33883f.mo37184b(abstractC9411b, gVar, m37165w(gVar.f33904b))) {
                        }
                    } else {
                        continue;
                    }
                } else {
                    Executor executor = eVarM37179s.f33896b;
                    Objects.requireNonNull(executor);
                    m37164u(runnable2, executor);
                }
                eVarM37179s = eVar;
            }
            return;
        }
    }

    /* JADX INFO: renamed from: u */
    public static void m37164u(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e10) {
            Logger logger = f33882e;
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

    /* JADX DEBUG: Multi-variable search result rejected for r8v0, resolved type: ne.x<?> */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: w */
    public static Object m37165w(InterfaceFutureC9440x<?> interfaceFutureC9440x) {
        Throwable thM38487a;
        if (interfaceFutureC9440x instanceof i) {
            Object cVar = ((AbstractC9411b) interfaceFutureC9440x).f33885a;
            if (cVar instanceof c) {
                c cVar2 = (c) cVar;
                if (cVar2.f33890a) {
                    cVar = cVar2.f33891b != null ? new c(false, cVar2.f33891b) : c.f33889d;
                }
            }
            Objects.requireNonNull(cVar);
            return cVar;
        }
        if ((interfaceFutureC9440x instanceof AbstractC9725a) && (thM38487a = C9726b.m38487a((AbstractC9725a) interfaceFutureC9440x)) != null) {
            return new d(thM38487a);
        }
        boolean zIsCancelled = interfaceFutureC9440x.isCancelled();
        if ((!f33881d) && zIsCancelled) {
            c cVar3 = c.f33889d;
            Objects.requireNonNull(cVar3);
            return cVar3;
        }
        try {
            Object objM37166x = m37166x(interfaceFutureC9440x);
            if (!zIsCancelled) {
                return objM37166x == null ? f33884g : objM37166x;
            }
            String strValueOf = String.valueOf(interfaceFutureC9440x);
            StringBuilder sb2 = new StringBuilder(strValueOf.length() + 84);
            sb2.append("get() did not throw CancellationException, despite reporting isCancelled() == true: ");
            sb2.append(strValueOf);
            return new c(false, new IllegalArgumentException(sb2.toString()));
        } catch (CancellationException e10) {
            if (zIsCancelled) {
                return new c(false, e10);
            }
            String strValueOf2 = String.valueOf(interfaceFutureC9440x);
            StringBuilder sb3 = new StringBuilder(strValueOf2.length() + 77);
            sb3.append("get() threw CancellationException, despite reporting isCancelled() == false: ");
            sb3.append(strValueOf2);
            return new d(new IllegalArgumentException(sb3.toString(), e10));
        } catch (ExecutionException e11) {
            if (!zIsCancelled) {
                return new d(e11.getCause());
            }
            String strValueOf3 = String.valueOf(interfaceFutureC9440x);
            StringBuilder sb4 = new StringBuilder(strValueOf3.length() + 84);
            sb4.append("get() did not throw CancellationException, despite reporting isCancelled() == true: ");
            sb4.append(strValueOf3);
            return new c(false, new IllegalArgumentException(sb4.toString(), e11));
        } catch (Throwable th2) {
            return new d(th2);
        }
    }

    /* JADX INFO: renamed from: x */
    private static <V> V m37166x(Future<V> future) {
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

    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: ne.b<V> */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: A */
    public String mo37138A() {
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

    /* JADX INFO: renamed from: B */
    public final void m37167B() {
        for (l lVarMo37187e = f33883f.mo37187e(this, l.f33911c); lVarMo37187e != null; lVarMo37187e = lVarMo37187e.f33913b) {
            lVarMo37187e.m37192b();
        }
    }

    /* JADX INFO: renamed from: C */
    public final void m37168C(l lVar) {
        lVar.f33912a = null;
        while (true) {
            l lVar2 = this.f33887c;
            if (lVar2 == l.f33911c) {
                return;
            }
            l lVar3 = null;
            while (lVar2 != null) {
                l lVar4 = lVar2.f33913b;
                if (lVar2.f33912a != null) {
                    lVar3 = lVar2;
                } else if (lVar3 != null) {
                    lVar3.f33913b = lVar4;
                    if (lVar3.f33912a == null) {
                    }
                } else if (!f33883f.mo37185c(this, lVar2, lVar4)) {
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
    /* JADX INFO: renamed from: D */
    public boolean mo37169D(V v5) {
        if (v5 == null) {
            v5 = (V) f33884g;
        }
        if (!f33883f.mo37184b(this, null, v5)) {
            return false;
        }
        m37163t(this);
        return true;
    }

    /* JADX INFO: renamed from: E */
    public boolean mo37170E(Throwable th2) {
        if (!f33883f.mo37184b(this, null, new d((Throwable) C6384n.m27928l(th2)))) {
            return false;
        }
        m37163t(this);
        return true;
    }

    /* JADX INFO: renamed from: F */
    public boolean m37171F(InterfaceFutureC9440x<? extends V> interfaceFutureC9440x) {
        d dVar;
        C6384n.m27928l(interfaceFutureC9440x);
        Object obj = this.f33885a;
        if (obj == null) {
            if (interfaceFutureC9440x.isDone()) {
                if (!f33883f.mo37184b(this, null, m37165w(interfaceFutureC9440x))) {
                    return false;
                }
                m37163t(this);
                return true;
            }
            g gVar = new g(this, interfaceFutureC9440x);
            if (f33883f.mo37184b(this, null, gVar)) {
                try {
                    interfaceFutureC9440x.mo37173a(gVar, EnumC9428l.INSTANCE);
                } catch (Throwable th2) {
                    try {
                        dVar = new d(th2);
                    } catch (Throwable unused) {
                        dVar = d.f33892b;
                    }
                    f33883f.mo37184b(this, gVar, dVar);
                }
                return true;
            }
            obj = this.f33885a;
        }
        if (obj instanceof c) {
            interfaceFutureC9440x.cancel(((c) obj).f33890a);
        }
        return false;
    }

    /* JADX INFO: renamed from: G */
    public final boolean m37172G() {
        Object obj = this.f33885a;
        return (obj instanceof c) && ((c) obj).f33890a;
    }

    @Override // ne.InterfaceFutureC9440x
    /* JADX INFO: renamed from: a */
    public void mo37173a(Runnable runnable, Executor executor) {
        e eVar;
        C6384n.m27929m(runnable, "Runnable was null.");
        C6384n.m27929m(executor, "Executor was null.");
        if (!isDone() && (eVar = this.f33886b) != e.f33894d) {
            e eVar2 = new e(runnable, executor);
            do {
                eVar2.f33897c = eVar;
                if (f33883f.mo37183a(this, eVar, eVar2)) {
                    return;
                } else {
                    eVar = this.f33886b;
                }
            } while (eVar != e.f33894d);
        }
        m37164u(runnable, executor);
    }

    @Override // p329oe.AbstractC9725a
    /* JADX INFO: renamed from: c */
    public final Throwable mo37174c() {
        if (!(this instanceof i)) {
            return null;
        }
        Object obj = this.f33885a;
        if (obj instanceof d) {
            return ((d) obj).f33893a;
        }
        return null;
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z10) {
        c cVar;
        Object obj = this.f33885a;
        if (!(obj == null) && !(obj instanceof g)) {
            return false;
        }
        if (f33881d) {
            cVar = new c(z10, new CancellationException("Future.cancel() was called."));
        } else {
            cVar = z10 ? c.f33888c : c.f33889d;
            Objects.requireNonNull(cVar);
        }
        AbstractC9411b<V> abstractC9411b = this;
        boolean z11 = false;
        while (true) {
            if (f33883f.mo37184b(abstractC9411b, obj, cVar)) {
                if (z10) {
                    abstractC9411b.mo37181y();
                }
                m37163t(abstractC9411b);
                if (obj instanceof g) {
                    InterfaceFutureC9440x<? extends V> interfaceFutureC9440x = ((g) obj).f33904b;
                    if (interfaceFutureC9440x instanceof i) {
                        abstractC9411b = (AbstractC9411b) interfaceFutureC9440x;
                        obj = abstractC9411b.f33885a;
                        if ((obj == null) | (obj instanceof g)) {
                            z11 = true;
                        }
                    } else {
                        interfaceFutureC9440x.cancel(z10);
                    }
                }
                return true;
            }
            obj = abstractC9411b.f33885a;
            if (!(obj instanceof g)) {
                return z11;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.concurrent.Future
    public V get(long j10, TimeUnit timeUnit) throws InterruptedException, TimeoutException {
        long nanos = timeUnit.toNanos(j10);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.f33885a;
        if ((obj != null) && (!(obj instanceof g))) {
            return m37180v(obj);
        }
        long jNanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            l lVar = this.f33887c;
            if (lVar != l.f33911c) {
                l lVar2 = new l();
                while (true) {
                    lVar2.m37191a(lVar);
                    if (f33883f.mo37185c(this, lVar, lVar2)) {
                        do {
                            C9414c0.m37195a(this, nanos);
                            if (Thread.interrupted()) {
                                m37168C(lVar2);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.f33885a;
                            if ((obj2 != null) && (!(obj2 instanceof g))) {
                                return m37180v(obj2);
                            }
                            nanos = jNanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        m37168C(lVar2);
                        break;
                    }
                    lVar = this.f33887c;
                    if (lVar == l.f33911c) {
                    }
                }
            }
            Object obj3 = this.f33885a;
            Objects.requireNonNull(obj3);
            return m37180v(obj3);
        }
        while (nanos > 0) {
            Object obj4 = this.f33885a;
            if ((obj4 != null) && (!(obj4 instanceof g))) {
                return m37180v(obj4);
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
        return this.f33885a instanceof c;
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        Object obj = this.f33885a;
        return (!(obj instanceof g)) & (obj != null);
    }

    /* JADX INFO: renamed from: m */
    public final void m37175m(StringBuilder sb2) {
        try {
            Object objM37166x = m37166x(this);
            sb2.append("SUCCESS, result=[");
            m37177p(sb2, objM37166x);
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

    /* JADX INFO: renamed from: n */
    public final void m37176n(StringBuilder sb2) {
        String string;
        int length = sb2.length();
        sb2.append("PENDING");
        Object obj = this.f33885a;
        if (obj instanceof g) {
            sb2.append(", setFuture=[");
            m37178q(sb2, ((g) obj).f33904b);
            sb2.append("]");
        } else {
            try {
                string = C6388r.m27955a(mo37138A());
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
            m37175m(sb2);
        }
    }

    /* JADX INFO: renamed from: o */
    public void mo37141o() {
    }

    /* JADX INFO: renamed from: p */
    public final void m37177p(StringBuilder sb2, Object obj) {
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

    /* JADX INFO: renamed from: q */
    public final void m37178q(StringBuilder sb2, Object obj) {
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

    /* JADX INFO: renamed from: s */
    public final e m37179s(e eVar) {
        e eVar2 = eVar;
        e eVarMo37186d = f33883f.mo37186d(this, e.f33894d);
        while (eVarMo37186d != null) {
            e eVar3 = eVarMo37186d.f33897c;
            eVarMo37186d.f33897c = eVar2;
            eVar2 = eVarMo37186d;
            eVarMo37186d = eVar3;
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
            m37175m(sb2);
        } else {
            m37176n(sb2);
        }
        sb2.append("]");
        return sb2.toString();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.lang.Object */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: v */
    public final V m37180v(Object obj) throws ExecutionException {
        if (obj instanceof c) {
            throw m37162r("Task was cancelled.", ((c) obj).f33891b);
        }
        if (obj instanceof d) {
            throw new ExecutionException(((d) obj).f33893a);
        }
        return obj == f33884g ? (V) C9412b0.m37194b() : obj;
    }

    /* JADX INFO: renamed from: y */
    public void mo37181y() {
    }

    /* JADX INFO: renamed from: z */
    public final void m37182z(Future<?> future) {
        if ((future != null) && isCancelled()) {
            future.cancel(m37172G());
        }
    }

    /* JADX INFO: renamed from: ne.b$e */
    public static final class e {

        /* JADX INFO: renamed from: d */
        public static final e f33894d = new e();

        /* JADX INFO: renamed from: a */
        public final Runnable f33895a;

        /* JADX INFO: renamed from: b */
        public final Executor f33896b;

        /* JADX INFO: renamed from: c */
        public e f33897c;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public e(Runnable runnable, Executor executor) {
            this.f33895a = runnable;
            this.f33896b = executor;
        }

        public e() {
            this.f33895a = null;
            this.f33896b = null;
        }
    }

    @Override // java.util.concurrent.Future
    public V get() throws InterruptedException {
        Object obj;
        if (!Thread.interrupted()) {
            Object obj2 = this.f33885a;
            if ((obj2 != null) & (!(obj2 instanceof g))) {
                return m37180v(obj2);
            }
            l lVar = this.f33887c;
            if (lVar != l.f33911c) {
                l lVar2 = new l();
                do {
                    lVar2.m37191a(lVar);
                    if (f33883f.mo37185c(this, lVar, lVar2)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.f33885a;
                            } else {
                                m37168C(lVar2);
                                throw new InterruptedException();
                            }
                        } while (!((obj != null) & (!(obj instanceof g))));
                        return m37180v(obj);
                    }
                    lVar = this.f33887c;
                } while (lVar != l.f33911c);
            }
            Object obj3 = this.f33885a;
            Objects.requireNonNull(obj3);
            return m37180v(obj3);
        }
        throw new InterruptedException();
    }
}
