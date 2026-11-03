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
    public Context f27496c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ActionBarContextView f27497d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public b.a f27498e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public WeakReference<View> f27499f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f27500g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f27501h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public androidx.appcompat.view.menu.e f27502i;

    public e(Context context, ActionBarContextView actionBarContextView, b.a aVar, boolean z10) {
        this.f27496c = context;
        this.f27497d = actionBarContextView;
        this.f27498e = aVar;
        androidx.appcompat.view.menu.e eVarT = new androidx.appcompat.view.menu.e(actionBarContextView.getContext()).T(1);
        this.f27502i = eVarT;
        eVarT.S(this);
        this.f27501h = z10;
    }

    @Override // androidx.appcompat.view.menu.e.a
    public boolean a(@NonNull androidx.appcompat.view.menu.e eVar, @NonNull MenuItem menuItem) {
        return this.f27498e.c(this, menuItem);
    }

    @Override // androidx.appcompat.view.menu.e.a
    public void b(@NonNull androidx.appcompat.view.menu.e eVar) {
        k();
        this.f27497d.l();
    }

    @Override // o.b
    public void c() {
        if (this.f27500g) {
            return;
        }
        this.f27500g = true;
        this.f27498e.b(this);
    }

    @Override // o.b
    public View d() {
        WeakReference<View> weakReference = this.f27499f;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    @Override // o.b
    public Menu e() {
        return this.f27502i;
    }

    @Override // o.b
    public MenuInflater f() {
        return new g(this.f27497d.getContext());
    }

    @Override // o.b
    public CharSequence g() {
        return this.f27497d.getSubtitle();
    }

    @Override // o.b
    public CharSequence i() {
        return this.f27497d.getTitle();
    }

    @Override // o.b
    public void k() {
        this.f27498e.d(this, this.f27502i);
    }

    @Override // o.b
    public boolean l() {
        return this.f27497d.j();
    }

    @Override // o.b
    public void m(View view) {
        this.f27497d.setCustomView(view);
        this.f27499f = view != null ? new WeakReference<>(view) : null;
    }

    @Override // o.b
    public void n(int i10) {
        o(this.f27496c.getString(i10));
    }

    @Override // o.b
    public void o(CharSequence charSequence) {
        this.f27497d.setSubtitle(charSequence);
    }

    @Override // o.b
    public void q(int i10) {
        r(this.f27496c.getString(i10));
    }

    @Override // o.b
    public void r(CharSequence charSequence) {
        this.f27497d.setTitle(charSequence);
    }

    @Override // o.b
    public void s(boolean z10) {
        super.s(z10);
        this.f27497d.setTitleOptional(z10);
    }
}
