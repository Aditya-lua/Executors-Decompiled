package p093e4;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.transition.Transition;
import android.transition.TransitionManager;
import android.transition.TransitionSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.fragment.app.ComponentCallbacksC0929c;
import androidx.fragment.app.FragmentManager;
import java.util.ArrayList;
import java.util.List;
import p456u2.C11776e;

/* JADX INFO: renamed from: e4.i0 */
/* JADX INFO: loaded from: classes.dex */
public class C4816i0 extends AbstractC4818j0 {

    /* JADX INFO: renamed from: e4.i0$a */
    public class a extends Transition.EpicenterCallback {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Rect f19439a;

        public a(Rect rect) {
            this.f19439a = rect;
        }

        @Override // android.transition.Transition.EpicenterCallback
        public Rect onGetEpicenter(Transition transition) {
            return this.f19439a;
        }
    }

    /* JADX INFO: renamed from: e4.i0$b */
    public class b implements Transition.TransitionListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ View f19441a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ ArrayList f19442b;

        /* JADX DEBUG: Incorrect args count in method signature: ()V */
        public b(View view, ArrayList arrayList) {
            this.f19441a = view;
            this.f19442b = arrayList;
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionCancel(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionEnd(Transition transition) {
            transition.removeListener(this);
            this.f19441a.setVisibility(8);
            int size = this.f19442b.size();
            for (int i10 = 0; i10 < size; i10++) {
                ((View) this.f19442b.get(i10)).setVisibility(0);
            }
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionPause(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionResume(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionStart(Transition transition) {
            transition.removeListener(this);
            transition.addListener(this);
        }
    }

    /* JADX INFO: renamed from: e4.i0$c */
    public class c implements Transition.TransitionListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Object f19444a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ ArrayList f19445b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ Object f19446c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ ArrayList f19447d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ Object f19448e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ ArrayList f19449f;

        /* JADX DEBUG: Incorrect args count in method signature: ()V */
        public c(Object obj, ArrayList arrayList, Object obj2, ArrayList arrayList2, Object obj3, ArrayList arrayList3) {
            this.f19444a = obj;
            this.f19445b = arrayList;
            this.f19446c = obj2;
            this.f19447d = arrayList2;
            this.f19448e = obj3;
            this.f19449f = arrayList3;
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionCancel(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionEnd(Transition transition) {
            transition.removeListener(this);
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionPause(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionResume(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionStart(Transition transition) {
            Object obj = this.f19444a;
            if (obj != null) {
                C4816i0.this.m23296D(obj, this.f19445b, null);
            }
            Object obj2 = this.f19446c;
            if (obj2 != null) {
                C4816i0.this.m23296D(obj2, this.f19447d, null);
            }
            Object obj3 = this.f19448e;
            if (obj3 != null) {
                C4816i0.this.m23296D(obj3, this.f19449f, null);
            }
        }
    }

    /* JADX INFO: renamed from: e4.i0$d */
    public class d implements Transition.TransitionListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Runnable f19451a;

        /* JADX DEBUG: Incorrect args count in method signature: ()V */
        public d(Runnable runnable) {
            this.f19451a = runnable;
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionCancel(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionEnd(Transition transition) {
            this.f19451a.run();
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionPause(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionResume(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionStart(Transition transition) {
        }
    }

    /* JADX INFO: renamed from: e4.i0$e */
    public class e extends Transition.EpicenterCallback {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Rect f19453a;

        public e(Rect rect) {
            this.f19453a = rect;
        }

        @Override // android.transition.Transition.EpicenterCallback
        public Rect onGetEpicenter(Transition transition) {
            Rect rect = this.f19453a;
            if (rect == null || rect.isEmpty()) {
                return null;
            }
            return this.f19453a;
        }
    }

    /* JADX INFO: renamed from: C */
    public static boolean m23293C(Transition transition) {
        return (AbstractC4818j0.m23314l(transition.getTargetIds()) && AbstractC4818j0.m23314l(transition.getTargetNames()) && AbstractC4818j0.m23314l(transition.getTargetTypes())) ? false : true;
    }

    @Override // p093e4.AbstractC4818j0
    /* JADX INFO: renamed from: A */
    public void mo23294A(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        TransitionSet transitionSet = (TransitionSet) obj;
        if (transitionSet != null) {
            transitionSet.getTargets().clear();
            transitionSet.getTargets().addAll(arrayList2);
            m23296D(transitionSet, arrayList, arrayList2);
        }
    }

    @Override // p093e4.AbstractC4818j0
    /* JADX INFO: renamed from: B */
    public Object mo23295B(Object obj) {
        if (obj == null) {
            return null;
        }
        TransitionSet transitionSet = new TransitionSet();
        transitionSet.addTransition((Transition) obj);
        return transitionSet;
    }

    /* JADX INFO: renamed from: D */
    public void m23296D(@NonNull Object obj, @SuppressLint({"UnknownNullness"}) ArrayList<View> arrayList, @SuppressLint({"UnknownNullness"}) ArrayList<View> arrayList2) {
        List<View> targets;
        Transition transition = (Transition) obj;
        int i10 = 0;
        if (transition instanceof TransitionSet) {
            TransitionSet transitionSet = (TransitionSet) transition;
            int transitionCount = transitionSet.getTransitionCount();
            while (i10 < transitionCount) {
                m23296D(transitionSet.getTransitionAt(i10), arrayList, arrayList2);
                i10++;
            }
            return;
        }
        if (m23293C(transition) || (targets = transition.getTargets()) == null || targets.size() != arrayList.size() || !targets.containsAll(arrayList)) {
            return;
        }
        int size = arrayList2 == null ? 0 : arrayList2.size();
        while (i10 < size) {
            transition.addTarget(arrayList2.get(i10));
            i10++;
        }
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            transition.removeTarget(arrayList.get(size2));
        }
    }

    @Override // p093e4.AbstractC4818j0
    /* JADX INFO: renamed from: a */
    public void mo23297a(@NonNull Object obj, @NonNull View view) {
        if (obj != null) {
            ((Transition) obj).addTarget(view);
        }
    }

    @Override // p093e4.AbstractC4818j0
    /* JADX INFO: renamed from: b */
    public void mo23298b(@NonNull Object obj, @NonNull ArrayList<View> arrayList) {
        Transition transition = (Transition) obj;
        if (transition == null) {
            return;
        }
        int i10 = 0;
        if (transition instanceof TransitionSet) {
            TransitionSet transitionSet = (TransitionSet) transition;
            int transitionCount = transitionSet.getTransitionCount();
            while (i10 < transitionCount) {
                mo23298b(transitionSet.getTransitionAt(i10), arrayList);
                i10++;
            }
            return;
        }
        if (m23293C(transition) || !AbstractC4818j0.m23314l(transition.getTargets())) {
            return;
        }
        int size = arrayList.size();
        while (i10 < size) {
            transition.addTarget(arrayList.get(i10));
            i10++;
        }
    }

    @Override // p093e4.AbstractC4818j0
    /* JADX INFO: renamed from: e */
    public void mo23299e(@NonNull ViewGroup viewGroup, Object obj) {
        TransitionManager.beginDelayedTransition(viewGroup, (Transition) obj);
    }

    @Override // p093e4.AbstractC4818j0
    /* JADX INFO: renamed from: g */
    public boolean mo23300g(@NonNull Object obj) {
        return obj instanceof Transition;
    }

    @Override // p093e4.AbstractC4818j0
    /* JADX INFO: renamed from: h */
    public Object mo23301h(Object obj) {
        if (obj != null) {
            return ((Transition) obj).clone();
        }
        return null;
    }

    @Override // p093e4.AbstractC4818j0
    /* JADX INFO: renamed from: m */
    public boolean mo23302m() {
        if (!FragmentManager.m4349N0(4)) {
            return false;
        }
        Log.i("FragmentManager", "Predictive back not available using Framework Transitions. Please switch to AndroidX Transition 1.5.0 or higher to enable seeking.");
        return false;
    }

    @Override // p093e4.AbstractC4818j0
    /* JADX INFO: renamed from: n */
    public boolean mo23303n(@NonNull Object obj) {
        if (!FragmentManager.m4349N0(2)) {
            return false;
        }
        Log.v("FragmentManager", "Predictive back not available for framework transition " + obj + ". Please switch to AndroidX Transition 1.5.0 or higher to enable seeking.");
        return false;
    }

    @Override // p093e4.AbstractC4818j0
    /* JADX INFO: renamed from: o */
    public Object mo23304o(Object obj, Object obj2, Object obj3) {
        Transition ordering = (Transition) obj;
        Transition transition = (Transition) obj2;
        Transition transition2 = (Transition) obj3;
        if (ordering != null && transition != null) {
            ordering = new TransitionSet().addTransition(ordering).addTransition(transition).setOrdering(1);
        } else if (ordering == null) {
            ordering = transition != null ? transition : null;
        }
        if (transition2 == null) {
            return ordering;
        }
        TransitionSet transitionSet = new TransitionSet();
        if (ordering != null) {
            transitionSet.addTransition(ordering);
        }
        transitionSet.addTransition(transition2);
        return transitionSet;
    }

    @Override // p093e4.AbstractC4818j0
    /* JADX INFO: renamed from: p */
    public Object mo23305p(Object obj, Object obj2, Object obj3) {
        TransitionSet transitionSet = new TransitionSet();
        if (obj != null) {
            transitionSet.addTransition((Transition) obj);
        }
        if (obj2 != null) {
            transitionSet.addTransition((Transition) obj2);
        }
        if (obj3 != null) {
            transitionSet.addTransition((Transition) obj3);
        }
        return transitionSet;
    }

    @Override // p093e4.AbstractC4818j0
    /* JADX INFO: renamed from: r */
    public void mo23306r(@NonNull Object obj, @NonNull View view, @NonNull ArrayList<View> arrayList) {
        ((Transition) obj).addListener(new b(view, arrayList));
    }

    @Override // p093e4.AbstractC4818j0
    /* JADX INFO: renamed from: s */
    public void mo23307s(@NonNull Object obj, Object obj2, ArrayList<View> arrayList, Object obj3, ArrayList<View> arrayList2, Object obj4, ArrayList<View> arrayList3) {
        ((Transition) obj).addListener(new c(obj2, arrayList, obj3, arrayList2, obj4, arrayList3));
    }

    @Override // p093e4.AbstractC4818j0
    /* JADX INFO: renamed from: u */
    public void mo23308u(@NonNull Object obj, @NonNull Rect rect) {
        if (obj != null) {
            ((Transition) obj).setEpicenterCallback(new e(rect));
        }
    }

    @Override // p093e4.AbstractC4818j0
    /* JADX INFO: renamed from: v */
    public void mo23309v(@NonNull Object obj, View view) {
        if (view != null) {
            Rect rect = new Rect();
            m23318k(view, rect);
            ((Transition) obj).setEpicenterCallback(new a(rect));
        }
    }

    @Override // p093e4.AbstractC4818j0
    /* JADX INFO: renamed from: w */
    public void mo23310w(@NonNull ComponentCallbacksC0929c componentCallbacksC0929c, @NonNull Object obj, @NonNull C11776e c11776e, @NonNull Runnable runnable) {
        ((Transition) obj).addListener(new d(runnable));
    }

    @Override // p093e4.AbstractC4818j0
    /* JADX INFO: renamed from: z */
    public void mo23311z(@NonNull Object obj, @NonNull View view, @NonNull ArrayList<View> arrayList) {
        TransitionSet transitionSet = (TransitionSet) obj;
        List<View> targets = transitionSet.getTargets();
        targets.clear();
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            AbstractC4818j0.m23312f(targets, arrayList.get(i10));
        }
        targets.add(view);
        arrayList.add(view);
        mo23298b(transitionSet, arrayList);
    }
}
