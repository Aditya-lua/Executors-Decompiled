package hd;

import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.sidesheet.SideSheetBehavior;

/* JADX INFO: loaded from: classes2.dex */
public final class b extends d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SideSheetBehavior<? extends View> f19191a;

    public b(@NonNull SideSheetBehavior<? extends View> sideSheetBehavior) {
        this.f19191a = sideSheetBehavior;
    }

    @Override // hd.d
    public int a(@NonNull ViewGroup.MarginLayoutParams marginLayoutParams) {
        return marginLayoutParams.rightMargin;
    }

    @Override // hd.d
    public float b(int i10) {
        float fE = e();
        return (fE - i10) / (fE - d());
    }

    @Override // hd.d
    public int c(@NonNull ViewGroup.MarginLayoutParams marginLayoutParams) {
        return marginLayoutParams.rightMargin;
    }

    @Override // hd.d
    public int d() {
        return Math.max(0, (e() - this.f19191a.d0()) - this.f19191a.k0());
    }

    @Override // hd.d
    public int e() {
        return this.f19191a.n0();
    }

    @Override // hd.d
    public int f() {
        return this.f19191a.n0();
    }

    @Override // hd.d
    public int g() {
        return d();
    }

    @Override // hd.d
    public <V extends View> int h(@NonNull V v5) {
        return v5.getLeft() - this.f19191a.k0();
    }

    @Override // hd.d
    public int i(@NonNull CoordinatorLayout coordinatorLayout) {
        return coordinatorLayout.getRight();
    }

    @Override // hd.d
    public int j() {
        return 0;
    }

    @Override // hd.d
    public boolean k(float f10) {
        return f10 < 0.0f;
    }

    @Override // hd.d
    public boolean l(@NonNull View view) {
        return view.getLeft() > (e() + d()) / 2;
    }

    @Override // hd.d
    public boolean m(float f10, float f11) {
        return e.a(f10, f11) && Math.abs(f10) > ((float) this.f19191a.o0());
    }

    @Override // hd.d
    public boolean n(@NonNull View view, float f10) {
        return Math.abs(((float) view.getRight()) + (f10 * this.f19191a.i0())) > this.f19191a.j0();
    }

    @Override // hd.d
    public void o(@NonNull ViewGroup.MarginLayoutParams marginLayoutParams, int i10) {
        marginLayoutParams.rightMargin = i10;
    }

    @Override // hd.d
    public void p(@NonNull ViewGroup.MarginLayoutParams marginLayoutParams, int i10, int i11) {
        int iN0 = this.f19191a.n0();
        if (i10 <= iN0) {
            marginLayoutParams.rightMargin = iN0 - i10;
        }
    }
}
