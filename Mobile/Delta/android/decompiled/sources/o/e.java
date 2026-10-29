package o;

import android.content.Context;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public class e extends b implements androidx.appcompat.view.menu.e.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Context f26931c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ActionBarContextView f26932d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public b.a f26933e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public WeakReference<View> f26934f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f26935g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f26936h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public androidx.appcompat.view.menu.e f26937i;

    public e(Context context, ActionBarContextView actionBarContextView, b.a aVar, boolean z10) {
        this.f26931c = context;
        this.f26932d = actionBarContextView;
        this.f26933e = aVar;
        androidx.appcompat.view.menu.e eVarT = new androidx.appcompat.view.menu.e(actionBarContextView.getContext()).T(1);
        this.f26937i = eVarT;
        eVarT.S(this);
        this.f26936h = z10;
    }

    @Override // androidx.appcompat.view.menu.e.a
    public boolean a(@NonNull androidx.appcompat.view.menu.e eVar, @NonNull MenuItem menuItem) {
        return this.f26933e.c(this, menuItem);
    }

    @Override // androidx.appcompat.view.menu.e.a
    public void b(@NonNull androidx.appcompat.view.menu.e eVar) {
        k();
        this.f26932d.l();
    }

    @Override // o.b
    public void c() {
        if (this.f26935g) {
            return;
        }
        this.f26935g = true;
        this.f26933e.b(this);
    }

    @Override // o.b
    public View d() {
        WeakReference<View> weakReference = this.f26934f;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    @Override // o.b
    public Menu e() {
        return this.f26937i;
    }

    @Override // o.b
    public MenuInflater f() {
        return new g(this.f26932d.getContext());
    }

    @Override // o.b
    public CharSequence g() {
        return this.f26932d.getSubtitle();
    }

    @Override // o.b
    public CharSequence i() {
        return this.f26932d.getTitle();
    }

    @Override // o.b
    public void k() {
        this.f26933e.d(this, this.f26937i);
    }

    @Override // o.b
    public boolean l() {
        return this.f26932d.j();
    }

    @Override // o.b
    public void m(View view) {
        this.f26932d.setCustomView(view);
        this.f26934f = view != null ? new WeakReference<>(view) : null;
    }

    @Override // o.b
    public void n(int i10) {
        o(this.f26931c.getString(i10));
    }

    @Override // o.b
    public void o(CharSequence charSequence) {
        this.f26932d.setSubtitle(charSequence);
    }

    @Override // o.b
    public void q(int i10) {
        r(this.f26931c.getString(i10));
    }

    @Override // o.b
    public void r(CharSequence charSequence) {
        this.f26932d.setTitle(charSequence);
    }

    @Override // o.b
    public void s(boolean z10) {
        super.s(z10);
        this.f26932d.setTitleOptional(z10);
    }
}
