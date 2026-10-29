package gr;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import ar.C1149d;
import ar.C1150e;
import com.google.android.material.radiobutton.MaterialRadioButton;
import p402r5.C10785b;
import p402r5.InterfaceC10784a;

/* JADX INFO: renamed from: gr.b */
/* JADX INFO: loaded from: classes3.dex */
public final class C6214b implements InterfaceC10784a {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final ConstraintLayout f23644a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final MaterialRadioButton f23645b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final TextView f23646c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final TextView f23647d;

    public C6214b(@NonNull ConstraintLayout constraintLayout, @NonNull MaterialRadioButton materialRadioButton, @NonNull TextView textView, @NonNull TextView textView2) {
        this.f23644a = constraintLayout;
        this.f23645b = materialRadioButton;
        this.f23646c = textView;
        this.f23647d = textView2;
    }

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C6214b m27345a(@NonNull View view) {
        int i10 = C1149d.f4849t0;
        MaterialRadioButton materialRadioButton = (MaterialRadioButton) C10785b.m41116a(view, i10);
        if (materialRadioButton != null) {
            i10 = C1149d.f4853v0;
            TextView textView = (TextView) C10785b.m41116a(view, i10);
            if (textView != null) {
                i10 = C1149d.f4855w0;
                TextView textView2 = (TextView) C10785b.m41116a(view, i10);
                if (textView2 != null) {
                    return new C6214b((ConstraintLayout) view, materialRadioButton, textView, textView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @NonNull
    /* JADX INFO: renamed from: c */
    public static C6214b m27346c(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(C1150e.f4864b, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return m27345a(viewInflate);
    }

    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // p402r5.InterfaceC10784a
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f23644a;
    }
}
