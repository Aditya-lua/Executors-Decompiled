package no;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.withpersona.sdk2.inquiry.shared.p055ui.PersonaMaterialButton;
import com.withpersona.sdk2.inquiry.shared.p055ui.Pi2NavigationBar;
import com.withpersona.sdk2.inquiry.shared.p055ui.ThemeableLottieAnimationView;
import io.C6895n2;
import io.C6899o2;
import p402r5.C10785b;
import p402r5.InterfaceC10784a;

/* JADX INFO: renamed from: no.d */
/* JADX INFO: loaded from: classes3.dex */
public final class C9528d implements InterfaceC10784a {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final CoordinatorLayout f34365a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final TextView f34366b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final PersonaMaterialButton f34367c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final ConstraintLayout f34368d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final ThemeableLottieAnimationView f34369e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final View f34370f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final ConstraintLayout f34371g;

    /* JADX INFO: renamed from: h */
    @NonNull
    public final CardView f34372h;

    /* JADX INFO: renamed from: i */
    @NonNull
    public final Pi2NavigationBar f34373i;

    /* JADX INFO: renamed from: j */
    @NonNull
    public final TextView f34374j;

    /* JADX INFO: renamed from: k */
    @NonNull
    public final PersonaMaterialButton f34375k;

    public C9528d(@NonNull CoordinatorLayout coordinatorLayout, @NonNull TextView textView, @NonNull PersonaMaterialButton personaMaterialButton, @NonNull ConstraintLayout constraintLayout, @NonNull ThemeableLottieAnimationView themeableLottieAnimationView, @NonNull View view, @NonNull ConstraintLayout constraintLayout2, @NonNull CardView cardView, @NonNull Pi2NavigationBar pi2NavigationBar, @NonNull TextView textView2, @NonNull PersonaMaterialButton personaMaterialButton2) {
        this.f34365a = coordinatorLayout;
        this.f34366b = textView;
        this.f34367c = personaMaterialButton;
        this.f34368d = constraintLayout;
        this.f34369e = themeableLottieAnimationView;
        this.f34370f = view;
        this.f34371g = constraintLayout2;
        this.f34372h = cardView;
        this.f34373i = pi2NavigationBar;
        this.f34374j = textView2;
        this.f34375k = personaMaterialButton2;
    }

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C9528d m37620a(@NonNull View view) {
        View viewM41116a;
        int i10 = C6895n2.f27061d;
        TextView textView = (TextView) C10785b.m41116a(view, i10);
        if (textView != null) {
            i10 = C6895n2.f27073j;
            PersonaMaterialButton personaMaterialButton = (PersonaMaterialButton) C10785b.m41116a(view, i10);
            if (personaMaterialButton != null) {
                i10 = C6895n2.f27091s;
                ConstraintLayout constraintLayout = (ConstraintLayout) C10785b.m41116a(view, i10);
                if (constraintLayout != null) {
                    i10 = C6895n2.f27046R;
                    ThemeableLottieAnimationView themeableLottieAnimationView = (ThemeableLottieAnimationView) C10785b.m41116a(view, i10);
                    if (themeableLottieAnimationView != null && (viewM41116a = C10785b.m41116a(view, (i10 = C6895n2.f27047S))) != null) {
                        i10 = C6895n2.f27051W;
                        ConstraintLayout constraintLayout2 = (ConstraintLayout) C10785b.m41116a(view, i10);
                        if (constraintLayout2 != null) {
                            i10 = C6895n2.f27060c0;
                            CardView cardView = (CardView) C10785b.m41116a(view, i10);
                            if (cardView != null) {
                                i10 = C6895n2.f27062d0;
                                Pi2NavigationBar pi2NavigationBar = (Pi2NavigationBar) C10785b.m41116a(view, i10);
                                if (pi2NavigationBar != null) {
                                    i10 = C6895n2.f27036L0;
                                    TextView textView2 = (TextView) C10785b.m41116a(view, i10);
                                    if (textView2 != null) {
                                        i10 = C6895n2.f27040N0;
                                        PersonaMaterialButton personaMaterialButton2 = (PersonaMaterialButton) C10785b.m41116a(view, i10);
                                        if (personaMaterialButton2 != null) {
                                            return new C9528d((CoordinatorLayout) view, textView, personaMaterialButton, constraintLayout, themeableLottieAnimationView, viewM41116a, constraintLayout2, cardView, pi2NavigationBar, textView2, personaMaterialButton2);
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
    public static C9528d m37621c(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(C6899o2.f27112d, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return m37620a(viewInflate);
    }

    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // p402r5.InterfaceC10784a
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public CoordinatorLayout getRoot() {
        return this.f34365a;
    }
}
