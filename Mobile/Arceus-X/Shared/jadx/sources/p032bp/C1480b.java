package p032bp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import p402r5.C10785b;
import p402r5.InterfaceC10784a;
import p610zo.C13957e0;
import p610zo.C13959f0;

/* JADX INFO: renamed from: bp.b */
/* JADX INFO: loaded from: classes3.dex */
public final class C1480b implements InterfaceC10784a {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final View f5752a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final View f5753b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final FrameLayout f5754c;

    public C1480b(@NonNull View view, @NonNull View view2, @NonNull FrameLayout frameLayout) {
        this.f5752a = view;
        this.f5753b = view2;
        this.f5754c = frameLayout;
    }

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C1480b m7592a(@NonNull View view) {
        int i10 = C13957e0.f48746i;
        View viewM41116a = C10785b.m41116a(view, i10);
        if (viewM41116a != null) {
            i10 = C13957e0.f48750m;
            FrameLayout frameLayout = (FrameLayout) C10785b.m41116a(view, i10);
            if (frameLayout != null) {
                return new C1480b(view, viewM41116a, frameLayout);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @NonNull
    /* JADX INFO: renamed from: b */
    public static C1480b m7593b(@NonNull LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(C13959f0.f48765b, viewGroup);
        return m7592a(viewGroup);
    }

    @Override // p402r5.InterfaceC10784a
    @NonNull
    public View getRoot() {
        return this.f5752a;
    }
}
