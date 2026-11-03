package p;

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
import com.google.mlkit.vision.barcode.common.Barcode;

/* JADX INFO: loaded from: classes.dex */
public class a implements r2.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f28238a;
    public final int b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f28239c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public CharSequence f28240d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public CharSequence f28241e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Intent f28242f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public char f28243g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public char f28245i;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Drawable f28247k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Context f28248l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public MenuItem.OnMenuItemClickListener f28249m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public CharSequence f28250n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public CharSequence f28251o;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f28244h = Barcode.FORMAT_AZTEC;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f28246j = Barcode.FORMAT_AZTEC;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public ColorStateList f28252p = null;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public PorterDuff.Mode f28253q = null;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f28254r = false;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f28255s = false;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f28256t = 16;

    public a(Context context, int i10, int i11, int i12, int i13, CharSequence charSequence) {
        this.f28248l = context;
        this.f28238a = i11;
        this.b = i10;
        this.f28239c = i13;
        this.f28240d = charSequence;
    }

    @Override // r2.b
    public androidx.core.view.b a() {
        return null;
    }

    @Override // r2.b
    @NonNull
    public r2.b b(androidx.core.view.b bVar) {
        throw new UnsupportedOperationException();
    }

    public final void c() {
        Drawable drawable = this.f28247k;
        if (drawable != null) {
            if (this.f28254r || this.f28255s) {
                Drawable drawableR = q2.a.r(drawable);
                this.f28247k = drawableR;
                Drawable drawableMutate = drawableR.mutate();
                this.f28247k = drawableMutate;
                if (this.f28254r) {
                    q2.a.o(drawableMutate, this.f28252p);
                }
                if (this.f28255s) {
                    q2.a.p(this.f28247k, this.f28253q);
                }
            }
        }
    }

    @Override // r2.b, android.view.MenuItem
    public boolean collapseActionView() {
        return false;
    }

    @Override // r2.b, android.view.MenuItem
    @NonNull
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public r2.b setActionView(int i10) {
        throw new UnsupportedOperationException();
    }

    @Override // r2.b, android.view.MenuItem
    @NonNull
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public r2.b setActionView(View view) {
        throw new UnsupportedOperationException();
    }

    @Override // r2.b, android.view.MenuItem
    public boolean expandActionView() {
        return false;
    }

    @Override // r2.b, android.view.MenuItem
    @NonNull
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public r2.b setShowAsActionFlags(int i10) {
        setShowAsAction(i10);
        return this;
    }

    @Override // android.view.MenuItem
    public ActionProvider getActionProvider() {
        throw new UnsupportedOperationException();
    }

    @Override // r2.b, android.view.MenuItem
    public View getActionView() {
        return null;
    }

    @Override // r2.b, android.view.MenuItem
    public int getAlphabeticModifiers() {
        return this.f28246j;
    }

    @Override // android.view.MenuItem
    public char getAlphabeticShortcut() {
        return this.f28245i;
    }

    @Override // r2.b, android.view.MenuItem
    public CharSequence getContentDescription() {
        return this.f28250n;
    }

    @Override // android.view.MenuItem
    public int getGroupId() {
        return this.b;
    }

    @Override // android.view.MenuItem
    public Drawable getIcon() {
        return this.f28247k;
    }

    @Override // r2.b, android.view.MenuItem
    public ColorStateList getIconTintList() {
        return this.f28252p;
    }

    @Override // r2.b, android.view.MenuItem
    public PorterDuff.Mode getIconTintMode() {
        return this.f28253q;
    }

    @Override // android.view.MenuItem
    public Intent getIntent() {
        return this.f28242f;
    }

    @Override // android.view.MenuItem
    public int getItemId() {
        return this.f28238a;
    }

    @Override // android.view.MenuItem
    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    @Override // r2.b, android.view.MenuItem
    public int getNumericModifiers() {
        return this.f28244h;
    }

    @Override // android.view.MenuItem
    public char getNumericShortcut() {
        return this.f28243g;
    }

    @Override // android.view.MenuItem
    public int getOrder() {
        return this.f28239c;
    }

    @Override // android.view.MenuItem
    public SubMenu getSubMenu() {
        return null;
    }

    @Override // android.view.MenuItem
    public CharSequence getTitle() {
        return this.f28240d;
    }

    @Override // android.view.MenuItem
    public CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f28241e;
        return charSequence != null ? charSequence : this.f28240d;
    }

    @Override // r2.b, android.view.MenuItem
    public CharSequence getTooltipText() {
        return this.f28251o;
    }

    @Override // android.view.MenuItem
    public boolean hasSubMenu() {
        return false;
    }

    @Override // r2.b, android.view.MenuItem
    public boolean isActionViewExpanded() {
        return false;
    }

    @Override // android.view.MenuItem
    public boolean isCheckable() {
        return (this.f28256t & 1) != 0;
    }

    @Override // android.view.MenuItem
    public boolean isChecked() {
        return (this.f28256t & 2) != 0;
    }

    @Override // android.view.MenuItem
    public boolean isEnabled() {
        return (this.f28256t & 16) != 0;
    }

    @Override // android.view.MenuItem
    public boolean isVisible() {
        return (this.f28256t & 8) == 0;
    }

    @Override // android.view.MenuItem
    public MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c10) {
        this.f28245i = Character.toLowerCase(c10);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setCheckable(boolean z10) {
        this.f28256t = (z10 ? 1 : 0) | (this.f28256t & (-2));
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setChecked(boolean z10) {
        this.f28256t = (z10 ? 2 : 0) | (this.f28256t & (-3));
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setEnabled(boolean z10) {
        this.f28256t = (z10 ? 16 : 0) | (this.f28256t & (-17));
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(Drawable drawable) {
        this.f28247k = drawable;
        c();
        return this;
    }

    @Override // r2.b, android.view.MenuItem
    @NonNull
    public MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f28252p = colorStateList;
        this.f28254r = true;
        c();
        return this;
    }

    @Override // r2.b, android.view.MenuItem
    @NonNull
    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f28253q = mode;
        this.f28255s = true;
        c();
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIntent(Intent intent) {
        this.f28242f = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setNumericShortcut(char c10) {
        this.f28243g = c10;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f28249m = onMenuItemClickListener;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setShortcut(char c10, char c11) {
        this.f28243g = c10;
        this.f28245i = Character.toLowerCase(c11);
        return this;
    }

    @Override // r2.b, android.view.MenuItem
    public void setShowAsAction(int i10) {
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(CharSequence charSequence) {
        this.f28240d = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f28241e = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setVisible(boolean z10) {
        this.f28256t = (this.f28256t & 8) | (z10 ? 0 : 8);
        return this;
    }

    @Override // r2.b, android.view.MenuItem
    @NonNull
    public MenuItem setAlphabeticShortcut(char c10, int i10) {
        this.f28245i = Character.toLowerCase(c10);
        this.f28246j = KeyEvent.normalizeMetaState(i10);
        return this;
    }

    @Override // r2.b, android.view.MenuItem
    @NonNull
    public r2.b setContentDescription(CharSequence charSequence) {
        this.f28250n = charSequence;
        return this;
    }

    @Override // r2.b, android.view.MenuItem
    @NonNull
    public MenuItem setNumericShortcut(char c10, int i10) {
        this.f28243g = c10;
        this.f28244h = KeyEvent.normalizeMetaState(i10);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(int i10) {
        this.f28240d = this.f28248l.getResources().getString(i10);
        return this;
    }

    @Override // r2.b, android.view.MenuItem
    @NonNull
    public r2.b setTooltipText(CharSequence charSequence) {
        this.f28251o = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(int i10) {
        this.f28247k = l2.b.f(this.f28248l, i10);
        c();
        return this;
    }

    @Override // r2.b, android.view.MenuItem
    @NonNull
    public MenuItem setShortcut(char c10, char c11, int i10, int i11) {
        this.f28243g = c10;
        this.f28244h = KeyEvent.normalizeMetaState(i10);
        this.f28245i = Character.toLowerCase(c11);
        this.f28246j = KeyEvent.normalizeMetaState(i11);
        return this;
    }
}
