package ap;

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
import vo.n3;
import vo.o3;

/* JADX INFO: loaded from: classes3.dex */
public final class c implements s5.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    public final FrameLayout f3195a;

    @NonNull
    public final Space b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final FrameLayout f3196c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final LinearLayout f3197d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f3198e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NonNull
    public final PersonaMaterialButton f3199f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NonNull
    public final ThemeableLottieAnimationView f3200g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f3201h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NonNull
    public final TextView f3202i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NonNull
    public final View f3203j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NonNull
    public final LinearLayout f3204k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NonNull
    public final TextView f3205l;

    public c(@NonNull FrameLayout frameLayout, @NonNull Space space, @NonNull FrameLayout frameLayout2, @NonNull LinearLayout linearLayout, @NonNull ConstraintLayout constraintLayout, @NonNull PersonaMaterialButton personaMaterialButton, @NonNull ThemeableLottieAnimationView themeableLottieAnimationView, @NonNull ConstraintLayout constraintLayout2, @NonNull TextView textView, @NonNull View view, @NonNull LinearLayout linearLayout2, @NonNull TextView textView2) {
        this.f3195a = frameLayout;
        this.b = space;
        this.f3196c = frameLayout2;
        this.f3197d = linearLayout;
        this.f3198e = constraintLayout;
        this.f3199f = personaMaterialButton;
        this.f3200g = themeableLottieAnimationView;
        this.f3201h = constraintLayout2;
        this.f3202i = textView;
        this.f3203j = view;
        this.f3204k = linearLayout2;
        this.f3205l = textView2;
    }

    @NonNull
    public static c a(@NonNull View view) {
        View viewA;
        int i10 = n3.f34863e;
        Space space = (Space) s5.b.a(view, i10);
        if (space != null) {
            i10 = n3.f34865f;
            FrameLayout frameLayout = (FrameLayout) s5.b.a(view, i10);
            if (frameLayout != null) {
                i10 = n3.f34867g;
                LinearLayout linearLayout = (LinearLayout) s5.b.a(view, i10);
                if (linearLayout != null) {
                    i10 = n3.f34893t;
                    ConstraintLayout constraintLayout = (ConstraintLayout) s5.b.a(view, i10);
                    if (constraintLayout != null) {
                        i10 = n3.f34897v;
                        PersonaMaterialButton personaMaterialButton = (PersonaMaterialButton) s5.b.a(view, i10);
                        if (personaMaterialButton != null) {
                            i10 = n3.T;
                            ThemeableLottieAnimationView themeableLottieAnimationView = (ThemeableLottieAnimationView) s5.b.a(view, i10);
                            if (themeableLottieAnimationView != null) {
                                i10 = n3.U;
                                ConstraintLayout constraintLayout2 = (ConstraintLayout) s5.b.a(view, i10);
                                if (constraintLayout2 != null) {
                                    i10 = n3.f34896u0;
                                    TextView textView = (TextView) s5.b.a(view, i10);
                                    if (textView != null && (viewA = s5.b.a(view, (i10 = n3.A0))) != null) {
                                        i10 = n3.K0;
                                        LinearLayout linearLayout2 = (LinearLayout) s5.b.a(view, i10);
                                        if (linearLayout2 != null) {
                                            i10 = n3.L0;
                                            TextView textView2 = (TextView) s5.b.a(view, i10);
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
        View viewInflate = layoutInflater.inflate(o3.f34931c, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @Override // s5.a
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public FrameLayout getRoot() {
        return this.f3195a;
    }
}
