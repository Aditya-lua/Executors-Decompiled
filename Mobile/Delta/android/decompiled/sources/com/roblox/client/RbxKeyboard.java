package com.roblox.client;

import android.content.Context;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.autofill.AutofillManager;
import android.view.autofill.AutofillValue;
import android.widget.TextView;
import com.roblox.engine.jni.NativeGLInterface;
import com.roblox.engine.jni.model.NativeTextBoxInfo;
import eh.e;
import gk.p;
import q.l;
import sg.a1;
import sg.e2;
import sg.t0;
import th.h;

/* JADX INFO: loaded from: classes2.dex */
public class RbxKeyboard extends l {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f8904g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f8905h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f8906i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f8907j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public AutofillManager f8908k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f8909l;

    public class a implements TextWatcher {
        public a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
            p.b("rbx.glview.text", "onTextChanged() text:" + ((Object) charSequence));
            RbxKeyboard.this.k();
            NativeGLInterface.nativePassText(RbxKeyboard.this.getCurrentTextBox(), charSequence.toString(), false, i10 + i12);
        }
    }

    public class b implements TextView.OnEditorActionListener {
        public b() {
        }

        @Override // android.widget.TextView.OnEditorActionListener
        public boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
            p.b("rbx.glview.text", "onEditorAction() text:" + ((Object) textView.getText()));
            RbxKeyboard.this.k();
            NativeGLInterface.nativeReturnPressedFromOnScreenKeyboard(RbxKeyboard.this.getCurrentTextBox());
            if (RbxKeyboard.this.g()) {
                return true;
            }
            NativeGLInterface.nativePassText(RbxKeyboard.this.getCurrentTextBox(), textView.getText().toString(), true, textView.getSelectionStart());
            RbxKeyboard.this.e();
            return true;
        }
    }

    public RbxKeyboard(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f8904g = "rbx.glview.text";
    }

    @Override // android.widget.TextView, android.view.View
    public void autofill(AutofillValue autofillValue) {
        super.autofill(autofillValue);
        if (h.a().z3()) {
            t0.c("autofillActivated", null, null, this.f8907j + "");
        }
    }

    public void e() {
        setCurrentTextBox(0L);
        e2.i(getContext(), this);
        setVisibility(8);
    }

    public void f() {
        if (h.a().x2()) {
            this.f8908k = (AutofillManager) getContext().getSystemService(AutofillManager.class);
        }
        addTextChangedListener(new a());
        setOnEditorActionListener(new b());
    }

    public boolean g() {
        return this.f8906i;
    }

    public long getCurrentTextBox() {
        return this.f8905h;
    }

    public void h() {
        p.h("rbx.glview.text", "onVrSessionForeground");
        if (a1.q0()) {
            p.b("rbx.glview.text", "Maquettes keyboard release focus only hide triggered.");
            NativeGLInterface.nativeReleaseFocus(this.f8905h);
            this.f8905h = 0L;
        }
    }

    public void i(NativeTextBoxInfo nativeTextBoxInfo, String str) {
        AutofillManager autofillManager;
        if (!h.a().x2() || (autofillManager = this.f8908k) == null) {
            return;
        }
        autofillManager.cancel();
        boolean z10 = nativeTextBoxInfo != null && (nativeTextBoxInfo.textInputType == 5 || ((h.a().M0() && nativeTextBoxInfo.textInputType == 6) || ((h.a().r0() && nativeTextBoxInfo.textInputType == 9) || (h.a().M0() && h.a().r0() && nativeTextBoxInfo.textInputType == 10))));
        if (str.isEmpty() && z10) {
            this.f8908k.requestAutofill(this);
        }
    }

    public void j(long j10) {
        NativeGLInterface.nativeReleaseFocus(j10);
    }

    public void k() {
        String string = getText().toString();
        int selectionStart = getSelectionStart();
        p.b("rbx.glview.text", "syncTextboxTextAndCursorPosition() text:" + string + " pos:" + selectionStart);
        NativeGLInterface.syncTextboxTextAndCursorPosition2(string, selectionStart);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:20:0x0067  */
    /* JADX WARN: Code duplicated, block: B:22:0x0071  */
    /* JADX WARN: Code duplicated, block: B:23:0x0075  */
    /* JADX WARN: Code duplicated, block: B:24:0x0079  */
    /* JADX WARN: Code duplicated, block: B:31:0x0090  */
    public void l(NativeTextBoxInfo nativeTextBoxInfo) {
        int i10;
        if (nativeTextBoxInfo != null) {
            setTextColor(nativeTextBoxInfo.textColor);
            setManualFocusRelease(nativeTextBoxInfo.manualFocusRelease);
            if (h.a().r0()) {
                setAutofillHints(null);
            }
            if (h.a().z3()) {
                this.f8907j = nativeTextBoxInfo.textInputType;
            }
            int i11 = 524289;
            int i12 = 3;
            switch (nativeTextBoxInfo.textInputType) {
                case 1:
                    if (!h.a().g()) {
                        i11 = 1;
                    } else {
                        i11 = 65;
                    }
                    break;
                case 2:
                case 8:
                    i11 = 2;
                    break;
                case 3:
                    i11 = 33;
                    break;
                case 4:
                    i11 = 3;
                    break;
                case 5:
                    i11 = 129;
                    break;
                case 6:
                    if (h.a().M0()) {
                        i11 = 524432;
                    } else {
                        i11 = 524433;
                    }
                    break;
                case 7:
                    break;
                case 9:
                    if (!h.a().r0()) {
                        i11 = 129;
                    } else {
                        setAutofillHints("newPassword");
                        if (h.a().Y4()) {
                            i11 = 524417;
                        }
                    }
                    break;
                case 10:
                    if (h.a().r0()) {
                        setAutofillHints("newPassword");
                    } else if (h.a().M0()) {
                        i11 = 524432;
                    } else {
                        i11 = 524433;
                    }
                    break;
                default:
                    i11 = 1;
                    break;
            }
            int i13 = nativeTextBoxInfo.returnKeyType;
            if (i13 == 1) {
                i10 = 6;
            } else if (i13 == 2) {
                i10 = 2;
            } else if (i13 != 3) {
                i10 = 4;
                if (i13 == 4) {
                    i10 = 3;
                }
            } else {
                i10 = 5;
            }
            if (nativeTextBoxInfo.multiline || nativeTextBoxInfo.textWrapped) {
                i11 |= 131072;
            }
            setImeOptions(268435456 | i10);
            if (getInputType() != i11) {
                setInputType(i11);
                setSelection(getText().length());
            }
            int i14 = 0;
            if (h.a().b0()) {
                if (!nativeTextBoxInfo.editable) {
                    setShowSoftInputOnFocus(false);
                    setCursorVisible(false);
                    if (h.a().a1()) {
                        e2.i(getContext(), this);
                    }
                    this.f8909l = true;
                } else if (this.f8909l) {
                    setShowSoftInputOnFocus(true);
                    setCursorVisible(true);
                    if (h.a().a1()) {
                        e2.k(this, 2);
                    }
                    this.f8909l = false;
                }
            }
            int i15 = nativeTextBoxInfo.xAlignment;
            if (i15 != 0) {
                i12 = i15 != 1 ? i15 != 2 ? 0 : 1 : 5;
            }
            int i16 = nativeTextBoxInfo.yAlignment;
            if (i16 == 0) {
                i14 = 48;
            } else if (i16 == 1) {
                i14 = 16;
            } else if (i16 == 2) {
                i14 = 80;
            }
            setGravity(i12 | i14);
        }
    }

    public void m(int i10, float f10, float f11) {
        float fB;
        float f12 = 0.0f;
        if (e.e(this, getContext(), i10)) {
            fB = e.b(i10, getContext());
        } else {
            if (i10 == 4) {
                e.d(this, getContext(), "SourceSansPro-Bold.ttf");
                f12 = 0.04f;
            } else if (i10 != 5) {
                e.d(this, getContext(), "SourceSansPro-Regular.ttf");
            } else {
                e.d(this, getContext(), "SourceSansPro-Light.ttf");
            }
            fB = 0.795f;
        }
        setTextSize(0, f10 * f11 * fB);
        p.b("rbx.glview.text", "using letter spacing = " + f12);
        setLetterSpacing(f12);
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onKeyPreIme(int i10, KeyEvent keyEvent) {
        k();
        int keyCode = keyEvent.getKeyCode();
        if (keyCode != 4) {
            switch (keyCode) {
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                    return false;
            }
        }
        if (keyEvent.getAction() == 1) {
            j(this.f8905h);
            this.f8905h = 0L;
            setVisibility(8);
            setText("");
            e2.i(getContext(), this);
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.widget.TextView
    public void onSelectionChanged(int i10, int i11) {
        if (isInEditMode()) {
            return;
        }
        k();
    }

    @Override // q.l, android.widget.EditText, android.widget.TextView
    public boolean onTextContextMenuItem(int i10) {
        if (h.a().b0() && this.f8909l && (i10 == 16908322 || i10 == 16908337 || i10 == 16908320)) {
            return true;
        }
        return super.onTextContextMenuItem(i10);
    }

    public void setCurrentTextBox(long j10) {
        this.f8905h = j10;
    }

    public void setManualFocusRelease(boolean z10) {
        this.f8906i = z10;
    }
}
