package p365q;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.RadioButton;
import androidx.annotation.NonNull;
import p066d3.InterfaceC4433k;
import p181i.C6589a;
import p232k.C7399a;

/* JADX INFO: renamed from: q.u */
/* JADX INFO: loaded from: classes.dex */
public class C10403u extends RadioButton implements InterfaceC4433k {

    /* JADX INFO: renamed from: a */
    public final C10381j f37475a;

    /* JADX INFO: renamed from: b */
    public final C10367e f37476b;

    /* JADX INFO: renamed from: c */
    public final C10356a0 f37477c;

    /* JADX INFO: renamed from: d */
    public C10389n f37478d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C10403u(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C6589a.f25013I);
    }

    @NonNull
    private C10389n getEmojiTextViewHelper() {
        if (this.f37478d == null) {
            this.f37478d = new C10389n(this);
        }
        return this.f37478d;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C10367e c10367e = this.f37476b;
        if (c10367e != null) {
            c10367e.m39824b();
        }
        C10356a0 c10356a0 = this.f37477c;
        if (c10356a0 != null) {
            c10356a0.m39695b();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        C10367e c10367e = this.f37476b;
        if (c10367e != null) {
            return c10367e.m39825c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C10367e c10367e = this.f37476b;
        if (c10367e != null) {
            return c10367e.m39826d();
        }
        return null;
    }

    @Override // p066d3.InterfaceC4433k
    public ColorStateList getSupportButtonTintList() {
        C10381j c10381j = this.f37475a;
        if (c10381j != null) {
            return c10381j.m39854b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportButtonTintMode() {
        C10381j c10381j = this.f37475a;
        if (c10381j != null) {
            return c10381j.m39855c();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f37477c.m39702j();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f37477c.m39703k();
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z10) {
        super.setAllCaps(z10);
        getEmojiTextViewHelper().m39927d(z10);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C10367e c10367e = this.f37476b;
        if (c10367e != null) {
            c10367e.m39828f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        C10367e c10367e = this.f37476b;
        if (c10367e != null) {
            c10367e.m39829g(i10);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable) {
        super.setButtonDrawable(drawable);
        C10381j c10381j = this.f37475a;
        if (c10381j != null) {
            c10381j.m39857e();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C10356a0 c10356a0 = this.f37477c;
        if (c10356a0 != null) {
            c10356a0.m39708p();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C10356a0 c10356a0 = this.f37477c;
        if (c10356a0 != null) {
            c10356a0.m39708p();
        }
    }

    public void setEmojiCompatEnabled(boolean z10) {
        getEmojiTextViewHelper().m39928e(z10);
    }

    @Override // android.widget.TextView
    public void setFilters(@NonNull InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().m39924a(inputFilterArr));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C10367e c10367e = this.f37476b;
        if (c10367e != null) {
            c10367e.m39831i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C10367e c10367e = this.f37476b;
        if (c10367e != null) {
            c10367e.m39832j(mode);
        }
    }

    @Override // p066d3.InterfaceC4433k
    public void setSupportButtonTintList(ColorStateList colorStateList) {
        C10381j c10381j = this.f37475a;
        if (c10381j != null) {
            c10381j.m39858f(colorStateList);
        }
    }

    @Override // p066d3.InterfaceC4433k
    public void setSupportButtonTintMode(PorterDuff.Mode mode) {
        C10381j c10381j = this.f37475a;
        if (c10381j != null) {
            c10381j.m39859g(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.f37477c.m39715w(colorStateList);
        this.f37477c.m39695b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.f37477c.m39716x(mode);
        this.f37477c.m39695b();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public C10403u(Context context, AttributeSet attributeSet, int i10) {
        super(C10410x0.m40068b(context), attributeSet, i10);
        C10406v0.m40056a(this, getContext());
        C10381j c10381j = new C10381j(this);
        this.f37475a = c10381j;
        c10381j.m39856d(attributeSet, i10);
        C10367e c10367e = new C10367e(this);
        this.f37476b = c10367e;
        c10367e.m39827e(attributeSet, i10);
        C10356a0 c10356a0 = new C10356a0(this);
        this.f37477c = c10356a0;
        c10356a0.m39705m(attributeSet, i10);
        getEmojiTextViewHelper().m39926c(attributeSet, i10);
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(int i10) {
        setButtonDrawable(C7399a.m30679b(getContext(), i10));
    }
}
