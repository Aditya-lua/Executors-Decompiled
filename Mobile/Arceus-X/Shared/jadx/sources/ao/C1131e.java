package ao;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import p402r5.C10785b;
import p402r5.InterfaceC10784a;
import p609zn.C13909n2;
import p609zn.C13913o2;

/* JADX INFO: renamed from: ao.e */
/* JADX INFO: loaded from: classes3.dex */
public final class C1131e implements InterfaceC10784a {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final FrameLayout f4656a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final FrameLayout f4657b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final FrameLayout f4658c;

    public C1131e(@NonNull FrameLayout frameLayout, @NonNull FrameLayout frameLayout2, @NonNull FrameLayout frameLayout3) {
        this.f4656a = frameLayout;
        this.f4657b = frameLayout2;
        this.f4658c = frameLayout3;
    }

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C1131e m6442a(@NonNull View view) {
        int i10 = C13909n2.f48631e;
        FrameLayout frameLayout = (FrameLayout) C10785b.m41116a(view, i10);
        if (frameLayout != null) {
            i10 = C13909n2.f48633g;
            FrameLayout frameLayout2 = (FrameLayout) C10785b.m41116a(view, i10);
            if (frameLayout2 != null) {
                return new C1131e((FrameLayout) view, frameLayout, frameLayout2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @NonNull
    /* JADX INFO: renamed from: c */
    public static C1131e m6443c(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(C13913o2.f48655e, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return m6442a(viewInflate);
    }

    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // p402r5.InterfaceC10784a
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public FrameLayout getRoot() {
        return this.f4656a;
    }
}
