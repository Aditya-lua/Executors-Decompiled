package com.google.android.material.timepicker;

import ad.C0142n;
import ad.C0146r;
import android.content.Context;
import android.content.res.Configuration;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Checkable;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.core.view.C0625o0;
import com.google.android.material.chip.Chip;
import com.google.android.material.textfield.TextInputLayout;
import p194ic.C6742f;
import p194ic.C6744h;

/* JADX INFO: loaded from: classes2.dex */
class ChipTextInputComboView extends FrameLayout implements Checkable {

    /* JADX INFO: renamed from: a */
    public final Chip f10664a;

    /* JADX INFO: renamed from: b */
    public final TextInputLayout f10665b;

    /* JADX INFO: renamed from: c */
    public final EditText f10666c;

    /* JADX INFO: renamed from: d */
    public TextWatcher f10667d;

    /* JADX INFO: renamed from: e */
    public TextView f10668e;

    /* JADX INFO: renamed from: com.google.android.material.timepicker.ChipTextInputComboView$b */
    public class C2864b extends C0142n {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public C2864b() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            if (TextUtils.isEmpty(editable)) {
                ChipTextInputComboView.this.f10664a.setText(ChipTextInputComboView.this.m13268c("00"));
                return;
            }
            String strM13268c = ChipTextInputComboView.this.m13268c(editable);
            Chip chip = ChipTextInputComboView.this.f10664a;
            if (TextUtils.isEmpty(strM13268c)) {
                strM13268c = ChipTextInputComboView.this.m13268c("00");
            }
            chip.setText(strM13268c);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ChipTextInputComboView(@NonNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX INFO: renamed from: c */
    public final String m13268c(CharSequence charSequence) {
        return TimeModel.m13299a(getResources(), charSequence);
    }

    /* JADX INFO: renamed from: d */
    public final void m13269d() {
        this.f10666c.setImeHintLocales(getContext().getResources().getConfiguration().getLocales());
    }

    @Override // android.widget.Checkable
    public boolean isChecked() {
        return this.f10664a.isChecked();
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        m13269d();
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z10) {
        this.f10664a.setChecked(z10);
        this.f10666c.setVisibility(z10 ? 0 : 4);
        this.f10664a.setVisibility(z10 ? 8 : 0);
        if (isChecked()) {
            C0146r.m458m(this.f10666c, false);
        }
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.f10664a.setOnClickListener(onClickListener);
    }

    @Override // android.view.View
    public void setTag(int i10, Object obj) {
        this.f10664a.setTag(i10, obj);
    }

    @Override // android.widget.Checkable
    public void toggle() {
        this.f10664a.toggle();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public ChipTextInputComboView(@NonNull Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        Chip chip = (Chip) layoutInflaterFrom.inflate(C6744h.f26068j, (ViewGroup) this, false);
        this.f10664a = chip;
        chip.setAccessibilityClassName("android.view.View");
        TextInputLayout textInputLayout = (TextInputLayout) layoutInflaterFrom.inflate(C6744h.f26069k, (ViewGroup) this, false);
        this.f10665b = textInputLayout;
        EditText editText = textInputLayout.getEditText();
        this.f10666c = editText;
        editText.setVisibility(4);
        C2864b c2864b = new C2864b();
        this.f10667d = c2864b;
        editText.addTextChangedListener(c2864b);
        m13269d();
        addView(chip);
        addView(textInputLayout);
        this.f10668e = (TextView) findViewById(C6742f.f26045p);
        editText.setId(C0625o0.m3035k());
        C0625o0.m3066z0(this.f10668e, editText.getId());
        editText.setSaveEnabled(false);
        editText.setLongClickable(false);
    }
}
