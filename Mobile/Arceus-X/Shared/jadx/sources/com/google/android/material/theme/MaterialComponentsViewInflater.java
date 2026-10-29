package com.google.android.material.theme;

import android.content.Context;
import android.util.AttributeSet;
import androidx.annotation.NonNull;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.checkbox.MaterialCheckBox;
import com.google.android.material.radiobutton.MaterialRadioButton;
import com.google.android.material.textfield.MaterialAutoCompleteTextView;
import p203j.C7004n;
import p269ld.C8126a;
import p365q.C10359b0;
import p365q.C10364d;
import p365q.C10370f;
import p365q.C10373g;
import p365q.C10403u;

/* JADX INFO: loaded from: classes2.dex */
public class MaterialComponentsViewInflater extends C7004n {
    @Override // p203j.C7004n
    @NonNull
    /* JADX INFO: renamed from: c */
    public C10364d mo13261c(@NonNull Context context, AttributeSet attributeSet) {
        return new MaterialAutoCompleteTextView(context, attributeSet);
    }

    @Override // p203j.C7004n
    @NonNull
    /* JADX INFO: renamed from: d */
    public C10370f mo13262d(@NonNull Context context, @NonNull AttributeSet attributeSet) {
        return new MaterialButton(context, attributeSet);
    }

    @Override // p203j.C7004n
    @NonNull
    /* JADX INFO: renamed from: e */
    public C10373g mo13263e(Context context, AttributeSet attributeSet) {
        return new MaterialCheckBox(context, attributeSet);
    }

    @Override // p203j.C7004n
    @NonNull
    /* JADX INFO: renamed from: k */
    public C10403u mo13264k(Context context, AttributeSet attributeSet) {
        return new MaterialRadioButton(context, attributeSet);
    }

    @Override // p203j.C7004n
    @NonNull
    /* JADX INFO: renamed from: o */
    public C10359b0 mo13265o(Context context, AttributeSet attributeSet) {
        return new C8126a(context, attributeSet);
    }
}
