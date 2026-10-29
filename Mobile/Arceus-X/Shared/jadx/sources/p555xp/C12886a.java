package p555xp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.materialswitch.MaterialSwitch;
import p402r5.C10785b;
import p402r5.InterfaceC10784a;
import p525wp.C12502a;
import p525wp.C12503b;

/* JADX INFO: renamed from: xp.a */
/* JADX INFO: loaded from: classes3.dex */
public final class C12886a implements InterfaceC10784a {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final ConstraintLayout f45745a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final MaterialSwitch f45746b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final MaterialToolbar f45747c;

    public C12886a(@NonNull ConstraintLayout constraintLayout, @NonNull MaterialSwitch materialSwitch, @NonNull MaterialToolbar materialToolbar) {
        this.f45745a = constraintLayout;
        this.f45746b = materialSwitch;
        this.f45747c = materialToolbar;
    }

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C12886a m47908a(@NonNull View view) {
        int i10 = C12502a.f44688c;
        MaterialSwitch materialSwitch = (MaterialSwitch) C10785b.m41116a(view, i10);
        if (materialSwitch != null) {
            i10 = C12502a.f44689d;
            MaterialToolbar materialToolbar = (MaterialToolbar) C10785b.m41116a(view, i10);
            if (materialToolbar != null) {
                return new C12886a((ConstraintLayout) view, materialSwitch, materialToolbar);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @NonNull
    /* JADX INFO: renamed from: c */
    public static C12886a m47909c(@NonNull LayoutInflater layoutInflater) {
        return m47910d(layoutInflater, null, false);
    }

    @NonNull
    /* JADX INFO: renamed from: d */
    public static C12886a m47910d(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(C12503b.f44690a, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return m47908a(viewInflate);
    }

    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // p402r5.InterfaceC10784a
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f45745a;
    }
}
