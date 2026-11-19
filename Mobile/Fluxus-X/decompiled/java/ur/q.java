package ur;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AutoCompleteTextView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

/* JADX INFO: loaded from: classes3.dex */
public final class q implements s5.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f33915a;

    @NonNull
    public final ConstraintLayout b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final TextInputLayout f33916c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final AutoCompleteTextView f33917d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public final TextView f33918e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NonNull
    public final TextInputLayout f33919f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NonNull
    public final AutoCompleteTextView f33920g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NonNull
    public final TextView f33921h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NonNull
    public final TextInputLayout f33922i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NonNull
    public final TextInputEditText f33923j;

    public q(@NonNull ConstraintLayout constraintLayout, @NonNull ConstraintLayout constraintLayout2, @NonNull TextInputLayout textInputLayout, @NonNull AutoCompleteTextView autoCompleteTextView, @NonNull TextView textView, @NonNull TextInputLayout textInputLayout2, @NonNull AutoCompleteTextView autoCompleteTextView2, @NonNull TextView textView2, @NonNull TextInputLayout textInputLayout3, @NonNull TextInputEditText textInputEditText) {
        this.f33915a = constraintLayout;
        this.b = constraintLayout2;
        this.f33916c = textInputLayout;
        this.f33917d = autoCompleteTextView;
        this.f33918e = textView;
        this.f33919f = textInputLayout2;
        this.f33920g = autoCompleteTextView2;
        this.f33921h = textView2;
        this.f33922i = textInputLayout3;
        this.f33923j = textInputEditText;
    }

    @NonNull
    public static q a(@NonNull View view) {
        ConstraintLayout constraintLayout = (ConstraintLayout) view;
        int i10 = or.f.P;
        TextInputLayout textInputLayout = (TextInputLayout) s5.b.a(view, i10);
        if (textInputLayout != null) {
            i10 = or.f.Q;
            AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) s5.b.a(view, i10);
            if (autoCompleteTextView != null) {
                i10 = or.f.R;
                TextView textView = (TextView) s5.b.a(view, i10);
                if (textView != null) {
                    i10 = or.f.S;
                    TextInputLayout textInputLayout2 = (TextInputLayout) s5.b.a(view, i10);
                    if (textInputLayout2 != null) {
                        i10 = or.f.T;
                        AutoCompleteTextView autoCompleteTextView2 = (AutoCompleteTextView) s5.b.a(view, i10);
                        if (autoCompleteTextView2 != null) {
                            i10 = or.f.U;
                            TextView textView2 = (TextView) s5.b.a(view, i10);
                            if (textView2 != null) {
                                i10 = or.f.V;
                                TextInputLayout textInputLayout3 = (TextInputLayout) s5.b.a(view, i10);
                                if (textInputLayout3 != null) {
                                    i10 = or.f.W;
                                    TextInputEditText textInputEditText = (TextInputEditText) s5.b.a(view, i10);
                                    if (textInputEditText != null) {
                                        return new q(constraintLayout, constraintLayout, textInputLayout, autoCompleteTextView, textView, textInputLayout2, autoCompleteTextView2, textView2, textInputLayout3, textInputEditText);
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
    public static q c(@NonNull LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    @NonNull
    public static q d(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(or.g.f28479r, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @Override // s5.a
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f33915a;
    }
}
