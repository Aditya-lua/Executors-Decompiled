package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import android.widget.ListAdapter;
import androidx.annotation.NonNull;
import androidx.core.view.o0;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;
import java.util.Calendar;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class i<S> extends r<S> {

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public static final Object f7764t0 = "MONTHS_VIEW_GROUP_TAG";

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public static final Object f7765u0 = "NAVIGATION_PREV_TAG";

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public static final Object f7766v0 = "NAVIGATION_NEXT_TAG";

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public static final Object f7767w0 = "SELECTOR_TOGGLE_TAG";

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public int f7768g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public com.google.android.material.datepicker.d<S> f7769h0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public com.google.android.material.datepicker.a f7770i0;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public com.google.android.material.datepicker.g f7771j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public n f7772k0;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public l f7773l0;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public com.google.android.material.datepicker.c f7774m0;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public RecyclerView f7775n0;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public RecyclerView f7776o0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public View f7777p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public View f7778q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public View f7779r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public View f7780s0;

    public class a implements View.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ p f7781a;

        public a(p pVar) {
            this.f7781a = pVar;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            int iF2 = i.this.s2().f2() - 1;
            if (iF2 >= 0) {
                i.this.v2(this.f7781a.D(iF2));
            }
        }
    }

    public class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f7782a;

        public b(int i10) {
            this.f7782a = i10;
        }

        @Override // java.lang.Runnable
        public void run() {
            i.this.f7776o0.C1(this.f7782a);
        }
    }

    public class c extends androidx.core.view.a {
        public c() {
        }

        @Override // androidx.core.view.a
        public void g(View view, @NonNull y2.p pVar) {
            super.g(view, pVar);
            pVar.n0(null);
        }
    }

    public class d extends s {
        public final /* synthetic */ int I;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Context context, int i10, boolean z10, int i11) {
            super(context, i10, z10);
            this.I = i11;
        }

        @Override // androidx.recyclerview.widget.LinearLayoutManager
        public void R1(@NonNull RecyclerView.c0 c0Var, @NonNull int[] iArr) {
            if (this.I == 0) {
                iArr[0] = i.this.f7776o0.getWidth();
                iArr[1] = i.this.f7776o0.getWidth();
            } else {
                iArr[0] = i.this.f7776o0.getHeight();
                iArr[1] = i.this.f7776o0.getHeight();
            }
        }
    }

    public class e implements m {
        public e() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.android.material.datepicker.i.m
        public void a(long j10) {
            if (i.this.f7770i0.l().X0(j10)) {
                i.this.f7769h0.m3(j10);
                Iterator<q<S>> it = i.this.f7834f0.iterator();
                while (it.hasNext()) {
                    it.next().a(i.this.f7769h0.d3());
                }
                i.this.f7776o0.getAdapter().j();
                if (i.this.f7775n0 != null) {
                    i.this.f7775n0.getAdapter().j();
                }
            }
        }
    }

    public class f extends androidx.core.view.a {
        public f() {
        }

        @Override // androidx.core.view.a
        public void g(View view, @NonNull y2.p pVar) {
            super.g(view, pVar);
            pVar.G0(false);
        }
    }

    public class g extends RecyclerView.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Calendar f7786a = u.i();
        public final Calendar b = u.i();

        public g() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.p
        public void g(@NonNull Canvas canvas, @NonNull RecyclerView recyclerView, @NonNull RecyclerView.c0 c0Var) {
            if ((recyclerView.getAdapter() instanceof v) && (recyclerView.getLayoutManager() instanceof GridLayoutManager)) {
                v vVar = (v) recyclerView.getAdapter();
                GridLayoutManager gridLayoutManager = (GridLayoutManager) recyclerView.getLayoutManager();
                for (x2.c<Long, Long> cVar : i.this.f7769h0.U1()) {
                    Long l10 = cVar.f36145a;
                    if (l10 != null && cVar.b != null) {
                        this.f7786a.setTimeInMillis(l10.longValue());
                        this.b.setTimeInMillis(cVar.b.longValue());
                        int iE = vVar.E(this.f7786a.get(1));
                        int iE2 = vVar.E(this.b.get(1));
                        View viewH = gridLayoutManager.H(iE);
                        View viewH2 = gridLayoutManager.H(iE2);
                        int iL3 = iE / gridLayoutManager.l3();
                        int iL4 = iE2 / gridLayoutManager.l3();
                        int i10 = iL3;
                        while (i10 <= iL4) {
                            View viewH3 = gridLayoutManager.H(gridLayoutManager.l3() * i10);
                            if (viewH3 != null) {
                                canvas.drawRect((i10 != iL3 || viewH == null) ? 0 : viewH.getLeft() + (viewH.getWidth() / 2), viewH3.getTop() + i.this.f7774m0.f7755d.c(), (i10 != iL4 || viewH2 == null) ? recyclerView.getWidth() : viewH2.getLeft() + (viewH2.getWidth() / 2), viewH3.getBottom() - i.this.f7774m0.f7755d.b(), i.this.f7774m0.f7759h);
                            }
                            i10++;
                        }
                    }
                }
            }
        }
    }

    public class h extends androidx.core.view.a {
        public h() {
        }

        @Override // androidx.core.view.a
        public void g(View view, @NonNull y2.p pVar) {
            super.g(view, pVar);
            pVar.x0(i.this.f7780s0.getVisibility() == 0 ? i.this.d0(jc.i.f20438u) : i.this.d0(jc.i.f20436s));
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.datepicker.i$i, reason: collision with other inner class name */
    public class C0125i extends RecyclerView.v {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ p f7789a;
        public final /* synthetic */ MaterialButton b;

        public C0125i(p pVar, MaterialButton materialButton) {
            this.f7789a = pVar;
            this.b = materialButton;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.v
        public void a(@NonNull RecyclerView recyclerView, int i10) {
            if (i10 == 0) {
                recyclerView.announceForAccessibility(this.b.getText());
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.v
        public void b(@NonNull RecyclerView recyclerView, int i10, int i11) {
            int iD2 = i10 < 0 ? i.this.s2().d2() : i.this.s2().f2();
            i.this.f7772k0 = this.f7789a.D(iD2);
            this.b.setText(this.f7789a.E(iD2));
        }
    }

    public class j implements View.OnClickListener {
        public j() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            i.this.y2();
        }
    }

    public class k implements View.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ p f7792a;

        public k(p pVar) {
            this.f7792a = pVar;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            int iD2 = i.this.s2().d2() + 1;
            if (iD2 < i.this.f7776o0.getAdapter().e()) {
                i.this.v2(this.f7792a.D(iD2));
            }
        }
    }

    public enum l {
        DAY,
        YEAR
    }

    public interface m {
        void a(long j10);
    }

    public static int q2(@NonNull Context context) {
        return context.getResources().getDimensionPixelSize(jc.d.Q);
    }

    public static int r2(@NonNull Context context) {
        Resources resources = context.getResources();
        int dimensionPixelSize = resources.getDimensionPixelSize(jc.d.X) + resources.getDimensionPixelOffset(jc.d.Y) + resources.getDimensionPixelOffset(jc.d.W);
        int dimensionPixelSize2 = resources.getDimensionPixelSize(jc.d.S);
        int i10 = o.f7819g;
        return dimensionPixelSize + dimensionPixelSize2 + (resources.getDimensionPixelSize(jc.d.Q) * i10) + ((i10 - 1) * resources.getDimensionPixelOffset(jc.d.V)) + resources.getDimensionPixelOffset(jc.d.O);
    }

    @NonNull
    public static <T> i<T> t2(@NonNull com.google.android.material.datepicker.d<T> dVar, int i10, @NonNull com.google.android.material.datepicker.a aVar, com.google.android.material.datepicker.g gVar) {
        i<T> iVar = new i<>();
        Bundle bundle = new Bundle();
        bundle.putInt("THEME_RES_ID_KEY", i10);
        bundle.putParcelable("GRID_SELECTOR_KEY", dVar);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", aVar);
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", gVar);
        bundle.putParcelable("CURRENT_MONTH_KEY", aVar.q());
        iVar.O1(bundle);
        return iVar;
    }

    @Override // f4.q
    public void F0(Bundle bundle) {
        super.F0(bundle);
        if (bundle == null) {
            bundle = t();
        }
        this.f7768g0 = bundle.getInt("THEME_RES_ID_KEY");
        this.f7769h0 = (com.google.android.material.datepicker.d) bundle.getParcelable("GRID_SELECTOR_KEY");
        this.f7770i0 = (com.google.android.material.datepicker.a) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        this.f7771j0 = (com.google.android.material.datepicker.g) bundle.getParcelable("DAY_VIEW_DECORATOR_KEY");
        this.f7772k0 = (n) bundle.getParcelable("CURRENT_MONTH_KEY");
    }

    @Override // f4.q
    @NonNull
    public View J0(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i10;
        int i11;
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(v(), this.f7768g0);
        this.f7774m0 = new com.google.android.material.datepicker.c(contextThemeWrapper);
        LayoutInflater layoutInflaterCloneInContext = layoutInflater.cloneInContext(contextThemeWrapper);
        n nVarR = this.f7770i0.r();
        if (com.google.android.material.datepicker.k.J2(contextThemeWrapper)) {
            i10 = jc.h.f20413r;
            i11 = 1;
        } else {
            i10 = jc.h.f20411p;
            i11 = 0;
        }
        View viewInflate = layoutInflaterCloneInContext.inflate(i10, viewGroup, false);
        viewInflate.setMinimumHeight(r2(I1()));
        GridView gridView = (GridView) viewInflate.findViewById(jc.f.f20393y);
        o0.m0(gridView, new c());
        int iO = this.f7770i0.o();
        gridView.setAdapter((ListAdapter) (iO > 0 ? new com.google.android.material.datepicker.h(iO) : new com.google.android.material.datepicker.h()));
        gridView.setNumColumns(nVarR.f7815d);
        gridView.setEnabled(false);
        this.f7776o0 = (RecyclerView) viewInflate.findViewById(jc.f.B);
        this.f7776o0.setLayoutManager(new d(v(), i11, false, i11));
        this.f7776o0.setTag(f7764t0);
        p pVar = new p(contextThemeWrapper, this.f7769h0, this.f7770i0, this.f7771j0, new e());
        this.f7776o0.setAdapter(pVar);
        int integer = contextThemeWrapper.getResources().getInteger(jc.g.f20396c);
        RecyclerView recyclerView = (RecyclerView) viewInflate.findViewById(jc.f.C);
        this.f7775n0 = recyclerView;
        if (recyclerView != null) {
            recyclerView.setHasFixedSize(true);
            this.f7775n0.setLayoutManager(new GridLayoutManager((Context) contextThemeWrapper, integer, 1, false));
            this.f7775n0.setAdapter(new v(this));
            this.f7775n0.j(l2());
        }
        if (viewInflate.findViewById(jc.f.f20388t) != null) {
            k2(viewInflate, pVar);
        }
        if (!com.google.android.material.datepicker.k.J2(contextThemeWrapper)) {
            new androidx.recyclerview.widget.o().b(this.f7776o0);
        }
        this.f7776o0.t1(pVar.F(this.f7772k0));
        x2();
        return viewInflate;
    }

    @Override // f4.q
    public void b1(@NonNull Bundle bundle) {
        super.b1(bundle);
        bundle.putInt("THEME_RES_ID_KEY", this.f7768g0);
        bundle.putParcelable("GRID_SELECTOR_KEY", this.f7769h0);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.f7770i0);
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", this.f7771j0);
        bundle.putParcelable("CURRENT_MONTH_KEY", this.f7772k0);
    }

    @Override // com.google.android.material.datepicker.r
    public boolean b2(@NonNull q<S> qVar) {
        return super.b2(qVar);
    }

    public final void k2(@NonNull View view, @NonNull p pVar) {
        MaterialButton materialButton = (MaterialButton) view.findViewById(jc.f.f20388t);
        materialButton.setTag(f7767w0);
        o0.m0(materialButton, new h());
        View viewFindViewById = view.findViewById(jc.f.f20390v);
        this.f7777p0 = viewFindViewById;
        viewFindViewById.setTag(f7765u0);
        View viewFindViewById2 = view.findViewById(jc.f.f20389u);
        this.f7778q0 = viewFindViewById2;
        viewFindViewById2.setTag(f7766v0);
        this.f7779r0 = view.findViewById(jc.f.C);
        this.f7780s0 = view.findViewById(jc.f.f20392x);
        w2(l.DAY);
        materialButton.setText(this.f7772k0.u());
        this.f7776o0.n(new C0125i(pVar, materialButton));
        materialButton.setOnClickListener(new j());
        this.f7778q0.setOnClickListener(new k(pVar));
        this.f7777p0.setOnClickListener(new a(pVar));
    }

    @NonNull
    public final RecyclerView.p l2() {
        return new g();
    }

    public com.google.android.material.datepicker.a m2() {
        return this.f7770i0;
    }

    public com.google.android.material.datepicker.c n2() {
        return this.f7774m0;
    }

    public n o2() {
        return this.f7772k0;
    }

    public com.google.android.material.datepicker.d<S> p2() {
        return this.f7769h0;
    }

    @NonNull
    public LinearLayoutManager s2() {
        return (LinearLayoutManager) this.f7776o0.getLayoutManager();
    }

    public final void u2(int i10) {
        this.f7776o0.post(new b(i10));
    }

    public void v2(n nVar) {
        p pVar = (p) this.f7776o0.getAdapter();
        int iF = pVar.F(nVar);
        int iF2 = iF - pVar.F(this.f7772k0);
        boolean z10 = Math.abs(iF2) > 3;
        boolean z11 = iF2 > 0;
        this.f7772k0 = nVar;
        if (z10 && z11) {
            this.f7776o0.t1(iF - 3);
            u2(iF);
        } else if (!z10) {
            u2(iF);
        } else {
            this.f7776o0.t1(iF + 3);
            u2(iF);
        }
    }

    public void w2(l lVar) {
        this.f7773l0 = lVar;
        if (lVar == l.YEAR) {
            this.f7775n0.getLayoutManager().C1(((v) this.f7775n0.getAdapter()).E(this.f7772k0.f7814c));
            this.f7779r0.setVisibility(0);
            this.f7780s0.setVisibility(8);
            this.f7777p0.setVisibility(8);
            this.f7778q0.setVisibility(8);
            return;
        }
        if (lVar == l.DAY) {
            this.f7779r0.setVisibility(8);
            this.f7780s0.setVisibility(0);
            this.f7777p0.setVisibility(0);
            this.f7778q0.setVisibility(0);
            v2(this.f7772k0);
        }
    }

    public final void x2() {
        o0.m0(this.f7776o0, new f());
    }

    public void y2() {
        l lVar = this.f7773l0;
        l lVar2 = l.YEAR;
        if (lVar == lVar2) {
            w2(l.DAY);
        } else if (lVar == l.DAY) {
            w2(lVar2);
        }
    }
}
