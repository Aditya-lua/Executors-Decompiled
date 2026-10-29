package no;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.textfield.TextInputLayout;
import com.withpersona.sdk2.inquiry.shared.ui.PersonaMaterialButton;
import com.withpersona.sdk2.inquiry.shared.ui.Pi2NavigationBar;
import io.n2;
import io.o2;

/* JADX INFO: loaded from: classes3.dex */
public final class k implements r5.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    public final CoordinatorLayout f26578a;

    @NonNull
    public final LinearLayout b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final PersonaMaterialButton f26579c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final TextInputLayout f26580d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public final TextView f26581e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NonNull
    public final LinearLayout f26582f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NonNull
    public final TextInputLayout f26583g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NonNull
    public final TextView f26584h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f26585i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NonNull
    public final Pi2NavigationBar f26586j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NonNull
    public final TextView f26587k;

    public k(@NonNull CoordinatorLayout coordinatorLayout, @NonNull LinearLayout linearLayout, @NonNull PersonaMaterialButton personaMaterialButton, @NonNull TextInputLayout textInputLayout, @NonNull TextView textView, @NonNull LinearLayout linearLayout2, @NonNull TextInputLayout textInputLayout2, @NonNull TextView textView2, @NonNull ConstraintLayout constraintLayout, @NonNull Pi2NavigationBar pi2NavigationBar, @NonNull TextView textView3) {
        this.f26578a = coordinatorLayout;
        this.b = linearLayout;
        this.f26579c = personaMaterialButton;
        this.f26580d = textInputLayout;
        this.f26581e = textView;
        this.f26582f = linearLayout2;
        this.f26583g = textInputLayout2;
        this.f26584h = textView2;
        this.f26585i = constraintLayout;
        this.f26586j = pi2NavigationBar;
        this.f26587k = textView3;
    }

    @NonNull
    public static k a(@NonNull View view) {
        int i10 = n2.f20742u;
        LinearLayout linearLayout = (LinearLayout) r5.b.a(view, i10);
        if (linearLayout != null) {
            i10 = n2.f20744v;
            PersonaMaterialButton personaMaterialButton = (PersonaMaterialButton) r5.b.a(view, i10);
            if (personaMaterialButton != null) {
                i10 = n2.f20746w;
                TextInputLayout textInputLayout = (TextInputLayout) r5.b.a(view, i10);
                if (textInputLayout != null) {
                    i10 = n2.f20748x;
                    TextView textView = (TextView) r5.b.a(view, i10);
                    if (textView != null) {
                        i10 = n2.J;
                        LinearLayout linearLayout2 = (LinearLayout) r5.b.a(view, i10);
                        if (linearLayout2 != null) {
                            i10 = n2.P;
                            TextInputLayout textInputLayout2 = (TextInputLayout) r5.b.a(view, i10);
                            if (textInputLayout2 != null) {
                                i10 = n2.Q;
                                TextView textView2 = (TextView) r5.b.a(view, i10);
                                if (textView2 != null) {
                                    i10 = n2.Y;
                                    ConstraintLayout constraintLayout = (ConstraintLayout) r5.b.a(view, i10);
                                    if (constraintLayout != null) {
                                        i10 = n2.f20709d0;
                                        Pi2NavigationBar pi2NavigationBar = (Pi2NavigationBar) r5.b.a(view, i10);
                                        if (pi2NavigationBar != null) {
                                            i10 = n2.L0;
                                            TextView textView3 = (TextView) r5.b.a(view, i10);
                                            if (textView3 != null) {
                                                return new k((CoordinatorLayout) view, linearLayout, personaMaterialButton, textInputLayout, textView, linearLayout2, textInputLayout2, textView2, constraintLayout, pi2NavigationBar, textView3);
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
    public static k c(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(o2.f20766l, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @Override // r5.a
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public CoordinatorLayout getRoot() {
        return this.f26578a;
    }
}
