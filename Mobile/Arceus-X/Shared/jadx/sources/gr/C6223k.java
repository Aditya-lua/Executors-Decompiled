package gr;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import ar.C1149d;
import ar.C1150e;
import com.withpersona.sdk2.inquiry.shared.p055ui.PersonaMaterialButton;
import p402r5.C10785b;
import p402r5.InterfaceC10784a;

/* JADX INFO: renamed from: gr.k */
/* JADX INFO: loaded from: classes3.dex */
public final class C6223k implements InterfaceC10784a {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final LinearLayout f23700a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final PersonaMaterialButton f23701b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final TextView f23702c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final TextView f23703d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final TextView f23704e;

    public C6223k(@NonNull LinearLayout linearLayout, @NonNull PersonaMaterialButton personaMaterialButton, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3) {
        this.f23700a = linearLayout;
        this.f23701b = personaMaterialButton;
        this.f23702c = textView;
        this.f23703d = textView2;
        this.f23704e = textView3;
    }

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C6223k m27380a(@NonNull View view) {
        int i10 = C1149d.f4852v;
        PersonaMaterialButton personaMaterialButton = (PersonaMaterialButton) C10785b.m41116a(view, i10);
        if (personaMaterialButton != null) {
            i10 = C1149d.f4854w;
            TextView textView = (TextView) C10785b.m41116a(view, i10);
            if (textView != null) {
                i10 = C1149d.f4785I;
                TextView textView2 = (TextView) C10785b.m41116a(view, i10);
                if (textView2 != null) {
                    i10 = C1149d.f4808Y;
                    TextView textView3 = (TextView) C10785b.m41116a(view, i10);
                    if (textView3 != null) {
                        return new C6223k((LinearLayout) view, personaMaterialButton, textView, textView2, textView3);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @NonNull
    /* JADX INFO: renamed from: c */
    public static C6223k m27381c(@NonNull LayoutInflater layoutInflater) {
        return m27382d(layoutInflater, null, false);
    }

    @NonNull
    /* JADX INFO: renamed from: d */
    public static C6223k m27382d(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(C1150e.f4874l, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return m27380a(viewInflate);
    }

    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // p402r5.InterfaceC10784a
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.f23700a;
    }
}
