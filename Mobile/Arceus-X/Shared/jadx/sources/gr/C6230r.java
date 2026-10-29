package gr;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import ar.C1149d;
import ar.C1150e;
import com.google.android.material.checkbox.MaterialCheckBox;
import p402r5.C10785b;
import p402r5.InterfaceC10784a;

/* JADX INFO: renamed from: gr.r */
/* JADX INFO: loaded from: classes3.dex */
public final class C6230r implements InterfaceC10784a {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final ConstraintLayout f23730a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final MaterialCheckBox f23731b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final TextView f23732c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final ConstraintLayout f23733d;

    public C6230r(@NonNull ConstraintLayout constraintLayout, @NonNull MaterialCheckBox materialCheckBox, @NonNull TextView textView, @NonNull ConstraintLayout constraintLayout2) {
        this.f23730a = constraintLayout;
        this.f23731b = materialCheckBox;
        this.f23732c = textView;
        this.f23733d = constraintLayout2;
    }

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C6230r m27408a(@NonNull View view) {
        int i10 = C1149d.f4838o;
        MaterialCheckBox materialCheckBox = (MaterialCheckBox) C10785b.m41116a(view, i10);
        if (materialCheckBox != null) {
            i10 = C1149d.f4807X;
            TextView textView = (TextView) C10785b.m41116a(view, i10);
            if (textView != null) {
                i10 = C1149d.f4809Z;
                ConstraintLayout constraintLayout = (ConstraintLayout) C10785b.m41116a(view, i10);
                if (constraintLayout != null) {
                    return new C6230r((ConstraintLayout) view, materialCheckBox, textView, constraintLayout);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @NonNull
    /* JADX INFO: renamed from: c */
    public static C6230r m27409c(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(C1150e.f4881s, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return m27408a(viewInflate);
    }

    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // p402r5.InterfaceC10784a
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f23730a;
    }
}
