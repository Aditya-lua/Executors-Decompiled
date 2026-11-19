package p5;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import f4.w0;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class g extends w0 {

    public class a extends q.e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Rect f28840a;

        public a(Rect rect) {
            this.f28840a = rect;
        }

        @Override // p5.q.e
        public Rect a(@NonNull q qVar) {
            return this.f28840a;
        }
    }

    public class b implements q.h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ View f28841a;
        public final /* synthetic */ ArrayList b;

        public b(View view, ArrayList arrayList) {
            this.f28841a = view;
            this.b = arrayList;
        }

        @Override // p5.q.h
        public void b(@NonNull q qVar) {
            qVar.q0(this);
            this.f28841a.setVisibility(8);
            int size = this.b.size();
            for (int i10 = 0; i10 < size; i10++) {
                ((View) this.b.get(i10)).setVisibility(0);
            }
        }

        @Override // p5.q.h
        public void c(@NonNull q qVar) {
            qVar.q0(this);
            qVar.c(this);
        }

        @Override // p5.q.h
        public void f(@NonNull q qVar) {
        }

        @Override // p5.q.h
        public void h(@NonNull q qVar) {
        }

        @Override // p5.q.h
        public void k(@NonNull q qVar) {
        }
    }

    public class c extends x {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Object f28843a;
        public final /* synthetic */ ArrayList b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Object f28844c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ ArrayList f28845d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ Object f28846e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ ArrayList f28847f;

        public c(Object obj, ArrayList arrayList, Object obj2, ArrayList arrayList2, Object obj3, ArrayList arrayList3) {
            this.f28843a = obj;
            this.b = arrayList;
            this.f28844c = obj2;
            this.f28845d = arrayList2;
            this.f28846e = obj3;
            this.f28847f = arrayList3;
        }

        @Override // p5.x, p5.q.h
        public void b(@NonNull q qVar) {
            qVar.q0(this);
        }

        @Override // p5.x, p5.q.h
        public void c(@NonNull q qVar) {
            Object obj = this.f28843a;
            if (obj != null) {
                g.this.E(obj, this.b, null);
            }
            Object obj2 = this.f28844c;
            if (obj2 != null) {
                g.this.E(obj2, this.f28845d, null);
            }
            Object obj3 = this.f28846e;
            if (obj3 != null) {
                g.this.E(obj3, this.f28847f, null);
            }
        }
    }

    public class d implements q.h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Runnable f28849a;

        public d(Runnable runnable) {
            this.f28849a = runnable;
        }

        @Override // p5.q.h
        public void b(@NonNull q qVar) {
            this.f28849a.run();
        }

        @Override // p5.q.h
        public void c(@NonNull q qVar) {
        }

        @Override // p5.q.h
        public void f(@NonNull q qVar) {
        }

        @Override // p5.q.h
        public void h(@NonNull q qVar) {
        }

        @Override // p5.q.h
        public void k(@NonNull q qVar) {
        }
    }

    public class e extends q.e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Rect f28850a;

        public e(Rect rect) {
            this.f28850a = rect;
        }

        @Override // p5.q.e
        public Rect a(@NonNull q qVar) {
            Rect rect = this.f28850a;
            if (rect == null || rect.isEmpty()) {
                return null;
            }
            return this.f28850a;
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
        return (w0.l(qVar.S()) && w0.l(qVar.U()) && w0.l(qVar.V())) ? false : true;
    }

    @Override // f4.w0
    public void A(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        b0 b0Var = (b0) obj;
        if (b0Var != null) {
            b0Var.W().clear();
            b0Var.W().addAll(arrayList2);
            E(b0Var, arrayList, arrayList2);
        }
    }

    @Override // f4.w0
    public Object B(Object obj) {
        if (obj == null) {
            return null;
        }
        b0 b0Var = new b0();
        b0Var.H0((q) obj);
        return b0Var;
    }

    public void E(@NonNull Object obj, @SuppressLint({"UnknownNullness"}) ArrayList<View> arrayList, @SuppressLint({"UnknownNullness"}) ArrayList<View> arrayList2) {
        q qVar = (q) obj;
        int i10 = 0;
        if (qVar instanceof b0) {
            b0 b0Var = (b0) qVar;
            int iK0 = b0Var.K0();
            while (i10 < iK0) {
                E(b0Var.J0(i10), arrayList, arrayList2);
                i10++;
            }
            return;
        }
        if (D(qVar)) {
            return;
        }
        List<View> listW = qVar.W();
        if (listW.size() == arrayList.size() && listW.containsAll(arrayList)) {
            int size = arrayList2 == null ? 0 : arrayList2.size();
            while (i10 < size) {
                qVar.e(arrayList2.get(i10));
                i10++;
            }
            for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                qVar.r0(arrayList.get(size2));
            }
        }
    }

    @Override // f4.w0
    public void a(@NonNull Object obj, @NonNull View view) {
        if (obj != null) {
            ((q) obj).e(view);
        }
    }

    @Override // f4.w0
    public void b(@NonNull Object obj, @NonNull ArrayList<View> arrayList) {
        q qVar = (q) obj;
        if (qVar == null) {
            return;
        }
        int i10 = 0;
        if (qVar instanceof b0) {
            b0 b0Var = (b0) qVar;
            int iK0 = b0Var.K0();
            while (i10 < iK0) {
                b(b0Var.J0(i10), arrayList);
                i10++;
            }
            return;
        }
        if (D(qVar) || !w0.l(qVar.W())) {
            return;
        }
        int size = arrayList.size();
        while (i10 < size) {
            qVar.e(arrayList.get(i10));
            i10++;
        }
    }

    @Override // f4.w0
    public void c(@NonNull Object obj) {
        ((a0) obj).d();
    }

    @Override // f4.w0
    public void d(@NonNull Object obj, @NonNull Runnable runnable) {
        ((a0) obj).l(runnable);
    }

    @Override // f4.w0
    public void e(@NonNull ViewGroup viewGroup, Object obj) {
        y.a(viewGroup, (q) obj);
    }

    @Override // f4.w0
    public boolean g(@NonNull Object obj) {
        return obj instanceof q;
    }

    @Override // f4.w0
    public Object h(Object obj) {
        if (obj != null) {
            return ((q) obj).clone();
        }
        return null;
    }

    @Override // f4.w0
    public Object j(@NonNull ViewGroup viewGroup, @NonNull Object obj) {
        return y.c(viewGroup, (q) obj);
    }

    @Override // f4.w0
    public boolean m() {
        return true;
    }

    @Override // f4.w0
    public boolean n(@NonNull Object obj) {
        boolean zC0 = ((q) obj).c0();
        if (!zC0) {
            Log.v("FragmentManager", "Predictive back not available for AndroidX Transition " + obj + ". Please enable seeking support for the designated transition by overriding isSeekingSupported().");
        }
        return zC0;
    }

    @Override // f4.w0
    public Object o(Object obj, Object obj2, Object obj3) {
        q qVarQ0 = (q) obj;
        q qVar = (q) obj2;
        q qVar2 = (q) obj3;
        if (qVarQ0 != null && qVar != null) {
            qVarQ0 = new b0().H0(qVarQ0).H0(qVar).Q0(1);
        } else if (qVarQ0 == null) {
            qVarQ0 = qVar != null ? qVar : null;
        }
        if (qVar2 == null) {
            return qVarQ0;
        }
        b0 b0Var = new b0();
        if (qVarQ0 != null) {
            b0Var.H0(qVarQ0);
        }
        b0Var.H0(qVar2);
        return b0Var;
    }

    @Override // f4.w0
    @NonNull
    public Object p(Object obj, Object obj2, Object obj3) {
        b0 b0Var = new b0();
        if (obj != null) {
            b0Var.H0((q) obj);
        }
        if (obj2 != null) {
            b0Var.H0((q) obj2);
        }
        if (obj3 != null) {
            b0Var.H0((q) obj3);
        }
        return b0Var;
    }

    @Override // f4.w0
    public void r(@NonNull Object obj, @NonNull View view, @NonNull ArrayList<View> arrayList) {
        ((q) obj).c(new b(view, arrayList));
    }

    @Override // f4.w0
    public void s(@NonNull Object obj, Object obj2, ArrayList<View> arrayList, Object obj3, ArrayList<View> arrayList2, Object obj4, ArrayList<View> arrayList3) {
        ((q) obj).c(new c(obj2, arrayList, obj3, arrayList2, obj4, arrayList3));
    }

    @Override // f4.w0
    public void t(@NonNull Object obj, float f10) {
        a0 a0Var = (a0) obj;
        if (a0Var.a()) {
            long jE = (long) (f10 * a0Var.e());
            if (jE == 0) {
                jE = 1;
            }
            if (jE == a0Var.e()) {
                jE = a0Var.e() - 1;
            }
            a0Var.i(jE);
        }
    }

    @Override // f4.w0
    public void u(@NonNull Object obj, @NonNull Rect rect) {
        if (obj != null) {
            ((q) obj).y0(new e(rect));
        }
    }

    @Override // f4.w0
    public void v(@NonNull Object obj, View view) {
        if (view != null) {
            Rect rect = new Rect();
            k(view, rect);
            ((q) obj).y0(new a(rect));
        }
    }

    @Override // f4.w0
    public void w(@NonNull f4.q qVar, @NonNull Object obj, @NonNull u2.e eVar, @NonNull Runnable runnable) {
        x(qVar, obj, eVar, null, runnable);
    }

    @Override // f4.w0
    public void x(@NonNull f4.q qVar, @NonNull Object obj, @NonNull u2.e eVar, final Runnable runnable, @NonNull final Runnable runnable2) {
        final q qVar2 = (q) obj;
        eVar.b(new u2.e.a() { // from class: p5.f
            @Override // u2.e.a
            public final void onCancel() {
                g.C(runnable, qVar2, runnable2);
            }
        });
        qVar2.c(new d(runnable2));
    }

    @Override // f4.w0
    public void z(@NonNull Object obj, @NonNull View view, @NonNull ArrayList<View> arrayList) {
        b0 b0Var = (b0) obj;
        List<View> listW = b0Var.W();
        listW.clear();
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            w0.f(listW, arrayList.get(i10));
        }
        listW.add(view);
        arrayList.add(view);
        b(b0Var, arrayList);
    }
}
