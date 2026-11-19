package p;

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
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public class c extends p.b implements MenuItem {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final r2.b f28575d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Method f28576e;

    public class a extends androidx.core.view.b implements ActionProvider.VisibilityListener {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public androidx.core.view.b.InterfaceC0035b f28577d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final ActionProvider f28578e;

        public a(Context context, ActionProvider actionProvider) {
            super(context);
            this.f28578e = actionProvider;
        }

        @Override // androidx.core.view.b
        public boolean a() {
            return this.f28578e.hasSubMenu();
        }

        @Override // androidx.core.view.b
        public boolean b() {
            return this.f28578e.isVisible();
        }

        @Override // androidx.core.view.b
        @NonNull
        public View c() {
            return this.f28578e.onCreateActionView();
        }

        @Override // androidx.core.view.b
        public View d(MenuItem menuItem) {
            return this.f28578e.onCreateActionView(menuItem);
        }

        @Override // androidx.core.view.b
        public boolean e() {
            return this.f28578e.onPerformDefaultAction();
        }

        @Override // androidx.core.view.b
        public void f(SubMenu subMenu) {
            this.f28578e.onPrepareSubMenu(c.this.d(subMenu));
        }

        @Override // androidx.core.view.b
        public boolean g() {
            return this.f28578e.overridesItemVisibility();
        }

        @Override // androidx.core.view.b
        public void j(androidx.core.view.b.InterfaceC0035b interfaceC0035b) {
            this.f28577d = interfaceC0035b;
            this.f28578e.setVisibilityListener(interfaceC0035b != null ? this : null);
        }

        @Override // android.view.ActionProvider.VisibilityListener
        public void onActionProviderVisibilityChanged(boolean z10) {
            androidx.core.view.b.InterfaceC0035b interfaceC0035b = this.f28577d;
            if (interfaceC0035b != null) {
                interfaceC0035b.onActionProviderVisibilityChanged(z10);
            }
        }
    }

    public static class b extends FrameLayout implements o.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final CollapsibleActionView f28580a;

        /* JADX WARN: Multi-variable type inference failed */
        public b(View view) {
            super(view.getContext());
            this.f28580a = (CollapsibleActionView) view;
            addView(view);
        }

        public View a() {
            return (View) this.f28580a;
        }

        @Override // o.c
        public void onActionViewCollapsed() {
            this.f28580a.onActionViewCollapsed();
        }

        @Override // o.c
        public void onActionViewExpanded() {
            this.f28580a.onActionViewExpanded();
        }
    }

    /* JADX INFO: renamed from: p.c$c, reason: collision with other inner class name */
    public class MenuItemOnActionExpandListenerC0551c implements MenuItem.OnActionExpandListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final MenuItem.OnActionExpandListener f28581a;

        public MenuItemOnActionExpandListenerC0551c(MenuItem.OnActionExpandListener onActionExpandListener) {
            this.f28581a = onActionExpandListener;
        }

        @Override // android.view.MenuItem.OnActionExpandListener
        public boolean onMenuItemActionCollapse(MenuItem menuItem) {
            return this.f28581a.onMenuItemActionCollapse(c.this.c(menuItem));
        }

        @Override // android.view.MenuItem.OnActionExpandListener
        public boolean onMenuItemActionExpand(MenuItem menuItem) {
            return this.f28581a.onMenuItemActionExpand(c.this.c(menuItem));
        }
    }

    public class d implements MenuItem.OnMenuItemClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final MenuItem.OnMenuItemClickListener f28582a;

        public d(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
            this.f28582a = onMenuItemClickListener;
        }

        @Override // android.view.MenuItem.OnMenuItemClickListener
        public boolean onMenuItemClick(MenuItem menuItem) {
            return this.f28582a.onMenuItemClick(c.this.c(menuItem));
        }
    }

    public c(Context context, r2.b bVar) {
        super(context);
        if (bVar == null) {
            throw new IllegalArgumentException("Wrapped Object can not be null.");
        }
        this.f28575d = bVar;
    }

    @Override // android.view.MenuItem
    public boolean collapseActionView() {
        return this.f28575d.collapseActionView();
    }

    @Override // android.view.MenuItem
    public boolean expandActionView() {
        return this.f28575d.expandActionView();
    }

    @Override // android.view.MenuItem
    public ActionProvider getActionProvider() {
        androidx.core.view.b bVarA = this.f28575d.a();
        if (bVarA instanceof a) {
            return ((a) bVarA).f28578e;
        }
        return null;
    }

    @Override // android.view.MenuItem
    public View getActionView() {
        View actionView = this.f28575d.getActionView();
        return actionView instanceof b ? ((b) actionView).a() : actionView;
    }

    @Override // android.view.MenuItem
    public int getAlphabeticModifiers() {
        return this.f28575d.getAlphabeticModifiers();
    }

    @Override // android.view.MenuItem
    public char getAlphabeticShortcut() {
        return this.f28575d.getAlphabeticShortcut();
    }

    @Override // android.view.MenuItem
    public CharSequence getContentDescription() {
        return this.f28575d.getContentDescription();
    }

    @Override // android.view.MenuItem
    public int getGroupId() {
        return this.f28575d.getGroupId();
    }

    @Override // android.view.MenuItem
    public Drawable getIcon() {
        return this.f28575d.getIcon();
    }

    @Override // android.view.MenuItem
    public ColorStateList getIconTintList() {
        return this.f28575d.getIconTintList();
    }

    @Override // android.view.MenuItem
    public PorterDuff.Mode getIconTintMode() {
        return this.f28575d.getIconTintMode();
    }

    @Override // android.view.MenuItem
    public Intent getIntent() {
        return this.f28575d.getIntent();
    }

    @Override // android.view.MenuItem
    public int getItemId() {
        return this.f28575d.getItemId();
    }

    @Override // android.view.MenuItem
    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return this.f28575d.getMenuInfo();
    }

    @Override // android.view.MenuItem
    public int getNumericModifiers() {
        return this.f28575d.getNumericModifiers();
    }

    @Override // android.view.MenuItem
    public char getNumericShortcut() {
        return this.f28575d.getNumericShortcut();
    }

    @Override // android.view.MenuItem
    public int getOrder() {
        return this.f28575d.getOrder();
    }

    @Override // android.view.MenuItem
    public SubMenu getSubMenu() {
        return d(this.f28575d.getSubMenu());
    }

    @Override // android.view.MenuItem
    public CharSequence getTitle() {
        return this.f28575d.getTitle();
    }

    @Override // android.view.MenuItem
    public CharSequence getTitleCondensed() {
        return this.f28575d.getTitleCondensed();
    }

    @Override // android.view.MenuItem
    public CharSequence getTooltipText() {
        return this.f28575d.getTooltipText();
    }

    public void h(boolean z10) {
        try {
            if (this.f28576e == null) {
                this.f28576e = this.f28575d.getClass().getDeclaredMethod("setExclusiveCheckable", Boolean.TYPE);
            }
            this.f28576e.invoke(this.f28575d, Boolean.valueOf(z10));
        } catch (Exception e10) {
            Log.w("MenuItemWrapper", "Error while calling setExclusiveCheckable", e10);
        }
    }

    @Override // android.view.MenuItem
    public boolean hasSubMenu() {
        return this.f28575d.hasSubMenu();
    }

    @Override // android.view.MenuItem
    public boolean isActionViewExpanded() {
        return this.f28575d.isActionViewExpanded();
    }

    @Override // android.view.MenuItem
    public boolean isCheckable() {
        return this.f28575d.isCheckable();
    }

    @Override // android.view.MenuItem
    public boolean isChecked() {
        return this.f28575d.isChecked();
    }

    @Override // android.view.MenuItem
    public boolean isEnabled() {
        return this.f28575d.isEnabled();
    }

    @Override // android.view.MenuItem
    public boolean isVisible() {
        return this.f28575d.isVisible();
    }

    @Override // android.view.MenuItem
    public MenuItem setActionProvider(ActionProvider actionProvider) {
        a aVar = new a(this.f28573a, actionProvider);
        r2.b bVar = this.f28575d;
        if (actionProvider == null) {
            aVar = null;
        }
        bVar.b(aVar);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setActionView(View view) {
        if (view instanceof CollapsibleActionView) {
            view = new b(view);
        }
        this.f28575d.setActionView(view);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c10) {
        this.f28575d.setAlphabeticShortcut(c10);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setCheckable(boolean z10) {
        this.f28575d.setCheckable(z10);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setChecked(boolean z10) {
        this.f28575d.setChecked(z10);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setContentDescription(CharSequence charSequence) {
        this.f28575d.setContentDescription(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setEnabled(boolean z10) {
        this.f28575d.setEnabled(z10);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(Drawable drawable) {
        this.f28575d.setIcon(drawable);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f28575d.setIconTintList(colorStateList);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f28575d.setIconTintMode(mode);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIntent(Intent intent) {
        this.f28575d.setIntent(intent);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setNumericShortcut(char c10) {
        this.f28575d.setNumericShortcut(c10);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f28575d.setOnActionExpandListener(onActionExpandListener != null ? new MenuItemOnActionExpandListenerC0551c(onActionExpandListener) : null);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f28575d.setOnMenuItemClickListener(onMenuItemClickListener != null ? new d(onMenuItemClickListener) : null);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setShortcut(char c10, char c11) {
        this.f28575d.setShortcut(c10, c11);
        return this;
    }

    @Override // android.view.MenuItem
    public void setShowAsAction(int i10) {
        this.f28575d.setShowAsAction(i10);
    }

    @Override // android.view.MenuItem
    public MenuItem setShowAsActionFlags(int i10) {
        this.f28575d.setShowAsActionFlags(i10);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(CharSequence charSequence) {
        this.f28575d.setTitle(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f28575d.setTitleCondensed(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTooltipText(CharSequence charSequence) {
        this.f28575d.setTooltipText(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setVisible(boolean z10) {
        return this.f28575d.setVisible(z10);
    }

    @Override // android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c10, int i10) {
        this.f28575d.setAlphabeticShortcut(c10, i10);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(int i10) {
        this.f28575d.setIcon(i10);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setNumericShortcut(char c10, int i10) {
        this.f28575d.setNumericShortcut(c10, i10);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setShortcut(char c10, char c11, int i10, int i11) {
        this.f28575d.setShortcut(c10, c11, i10, i11);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(int i10) {
        this.f28575d.setTitle(i10);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setActionView(int i10) {
        this.f28575d.setActionView(i10);
        View actionView = this.f28575d.getActionView();
        if (actionView instanceof CollapsibleActionView) {
            this.f28575d.setActionView(new b(actionView));
        }
        return this;
    }
}
