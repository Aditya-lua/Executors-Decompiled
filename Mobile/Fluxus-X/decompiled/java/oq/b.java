package oq;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import com.withpersona.sdk2.inquiry.selfie.view.Pi2CircleMaskView;
import com.withpersona.sdk2.inquiry.selfie.view.Pi2ProgressArcView;
import com.withpersona.sdk2.inquiry.shared.ui.ThemeableLottieAnimationView;
import mq.x;
import mq.y;

/* JADX INFO: loaded from: classes3.dex */
public final class b implements s5.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    public final View f28339a;

    @NonNull
    public final View b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final Pi2CircleMaskView f28340c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final ThemeableLottieAnimationView f28341d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public final ImageView f28342e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NonNull
    public final View f28343f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NonNull
    public final View f28344g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NonNull
    public final Pi2ProgressArcView f28345h;

    public b(@NonNull View view, @NonNull View view2, @NonNull Pi2CircleMaskView pi2CircleMaskView, @NonNull ThemeableLottieAnimationView themeableLottieAnimationView, @NonNull ImageView imageView, @NonNull View view3, @NonNull View view4, @NonNull Pi2ProgressArcView pi2ProgressArcView) {
        this.f28339a = view;
        this.b = view2;
        this.f28340c = pi2CircleMaskView;
        this.f28341d = themeableLottieAnimationView;
        this.f28342e = imageView;
        this.f28343f = view3;
        this.f28344g = view4;
        this.f28345h = pi2ProgressArcView;
    }

    @NonNull
    public static b a(@NonNull View view) {
        View viewA;
        View viewA2;
        int i10 = x.f24148d;
        View viewA3 = s5.b.a(view, i10);
        if (viewA3 != null) {
            i10 = x.f24160l;
            Pi2CircleMaskView pi2CircleMaskView = (Pi2CircleMaskView) s5.b.a(view, i10);
            if (pi2CircleMaskView != null) {
                i10 = x.f24168t;
                ThemeableLottieAnimationView themeableLottieAnimationView = (ThemeableLottieAnimationView) s5.b.a(view, i10);
                if (themeableLottieAnimationView != null) {
                    i10 = x.f24169u;
                    ImageView imageView = (ImageView) s5.b.a(view, i10);
                    if (imageView != null && (viewA = s5.b.a(view, (i10 = x.f24173y))) != null && (viewA2 = s5.b.a(view, (i10 = x.A))) != null) {
                        i10 = x.M;
                        Pi2ProgressArcView pi2ProgressArcView = (Pi2ProgressArcView) s5.b.a(view, i10);
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
        layoutInflater.inflate(y.b, viewGroup);
        return a(viewGroup);
    }

    @Override // s5.a
    @NonNull
    public View getRoot() {
        return this.f28339a;
    }
}
