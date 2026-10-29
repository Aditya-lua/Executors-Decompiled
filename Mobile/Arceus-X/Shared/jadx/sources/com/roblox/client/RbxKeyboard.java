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
import p103eh.C5117e;
import p151gk.C6124q;
import p365q.C10385l;
import sg.C11295a1;
import sg.C11312e2;
import sg.C11356t0;
import th.C11659h;

/* JADX INFO: loaded from: classes2.dex */
public class RbxKeyboard extends C10385l {

    /* JADX INFO: renamed from: g */
    public final String f11604g;

    /* JADX INFO: renamed from: h */
    public long f11605h;

    /* JADX INFO: renamed from: i */
    public boolean f11606i;

    /* JADX INFO: renamed from: j */
    public int f11607j;

    /* JADX INFO: renamed from: k */
    public AutofillManager f11608k;

    /* JADX INFO: renamed from: l */
    public boolean f11609l;

    /* JADX INFO: renamed from: com.roblox.client.RbxKeyboard$a */
    public class C3147a implements TextWatcher {
        public C3147a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
            C6124q.m27057b("rbx.glview.text", "onTextChanged() text:" + ((Object) charSequence));
            RbxKeyboard.this.m14830k();
            NativeGLInterface.nativePassText(RbxKeyboard.this.getCurrentTextBox(), charSequence.toString(), false, i10 + i12);
        }
    }

    /* JADX INFO: renamed from: com.roblox.client.RbxKeyboard$b */
    public class C3148b implements TextView.OnEditorActionListener {
        public C3148b() {
        }

        @Override // android.widget.TextView.OnEditorActionListener
        public boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
            C6124q.m27057b("rbx.glview.text", "onEditorAction() text:" + ((Object) textView.getText()));
            RbxKeyboard.this.m14830k();
            NativeGLInterface.nativeReturnPressedFromOnScreenKeyboard(RbxKeyboard.this.getCurrentTextBox());
            if (RbxKeyboard.this.m14826g()) {
                return true;
            }
            NativeGLInterface.nativePassText(RbxKeyboard.this.getCurrentTextBox(), textView.getText().toString(), true, textView.getSelectionStart());
            RbxKeyboard.this.m14824e();
            return true;
        }
    }

    public RbxKeyboard(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f11604g = "rbx.glview.text";
    }

    @Override // android.widget.TextView, android.view.View
    public void autofill(AutofillValue autofillValue) {
        super.autofill(autofillValue);
        if (C11659h.m43403a().mo43436E3()) {
            C11356t0.m42533c("autofillActivated", null, null, this.f11607j + "");
        }
    }

    /* JADX INFO: renamed from: e */
    public void m14824e() {
        setCurrentTextBox(0L);
        C11312e2.m42505i(getContext(), this);
        setVisibility(8);
    }

    /* JADX INFO: renamed from: f */
    public void m14825f() {
        if (C11659h.m43403a().mo43428D2()) {
            this.f11608k = (AutofillManager) getContext().getSystemService(AutofillManager.class);
        }
        addTextChangedListener(new C3147a());
        setOnEditorActionListener(new C3148b());
    }

    /* JADX INFO: renamed from: g */
    public boolean m14826g() {
        return this.f11606i;
    }

    public long getCurrentTextBox() {
        return this.f11605h;
    }

    /* JADX INFO: renamed from: h */
    public void m14827h() {
        C6124q.m27063h("rbx.glview.text", "onVrSessionForeground");
        if (C11295a1.m42471q0()) {
            C6124q.m27057b("rbx.glview.text", "Maquettes keyboard release focus only hide triggered.");
            NativeGLInterface.nativeReleaseFocus(this.f11605h);
            this.f11605h = 0L;
        }
    }

    /* JADX INFO: renamed from: i */
    public void m14828i(NativeTextBoxInfo nativeTextBoxInfo, String str) {
        AutofillManager autofillManager;
        if (!C11659h.m43403a().mo43428D2() || (autofillManager = this.f11608k) == null) {
            return;
        }
        autofillManager.cancel();
        boolean z10 = nativeTextBoxInfo != null && (nativeTextBoxInfo.textInputType == 5 || ((C11659h.m43403a().mo43509P0() && nativeTextBoxInfo.textInputType == 6) || ((C11659h.m43403a().mo43737v0() && nativeTextBoxInfo.textInputType == 9) || (C11659h.m43403a().mo43509P0() && C11659h.m43403a().mo43737v0() && nativeTextBoxInfo.textInputType == 10))));
        if (str.isEmpty() && z10) {
            this.f11608k.requestAutofill(this);
        }
    }

    /* JADX INFO: renamed from: j */
    public void m14829j(long j10) {
        NativeGLInterface.nativeReleaseFocus(j10);
    }

    /* JADX INFO: renamed from: k */
    public void m14830k() {
        String string = getText().toString();
        int selectionStart = getSelectionStart();
        C6124q.m27057b("rbx.glview.text", "syncTextboxTextAndCursorPosition() text:" + string + " pos:" + selectionStart);
        NativeGLInterface.syncTextboxTextAndCursorPosition2(string, selectionStart);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:20:0x0067  */
    /* JADX WARN: Code duplicated, block: B:22:0x0071  */
    /* JADX WARN: Code duplicated, block: B:23:0x0075  */
    /* JADX WARN: Code duplicated, block: B:24:0x0079  */
    /* JADX WARN: Code duplicated, block: B:31:0x0090  */
    /* JADX INFO: renamed from: l */
    public void m14831l(NativeTextBoxInfo nativeTextBoxInfo) {
        int i10;
        if (nativeTextBoxInfo != null) {
            setTextColor(nativeTextBoxInfo.textColor);
            setManualFocusRelease(nativeTextBoxInfo.manualFocusRelease);
            if (C11659h.m43403a().mo43737v0()) {
                setAutofillHints(null);
            }
            if (C11659h.m43403a().mo43436E3()) {
                this.f11607j = nativeTextBoxInfo.textInputType;
            }
            int i11 = 524289;
            int i12 = 3;
            switch (nativeTextBoxInfo.textInputType) {
                case 1:
                    if (!C11659h.m43403a().mo43638h()) {
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
                    if (C11659h.m43403a().mo43509P0()) {
                        i11 = 524432;
                    } else {
                        i11 = 524433;
                    }
                    break;
                case 7:
                    break;
                case 9:
                    if (!C11659h.m43403a().mo43737v0()) {
                        i11 = 129;
                    } else {
                        setAutofillHints("newPassword");
                        if (C11659h.m43403a().mo43622e5()) {
                            i11 = 524417;
                        }
                    }
                    break;
                case 10:
                    if (C11659h.m43403a().mo43737v0()) {
                        setAutofillHints("newPassword");
                    } else if (C11659h.m43403a().mo43509P0()) {
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
            if (C11659h.m43403a().mo43625f0()) {
                if (!nativeTextBoxInfo.editable) {
                    setShowSoftInputOnFocus(false);
                    setCursorVisible(false);
                    if (C11659h.m43403a().mo43626f1()) {
                        C11312e2.m42505i(getContext(), this);
                    }
                    this.f11609l = true;
                } else if (this.f11609l) {
                    setShowSoftInputOnFocus(true);
                    setCursorVisible(true);
                    if (C11659h.m43403a().mo43626f1()) {
                        C11312e2.m42507k(this, 2);
                    }
                    this.f11609l = false;
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

    /* JADX INFO: renamed from: m */
    public void m14832m(int i10, float f10, float f11) {
        float fM23878b;
        float f12 = 0.0f;
        if (C5117e.m23881e(this, getContext(), i10)) {
            fM23878b = C5117e.m23878b(i10, getContext());
        } else {
            if (i10 == 4) {
                C5117e.m23880d(this, getContext(), "SourceSansPro-Bold.ttf");
                f12 = 0.04f;
            } else if (i10 != 5) {
                C5117e.m23880d(this, getContext(), "SourceSansPro-Regular.ttf");
            } else {
                C5117e.m23880d(this, getContext(), "SourceSansPro-Light.ttf");
            }
            fM23878b = 0.795f;
        }
        setTextSize(0, f10 * f11 * fM23878b);
        C6124q.m27057b("rbx.glview.text", "using letter spacing = " + f12);
        setLetterSpacing(f12);
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onKeyPreIme(int i10, KeyEvent keyEvent) {
        m14830k();
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
            m14829j(this.f11605h);
            this.f11605h = 0L;
            setVisibility(8);
            setText("");
            C11312e2.m42505i(getContext(), this);
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.widget.TextView
    public void onSelectionChanged(int i10, int i11) {
        if (isInEditMode()) {
            return;
        }
        m14830k();
    }

    @Override // p365q.C10385l, android.widget.EditText, android.widget.TextView
    public boolean onTextContextMenuItem(int i10) {
        if (C11659h.m43403a().mo43625f0() && this.f11609l && (i10 == 16908322 || i10 == 16908337 || i10 == 16908320)) {
            return true;
        }
        return super.onTextContextMenuItem(i10);
    }

    public void setCurrentTextBox(long j10) {
        this.f11605h = j10;
    }

    public void setManualFocusRelease(boolean z10) {
        this.f11606i = z10;
    }
}
