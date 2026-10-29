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
import com.withpersona.sdk2.inquiry.shared.ui.ButtonWithLoadingIndicator;
import com.withpersona.sdk2.inquiry.shared.ui.PersonaMaterialButton;
import com.withpersona.sdk2.inquiry.shared.ui.Pi2NavigationBar;
import io.n2;
import io.o2;

/* JADX INFO: loaded from: classes3.dex */
public final class j implements r5.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    public final CoordinatorLayout f26567a;

    @NonNull
    public final TextView b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final PersonaMaterialButton f26568c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final Guideline f26569d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public final ImageView f26570e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NonNull
    public final TextView f26571f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NonNull
    public final ImageView f26572g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NonNull
    public final CardView f26573h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NonNull
    public final Pi2NavigationBar f26574i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NonNull
    public final Guideline f26575j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NonNull
    public final TextView f26576k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NonNull
    public final ButtonWithLoadingIndicator f26577l;

    public j(@NonNull CoordinatorLayout coordinatorLayout, @NonNull TextView textView, @NonNull PersonaMaterialButton personaMaterialButton, @NonNull Guideline guideline, @NonNull ImageView imageView, @NonNull TextView textView2, @NonNull ImageView imageView2, @NonNull CardView cardView, @NonNull Pi2NavigationBar pi2NavigationBar, @NonNull Guideline guideline2, @NonNull TextView textView3, @NonNull ButtonWithLoadingIndicator buttonWithLoadingIndicator) {
        this.f26567a = coordinatorLayout;
        this.b = textView;
        this.f26568c = personaMaterialButton;
        this.f26569d = guideline;
        this.f26570e = imageView;
        this.f26571f = textView2;
        this.f26572g = imageView2;
        this.f26573h = cardView;
        this.f26574i = pi2NavigationBar;
        this.f26575j = guideline2;
        this.f26576k = textView3;
        this.f26577l = buttonWithLoadingIndicator;
    }

    @NonNull
    public static j a(@NonNull View view) {
        int i10 = n2.f20708d;
        TextView textView = (TextView) r5.b.a(view, i10);
        if (textView != null) {
            i10 = n2.f20736r;
            PersonaMaterialButton personaMaterialButton = (PersonaMaterialButton) r5.b.a(view, i10);
            if (personaMaterialButton != null) {
                i10 = n2.D;
                Guideline guideline = (Guideline) r5.b.a(view, i10);
                if (guideline != null) {
                    i10 = n2.E;
                    ImageView imageView = (ImageView) r5.b.a(view, i10);
                    if (imageView != null) {
                        i10 = n2.F;
                        TextView textView2 = (TextView) r5.b.a(view, i10);
                        if (textView2 != null) {
                            i10 = n2.V;
                            ImageView imageView2 = (ImageView) r5.b.a(view, i10);
                            if (imageView2 != null) {
                                i10 = n2.W;
                                CardView cardView = (CardView) r5.b.a(view, i10);
                                if (cardView != null) {
                                    i10 = n2.f20709d0;
                                    Pi2NavigationBar pi2NavigationBar = (Pi2NavigationBar) r5.b.a(view, i10);
                                    if (pi2NavigationBar != null) {
                                        i10 = n2.D0;
                                        Guideline guideline2 = (Guideline) r5.b.a(view, i10);
                                        if (guideline2 != null) {
                                            i10 = n2.L0;
                                            TextView textView3 = (TextView) r5.b.a(view, i10);
                                            if (textView3 != null) {
                                                i10 = n2.O0;
                                                ButtonWithLoadingIndicator buttonWithLoadingIndicator = (ButtonWithLoadingIndicator) r5.b.a(view, i10);
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
        View viewInflate = layoutInflater.inflate(o2.f20765k, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @Override // r5.a
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public CoordinatorLayout getRoot() {
        return this.f26567a;
    }
}
