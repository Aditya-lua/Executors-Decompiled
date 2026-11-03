package zo;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import xo.e0;
import xo.f0;

/* JADX INFO: loaded from: classes3.dex */
public final class b implements r5.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    public final View f38223a;

    @NonNull
    public final View b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final FrameLayout f38224c;

    public b(@NonNull View view, @NonNull View view2, @NonNull FrameLayout frameLayout) {
        this.f38223a = view;
        this.b = view2;
        this.f38224c = frameLayout;
    }

    @NonNull
    public static b a(@NonNull View view) {
        int i10 = e0.f35981i;
        View viewA = r5.b.a(view, i10);
        if (viewA != null) {
            i10 = e0.f35985m;
            FrameLayout frameLayout = (FrameLayout) r5.b.a(view, i10);
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
        layoutInflater.inflate(f0.b, viewGroup);
        return a(viewGroup);
    }

    @Override // r5.a
    @NonNull
    public View getRoot() {
        return this.f38223a;
    }
}
