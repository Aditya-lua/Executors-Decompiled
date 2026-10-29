package p346p;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.ActionProvider;
import android.view.CollapsibleActionView;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.core.view.AbstractC0585b;
import java.lang.reflect.Method;
import p316o.InterfaceC9610c;
import p399r2.InterfaceMenuItemC10778b;

/* JADX INFO: renamed from: p.c */
/* JADX INFO: loaded from: classes.dex */
public class MenuItemC10079c extends AbstractC10078b implements MenuItem {

    /* JADX INFO: renamed from: d */
    public final InterfaceMenuItemC10778b f36301d;

    /* JADX INFO: renamed from: e */
    public Method f36302e;

    /* JADX INFO: renamed from: p.c$a */
    public class a extends AbstractC0585b implements ActionProvider.VisibilityListener {

        /* JADX INFO: renamed from: d */
        public AbstractC0585b.b f36303d;

        /* JADX INFO: renamed from: e */
        public final ActionProvider f36304e;

        public a(Context context, ActionProvider actionProvider) {
            super(context);
            this.f36304e = actionProvider;
        }

        @Override // androidx.core.view.AbstractC0585b
        /* JADX INFO: renamed from: a */
        public boolean mo1866a() {
            return this.f36304e.hasSubMenu();
        }

        @Override // androidx.core.view.AbstractC0585b
        /* JADX INFO: renamed from: b */
        public boolean mo2807b() {
            return this.f36304e.isVisible();
        }

        @Override // androidx.core.view.AbstractC0585b
        @NonNull
        /* JADX INFO: renamed from: c */
        public View mo1867c() {
            return this.f36304e.onCreateActionView();
        }

        @Override // androidx.core.view.AbstractC0585b
        /* JADX INFO: renamed from: d */
        public View mo2808d(MenuItem menuItem) {
            return this.f36304e.onCreateActionView(menuItem);
        }

        @Override // androidx.core.view.AbstractC0585b
        /* JADX INFO: renamed from: e */
        public boolean mo2809e() {
            return this.f36304e.onPerformDefaultAction();
        }

        @Override // androidx.core.view.AbstractC0585b
        /* JADX INFO: renamed from: f */
        public void mo1868f(SubMenu subMenu) {
            this.f36304e.onPrepareSubMenu(MenuItemC10079c.this.m38852d(subMenu));
        }

        @Override // androidx.core.view.AbstractC0585b
        /* JADX INFO: renamed from: g */
        public boolean mo2810g() {
            return this.f36304e.overridesItemVisibility();
        }

        @Override // androidx.core.view.AbstractC0585b
        /* JADX INFO: renamed from: j */
        public void mo2813j(AbstractC0585b.b bVar) {
            this.f36303d = bVar;
            this.f36304e.setVisibilityListener(bVar != null ? this : null);
        }

        @Override // android.view.ActionProvider.VisibilityListener
        public void onActionProviderVisibilityChanged(boolean z10) {
            AbstractC0585b.b bVar = this.f36303d;
            if (bVar != null) {
                bVar.onActionProviderVisibilityChanged(z10);
            }
        }
    }

    /* JADX INFO: renamed from: p.c$b */
    public static class b extends FrameLayout implements InterfaceC9610c {

        /* JADX INFO: renamed from: a */
        public final CollapsibleActionView f36306a;

        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: android.view.View */
        /* JADX WARN: Multi-variable type inference failed */
        public b(View view) {
            super(view.getContext());
            this.f36306a = (CollapsibleActionView) view;
            addView(view);
        }

        /* JADX INFO: renamed from: a */
        public View m38858a() {
            return (View) this.f36306a;
        }

        @Override // p316o.InterfaceC9610c
        public void onActionViewCollapsed() {
            this.f36306a.onActionViewCollapsed();
        }

        @Override // p316o.InterfaceC9610c
        public void onActionViewExpanded() {
            this.f36306a.onActionViewExpanded();
        }
    }

    /* JADX INFO: renamed from: p.c$c */
    public class c implements MenuItem.OnActionExpandListener {

        /* JADX INFO: renamed from: a */
        public final MenuItem.OnActionExpandListener f36307a;

        public c(MenuItem.OnActionExpandListener onActionExpandListener) {
            this.f36307a = onActionExpandListener;
        }

        @Override // android.view.MenuItem.OnActionExpandListener
        public boolean onMenuItemActionCollapse(MenuItem menuItem) {
            return this.f36307a.onMenuItemActionCollapse(MenuItemC10079c.this.m38851c(menuItem));
        }

        @Override // android.view.MenuItem.OnActionExpandListener
        public boolean onMenuItemActionExpand(MenuItem menuItem) {
            return this.f36307a.onMenuItemActionExpand(MenuItemC10079c.this.m38851c(menuItem));
        }
    }

    /* JADX INFO: renamed from: p.c$d */
    public class d implements MenuItem.OnMenuItemClickListener {

        /* JADX INFO: renamed from: a */
        public final MenuItem.OnMenuItemClickListener f36309a;

        public d(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
            this.f36309a = onMenuItemClickListener;
        }

        @Override // android.view.MenuItem.OnMenuItemClickListener
        public boolean onMenuItemClick(MenuItem menuItem) {
            return this.f36309a.onMenuItemClick(MenuItemC10079c.this.m38851c(menuItem));
        }
    }

    public MenuItemC10079c(Context context, InterfaceMenuItemC10778b interfaceMenuItemC10778b) {
        super(context);
        if (interfaceMenuItemC10778b == null) {
            throw new IllegalArgumentException("Wrapped Object can not be null.");
        }
        this.f36301d = interfaceMenuItemC10778b;
    }

    @Override // android.view.MenuItem
    public boolean collapseActionView() {
        return this.f36301d.collapseActionView();
    }

    @Override // android.view.MenuItem
    public boolean expandActionView() {
        return this.f36301d.expandActionView();
    }

    @Override // android.view.MenuItem
    public ActionProvider getActionProvider() {
        AbstractC0585b abstractC0585bMo1665a = this.f36301d.mo1665a();
        if (abstractC0585bMo1665a instanceof a) {
            return ((a) abstractC0585bMo1665a).f36304e;
        }
        return null;
    }

    @Override // android.view.MenuItem
    public View getActionView() {
        View actionView = this.f36301d.getActionView();
        return actionView instanceof b ? ((b) actionView).m38858a() : actionView;
    }

    @Override // android.view.MenuItem
    public int getAlphabeticModifiers() {
        return this.f36301d.getAlphabeticModifiers();
    }

    @Override // android.view.MenuItem
    public char getAlphabeticShortcut() {
        return this.f36301d.getAlphabeticShortcut();
    }

    @Override // android.view.MenuItem
    public CharSequence getContentDescription() {
        return this.f36301d.getContentDescription();
    }

    @Override // android.view.MenuItem
    public int getGroupId() {
        return this.f36301d.getGroupId();
    }

    @Override // android.view.MenuItem
    public Drawable getIcon() {
        return this.f36301d.getIcon();
    }

    @Override // android.view.MenuItem
    public ColorStateList getIconTintList() {
        return this.f36301d.getIconTintList();
    }

    @Override // android.view.MenuItem
    public PorterDuff.Mode getIconTintMode() {
        return this.f36301d.getIconTintMode();
    }

    @Override // android.view.MenuItem
    public Intent getIntent() {
        return this.f36301d.getIntent();
    }

    @Override // android.view.MenuItem
    public int getItemId() {
        return this.f36301d.getItemId();
    }

    @Override // android.view.MenuItem
    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return this.f36301d.getMenuInfo();
    }

    @Override // android.view.MenuItem
    public int getNumericModifiers() {
        return this.f36301d.getNumericModifiers();
    }

    @Override // android.view.MenuItem
    public char getNumericShortcut() {
        return this.f36301d.getNumericShortcut();
    }

    @Override // android.view.MenuItem
    public int getOrder() {
        return this.f36301d.getOrder();
    }

    @Override // android.view.MenuItem
    public SubMenu getSubMenu() {
        return m38852d(this.f36301d.getSubMenu());
    }

    @Override // android.view.MenuItem
    public CharSequence getTitle() {
        return this.f36301d.getTitle();
    }

    @Override // android.view.MenuItem
    public CharSequence getTitleCondensed() {
        return this.f36301d.getTitleCondensed();
    }

    @Override // android.view.MenuItem
    public CharSequence getTooltipText() {
        return this.f36301d.getTooltipText();
    }

    /* JADX INFO: renamed from: h */
    public void m38856h(boolean z10) {
        try {
            if (this.f36302e == null) {
                this.f36302e = this.f36301d.getClass().getDeclaredMethod("setExclusiveCheckable", Boolean.TYPE);
            }
            this.f36302e.invoke(this.f36301d, Boolean.valueOf(z10));
        } catch (Exception e10) {
            Log.w("MenuItemWrapper", "Error while calling setExclusiveCheckable", e10);
        }
    }

    @Override // android.view.MenuItem
    public boolean hasSubMenu() {
        return this.f36301d.hasSubMenu();
    }

    @Override // android.view.MenuItem
    public boolean isActionViewExpanded() {
        return this.f36301d.isActionViewExpanded();
    }

    @Override // android.view.MenuItem
    public boolean isCheckable() {
        return this.f36301d.isCheckable();
    }

    @Override // android.view.MenuItem
    public boolean isChecked() {
        return this.f36301d.isChecked();
    }

    @Override // android.view.MenuItem
    public boolean isEnabled() {
        return this.f36301d.isEnabled();
    }

    @Override // android.view.MenuItem
    public boolean isVisible() {
        return this.f36301d.isVisible();
    }

    @Override // android.view.MenuItem
    public MenuItem setActionProvider(ActionProvider actionProvider) {
        a aVar = new a(this.f36298a, actionProvider);
        InterfaceMenuItemC10778b interfaceMenuItemC10778b = this.f36301d;
        if (actionProvider == null) {
            aVar = null;
        }
        interfaceMenuItemC10778b.mo1666b(aVar);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.MenuItem
    public MenuItem setActionView(View view) {
        if (view instanceof CollapsibleActionView) {
            view = new b(view);
        }
        this.f36301d.setActionView(view);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c10) {
        this.f36301d.setAlphabeticShortcut(c10);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setCheckable(boolean z10) {
        this.f36301d.setCheckable(z10);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setChecked(boolean z10) {
        this.f36301d.setChecked(z10);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setContentDescription(CharSequence charSequence) {
        this.f36301d.setContentDescription(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setEnabled(boolean z10) {
        this.f36301d.setEnabled(z10);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.MenuItem
    public MenuItem setIcon(Drawable drawable) {
        this.f36301d.setIcon(drawable);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f36301d.setIconTintList(colorStateList);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f36301d.setIconTintMode(mode);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIntent(Intent intent) {
        this.f36301d.setIntent(intent);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.MenuItem
    public MenuItem setNumericShortcut(char c10) {
        this.f36301d.setNumericShortcut(c10);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f36301d.setOnActionExpandListener(onActionExpandListener != null ? new c(onActionExpandListener) : null);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f36301d.setOnMenuItemClickListener(onMenuItemClickListener != null ? new d(onMenuItemClickListener) : null);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.MenuItem
    public MenuItem setShortcut(char c10, char c11) {
        this.f36301d.setShortcut(c10, c11);
        return this;
    }

    @Override // android.view.MenuItem
    public void setShowAsAction(int i10) {
        this.f36301d.setShowAsAction(i10);
    }

    @Override // android.view.MenuItem
    public MenuItem setShowAsActionFlags(int i10) {
        this.f36301d.setShowAsActionFlags(i10);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.MenuItem
    public MenuItem setTitle(CharSequence charSequence) {
        this.f36301d.setTitle(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f36301d.setTitleCondensed(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTooltipText(CharSequence charSequence) {
        this.f36301d.setTooltipText(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setVisible(boolean z10) {
        return this.f36301d.setVisible(z10);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @Override // android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c10, int i10) {
        this.f36301d.setAlphabeticShortcut(c10, i10);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @Override // android.view.MenuItem
    public MenuItem setIcon(int i10) {
        this.f36301d.setIcon(i10);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @Override // android.view.MenuItem
    public MenuItem setNumericShortcut(char c10, int i10) {
        this.f36301d.setNumericShortcut(c10, i10);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @Override // android.view.MenuItem
    public MenuItem setShortcut(char c10, char c11, int i10, int i11) {
        this.f36301d.setShortcut(c10, c11, i10, i11);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @Override // android.view.MenuItem
    public MenuItem setTitle(int i10) {
        this.f36301d.setTitle(i10);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setActionView(int i10) {
        this.f36301d.setActionView(i10);
        View actionView = this.f36301d.getActionView();
        if (actionView instanceof CollapsibleActionView) {
            this.f36301d.setActionView(new b(actionView));
        }
        return this;
    }
}
