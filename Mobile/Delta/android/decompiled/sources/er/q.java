package er;

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
public final class q implements r5.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f16344a;

    @NonNull
    public final ConstraintLayout b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final TextInputLayout f16345c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final AutoCompleteTextView f16346d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public final TextView f16347e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NonNull
    public final TextInputLayout f16348f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NonNull
    public final AutoCompleteTextView f16349g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NonNull
    public final TextView f16350h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NonNull
    public final TextInputLayout f16351i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NonNull
    public final TextInputEditText f16352j;

    public q(@NonNull ConstraintLayout constraintLayout, @NonNull ConstraintLayout constraintLayout2, @NonNull TextInputLayout textInputLayout, @NonNull AutoCompleteTextView autoCompleteTextView, @NonNull TextView textView, @NonNull TextInputLayout textInputLayout2, @NonNull AutoCompleteTextView autoCompleteTextView2, @NonNull TextView textView2, @NonNull TextInputLayout textInputLayout3, @NonNull TextInputEditText textInputEditText) {
        this.f16344a = constraintLayout;
        this.b = constraintLayout2;
        this.f16345c = textInputLayout;
        this.f16346d = autoCompleteTextView;
        this.f16347e = textView;
        this.f16348f = textInputLayout2;
        this.f16349g = autoCompleteTextView2;
        this.f16350h = textView2;
        this.f16351i = textInputLayout3;
        this.f16352j = textInputEditText;
    }

    @NonNull
    public static q a(@NonNull View view) {
        ConstraintLayout constraintLayout = (ConstraintLayout) view;
        int i10 = yq.d.P;
        TextInputLayout textInputLayout = (TextInputLayout) r5.b.a(view, i10);
        if (textInputLayout != null) {
            i10 = yq.d.Q;
            AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) r5.b.a(view, i10);
            if (autoCompleteTextView != null) {
                i10 = yq.d.R;
                TextView textView = (TextView) r5.b.a(view, i10);
                if (textView != null) {
                    i10 = yq.d.S;
                    TextInputLayout textInputLayout2 = (TextInputLayout) r5.b.a(view, i10);
                    if (textInputLayout2 != null) {
                        i10 = yq.d.T;
                        AutoCompleteTextView autoCompleteTextView2 = (AutoCompleteTextView) r5.b.a(view, i10);
                        if (autoCompleteTextView2 != null) {
                            i10 = yq.d.U;
                            TextView textView2 = (TextView) r5.b.a(view, i10);
                            if (textView2 != null) {
                                i10 = yq.d.V;
                                TextInputLayout textInputLayout3 = (TextInputLayout) r5.b.a(view, i10);
                                if (textInputLayout3 != null) {
                                    i10 = yq.d.W;
                                    TextInputEditText textInputEditText = (TextInputEditText) r5.b.a(view, i10);
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
        View viewInflate = layoutInflater.inflate(yq.e.f37084r, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @Override // r5.a
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f16344a;
    }
}
