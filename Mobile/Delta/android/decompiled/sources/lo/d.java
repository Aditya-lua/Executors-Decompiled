package lo;

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
import go.n2;
import go.o2;

/* JADX INFO: loaded from: classes3.dex */
public final class d implements r5.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    public final CoordinatorLayout f23803a;

    @NonNull
    public final TextView b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final PersonaMaterialButton f23804c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f23805d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public final ThemeableLottieAnimationView f23806e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NonNull
    public final View f23807f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f23808g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NonNull
    public final CardView f23809h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NonNull
    public final Pi2NavigationBar f23810i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NonNull
    public final TextView f23811j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NonNull
    public final PersonaMaterialButton f23812k;

    public d(@NonNull CoordinatorLayout coordinatorLayout, @NonNull TextView textView, @NonNull PersonaMaterialButton personaMaterialButton, @NonNull ConstraintLayout constraintLayout, @NonNull ThemeableLottieAnimationView themeableLottieAnimationView, @NonNull View view, @NonNull ConstraintLayout constraintLayout2, @NonNull CardView cardView, @NonNull Pi2NavigationBar pi2NavigationBar, @NonNull TextView textView2, @NonNull PersonaMaterialButton personaMaterialButton2) {
        this.f23803a = coordinatorLayout;
        this.b = textView;
        this.f23804c = personaMaterialButton;
        this.f23805d = constraintLayout;
        this.f23806e = themeableLottieAnimationView;
        this.f23807f = view;
        this.f23808g = constraintLayout2;
        this.f23809h = cardView;
        this.f23810i = pi2NavigationBar;
        this.f23811j = textView2;
        this.f23812k = personaMaterialButton2;
    }

    @NonNull
    public static d a(@NonNull View view) {
        View viewA;
        int i10 = n2.f18765d;
        TextView textView = (TextView) r5.b.a(view, i10);
        if (textView != null) {
            i10 = n2.f18777j;
            PersonaMaterialButton personaMaterialButton = (PersonaMaterialButton) r5.b.a(view, i10);
            if (personaMaterialButton != null) {
                i10 = n2.f18795s;
                ConstraintLayout constraintLayout = (ConstraintLayout) r5.b.a(view, i10);
                if (constraintLayout != null) {
                    i10 = n2.R;
                    ThemeableLottieAnimationView themeableLottieAnimationView = (ThemeableLottieAnimationView) r5.b.a(view, i10);
                    if (themeableLottieAnimationView != null && (viewA = r5.b.a(view, (i10 = n2.S))) != null) {
                        i10 = n2.W;
                        ConstraintLayout constraintLayout2 = (ConstraintLayout) r5.b.a(view, i10);
                        if (constraintLayout2 != null) {
                            i10 = n2.f18764c0;
                            CardView cardView = (CardView) r5.b.a(view, i10);
                            if (cardView != null) {
                                i10 = n2.f18766d0;
                                Pi2NavigationBar pi2NavigationBar = (Pi2NavigationBar) r5.b.a(view, i10);
                                if (pi2NavigationBar != null) {
                                    i10 = n2.L0;
                                    TextView textView2 = (TextView) r5.b.a(view, i10);
                                    if (textView2 != null) {
                                        i10 = n2.N0;
                                        PersonaMaterialButton personaMaterialButton2 = (PersonaMaterialButton) r5.b.a(view, i10);
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
        View viewInflate = layoutInflater.inflate(o2.f18815d, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @Override // r5.a
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public CoordinatorLayout getRoot() {
        return this.f23803a;
    }
}
