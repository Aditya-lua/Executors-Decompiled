package qp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.helper.widget.Flow;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.withpersona.sdk2.inquiry.shared.ui.PersonaMaterialButton;
import pp.o1;
import pp.p1;

/* JADX INFO: loaded from: classes3.dex */
public final class c implements r5.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    public final CoordinatorLayout f30028a;

    @NonNull
    public final FrameLayout b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f30029c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final Flow f30030d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public final TextView f30031e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NonNull
    public final PersonaMaterialButton f30032f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NonNull
    public final PersonaMaterialButton f30033g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NonNull
    public final View f30034h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NonNull
    public final TextView f30035i;

    public c(@NonNull CoordinatorLayout coordinatorLayout, @NonNull FrameLayout frameLayout, @NonNull ConstraintLayout constraintLayout, @NonNull Flow flow, @NonNull TextView textView, @NonNull PersonaMaterialButton personaMaterialButton, @NonNull PersonaMaterialButton personaMaterialButton2, @NonNull View view, @NonNull TextView textView2) {
        this.f30028a = coordinatorLayout;
        this.b = frameLayout;
        this.f30029c = constraintLayout;
        this.f30030d = flow;
        this.f30031e = textView;
        this.f30032f = personaMaterialButton;
        this.f30033g = personaMaterialButton2;
        this.f30034h = view;
        this.f30035i = textView2;
    }

    @NonNull
    public static c a(@NonNull View view) {
        View viewA;
        int i10 = o1.f29022a;
        FrameLayout frameLayout = (FrameLayout) r5.b.a(view, i10);
        if (frameLayout != null) {
            i10 = o1.b;
            ConstraintLayout constraintLayout = (ConstraintLayout) r5.b.a(view, i10);
            if (constraintLayout != null) {
                i10 = o1.f29024d;
                Flow flow = (Flow) r5.b.a(view, i10);
                if (flow != null) {
                    i10 = o1.f29025e;
                    TextView textView = (TextView) r5.b.a(view, i10);
                    if (textView != null) {
                        i10 = o1.f29026f;
                        PersonaMaterialButton personaMaterialButton = (PersonaMaterialButton) r5.b.a(view, i10);
                        if (personaMaterialButton != null) {
                            i10 = o1.f29027g;
                            PersonaMaterialButton personaMaterialButton2 = (PersonaMaterialButton) r5.b.a(view, i10);
                            if (personaMaterialButton2 != null && (viewA = r5.b.a(view, (i10 = o1.f29028h))) != null) {
                                i10 = o1.f29029i;
                                TextView textView2 = (TextView) r5.b.a(view, i10);
                                if (textView2 != null) {
                                    return new c((CoordinatorLayout) view, frameLayout, constraintLayout, flow, textView, personaMaterialButton, personaMaterialButton2, viewA, textView2);
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
        View viewInflate = layoutInflater.inflate(p1.f29033c, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @Override // r5.a
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public CoordinatorLayout getRoot() {
        return this.f30028a;
    }
}
