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
public final class e<S> extends com.google.android.material.datepicker.m<S> {

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public static final Object f7926t0 = "MONTHS_VIEW_GROUP_TAG";

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public static final Object f7927u0 = "NAVIGATION_PREV_TAG";

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public static final Object f7928v0 = "NAVIGATION_NEXT_TAG";

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public static final Object f7929w0 = "SELECTOR_TOGGLE_TAG";

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public int f7930g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public DateSelector<S> f7931h0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public CalendarConstraints f7932i0;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public DayViewDecorator f7933j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public Month f7934k0;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public l f7935l0;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public com.google.android.material.datepicker.b f7936m0;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public RecyclerView f7937n0;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public RecyclerView f7938o0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public View f7939p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public View f7940q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public View f7941r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public View f7942s0;

    public class a implements View.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ com.google.android.material.datepicker.k f7943a;

        public a(com.google.android.material.datepicker.k kVar) {
            this.f7943a = kVar;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            int iF2 = e.this.s2().f2() - 1;
            if (iF2 >= 0) {
                e.this.v2(this.f7943a.D(iF2));
            }
        }
    }

    public class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f7944a;

        public b(int i10) {
            this.f7944a = i10;
        }

        @Override // java.lang.Runnable
        public void run() {
            e.this.f7938o0.C1(this.f7944a);
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

    public class d extends n {
        public final /* synthetic */ int I;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Context context, int i10, boolean z10, int i11) {
            super(context, i10, z10);
            this.I = i11;
        }

        @Override // androidx.recyclerview.widget.LinearLayoutManager
        public void R1(@NonNull RecyclerView.b0 b0Var, @NonNull int[] iArr) {
            if (this.I == 0) {
                iArr[0] = e.this.f7938o0.getWidth();
                iArr[1] = e.this.f7938o0.getWidth();
            } else {
                iArr[0] = e.this.f7938o0.getHeight();
                iArr[1] = e.this.f7938o0.getHeight();
            }
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.datepicker.e$e, reason: collision with other inner class name */
    public class C0124e implements m {
        public C0124e() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.android.material.datepicker.e.m
        public void a(long j10) {
            if (e.this.f7932i0.m().T0(j10)) {
                e.this.f7931h0.h3(j10);
                Iterator<com.google.android.material.datepicker.l<S>> it = e.this.f7990f0.iterator();
                while (it.hasNext()) {
                    it.next().a(e.this.f7931h0.Y2());
                }
                e.this.f7938o0.getAdapter().j();
                if (e.this.f7937n0 != null) {
                    e.this.f7937n0.getAdapter().j();
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
        public final Calendar f7948a = p.i();
        public final Calendar b = p.i();

        public g() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.p
        public void g(@NonNull Canvas canvas, @NonNull RecyclerView recyclerView, @NonNull RecyclerView.b0 b0Var) {
            if ((recyclerView.getAdapter() instanceof q) && (recyclerView.getLayoutManager() instanceof GridLayoutManager)) {
                q qVar = (q) recyclerView.getAdapter();
                GridLayoutManager gridLayoutManager = (GridLayoutManager) recyclerView.getLayoutManager();
                for (x2.c<Long, Long> cVar : e.this.f7931h0.Q1()) {
                    Long l10 = cVar.f35179a;
                    if (l10 != null && cVar.b != null) {
                        this.f7948a.setTimeInMillis(l10.longValue());
                        this.b.setTimeInMillis(cVar.b.longValue());
                        int iE = qVar.E(this.f7948a.get(1));
                        int iE2 = qVar.E(this.b.get(1));
                        View viewH = gridLayoutManager.H(iE);
                        View viewH2 = gridLayoutManager.H(iE2);
                        int iL3 = iE / gridLayoutManager.l3();
                        int iL4 = iE2 / gridLayoutManager.l3();
                        int i10 = iL3;
                        while (i10 <= iL4) {
                            View viewH3 = gridLayoutManager.H(gridLayoutManager.l3() * i10);
                            if (viewH3 != null) {
                                canvas.drawRect((i10 != iL3 || viewH == null) ? 0 : viewH.getLeft() + (viewH.getWidth() / 2), viewH3.getTop() + e.this.f7936m0.f7918d.c(), (i10 != iL4 || viewH2 == null) ? recyclerView.getWidth() : viewH2.getLeft() + (viewH2.getWidth() / 2), viewH3.getBottom() - e.this.f7936m0.f7918d.b(), e.this.f7936m0.f7922h);
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
            pVar.x0(e.this.f7942s0.getVisibility() == 0 ? e.this.e0(ic.i.f20750u) : e.this.e0(ic.i.f20748s));
        }
    }

    public class i extends RecyclerView.v {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ com.google.android.material.datepicker.k f7951a;
        public final /* synthetic */ MaterialButton b;

        public i(com.google.android.material.datepicker.k kVar, MaterialButton materialButton) {
            this.f7951a = kVar;
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
            int iD2 = i10 < 0 ? e.this.s2().d2() : e.this.s2().f2();
            e.this.f7934k0 = this.f7951a.D(iD2);
            this.b.setText(this.f7951a.E(iD2));
        }
    }

    public class j implements View.OnClickListener {
        public j() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            e.this.y2();
        }
    }

    public class k implements View.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ com.google.android.material.datepicker.k f7954a;

        public k(com.google.android.material.datepicker.k kVar) {
            this.f7954a = kVar;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            int iD2 = e.this.s2().d2() + 1;
            if (iD2 < e.this.f7938o0.getAdapter().e()) {
                e.this.v2(this.f7954a.D(iD2));
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
        return context.getResources().getDimensionPixelSize(ic.d.Q);
    }

    public static int r2(@NonNull Context context) {
        Resources resources = context.getResources();
        int dimensionPixelSize = resources.getDimensionPixelSize(ic.d.X) + resources.getDimensionPixelOffset(ic.d.Y) + resources.getDimensionPixelOffset(ic.d.W);
        int dimensionPixelSize2 = resources.getDimensionPixelSize(ic.d.S);
        int i10 = com.google.android.material.datepicker.j.f7975g;
        return dimensionPixelSize + dimensionPixelSize2 + (resources.getDimensionPixelSize(ic.d.Q) * i10) + ((i10 - 1) * resources.getDimensionPixelOffset(ic.d.V)) + resources.getDimensionPixelOffset(ic.d.O);
    }

    @NonNull
    public static <T> e<T> t2(@NonNull DateSelector<T> dateSelector, int i10, @NonNull CalendarConstraints calendarConstraints, DayViewDecorator dayViewDecorator) {
        e<T> eVar = new e<>();
        Bundle bundle = new Bundle();
        bundle.putInt("THEME_RES_ID_KEY", i10);
        bundle.putParcelable("GRID_SELECTOR_KEY", dateSelector);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", calendarConstraints);
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", dayViewDecorator);
        bundle.putParcelable("CURRENT_MONTH_KEY", calendarConstraints.q());
        eVar.O1(bundle);
        return eVar;
    }

    @Override // androidx.fragment.app.c
    public void F0(Bundle bundle) {
        super.F0(bundle);
        if (bundle == null) {
            bundle = t();
        }
        this.f7930g0 = bundle.getInt("THEME_RES_ID_KEY");
        this.f7931h0 = (DateSelector) bundle.getParcelable("GRID_SELECTOR_KEY");
        this.f7932i0 = (CalendarConstraints) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        this.f7933j0 = (DayViewDecorator) bundle.getParcelable("DAY_VIEW_DECORATOR_KEY");
        this.f7934k0 = (Month) bundle.getParcelable("CURRENT_MONTH_KEY");
    }

    @Override // androidx.fragment.app.c
    @NonNull
    public View J0(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i10;
        int i11;
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(w(), this.f7930g0);
        this.f7936m0 = new com.google.android.material.datepicker.b(contextThemeWrapper);
        LayoutInflater layoutInflaterCloneInContext = layoutInflater.cloneInContext(contextThemeWrapper);
        Month monthR = this.f7932i0.r();
        if (com.google.android.material.datepicker.g.J2(contextThemeWrapper)) {
            i10 = ic.h.f20725r;
            i11 = 1;
        } else {
            i10 = ic.h.f20723p;
            i11 = 0;
        }
        View viewInflate = layoutInflaterCloneInContext.inflate(i10, viewGroup, false);
        viewInflate.setMinimumHeight(r2(I1()));
        GridView gridView = (GridView) viewInflate.findViewById(ic.f.f20705y);
        o0.m0(gridView, new c());
        int iO = this.f7932i0.o();
        gridView.setAdapter((ListAdapter) (iO > 0 ? new com.google.android.material.datepicker.d(iO) : new com.google.android.material.datepicker.d()));
        gridView.setNumColumns(monthR.f7907d);
        gridView.setEnabled(false);
        this.f7938o0 = (RecyclerView) viewInflate.findViewById(ic.f.B);
        this.f7938o0.setLayoutManager(new d(w(), i11, false, i11));
        this.f7938o0.setTag(f7926t0);
        com.google.android.material.datepicker.k kVar = new com.google.android.material.datepicker.k(contextThemeWrapper, this.f7931h0, this.f7932i0, this.f7933j0, new C0124e());
        this.f7938o0.setAdapter(kVar);
        int integer = contextThemeWrapper.getResources().getInteger(ic.g.f20708c);
        RecyclerView recyclerView = (RecyclerView) viewInflate.findViewById(ic.f.C);
        this.f7937n0 = recyclerView;
        if (recyclerView != null) {
            recyclerView.setHasFixedSize(true);
            this.f7937n0.setLayoutManager(new GridLayoutManager((Context) contextThemeWrapper, integer, 1, false));
            this.f7937n0.setAdapter(new q(this));
            this.f7937n0.j(l2());
        }
        if (viewInflate.findViewById(ic.f.f20700t) != null) {
            k2(viewInflate, kVar);
        }
        if (!com.google.android.material.datepicker.g.J2(contextThemeWrapper)) {
            new androidx.recyclerview.widget.o().b(this.f7938o0);
        }
        this.f7938o0.t1(kVar.F(this.f7934k0));
        x2();
        return viewInflate;
    }

    @Override // androidx.fragment.app.c
    public void b1(@NonNull Bundle bundle) {
        super.b1(bundle);
        bundle.putInt("THEME_RES_ID_KEY", this.f7930g0);
        bundle.putParcelable("GRID_SELECTOR_KEY", this.f7931h0);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.f7932i0);
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", this.f7933j0);
        bundle.putParcelable("CURRENT_MONTH_KEY", this.f7934k0);
    }

    @Override // com.google.android.material.datepicker.m
    public boolean b2(@NonNull com.google.android.material.datepicker.l<S> lVar) {
        return super.b2(lVar);
    }

    public final void k2(@NonNull View view, @NonNull com.google.android.material.datepicker.k kVar) {
        MaterialButton materialButton = (MaterialButton) view.findViewById(ic.f.f20700t);
        materialButton.setTag(f7929w0);
        o0.m0(materialButton, new h());
        View viewFindViewById = view.findViewById(ic.f.f20702v);
        this.f7939p0 = viewFindViewById;
        viewFindViewById.setTag(f7927u0);
        View viewFindViewById2 = view.findViewById(ic.f.f20701u);
        this.f7940q0 = viewFindViewById2;
        viewFindViewById2.setTag(f7928v0);
        this.f7941r0 = view.findViewById(ic.f.C);
        this.f7942s0 = view.findViewById(ic.f.f20704x);
        w2(l.DAY);
        materialButton.setText(this.f7934k0.u());
        this.f7938o0.n(new i(kVar, materialButton));
        materialButton.setOnClickListener(new j());
        this.f7940q0.setOnClickListener(new k(kVar));
        this.f7939p0.setOnClickListener(new a(kVar));
    }

    @NonNull
    public final RecyclerView.p l2() {
        return new g();
    }

    public CalendarConstraints m2() {
        return this.f7932i0;
    }

    public com.google.android.material.datepicker.b n2() {
        return this.f7936m0;
    }

    public Month o2() {
        return this.f7934k0;
    }

    public DateSelector<S> p2() {
        return this.f7931h0;
    }

    @NonNull
    public LinearLayoutManager s2() {
        return (LinearLayoutManager) this.f7938o0.getLayoutManager();
    }

    public final void u2(int i10) {
        this.f7938o0.post(new b(i10));
    }

    public void v2(Month month) {
        com.google.android.material.datepicker.k kVar = (com.google.android.material.datepicker.k) this.f7938o0.getAdapter();
        int iF = kVar.F(month);
        int iF2 = iF - kVar.F(this.f7934k0);
        boolean z10 = Math.abs(iF2) > 3;
        boolean z11 = iF2 > 0;
        this.f7934k0 = month;
        if (z10 && z11) {
            this.f7938o0.t1(iF - 3);
            u2(iF);
        } else if (!z10) {
            u2(iF);
        } else {
            this.f7938o0.t1(iF + 3);
            u2(iF);
        }
    }

    public void w2(l lVar) {
        this.f7935l0 = lVar;
        if (lVar == l.YEAR) {
            this.f7937n0.getLayoutManager().C1(((q) this.f7937n0.getAdapter()).E(this.f7934k0.f7906c));
            this.f7941r0.setVisibility(0);
            this.f7942s0.setVisibility(8);
            this.f7939p0.setVisibility(8);
            this.f7940q0.setVisibility(8);
            return;
        }
        if (lVar == l.DAY) {
            this.f7941r0.setVisibility(8);
            this.f7942s0.setVisibility(0);
            this.f7939p0.setVisibility(0);
            this.f7940q0.setVisibility(0);
            v2(this.f7934k0);
        }
    }

    public final void x2() {
        o0.m0(this.f7938o0, new f());
    }

    public void y2() {
        l lVar = this.f7935l0;
        l lVar2 = l.YEAR;
        if (lVar == lVar2) {
            w2(l.DAY);
        } else if (lVar == l.DAY) {
            w2(lVar2);
        }
    }
}
