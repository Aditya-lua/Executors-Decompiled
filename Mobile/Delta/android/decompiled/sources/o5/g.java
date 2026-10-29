package o5;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class g extends e4.j0 {

    public class a extends q.e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Rect f27104a;

        public a(Rect rect) {
            this.f27104a = rect;
        }

        @Override // o5.q.e
        public Rect a(@NonNull q qVar) {
            return this.f27104a;
        }
    }

    public class b implements q.h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ View f27105a;
        public final /* synthetic */ ArrayList b;

        public b(View view, ArrayList arrayList) {
            this.f27105a = view;
            this.b = arrayList;
        }

        @Override // o5.q.h
        public void a(@NonNull q qVar) {
        }

        @Override // o5.q.h
        public void b(@NonNull q qVar) {
        }

        @Override // o5.q.h
        public void d(@NonNull q qVar) {
        }

        @Override // o5.q.h
        public void g(@NonNull q qVar) {
            qVar.m0(this);
            qVar.c(this);
        }

        @Override // o5.q.h
        public void k(@NonNull q qVar) {
            qVar.m0(this);
            this.f27105a.setVisibility(8);
            int size = this.b.size();
            for (int i10 = 0; i10 < size; i10++) {
                ((View) this.b.get(i10)).setVisibility(0);
            }
        }
    }

    public class c extends x {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Object f27107a;
        public final /* synthetic */ ArrayList b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Object f27108c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ ArrayList f27109d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ Object f27110e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ ArrayList f27111f;

        public c(Object obj, ArrayList arrayList, Object obj2, ArrayList arrayList2, Object obj3, ArrayList arrayList3) {
            this.f27107a = obj;
            this.b = arrayList;
            this.f27108c = obj2;
            this.f27109d = arrayList2;
            this.f27110e = obj3;
            this.f27111f = arrayList3;
        }

        @Override // o5.x, o5.q.h
        public void g(@NonNull q qVar) {
            Object obj = this.f27107a;
            if (obj != null) {
                g.this.E(obj, this.b, null);
            }
            Object obj2 = this.f27108c;
            if (obj2 != null) {
                g.this.E(obj2, this.f27109d, null);
            }
            Object obj3 = this.f27110e;
            if (obj3 != null) {
                g.this.E(obj3, this.f27111f, null);
            }
        }

        @Override // o5.x, o5.q.h
        public void k(@NonNull q qVar) {
            qVar.m0(this);
        }
    }

    public class d implements q.h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Runnable f27113a;

        public d(Runnable runnable) {
            this.f27113a = runnable;
        }

        @Override // o5.q.h
        public void a(@NonNull q qVar) {
        }

        @Override // o5.q.h
        public void b(@NonNull q qVar) {
        }

        @Override // o5.q.h
        public void d(@NonNull q qVar) {
        }

        @Override // o5.q.h
        public void g(@NonNull q qVar) {
        }

        @Override // o5.q.h
        public void k(@NonNull q qVar) {
            this.f27113a.run();
        }
    }

    public class e extends q.e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Rect f27114a;

        public e(Rect rect) {
            this.f27114a = rect;
        }

        @Override // o5.q.e
        public Rect a(@NonNull q qVar) {
            Rect rect = this.f27114a;
            if (rect == null || rect.isEmpty()) {
                return null;
            }
            return this.f27114a;
        }
    }

    public static /* synthetic */ void C(Runnable runnable, q qVar, Runnable runnable2) {
        if (runnable != null) {
            runnable.run();
        } else {
            qVar.cancel();
            runnable2.run();
        }
    }

    public static boolean D(q qVar) {
        return (e4.j0.l(qVar.Q()) && e4.j0.l(qVar.R()) && e4.j0.l(qVar.S())) ? false : true;
    }

    @Override // e4.j0
    public void A(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        b0 b0Var = (b0) obj;
        if (b0Var != null) {
            b0Var.T().clear();
            b0Var.T().addAll(arrayList2);
            E(b0Var, arrayList, arrayList2);
        }
    }

    @Override // e4.j0
    public Object B(Object obj) {
        if (obj == null) {
            return null;
        }
        b0 b0Var = new b0();
        b0Var.D0((q) obj);
        return b0Var;
    }

    public void E(@NonNull Object obj, @SuppressLint({"UnknownNullness"}) ArrayList<View> arrayList, @SuppressLint({"UnknownNullness"}) ArrayList<View> arrayList2) {
        q qVar = (q) obj;
        int i10 = 0;
        if (qVar instanceof b0) {
            b0 b0Var = (b0) qVar;
            int iG0 = b0Var.G0();
            while (i10 < iG0) {
                E(b0Var.F0(i10), arrayList, arrayList2);
                i10++;
            }
            return;
        }
        if (D(qVar)) {
            return;
        }
        List<View> listT = qVar.T();
        if (listT.size() == arrayList.size() && listT.containsAll(arrayList)) {
            int size = arrayList2 == null ? 0 : arrayList2.size();
            while (i10 < size) {
                qVar.e(arrayList2.get(i10));
                i10++;
            }
            for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                qVar.n0(arrayList.get(size2));
            }
        }
    }

    @Override // e4.j0
    public void a(@NonNull Object obj, @NonNull View view) {
        if (obj != null) {
            ((q) obj).e(view);
        }
    }

    @Override // e4.j0
    public void b(@NonNull Object obj, @NonNull ArrayList<View> arrayList) {
        q qVar = (q) obj;
        if (qVar == null) {
            return;
        }
        int i10 = 0;
        if (qVar instanceof b0) {
            b0 b0Var = (b0) qVar;
            int iG0 = b0Var.G0();
            while (i10 < iG0) {
                b(b0Var.F0(i10), arrayList);
                i10++;
            }
            return;
        }
        if (D(qVar) || !e4.j0.l(qVar.T())) {
            return;
        }
        int size = arrayList.size();
        while (i10 < size) {
            qVar.e(arrayList.get(i10));
            i10++;
        }
    }

    @Override // e4.j0
    public void c(@NonNull Object obj) {
        ((a0) obj).c();
    }

    @Override // e4.j0
    public void d(@NonNull Object obj, @NonNull Runnable runnable) {
        ((a0) obj).j(runnable);
    }

    @Override // e4.j0
    public void e(@NonNull ViewGroup viewGroup, Object obj) {
        y.a(viewGroup, (q) obj);
    }

    @Override // e4.j0
    public boolean g(@NonNull Object obj) {
        return obj instanceof q;
    }

    @Override // e4.j0
    public Object h(Object obj) {
        if (obj != null) {
            return ((q) obj).clone();
        }
        return null;
    }

    @Override // e4.j0
    public Object j(@NonNull ViewGroup viewGroup, @NonNull Object obj) {
        return y.c(viewGroup, (q) obj);
    }

    @Override // e4.j0
    public boolean m() {
        return true;
    }

    @Override // e4.j0
    public boolean n(@NonNull Object obj) {
        boolean zY = ((q) obj).Y();
        if (!zY) {
            Log.v("FragmentManager", "Predictive back not available for AndroidX Transition " + obj + ". Please enable seeking support for the designated transition by overriding isSeekingSupported().");
        }
        return zY;
    }

    @Override // e4.j0
    public Object o(Object obj, Object obj2, Object obj3) {
        q qVarM0 = (q) obj;
        q qVar = (q) obj2;
        q qVar2 = (q) obj3;
        if (qVarM0 != null && qVar != null) {
            qVarM0 = new b0().D0(qVarM0).D0(qVar).M0(1);
        } else if (qVarM0 == null) {
            qVarM0 = qVar != null ? qVar : null;
        }
        if (qVar2 == null) {
            return qVarM0;
        }
        b0 b0Var = new b0();
        if (qVarM0 != null) {
            b0Var.D0(qVarM0);
        }
        b0Var.D0(qVar2);
        return b0Var;
    }

    @Override // e4.j0
    @NonNull
    public Object p(Object obj, Object obj2, Object obj3) {
        b0 b0Var = new b0();
        if (obj != null) {
            b0Var.D0((q) obj);
        }
        if (obj2 != null) {
            b0Var.D0((q) obj2);
        }
        if (obj3 != null) {
            b0Var.D0((q) obj3);
        }
        return b0Var;
    }

    @Override // e4.j0
    public void r(@NonNull Object obj, @NonNull View view, @NonNull ArrayList<View> arrayList) {
        ((q) obj).c(new b(view, arrayList));
    }

    @Override // e4.j0
    public void s(@NonNull Object obj, Object obj2, ArrayList<View> arrayList, Object obj3, ArrayList<View> arrayList2, Object obj4, ArrayList<View> arrayList3) {
        ((q) obj).c(new c(obj2, arrayList, obj3, arrayList2, obj4, arrayList3));
    }

    @Override // e4.j0
    public void t(@NonNull Object obj, float f10) {
        a0 a0Var = (a0) obj;
        if (a0Var.isReady()) {
            long jF = (long) (f10 * a0Var.f());
            if (jF == 0) {
                jF = 1;
            }
            if (jF == a0Var.f()) {
                jF = a0Var.f() - 1;
            }
            a0Var.h(jF);
        }
    }

    @Override // e4.j0
    public void u(@NonNull Object obj, @NonNull Rect rect) {
        if (obj != null) {
            ((q) obj).u0(new e(rect));
        }
    }

    @Override // e4.j0
    public void v(@NonNull Object obj, View view) {
        if (view != null) {
            Rect rect = new Rect();
            k(view, rect);
            ((q) obj).u0(new a(rect));
        }
    }

    @Override // e4.j0
    public void w(@NonNull androidx.fragment.app.c cVar, @NonNull Object obj, @NonNull u2.e eVar, @NonNull Runnable runnable) {
        x(cVar, obj, eVar, null, runnable);
    }

    @Override // e4.j0
    public void x(@NonNull androidx.fragment.app.c cVar, @NonNull Object obj, @NonNull u2.e eVar, final Runnable runnable, @NonNull final Runnable runnable2) {
        final q qVar = (q) obj;
        eVar.b(new u2.e.a() { // from class: o5.f
            @Override // u2.e.a
            public final void onCancel() {
                g.C(runnable, qVar, runnable2);
            }
        });
        qVar.c(new d(runnable2));
    }

    @Override // e4.j0
    public void z(@NonNull Object obj, @NonNull View view, @NonNull ArrayList<View> arrayList) {
        b0 b0Var = (b0) obj;
        List<View> listT = b0Var.T();
        listT.clear();
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            e4.j0.f(listT, arrayList.get(i10));
        }
        listT.add(view);
        arrayList.add(view);
        b(b0Var, arrayList);
    }
}
