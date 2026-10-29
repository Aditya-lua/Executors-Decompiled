package o;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import java.util.ArrayList;
import w1.j;

/* JADX INFO: loaded from: classes.dex */
public class f extends ActionMode {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f26938a;
    public final b b;

    public static class a implements b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ActionMode.Callback f26939a;
        public final Context b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final ArrayList<f> f26940c = new ArrayList<>();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final j<Menu, Menu> f26941d = new j<>();

        public a(Context context, ActionMode.Callback callback) {
            this.b = context;
            this.f26939a = callback;
        }

        @Override // o.b.a
        public boolean a(b bVar, Menu menu) {
            return this.f26939a.onCreateActionMode(e(bVar), f(menu));
        }

        @Override // o.b.a
        public void b(b bVar) {
            this.f26939a.onDestroyActionMode(e(bVar));
        }

        @Override // o.b.a
        public boolean c(b bVar, MenuItem menuItem) {
            return this.f26939a.onActionItemClicked(e(bVar), new p.c(this.b, (r2.b) menuItem));
        }

        @Override // o.b.a
        public boolean d(b bVar, Menu menu) {
            return this.f26939a.onPrepareActionMode(e(bVar), f(menu));
        }

        public ActionMode e(b bVar) {
            int size = this.f26940c.size();
            for (int i10 = 0; i10 < size; i10++) {
                f fVar = this.f26940c.get(i10);
                if (fVar != null && fVar.b == bVar) {
                    return fVar;
                }
            }
            f fVar2 = new f(this.b, bVar);
            this.f26940c.add(fVar2);
            return fVar2;
        }

        public final Menu f(Menu menu) {
            Menu menu2 = this.f26941d.get(menu);
            if (menu2 != null) {
                return menu2;
            }
            p.e eVar = new p.e(this.b, (r2.a) menu);
            this.f26941d.put(menu, eVar);
            return eVar;
        }
    }

    public f(Context context, b bVar) {
        this.f26938a = context;
        this.b = bVar;
    }

    @Override // android.view.ActionMode
    public void finish() {
        this.b.c();
    }

    @Override // android.view.ActionMode
    public View getCustomView() {
        return this.b.d();
    }

    @Override // android.view.ActionMode
    public Menu getMenu() {
        return new p.e(this.f26938a, (r2.a) this.b.e());
    }

    @Override // android.view.ActionMode
    public MenuInflater getMenuInflater() {
        return this.b.f();
    }

    @Override // android.view.ActionMode
    public CharSequence getSubtitle() {
        return this.b.g();
    }

    @Override // android.view.ActionMode
    public Object getTag() {
        return this.b.h();
    }

    @Override // android.view.ActionMode
    public CharSequence getTitle() {
        return this.b.i();
    }

    @Override // android.view.ActionMode
    public boolean getTitleOptionalHint() {
        return this.b.j();
    }

    @Override // android.view.ActionMode
    public void invalidate() {
        this.b.k();
    }

    @Override // android.view.ActionMode
    public boolean isTitleOptional() {
        return this.b.l();
    }

    @Override // android.view.ActionMode
    public void setCustomView(View view) {
        this.b.m(view);
    }

    @Override // android.view.ActionMode
    public void setSubtitle(CharSequence charSequence) {
        this.b.o(charSequence);
    }

    @Override // android.view.ActionMode
    public void setTag(Object obj) {
        this.b.p(obj);
    }

    @Override // android.view.ActionMode
    public void setTitle(CharSequence charSequence) {
        this.b.r(charSequence);
    }

    @Override // android.view.ActionMode
    public void setTitleOptionalHint(boolean z10) {
        this.b.s(z10);
    }

    @Override // android.view.ActionMode
    public void setSubtitle(int i10) {
        this.b.n(i10);
    }

    @Override // android.view.ActionMode
    public void setTitle(int i10) {
        this.b.q(i10);
    }
}
