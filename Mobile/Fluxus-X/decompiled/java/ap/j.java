package ap;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.Guideline;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.withpersona.sdk2.inquiry.shared.ui.ButtonWithLoadingIndicator;
import com.withpersona.sdk2.inquiry.shared.ui.PersonaMaterialButton;
import com.withpersona.sdk2.inquiry.shared.ui.Pi2NavigationBar;
import vo.n3;
import vo.o3;

/* JADX INFO: loaded from: classes3.dex */
public final class j implements s5.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    public final CoordinatorLayout f3259a;

    @NonNull
    public final TextView b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final PersonaMaterialButton f3260c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final Guideline f3261d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public final ImageView f3262e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NonNull
    public final TextView f3263f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NonNull
    public final ImageView f3264g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NonNull
    public final CardView f3265h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NonNull
    public final Pi2NavigationBar f3266i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NonNull
    public final Guideline f3267j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NonNull
    public final TextView f3268k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NonNull
    public final ButtonWithLoadingIndicator f3269l;

    public j(@NonNull CoordinatorLayout coordinatorLayout, @NonNull TextView textView, @NonNull PersonaMaterialButton personaMaterialButton, @NonNull Guideline guideline, @NonNull ImageView imageView, @NonNull TextView textView2, @NonNull ImageView imageView2, @NonNull CardView cardView, @NonNull Pi2NavigationBar pi2NavigationBar, @NonNull Guideline guideline2, @NonNull TextView textView3, @NonNull ButtonWithLoadingIndicator buttonWithLoadingIndicator) {
        this.f3259a = coordinatorLayout;
        this.b = textView;
        this.f3260c = personaMaterialButton;
        this.f3261d = guideline;
        this.f3262e = imageView;
        this.f3263f = textView2;
        this.f3264g = imageView2;
        this.f3265h = cardView;
        this.f3266i = pi2NavigationBar;
        this.f3267j = guideline2;
        this.f3268k = textView3;
        this.f3269l = buttonWithLoadingIndicator;
    }

    @NonNull
    public static j a(@NonNull View view) {
        int i10 = n3.f34861d;
        TextView textView = (TextView) s5.b.a(view, i10);
        if (textView != null) {
            i10 = n3.f34889r;
            PersonaMaterialButton personaMaterialButton = (PersonaMaterialButton) s5.b.a(view, i10);
            if (personaMaterialButton != null) {
                i10 = n3.D;
                Guideline guideline = (Guideline) s5.b.a(view, i10);
                if (guideline != null) {
                    i10 = n3.E;
                    ImageView imageView = (ImageView) s5.b.a(view, i10);
                    if (imageView != null) {
                        i10 = n3.F;
                        TextView textView2 = (TextView) s5.b.a(view, i10);
                        if (textView2 != null) {
                            i10 = n3.V;
                            ImageView imageView2 = (ImageView) s5.b.a(view, i10);
                            if (imageView2 != null) {
                                i10 = n3.W;
                                CardView cardView = (CardView) s5.b.a(view, i10);
                                if (cardView != null) {
                                    i10 = n3.f34862d0;
                                    Pi2NavigationBar pi2NavigationBar = (Pi2NavigationBar) s5.b.a(view, i10);
                                    if (pi2NavigationBar != null) {
                                        i10 = n3.D0;
                                        Guideline guideline2 = (Guideline) s5.b.a(view, i10);
                                        if (guideline2 != null) {
                                            i10 = n3.L0;
                                            TextView textView3 = (TextView) s5.b.a(view, i10);
                                            if (textView3 != null) {
                                                i10 = n3.O0;
                                                ButtonWithLoadingIndicator buttonWithLoadingIndicator = (ButtonWithLoadingIndicator) s5.b.a(view, i10);
                                                if (buttonWithLoadingIndicator != null) {
                                                    return new j((CoordinatorLayout) view, textView, personaMaterialButton, guideline, imageView, textView2, imageView2, cardView, pi2NavigationBar, guideline2, textView3, buttonWithLoadingIndicator);
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
    public static j c(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(o3.f34939k, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @Override // s5.a
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public CoordinatorLayout getRoot() {
        return this.f3259a;
    }
}
