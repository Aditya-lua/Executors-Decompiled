package gr;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import ar.C1149d;
import ar.C1150e;
import p402r5.C10785b;
import p402r5.InterfaceC10784a;

/* JADX INFO: renamed from: gr.g */
/* JADX INFO: loaded from: classes3.dex */
public final class C6219g implements InterfaceC10784a {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final LinearLayout f23686a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final LinearLayout f23687b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final ConstraintLayout f23688c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final View f23689d;

    public C6219g(@NonNull LinearLayout linearLayout, @NonNull LinearLayout linearLayout2, @NonNull ConstraintLayout constraintLayout, @NonNull View view) {
        this.f23686a = linearLayout;
        this.f23687b = linearLayout2;
        this.f23688c = constraintLayout;
        this.f23689d = view;
    }

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C6219g m27364a(@NonNull View view) {
        View viewM41116a;
        LinearLayout linearLayout = (LinearLayout) view;
        int i10 = C1149d.f4791L;
        ConstraintLayout constraintLayout = (ConstraintLayout) C10785b.m41116a(view, i10);
        if (constraintLayout == null || (viewM41116a = C10785b.m41116a(view, (i10 = C1149d.f4795N))) == null) {
            throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
        }
        return new C6219g(linearLayout, linearLayout, constraintLayout, viewM41116a);
    }

    @NonNull
    /* JADX INFO: renamed from: c */
    public static C6219g m27365c(@NonNull LayoutInflater layoutInflater) {
        return m27366d(layoutInflater, null, false);
    }

    @NonNull
    /* JADX INFO: renamed from: d */
    public static C6219g m27366d(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(C1150e.f4870h, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return m27364a(viewInflate);
    }

    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // p402r5.InterfaceC10784a
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.f23686a;
    }
}
