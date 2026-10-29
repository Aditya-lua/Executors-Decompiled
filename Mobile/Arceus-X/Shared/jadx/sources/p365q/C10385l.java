package p365q;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Editable;
import android.text.method.KeyListener;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.DragEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.view.textclassifier.TextClassifier;
import android.widget.EditText;
import androidx.annotation.NonNull;
import androidx.core.view.C0591d;
import androidx.core.view.C0625o0;
import androidx.core.view.InterfaceC0583a0;
import p004a3.C0062a;
import p004a3.C0064c;
import p066d3.C4431i;
import p066d3.C4432j;
import p181i.C6589a;

/* JADX INFO: renamed from: q.l */
/* JADX INFO: loaded from: classes.dex */
public class C10385l extends EditText implements InterfaceC0583a0 {

    /* JADX INFO: renamed from: a */
    public final C10367e f37350a;

    /* JADX INFO: renamed from: b */
    public final C10356a0 f37351b;

    /* JADX INFO: renamed from: c */
    public final C10413z f37352c;

    /* JADX INFO: renamed from: d */
    public final C4432j f37353d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final C10387m f37354e;

    /* JADX INFO: renamed from: f */
    public a f37355f;

    /* JADX INFO: renamed from: q.l$a */
    public class a {
        public a() {
        }

        /* JADX INFO: renamed from: a */
        public TextClassifier m39893a() {
            return C10385l.super.getTextClassifier();
        }

        /* JADX INFO: renamed from: b */
        public void m39894b(TextClassifier textClassifier) {
            C10385l.super.setTextClassifier(textClassifier);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C10385l(@NonNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C6589a.f25008D);
    }

    @NonNull
    private a getSuperCaller() {
        if (this.f37355f == null) {
            this.f37355f = new a();
        }
        return this.f37355f;
    }

    @Override // androidx.core.view.InterfaceC0583a0
    /* JADX INFO: renamed from: a */
    public C0591d mo2806a(@NonNull C0591d c0591d) {
        return this.f37353d.mo3236a(this, c0591d);
    }

    /* JADX INFO: renamed from: d */
    public void m39892d(C10387m c10387m) {
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
        C10367e c10367e = this.f37350a;
        if (c10367e != null) {
            c10367e.m39824b();
        }
        C10356a0 c10356a0 = this.f37351b;
        if (c10356a0 != null) {
            c10356a0.m39695b();
        }
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return C4431i.m22314u(super.getCustomSelectionActionModeCallback());
    }

    public ColorStateList getSupportBackgroundTintList() {
        C10367e c10367e = this.f37350a;
        if (c10367e != null) {
            return c10367e.m39825c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C10367e c10367e = this.f37350a;
        if (c10367e != null) {
            return c10367e.m39826d();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f37351b.m39702j();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f37351b.m39703k();
    }

    @Override // android.widget.TextView
    @NonNull
    public TextClassifier getTextClassifier() {
        C10413z c10413z;
        return (Build.VERSION.SDK_INT >= 28 || (c10413z = this.f37352c) == null) ? getSuperCaller().m39893a() : c10413z.m40075a();
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(@NonNull EditorInfo editorInfo) {
        String[] strArrM2982C;
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.f37351b.m39710r(this, inputConnectionOnCreateInputConnection, editorInfo);
        InputConnection inputConnectionM39937a = C10391o.m39937a(inputConnectionOnCreateInputConnection, editorInfo, this);
        if (inputConnectionM39937a != null && Build.VERSION.SDK_INT <= 30 && (strArrM2982C = C0625o0.m2982C(this)) != null) {
            C0062a.m130c(editorInfo, strArrM2982C);
            inputConnectionM39937a = C0064c.m139c(this, inputConnectionM39937a, editorInfo);
        }
        return this.f37354e.m39921d(inputConnectionM39937a, editorInfo);
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i10 = Build.VERSION.SDK_INT;
        if (i10 < 30 || i10 >= 33) {
            return;
        }
        ((InputMethodManager) getContext().getSystemService("input_method")).isActive(this);
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onDragEvent(DragEvent dragEvent) {
        if (C10407w.m40062a(this, dragEvent)) {
            return true;
        }
        return super.onDragEvent(dragEvent);
    }

    @Override // android.widget.EditText, android.widget.TextView
    public boolean onTextContextMenuItem(int i10) {
        if (C10407w.m40063b(this, i10)) {
            return true;
        }
        return super.onTextContextMenuItem(i10);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C10367e c10367e = this.f37350a;
        if (c10367e != null) {
            c10367e.m39828f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        C10367e c10367e = this.f37350a;
        if (c10367e != null) {
            c10367e.m39829g(i10);
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C10356a0 c10356a0 = this.f37351b;
        if (c10356a0 != null) {
            c10356a0.m39708p();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C10356a0 c10356a0 = this.f37351b;
        if (c10356a0 != null) {
            c10356a0.m39708p();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(C4431i.m22315v(this, callback));
    }

    public void setEmojiCompatEnabled(boolean z10) {
        this.f37354e.m39922e(z10);
    }

    @Override // android.widget.TextView
    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.f37354e.m39918a(keyListener));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C10367e c10367e = this.f37350a;
        if (c10367e != null) {
            c10367e.m39831i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C10367e c10367e = this.f37350a;
        if (c10367e != null) {
            c10367e.m39832j(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.f37351b.m39715w(colorStateList);
        this.f37351b.m39695b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.f37351b.m39716x(mode);
        this.f37351b.m39695b();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i10) {
        super.setTextAppearance(context, i10);
        C10356a0 c10356a0 = this.f37351b;
        if (c10356a0 != null) {
            c10356a0.m39709q(context, i10);
        }
    }

    @Override // android.widget.TextView
    public void setTextClassifier(TextClassifier textClassifier) {
        C10413z c10413z;
        if (Build.VERSION.SDK_INT >= 28 || (c10413z = this.f37352c) == null) {
            getSuperCaller().m39894b(textClassifier);
        } else {
            c10413z.m40076b(textClassifier);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public C10385l(@NonNull Context context, AttributeSet attributeSet, int i10) {
        super(C10410x0.m40068b(context), attributeSet, i10);
        C10406v0.m40056a(this, getContext());
        C10367e c10367e = new C10367e(this);
        this.f37350a = c10367e;
        c10367e.m39827e(attributeSet, i10);
        C10356a0 c10356a0 = new C10356a0(this);
        this.f37351b = c10356a0;
        c10356a0.m39705m(attributeSet, i10);
        c10356a0.m39695b();
        this.f37352c = new C10413z(this);
        this.f37353d = new C4432j();
        C10387m c10387m = new C10387m(this);
        this.f37354e = c10387m;
        c10387m.m39920c(attributeSet, i10);
        m39892d(c10387m);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Method merged with bridge method: getText()Ljava/lang/CharSequence; */
    @Override // android.widget.EditText, android.widget.TextView
    public Editable getText() {
        return Build.VERSION.SDK_INT >= 28 ? super.getText() : super.getEditableText();
    }
}
