package br;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import com.withpersona.sdk2.inquiry.shared.ui.Pi2NavigationBar;
import xq.t;
import xq.u;

/* JADX INFO: loaded from: classes3.dex */
public final class b implements s5.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f4558a;

    @NonNull
    public final FrameLayout b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final NestedScrollView f4559c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final FrameLayout f4560d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public final Pi2NavigationBar f4561e;

    public b(@NonNull ConstraintLayout constraintLayout, @NonNull FrameLayout frameLayout, @NonNull NestedScrollView nestedScrollView, @NonNull FrameLayout frameLayout2, @NonNull Pi2NavigationBar pi2NavigationBar) {
        this.f4558a = constraintLayout;
        this.b = frameLayout;
        this.f4559c = nestedScrollView;
        this.f4560d = frameLayout2;
        this.f4561e = pi2NavigationBar;
    }

    @NonNull
    public static b a(@NonNull View view) {
        int i10 = t.f37025f;
        FrameLayout frameLayout = (FrameLayout) s5.b.a(view, i10);
        if (frameLayout != null) {
            i10 = t.f37026g;
            NestedScrollView nestedScrollView = (NestedScrollView) s5.b.a(view, i10);
            if (nestedScrollView != null) {
                i10 = t.f37029j;
                FrameLayout frameLayout2 = (FrameLayout) s5.b.a(view, i10);
                if (frameLayout2 != null) {
                    i10 = t.f37036q;
                    Pi2NavigationBar pi2NavigationBar = (Pi2NavigationBar) s5.b.a(view, i10);
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

    @Override // s5.a
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f4558a;
    }
}
