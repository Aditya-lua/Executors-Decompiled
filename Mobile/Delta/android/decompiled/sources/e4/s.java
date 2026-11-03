package e4;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MenuItem;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.fragment.app.FragmentManager;

/* JADX INFO: loaded from: classes.dex */
public class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t<?> f15771a;

    public s(t<?> tVar) {
        this.f15771a = tVar;
    }

    @NonNull
    public static s b(@NonNull t<?> tVar) {
        return new s((t) x2.g.h(tVar, "callbacks == null"));
    }

    public void a(androidx.fragment.app.c cVar) {
        FragmentManager fragmentManagerH = this.f15771a.getFragmentManager();
        t<?> tVar = this.f15771a;
        fragmentManagerH.p(tVar, tVar, cVar);
    }

    public void c() {
        this.f15771a.getFragmentManager().C();
    }

    public boolean d(@NonNull MenuItem menuItem) {
        return this.f15771a.getFragmentManager().F(menuItem);
    }

    public void e() {
        this.f15771a.getFragmentManager().G();
    }

    public void f() {
        this.f15771a.getFragmentManager().I();
    }

    public void g() {
        this.f15771a.getFragmentManager().R();
    }

    public void h() {
        this.f15771a.getFragmentManager().V();
    }

    public void i() {
        this.f15771a.getFragmentManager().W();
    }

    public void j() {
        this.f15771a.getFragmentManager().Y();
    }

    public boolean k() {
        return this.f15771a.getFragmentManager().f0(true);
    }

    @NonNull
    public FragmentManager l() {
        return this.f15771a.getFragmentManager();
    }

    public void m() {
        this.f15771a.getFragmentManager().X0();
    }

    public View n(View view, @NonNull String str, @NonNull Context context, @NonNull AttributeSet attributeSet) {
        return this.f15771a.getFragmentManager().B0().onCreateView(view, str, context, attributeSet);
    }
}
