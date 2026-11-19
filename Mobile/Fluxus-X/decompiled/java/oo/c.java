package oo;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.Guideline;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.withpersona.sdk2.inquiry.shared.ui.PersonaMaterialButton;
import com.withpersona.sdk2.inquiry.shared.ui.Pi2NavigationBar;
import no.c3;
import no.d3;

/* JADX INFO: loaded from: classes3.dex */
public final class c implements s5.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    public final CoordinatorLayout f28302a;

    @NonNull
    public final TextView b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final Guideline f28303c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final TextView f28304d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public final Guideline f28305e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NonNull
    public final Pi2NavigationBar f28306f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NonNull
    public final RecyclerView f28307g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NonNull
    public final Guideline f28308h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NonNull
    public final PersonaMaterialButton f28309i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NonNull
    public final TextView f28310j;

    public c(@NonNull CoordinatorLayout coordinatorLayout, @NonNull TextView textView, @NonNull Guideline guideline, @NonNull TextView textView2, @NonNull Guideline guideline2, @NonNull Pi2NavigationBar pi2NavigationBar, @NonNull RecyclerView recyclerView, @NonNull Guideline guideline3, @NonNull PersonaMaterialButton personaMaterialButton, @NonNull TextView textView3) {
        this.f28302a = coordinatorLayout;
        this.b = textView;
        this.f28303c = guideline;
        this.f28304d = textView2;
        this.f28305e = guideline2;
        this.f28306f = pi2NavigationBar;
        this.f28307g = recyclerView;
        this.f28308h = guideline3;
        this.f28309i = personaMaterialButton;
        this.f28310j = textView3;
    }

    @NonNull
    public static c a(@NonNull View view) {
        int i10 = c3.f25942c;
        TextView textView = (TextView) s5.b.a(view, i10);
        if (textView != null) {
            i10 = c3.f25943d;
            Guideline guideline = (Guideline) s5.b.a(view, i10);
            if (guideline != null) {
                i10 = c3.f25948i;
                TextView textView2 = (TextView) s5.b.a(view, i10);
                if (textView2 != null) {
                    i10 = c3.f25949j;
                    Guideline guideline2 = (Guideline) s5.b.a(view, i10);
                    if (guideline2 != null) {
                        i10 = c3.f25954o;
                        Pi2NavigationBar pi2NavigationBar = (Pi2NavigationBar) s5.b.a(view, i10);
                        if (pi2NavigationBar != null) {
                            i10 = c3.f25957r;
                            RecyclerView recyclerView = (RecyclerView) s5.b.a(view, i10);
                            if (recyclerView != null) {
                                i10 = c3.f25958s;
                                Guideline guideline3 = (Guideline) s5.b.a(view, i10);
                                if (guideline3 != null) {
                                    i10 = c3.f25959t;
                                    PersonaMaterialButton personaMaterialButton = (PersonaMaterialButton) s5.b.a(view, i10);
                                    if (personaMaterialButton != null) {
                                        i10 = c3.f25960u;
                                        TextView textView3 = (TextView) s5.b.a(view, i10);
                                        if (textView3 != null) {
                                            return new c((CoordinatorLayout) view, textView, guideline, textView2, guideline2, pi2NavigationBar, recyclerView, guideline3, personaMaterialButton, textView3);
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
    public static c c(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(d3.b, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @Override // s5.a
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public CoordinatorLayout getRoot() {
        return this.f28302a;
    }
}
