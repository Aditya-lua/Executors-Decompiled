package ur;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

/* JADX INFO: loaded from: classes3.dex */
public final class c implements s5.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f33856a;

    @NonNull
    public final TextInputLayout b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final TextInputEditText f33857c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final TextInputLayout f33858d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public final TextInputLayout f33859e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NonNull
    public final TextInputEditText f33860f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NonNull
    public final TextInputLayout f33861g;

    public c(@NonNull ConstraintLayout constraintLayout, @NonNull TextInputLayout textInputLayout, @NonNull TextInputEditText textInputEditText, @NonNull TextInputLayout textInputLayout2, @NonNull TextInputLayout textInputLayout3, @NonNull TextInputEditText textInputEditText2, @NonNull TextInputLayout textInputLayout4) {
        this.f33856a = constraintLayout;
        this.b = textInputLayout;
        this.f33857c = textInputEditText;
        this.f33858d = textInputLayout2;
        this.f33859e = textInputLayout3;
        this.f33860f = textInputEditText2;
        this.f33861g = textInputLayout4;
    }

    @NonNull
    public static c a(@NonNull View view) {
        int i10 = or.f.J;
        TextInputLayout textInputLayout = (TextInputLayout) s5.b.a(view, i10);
        if (textInputLayout != null) {
            i10 = or.f.K;
            TextInputEditText textInputEditText = (TextInputEditText) s5.b.a(view, i10);
            if (textInputEditText != null) {
                i10 = or.f.M;
                TextInputLayout textInputLayout2 = (TextInputLayout) s5.b.a(view, i10);
                if (textInputLayout2 != null) {
                    i10 = or.f.C0;
                    TextInputLayout textInputLayout3 = (TextInputLayout) s5.b.a(view, i10);
                    if (textInputLayout3 != null) {
                        i10 = or.f.D0;
                        TextInputEditText textInputEditText2 = (TextInputEditText) s5.b.a(view, i10);
                        if (textInputEditText2 != null) {
                            i10 = or.f.L0;
                            TextInputLayout textInputLayout4 = (TextInputLayout) s5.b.a(view, i10);
                            if (textInputLayout4 != null) {
                                return new c((ConstraintLayout) view, textInputLayout, textInputEditText, textInputLayout2, textInputLayout3, textInputEditText2, textInputLayout4);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @NonNull
    public static c c(@NonNull LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    @NonNull
    public static c d(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(or.g.f28464c, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @Override // s5.a
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f33856a;
    }
}
