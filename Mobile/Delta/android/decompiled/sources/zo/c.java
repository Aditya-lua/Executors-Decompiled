package zo;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.fragment.app.FragmentContainerView;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import xo.e0;
import xo.f0;

/* JADX INFO: loaded from: classes3.dex */
public final class c implements r5.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    public final FrameLayout f38225a;

    @NonNull
    public final FloatingActionButton b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final FragmentContainerView f38226c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final FragmentContainerView f38227d;

    public c(@NonNull FrameLayout frameLayout, @NonNull FloatingActionButton floatingActionButton, @NonNull FragmentContainerView fragmentContainerView, @NonNull FragmentContainerView fragmentContainerView2) {
        this.f38225a = frameLayout;
        this.b = floatingActionButton;
        this.f38226c = fragmentContainerView;
        this.f38227d = fragmentContainerView2;
    }

    @NonNull
    public static c a(@NonNull View view) {
        int i10 = e0.f35975c;
        FloatingActionButton floatingActionButton = (FloatingActionButton) r5.b.a(view, i10);
        if (floatingActionButton != null) {
            i10 = e0.f35977e;
            FragmentContainerView fragmentContainerView = (FragmentContainerView) r5.b.a(view, i10);
            if (fragmentContainerView != null) {
                i10 = e0.f35982j;
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
        View viewInflate = layoutInflater.inflate(f0.f35999c, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @Override // r5.a
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public FrameLayout getRoot() {
        return this.f38225a;
    }
}
