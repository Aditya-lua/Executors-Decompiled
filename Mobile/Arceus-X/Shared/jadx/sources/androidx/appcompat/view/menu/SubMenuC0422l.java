package androidx.appcompat.view.menu;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.annotation.NonNull;

/* JADX INFO: renamed from: androidx.appcompat.view.menu.l */
/* JADX INFO: loaded from: classes.dex */
public class SubMenuC0422l extends C0415e implements SubMenu {

    /* JADX INFO: renamed from: B */
    public C0415e f1296B;

    /* JADX INFO: renamed from: C */
    public C0417g f1297C;

    public SubMenuC0422l(Context context, C0415e c0415e, C0417g c0417g) {
        super(context);
        this.f1296B = c0415e;
        this.f1297C = c0417g;
    }

    @Override // androidx.appcompat.view.menu.C0415e
    /* JADX INFO: renamed from: D */
    public C0415e mo1603D() {
        return this.f1296B.mo1603D();
    }

    @Override // androidx.appcompat.view.menu.C0415e
    /* JADX INFO: renamed from: G */
    public boolean mo1606G() {
        return this.f1296B.mo1606G();
    }

    @Override // androidx.appcompat.view.menu.C0415e
    /* JADX INFO: renamed from: H */
    public boolean mo1607H() {
        return this.f1296B.mo1607H();
    }

    @Override // androidx.appcompat.view.menu.C0415e
    /* JADX INFO: renamed from: I */
    public boolean mo1608I() {
        return this.f1296B.mo1608I();
    }

    @Override // androidx.appcompat.view.menu.C0415e
    /* JADX INFO: renamed from: S */
    public void mo1618S(C0415e.a aVar) {
        this.f1296B.mo1618S(aVar);
    }

    @Override // androidx.appcompat.view.menu.C0415e
    /* JADX INFO: renamed from: f */
    public boolean mo1636f(C0417g c0417g) {
        return this.f1296B.mo1636f(c0417g);
    }

    /* JADX INFO: renamed from: f0 */
    public Menu m1705f0() {
        return this.f1296B;
    }

    @Override // android.view.SubMenu
    public MenuItem getItem() {
        return this.f1297C;
    }

    @Override // androidx.appcompat.view.menu.C0415e
    /* JADX INFO: renamed from: h */
    public boolean mo1638h(@NonNull C0415e c0415e, @NonNull MenuItem menuItem) {
        return super.mo1638h(c0415e, menuItem) || this.f1296B.mo1638h(c0415e, menuItem);
    }

    @Override // androidx.appcompat.view.menu.C0415e
    /* JADX INFO: renamed from: k */
    public boolean mo1641k(C0417g c0417g) {
        return this.f1296B.mo1641k(c0417g);
    }

    @Override // androidx.appcompat.view.menu.C0415e, android.view.Menu
    public void setGroupDividerEnabled(boolean z10) {
        this.f1296B.setGroupDividerEnabled(z10);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.SubMenu
    public SubMenu setHeaderIcon(Drawable drawable) {
        return (SubMenu) super.m1622W(drawable);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.SubMenu
    public SubMenu setHeaderTitle(CharSequence charSequence) {
        return (SubMenu) super.m1625Z(charSequence);
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderView(View view) {
        return (SubMenu) super.m1627a0(view);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.SubMenu
    public SubMenu setIcon(Drawable drawable) {
        this.f1297C.setIcon(drawable);
        return this;
    }

    @Override // androidx.appcompat.view.menu.C0415e, android.view.Menu
    public void setQwertyMode(boolean z10) {
        this.f1296B.setQwertyMode(z10);
    }

    @Override // androidx.appcompat.view.menu.C0415e
    /* JADX INFO: renamed from: t */
    public String mo1649t() {
        C0417g c0417g = this.f1297C;
        int itemId = c0417g != null ? c0417g.getItemId() : 0;
        if (itemId == 0) {
            return null;
        }
        return super.mo1649t() + ":" + itemId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @Override // android.view.SubMenu
    public SubMenu setHeaderIcon(int i10) {
        return (SubMenu) super.m1621V(i10);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @Override // android.view.SubMenu
    public SubMenu setHeaderTitle(int i10) {
        return (SubMenu) super.m1624Y(i10);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @Override // android.view.SubMenu
    public SubMenu setIcon(int i10) {
        this.f1297C.setIcon(i10);
        return this;
    }
}
