package p434sp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import p402r5.C10785b;
import p402r5.InterfaceC10784a;
import p419rp.C11043o1;
import p419rp.C11046p1;

/* JADX INFO: renamed from: sp.b */
/* JADX INFO: loaded from: classes3.dex */
public final class C11443b implements InterfaceC10784a {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final ConstraintLayout f40447a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final FrameLayout f40448b;

    public C11443b(@NonNull ConstraintLayout constraintLayout, @NonNull FrameLayout frameLayout) {
        this.f40447a = constraintLayout;
        this.f40448b = frameLayout;
    }

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C11443b m42857a(@NonNull View view) {
        int i10 = C11043o1.f39024c;
        FrameLayout frameLayout = (FrameLayout) C10785b.m41116a(view, i10);
        if (frameLayout != null) {
            return new C11443b((ConstraintLayout) view, frameLayout);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @NonNull
    /* JADX INFO: renamed from: c */
    public static C11443b m42858c(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(C11046p1.f39036b, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return m42857a(viewInflate);
    }

    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // p402r5.InterfaceC10784a
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f40447a;
    }
}
