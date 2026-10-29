package p313nq;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import com.withpersona.sdk2.inquiry.shared.p055ui.Pi2NavigationBar;
import p226jq.C7282t;
import p226jq.C7283u;
import p402r5.C10785b;
import p402r5.InterfaceC10784a;

/* JADX INFO: renamed from: nq.b */
/* JADX INFO: loaded from: classes3.dex */
public final class C9546b implements InterfaceC10784a {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final ConstraintLayout f34501a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final FrameLayout f34502b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final NestedScrollView f34503c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final FrameLayout f34504d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final Pi2NavigationBar f34505e;

    public C9546b(@NonNull ConstraintLayout constraintLayout, @NonNull FrameLayout frameLayout, @NonNull NestedScrollView nestedScrollView, @NonNull FrameLayout frameLayout2, @NonNull Pi2NavigationBar pi2NavigationBar) {
        this.f34501a = constraintLayout;
        this.f34502b = frameLayout;
        this.f34503c = nestedScrollView;
        this.f34504d = frameLayout2;
        this.f34505e = pi2NavigationBar;
    }

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C9546b m37675a(@NonNull View view) {
        int i10 = C7282t.f28068f;
        FrameLayout frameLayout = (FrameLayout) C10785b.m41116a(view, i10);
        if (frameLayout != null) {
            i10 = C7282t.f28069g;
            NestedScrollView nestedScrollView = (NestedScrollView) C10785b.m41116a(view, i10);
            if (nestedScrollView != null) {
                i10 = C7282t.f28072j;
                FrameLayout frameLayout2 = (FrameLayout) C10785b.m41116a(view, i10);
                if (frameLayout2 != null) {
                    i10 = C7282t.f28079q;
                    Pi2NavigationBar pi2NavigationBar = (Pi2NavigationBar) C10785b.m41116a(view, i10);
                    if (pi2NavigationBar != null) {
                        return new C9546b((ConstraintLayout) view, frameLayout, nestedScrollView, frameLayout2, pi2NavigationBar);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @NonNull
    /* JADX INFO: renamed from: c */
    public static C9546b m37676c(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(C7283u.f28090b, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return m37675a(viewInflate);
    }

    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // p402r5.InterfaceC10784a
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f34501a;
    }
}
