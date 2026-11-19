package jd;

import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.sidesheet.SideSheetBehavior;

/* JADX INFO: loaded from: classes2.dex */
public final class a extends d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SideSheetBehavior<? extends View> f20700a;

    public a(@NonNull SideSheetBehavior<? extends View> sideSheetBehavior) {
        this.f20700a = sideSheetBehavior;
    }

    @Override // jd.d
    public int a(@NonNull ViewGroup.MarginLayoutParams marginLayoutParams) {
        return marginLayoutParams.leftMargin;
    }

    @Override // jd.d
    public float b(int i10) {
        float fE = e();
        return (i10 - fE) / (d() - fE);
    }

    @Override // jd.d
    public int c(@NonNull ViewGroup.MarginLayoutParams marginLayoutParams) {
        return marginLayoutParams.leftMargin;
    }

    @Override // jd.d
    public int d() {
        return Math.max(0, this.f20700a.m0() + this.f20700a.k0());
    }

    @Override // jd.d
    public int e() {
        return (-this.f20700a.d0()) - this.f20700a.k0();
    }

    @Override // jd.d
    public int f() {
        return this.f20700a.k0();
    }

    @Override // jd.d
    public int g() {
        return -this.f20700a.d0();
    }

    @Override // jd.d
    public <V extends View> int h(@NonNull V v8) {
        return v8.getRight() + this.f20700a.k0();
    }

    @Override // jd.d
    public int i(@NonNull CoordinatorLayout coordinatorLayout) {
        return coordinatorLayout.getLeft();
    }

    @Override // jd.d
    public int j() {
        return 1;
    }

    @Override // jd.d
    public boolean k(float f10) {
        return f10 > 0.0f;
    }

    @Override // jd.d
    public boolean l(@NonNull View view) {
        return view.getRight() < (d() - e()) / 2;
    }

    @Override // jd.d
    public boolean m(float f10, float f11) {
        return e.a(f10, f11) && Math.abs(f10) > ((float) this.f20700a.o0());
    }

    @Override // jd.d
    public boolean n(@NonNull View view, float f10) {
        return Math.abs(((float) view.getLeft()) + (f10 * this.f20700a.i0())) > this.f20700a.j0();
    }

    @Override // jd.d
    public void o(@NonNull ViewGroup.MarginLayoutParams marginLayoutParams, int i10) {
        marginLayoutParams.leftMargin = i10;
    }

    @Override // jd.d
    public void p(@NonNull ViewGroup.MarginLayoutParams marginLayoutParams, int i10, int i11) {
        if (i10 <= this.f20700a.n0()) {
            marginLayoutParams.leftMargin = i11;
        }
    }
}
