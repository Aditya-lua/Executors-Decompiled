package xi;

import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import androidx.appcompat.widget.SearchView;
import com.roblox.client.components.RobloxToolbar;
import gk.p;
import gk.s;
import sg.e2;
import sg.l0;
import sg.m0;
import sg.o0;
import sg.q0;
import sg.t0;

/* JADX INFO: loaded from: classes2.dex */
public class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public androidx.fragment.app.c f35208a;
    public MenuItem b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Menu f35209c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public RobloxToolbar f35210d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public e f35211e;

    public class a implements MenuItem.OnActionExpandListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ SearchView f35212a;

        /* JADX INFO: renamed from: xi.f$a$a, reason: collision with other inner class name */
        public class RunnableC0641a implements Runnable {
            public RunnableC0641a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                eh.h.c(f.this.f35210d, f.this.i());
            }
        }

        public a(SearchView searchView) {
            this.f35212a = searchView;
        }

        @Override // android.view.MenuItem.OnActionExpandListener
        public boolean onMenuItemActionCollapse(MenuItem menuItem) {
            f fVar = f.this;
            fVar.m(fVar.f35209c, f.this.b, true);
            f fVar2 = f.this;
            fVar2.l(fVar2.f35211e.d(), "searchClose");
            return true;
        }

        @Override // android.view.MenuItem.OnActionExpandListener
        public boolean onMenuItemActionExpand(MenuItem menuItem) {
            if (f.this.f35210d != null) {
                this.f35212a.post(new RunnableC0641a());
            }
            f fVar = f.this;
            fVar.m(fVar.f35209c, f.this.b, false);
            f fVar2 = f.this;
            fVar2.l(fVar2.f35211e.d(), "searchOpen");
            return true;
        }
    }

    public class b implements SearchView.m {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ SearchView f35214a;

        public b(SearchView searchView) {
            this.f35214a = searchView;
        }

        @Override // androidx.appcompat.widget.SearchView.m
        public boolean a(String str) {
            return f.this.f35211e.a(str);
        }

        @Override // androidx.appcompat.widget.SearchView.m
        public boolean b(String str) {
            return f.this.f35211e.b(this.f35214a, str);
        }
    }

    public class c implements View.OnFocusChangeListener {
        public c() {
        }

        @Override // android.view.View.OnFocusChangeListener
        public void onFocusChange(View view, boolean z10) {
            p.h("SearchMenuOption", "... onFocusChange: hasFocus = " + z10);
            if (z10) {
                return;
            }
            if (f.this.f35208a != null) {
                e2.h(f.this.f35208a.p());
            }
            f.this.b.collapseActionView();
        }
    }

    public static /* synthetic */ class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f35216a;

        static {
            int[] iArr = new int[ol.a.values().length];
            f35216a = iArr;
            try {
                iArr[ol.a.LIGHT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f35216a[ol.a.CLASSIC.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f35216a[ol.a.DARK.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public interface e extends dk.c {
        boolean a(String str);

        boolean b(SearchView searchView, String str);

        String c();

        int d();
    }

    public f(androidx.fragment.app.c cVar) {
        this.f35208a = cVar;
    }

    public final int i() {
        int i10 = d.f35216a[this.f35211e.getTheme().ordinal()];
        if (i10 != 1) {
            return i10 != 2 ? l0.f30811o : l0.f30810n;
        }
        return l0.f30812p;
    }

    public final int j() {
        int i10 = d.f35216a[this.f35211e.getTheme().ordinal()];
        if (i10 != 1) {
            return i10 != 2 ? l0.A : l0.f30822z;
        }
        return l0.B;
    }

    public MenuItem k(Menu menu, MenuInflater menuInflater) {
        menuInflater.inflate(o0.f30906c, menu);
        MenuItem menuItemFindItem = menu.findItem(m0.f30828c);
        this.b = menuItemFindItem;
        menuItemFindItem.setIcon(this.f35208a.T().getDrawable(j()));
        q();
        return this.b;
    }

    public final void l(int i10, String str) {
        p.h("SearchMenuOption", "reportEvents: searchType = " + i10 + ", buttonEvent = " + str);
        if (i10 == 1) {
            t0.e("nativeMain", str, "users");
            return;
        }
        if (i10 == 2) {
            t0.e("nativeMain", str, "games");
        } else if (i10 == 3) {
            t0.e("nativeMain", str, "catalog");
        } else {
            if (i10 != 4) {
                return;
            }
            t0.d("nativeMain|friends", str);
        }
    }

    public final void m(Menu menu, MenuItem menuItem, boolean z10) {
        if (menu != null) {
            for (int i10 = 0; i10 < menu.size(); i10++) {
                MenuItem item = menu.getItem(i10);
                if (item != menuItem) {
                    item.setVisible(z10);
                }
            }
        }
    }

    public void n(Menu menu) {
        this.f35209c = menu;
    }

    public void o(e eVar) {
        this.f35211e = eVar;
    }

    public void p(RobloxToolbar robloxToolbar) {
        this.f35210d = robloxToolbar;
    }

    public final void q() {
        SearchView searchView = (SearchView) this.b.getActionView();
        this.b.setOnActionExpandListener(new a(searchView));
        EditText editText = (EditText) searchView.findViewById(i.f.I);
        editText.setTextColor(-16777216);
        editText.setHintTextColor(-7829368);
        eh.e.d(editText, editText.getContext(), "SourceSansPro-Regular.ttf");
        searchView.findViewById(i.f.H).setBackgroundResource(l0.f30809m);
        searchView.setQueryHint(searchView.getContext().getString(q0.C1));
        searchView.setOnQueryTextListener(new b(searchView));
        editText.setOnFocusChangeListener(new c());
    }

    public void r() {
        ((SearchView) this.b.getActionView()).setQueryHint(this.f35211e.c());
        boolean z10 = (s.j() && this.f35211e.d() == 2) ? false : true;
        this.b.setVisible(z10);
        this.b.setEnabled(z10);
    }
}
