package lo;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.Space;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.withpersona.sdk2.inquiry.shared.ui.PersonaMaterialButton;
import com.withpersona.sdk2.inquiry.shared.ui.ThemeableLottieAnimationView;
import go.n2;
import go.o2;

/* JADX INFO: loaded from: classes3.dex */
public final class c implements r5.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    public final FrameLayout f23792a;

    @NonNull
    public final Space b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final FrameLayout f23793c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final LinearLayout f23794d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f23795e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NonNull
    public final PersonaMaterialButton f23796f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NonNull
    public final ThemeableLottieAnimationView f23797g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f23798h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NonNull
    public final TextView f23799i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NonNull
    public final View f23800j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NonNull
    public final LinearLayout f23801k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NonNull
    public final TextView f23802l;

    public c(@NonNull FrameLayout frameLayout, @NonNull Space space, @NonNull FrameLayout frameLayout2, @NonNull LinearLayout linearLayout, @NonNull ConstraintLayout constraintLayout, @NonNull PersonaMaterialButton personaMaterialButton, @NonNull ThemeableLottieAnimationView themeableLottieAnimationView, @NonNull ConstraintLayout constraintLayout2, @NonNull TextView textView, @NonNull View view, @NonNull LinearLayout linearLayout2, @NonNull TextView textView2) {
        this.f23792a = frameLayout;
        this.b = space;
        this.f23793c = frameLayout2;
        this.f23794d = linearLayout;
        this.f23795e = constraintLayout;
        this.f23796f = personaMaterialButton;
        this.f23797g = themeableLottieAnimationView;
        this.f23798h = constraintLayout2;
        this.f23799i = textView;
        this.f23800j = view;
        this.f23801k = linearLayout2;
        this.f23802l = textView2;
    }

    @NonNull
    public static c a(@NonNull View view) {
        View viewA;
        int i10 = n2.f18767e;
        Space space = (Space) r5.b.a(view, i10);
        if (space != null) {
            i10 = n2.f18769f;
            FrameLayout frameLayout = (FrameLayout) r5.b.a(view, i10);
            if (frameLayout != null) {
                i10 = n2.f18771g;
                LinearLayout linearLayout = (LinearLayout) r5.b.a(view, i10);
                if (linearLayout != null) {
                    i10 = n2.f18797t;
                    ConstraintLayout constraintLayout = (ConstraintLayout) r5.b.a(view, i10);
                    if (constraintLayout != null) {
                        i10 = n2.f18801v;
                        PersonaMaterialButton personaMaterialButton = (PersonaMaterialButton) r5.b.a(view, i10);
                        if (personaMaterialButton != null) {
                            i10 = n2.T;
                            ThemeableLottieAnimationView themeableLottieAnimationView = (ThemeableLottieAnimationView) r5.b.a(view, i10);
                            if (themeableLottieAnimationView != null) {
                                i10 = n2.U;
                                ConstraintLayout constraintLayout2 = (ConstraintLayout) r5.b.a(view, i10);
                                if (constraintLayout2 != null) {
                                    i10 = n2.f18800u0;
                                    TextView textView = (TextView) r5.b.a(view, i10);
                                    if (textView != null && (viewA = r5.b.a(view, (i10 = n2.A0))) != null) {
                                        i10 = n2.K0;
                                        LinearLayout linearLayout2 = (LinearLayout) r5.b.a(view, i10);
                                        if (linearLayout2 != null) {
                                            i10 = n2.L0;
                                            TextView textView2 = (TextView) r5.b.a(view, i10);
                                            if (textView2 != null) {
                                                return new c((FrameLayout) view, space, frameLayout, linearLayout, constraintLayout, personaMaterialButton, themeableLottieAnimationView, constraintLayout2, textView, viewA, linearLayout2, textView2);
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
    public static c c(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(o2.f18814c, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @Override // r5.a
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public FrameLayout getRoot() {
        return this.f23792a;
    }
}
