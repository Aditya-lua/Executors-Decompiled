package gr;

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
    public final ConstraintLayout f18446a;

    @NonNull
    public final ConstraintLayout b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final TextInputLayout f18447c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final AutoCompleteTextView f18448d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public final TextView f18449e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NonNull
    public final TextInputLayout f18450f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NonNull
    public final AutoCompleteTextView f18451g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NonNull
    public final TextView f18452h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NonNull
    public final TextInputLayout f18453i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NonNull
    public final TextInputEditText f18454j;

    public q(@NonNull ConstraintLayout constraintLayout, @NonNull ConstraintLayout constraintLayout2, @NonNull TextInputLayout textInputLayout, @NonNull AutoCompleteTextView autoCompleteTextView, @NonNull TextView textView, @NonNull TextInputLayout textInputLayout2, @NonNull AutoCompleteTextView autoCompleteTextView2, @NonNull TextView textView2, @NonNull TextInputLayout textInputLayout3, @NonNull TextInputEditText textInputEditText) {
        this.f18446a = constraintLayout;
        this.b = constraintLayout2;
        this.f18447c = textInputLayout;
        this.f18448d = autoCompleteTextView;
        this.f18449e = textView;
        this.f18450f = textInputLayout2;
        this.f18451g = autoCompleteTextView2;
        this.f18452h = textView2;
        this.f18453i = textInputLayout3;
        this.f18454j = textInputEditText;
    }

    @NonNull
    public static q a(@NonNull View view) {
        ConstraintLayout constraintLayout = (ConstraintLayout) view;
        int i10 = ar.d.P;
        TextInputLayout textInputLayout = (TextInputLayout) r5.b.a(view, i10);
        if (textInputLayout != null) {
            i10 = ar.d.Q;
            AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) r5.b.a(view, i10);
            if (autoCompleteTextView != null) {
                i10 = ar.d.R;
                TextView textView = (TextView) r5.b.a(view, i10);
                if (textView != null) {
                    i10 = ar.d.S;
                    TextInputLayout textInputLayout2 = (TextInputLayout) r5.b.a(view, i10);
                    if (textInputLayout2 != null) {
                        i10 = ar.d.T;
                        AutoCompleteTextView autoCompleteTextView2 = (AutoCompleteTextView) r5.b.a(view, i10);
                        if (autoCompleteTextView2 != null) {
                            i10 = ar.d.U;
                            TextView textView2 = (TextView) r5.b.a(view, i10);
                            if (textView2 != null) {
                                i10 = ar.d.V;
                                TextInputLayout textInputLayout3 = (TextInputLayout) r5.b.a(view, i10);
                                if (textInputLayout3 != null) {
                                    i10 = ar.d.W;
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
        View viewInflate = layoutInflater.inflate(ar.e.f3725r, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @Override // r5.a
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f18446a;
    }
}
