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

/* JADX INFO: renamed from: gr.i */
/* JADX INFO: loaded from: classes3.dex */
public final class C6221i implements InterfaceC10784a {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final ConstraintLayout f23691a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final MaterialCheckBox f23692b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final TextView f23693c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final TextView f23694d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final TextView f23695e;

    public C6221i(@NonNull ConstraintLayout constraintLayout, @NonNull MaterialCheckBox materialCheckBox, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3) {
        this.f23691a = constraintLayout;
        this.f23692b = materialCheckBox;
        this.f23693c = textView;
        this.f23694d = textView2;
        this.f23695e = textView3;
    }

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C6221i m27372a(@NonNull View view) {
        int i10 = C1149d.f4838o;
        MaterialCheckBox materialCheckBox = (MaterialCheckBox) C10785b.m41116a(view, i10);
        if (materialCheckBox != null) {
            i10 = C1149d.f4840p;
            TextView textView = (TextView) C10785b.m41116a(view, i10);
            if (textView != null) {
                i10 = C1149d.f4842q;
                TextView textView2 = (TextView) C10785b.m41116a(view, i10);
                if (textView2 != null) {
                    i10 = C1149d.f4850u;
                    TextView textView3 = (TextView) C10785b.m41116a(view, i10);
                    if (textView3 != null) {
                        return new C6221i((ConstraintLayout) view, materialCheckBox, textView, textView2, textView3);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @NonNull
    /* JADX INFO: renamed from: c */
    public static C6221i m27373c(@NonNull LayoutInflater layoutInflater) {
        return m27374d(layoutInflater, null, false);
    }

    @NonNull
    /* JADX INFO: renamed from: d */
    public static C6221i m27374d(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(C1150e.f4872j, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return m27372a(viewInflate);
    }

    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // p402r5.InterfaceC10784a
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f23691a;
    }
}
