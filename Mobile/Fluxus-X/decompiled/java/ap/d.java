package ap;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.withpersona.sdk2.inquiry.shared.ui.PersonaMaterialButton;
import com.withpersona.sdk2.inquiry.shared.ui.Pi2NavigationBar;
import com.withpersona.sdk2.inquiry.shared.ui.ThemeableLottieAnimationView;
import vo.n3;
import vo.o3;

/* JADX INFO: loaded from: classes3.dex */
public final class d implements s5.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    public final CoordinatorLayout f3206a;

    @NonNull
    public final TextView b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final PersonaMaterialButton f3207c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f3208d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public final ThemeableLottieAnimationView f3209e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NonNull
    public final View f3210f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f3211g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NonNull
    public final CardView f3212h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NonNull
    public final Pi2NavigationBar f3213i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NonNull
    public final TextView f3214j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NonNull
    public final PersonaMaterialButton f3215k;

    public d(@NonNull CoordinatorLayout coordinatorLayout, @NonNull TextView textView, @NonNull PersonaMaterialButton personaMaterialButton, @NonNull ConstraintLayout constraintLayout, @NonNull ThemeableLottieAnimationView themeableLottieAnimationView, @NonNull View view, @NonNull ConstraintLayout constraintLayout2, @NonNull CardView cardView, @NonNull Pi2NavigationBar pi2NavigationBar, @NonNull TextView textView2, @NonNull PersonaMaterialButton personaMaterialButton2) {
        this.f3206a = coordinatorLayout;
        this.b = textView;
        this.f3207c = personaMaterialButton;
        this.f3208d = constraintLayout;
        this.f3209e = themeableLottieAnimationView;
        this.f3210f = view;
        this.f3211g = constraintLayout2;
        this.f3212h = cardView;
        this.f3213i = pi2NavigationBar;
        this.f3214j = textView2;
        this.f3215k = personaMaterialButton2;
    }

    @NonNull
    public static d a(@NonNull View view) {
        View viewA;
        int i10 = n3.f34861d;
        TextView textView = (TextView) s5.b.a(view, i10);
        if (textView != null) {
            i10 = n3.f34873j;
            PersonaMaterialButton personaMaterialButton = (PersonaMaterialButton) s5.b.a(view, i10);
            if (personaMaterialButton != null) {
                i10 = n3.f34891s;
                ConstraintLayout constraintLayout = (ConstraintLayout) s5.b.a(view, i10);
                if (constraintLayout != null) {
                    i10 = n3.R;
                    ThemeableLottieAnimationView themeableLottieAnimationView = (ThemeableLottieAnimationView) s5.b.a(view, i10);
                    if (themeableLottieAnimationView != null && (viewA = s5.b.a(view, (i10 = n3.S))) != null) {
                        i10 = n3.W;
                        ConstraintLayout constraintLayout2 = (ConstraintLayout) s5.b.a(view, i10);
                        if (constraintLayout2 != null) {
                            i10 = n3.f34860c0;
                            CardView cardView = (CardView) s5.b.a(view, i10);
                            if (cardView != null) {
                                i10 = n3.f34862d0;
                                Pi2NavigationBar pi2NavigationBar = (Pi2NavigationBar) s5.b.a(view, i10);
                                if (pi2NavigationBar != null) {
                                    i10 = n3.L0;
                                    TextView textView2 = (TextView) s5.b.a(view, i10);
                                    if (textView2 != null) {
                                        i10 = n3.N0;
                                        PersonaMaterialButton personaMaterialButton2 = (PersonaMaterialButton) s5.b.a(view, i10);
                                        if (personaMaterialButton2 != null) {
                                            return new d((CoordinatorLayout) view, textView, personaMaterialButton, constraintLayout, themeableLottieAnimationView, viewA, constraintLayout2, cardView, pi2NavigationBar, textView2, personaMaterialButton2);
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
    public static d c(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(o3.f34932d, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @Override // s5.a
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public CoordinatorLayout getRoot() {
        return this.f3206a;
    }
}
