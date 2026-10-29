package q;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.CheckBox;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public class g extends CheckBox implements d3.k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j f28980a;
    public final e b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a0 f28981c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public n f28982d;

    public g(@NonNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, i.a.f19903s);
    }

    @NonNull
    private n getEmojiTextViewHelper() {
        if (this.f28982d == null) {
            this.f28982d = new n(this);
        }
        return this.f28982d;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        e eVar = this.b;
        if (eVar != null) {
            eVar.b();
        }
        a0 a0Var = this.f28981c;
        if (a0Var != null) {
            a0Var.b();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        e eVar = this.b;
        if (eVar != null) {
            return eVar.c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        e eVar = this.b;
        if (eVar != null) {
            return eVar.d();
        }
        return null;
    }

    @Override // d3.k
    public ColorStateList getSupportButtonTintList() {
        j jVar = this.f28980a;
        if (jVar != null) {
            return jVar.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportButtonTintMode() {
        j jVar = this.f28980a;
        if (jVar != null) {
            return jVar.c();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f28981c.j();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f28981c.k();
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z10) {
        super.setAllCaps(z10);
        getEmojiTextViewHelper().d(z10);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        e eVar = this.b;
        if (eVar != null) {
            eVar.f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        e eVar = this.b;
        if (eVar != null) {
            eVar.g(i10);
        }
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable) {
        super.setButtonDrawable(drawable);
        j jVar = this.f28980a;
        if (jVar != null) {
            jVar.e();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        a0 a0Var = this.f28981c;
        if (a0Var != null) {
            a0Var.p();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        a0 a0Var = this.f28981c;
        if (a0Var != null) {
            a0Var.p();
        }
    }

    public void setEmojiCompatEnabled(boolean z10) {
        getEmojiTextViewHelper().e(z10);
    }

    @Override // android.widget.TextView
    public void setFilters(@NonNull InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().a(inputFilterArr));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        e eVar = this.b;
        if (eVar != null) {
            eVar.i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        e eVar = this.b;
        if (eVar != null) {
            eVar.j(mode);
        }
    }

    @Override // d3.k
    public void setSupportButtonTintList(ColorStateList colorStateList) {
        j jVar = this.f28980a;
        if (jVar != null) {
            jVar.f(colorStateList);
        }
    }

    @Override // d3.k
    public void setSupportButtonTintMode(PorterDuff.Mode mode) {
        j jVar = this.f28980a;
        if (jVar != null) {
            jVar.g(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.f28981c.w(colorStateList);
        this.f28981c.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.f28981c.x(mode);
        this.f28981c.b();
    }

    public g(@NonNull Context context, AttributeSet attributeSet, int i10) {
        super(x0.b(context), attributeSet, i10);
        v0.a(this, getContext());
        j jVar = new j(this);
        this.f28980a = jVar;
        jVar.d(attributeSet, i10);
        e eVar = new e(this);
        this.b = eVar;
        eVar.e(attributeSet, i10);
        a0 a0Var = new a0(this);
        this.f28981c = a0Var;
        a0Var.m(attributeSet, i10);
        getEmojiTextViewHelper().c(attributeSet, i10);
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(int i10) {
        setButtonDrawable(k.a.b(getContext(), i10));
    }
}
