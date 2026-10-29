package gr;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import ar.C1149d;
import ar.C1150e;
import p402r5.C10785b;
import p402r5.InterfaceC10784a;

/* JADX INFO: renamed from: gr.n */
/* JADX INFO: loaded from: classes3.dex */
public final class C6226n implements InterfaceC10784a {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final LinearLayout f23710a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final LinearLayout f23711b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final TextView f23712c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final TextView f23713d;

    public C6226n(@NonNull LinearLayout linearLayout, @NonNull LinearLayout linearLayout2, @NonNull TextView textView, @NonNull TextView textView2) {
        this.f23710a = linearLayout;
        this.f23711b = linearLayout2;
        this.f23712c = textView;
        this.f23713d = textView2;
    }

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C6226n m27392a(@NonNull View view) {
        int i10 = C1149d.f4851u0;
        LinearLayout linearLayout = (LinearLayout) C10785b.m41116a(view, i10);
        if (linearLayout != null) {
            i10 = C1149d.f4857x0;
            TextView textView = (TextView) C10785b.m41116a(view, i10);
            if (textView != null) {
                i10 = C1149d.f4859y0;
                TextView textView2 = (TextView) C10785b.m41116a(view, i10);
                if (textView2 != null) {
                    return new C6226n((LinearLayout) view, linearLayout, textView, textView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @NonNull
    /* JADX INFO: renamed from: c */
    public static C6226n m27393c(@NonNull LayoutInflater layoutInflater) {
        return m27394d(layoutInflater, null, false);
    }

    @NonNull
    /* JADX INFO: renamed from: d */
    public static C6226n m27394d(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(C1150e.f4877o, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return m27392a(viewInflate);
    }

    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // p402r5.InterfaceC10784a
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.f23710a;
    }
}
