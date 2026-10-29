package no;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import io.C6899o2;
import p402r5.InterfaceC10784a;

/* JADX INFO: renamed from: no.e */
/* JADX INFO: loaded from: classes3.dex */
public final class C9529e implements InterfaceC10784a {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final FrameLayout f34376a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final FrameLayout f34377b;

    public C9529e(@NonNull FrameLayout frameLayout, @NonNull FrameLayout frameLayout2) {
        this.f34376a = frameLayout;
        this.f34377b = frameLayout2;
    }

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C9529e m37623a(@NonNull View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        FrameLayout frameLayout = (FrameLayout) view;
        return new C9529e(frameLayout, frameLayout);
    }

    @NonNull
    /* JADX INFO: renamed from: c */
    public static C9529e m37624c(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(C6899o2.f27113e, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return m37623a(viewInflate);
    }

    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // p402r5.InterfaceC10784a
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public FrameLayout getRoot() {
        return this.f34376a;
    }
}
