package androidx.core.view;

import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes.dex */
public class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Runnable f1907a;
    public final CopyOnWriteArrayList<r> b = new CopyOnWriteArrayList<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map<r, a> f1908c = new HashMap();

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final androidx.p000lifecycle.l f1909a;
        public androidx.p000lifecycle.p b;

        public void a() {
            this.f1909a.d(this.b);
            this.b = null;
        }
    }

    public p(Runnable runnable) {
        this.f1907a = runnable;
    }

    public void a(r rVar) {
        this.b.add(rVar);
        this.f1907a.run();
    }

    public void b(Menu menu, MenuInflater menuInflater) {
        Iterator<r> it = this.b.iterator();
        while (it.hasNext()) {
            it.next().d(menu, menuInflater);
        }
    }

    public void c(Menu menu) {
        Iterator<r> it = this.b.iterator();
        while (it.hasNext()) {
            it.next().a(menu);
        }
    }

    public boolean d(MenuItem menuItem) {
        Iterator<r> it = this.b.iterator();
        while (it.hasNext()) {
            if (it.next().c(menuItem)) {
                return true;
            }
        }
        return false;
    }

    public void e(Menu menu) {
        Iterator<r> it = this.b.iterator();
        while (it.hasNext()) {
            it.next().b(menu);
        }
    }

    public void f(r rVar) {
        this.b.remove(rVar);
        a aVarRemove = this.f1908c.remove(rVar);
        if (aVarRemove != null) {
            aVarRemove.a();
        }
        this.f1907a.run();
    }
}
