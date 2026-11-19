package pp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import np.g0;
import np.h0;

/* JADX INFO: loaded from: classes3.dex */
public final class b implements s5.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    public final View f29258a;

    @NonNull
    public final View b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final FrameLayout f29259c;

    public b(@NonNull View view, @NonNull View view2, @NonNull FrameLayout frameLayout) {
        this.f29258a = view;
        this.b = view2;
        this.f29259c = frameLayout;
    }

    @NonNull
    public static b a(@NonNull View view) {
        int i10 = g0.f26315i;
        View viewA = s5.b.a(view, i10);
        if (viewA != null) {
            i10 = g0.f26319m;
            FrameLayout frameLayout = (FrameLayout) s5.b.a(view, i10);
            if (frameLayout != null) {
                return new b(view, viewA, frameLayout);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @NonNull
    public static b b(@NonNull LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(h0.b, viewGroup);
        return a(viewGroup);
    }

    @Override // s5.a
    @NonNull
    public View getRoot() {
        return this.f29258a;
    }
}
