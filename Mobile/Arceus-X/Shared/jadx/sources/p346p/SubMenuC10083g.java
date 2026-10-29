package p346p;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import p399r2.InterfaceSubMenuC10779c;

/* JADX INFO: renamed from: p.g */
/* JADX INFO: loaded from: classes.dex */
public class SubMenuC10083g extends MenuC10081e implements SubMenu {

    /* JADX INFO: renamed from: e */
    public final InterfaceSubMenuC10779c f36313e;

    public SubMenuC10083g(Context context, InterfaceSubMenuC10779c interfaceSubMenuC10779c) {
        super(context, interfaceSubMenuC10779c);
        this.f36313e = interfaceSubMenuC10779c;
    }

    @Override // android.view.SubMenu
    public void clearHeader() {
        this.f36313e.clearHeader();
    }

    @Override // android.view.SubMenu
    public MenuItem getItem() {
        return m38851c(this.f36313e.getItem());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.SubMenu
    public SubMenu setHeaderIcon(int i10) {
        this.f36313e.setHeaderIcon(i10);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.SubMenu
    public SubMenu setHeaderTitle(int i10) {
        this.f36313e.setHeaderTitle(i10);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderView(View view) {
        this.f36313e.setHeaderView(view);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.SubMenu
    public SubMenu setIcon(int i10) {
        this.f36313e.setIcon(i10);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @Override // android.view.SubMenu
    public SubMenu setHeaderIcon(Drawable drawable) {
        this.f36313e.setHeaderIcon(drawable);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @Override // android.view.SubMenu
    public SubMenu setHeaderTitle(CharSequence charSequence) {
        this.f36313e.setHeaderTitle(charSequence);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @Override // android.view.SubMenu
    public SubMenu setIcon(Drawable drawable) {
        this.f36313e.setIcon(drawable);
        return this;
    }
}
