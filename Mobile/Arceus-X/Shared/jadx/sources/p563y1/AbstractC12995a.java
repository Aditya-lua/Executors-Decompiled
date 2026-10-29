package p563y1;

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
import ne.InterfaceFutureC9440x;

/* JADX INFO: renamed from: y1.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC12995a<V> implements InterfaceFutureC9440x<V> {

    /* JADX INFO: renamed from: d */
    public static final boolean f45995d = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));

    /* JADX INFO: renamed from: e */
    public static final Logger f45996e = Logger.getLogger(AbstractC12995a.class.getName());

    /* JADX INFO: renamed from: f */
    public static final b f45997f;

    /* JADX INFO: renamed from: g */
    public static final Object f45998g;

    /* JADX INFO: renamed from: a */
    public volatile Object f45999a;

    /* JADX INFO: renamed from: b */
    public volatile e f46000b;

    /* JADX INFO: renamed from: c */
    public volatile i f46001c;

    /* JADX INFO: renamed from: y1.a$b */
    public static abstract class b {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public b() {
        }

        /* JADX INFO: renamed from: a */
        public abstract boolean mo48303a(AbstractC12995a<?> abstractC12995a, e eVar, e eVar2);

        /* JADX INFO: renamed from: b */
        public abstract boolean mo48304b(AbstractC12995a<?> abstractC12995a, Object obj, Object obj2);

        /* JADX INFO: renamed from: c */
        public abstract boolean mo48305c(AbstractC12995a<?> abstractC12995a, i iVar, i iVar2);

        /* JADX INFO: renamed from: d */
        public abstract void mo48306d(i iVar, i iVar2);

        /* JADX INFO: renamed from: e */
        public abstract void mo48307e(i iVar, Thread thread);
    }

    /* JADX INFO: renamed from: y1.a$c */
    public static final class c {

        /* JADX INFO: renamed from: c */
        public static final c f46002c;

        /* JADX INFO: renamed from: d */
        public static final c f46003d;

        /* JADX INFO: renamed from: a */
        public final boolean f46004a;

        /* JADX INFO: renamed from: b */
        public final Throwable f46005b;

        static {
            if (AbstractC12995a.f45995d) {
                f46003d = null;
                f46002c = null;
            } else {
                f46003d = new c(false, null);
                f46002c = new c(true, null);
            }
        }

        public c(boolean z10, Throwable th2) {
            this.f46004a = z10;
            this.f46005b = th2;
        }
    }

    /* JADX INFO: renamed from: y1.a$d */
    public static final class d {

        /* JADX INFO: renamed from: b */
        public static final d f46006b = new d(new a("Failure occurred while trying to finish a future."));

        /* JADX INFO: renamed from: a */
        public final Throwable f46007a;

        /* JADX INFO: renamed from: y1.a$d$a */
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
            this.f46007a = (Throwable) AbstractC12995a.m48288h(th2);
        }
    }

    /* JADX INFO: renamed from: y1.a$e */
    public static final class e {

        /* JADX INFO: renamed from: d */
        public static final e f46008d = new e(null, null);

        /* JADX INFO: renamed from: a */
        public final Runnable f46009a;

        /* JADX INFO: renamed from: b */
        public final Executor f46010b;

        /* JADX INFO: renamed from: c */
        public e f46011c;

        public e(Runnable runnable, Executor executor) {
            this.f46009a = runnable;
            this.f46010b = executor;
        }
    }

    /* JADX INFO: renamed from: y1.a$f */
    public static final class f extends b {

        /* JADX INFO: renamed from: a */
        public final AtomicReferenceFieldUpdater<i, Thread> f46012a;

        /* JADX INFO: renamed from: b */
        public final AtomicReferenceFieldUpdater<i, i> f46013b;

        /* JADX INFO: renamed from: c */
        public final AtomicReferenceFieldUpdater<AbstractC12995a, i> f46014c;

        /* JADX INFO: renamed from: d */
        public final AtomicReferenceFieldUpdater<AbstractC12995a, e> f46015d;

        /* JADX INFO: renamed from: e */
        public final AtomicReferenceFieldUpdater<AbstractC12995a, Object> f46016e;

        public f(AtomicReferenceFieldUpdater<i, Thread> atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater<i, i> atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater<AbstractC12995a, i> atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater<AbstractC12995a, e> atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater<AbstractC12995a, Object> atomicReferenceFieldUpdater5) {
            super();
            this.f46012a = atomicReferenceFieldUpdater;
            this.f46013b = atomicReferenceFieldUpdater2;
            this.f46014c = atomicReferenceFieldUpdater3;
            this.f46015d = atomicReferenceFieldUpdater4;
            this.f46016e = atomicReferenceFieldUpdater5;
        }

        @Override // p563y1.AbstractC12995a.b
        /* JADX INFO: renamed from: a */
        public boolean mo48303a(AbstractC12995a<?> abstractC12995a, e eVar, e eVar2) {
            return C12996b.m48310a(this.f46015d, abstractC12995a, eVar, eVar2);
        }

        @Override // p563y1.AbstractC12995a.b
        /* JADX INFO: renamed from: b */
        public boolean mo48304b(AbstractC12995a<?> abstractC12995a, Object obj, Object obj2) {
            return C12996b.m48310a(this.f46016e, abstractC12995a, obj, obj2);
        }

        @Override // p563y1.AbstractC12995a.b
        /* JADX INFO: renamed from: c */
        public boolean mo48305c(AbstractC12995a<?> abstractC12995a, i iVar, i iVar2) {
            return C12996b.m48310a(this.f46014c, abstractC12995a, iVar, iVar2);
        }

        @Override // p563y1.AbstractC12995a.b
        /* JADX INFO: renamed from: d */
        public void mo48306d(i iVar, i iVar2) {
            this.f46013b.lazySet(iVar, iVar2);
        }

        @Override // p563y1.AbstractC12995a.b
        /* JADX INFO: renamed from: e */
        public void mo48307e(i iVar, Thread thread) {
            this.f46012a.lazySet(iVar, thread);
        }
    }

    /* JADX INFO: renamed from: y1.a$g */
    public static final class g<V> implements Runnable {

        /* JADX INFO: renamed from: a */
        public final AbstractC12995a<V> f46017a;

        /* JADX INFO: renamed from: b */
        public final InterfaceFutureC9440x<? extends V> f46018b;
    }

    /* JADX INFO: renamed from: y1.a$h */
    public static final class h extends b {
        public h() {
            super();
        }

        @Override // p563y1.AbstractC12995a.b
        /* JADX INFO: renamed from: a */
        public boolean mo48303a(AbstractC12995a<?> abstractC12995a, e eVar, e eVar2) {
            synchronized (abstractC12995a) {
                try {
                    if (abstractC12995a.f46000b != eVar) {
                        return false;
                    }
                    abstractC12995a.f46000b = eVar2;
                    return true;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // p563y1.AbstractC12995a.b
        /* JADX INFO: renamed from: b */
        public boolean mo48304b(AbstractC12995a<?> abstractC12995a, Object obj, Object obj2) {
            synchronized (abstractC12995a) {
                try {
                    if (abstractC12995a.f45999a != obj) {
                        return false;
                    }
                    abstractC12995a.f45999a = obj2;
                    return true;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // p563y1.AbstractC12995a.b
        /* JADX INFO: renamed from: c */
        public boolean mo48305c(AbstractC12995a<?> abstractC12995a, i iVar, i iVar2) {
            synchronized (abstractC12995a) {
                try {
                    if (abstractC12995a.f46001c != iVar) {
                        return false;
                    }
                    abstractC12995a.f46001c = iVar2;
                    return true;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // p563y1.AbstractC12995a.b
        /* JADX INFO: renamed from: d */
        public void mo48306d(i iVar, i iVar2) {
            iVar.f46021b = iVar2;
        }

        @Override // p563y1.AbstractC12995a.b
        /* JADX INFO: renamed from: e */
        public void mo48307e(i iVar, Thread thread) {
            iVar.f46020a = thread;
        }
    }

    /* JADX INFO: renamed from: y1.a$i */
    public static final class i {

        /* JADX INFO: renamed from: c */
        public static final i f46019c = new i(false);

        /* JADX INFO: renamed from: a */
        public volatile Thread f46020a;

        /* JADX INFO: renamed from: b */
        public volatile i f46021b;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public i(boolean z10) {
        }

        /* JADX INFO: renamed from: a */
        public void m48308a(i iVar) {
            AbstractC12995a.f45997f.mo48306d(this, iVar);
        }

        /* JADX INFO: renamed from: b */
        public void m48309b() {
            Thread thread = this.f46020a;
            if (thread != null) {
                this.f46020a = null;
                LockSupport.unpark(thread);
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public i() {
            AbstractC12995a.f45997f.mo48307e(this, Thread.currentThread());
        }
    }

    static {
        b hVar;
        try {
            hVar = new f(AtomicReferenceFieldUpdater.newUpdater(i.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(i.class, i.class, "b"), AtomicReferenceFieldUpdater.newUpdater(AbstractC12995a.class, i.class, "c"), AtomicReferenceFieldUpdater.newUpdater(AbstractC12995a.class, e.class, "b"), AtomicReferenceFieldUpdater.newUpdater(AbstractC12995a.class, Object.class, "a"));
            th = null;
        } catch (Throwable th2) {
            th = th2;
            hVar = new h();
        }
        f45997f = hVar;
        if (th != null) {
            f45996e.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        f45998g = new Object();
    }

    /* JADX INFO: renamed from: c */
    private void m48286c(StringBuilder sb2) {
        try {
            Object objM48293r = m48293r(this);
            sb2.append("SUCCESS, result=[");
            sb2.append(m48302z(objM48293r));
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

    /* JADX INFO: renamed from: e */
    private static CancellationException m48287e(String str, Throwable th2) {
        CancellationException cancellationException = new CancellationException(str);
        cancellationException.initCause(th2);
        return cancellationException;
    }

    @NonNull
    /* JADX INFO: renamed from: h */
    public static <T> T m48288h(T t8) {
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
    /* JADX INFO: renamed from: l */
    public static void m48289l(AbstractC12995a<?> abstractC12995a) {
        e eVar = null;
        while (true) {
            abstractC12995a.m48294v();
            abstractC12995a.mo37294d();
            e eVarM48296j = abstractC12995a.m48296j(eVar);
            while (eVarM48296j != null) {
                eVar = eVarM48296j.f46011c;
                Runnable runnable = eVarM48296j.f46009a;
                if (runnable instanceof g) {
                    g gVar = (g) runnable;
                    abstractC12995a = gVar.f46017a;
                    if (abstractC12995a.f45999a == gVar) {
                        if (f45997f.mo48304b(abstractC12995a, gVar, m48292q(gVar.f46018b))) {
                        }
                    } else {
                        continue;
                    }
                } else {
                    m48290n(runnable, eVarM48296j.f46010b);
                }
                eVarM48296j = eVar;
            }
            return;
        }
    }

    /* JADX INFO: renamed from: n */
    private static void m48290n(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e10) {
            f45996e.log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e10);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.lang.Object */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: o */
    private V m48291o(Object obj) throws ExecutionException {
        if (obj instanceof c) {
            throw m48287e("Task was cancelled.", ((c) obj).f46005b);
        }
        if (obj instanceof d) {
            throw new ExecutionException(((d) obj).f46007a);
        }
        if (obj == f45998g) {
            return null;
        }
        return obj;
    }

    /* JADX INFO: renamed from: q */
    public static Object m48292q(InterfaceFutureC9440x<?> interfaceFutureC9440x) {
        if (interfaceFutureC9440x instanceof AbstractC12995a) {
            Object obj = ((AbstractC12995a) interfaceFutureC9440x).f45999a;
            if (!(obj instanceof c)) {
                return obj;
            }
            c cVar = (c) obj;
            if (cVar.f46004a) {
                return cVar.f46005b != null ? new c(false, cVar.f46005b) : c.f46003d;
            }
            return obj;
        }
        boolean zIsCancelled = interfaceFutureC9440x.isCancelled();
        if ((!f45995d) && zIsCancelled) {
            return c.f46003d;
        }
        try {
            Object objM48293r = m48293r(interfaceFutureC9440x);
            return objM48293r == null ? f45998g : objM48293r;
        } catch (CancellationException e10) {
            if (zIsCancelled) {
                return new c(false, e10);
            }
            return new d(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: " + interfaceFutureC9440x, e10));
        } catch (ExecutionException e11) {
            return new d(e11.getCause());
        } catch (Throwable th2) {
            return new d(th2);
        }
    }

    /* JADX INFO: renamed from: r */
    public static <V> V m48293r(Future<V> future) {
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

    /* JADX INFO: renamed from: v */
    private void m48294v() {
        i iVar;
        do {
            iVar = this.f46001c;
        } while (!f45997f.mo48305c(this, iVar, i.f46019c));
        while (iVar != null) {
            iVar.m48309b();
            iVar = iVar.f46021b;
        }
    }

    /* JADX INFO: renamed from: A */
    public final boolean m48295A() {
        Object obj = this.f45999a;
        return (obj instanceof c) && ((c) obj).f46004a;
    }

    @Override // ne.InterfaceFutureC9440x
    /* JADX INFO: renamed from: a */
    public final void mo37173a(Runnable runnable, Executor executor) {
        m48288h(runnable);
        m48288h(executor);
        e eVar = this.f46000b;
        if (eVar != e.f46008d) {
            e eVar2 = new e(runnable, executor);
            do {
                eVar2.f46011c = eVar;
                if (f45997f.mo48303a(this, eVar, eVar2)) {
                    return;
                } else {
                    eVar = this.f46000b;
                }
            } while (eVar != e.f46008d);
        }
        m48290n(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z10) {
        c cVar;
        Object obj = this.f45999a;
        if (!(obj == null) && !(obj instanceof g)) {
            return false;
        }
        if (f45995d) {
            cVar = new c(z10, new CancellationException("Future.cancel() was called."));
        } else {
            cVar = z10 ? c.f46002c : c.f46003d;
        }
        AbstractC12995a<V> abstractC12995a = this;
        boolean z11 = false;
        while (true) {
            if (f45997f.mo48304b(abstractC12995a, obj, cVar)) {
                if (z10) {
                    abstractC12995a.m48297s();
                }
                m48289l(abstractC12995a);
                if (obj instanceof g) {
                    InterfaceFutureC9440x<? extends V> interfaceFutureC9440x = ((g) obj).f46018b;
                    if (interfaceFutureC9440x instanceof AbstractC12995a) {
                        abstractC12995a = (AbstractC12995a) interfaceFutureC9440x;
                        obj = abstractC12995a.f45999a;
                        if ((obj == null) | (obj instanceof g)) {
                            z11 = true;
                        }
                    } else {
                        interfaceFutureC9440x.cancel(z10);
                    }
                }
                return true;
            }
            obj = abstractC12995a.f45999a;
            if (!(obj instanceof g)) {
                return z11;
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public void mo37294d() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.concurrent.Future
    public final V get(long j10, TimeUnit timeUnit) throws InterruptedException, TimeoutException {
        long nanos = timeUnit.toNanos(j10);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.f45999a;
        if ((obj != null) && (!(obj instanceof g))) {
            return m48291o(obj);
        }
        long jNanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            i iVar = this.f46001c;
            if (iVar != i.f46019c) {
                i iVar2 = new i();
                while (true) {
                    iVar2.m48308a(iVar);
                    if (f45997f.mo48305c(this, iVar, iVar2)) {
                        do {
                            LockSupport.parkNanos(this, nanos);
                            if (Thread.interrupted()) {
                                m48299w(iVar2);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.f45999a;
                            if ((obj2 != null) && (!(obj2 instanceof g))) {
                                return m48291o(obj2);
                            }
                            nanos = jNanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        m48299w(iVar2);
                        break;
                    }
                    iVar = this.f46001c;
                    if (iVar == i.f46019c) {
                    }
                }
            }
            return m48291o(this.f45999a);
        }
        while (nanos > 0) {
            Object obj3 = this.f45999a;
            if ((obj3 != null) && (!(obj3 instanceof g))) {
                return m48291o(obj3);
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
        return this.f45999a instanceof c;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        Object obj = this.f45999a;
        return (!(obj instanceof g)) & (obj != null);
    }

    /* JADX INFO: renamed from: j */
    public final e m48296j(e eVar) {
        e eVar2;
        do {
            eVar2 = this.f46000b;
        } while (!f45997f.mo48303a(this, eVar2, e.f46008d));
        e eVar3 = eVar;
        e eVar4 = eVar2;
        while (eVar4 != null) {
            e eVar5 = eVar4.f46011c;
            eVar4.f46011c = eVar3;
            eVar3 = eVar4;
            eVar4 = eVar5;
        }
        return eVar3;
    }

    /* JADX INFO: renamed from: s */
    public void m48297s() {
    }

    public String toString() {
        String strMo48298u;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        sb2.append("[status=");
        if (isCancelled()) {
            sb2.append("CANCELLED");
        } else if (isDone()) {
            m48286c(sb2);
        } else {
            try {
                strMo48298u = mo48298u();
            } catch (RuntimeException e10) {
                strMo48298u = "Exception thrown from implementation: " + e10.getClass();
            }
            if (strMo48298u != null && !strMo48298u.isEmpty()) {
                sb2.append("PENDING, info=[");
                sb2.append(strMo48298u);
                sb2.append("]");
            } else if (isDone()) {
                m48286c(sb2);
            } else {
                sb2.append("PENDING");
            }
        }
        sb2.append("]");
        return sb2.toString();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: y1.a<V> */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: u */
    public String mo48298u() {
        Object obj = this.f45999a;
        if (obj instanceof g) {
            return "setFuture=[" + m48302z(((g) obj).f46018b) + "]";
        }
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
    }

    /* JADX INFO: renamed from: w */
    public final void m48299w(i iVar) {
        iVar.f46020a = null;
        while (true) {
            i iVar2 = this.f46001c;
            if (iVar2 == i.f46019c) {
                return;
            }
            i iVar3 = null;
            while (iVar2 != null) {
                i iVar4 = iVar2.f46021b;
                if (iVar2.f46020a != null) {
                    iVar3 = iVar2;
                } else if (iVar3 != null) {
                    iVar3.f46021b = iVar4;
                    if (iVar3.f46020a == null) {
                    }
                } else if (!f45997f.mo48305c(this, iVar2, iVar4)) {
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
    /* JADX INFO: renamed from: x */
    public boolean mo48300x(V v5) {
        if (v5 == null) {
            v5 = (V) f45998g;
        }
        if (!f45997f.mo48304b(this, null, v5)) {
            return false;
        }
        m48289l(this);
        return true;
    }

    /* JADX INFO: renamed from: y */
    public boolean mo48301y(Throwable th2) {
        if (!f45997f.mo48304b(this, null, new d((Throwable) m48288h(th2)))) {
            return false;
        }
        m48289l(this);
        return true;
    }

    /* JADX INFO: renamed from: z */
    public final String m48302z(Object obj) {
        return obj == this ? "this future" : String.valueOf(obj);
    }

    @Override // java.util.concurrent.Future
    public final V get() throws InterruptedException {
        Object obj;
        if (!Thread.interrupted()) {
            Object obj2 = this.f45999a;
            if ((obj2 != null) & (!(obj2 instanceof g))) {
                return m48291o(obj2);
            }
            i iVar = this.f46001c;
            if (iVar != i.f46019c) {
                i iVar2 = new i();
                do {
                    iVar2.m48308a(iVar);
                    if (f45997f.mo48305c(this, iVar, iVar2)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.f45999a;
                            } else {
                                m48299w(iVar2);
                                throw new InterruptedException();
                            }
                        } while (!((obj != null) & (!(obj instanceof g))));
                        return m48291o(obj);
                    }
                    iVar = this.f46001c;
                } while (iVar != i.f46019c);
            }
            return m48291o(this.f45999a);
        }
        throw new InterruptedException();
    }
}
