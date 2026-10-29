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
    public final int f28019a;
    public final int b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f28020c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public CharSequence f28021d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public CharSequence f28022e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Intent f28023f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public char f28024g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public char f28026i;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Drawable f28028k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Context f28029l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public MenuItem.OnMenuItemClickListener f28030m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public CharSequence f28031n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public CharSequence f28032o;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f28025h = Barcode.FORMAT_AZTEC;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f28027j = Barcode.FORMAT_AZTEC;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public ColorStateList f28033p = null;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public PorterDuff.Mode f28034q = null;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f28035r = false;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f28036s = false;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f28037t = 16;

    public a(Context context, int i10, int i11, int i12, int i13, CharSequence charSequence) {
        this.f28029l = context;
        this.f28019a = i11;
        this.b = i10;
        this.f28020c = i13;
        this.f28021d = charSequence;
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
        Drawable drawable = this.f28028k;
        if (drawable != null) {
            if (this.f28035r || this.f28036s) {
                Drawable drawableR = q2.a.r(drawable);
                this.f28028k = drawableR;
                Drawable drawableMutate = drawableR.mutate();
                this.f28028k = drawableMutate;
                if (this.f28035r) {
                    q2.a.o(drawableMutate, this.f28033p);
                }
                if (this.f28036s) {
                    q2.a.p(this.f28028k, this.f28034q);
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
        return this.f28027j;
    }

    @Override // android.view.MenuItem
    public char getAlphabeticShortcut() {
        return this.f28026i;
    }

    @Override // r2.b, android.view.MenuItem
    public CharSequence getContentDescription() {
        return this.f28031n;
    }

    @Override // android.view.MenuItem
    public int getGroupId() {
        return this.b;
    }

    @Override // android.view.MenuItem
    public Drawable getIcon() {
        return this.f28028k;
    }

    @Override // r2.b, android.view.MenuItem
    public ColorStateList getIconTintList() {
        return this.f28033p;
    }

    @Override // r2.b, android.view.MenuItem
    public PorterDuff.Mode getIconTintMode() {
        return this.f28034q;
    }

    @Override // android.view.MenuItem
    public Intent getIntent() {
        return this.f28023f;
    }

    @Override // android.view.MenuItem
    public int getItemId() {
        return this.f28019a;
    }

    @Override // android.view.MenuItem
    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    @Override // r2.b, android.view.MenuItem
    public int getNumericModifiers() {
        return this.f28025h;
    }

    @Override // android.view.MenuItem
    public char getNumericShortcut() {
        return this.f28024g;
    }

    @Override // android.view.MenuItem
    public int getOrder() {
        return this.f28020c;
    }

    @Override // android.view.MenuItem
    public SubMenu getSubMenu() {
        return null;
    }

    @Override // android.view.MenuItem
    public CharSequence getTitle() {
        return this.f28021d;
    }

    @Override // android.view.MenuItem
    public CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f28022e;
        return charSequence != null ? charSequence : this.f28021d;
    }

    @Override // r2.b, android.view.MenuItem
    public CharSequence getTooltipText() {
        return this.f28032o;
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
        return (this.f28037t & 1) != 0;
    }

    @Override // android.view.MenuItem
    public boolean isChecked() {
        return (this.f28037t & 2) != 0;
    }

    @Override // android.view.MenuItem
    public boolean isEnabled() {
        return (this.f28037t & 16) != 0;
    }

    @Override // android.view.MenuItem
    public boolean isVisible() {
        return (this.f28037t & 8) == 0;
    }

    @Override // android.view.MenuItem
    public MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c10) {
        this.f28026i = Character.toLowerCase(c10);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setCheckable(boolean z10) {
        this.f28037t = (z10 ? 1 : 0) | (this.f28037t & (-2));
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setChecked(boolean z10) {
        this.f28037t = (z10 ? 2 : 0) | (this.f28037t & (-3));
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setEnabled(boolean z10) {
        this.f28037t = (z10 ? 16 : 0) | (this.f28037t & (-17));
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(Drawable drawable) {
        this.f28028k = drawable;
        c();
        return this;
    }

    @Override // r2.b, android.view.MenuItem
    @NonNull
    public MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f28033p = colorStateList;
        this.f28035r = true;
        c();
        return this;
    }

    @Override // r2.b, android.view.MenuItem
    @NonNull
    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f28034q = mode;
        this.f28036s = true;
        c();
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIntent(Intent intent) {
        this.f28023f = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setNumericShortcut(char c10) {
        this.f28024g = c10;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f28030m = onMenuItemClickListener;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setShortcut(char c10, char c11) {
        this.f28024g = c10;
        this.f28026i = Character.toLowerCase(c11);
        return this;
    }

    @Override // r2.b, android.view.MenuItem
    public void setShowAsAction(int i10) {
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(CharSequence charSequence) {
        this.f28021d = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f28022e = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setVisible(boolean z10) {
        this.f28037t = (this.f28037t & 8) | (z10 ? 0 : 8);
        return this;
    }

    @Override // r2.b, android.view.MenuItem
    @NonNull
    public MenuItem setAlphabeticShortcut(char c10, int i10) {
        this.f28026i = Character.toLowerCase(c10);
        this.f28027j = KeyEvent.normalizeMetaState(i10);
        return this;
    }

    @Override // r2.b, android.view.MenuItem
    @NonNull
    public r2.b setContentDescription(CharSequence charSequence) {
        this.f28031n = charSequence;
        return this;
    }

    @Override // r2.b, android.view.MenuItem
    @NonNull
    public MenuItem setNumericShortcut(char c10, int i10) {
        this.f28024g = c10;
        this.f28025h = KeyEvent.normalizeMetaState(i10);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(int i10) {
        this.f28021d = this.f28029l.getResources().getString(i10);
        return this;
    }

    @Override // r2.b, android.view.MenuItem
    @NonNull
    public r2.b setTooltipText(CharSequence charSequence) {
        this.f28032o = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(int i10) {
        this.f28028k = l2.b.f(this.f28029l, i10);
        c();
        return this;
    }

    @Override // r2.b, android.view.MenuItem
    @NonNull
    public MenuItem setShortcut(char c10, char c11, int i10, int i11) {
        this.f28024g = c10;
        this.f28025h = KeyEvent.normalizeMetaState(i10);
        this.f28026i = Character.toLowerCase(c11);
        this.f28027j = KeyEvent.normalizeMetaState(i11);
        return this;
    }
}
