package gq;

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
import fq.a2;
import fq.z1;

/* JADX INFO: loaded from: classes3.dex */
public final class c implements s5.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    public final CoordinatorLayout f17893a;

    @NonNull
    public final FrameLayout b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f17894c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final Flow f17895d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public final TextView f17896e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NonNull
    public final PersonaMaterialButton f17897f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NonNull
    public final PersonaMaterialButton f17898g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NonNull
    public final View f17899h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NonNull
    public final TextView f17900i;

    public c(@NonNull CoordinatorLayout coordinatorLayout, @NonNull FrameLayout frameLayout, @NonNull ConstraintLayout constraintLayout, @NonNull Flow flow, @NonNull TextView textView, @NonNull PersonaMaterialButton personaMaterialButton, @NonNull PersonaMaterialButton personaMaterialButton2, @NonNull View view, @NonNull TextView textView2) {
        this.f17893a = coordinatorLayout;
        this.b = frameLayout;
        this.f17894c = constraintLayout;
        this.f17895d = flow;
        this.f17896e = textView;
        this.f17897f = personaMaterialButton;
        this.f17898g = personaMaterialButton2;
        this.f17899h = view;
        this.f17900i = textView2;
    }

    @NonNull
    public static c a(@NonNull View view) {
        View viewA;
        int i10 = z1.f16561a;
        FrameLayout frameLayout = (FrameLayout) s5.b.a(view, i10);
        if (frameLayout != null) {
            i10 = z1.b;
            ConstraintLayout constraintLayout = (ConstraintLayout) s5.b.a(view, i10);
            if (constraintLayout != null) {
                i10 = z1.f16563d;
                Flow flow = (Flow) s5.b.a(view, i10);
                if (flow != null) {
                    i10 = z1.f16564e;
                    TextView textView = (TextView) s5.b.a(view, i10);
                    if (textView != null) {
                        i10 = z1.f16565f;
                        PersonaMaterialButton personaMaterialButton = (PersonaMaterialButton) s5.b.a(view, i10);
                        if (personaMaterialButton != null) {
                            i10 = z1.f16566g;
                            PersonaMaterialButton personaMaterialButton2 = (PersonaMaterialButton) s5.b.a(view, i10);
                            if (personaMaterialButton2 != null && (viewA = s5.b.a(view, (i10 = z1.f16567h))) != null) {
                                i10 = z1.f16568i;
                                TextView textView2 = (TextView) s5.b.a(view, i10);
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
        View viewInflate = layoutInflater.inflate(a2.f16379c, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @Override // s5.a
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public CoordinatorLayout getRoot() {
        return this.f17893a;
    }
}
