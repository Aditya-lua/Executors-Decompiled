package vi;

import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import androidx.appcompat.widget.SearchView;
import com.roblox.client.components.RobloxToolbar;
import ek.q;
import ek.t;
import rg.e2;
import rg.l0;
import rg.m0;
import rg.o0;
import rg.q0;
import rg.t0;

/* JADX INFO: loaded from: classes2.dex */
public class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public androidx.fragment.app.c f33530a;
    public MenuItem b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Menu f33531c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public RobloxToolbar f33532d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public e f33533e;

    public class a implements MenuItem.OnActionExpandListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ SearchView f33534a;

        /* JADX INFO: renamed from: vi.f$a$a, reason: collision with other inner class name */
        public class RunnableC0613a implements Runnable {
            public RunnableC0613a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                dh.h.c(f.this.f33532d, f.this.i());
            }
        }

        public a(SearchView searchView) {
            this.f33534a = searchView;
        }

        @Override // android.view.MenuItem.OnActionExpandListener
        public boolean onMenuItemActionCollapse(MenuItem menuItem) {
            f fVar = f.this;
            fVar.m(fVar.f33531c, f.this.b, true);
            f fVar2 = f.this;
            fVar2.l(fVar2.f33533e.d(), "searchClose");
            return true;
        }

        @Override // android.view.MenuItem.OnActionExpandListener
        public boolean onMenuItemActionExpand(MenuItem menuItem) {
            if (f.this.f33532d != null) {
                this.f33534a.post(new RunnableC0613a());
            }
            f fVar = f.this;
            fVar.m(fVar.f33531c, f.this.b, false);
            f fVar2 = f.this;
            fVar2.l(fVar2.f33533e.d(), "searchOpen");
            return true;
        }
    }

    public class b implements SearchView.m {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ SearchView f33536a;

        public b(SearchView searchView) {
            this.f33536a = searchView;
        }

        @Override // androidx.appcompat.widget.SearchView.m
        public boolean a(String str) {
            return f.this.f33533e.a(str);
        }

        @Override // androidx.appcompat.widget.SearchView.m
        public boolean b(String str) {
            return f.this.f33533e.b(this.f33536a, str);
        }
    }

    public class c implements View.OnFocusChangeListener {
        public c() {
        }

        @Override // android.view.View.OnFocusChangeListener
        public void onFocusChange(View view, boolean z10) {
            q.h("SearchMenuOption", "... onFocusChange: hasFocus = " + z10);
            if (z10) {
                return;
            }
            if (f.this.f33530a != null) {
                e2.h(f.this.f33530a.p());
            }
            f.this.b.collapseActionView();
        }
    }

    public static /* synthetic */ class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f33538a;

        static {
            int[] iArr = new int[ml.a.values().length];
            f33538a = iArr;
            try {
                iArr[ml.a.LIGHT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f33538a[ml.a.CLASSIC.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f33538a[ml.a.DARK.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public interface e extends bk.c {
        boolean a(String str);

        boolean b(SearchView searchView, String str);

        String c();

        int d();
    }

    public f(androidx.fragment.app.c cVar) {
        this.f33530a = cVar;
    }

    public final int i() {
        int i10 = d.f33538a[this.f33533e.getTheme().ordinal()];
        if (i10 != 1) {
            return i10 != 2 ? l0.f30414o : l0.f30413n;
        }
        return l0.f30415p;
    }

    public final int j() {
        int i10 = d.f33538a[this.f33533e.getTheme().ordinal()];
        if (i10 != 1) {
            return i10 != 2 ? l0.A : l0.f30425z;
        }
        return l0.B;
    }

    public MenuItem k(Menu menu, MenuInflater menuInflater) {
        menuInflater.inflate(o0.f30511c, menu);
        MenuItem menuItemFindItem = menu.findItem(m0.f30431c);
        this.b = menuItemFindItem;
        menuItemFindItem.setIcon(this.f33530a.S().getDrawable(j()));
        q();
        return this.b;
    }

    public final void l(int i10, String str) {
        q.h("SearchMenuOption", "reportEvents: searchType = " + i10 + ", buttonEvent = " + str);
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
        this.f33531c = menu;
    }

    public void o(e eVar) {
        this.f33533e = eVar;
    }

    public void p(RobloxToolbar robloxToolbar) {
        this.f33532d = robloxToolbar;
    }

    public final void q() {
        SearchView searchView = (SearchView) this.b.getActionView();
        this.b.setOnActionExpandListener(new a(searchView));
        EditText editText = (EditText) searchView.findViewById(i.f.I);
        editText.setTextColor(-16777216);
        editText.setHintTextColor(-7829368);
        dh.e.d(editText, editText.getContext(), "SourceSansPro-Regular.ttf");
        searchView.findViewById(i.f.H).setBackgroundResource(l0.f30412m);
        searchView.setQueryHint(searchView.getContext().getString(q0.C1));
        searchView.setOnQueryTextListener(new b(searchView));
        editText.setOnFocusChangeListener(new c());
    }

    public void r() {
        ((SearchView) this.b.getActionView()).setQueryHint(this.f33533e.c());
        boolean z10 = (t.j() && this.f33533e.d() == 2) ? false : true;
        this.b.setVisible(z10);
        this.b.setEnabled(z10);
    }
}
