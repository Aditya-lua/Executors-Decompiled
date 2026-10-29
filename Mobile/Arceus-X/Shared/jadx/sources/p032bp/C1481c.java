package p032bp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.fragment.app.FragmentContainerView;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import p402r5.C10785b;
import p402r5.InterfaceC10784a;
import p610zo.C13957e0;
import p610zo.C13959f0;

/* JADX INFO: renamed from: bp.c */
/* JADX INFO: loaded from: classes3.dex */
public final class C1481c implements InterfaceC10784a {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final FrameLayout f5755a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final FloatingActionButton f5756b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final FragmentContainerView f5757c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final FragmentContainerView f5758d;

    public C1481c(@NonNull FrameLayout frameLayout, @NonNull FloatingActionButton floatingActionButton, @NonNull FragmentContainerView fragmentContainerView, @NonNull FragmentContainerView fragmentContainerView2) {
        this.f5755a = frameLayout;
        this.f5756b = floatingActionButton;
        this.f5757c = fragmentContainerView;
        this.f5758d = fragmentContainerView2;
    }

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C1481c m7594a(@NonNull View view) {
        int i10 = C13957e0.f48740c;
        FloatingActionButton floatingActionButton = (FloatingActionButton) C10785b.m41116a(view, i10);
        if (floatingActionButton != null) {
            i10 = C13957e0.f48742e;
            FragmentContainerView fragmentContainerView = (FragmentContainerView) C10785b.m41116a(view, i10);
            if (fragmentContainerView != null) {
                i10 = C13957e0.f48747j;
                FragmentContainerView fragmentContainerView2 = (FragmentContainerView) C10785b.m41116a(view, i10);
                if (fragmentContainerView2 != null) {
                    return new C1481c((FrameLayout) view, floatingActionButton, fragmentContainerView, fragmentContainerView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @NonNull
    /* JADX INFO: renamed from: c */
    public static C1481c m7595c(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(C13959f0.f48766c, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return m7594a(viewInflate);
    }

    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // p402r5.InterfaceC10784a
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public FrameLayout getRoot() {
        return this.f5755a;
    }
}
