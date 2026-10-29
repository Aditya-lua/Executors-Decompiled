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
import com.google.android.material.card.MaterialCardView;
import p402r5.C10785b;
import p402r5.InterfaceC10784a;

/* JADX INFO: renamed from: gr.w */
/* JADX INFO: loaded from: classes3.dex */
public final class C6235w implements InterfaceC10784a {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final ConstraintLayout f23742a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final TextView f23743b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final ImageView f23744c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final TextView f23745d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final TextView f23746e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final MaterialCardView f23747f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final ImageView f23748g;

    public C6235w(@NonNull ConstraintLayout constraintLayout, @NonNull TextView textView, @NonNull ImageView imageView, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull MaterialCardView materialCardView, @NonNull ImageView imageView2) {
        this.f23742a = constraintLayout;
        this.f23743b = textView;
        this.f23744c = imageView;
        this.f23745d = textView2;
        this.f23746e = textView3;
        this.f23747f = materialCardView;
        this.f23748g = imageView2;
    }

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C6235w m27427a(@NonNull View view) {
        int i10 = C1149d.f4810a;
        TextView textView = (TextView) C10785b.m41116a(view, i10);
        if (textView != null) {
            i10 = C1149d.f4769A;
            ImageView imageView = (ImageView) C10785b.m41116a(view, i10);
            if (imageView != null) {
                i10 = C1149d.f4783H;
                TextView textView2 = (TextView) C10785b.m41116a(view, i10);
                if (textView2 != null) {
                    i10 = C1149d.f4807X;
                    TextView textView3 = (TextView) C10785b.m41116a(view, i10);
                    if (textView3 != null) {
                        i10 = C1149d.f4780F0;
                        MaterialCardView materialCardView = (MaterialCardView) C10785b.m41116a(view, i10);
                        if (materialCardView != null) {
                            i10 = C1149d.f4782G0;
                            ImageView imageView2 = (ImageView) C10785b.m41116a(view, i10);
                            if (imageView2 != null) {
                                return new C6235w((ConstraintLayout) view, textView, imageView, textView2, textView3, materialCardView, imageView2);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @NonNull
    /* JADX INFO: renamed from: c */
    public static C6235w m27428c(@NonNull LayoutInflater layoutInflater) {
        return m27429d(layoutInflater, null, false);
    }

    @NonNull
    /* JADX INFO: renamed from: d */
    public static C6235w m27429d(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(C1150e.f4886x, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return m27427a(viewInflate);
    }

    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // p402r5.InterfaceC10784a
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f23742a;
    }
}
