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
    public final int f787a;
    public final int b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f788c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f789d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public CharSequence f790e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public CharSequence f791f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Intent f792g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public char f793h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public char f795j;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Drawable f797l;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public e f799n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public l f800o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public Runnable f801p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public MenuItem.OnMenuItemClickListener f802q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public CharSequence f803r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public CharSequence f804s;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f811z;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f794i = Barcode.FORMAT_AZTEC;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f796k = Barcode.FORMAT_AZTEC;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f798m = 0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public ColorStateList f805t = null;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public PorterDuff.Mode f806u = null;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f807v = false;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f808w = false;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f809x = false;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f810y = 16;
    public boolean D = false;

    public class a implements androidx.core.view.b.InterfaceC0023b {
        public a() {
        }

        @Override // androidx.core.view.b.InterfaceC0023b
        public void onActionProviderVisibilityChanged(boolean z10) {
            g gVar = g.this;
            gVar.f799n.K(gVar);
        }
    }

    public g(e eVar, int i10, int i11, int i12, int i13, CharSequence charSequence, int i14) {
        this.f799n = eVar;
        this.f787a = i11;
        this.b = i10;
        this.f788c = i12;
        this.f789d = i13;
        this.f790e = charSequence;
        this.f811z = i14;
    }

    public static void d(StringBuilder sb2, int i10, int i11, String str) {
        if ((i10 & i11) == i11) {
            sb2.append(str);
        }
    }

    public boolean A() {
        return this.f799n.I() && g() != 0;
    }

    public boolean B() {
        return (this.f811z & 4) == 4;
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
        this.f799n.L(true);
        androidx.core.view.b bVar3 = this.B;
        if (bVar3 != null) {
            bVar3.j(new a());
        }
        return this;
    }

    public void c() {
        this.f799n.J(this);
    }

    @Override // r2.b, android.view.MenuItem
    public boolean collapseActionView() {
        if ((this.f811z & 8) == 0) {
            return false;
        }
        if (this.A == null) {
            return true;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.C;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionCollapse(this)) {
            return this.f799n.f(this);
        }
        return false;
    }

    public final Drawable e(Drawable drawable) {
        if (drawable != null && this.f809x && (this.f807v || this.f808w)) {
            drawable = q2.a.r(drawable).mutate();
            if (this.f807v) {
                q2.a.o(drawable, this.f805t);
            }
            if (this.f808w) {
                q2.a.p(drawable, this.f806u);
            }
            this.f809x = false;
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
            return this.f799n.k(this);
        }
        return false;
    }

    public int f() {
        return this.f789d;
    }

    public char g() {
        return this.f799n.H() ? this.f795j : this.f793h;
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
        return this.f796k;
    }

    @Override // android.view.MenuItem
    public char getAlphabeticShortcut() {
        return this.f795j;
    }

    @Override // r2.b, android.view.MenuItem
    public CharSequence getContentDescription() {
        return this.f803r;
    }

    @Override // android.view.MenuItem
    public int getGroupId() {
        return this.b;
    }

    @Override // android.view.MenuItem
    public Drawable getIcon() {
        Drawable drawable = this.f797l;
        if (drawable != null) {
            return e(drawable);
        }
        if (this.f798m == 0) {
            return null;
        }
        Drawable drawableB = k.a.b(this.f799n.u(), this.f798m);
        this.f798m = 0;
        this.f797l = drawableB;
        return e(drawableB);
    }

    @Override // r2.b, android.view.MenuItem
    public ColorStateList getIconTintList() {
        return this.f805t;
    }

    @Override // r2.b, android.view.MenuItem
    public PorterDuff.Mode getIconTintMode() {
        return this.f806u;
    }

    @Override // android.view.MenuItem
    public Intent getIntent() {
        return this.f792g;
    }

    @Override // android.view.MenuItem
    @ViewDebug.CapturedViewProperty
    public int getItemId() {
        return this.f787a;
    }

    @Override // android.view.MenuItem
    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return this.E;
    }

    @Override // r2.b, android.view.MenuItem
    public int getNumericModifiers() {
        return this.f794i;
    }

    @Override // android.view.MenuItem
    public char getNumericShortcut() {
        return this.f793h;
    }

    @Override // android.view.MenuItem
    public int getOrder() {
        return this.f788c;
    }

    @Override // android.view.MenuItem
    public SubMenu getSubMenu() {
        return this.f800o;
    }

    @Override // android.view.MenuItem
    @ViewDebug.CapturedViewProperty
    public CharSequence getTitle() {
        return this.f790e;
    }

    @Override // android.view.MenuItem
    public CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f791f;
        return charSequence != null ? charSequence : this.f790e;
    }

    @Override // r2.b, android.view.MenuItem
    public CharSequence getTooltipText() {
        return this.f804s;
    }

    public String h() {
        char cG = g();
        if (cG == 0) {
            return "";
        }
        Resources resources = this.f799n.u().getResources();
        StringBuilder sb2 = new StringBuilder();
        if (ViewConfiguration.get(this.f799n.u()).hasPermanentMenuKey()) {
            sb2.append(resources.getString(i.h.f20128o));
        }
        int i10 = this.f799n.H() ? this.f796k : this.f794i;
        d(sb2, i10, 65536, resources.getString(i.h.f20124k));
        d(sb2, i10, Barcode.FORMAT_AZTEC, resources.getString(i.h.f20120g));
        d(sb2, i10, 2, resources.getString(i.h.f20119f));
        d(sb2, i10, 1, resources.getString(i.h.f20125l));
        d(sb2, i10, 4, resources.getString(i.h.f20127n));
        d(sb2, i10, 8, resources.getString(i.h.f20123j));
        if (cG == '\b') {
            sb2.append(resources.getString(i.h.f20121h));
        } else if (cG == '\n') {
            sb2.append(resources.getString(i.h.f20122i));
        } else if (cG != ' ') {
            sb2.append(cG);
        } else {
            sb2.append(resources.getString(i.h.f20126m));
        }
        return sb2.toString();
    }

    @Override // android.view.MenuItem
    public boolean hasSubMenu() {
        return this.f800o != null;
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
        return (this.f810y & 1) == 1;
    }

    @Override // android.view.MenuItem
    public boolean isChecked() {
        return (this.f810y & 2) == 2;
    }

    @Override // android.view.MenuItem
    public boolean isEnabled() {
        return (this.f810y & 16) != 0;
    }

    @Override // android.view.MenuItem
    public boolean isVisible() {
        androidx.core.view.b bVar = this.B;
        if (bVar == null || !bVar.g()) {
            return (this.f810y & 8) == 0;
        }
        return (this.f810y & 8) == 0 && this.B.b();
    }

    public boolean j() {
        androidx.core.view.b bVar;
        if ((this.f811z & 8) != 0) {
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
        MenuItem.OnMenuItemClickListener onMenuItemClickListener = this.f802q;
        if (onMenuItemClickListener != null && onMenuItemClickListener.onMenuItemClick(this)) {
            return true;
        }
        e eVar = this.f799n;
        if (eVar.h(eVar, this)) {
            return true;
        }
        Runnable runnable = this.f801p;
        if (runnable != null) {
            runnable.run();
            return true;
        }
        if (this.f792g != null) {
            try {
                this.f799n.u().startActivity(this.f792g);
                return true;
            } catch (ActivityNotFoundException e10) {
                Log.e("MenuItemImpl", "Can't find activity to handle intent; ignoring", e10);
            }
        }
        androidx.core.view.b bVar = this.B;
        return bVar != null && bVar.e();
    }

    public boolean l() {
        return (this.f810y & 32) == 32;
    }

    public boolean m() {
        return (this.f810y & 4) != 0;
    }

    public boolean n() {
        return (this.f811z & 1) == 1;
    }

    public boolean o() {
        return (this.f811z & 2) == 2;
    }

    @Override // r2.b, android.view.MenuItem
    @NonNull
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public r2.b setActionView(int i10) {
        Context contextU = this.f799n.u();
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
        if (view != null && view.getId() == -1 && (i10 = this.f787a) > 0) {
            view.setId(i10);
        }
        this.f799n.J(this);
        return this;
    }

    public void r(boolean z10) {
        this.D = z10;
        this.f799n.L(false);
    }

    public void s(boolean z10) {
        int i10 = this.f810y;
        int i11 = (z10 ? 2 : 0) | (i10 & (-3));
        this.f810y = i11;
        if (i10 != i11) {
            this.f799n.L(false);
        }
    }

    @Override // android.view.MenuItem
    public MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
    }

    @Override // android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c10) {
        if (this.f795j == c10) {
            return this;
        }
        this.f795j = Character.toLowerCase(c10);
        this.f799n.L(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setCheckable(boolean z10) {
        int i10 = this.f810y;
        int i11 = (z10 ? 1 : 0) | (i10 & (-2));
        this.f810y = i11;
        if (i10 != i11) {
            this.f799n.L(false);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setChecked(boolean z10) {
        if ((this.f810y & 4) != 0) {
            this.f799n.U(this);
            return this;
        }
        s(z10);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setEnabled(boolean z10) {
        if (z10) {
            this.f810y |= 16;
        } else {
            this.f810y &= -17;
        }
        this.f799n.L(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(Drawable drawable) {
        this.f798m = 0;
        this.f797l = drawable;
        this.f809x = true;
        this.f799n.L(false);
        return this;
    }

    @Override // r2.b, android.view.MenuItem
    @NonNull
    public MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f805t = colorStateList;
        this.f807v = true;
        this.f809x = true;
        this.f799n.L(false);
        return this;
    }

    @Override // r2.b, android.view.MenuItem
    @NonNull
    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f806u = mode;
        this.f808w = true;
        this.f809x = true;
        this.f799n.L(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIntent(Intent intent) {
        this.f792g = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setNumericShortcut(char c10) {
        if (this.f793h == c10) {
            return this;
        }
        this.f793h = c10;
        this.f799n.L(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.C = onActionExpandListener;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f802q = onMenuItemClickListener;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setShortcut(char c10, char c11) {
        this.f793h = c10;
        this.f795j = Character.toLowerCase(c11);
        this.f799n.L(false);
        return this;
    }

    @Override // r2.b, android.view.MenuItem
    public void setShowAsAction(int i10) {
        int i11 = i10 & 3;
        if (i11 != 0 && i11 != 1 && i11 != 2) {
            throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
        }
        this.f811z = i10;
        this.f799n.J(this);
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(CharSequence charSequence) {
        this.f790e = charSequence;
        this.f799n.L(false);
        l lVar = this.f800o;
        if (lVar != null) {
            lVar.setHeaderTitle(charSequence);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f791f = charSequence;
        this.f799n.L(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setVisible(boolean z10) {
        if (y(z10)) {
            this.f799n.K(this);
        }
        return this;
    }

    public void t(boolean z10) {
        this.f810y = (z10 ? 4 : 0) | (this.f810y & (-5));
    }

    public String toString() {
        CharSequence charSequence = this.f790e;
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    public void u(boolean z10) {
        if (z10) {
            this.f810y |= 32;
        } else {
            this.f810y &= -33;
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
        this.f800o = lVar;
        lVar.setHeaderTitle(getTitle());
    }

    public boolean y(boolean z10) {
        int i10 = this.f810y;
        int i11 = (z10 ? 0 : 8) | (i10 & (-9));
        this.f810y = i11;
        return i10 != i11;
    }

    public boolean z() {
        return this.f799n.A();
    }

    @Override // r2.b, android.view.MenuItem
    @NonNull
    public r2.b setContentDescription(CharSequence charSequence) {
        this.f803r = charSequence;
        this.f799n.L(false);
        return this;
    }

    @Override // r2.b, android.view.MenuItem
    @NonNull
    public r2.b setTooltipText(CharSequence charSequence) {
        this.f804s = charSequence;
        this.f799n.L(false);
        return this;
    }

    @Override // r2.b, android.view.MenuItem
    @NonNull
    public MenuItem setAlphabeticShortcut(char c10, int i10) {
        if (this.f795j == c10 && this.f796k == i10) {
            return this;
        }
        this.f795j = Character.toLowerCase(c10);
        this.f796k = KeyEvent.normalizeMetaState(i10);
        this.f799n.L(false);
        return this;
    }

    @Override // r2.b, android.view.MenuItem
    @NonNull
    public MenuItem setNumericShortcut(char c10, int i10) {
        if (this.f793h == c10 && this.f794i == i10) {
            return this;
        }
        this.f793h = c10;
        this.f794i = KeyEvent.normalizeMetaState(i10);
        this.f799n.L(false);
        return this;
    }

    @Override // r2.b, android.view.MenuItem
    @NonNull
    public MenuItem setShortcut(char c10, char c11, int i10, int i11) {
        this.f793h = c10;
        this.f794i = KeyEvent.normalizeMetaState(i10);
        this.f795j = Character.toLowerCase(c11);
        this.f796k = KeyEvent.normalizeMetaState(i11);
        this.f799n.L(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(int i10) {
        this.f797l = null;
        this.f798m = i10;
        this.f809x = true;
        this.f799n.L(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(int i10) {
        return setTitle(this.f799n.u().getString(i10));
    }
}
