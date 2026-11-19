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
public final class f implements s5.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f33882a;

    @NonNull
    public final TextView b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final TextInputLayout f33883c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final TextInputEditText f33884d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public final TextView f33885e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NonNull
    public final TextInputLayout f33886f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NonNull
    public final AutoCompleteTextView f33887g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NonNull
    public final TextInputLayout f33888h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NonNull
    public final TextInputEditText f33889i;

    public f(@NonNull ConstraintLayout constraintLayout, @NonNull TextView textView, @NonNull TextInputLayout textInputLayout, @NonNull TextInputEditText textInputEditText, @NonNull TextView textView2, @NonNull TextInputLayout textInputLayout2, @NonNull AutoCompleteTextView autoCompleteTextView, @NonNull TextInputLayout textInputLayout3, @NonNull TextInputEditText textInputEditText2) {
        this.f33882a = constraintLayout;
        this.b = textView;
        this.f33883c = textInputLayout;
        this.f33884d = textInputEditText;
        this.f33885e = textView2;
        this.f33886f = textInputLayout2;
        this.f33887g = autoCompleteTextView;
        this.f33888h = textInputLayout3;
        this.f33889i = textInputEditText2;
    }

    @NonNull
    public static f a(@NonNull View view) {
        int i10 = or.f.f28457x;
        TextView textView = (TextView) s5.b.a(view, i10);
        if (textView != null) {
            i10 = or.f.f28459y;
            TextInputLayout textInputLayout = (TextInputLayout) s5.b.a(view, i10);
            if (textInputLayout != null) {
                i10 = or.f.f28461z;
                TextInputEditText textInputEditText = (TextInputEditText) s5.b.a(view, i10);
                if (textInputEditText != null) {
                    i10 = or.f.H;
                    TextView textView2 = (TextView) s5.b.a(view, i10);
                    if (textView2 != null) {
                        i10 = or.f.f28416c0;
                        TextInputLayout textInputLayout2 = (TextInputLayout) s5.b.a(view, i10);
                        if (textInputLayout2 != null) {
                            i10 = or.f.f28418d0;
                            AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) s5.b.a(view, i10);
                            if (autoCompleteTextView != null) {
                                i10 = or.f.N0;
                                TextInputLayout textInputLayout3 = (TextInputLayout) s5.b.a(view, i10);
                                if (textInputLayout3 != null) {
                                    i10 = or.f.O0;
                                    TextInputEditText textInputEditText2 = (TextInputEditText) s5.b.a(view, i10);
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
        View viewInflate = layoutInflater.inflate(or.g.f28467f, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @Override // s5.a
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f33882a;
    }
}
