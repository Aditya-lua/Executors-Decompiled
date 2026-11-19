package gq;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import fq.a2;
import fq.z1;

/* JADX INFO: loaded from: classes3.dex */
public final class b implements s5.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f17892a;

    @NonNull
    public final FrameLayout b;

    public b(@NonNull ConstraintLayout constraintLayout, @NonNull FrameLayout frameLayout) {
        this.f17892a = constraintLayout;
        this.b = frameLayout;
    }

    @NonNull
    public static b a(@NonNull View view) {
        int i10 = z1.f16562c;
        FrameLayout frameLayout = (FrameLayout) s5.b.a(view, i10);
        if (frameLayout != null) {
            return new b((ConstraintLayout) view, frameLayout);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @NonNull
    public static b c(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(a2.b, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @Override // s5.a
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f17892a;
    }
}
