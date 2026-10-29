package ao;

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
import zn.n2;
import zn.o2;

/* JADX INFO: loaded from: classes3.dex */
public final class c implements r5.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    public final CoordinatorLayout f3551a;

    @NonNull
    public final TextView b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final Guideline f3552c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final TextView f3553d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public final Guideline f3554e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NonNull
    public final Pi2NavigationBar f3555f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NonNull
    public final RecyclerView f3556g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NonNull
    public final Guideline f3557h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NonNull
    public final PersonaMaterialButton f3558i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NonNull
    public final TextView f3559j;

    public c(@NonNull CoordinatorLayout coordinatorLayout, @NonNull TextView textView, @NonNull Guideline guideline, @NonNull TextView textView2, @NonNull Guideline guideline2, @NonNull Pi2NavigationBar pi2NavigationBar, @NonNull RecyclerView recyclerView, @NonNull Guideline guideline3, @NonNull PersonaMaterialButton personaMaterialButton, @NonNull TextView textView3) {
        this.f3551a = coordinatorLayout;
        this.b = textView;
        this.f3552c = guideline;
        this.f3553d = textView2;
        this.f3554e = guideline2;
        this.f3555f = pi2NavigationBar;
        this.f3556g = recyclerView;
        this.f3557h = guideline3;
        this.f3558i = personaMaterialButton;
        this.f3559j = textView3;
    }

    @NonNull
    public static c a(@NonNull View view) {
        int i10 = n2.f37773c;
        TextView textView = (TextView) r5.b.a(view, i10);
        if (textView != null) {
            i10 = n2.f37774d;
            Guideline guideline = (Guideline) r5.b.a(view, i10);
            if (guideline != null) {
                i10 = n2.f37779i;
                TextView textView2 = (TextView) r5.b.a(view, i10);
                if (textView2 != null) {
                    i10 = n2.f37780j;
                    Guideline guideline2 = (Guideline) r5.b.a(view, i10);
                    if (guideline2 != null) {
                        i10 = n2.f37785o;
                        Pi2NavigationBar pi2NavigationBar = (Pi2NavigationBar) r5.b.a(view, i10);
                        if (pi2NavigationBar != null) {
                            i10 = n2.f37788r;
                            RecyclerView recyclerView = (RecyclerView) r5.b.a(view, i10);
                            if (recyclerView != null) {
                                i10 = n2.f37789s;
                                Guideline guideline3 = (Guideline) r5.b.a(view, i10);
                                if (guideline3 != null) {
                                    i10 = n2.f37790t;
                                    PersonaMaterialButton personaMaterialButton = (PersonaMaterialButton) r5.b.a(view, i10);
                                    if (personaMaterialButton != null) {
                                        i10 = n2.f37791u;
                                        TextView textView3 = (TextView) r5.b.a(view, i10);
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
        View viewInflate = layoutInflater.inflate(o2.b, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @Override // r5.a
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public CoordinatorLayout getRoot() {
        return this.f3551a;
    }
}
