package no;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import io.C6899o2;
import p402r5.InterfaceC10784a;

/* JADX INFO: renamed from: no.h */
/* JADX INFO: loaded from: classes3.dex */
public final class C9532h implements InterfaceC10784a {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final ConstraintLayout f34396a;

    public C9532h(@NonNull ConstraintLayout constraintLayout) {
        this.f34396a = constraintLayout;
    }

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C9532h m37632a(@NonNull View view) {
        if (view != null) {
            return new C9532h((ConstraintLayout) view);
        }
        throw new NullPointerException("rootView");
    }

    @NonNull
    /* JADX INFO: renamed from: c */
    public static C9532h m37633c(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(C6899o2.f27116h, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return m37632a(viewInflate);
    }

    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // p402r5.InterfaceC10784a
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f34396a;
    }
}
