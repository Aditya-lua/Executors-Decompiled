package gr;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import ar.C1149d;
import ar.C1150e;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import p402r5.C10785b;
import p402r5.InterfaceC10784a;

/* JADX INFO: renamed from: gr.o */
/* JADX INFO: loaded from: classes3.dex */
public final class C6227o implements InterfaceC10784a {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final TextInputLayout f23714a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final TextInputEditText f23715b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final TextInputLayout f23716c;

    public C6227o(@NonNull TextInputLayout textInputLayout, @NonNull TextInputEditText textInputEditText, @NonNull TextInputLayout textInputLayout2) {
        this.f23714a = textInputLayout;
        this.f23715b = textInputEditText;
        this.f23716c = textInputLayout2;
    }

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C6227o m27396a(@NonNull View view) {
        int i10 = C1149d.f4771B;
        TextInputEditText textInputEditText = (TextInputEditText) C10785b.m41116a(view, i10);
        if (textInputEditText == null) {
            throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
        }
        TextInputLayout textInputLayout = (TextInputLayout) view;
        return new C6227o(textInputLayout, textInputEditText, textInputLayout);
    }

    @NonNull
    /* JADX INFO: renamed from: c */
    public static C6227o m27397c(@NonNull LayoutInflater layoutInflater) {
        return m27398d(layoutInflater, null, false);
    }

    @NonNull
    /* JADX INFO: renamed from: d */
    public static C6227o m27398d(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(C1150e.f4879q, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return m27396a(viewInflate);
    }

    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // p402r5.InterfaceC10784a
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public TextInputLayout getRoot() {
        return this.f23714a;
    }
}
