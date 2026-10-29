package no;

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
import io.n2;
import io.o2;

/* JADX INFO: loaded from: classes3.dex */
public final class c implements r5.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    public final FrameLayout f26503a;

    @NonNull
    public final Space b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final FrameLayout f26504c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final LinearLayout f26505d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f26506e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NonNull
    public final PersonaMaterialButton f26507f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NonNull
    public final ThemeableLottieAnimationView f26508g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f26509h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NonNull
    public final TextView f26510i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NonNull
    public final View f26511j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NonNull
    public final LinearLayout f26512k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NonNull
    public final TextView f26513l;

    public c(@NonNull FrameLayout frameLayout, @NonNull Space space, @NonNull FrameLayout frameLayout2, @NonNull LinearLayout linearLayout, @NonNull ConstraintLayout constraintLayout, @NonNull PersonaMaterialButton personaMaterialButton, @NonNull ThemeableLottieAnimationView themeableLottieAnimationView, @NonNull ConstraintLayout constraintLayout2, @NonNull TextView textView, @NonNull View view, @NonNull LinearLayout linearLayout2, @NonNull TextView textView2) {
        this.f26503a = frameLayout;
        this.b = space;
        this.f26504c = frameLayout2;
        this.f26505d = linearLayout;
        this.f26506e = constraintLayout;
        this.f26507f = personaMaterialButton;
        this.f26508g = themeableLottieAnimationView;
        this.f26509h = constraintLayout2;
        this.f26510i = textView;
        this.f26511j = view;
        this.f26512k = linearLayout2;
        this.f26513l = textView2;
    }

    @NonNull
    public static c a(@NonNull View view) {
        View viewA;
        int i10 = n2.f20710e;
        Space space = (Space) r5.b.a(view, i10);
        if (space != null) {
            i10 = n2.f20712f;
            FrameLayout frameLayout = (FrameLayout) r5.b.a(view, i10);
            if (frameLayout != null) {
                i10 = n2.f20714g;
                LinearLayout linearLayout = (LinearLayout) r5.b.a(view, i10);
                if (linearLayout != null) {
                    i10 = n2.f20740t;
                    ConstraintLayout constraintLayout = (ConstraintLayout) r5.b.a(view, i10);
                    if (constraintLayout != null) {
                        i10 = n2.f20744v;
                        PersonaMaterialButton personaMaterialButton = (PersonaMaterialButton) r5.b.a(view, i10);
                        if (personaMaterialButton != null) {
                            i10 = n2.T;
                            ThemeableLottieAnimationView themeableLottieAnimationView = (ThemeableLottieAnimationView) r5.b.a(view, i10);
                            if (themeableLottieAnimationView != null) {
                                i10 = n2.U;
                                ConstraintLayout constraintLayout2 = (ConstraintLayout) r5.b.a(view, i10);
                                if (constraintLayout2 != null) {
                                    i10 = n2.f20743u0;
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
        View viewInflate = layoutInflater.inflate(o2.f20757c, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @Override // r5.a
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public FrameLayout getRoot() {
        return this.f26503a;
    }
}
