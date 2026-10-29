package ne;

import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.AbstractOwnableSynchronizer;
import java.util.concurrent.locks.LockSupport;

/* JADX INFO: renamed from: ne.w */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractRunnableC9439w<T> extends AtomicReference<Runnable> implements Runnable {

    /* JADX INFO: renamed from: a */
    public static final Runnable f33966a;

    /* JADX INFO: renamed from: b */
    public static final Runnable f33967b;

    /* JADX INFO: renamed from: ne.w$b */
    public static final class b extends AbstractOwnableSynchronizer implements Runnable {

        /* JADX INFO: renamed from: a */
        public final AbstractRunnableC9439w<?> f33968a;

        /* JADX INFO: renamed from: b */
        public final void m37275b(Thread thread) {
            super.setExclusiveOwnerThread(thread);
        }

        @Override // java.lang.Runnable
        public void run() {
        }

        public String toString() {
            return this.f33968a.toString();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public b(AbstractRunnableC9439w<?> abstractRunnableC9439w) {
            this.f33968a = abstractRunnableC9439w;
        }
    }

    /* JADX INFO: renamed from: ne.w$c */
    public static final class c implements Runnable {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public c() {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    static {
        f33966a = new c();
        f33967b = new c();
    }

    /* JADX INFO: renamed from: a */
    public abstract void mo37229a(Throwable th2);

    /* JADX INFO: renamed from: b */
    public abstract void mo37230b(T t8);

    /* JADX INFO: renamed from: c */
    public final void m37272c() {
        Runnable runnable = get();
        if (runnable instanceof Thread) {
            b bVar = new b();
            bVar.m37275b(Thread.currentThread());
            if (compareAndSet(runnable, bVar)) {
                try {
                    ((Thread) runnable).interrupt();
                } finally {
                    if (getAndSet(f33966a) == f33967b) {
                        LockSupport.unpark((Thread) runnable);
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public abstract boolean mo37231d();

    /* JADX INFO: renamed from: e */
    public abstract T mo37232e();

    /* JADX INFO: renamed from: f */
    public abstract String mo37233f();

    /* JADX INFO: renamed from: g */
    public final void m37273g(Thread thread) {
        Runnable runnable = get();
        b bVar = null;
        boolean z10 = false;
        int i10 = 0;
        while (true) {
            boolean z11 = runnable instanceof b;
            if (!z11 && runnable != f33967b) {
                break;
            }
            if (z11) {
                bVar = (b) runnable;
            }
            i10++;
            if (i10 > 1000) {
                Runnable runnable2 = f33967b;
                if (runnable == runnable2 || compareAndSet(runnable, runnable2)) {
                    z10 = Thread.interrupted() || z10;
                    LockSupport.park(bVar);
                }
            } else {
                Thread.yield();
            }
            runnable = get();
        }
        if (z10) {
            thread.interrupt();
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: ne.w<T> */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        Thread threadCurrentThread = Thread.currentThread();
        Object objMo37232e = null;
        if (compareAndSet(null, threadCurrentThread)) {
            boolean zMo37231d = mo37231d();
            if (!zMo37231d) {
                try {
                    objMo37232e = mo37232e();
                } catch (Throwable th2) {
                    if (!compareAndSet(threadCurrentThread, f33966a)) {
                        m37273g(threadCurrentThread);
                    }
                    if (zMo37231d) {
                        return;
                    }
                    mo37229a(th2);
                    return;
                }
            }
            if (!compareAndSet(threadCurrentThread, f33966a)) {
                m37273g(threadCurrentThread);
            }
            if (zMo37231d) {
                return;
            }
            mo37230b(C9412b0.m37193a(objMo37232e));
        }
    }

    @Override // java.util.concurrent.atomic.AtomicReference
    public final String toString() {
        String string;
        Runnable runnable = get();
        if (runnable == f33966a) {
            string = "running=[DONE]";
        } else if (runnable instanceof b) {
            string = "running=[INTERRUPTED]";
        } else if (runnable instanceof Thread) {
            String name = ((Thread) runnable).getName();
            StringBuilder sb2 = new StringBuilder(String.valueOf(name).length() + 21);
            sb2.append("running=[RUNNING ON ");
            sb2.append(name);
            sb2.append("]");
            string = sb2.toString();
        } else {
            string = "running=[NOT STARTED YET]";
        }
        String strMo37233f = mo37233f();
        StringBuilder sb3 = new StringBuilder(String.valueOf(string).length() + 2 + String.valueOf(strMo37233f).length());
        sb3.append(string);
        sb3.append(", ");
        sb3.append(strMo37233f);
        return sb3.toString();
    }
}
