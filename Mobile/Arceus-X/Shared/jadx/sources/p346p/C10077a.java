package p346p;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.core.view.AbstractC0585b;
import p261l2.C7975b;
import p368q2.C10425a;
import p399r2.InterfaceMenuItemC10778b;

/* JADX INFO: renamed from: p.a */
/* JADX INFO: loaded from: classes.dex */
public class C10077a implements InterfaceMenuItemC10778b {

    /* JADX INFO: renamed from: a */
    public final int f36278a;

    /* JADX INFO: renamed from: b */
    public final int f36279b;

    /* JADX INFO: renamed from: c */
    public final int f36280c;

    /* JADX INFO: renamed from: d */
    public CharSequence f36281d;

    /* JADX INFO: renamed from: e */
    public CharSequence f36282e;

    /* JADX INFO: renamed from: f */
    public Intent f36283f;

    /* JADX INFO: renamed from: g */
    public char f36284g;

    /* JADX INFO: renamed from: i */
    public char f36286i;

    /* JADX INFO: renamed from: k */
    public Drawable f36288k;

    /* JADX INFO: renamed from: l */
    public Context f36289l;

    /* JADX INFO: renamed from: m */
    public MenuItem.OnMenuItemClickListener f36290m;

    /* JADX INFO: renamed from: n */
    public CharSequence f36291n;

    /* JADX INFO: renamed from: o */
    public CharSequence f36292o;

    /* JADX INFO: renamed from: h */
    public int f36285h = 4096;

    /* JADX INFO: renamed from: j */
    public int f36287j = 4096;

    /* JADX INFO: renamed from: p */
    public ColorStateList f36293p = null;

    /* JADX INFO: renamed from: q */
    public PorterDuff.Mode f36294q = null;

    /* JADX INFO: renamed from: r */
    public boolean f36295r = false;

    /* JADX INFO: renamed from: s */
    public boolean f36296s = false;

    /* JADX INFO: renamed from: t */
    public int f36297t = 16;

    public C10077a(Context context, int i10, int i11, int i12, int i13, CharSequence charSequence) {
        this.f36289l = context;
        this.f36278a = i11;
        this.f36279b = i10;
        this.f36280c = i13;
        this.f36281d = charSequence;
    }

    @Override // p399r2.InterfaceMenuItemC10778b
    /* JADX INFO: renamed from: a */
    public AbstractC0585b mo1665a() {
        return null;
    }

    @Override // p399r2.InterfaceMenuItemC10778b
    @NonNull
    /* JADX INFO: renamed from: b */
    public InterfaceMenuItemC10778b mo1666b(AbstractC0585b abstractC0585b) {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: renamed from: c */
    public final void m38847c() {
        Drawable drawable = this.f36288k;
        if (drawable != null) {
            if (this.f36295r || this.f36296s) {
                Drawable drawableM40121r = C10425a.m40121r(drawable);
                this.f36288k = drawableM40121r;
                Drawable drawableMutate = drawableM40121r.mutate();
                this.f36288k = drawableMutate;
                if (this.f36295r) {
                    C10425a.m40118o(drawableMutate, this.f36293p);
                }
                if (this.f36296s) {
                    C10425a.m40119p(this.f36288k, this.f36294q);
                }
            }
        }
    }

    @Override // p399r2.InterfaceMenuItemC10778b, android.view.MenuItem
    public boolean collapseActionView() {
        return false;
    }

    /* JADX DEBUG: Method merged with bridge method: setActionView(I)Landroid/view/MenuItem; */
    @Override // p399r2.InterfaceMenuItemC10778b, android.view.MenuItem
    @NonNull
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public InterfaceMenuItemC10778b setActionView(int i10) {
        throw new UnsupportedOperationException();
    }

    /* JADX DEBUG: Method merged with bridge method: setActionView(Landroid/view/View;)Landroid/view/MenuItem; */
    @Override // p399r2.InterfaceMenuItemC10778b, android.view.MenuItem
    @NonNull
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public InterfaceMenuItemC10778b setActionView(View view) {
        throw new UnsupportedOperationException();
    }

    @Override // p399r2.InterfaceMenuItemC10778b, android.view.MenuItem
    public boolean expandActionView() {
        return false;
    }

    /* JADX DEBUG: Method merged with bridge method: setShowAsActionFlags(I)Landroid/view/MenuItem; */
    @Override // p399r2.InterfaceMenuItemC10778b, android.view.MenuItem
    @NonNull
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public InterfaceMenuItemC10778b setShowAsActionFlags(int i10) {
        setShowAsAction(i10);
        return this;
    }

    @Override // android.view.MenuItem
    public ActionProvider getActionProvider() {
        throw new UnsupportedOperationException();
    }

    @Override // p399r2.InterfaceMenuItemC10778b, android.view.MenuItem
    public View getActionView() {
        return null;
    }

    @Override // p399r2.InterfaceMenuItemC10778b, android.view.MenuItem
    public int getAlphabeticModifiers() {
        return this.f36287j;
    }

    @Override // android.view.MenuItem
    public char getAlphabeticShortcut() {
        return this.f36286i;
    }

    @Override // p399r2.InterfaceMenuItemC10778b, android.view.MenuItem
    public CharSequence getContentDescription() {
        return this.f36291n;
    }

    @Override // android.view.MenuItem
    public int getGroupId() {
        return this.f36279b;
    }

    @Override // android.view.MenuItem
    public Drawable getIcon() {
        return this.f36288k;
    }

    @Override // p399r2.InterfaceMenuItemC10778b, android.view.MenuItem
    public ColorStateList getIconTintList() {
        return this.f36293p;
    }

    @Override // p399r2.InterfaceMenuItemC10778b, android.view.MenuItem
    public PorterDuff.Mode getIconTintMode() {
        return this.f36294q;
    }

    @Override // android.view.MenuItem
    public Intent getIntent() {
        return this.f36283f;
    }

    @Override // android.view.MenuItem
    public int getItemId() {
        return this.f36278a;
    }

    @Override // android.view.MenuItem
    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    @Override // p399r2.InterfaceMenuItemC10778b, android.view.MenuItem
    public int getNumericModifiers() {
        return this.f36285h;
    }

    @Override // android.view.MenuItem
    public char getNumericShortcut() {
        return this.f36284g;
    }

    @Override // android.view.MenuItem
    public int getOrder() {
        return this.f36280c;
    }

    @Override // android.view.MenuItem
    public SubMenu getSubMenu() {
        return null;
    }

    @Override // android.view.MenuItem
    public CharSequence getTitle() {
        return this.f36281d;
    }

    @Override // android.view.MenuItem
    public CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f36282e;
        return charSequence != null ? charSequence : this.f36281d;
    }

    @Override // p399r2.InterfaceMenuItemC10778b, android.view.MenuItem
    public CharSequence getTooltipText() {
        return this.f36292o;
    }

    @Override // android.view.MenuItem
    public boolean hasSubMenu() {
        return false;
    }

    @Override // p399r2.InterfaceMenuItemC10778b, android.view.MenuItem
    public boolean isActionViewExpanded() {
        return false;
    }

    @Override // android.view.MenuItem
    public boolean isCheckable() {
        return (this.f36297t & 1) != 0;
    }

    @Override // android.view.MenuItem
    public boolean isChecked() {
        return (this.f36297t & 2) != 0;
    }

    @Override // android.view.MenuItem
    public boolean isEnabled() {
        return (this.f36297t & 16) != 0;
    }

    @Override // android.view.MenuItem
    public boolean isVisible() {
        return (this.f36297t & 8) == 0;
    }

    @Override // android.view.MenuItem
    public MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c10) {
        this.f36286i = Character.toLowerCase(c10);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setCheckable(boolean z10) {
        this.f36297t = (z10 ? 1 : 0) | (this.f36297t & (-2));
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setChecked(boolean z10) {
        this.f36297t = (z10 ? 2 : 0) | (this.f36297t & (-3));
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setEnabled(boolean z10) {
        this.f36297t = (z10 ? 16 : 0) | (this.f36297t & (-17));
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.MenuItem
    public MenuItem setIcon(Drawable drawable) {
        this.f36288k = drawable;
        m38847c();
        return this;
    }

    @Override // p399r2.InterfaceMenuItemC10778b, android.view.MenuItem
    @NonNull
    public MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f36293p = colorStateList;
        this.f36295r = true;
        m38847c();
        return this;
    }

    @Override // p399r2.InterfaceMenuItemC10778b, android.view.MenuItem
    @NonNull
    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f36294q = mode;
        this.f36296s = true;
        m38847c();
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIntent(Intent intent) {
        this.f36283f = intent;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.MenuItem
    public MenuItem setNumericShortcut(char c10) {
        this.f36284g = c10;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f36290m = onMenuItemClickListener;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.MenuItem
    public MenuItem setShortcut(char c10, char c11) {
        this.f36284g = c10;
        this.f36286i = Character.toLowerCase(c11);
        return this;
    }

    @Override // p399r2.InterfaceMenuItemC10778b, android.view.MenuItem
    public void setShowAsAction(int i10) {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.MenuItem
    public MenuItem setTitle(CharSequence charSequence) {
        this.f36281d = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f36282e = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setVisible(boolean z10) {
        this.f36297t = (this.f36297t & 8) | (z10 ? 0 : 8);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @Override // p399r2.InterfaceMenuItemC10778b, android.view.MenuItem
    @NonNull
    public MenuItem setAlphabeticShortcut(char c10, int i10) {
        this.f36286i = Character.toLowerCase(c10);
        this.f36287j = KeyEvent.normalizeMetaState(i10);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Method merged with bridge method: setContentDescription(Ljava/lang/CharSequence;)Landroid/view/MenuItem; */
    @Override // p399r2.InterfaceMenuItemC10778b, android.view.MenuItem
    @NonNull
    public InterfaceMenuItemC10778b setContentDescription(CharSequence charSequence) {
        this.f36291n = charSequence;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @Override // p399r2.InterfaceMenuItemC10778b, android.view.MenuItem
    @NonNull
    public MenuItem setNumericShortcut(char c10, int i10) {
        this.f36284g = c10;
        this.f36285h = KeyEvent.normalizeMetaState(i10);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @Override // android.view.MenuItem
    public MenuItem setTitle(int i10) {
        this.f36281d = this.f36289l.getResources().getString(i10);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Method merged with bridge method: setTooltipText(Ljava/lang/CharSequence;)Landroid/view/MenuItem; */
    @Override // p399r2.InterfaceMenuItemC10778b, android.view.MenuItem
    @NonNull
    public InterfaceMenuItemC10778b setTooltipText(CharSequence charSequence) {
        this.f36292o = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(int i10) {
        this.f36288k = C7975b.m33008f(this.f36289l, i10);
        m38847c();
        return this;
    }

    @Override // p399r2.InterfaceMenuItemC10778b, android.view.MenuItem
    @NonNull
    public MenuItem setShortcut(char c10, char c11, int i10, int i11) {
        this.f36284g = c10;
        this.f36285h = KeyEvent.normalizeMetaState(i10);
        this.f36286i = Character.toLowerCase(c11);
        this.f36287j = KeyEvent.normalizeMetaState(i11);
        return this;
    }
}
