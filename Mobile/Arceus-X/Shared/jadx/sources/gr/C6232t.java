package gr;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import ar.C1150e;
import p402r5.InterfaceC10784a;

/* JADX INFO: renamed from: gr.t */
/* JADX INFO: loaded from: classes3.dex */
public final class C6232t implements InterfaceC10784a {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final ConstraintLayout f23737a;

    public C6232t(@NonNull ConstraintLayout constraintLayout) {
        this.f23737a = constraintLayout;
    }

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C6232t m27415a(@NonNull View view) {
        if (view != null) {
            return new C6232t((ConstraintLayout) view);
        }
        throw new NullPointerException("rootView");
    }

    @NonNull
    /* JADX INFO: renamed from: c */
    public static C6232t m27416c(@NonNull LayoutInflater layoutInflater) {
        return m27417d(layoutInflater, null, false);
    }

    @NonNull
    /* JADX INFO: renamed from: d */
    public static C6232t m27417d(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(C1150e.f4883u, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return m27415a(viewInflate);
    }

    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // p402r5.InterfaceC10784a
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f23737a;
    }
}
