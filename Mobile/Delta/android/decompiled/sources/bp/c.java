package bp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.fragment.app.FragmentContainerView;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import zo.e0;
import zo.f0;

/* JADX INFO: loaded from: classes3.dex */
public final class c implements r5.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    public final FrameLayout f4298a;

    @NonNull
    public final FloatingActionButton b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final FragmentContainerView f4299c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final FragmentContainerView f4300d;

    public c(@NonNull FrameLayout frameLayout, @NonNull FloatingActionButton floatingActionButton, @NonNull FragmentContainerView fragmentContainerView, @NonNull FragmentContainerView fragmentContainerView2) {
        this.f4298a = frameLayout;
        this.b = floatingActionButton;
        this.f4299c = fragmentContainerView;
        this.f4300d = fragmentContainerView2;
    }

    @NonNull
    public static c a(@NonNull View view) {
        int i10 = e0.f37852c;
        FloatingActionButton floatingActionButton = (FloatingActionButton) r5.b.a(view, i10);
        if (floatingActionButton != null) {
            i10 = e0.f37854e;
            FragmentContainerView fragmentContainerView = (FragmentContainerView) r5.b.a(view, i10);
            if (fragmentContainerView != null) {
                i10 = e0.f37859j;
                FragmentContainerView fragmentContainerView2 = (FragmentContainerView) r5.b.a(view, i10);
                if (fragmentContainerView2 != null) {
                    return new c((FrameLayout) view, floatingActionButton, fragmentContainerView, fragmentContainerView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @NonNull
    public static c c(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(f0.f37876c, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @Override // r5.a
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public FrameLayout getRoot() {
        return this.f4298a;
    }
}
