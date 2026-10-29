package p316o;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import java.util.ArrayList;
import p346p.MenuC10081e;
import p346p.MenuItemC10079c;
import p399r2.InterfaceMenuC10777a;
import p399r2.InterfaceMenuItemC10778b;
import p504w1.C12286j;

/* JADX INFO: renamed from: o.f */
/* JADX INFO: loaded from: classes.dex */
public class C9613f extends ActionMode {

    /* JADX INFO: renamed from: a */
    public final Context f34844a;

    /* JADX INFO: renamed from: b */
    public final AbstractC9609b f34845b;

    /* JADX INFO: renamed from: o.f$a */
    public static class a implements AbstractC9609b.a {

        /* JADX INFO: renamed from: a */
        public final ActionMode.Callback f34846a;

        /* JADX INFO: renamed from: b */
        public final Context f34847b;

        /* JADX INFO: renamed from: c */
        public final ArrayList<C9613f> f34848c = new ArrayList<>();

        /* JADX INFO: renamed from: d */
        public final C12286j<Menu, Menu> f34849d = new C12286j<>();

        public a(Context context, ActionMode.Callback callback) {
            this.f34847b = context;
            this.f34846a = callback;
        }

        @Override // p316o.AbstractC9609b.a
        /* JADX INFO: renamed from: a */
        public boolean mo29572a(AbstractC9609b abstractC9609b, Menu menu) {
            return this.f34846a.onCreateActionMode(m37927e(abstractC9609b), m37928f(menu));
        }

        @Override // p316o.AbstractC9609b.a
        /* JADX INFO: renamed from: b */
        public void mo29573b(AbstractC9609b abstractC9609b) {
            this.f34846a.onDestroyActionMode(m37927e(abstractC9609b));
        }

        @Override // p316o.AbstractC9609b.a
        /* JADX INFO: renamed from: c */
        public boolean mo29574c(AbstractC9609b abstractC9609b, MenuItem menuItem) {
            return this.f34846a.onActionItemClicked(m37927e(abstractC9609b), new MenuItemC10079c(this.f34847b, (InterfaceMenuItemC10778b) menuItem));
        }

        @Override // p316o.AbstractC9609b.a
        /* JADX INFO: renamed from: d */
        public boolean mo29575d(AbstractC9609b abstractC9609b, Menu menu) {
            return this.f34846a.onPrepareActionMode(m37927e(abstractC9609b), m37928f(menu));
        }

        /* JADX INFO: renamed from: e */
        public ActionMode m37927e(AbstractC9609b abstractC9609b) {
            int size = this.f34848c.size();
            for (int i10 = 0; i10 < size; i10++) {
                C9613f c9613f = this.f34848c.get(i10);
                if (c9613f != null && c9613f.f34845b == abstractC9609b) {
                    return c9613f;
                }
            }
            C9613f c9613f2 = new C9613f(this.f34847b, abstractC9609b);
            this.f34848c.add(c9613f2);
            return c9613f2;
        }

        /* JADX INFO: renamed from: f */
        public final Menu m37928f(Menu menu) {
            Menu menu2 = this.f34849d.get(menu);
            if (menu2 != null) {
                return menu2;
            }
            MenuC10081e menuC10081e = new MenuC10081e(this.f34847b, (InterfaceMenuC10777a) menu);
            this.f34849d.put(menu, menuC10081e);
            return menuC10081e;
        }
    }

    public C9613f(Context context, AbstractC9609b abstractC9609b) {
        this.f34844a = context;
        this.f34845b = abstractC9609b;
    }

    @Override // android.view.ActionMode
    public void finish() {
        this.f34845b.mo29658c();
    }

    @Override // android.view.ActionMode
    public View getCustomView() {
        return this.f34845b.mo29659d();
    }

    @Override // android.view.ActionMode
    public Menu getMenu() {
        return new MenuC10081e(this.f34844a, (InterfaceMenuC10777a) this.f34845b.mo29660e());
    }

    @Override // android.view.ActionMode
    public MenuInflater getMenuInflater() {
        return this.f34845b.mo29661f();
    }

    @Override // android.view.ActionMode
    public CharSequence getSubtitle() {
        return this.f34845b.mo29662g();
    }

    @Override // android.view.ActionMode
    public Object getTag() {
        return this.f34845b.m37918h();
    }

    @Override // android.view.ActionMode
    public CharSequence getTitle() {
        return this.f34845b.mo29663i();
    }

    @Override // android.view.ActionMode
    public boolean getTitleOptionalHint() {
        return this.f34845b.m37919j();
    }

    @Override // android.view.ActionMode
    public void invalidate() {
        this.f34845b.mo29664k();
    }

    @Override // android.view.ActionMode
    public boolean isTitleOptional() {
        return this.f34845b.mo29665l();
    }

    @Override // android.view.ActionMode
    public void setCustomView(View view) {
        this.f34845b.mo29666m(view);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.ActionMode
    public void setSubtitle(CharSequence charSequence) {
        this.f34845b.mo29668o(charSequence);
    }

    @Override // android.view.ActionMode
    public void setTag(Object obj) {
        this.f34845b.m37920p(obj);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.ActionMode
    public void setTitle(CharSequence charSequence) {
        this.f34845b.mo29670r(charSequence);
    }

    @Override // android.view.ActionMode
    public void setTitleOptionalHint(boolean z10) {
        this.f34845b.mo29671s(z10);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @Override // android.view.ActionMode
    public void setSubtitle(int i10) {
        this.f34845b.mo29667n(i10);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @Override // android.view.ActionMode
    public void setTitle(int i10) {
        this.f34845b.mo29669q(i10);
    }
}
