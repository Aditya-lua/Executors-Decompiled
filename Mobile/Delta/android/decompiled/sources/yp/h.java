package yp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import wp.s;

/* JADX INFO: loaded from: classes3.dex */
public final class h implements r5.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    public final FrameLayout f37003a;

    @NonNull
    public final FrameLayout b;

    public h(@NonNull FrameLayout frameLayout, @NonNull FrameLayout frameLayout2) {
        this.f37003a = frameLayout;
        this.b = frameLayout2;
    }

    @NonNull
    public static h a(@NonNull View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        FrameLayout frameLayout = (FrameLayout) view;
        return new h(frameLayout, frameLayout);
    }

    @NonNull
    public static h c(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(s.f34880h, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @Override // r5.a
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public FrameLayout getRoot() {
        return this.f37003a;
    }
}
