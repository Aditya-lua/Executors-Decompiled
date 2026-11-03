package r0;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import ne.x;

/* JADX INFO: loaded from: classes.dex */
public class p<V> implements x<List<V>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public List<? extends x<? extends V>> f30126a;
    public List<V> b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f30127c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AtomicInteger f30128d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final x<List<V>> f30129e = y1.c.a(new a());

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public y1.c.a<List<V>> f30130f;

    public class a implements y1.c.InterfaceC0665c<List<V>> {
        public a() {
        }

        @Override // y1.c.InterfaceC0665c
        public Object a(y1.c.a<List<V>> aVar) {
            x2.g.j(p.this.f30130f == null, "The result can only set once!");
            p.this.f30130f = aVar;
            return "ListFuture[" + this + "]";
        }
    }

    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            p pVar = p.this;
            pVar.b = null;
            pVar.f30126a = null;
        }
    }

    public class c implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f30133a;
        public final /* synthetic */ x b;

        public c(int i10, x xVar) {
            this.f30133a = i10;
            this.b = xVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            p.this.g(this.f30133a, this.b);
        }
    }

    public p(List<? extends x<? extends V>> list, boolean z10, Executor executor) {
        this.f30126a = (List) x2.g.g(list);
        this.b = new ArrayList(list.size());
        this.f30127c = z10;
        this.f30128d = new AtomicInteger(list.size());
        f(executor);
    }

    @Override // ne.x
    public void a(Runnable runnable, Executor executor) {
        this.f30129e.a(runnable, executor);
    }

    public final void c() throws InterruptedException {
        List<? extends x<? extends V>> list = this.f30126a;
        if (list == null || isDone()) {
            return;
        }
        for (x<? extends V> xVar : list) {
            while (!xVar.isDone()) {
                try {
                    xVar.get();
                } catch (Error e10) {
                    throw e10;
                } catch (InterruptedException e11) {
                    throw e11;
                } catch (Throwable unused) {
                    if (this.f30127c) {
                        return;
                    }
                }
            }
        }
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z10) {
        List<? extends x<? extends V>> list = this.f30126a;
        if (list != null) {
            Iterator<? extends x<? extends V>> it = list.iterator();
            while (it.hasNext()) {
                it.next().cancel(z10);
            }
        }
        return this.f30129e.cancel(z10);
    }

    @Override // java.util.concurrent.Future
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public List<V> get() throws InterruptedException {
        c();
        return this.f30129e.get();
    }

    @Override // java.util.concurrent.Future
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public List<V> get(long j10, TimeUnit timeUnit) {
        return this.f30129e.get(j10, timeUnit);
    }

    public final void f(Executor executor) {
        a(new b(), q0.c.b());
        if (this.f30126a.isEmpty()) {
            this.f30130f.c(new ArrayList(this.b));
            return;
        }
        for (int i10 = 0; i10 < this.f30126a.size(); i10++) {
            this.b.add(null);
        }
        List<? extends x<? extends V>> list = this.f30126a;
        for (int i11 = 0; i11 < list.size(); i11++) {
            x<? extends V> xVar = list.get(i11);
            xVar.a(new c(i11, xVar), executor);
        }
    }

    public void g(int i10, Future<? extends V> future) {
        y1.c.a<List<V>> aVar;
        ArrayList arrayList;
        List<V> list = this.b;
        if (isDone() || list == null) {
            x2.g.j(this.f30127c, "Future was done before all dependencies completed");
            return;
        }
        try {
            try {
                try {
                    try {
                        try {
                            x2.g.j(future.isDone(), "Tried to set value from future which is not done");
                            list.set(i10, (V) n.m(future));
                            int iDecrementAndGet = this.f30128d.decrementAndGet();
                            x2.g.j(iDecrementAndGet >= 0, "Less than 0 remaining futures");
                            if (iDecrementAndGet == 0) {
                                List<V> list2 = this.b;
                                if (list2 != null) {
                                    this.f30130f.c(new ArrayList(list2));
                                } else {
                                    x2.g.i(isDone());
                                }
                            }
                        } catch (ExecutionException e10) {
                            if (this.f30127c) {
                                this.f30130f.f(e10.getCause());
                            }
                            int iDecrementAndGet2 = this.f30128d.decrementAndGet();
                            x2.g.j(iDecrementAndGet2 >= 0, "Less than 0 remaining futures");
                            if (iDecrementAndGet2 == 0) {
                                List<V> list3 = this.b;
                                if (list3 != null) {
                                    aVar = this.f30130f;
                                    arrayList = new ArrayList(list3);
                                    aVar.c(arrayList);
                                    return;
                                }
                                x2.g.i(isDone());
                            }
                        }
                    } catch (CancellationException unused) {
                        if (this.f30127c) {
                            cancel(false);
                        }
                        int iDecrementAndGet3 = this.f30128d.decrementAndGet();
                        x2.g.j(iDecrementAndGet3 >= 0, "Less than 0 remaining futures");
                        if (iDecrementAndGet3 == 0) {
                            List<V> list4 = this.b;
                            if (list4 != null) {
                                aVar = this.f30130f;
                                arrayList = new ArrayList(list4);
                                aVar.c(arrayList);
                                return;
                            }
                            x2.g.i(isDone());
                        }
                    }
                } catch (Error e11) {
                    this.f30130f.f(e11);
                    int iDecrementAndGet4 = this.f30128d.decrementAndGet();
                    x2.g.j(iDecrementAndGet4 >= 0, "Less than 0 remaining futures");
                    if (iDecrementAndGet4 == 0) {
                        List<V> list5 = this.b;
                        if (list5 != null) {
                            aVar = this.f30130f;
                            arrayList = new ArrayList(list5);
                            aVar.c(arrayList);
                            return;
                        }
                        x2.g.i(isDone());
                    }
                }
            } catch (RuntimeException e12) {
                if (this.f30127c) {
                    this.f30130f.f(e12);
                }
                int iDecrementAndGet5 = this.f30128d.decrementAndGet();
                x2.g.j(iDecrementAndGet5 >= 0, "Less than 0 remaining futures");
                if (iDecrementAndGet5 == 0) {
                    List<V> list6 = this.b;
                    if (list6 != null) {
                        aVar = this.f30130f;
                        arrayList = new ArrayList(list6);
                        aVar.c(arrayList);
                        return;
                    }
                    x2.g.i(isDone());
                }
            }
        } catch (Throwable th2) {
            int iDecrementAndGet6 = this.f30128d.decrementAndGet();
            x2.g.j(iDecrementAndGet6 >= 0, "Less than 0 remaining futures");
            if (iDecrementAndGet6 == 0) {
                List<V> list7 = this.b;
                if (list7 != null) {
                    this.f30130f.c(new ArrayList(list7));
                } else {
                    x2.g.i(isDone());
                }
            }
            throw th2;
        }
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return this.f30129e.isCancelled();
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        return this.f30129e.isDone();
    }
}
