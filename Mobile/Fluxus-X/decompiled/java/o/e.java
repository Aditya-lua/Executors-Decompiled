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
    public Context f26648c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ActionBarContextView f26649d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public b.a f26650e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public WeakReference<View> f26651f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f26652g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f26653h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public androidx.appcompat.view.menu.e f26654i;

    public e(Context context, ActionBarContextView actionBarContextView, b.a aVar, boolean z10) {
        this.f26648c = context;
        this.f26649d = actionBarContextView;
        this.f26650e = aVar;
        androidx.appcompat.view.menu.e eVarT = new androidx.appcompat.view.menu.e(actionBarContextView.getContext()).T(1);
        this.f26654i = eVarT;
        eVarT.S(this);
        this.f26653h = z10;
    }

    @Override // androidx.appcompat.view.menu.e.a
    public boolean a(@NonNull androidx.appcompat.view.menu.e eVar, @NonNull MenuItem menuItem) {
        return this.f26650e.c(this, menuItem);
    }

    @Override // androidx.appcompat.view.menu.e.a
    public void b(@NonNull androidx.appcompat.view.menu.e eVar) {
        k();
        this.f26649d.l();
    }

    @Override // o.b
    public void c() {
        if (this.f26652g) {
            return;
        }
        this.f26652g = true;
        this.f26650e.b(this);
    }

    @Override // o.b
    public View d() {
        WeakReference<View> weakReference = this.f26651f;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    @Override // o.b
    public Menu e() {
        return this.f26654i;
    }

    @Override // o.b
    public MenuInflater f() {
        return new g(this.f26649d.getContext());
    }

    @Override // o.b
    public CharSequence g() {
        return this.f26649d.getSubtitle();
    }

    @Override // o.b
    public CharSequence i() {
        return this.f26649d.getTitle();
    }

    @Override // o.b
    public void k() {
        this.f26650e.d(this, this.f26654i);
    }

    @Override // o.b
    public boolean l() {
        return this.f26649d.j();
    }

    @Override // o.b
    public void m(View view) {
        this.f26649d.setCustomView(view);
        this.f26651f = view != null ? new WeakReference<>(view) : null;
    }

    @Override // o.b
    public void n(int i10) {
        o(this.f26648c.getString(i10));
    }

    @Override // o.b
    public void o(CharSequence charSequence) {
        this.f26649d.setSubtitle(charSequence);
    }

    @Override // o.b
    public void q(int i10) {
        r(this.f26648c.getString(i10));
    }

    @Override // o.b
    public void r(CharSequence charSequence) {
        this.f26649d.setTitle(charSequence);
    }

    @Override // o.b
    public void s(boolean z10) {
        super.s(z10);
        this.f26649d.setTitleOptional(z10);
    }
}
