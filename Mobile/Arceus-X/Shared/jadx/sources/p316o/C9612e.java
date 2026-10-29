package p316o;

import android.content.Context;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.appcompat.view.menu.C0415e;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: o.e */
/* JADX INFO: loaded from: classes.dex */
public class C9612e extends AbstractC9609b implements C0415e.a {

    /* JADX INFO: renamed from: c */
    public Context f34837c;

    /* JADX INFO: renamed from: d */
    public ActionBarContextView f34838d;

    /* JADX INFO: renamed from: e */
    public AbstractC9609b.a f34839e;

    /* JADX INFO: renamed from: f */
    public WeakReference<View> f34840f;

    /* JADX INFO: renamed from: g */
    public boolean f34841g;

    /* JADX INFO: renamed from: h */
    public boolean f34842h;

    /* JADX INFO: renamed from: i */
    public C0415e f34843i;

    public C9612e(Context context, ActionBarContextView actionBarContextView, AbstractC9609b.a aVar, boolean z10) {
        this.f34837c = context;
        this.f34838d = actionBarContextView;
        this.f34839e = aVar;
        C0415e c0415eM1619T = new C0415e(actionBarContextView.getContext()).m1619T(1);
        this.f34843i = c0415eM1619T;
        c0415eM1619T.mo1618S(this);
        this.f34842h = z10;
    }

    @Override // androidx.appcompat.view.menu.C0415e.a
    /* JADX INFO: renamed from: a */
    public boolean mo1656a(@NonNull C0415e c0415e, @NonNull MenuItem menuItem) {
        return this.f34839e.mo29574c(this, menuItem);
    }

    @Override // androidx.appcompat.view.menu.C0415e.a
    /* JADX INFO: renamed from: b */
    public void mo1657b(@NonNull C0415e c0415e) {
        mo29664k();
        this.f34838d.m1715l();
    }

    @Override // p316o.AbstractC9609b
    /* JADX INFO: renamed from: c */
    public void mo29658c() {
        if (this.f34841g) {
            return;
        }
        this.f34841g = true;
        this.f34839e.mo29573b(this);
    }

    @Override // p316o.AbstractC9609b
    /* JADX INFO: renamed from: d */
    public View mo29659d() {
        WeakReference<View> weakReference = this.f34840f;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    @Override // p316o.AbstractC9609b
    /* JADX INFO: renamed from: e */
    public Menu mo29660e() {
        return this.f34843i;
    }

    @Override // p316o.AbstractC9609b
    /* JADX INFO: renamed from: f */
    public MenuInflater mo29661f() {
        return new C9614g(this.f34838d.getContext());
    }

    @Override // p316o.AbstractC9609b
    /* JADX INFO: renamed from: g */
    public CharSequence mo29662g() {
        return this.f34838d.getSubtitle();
    }

    @Override // p316o.AbstractC9609b
    /* JADX INFO: renamed from: i */
    public CharSequence mo29663i() {
        return this.f34838d.getTitle();
    }

    @Override // p316o.AbstractC9609b
    /* JADX INFO: renamed from: k */
    public void mo29664k() {
        this.f34839e.mo29575d(this, this.f34843i);
    }

    @Override // p316o.AbstractC9609b
    /* JADX INFO: renamed from: l */
    public boolean mo29665l() {
        return this.f34838d.m1713j();
    }

    @Override // p316o.AbstractC9609b
    /* JADX INFO: renamed from: m */
    public void mo29666m(View view) {
        this.f34838d.setCustomView(view);
        this.f34840f = view != null ? new WeakReference<>(view) : null;
    }

    @Override // p316o.AbstractC9609b
    /* JADX INFO: renamed from: n */
    public void mo29667n(int i10) {
        mo29668o(this.f34837c.getString(i10));
    }

    @Override // p316o.AbstractC9609b
    /* JADX INFO: renamed from: o */
    public void mo29668o(CharSequence charSequence) {
        this.f34838d.setSubtitle(charSequence);
    }

    @Override // p316o.AbstractC9609b
    /* JADX INFO: renamed from: q */
    public void mo29669q(int i10) {
        mo29670r(this.f34837c.getString(i10));
    }

    @Override // p316o.AbstractC9609b
    /* JADX INFO: renamed from: r */
    public void mo29670r(CharSequence charSequence) {
        this.f34838d.setTitle(charSequence);
    }

    @Override // p316o.AbstractC9609b
    /* JADX INFO: renamed from: s */
    public void mo29671s(boolean z10) {
        super.mo29671s(z10);
        this.f34838d.setTitleOptional(z10);
    }
}
