package o5;

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
    public static q f27203a = new o5.a();
    public static ThreadLocal<WeakReference<w1.a<ViewGroup, ArrayList<q>>>> b = new ThreadLocal<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static ArrayList<ViewGroup> f27204c = new ArrayList<>();

    public static class a implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public q f27205a;
        public ViewGroup b;

        /* JADX INFO: renamed from: o5.y$a$a, reason: collision with other inner class name */
        public class C0469a extends x {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ w1.a f27206a;

            public C0469a(w1.a aVar) {
                this.f27206a = aVar;
            }

            @Override // o5.x, o5.q.h
            public void k(@NonNull q qVar) {
                ((ArrayList) this.f27206a.get(a.this.b)).remove(qVar);
                qVar.m0(this);
            }
        }

        public a(q qVar, ViewGroup viewGroup) {
            this.f27205a = qVar;
            this.b = viewGroup;
        }

        public final void a() {
            this.b.getViewTreeObserver().removeOnPreDrawListener(this);
            this.b.removeOnAttachStateChangeListener(this);
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            a();
            if (!y.f27204c.remove(this.b)) {
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
            arrayList.add(this.f27205a);
            this.f27205a.c(new C0469a(aVarE));
            int i10 = 0;
            this.f27205a.p(this.b, false);
            if (arrayList2 != null) {
                int size = arrayList2.size();
                while (i10 < size) {
                    Object obj = arrayList2.get(i10);
                    i10++;
                    ((q) obj).o0(this.b);
                }
            }
            this.f27205a.k0(this.b);
            return true;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            a();
            y.f27204c.remove(this.b);
            ArrayList<q> arrayList = y.e().get(this.b);
            if (arrayList != null && arrayList.size() > 0) {
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    q qVar = arrayList.get(i10);
                    i10++;
                    qVar.o0(this.b);
                }
            }
            this.f27205a.q(true);
        }
    }

    public static void a(@NonNull ViewGroup viewGroup, q qVar) {
        if (f27204c.contains(viewGroup) || !viewGroup.isLaidOut()) {
            return;
        }
        f27204c.add(viewGroup);
        if (qVar == null) {
            qVar = f27203a;
        }
        q qVarClone = qVar.clone();
        h(viewGroup, qVarClone);
        n.f(viewGroup, null);
        g(viewGroup, qVarClone);
    }

    public static void b(n nVar, q qVar) {
        ViewGroup viewGroupD = nVar.d();
        if (f27204c.contains(viewGroupD)) {
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
        f27204c.add(viewGroupD);
        q qVarClone = qVar.clone();
        if (nVarC != null && nVarC.e()) {
            qVarClone.r0(true);
        }
        h(viewGroupD, qVarClone);
        nVar.a();
        g(viewGroupD, qVarClone);
    }

    public static a0 c(@NonNull ViewGroup viewGroup, @NonNull q qVar) {
        if (f27204c.contains(viewGroup) || !viewGroup.isLaidOut() || Build.VERSION.SDK_INT < 34) {
            return null;
        }
        if (!qVar.Y()) {
            throw new IllegalArgumentException("The Transition must support seeking.");
        }
        f27204c.add(viewGroup);
        q qVarClone = qVar.clone();
        b0 b0Var = new b0();
        b0Var.D0(qVarClone);
        h(viewGroup, b0Var);
        n.f(viewGroup, null);
        g(viewGroup, b0Var);
        viewGroup.invalidate();
        return b0Var.v();
    }

    public static void d(ViewGroup viewGroup) {
        f27204c.remove(viewGroup);
        ArrayList<q> arrayList = e().get(viewGroup);
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        ArrayList arrayList2 = new ArrayList(arrayList);
        for (int size = arrayList2.size() - 1; size >= 0; size--) {
            ((q) arrayList2.get(size)).x(viewGroup);
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
                qVar2.j0(viewGroup);
            }
        }
        if (qVar != null) {
            qVar.p(viewGroup, true);
        }
        n nVarC = n.c(viewGroup);
        if (nVarC != null) {
            nVarC.b();
        }
    }
}
