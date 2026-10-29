package hd;

import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.sidesheet.SideSheetBehavior;

/* JADX INFO: loaded from: classes2.dex */
public final class a extends d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SideSheetBehavior<? extends View> f19190a;

    public a(@NonNull SideSheetBehavior<? extends View> sideSheetBehavior) {
        this.f19190a = sideSheetBehavior;
    }

    @Override // hd.d
    public int a(@NonNull ViewGroup.MarginLayoutParams marginLayoutParams) {
        return marginLayoutParams.leftMargin;
    }

    @Override // hd.d
    public float b(int i10) {
        float fE = e();
        return (i10 - fE) / (d() - fE);
    }

    @Override // hd.d
    public int c(@NonNull ViewGroup.MarginLayoutParams marginLayoutParams) {
        return marginLayoutParams.leftMargin;
    }

    @Override // hd.d
    public int d() {
        return Math.max(0, this.f19190a.m0() + this.f19190a.k0());
    }

    @Override // hd.d
    public int e() {
        return (-this.f19190a.d0()) - this.f19190a.k0();
    }

    @Override // hd.d
    public int f() {
        return this.f19190a.k0();
    }

    @Override // hd.d
    public int g() {
        return -this.f19190a.d0();
    }

    @Override // hd.d
    public <V extends View> int h(@NonNull V v5) {
        return v5.getRight() + this.f19190a.k0();
    }

    @Override // hd.d
    public int i(@NonNull CoordinatorLayout coordinatorLayout) {
        return coordinatorLayout.getLeft();
    }

    @Override // hd.d
    public int j() {
        return 1;
    }

    @Override // hd.d
    public boolean k(float f10) {
        return f10 > 0.0f;
    }

    @Override // hd.d
    public boolean l(@NonNull View view) {
        return view.getRight() < (d() - e()) / 2;
    }

    @Override // hd.d
    public boolean m(float f10, float f11) {
        return e.a(f10, f11) && Math.abs(f10) > ((float) this.f19190a.o0());
    }

    @Override // hd.d
    public boolean n(@NonNull View view, float f10) {
        return Math.abs(((float) view.getLeft()) + (f10 * this.f19190a.i0())) > this.f19190a.j0();
    }

    @Override // hd.d
    public void o(@NonNull ViewGroup.MarginLayoutParams marginLayoutParams, int i10) {
        marginLayoutParams.leftMargin = i10;
    }

    @Override // hd.d
    public void p(@NonNull ViewGroup.MarginLayoutParams marginLayoutParams, int i10, int i11) {
        if (i10 <= this.f19190a.n0()) {
            marginLayoutParams.leftMargin = i11;
        }
    }
}
