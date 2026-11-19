package ur;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;

/* JADX INFO: loaded from: classes3.dex */
public final class g implements s5.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    public final LinearLayout f33890a;

    @NonNull
    public final LinearLayout b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f33891c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final View f33892d;

    public g(@NonNull LinearLayout linearLayout, @NonNull LinearLayout linearLayout2, @NonNull ConstraintLayout constraintLayout, @NonNull View view) {
        this.f33890a = linearLayout;
        this.b = linearLayout2;
        this.f33891c = constraintLayout;
        this.f33892d = view;
    }

    @NonNull
    public static g a(@NonNull View view) {
        View viewA;
        LinearLayout linearLayout = (LinearLayout) view;
        int i10 = or.f.L;
        ConstraintLayout constraintLayout = (ConstraintLayout) s5.b.a(view, i10);
        if (constraintLayout == null || (viewA = s5.b.a(view, (i10 = or.f.N))) == null) {
            throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
        }
        return new g(linearLayout, linearLayout, constraintLayout, viewA);
    }

    @NonNull
    public static g c(@NonNull LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    @NonNull
    public static g d(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(or.g.f28469h, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @Override // s5.a
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.f33890a;
    }
}
