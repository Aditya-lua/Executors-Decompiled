package aq;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import p402r5.InterfaceC10784a;
import p584yp.C13394s;

/* JADX INFO: renamed from: aq.h */
/* JADX INFO: loaded from: classes3.dex */
public final class C1144h implements InterfaceC10784a {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final FrameLayout f4751a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final FrameLayout f4752b;

    public C1144h(@NonNull FrameLayout frameLayout, @NonNull FrameLayout frameLayout2) {
        this.f4751a = frameLayout;
        this.f4752b = frameLayout2;
    }

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C1144h m6482a(@NonNull View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        FrameLayout frameLayout = (FrameLayout) view;
        return new C1144h(frameLayout, frameLayout);
    }

    @NonNull
    /* JADX INFO: renamed from: c */
    public static C1144h m6483c(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(C13394s.f46957h, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return m6482a(viewInflate);
    }

    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // p402r5.InterfaceC10784a
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public FrameLayout getRoot() {
        return this.f4751a;
    }
}
