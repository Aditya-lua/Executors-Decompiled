package ur;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.progressindicator.CircularProgressIndicator;
import com.google.android.material.textfield.MaterialAutoCompleteTextView;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

/* JADX INFO: loaded from: classes3.dex */
public final class d implements s5.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f33862a;

    @NonNull
    public final TextInputLayout b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final TextView f33863c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final TextInputLayout f33864d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public final MaterialAutoCompleteTextView f33865e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NonNull
    public final TextInputLayout f33866f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NonNull
    public final MaterialAutoCompleteTextView f33867g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f33868h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f33869i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f33870j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NonNull
    public final TextView f33871k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NonNull
    public final TextInputLayout f33872l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NonNull
    public final TextInputLayout f33873m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NonNull
    public final TextInputLayout f33874n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NonNull
    public final TextInputEditText f33875o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @NonNull
    public final TextInputEditText f33876p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @NonNull
    public final TextInputEditText f33877q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @NonNull
    public final TextInputEditText f33878r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @NonNull
    public final CircularProgressIndicator f33879s;

    public d(@NonNull ConstraintLayout constraintLayout, @NonNull TextInputLayout textInputLayout, @NonNull TextView textView, @NonNull TextInputLayout textInputLayout2, @NonNull MaterialAutoCompleteTextView materialAutoCompleteTextView, @NonNull TextInputLayout textInputLayout3, @NonNull MaterialAutoCompleteTextView materialAutoCompleteTextView2, @NonNull ConstraintLayout constraintLayout2, @NonNull ConstraintLayout constraintLayout3, @NonNull ConstraintLayout constraintLayout4, @NonNull TextView textView2, @NonNull TextInputLayout textInputLayout4, @NonNull TextInputLayout textInputLayout5, @NonNull TextInputLayout textInputLayout6, @NonNull TextInputEditText textInputEditText, @NonNull TextInputEditText textInputEditText2, @NonNull TextInputEditText textInputEditText3, @NonNull TextInputEditText textInputEditText4, @NonNull CircularProgressIndicator circularProgressIndicator) {
        this.f33862a = constraintLayout;
        this.b = textInputLayout;
        this.f33863c = textView;
        this.f33864d = textInputLayout2;
        this.f33865e = materialAutoCompleteTextView;
        this.f33866f = textInputLayout3;
        this.f33867g = materialAutoCompleteTextView2;
        this.f33868h = constraintLayout2;
        this.f33869i = constraintLayout3;
        this.f33870j = constraintLayout4;
        this.f33871k = textView2;
        this.f33872l = textInputLayout4;
        this.f33873m = textInputLayout5;
        this.f33874n = textInputLayout6;
        this.f33875o = textInputEditText;
        this.f33876p = textInputEditText2;
        this.f33877q = textInputEditText3;
        this.f33878r = textInputEditText4;
        this.f33879s = circularProgressIndicator;
    }

    @NonNull
    public static d a(@NonNull View view) {
        int i10 = or.f.b;
        TextInputLayout textInputLayout = (TextInputLayout) s5.b.a(view, i10);
        if (textInputLayout != null) {
            i10 = or.f.f28415c;
            TextView textView = (TextView) s5.b.a(view, i10);
            if (textView != null) {
                i10 = or.f.f28417d;
                TextInputLayout textInputLayout2 = (TextInputLayout) s5.b.a(view, i10);
                if (textInputLayout2 != null) {
                    i10 = or.f.f28419e;
                    MaterialAutoCompleteTextView materialAutoCompleteTextView = (MaterialAutoCompleteTextView) s5.b.a(view, i10);
                    if (materialAutoCompleteTextView != null) {
                        i10 = or.f.f28421f;
                        TextInputLayout textInputLayout3 = (TextInputLayout) s5.b.a(view, i10);
                        if (textInputLayout3 != null) {
                            i10 = or.f.f28423g;
                            MaterialAutoCompleteTextView materialAutoCompleteTextView2 = (MaterialAutoCompleteTextView) s5.b.a(view, i10);
                            if (materialAutoCompleteTextView2 != null) {
                                ConstraintLayout constraintLayout = (ConstraintLayout) view;
                                i10 = or.f.f28425h;
                                ConstraintLayout constraintLayout2 = (ConstraintLayout) s5.b.a(view, i10);
                                if (constraintLayout2 != null) {
                                    i10 = or.f.f28427i;
                                    ConstraintLayout constraintLayout3 = (ConstraintLayout) s5.b.a(view, i10);
                                    if (constraintLayout3 != null) {
                                        i10 = or.f.f28429j;
                                        TextView textView2 = (TextView) s5.b.a(view, i10);
                                        if (textView2 != null) {
                                            i10 = or.f.f28431k;
                                            TextInputLayout textInputLayout4 = (TextInputLayout) s5.b.a(view, i10);
                                            if (textInputLayout4 != null) {
                                                i10 = or.f.f28433l;
                                                TextInputLayout textInputLayout5 = (TextInputLayout) s5.b.a(view, i10);
                                                if (textInputLayout5 != null) {
                                                    i10 = or.f.f28435m;
                                                    TextInputLayout textInputLayout6 = (TextInputLayout) s5.b.a(view, i10);
                                                    if (textInputLayout6 != null) {
                                                        i10 = or.f.C;
                                                        TextInputEditText textInputEditText = (TextInputEditText) s5.b.a(view, i10);
                                                        if (textInputEditText != null) {
                                                            i10 = or.f.D;
                                                            TextInputEditText textInputEditText2 = (TextInputEditText) s5.b.a(view, i10);
                                                            if (textInputEditText2 != null) {
                                                                i10 = or.f.E;
                                                                TextInputEditText textInputEditText3 = (TextInputEditText) s5.b.a(view, i10);
                                                                if (textInputEditText3 != null) {
                                                                    i10 = or.f.F;
                                                                    TextInputEditText textInputEditText4 = (TextInputEditText) s5.b.a(view, i10);
                                                                    if (textInputEditText4 != null) {
                                                                        i10 = or.f.f28448s0;
                                                                        CircularProgressIndicator circularProgressIndicator = (CircularProgressIndicator) s5.b.a(view, i10);
                                                                        if (circularProgressIndicator != null) {
                                                                            return new d(constraintLayout, textInputLayout, textView, textInputLayout2, materialAutoCompleteTextView, textInputLayout3, materialAutoCompleteTextView2, constraintLayout, constraintLayout2, constraintLayout3, textView2, textInputLayout4, textInputLayout5, textInputLayout6, textInputEditText, textInputEditText2, textInputEditText3, textInputEditText4, circularProgressIndicator);
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
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
    public static d c(@NonNull LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    @NonNull
    public static d d(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(or.g.f28465d, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @Override // s5.a
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f33862a;
    }
}
