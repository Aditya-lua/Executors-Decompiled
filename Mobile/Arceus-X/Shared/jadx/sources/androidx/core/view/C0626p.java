package androidx.core.view;

import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import androidx.p616lifecycle.AbstractC0966l;
import androidx.p616lifecycle.InterfaceC0974p;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: androidx.core.view.p */
/* JADX INFO: loaded from: classes.dex */
public class C0626p {

    /* JADX INFO: renamed from: a */
    public final Runnable f2471a;

    /* JADX INFO: renamed from: b */
    public final CopyOnWriteArrayList<InterfaceC0630r> f2472b = new CopyOnWriteArrayList<>();

    /* JADX INFO: renamed from: c */
    public final Map<InterfaceC0630r, a> f2473c = new HashMap();

    /* JADX INFO: renamed from: androidx.core.view.p$a */
    public static class a {

        /* JADX INFO: renamed from: a */
        public final AbstractC0966l f2474a;

        /* JADX INFO: renamed from: b */
        public InterfaceC0974p f2475b;

        /* JADX INFO: renamed from: a */
        public void m3142a() {
            this.f2474a.mo4938d(this.f2475b);
            this.f2475b = null;
        }
    }

    public C0626p(Runnable runnable) {
        this.f2471a = runnable;
    }

    /* JADX INFO: renamed from: a */
    public void m3136a(InterfaceC0630r interfaceC0630r) {
        this.f2472b.add(interfaceC0630r);
        this.f2471a.run();
    }

    /* JADX INFO: renamed from: b */
    public void m3137b(Menu menu, MenuInflater menuInflater) {
        Iterator<InterfaceC0630r> it = this.f2472b.iterator();
        while (it.hasNext()) {
            it.next().mo3159d(menu, menuInflater);
        }
    }

    /* JADX INFO: renamed from: c */
    public void m3138c(Menu menu) {
        Iterator<InterfaceC0630r> it = this.f2472b.iterator();
        while (it.hasNext()) {
            it.next().mo3156a(menu);
        }
    }

    /* JADX INFO: renamed from: d */
    public boolean m3139d(MenuItem menuItem) {
        Iterator<InterfaceC0630r> it = this.f2472b.iterator();
        while (it.hasNext()) {
            if (it.next().mo3158c(menuItem)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: e */
    public void m3140e(Menu menu) {
        Iterator<InterfaceC0630r> it = this.f2472b.iterator();
        while (it.hasNext()) {
            it.next().mo3157b(menu);
        }
    }

    /* JADX INFO: renamed from: f */
    public void m3141f(InterfaceC0630r interfaceC0630r) {
        this.f2472b.remove(interfaceC0630r);
        a aVarRemove = this.f2473c.remove(interfaceC0630r);
        if (aVarRemove != null) {
            aVarRemove.m3142a();
        }
        this.f2471a.run();
    }
}
