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

/* JADX INFO: renamed from: gr.f */
/* JADX INFO: loaded from: classes3.dex */
public final class C6218f implements InterfaceC10784a {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final ConstraintLayout f23677a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final TextView f23678b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final TextInputLayout f23679c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final TextInputEditText f23680d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final TextView f23681e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final TextInputLayout f23682f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final AutoCompleteTextView f23683g;

    /* JADX INFO: renamed from: h */
    @NonNull
    public final TextInputLayout f23684h;

    /* JADX INFO: renamed from: i */
    @NonNull
    public final TextInputEditText f23685i;

    public C6218f(@NonNull ConstraintLayout constraintLayout, @NonNull TextView textView, @NonNull TextInputLayout textInputLayout, @NonNull TextInputEditText textInputEditText, @NonNull TextView textView2, @NonNull TextInputLayout textInputLayout2, @NonNull AutoCompleteTextView autoCompleteTextView, @NonNull TextInputLayout textInputLayout3, @NonNull TextInputEditText textInputEditText2) {
        this.f23677a = constraintLayout;
        this.f23678b = textView;
        this.f23679c = textInputLayout;
        this.f23680d = textInputEditText;
        this.f23681e = textView2;
        this.f23682f = textInputLayout2;
        this.f23683g = autoCompleteTextView;
        this.f23684h = textInputLayout3;
        this.f23685i = textInputEditText2;
    }

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C6218f m27360a(@NonNull View view) {
        int i10 = C1149d.f4856x;
        TextView textView = (TextView) C10785b.m41116a(view, i10);
        if (textView != null) {
            i10 = C1149d.f4858y;
            TextInputLayout textInputLayout = (TextInputLayout) C10785b.m41116a(view, i10);
            if (textInputLayout != null) {
                i10 = C1149d.f4860z;
                TextInputEditText textInputEditText = (TextInputEditText) C10785b.m41116a(view, i10);
                if (textInputEditText != null) {
                    i10 = C1149d.f4783H;
                    TextView textView2 = (TextView) C10785b.m41116a(view, i10);
                    if (textView2 != null) {
                        i10 = C1149d.f4815c0;
                        TextInputLayout textInputLayout2 = (TextInputLayout) C10785b.m41116a(view, i10);
                        if (textInputLayout2 != null) {
                            i10 = C1149d.f4817d0;
                            AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) C10785b.m41116a(view, i10);
                            if (autoCompleteTextView != null) {
                                i10 = C1149d.f4796N0;
                                TextInputLayout textInputLayout3 = (TextInputLayout) C10785b.m41116a(view, i10);
                                if (textInputLayout3 != null) {
                                    i10 = C1149d.f4798O0;
                                    TextInputEditText textInputEditText2 = (TextInputEditText) C10785b.m41116a(view, i10);
                                    if (textInputEditText2 != null) {
                                        return new C6218f((ConstraintLayout) view, textView, textInputLayout, textInputEditText, textView2, textInputLayout2, autoCompleteTextView, textInputLayout3, textInputEditText2);
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
    public static C6218f m27361c(@NonNull LayoutInflater layoutInflater) {
        return m27362d(layoutInflater, null, false);
    }

    @NonNull
    /* JADX INFO: renamed from: d */
    public static C6218f m27362d(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(C1150e.f4868f, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return m27360a(viewInflate);
    }

    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // p402r5.InterfaceC10784a
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f23677a;
    }
}
