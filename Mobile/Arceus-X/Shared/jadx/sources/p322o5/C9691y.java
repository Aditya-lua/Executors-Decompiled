package p322o5;

import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.annotation.NonNull;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import p504w1.C12277a;

/* JADX INFO: renamed from: o5.y */
/* JADX INFO: loaded from: classes.dex */
public class C9691y {

    /* JADX INFO: renamed from: a */
    public static AbstractC9683q f35208a = new C9651a();

    /* JADX INFO: renamed from: b */
    public static ThreadLocal<WeakReference<C12277a<ViewGroup, ArrayList<AbstractC9683q>>>> f35209b = new ThreadLocal<>();

    /* JADX INFO: renamed from: c */
    public static ArrayList<ViewGroup> f35210c = new ArrayList<>();

    /* JADX INFO: renamed from: o5.y$a */
    public static class a implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

        /* JADX INFO: renamed from: a */
        public AbstractC9683q f35211a;

        /* JADX INFO: renamed from: b */
        public ViewGroup f35212b;

        /* JADX INFO: renamed from: o5.y$a$a, reason: collision with other inner class name */
        public class C14218a extends C9690x {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ C12277a f35213a;

            public C14218a(C12277a c12277a) {
                this.f35213a = c12277a;
            }

            @Override // p322o5.C9690x, p322o5.AbstractC9683q.h
            /* JADX INFO: renamed from: k */
            public void mo38109k(@NonNull AbstractC9683q abstractC9683q) {
                ((ArrayList) this.f35213a.get(a.this.f35212b)).remove(abstractC9683q);
                abstractC9683q.mo38133m0(this);
            }
        }

        public a(AbstractC9683q abstractC9683q, ViewGroup viewGroup) {
            this.f35211a = abstractC9683q;
            this.f35212b = viewGroup;
        }

        /* JADX INFO: renamed from: a */
        public final void m38309a() {
            this.f35212b.getViewTreeObserver().removeOnPreDrawListener(this);
            this.f35212b.removeOnAttachStateChangeListener(this);
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            m38309a();
            if (!C9691y.f35210c.remove(this.f35212b)) {
                return true;
            }
            C12277a<ViewGroup, ArrayList<AbstractC9683q>> c12277aM38305e = C9691y.m38305e();
            ArrayList<AbstractC9683q> arrayList = c12277aM38305e.get(this.f35212b);
            ArrayList arrayList2 = null;
            if (arrayList == null) {
                arrayList = new ArrayList<>();
                c12277aM38305e.put(this.f35212b, arrayList);
            } else if (arrayList.size() > 0) {
                arrayList2 = new ArrayList(arrayList);
            }
            arrayList.add(this.f35211a);
            this.f35211a.mo38129c(new C14218a(c12277aM38305e));
            int i10 = 0;
            this.f35211a.m38281p(this.f35212b, false);
            if (arrayList2 != null) {
                int size = arrayList2.size();
                while (i10 < size) {
                    Object obj = arrayList2.get(i10);
                    i10++;
                    ((AbstractC9683q) obj).mo38136o0(this.f35212b);
                }
            }
            this.f35211a.m38280k0(this.f35212b);
            return true;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            m38309a();
            C9691y.f35210c.remove(this.f35212b);
            ArrayList<AbstractC9683q> arrayList = C9691y.m38305e().get(this.f35212b);
            if (arrayList != null && arrayList.size() > 0) {
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    AbstractC9683q abstractC9683q = arrayList.get(i10);
                    i10++;
                    abstractC9683q.mo38136o0(this.f35212b);
                }
            }
            this.f35211a.m38283q(true);
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m38301a(@NonNull ViewGroup viewGroup, AbstractC9683q abstractC9683q) {
        if (f35210c.contains(viewGroup) || !viewGroup.isLaidOut()) {
            return;
        }
        f35210c.add(viewGroup);
        if (abstractC9683q == null) {
            abstractC9683q = f35208a;
        }
        AbstractC9683q abstractC9683qClone = abstractC9683q.clone();
        m38308h(viewGroup, abstractC9683qClone);
        C9677n.m38221f(viewGroup, null);
        m38307g(viewGroup, abstractC9683qClone);
    }

    /* JADX INFO: renamed from: b */
    public static void m38302b(C9677n c9677n, AbstractC9683q abstractC9683q) {
        ViewGroup viewGroupM38224d = c9677n.m38224d();
        if (f35210c.contains(viewGroupM38224d)) {
            return;
        }
        C9677n c9677nM38220c = C9677n.m38220c(viewGroupM38224d);
        if (abstractC9683q == null) {
            if (c9677nM38220c != null) {
                c9677nM38220c.m38223b();
            }
            c9677n.m38222a();
            return;
        }
        f35210c.add(viewGroupM38224d);
        AbstractC9683q abstractC9683qClone = abstractC9683q.clone();
        if (c9677nM38220c != null && c9677nM38220c.m38225e()) {
            abstractC9683qClone.mo38139r0(true);
        }
        m38308h(viewGroupM38224d, abstractC9683qClone);
        c9677n.m38222a();
        m38307g(viewGroupM38224d, abstractC9683qClone);
    }

    /* JADX INFO: renamed from: c */
    public static InterfaceC9652a0 m38303c(@NonNull ViewGroup viewGroup, @NonNull AbstractC9683q abstractC9683q) {
        if (f35210c.contains(viewGroup) || !viewGroup.isLaidOut() || Build.VERSION.SDK_INT < 34) {
            return null;
        }
        if (!abstractC9683q.mo38091Y()) {
            throw new IllegalArgumentException("The Transition must support seeking.");
        }
        f35210c.add(viewGroup);
        AbstractC9683q abstractC9683qClone = abstractC9683q.clone();
        C9654b0 c9654b0 = new C9654b0();
        c9654b0.m38116D0(abstractC9683qClone);
        m38308h(viewGroup, c9654b0);
        C9677n.m38221f(viewGroup, null);
        m38307g(viewGroup, c9654b0);
        viewGroup.invalidate();
        return c9654b0.m38284v();
    }

    /* JADX INFO: renamed from: d */
    public static void m38304d(ViewGroup viewGroup) {
        f35210c.remove(viewGroup);
        ArrayList<AbstractC9683q> arrayList = m38305e().get(viewGroup);
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        ArrayList arrayList2 = new ArrayList(arrayList);
        for (int size = arrayList2.size() - 1; size >= 0; size--) {
            ((AbstractC9683q) arrayList2.get(size)).mo38146x(viewGroup);
        }
    }

    /* JADX INFO: renamed from: e */
    public static C12277a<ViewGroup, ArrayList<AbstractC9683q>> m38305e() {
        C12277a<ViewGroup, ArrayList<AbstractC9683q>> c12277a;
        WeakReference<C12277a<ViewGroup, ArrayList<AbstractC9683q>>> weakReference = f35209b.get();
        if (weakReference != null && (c12277a = weakReference.get()) != null) {
            return c12277a;
        }
        C12277a<ViewGroup, ArrayList<AbstractC9683q>> c12277a2 = new C12277a<>();
        f35209b.set(new WeakReference<>(c12277a2));
        return c12277a2;
    }

    /* JADX INFO: renamed from: f */
    public static void m38306f(@NonNull C9677n c9677n, AbstractC9683q abstractC9683q) {
        m38302b(c9677n, abstractC9683q);
    }

    /* JADX INFO: renamed from: g */
    public static void m38307g(ViewGroup viewGroup, AbstractC9683q abstractC9683q) {
        if (abstractC9683q == null || viewGroup == null) {
            return;
        }
        a aVar = new a(abstractC9683q, viewGroup);
        viewGroup.addOnAttachStateChangeListener(aVar);
        viewGroup.getViewTreeObserver().addOnPreDrawListener(aVar);
    }

    /* JADX INFO: renamed from: h */
    public static void m38308h(ViewGroup viewGroup, AbstractC9683q abstractC9683q) {
        ArrayList<AbstractC9683q> arrayList = m38305e().get(viewGroup);
        if (arrayList != null && arrayList.size() > 0) {
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                AbstractC9683q abstractC9683q2 = arrayList.get(i10);
                i10++;
                abstractC9683q2.mo38131j0(viewGroup);
            }
        }
        if (abstractC9683q != null) {
            abstractC9683q.m38281p(viewGroup, true);
        }
        C9677n c9677nM38220c = C9677n.m38220c(viewGroup);
        if (c9677nM38220c != null) {
            c9677nM38220c.m38223b();
        }
    }
}
