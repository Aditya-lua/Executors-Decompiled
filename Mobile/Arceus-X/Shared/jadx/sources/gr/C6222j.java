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

/* JADX INFO: renamed from: gr.j */
/* JADX INFO: loaded from: classes3.dex */
public final class C6222j implements InterfaceC10784a {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final LinearLayout f23696a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final LinearLayout f23697b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final TextView f23698c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final TextView f23699d;

    public C6222j(@NonNull LinearLayout linearLayout, @NonNull LinearLayout linearLayout2, @NonNull TextView textView, @NonNull TextView textView2) {
        this.f23696a = linearLayout;
        this.f23697b = linearLayout2;
        this.f23698c = textView;
        this.f23699d = textView2;
    }

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C6222j m27376a(@NonNull View view) {
        int i10 = C1149d.f4844r;
        LinearLayout linearLayout = (LinearLayout) C10785b.m41116a(view, i10);
        if (linearLayout != null) {
            i10 = C1149d.f4846s;
            TextView textView = (TextView) C10785b.m41116a(view, i10);
            if (textView != null) {
                i10 = C1149d.f4848t;
                TextView textView2 = (TextView) C10785b.m41116a(view, i10);
                if (textView2 != null) {
                    return new C6222j((LinearLayout) view, linearLayout, textView, textView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @NonNull
    /* JADX INFO: renamed from: c */
    public static C6222j m27377c(@NonNull LayoutInflater layoutInflater) {
        return m27378d(layoutInflater, null, false);
    }

    @NonNull
    /* JADX INFO: renamed from: d */
    public static C6222j m27378d(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(C1150e.f4873k, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return m27376a(viewInflate);
    }

    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // p402r5.InterfaceC10784a
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.f23696a;
    }
}
