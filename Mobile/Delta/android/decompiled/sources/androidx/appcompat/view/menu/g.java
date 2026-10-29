package androidx.appcompat.view.menu;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewDebug;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import com.google.mlkit.vision.barcode.common.Barcode;

/* JADX INFO: loaded from: classes.dex */
public final class g implements r2.b {
    public View A;
    public androidx.core.view.b B;
    public MenuItem.OnActionExpandListener C;
    public ContextMenu.ContextMenuInfo E;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f942a;
    public final int b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f943c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f944d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public CharSequence f945e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public CharSequence f946f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Intent f947g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public char f948h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public char f950j;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Drawable f952l;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public e f954n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public l f955o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public Runnable f956p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public MenuItem.OnMenuItemClickListener f957q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public CharSequence f958r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public CharSequence f959s;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f966z;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f949i = Barcode.FORMAT_AZTEC;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f951k = Barcode.FORMAT_AZTEC;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f953m = 0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public ColorStateList f960t = null;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public PorterDuff.Mode f961u = null;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f962v = false;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f963w = false;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f964x = false;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f965y = 16;
    public boolean D = false;

    public class a implements androidx.core.view.b.InterfaceC0027b {
        public a() {
        }

        @Override // androidx.core.view.b.InterfaceC0027b
        public void onActionProviderVisibilityChanged(boolean z10) {
            g gVar = g.this;
            gVar.f954n.K(gVar);
        }
    }

    public g(e eVar, int i10, int i11, int i12, int i13, CharSequence charSequence, int i14) {
        this.f954n = eVar;
        this.f942a = i11;
        this.b = i10;
        this.f943c = i12;
        this.f944d = i13;
        this.f945e = charSequence;
        this.f966z = i14;
    }

    public static void d(StringBuilder sb2, int i10, int i11, String str) {
        if ((i10 & i11) == i11) {
            sb2.append(str);
        }
    }

    public boolean A() {
        return this.f954n.I() && g() != 0;
    }

    public boolean B() {
        return (this.f966z & 4) == 4;
    }

    @Override // r2.b
    public androidx.core.view.b a() {
        return this.B;
    }

    @Override // r2.b
    @NonNull
    public r2.b b(androidx.core.view.b bVar) {
        androidx.core.view.b bVar2 = this.B;
        if (bVar2 != null) {
            bVar2.h();
        }
        this.A = null;
        this.B = bVar;
        this.f954n.L(true);
        androidx.core.view.b bVar3 = this.B;
        if (bVar3 != null) {
            bVar3.j(new a());
        }
        return this;
    }

    public void c() {
        this.f954n.J(this);
    }

    @Override // r2.b, android.view.MenuItem
    public boolean collapseActionView() {
        if ((this.f966z & 8) == 0) {
            return false;
        }
        if (this.A == null) {
            return true;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.C;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionCollapse(this)) {
            return this.f954n.f(this);
        }
        return false;
    }

    public final Drawable e(Drawable drawable) {
        if (drawable != null && this.f964x && (this.f962v || this.f963w)) {
            drawable = q2.a.r(drawable).mutate();
            if (this.f962v) {
                q2.a.o(drawable, this.f960t);
            }
            if (this.f963w) {
                q2.a.p(drawable, this.f961u);
            }
            this.f964x = false;
        }
        return drawable;
    }

    @Override // r2.b, android.view.MenuItem
    public boolean expandActionView() {
        if (!j()) {
            return false;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.C;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionExpand(this)) {
            return this.f954n.k(this);
        }
        return false;
    }

    public int f() {
        return this.f944d;
    }

    public char g() {
        return this.f954n.H() ? this.f950j : this.f948h;
    }

    @Override // android.view.MenuItem
    public ActionProvider getActionProvider() {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    @Override // r2.b, android.view.MenuItem
    public View getActionView() {
        View view = this.A;
        if (view != null) {
            return view;
        }
        androidx.core.view.b bVar = this.B;
        if (bVar == null) {
            return null;
        }
        View viewD = bVar.d(this);
        this.A = viewD;
        return viewD;
    }

    @Override // r2.b, android.view.MenuItem
    public int getAlphabeticModifiers() {
        return this.f951k;
    }

    @Override // android.view.MenuItem
    public char getAlphabeticShortcut() {
        return this.f950j;
    }

    @Override // r2.b, android.view.MenuItem
    public CharSequence getContentDescription() {
        return this.f958r;
    }

    @Override // android.view.MenuItem
    public int getGroupId() {
        return this.b;
    }

    @Override // android.view.MenuItem
    public Drawable getIcon() {
        Drawable drawable = this.f952l;
        if (drawable != null) {
            return e(drawable);
        }
        if (this.f953m == 0) {
            return null;
        }
        Drawable drawableB = k.a.b(this.f954n.u(), this.f953m);
        this.f953m = 0;
        this.f952l = drawableB;
        return e(drawableB);
    }

    @Override // r2.b, android.view.MenuItem
    public ColorStateList getIconTintList() {
        return this.f960t;
    }

    @Override // r2.b, android.view.MenuItem
    public PorterDuff.Mode getIconTintMode() {
        return this.f961u;
    }

    @Override // android.view.MenuItem
    public Intent getIntent() {
        return this.f947g;
    }

    @Override // android.view.MenuItem
    @ViewDebug.CapturedViewProperty
    public int getItemId() {
        return this.f942a;
    }

    @Override // android.view.MenuItem
    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return this.E;
    }

    @Override // r2.b, android.view.MenuItem
    public int getNumericModifiers() {
        return this.f949i;
    }

    @Override // android.view.MenuItem
    public char getNumericShortcut() {
        return this.f948h;
    }

    @Override // android.view.MenuItem
    public int getOrder() {
        return this.f943c;
    }

    @Override // android.view.MenuItem
    public SubMenu getSubMenu() {
        return this.f955o;
    }

    @Override // android.view.MenuItem
    @ViewDebug.CapturedViewProperty
    public CharSequence getTitle() {
        return this.f945e;
    }

    @Override // android.view.MenuItem
    public CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f946f;
        return charSequence != null ? charSequence : this.f945e;
    }

    @Override // r2.b, android.view.MenuItem
    public CharSequence getTooltipText() {
        return this.f959s;
    }

    public String h() {
        char cG = g();
        if (cG == 0) {
            return "";
        }
        Resources resources = this.f954n.u().getResources();
        StringBuilder sb2 = new StringBuilder();
        if (ViewConfiguration.get(this.f954n.u()).hasPermanentMenuKey()) {
            sb2.append(resources.getString(i.h.f20012o));
        }
        int i10 = this.f954n.H() ? this.f951k : this.f949i;
        d(sb2, i10, 65536, resources.getString(i.h.f20008k));
        d(sb2, i10, Barcode.FORMAT_AZTEC, resources.getString(i.h.f20004g));
        d(sb2, i10, 2, resources.getString(i.h.f20003f));
        d(sb2, i10, 1, resources.getString(i.h.f20009l));
        d(sb2, i10, 4, resources.getString(i.h.f20011n));
        d(sb2, i10, 8, resources.getString(i.h.f20007j));
        if (cG == '\b') {
            sb2.append(resources.getString(i.h.f20005h));
        } else if (cG == '\n') {
            sb2.append(resources.getString(i.h.f20006i));
        } else if (cG != ' ') {
            sb2.append(cG);
        } else {
            sb2.append(resources.getString(i.h.f20010m));
        }
        return sb2.toString();
    }

    @Override // android.view.MenuItem
    public boolean hasSubMenu() {
        return this.f955o != null;
    }

    public CharSequence i(j.a aVar) {
        return (aVar == null || !aVar.d()) ? getTitle() : getTitleCondensed();
    }

    @Override // r2.b, android.view.MenuItem
    public boolean isActionViewExpanded() {
        return this.D;
    }

    @Override // android.view.MenuItem
    public boolean isCheckable() {
        return (this.f965y & 1) == 1;
    }

    @Override // android.view.MenuItem
    public boolean isChecked() {
        return (this.f965y & 2) == 2;
    }

    @Override // android.view.MenuItem
    public boolean isEnabled() {
        return (this.f965y & 16) != 0;
    }

    @Override // android.view.MenuItem
    public boolean isVisible() {
        androidx.core.view.b bVar = this.B;
        if (bVar == null || !bVar.g()) {
            return (this.f965y & 8) == 0;
        }
        return (this.f965y & 8) == 0 && this.B.b();
    }

    public boolean j() {
        androidx.core.view.b bVar;
        if ((this.f966z & 8) != 0) {
            if (this.A == null && (bVar = this.B) != null) {
                this.A = bVar.d(this);
            }
            if (this.A != null) {
                return true;
            }
        }
        return false;
    }

    public boolean k() {
        MenuItem.OnMenuItemClickListener onMenuItemClickListener = this.f957q;
        if (onMenuItemClickListener != null && onMenuItemClickListener.onMenuItemClick(this)) {
            return true;
        }
        e eVar = this.f954n;
        if (eVar.h(eVar, this)) {
            return true;
        }
        Runnable runnable = this.f956p;
        if (runnable != null) {
            runnable.run();
            return true;
        }
        if (this.f947g != null) {
            try {
                this.f954n.u().startActivity(this.f947g);
                return true;
            } catch (ActivityNotFoundException e10) {
                Log.e("MenuItemImpl", "Can't find activity to handle intent; ignoring", e10);
            }
        }
        androidx.core.view.b bVar = this.B;
        return bVar != null && bVar.e();
    }

    public boolean l() {
        return (this.f965y & 32) == 32;
    }

    public boolean m() {
        return (this.f965y & 4) != 0;
    }

    public boolean n() {
        return (this.f966z & 1) == 1;
    }

    public boolean o() {
        return (this.f966z & 2) == 2;
    }

    @Override // r2.b, android.view.MenuItem
    @NonNull
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public r2.b setActionView(int i10) {
        Context contextU = this.f954n.u();
        setActionView(LayoutInflater.from(contextU).inflate(i10, (ViewGroup) new LinearLayout(contextU), false));
        return this;
    }

    @Override // r2.b, android.view.MenuItem
    @NonNull
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public r2.b setActionView(View view) {
        int i10;
        this.A = view;
        this.B = null;
        if (view != null && view.getId() == -1 && (i10 = this.f942a) > 0) {
            view.setId(i10);
        }
        this.f954n.J(this);
        return this;
    }

    public void r(boolean z10) {
        this.D = z10;
        this.f954n.L(false);
    }

    public void s(boolean z10) {
        int i10 = this.f965y;
        int i11 = (z10 ? 2 : 0) | (i10 & (-3));
        this.f965y = i11;
        if (i10 != i11) {
            this.f954n.L(false);
        }
    }

    @Override // android.view.MenuItem
    public MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
    }

    @Override // android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c10) {
        if (this.f950j == c10) {
            return this;
        }
        this.f950j = Character.toLowerCase(c10);
        this.f954n.L(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setCheckable(boolean z10) {
        int i10 = this.f965y;
        int i11 = (z10 ? 1 : 0) | (i10 & (-2));
        this.f965y = i11;
        if (i10 != i11) {
            this.f954n.L(false);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setChecked(boolean z10) {
        if ((this.f965y & 4) != 0) {
            this.f954n.U(this);
            return this;
        }
        s(z10);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setEnabled(boolean z10) {
        if (z10) {
            this.f965y |= 16;
        } else {
            this.f965y &= -17;
        }
        this.f954n.L(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(Drawable drawable) {
        this.f953m = 0;
        this.f952l = drawable;
        this.f964x = true;
        this.f954n.L(false);
        return this;
    }

    @Override // r2.b, android.view.MenuItem
    @NonNull
    public MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f960t = colorStateList;
        this.f962v = true;
        this.f964x = true;
        this.f954n.L(false);
        return this;
    }

    @Override // r2.b, android.view.MenuItem
    @NonNull
    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f961u = mode;
        this.f963w = true;
        this.f964x = true;
        this.f954n.L(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIntent(Intent intent) {
        this.f947g = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setNumericShortcut(char c10) {
        if (this.f948h == c10) {
            return this;
        }
        this.f948h = c10;
        this.f954n.L(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.C = onActionExpandListener;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f957q = onMenuItemClickListener;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setShortcut(char c10, char c11) {
        this.f948h = c10;
        this.f950j = Character.toLowerCase(c11);
        this.f954n.L(false);
        return this;
    }

    @Override // r2.b, android.view.MenuItem
    public void setShowAsAction(int i10) {
        int i11 = i10 & 3;
        if (i11 != 0 && i11 != 1 && i11 != 2) {
            throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
        }
        this.f966z = i10;
        this.f954n.J(this);
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(CharSequence charSequence) {
        this.f945e = charSequence;
        this.f954n.L(false);
        l lVar = this.f955o;
        if (lVar != null) {
            lVar.setHeaderTitle(charSequence);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f946f = charSequence;
        this.f954n.L(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setVisible(boolean z10) {
        if (y(z10)) {
            this.f954n.K(this);
        }
        return this;
    }

    public void t(boolean z10) {
        this.f965y = (z10 ? 4 : 0) | (this.f965y & (-5));
    }

    public String toString() {
        CharSequence charSequence = this.f945e;
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    public void u(boolean z10) {
        if (z10) {
            this.f965y |= 32;
        } else {
            this.f965y &= -33;
        }
    }

    public void v(ContextMenu.ContextMenuInfo contextMenuInfo) {
        this.E = contextMenuInfo;
    }

    @Override // r2.b, android.view.MenuItem
    @NonNull
    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public r2.b setShowAsActionFlags(int i10) {
        setShowAsAction(i10);
        return this;
    }

    public void x(l lVar) {
        this.f955o = lVar;
        lVar.setHeaderTitle(getTitle());
    }

    public boolean y(boolean z10) {
        int i10 = this.f965y;
        int i11 = (z10 ? 0 : 8) | (i10 & (-9));
        this.f965y = i11;
        return i10 != i11;
    }

    public boolean z() {
        return this.f954n.A();
    }

    @Override // r2.b, android.view.MenuItem
    @NonNull
    public r2.b setContentDescription(CharSequence charSequence) {
        this.f958r = charSequence;
        this.f954n.L(false);
        return this;
    }

    @Override // r2.b, android.view.MenuItem
    @NonNull
    public r2.b setTooltipText(CharSequence charSequence) {
        this.f959s = charSequence;
        this.f954n.L(false);
        return this;
    }

    @Override // r2.b, android.view.MenuItem
    @NonNull
    public MenuItem setAlphabeticShortcut(char c10, int i10) {
        if (this.f950j == c10 && this.f951k == i10) {
            return this;
        }
        this.f950j = Character.toLowerCase(c10);
        this.f951k = KeyEvent.normalizeMetaState(i10);
        this.f954n.L(false);
        return this;
    }

    @Override // r2.b, android.view.MenuItem
    @NonNull
    public MenuItem setNumericShortcut(char c10, int i10) {
        if (this.f948h == c10 && this.f949i == i10) {
            return this;
        }
        this.f948h = c10;
        this.f949i = KeyEvent.normalizeMetaState(i10);
        this.f954n.L(false);
        return this;
    }

    @Override // r2.b, android.view.MenuItem
    @NonNull
    public MenuItem setShortcut(char c10, char c11, int i10, int i11) {
        this.f948h = c10;
        this.f949i = KeyEvent.normalizeMetaState(i10);
        this.f950j = Character.toLowerCase(c11);
        this.f951k = KeyEvent.normalizeMetaState(i11);
        this.f954n.L(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(int i10) {
        this.f952l = null;
        this.f953m = i10;
        this.f964x = true;
        this.f954n.L(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(int i10) {
        return setTitle(this.f954n.u().getString(i10));
    }
}
