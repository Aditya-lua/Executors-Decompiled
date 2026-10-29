package p322o5;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.fragment.app.ComponentCallbacksC0929c;
import java.util.ArrayList;
import java.util.List;
import p093e4.AbstractC4818j0;
import p456u2.C11776e;

/* JADX INFO: renamed from: o5.g */
/* JADX INFO: loaded from: classes.dex */
public class C9663g extends AbstractC4818j0 {

    /* JADX INFO: renamed from: o5.g$a */
    public class a extends AbstractC9683q.e {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Rect f35064a;

        public a(Rect rect) {
            this.f35064a = rect;
        }

        @Override // p322o5.AbstractC9683q.e
        /* JADX INFO: renamed from: a */
        public Rect mo38177a(@NonNull AbstractC9683q abstractC9683q) {
            return this.f35064a;
        }
    }

    /* JADX INFO: renamed from: o5.g$b */
    public class b implements AbstractC9683q.h {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ View f35066a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ ArrayList f35067b;

        /* JADX DEBUG: Incorrect args count in method signature: ()V */
        public b(View view, ArrayList arrayList) {
            this.f35066a = view;
            this.f35067b = arrayList;
        }

        @Override // p322o5.AbstractC9683q.h
        /* JADX INFO: renamed from: a */
        public void mo38105a(@NonNull AbstractC9683q abstractC9683q) {
        }

        @Override // p322o5.AbstractC9683q.h
        /* JADX INFO: renamed from: b */
        public void mo38106b(@NonNull AbstractC9683q abstractC9683q) {
        }

        @Override // p322o5.AbstractC9683q.h
        /* JADX INFO: renamed from: d */
        public void mo38107d(@NonNull AbstractC9683q abstractC9683q) {
        }

        @Override // p322o5.AbstractC9683q.h
        /* JADX INFO: renamed from: g */
        public void mo38108g(@NonNull AbstractC9683q abstractC9683q) {
            abstractC9683q.mo38133m0(this);
            abstractC9683q.mo38129c(this);
        }

        @Override // p322o5.AbstractC9683q.h
        /* JADX INFO: renamed from: k */
        public void mo38109k(@NonNull AbstractC9683q abstractC9683q) {
            abstractC9683q.mo38133m0(this);
            this.f35066a.setVisibility(8);
            int size = this.f35067b.size();
            for (int i10 = 0; i10 < size; i10++) {
                ((View) this.f35067b.get(i10)).setVisibility(0);
            }
        }
    }

    /* JADX INFO: renamed from: o5.g$c */
    public class c extends C9690x {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Object f35069a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ ArrayList f35070b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ Object f35071c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ ArrayList f35072d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ Object f35073e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ ArrayList f35074f;

        public c(Object obj, ArrayList arrayList, Object obj2, ArrayList arrayList2, Object obj3, ArrayList arrayList3) {
            this.f35069a = obj;
            this.f35070b = arrayList;
            this.f35071c = obj2;
            this.f35072d = arrayList2;
            this.f35073e = obj3;
            this.f35074f = arrayList3;
        }

        @Override // p322o5.C9690x, p322o5.AbstractC9683q.h
        /* JADX INFO: renamed from: g */
        public void mo38108g(@NonNull AbstractC9683q abstractC9683q) {
            Object obj = this.f35069a;
            if (obj != null) {
                C9663g.this.m38176E(obj, this.f35070b, null);
            }
            Object obj2 = this.f35071c;
            if (obj2 != null) {
                C9663g.this.m38176E(obj2, this.f35072d, null);
            }
            Object obj3 = this.f35073e;
            if (obj3 != null) {
                C9663g.this.m38176E(obj3, this.f35074f, null);
            }
        }

        @Override // p322o5.C9690x, p322o5.AbstractC9683q.h
        /* JADX INFO: renamed from: k */
        public void mo38109k(@NonNull AbstractC9683q abstractC9683q) {
            abstractC9683q.mo38133m0(this);
        }
    }

    /* JADX INFO: renamed from: o5.g$d */
    public class d implements AbstractC9683q.h {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Runnable f35076a;

        /* JADX DEBUG: Incorrect args count in method signature: ()V */
        public d(Runnable runnable) {
            this.f35076a = runnable;
        }

        @Override // p322o5.AbstractC9683q.h
        /* JADX INFO: renamed from: a */
        public void mo38105a(@NonNull AbstractC9683q abstractC9683q) {
        }

        @Override // p322o5.AbstractC9683q.h
        /* JADX INFO: renamed from: b */
        public void mo38106b(@NonNull AbstractC9683q abstractC9683q) {
        }

        @Override // p322o5.AbstractC9683q.h
        /* JADX INFO: renamed from: d */
        public void mo38107d(@NonNull AbstractC9683q abstractC9683q) {
        }

        @Override // p322o5.AbstractC9683q.h
        /* JADX INFO: renamed from: g */
        public void mo38108g(@NonNull AbstractC9683q abstractC9683q) {
        }

        @Override // p322o5.AbstractC9683q.h
        /* JADX INFO: renamed from: k */
        public void mo38109k(@NonNull AbstractC9683q abstractC9683q) {
            this.f35076a.run();
        }
    }

    /* JADX INFO: renamed from: o5.g$e */
    public class e extends AbstractC9683q.e {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Rect f35078a;

        public e(Rect rect) {
            this.f35078a = rect;
        }

        @Override // p322o5.AbstractC9683q.e
        /* JADX INFO: renamed from: a */
        public Rect mo38177a(@NonNull AbstractC9683q abstractC9683q) {
            Rect rect = this.f35078a;
            if (rect == null || rect.isEmpty()) {
                return null;
            }
            return this.f35078a;
        }
    }

    /* JADX INFO: renamed from: C */
    public static /* synthetic */ void m38174C(Runnable runnable, AbstractC9683q abstractC9683q, Runnable runnable2) {
        if (runnable != null) {
            runnable.run();
        } else {
            abstractC9683q.cancel();
            runnable2.run();
        }
    }

    /* JADX INFO: renamed from: D */
    public static boolean m38175D(AbstractC9683q abstractC9683q) {
        return (AbstractC4818j0.m23314l(abstractC9683q.m38263Q()) && AbstractC4818j0.m23314l(abstractC9683q.m38264R()) && AbstractC4818j0.m23314l(abstractC9683q.m38265S())) ? false : true;
    }

    @Override // p093e4.AbstractC4818j0
    /* JADX INFO: renamed from: A */
    public void mo23294A(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        C9654b0 c9654b0 = (C9654b0) obj;
        if (c9654b0 != null) {
            c9654b0.m38266T().clear();
            c9654b0.m38266T().addAll(arrayList2);
            m38176E(c9654b0, arrayList, arrayList2);
        }
    }

    @Override // p093e4.AbstractC4818j0
    /* JADX INFO: renamed from: B */
    public Object mo23295B(Object obj) {
        if (obj == null) {
            return null;
        }
        C9654b0 c9654b0 = new C9654b0();
        c9654b0.m38116D0((AbstractC9683q) obj);
        return c9654b0;
    }

    /* JADX INFO: renamed from: E */
    public void m38176E(@NonNull Object obj, @SuppressLint({"UnknownNullness"}) ArrayList<View> arrayList, @SuppressLint({"UnknownNullness"}) ArrayList<View> arrayList2) {
        AbstractC9683q abstractC9683q = (AbstractC9683q) obj;
        int i10 = 0;
        if (abstractC9683q instanceof C9654b0) {
            C9654b0 c9654b0 = (C9654b0) abstractC9683q;
            int iM38119G0 = c9654b0.m38119G0();
            while (i10 < iM38119G0) {
                m38176E(c9654b0.m38118F0(i10), arrayList, arrayList2);
                i10++;
            }
            return;
        }
        if (m38175D(abstractC9683q)) {
            return;
        }
        List<View> listM38266T = abstractC9683q.m38266T();
        if (listM38266T.size() == arrayList.size() && listM38266T.containsAll(arrayList)) {
            int size = arrayList2 == null ? 0 : arrayList2.size();
            while (i10 < size) {
                abstractC9683q.mo38130e(arrayList2.get(i10));
                i10++;
            }
            for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                abstractC9683q.mo38135n0(arrayList.get(size2));
            }
        }
    }

    @Override // p093e4.AbstractC4818j0
    /* JADX INFO: renamed from: a */
    public void mo23297a(@NonNull Object obj, @NonNull View view) {
        if (obj != null) {
            ((AbstractC9683q) obj).mo38130e(view);
        }
    }

    @Override // p093e4.AbstractC4818j0
    /* JADX INFO: renamed from: b */
    public void mo23298b(@NonNull Object obj, @NonNull ArrayList<View> arrayList) {
        AbstractC9683q abstractC9683q = (AbstractC9683q) obj;
        if (abstractC9683q == null) {
            return;
        }
        int i10 = 0;
        if (abstractC9683q instanceof C9654b0) {
            C9654b0 c9654b0 = (C9654b0) abstractC9683q;
            int iM38119G0 = c9654b0.m38119G0();
            while (i10 < iM38119G0) {
                mo23298b(c9654b0.m38118F0(i10), arrayList);
                i10++;
            }
            return;
        }
        if (m38175D(abstractC9683q) || !AbstractC4818j0.m23314l(abstractC9683q.m38266T())) {
            return;
        }
        int size = arrayList.size();
        while (i10 < size) {
            abstractC9683q.mo38130e(arrayList.get(i10));
            i10++;
        }
    }

    @Override // p093e4.AbstractC4818j0
    /* JADX INFO: renamed from: c */
    public void mo23315c(@NonNull Object obj) {
        ((InterfaceC9652a0) obj).mo38085c();
    }

    @Override // p093e4.AbstractC4818j0
    /* JADX INFO: renamed from: d */
    public void mo23316d(@NonNull Object obj, @NonNull Runnable runnable) {
        ((InterfaceC9652a0) obj).mo38088j(runnable);
    }

    @Override // p093e4.AbstractC4818j0
    /* JADX INFO: renamed from: e */
    public void mo23299e(@NonNull ViewGroup viewGroup, Object obj) {
        C9691y.m38301a(viewGroup, (AbstractC9683q) obj);
    }

    @Override // p093e4.AbstractC4818j0
    /* JADX INFO: renamed from: g */
    public boolean mo23300g(@NonNull Object obj) {
        return obj instanceof AbstractC9683q;
    }

    @Override // p093e4.AbstractC4818j0
    /* JADX INFO: renamed from: h */
    public Object mo23301h(Object obj) {
        if (obj != null) {
            return ((AbstractC9683q) obj).clone();
        }
        return null;
    }

    @Override // p093e4.AbstractC4818j0
    /* JADX INFO: renamed from: j */
    public Object mo23317j(@NonNull ViewGroup viewGroup, @NonNull Object obj) {
        return C9691y.m38303c(viewGroup, (AbstractC9683q) obj);
    }

    @Override // p093e4.AbstractC4818j0
    /* JADX INFO: renamed from: m */
    public boolean mo23302m() {
        return true;
    }

    @Override // p093e4.AbstractC4818j0
    /* JADX INFO: renamed from: n */
    public boolean mo23303n(@NonNull Object obj) {
        boolean zMo38091Y = ((AbstractC9683q) obj).mo38091Y();
        if (!zMo38091Y) {
            Log.v("FragmentManager", "Predictive back not available for AndroidX Transition " + obj + ". Please enable seeking support for the designated transition by overriding isSeekingSupported().");
        }
        return zMo38091Y;
    }

    @Override // p093e4.AbstractC4818j0
    /* JADX INFO: renamed from: o */
    public Object mo23304o(Object obj, Object obj2, Object obj3) {
        AbstractC9683q abstractC9683qM38125M0 = (AbstractC9683q) obj;
        AbstractC9683q abstractC9683q = (AbstractC9683q) obj2;
        AbstractC9683q abstractC9683q2 = (AbstractC9683q) obj3;
        if (abstractC9683qM38125M0 != null && abstractC9683q != null) {
            abstractC9683qM38125M0 = new C9654b0().m38116D0(abstractC9683qM38125M0).m38116D0(abstractC9683q).m38125M0(1);
        } else if (abstractC9683qM38125M0 == null) {
            abstractC9683qM38125M0 = abstractC9683q != null ? abstractC9683q : null;
        }
        if (abstractC9683q2 == null) {
            return abstractC9683qM38125M0;
        }
        C9654b0 c9654b0 = new C9654b0();
        if (abstractC9683qM38125M0 != null) {
            c9654b0.m38116D0(abstractC9683qM38125M0);
        }
        c9654b0.m38116D0(abstractC9683q2);
        return c9654b0;
    }

    @Override // p093e4.AbstractC4818j0
    @NonNull
    /* JADX INFO: renamed from: p */
    public Object mo23305p(Object obj, Object obj2, Object obj3) {
        C9654b0 c9654b0 = new C9654b0();
        if (obj != null) {
            c9654b0.m38116D0((AbstractC9683q) obj);
        }
        if (obj2 != null) {
            c9654b0.m38116D0((AbstractC9683q) obj2);
        }
        if (obj3 != null) {
            c9654b0.m38116D0((AbstractC9683q) obj3);
        }
        return c9654b0;
    }

    @Override // p093e4.AbstractC4818j0
    /* JADX INFO: renamed from: r */
    public void mo23306r(@NonNull Object obj, @NonNull View view, @NonNull ArrayList<View> arrayList) {
        ((AbstractC9683q) obj).mo38129c(new b(view, arrayList));
    }

    @Override // p093e4.AbstractC4818j0
    /* JADX INFO: renamed from: s */
    public void mo23307s(@NonNull Object obj, Object obj2, ArrayList<View> arrayList, Object obj3, ArrayList<View> arrayList2, Object obj4, ArrayList<View> arrayList3) {
        ((AbstractC9683q) obj).mo38129c(new c(obj2, arrayList, obj3, arrayList2, obj4, arrayList3));
    }

    @Override // p093e4.AbstractC4818j0
    /* JADX INFO: renamed from: t */
    public void mo23320t(@NonNull Object obj, float f10) {
        InterfaceC9652a0 interfaceC9652a0 = (InterfaceC9652a0) obj;
        if (interfaceC9652a0.isReady()) {
            long jMo38086f = (long) (f10 * interfaceC9652a0.mo38086f());
            if (jMo38086f == 0) {
                jMo38086f = 1;
            }
            if (jMo38086f == interfaceC9652a0.mo38086f()) {
                jMo38086f = interfaceC9652a0.mo38086f() - 1;
            }
            interfaceC9652a0.mo38087h(jMo38086f);
        }
    }

    @Override // p093e4.AbstractC4818j0
    /* JADX INFO: renamed from: u */
    public void mo23308u(@NonNull Object obj, @NonNull Rect rect) {
        if (obj != null) {
            ((AbstractC9683q) obj).mo38143u0(new e(rect));
        }
    }

    @Override // p093e4.AbstractC4818j0
    /* JADX INFO: renamed from: v */
    public void mo23309v(@NonNull Object obj, View view) {
        if (view != null) {
            Rect rect = new Rect();
            m23318k(view, rect);
            ((AbstractC9683q) obj).mo38143u0(new a(rect));
        }
    }

    @Override // p093e4.AbstractC4818j0
    /* JADX INFO: renamed from: w */
    public void mo23310w(@NonNull ComponentCallbacksC0929c componentCallbacksC0929c, @NonNull Object obj, @NonNull C11776e c11776e, @NonNull Runnable runnable) {
        mo23321x(componentCallbacksC0929c, obj, c11776e, null, runnable);
    }

    @Override // p093e4.AbstractC4818j0
    /* JADX INFO: renamed from: x */
    public void mo23321x(@NonNull ComponentCallbacksC0929c componentCallbacksC0929c, @NonNull Object obj, @NonNull C11776e c11776e, final Runnable runnable, @NonNull final Runnable runnable2) {
        final AbstractC9683q abstractC9683q = (AbstractC9683q) obj;
        c11776e.m44059b(new C11776e.a() { // from class: o5.f
            @Override // p456u2.C11776e.a
            public final void onCancel() {
                C9663g.m38174C(runnable, abstractC9683q, runnable2);
            }
        });
        abstractC9683q.mo38129c(new d(runnable2));
    }

    @Override // p093e4.AbstractC4818j0
    /* JADX INFO: renamed from: z */
    public void mo23311z(@NonNull Object obj, @NonNull View view, @NonNull ArrayList<View> arrayList) {
        C9654b0 c9654b0 = (C9654b0) obj;
        List<View> listM38266T = c9654b0.m38266T();
        listM38266T.clear();
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            AbstractC4818j0.m23312f(listM38266T, arrayList.get(i10));
        }
        listM38266T.add(view);
        arrayList.add(view);
        mo23298b(c9654b0, arrayList);
    }
}
