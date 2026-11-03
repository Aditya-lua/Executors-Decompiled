package com.google.android.material.timepicker;

import ad.n;
import ad.r;
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
import androidx.core.view.o0;
import com.google.android.material.chip.Chip;
import com.google.android.material.textfield.TextInputLayout;
import ic.f;
import ic.h;

/* JADX INFO: loaded from: classes2.dex */
class ChipTextInputComboView extends FrameLayout implements Checkable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Chip f8384a;
    public final TextInputLayout b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final EditText f8385c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public TextWatcher f8386d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public TextView f8387e;

    public class b extends n {
        public b() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            if (TextUtils.isEmpty(editable)) {
                ChipTextInputComboView.this.f8384a.setText(ChipTextInputComboView.this.c("00"));
                return;
            }
            String strC = ChipTextInputComboView.this.c(editable);
            Chip chip = ChipTextInputComboView.this.f8384a;
            if (TextUtils.isEmpty(strC)) {
                strC = ChipTextInputComboView.this.c("00");
            }
            chip.setText(strC);
        }
    }

    public ChipTextInputComboView(@NonNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public final String c(CharSequence charSequence) {
        return TimeModel.a(getResources(), charSequence);
    }

    public final void d() {
        this.f8385c.setImeHintLocales(getContext().getResources().getConfiguration().getLocales());
    }

    @Override // android.widget.Checkable
    public boolean isChecked() {
        return this.f8384a.isChecked();
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        d();
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z10) {
        this.f8384a.setChecked(z10);
        this.f8385c.setVisibility(z10 ? 0 : 4);
        this.f8384a.setVisibility(z10 ? 8 : 0);
        if (isChecked()) {
            r.m(this.f8385c, false);
        }
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.f8384a.setOnClickListener(onClickListener);
    }

    @Override // android.view.View
    public void setTag(int i10, Object obj) {
        this.f8384a.setTag(i10, obj);
    }

    @Override // android.widget.Checkable
    public void toggle() {
        this.f8384a.toggle();
    }

    public ChipTextInputComboView(@NonNull Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        Chip chip = (Chip) layoutInflaterFrom.inflate(h.f20717j, (ViewGroup) this, false);
        this.f8384a = chip;
        chip.setAccessibilityClassName("android.view.View");
        TextInputLayout textInputLayout = (TextInputLayout) layoutInflaterFrom.inflate(h.f20718k, (ViewGroup) this, false);
        this.b = textInputLayout;
        EditText editText = textInputLayout.getEditText();
        this.f8385c = editText;
        editText.setVisibility(4);
        b bVar = new b();
        this.f8386d = bVar;
        editText.addTextChangedListener(bVar);
        d();
        addView(chip);
        addView(textInputLayout);
        this.f8387e = (TextView) findViewById(f.f20696p);
        editText.setId(o0.k());
        o0.z0(this.f8387e, editText.getId());
        editText.setSaveEnabled(false);
        editText.setLongClickable(false);
    }
}
