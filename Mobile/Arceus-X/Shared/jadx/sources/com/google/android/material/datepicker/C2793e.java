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
import androidx.core.view.C0582a;
import androidx.core.view.C0625o0;
import androidx.recyclerview.widget.C1064o;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;
import java.util.Calendar;
import java.util.Iterator;
import p194ic.C6740d;
import p194ic.C6742f;
import p194ic.C6743g;
import p194ic.C6744h;
import p194ic.C6745i;
import p533x2.C12633c;
import p564y2.C13017p;

/* JADX INFO: renamed from: com.google.android.material.datepicker.e */
/* JADX INFO: loaded from: classes2.dex */
public final class C2793e<S> extends AbstractC2801m<S> {

    /* JADX INFO: renamed from: t0 */
    public static final Object f10058t0 = "MONTHS_VIEW_GROUP_TAG";

    /* JADX INFO: renamed from: u0 */
    public static final Object f10059u0 = "NAVIGATION_PREV_TAG";

    /* JADX INFO: renamed from: v0 */
    public static final Object f10060v0 = "NAVIGATION_NEXT_TAG";

    /* JADX INFO: renamed from: w0 */
    public static final Object f10061w0 = "SELECTOR_TOGGLE_TAG";

    /* JADX INFO: renamed from: g0 */
    public int f10062g0;

    /* JADX INFO: renamed from: h0 */
    public DateSelector<S> f10063h0;

    /* JADX INFO: renamed from: i0 */
    public CalendarConstraints f10064i0;

    /* JADX INFO: renamed from: j0 */
    public DayViewDecorator f10065j0;

    /* JADX INFO: renamed from: k0 */
    public Month f10066k0;

    /* JADX INFO: renamed from: l0 */
    public l f10067l0;

    /* JADX INFO: renamed from: m0 */
    public C2790b f10068m0;

    /* JADX INFO: renamed from: n0 */
    public RecyclerView f10069n0;

    /* JADX INFO: renamed from: o0 */
    public RecyclerView f10070o0;

    /* JADX INFO: renamed from: p0 */
    public View f10071p0;

    /* JADX INFO: renamed from: q0 */
    public View f10072q0;

    /* JADX INFO: renamed from: r0 */
    public View f10073r0;

    /* JADX INFO: renamed from: s0 */
    public View f10074s0;

    /* JADX INFO: renamed from: com.google.android.material.datepicker.e$a */
    public class a implements View.OnClickListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ C2799k f10075a;

        public a(C2799k c2799k) {
            this.f10075a = c2799k;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            int iM5181f2 = C2793e.this.m12643s2().m5181f2() - 1;
            if (iM5181f2 >= 0) {
                C2793e.this.m12645v2(this.f10075a.m12695D(iM5181f2));
            }
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.datepicker.e$b */
    public class b implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ int f10077a;

        public b(int i10) {
            this.f10077a = i10;
        }

        @Override // java.lang.Runnable
        public void run() {
            C2793e.this.f10070o0.m5244C1(this.f10077a);
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.datepicker.e$c */
    public class c extends C0582a {
        public c() {
        }

        @Override // androidx.core.view.C0582a
        /* JADX INFO: renamed from: g */
        public void mo2799g(View view, @NonNull C13017p c13017p) {
            super.mo2799g(view, c13017p);
            c13017p.m48412n0(null);
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.datepicker.e$d */
    public class d extends C2802n {

        /* JADX INFO: renamed from: I */
        public final /* synthetic */ int f10080I;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Context context, int i10, boolean z10, int i11) {
            super(context, i10, z10);
            this.f10080I = i11;
        }

        @Override // androidx.recyclerview.widget.LinearLayoutManager
        /* JADX INFO: renamed from: R1 */
        public void mo5167R1(@NonNull RecyclerView.C1015b0 c1015b0, @NonNull int[] iArr) {
            if (this.f10080I == 0) {
                iArr[0] = C2793e.this.f10070o0.getWidth();
                iArr[1] = C2793e.this.f10070o0.getWidth();
            } else {
                iArr[0] = C2793e.this.f10070o0.getHeight();
                iArr[1] = C2793e.this.f10070o0.getHeight();
            }
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.datepicker.e$e */
    public class e implements m {
        public e() {
        }

        /* JADX DEBUG: Multi-variable search result rejected for r3v2, resolved type: com.google.android.material.datepicker.l */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.android.material.datepicker.C2793e.m
        /* JADX INFO: renamed from: a */
        public void mo12649a(long j10) {
            if (C2793e.this.f10064i0.m12560m().mo12567X0(j10)) {
                C2793e.this.f10063h0.m12579f3(j10);
                Iterator<AbstractC2800l<S>> it = C2793e.this.f10159f0.iterator();
                while (it.hasNext()) {
                    it.next().mo12673a(C2793e.this.f10063h0.m12578Z2());
                }
                C2793e.this.f10070o0.getAdapter().m5478j();
                if (C2793e.this.f10069n0 != null) {
                    C2793e.this.f10069n0.getAdapter().m5478j();
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.datepicker.e$f */
    public class f extends C0582a {
        public f() {
        }

        @Override // androidx.core.view.C0582a
        /* JADX INFO: renamed from: g */
        public void mo2799g(View view, @NonNull C13017p c13017p) {
            super.mo2799g(view, c13017p);
            c13017p.m48362G0(false);
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.datepicker.e$g */
    public class g extends RecyclerView.AbstractC1033p {

        /* JADX INFO: renamed from: a */
        public final Calendar f10084a = C2804p.m12712i();

        /* JADX INFO: renamed from: b */
        public final Calendar f10085b = C2804p.m12712i();

        public g() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1033p
        /* JADX INFO: renamed from: g */
        public void mo5539g(@NonNull Canvas canvas, @NonNull RecyclerView recyclerView, @NonNull RecyclerView.C1015b0 c1015b0) {
            if ((recyclerView.getAdapter() instanceof C2805q) && (recyclerView.getLayoutManager() instanceof GridLayoutManager)) {
                C2805q c2805q = (C2805q) recyclerView.getAdapter();
                GridLayoutManager gridLayoutManager = (GridLayoutManager) recyclerView.getLayoutManager();
                for (C12633c<Long, Long> c12633c : C2793e.this.f10063h0.m12575R1()) {
                    Long l10 = c12633c.f44955a;
                    if (l10 != null && c12633c.f44956b != null) {
                        this.f10084a.setTimeInMillis(l10.longValue());
                        this.f10085b.setTimeInMillis(c12633c.f44956b.longValue());
                        int iM12718E = c2805q.m12718E(this.f10084a.get(1));
                        int iM12718E2 = c2805q.m12718E(this.f10085b.get(1));
                        View viewMo5154H = gridLayoutManager.mo5154H(iM12718E);
                        View viewMo5154H2 = gridLayoutManager.mo5154H(iM12718E2);
                        int iM5116l3 = iM12718E / gridLayoutManager.m5116l3();
                        int iM5116l4 = iM12718E2 / gridLayoutManager.m5116l3();
                        int i10 = iM5116l3;
                        while (i10 <= iM5116l4) {
                            View viewMo5154H3 = gridLayoutManager.mo5154H(gridLayoutManager.m5116l3() * i10);
                            if (viewMo5154H3 != null) {
                                canvas.drawRect((i10 != iM5116l3 || viewMo5154H == null) ? 0 : viewMo5154H.getLeft() + (viewMo5154H.getWidth() / 2), viewMo5154H3.getTop() + C2793e.this.f10068m0.f10049d.m12612c(), (i10 != iM5116l4 || viewMo5154H2 == null) ? recyclerView.getWidth() : viewMo5154H2.getLeft() + (viewMo5154H2.getWidth() / 2), viewMo5154H3.getBottom() - C2793e.this.f10068m0.f10049d.m12611b(), C2793e.this.f10068m0.f10053h);
                            }
                            i10++;
                        }
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.datepicker.e$h */
    public class h extends C0582a {
        public h() {
        }

        @Override // androidx.core.view.C0582a
        /* JADX INFO: renamed from: g */
        public void mo2799g(View view, @NonNull C13017p c13017p) {
            super.mo2799g(view, c13017p);
            c13017p.m48430x0(C2793e.this.f10074s0.getVisibility() == 0 ? C2793e.this.m4666e0(C6745i.f26102u) : C2793e.this.m4666e0(C6745i.f26100s));
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.datepicker.e$i */
    public class i extends RecyclerView.AbstractC1039v {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ C2799k f10088a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ MaterialButton f10089b;

        public i(C2799k c2799k, MaterialButton materialButton) {
            this.f10088a = c2799k;
            this.f10089b = materialButton;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1039v
        /* JADX INFO: renamed from: a */
        public void mo5659a(@NonNull RecyclerView recyclerView, int i10) {
            if (i10 == 0) {
                recyclerView.announceForAccessibility(this.f10089b.getText());
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1039v
        /* JADX INFO: renamed from: b */
        public void mo5660b(@NonNull RecyclerView recyclerView, int i10, int i11) {
            int iM5179d2 = i10 < 0 ? C2793e.this.m12643s2().m5179d2() : C2793e.this.m12643s2().m5181f2();
            C2793e.this.f10066k0 = this.f10088a.m12695D(iM5179d2);
            this.f10089b.setText(this.f10088a.m12696E(iM5179d2));
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.datepicker.e$j */
    public class j implements View.OnClickListener {
        public j() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            C2793e.this.m12648y2();
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.datepicker.e$k */
    public class k implements View.OnClickListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ C2799k f10092a;

        public k(C2799k c2799k) {
            this.f10092a = c2799k;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            int iM5179d2 = C2793e.this.m12643s2().m5179d2() + 1;
            if (iM5179d2 < C2793e.this.f10070o0.getAdapter().mo5473e()) {
                C2793e.this.m12645v2(this.f10092a.m12695D(iM5179d2));
            }
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.datepicker.e$l */
    public enum l {
        DAY,
        YEAR
    }

    /* JADX INFO: renamed from: com.google.android.material.datepicker.e$m */
    public interface m {
        /* JADX INFO: renamed from: a */
        void mo12649a(long j10);
    }

    /* JADX INFO: renamed from: q2 */
    public static int m12633q2(@NonNull Context context) {
        return context.getResources().getDimensionPixelSize(C6740d.f25946Q);
    }

    /* JADX INFO: renamed from: r2 */
    public static int m12634r2(@NonNull Context context) {
        Resources resources = context.getResources();
        int dimensionPixelSize = resources.getDimensionPixelSize(C6740d.f25953X) + resources.getDimensionPixelOffset(C6740d.f25954Y) + resources.getDimensionPixelOffset(C6740d.f25952W);
        int dimensionPixelSize2 = resources.getDimensionPixelSize(C6740d.f25948S);
        int i10 = C2798j.f10142g;
        return dimensionPixelSize + dimensionPixelSize2 + (resources.getDimensionPixelSize(C6740d.f25946Q) * i10) + ((i10 - 1) * resources.getDimensionPixelOffset(C6740d.f25951V)) + resources.getDimensionPixelOffset(C6740d.f25944O);
    }

    @NonNull
    /* JADX INFO: renamed from: t2 */
    public static <T> C2793e<T> m12635t2(@NonNull DateSelector<T> dateSelector, int i10, @NonNull CalendarConstraints calendarConstraints, DayViewDecorator dayViewDecorator) {
        C2793e<T> c2793e = new C2793e<>();
        Bundle bundle = new Bundle();
        bundle.putInt("THEME_RES_ID_KEY", i10);
        bundle.putParcelable("GRID_SELECTOR_KEY", dateSelector);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", calendarConstraints);
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", dayViewDecorator);
        bundle.putParcelable("CURRENT_MONTH_KEY", calendarConstraints.m12564q());
        c2793e.m4625O1(bundle);
        return c2793e;
    }

    @Override // androidx.fragment.app.ComponentCallbacksC0929c
    /* JADX INFO: renamed from: F0 */
    public void mo4599F0(Bundle bundle) {
        super.mo4599F0(bundle);
        if (bundle == null) {
            bundle = m4704t();
        }
        this.f10062g0 = bundle.getInt("THEME_RES_ID_KEY");
        this.f10063h0 = (DateSelector) bundle.getParcelable("GRID_SELECTOR_KEY");
        this.f10064i0 = (CalendarConstraints) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        this.f10065j0 = (DayViewDecorator) bundle.getParcelable("DAY_VIEW_DECORATOR_KEY");
        this.f10066k0 = (Month) bundle.getParcelable("CURRENT_MONTH_KEY");
    }

    @Override // androidx.fragment.app.ComponentCallbacksC0929c
    @NonNull
    /* JADX INFO: renamed from: J0 */
    public View mo1225J0(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i10;
        int i11;
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(mo4715x(), this.f10062g0);
        this.f10068m0 = new C2790b(contextThemeWrapper);
        LayoutInflater layoutInflaterCloneInContext = layoutInflater.cloneInContext(contextThemeWrapper);
        Month monthM12565r = this.f10064i0.m12565r();
        if (C2795g.m12653J2(contextThemeWrapper)) {
            i10 = C6744h.f26076r;
            i11 = 1;
        } else {
            i10 = C6744h.f26074p;
            i11 = 0;
        }
        View viewInflate = layoutInflaterCloneInContext.inflate(i10, viewGroup, false);
        viewInflate.setMinimumHeight(m12634r2(m4609I1()));
        GridView gridView = (GridView) viewInflate.findViewById(C6742f.f26054y);
        C0625o0.m3040m0(gridView, new c());
        int iM12562o = this.f10064i0.m12562o();
        gridView.setAdapter((ListAdapter) (iM12562o > 0 ? new C2792d(iM12562o) : new C2792d()));
        gridView.setNumColumns(monthM12565r.f10036d);
        gridView.setEnabled(false);
        this.f10070o0 = (RecyclerView) viewInflate.findViewById(C6742f.f26008B);
        this.f10070o0.setLayoutManager(new d(mo4715x(), i11, false, i11));
        this.f10070o0.setTag(f10058t0);
        C2799k c2799k = new C2799k(contextThemeWrapper, this.f10063h0, this.f10064i0, this.f10065j0, new e());
        this.f10070o0.setAdapter(c2799k);
        int integer = contextThemeWrapper.getResources().getInteger(C6743g.f26058c);
        RecyclerView recyclerView = (RecyclerView) viewInflate.findViewById(C6742f.f26009C);
        this.f10069n0 = recyclerView;
        if (recyclerView != null) {
            recyclerView.setHasFixedSize(true);
            this.f10069n0.setLayoutManager(new GridLayoutManager((Context) contextThemeWrapper, integer, 1, false));
            this.f10069n0.setAdapter(new C2805q(this));
            this.f10069n0.m5317j(m12638l2());
        }
        if (viewInflate.findViewById(C6742f.f26049t) != null) {
            m12637k2(viewInflate, c2799k);
        }
        if (!C2795g.m12653J2(contextThemeWrapper)) {
            new C1064o().m6057b(this.f10070o0);
        }
        this.f10070o0.m5346t1(c2799k.m12697F(this.f10066k0));
        m12647x2();
        return viewInflate;
    }

    @Override // androidx.fragment.app.ComponentCallbacksC0929c
    /* JADX INFO: renamed from: b1 */
    public void mo4661b1(@NonNull Bundle bundle) {
        super.mo4661b1(bundle);
        bundle.putInt("THEME_RES_ID_KEY", this.f10062g0);
        bundle.putParcelable("GRID_SELECTOR_KEY", this.f10063h0);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.f10064i0);
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", this.f10065j0);
        bundle.putParcelable("CURRENT_MONTH_KEY", this.f10066k0);
    }

    @Override // com.google.android.material.datepicker.AbstractC2801m
    /* JADX INFO: renamed from: b2 */
    public boolean mo12636b2(@NonNull AbstractC2800l<S> abstractC2800l) {
        return super.mo12636b2(abstractC2800l);
    }

    /* JADX INFO: renamed from: k2 */
    public final void m12637k2(@NonNull View view, @NonNull C2799k c2799k) {
        MaterialButton materialButton = (MaterialButton) view.findViewById(C6742f.f26049t);
        materialButton.setTag(f10061w0);
        C0625o0.m3040m0(materialButton, new h());
        View viewFindViewById = view.findViewById(C6742f.f26051v);
        this.f10071p0 = viewFindViewById;
        viewFindViewById.setTag(f10059u0);
        View viewFindViewById2 = view.findViewById(C6742f.f26050u);
        this.f10072q0 = viewFindViewById2;
        viewFindViewById2.setTag(f10060v0);
        this.f10073r0 = view.findViewById(C6742f.f26009C);
        this.f10074s0 = view.findViewById(C6742f.f26053x);
        m12646w2(l.DAY);
        materialButton.setText(this.f10066k0.m12604u());
        this.f10070o0.m5329n(new i(c2799k, materialButton));
        materialButton.setOnClickListener(new j());
        this.f10072q0.setOnClickListener(new k(c2799k));
        this.f10071p0.setOnClickListener(new a(c2799k));
    }

    @NonNull
    /* JADX INFO: renamed from: l2 */
    public final RecyclerView.AbstractC1033p m12638l2() {
        return new g();
    }

    /* JADX INFO: renamed from: m2 */
    public CalendarConstraints m12639m2() {
        return this.f10064i0;
    }

    /* JADX INFO: renamed from: n2 */
    public C2790b m12640n2() {
        return this.f10068m0;
    }

    /* JADX INFO: renamed from: o2 */
    public Month m12641o2() {
        return this.f10066k0;
    }

    /* JADX INFO: renamed from: p2 */
    public DateSelector<S> m12642p2() {
        return this.f10063h0;
    }

    @NonNull
    /* JADX INFO: renamed from: s2 */
    public LinearLayoutManager m12643s2() {
        return (LinearLayoutManager) this.f10070o0.getLayoutManager();
    }

    /* JADX INFO: renamed from: u2 */
    public final void m12644u2(int i10) {
        this.f10070o0.post(new b(i10));
    }

    /* JADX INFO: renamed from: v2 */
    public void m12645v2(Month month) {
        C2799k c2799k = (C2799k) this.f10070o0.getAdapter();
        int iM12697F = c2799k.m12697F(month);
        int iM12697F2 = iM12697F - c2799k.m12697F(this.f10066k0);
        boolean z10 = Math.abs(iM12697F2) > 3;
        boolean z11 = iM12697F2 > 0;
        this.f10066k0 = month;
        if (z10 && z11) {
            this.f10070o0.m5346t1(iM12697F - 3);
            m12644u2(iM12697F);
        } else if (!z10) {
            m12644u2(iM12697F);
        } else {
            this.f10070o0.m5346t1(iM12697F + 3);
            m12644u2(iM12697F);
        }
    }

    /* JADX INFO: renamed from: w2 */
    public void m12646w2(l lVar) {
        this.f10067l0 = lVar;
        if (lVar == l.YEAR) {
            this.f10069n0.getLayoutManager().mo5149C1(((C2805q) this.f10069n0.getAdapter()).m12718E(this.f10066k0.f10035c));
            this.f10073r0.setVisibility(0);
            this.f10074s0.setVisibility(8);
            this.f10071p0.setVisibility(8);
            this.f10072q0.setVisibility(8);
            return;
        }
        if (lVar == l.DAY) {
            this.f10073r0.setVisibility(8);
            this.f10074s0.setVisibility(0);
            this.f10071p0.setVisibility(0);
            this.f10072q0.setVisibility(0);
            m12645v2(this.f10066k0);
        }
    }

    /* JADX INFO: renamed from: x2 */
    public final void m12647x2() {
        C0625o0.m3040m0(this.f10070o0, new f());
    }

    /* JADX INFO: renamed from: y2 */
    public void m12648y2() {
        l lVar = this.f10067l0;
        l lVar2 = l.YEAR;
        if (lVar == lVar2) {
            m12646w2(l.DAY);
        } else if (lVar == l.DAY) {
            m12646w2(lVar2);
        }
    }
}
