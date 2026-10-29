package p365q;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.CheckedTextView;
import androidx.annotation.NonNull;
import p066d3.C4431i;
import p181i.C6589a;
import p232k.C7399a;

/* JADX INFO: renamed from: q.h */
/* JADX INFO: loaded from: classes.dex */
public class C10376h extends CheckedTextView {

    /* JADX INFO: renamed from: a */
    public final C10379i f37316a;

    /* JADX INFO: renamed from: b */
    public final C10367e f37317b;

    /* JADX INFO: renamed from: c */
    public final C10356a0 f37318c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public C10389n f37319d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C10376h(@NonNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C6589a.f25041t);
    }

    @NonNull
    private C10389n getEmojiTextViewHelper() {
        if (this.f37319d == null) {
            this.f37319d = new C10389n(this);
        }
        return this.f37319d;
    }

    @Override // android.widget.CheckedTextView, android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C10356a0 c10356a0 = this.f37318c;
        if (c10356a0 != null) {
            c10356a0.m39695b();
        }
        C10367e c10367e = this.f37317b;
        if (c10367e != null) {
            c10367e.m39824b();
        }
        C10379i c10379i = this.f37316a;
        if (c10379i != null) {
            c10379i.m39845a();
        }
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return C4431i.m22314u(super.getCustomSelectionActionModeCallback());
    }

    public ColorStateList getSupportBackgroundTintList() {
        C10367e c10367e = this.f37317b;
        if (c10367e != null) {
            return c10367e.m39825c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C10367e c10367e = this.f37317b;
        if (c10367e != null) {
            return c10367e.m39826d();
        }
        return null;
    }

    public ColorStateList getSupportCheckMarkTintList() {
        C10379i c10379i = this.f37316a;
        if (c10379i != null) {
            return c10379i.m39846b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportCheckMarkTintMode() {
        C10379i c10379i = this.f37316a;
        if (c10379i != null) {
            return c10379i.m39847c();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f37318c.m39702j();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f37318c.m39703k();
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(@NonNull EditorInfo editorInfo) {
        return C10391o.m39937a(super.onCreateInputConnection(editorInfo), editorInfo, this);
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z10) {
        super.setAllCaps(z10);
        getEmojiTextViewHelper().m39927d(z10);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C10367e c10367e = this.f37317b;
        if (c10367e != null) {
            c10367e.m39828f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        C10367e c10367e = this.f37317b;
        if (c10367e != null) {
            c10367e.m39829g(i10);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(Drawable drawable) {
        super.setCheckMarkDrawable(drawable);
        C10379i c10379i = this.f37316a;
        if (c10379i != null) {
            c10379i.m39849e();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C10356a0 c10356a0 = this.f37318c;
        if (c10356a0 != null) {
            c10356a0.m39708p();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C10356a0 c10356a0 = this.f37318c;
        if (c10356a0 != null) {
            c10356a0.m39708p();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(C4431i.m22315v(this, callback));
    }

    public void setEmojiCompatEnabled(boolean z10) {
        getEmojiTextViewHelper().m39928e(z10);
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C10367e c10367e = this.f37317b;
        if (c10367e != null) {
            c10367e.m39831i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C10367e c10367e = this.f37317b;
        if (c10367e != null) {
            c10367e.m39832j(mode);
        }
    }

    public void setSupportCheckMarkTintList(ColorStateList colorStateList) {
        C10379i c10379i = this.f37316a;
        if (c10379i != null) {
            c10379i.m39850f(colorStateList);
        }
    }

    public void setSupportCheckMarkTintMode(PorterDuff.Mode mode) {
        C10379i c10379i = this.f37316a;
        if (c10379i != null) {
            c10379i.m39851g(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.f37318c.m39715w(colorStateList);
        this.f37318c.m39695b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.f37318c.m39716x(mode);
        this.f37318c.m39695b();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(@NonNull Context context, int i10) {
        super.setTextAppearance(context, i10);
        C10356a0 c10356a0 = this.f37318c;
        if (c10356a0 != null) {
            c10356a0.m39709q(context, i10);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public C10376h(@NonNull Context context, AttributeSet attributeSet, int i10) {
        super(C10410x0.m40068b(context), attributeSet, i10);
        C10406v0.m40056a(this, getContext());
        C10356a0 c10356a0 = new C10356a0(this);
        this.f37318c = c10356a0;
        c10356a0.m39705m(attributeSet, i10);
        c10356a0.m39695b();
        C10367e c10367e = new C10367e(this);
        this.f37317b = c10367e;
        c10367e.m39827e(attributeSet, i10);
        C10379i c10379i = new C10379i(this);
        this.f37316a = c10379i;
        c10379i.m39848d(attributeSet, i10);
        getEmojiTextViewHelper().m39926c(attributeSet, i10);
    }

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(int i10) {
        setCheckMarkDrawable(C7399a.m30679b(getContext(), i10));
    }
}
