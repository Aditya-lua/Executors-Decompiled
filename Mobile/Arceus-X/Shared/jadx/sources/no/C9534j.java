package no;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.Guideline;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.withpersona.sdk2.inquiry.shared.p055ui.ButtonWithLoadingIndicator;
import com.withpersona.sdk2.inquiry.shared.p055ui.PersonaMaterialButton;
import com.withpersona.sdk2.inquiry.shared.p055ui.Pi2NavigationBar;
import io.C6895n2;
import io.C6899o2;
import p402r5.C10785b;
import p402r5.InterfaceC10784a;

/* JADX INFO: renamed from: no.j */
/* JADX INFO: loaded from: classes3.dex */
public final class C9534j implements InterfaceC10784a {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final CoordinatorLayout f34423a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final TextView f34424b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final PersonaMaterialButton f34425c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final Guideline f34426d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final ImageView f34427e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final TextView f34428f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final ImageView f34429g;

    /* JADX INFO: renamed from: h */
    @NonNull
    public final CardView f34430h;

    /* JADX INFO: renamed from: i */
    @NonNull
    public final Pi2NavigationBar f34431i;

    /* JADX INFO: renamed from: j */
    @NonNull
    public final Guideline f34432j;

    /* JADX INFO: renamed from: k */
    @NonNull
    public final TextView f34433k;

    /* JADX INFO: renamed from: l */
    @NonNull
    public final ButtonWithLoadingIndicator f34434l;

    public C9534j(@NonNull CoordinatorLayout coordinatorLayout, @NonNull TextView textView, @NonNull PersonaMaterialButton personaMaterialButton, @NonNull Guideline guideline, @NonNull ImageView imageView, @NonNull TextView textView2, @NonNull ImageView imageView2, @NonNull CardView cardView, @NonNull Pi2NavigationBar pi2NavigationBar, @NonNull Guideline guideline2, @NonNull TextView textView3, @NonNull ButtonWithLoadingIndicator buttonWithLoadingIndicator) {
        this.f34423a = coordinatorLayout;
        this.f34424b = textView;
        this.f34425c = personaMaterialButton;
        this.f34426d = guideline;
        this.f34427e = imageView;
        this.f34428f = textView2;
        this.f34429g = imageView2;
        this.f34430h = cardView;
        this.f34431i = pi2NavigationBar;
        this.f34432j = guideline2;
        this.f34433k = textView3;
        this.f34434l = buttonWithLoadingIndicator;
    }

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C9534j m37638a(@NonNull View view) {
        int i10 = C6895n2.f27061d;
        TextView textView = (TextView) C10785b.m41116a(view, i10);
        if (textView != null) {
            i10 = C6895n2.f27089r;
            PersonaMaterialButton personaMaterialButton = (PersonaMaterialButton) C10785b.m41116a(view, i10);
            if (personaMaterialButton != null) {
                i10 = C6895n2.f27019D;
                Guideline guideline = (Guideline) C10785b.m41116a(view, i10);
                if (guideline != null) {
                    i10 = C6895n2.f27021E;
                    ImageView imageView = (ImageView) C10785b.m41116a(view, i10);
                    if (imageView != null) {
                        i10 = C6895n2.f27023F;
                        TextView textView2 = (TextView) C10785b.m41116a(view, i10);
                        if (textView2 != null) {
                            i10 = C6895n2.f27050V;
                            ImageView imageView2 = (ImageView) C10785b.m41116a(view, i10);
                            if (imageView2 != null) {
                                i10 = C6895n2.f27051W;
                                CardView cardView = (CardView) C10785b.m41116a(view, i10);
                                if (cardView != null) {
                                    i10 = C6895n2.f27062d0;
                                    Pi2NavigationBar pi2NavigationBar = (Pi2NavigationBar) C10785b.m41116a(view, i10);
                                    if (pi2NavigationBar != null) {
                                        i10 = C6895n2.f27020D0;
                                        Guideline guideline2 = (Guideline) C10785b.m41116a(view, i10);
                                        if (guideline2 != null) {
                                            i10 = C6895n2.f27036L0;
                                            TextView textView3 = (TextView) C10785b.m41116a(view, i10);
                                            if (textView3 != null) {
                                                i10 = C6895n2.f27042O0;
                                                ButtonWithLoadingIndicator buttonWithLoadingIndicator = (ButtonWithLoadingIndicator) C10785b.m41116a(view, i10);
                                                if (buttonWithLoadingIndicator != null) {
                                                    return new C9534j((CoordinatorLayout) view, textView, personaMaterialButton, guideline, imageView, textView2, imageView2, cardView, pi2NavigationBar, guideline2, textView3, buttonWithLoadingIndicator);
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
    public static C9534j m37639c(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(C6899o2.f27119k, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return m37638a(viewInflate);
    }

    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // p402r5.InterfaceC10784a
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public CoordinatorLayout getRoot() {
        return this.f34423a;
    }
}
