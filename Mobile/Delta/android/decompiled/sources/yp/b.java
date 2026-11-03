package yp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import com.withpersona.sdk2.inquiry.selfie.view.Pi2CircleMaskView;
import com.withpersona.sdk2.inquiry.selfie.view.Pi2ProgressArcView;
import com.withpersona.sdk2.inquiry.shared.ui.ThemeableLottieAnimationView;
import wp.r;
import wp.s;

/* JADX INFO: loaded from: classes3.dex */
public final class b implements r5.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    public final View f36947a;

    @NonNull
    public final View b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final Pi2CircleMaskView f36948c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final ThemeableLottieAnimationView f36949d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public final ImageView f36950e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NonNull
    public final View f36951f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NonNull
    public final View f36952g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NonNull
    public final Pi2ProgressArcView f36953h;

    public b(@NonNull View view, @NonNull View view2, @NonNull Pi2CircleMaskView pi2CircleMaskView, @NonNull ThemeableLottieAnimationView themeableLottieAnimationView, @NonNull ImageView imageView, @NonNull View view3, @NonNull View view4, @NonNull Pi2ProgressArcView pi2ProgressArcView) {
        this.f36947a = view;
        this.b = view2;
        this.f36948c = pi2CircleMaskView;
        this.f36949d = themeableLottieAnimationView;
        this.f36950e = imageView;
        this.f36951f = view3;
        this.f36952g = view4;
        this.f36953h = pi2ProgressArcView;
    }

    @NonNull
    public static b a(@NonNull View view) {
        View viewA;
        View viewA2;
        int i10 = r.f34841d;
        View viewA3 = r5.b.a(view, i10);
        if (viewA3 != null) {
            i10 = r.f34853l;
            Pi2CircleMaskView pi2CircleMaskView = (Pi2CircleMaskView) r5.b.a(view, i10);
            if (pi2CircleMaskView != null) {
                i10 = r.f34861t;
                ThemeableLottieAnimationView themeableLottieAnimationView = (ThemeableLottieAnimationView) r5.b.a(view, i10);
                if (themeableLottieAnimationView != null) {
                    i10 = r.f34862u;
                    ImageView imageView = (ImageView) r5.b.a(view, i10);
                    if (imageView != null && (viewA = r5.b.a(view, (i10 = r.f34866y))) != null && (viewA2 = r5.b.a(view, (i10 = r.A))) != null) {
                        i10 = r.M;
                        Pi2ProgressArcView pi2ProgressArcView = (Pi2ProgressArcView) r5.b.a(view, i10);
                        if (pi2ProgressArcView != null) {
                            return new b(view, viewA3, pi2CircleMaskView, themeableLottieAnimationView, imageView, viewA, viewA2, pi2ProgressArcView);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @NonNull
    public static b b(@NonNull LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(s.b, viewGroup);
        return a(viewGroup);
    }

    @Override // r5.a
    @NonNull
    public View getRoot() {
        return this.f36947a;
    }
}
