package p032bp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import p402r5.InterfaceC10784a;
import p610zo.C13959f0;

/* JADX INFO: renamed from: bp.d */
/* JADX INFO: loaded from: classes3.dex */
public final class C1482d implements InterfaceC10784a {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final FrameLayout f5759a;

    public C1482d(@NonNull FrameLayout frameLayout) {
        this.f5759a = frameLayout;
    }

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C1482d m7597a(@NonNull View view) {
        if (view != null) {
            return new C1482d((FrameLayout) view);
        }
        throw new NullPointerException("rootView");
    }

    @NonNull
    /* JADX INFO: renamed from: c */
    public static C1482d m7598c(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(C13959f0.f48767d, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return m7597a(viewInflate);
    }

    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // p402r5.InterfaceC10784a
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public FrameLayout getRoot() {
        return this.f5759a;
    }
}
