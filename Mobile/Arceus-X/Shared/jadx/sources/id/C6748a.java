package id;

import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.sidesheet.SideSheetBehavior;

/* JADX INFO: renamed from: id.a */
/* JADX INFO: loaded from: classes2.dex */
public final class C6748a extends AbstractC6751d {

    /* JADX INFO: renamed from: a */
    public final SideSheetBehavior<? extends View> f26606a;

    public C6748a(@NonNull SideSheetBehavior<? extends View> sideSheetBehavior) {
        this.f26606a = sideSheetBehavior;
    }

    @Override // id.AbstractC6751d
    /* JADX INFO: renamed from: a */
    public int mo28853a(@NonNull ViewGroup.MarginLayoutParams marginLayoutParams) {
        return marginLayoutParams.leftMargin;
    }

    @Override // id.AbstractC6751d
    /* JADX INFO: renamed from: b */
    public float mo28854b(int i10) {
        float fMo28857e = mo28857e();
        return (i10 - fMo28857e) / (mo28856d() - fMo28857e);
    }

    @Override // id.AbstractC6751d
    /* JADX INFO: renamed from: c */
    public int mo28855c(@NonNull ViewGroup.MarginLayoutParams marginLayoutParams) {
        return marginLayoutParams.leftMargin;
    }

    @Override // id.AbstractC6751d
    /* JADX INFO: renamed from: d */
    public int mo28856d() {
        return Math.max(0, this.f26606a.m12952m0() + this.f26606a.m12950k0());
    }

    @Override // id.AbstractC6751d
    /* JADX INFO: renamed from: e */
    public int mo28857e() {
        return (-this.f26606a.m12943d0()) - this.f26606a.m12950k0();
    }

    @Override // id.AbstractC6751d
    /* JADX INFO: renamed from: f */
    public int mo28858f() {
        return this.f26606a.m12950k0();
    }

    @Override // id.AbstractC6751d
    /* JADX INFO: renamed from: g */
    public int mo28859g() {
        return -this.f26606a.m12943d0();
    }

    @Override // id.AbstractC6751d
    /* JADX INFO: renamed from: h */
    public <V extends View> int mo28860h(@NonNull V v5) {
        return v5.getRight() + this.f26606a.m12950k0();
    }

    @Override // id.AbstractC6751d
    /* JADX INFO: renamed from: i */
    public int mo28861i(@NonNull CoordinatorLayout coordinatorLayout) {
        return coordinatorLayout.getLeft();
    }

    @Override // id.AbstractC6751d
    /* JADX INFO: renamed from: j */
    public int mo28862j() {
        return 1;
    }

    @Override // id.AbstractC6751d
    /* JADX INFO: renamed from: k */
    public boolean mo28863k(float f10) {
        return f10 > 0.0f;
    }

    @Override // id.AbstractC6751d
    /* JADX INFO: renamed from: l */
    public boolean mo28864l(@NonNull View view) {
        return view.getRight() < (mo28856d() - mo28857e()) / 2;
    }

    @Override // id.AbstractC6751d
    /* JADX INFO: renamed from: m */
    public boolean mo28865m(float f10, float f11) {
        return C6752e.m28871a(f10, f11) && Math.abs(f10) > ((float) this.f26606a.m12954o0());
    }

    @Override // id.AbstractC6751d
    /* JADX INFO: renamed from: n */
    public boolean mo28866n(@NonNull View view, float f10) {
        return Math.abs(((float) view.getLeft()) + (f10 * this.f26606a.m12948i0())) > this.f26606a.m12949j0();
    }

    @Override // id.AbstractC6751d
    /* JADX INFO: renamed from: o */
    public void mo28867o(@NonNull ViewGroup.MarginLayoutParams marginLayoutParams, int i10) {
        marginLayoutParams.leftMargin = i10;
    }

    @Override // id.AbstractC6751d
    /* JADX INFO: renamed from: p */
    public void mo28868p(@NonNull ViewGroup.MarginLayoutParams marginLayoutParams, int i10, int i11) {
        if (i10 <= this.f26606a.m12953n0()) {
            marginLayoutParams.leftMargin = i11;
        }
    }
}
