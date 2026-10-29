package aq;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import com.withpersona.sdk2.inquiry.selfie.view.Pi2CircleMaskView;
import com.withpersona.sdk2.inquiry.selfie.view.Pi2ProgressArcView;
import com.withpersona.sdk2.inquiry.shared.ui.ThemeableLottieAnimationView;
import yp.r;
import yp.s;

/* JADX INFO: loaded from: classes3.dex */
public final class b implements r5.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    public final View f3588a;

    @NonNull
    public final View b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final Pi2CircleMaskView f3589c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final ThemeableLottieAnimationView f3590d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public final ImageView f3591e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NonNull
    public final View f3592f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NonNull
    public final View f3593g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NonNull
    public final Pi2ProgressArcView f3594h;

    public b(@NonNull View view, @NonNull View view2, @NonNull Pi2CircleMaskView pi2CircleMaskView, @NonNull ThemeableLottieAnimationView themeableLottieAnimationView, @NonNull ImageView imageView, @NonNull View view3, @NonNull View view4, @NonNull Pi2ProgressArcView pi2ProgressArcView) {
        this.f3588a = view;
        this.b = view2;
        this.f3589c = pi2CircleMaskView;
        this.f3590d = themeableLottieAnimationView;
        this.f3591e = imageView;
        this.f3592f = view3;
        this.f3593g = view4;
        this.f3594h = pi2ProgressArcView;
    }

    @NonNull
    public static b a(@NonNull View view) {
        View viewA;
        View viewA2;
        int i10 = r.f36212d;
        View viewA3 = r5.b.a(view, i10);
        if (viewA3 != null) {
            i10 = r.f36224l;
            Pi2CircleMaskView pi2CircleMaskView = (Pi2CircleMaskView) r5.b.a(view, i10);
            if (pi2CircleMaskView != null) {
                i10 = r.f36232t;
                ThemeableLottieAnimationView themeableLottieAnimationView = (ThemeableLottieAnimationView) r5.b.a(view, i10);
                if (themeableLottieAnimationView != null) {
                    i10 = r.f36233u;
                    ImageView imageView = (ImageView) r5.b.a(view, i10);
                    if (imageView != null && (viewA = r5.b.a(view, (i10 = r.f36237y))) != null && (viewA2 = r5.b.a(view, (i10 = r.A))) != null) {
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
        return this.f3588a;
    }
}
