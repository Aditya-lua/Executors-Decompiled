package p397r0;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import ne.InterfaceFutureC9440x;
import p366q0.C10417c;
import p533x2.C12637g;
import p563y1.C12997c;

/* JADX INFO: renamed from: r0.p */
/* JADX INFO: loaded from: classes.dex */
public class C10775p<V> implements InterfaceFutureC9440x<List<V>> {

    /* JADX INFO: renamed from: a */
    public List<? extends InterfaceFutureC9440x<? extends V>> f38379a;

    /* JADX INFO: renamed from: b */
    public List<V> f38380b;

    /* JADX INFO: renamed from: c */
    public final boolean f38381c;

    /* JADX INFO: renamed from: d */
    public final AtomicInteger f38382d;

    /* JADX INFO: renamed from: e */
    public final InterfaceFutureC9440x<List<V>> f38383e = C12997c.m48311a(new a());

    /* JADX INFO: renamed from: f */
    public C12997c.a<List<V>> f38384f;

    /* JADX INFO: renamed from: r0.p$a */
    public class a implements C12997c.c<List<V>> {
        public a() {
        }

        @Override // p563y1.C12997c.c
        /* JADX INFO: renamed from: a */
        public Object mo22051a(C12997c.a<List<V>> aVar) {
            C12637g.m47078j(C10775p.this.f38384f == null, "The result can only set once!");
            C10775p.this.f38384f = aVar;
            return "ListFuture[" + this + "]";
        }
    }

    /* JADX INFO: renamed from: r0.p$b */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C10775p c10775p = C10775p.this;
            c10775p.f38380b = null;
            c10775p.f38379a = null;
        }
    }

    /* JADX INFO: renamed from: r0.p$c */
    public class c implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ int f38387a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ InterfaceFutureC9440x f38388b;

        /* JADX DEBUG: Incorrect args count in method signature: ()V */
        public c(int i10, InterfaceFutureC9440x interfaceFutureC9440x) {
            this.f38387a = i10;
            this.f38388b = interfaceFutureC9440x;
        }

        @Override // java.lang.Runnable
        public void run() {
            C10775p.this.m41010g(this.f38387a, this.f38388b);
        }
    }

    public C10775p(List<? extends InterfaceFutureC9440x<? extends V>> list, boolean z10, Executor executor) {
        this.f38379a = (List) C12637g.m47075g(list);
        this.f38380b = new ArrayList(list.size());
        this.f38381c = z10;
        this.f38382d = new AtomicInteger(list.size());
        m41009f(executor);
    }

    @Override // ne.InterfaceFutureC9440x
    /* JADX INFO: renamed from: a */
    public void mo37173a(Runnable runnable, Executor executor) {
        this.f38383e.mo37173a(runnable, executor);
    }

    /* JADX INFO: renamed from: c */
    public final void m41006c() throws InterruptedException {
        List<? extends InterfaceFutureC9440x<? extends V>> list = this.f38379a;
        if (list == null || isDone()) {
            return;
        }
        for (InterfaceFutureC9440x<? extends V> interfaceFutureC9440x : list) {
            while (!interfaceFutureC9440x.isDone()) {
                try {
                    interfaceFutureC9440x.get();
                } catch (Error e10) {
                    throw e10;
                } catch (InterruptedException e11) {
                    throw e11;
                } catch (Throwable unused) {
                    if (this.f38381c) {
                        return;
                    }
                }
            }
        }
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z10) {
        List<? extends InterfaceFutureC9440x<? extends V>> list = this.f38379a;
        if (list != null) {
            Iterator<? extends InterfaceFutureC9440x<? extends V>> it = list.iterator();
            while (it.hasNext()) {
                it.next().cancel(z10);
            }
        }
        return this.f38383e.cancel(z10);
    }

    /* JADX DEBUG: Method merged with bridge method: get()Ljava/lang/Object; */
    @Override // java.util.concurrent.Future
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public List<V> get() throws InterruptedException {
        m41006c();
        return this.f38383e.get();
    }

    /* JADX DEBUG: Method merged with bridge method: get(JLjava/util/concurrent/TimeUnit;)Ljava/lang/Object; */
    @Override // java.util.concurrent.Future
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public List<V> get(long j10, TimeUnit timeUnit) {
        return this.f38383e.get(j10, timeUnit);
    }

    /* JADX INFO: renamed from: f */
    public final void m41009f(Executor executor) {
        mo37173a(new b(), C10417c.m40081b());
        if (this.f38379a.isEmpty()) {
            this.f38384f.m48314c(new ArrayList(this.f38380b));
            return;
        }
        for (int i10 = 0; i10 < this.f38379a.size(); i10++) {
            this.f38380b.add(null);
        }
        List<? extends InterfaceFutureC9440x<? extends V>> list = this.f38379a;
        for (int i11 = 0; i11 < list.size(); i11++) {
            InterfaceFutureC9440x<? extends V> interfaceFutureC9440x = list.get(i11);
            interfaceFutureC9440x.mo37173a(new c(i11, interfaceFutureC9440x), executor);
        }
    }

    /* JADX INFO: renamed from: g */
    public void m41010g(int i10, Future<? extends V> future) {
        C12997c.a<List<V>> aVar;
        ArrayList arrayList;
        List<V> list = this.f38380b;
        if (isDone() || list == null) {
            C12637g.m47078j(this.f38381c, "Future was done before all dependencies completed");
            return;
        }
        try {
            try {
                try {
                    try {
                        try {
                            C12637g.m47078j(future.isDone(), "Tried to set value from future which is not done");
                            list.set(i10, (V) C10773n.m40990m(future));
                            int iDecrementAndGet = this.f38382d.decrementAndGet();
                            C12637g.m47078j(iDecrementAndGet >= 0, "Less than 0 remaining futures");
                            if (iDecrementAndGet == 0) {
                                List<V> list2 = this.f38380b;
                                if (list2 != null) {
                                    this.f38384f.m48314c(new ArrayList(list2));
                                } else {
                                    C12637g.m47077i(isDone());
                                }
                            }
                        } catch (ExecutionException e10) {
                            if (this.f38381c) {
                                this.f38384f.m48317f(e10.getCause());
                            }
                            int iDecrementAndGet2 = this.f38382d.decrementAndGet();
                            C12637g.m47078j(iDecrementAndGet2 >= 0, "Less than 0 remaining futures");
                            if (iDecrementAndGet2 == 0) {
                                List<V> list3 = this.f38380b;
                                if (list3 != null) {
                                    aVar = this.f38384f;
                                    arrayList = new ArrayList(list3);
                                    aVar.m48314c(arrayList);
                                    return;
                                }
                                C12637g.m47077i(isDone());
                            }
                        }
                    } catch (CancellationException unused) {
                        if (this.f38381c) {
                            cancel(false);
                        }
                        int iDecrementAndGet3 = this.f38382d.decrementAndGet();
                        C12637g.m47078j(iDecrementAndGet3 >= 0, "Less than 0 remaining futures");
                        if (iDecrementAndGet3 == 0) {
                            List<V> list4 = this.f38380b;
                            if (list4 != null) {
                                aVar = this.f38384f;
                                arrayList = new ArrayList(list4);
                                aVar.m48314c(arrayList);
                                return;
                            }
                            C12637g.m47077i(isDone());
                        }
                    }
                } catch (Error e11) {
                    this.f38384f.m48317f(e11);
                    int iDecrementAndGet4 = this.f38382d.decrementAndGet();
                    C12637g.m47078j(iDecrementAndGet4 >= 0, "Less than 0 remaining futures");
                    if (iDecrementAndGet4 == 0) {
                        List<V> list5 = this.f38380b;
                        if (list5 != null) {
                            aVar = this.f38384f;
                            arrayList = new ArrayList(list5);
                            aVar.m48314c(arrayList);
                            return;
                        }
                        C12637g.m47077i(isDone());
                    }
                }
            } catch (RuntimeException e12) {
                if (this.f38381c) {
                    this.f38384f.m48317f(e12);
                }
                int iDecrementAndGet5 = this.f38382d.decrementAndGet();
                C12637g.m47078j(iDecrementAndGet5 >= 0, "Less than 0 remaining futures");
                if (iDecrementAndGet5 == 0) {
                    List<V> list6 = this.f38380b;
                    if (list6 != null) {
                        aVar = this.f38384f;
                        arrayList = new ArrayList(list6);
                        aVar.m48314c(arrayList);
                        return;
                    }
                    C12637g.m47077i(isDone());
                }
            }
        } catch (Throwable th2) {
            int iDecrementAndGet6 = this.f38382d.decrementAndGet();
            C12637g.m47078j(iDecrementAndGet6 >= 0, "Less than 0 remaining futures");
            if (iDecrementAndGet6 == 0) {
                List<V> list7 = this.f38380b;
                if (list7 != null) {
                    this.f38384f.m48314c(new ArrayList(list7));
                } else {
                    C12637g.m47077i(isDone());
                }
            }
            throw th2;
        }
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return this.f38383e.isCancelled();
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        return this.f38383e.isDone();
    }
}
