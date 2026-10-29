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
public final class f implements r5.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f18413a;

    @NonNull
    public final TextView b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final TextInputLayout f18414c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final TextInputEditText f18415d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public final TextView f18416e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NonNull
    public final TextInputLayout f18417f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NonNull
    public final AutoCompleteTextView f18418g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NonNull
    public final TextInputLayout f18419h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NonNull
    public final TextInputEditText f18420i;

    public f(@NonNull ConstraintLayout constraintLayout, @NonNull TextView textView, @NonNull TextInputLayout textInputLayout, @NonNull TextInputEditText textInputEditText, @NonNull TextView textView2, @NonNull TextInputLayout textInputLayout2, @NonNull AutoCompleteTextView autoCompleteTextView, @NonNull TextInputLayout textInputLayout3, @NonNull TextInputEditText textInputEditText2) {
        this.f18413a = constraintLayout;
        this.b = textView;
        this.f18414c = textInputLayout;
        this.f18415d = textInputEditText;
        this.f18416e = textView2;
        this.f18417f = textInputLayout2;
        this.f18418g = autoCompleteTextView;
        this.f18419h = textInputLayout3;
        this.f18420i = textInputEditText2;
    }

    @NonNull
    public static f a(@NonNull View view) {
        int i10 = ar.d.f3703x;
        TextView textView = (TextView) r5.b.a(view, i10);
        if (textView != null) {
            i10 = ar.d.f3705y;
            TextInputLayout textInputLayout = (TextInputLayout) r5.b.a(view, i10);
            if (textInputLayout != null) {
                i10 = ar.d.f3707z;
                TextInputEditText textInputEditText = (TextInputEditText) r5.b.a(view, i10);
                if (textInputEditText != null) {
                    i10 = ar.d.H;
                    TextView textView2 = (TextView) r5.b.a(view, i10);
                    if (textView2 != null) {
                        i10 = ar.d.f3662c0;
                        TextInputLayout textInputLayout2 = (TextInputLayout) r5.b.a(view, i10);
                        if (textInputLayout2 != null) {
                            i10 = ar.d.f3664d0;
                            AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) r5.b.a(view, i10);
                            if (autoCompleteTextView != null) {
                                i10 = ar.d.N0;
                                TextInputLayout textInputLayout3 = (TextInputLayout) r5.b.a(view, i10);
                                if (textInputLayout3 != null) {
                                    i10 = ar.d.O0;
                                    TextInputEditText textInputEditText2 = (TextInputEditText) r5.b.a(view, i10);
                                    if (textInputEditText2 != null) {
                                        return new f((ConstraintLayout) view, textView, textInputLayout, textInputEditText, textView2, textInputLayout2, autoCompleteTextView, textInputLayout3, textInputEditText2);
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
    public static f c(@NonNull LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    @NonNull
    public static f d(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(ar.e.f3713f, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @Override // r5.a
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f18413a;
    }
}
