package p;

import android.content.Context;
import android.view.MenuItem;
import android.view.SubMenu;
import w1.j;

/* JADX INFO: loaded from: classes.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f28038a;
    public j<r2.b, MenuItem> b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public j<r2.c, SubMenu> f28039c;

    public b(Context context) {
        this.f28038a = context;
    }

    public final MenuItem c(MenuItem menuItem) {
        if (!(menuItem instanceof r2.b)) {
            return menuItem;
        }
        r2.b bVar = (r2.b) menuItem;
        if (this.b == null) {
            this.b = new j<>();
        }
        MenuItem menuItem2 = this.b.get(bVar);
        if (menuItem2 != null) {
            return menuItem2;
        }
        c cVar = new c(this.f28038a, bVar);
        this.b.put(bVar, cVar);
        return cVar;
    }

    public final SubMenu d(SubMenu subMenu) {
        if (!(subMenu instanceof r2.c)) {
            return subMenu;
        }
        r2.c cVar = (r2.c) subMenu;
        if (this.f28039c == null) {
            this.f28039c = new j<>();
        }
        SubMenu subMenu2 = this.f28039c.get(cVar);
        if (subMenu2 != null) {
            return subMenu2;
        }
        g gVar = new g(this.f28038a, cVar);
        this.f28039c.put(cVar, gVar);
        return gVar;
    }

    public final void e() {
        j<r2.b, MenuItem> jVar = this.b;
        if (jVar != null) {
            jVar.clear();
        }
        j<r2.c, SubMenu> jVar2 = this.f28039c;
        if (jVar2 != null) {
            jVar2.clear();
        }
    }

    public final void f(int i10) {
        if (this.b == null) {
            return;
        }
        int i11 = 0;
        while (i11 < this.b.getSize()) {
            if (this.b.f(i11).getGroupId() == i10) {
                this.b.i(i11);
                i11--;
            }
            i11++;
        }
    }

    public final void g(int i10) {
        if (this.b == null) {
            return;
        }
        for (int i11 = 0; i11 < this.b.getSize(); i11++) {
            if (this.b.f(i11).getItemId() == i10) {
                this.b.i(i11);
                return;
            }
        }
    }
}
