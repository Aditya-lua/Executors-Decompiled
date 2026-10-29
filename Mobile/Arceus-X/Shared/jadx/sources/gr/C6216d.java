package gr;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import ar.C1149d;
import ar.C1150e;
import com.google.android.material.progressindicator.CircularProgressIndicator;
import com.google.android.material.textfield.MaterialAutoCompleteTextView;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import p402r5.C10785b;
import p402r5.InterfaceC10784a;

/* JADX INFO: renamed from: gr.d */
/* JADX INFO: loaded from: classes3.dex */
public final class C6216d implements InterfaceC10784a {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final ConstraintLayout f23655a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final TextInputLayout f23656b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final TextView f23657c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final TextInputLayout f23658d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final MaterialAutoCompleteTextView f23659e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final TextInputLayout f23660f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final MaterialAutoCompleteTextView f23661g;

    /* JADX INFO: renamed from: h */
    @NonNull
    public final ConstraintLayout f23662h;

    /* JADX INFO: renamed from: i */
    @NonNull
    public final ConstraintLayout f23663i;

    /* JADX INFO: renamed from: j */
    @NonNull
    public final ConstraintLayout f23664j;

    /* JADX INFO: renamed from: k */
    @NonNull
    public final TextView f23665k;

    /* JADX INFO: renamed from: l */
    @NonNull
    public final TextInputLayout f23666l;

    /* JADX INFO: renamed from: m */
    @NonNull
    public final TextInputLayout f23667m;

    /* JADX INFO: renamed from: n */
    @NonNull
    public final TextInputLayout f23668n;

    /* JADX INFO: renamed from: o */
    @NonNull
    public final TextInputEditText f23669o;

    /* JADX INFO: renamed from: p */
    @NonNull
    public final TextInputEditText f23670p;

    /* JADX INFO: renamed from: q */
    @NonNull
    public final TextInputEditText f23671q;

    /* JADX INFO: renamed from: r */
    @NonNull
    public final TextInputEditText f23672r;

    /* JADX INFO: renamed from: s */
    @NonNull
    public final CircularProgressIndicator f23673s;

    public C6216d(@NonNull ConstraintLayout constraintLayout, @NonNull TextInputLayout textInputLayout, @NonNull TextView textView, @NonNull TextInputLayout textInputLayout2, @NonNull MaterialAutoCompleteTextView materialAutoCompleteTextView, @NonNull TextInputLayout textInputLayout3, @NonNull MaterialAutoCompleteTextView materialAutoCompleteTextView2, @NonNull ConstraintLayout constraintLayout2, @NonNull ConstraintLayout constraintLayout3, @NonNull ConstraintLayout constraintLayout4, @NonNull TextView textView2, @NonNull TextInputLayout textInputLayout4, @NonNull TextInputLayout textInputLayout5, @NonNull TextInputLayout textInputLayout6, @NonNull TextInputEditText textInputEditText, @NonNull TextInputEditText textInputEditText2, @NonNull TextInputEditText textInputEditText3, @NonNull TextInputEditText textInputEditText4, @NonNull CircularProgressIndicator circularProgressIndicator) {
        this.f23655a = constraintLayout;
        this.f23656b = textInputLayout;
        this.f23657c = textView;
        this.f23658d = textInputLayout2;
        this.f23659e = materialAutoCompleteTextView;
        this.f23660f = textInputLayout3;
        this.f23661g = materialAutoCompleteTextView2;
        this.f23662h = constraintLayout2;
        this.f23663i = constraintLayout3;
        this.f23664j = constraintLayout4;
        this.f23665k = textView2;
        this.f23666l = textInputLayout4;
        this.f23667m = textInputLayout5;
        this.f23668n = textInputLayout6;
        this.f23669o = textInputEditText;
        this.f23670p = textInputEditText2;
        this.f23671q = textInputEditText3;
        this.f23672r = textInputEditText4;
        this.f23673s = circularProgressIndicator;
    }

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C6216d m27352a(@NonNull View view) {
        int i10 = C1149d.f4812b;
        TextInputLayout textInputLayout = (TextInputLayout) C10785b.m41116a(view, i10);
        if (textInputLayout != null) {
            i10 = C1149d.f4814c;
            TextView textView = (TextView) C10785b.m41116a(view, i10);
            if (textView != null) {
                i10 = C1149d.f4816d;
                TextInputLayout textInputLayout2 = (TextInputLayout) C10785b.m41116a(view, i10);
                if (textInputLayout2 != null) {
                    i10 = C1149d.f4818e;
                    MaterialAutoCompleteTextView materialAutoCompleteTextView = (MaterialAutoCompleteTextView) C10785b.m41116a(view, i10);
                    if (materialAutoCompleteTextView != null) {
                        i10 = C1149d.f4820f;
                        TextInputLayout textInputLayout3 = (TextInputLayout) C10785b.m41116a(view, i10);
                        if (textInputLayout3 != null) {
                            i10 = C1149d.f4822g;
                            MaterialAutoCompleteTextView materialAutoCompleteTextView2 = (MaterialAutoCompleteTextView) C10785b.m41116a(view, i10);
                            if (materialAutoCompleteTextView2 != null) {
                                ConstraintLayout constraintLayout = (ConstraintLayout) view;
                                i10 = C1149d.f4824h;
                                ConstraintLayout constraintLayout2 = (ConstraintLayout) C10785b.m41116a(view, i10);
                                if (constraintLayout2 != null) {
                                    i10 = C1149d.f4826i;
                                    ConstraintLayout constraintLayout3 = (ConstraintLayout) C10785b.m41116a(view, i10);
                                    if (constraintLayout3 != null) {
                                        i10 = C1149d.f4828j;
                                        TextView textView2 = (TextView) C10785b.m41116a(view, i10);
                                        if (textView2 != null) {
                                            i10 = C1149d.f4830k;
                                            TextInputLayout textInputLayout4 = (TextInputLayout) C10785b.m41116a(view, i10);
                                            if (textInputLayout4 != null) {
                                                i10 = C1149d.f4832l;
                                                TextInputLayout textInputLayout5 = (TextInputLayout) C10785b.m41116a(view, i10);
                                                if (textInputLayout5 != null) {
                                                    i10 = C1149d.f4834m;
                                                    TextInputLayout textInputLayout6 = (TextInputLayout) C10785b.m41116a(view, i10);
                                                    if (textInputLayout6 != null) {
                                                        i10 = C1149d.f4773C;
                                                        TextInputEditText textInputEditText = (TextInputEditText) C10785b.m41116a(view, i10);
                                                        if (textInputEditText != null) {
                                                            i10 = C1149d.f4775D;
                                                            TextInputEditText textInputEditText2 = (TextInputEditText) C10785b.m41116a(view, i10);
                                                            if (textInputEditText2 != null) {
                                                                i10 = C1149d.f4777E;
                                                                TextInputEditText textInputEditText3 = (TextInputEditText) C10785b.m41116a(view, i10);
                                                                if (textInputEditText3 != null) {
                                                                    i10 = C1149d.f4779F;
                                                                    TextInputEditText textInputEditText4 = (TextInputEditText) C10785b.m41116a(view, i10);
                                                                    if (textInputEditText4 != null) {
                                                                        i10 = C1149d.f4847s0;
                                                                        CircularProgressIndicator circularProgressIndicator = (CircularProgressIndicator) C10785b.m41116a(view, i10);
                                                                        if (circularProgressIndicator != null) {
                                                                            return new C6216d(constraintLayout, textInputLayout, textView, textInputLayout2, materialAutoCompleteTextView, textInputLayout3, materialAutoCompleteTextView2, constraintLayout, constraintLayout2, constraintLayout3, textView2, textInputLayout4, textInputLayout5, textInputLayout6, textInputEditText, textInputEditText2, textInputEditText3, textInputEditText4, circularProgressIndicator);
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
    /* JADX INFO: renamed from: c */
    public static C6216d m27353c(@NonNull LayoutInflater layoutInflater) {
        return m27354d(layoutInflater, null, false);
    }

    @NonNull
    /* JADX INFO: renamed from: d */
    public static C6216d m27354d(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(C1150e.f4866d, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return m27352a(viewInflate);
    }

    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // p402r5.InterfaceC10784a
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f23655a;
    }
}
