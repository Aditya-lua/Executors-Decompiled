package aq;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.imageview.ShapeableImageView;
import p402r5.C10785b;
import p402r5.InterfaceC10784a;
import p584yp.C13388r;
import p584yp.C13394s;

/* JADX INFO: renamed from: aq.g */
/* JADX INFO: loaded from: classes3.dex */
public final class C1143g implements InterfaceC10784a {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final ConstraintLayout f4748a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final ShapeableImageView f4749b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final TextView f4750c;

    public C1143g(@NonNull ConstraintLayout constraintLayout, @NonNull ShapeableImageView shapeableImageView, @NonNull TextView textView) {
        this.f4748a = constraintLayout;
        this.f4749b = shapeableImageView;
        this.f4750c = textView;
    }

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C1143g m6479a(@NonNull View view) {
        int i10 = C13388r.f46938z;
        ShapeableImageView shapeableImageView = (ShapeableImageView) C10785b.m41116a(view, i10);
        if (shapeableImageView != null) {
            i10 = C13388r.f46884E;
            TextView textView = (TextView) C10785b.m41116a(view, i10);
            if (textView != null) {
                return new C1143g((ConstraintLayout) view, shapeableImageView, textView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @NonNull
    /* JADX INFO: renamed from: c */
    public static C1143g m6480c(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(C13394s.f46956g, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return m6479a(viewInflate);
    }

    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // p402r5.InterfaceC10784a
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f4748a;
    }
}
