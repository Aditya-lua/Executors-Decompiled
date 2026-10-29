package n0;

import android.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public abstract class b implements a3<List<g0.s>> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public List<g0.s> f24596c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f24595a = new Object();
    public final List<a> b = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Throwable f24597d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f24598e = false;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Executor f24599a;
        public final a3.a<? super List<g0.s>> b;

        public a(Executor executor, a3.a<? super List<g0.s>> aVar) {
            this.f24599a = executor;
            this.b = aVar;
        }
    }

    public b(List<String> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(g0.s.a(it.next()));
        }
        this.f24596c = arrayList;
    }

    public static /* synthetic */ void a(Throwable th2, a aVar, List list) {
        if (th2 != null) {
            aVar.b.onError(th2);
        } else {
            aVar.b.a(list);
        }
    }

    @Override // n0.a3
    public void c(Executor executor, a3.a<? super List<g0.s>> aVar) {
        List<g0.s> listUnmodifiableList;
        Throwable th2;
        x2.g.g(executor);
        x2.g.g(aVar);
        this.b.add(new a(executor, aVar));
        synchronized (this.f24595a) {
            try {
                if (!this.f24598e && !this.b.isEmpty()) {
                    Log.i("CameraPresenceSrc", "First observer added. Starting monitoring.");
                    this.f24598e = true;
                    g();
                }
                listUnmodifiableList = Collections.unmodifiableList(this.f24596c);
                th2 = this.f24597d;
            } catch (Throwable th3) {
                throw th3;
            }
        }
        f(new a(executor, aVar), listUnmodifiableList, th2);
    }

    @Override // n0.a3
    public void d(a3.a<? super List<g0.s>> aVar) {
        a next;
        x2.g.g(aVar);
        Iterator<a> it = this.b.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!next.b.equals(aVar));
        if (next != null) {
            this.b.remove(next);
        }
        synchronized (this.f24595a) {
            try {
                if (this.f24598e && this.b.isEmpty()) {
                    Log.i("CameraPresenceSrc", "Last observer removed. Stopping monitoring.");
                    this.f24598e = false;
                    h();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void f(final a aVar, final List<g0.s> list, final Throwable th2) {
        aVar.f24599a.execute(new Runnable() { // from class: n0.a
            @Override // java.lang.Runnable
            public final void run() {
                b.a(th2, aVar, list);
            }
        });
    }

    public abstract void g();

    public abstract void h();

    public void i(List<g0.s> list) {
        k(list, null);
    }

    public void j(Throwable th2) {
        k(null, th2);
    }

    public final void k(List<g0.s> list, Throwable th2) {
        boolean z10;
        List<g0.s> listUnmodifiableList;
        Throwable th3;
        synchronized (this.f24595a) {
            try {
                if (th2 != null) {
                    z10 = this.f24597d == null || !this.f24596c.isEmpty();
                    this.f24597d = th2;
                    this.f24596c = Collections.EMPTY_LIST;
                } else {
                    x2.g.g(list);
                    boolean z11 = (this.f24597d == null && this.f24596c.equals(list)) ? false : true;
                    this.f24597d = null;
                    this.f24596c = list;
                    z10 = z11;
                }
                listUnmodifiableList = Collections.unmodifiableList(this.f24596c);
                th3 = this.f24597d;
            } catch (Throwable th4) {
                throw th4;
            }
        }
        if (z10) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Data changed. Notifying ");
            sb2.append(this.b.size());
            sb2.append(" observers. Error: ");
            sb2.append(th3 != null);
            Log.d("CameraPresenceSrc", sb2.toString());
            Iterator<a> it = this.b.iterator();
            while (it.hasNext()) {
                f(it.next(), listUnmodifiableList, th3);
            }
        }
    }
}
