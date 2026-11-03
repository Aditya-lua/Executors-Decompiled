package yn;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import xn.n2;
import xn.o2;

/* JADX INFO: loaded from: classes3.dex */
public final class e implements r5.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    public final FrameLayout f36925a;

    @NonNull
    public final FrameLayout b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final FrameLayout f36926c;

    public e(@NonNull FrameLayout frameLayout, @NonNull FrameLayout frameLayout2, @NonNull FrameLayout frameLayout3) {
        this.f36925a = frameLayout;
        this.b = frameLayout2;
        this.f36926c = frameLayout3;
    }

    @NonNull
    public static e a(@NonNull View view) {
        int i10 = n2.f35898e;
        FrameLayout frameLayout = (FrameLayout) r5.b.a(view, i10);
        if (frameLayout != null) {
            i10 = n2.f35900g;
            FrameLayout frameLayout2 = (FrameLayout) r5.b.a(view, i10);
            if (frameLayout2 != null) {
                return new e((FrameLayout) view, frameLayout, frameLayout2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @NonNull
    public static e c(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(o2.f35920e, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @Override // r5.a
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public FrameLayout getRoot() {
        return this.f36925a;
    }
}
