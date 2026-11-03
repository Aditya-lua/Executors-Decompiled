package lo;

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
import go.n2;
import go.o2;

/* JADX INFO: loaded from: classes3.dex */
public final class k implements r5.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    public final CoordinatorLayout f23867a;

    @NonNull
    public final LinearLayout b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final PersonaMaterialButton f23868c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final TextInputLayout f23869d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public final TextView f23870e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NonNull
    public final LinearLayout f23871f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NonNull
    public final TextInputLayout f23872g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NonNull
    public final TextView f23873h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f23874i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NonNull
    public final Pi2NavigationBar f23875j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NonNull
    public final TextView f23876k;

    public k(@NonNull CoordinatorLayout coordinatorLayout, @NonNull LinearLayout linearLayout, @NonNull PersonaMaterialButton personaMaterialButton, @NonNull TextInputLayout textInputLayout, @NonNull TextView textView, @NonNull LinearLayout linearLayout2, @NonNull TextInputLayout textInputLayout2, @NonNull TextView textView2, @NonNull ConstraintLayout constraintLayout, @NonNull Pi2NavigationBar pi2NavigationBar, @NonNull TextView textView3) {
        this.f23867a = coordinatorLayout;
        this.b = linearLayout;
        this.f23868c = personaMaterialButton;
        this.f23869d = textInputLayout;
        this.f23870e = textView;
        this.f23871f = linearLayout2;
        this.f23872g = textInputLayout2;
        this.f23873h = textView2;
        this.f23874i = constraintLayout;
        this.f23875j = pi2NavigationBar;
        this.f23876k = textView3;
    }

    @NonNull
    public static k a(@NonNull View view) {
        int i10 = n2.f18799u;
        LinearLayout linearLayout = (LinearLayout) r5.b.a(view, i10);
        if (linearLayout != null) {
            i10 = n2.f18801v;
            PersonaMaterialButton personaMaterialButton = (PersonaMaterialButton) r5.b.a(view, i10);
            if (personaMaterialButton != null) {
                i10 = n2.f18803w;
                TextInputLayout textInputLayout = (TextInputLayout) r5.b.a(view, i10);
                if (textInputLayout != null) {
                    i10 = n2.f18805x;
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
                                        i10 = n2.f18766d0;
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
        View viewInflate = layoutInflater.inflate(o2.f18823l, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @Override // r5.a
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public CoordinatorLayout getRoot() {
        return this.f23867a;
    }
}
