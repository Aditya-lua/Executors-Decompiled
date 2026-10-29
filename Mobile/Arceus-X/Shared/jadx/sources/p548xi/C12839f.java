package p548xi;

import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import androidx.appcompat.widget.SearchView;
import androidx.core.view.ViewCompat;
import androidx.fragment.app.ComponentCallbacksC0929c;
import com.roblox.client.components.RobloxToolbar;
import dk.InterfaceC4634c;
import p103eh.C5117e;
import p103eh.C5120h;
import p151gk.C6124q;
import p151gk.C6127t;
import p181i.C6594f;
import p337ol.EnumC9799a;
import sg.C11312e2;
import sg.C11332l0;
import sg.C11335m0;
import sg.C11341o0;
import sg.C11347q0;
import sg.C11356t0;

/* JADX INFO: renamed from: xi.f */
/* JADX INFO: loaded from: classes2.dex */
public class C12839f {

    /* JADX INFO: renamed from: a */
    public ComponentCallbacksC0929c f45651a;

    /* JADX INFO: renamed from: b */
    public MenuItem f45652b;

    /* JADX INFO: renamed from: c */
    public Menu f45653c;

    /* JADX INFO: renamed from: d */
    public RobloxToolbar f45654d;

    /* JADX INFO: renamed from: e */
    public e f45655e;

    /* JADX INFO: renamed from: xi.f$a */
    public class a implements MenuItem.OnActionExpandListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ SearchView f45656a;

        /* JADX INFO: renamed from: xi.f$a$a, reason: collision with other inner class name */
        public class RunnableC14284a implements Runnable {
            public RunnableC14284a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                C5120h.m23899c(C12839f.this.f45654d, C12839f.this.m47801i());
            }
        }

        /* JADX DEBUG: Incorrect args count in method signature: ()V */
        public a(SearchView searchView) {
            this.f45656a = searchView;
        }

        @Override // android.view.MenuItem.OnActionExpandListener
        public boolean onMenuItemActionCollapse(MenuItem menuItem) {
            C12839f c12839f = C12839f.this;
            c12839f.m47805m(c12839f.f45653c, C12839f.this.f45652b, true);
            C12839f c12839f2 = C12839f.this;
            c12839f2.m47804l(c12839f2.f45655e.mo47814d(), "searchClose");
            return true;
        }

        @Override // android.view.MenuItem.OnActionExpandListener
        public boolean onMenuItemActionExpand(MenuItem menuItem) {
            if (C12839f.this.f45654d != null) {
                this.f45656a.post(new RunnableC14284a());
            }
            C12839f c12839f = C12839f.this;
            c12839f.m47805m(c12839f.f45653c, C12839f.this.f45652b, false);
            C12839f c12839f2 = C12839f.this;
            c12839f2.m47804l(c12839f2.f45655e.mo47814d(), "searchOpen");
            return true;
        }
    }

    /* JADX INFO: renamed from: xi.f$b */
    public class b implements SearchView.InterfaceC0466m {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ SearchView f45659a;

        /* JADX DEBUG: Incorrect args count in method signature: ()V */
        public b(SearchView searchView) {
            this.f45659a = searchView;
        }

        @Override // androidx.appcompat.widget.SearchView.InterfaceC0466m
        /* JADX INFO: renamed from: a */
        public boolean mo1859a(String str) {
            return C12839f.this.f45655e.mo47811a(str);
        }

        @Override // androidx.appcompat.widget.SearchView.InterfaceC0466m
        /* JADX INFO: renamed from: b */
        public boolean mo1860b(String str) {
            return C12839f.this.f45655e.mo47812b(this.f45659a, str);
        }
    }

    /* JADX INFO: renamed from: xi.f$c */
    public class c implements View.OnFocusChangeListener {
        public c() {
        }

        @Override // android.view.View.OnFocusChangeListener
        public void onFocusChange(View view, boolean z10) {
            C6124q.m27063h("SearchMenuOption", "... onFocusChange: hasFocus = " + z10);
            if (z10) {
                return;
            }
            if (C12839f.this.f45651a != null) {
                C11312e2.m42504h(C12839f.this.f45651a.m4693p());
            }
            C12839f.this.f45652b.collapseActionView();
        }
    }

    /* JADX INFO: renamed from: xi.f$d */
    public static /* synthetic */ class d {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f45662a;

        static {
            int[] iArr = new int[EnumC9799a.values().length];
            f45662a = iArr;
            try {
                iArr[EnumC9799a.LIGHT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f45662a[EnumC9799a.CLASSIC.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f45662a[EnumC9799a.DARK.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* JADX INFO: renamed from: xi.f$e */
    public interface e extends InterfaceC4634c {
        /* JADX INFO: renamed from: a */
        boolean mo47811a(String str);

        /* JADX INFO: renamed from: b */
        boolean mo47812b(SearchView searchView, String str);

        /* JADX INFO: renamed from: c */
        String mo47813c();

        /* JADX INFO: renamed from: d */
        int mo47814d();
    }

    public C12839f(ComponentCallbacksC0929c componentCallbacksC0929c) {
        this.f45651a = componentCallbacksC0929c;
    }

    /* JADX INFO: renamed from: i */
    public final int m47801i() {
        int i10 = d.f45662a[this.f45655e.getTheme().ordinal()];
        if (i10 != 1) {
            return i10 != 2 ? C11332l0.f39755o : C11332l0.f39754n;
        }
        return C11332l0.f39756p;
    }

    /* JADX INFO: renamed from: j */
    public final int m47802j() {
        int i10 = d.f45662a[this.f45655e.getTheme().ordinal()];
        if (i10 != 1) {
            return i10 != 2 ? C11332l0.f39739A : C11332l0.f39766z;
        }
        return C11332l0.f39740B;
    }

    /* JADX INFO: renamed from: k */
    public MenuItem m47803k(Menu menu, MenuInflater menuInflater) {
        menuInflater.inflate(C11341o0.f39887c, menu);
        MenuItem menuItemFindItem = menu.findItem(C11335m0.f39799c);
        this.f45652b = menuItemFindItem;
        menuItemFindItem.setIcon(this.f45651a.m4637T().getDrawable(m47802j()));
        m47809q();
        return this.f45652b;
    }

    /* JADX INFO: renamed from: l */
    public final void m47804l(int i10, String str) {
        C6124q.m27063h("SearchMenuOption", "reportEvents: searchType = " + i10 + ", buttonEvent = " + str);
        if (i10 == 1) {
            C11356t0.m42535e("nativeMain", str, "users");
            return;
        }
        if (i10 == 2) {
            C11356t0.m42535e("nativeMain", str, "games");
        } else if (i10 == 3) {
            C11356t0.m42535e("nativeMain", str, "catalog");
        } else {
            if (i10 != 4) {
                return;
            }
            C11356t0.m42534d("nativeMain|friends", str);
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m47805m(Menu menu, MenuItem menuItem, boolean z10) {
        if (menu != null) {
            for (int i10 = 0; i10 < menu.size(); i10++) {
                MenuItem item = menu.getItem(i10);
                if (item != menuItem) {
                    item.setVisible(z10);
                }
            }
        }
    }

    /* JADX INFO: renamed from: n */
    public void m47806n(Menu menu) {
        this.f45653c = menu;
    }

    /* JADX INFO: renamed from: o */
    public void m47807o(e eVar) {
        this.f45655e = eVar;
    }

    /* JADX INFO: renamed from: p */
    public void m47808p(RobloxToolbar robloxToolbar) {
        this.f45654d = robloxToolbar;
    }

    /* JADX INFO: renamed from: q */
    public final void m47809q() {
        SearchView searchView = (SearchView) this.f45652b.getActionView();
        this.f45652b.setOnActionExpandListener(new a(searchView));
        EditText editText = (EditText) searchView.findViewById(C6594f.f25121I);
        editText.setTextColor(ViewCompat.MEASURED_STATE_MASK);
        editText.setHintTextColor(-7829368);
        C5117e.m23880d(editText, editText.getContext(), "SourceSansPro-Regular.ttf");
        searchView.findViewById(C6594f.f25120H).setBackgroundResource(C11332l0.f39753m);
        searchView.setQueryHint(searchView.getContext().getString(C11347q0.f39904C1));
        searchView.setOnQueryTextListener(new b(searchView));
        editText.setOnFocusChangeListener(new c());
    }

    /* JADX INFO: renamed from: r */
    public void m47810r() {
        ((SearchView) this.f45652b.getActionView()).setQueryHint(this.f45655e.mo47813c());
        boolean z10 = (C6127t.m27094j() && this.f45655e.mo47814d() == 2) ? false : true;
        this.f45652b.setVisible(z10);
        this.f45652b.setEnabled(z10);
    }
}
