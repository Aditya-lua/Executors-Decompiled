package jd;

import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.sidesheet.SideSheetBehavior;

/* JADX INFO: loaded from: classes2.dex */
public final class b extends d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SideSheetBehavior<? extends View> f20701a;

    public b(@NonNull SideSheetBehavior<? extends View> sideSheetBehavior) {
        this.f20701a = sideSheetBehavior;
    }

    @Override // jd.d
    public int a(@NonNull ViewGroup.MarginLayoutParams marginLayoutParams) {
        return marginLayoutParams.rightMargin;
    }

    @Override // jd.d
    public float b(int i10) {
        float fE = e();
        return (fE - i10) / (fE - d());
    }

    @Override // jd.d
    public int c(@NonNull ViewGroup.MarginLayoutParams marginLayoutParams) {
        return marginLayoutParams.rightMargin;
    }

    @Override // jd.d
    public int d() {
        return Math.max(0, (e() - this.f20701a.d0()) - this.f20701a.k0());
    }

    @Override // jd.d
    public int e() {
        return this.f20701a.n0();
    }

    @Override // jd.d
    public int f() {
        return this.f20701a.n0();
    }

    @Override // jd.d
    public int g() {
        return d();
    }

    @Override // jd.d
    public <V extends View> int h(@NonNull V v8) {
        return v8.getLeft() - this.f20701a.k0();
    }

    @Override // jd.d
    public int i(@NonNull CoordinatorLayout coordinatorLayout) {
        return coordinatorLayout.getRight();
    }

    @Override // jd.d
    public int j() {
        return 0;
    }

    @Override // jd.d
    public boolean k(float f10) {
        return f10 < 0.0f;
    }

    @Override // jd.d
    public boolean l(@NonNull View view) {
        return view.getLeft() > (e() + d()) / 2;
    }

    @Override // jd.d
    public boolean m(float f10, float f11) {
        return e.a(f10, f11) && Math.abs(f10) > ((float) this.f20701a.o0());
    }

    @Override // jd.d
    public boolean n(@NonNull View view, float f10) {
        return Math.abs(((float) view.getRight()) + (f10 * this.f20701a.i0())) > this.f20701a.j0();
    }

    @Override // jd.d
    public void o(@NonNull ViewGroup.MarginLayoutParams marginLayoutParams, int i10) {
        marginLayoutParams.rightMargin = i10;
    }

    @Override // jd.d
    public void p(@NonNull ViewGroup.MarginLayoutParams marginLayoutParams, int i10, int i11) {
        int iN0 = this.f20701a.n0();
        if (i10 <= iN0) {
            marginLayoutParams.rightMargin = iN0 - i10;
        }
    }
}
