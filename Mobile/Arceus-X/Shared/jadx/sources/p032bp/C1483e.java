package p032bp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import p402r5.InterfaceC10784a;
import p610zo.C13959f0;

/* JADX INFO: renamed from: bp.e */
/* JADX INFO: loaded from: classes3.dex */
public final class C1483e implements InterfaceC10784a {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final FrameLayout f5760a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final FrameLayout f5761b;

    public C1483e(@NonNull FrameLayout frameLayout, @NonNull FrameLayout frameLayout2) {
        this.f5760a = frameLayout;
        this.f5761b = frameLayout2;
    }

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C1483e m7600a(@NonNull View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        FrameLayout frameLayout = (FrameLayout) view;
        return new C1483e(frameLayout, frameLayout);
    }

    @NonNull
    /* JADX INFO: renamed from: c */
    public static C1483e m7601c(@NonNull LayoutInflater layoutInflater) {
        return m7602d(layoutInflater, null, false);
    }

    @NonNull
    /* JADX INFO: renamed from: d */
    public static C1483e m7602d(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(C13959f0.f48768e, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return m7600a(viewInflate);
    }

    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // p402r5.InterfaceC10784a
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public FrameLayout getRoot() {
        return this.f5760a;
    }
}
