package androidx.fragment.app;

import android.animation.Animator;
import android.app.Activity;
import android.app.Application;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.annotation.NonNull;
import androidx.core.view.C0620m;
import androidx.fragment.app.ComponentCallbacksC0929c;
import androidx.p616lifecycle.AbstractC0940a0;
import androidx.p616lifecycle.AbstractC0966l;
import androidx.p616lifecycle.C0941a1;
import androidx.p616lifecycle.C0944b1;
import androidx.p616lifecycle.C0949d0;
import androidx.p616lifecycle.C0973o0;
import androidx.p616lifecycle.C0983t0;
import androidx.p616lifecycle.C0984u;
import androidx.p616lifecycle.C14302e1;
import androidx.p616lifecycle.InterfaceC0947c1;
import androidx.p616lifecycle.InterfaceC0962j;
import androidx.p616lifecycle.InterfaceC0974p;
import androidx.p616lifecycle.InterfaceC0980s;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import p068d5.C4442f;
import p068d5.C4444h;
import p068d5.C4449m;
import p068d5.InterfaceC4445i;
import p093e4.AbstractC4833r;
import p093e4.AbstractC4835t;
import p093e4.ActivityC4831q;
import p093e4.C4804c0;
import p093e4.C4820k0;
import p093e4.C4832q0;
import p118f4.C5348c;
import p139g.AbstractC5854c;
import p139g.AbstractC5857f;
import p139g.InterfaceC5852a;
import p139g.InterfaceC5853b;
import p139g.InterfaceC5858g;
import p154h.AbstractC6248a;
import p235k2.AbstractC7429u;
import p235k2.C7411c;
import p237k4.C7445b;
import p237k4.CreationExtras;
import p285m4.AbstractC8422a;
import p436t.InterfaceC11464a;

/* JADX INFO: renamed from: androidx.fragment.app.c */
/* JADX INFO: loaded from: classes.dex */
public class ComponentCallbacksC0929c implements ComponentCallbacks, View.OnCreateContextMenuListener, InterfaceC0980s, InterfaceC0947c1, InterfaceC0962j, InterfaceC4445i, InterfaceC5853b {

    /* JADX INFO: renamed from: e0 */
    public static final Object f3407e0 = new Object();

    /* JADX INFO: renamed from: A */
    public int f3408A;

    /* JADX INFO: renamed from: B */
    public String f3409B;

    /* JADX INFO: renamed from: C */
    public boolean f3410C;

    /* JADX INFO: renamed from: D */
    public boolean f3411D;

    /* JADX INFO: renamed from: E */
    public boolean f3412E;

    /* JADX INFO: renamed from: F */
    public boolean f3413F;

    /* JADX INFO: renamed from: G */
    public boolean f3414G;

    /* JADX INFO: renamed from: I */
    public boolean f3416I;

    /* JADX INFO: renamed from: J */
    public ViewGroup f3417J;

    /* JADX INFO: renamed from: K */
    public View f3418K;

    /* JADX INFO: renamed from: L */
    public boolean f3419L;

    /* JADX INFO: renamed from: N */
    public j f3421N;

    /* JADX INFO: renamed from: O */
    public Handler f3422O;

    /* JADX INFO: renamed from: Q */
    public boolean f3424Q;

    /* JADX INFO: renamed from: R */
    public LayoutInflater f3425R;

    /* JADX INFO: renamed from: S */
    public boolean f3426S;

    /* JADX INFO: renamed from: T */
    public String f3427T;

    /* JADX INFO: renamed from: V */
    public C0984u f3429V;

    /* JADX INFO: renamed from: W */
    public C4820k0 f3430W;

    /* JADX INFO: renamed from: Y */
    public C0941a1.c f3432Y;

    /* JADX INFO: renamed from: Z */
    public C4444h f3433Z;

    /* JADX INFO: renamed from: a0 */
    public int f3435a0;

    /* JADX INFO: renamed from: b */
    public Bundle f3436b;

    /* JADX INFO: renamed from: c */
    public SparseArray<Parcelable> f3438c;

    /* JADX INFO: renamed from: d */
    public Bundle f3440d;

    /* JADX INFO: renamed from: e */
    public Boolean f3442e;

    /* JADX INFO: renamed from: g */
    public Bundle f3444g;

    /* JADX INFO: renamed from: h */
    public ComponentCallbacksC0929c f3445h;

    /* JADX INFO: renamed from: j */
    public int f3447j;

    /* JADX INFO: renamed from: l */
    public boolean f3449l;

    /* JADX INFO: renamed from: m */
    public boolean f3450m;

    /* JADX INFO: renamed from: n */
    public boolean f3451n;

    /* JADX INFO: renamed from: o */
    public boolean f3452o;

    /* JADX INFO: renamed from: p */
    public boolean f3453p;

    /* JADX INFO: renamed from: q */
    public boolean f3454q;

    /* JADX INFO: renamed from: r */
    public boolean f3455r;

    /* JADX INFO: renamed from: s */
    public boolean f3456s;

    /* JADX INFO: renamed from: t */
    public boolean f3457t;

    /* JADX INFO: renamed from: u */
    public int f3458u;

    /* JADX INFO: renamed from: v */
    public FragmentManager f3459v;

    /* JADX INFO: renamed from: w */
    public AbstractC4835t<?> f3460w;

    /* JADX INFO: renamed from: y */
    public ComponentCallbacksC0929c f3462y;

    /* JADX INFO: renamed from: z */
    public int f3463z;

    /* JADX INFO: renamed from: a */
    public int f3434a = -1;

    /* JADX INFO: renamed from: f */
    @NonNull
    public String f3443f = UUID.randomUUID().toString();

    /* JADX INFO: renamed from: i */
    public String f3446i = null;

    /* JADX INFO: renamed from: k */
    public Boolean f3448k = null;

    /* JADX INFO: renamed from: x */
    @NonNull
    public FragmentManager f3461x = new C4804c0();

    /* JADX INFO: renamed from: H */
    public boolean f3415H = true;

    /* JADX INFO: renamed from: M */
    public boolean f3420M = true;

    /* JADX INFO: renamed from: P */
    public Runnable f3423P = new b();

    /* JADX INFO: renamed from: U */
    public AbstractC0966l.b f3428U = AbstractC0966l.b.RESUMED;

    /* JADX INFO: renamed from: X */
    public C0949d0<InterfaceC0980s> f3431X = new C0949d0<>();

    /* JADX INFO: renamed from: b0 */
    public final AtomicInteger f3437b0 = new AtomicInteger();

    /* JADX INFO: renamed from: c0 */
    public final ArrayList<l> f3439c0 = new ArrayList<>();

    /* JADX INFO: renamed from: d0 */
    public final l f3441d0 = new c();

    /* JADX INFO: Add missing generic type declarations: [I] */
    /* JADX INFO: renamed from: androidx.fragment.app.c$a */
    public class a<I> extends AbstractC5854c<I> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ AtomicReference f3464a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ AbstractC6248a f3465b;

        public a(AtomicReference atomicReference, AbstractC6248a abstractC6248a) {
            this.f3464a = atomicReference;
            this.f3465b = abstractC6248a;
        }

        @Override // p139g.AbstractC5854c
        @NonNull
        /* JADX INFO: renamed from: a */
        public AbstractC6248a<I, ?> mo4724a() {
            return this.f3465b;
        }

        @Override // p139g.AbstractC5854c
        /* JADX INFO: renamed from: c */
        public void mo4725c(I i10, C7411c c7411c) {
            AbstractC5854c abstractC5854c = (AbstractC5854c) this.f3464a.get();
            if (abstractC5854c == null) {
                throw new IllegalStateException("Operation cannot be started before fragment is in created state");
            }
            abstractC5854c.mo4725c(i10, c7411c);
        }

        @Override // p139g.AbstractC5854c
        /* JADX INFO: renamed from: d */
        public void mo4726d() {
            AbstractC5854c abstractC5854c = (AbstractC5854c) this.f3464a.getAndSet(null);
            if (abstractC5854c != null) {
                abstractC5854c.mo4726d();
            }
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.c$b */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ComponentCallbacksC0929c.this.m4659a2();
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.c$c */
    public class c extends l {
        public c() {
            super(null);
        }

        @Override // androidx.fragment.app.ComponentCallbacksC0929c.l
        /* JADX INFO: renamed from: a */
        public void mo4727a() {
            ComponentCallbacksC0929c.this.f3433Z.m22359c();
            C0973o0.m4966c(ComponentCallbacksC0929c.this);
            Bundle bundle = ComponentCallbacksC0929c.this.f3436b;
            ComponentCallbacksC0929c.this.f3433Z.m22360d(bundle != null ? bundle.getBundle("registryState") : null);
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.c$d */
    public class d implements Runnable {
        public d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ComponentCallbacksC0929c.this.m4676j(false);
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.c$e */
    public class e implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ AbstractC0935i f3470a;

        /* JADX DEBUG: Incorrect args count in method signature: ()V */
        public e(AbstractC0935i abstractC0935i) {
            this.f3470a = abstractC0935i;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f3470a.m4814y()) {
                this.f3470a.m4805n();
            }
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.c$f */
    public class f extends AbstractC4833r {
        public f() {
        }

        @Override // p093e4.AbstractC4833r
        /* JADX INFO: renamed from: d */
        public View mo4728d(int i10) {
            View view = ComponentCallbacksC0929c.this.f3418K;
            if (view != null) {
                return view.findViewById(i10);
            }
            throw new IllegalStateException("Fragment " + ComponentCallbacksC0929c.this + " does not have a view");
        }

        @Override // p093e4.AbstractC4833r
        /* JADX INFO: renamed from: e */
        public boolean mo4729e() {
            return ComponentCallbacksC0929c.this.f3418K != null;
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.c$g */
    public class g implements InterfaceC0974p {
        public g() {
        }

        @Override // androidx.p616lifecycle.InterfaceC0974p
        /* JADX INFO: renamed from: g */
        public void mo1334g(@NonNull InterfaceC0980s interfaceC0980s, @NonNull AbstractC0966l.a aVar) {
            View view;
            if (aVar != AbstractC0966l.a.ON_STOP || (view = ComponentCallbacksC0929c.this.f3418K) == null) {
                return;
            }
            view.cancelPendingInputEvents();
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.c$h */
    public class h implements InterfaceC11464a<Void, AbstractC5857f> {
        public h() {
        }

        /* JADX DEBUG: Method merged with bridge method: apply(Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // p436t.InterfaceC11464a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public AbstractC5857f apply(Void r8) {
            ComponentCallbacksC0929c componentCallbacksC0929c = ComponentCallbacksC0929c.this;
            Object obj = componentCallbacksC0929c.f3460w;
            return obj instanceof InterfaceC5858g ? ((InterfaceC5858g) obj).getActivityResultRegistry() : componentCallbacksC0929c.m4606H1().getActivityResultRegistry();
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.c$i */
    public class i extends l {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ InterfaceC11464a f3475a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ AtomicReference f3476b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ AbstractC6248a f3477c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ InterfaceC5852a f3478d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(InterfaceC11464a interfaceC11464a, AtomicReference atomicReference, AbstractC6248a abstractC6248a, InterfaceC5852a interfaceC5852a) {
            super(null);
            this.f3475a = interfaceC11464a;
            this.f3476b = atomicReference;
            this.f3477c = abstractC6248a;
            this.f3478d = interfaceC5852a;
        }

        @Override // androidx.fragment.app.ComponentCallbacksC0929c.l
        /* JADX INFO: renamed from: a */
        public void mo4727a() {
            String strM4691o = ComponentCallbacksC0929c.this.m4691o();
            this.f3476b.set(((AbstractC5857f) this.f3475a.apply(null)).m26254n(strM4691o, ComponentCallbacksC0929c.this, this.f3477c, this.f3478d));
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.c$j */
    public static class j {

        /* JADX INFO: renamed from: a */
        public View f3480a;

        /* JADX INFO: renamed from: b */
        public boolean f3481b;

        /* JADX INFO: renamed from: c */
        public int f3482c;

        /* JADX INFO: renamed from: d */
        public int f3483d;

        /* JADX INFO: renamed from: e */
        public int f3484e;

        /* JADX INFO: renamed from: f */
        public int f3485f;

        /* JADX INFO: renamed from: g */
        public int f3486g;

        /* JADX INFO: renamed from: h */
        public ArrayList<String> f3487h;

        /* JADX INFO: renamed from: i */
        public ArrayList<String> f3488i;

        /* JADX INFO: renamed from: j */
        public Object f3489j = null;

        /* JADX INFO: renamed from: k */
        public Object f3490k;

        /* JADX INFO: renamed from: l */
        public Object f3491l;

        /* JADX INFO: renamed from: m */
        public Object f3492m;

        /* JADX INFO: renamed from: n */
        public Object f3493n;

        /* JADX INFO: renamed from: o */
        public Object f3494o;

        /* JADX INFO: renamed from: p */
        public Boolean f3495p;

        /* JADX INFO: renamed from: q */
        public Boolean f3496q;

        /* JADX INFO: renamed from: r */
        public AbstractC7429u f3497r;

        /* JADX INFO: renamed from: s */
        public AbstractC7429u f3498s;

        /* JADX INFO: renamed from: t */
        public float f3499t;

        /* JADX INFO: renamed from: u */
        public View f3500u;

        /* JADX INFO: renamed from: v */
        public boolean f3501v;

        public j() {
            Object obj = ComponentCallbacksC0929c.f3407e0;
            this.f3490k = obj;
            this.f3491l = null;
            this.f3492m = obj;
            this.f3493n = null;
            this.f3494o = obj;
            this.f3497r = null;
            this.f3498s = null;
            this.f3499t = 1.0f;
            this.f3500u = null;
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.c$k */
    public static class k extends RuntimeException {
        public k(@NonNull String str, Exception exc) {
            super(str, exc);
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.c$l */
    public static abstract class l {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public l() {
        }

        /* JADX INFO: renamed from: a */
        public abstract void mo4727a();

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:2) call: androidx.fragment.app.c.l.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public /* synthetic */ l(b bVar) {
            this();
        }
    }

    public ComponentCallbacksC0929c() {
        m4686m0();
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ void m4581i(ComponentCallbacksC0929c componentCallbacksC0929c) {
        componentCallbacksC0929c.f3430W.m23344e(componentCallbacksC0929c.f3440d);
        componentCallbacksC0929c.f3440d = null;
    }

    @NonNull
    @Deprecated
    /* JADX INFO: renamed from: o0 */
    public static ComponentCallbacksC0929c m4582o0(@NonNull Context context, @NonNull String str, Bundle bundle) {
        try {
            ComponentCallbacksC0929c componentCallbacksC0929cNewInstance = C0931e.m4737d(context.getClassLoader(), str).getConstructor(null).newInstance(null);
            if (bundle == null) {
                return componentCallbacksC0929cNewInstance;
            }
            bundle.setClassLoader(componentCallbacksC0929cNewInstance.getClass().getClassLoader());
            componentCallbacksC0929cNewInstance.m4625O1(bundle);
            return componentCallbacksC0929cNewInstance;
        } catch (IllegalAccessException e10) {
            throw new k("Unable to instantiate fragment " + str + ": make sure class name exists, is public, and has an empty constructor that is public", e10);
        } catch (InstantiationException e11) {
            throw new k("Unable to instantiate fragment " + str + ": make sure class name exists, is public, and has an empty constructor that is public", e11);
        } catch (NoSuchMethodException e12) {
            throw new k("Unable to instantiate fragment " + str + ": could not find Fragment constructor", e12);
        } catch (InvocationTargetException e13) {
            throw new k("Unable to instantiate fragment " + str + ": calling Fragment constructor caused an exception", e13);
        }
    }

    @Override // p068d5.InterfaceC4445i
    @NonNull
    /* JADX INFO: renamed from: A */
    public final C4442f mo4583A() {
        return this.f3433Z.getSavedStateRegistry();
    }

    @Deprecated
    /* JADX INFO: renamed from: A0 */
    public void mo4584A0(int i10, int i11, Intent intent) {
        if (FragmentManager.m4349N0(2)) {
            Log.v("FragmentManager", "Fragment " + this + " received the following in onActivityResult(): requestCode: " + i10 + " resultCode: " + i11 + " data: " + intent);
        }
    }

    /* JADX INFO: renamed from: A1 */
    public void m4585A1(Bundle bundle) {
        mo4661b1(bundle);
    }

    /* JADX INFO: renamed from: B */
    public AbstractC7429u m4586B() {
        j jVar = this.f3421N;
        if (jVar == null) {
            return null;
        }
        return jVar.f3497r;
    }

    @Deprecated
    /* JADX INFO: renamed from: B0 */
    public void mo4587B0(@NonNull Activity activity) {
        this.f3416I = true;
    }

    /* JADX INFO: renamed from: B1 */
    public void m4588B1() {
        this.f3461x.m4410X0();
        this.f3461x.m4425f0(true);
        this.f3434a = 5;
        this.f3416I = false;
        mo4663c1();
        if (!this.f3416I) {
            throw new C4832q0("Fragment " + this + " did not call through to super.onStart()");
        }
        C0984u c0984u = this.f3429V;
        AbstractC0966l.a aVar = AbstractC0966l.a.ON_START;
        c0984u.m4986j(aVar);
        if (this.f3418K != null) {
            this.f3430W.m23341b(aVar);
        }
        this.f3461x.m4407W();
    }

    /* JADX INFO: renamed from: C */
    public int m4589C() {
        j jVar = this.f3421N;
        if (jVar == null) {
            return 0;
        }
        return jVar.f3483d;
    }

    /* JADX INFO: renamed from: C0 */
    public void mo4590C0(@NonNull Context context) {
        this.f3416I = true;
        AbstractC4835t<?> abstractC4835t = this.f3460w;
        Activity activityM23386f = abstractC4835t == null ? null : abstractC4835t.getActivity();
        if (activityM23386f != null) {
            this.f3416I = false;
            mo4587B0(activityM23386f);
        }
    }

    /* JADX INFO: renamed from: C1 */
    public void m4591C1() {
        this.f3461x.m4411Y();
        if (this.f3418K != null) {
            this.f3430W.m23341b(AbstractC0966l.a.ON_STOP);
        }
        this.f3429V.m4986j(AbstractC0966l.a.ON_STOP);
        this.f3434a = 4;
        this.f3416I = false;
        mo4665d1();
        if (this.f3416I) {
            return;
        }
        throw new C4832q0("Fragment " + this + " did not call through to super.onStop()");
    }

    /* JADX INFO: renamed from: D */
    public Object m4592D() {
        j jVar = this.f3421N;
        if (jVar == null) {
            return null;
        }
        return jVar.f3491l;
    }

    @Deprecated
    /* JADX INFO: renamed from: D0 */
    public void m4593D0(@NonNull ComponentCallbacksC0929c componentCallbacksC0929c) {
    }

    /* JADX INFO: renamed from: D1 */
    public void m4594D1() {
        Bundle bundle = this.f3436b;
        mo4667e1(this.f3418K, bundle != null ? bundle.getBundle("savedInstanceState") : null);
        this.f3461x.m4413Z();
    }

    /* JADX INFO: renamed from: E */
    public AbstractC7429u m4595E() {
        j jVar = this.f3421N;
        if (jVar == null) {
            return null;
        }
        return jVar.f3498s;
    }

    /* JADX INFO: renamed from: E0 */
    public boolean m4596E0(@NonNull MenuItem menuItem) {
        return false;
    }

    /* JADX INFO: renamed from: E1 */
    public void m4597E1() {
        m4685m().f3501v = true;
    }

    /* JADX INFO: renamed from: F */
    public View m4598F() {
        j jVar = this.f3421N;
        if (jVar == null) {
            return null;
        }
        return jVar.f3500u;
    }

    /* JADX INFO: renamed from: F0 */
    public void mo4599F0(Bundle bundle) {
        this.f3416I = true;
        m4614K1();
        if (this.f3461x.m4402T0(1)) {
            return;
        }
        this.f3461x.m4377G();
    }

    @NonNull
    /* JADX INFO: renamed from: F1 */
    public final <I, O> AbstractC5854c<I> m4600F1(@NonNull AbstractC6248a<I, O> abstractC6248a, @NonNull InterfaceC11464a<Void, AbstractC5857f> interfaceC11464a, @NonNull InterfaceC5852a<O> interfaceC5852a) {
        if (this.f3434a <= 1) {
            AtomicReference atomicReference = new AtomicReference();
            m4603G1(new i(interfaceC11464a, atomicReference, abstractC6248a, interfaceC5852a));
            return new a(atomicReference, abstractC6248a);
        }
        throw new IllegalStateException("Fragment " + this + " is attempting to registerForActivityResult after being created. Fragments must call registerForActivityResult() before they are created (i.e. initialization, onAttach(), or onCreate()).");
    }

    /* JADX INFO: renamed from: G */
    public final Object m4601G() {
        AbstractC4835t<?> abstractC4835t = this.f3460w;
        if (abstractC4835t == null) {
            return null;
        }
        return abstractC4835t.mo23366l();
    }

    /* JADX INFO: renamed from: G0 */
    public Animation m4602G0(int i10, boolean z10, int i11) {
        return null;
    }

    /* JADX INFO: renamed from: G1 */
    public final void m4603G1(@NonNull l lVar) {
        if (this.f3434a >= 0) {
            lVar.mo4727a();
        } else {
            this.f3439c0.add(lVar);
        }
    }

    @NonNull
    @Deprecated
    /* JADX INFO: renamed from: H */
    public LayoutInflater m4604H(Bundle bundle) {
        AbstractC4835t<?> abstractC4835t = this.f3460w;
        if (abstractC4835t == null) {
            throw new IllegalStateException("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
        }
        LayoutInflater layoutInflaterMo23367m = abstractC4835t.mo23367m();
        C0620m.m2967a(layoutInflaterMo23367m, this.f3461x.m4368B0());
        return layoutInflaterMo23367m;
    }

    /* JADX INFO: renamed from: H0 */
    public Animator m4605H0(int i10, boolean z10, int i11) {
        return null;
    }

    @NonNull
    /* JADX INFO: renamed from: H1 */
    public final ActivityC4831q m4606H1() {
        ActivityC4831q activityC4831qM4693p = m4693p();
        if (activityC4831qM4693p != null) {
            return activityC4831qM4693p;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to an activity.");
    }

    /* JADX INFO: renamed from: I */
    public final int m4607I() {
        AbstractC0966l.b bVar = this.f3428U;
        return (bVar == AbstractC0966l.b.INITIALIZED || this.f3462y == null) ? bVar.ordinal() : Math.min(bVar.ordinal(), this.f3462y.m4607I());
    }

    @Deprecated
    /* JADX INFO: renamed from: I0 */
    public void m4608I0(@NonNull Menu menu, @NonNull MenuInflater menuInflater) {
    }

    @NonNull
    /* JADX INFO: renamed from: I1 */
    public final Context m4609I1() {
        Context contextMo4715x = mo4715x();
        if (contextMo4715x != null) {
            return contextMo4715x;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to a context.");
    }

    /* JADX INFO: renamed from: J */
    public int m4610J() {
        j jVar = this.f3421N;
        if (jVar == null) {
            return 0;
        }
        return jVar.f3486g;
    }

    /* JADX INFO: renamed from: J0 */
    public View mo1225J0(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i10 = this.f3435a0;
        if (i10 != 0) {
            return layoutInflater.inflate(i10, viewGroup, false);
        }
        return null;
    }

    @NonNull
    /* JADX INFO: renamed from: J1 */
    public final View m4611J1() {
        View viewM4677j0 = m4677j0();
        if (viewM4677j0 != null) {
            return viewM4677j0;
        }
        throw new IllegalStateException("Fragment " + this + " did not return a View from onCreateView() or this was called before onCreateView().");
    }

    /* JADX INFO: renamed from: K */
    public final ComponentCallbacksC0929c m4612K() {
        return this.f3462y;
    }

    /* JADX INFO: renamed from: K0 */
    public void mo4613K0() {
        this.f3416I = true;
    }

    /* JADX INFO: renamed from: K1 */
    public void m4614K1() {
        Bundle bundle;
        Bundle bundle2 = this.f3436b;
        if (bundle2 == null || (bundle = bundle2.getBundle("childFragmentManager")) == null) {
            return;
        }
        this.f3461x.m4445n1(bundle);
        this.f3461x.m4377G();
    }

    @Deprecated
    /* JADX INFO: renamed from: L0 */
    public void m4615L0() {
    }

    /* JADX INFO: renamed from: L1 */
    public final void m4616L1() {
        if (FragmentManager.m4349N0(3)) {
            Log.d("FragmentManager", "moveto RESTORE_VIEW_STATE: " + this);
        }
        if (this.f3418K != null) {
            Bundle bundle = this.f3436b;
            m4619M1(bundle != null ? bundle.getBundle("savedInstanceState") : null);
        }
        this.f3436b = null;
    }

    @NonNull
    /* JADX INFO: renamed from: M */
    public final FragmentManager m4617M() {
        FragmentManager fragmentManager = this.f3459v;
        if (fragmentManager != null) {
            return fragmentManager;
        }
        throw new IllegalStateException("Fragment " + this + " not associated with a fragment manager.");
    }

    /* JADX INFO: renamed from: M0 */
    public void mo4618M0() {
        this.f3416I = true;
    }

    /* JADX INFO: renamed from: M1 */
    public final void m4619M1(Bundle bundle) {
        SparseArray<Parcelable> sparseArray = this.f3438c;
        if (sparseArray != null) {
            this.f3418K.restoreHierarchyState(sparseArray);
            this.f3438c = null;
        }
        this.f3416I = false;
        mo4668f1(bundle);
        if (this.f3416I) {
            if (this.f3418K != null) {
                this.f3430W.m23341b(AbstractC0966l.a.ON_CREATE);
            }
        } else {
            throw new C4832q0("Fragment " + this + " did not call through to super.onViewStateRestored()");
        }
    }

    /* JADX INFO: renamed from: N */
    public boolean m4620N() {
        j jVar = this.f3421N;
        if (jVar == null) {
            return false;
        }
        return jVar.f3481b;
    }

    /* JADX INFO: renamed from: N0 */
    public void mo4621N0() {
        this.f3416I = true;
    }

    /* JADX INFO: renamed from: N1 */
    public void m4622N1(int i10, int i11, int i12, int i13) {
        if (this.f3421N == null && i10 == 0 && i11 == 0 && i12 == 0 && i13 == 0) {
            return;
        }
        m4685m().f3482c = i10;
        m4685m().f3483d = i11;
        m4685m().f3484e = i12;
        m4685m().f3485f = i13;
    }

    /* JADX INFO: renamed from: O */
    public int m4623O() {
        j jVar = this.f3421N;
        if (jVar == null) {
            return 0;
        }
        return jVar.f3484e;
    }

    @NonNull
    /* JADX INFO: renamed from: O0 */
    public LayoutInflater mo4624O0(Bundle bundle) {
        return m4604H(bundle);
    }

    /* JADX INFO: renamed from: O1 */
    public void m4625O1(Bundle bundle) {
        if (this.f3459v != null && m4713w0()) {
            throw new IllegalStateException("Fragment already added and state has been saved");
        }
        this.f3444g = bundle;
    }

    /* JADX INFO: renamed from: P */
    public int m4626P() {
        j jVar = this.f3421N;
        if (jVar == null) {
            return 0;
        }
        return jVar.f3485f;
    }

    /* JADX INFO: renamed from: P0 */
    public void mo4627P0(boolean z10) {
    }

    /* JADX INFO: renamed from: P1 */
    public void m4628P1(Object obj) {
        m4685m().f3489j = obj;
    }

    @Deprecated
    /* JADX INFO: renamed from: Q0 */
    public void m4629Q0(@NonNull Activity activity, @NonNull AttributeSet attributeSet, Bundle bundle) {
        this.f3416I = true;
    }

    /* JADX INFO: renamed from: Q1 */
    public void m4630Q1(Object obj) {
        m4685m().f3491l = obj;
    }

    /* JADX INFO: renamed from: R */
    public float m4631R() {
        j jVar = this.f3421N;
        if (jVar == null) {
            return 1.0f;
        }
        return jVar.f3499t;
    }

    /* JADX INFO: renamed from: R0 */
    public void m4632R0(@NonNull Context context, @NonNull AttributeSet attributeSet, Bundle bundle) {
        this.f3416I = true;
        AbstractC4835t<?> abstractC4835t = this.f3460w;
        Activity activityM23386f = abstractC4835t == null ? null : abstractC4835t.getActivity();
        if (activityM23386f != null) {
            this.f3416I = false;
            m4629Q0(activityM23386f, attributeSet, bundle);
        }
    }

    /* JADX INFO: renamed from: R1 */
    public void m4633R1(View view) {
        m4685m().f3500u = view;
    }

    /* JADX INFO: renamed from: S */
    public Object m4634S() {
        j jVar = this.f3421N;
        if (jVar == null) {
            return null;
        }
        Object obj = jVar.f3492m;
        return obj == f3407e0 ? m4592D() : obj;
    }

    /* JADX INFO: renamed from: S0 */
    public void m4635S0(boolean z10) {
    }

    /* JADX INFO: renamed from: S1 */
    public void m4636S1(int i10) {
        if (this.f3421N == null && i10 == 0) {
            return;
        }
        m4685m();
        this.f3421N.f3486g = i10;
    }

    @NonNull
    /* JADX INFO: renamed from: T */
    public final Resources m4637T() {
        return m4609I1().getResources();
    }

    @Deprecated
    /* JADX INFO: renamed from: T0 */
    public boolean m4638T0(@NonNull MenuItem menuItem) {
        return false;
    }

    /* JADX INFO: renamed from: T1 */
    public void m4639T1(boolean z10) {
        if (this.f3421N == null) {
            return;
        }
        m4685m().f3481b = z10;
    }

    @Deprecated
    /* JADX INFO: renamed from: U0 */
    public void m4640U0(@NonNull Menu menu) {
    }

    /* JADX INFO: renamed from: U1 */
    public void m4641U1(float f10) {
        m4685m().f3499t = f10;
    }

    @Deprecated
    /* JADX INFO: renamed from: V */
    public final boolean m4642V() {
        C5348c.m24678h(this);
        return this.f3412E;
    }

    /* JADX INFO: renamed from: V0 */
    public void mo4643V0() {
        this.f3416I = true;
    }

    @Deprecated
    /* JADX INFO: renamed from: V1 */
    public void m4644V1(boolean z10) {
        C5348c.m24680j(this);
        this.f3412E = z10;
        FragmentManager fragmentManager = this.f3459v;
        if (fragmentManager == null) {
            this.f3413F = true;
        } else if (z10) {
            fragmentManager.m4443n(this);
        } else {
            fragmentManager.m4439l1(this);
        }
    }

    /* JADX INFO: renamed from: W0 */
    public void m4645W0(boolean z10) {
    }

    /* JADX INFO: renamed from: W1 */
    public void m4646W1(ArrayList<String> arrayList, ArrayList<String> arrayList2) {
        m4685m();
        j jVar = this.f3421N;
        jVar.f3487h = arrayList;
        jVar.f3488i = arrayList2;
    }

    @Override // androidx.p616lifecycle.InterfaceC0962j
    @NonNull
    /* JADX INFO: renamed from: X */
    public C0941a1.c mo4647X() {
        Application application;
        if (this.f3459v == null) {
            throw new IllegalStateException("Can't access ViewModels from detached fragment");
        }
        if (this.f3432Y == null) {
            Context applicationContext = m4609I1().getApplicationContext();
            while (true) {
                if (!(applicationContext instanceof ContextWrapper)) {
                    application = null;
                    break;
                }
                if (applicationContext instanceof Application) {
                    application = (Application) applicationContext;
                    break;
                }
                applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
            }
            if (application == null && FragmentManager.m4349N0(3)) {
                Log.d("FragmentManager", "Could not find Application instance from Context " + m4609I1().getApplicationContext() + ", you will need CreationExtras to use AndroidViewModel with the default ViewModelProvider.Factory");
            }
            this.f3432Y = new C0983t0(application, this, m4704t());
        }
        return this.f3432Y;
    }

    @Deprecated
    /* JADX INFO: renamed from: X0 */
    public void m4648X0(@NonNull Menu menu) {
    }

    /* JADX INFO: renamed from: X1 */
    public void m4649X1(@NonNull Intent intent) {
        m4652Y1(intent, null);
    }

    /* JADX INFO: renamed from: Y */
    public Object m4650Y() {
        j jVar = this.f3421N;
        if (jVar == null) {
            return null;
        }
        Object obj = jVar.f3490k;
        return obj == f3407e0 ? m4721z() : obj;
    }

    /* JADX INFO: renamed from: Y0 */
    public void m4651Y0(boolean z10) {
    }

    /* JADX INFO: renamed from: Y1 */
    public void m4652Y1(@NonNull Intent intent, Bundle bundle) {
        AbstractC4835t<?> abstractC4835t = this.f3460w;
        if (abstractC4835t != null) {
            abstractC4835t.m23390n(this, intent, -1, bundle);
            return;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to Activity");
    }

    @Override // androidx.p616lifecycle.InterfaceC0962j
    @NonNull
    /* JADX INFO: renamed from: Z */
    public CreationExtras mo4653Z() {
        Application application;
        Context applicationContext = m4609I1().getApplicationContext();
        while (true) {
            if (!(applicationContext instanceof ContextWrapper)) {
                application = null;
                break;
            }
            if (applicationContext instanceof Application) {
                application = (Application) applicationContext;
                break;
            }
            applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
        }
        if (application == null && FragmentManager.m4349N0(3)) {
            Log.d("FragmentManager", "Could not find Application instance from Context " + m4609I1().getApplicationContext() + ", you will not be able to use AndroidViewModel with the default ViewModelProvider.Factory");
        }
        C7445b c7445b = new C7445b();
        if (application != null) {
            c7445b.m30960c(C0941a1.a.f3611h, application);
        }
        c7445b.m30960c(C0973o0.f3714a, this);
        c7445b.m30960c(C0973o0.f3715b, this);
        if (m4704t() != null) {
            c7445b.m30960c(C0973o0.f3716c, m4704t());
        }
        return c7445b;
    }

    @Deprecated
    /* JADX INFO: renamed from: Z0 */
    public void m4654Z0(int i10, @NonNull String[] strArr, @NonNull int[] iArr) {
    }

    @Deprecated
    /* JADX INFO: renamed from: Z1 */
    public void m4655Z1(@NonNull Intent intent, int i10, Bundle bundle) {
        if (this.f3460w != null) {
            m4617M().m4406V0(this, intent, i10, bundle);
            return;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to Activity");
    }

    @Override // androidx.p616lifecycle.InterfaceC0980s
    @NonNull
    /* JADX INFO: renamed from: a */
    public AbstractC0966l mo4656a() {
        return this.f3429V;
    }

    /* JADX INFO: renamed from: a0 */
    public Object m4657a0() {
        j jVar = this.f3421N;
        if (jVar == null) {
            return null;
        }
        return jVar.f3493n;
    }

    /* JADX INFO: renamed from: a1 */
    public void mo4658a1() {
        this.f3416I = true;
    }

    /* JADX INFO: renamed from: a2 */
    public void m4659a2() {
        if (this.f3421N == null || !m4685m().f3501v) {
            return;
        }
        if (this.f3460w == null) {
            m4685m().f3501v = false;
        } else if (Looper.myLooper() != this.f3460w.getHandler().getLooper()) {
            this.f3460w.getHandler().postAtFrontOfQueue(new d());
        } else {
            m4676j(true);
        }
    }

    /* JADX INFO: renamed from: b0 */
    public Object m4660b0() {
        j jVar = this.f3421N;
        if (jVar == null) {
            return null;
        }
        Object obj = jVar.f3494o;
        return obj == f3407e0 ? m4657a0() : obj;
    }

    /* JADX INFO: renamed from: b1 */
    public void mo4661b1(@NonNull Bundle bundle) {
    }

    @NonNull
    /* JADX INFO: renamed from: c0 */
    public ArrayList<String> m4662c0() {
        ArrayList<String> arrayList;
        j jVar = this.f3421N;
        return (jVar == null || (arrayList = jVar.f3487h) == null) ? new ArrayList<>() : arrayList;
    }

    /* JADX INFO: renamed from: c1 */
    public void mo4663c1() {
        this.f3416I = true;
    }

    @NonNull
    /* JADX INFO: renamed from: d0 */
    public ArrayList<String> m4664d0() {
        ArrayList<String> arrayList;
        j jVar = this.f3421N;
        return (jVar == null || (arrayList = jVar.f3488i) == null) ? new ArrayList<>() : arrayList;
    }

    /* JADX INFO: renamed from: d1 */
    public void mo4665d1() {
        this.f3416I = true;
    }

    @NonNull
    /* JADX INFO: renamed from: e0 */
    public final String m4666e0(int i10) {
        return m4637T().getString(i10);
    }

    /* JADX INFO: renamed from: e1 */
    public void mo4667e1(@NonNull View view, Bundle bundle) {
    }

    public final boolean equals(Object obj) {
        return super.equals(obj);
    }

    /* JADX INFO: renamed from: f1 */
    public void mo4668f1(Bundle bundle) {
        this.f3416I = true;
    }

    @NonNull
    /* JADX INFO: renamed from: g0 */
    public final String m4669g0(int i10, Object... objArr) {
        return m4637T().getString(i10, objArr);
    }

    /* JADX INFO: renamed from: g1 */
    public void m4670g1(Bundle bundle) {
        this.f3461x.m4410X0();
        this.f3434a = 3;
        this.f3416I = false;
        mo4722z0(bundle);
        if (this.f3416I) {
            m4616L1();
            this.f3461x.m4369C();
        } else {
            throw new C4832q0("Fragment " + this + " did not call through to super.onActivityCreated()");
        }
    }

    @Override // p139g.InterfaceC5853b
    @NonNull
    /* JADX INFO: renamed from: h */
    public final <I, O> AbstractC5854c<I> mo4671h(@NonNull AbstractC6248a<I, O> abstractC6248a, @NonNull InterfaceC5852a<O> interfaceC5852a) {
        return m4600F1(abstractC6248a, new h(), interfaceC5852a);
    }

    /* JADX INFO: renamed from: h0 */
    public final String m4672h0() {
        return this.f3409B;
    }

    /* JADX INFO: renamed from: h1 */
    public void m4673h1() {
        ArrayList<l> arrayList = this.f3439c0;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            l lVar = arrayList.get(i10);
            i10++;
            lVar.mo4727a();
        }
        this.f3439c0.clear();
        this.f3461x.m4448p(this.f3460w, mo4679k(), this);
        this.f3434a = 0;
        this.f3416I = false;
        mo4590C0(this.f3460w.getContext());
        if (this.f3416I) {
            this.f3459v.m4388M(this);
            this.f3461x.m4371D();
        } else {
            throw new C4832q0("Fragment " + this + " did not call through to super.onAttach()");
        }
    }

    public final int hashCode() {
        return super.hashCode();
    }

    /* JADX INFO: renamed from: i0 */
    public final ComponentCallbacksC0929c m4674i0(boolean z10) {
        String str;
        if (z10) {
            C5348c.m24679i(this);
        }
        ComponentCallbacksC0929c componentCallbacksC0929c = this.f3445h;
        if (componentCallbacksC0929c != null) {
            return componentCallbacksC0929c;
        }
        FragmentManager fragmentManager = this.f3459v;
        if (fragmentManager == null || (str = this.f3446i) == null) {
            return null;
        }
        return fragmentManager.m4435k0(str);
    }

    /* JADX INFO: renamed from: i1 */
    public void m4675i1(@NonNull Configuration configuration) {
        onConfigurationChanged(configuration);
    }

    /* JADX INFO: renamed from: j */
    public void m4676j(boolean z10) {
        ViewGroup viewGroup;
        FragmentManager fragmentManager;
        j jVar = this.f3421N;
        if (jVar != null) {
            jVar.f3501v = false;
        }
        if (this.f3418K == null || (viewGroup = this.f3417J) == null || (fragmentManager = this.f3459v) == null) {
            return;
        }
        AbstractC0935i abstractC0935iM4791u = AbstractC0935i.m4791u(viewGroup, fragmentManager);
        abstractC0935iM4791u.m4815z();
        if (z10) {
            this.f3460w.getHandler().post(new e(abstractC0935iM4791u));
        } else {
            abstractC0935iM4791u.m4805n();
        }
        Handler handler = this.f3422O;
        if (handler != null) {
            handler.removeCallbacks(this.f3423P);
            this.f3422O = null;
        }
    }

    /* JADX INFO: renamed from: j0 */
    public View m4677j0() {
        return this.f3418K;
    }

    /* JADX INFO: renamed from: j1 */
    public boolean m4678j1(@NonNull MenuItem menuItem) {
        if (this.f3410C) {
            return false;
        }
        if (m4596E0(menuItem)) {
            return true;
        }
        return this.f3461x.m4375F(menuItem);
    }

    @NonNull
    /* JADX INFO: renamed from: k */
    public AbstractC4833r mo4679k() {
        return new f();
    }

    @NonNull
    /* JADX INFO: renamed from: k0 */
    public InterfaceC0980s m4680k0() {
        C4820k0 c4820k0 = this.f3430W;
        if (c4820k0 != null) {
            return c4820k0;
        }
        throw new IllegalStateException("Can't access the Fragment View's LifecycleOwner for " + this + " when getView() is null i.e., before onCreateView() or after onDestroyView()");
    }

    /* JADX INFO: renamed from: k1 */
    public void m4681k1(Bundle bundle) {
        this.f3461x.m4410X0();
        this.f3434a = 1;
        this.f3416I = false;
        this.f3429V.mo4935a(new g());
        mo4599F0(bundle);
        this.f3426S = true;
        if (this.f3416I) {
            this.f3429V.m4986j(AbstractC0966l.a.ON_CREATE);
            return;
        }
        throw new C4832q0("Fragment " + this + " did not call through to super.onCreate()");
    }

    /* JADX INFO: renamed from: l */
    public void mo4682l(@NonNull String str, FileDescriptor fileDescriptor, @NonNull PrintWriter printWriter, String[] strArr) {
        printWriter.print(str);
        printWriter.print("mFragmentId=#");
        printWriter.print(Integer.toHexString(this.f3463z));
        printWriter.print(" mContainerId=#");
        printWriter.print(Integer.toHexString(this.f3408A));
        printWriter.print(" mTag=");
        printWriter.println(this.f3409B);
        printWriter.print(str);
        printWriter.print("mState=");
        printWriter.print(this.f3434a);
        printWriter.print(" mWho=");
        printWriter.print(this.f3443f);
        printWriter.print(" mBackStackNesting=");
        printWriter.println(this.f3458u);
        printWriter.print(str);
        printWriter.print("mAdded=");
        printWriter.print(this.f3449l);
        printWriter.print(" mRemoving=");
        printWriter.print(this.f3450m);
        printWriter.print(" mFromLayout=");
        printWriter.print(this.f3453p);
        printWriter.print(" mInLayout=");
        printWriter.println(this.f3454q);
        printWriter.print(str);
        printWriter.print("mHidden=");
        printWriter.print(this.f3410C);
        printWriter.print(" mDetached=");
        printWriter.print(this.f3411D);
        printWriter.print(" mMenuVisible=");
        printWriter.print(this.f3415H);
        printWriter.print(" mHasMenu=");
        printWriter.println(this.f3414G);
        printWriter.print(str);
        printWriter.print("mRetainInstance=");
        printWriter.print(this.f3412E);
        printWriter.print(" mUserVisibleHint=");
        printWriter.println(this.f3420M);
        if (this.f3459v != null) {
            printWriter.print(str);
            printWriter.print("mFragmentManager=");
            printWriter.println(this.f3459v);
        }
        if (this.f3460w != null) {
            printWriter.print(str);
            printWriter.print("mHost=");
            printWriter.println(this.f3460w);
        }
        if (this.f3462y != null) {
            printWriter.print(str);
            printWriter.print("mParentFragment=");
            printWriter.println(this.f3462y);
        }
        if (this.f3444g != null) {
            printWriter.print(str);
            printWriter.print("mArguments=");
            printWriter.println(this.f3444g);
        }
        if (this.f3436b != null) {
            printWriter.print(str);
            printWriter.print("mSavedFragmentState=");
            printWriter.println(this.f3436b);
        }
        if (this.f3438c != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewState=");
            printWriter.println(this.f3438c);
        }
        if (this.f3440d != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewRegistryState=");
            printWriter.println(this.f3440d);
        }
        ComponentCallbacksC0929c componentCallbacksC0929cM4674i0 = m4674i0(false);
        if (componentCallbacksC0929cM4674i0 != null) {
            printWriter.print(str);
            printWriter.print("mTarget=");
            printWriter.print(componentCallbacksC0929cM4674i0);
            printWriter.print(" mTargetRequestCode=");
            printWriter.println(this.f3447j);
        }
        printWriter.print(str);
        printWriter.print("mPopDirection=");
        printWriter.println(m4620N());
        if (m4718y() != 0) {
            printWriter.print(str);
            printWriter.print("getEnterAnim=");
            printWriter.println(m4718y());
        }
        if (m4589C() != 0) {
            printWriter.print(str);
            printWriter.print("getExitAnim=");
            printWriter.println(m4589C());
        }
        if (m4623O() != 0) {
            printWriter.print(str);
            printWriter.print("getPopEnterAnim=");
            printWriter.println(m4623O());
        }
        if (m4626P() != 0) {
            printWriter.print(str);
            printWriter.print("getPopExitAnim=");
            printWriter.println(m4626P());
        }
        if (this.f3417J != null) {
            printWriter.print(str);
            printWriter.print("mContainer=");
            printWriter.println(this.f3417J);
        }
        if (this.f3418K != null) {
            printWriter.print(str);
            printWriter.print("mView=");
            printWriter.println(this.f3418K);
        }
        if (m4701s() != null) {
            printWriter.print(str);
            printWriter.print("mAnimatingAway=");
            printWriter.println(m4701s());
        }
        if (mo4715x() != null) {
            AbstractC8422a.m34114b(this).mo34115a(str, fileDescriptor, printWriter, strArr);
        }
        printWriter.print(str);
        printWriter.println("Child " + this.f3461x + ":");
        this.f3461x.m4417b0(str + "  ", fileDescriptor, printWriter, strArr);
    }

    @NonNull
    /* JADX INFO: renamed from: l0 */
    public AbstractC0940a0<InterfaceC0980s> m4683l0() {
        return this.f3431X;
    }

    /* JADX INFO: renamed from: l1 */
    public boolean m4684l1(@NonNull Menu menu, @NonNull MenuInflater menuInflater) {
        boolean z10 = false;
        if (this.f3410C) {
            return false;
        }
        if (this.f3414G && this.f3415H) {
            m4608I0(menu, menuInflater);
            z10 = true;
        }
        return this.f3461x.m4379H(menu, menuInflater) | z10;
    }

    /* JADX INFO: renamed from: m */
    public final j m4685m() {
        if (this.f3421N == null) {
            this.f3421N = new j();
        }
        return this.f3421N;
    }

    /* JADX INFO: renamed from: m0 */
    public final void m4686m0() {
        this.f3429V = new C0984u(this);
        this.f3433Z = C4444h.m22357a(this);
        this.f3432Y = null;
        if (this.f3439c0.contains(this.f3441d0)) {
            return;
        }
        m4603G1(this.f3441d0);
    }

    /* JADX INFO: renamed from: m1 */
    public void mo4687m1(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f3461x.m4410X0();
        this.f3457t = true;
        this.f3430W = new C4820k0(this, mo4712w(), new Runnable() { // from class: e4.l
            @Override // java.lang.Runnable
            public final void run() {
                ComponentCallbacksC0929c.m4581i(this.f19490a);
            }
        });
        View viewMo1225J0 = mo1225J0(layoutInflater, viewGroup, bundle);
        this.f3418K = viewMo1225J0;
        if (viewMo1225J0 == null) {
            if (this.f3430W.m23343d()) {
                throw new IllegalStateException("Called getViewLifecycleOwner() but onCreateView() returned null");
            }
            this.f3430W = null;
            return;
        }
        this.f3430W.m23342c();
        if (FragmentManager.m4349N0(3)) {
            Log.d("FragmentManager", "Setting ViewLifecycleOwner on View " + this.f3418K + " for Fragment " + this);
        }
        androidx.p616lifecycle.View.m4902b(this.f3418K, this.f3430W);
        C14302e1.m4903a(this.f3418K, this.f3430W);
        C4449m.m22373b(this.f3418K, this.f3430W);
        this.f3431X.mo4863o(this.f3430W);
    }

    /* JADX INFO: renamed from: n */
    public ComponentCallbacksC0929c m4688n(@NonNull String str) {
        return str.equals(this.f3443f) ? this : this.f3461x.m4447o0(str);
    }

    /* JADX INFO: renamed from: n0 */
    public void m4689n0() {
        m4686m0();
        this.f3427T = this.f3443f;
        this.f3443f = UUID.randomUUID().toString();
        this.f3449l = false;
        this.f3450m = false;
        this.f3453p = false;
        this.f3454q = false;
        this.f3456s = false;
        this.f3458u = 0;
        this.f3459v = null;
        this.f3461x = new C4804c0();
        this.f3460w = null;
        this.f3463z = 0;
        this.f3408A = 0;
        this.f3409B = null;
        this.f3410C = false;
        this.f3411D = false;
    }

    /* JADX INFO: renamed from: n1 */
    public void m4690n1() {
        this.f3461x.m4380I();
        this.f3429V.m4986j(AbstractC0966l.a.ON_DESTROY);
        this.f3434a = 0;
        this.f3416I = false;
        this.f3426S = false;
        mo4613K0();
        if (this.f3416I) {
            return;
        }
        throw new C4832q0("Fragment " + this + " did not call through to super.onDestroy()");
    }

    @NonNull
    /* JADX INFO: renamed from: o */
    public String m4691o() {
        return "fragment_" + this.f3443f + "_rq#" + this.f3437b0.getAndIncrement();
    }

    /* JADX INFO: renamed from: o1 */
    public void m4692o1() {
        this.f3461x.m4382J();
        if (this.f3418K != null && this.f3430W.mo4656a().getState().m4945b(AbstractC0966l.b.CREATED)) {
            this.f3430W.m23341b(AbstractC0966l.a.ON_DESTROY);
        }
        this.f3434a = 1;
        this.f3416I = false;
        mo4618M0();
        if (this.f3416I) {
            AbstractC8422a.m34114b(this).mo34117d();
            this.f3457t = false;
        } else {
            throw new C4832q0("Fragment " + this + " did not call through to super.onDestroyView()");
        }
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(@NonNull Configuration configuration) {
        this.f3416I = true;
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public void onCreateContextMenu(@NonNull ContextMenu contextMenu, @NonNull View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        m4606H1().onCreateContextMenu(contextMenu, view, contextMenuInfo);
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
        this.f3416I = true;
    }

    /* JADX INFO: renamed from: p */
    public final ActivityC4831q m4693p() {
        AbstractC4835t<?> abstractC4835t = this.f3460w;
        if (abstractC4835t == null) {
            return null;
        }
        return (ActivityC4831q) abstractC4835t.getActivity();
    }

    /* JADX INFO: renamed from: p0 */
    public final boolean m4694p0() {
        return this.f3460w != null && this.f3449l;
    }

    /* JADX INFO: renamed from: p1 */
    public void m4695p1() {
        this.f3434a = -1;
        this.f3416I = false;
        mo4621N0();
        this.f3425R = null;
        if (this.f3416I) {
            if (this.f3461x.m4389M0()) {
                return;
            }
            this.f3461x.m4380I();
            this.f3461x = new C4804c0();
            return;
        }
        throw new C4832q0("Fragment " + this + " did not call through to super.onDetach()");
    }

    /* JADX INFO: renamed from: q */
    public boolean m4696q() {
        Boolean bool;
        j jVar = this.f3421N;
        if (jVar == null || (bool = jVar.f3496q) == null) {
            return true;
        }
        return bool.booleanValue();
    }

    @NonNull
    /* JADX INFO: renamed from: q1 */
    public LayoutInflater m4697q1(Bundle bundle) {
        LayoutInflater layoutInflaterMo4624O0 = mo4624O0(bundle);
        this.f3425R = layoutInflaterMo4624O0;
        return layoutInflaterMo4624O0;
    }

    /* JADX INFO: renamed from: r */
    public boolean m4698r() {
        Boolean bool;
        j jVar = this.f3421N;
        if (jVar == null || (bool = jVar.f3495p) == null) {
            return true;
        }
        return bool.booleanValue();
    }

    /* JADX INFO: renamed from: r0 */
    public final boolean m4699r0() {
        if (this.f3410C) {
            return true;
        }
        FragmentManager fragmentManager = this.f3459v;
        return fragmentManager != null && fragmentManager.m4396Q0(this.f3462y);
    }

    /* JADX INFO: renamed from: r1 */
    public void m4700r1() {
        onLowMemory();
    }

    /* JADX INFO: renamed from: s */
    public View m4701s() {
        j jVar = this.f3421N;
        if (jVar == null) {
            return null;
        }
        return jVar.f3480a;
    }

    /* JADX INFO: renamed from: s0 */
    public final boolean m4702s0() {
        return this.f3458u > 0;
    }

    /* JADX INFO: renamed from: s1 */
    public void m4703s1(boolean z10) {
        m4635S0(z10);
    }

    @Deprecated
    public void startActivityForResult(@NonNull Intent intent, int i10) {
        m4655Z1(intent, i10, null);
    }

    /* JADX INFO: renamed from: t */
    public final Bundle m4704t() {
        return this.f3444g;
    }

    /* JADX INFO: renamed from: t0 */
    public final boolean m4705t0() {
        if (!this.f3415H) {
            return false;
        }
        FragmentManager fragmentManager = this.f3459v;
        return fragmentManager == null || fragmentManager.m4398R0(this.f3462y);
    }

    /* JADX INFO: renamed from: t1 */
    public boolean m4706t1(@NonNull MenuItem menuItem) {
        if (this.f3410C) {
            return false;
        }
        if (this.f3414G && this.f3415H && m4638T0(menuItem)) {
            return true;
        }
        return this.f3461x.m4391O(menuItem);
    }

    @NonNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder(128);
        sb2.append(getClass().getSimpleName());
        sb2.append("{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append("}");
        sb2.append(" (");
        sb2.append(this.f3443f);
        if (this.f3463z != 0) {
            sb2.append(" id=0x");
            sb2.append(Integer.toHexString(this.f3463z));
        }
        if (this.f3409B != null) {
            sb2.append(" tag=");
            sb2.append(this.f3409B);
        }
        sb2.append(")");
        return sb2.toString();
    }

    /* JADX INFO: renamed from: u0 */
    public boolean m4707u0() {
        j jVar = this.f3421N;
        if (jVar == null) {
            return false;
        }
        return jVar.f3501v;
    }

    /* JADX INFO: renamed from: u1 */
    public void m4708u1(@NonNull Menu menu) {
        if (this.f3410C) {
            return;
        }
        if (this.f3414G && this.f3415H) {
            m4640U0(menu);
        }
        this.f3461x.m4393P(menu);
    }

    @NonNull
    /* JADX INFO: renamed from: v */
    public final FragmentManager m4709v() {
        if (this.f3460w != null) {
            return this.f3461x;
        }
        throw new IllegalStateException("Fragment " + this + " has not been attached yet.");
    }

    /* JADX INFO: renamed from: v0 */
    public final boolean m4710v0() {
        return this.f3450m;
    }

    /* JADX INFO: renamed from: v1 */
    public void m4711v1() {
        this.f3461x.m4397R();
        if (this.f3418K != null) {
            this.f3430W.m23341b(AbstractC0966l.a.ON_PAUSE);
        }
        this.f3429V.m4986j(AbstractC0966l.a.ON_PAUSE);
        this.f3434a = 6;
        this.f3416I = false;
        mo4643V0();
        if (this.f3416I) {
            return;
        }
        throw new C4832q0("Fragment " + this + " did not call through to super.onPause()");
    }

    @Override // androidx.p616lifecycle.InterfaceC0947c1
    @NonNull
    /* JADX INFO: renamed from: w */
    public C0944b1 mo4712w() {
        if (this.f3459v == null) {
            throw new IllegalStateException("Can't access ViewModels from detached fragment");
        }
        if (m4607I() != AbstractC0966l.b.INITIALIZED.ordinal()) {
            return this.f3459v.m4381I0(this);
        }
        throw new IllegalStateException("Calling getViewModelStore() before a Fragment reaches onCreate() when using setMaxLifecycle(INITIALIZED) is not supported");
    }

    /* JADX INFO: renamed from: w0 */
    public final boolean m4713w0() {
        FragmentManager fragmentManager = this.f3459v;
        if (fragmentManager == null) {
            return false;
        }
        return fragmentManager.m4404U0();
    }

    /* JADX INFO: renamed from: w1 */
    public void m4714w1(boolean z10) {
        m4645W0(z10);
    }

    /* JADX INFO: renamed from: x */
    public Context mo4715x() {
        AbstractC4835t<?> abstractC4835t = this.f3460w;
        if (abstractC4835t == null) {
            return null;
        }
        return abstractC4835t.getContext();
    }

    /* JADX INFO: renamed from: x0 */
    public final boolean m4716x0() {
        View view;
        return (!m4694p0() || m4699r0() || (view = this.f3418K) == null || view.getWindowToken() == null || this.f3418K.getVisibility() != 0) ? false : true;
    }

    /* JADX INFO: renamed from: x1 */
    public boolean m4717x1(@NonNull Menu menu) {
        boolean z10 = false;
        if (this.f3410C) {
            return false;
        }
        if (this.f3414G && this.f3415H) {
            m4648X0(menu);
            z10 = true;
        }
        return this.f3461x.m4401T(menu) | z10;
    }

    /* JADX INFO: renamed from: y */
    public int m4718y() {
        j jVar = this.f3421N;
        if (jVar == null) {
            return 0;
        }
        return jVar.f3482c;
    }

    /* JADX INFO: renamed from: y0 */
    public void m4719y0() {
        this.f3461x.m4410X0();
    }

    /* JADX INFO: renamed from: y1 */
    public void m4720y1() {
        boolean zM4400S0 = this.f3459v.m4400S0(this);
        Boolean bool = this.f3448k;
        if (bool == null || bool.booleanValue() != zM4400S0) {
            this.f3448k = Boolean.valueOf(zM4400S0);
            m4651Y0(zM4400S0);
            this.f3461x.m4403U();
        }
    }

    /* JADX INFO: renamed from: z */
    public Object m4721z() {
        j jVar = this.f3421N;
        if (jVar == null) {
            return null;
        }
        return jVar.f3489j;
    }

    @Deprecated
    /* JADX INFO: renamed from: z0 */
    public void mo4722z0(Bundle bundle) {
        this.f3416I = true;
    }

    /* JADX INFO: renamed from: z1 */
    public void m4723z1() {
        this.f3461x.m4410X0();
        this.f3461x.m4425f0(true);
        this.f3434a = 7;
        this.f3416I = false;
        mo4658a1();
        if (!this.f3416I) {
            throw new C4832q0("Fragment " + this + " did not call through to super.onResume()");
        }
        C0984u c0984u = this.f3429V;
        AbstractC0966l.a aVar = AbstractC0966l.a.ON_RESUME;
        c0984u.m4986j(aVar);
        if (this.f3418K != null) {
            this.f3430W.m23341b(aVar);
        }
        this.f3461x.m4405V();
    }
}
