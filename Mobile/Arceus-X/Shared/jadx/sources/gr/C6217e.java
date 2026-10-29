package gr;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import ar.C1149d;
import ar.C1150e;
import p402r5.C10785b;
import p402r5.InterfaceC10784a;

/* JADX INFO: renamed from: gr.e */
/* JADX INFO: loaded from: classes3.dex */
public final class C6217e implements InterfaceC10784a {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final ConstraintLayout f23674a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final Guideline f23675b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final Guideline f23676c;

    public C6217e(@NonNull ConstraintLayout constraintLayout, @NonNull Guideline guideline, @NonNull Guideline guideline2) {
        this.f23674a = constraintLayout;
        this.f23675b = guideline;
        this.f23676c = guideline2;
    }

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C6217e m27356a(@NonNull View view) {
        int i10 = C1149d.f4781G;
        Guideline guideline = (Guideline) C10785b.m41116a(view, i10);
        if (guideline != null) {
            i10 = C1149d.f4784H0;
            Guideline guideline2 = (Guideline) C10785b.m41116a(view, i10);
            if (guideline2 != null) {
                return new C6217e((ConstraintLayout) view, guideline, guideline2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @NonNull
    /* JADX INFO: renamed from: c */
    public static C6217e m27357c(@NonNull LayoutInflater layoutInflater) {
        return m27358d(layoutInflater, null, false);
    }

    @NonNull
    /* JADX INFO: renamed from: d */
    public static C6217e m27358d(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(C1150e.f4867e, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return m27356a(viewInflate);
    }

    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // p402r5.InterfaceC10784a
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f23674a;
    }
}
