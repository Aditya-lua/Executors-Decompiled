package no;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.withpersona.sdk2.inquiry.shared.p055ui.Pi2NavigationBar;
import io.C6895n2;
import io.C6899o2;
import p402r5.C10785b;
import p402r5.InterfaceC10784a;

/* JADX INFO: renamed from: no.g */
/* JADX INFO: loaded from: classes3.dex */
public final class C9531g implements InterfaceC10784a {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final CoordinatorLayout f34384a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final ConstraintLayout f34385b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final Barrier f34386c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final ConstraintLayout f34387d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final ImageView f34388e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final View f34389f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final Pi2NavigationBar f34390g;

    /* JADX INFO: renamed from: h */
    @NonNull
    public final RecyclerView f34391h;

    /* JADX INFO: renamed from: i */
    @NonNull
    public final TextView f34392i;

    /* JADX INFO: renamed from: j */
    @NonNull
    public final TextView f34393j;

    /* JADX INFO: renamed from: k */
    @NonNull
    public final TextView f34394k;

    /* JADX INFO: renamed from: l */
    @NonNull
    public final TextView f34395l;

    public C9531g(@NonNull CoordinatorLayout coordinatorLayout, @NonNull ConstraintLayout constraintLayout, @NonNull Barrier barrier, @NonNull ConstraintLayout constraintLayout2, @NonNull ImageView imageView, @NonNull View view, @NonNull Pi2NavigationBar pi2NavigationBar, @NonNull RecyclerView recyclerView, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull TextView textView4) {
        this.f34384a = coordinatorLayout;
        this.f34385b = constraintLayout;
        this.f34386c = barrier;
        this.f34387d = constraintLayout2;
        this.f34388e = imageView;
        this.f34389f = view;
        this.f34390g = pi2NavigationBar;
        this.f34391h = recyclerView;
        this.f34392i = textView;
        this.f34393j = textView2;
        this.f34394k = textView3;
        this.f34395l = textView4;
    }

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C9531g m37629a(@NonNull View view) {
        View viewM41116a;
        int i10 = C6895n2.f27093t;
        ConstraintLayout constraintLayout = (ConstraintLayout) C10785b.m41116a(view, i10);
        if (constraintLayout != null) {
            i10 = C6895n2.f27033K;
            Barrier barrier = (Barrier) C10785b.m41116a(view, i10);
            if (barrier != null) {
                i10 = C6895n2.f27035L;
                ConstraintLayout constraintLayout2 = (ConstraintLayout) C10785b.m41116a(view, i10);
                if (constraintLayout2 != null) {
                    i10 = C6895n2.f27052X;
                    ImageView imageView = (ImageView) C10785b.m41116a(view, i10);
                    if (imageView != null && (viewM41116a = C10785b.m41116a(view, (i10 = C6895n2.f27058b0))) != null) {
                        i10 = C6895n2.f27062d0;
                        Pi2NavigationBar pi2NavigationBar = (Pi2NavigationBar) C10785b.m41116a(view, i10);
                        if (pi2NavigationBar != null) {
                            i10 = C6895n2.f27098v0;
                            RecyclerView recyclerView = (RecyclerView) C10785b.m41116a(view, i10);
                            if (recyclerView != null) {
                                i10 = C6895n2.f27026G0;
                                TextView textView = (TextView) C10785b.m41116a(view, i10);
                                if (textView != null) {
                                    i10 = C6895n2.f27028H0;
                                    TextView textView2 = (TextView) C10785b.m41116a(view, i10);
                                    if (textView2 != null) {
                                        i10 = C6895n2.f27030I0;
                                        TextView textView3 = (TextView) C10785b.m41116a(view, i10);
                                        if (textView3 != null) {
                                            i10 = C6895n2.f27032J0;
                                            TextView textView4 = (TextView) C10785b.m41116a(view, i10);
                                            if (textView4 != null) {
                                                return new C9531g((CoordinatorLayout) view, constraintLayout, barrier, constraintLayout2, imageView, viewM41116a, pi2NavigationBar, recyclerView, textView, textView2, textView3, textView4);
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
    public static C9531g m37630c(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(C6899o2.f27115g, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return m37629a(viewInflate);
    }

    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // p402r5.InterfaceC10784a
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public CoordinatorLayout getRoot() {
        return this.f34384a;
    }
}
