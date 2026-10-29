package p346p;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import p399r2.InterfaceMenuC10777a;

/* JADX INFO: renamed from: p.e */
/* JADX INFO: loaded from: classes.dex */
public class MenuC10081e extends AbstractC10078b implements Menu {

    /* JADX INFO: renamed from: d */
    public final InterfaceMenuC10777a f36312d;

    public MenuC10081e(Context context, InterfaceMenuC10777a interfaceMenuC10777a) {
        super(context);
        if (interfaceMenuC10777a == null) {
            throw new IllegalArgumentException("Wrapped Object can not be null.");
        }
        this.f36312d = interfaceMenuC10777a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.Menu
    public MenuItem add(CharSequence charSequence) {
        return m38851c(this.f36312d.add(charSequence));
    }

    @Override // android.view.Menu
    public int addIntentOptions(int i10, int i11, int i12, ComponentName componentName, Intent[] intentArr, Intent intent, int i13, MenuItem[] menuItemArr) {
        MenuItem[] menuItemArr2 = menuItemArr != null ? new MenuItem[menuItemArr.length] : null;
        int iAddIntentOptions = this.f36312d.addIntentOptions(i10, i11, i12, componentName, intentArr, intent, i13, menuItemArr2);
        if (menuItemArr2 != null) {
            int length = menuItemArr2.length;
            for (int i14 = 0; i14 < length; i14++) {
                menuItemArr[i14] = m38851c(menuItemArr2[i14]);
            }
        }
        return iAddIntentOptions;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.Menu
    public SubMenu addSubMenu(CharSequence charSequence) {
        return m38852d(this.f36312d.addSubMenu(charSequence));
    }

    @Override // android.view.Menu
    public void clear() {
        m38853e();
        this.f36312d.clear();
    }

    @Override // android.view.Menu
    public void close() {
        this.f36312d.close();
    }

    @Override // android.view.Menu
    public MenuItem findItem(int i10) {
        return m38851c(this.f36312d.findItem(i10));
    }

    @Override // android.view.Menu
    public MenuItem getItem(int i10) {
        return m38851c(this.f36312d.getItem(i10));
    }

    @Override // android.view.Menu
    public boolean hasVisibleItems() {
        return this.f36312d.hasVisibleItems();
    }

    @Override // android.view.Menu
    public boolean isShortcutKey(int i10, KeyEvent keyEvent) {
        return this.f36312d.isShortcutKey(i10, keyEvent);
    }

    @Override // android.view.Menu
    public boolean performIdentifierAction(int i10, int i11) {
        return this.f36312d.performIdentifierAction(i10, i11);
    }

    @Override // android.view.Menu
    public boolean performShortcut(int i10, KeyEvent keyEvent, int i11) {
        return this.f36312d.performShortcut(i10, keyEvent, i11);
    }

    @Override // android.view.Menu
    public void removeGroup(int i10) {
        m38854f(i10);
        this.f36312d.removeGroup(i10);
    }

    @Override // android.view.Menu
    public void removeItem(int i10) {
        m38855g(i10);
        this.f36312d.removeItem(i10);
    }

    @Override // android.view.Menu
    public void setGroupCheckable(int i10, boolean z10, boolean z11) {
        this.f36312d.setGroupCheckable(i10, z10, z11);
    }

    @Override // android.view.Menu
    public void setGroupEnabled(int i10, boolean z10) {
        this.f36312d.setGroupEnabled(i10, z10);
    }

    @Override // android.view.Menu
    public void setGroupVisible(int i10, boolean z10) {
        this.f36312d.setGroupVisible(i10, z10);
    }

    @Override // android.view.Menu
    public void setQwertyMode(boolean z10) {
        this.f36312d.setQwertyMode(z10);
    }

    @Override // android.view.Menu
    public int size() {
        return this.f36312d.size();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @Override // android.view.Menu
    public MenuItem add(int i10) {
        return m38851c(this.f36312d.add(i10));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @Override // android.view.Menu
    public SubMenu addSubMenu(int i10) {
        return m38852d(this.f36312d.addSubMenu(i10));
    }

    @Override // android.view.Menu
    public MenuItem add(int i10, int i11, int i12, CharSequence charSequence) {
        return m38851c(this.f36312d.add(i10, i11, i12, charSequence));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i10, int i11, int i12, CharSequence charSequence) {
        return m38852d(this.f36312d.addSubMenu(i10, i11, i12, charSequence));
    }

    @Override // android.view.Menu
    public MenuItem add(int i10, int i11, int i12, int i13) {
        return m38851c(this.f36312d.add(i10, i11, i12, i13));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i10, int i11, int i12, int i13) {
        return m38852d(this.f36312d.addSubMenu(i10, i11, i12, i13));
    }
}
