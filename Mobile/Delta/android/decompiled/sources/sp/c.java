package sp;

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
import rp.o1;
import rp.p1;

/* JADX INFO: loaded from: classes3.dex */
public final class c implements r5.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    public final CoordinatorLayout f31281a;

    @NonNull
    public final FrameLayout b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f31282c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final Flow f31283d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public final TextView f31284e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NonNull
    public final PersonaMaterialButton f31285f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NonNull
    public final PersonaMaterialButton f31286g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NonNull
    public final View f31287h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NonNull
    public final TextView f31288i;

    public c(@NonNull CoordinatorLayout coordinatorLayout, @NonNull FrameLayout frameLayout, @NonNull ConstraintLayout constraintLayout, @NonNull Flow flow, @NonNull TextView textView, @NonNull PersonaMaterialButton personaMaterialButton, @NonNull PersonaMaterialButton personaMaterialButton2, @NonNull View view, @NonNull TextView textView2) {
        this.f31281a = coordinatorLayout;
        this.b = frameLayout;
        this.f31282c = constraintLayout;
        this.f31283d = flow;
        this.f31284e = textView;
        this.f31285f = personaMaterialButton;
        this.f31286g = personaMaterialButton2;
        this.f31287h = view;
        this.f31288i = textView2;
    }

    @NonNull
    public static c a(@NonNull View view) {
        View viewA;
        int i10 = o1.f30162a;
        FrameLayout frameLayout = (FrameLayout) r5.b.a(view, i10);
        if (frameLayout != null) {
            i10 = o1.b;
            ConstraintLayout constraintLayout = (ConstraintLayout) r5.b.a(view, i10);
            if (constraintLayout != null) {
                i10 = o1.f30164d;
                Flow flow = (Flow) r5.b.a(view, i10);
                if (flow != null) {
                    i10 = o1.f30165e;
                    TextView textView = (TextView) r5.b.a(view, i10);
                    if (textView != null) {
                        i10 = o1.f30166f;
                        PersonaMaterialButton personaMaterialButton = (PersonaMaterialButton) r5.b.a(view, i10);
                        if (personaMaterialButton != null) {
                            i10 = o1.f30167g;
                            PersonaMaterialButton personaMaterialButton2 = (PersonaMaterialButton) r5.b.a(view, i10);
                            if (personaMaterialButton2 != null && (viewA = r5.b.a(view, (i10 = o1.f30168h))) != null) {
                                i10 = o1.f30169i;
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
        View viewInflate = layoutInflater.inflate(p1.f30173c, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @Override // r5.a
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public CoordinatorLayout getRoot() {
        return this.f31281a;
    }
}
