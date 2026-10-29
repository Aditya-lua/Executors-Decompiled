package no;

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
import io.n2;
import io.o2;

/* JADX INFO: loaded from: classes3.dex */
public final class d implements r5.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    public final CoordinatorLayout f26514a;

    @NonNull
    public final TextView b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final PersonaMaterialButton f26515c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f26516d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public final ThemeableLottieAnimationView f26517e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NonNull
    public final View f26518f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f26519g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NonNull
    public final CardView f26520h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NonNull
    public final Pi2NavigationBar f26521i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NonNull
    public final TextView f26522j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NonNull
    public final PersonaMaterialButton f26523k;

    public d(@NonNull CoordinatorLayout coordinatorLayout, @NonNull TextView textView, @NonNull PersonaMaterialButton personaMaterialButton, @NonNull ConstraintLayout constraintLayout, @NonNull ThemeableLottieAnimationView themeableLottieAnimationView, @NonNull View view, @NonNull ConstraintLayout constraintLayout2, @NonNull CardView cardView, @NonNull Pi2NavigationBar pi2NavigationBar, @NonNull TextView textView2, @NonNull PersonaMaterialButton personaMaterialButton2) {
        this.f26514a = coordinatorLayout;
        this.b = textView;
        this.f26515c = personaMaterialButton;
        this.f26516d = constraintLayout;
        this.f26517e = themeableLottieAnimationView;
        this.f26518f = view;
        this.f26519g = constraintLayout2;
        this.f26520h = cardView;
        this.f26521i = pi2NavigationBar;
        this.f26522j = textView2;
        this.f26523k = personaMaterialButton2;
    }

    @NonNull
    public static d a(@NonNull View view) {
        View viewA;
        int i10 = n2.f20708d;
        TextView textView = (TextView) r5.b.a(view, i10);
        if (textView != null) {
            i10 = n2.f20720j;
            PersonaMaterialButton personaMaterialButton = (PersonaMaterialButton) r5.b.a(view, i10);
            if (personaMaterialButton != null) {
                i10 = n2.f20738s;
                ConstraintLayout constraintLayout = (ConstraintLayout) r5.b.a(view, i10);
                if (constraintLayout != null) {
                    i10 = n2.R;
                    ThemeableLottieAnimationView themeableLottieAnimationView = (ThemeableLottieAnimationView) r5.b.a(view, i10);
                    if (themeableLottieAnimationView != null && (viewA = r5.b.a(view, (i10 = n2.S))) != null) {
                        i10 = n2.W;
                        ConstraintLayout constraintLayout2 = (ConstraintLayout) r5.b.a(view, i10);
                        if (constraintLayout2 != null) {
                            i10 = n2.f20707c0;
                            CardView cardView = (CardView) r5.b.a(view, i10);
                            if (cardView != null) {
                                i10 = n2.f20709d0;
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
        View viewInflate = layoutInflater.inflate(o2.f20758d, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @Override // r5.a
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public CoordinatorLayout getRoot() {
        return this.f26514a;
    }
}
