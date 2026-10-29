package gr;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import ar.C1149d;
import ar.C1150e;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import p402r5.C10785b;
import p402r5.InterfaceC10784a;

/* JADX INFO: renamed from: gr.c */
/* JADX INFO: loaded from: classes3.dex */
public final class C6215c implements InterfaceC10784a {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final ConstraintLayout f23648a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final TextInputLayout f23649b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final TextInputEditText f23650c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final TextInputLayout f23651d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final TextInputLayout f23652e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final TextInputEditText f23653f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final TextInputLayout f23654g;

    public C6215c(@NonNull ConstraintLayout constraintLayout, @NonNull TextInputLayout textInputLayout, @NonNull TextInputEditText textInputEditText, @NonNull TextInputLayout textInputLayout2, @NonNull TextInputLayout textInputLayout3, @NonNull TextInputEditText textInputEditText2, @NonNull TextInputLayout textInputLayout4) {
        this.f23648a = constraintLayout;
        this.f23649b = textInputLayout;
        this.f23650c = textInputEditText;
        this.f23651d = textInputLayout2;
        this.f23652e = textInputLayout3;
        this.f23653f = textInputEditText2;
        this.f23654g = textInputLayout4;
    }

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C6215c m27348a(@NonNull View view) {
        int i10 = C1149d.f4787J;
        TextInputLayout textInputLayout = (TextInputLayout) C10785b.m41116a(view, i10);
        if (textInputLayout != null) {
            i10 = C1149d.f4789K;
            TextInputEditText textInputEditText = (TextInputEditText) C10785b.m41116a(view, i10);
            if (textInputEditText != null) {
                i10 = C1149d.f4793M;
                TextInputLayout textInputLayout2 = (TextInputLayout) C10785b.m41116a(view, i10);
                if (textInputLayout2 != null) {
                    i10 = C1149d.f4774C0;
                    TextInputLayout textInputLayout3 = (TextInputLayout) C10785b.m41116a(view, i10);
                    if (textInputLayout3 != null) {
                        i10 = C1149d.f4776D0;
                        TextInputEditText textInputEditText2 = (TextInputEditText) C10785b.m41116a(view, i10);
                        if (textInputEditText2 != null) {
                            i10 = C1149d.f4792L0;
                            TextInputLayout textInputLayout4 = (TextInputLayout) C10785b.m41116a(view, i10);
                            if (textInputLayout4 != null) {
                                return new C6215c((ConstraintLayout) view, textInputLayout, textInputEditText, textInputLayout2, textInputLayout3, textInputEditText2, textInputLayout4);
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
    public static C6215c m27349c(@NonNull LayoutInflater layoutInflater) {
        return m27350d(layoutInflater, null, false);
    }

    @NonNull
    /* JADX INFO: renamed from: d */
    public static C6215c m27350d(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(C1150e.f4865c, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return m27348a(viewInflate);
    }

    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // p402r5.InterfaceC10784a
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f23648a;
    }
}
