package f4;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MenuItem;
import android.view.View;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a0<?> f15618a;

    public y(a0<?> a0Var) {
        this.f15618a = a0Var;
    }

    @NonNull
    public static y b(@NonNull a0<?> a0Var) {
        return new y((a0) x2.g.h(a0Var, "callbacks == null"));
    }

    public void a(q qVar) {
        k0 fragmentManager = this.f15618a.getFragmentManager();
        a0<?> a0Var = this.f15618a;
        fragmentManager.p(a0Var, a0Var, qVar);
    }

    public void c() {
        this.f15618a.getFragmentManager().C();
    }

    public boolean d(@NonNull MenuItem menuItem) {
        return this.f15618a.getFragmentManager().F(menuItem);
    }

    public void e() {
        this.f15618a.getFragmentManager().G();
    }

    public void f() {
        this.f15618a.getFragmentManager().I();
    }

    public void g() {
        this.f15618a.getFragmentManager().R();
    }

    public void h() {
        this.f15618a.getFragmentManager().V();
    }

    public void i() {
        this.f15618a.getFragmentManager().W();
    }

    public void j() {
        this.f15618a.getFragmentManager().Y();
    }

    public boolean k() {
        return this.f15618a.getFragmentManager().f0(true);
    }

    @NonNull
    public k0 l() {
        return this.f15618a.getFragmentManager();
    }

    public void m() {
        this.f15618a.getFragmentManager().X0();
    }

    public View n(View view, @NonNull String str, @NonNull Context context, @NonNull AttributeSet attributeSet) {
        return this.f15618a.getFragmentManager().B0().onCreateView(view, str, context, attributeSet);
    }
}
