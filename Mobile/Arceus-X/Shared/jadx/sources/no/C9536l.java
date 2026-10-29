package no;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import io.C6895n2;
import io.C6899o2;
import p402r5.C10785b;
import p402r5.InterfaceC10784a;

/* JADX INFO: renamed from: no.l */
/* JADX INFO: loaded from: classes3.dex */
public final class C9536l implements InterfaceC10784a {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final LinearLayout f34446a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final ImageView f34447b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final ConstraintLayout f34448c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final TextView f34449d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final TextView f34450e;

    public C9536l(@NonNull LinearLayout linearLayout, @NonNull ImageView imageView, @NonNull ConstraintLayout constraintLayout, @NonNull TextView textView, @NonNull TextView textView2) {
        this.f34446a = linearLayout;
        this.f34447b = imageView;
        this.f34448c = constraintLayout;
        this.f34449d = textView;
        this.f34450e = textView2;
    }

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C9536l m37644a(@NonNull View view) {
        int i10 = C6895n2.f27039N;
        ImageView imageView = (ImageView) C10785b.m41116a(view, i10);
        if (imageView != null) {
            i10 = C6895n2.f27041O;
            ConstraintLayout constraintLayout = (ConstraintLayout) C10785b.m41116a(view, i10);
            if (constraintLayout != null) {
                i10 = C6895n2.f27024F0;
                TextView textView = (TextView) C10785b.m41116a(view, i10);
                if (textView != null) {
                    i10 = C6895n2.f27036L0;
                    TextView textView2 = (TextView) C10785b.m41116a(view, i10);
                    if (textView2 != null) {
                        return new C9536l((LinearLayout) view, imageView, constraintLayout, textView, textView2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @NonNull
    /* JADX INFO: renamed from: c */
    public static C9536l m37645c(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(C6899o2.f27121m, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return m37644a(viewInflate);
    }

    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // p402r5.InterfaceC10784a
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.f34446a;
    }
}
