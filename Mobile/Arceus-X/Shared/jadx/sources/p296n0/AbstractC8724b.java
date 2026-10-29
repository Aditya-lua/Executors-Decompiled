package p296n0;

import android.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import p140g0.C5933s;
import p533x2.C12637g;

/* JADX INFO: renamed from: n0.b */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC8724b implements InterfaceC8722a3<List<C5933s>> {

    /* JADX INFO: renamed from: c */
    public List<C5933s> f31752c;

    /* JADX INFO: renamed from: a */
    public final Object f31750a = new Object();

    /* JADX INFO: renamed from: b */
    public final List<a> f31751b = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: d */
    public Throwable f31753d = null;

    /* JADX INFO: renamed from: e */
    public boolean f31754e = false;

    /* JADX INFO: renamed from: n0.b$a */
    public static class a {

        /* JADX INFO: renamed from: a */
        public final Executor f31755a;

        /* JADX INFO: renamed from: b */
        public final InterfaceC8722a3.a<? super List<C5933s>> f31756b;

        public a(Executor executor, InterfaceC8722a3.a<? super List<C5933s>> aVar) {
            this.f31755a = executor;
            this.f31756b = aVar;
        }
    }

    public AbstractC8724b(List<String> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(C5933s.m26574a(it.next()));
        }
        this.f31752c = arrayList;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m35000a(Throwable th2, a aVar, List list) {
        if (th2 != null) {
            aVar.f31756b.onError(th2);
        } else {
            aVar.f31756b.mo2367a(list);
        }
    }

    @Override // p296n0.InterfaceC8722a3
    /* JADX INFO: renamed from: c */
    public void mo34018c(Executor executor, InterfaceC8722a3.a<? super List<C5933s>> aVar) {
        List<C5933s> listUnmodifiableList;
        Throwable th2;
        C12637g.m47075g(executor);
        C12637g.m47075g(aVar);
        this.f31751b.add(new a(executor, aVar));
        synchronized (this.f31750a) {
            try {
                if (!this.f31754e && !this.f31751b.isEmpty()) {
                    Log.i("CameraPresenceSrc", "First observer added. Starting monitoring.");
                    this.f31754e = true;
                    mo35002g();
                }
                listUnmodifiableList = Collections.unmodifiableList(this.f31752c);
                th2 = this.f31753d;
            } catch (Throwable th3) {
                throw th3;
            }
        }
        m35001f(new a(executor, aVar), listUnmodifiableList, th2);
    }

    @Override // p296n0.InterfaceC8722a3
    /* JADX INFO: renamed from: d */
    public void mo34019d(InterfaceC8722a3.a<? super List<C5933s>> aVar) {
        a next;
        C12637g.m47075g(aVar);
        Iterator<a> it = this.f31751b.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!next.f31756b.equals(aVar));
        if (next != null) {
            this.f31751b.remove(next);
        }
        synchronized (this.f31750a) {
            try {
                if (this.f31754e && this.f31751b.isEmpty()) {
                    Log.i("CameraPresenceSrc", "Last observer removed. Stopping monitoring.");
                    this.f31754e = false;
                    mo35003h();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m35001f(final a aVar, final List<C5933s> list, final Throwable th2) {
        aVar.f31755a.execute(new Runnable() { // from class: n0.a
            @Override // java.lang.Runnable
            public final void run() {
                AbstractC8724b.m35000a(th2, aVar, list);
            }
        });
    }

    /* JADX INFO: renamed from: g */
    public abstract void mo35002g();

    /* JADX INFO: renamed from: h */
    public abstract void mo35003h();

    /* JADX INFO: renamed from: i */
    public void m35004i(List<C5933s> list) {
        m35006k(list, null);
    }

    /* JADX INFO: renamed from: j */
    public void m35005j(Throwable th2) {
        m35006k(null, th2);
    }

    /* JADX INFO: renamed from: k */
    public final void m35006k(List<C5933s> list, Throwable th2) {
        boolean z10;
        List<C5933s> listUnmodifiableList;
        Throwable th3;
        synchronized (this.f31750a) {
            try {
                if (th2 != null) {
                    z10 = this.f31753d == null || !this.f31752c.isEmpty();
                    this.f31753d = th2;
                    this.f31752c = Collections.EMPTY_LIST;
                } else {
                    C12637g.m47075g(list);
                    boolean z11 = (this.f31753d == null && this.f31752c.equals(list)) ? false : true;
                    this.f31753d = null;
                    this.f31752c = list;
                    z10 = z11;
                }
                listUnmodifiableList = Collections.unmodifiableList(this.f31752c);
                th3 = this.f31753d;
            } catch (Throwable th4) {
                throw th4;
            }
        }
        if (z10) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Data changed. Notifying ");
            sb2.append(this.f31751b.size());
            sb2.append(" observers. Error: ");
            sb2.append(th3 != null);
            Log.d("CameraPresenceSrc", sb2.toString());
            Iterator<a> it = this.f31751b.iterator();
            while (it.hasNext()) {
                m35001f(it.next(), listUnmodifiableList, th3);
            }
        }
    }
}
