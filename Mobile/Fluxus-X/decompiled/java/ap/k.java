package ap;

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
import vo.n3;
import vo.o3;

/* JADX INFO: loaded from: classes3.dex */
public final class k implements s5.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    public final CoordinatorLayout f3270a;

    @NonNull
    public final LinearLayout b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final PersonaMaterialButton f3271c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final TextInputLayout f3272d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public final TextView f3273e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NonNull
    public final LinearLayout f3274f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NonNull
    public final TextInputLayout f3275g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NonNull
    public final TextView f3276h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f3277i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NonNull
    public final Pi2NavigationBar f3278j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NonNull
    public final TextView f3279k;

    public k(@NonNull CoordinatorLayout coordinatorLayout, @NonNull LinearLayout linearLayout, @NonNull PersonaMaterialButton personaMaterialButton, @NonNull TextInputLayout textInputLayout, @NonNull TextView textView, @NonNull LinearLayout linearLayout2, @NonNull TextInputLayout textInputLayout2, @NonNull TextView textView2, @NonNull ConstraintLayout constraintLayout, @NonNull Pi2NavigationBar pi2NavigationBar, @NonNull TextView textView3) {
        this.f3270a = coordinatorLayout;
        this.b = linearLayout;
        this.f3271c = personaMaterialButton;
        this.f3272d = textInputLayout;
        this.f3273e = textView;
        this.f3274f = linearLayout2;
        this.f3275g = textInputLayout2;
        this.f3276h = textView2;
        this.f3277i = constraintLayout;
        this.f3278j = pi2NavigationBar;
        this.f3279k = textView3;
    }

    @NonNull
    public static k a(@NonNull View view) {
        int i10 = n3.f34895u;
        LinearLayout linearLayout = (LinearLayout) s5.b.a(view, i10);
        if (linearLayout != null) {
            i10 = n3.f34897v;
            PersonaMaterialButton personaMaterialButton = (PersonaMaterialButton) s5.b.a(view, i10);
            if (personaMaterialButton != null) {
                i10 = n3.f34899w;
                TextInputLayout textInputLayout = (TextInputLayout) s5.b.a(view, i10);
                if (textInputLayout != null) {
                    i10 = n3.f34901x;
                    TextView textView = (TextView) s5.b.a(view, i10);
                    if (textView != null) {
                        i10 = n3.J;
                        LinearLayout linearLayout2 = (LinearLayout) s5.b.a(view, i10);
                        if (linearLayout2 != null) {
                            i10 = n3.P;
                            TextInputLayout textInputLayout2 = (TextInputLayout) s5.b.a(view, i10);
                            if (textInputLayout2 != null) {
                                i10 = n3.Q;
                                TextView textView2 = (TextView) s5.b.a(view, i10);
                                if (textView2 != null) {
                                    i10 = n3.Y;
                                    ConstraintLayout constraintLayout = (ConstraintLayout) s5.b.a(view, i10);
                                    if (constraintLayout != null) {
                                        i10 = n3.f34862d0;
                                        Pi2NavigationBar pi2NavigationBar = (Pi2NavigationBar) s5.b.a(view, i10);
                                        if (pi2NavigationBar != null) {
                                            i10 = n3.L0;
                                            TextView textView3 = (TextView) s5.b.a(view, i10);
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
        View viewInflate = layoutInflater.inflate(o3.f34940l, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @Override // s5.a
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public CoordinatorLayout getRoot() {
        return this.f3270a;
    }
}
