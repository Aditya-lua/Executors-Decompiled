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
import androidx.core.view.AbstractC0585b;
import p181i.C6596h;
import p232k.C7399a;
import p368q2.C10425a;
import p399r2.InterfaceMenuItemC10778b;

/* JADX INFO: renamed from: androidx.appcompat.view.menu.g */
/* JADX INFO: loaded from: classes.dex */
public final class C0417g implements InterfaceMenuItemC10778b {

    /* JADX INFO: renamed from: A */
    public View f1228A;

    /* JADX INFO: renamed from: B */
    public AbstractC0585b f1229B;

    /* JADX INFO: renamed from: C */
    public MenuItem.OnActionExpandListener f1230C;

    /* JADX INFO: renamed from: E */
    public ContextMenu.ContextMenuInfo f1232E;

    /* JADX INFO: renamed from: a */
    public final int f1233a;

    /* JADX INFO: renamed from: b */
    public final int f1234b;

    /* JADX INFO: renamed from: c */
    public final int f1235c;

    /* JADX INFO: renamed from: d */
    public final int f1236d;

    /* JADX INFO: renamed from: e */
    public CharSequence f1237e;

    /* JADX INFO: renamed from: f */
    public CharSequence f1238f;

    /* JADX INFO: renamed from: g */
    public Intent f1239g;

    /* JADX INFO: renamed from: h */
    public char f1240h;

    /* JADX INFO: renamed from: j */
    public char f1242j;

    /* JADX INFO: renamed from: l */
    public Drawable f1244l;

    /* JADX INFO: renamed from: n */
    public C0415e f1246n;

    /* JADX INFO: renamed from: o */
    public SubMenuC0422l f1247o;

    /* JADX INFO: renamed from: p */
    public Runnable f1248p;

    /* JADX INFO: renamed from: q */
    public MenuItem.OnMenuItemClickListener f1249q;

    /* JADX INFO: renamed from: r */
    public CharSequence f1250r;

    /* JADX INFO: renamed from: s */
    public CharSequence f1251s;

    /* JADX INFO: renamed from: z */
    public int f1258z;

    /* JADX INFO: renamed from: i */
    public int f1241i = 4096;

    /* JADX INFO: renamed from: k */
    public int f1243k = 4096;

    /* JADX INFO: renamed from: m */
    public int f1245m = 0;

    /* JADX INFO: renamed from: t */
    public ColorStateList f1252t = null;

    /* JADX INFO: renamed from: u */
    public PorterDuff.Mode f1253u = null;

    /* JADX INFO: renamed from: v */
    public boolean f1254v = false;

    /* JADX INFO: renamed from: w */
    public boolean f1255w = false;

    /* JADX INFO: renamed from: x */
    public boolean f1256x = false;

    /* JADX INFO: renamed from: y */
    public int f1257y = 16;

    /* JADX INFO: renamed from: D */
    public boolean f1231D = false;

    /* JADX INFO: renamed from: androidx.appcompat.view.menu.g$a */
    public class a implements AbstractC0585b.b {
        public a() {
        }

        @Override // androidx.core.view.AbstractC0585b.b
        public void onActionProviderVisibilityChanged(boolean z10) {
            C0417g c0417g = C0417g.this;
            c0417g.f1246n.m1610K(c0417g);
        }
    }

    public C0417g(C0415e c0415e, int i10, int i11, int i12, int i13, CharSequence charSequence, int i14) {
        this.f1246n = c0415e;
        this.f1233a = i11;
        this.f1234b = i10;
        this.f1235c = i12;
        this.f1236d = i13;
        this.f1237e = charSequence;
        this.f1258z = i14;
    }

    /* JADX INFO: renamed from: d */
    public static void m1662d(StringBuilder sb2, int i10, int i11, String str) {
        if ((i10 & i11) == i11) {
            sb2.append(str);
        }
    }

    /* JADX INFO: renamed from: A */
    public boolean m1663A() {
        return this.f1246n.mo1608I() && m1670g() != 0;
    }

    /* JADX INFO: renamed from: B */
    public boolean m1664B() {
        return (this.f1258z & 4) == 4;
    }

    @Override // p399r2.InterfaceMenuItemC10778b
    /* JADX INFO: renamed from: a */
    public AbstractC0585b mo1665a() {
        return this.f1229B;
    }

    @Override // p399r2.InterfaceMenuItemC10778b
    @NonNull
    /* JADX INFO: renamed from: b */
    public InterfaceMenuItemC10778b mo1666b(AbstractC0585b abstractC0585b) {
        AbstractC0585b abstractC0585b2 = this.f1229B;
        if (abstractC0585b2 != null) {
            abstractC0585b2.m2811h();
        }
        this.f1228A = null;
        this.f1229B = abstractC0585b;
        this.f1246n.m1611L(true);
        AbstractC0585b abstractC0585b3 = this.f1229B;
        if (abstractC0585b3 != null) {
            abstractC0585b3.mo2813j(new a());
        }
        return this;
    }

    /* JADX INFO: renamed from: c */
    public void m1667c() {
        this.f1246n.m1609J(this);
    }

    @Override // p399r2.InterfaceMenuItemC10778b, android.view.MenuItem
    public boolean collapseActionView() {
        if ((this.f1258z & 8) == 0) {
            return false;
        }
        if (this.f1228A == null) {
            return true;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.f1230C;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionCollapse(this)) {
            return this.f1246n.mo1636f(this);
        }
        return false;
    }

    /* JADX INFO: renamed from: e */
    public final Drawable m1668e(Drawable drawable) {
        if (drawable != null && this.f1256x && (this.f1254v || this.f1255w)) {
            drawable = C10425a.m40121r(drawable).mutate();
            if (this.f1254v) {
                C10425a.m40118o(drawable, this.f1252t);
            }
            if (this.f1255w) {
                C10425a.m40119p(drawable, this.f1253u);
            }
            this.f1256x = false;
        }
        return drawable;
    }

    @Override // p399r2.InterfaceMenuItemC10778b, android.view.MenuItem
    public boolean expandActionView() {
        if (!m1673j()) {
            return false;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.f1230C;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionExpand(this)) {
            return this.f1246n.mo1641k(this);
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public int m1669f() {
        return this.f1236d;
    }

    /* JADX INFO: renamed from: g */
    public char m1670g() {
        return this.f1246n.mo1607H() ? this.f1242j : this.f1240h;
    }

    @Override // android.view.MenuItem
    public ActionProvider getActionProvider() {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    @Override // p399r2.InterfaceMenuItemC10778b, android.view.MenuItem
    public View getActionView() {
        View view = this.f1228A;
        if (view != null) {
            return view;
        }
        AbstractC0585b abstractC0585b = this.f1229B;
        if (abstractC0585b == null) {
            return null;
        }
        View viewMo2808d = abstractC0585b.mo2808d(this);
        this.f1228A = viewMo2808d;
        return viewMo2808d;
    }

    @Override // p399r2.InterfaceMenuItemC10778b, android.view.MenuItem
    public int getAlphabeticModifiers() {
        return this.f1243k;
    }

    @Override // android.view.MenuItem
    public char getAlphabeticShortcut() {
        return this.f1242j;
    }

    @Override // p399r2.InterfaceMenuItemC10778b, android.view.MenuItem
    public CharSequence getContentDescription() {
        return this.f1250r;
    }

    @Override // android.view.MenuItem
    public int getGroupId() {
        return this.f1234b;
    }

    @Override // android.view.MenuItem
    public Drawable getIcon() {
        Drawable drawable = this.f1244l;
        if (drawable != null) {
            return m1668e(drawable);
        }
        if (this.f1245m == 0) {
            return null;
        }
        Drawable drawableM30679b = C7399a.m30679b(this.f1246n.m1650u(), this.f1245m);
        this.f1245m = 0;
        this.f1244l = drawableM30679b;
        return m1668e(drawableM30679b);
    }

    @Override // p399r2.InterfaceMenuItemC10778b, android.view.MenuItem
    public ColorStateList getIconTintList() {
        return this.f1252t;
    }

    @Override // p399r2.InterfaceMenuItemC10778b, android.view.MenuItem
    public PorterDuff.Mode getIconTintMode() {
        return this.f1253u;
    }

    @Override // android.view.MenuItem
    public Intent getIntent() {
        return this.f1239g;
    }

    @Override // android.view.MenuItem
    @ViewDebug.CapturedViewProperty
    public int getItemId() {
        return this.f1233a;
    }

    @Override // android.view.MenuItem
    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return this.f1232E;
    }

    @Override // p399r2.InterfaceMenuItemC10778b, android.view.MenuItem
    public int getNumericModifiers() {
        return this.f1241i;
    }

    @Override // android.view.MenuItem
    public char getNumericShortcut() {
        return this.f1240h;
    }

    @Override // android.view.MenuItem
    public int getOrder() {
        return this.f1235c;
    }

    @Override // android.view.MenuItem
    public SubMenu getSubMenu() {
        return this.f1247o;
    }

    @Override // android.view.MenuItem
    @ViewDebug.CapturedViewProperty
    public CharSequence getTitle() {
        return this.f1237e;
    }

    @Override // android.view.MenuItem
    public CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f1238f;
        return charSequence != null ? charSequence : this.f1237e;
    }

    @Override // p399r2.InterfaceMenuItemC10778b, android.view.MenuItem
    public CharSequence getTooltipText() {
        return this.f1251s;
    }

    /* JADX INFO: renamed from: h */
    public String m1671h() {
        char cM1670g = m1670g();
        if (cM1670g == 0) {
            return "";
        }
        Resources resources = this.f1246n.m1650u().getResources();
        StringBuilder sb2 = new StringBuilder();
        if (ViewConfiguration.get(this.f1246n.m1650u()).hasPermanentMenuKey()) {
            sb2.append(resources.getString(C6596h.f25195o));
        }
        int i10 = this.f1246n.mo1607H() ? this.f1243k : this.f1241i;
        m1662d(sb2, i10, 65536, resources.getString(C6596h.f25191k));
        m1662d(sb2, i10, 4096, resources.getString(C6596h.f25187g));
        m1662d(sb2, i10, 2, resources.getString(C6596h.f25186f));
        m1662d(sb2, i10, 1, resources.getString(C6596h.f25192l));
        m1662d(sb2, i10, 4, resources.getString(C6596h.f25194n));
        m1662d(sb2, i10, 8, resources.getString(C6596h.f25190j));
        if (cM1670g == '\b') {
            sb2.append(resources.getString(C6596h.f25188h));
        } else if (cM1670g == '\n') {
            sb2.append(resources.getString(C6596h.f25189i));
        } else if (cM1670g != ' ') {
            sb2.append(cM1670g);
        } else {
            sb2.append(resources.getString(C6596h.f25193m));
        }
        return sb2.toString();
    }

    @Override // android.view.MenuItem
    public boolean hasSubMenu() {
        return this.f1247o != null;
    }

    /* JADX INFO: renamed from: i */
    public CharSequence m1672i(InterfaceC0420j.a aVar) {
        return (aVar == null || !aVar.mo1538d()) ? getTitle() : getTitleCondensed();
    }

    @Override // p399r2.InterfaceMenuItemC10778b, android.view.MenuItem
    public boolean isActionViewExpanded() {
        return this.f1231D;
    }

    @Override // android.view.MenuItem
    public boolean isCheckable() {
        return (this.f1257y & 1) == 1;
    }

    @Override // android.view.MenuItem
    public boolean isChecked() {
        return (this.f1257y & 2) == 2;
    }

    @Override // android.view.MenuItem
    public boolean isEnabled() {
        return (this.f1257y & 16) != 0;
    }

    @Override // android.view.MenuItem
    public boolean isVisible() {
        AbstractC0585b abstractC0585b = this.f1229B;
        if (abstractC0585b == null || !abstractC0585b.mo2810g()) {
            return (this.f1257y & 8) == 0;
        }
        return (this.f1257y & 8) == 0 && this.f1229B.mo2807b();
    }

    /* JADX INFO: renamed from: j */
    public boolean m1673j() {
        AbstractC0585b abstractC0585b;
        if ((this.f1258z & 8) != 0) {
            if (this.f1228A == null && (abstractC0585b = this.f1229B) != null) {
                this.f1228A = abstractC0585b.mo2808d(this);
            }
            if (this.f1228A != null) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: k */
    public boolean m1674k() {
        MenuItem.OnMenuItemClickListener onMenuItemClickListener = this.f1249q;
        if (onMenuItemClickListener != null && onMenuItemClickListener.onMenuItemClick(this)) {
            return true;
        }
        C0415e c0415e = this.f1246n;
        if (c0415e.mo1638h(c0415e, this)) {
            return true;
        }
        Runnable runnable = this.f1248p;
        if (runnable != null) {
            runnable.run();
            return true;
        }
        if (this.f1239g != null) {
            try {
                this.f1246n.m1650u().startActivity(this.f1239g);
                return true;
            } catch (ActivityNotFoundException e10) {
                Log.e("MenuItemImpl", "Can't find activity to handle intent; ignoring", e10);
            }
        }
        AbstractC0585b abstractC0585b = this.f1229B;
        return abstractC0585b != null && abstractC0585b.mo2809e();
    }

    /* JADX INFO: renamed from: l */
    public boolean m1675l() {
        return (this.f1257y & 32) == 32;
    }

    /* JADX INFO: renamed from: m */
    public boolean m1676m() {
        return (this.f1257y & 4) != 0;
    }

    /* JADX INFO: renamed from: n */
    public boolean m1677n() {
        return (this.f1258z & 1) == 1;
    }

    /* JADX INFO: renamed from: o */
    public boolean m1678o() {
        return (this.f1258z & 2) == 2;
    }

    /* JADX DEBUG: Method merged with bridge method: setActionView(I)Landroid/view/MenuItem; */
    @Override // p399r2.InterfaceMenuItemC10778b, android.view.MenuItem
    @NonNull
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public InterfaceMenuItemC10778b setActionView(int i10) {
        Context contextM1650u = this.f1246n.m1650u();
        setActionView(LayoutInflater.from(contextM1650u).inflate(i10, (ViewGroup) new LinearLayout(contextM1650u), false));
        return this;
    }

    /* JADX DEBUG: Method merged with bridge method: setActionView(Landroid/view/View;)Landroid/view/MenuItem; */
    @Override // p399r2.InterfaceMenuItemC10778b, android.view.MenuItem
    @NonNull
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public InterfaceMenuItemC10778b setActionView(View view) {
        int i10;
        this.f1228A = view;
        this.f1229B = null;
        if (view != null && view.getId() == -1 && (i10 = this.f1233a) > 0) {
            view.setId(i10);
        }
        this.f1246n.m1609J(this);
        return this;
    }

    /* JADX INFO: renamed from: r */
    public void m1681r(boolean z10) {
        this.f1231D = z10;
        this.f1246n.m1611L(false);
    }

    /* JADX INFO: renamed from: s */
    public void m1682s(boolean z10) {
        int i10 = this.f1257y;
        int i11 = (z10 ? 2 : 0) | (i10 & (-3));
        this.f1257y = i11;
        if (i10 != i11) {
            this.f1246n.m1611L(false);
        }
    }

    @Override // android.view.MenuItem
    public MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c10) {
        if (this.f1242j == c10) {
            return this;
        }
        this.f1242j = Character.toLowerCase(c10);
        this.f1246n.m1611L(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setCheckable(boolean z10) {
        int i10 = this.f1257y;
        int i11 = (z10 ? 1 : 0) | (i10 & (-2));
        this.f1257y = i11;
        if (i10 != i11) {
            this.f1246n.m1611L(false);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setChecked(boolean z10) {
        if ((this.f1257y & 4) != 0) {
            this.f1246n.m1620U(this);
            return this;
        }
        m1682s(z10);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setEnabled(boolean z10) {
        if (z10) {
            this.f1257y |= 16;
        } else {
            this.f1257y &= -17;
        }
        this.f1246n.m1611L(false);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.MenuItem
    public MenuItem setIcon(Drawable drawable) {
        this.f1245m = 0;
        this.f1244l = drawable;
        this.f1256x = true;
        this.f1246n.m1611L(false);
        return this;
    }

    @Override // p399r2.InterfaceMenuItemC10778b, android.view.MenuItem
    @NonNull
    public MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f1252t = colorStateList;
        this.f1254v = true;
        this.f1256x = true;
        this.f1246n.m1611L(false);
        return this;
    }

    @Override // p399r2.InterfaceMenuItemC10778b, android.view.MenuItem
    @NonNull
    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f1253u = mode;
        this.f1255w = true;
        this.f1256x = true;
        this.f1246n.m1611L(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIntent(Intent intent) {
        this.f1239g = intent;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.MenuItem
    public MenuItem setNumericShortcut(char c10) {
        if (this.f1240h == c10) {
            return this;
        }
        this.f1240h = c10;
        this.f1246n.m1611L(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f1230C = onActionExpandListener;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f1249q = onMenuItemClickListener;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.MenuItem
    public MenuItem setShortcut(char c10, char c11) {
        this.f1240h = c10;
        this.f1242j = Character.toLowerCase(c11);
        this.f1246n.m1611L(false);
        return this;
    }

    @Override // p399r2.InterfaceMenuItemC10778b, android.view.MenuItem
    public void setShowAsAction(int i10) {
        int i11 = i10 & 3;
        if (i11 != 0 && i11 != 1 && i11 != 2) {
            throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
        }
        this.f1258z = i10;
        this.f1246n.m1609J(this);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.MenuItem
    public MenuItem setTitle(CharSequence charSequence) {
        this.f1237e = charSequence;
        this.f1246n.m1611L(false);
        SubMenuC0422l subMenuC0422l = this.f1247o;
        if (subMenuC0422l != null) {
            subMenuC0422l.setHeaderTitle(charSequence);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f1238f = charSequence;
        this.f1246n.m1611L(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setVisible(boolean z10) {
        if (m1688y(z10)) {
            this.f1246n.m1610K(this);
        }
        return this;
    }

    /* JADX INFO: renamed from: t */
    public void m1683t(boolean z10) {
        this.f1257y = (z10 ? 4 : 0) | (this.f1257y & (-5));
    }

    public String toString() {
        CharSequence charSequence = this.f1237e;
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    /* JADX INFO: renamed from: u */
    public void m1684u(boolean z10) {
        if (z10) {
            this.f1257y |= 32;
        } else {
            this.f1257y &= -33;
        }
    }

    /* JADX INFO: renamed from: v */
    public void m1685v(ContextMenu.ContextMenuInfo contextMenuInfo) {
        this.f1232E = contextMenuInfo;
    }

    /* JADX DEBUG: Method merged with bridge method: setShowAsActionFlags(I)Landroid/view/MenuItem; */
    @Override // p399r2.InterfaceMenuItemC10778b, android.view.MenuItem
    @NonNull
    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public InterfaceMenuItemC10778b setShowAsActionFlags(int i10) {
        setShowAsAction(i10);
        return this;
    }

    /* JADX INFO: renamed from: x */
    public void m1687x(SubMenuC0422l subMenuC0422l) {
        this.f1247o = subMenuC0422l;
        subMenuC0422l.setHeaderTitle(getTitle());
    }

    /* JADX INFO: renamed from: y */
    public boolean m1688y(boolean z10) {
        int i10 = this.f1257y;
        int i11 = (z10 ? 0 : 8) | (i10 & (-9));
        this.f1257y = i11;
        return i10 != i11;
    }

    /* JADX INFO: renamed from: z */
    public boolean m1689z() {
        return this.f1246n.m1601A();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Method merged with bridge method: setContentDescription(Ljava/lang/CharSequence;)Landroid/view/MenuItem; */
    @Override // p399r2.InterfaceMenuItemC10778b, android.view.MenuItem
    @NonNull
    public InterfaceMenuItemC10778b setContentDescription(CharSequence charSequence) {
        this.f1250r = charSequence;
        this.f1246n.m1611L(false);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Method merged with bridge method: setTooltipText(Ljava/lang/CharSequence;)Landroid/view/MenuItem; */
    @Override // p399r2.InterfaceMenuItemC10778b, android.view.MenuItem
    @NonNull
    public InterfaceMenuItemC10778b setTooltipText(CharSequence charSequence) {
        this.f1251s = charSequence;
        this.f1246n.m1611L(false);
        return this;
    }

    @Override // p399r2.InterfaceMenuItemC10778b, android.view.MenuItem
    @NonNull
    public MenuItem setAlphabeticShortcut(char c10, int i10) {
        if (this.f1242j == c10 && this.f1243k == i10) {
            return this;
        }
        this.f1242j = Character.toLowerCase(c10);
        this.f1243k = KeyEvent.normalizeMetaState(i10);
        this.f1246n.m1611L(false);
        return this;
    }

    @Override // p399r2.InterfaceMenuItemC10778b, android.view.MenuItem
    @NonNull
    public MenuItem setNumericShortcut(char c10, int i10) {
        if (this.f1240h == c10 && this.f1241i == i10) {
            return this;
        }
        this.f1240h = c10;
        this.f1241i = KeyEvent.normalizeMetaState(i10);
        this.f1246n.m1611L(false);
        return this;
    }

    @Override // p399r2.InterfaceMenuItemC10778b, android.view.MenuItem
    @NonNull
    public MenuItem setShortcut(char c10, char c11, int i10, int i11) {
        this.f1240h = c10;
        this.f1241i = KeyEvent.normalizeMetaState(i10);
        this.f1242j = Character.toLowerCase(c11);
        this.f1243k = KeyEvent.normalizeMetaState(i11);
        this.f1246n.m1611L(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(int i10) {
        this.f1244l = null;
        this.f1245m = i10;
        this.f1256x = true;
        this.f1246n.m1611L(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(int i10) {
        return setTitle(this.f1246n.m1650u().getString(i10));
    }
}
