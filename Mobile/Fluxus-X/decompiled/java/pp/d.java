package pp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import np.h0;

/* JADX INFO: loaded from: classes3.dex */
public final class d implements s5.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    public final FrameLayout f29263a;

    public d(@NonNull FrameLayout frameLayout) {
        this.f29263a = frameLayout;
    }

    @NonNull
    public static d a(@NonNull View view) {
        if (view != null) {
            return new d((FrameLayout) view);
        }
        throw new NullPointerException("rootView");
    }

    @NonNull
    public static d c(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(h0.f26325d, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @Override // s5.a
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public FrameLayout getRoot() {
        return this.f29263a;
    }
}
