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
    public final r2.b f28259d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Method f28260e;

    public class a extends androidx.core.view.b implements ActionProvider.VisibilityListener {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public androidx.core.view.b.InterfaceC0023b f28261d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final ActionProvider f28262e;

        public a(Context context, ActionProvider actionProvider) {
            super(context);
            this.f28262e = actionProvider;
        }

        @Override // androidx.core.view.b
        public boolean a() {
            return this.f28262e.hasSubMenu();
        }

        @Override // androidx.core.view.b
        public boolean b() {
            return this.f28262e.isVisible();
        }

        @Override // androidx.core.view.b
        @NonNull
        public View c() {
            return this.f28262e.onCreateActionView();
        }

        @Override // androidx.core.view.b
        public View d(MenuItem menuItem) {
            return this.f28262e.onCreateActionView(menuItem);
        }

        @Override // androidx.core.view.b
        public boolean e() {
            return this.f28262e.onPerformDefaultAction();
        }

        @Override // androidx.core.view.b
        public void f(SubMenu subMenu) {
            this.f28262e.onPrepareSubMenu(c.this.d(subMenu));
        }

        @Override // androidx.core.view.b
        public boolean g() {
            return this.f28262e.overridesItemVisibility();
        }

        @Override // androidx.core.view.b
        public void j(androidx.core.view.b.InterfaceC0023b interfaceC0023b) {
            this.f28261d = interfaceC0023b;
            this.f28262e.setVisibilityListener(interfaceC0023b != null ? this : null);
        }

        @Override // android.view.ActionProvider.VisibilityListener
        public void onActionProviderVisibilityChanged(boolean z10) {
            androidx.core.view.b.InterfaceC0023b interfaceC0023b = this.f28261d;
            if (interfaceC0023b != null) {
                interfaceC0023b.onActionProviderVisibilityChanged(z10);
            }
        }
    }

    public static class b extends FrameLayout implements o.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final CollapsibleActionView f28264a;

        /* JADX WARN: Multi-variable type inference failed */
        public b(View view) {
            super(view.getContext());
            this.f28264a = (CollapsibleActionView) view;
            addView(view);
        }

        public View a() {
            return (View) this.f28264a;
        }

        @Override // o.c
        public void onActionViewCollapsed() {
            this.f28264a.onActionViewCollapsed();
        }

        @Override // o.c
        public void onActionViewExpanded() {
            this.f28264a.onActionViewExpanded();
        }
    }

    /* JADX INFO: renamed from: p.c$c, reason: collision with other inner class name */
    public class MenuItemOnActionExpandListenerC0494c implements MenuItem.OnActionExpandListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final MenuItem.OnActionExpandListener f28265a;

        public MenuItemOnActionExpandListenerC0494c(MenuItem.OnActionExpandListener onActionExpandListener) {
            this.f28265a = onActionExpandListener;
        }

        @Override // android.view.MenuItem.OnActionExpandListener
        public boolean onMenuItemActionCollapse(MenuItem menuItem) {
            return this.f28265a.onMenuItemActionCollapse(c.this.c(menuItem));
        }

        @Override // android.view.MenuItem.OnActionExpandListener
        public boolean onMenuItemActionExpand(MenuItem menuItem) {
            return this.f28265a.onMenuItemActionExpand(c.this.c(menuItem));
        }
    }

    public class d implements MenuItem.OnMenuItemClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final MenuItem.OnMenuItemClickListener f28266a;

        public d(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
            this.f28266a = onMenuItemClickListener;
        }

        @Override // android.view.MenuItem.OnMenuItemClickListener
        public boolean onMenuItemClick(MenuItem menuItem) {
            return this.f28266a.onMenuItemClick(c.this.c(menuItem));
        }
    }

    public c(Context context, r2.b bVar) {
        super(context);
        if (bVar == null) {
            throw new IllegalArgumentException("Wrapped Object can not be null.");
        }
        this.f28259d = bVar;
    }

    @Override // android.view.MenuItem
    public boolean collapseActionView() {
        return this.f28259d.collapseActionView();
    }

    @Override // android.view.MenuItem
    public boolean expandActionView() {
        return this.f28259d.expandActionView();
    }

    @Override // android.view.MenuItem
    public ActionProvider getActionProvider() {
        androidx.core.view.b bVarA = this.f28259d.a();
        if (bVarA instanceof a) {
            return ((a) bVarA).f28262e;
        }
        return null;
    }

    @Override // android.view.MenuItem
    public View getActionView() {
        View actionView = this.f28259d.getActionView();
        return actionView instanceof b ? ((b) actionView).a() : actionView;
    }

    @Override // android.view.MenuItem
    public int getAlphabeticModifiers() {
        return this.f28259d.getAlphabeticModifiers();
    }

    @Override // android.view.MenuItem
    public char getAlphabeticShortcut() {
        return this.f28259d.getAlphabeticShortcut();
    }

    @Override // android.view.MenuItem
    public CharSequence getContentDescription() {
        return this.f28259d.getContentDescription();
    }

    @Override // android.view.MenuItem
    public int getGroupId() {
        return this.f28259d.getGroupId();
    }

    @Override // android.view.MenuItem
    public Drawable getIcon() {
        return this.f28259d.getIcon();
    }

    @Override // android.view.MenuItem
    public ColorStateList getIconTintList() {
        return this.f28259d.getIconTintList();
    }

    @Override // android.view.MenuItem
    public PorterDuff.Mode getIconTintMode() {
        return this.f28259d.getIconTintMode();
    }

    @Override // android.view.MenuItem
    public Intent getIntent() {
        return this.f28259d.getIntent();
    }

    @Override // android.view.MenuItem
    public int getItemId() {
        return this.f28259d.getItemId();
    }

    @Override // android.view.MenuItem
    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return this.f28259d.getMenuInfo();
    }

    @Override // android.view.MenuItem
    public int getNumericModifiers() {
        return this.f28259d.getNumericModifiers();
    }

    @Override // android.view.MenuItem
    public char getNumericShortcut() {
        return this.f28259d.getNumericShortcut();
    }

    @Override // android.view.MenuItem
    public int getOrder() {
        return this.f28259d.getOrder();
    }

    @Override // android.view.MenuItem
    public SubMenu getSubMenu() {
        return d(this.f28259d.getSubMenu());
    }

    @Override // android.view.MenuItem
    public CharSequence getTitle() {
        return this.f28259d.getTitle();
    }

    @Override // android.view.MenuItem
    public CharSequence getTitleCondensed() {
        return this.f28259d.getTitleCondensed();
    }

    @Override // android.view.MenuItem
    public CharSequence getTooltipText() {
        return this.f28259d.getTooltipText();
    }

    public void h(boolean z10) {
        try {
            if (this.f28260e == null) {
                this.f28260e = this.f28259d.getClass().getDeclaredMethod("setExclusiveCheckable", Boolean.TYPE);
            }
            this.f28260e.invoke(this.f28259d, Boolean.valueOf(z10));
        } catch (Exception e10) {
            Log.w("MenuItemWrapper", "Error while calling setExclusiveCheckable", e10);
        }
    }

    @Override // android.view.MenuItem
    public boolean hasSubMenu() {
        return this.f28259d.hasSubMenu();
    }

    @Override // android.view.MenuItem
    public boolean isActionViewExpanded() {
        return this.f28259d.isActionViewExpanded();
    }

    @Override // android.view.MenuItem
    public boolean isCheckable() {
        return this.f28259d.isCheckable();
    }

    @Override // android.view.MenuItem
    public boolean isChecked() {
        return this.f28259d.isChecked();
    }

    @Override // android.view.MenuItem
    public boolean isEnabled() {
        return this.f28259d.isEnabled();
    }

    @Override // android.view.MenuItem
    public boolean isVisible() {
        return this.f28259d.isVisible();
    }

    @Override // android.view.MenuItem
    public MenuItem setActionProvider(ActionProvider actionProvider) {
        a aVar = new a(this.f28257a, actionProvider);
        r2.b bVar = this.f28259d;
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
        this.f28259d.setActionView(view);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c10) {
        this.f28259d.setAlphabeticShortcut(c10);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setCheckable(boolean z10) {
        this.f28259d.setCheckable(z10);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setChecked(boolean z10) {
        this.f28259d.setChecked(z10);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setContentDescription(CharSequence charSequence) {
        this.f28259d.setContentDescription(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setEnabled(boolean z10) {
        this.f28259d.setEnabled(z10);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(Drawable drawable) {
        this.f28259d.setIcon(drawable);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f28259d.setIconTintList(colorStateList);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f28259d.setIconTintMode(mode);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIntent(Intent intent) {
        this.f28259d.setIntent(intent);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setNumericShortcut(char c10) {
        this.f28259d.setNumericShortcut(c10);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f28259d.setOnActionExpandListener(onActionExpandListener != null ? new MenuItemOnActionExpandListenerC0494c(onActionExpandListener) : null);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f28259d.setOnMenuItemClickListener(onMenuItemClickListener != null ? new d(onMenuItemClickListener) : null);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setShortcut(char c10, char c11) {
        this.f28259d.setShortcut(c10, c11);
        return this;
    }

    @Override // android.view.MenuItem
    public void setShowAsAction(int i10) {
        this.f28259d.setShowAsAction(i10);
    }

    @Override // android.view.MenuItem
    public MenuItem setShowAsActionFlags(int i10) {
        this.f28259d.setShowAsActionFlags(i10);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(CharSequence charSequence) {
        this.f28259d.setTitle(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f28259d.setTitleCondensed(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTooltipText(CharSequence charSequence) {
        this.f28259d.setTooltipText(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setVisible(boolean z10) {
        return this.f28259d.setVisible(z10);
    }

    @Override // android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c10, int i10) {
        this.f28259d.setAlphabeticShortcut(c10, i10);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(int i10) {
        this.f28259d.setIcon(i10);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setNumericShortcut(char c10, int i10) {
        this.f28259d.setNumericShortcut(c10, i10);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setShortcut(char c10, char c11, int i10, int i11) {
        this.f28259d.setShortcut(c10, c11, i10, i11);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(int i10) {
        this.f28259d.setTitle(i10);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setActionView(int i10) {
        this.f28259d.setActionView(i10);
        View actionView = this.f28259d.getActionView();
        if (actionView instanceof CollapsibleActionView) {
            this.f28259d.setActionView(new b(actionView));
        }
        return this;
    }
}
