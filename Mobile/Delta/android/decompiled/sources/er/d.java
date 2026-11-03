package er;

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
public final class d implements r5.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f16291a;

    @NonNull
    public final TextInputLayout b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final TextView f16292c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final TextInputLayout f16293d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public final MaterialAutoCompleteTextView f16294e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NonNull
    public final TextInputLayout f16295f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NonNull
    public final MaterialAutoCompleteTextView f16296g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f16297h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f16298i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f16299j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NonNull
    public final TextView f16300k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NonNull
    public final TextInputLayout f16301l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NonNull
    public final TextInputLayout f16302m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NonNull
    public final TextInputLayout f16303n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NonNull
    public final TextInputEditText f16304o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @NonNull
    public final TextInputEditText f16305p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @NonNull
    public final TextInputEditText f16306q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @NonNull
    public final TextInputEditText f16307r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @NonNull
    public final CircularProgressIndicator f16308s;

    public d(@NonNull ConstraintLayout constraintLayout, @NonNull TextInputLayout textInputLayout, @NonNull TextView textView, @NonNull TextInputLayout textInputLayout2, @NonNull MaterialAutoCompleteTextView materialAutoCompleteTextView, @NonNull TextInputLayout textInputLayout3, @NonNull MaterialAutoCompleteTextView materialAutoCompleteTextView2, @NonNull ConstraintLayout constraintLayout2, @NonNull ConstraintLayout constraintLayout3, @NonNull ConstraintLayout constraintLayout4, @NonNull TextView textView2, @NonNull TextInputLayout textInputLayout4, @NonNull TextInputLayout textInputLayout5, @NonNull TextInputLayout textInputLayout6, @NonNull TextInputEditText textInputEditText, @NonNull TextInputEditText textInputEditText2, @NonNull TextInputEditText textInputEditText3, @NonNull TextInputEditText textInputEditText4, @NonNull CircularProgressIndicator circularProgressIndicator) {
        this.f16291a = constraintLayout;
        this.b = textInputLayout;
        this.f16292c = textView;
        this.f16293d = textInputLayout2;
        this.f16294e = materialAutoCompleteTextView;
        this.f16295f = textInputLayout3;
        this.f16296g = materialAutoCompleteTextView2;
        this.f16297h = constraintLayout2;
        this.f16298i = constraintLayout3;
        this.f16299j = constraintLayout4;
        this.f16300k = textView2;
        this.f16301l = textInputLayout4;
        this.f16302m = textInputLayout5;
        this.f16303n = textInputLayout6;
        this.f16304o = textInputEditText;
        this.f16305p = textInputEditText2;
        this.f16306q = textInputEditText3;
        this.f16307r = textInputEditText4;
        this.f16308s = circularProgressIndicator;
    }

    @NonNull
    public static d a(@NonNull View view) {
        int i10 = yq.d.b;
        TextInputLayout textInputLayout = (TextInputLayout) r5.b.a(view, i10);
        if (textInputLayout != null) {
            i10 = yq.d.f37020c;
            TextView textView = (TextView) r5.b.a(view, i10);
            if (textView != null) {
                i10 = yq.d.f37022d;
                TextInputLayout textInputLayout2 = (TextInputLayout) r5.b.a(view, i10);
                if (textInputLayout2 != null) {
                    i10 = yq.d.f37024e;
                    MaterialAutoCompleteTextView materialAutoCompleteTextView = (MaterialAutoCompleteTextView) r5.b.a(view, i10);
                    if (materialAutoCompleteTextView != null) {
                        i10 = yq.d.f37026f;
                        TextInputLayout textInputLayout3 = (TextInputLayout) r5.b.a(view, i10);
                        if (textInputLayout3 != null) {
                            i10 = yq.d.f37028g;
                            MaterialAutoCompleteTextView materialAutoCompleteTextView2 = (MaterialAutoCompleteTextView) r5.b.a(view, i10);
                            if (materialAutoCompleteTextView2 != null) {
                                ConstraintLayout constraintLayout = (ConstraintLayout) view;
                                i10 = yq.d.f37030h;
                                ConstraintLayout constraintLayout2 = (ConstraintLayout) r5.b.a(view, i10);
                                if (constraintLayout2 != null) {
                                    i10 = yq.d.f37032i;
                                    ConstraintLayout constraintLayout3 = (ConstraintLayout) r5.b.a(view, i10);
                                    if (constraintLayout3 != null) {
                                        i10 = yq.d.f37034j;
                                        TextView textView2 = (TextView) r5.b.a(view, i10);
                                        if (textView2 != null) {
                                            i10 = yq.d.f37036k;
                                            TextInputLayout textInputLayout4 = (TextInputLayout) r5.b.a(view, i10);
                                            if (textInputLayout4 != null) {
                                                i10 = yq.d.f37038l;
                                                TextInputLayout textInputLayout5 = (TextInputLayout) r5.b.a(view, i10);
                                                if (textInputLayout5 != null) {
                                                    i10 = yq.d.f37040m;
                                                    TextInputLayout textInputLayout6 = (TextInputLayout) r5.b.a(view, i10);
                                                    if (textInputLayout6 != null) {
                                                        i10 = yq.d.C;
                                                        TextInputEditText textInputEditText = (TextInputEditText) r5.b.a(view, i10);
                                                        if (textInputEditText != null) {
                                                            i10 = yq.d.D;
                                                            TextInputEditText textInputEditText2 = (TextInputEditText) r5.b.a(view, i10);
                                                            if (textInputEditText2 != null) {
                                                                i10 = yq.d.E;
                                                                TextInputEditText textInputEditText3 = (TextInputEditText) r5.b.a(view, i10);
                                                                if (textInputEditText3 != null) {
                                                                    i10 = yq.d.F;
                                                                    TextInputEditText textInputEditText4 = (TextInputEditText) r5.b.a(view, i10);
                                                                    if (textInputEditText4 != null) {
                                                                        i10 = yq.d.f37053s0;
                                                                        CircularProgressIndicator circularProgressIndicator = (CircularProgressIndicator) r5.b.a(view, i10);
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
        View viewInflate = layoutInflater.inflate(yq.e.f37070d, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @Override // r5.a
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f16291a;
    }
}
