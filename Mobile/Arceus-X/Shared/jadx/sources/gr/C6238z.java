package gr;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import ar.C1149d;
import ar.C1150e;
import p402r5.C10785b;
import p402r5.InterfaceC10784a;

/* JADX INFO: renamed from: gr.z */
/* JADX INFO: loaded from: classes3.dex */
public final class C6238z implements InterfaceC10784a {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final ConstraintLayout f23753a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final ImageView f23754b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final TextView f23755c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final TextView f23756d;

    public C6238z(@NonNull ConstraintLayout constraintLayout, @NonNull ImageView imageView, @NonNull TextView textView, @NonNull TextView textView2) {
        this.f23753a = constraintLayout;
        this.f23754b = imageView;
        this.f23755c = textView;
        this.f23756d = textView2;
    }

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C6238z m27439a(@NonNull View view) {
        int i10 = C1149d.f4797O;
        ImageView imageView = (ImageView) C10785b.m41116a(view, i10);
        if (imageView != null) {
            i10 = C1149d.f4821f0;
            TextView textView = (TextView) C10785b.m41116a(view, i10);
            if (textView != null) {
                i10 = C1149d.f4786I0;
                TextView textView2 = (TextView) C10785b.m41116a(view, i10);
                if (textView2 != null) {
                    return new C6238z((ConstraintLayout) view, imageView, textView, textView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @NonNull
    /* JADX INFO: renamed from: c */
    public static C6238z m27440c(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(C1150e.f4862A, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return m27439a(viewInflate);
    }

    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // p402r5.InterfaceC10784a
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f23753a;
    }
}
