package p365q;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.method.KeyListener;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.MultiAutoCompleteTextView;
import androidx.annotation.NonNull;
import p181i.C6589a;
import p232k.C7399a;

/* JADX INFO: renamed from: q.r */
/* JADX INFO: loaded from: classes.dex */
public class C10397r extends MultiAutoCompleteTextView {

    /* JADX INFO: renamed from: d */
    public static final int[] f37447d = {R.attr.popupBackground};

    /* JADX INFO: renamed from: a */
    public final C10367e f37448a;

    /* JADX INFO: renamed from: b */
    public final C10356a0 f37449b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final C10387m f37450c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C10397r(@NonNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C6589a.f25038q);
    }

    /* JADX INFO: renamed from: a */
    public void m39994a(C10387m c10387m) {
        KeyListener keyListener = getKeyListener();
        if (c10387m.m39919b(keyListener)) {
            boolean zIsFocusable = super.isFocusable();
            boolean zIsClickable = super.isClickable();
            boolean zIsLongClickable = super.isLongClickable();
            int inputType = super.getInputType();
            KeyListener keyListenerM39918a = c10387m.m39918a(keyListener);
            if (keyListenerM39918a == keyListener) {
                return;
            }
            super.setKeyListener(keyListenerM39918a);
            super.setRawInputType(inputType);
            super.setFocusable(zIsFocusable);
            super.setClickable(zIsClickable);
            super.setLongClickable(zIsLongClickable);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C10367e c10367e = this.f37448a;
        if (c10367e != null) {
            c10367e.m39824b();
        }
        C10356a0 c10356a0 = this.f37449b;
        if (c10356a0 != null) {
            c10356a0.m39695b();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        C10367e c10367e = this.f37448a;
        if (c10367e != null) {
            return c10367e.m39825c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C10367e c10367e = this.f37448a;
        if (c10367e != null) {
            return c10367e.m39826d();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f37449b.m39702j();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f37449b.m39703k();
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        return this.f37450c.m39921d(C10391o.m39937a(super.onCreateInputConnection(editorInfo), editorInfo, this), editorInfo);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C10367e c10367e = this.f37448a;
        if (c10367e != null) {
            c10367e.m39828f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        C10367e c10367e = this.f37448a;
        if (c10367e != null) {
            c10367e.m39829g(i10);
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C10356a0 c10356a0 = this.f37449b;
        if (c10356a0 != null) {
            c10356a0.m39708p();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C10356a0 c10356a0 = this.f37449b;
        if (c10356a0 != null) {
            c10356a0.m39708p();
        }
    }

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundResource(int i10) {
        setDropDownBackgroundDrawable(C7399a.m30679b(getContext(), i10));
    }

    public void setEmojiCompatEnabled(boolean z10) {
        this.f37450c.m39922e(z10);
    }

    @Override // android.widget.TextView
    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.f37450c.m39918a(keyListener));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C10367e c10367e = this.f37448a;
        if (c10367e != null) {
            c10367e.m39831i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C10367e c10367e = this.f37448a;
        if (c10367e != null) {
            c10367e.m39832j(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.f37449b.m39715w(colorStateList);
        this.f37449b.m39695b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.f37449b.m39716x(mode);
        this.f37449b.m39695b();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i10) {
        super.setTextAppearance(context, i10);
        C10356a0 c10356a0 = this.f37449b;
        if (c10356a0 != null) {
            c10356a0.m39709q(context, i10);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public C10397r(@NonNull Context context, AttributeSet attributeSet, int i10) {
        super(C10410x0.m40068b(context), attributeSet, i10);
        C10406v0.m40056a(this, getContext());
        C10357a1 c10357a1M39728v = C10357a1.m39728v(getContext(), attributeSet, f37447d, i10, 0);
        if (c10357a1M39728v.m39747s(0)) {
            setDropDownBackgroundDrawable(c10357a1M39728v.m39735g(0));
        }
        c10357a1M39728v.m39749x();
        C10367e c10367e = new C10367e(this);
        this.f37448a = c10367e;
        c10367e.m39827e(attributeSet, i10);
        C10356a0 c10356a0 = new C10356a0(this);
        this.f37449b = c10356a0;
        c10356a0.m39705m(attributeSet, i10);
        c10356a0.m39695b();
        C10387m c10387m = new C10387m(this);
        this.f37450c = c10387m;
        c10387m.m39920c(attributeSet, i10);
        m39994a(c10387m);
    }
}
