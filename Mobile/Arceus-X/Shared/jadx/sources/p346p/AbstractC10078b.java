package p346p;

import android.content.Context;
import android.view.MenuItem;
import android.view.SubMenu;
import p399r2.InterfaceMenuItemC10778b;
import p399r2.InterfaceSubMenuC10779c;
import p504w1.C12286j;

/* JADX INFO: renamed from: p.b */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC10078b {

    /* JADX INFO: renamed from: a */
    public final Context f36298a;

    /* JADX INFO: renamed from: b */
    public C12286j<InterfaceMenuItemC10778b, MenuItem> f36299b;

    /* JADX INFO: renamed from: c */
    public C12286j<InterfaceSubMenuC10779c, SubMenu> f36300c;

    public AbstractC10078b(Context context) {
        this.f36298a = context;
    }

    /* JADX INFO: renamed from: c */
    public final MenuItem m38851c(MenuItem menuItem) {
        if (!(menuItem instanceof InterfaceMenuItemC10778b)) {
            return menuItem;
        }
        InterfaceMenuItemC10778b interfaceMenuItemC10778b = (InterfaceMenuItemC10778b) menuItem;
        if (this.f36299b == null) {
            this.f36299b = new C12286j<>();
        }
        MenuItem menuItem2 = this.f36299b.get(interfaceMenuItemC10778b);
        if (menuItem2 != null) {
            return menuItem2;
        }
        MenuItemC10079c menuItemC10079c = new MenuItemC10079c(this.f36298a, interfaceMenuItemC10778b);
        this.f36299b.put(interfaceMenuItemC10778b, menuItemC10079c);
        return menuItemC10079c;
    }

    /* JADX INFO: renamed from: d */
    public final SubMenu m38852d(SubMenu subMenu) {
        if (!(subMenu instanceof InterfaceSubMenuC10779c)) {
            return subMenu;
        }
        InterfaceSubMenuC10779c interfaceSubMenuC10779c = (InterfaceSubMenuC10779c) subMenu;
        if (this.f36300c == null) {
            this.f36300c = new C12286j<>();
        }
        SubMenu subMenu2 = this.f36300c.get(interfaceSubMenuC10779c);
        if (subMenu2 != null) {
            return subMenu2;
        }
        SubMenuC10083g subMenuC10083g = new SubMenuC10083g(this.f36298a, interfaceSubMenuC10779c);
        this.f36300c.put(interfaceSubMenuC10779c, subMenuC10083g);
        return subMenuC10083g;
    }

    /* JADX INFO: renamed from: e */
    public final void m38853e() {
        C12286j<InterfaceMenuItemC10778b, MenuItem> c12286j = this.f36299b;
        if (c12286j != null) {
            c12286j.clear();
        }
        C12286j<InterfaceSubMenuC10779c, SubMenu> c12286j2 = this.f36300c;
        if (c12286j2 != null) {
            c12286j2.clear();
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m38854f(int i10) {
        if (this.f36299b == null) {
            return;
        }
        int i11 = 0;
        while (i11 < this.f36299b.getSize()) {
            if (this.f36299b.m45625f(i11).getGroupId() == i10) {
                this.f36299b.m45627i(i11);
                i11--;
            }
            i11++;
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m38855g(int i10) {
        if (this.f36299b == null) {
            return;
        }
        for (int i11 = 0; i11 < this.f36299b.getSize(); i11++) {
            if (this.f36299b.m45625f(i11).getItemId() == i10) {
                this.f36299b.m45627i(i11);
                return;
            }
        }
    }
}
