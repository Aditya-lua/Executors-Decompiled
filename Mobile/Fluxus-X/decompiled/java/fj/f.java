package fj;

import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import androidx.appcompat.widget.SearchView;
import bh.e2;
import bh.l0;
import bh.m0;
import bh.o0;
import bh.q0;
import bh.t0;
import com.roblox.client.components.RobloxToolbar;
import f4.q;
import ok.t;

/* JADX INFO: loaded from: classes2.dex */
public class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public q f16136a;
    public MenuItem b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Menu f16137c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public RobloxToolbar f16138d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public e f16139e;

    public class a implements MenuItem.OnActionExpandListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ SearchView f16140a;

        /* JADX INFO: renamed from: fj.f$a$a, reason: collision with other inner class name */
        public class RunnableC0300a implements Runnable {
            public RunnableC0300a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                nh.h.b(f.this.f16138d, f.this.i());
            }
        }

        public a(SearchView searchView) {
            this.f16140a = searchView;
        }

        @Override // android.view.MenuItem.OnActionExpandListener
        public boolean onMenuItemActionCollapse(MenuItem menuItem) {
            f fVar = f.this;
            fVar.m(fVar.f16137c, f.this.b, true);
            f fVar2 = f.this;
            fVar2.l(fVar2.f16139e.d(), "searchClose");
            return true;
        }

        @Override // android.view.MenuItem.OnActionExpandListener
        public boolean onMenuItemActionExpand(MenuItem menuItem) {
            if (f.this.f16138d != null) {
                this.f16140a.post(new RunnableC0300a());
            }
            f fVar = f.this;
            fVar.m(fVar.f16137c, f.this.b, false);
            f fVar2 = f.this;
            fVar2.l(fVar2.f16139e.d(), "searchOpen");
            return true;
        }
    }

    public class b implements SearchView.m {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ SearchView f16142a;

        public b(SearchView searchView) {
            this.f16142a = searchView;
        }

        @Override // androidx.appcompat.widget.SearchView.m
        public boolean a(String str) {
            return f.this.f16139e.a(str);
        }

        @Override // androidx.appcompat.widget.SearchView.m
        public boolean b(String str) {
            return f.this.f16139e.b(this.f16142a, str);
        }
    }

    public class c implements View.OnFocusChangeListener {
        public c() {
        }

        @Override // android.view.View.OnFocusChangeListener
        public void onFocusChange(View view, boolean z10) {
            ok.q.h("SearchMenuOption", "... onFocusChange: hasFocus = " + z10);
            if (z10) {
                return;
            }
            if (f.this.f16136a != null) {
                e2.h(f.this.f16136a.p());
            }
            f.this.b.collapseActionView();
        }
    }

    public static /* synthetic */ class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f16144a;

        static {
            int[] iArr = new int[cm.a.values().length];
            f16144a = iArr;
            try {
                iArr[cm.a.LIGHT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16144a[cm.a.CLASSIC.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f16144a[cm.a.DARK.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public interface e extends lk.c {
        boolean a(String str);

        boolean b(SearchView searchView, String str);

        String c();

        int d();
    }

    public f(q qVar) {
        this.f16136a = qVar;
    }

    public final int i() {
        int i10 = d.f16144a[this.f16139e.getTheme().ordinal()];
        if (i10 != 1) {
            return i10 != 2 ? l0.f4115o : l0.f4114n;
        }
        return l0.f4116p;
    }

    public final int j() {
        int i10 = d.f16144a[this.f16139e.getTheme().ordinal()];
        if (i10 != 1) {
            return i10 != 2 ? l0.A : l0.f4126z;
        }
        return l0.B;
    }

    public MenuItem k(Menu menu, MenuInflater menuInflater) {
        menuInflater.inflate(o0.f4213c, menu);
        MenuItem menuItemFindItem = menu.findItem(m0.f4132c);
        this.b = menuItemFindItem;
        menuItemFindItem.setIcon(this.f16136a.S().getDrawable(j()));
        q();
        return this.b;
    }

    public final void l(int i10, String str) {
        ok.q.h("SearchMenuOption", "reportEvents: searchType = " + i10 + ", buttonEvent = " + str);
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
        this.f16137c = menu;
    }

    public void o(e eVar) {
        this.f16139e = eVar;
    }

    public void p(RobloxToolbar robloxToolbar) {
        this.f16138d = robloxToolbar;
    }

    public final void q() {
        SearchView searchView = (SearchView) this.b.getActionView();
        this.b.setOnActionExpandListener(new a(searchView));
        EditText editText = (EditText) searchView.findViewById(i.f.I);
        editText.setTextColor(-16777216);
        editText.setHintTextColor(-7829368);
        nh.e.d(editText, editText.getContext(), "SourceSansPro-Regular.ttf");
        searchView.findViewById(i.f.H).setBackgroundResource(l0.f4113m);
        searchView.setQueryHint(searchView.getContext().getString(q0.M1));
        searchView.setOnQueryTextListener(new b(searchView));
        editText.setOnFocusChangeListener(new c());
    }

    public void r() {
        ((SearchView) this.b.getActionView()).setQueryHint(this.f16139e.c());
        boolean z10 = (t.j() && this.f16139e.d() == 2) ? false : true;
        this.b.setVisible(z10);
        this.b.setEnabled(z10);
    }
}
