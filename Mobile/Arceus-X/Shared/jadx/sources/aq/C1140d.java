package aq;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import p402r5.InterfaceC10784a;
import p584yp.C13394s;

/* JADX INFO: renamed from: aq.d */
/* JADX INFO: loaded from: classes3.dex */
public final class C1140d implements InterfaceC10784a {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final ConstraintLayout f4724a;

    public C1140d(@NonNull ConstraintLayout constraintLayout) {
        this.f4724a = constraintLayout;
    }

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C1140d m6470a(@NonNull View view) {
        if (view != null) {
            return new C1140d((ConstraintLayout) view);
        }
        throw new NullPointerException("rootView");
    }

    @NonNull
    /* JADX INFO: renamed from: c */
    public static C1140d m6471c(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(C13394s.f46953d, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return m6470a(viewInflate);
    }

    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // p402r5.InterfaceC10784a
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f4724a;
    }
}
