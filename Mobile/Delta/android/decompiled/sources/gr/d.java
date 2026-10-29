package gr;

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
    public final ConstraintLayout f18393a;

    @NonNull
    public final TextInputLayout b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final TextView f18394c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final TextInputLayout f18395d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public final MaterialAutoCompleteTextView f18396e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NonNull
    public final TextInputLayout f18397f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NonNull
    public final MaterialAutoCompleteTextView f18398g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f18399h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f18400i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f18401j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NonNull
    public final TextView f18402k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NonNull
    public final TextInputLayout f18403l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NonNull
    public final TextInputLayout f18404m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NonNull
    public final TextInputLayout f18405n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NonNull
    public final TextInputEditText f18406o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @NonNull
    public final TextInputEditText f18407p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @NonNull
    public final TextInputEditText f18408q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @NonNull
    public final TextInputEditText f18409r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @NonNull
    public final CircularProgressIndicator f18410s;

    public d(@NonNull ConstraintLayout constraintLayout, @NonNull TextInputLayout textInputLayout, @NonNull TextView textView, @NonNull TextInputLayout textInputLayout2, @NonNull MaterialAutoCompleteTextView materialAutoCompleteTextView, @NonNull TextInputLayout textInputLayout3, @NonNull MaterialAutoCompleteTextView materialAutoCompleteTextView2, @NonNull ConstraintLayout constraintLayout2, @NonNull ConstraintLayout constraintLayout3, @NonNull ConstraintLayout constraintLayout4, @NonNull TextView textView2, @NonNull TextInputLayout textInputLayout4, @NonNull TextInputLayout textInputLayout5, @NonNull TextInputLayout textInputLayout6, @NonNull TextInputEditText textInputEditText, @NonNull TextInputEditText textInputEditText2, @NonNull TextInputEditText textInputEditText3, @NonNull TextInputEditText textInputEditText4, @NonNull CircularProgressIndicator circularProgressIndicator) {
        this.f18393a = constraintLayout;
        this.b = textInputLayout;
        this.f18394c = textView;
        this.f18395d = textInputLayout2;
        this.f18396e = materialAutoCompleteTextView;
        this.f18397f = textInputLayout3;
        this.f18398g = materialAutoCompleteTextView2;
        this.f18399h = constraintLayout2;
        this.f18400i = constraintLayout3;
        this.f18401j = constraintLayout4;
        this.f18402k = textView2;
        this.f18403l = textInputLayout4;
        this.f18404m = textInputLayout5;
        this.f18405n = textInputLayout6;
        this.f18406o = textInputEditText;
        this.f18407p = textInputEditText2;
        this.f18408q = textInputEditText3;
        this.f18409r = textInputEditText4;
        this.f18410s = circularProgressIndicator;
    }

    @NonNull
    public static d a(@NonNull View view) {
        int i10 = ar.d.b;
        TextInputLayout textInputLayout = (TextInputLayout) r5.b.a(view, i10);
        if (textInputLayout != null) {
            i10 = ar.d.f3661c;
            TextView textView = (TextView) r5.b.a(view, i10);
            if (textView != null) {
                i10 = ar.d.f3663d;
                TextInputLayout textInputLayout2 = (TextInputLayout) r5.b.a(view, i10);
                if (textInputLayout2 != null) {
                    i10 = ar.d.f3665e;
                    MaterialAutoCompleteTextView materialAutoCompleteTextView = (MaterialAutoCompleteTextView) r5.b.a(view, i10);
                    if (materialAutoCompleteTextView != null) {
                        i10 = ar.d.f3667f;
                        TextInputLayout textInputLayout3 = (TextInputLayout) r5.b.a(view, i10);
                        if (textInputLayout3 != null) {
                            i10 = ar.d.f3669g;
                            MaterialAutoCompleteTextView materialAutoCompleteTextView2 = (MaterialAutoCompleteTextView) r5.b.a(view, i10);
                            if (materialAutoCompleteTextView2 != null) {
                                ConstraintLayout constraintLayout = (ConstraintLayout) view;
                                i10 = ar.d.f3671h;
                                ConstraintLayout constraintLayout2 = (ConstraintLayout) r5.b.a(view, i10);
                                if (constraintLayout2 != null) {
                                    i10 = ar.d.f3673i;
                                    ConstraintLayout constraintLayout3 = (ConstraintLayout) r5.b.a(view, i10);
                                    if (constraintLayout3 != null) {
                                        i10 = ar.d.f3675j;
                                        TextView textView2 = (TextView) r5.b.a(view, i10);
                                        if (textView2 != null) {
                                            i10 = ar.d.f3677k;
                                            TextInputLayout textInputLayout4 = (TextInputLayout) r5.b.a(view, i10);
                                            if (textInputLayout4 != null) {
                                                i10 = ar.d.f3679l;
                                                TextInputLayout textInputLayout5 = (TextInputLayout) r5.b.a(view, i10);
                                                if (textInputLayout5 != null) {
                                                    i10 = ar.d.f3681m;
                                                    TextInputLayout textInputLayout6 = (TextInputLayout) r5.b.a(view, i10);
                                                    if (textInputLayout6 != null) {
                                                        i10 = ar.d.C;
                                                        TextInputEditText textInputEditText = (TextInputEditText) r5.b.a(view, i10);
                                                        if (textInputEditText != null) {
                                                            i10 = ar.d.D;
                                                            TextInputEditText textInputEditText2 = (TextInputEditText) r5.b.a(view, i10);
                                                            if (textInputEditText2 != null) {
                                                                i10 = ar.d.E;
                                                                TextInputEditText textInputEditText3 = (TextInputEditText) r5.b.a(view, i10);
                                                                if (textInputEditText3 != null) {
                                                                    i10 = ar.d.F;
                                                                    TextInputEditText textInputEditText4 = (TextInputEditText) r5.b.a(view, i10);
                                                                    if (textInputEditText4 != null) {
                                                                        i10 = ar.d.f3694s0;
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
        View viewInflate = layoutInflater.inflate(ar.e.f3711d, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @Override // r5.a
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f18393a;
    }
}
