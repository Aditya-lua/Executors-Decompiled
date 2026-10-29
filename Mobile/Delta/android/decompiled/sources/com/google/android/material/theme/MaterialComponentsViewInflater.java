package com.google.android.material.theme;

import android.content.Context;
import android.util.AttributeSet;
import androidx.annotation.NonNull;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.checkbox.MaterialCheckBox;
import com.google.android.material.radiobutton.MaterialRadioButton;
import com.google.android.material.textfield.MaterialAutoCompleteTextView;
import j.n;
import kd.a;
import q.b0;
import q.d;
import q.f;
import q.g;
import q.u;

/* JADX INFO: loaded from: classes2.dex */
public class MaterialComponentsViewInflater extends n {
    @Override // j.n
    @NonNull
    public d c(@NonNull Context context, AttributeSet attributeSet) {
        return new MaterialAutoCompleteTextView(context, attributeSet);
    }

    @Override // j.n
    @NonNull
    public f d(@NonNull Context context, @NonNull AttributeSet attributeSet) {
        return new MaterialButton(context, attributeSet);
    }

    @Override // j.n
    @NonNull
    public g e(Context context, AttributeSet attributeSet) {
        return new MaterialCheckBox(context, attributeSet);
    }

    @Override // j.n
    @NonNull
    public u k(Context context, AttributeSet attributeSet) {
        return new MaterialRadioButton(context, attributeSet);
    }

    @Override // j.n
    @NonNull
    public b0 o(Context context, AttributeSet attributeSet) {
        return new a(context, attributeSet);
    }
}
