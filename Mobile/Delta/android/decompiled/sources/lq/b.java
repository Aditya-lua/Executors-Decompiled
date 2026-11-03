package lq;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import com.withpersona.sdk2.inquiry.shared.ui.Pi2NavigationBar;
import hq.t;
import hq.u;

/* JADX INFO: loaded from: classes3.dex */
public final class b implements r5.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f23925a;

    @NonNull
    public final FrameLayout b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final NestedScrollView f23926c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final FrameLayout f23927d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public final Pi2NavigationBar f23928e;

    public b(@NonNull ConstraintLayout constraintLayout, @NonNull FrameLayout frameLayout, @NonNull NestedScrollView nestedScrollView, @NonNull FrameLayout frameLayout2, @NonNull Pi2NavigationBar pi2NavigationBar) {
        this.f23925a = constraintLayout;
        this.b = frameLayout;
        this.f23926c = nestedScrollView;
        this.f23927d = frameLayout2;
        this.f23928e = pi2NavigationBar;
    }

    @NonNull
    public static b a(@NonNull View view) {
        int i10 = t.f19666f;
        FrameLayout frameLayout = (FrameLayout) r5.b.a(view, i10);
        if (frameLayout != null) {
            i10 = t.f19667g;
            NestedScrollView nestedScrollView = (NestedScrollView) r5.b.a(view, i10);
            if (nestedScrollView != null) {
                i10 = t.f19670j;
                FrameLayout frameLayout2 = (FrameLayout) r5.b.a(view, i10);
                if (frameLayout2 != null) {
                    i10 = t.f19677q;
                    Pi2NavigationBar pi2NavigationBar = (Pi2NavigationBar) r5.b.a(view, i10);
                    if (pi2NavigationBar != null) {
                        return new b((ConstraintLayout) view, frameLayout, nestedScrollView, frameLayout2, pi2NavigationBar);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @NonNull
    public static b c(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(u.b, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @Override // r5.a
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f23925a;
    }
}
