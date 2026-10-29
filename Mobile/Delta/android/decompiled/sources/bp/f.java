package bp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import zo.f0;

/* JADX INFO: loaded from: classes3.dex */
public final class f implements r5.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    public final CoordinatorLayout f4303a;

    @NonNull
    public final CoordinatorLayout b;

    public f(@NonNull CoordinatorLayout coordinatorLayout, @NonNull CoordinatorLayout coordinatorLayout2) {
        this.f4303a = coordinatorLayout;
        this.b = coordinatorLayout2;
    }

    @NonNull
    public static f a(@NonNull View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) view;
        return new f(coordinatorLayout, coordinatorLayout);
    }

    @NonNull
    public static f c(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(f0.f37879f, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @Override // r5.a
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public CoordinatorLayout getRoot() {
        return this.f4303a;
    }
}
