package ur;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;

/* JADX INFO: loaded from: classes3.dex */
public final class e implements s5.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f33880a;

    @NonNull
    public final Guideline b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final Guideline f33881c;

    public e(@NonNull ConstraintLayout constraintLayout, @NonNull Guideline guideline, @NonNull Guideline guideline2) {
        this.f33880a = constraintLayout;
        this.b = guideline;
        this.f33881c = guideline2;
    }

    @NonNull
    public static e a(@NonNull View view) {
        int i10 = or.f.G;
        Guideline guideline = (Guideline) s5.b.a(view, i10);
        if (guideline != null) {
            i10 = or.f.H0;
            Guideline guideline2 = (Guideline) s5.b.a(view, i10);
            if (guideline2 != null) {
                return new e((ConstraintLayout) view, guideline, guideline2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @NonNull
    public static e c(@NonNull LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    @NonNull
    public static e d(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(or.g.f28466e, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @Override // s5.a
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f33880a;
    }
}
