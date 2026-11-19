package pp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.fragment.app.FragmentContainerView;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import np.g0;
import np.h0;

/* JADX INFO: loaded from: classes3.dex */
public final class c implements s5.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    public final FrameLayout f29260a;

    @NonNull
    public final FloatingActionButton b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final FragmentContainerView f29261c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final FragmentContainerView f29262d;

    public c(@NonNull FrameLayout frameLayout, @NonNull FloatingActionButton floatingActionButton, @NonNull FragmentContainerView fragmentContainerView, @NonNull FragmentContainerView fragmentContainerView2) {
        this.f29260a = frameLayout;
        this.b = floatingActionButton;
        this.f29261c = fragmentContainerView;
        this.f29262d = fragmentContainerView2;
    }

    @NonNull
    public static c a(@NonNull View view) {
        int i10 = g0.f26309c;
        FloatingActionButton floatingActionButton = (FloatingActionButton) s5.b.a(view, i10);
        if (floatingActionButton != null) {
            i10 = g0.f26311e;
            FragmentContainerView fragmentContainerView = (FragmentContainerView) s5.b.a(view, i10);
            if (fragmentContainerView != null) {
                i10 = g0.f26316j;
                FragmentContainerView fragmentContainerView2 = (FragmentContainerView) s5.b.a(view, i10);
                if (fragmentContainerView2 != null) {
                    return new c((FrameLayout) view, floatingActionButton, fragmentContainerView, fragmentContainerView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @NonNull
    public static c c(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(h0.f26324c, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @Override // s5.a
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public FrameLayout getRoot() {
        return this.f29260a;
    }
}
