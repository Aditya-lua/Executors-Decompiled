package oo;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import no.c3;
import no.d3;

/* JADX INFO: loaded from: classes3.dex */
public final class e implements s5.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    public final FrameLayout f28317a;

    @NonNull
    public final FrameLayout b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final FrameLayout f28318c;

    public e(@NonNull FrameLayout frameLayout, @NonNull FrameLayout frameLayout2, @NonNull FrameLayout frameLayout3) {
        this.f28317a = frameLayout;
        this.b = frameLayout2;
        this.f28318c = frameLayout3;
    }

    @NonNull
    public static e a(@NonNull View view) {
        int i10 = c3.f25944e;
        FrameLayout frameLayout = (FrameLayout) s5.b.a(view, i10);
        if (frameLayout != null) {
            i10 = c3.f25946g;
            FrameLayout frameLayout2 = (FrameLayout) s5.b.a(view, i10);
            if (frameLayout2 != null) {
                return new e((FrameLayout) view, frameLayout, frameLayout2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @NonNull
    public static e c(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(d3.f25969e, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @Override // s5.a
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public FrameLayout getRoot() {
        return this.f28317a;
    }
}
