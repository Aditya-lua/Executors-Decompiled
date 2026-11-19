package p5;

import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.annotation.NonNull;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static q f28939a = new p5.a();
    public static ThreadLocal<WeakReference<w1.a<ViewGroup, ArrayList<q>>>> b = new ThreadLocal<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static ArrayList<ViewGroup> f28940c = new ArrayList<>();

    public static class a implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public q f28941a;
        public ViewGroup b;

        /* JADX INFO: renamed from: p5.y$a$a, reason: collision with other inner class name */
        public class C0557a extends x {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ w1.a f28942a;

            public C0557a(w1.a aVar) {
                this.f28942a = aVar;
            }

            @Override // p5.x, p5.q.h
            public void b(@NonNull q qVar) {
                ((ArrayList) this.f28942a.get(a.this.b)).remove(qVar);
                qVar.q0(this);
            }
        }

        public a(q qVar, ViewGroup viewGroup) {
            this.f28941a = qVar;
            this.b = viewGroup;
        }

        public final void a() {
            this.b.getViewTreeObserver().removeOnPreDrawListener(this);
            this.b.removeOnAttachStateChangeListener(this);
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            a();
            if (!y.f28940c.remove(this.b)) {
                return true;
            }
            w1.a<ViewGroup, ArrayList<q>> aVarE = y.e();
            ArrayList<q> arrayList = aVarE.get(this.b);
            ArrayList arrayList2 = null;
            if (arrayList == null) {
                arrayList = new ArrayList<>();
                aVarE.put(this.b, arrayList);
            } else if (arrayList.size() > 0) {
                arrayList2 = new ArrayList(arrayList);
            }
            arrayList.add(this.f28941a);
            this.f28941a.c(new C0557a(aVarE));
            int i10 = 0;
            this.f28941a.r(this.b, false);
            if (arrayList2 != null) {
                int size = arrayList2.size();
                while (i10 < size) {
                    Object obj = arrayList2.get(i10);
                    i10++;
                    ((q) obj).s0(this.b);
                }
            }
            this.f28941a.o0(this.b);
            return true;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            a();
            y.f28940c.remove(this.b);
            ArrayList<q> arrayList = y.e().get(this.b);
            if (arrayList != null && arrayList.size() > 0) {
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    q qVar = arrayList.get(i10);
                    i10++;
                    qVar.s0(this.b);
                }
            }
            this.f28941a.s(true);
        }
    }

    public static void a(@NonNull ViewGroup viewGroup, q qVar) {
        if (f28940c.contains(viewGroup) || !viewGroup.isLaidOut()) {
            return;
        }
        f28940c.add(viewGroup);
        if (qVar == null) {
            qVar = f28939a;
        }
        q qVarClone = qVar.clone();
        h(viewGroup, qVarClone);
        n.f(viewGroup, null);
        g(viewGroup, qVarClone);
    }

    public static void b(n nVar, q qVar) {
        ViewGroup viewGroupD = nVar.d();
        if (f28940c.contains(viewGroupD)) {
            return;
        }
        n nVarC = n.c(viewGroupD);
        if (qVar == null) {
            if (nVarC != null) {
                nVarC.b();
            }
            nVar.a();
            return;
        }
        f28940c.add(viewGroupD);
        q qVarClone = qVar.clone();
        if (nVarC != null && nVarC.e()) {
            qVarClone.v0(true);
        }
        h(viewGroupD, qVarClone);
        nVar.a();
        g(viewGroupD, qVarClone);
    }

    public static a0 c(@NonNull ViewGroup viewGroup, @NonNull q qVar) {
        if (f28940c.contains(viewGroup) || !viewGroup.isLaidOut() || Build.VERSION.SDK_INT < 34) {
            return null;
        }
        if (!qVar.c0()) {
            throw new IllegalArgumentException("The Transition must support seeking.");
        }
        f28940c.add(viewGroup);
        q qVarClone = qVar.clone();
        b0 b0Var = new b0();
        b0Var.H0(qVarClone);
        h(viewGroup, b0Var);
        n.f(viewGroup, null);
        g(viewGroup, b0Var);
        viewGroup.invalidate();
        return b0Var.x();
    }

    public static void d(ViewGroup viewGroup) {
        f28940c.remove(viewGroup);
        ArrayList<q> arrayList = e().get(viewGroup);
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        ArrayList arrayList2 = new ArrayList(arrayList);
        for (int size = arrayList2.size() - 1; size >= 0; size--) {
            ((q) arrayList2.get(size)).z(viewGroup);
        }
    }

    public static w1.a<ViewGroup, ArrayList<q>> e() {
        w1.a<ViewGroup, ArrayList<q>> aVar;
        WeakReference<w1.a<ViewGroup, ArrayList<q>>> weakReference = b.get();
        if (weakReference != null && (aVar = weakReference.get()) != null) {
            return aVar;
        }
        w1.a<ViewGroup, ArrayList<q>> aVar2 = new w1.a<>();
        b.set(new WeakReference<>(aVar2));
        return aVar2;
    }

    public static void f(@NonNull n nVar, q qVar) {
        b(nVar, qVar);
    }

    public static void g(ViewGroup viewGroup, q qVar) {
        if (qVar == null || viewGroup == null) {
            return;
        }
        a aVar = new a(qVar, viewGroup);
        viewGroup.addOnAttachStateChangeListener(aVar);
        viewGroup.getViewTreeObserver().addOnPreDrawListener(aVar);
    }

    public static void h(ViewGroup viewGroup, q qVar) {
        ArrayList<q> arrayList = e().get(viewGroup);
        if (arrayList != null && arrayList.size() > 0) {
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                q qVar2 = arrayList.get(i10);
                i10++;
                qVar2.n0(viewGroup);
            }
        }
        if (qVar != null) {
            qVar.r(viewGroup, true);
        }
        n nVarC = n.c(viewGroup);
        if (nVarC != null) {
            nVarC.b();
        }
    }
}
