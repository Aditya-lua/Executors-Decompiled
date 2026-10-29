package gr;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AutoCompleteTextView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import ar.C1149d;
import ar.C1150e;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import p402r5.C10785b;
import p402r5.InterfaceC10784a;

/* JADX INFO: renamed from: gr.q */
/* JADX INFO: loaded from: classes3.dex */
public final class C6229q implements InterfaceC10784a {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final ConstraintLayout f23720a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final ConstraintLayout f23721b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final TextInputLayout f23722c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final AutoCompleteTextView f23723d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final TextView f23724e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final TextInputLayout f23725f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final AutoCompleteTextView f23726g;

    /* JADX INFO: renamed from: h */
    @NonNull
    public final TextView f23727h;

    /* JADX INFO: renamed from: i */
    @NonNull
    public final TextInputLayout f23728i;

    /* JADX INFO: renamed from: j */
    @NonNull
    public final TextInputEditText f23729j;

    public C6229q(@NonNull ConstraintLayout constraintLayout, @NonNull ConstraintLayout constraintLayout2, @NonNull TextInputLayout textInputLayout, @NonNull AutoCompleteTextView autoCompleteTextView, @NonNull TextView textView, @NonNull TextInputLayout textInputLayout2, @NonNull AutoCompleteTextView autoCompleteTextView2, @NonNull TextView textView2, @NonNull TextInputLayout textInputLayout3, @NonNull TextInputEditText textInputEditText) {
        this.f23720a = constraintLayout;
        this.f23721b = constraintLayout2;
        this.f23722c = textInputLayout;
        this.f23723d = autoCompleteTextView;
        this.f23724e = textView;
        this.f23725f = textInputLayout2;
        this.f23726g = autoCompleteTextView2;
        this.f23727h = textView2;
        this.f23728i = textInputLayout3;
        this.f23729j = textInputEditText;
    }

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C6229q m27404a(@NonNull View view) {
        ConstraintLayout constraintLayout = (ConstraintLayout) view;
        int i10 = C1149d.f4799P;
        TextInputLayout textInputLayout = (TextInputLayout) C10785b.m41116a(view, i10);
        if (textInputLayout != null) {
            i10 = C1149d.f4800Q;
            AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) C10785b.m41116a(view, i10);
            if (autoCompleteTextView != null) {
                i10 = C1149d.f4801R;
                TextView textView = (TextView) C10785b.m41116a(view, i10);
                if (textView != null) {
                    i10 = C1149d.f4802S;
                    TextInputLayout textInputLayout2 = (TextInputLayout) C10785b.m41116a(view, i10);
                    if (textInputLayout2 != null) {
                        i10 = C1149d.f4803T;
                        AutoCompleteTextView autoCompleteTextView2 = (AutoCompleteTextView) C10785b.m41116a(view, i10);
                        if (autoCompleteTextView2 != null) {
                            i10 = C1149d.f4804U;
                            TextView textView2 = (TextView) C10785b.m41116a(view, i10);
                            if (textView2 != null) {
                                i10 = C1149d.f4805V;
                                TextInputLayout textInputLayout3 = (TextInputLayout) C10785b.m41116a(view, i10);
                                if (textInputLayout3 != null) {
                                    i10 = C1149d.f4806W;
                                    TextInputEditText textInputEditText = (TextInputEditText) C10785b.m41116a(view, i10);
                                    if (textInputEditText != null) {
                                        return new C6229q(constraintLayout, constraintLayout, textInputLayout, autoCompleteTextView, textView, textInputLayout2, autoCompleteTextView2, textView2, textInputLayout3, textInputEditText);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @NonNull
    /* JADX INFO: renamed from: c */
    public static C6229q m27405c(@NonNull LayoutInflater layoutInflater) {
        return m27406d(layoutInflater, null, false);
    }

    @NonNull
    /* JADX INFO: renamed from: d */
    public static C6229q m27406d(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(C1150e.f4880r, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return m27404a(viewInflate);
    }

    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // p402r5.InterfaceC10784a
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f23720a;
    }
}
