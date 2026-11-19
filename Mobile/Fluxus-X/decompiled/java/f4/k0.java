package f4;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.fragment.app.FragmentContainerView;
import com.github.luben.zstd.BuildConfig;
import com.google.mlkit.vision.barcode.common.Barcode;
import e.BackEventCompat;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public abstract class k0 {
    public static boolean U = false;
    public static boolean V = true;
    public f4.q A;
    public g.d<Intent> F;
    public g.d<g.i> G;
    public g.d<String[]> H;
    public boolean J;
    public boolean K;
    public boolean L;
    public boolean M;
    public boolean N;
    public ArrayList<f4.a> O;
    public ArrayList<Boolean> P;
    public ArrayList<f4.q> Q;
    public n0 R;
    public g4.c.C0319c S;
    public boolean b;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ArrayList<f4.q> f15391e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public e.p0 f15393g;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public a0<?> f15410x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public x f15411y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public f4.q f15412z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList<p> f15388a = new ArrayList<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final s0 f15389c = new s0();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ArrayList<f4.a> f15390d = new ArrayList<>();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final c0 f15392f = new c0(this);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public f4.a f15394h = null;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f15395i = false;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e.m0 f15396j = new b(false);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final AtomicInteger f15397k = new AtomicInteger();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Map<String, f4.c> f15398l = Collections.synchronizedMap(new HashMap());

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Map<String, Bundle> f15399m = Collections.synchronizedMap(new HashMap());

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Map<String, n> f15400n = Collections.synchronizedMap(new HashMap());

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public ArrayList<o> f15401o = new ArrayList<>();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final d0 f15402p = new d0(this);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final CopyOnWriteArrayList<o0> f15403q = new CopyOnWriteArrayList<>();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final x2.a<Configuration> f15404r = new x2.a() { // from class: f4.e0
        @Override // x2.a
        public final void accept(Object obj) {
            k0.f(this.f15331a, (Configuration) obj);
        }
    };

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final x2.a<Integer> f15405s = new x2.a() { // from class: f4.f0
        @Override // x2.a
        public final void accept(Object obj) {
            k0.a(this.f15376a, (Integer) obj);
        }
    };

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final x2.a<k2.h> f15406t = new x2.a() { // from class: f4.g0
        @Override // x2.a
        public final void accept(Object obj) {
            k0.e(this.f15378a, (k2.h) obj);
        }
    };

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final x2.a<k2.s> f15407u = new x2.a() { // from class: f4.h0
        @Override // x2.a
        public final void accept(Object obj) {
            k0.d(this.f15380a, (k2.s) obj);
        }
    };

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final androidx.core.view.r f15408v = new c();

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f15409w = -1;
    public z B = null;
    public z C = new d();
    public d1 D = null;
    public d1 E = new e();
    public ArrayDeque<m> I = new ArrayDeque<>();
    public Runnable T = new f();

    public class a implements g.b<Map<String, Boolean>> {
        public a() {
        }

        @Override // g.b
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(Map<String, Boolean> map) {
            String[] strArr = (String[]) map.keySet().toArray(new String[0]);
            ArrayList arrayList = new ArrayList(map.values());
            int[] iArr = new int[arrayList.size()];
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                iArr[i10] = ((Boolean) arrayList.get(i10)).booleanValue() ? 0 : -1;
            }
            m mVarPollFirst = k0.this.I.pollFirst();
            if (mVarPollFirst == null) {
                Log.w("FragmentManager", "No permissions were requested for " + this);
                return;
            }
            String str = mVarPollFirst.f15423a;
            int i11 = mVarPollFirst.b;
            f4.q qVarI = k0.this.f15389c.i(str);
            if (qVarI != null) {
                qVarI.Z0(i11, strArr, iArr);
                return;
            }
            Log.w("FragmentManager", "Permission request result delivered for unknown Fragment " + str);
        }
    }

    public class b extends e.m0 {
        public b(boolean z10) {
            super(z10);
        }

        @Override // e.m0
        public void handleOnBackCancelled() {
            if (k0.N0(3)) {
                Log.d("FragmentManager", "handleOnBackCancelled. PREDICTIVE_BACK = " + k0.V + " fragment manager " + k0.this);
            }
            if (k0.V) {
                k0.this.s();
            }
        }

        @Override // e.m0
        public void handleOnBackPressed() {
            if (k0.N0(3)) {
                Log.d("FragmentManager", "handleOnBackPressed. PREDICTIVE_BACK = " + k0.V + " fragment manager " + k0.this);
            }
            k0.this.J0();
        }

        @Override // e.m0
        public void handleOnBackProgressed(@NonNull BackEventCompat backEventCompat) {
            if (k0.N0(2)) {
                Log.v("FragmentManager", "handleOnBackProgressed. PREDICTIVE_BACK = " + k0.V + " fragment manager " + k0.this);
            }
            k0 k0Var = k0.this;
            if (k0Var.f15394h != null) {
                int i10 = 0;
                Iterator<c1> it = k0Var.z(new ArrayList<>(Collections.singletonList(k0.this.f15394h)), 0, 1).iterator();
                while (it.hasNext()) {
                    it.next().A(backEventCompat);
                }
                ArrayList<o> arrayList = k0.this.f15401o;
                int size = arrayList.size();
                while (i10 < size) {
                    o oVar = arrayList.get(i10);
                    i10++;
                    oVar.b(backEventCompat);
                }
            }
        }

        @Override // e.m0
        public void handleOnBackStarted(@NonNull BackEventCompat backEventCompat) {
            if (k0.N0(3)) {
                Log.d("FragmentManager", "handleOnBackStarted. PREDICTIVE_BACK = " + k0.V + " fragment manager " + k0.this);
            }
            if (k0.V) {
                k0.this.c0();
                k0.this.i1();
            }
        }
    }

    public class c implements androidx.core.view.r {
        public c() {
        }

        @Override // androidx.core.view.r
        public void a(@NonNull Menu menu) {
            k0.this.P(menu);
        }

        @Override // androidx.core.view.r
        public void b(@NonNull Menu menu) {
            k0.this.T(menu);
        }

        @Override // androidx.core.view.r
        public boolean c(@NonNull MenuItem menuItem) {
            return k0.this.O(menuItem);
        }

        @Override // androidx.core.view.r
        public void d(@NonNull Menu menu, @NonNull MenuInflater menuInflater) {
            k0.this.H(menu, menuInflater);
        }
    }

    public class d extends z {
        public d() {
        }

        @Override // f4.z
        @NonNull
        public f4.q a(@NonNull ClassLoader classLoader, @NonNull String str) {
            return k0.this.A0().c(k0.this.A0().getContext(), str, null);
        }
    }

    public class e implements d1 {
        public e() {
        }

        @Override // f4.d1
        @NonNull
        public c1 a(@NonNull ViewGroup viewGroup) {
            return new f4.f(viewGroup);
        }
    }

    public class f implements Runnable {
        public f() {
        }

        @Override // java.lang.Runnable
        public void run() {
            k0.this.f0(true);
        }
    }

    public class g implements androidx.p000lifecycle.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f15417a;
        public final /* synthetic */ p0 b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ androidx.p000lifecycle.l f15418c;

        public g(String str, p0 p0Var, androidx.p000lifecycle.l lVar) {
            this.f15417a = str;
            this.b = p0Var;
            this.f15418c = lVar;
        }

        @Override // androidx.p000lifecycle.p
        public void g(@NonNull androidx.p000lifecycle.s sVar, @NonNull androidx.lifecycle.l.a aVar) {
            Bundle bundle;
            if (aVar == androidx.lifecycle.l.a.ON_START && (bundle = (Bundle) k0.this.f15399m.get(this.f15417a)) != null) {
                this.b.a(this.f15417a, bundle);
                k0.this.x(this.f15417a);
            }
            if (aVar == androidx.lifecycle.l.a.ON_DESTROY) {
                this.f15418c.d(this);
                k0.this.f15400n.remove(this.f15417a);
            }
        }
    }

    public class h implements o0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ f4.q f15420a;

        public h(f4.q qVar) {
            this.f15420a = qVar;
        }

        @Override // f4.o0
        public void b(@NonNull k0 k0Var, @NonNull f4.q qVar) {
            this.f15420a.D0(qVar);
        }
    }

    public class i implements g.b<g.a> {
        public i() {
        }

        @Override // g.b
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(g.a aVar) {
            m mVarPollLast = k0.this.I.pollLast();
            if (mVarPollLast == null) {
                Log.w("FragmentManager", "No Activities were started for result for " + this);
                return;
            }
            String str = mVarPollLast.f15423a;
            int i10 = mVarPollLast.b;
            f4.q qVarI = k0.this.f15389c.i(str);
            if (qVarI != null) {
                qVarI.A0(i10, aVar.getResultCode(), aVar.getData());
                return;
            }
            Log.w("FragmentManager", "Activity result delivered for unknown Fragment " + str);
        }
    }

    public class j implements g.b<g.a> {
        public j() {
        }

        @Override // g.b
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(g.a aVar) {
            m mVarPollFirst = k0.this.I.pollFirst();
            if (mVarPollFirst == null) {
                Log.w("FragmentManager", "No IntentSenders were started for " + this);
                return;
            }
            String str = mVarPollFirst.f15423a;
            int i10 = mVarPollFirst.b;
            f4.q qVarI = k0.this.f15389c.i(str);
            if (qVarI != null) {
                qVarI.A0(i10, aVar.getResultCode(), aVar.getData());
                return;
            }
            Log.w("FragmentManager", "Intent Sender result delivered for unknown Fragment " + str);
        }
    }

    public static class k extends h.a<g.i, g.a> {
        @Override // h.a
        @NonNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Intent createIntent(@NonNull Context context, g.i iVar) {
            Bundle bundleExtra;
            Intent intent = new Intent("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST");
            Intent fillInIntent = iVar.getFillInIntent();
            if (fillInIntent != null && (bundleExtra = fillInIntent.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) != null) {
                intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundleExtra);
                fillInIntent.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                if (fillInIntent.getBooleanExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", false)) {
                    iVar = new g.i.a(iVar.getIntentSender()).b(null).c(iVar.getFlagsValues(), iVar.getFlagsMask()).a();
                }
            }
            intent.putExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST", iVar);
            if (k0.N0(2)) {
                Log.v("FragmentManager", "CreateIntent created the following intent: " + intent);
            }
            return intent;
        }

        @Override // h.a
        @NonNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public g.a parseResult(int i10, Intent intent) {
            return new g.a(i10, intent);
        }
    }

    public static abstract class l {
    }

    public static class n implements p0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final androidx.p000lifecycle.l f15424a;
        public final p0 b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final androidx.p000lifecycle.p f15425c;

        public n(@NonNull androidx.p000lifecycle.l lVar, @NonNull p0 p0Var, @NonNull androidx.p000lifecycle.p pVar) {
            this.f15424a = lVar;
            this.b = p0Var;
            this.f15425c = pVar;
        }

        @Override // f4.p0
        public void a(@NonNull String str, @NonNull Bundle bundle) {
            this.b.a(str, bundle);
        }

        public boolean b(androidx.lifecycle.l.b bVar) {
            return this.f15424a.getState().b(bVar);
        }

        public void c() {
            this.f15424a.d(this.f15425c);
        }
    }

    public interface o {
        default void a(@NonNull f4.q qVar, boolean z10) {
        }

        default void b(@NonNull BackEventCompat backEventCompat) {
        }

        default void c() {
        }

        default void d(@NonNull f4.q qVar, boolean z10) {
        }

        void onBackStackChanged();
    }

    public interface p {
        boolean a(@NonNull ArrayList<f4.a> arrayList, @NonNull ArrayList<Boolean> arrayList2);
    }

    public class q implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f15426a;
        public final int b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f15427c;

        public q(String str, int i10, int i11) {
            this.f15426a = str;
            this.b = i10;
            this.f15427c = i11;
        }

        @Override // f4.k0.p
        public boolean a(@NonNull ArrayList<f4.a> arrayList, @NonNull ArrayList<Boolean> arrayList2) {
            f4.q qVar = k0.this.A;
            if (qVar == null || this.b >= 0 || this.f15426a != null || !qVar.u().d1()) {
                return k0.this.g1(arrayList, arrayList2, this.f15426a, this.b, this.f15427c);
            }
            return false;
        }
    }

    public class r implements p {
        public r() {
        }

        @Override // f4.k0.p
        public boolean a(@NonNull ArrayList<f4.a> arrayList, @NonNull ArrayList<Boolean> arrayList2) {
            boolean zH1 = k0.this.h1(arrayList, arrayList2);
            if (!k0.this.f15401o.isEmpty() && arrayList.size() > 0) {
                boolean zBooleanValue = arrayList2.get(arrayList.size() - 1).booleanValue();
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                int size = arrayList.size();
                int i10 = 0;
                int i11 = 0;
                while (i11 < size) {
                    f4.a aVar = arrayList.get(i11);
                    i11++;
                    linkedHashSet.addAll(k0.this.s0(aVar));
                }
                ArrayList<o> arrayList3 = k0.this.f15401o;
                int size2 = arrayList3.size();
                while (i10 < size2) {
                    o oVar = arrayList3.get(i10);
                    i10++;
                    o oVar2 = oVar;
                    Iterator it = linkedHashSet.iterator();
                    while (it.hasNext()) {
                        oVar2.a((f4.q) it.next(), zBooleanValue);
                    }
                }
            }
            return zH1;
        }
    }

    public static f4.q H0(@NonNull View view) {
        Object tag = view.getTag(e4.b.f13177a);
        if (tag instanceof f4.q) {
            return (f4.q) tag;
        }
        return null;
    }

    public static boolean N0(int i10) {
        return U || Log.isLoggable("FragmentManager", i10);
    }

    public static /* synthetic */ void a(k0 k0Var, Integer num) {
        if (k0Var.P0() && num.intValue() == 80) {
            k0Var.K(false);
        }
    }

    public static /* synthetic */ void c(k0 k0Var) {
        ArrayList<o> arrayList = k0Var.f15401o;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            o oVar = arrayList.get(i10);
            i10++;
            oVar.c();
        }
    }

    public static /* synthetic */ void d(k0 k0Var, k2.s sVar) {
        if (k0Var.P0()) {
            k0Var.S(sVar.getIsInPictureInPictureMode(), false);
        }
    }

    public static /* synthetic */ void e(k0 k0Var, k2.h hVar) {
        if (k0Var.P0()) {
            k0Var.L(hVar.getIsInMultiWindowMode(), false);
        }
    }

    public static /* synthetic */ void f(k0 k0Var, Configuration configuration) {
        if (k0Var.P0()) {
            k0Var.E(configuration, false);
        }
    }

    public static void h0(@NonNull ArrayList<f4.a> arrayList, @NonNull ArrayList<Boolean> arrayList2, int i10, int i11) {
        while (i10 < i11) {
            f4.a aVar = arrayList.get(i10);
            if (arrayList2.get(i10).booleanValue()) {
                aVar.u(-1);
                aVar.A();
            } else {
                aVar.u(1);
                aVar.z();
            }
            i10++;
        }
    }

    public static int o1(int i10) {
        if (i10 == 4097) {
            return 8194;
        }
        if (i10 == 8194) {
            return 4097;
        }
        if (i10 == 8197) {
            return 4100;
        }
        if (i10 != 4099) {
            return i10 != 4100 ? 0 : 8197;
        }
        return 4099;
    }

    @NonNull
    public static k0 p0(@NonNull View view) {
        v vVar;
        f4.q qVarQ0 = q0(view);
        if (qVarQ0 != null) {
            if (qVarQ0.p0()) {
                return qVarQ0.u();
            }
            throw new IllegalStateException("The Fragment " + qVarQ0 + " that owns View " + view + " has already been destroyed. Nested fragments should always use the child FragmentManager.");
        }
        Context context = view.getContext();
        while (true) {
            if (!(context instanceof ContextWrapper)) {
                vVar = null;
                break;
            }
            if (context instanceof v) {
                vVar = (v) context;
                break;
            }
            context = ((ContextWrapper) context).getBaseContext();
        }
        if (vVar != null) {
            return vVar.l1();
        }
        throw new IllegalStateException("View " + view + " is not within a subclass of FragmentActivity.");
    }

    public static f4.q q0(@NonNull View view) {
        while (view != null) {
            f4.q qVarH0 = H0(view);
            if (qVarH0 != null) {
                return qVarH0;
            }
            Object parent = view.getParent();
            view = parent instanceof View ? (View) parent : null;
        }
        return null;
    }

    @NonNull
    public r0 A(@NonNull f4.q qVar) {
        r0 r0VarN = this.f15389c.n(qVar.f15478f);
        if (r0VarN != null) {
            return r0VarN;
        }
        r0 r0Var = new r0(this.f15402p, this.f15389c, qVar);
        r0Var.o(this.f15410x.getContext().getClassLoader());
        r0Var.s(this.f15409w);
        return r0Var;
    }

    @NonNull
    public a0<?> A0() {
        return this.f15410x;
    }

    public final void A1() {
        synchronized (this.f15388a) {
            try {
                if (!this.f15388a.isEmpty()) {
                    this.f15396j.setEnabled(true);
                    if (N0(3)) {
                        Log.d("FragmentManager", "FragmentManager " + this + " enabling OnBackPressedCallback, caused by non-empty pending actions");
                    }
                    return;
                }
                boolean z10 = u0() > 0 && S0(this.f15412z);
                if (N0(3)) {
                    Log.d("FragmentManager", "OnBackPressedCallback for FragmentManager " + this + " enabled state is " + z10);
                }
                this.f15396j.setEnabled(z10);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void B(@NonNull f4.q qVar) {
        if (N0(2)) {
            Log.v("FragmentManager", "detach: " + qVar);
        }
        if (qVar.D) {
            return;
        }
        qVar.D = true;
        if (qVar.f15484l) {
            if (N0(2)) {
                Log.v("FragmentManager", "remove from detach: " + qVar);
            }
            this.f15389c.u(qVar);
            if (O0(qVar)) {
                this.J = true;
            }
            w1(qVar);
        }
    }

    @NonNull
    public LayoutInflater.Factory2 B0() {
        return this.f15392f;
    }

    public void C() {
        this.K = false;
        this.L = false;
        this.R.p(false);
        X(4);
    }

    @NonNull
    public d0 C0() {
        return this.f15402p;
    }

    public void D() {
        this.K = false;
        this.L = false;
        this.R.p(false);
        X(0);
    }

    public f4.q D0() {
        return this.f15412z;
    }

    public void E(@NonNull Configuration configuration, boolean z10) {
        if (z10 && (this.f15410x instanceof l2.e)) {
            z1(new IllegalStateException("Do not call dispatchConfigurationChanged() on host. Host implements OnConfigurationChangedProvider and automatically dispatches configuration changes to fragments."));
        }
        for (f4.q qVar : this.f15389c.o()) {
            if (qVar != null) {
                qVar.i1(configuration);
                if (z10) {
                    qVar.f15496x.E(configuration, true);
                }
            }
        }
    }

    public f4.q E0() {
        return this.A;
    }

    public boolean F(@NonNull MenuItem menuItem) {
        if (this.f15409w < 1) {
            return false;
        }
        for (f4.q qVar : this.f15389c.o()) {
            if (qVar != null && qVar.j1(menuItem)) {
                return true;
            }
        }
        return false;
    }

    @NonNull
    public d1 F0() {
        d1 d1Var = this.D;
        if (d1Var != null) {
            return d1Var;
        }
        f4.q qVar = this.f15412z;
        return qVar != null ? qVar.f15494v.F0() : this.E;
    }

    public void G() {
        this.K = false;
        this.L = false;
        this.R.p(false);
        X(1);
    }

    public g4.c.C0319c G0() {
        return this.S;
    }

    public boolean H(@NonNull Menu menu, @NonNull MenuInflater menuInflater) {
        if (this.f15409w < 1) {
            return false;
        }
        ArrayList<f4.q> arrayList = null;
        boolean z10 = false;
        for (f4.q qVar : this.f15389c.o()) {
            if (qVar != null && R0(qVar) && qVar.l1(menu, menuInflater)) {
                if (arrayList == null) {
                    arrayList = new ArrayList<>();
                }
                arrayList.add(qVar);
                z10 = true;
            }
        }
        if (this.f15391e != null) {
            for (int i10 = 0; i10 < this.f15391e.size(); i10++) {
                f4.q qVar2 = this.f15391e.get(i10);
                if (arrayList == null || !arrayList.contains(qVar2)) {
                    qVar2.L0();
                }
            }
        }
        this.f15391e = arrayList;
        return z10;
    }

    public void I() {
        this.M = true;
        f0(true);
        c0();
        w();
        X(-1);
        Object obj = this.f15410x;
        if (obj instanceof l2.f) {
            ((l2.f) obj).j(this.f15405s);
        }
        Object obj2 = this.f15410x;
        if (obj2 instanceof l2.e) {
            ((l2.e) obj2).p0(this.f15404r);
        }
        Object obj3 = this.f15410x;
        if (obj3 instanceof k2.o) {
            ((k2.o) obj3).y(this.f15406t);
        }
        Object obj4 = this.f15410x;
        if (obj4 instanceof k2.p) {
            ((k2.p) obj4).h0(this.f15407u);
        }
        Object obj5 = this.f15410x;
        if ((obj5 instanceof androidx.core.view.o) && this.f15412z == null) {
            ((androidx.core.view.o) obj5).Q(this.f15408v);
        }
        this.f15410x = null;
        this.f15411y = null;
        this.f15412z = null;
        if (this.f15393g != null) {
            this.f15396j.remove();
            this.f15393g = null;
        }
        g.d<Intent> dVar = this.F;
        if (dVar != null) {
            dVar.d();
            this.G.d();
            this.H.d();
        }
    }

    @NonNull
    public androidx.p000lifecycle.b1 I0(@NonNull f4.q qVar) {
        return this.R.m(qVar);
    }

    public void J() {
        X(1);
    }

    public void J0() {
        this.f15395i = true;
        f0(true);
        int i10 = 0;
        this.f15395i = false;
        if (!V || this.f15394h == null) {
            if (this.f15396j.getIsEnabled()) {
                if (N0(3)) {
                    Log.d("FragmentManager", "Calling popBackStackImmediate via onBackPressed callback");
                }
                d1();
                return;
            } else {
                if (N0(3)) {
                    Log.d("FragmentManager", "Calling onBackPressed via onBackPressed callback");
                }
                this.f15393g.i();
                return;
            }
        }
        if (!this.f15401o.isEmpty()) {
            LinkedHashSet linkedHashSet = new LinkedHashSet(s0(this.f15394h));
            ArrayList<o> arrayList = this.f15401o;
            int size = arrayList.size();
            int i11 = 0;
            while (i11 < size) {
                o oVar = arrayList.get(i11);
                i11++;
                o oVar2 = oVar;
                Iterator it = linkedHashSet.iterator();
                while (it.hasNext()) {
                    oVar2.d((f4.q) it.next(), true);
                }
            }
        }
        ArrayList<t0.a> arrayList2 = this.f15394h.f15560c;
        int size2 = arrayList2.size();
        int i12 = 0;
        while (i12 < size2) {
            t0.a aVar = arrayList2.get(i12);
            i12++;
            f4.q qVar = aVar.b;
            if (qVar != null) {
                qVar.f15486n = false;
            }
        }
        Iterator<c1> it2 = z(new ArrayList<>(Collections.singletonList(this.f15394h)), 0, 1).iterator();
        while (it2.hasNext()) {
            it2.next().f();
        }
        ArrayList<t0.a> arrayList3 = this.f15394h.f15560c;
        int size3 = arrayList3.size();
        while (i10 < size3) {
            t0.a aVar2 = arrayList3.get(i10);
            i10++;
            f4.q qVar2 = aVar2.b;
            if (qVar2 != null && qVar2.J == null) {
                A(qVar2).m();
            }
        }
        this.f15394h = null;
        A1();
        if (N0(3)) {
            Log.d("FragmentManager", "Op is being set to null");
            Log.d("FragmentManager", "OnBackPressedCallback enabled=" + this.f15396j.getIsEnabled() + " for  FragmentManager " + this);
        }
    }

    public void K(boolean z10) {
        if (z10 && (this.f15410x instanceof l2.f)) {
            z1(new IllegalStateException("Do not call dispatchLowMemory() on host. Host implements OnTrimMemoryProvider and automatically dispatches low memory callbacks to fragments."));
        }
        for (f4.q qVar : this.f15389c.o()) {
            if (qVar != null) {
                qVar.r1();
                if (z10) {
                    qVar.f15496x.K(true);
                }
            }
        }
    }

    public void K0(@NonNull f4.q qVar) {
        if (N0(2)) {
            Log.v("FragmentManager", "hide: " + qVar);
        }
        if (qVar.C) {
            return;
        }
        qVar.C = true;
        qVar.Q = true ^ qVar.Q;
        w1(qVar);
    }

    public void L(boolean z10, boolean z11) {
        if (z11 && (this.f15410x instanceof k2.o)) {
            z1(new IllegalStateException("Do not call dispatchMultiWindowModeChanged() on host. Host implements OnMultiWindowModeChangedProvider and automatically dispatches multi-window mode changes to fragments."));
        }
        for (f4.q qVar : this.f15389c.o()) {
            if (qVar != null) {
                qVar.s1(z10);
                if (z11) {
                    qVar.f15496x.L(z10, true);
                }
            }
        }
    }

    public void L0(@NonNull f4.q qVar) {
        if (qVar.f15484l && O0(qVar)) {
            this.J = true;
        }
    }

    public void M(@NonNull f4.q qVar) {
        Iterator<o0> it = this.f15403q.iterator();
        while (it.hasNext()) {
            it.next().b(this, qVar);
        }
    }

    public boolean M0() {
        return this.M;
    }

    public void N() {
        for (f4.q qVar : this.f15389c.l()) {
            if (qVar != null) {
                qVar.P0(qVar.r0());
                qVar.f15496x.N();
            }
        }
    }

    public boolean O(@NonNull MenuItem menuItem) {
        if (this.f15409w < 1) {
            return false;
        }
        for (f4.q qVar : this.f15389c.o()) {
            if (qVar != null && qVar.t1(menuItem)) {
                return true;
            }
        }
        return false;
    }

    public final boolean O0(@NonNull f4.q qVar) {
        return (qVar.G && qVar.H) || qVar.f15496x.t();
    }

    public void P(@NonNull Menu menu) {
        if (this.f15409w < 1) {
            return;
        }
        for (f4.q qVar : this.f15389c.o()) {
            if (qVar != null) {
                qVar.u1(menu);
            }
        }
    }

    public final boolean P0() {
        f4.q qVar = this.f15412z;
        if (qVar == null) {
            return true;
        }
        return qVar.p0() && this.f15412z.L().P0();
    }

    public final void Q(f4.q qVar) {
        if (qVar == null || !qVar.equals(k0(qVar.f15478f))) {
            return;
        }
        qVar.y1();
    }

    public boolean Q0(f4.q qVar) {
        if (qVar == null) {
            return false;
        }
        return qVar.r0();
    }

    public void R() {
        X(5);
    }

    public boolean R0(f4.q qVar) {
        if (qVar == null) {
            return true;
        }
        return qVar.t0();
    }

    public void S(boolean z10, boolean z11) {
        if (z11 && (this.f15410x instanceof k2.p)) {
            z1(new IllegalStateException("Do not call dispatchPictureInPictureModeChanged() on host. Host implements OnPictureInPictureModeChangedProvider and automatically dispatches picture-in-picture mode changes to fragments."));
        }
        for (f4.q qVar : this.f15389c.o()) {
            if (qVar != null) {
                qVar.w1(z10);
                if (z11) {
                    qVar.f15496x.S(z10, true);
                }
            }
        }
    }

    public boolean S0(f4.q qVar) {
        if (qVar == null) {
            return true;
        }
        k0 k0Var = qVar.f15494v;
        return qVar.equals(k0Var.E0()) && S0(k0Var.f15412z);
    }

    public boolean T(@NonNull Menu menu) {
        boolean z10 = false;
        if (this.f15409w < 1) {
            return false;
        }
        for (f4.q qVar : this.f15389c.o()) {
            if (qVar != null && R0(qVar) && qVar.x1(menu)) {
                z10 = true;
            }
        }
        return z10;
    }

    public boolean T0(int i10) {
        return this.f15409w >= i10;
    }

    public void U() {
        A1();
        Q(this.A);
    }

    public boolean U0() {
        return this.K || this.L;
    }

    public void V() {
        this.K = false;
        this.L = false;
        this.R.p(false);
        X(7);
    }

    public void V0(@NonNull f4.q qVar, @NonNull Intent intent, int i10, Bundle bundle) {
        if (this.F == null) {
            this.f15410x.n(qVar, intent, i10, bundle);
            return;
        }
        this.I.addLast(new m(qVar.f15478f, i10));
        if (bundle != null) {
            intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundle);
        }
        this.F.b(intent);
    }

    public void W() {
        this.K = false;
        this.L = false;
        this.R.p(false);
        X(5);
    }

    public void W0(int i10, boolean z10) {
        a0<?> a0Var;
        if (this.f15410x == null && i10 != -1) {
            throw new IllegalStateException("No activity");
        }
        if (z10 || i10 != this.f15409w) {
            this.f15409w = i10;
            this.f15389c.t();
            y1();
            if (this.J && (a0Var = this.f15410x) != null && this.f15409w == 7) {
                a0Var.o();
                this.J = false;
            }
        }
    }

    public final void X(int i10) {
        try {
            this.b = true;
            this.f15389c.d(i10);
            W0(i10, false);
            Iterator<c1> it = y().iterator();
            while (it.hasNext()) {
                it.next().q();
            }
            this.b = false;
            f0(true);
        } catch (Throwable th2) {
            this.b = false;
            throw th2;
        }
    }

    public void X0() {
        if (this.f15410x == null) {
            return;
        }
        this.K = false;
        this.L = false;
        this.R.p(false);
        for (f4.q qVar : this.f15389c.o()) {
            if (qVar != null) {
                qVar.y0();
            }
        }
    }

    public void Y() {
        this.L = true;
        this.R.p(true);
        X(4);
    }

    public final void Y0(@NonNull FragmentContainerView fragmentContainerView) {
        View view;
        for (r0 r0Var : this.f15389c.k()) {
            f4.q qVarK = r0Var.k();
            if (qVarK.A == fragmentContainerView.getId() && (view = qVarK.K) != null && view.getParent() == null) {
                qVarK.J = fragmentContainerView;
                r0Var.b();
                r0Var.m();
            }
        }
    }

    public void Z() {
        X(2);
    }

    public void Z0(@NonNull r0 r0Var) {
        f4.q qVarK = r0Var.k();
        if (qVarK.L) {
            if (this.b) {
                this.N = true;
            } else {
                qVarK.L = false;
                r0Var.m();
            }
        }
    }

    public final void a0() {
        if (this.N) {
            this.N = false;
            y1();
        }
    }

    public void a1() {
        d0(new q(null, -1, 0), false);
    }

    public void b0(@NonNull String str, FileDescriptor fileDescriptor, @NonNull PrintWriter printWriter, String[] strArr) {
        int size;
        String str2 = str + "    ";
        this.f15389c.e(str, fileDescriptor, printWriter, strArr);
        ArrayList<f4.q> arrayList = this.f15391e;
        if (arrayList != null && (size = arrayList.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Fragments Created Menus:");
            for (int i10 = 0; i10 < size; i10++) {
                f4.q qVar = this.f15391e.get(i10);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i10);
                printWriter.print(": ");
                printWriter.println(qVar.toString());
            }
        }
        int size2 = this.f15390d.size();
        if (size2 > 0) {
            printWriter.print(str);
            printWriter.println("Back Stack:");
            for (int i11 = 0; i11 < size2; i11++) {
                f4.a aVar = this.f15390d.get(i11);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i11);
                printWriter.print(": ");
                printWriter.println(aVar.toString());
                aVar.x(str2, printWriter);
            }
        }
        printWriter.print(str);
        printWriter.println("Back Stack Index: " + this.f15397k.get());
        synchronized (this.f15388a) {
            try {
                int size3 = this.f15388a.size();
                if (size3 > 0) {
                    printWriter.print(str);
                    printWriter.println("Pending Actions:");
                    for (int i12 = 0; i12 < size3; i12++) {
                        p pVar = this.f15388a.get(i12);
                        printWriter.print(str);
                        printWriter.print("  #");
                        printWriter.print(i12);
                        printWriter.print(": ");
                        printWriter.println(pVar);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        printWriter.print(str);
        printWriter.println("FragmentManager misc state:");
        printWriter.print(str);
        printWriter.print("  mHost=");
        printWriter.println(this.f15410x);
        printWriter.print(str);
        printWriter.print("  mContainer=");
        printWriter.println(this.f15411y);
        if (this.f15412z != null) {
            printWriter.print(str);
            printWriter.print("  mParent=");
            printWriter.println(this.f15412z);
        }
        printWriter.print(str);
        printWriter.print("  mCurState=");
        printWriter.print(this.f15409w);
        printWriter.print(" mStateSaved=");
        printWriter.print(this.K);
        printWriter.print(" mStopped=");
        printWriter.print(this.L);
        printWriter.print(" mDestroyed=");
        printWriter.println(this.M);
        if (this.J) {
            printWriter.print(str);
            printWriter.print("  mNeedMenuInvalidate=");
            printWriter.println(this.J);
        }
    }

    public void b1(int i10, int i11, boolean z10) {
        if (i10 >= 0) {
            d0(new q(null, i10, i11), z10);
            return;
        }
        throw new IllegalArgumentException("Bad id: " + i10);
    }

    public final void c0() {
        Iterator<c1> it = y().iterator();
        while (it.hasNext()) {
            it.next().q();
        }
    }

    public void c1(String str, int i10) {
        d0(new q(str, -1, i10), false);
    }

    public void d0(@NonNull p pVar, boolean z10) {
        if (!z10) {
            if (this.f15410x == null) {
                if (!this.M) {
                    throw new IllegalStateException("FragmentManager has not been attached to a host.");
                }
                throw new IllegalStateException("FragmentManager has been destroyed");
            }
            u();
        }
        synchronized (this.f15388a) {
            try {
                if (this.f15410x == null) {
                    if (!z10) {
                        throw new IllegalStateException("Activity has been destroyed");
                    }
                } else {
                    this.f15388a.add(pVar);
                    q1();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public boolean d1() {
        return f1(null, -1, 0);
    }

    public final void e0(boolean z10) {
        if (this.b) {
            throw new IllegalStateException("FragmentManager is already executing transactions");
        }
        if (this.f15410x == null) {
            if (!this.M) {
                throw new IllegalStateException("FragmentManager has not been attached to a host.");
            }
            throw new IllegalStateException("FragmentManager has been destroyed");
        }
        if (Looper.myLooper() != this.f15410x.getHandler().getLooper()) {
            throw new IllegalStateException("Must be called from main thread of fragment host");
        }
        if (!z10) {
            u();
        }
        if (this.O == null) {
            this.O = new ArrayList<>();
            this.P = new ArrayList<>();
        }
    }

    public boolean e1(int i10, int i11) {
        if (i10 >= 0) {
            return f1(null, i10, i11);
        }
        throw new IllegalArgumentException("Bad id: " + i10);
    }

    public boolean f0(boolean z10) {
        f4.a aVar;
        e0(z10);
        boolean z11 = false;
        if (!this.f15395i && (aVar = this.f15394h) != null) {
            aVar.f15271u = false;
            aVar.v();
            if (N0(3)) {
                Log.d("FragmentManager", "Reversing mTransitioningOp " + this.f15394h + " as part of execPendingActions for actions " + this.f15388a);
            }
            this.f15394h.w(false, false);
            this.f15388a.add(0, this.f15394h);
            ArrayList<t0.a> arrayList = this.f15394h.f15560c;
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                t0.a aVar2 = arrayList.get(i10);
                i10++;
                f4.q qVar = aVar2.b;
                if (qVar != null) {
                    qVar.f15486n = false;
                }
            }
            this.f15394h = null;
        }
        while (t0(this.O, this.P)) {
            z11 = true;
            this.b = true;
            try {
                k1(this.O, this.P);
                v();
            } catch (Throwable th2) {
                v();
                throw th2;
            }
        }
        A1();
        a0();
        this.f15389c.b();
        return z11;
    }

    public final boolean f1(String str, int i10, int i11) {
        f0(false);
        e0(true);
        f4.q qVar = this.A;
        if (qVar != null && i10 < 0 && str == null && qVar.u().d1()) {
            return true;
        }
        boolean zG1 = g1(this.O, this.P, str, i10, i11);
        if (zG1) {
            this.b = true;
            try {
                k1(this.O, this.P);
                v();
            } catch (Throwable th2) {
                v();
                throw th2;
            }
        }
        A1();
        a0();
        this.f15389c.b();
        return zG1;
    }

    public void g0(@NonNull p pVar, boolean z10) {
        if (z10 && (this.f15410x == null || this.M)) {
            return;
        }
        e0(z10);
        f4.a aVar = this.f15394h;
        boolean z11 = false;
        if (aVar != null) {
            aVar.f15271u = false;
            aVar.v();
            if (N0(3)) {
                Log.d("FragmentManager", "Reversing mTransitioningOp " + this.f15394h + " as part of execSingleAction for action " + pVar);
            }
            this.f15394h.w(false, false);
            boolean zA = this.f15394h.a(this.O, this.P);
            ArrayList<t0.a> arrayList = this.f15394h.f15560c;
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                t0.a aVar2 = arrayList.get(i10);
                i10++;
                f4.q qVar = aVar2.b;
                if (qVar != null) {
                    qVar.f15486n = false;
                }
            }
            this.f15394h = null;
            z11 = zA;
        }
        boolean zA2 = pVar.a(this.O, this.P);
        if (z11 || zA2) {
            this.b = true;
            try {
                k1(this.O, this.P);
                v();
            } catch (Throwable th2) {
                v();
                throw th2;
            }
        }
        A1();
        a0();
        this.f15389c.b();
    }

    public boolean g1(@NonNull ArrayList<f4.a> arrayList, @NonNull ArrayList<Boolean> arrayList2, String str, int i10, int i11) {
        int iL0 = l0(str, i10, (i11 & 1) != 0);
        if (iL0 < 0) {
            return false;
        }
        for (int size = this.f15390d.size() - 1; size >= iL0; size--) {
            arrayList.add(this.f15390d.remove(size));
            arrayList2.add(Boolean.TRUE);
        }
        return true;
    }

    public boolean h1(@NonNull ArrayList<f4.a> arrayList, @NonNull ArrayList<Boolean> arrayList2) {
        if (N0(2)) {
            Log.v("FragmentManager", "FragmentManager has the following pending actions inside of prepareBackStackState: " + this.f15388a);
        }
        int i10 = 0;
        if (this.f15390d.isEmpty()) {
            Log.i("FragmentManager", "Ignoring call to start back stack pop because the back stack is empty.");
            return false;
        }
        ArrayList<f4.a> arrayList3 = this.f15390d;
        f4.a aVar = arrayList3.get(arrayList3.size() - 1);
        this.f15394h = aVar;
        ArrayList<t0.a> arrayList4 = aVar.f15560c;
        int size = arrayList4.size();
        while (i10 < size) {
            t0.a aVar2 = arrayList4.get(i10);
            i10++;
            f4.q qVar = aVar2.b;
            if (qVar != null) {
                qVar.f15486n = true;
            }
        }
        return g1(arrayList, arrayList2, null, -1, 0);
    }

    public final void i0(@NonNull ArrayList<f4.a> arrayList, @NonNull ArrayList<Boolean> arrayList2, int i10, int i11) {
        boolean z10 = arrayList.get(i10).f15575r;
        ArrayList<f4.q> arrayList3 = this.Q;
        if (arrayList3 == null) {
            this.Q = new ArrayList<>();
        } else {
            arrayList3.clear();
        }
        this.Q.addAll(this.f15389c.o());
        f4.q qVarE0 = E0();
        boolean z11 = false;
        for (int i12 = i10; i12 < i11; i12++) {
            f4.a aVar = arrayList.get(i12);
            qVarE0 = !arrayList2.get(i12).booleanValue() ? aVar.B(this.Q, qVarE0) : aVar.E(this.Q, qVarE0);
            z11 = z11 || aVar.f15566i;
        }
        this.Q.clear();
        if (!z10 && this.f15409w >= 1) {
            for (int i13 = i10; i13 < i11; i13++) {
                ArrayList<t0.a> arrayList4 = arrayList.get(i13).f15560c;
                int size = arrayList4.size();
                int i14 = 0;
                while (i14 < size) {
                    t0.a aVar2 = arrayList4.get(i14);
                    i14++;
                    f4.q qVar = aVar2.b;
                    if (qVar != null && qVar.f15494v != null) {
                        this.f15389c.r(A(qVar));
                    }
                }
            }
        }
        h0(arrayList, arrayList2, i10, i11);
        boolean zBooleanValue = arrayList2.get(i11 - 1).booleanValue();
        if (z11 && !this.f15401o.isEmpty()) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            int size2 = arrayList.size();
            int i15 = 0;
            while (i15 < size2) {
                f4.a aVar3 = arrayList.get(i15);
                i15++;
                linkedHashSet.addAll(s0(aVar3));
            }
            if (this.f15394h == null) {
                ArrayList<o> arrayList5 = this.f15401o;
                int size3 = arrayList5.size();
                int i16 = 0;
                while (i16 < size3) {
                    o oVar = arrayList5.get(i16);
                    i16++;
                    o oVar2 = oVar;
                    Iterator it = linkedHashSet.iterator();
                    while (it.hasNext()) {
                        oVar2.a((f4.q) it.next(), zBooleanValue);
                    }
                }
                ArrayList<o> arrayList6 = this.f15401o;
                int size4 = arrayList6.size();
                int i17 = 0;
                while (i17 < size4) {
                    o oVar3 = arrayList6.get(i17);
                    i17++;
                    o oVar4 = oVar3;
                    Iterator it2 = linkedHashSet.iterator();
                    while (it2.hasNext()) {
                        oVar4.d((f4.q) it2.next(), zBooleanValue);
                    }
                }
            }
        }
        for (int i18 = i10; i18 < i11; i18++) {
            f4.a aVar4 = arrayList.get(i18);
            if (zBooleanValue) {
                for (int size5 = aVar4.f15560c.size() - 1; size5 >= 0; size5--) {
                    f4.q qVar2 = aVar4.f15560c.get(size5).b;
                    if (qVar2 != null) {
                        A(qVar2).m();
                    }
                }
            } else {
                ArrayList<t0.a> arrayList7 = aVar4.f15560c;
                int size6 = arrayList7.size();
                int i19 = 0;
                while (i19 < size6) {
                    t0.a aVar5 = arrayList7.get(i19);
                    i19++;
                    f4.q qVar3 = aVar5.b;
                    if (qVar3 != null) {
                        A(qVar3).m();
                    }
                }
            }
        }
        W0(this.f15409w, true);
        for (c1 c1Var : z(arrayList, i10, i11)) {
            c1Var.D(zBooleanValue);
            c1Var.z();
            c1Var.n();
        }
        while (i10 < i11) {
            f4.a aVar6 = arrayList.get(i10);
            if (arrayList2.get(i10).booleanValue() && aVar6.f15272v >= 0) {
                aVar6.f15272v = -1;
            }
            aVar6.D();
            i10++;
        }
        if (z11) {
            m1();
        }
    }

    public void i1() {
        d0(new r(), false);
    }

    public boolean j0() {
        boolean zF0 = f0(true);
        r0();
        return zF0;
    }

    public void j1(@NonNull f4.q qVar) {
        if (N0(2)) {
            Log.v("FragmentManager", "remove: " + qVar + " nesting=" + qVar.f15493u);
        }
        boolean zS0 = qVar.s0();
        if (qVar.D && zS0) {
            return;
        }
        this.f15389c.u(qVar);
        if (O0(qVar)) {
            this.J = true;
        }
        qVar.f15485m = true;
        w1(qVar);
    }

    public void k(f4.a aVar) {
        this.f15390d.add(aVar);
    }

    public f4.q k0(@NonNull String str) {
        return this.f15389c.f(str);
    }

    public final void k1(@NonNull ArrayList<f4.a> arrayList, @NonNull ArrayList<Boolean> arrayList2) {
        if (arrayList.isEmpty()) {
            return;
        }
        if (arrayList.size() != arrayList2.size()) {
            throw new IllegalStateException("Internal error with the back stack records");
        }
        int size = arrayList.size();
        int i10 = 0;
        int i11 = 0;
        while (i10 < size) {
            if (!arrayList.get(i10).f15575r) {
                if (i11 != i10) {
                    i0(arrayList, arrayList2, i11, i10);
                }
                i11 = i10 + 1;
                if (arrayList2.get(i10).booleanValue()) {
                    while (i11 < size && arrayList2.get(i11).booleanValue() && !arrayList.get(i11).f15575r) {
                        i11++;
                    }
                }
                i0(arrayList, arrayList2, i10, i11);
                i10 = i11 - 1;
            }
            i10++;
        }
        if (i11 != size) {
            i0(arrayList, arrayList2, i11, size);
        }
    }

    public r0 l(@NonNull f4.q qVar) {
        String str = qVar.T;
        if (str != null) {
            g4.c.f(qVar, str);
        }
        if (N0(2)) {
            Log.v("FragmentManager", "add: " + qVar);
        }
        r0 r0VarA = A(qVar);
        qVar.f15494v = this;
        this.f15389c.r(r0VarA);
        if (!qVar.D) {
            this.f15389c.a(qVar);
            qVar.f15485m = false;
            if (qVar.K == null) {
                qVar.Q = false;
            }
            if (O0(qVar)) {
                this.J = true;
            }
        }
        return r0VarA;
    }

    public final int l0(String str, int i10, boolean z10) {
        if (this.f15390d.isEmpty()) {
            return -1;
        }
        if (str == null && i10 < 0) {
            if (z10) {
                return 0;
            }
            return this.f15390d.size() - 1;
        }
        int size = this.f15390d.size() - 1;
        while (size >= 0) {
            f4.a aVar = this.f15390d.get(size);
            if ((str != null && str.equals(aVar.C())) || (i10 >= 0 && i10 == aVar.f15272v)) {
                break;
            }
            size--;
        }
        if (size < 0) {
            return size;
        }
        if (!z10) {
            if (size == this.f15390d.size() - 1) {
                return -1;
            }
            return size + 1;
        }
        while (size > 0) {
            f4.a aVar2 = this.f15390d.get(size - 1);
            if ((str == null || !str.equals(aVar2.C())) && (i10 < 0 || i10 != aVar2.f15272v)) {
                break;
            }
            size--;
        }
        return size;
    }

    public void l1(@NonNull f4.q qVar) {
        this.R.o(qVar);
    }

    public void m(@NonNull o0 o0Var) {
        this.f15403q.add(o0Var);
    }

    public f4.q m0(int i10) {
        return this.f15389c.g(i10);
    }

    public final void m1() {
        for (int i10 = 0; i10 < this.f15401o.size(); i10++) {
            this.f15401o.get(i10).onBackStackChanged();
        }
    }

    public void n(@NonNull f4.q qVar) {
        this.R.e(qVar);
    }

    public f4.q n0(String str) {
        return this.f15389c.h(str);
    }

    public void n1(Parcelable parcelable) {
        r0 r0Var;
        Bundle bundle;
        Bundle bundle2;
        if (parcelable == null) {
            return;
        }
        Bundle bundle3 = (Bundle) parcelable;
        for (String str : bundle3.keySet()) {
            if (str.startsWith("result_") && (bundle2 = bundle3.getBundle(str)) != null) {
                bundle2.setClassLoader(this.f15410x.getContext().getClassLoader());
                this.f15399m.put(str.substring(7), bundle2);
            }
        }
        HashMap<String, Bundle> map = new HashMap<>();
        for (String str2 : bundle3.keySet()) {
            if (str2.startsWith("fragment_") && (bundle = bundle3.getBundle(str2)) != null) {
                bundle.setClassLoader(this.f15410x.getContext().getClassLoader());
                map.put(str2.substring(9), bundle);
            }
        }
        this.f15389c.x(map);
        m0 m0Var = (m0) bundle3.getParcelable("state");
        if (m0Var == null) {
            return;
        }
        this.f15389c.v();
        ArrayList<String> arrayList = m0Var.f15432a;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            String str3 = arrayList.get(i10);
            i10++;
            Bundle bundleB = this.f15389c.B(str3, null);
            if (bundleB != null) {
                f4.q qVarI = this.R.i(((q0) bundleB.getParcelable("state")).b);
                if (qVarI != null) {
                    if (N0(2)) {
                        Log.v("FragmentManager", "restoreSaveState: re-attaching retained " + qVarI);
                    }
                    r0Var = new r0(this.f15402p, this.f15389c, qVarI, bundleB);
                } else {
                    r0Var = new r0(this.f15402p, this.f15389c, this.f15410x.getContext().getClassLoader(), y0(), bundleB);
                }
                f4.q qVarK = r0Var.k();
                qVarK.b = bundleB;
                qVarK.f15494v = this;
                if (N0(2)) {
                    Log.v("FragmentManager", "restoreSaveState: active (" + qVarK.f15478f + "): " + qVarK);
                }
                r0Var.o(this.f15410x.getContext().getClassLoader());
                this.f15389c.r(r0Var);
                r0Var.s(this.f15409w);
            }
        }
        for (f4.q qVar : this.R.l()) {
            if (!this.f15389c.c(qVar.f15478f)) {
                if (N0(2)) {
                    Log.v("FragmentManager", "Discarding retained Fragment " + qVar + " that was not found in the set of active Fragments " + m0Var.f15432a);
                }
                this.R.o(qVar);
                qVar.f15494v = this;
                r0 r0Var2 = new r0(this.f15402p, this.f15389c, qVar);
                r0Var2.s(1);
                r0Var2.m();
                qVar.f15485m = true;
                r0Var2.m();
            }
        }
        this.f15389c.w(m0Var.b);
        if (m0Var.f15433c != null) {
            this.f15390d = new ArrayList<>(m0Var.f15433c.length);
            int i11 = 0;
            while (true) {
                f4.b[] bVarArr = m0Var.f15433c;
                if (i11 >= bVarArr.length) {
                    break;
                }
                f4.a aVarF = bVarArr[i11].f(this);
                if (N0(2)) {
                    Log.v("FragmentManager", "restoreAllState: back stack #" + i11 + " (index " + aVarF.f15272v + "): " + aVarF);
                    PrintWriter printWriter = new PrintWriter(new z0("FragmentManager"));
                    aVarF.y("  ", printWriter, false);
                    printWriter.close();
                }
                this.f15390d.add(aVarF);
                i11++;
            }
        } else {
            this.f15390d = new ArrayList<>();
        }
        this.f15397k.set(m0Var.f15434d);
        String str4 = m0Var.f15435e;
        if (str4 != null) {
            f4.q qVarK0 = k0(str4);
            this.A = qVarK0;
            Q(qVarK0);
        }
        ArrayList<String> arrayList2 = m0Var.f15436f;
        if (arrayList2 != null) {
            for (int i12 = 0; i12 < arrayList2.size(); i12++) {
                this.f15398l.put(arrayList2.get(i12), m0Var.f15437g.get(i12));
            }
        }
        this.I = new ArrayDeque<>(m0Var.f15438h);
    }

    public int o() {
        return this.f15397k.getAndIncrement();
    }

    public f4.q o0(@NonNull String str) {
        return this.f15389c.i(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void p(@NonNull a0<?> a0Var, @NonNull x xVar, f4.q qVar) {
        String str;
        if (this.f15410x != null) {
            throw new IllegalStateException("Already attached");
        }
        this.f15410x = a0Var;
        this.f15411y = xVar;
        this.f15412z = qVar;
        if (qVar != null) {
            m(new h(qVar));
        } else if (a0Var instanceof o0) {
            m((o0) a0Var);
        }
        if (this.f15412z != null) {
            A1();
        }
        if (a0Var instanceof e.r0) {
            e.r0 r0Var = (e.r0) a0Var;
            e.p0 p0VarP = r0Var.P();
            this.f15393g = p0VarP;
            androidx.p000lifecycle.s sVar = r0Var;
            if (qVar != null) {
                sVar = qVar;
            }
            p0VarP.d(sVar, this.f15396j);
        }
        if (qVar != null) {
            this.R = qVar.f15494v.v0(qVar);
        } else if (a0Var instanceof androidx.p000lifecycle.c1) {
            this.R = n0.k(((androidx.p000lifecycle.c1) a0Var).w());
        } else {
            this.R = new n0(false);
        }
        this.R.p(U0());
        this.f15389c.A(this.R);
        Object obj = this.f15410x;
        if ((obj instanceof e5.i) && qVar == null) {
            e5.f fVarA = ((e5.i) obj).A();
            fVarA.c("android:support:fragments", new e5.f.b() { // from class: f4.i0
                @Override // e5.f.b
                public final Bundle a() {
                    return this.f15382a.p1();
                }
            });
            Bundle bundleA = fVarA.a("android:support:fragments");
            if (bundleA != null) {
                n1(bundleA);
            }
        }
        Object obj2 = this.f15410x;
        if (obj2 instanceof g.h) {
            g.g gVarQ = ((g.h) obj2).getActivityResultRegistry();
            if (qVar != null) {
                str = qVar.f15478f + ":";
            } else {
                str = BuildConfig.FLAVOR;
            }
            String str2 = "FragmentManager:" + str;
            this.F = gVarQ.o(str2 + "StartActivityForResult", new h.i(), new i());
            this.G = gVarQ.o(str2 + "StartIntentSenderForResult", new k(), new j());
            this.H = gVarQ.o(str2 + "RequestPermissions", new h.g(), new a());
        }
        Object obj3 = this.f15410x;
        if (obj3 instanceof l2.e) {
            ((l2.e) obj3).f0(this.f15404r);
        }
        Object obj4 = this.f15410x;
        if (obj4 instanceof l2.f) {
            ((l2.f) obj4).c0(this.f15405s);
        }
        Object obj5 = this.f15410x;
        if (obj5 instanceof k2.o) {
            ((k2.o) obj5).d0(this.f15406t);
        }
        Object obj6 = this.f15410x;
        if (obj6 instanceof k2.p) {
            ((k2.p) obj6).z(this.f15407u);
        }
        Object obj7 = this.f15410x;
        if ((obj7 instanceof androidx.core.view.o) && qVar == null) {
            ((androidx.core.view.o) obj7).l0(this.f15408v);
        }
    }

    @NonNull
    public Bundle p1() {
        f4.b[] bVarArr;
        Bundle bundle = new Bundle();
        r0();
        c0();
        f0(true);
        this.K = true;
        this.R.p(true);
        ArrayList<String> arrayListY = this.f15389c.y();
        HashMap<String, Bundle> mapM = this.f15389c.m();
        if (!mapM.isEmpty()) {
            ArrayList<String> arrayListZ = this.f15389c.z();
            int size = this.f15390d.size();
            if (size > 0) {
                bVarArr = new f4.b[size];
                for (int i10 = 0; i10 < size; i10++) {
                    bVarArr[i10] = new f4.b(this.f15390d.get(i10));
                    if (N0(2)) {
                        Log.v("FragmentManager", "saveAllState: adding back stack #" + i10 + ": " + this.f15390d.get(i10));
                    }
                }
            } else {
                bVarArr = null;
            }
            m0 m0Var = new m0();
            m0Var.f15432a = arrayListY;
            m0Var.b = arrayListZ;
            m0Var.f15433c = bVarArr;
            m0Var.f15434d = this.f15397k.get();
            f4.q qVar = this.A;
            if (qVar != null) {
                m0Var.f15435e = qVar.f15478f;
            }
            m0Var.f15436f.addAll(this.f15398l.keySet());
            m0Var.f15437g.addAll(this.f15398l.values());
            m0Var.f15438h = new ArrayList<>(this.I);
            bundle.putParcelable("state", m0Var);
            for (String str : this.f15399m.keySet()) {
                bundle.putBundle("result_" + str, this.f15399m.get(str));
            }
            for (String str2 : mapM.keySet()) {
                bundle.putBundle("fragment_" + str2, mapM.get(str2));
            }
        } else if (N0(2)) {
            Log.v("FragmentManager", "saveAllState: no fragments!");
            return bundle;
        }
        return bundle;
    }

    public void q(@NonNull f4.q qVar) {
        if (N0(2)) {
            Log.v("FragmentManager", "attach: " + qVar);
        }
        if (qVar.D) {
            qVar.D = false;
            if (qVar.f15484l) {
                return;
            }
            this.f15389c.a(qVar);
            if (N0(2)) {
                Log.v("FragmentManager", "add from attach: " + qVar);
            }
            if (O0(qVar)) {
                this.J = true;
            }
        }
    }

    public void q1() {
        synchronized (this.f15388a) {
            try {
                if (this.f15388a.size() == 1) {
                    this.f15410x.getHandler().removeCallbacks(this.T);
                    this.f15410x.getHandler().post(this.T);
                    A1();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @NonNull
    public t0 r() {
        return new f4.a(this);
    }

    public final void r0() {
        Iterator<c1> it = y().iterator();
        while (it.hasNext()) {
            it.next().r();
        }
    }

    public void r1(@NonNull f4.q qVar, boolean z10) {
        ViewGroup viewGroupX0 = x0(qVar);
        if (viewGroupX0 == null || !(viewGroupX0 instanceof FragmentContainerView)) {
            return;
        }
        ((FragmentContainerView) viewGroupX0).setDrawDisappearingViewsLast(!z10);
    }

    public void s() {
        if (N0(3)) {
            Log.d("FragmentManager", "cancelBackStackTransition for transition " + this.f15394h);
        }
        f4.a aVar = this.f15394h;
        if (aVar != null) {
            aVar.f15271u = false;
            aVar.v();
            this.f15394h.p(true, new Runnable() { // from class: f4.j0
                @Override // java.lang.Runnable
                public final void run() {
                    k0.c(this.f15385a);
                }
            });
            this.f15394h.g();
            this.f15395i = true;
            j0();
            this.f15395i = false;
            this.f15394h = null;
        }
    }

    public Set<f4.q> s0(@NonNull f4.a aVar) {
        HashSet hashSet = new HashSet();
        for (int i10 = 0; i10 < aVar.f15560c.size(); i10++) {
            f4.q qVar = aVar.f15560c.get(i10).b;
            if (qVar != null && aVar.f15566i) {
                hashSet.add(qVar);
            }
        }
        return hashSet;
    }

    public final void s1(@NonNull String str, @NonNull Bundle bundle) {
        n nVar = this.f15400n.get(str);
        if (nVar == null || !nVar.b(androidx.lifecycle.l.b.STARTED)) {
            this.f15399m.put(str, bundle);
        } else {
            nVar.a(str, bundle);
        }
        if (N0(2)) {
            Log.v("FragmentManager", "Setting fragment result with key " + str + " and result " + bundle);
        }
    }

    public boolean t() {
        boolean zO0 = false;
        for (f4.q qVar : this.f15389c.l()) {
            if (qVar != null) {
                zO0 = O0(qVar);
            }
            if (zO0) {
                return true;
            }
        }
        return false;
    }

    public final boolean t0(@NonNull ArrayList<f4.a> arrayList, @NonNull ArrayList<Boolean> arrayList2) {
        synchronized (this.f15388a) {
            if (this.f15388a.isEmpty()) {
                return false;
            }
            try {
                int size = this.f15388a.size();
                boolean zA = false;
                for (int i10 = 0; i10 < size; i10++) {
                    zA |= this.f15388a.get(i10).a(arrayList, arrayList2);
                }
                this.f15388a.clear();
                this.f15410x.getHandler().removeCallbacks(this.T);
                return zA;
            } catch (Throwable th2) {
                this.f15388a.clear();
                this.f15410x.getHandler().removeCallbacks(this.T);
                throw th2;
            }
        }
    }

    public final void t1(@NonNull String str, @NonNull androidx.p000lifecycle.s sVar, @NonNull p0 p0Var) {
        androidx.p000lifecycle.l lVarA = sVar.a();
        if (lVarA.getState() == androidx.lifecycle.l.b.DESTROYED) {
            return;
        }
        g gVar = new g(str, p0Var, lVarA);
        n nVarPut = this.f15400n.put(str, new n(lVarA, p0Var, gVar));
        if (nVarPut != null) {
            nVarPut.c();
        }
        if (N0(2)) {
            Log.v("FragmentManager", "Setting FragmentResultListener with key " + str + " lifecycleOwner " + lVarA + " and listener " + p0Var);
        }
        lVarA.a(gVar);
    }

    @NonNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder(Barcode.FORMAT_ITF);
        sb2.append("FragmentManager{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append(" in ");
        f4.q qVar = this.f15412z;
        if (qVar != null) {
            sb2.append(qVar.getClass().getSimpleName());
            sb2.append("{");
            sb2.append(Integer.toHexString(System.identityHashCode(this.f15412z)));
            sb2.append("}");
        } else {
            a0<?> a0Var = this.f15410x;
            if (a0Var != null) {
                sb2.append(a0Var.getClass().getSimpleName());
                sb2.append("{");
                sb2.append(Integer.toHexString(System.identityHashCode(this.f15410x)));
                sb2.append("}");
            } else {
                sb2.append("null");
            }
        }
        sb2.append("}}");
        return sb2.toString();
    }

    public final void u() {
        if (U0()) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
    }

    public int u0() {
        return this.f15390d.size() + (this.f15394h != null ? 1 : 0);
    }

    public void u1(@NonNull f4.q qVar, @NonNull androidx.lifecycle.l.b bVar) {
        if (qVar.equals(k0(qVar.f15478f)) && (qVar.f15495w == null || qVar.f15494v == this)) {
            qVar.U = bVar;
            return;
        }
        throw new IllegalArgumentException("Fragment " + qVar + " is not an active fragment of FragmentManager " + this);
    }

    public final void v() {
        this.b = false;
        this.P.clear();
        this.O.clear();
    }

    @NonNull
    public final n0 v0(@NonNull f4.q qVar) {
        return this.R.j(qVar);
    }

    public void v1(f4.q qVar) {
        if (qVar == null || (qVar.equals(k0(qVar.f15478f)) && (qVar.f15495w == null || qVar.f15494v == this))) {
            f4.q qVar2 = this.A;
            this.A = qVar;
            Q(qVar2);
            Q(this.A);
            return;
        }
        throw new IllegalArgumentException("Fragment " + qVar + " is not an active fragment of FragmentManager " + this);
    }

    public final void w() {
        boolean zN;
        a0<?> a0Var = this.f15410x;
        if (a0Var instanceof androidx.p000lifecycle.c1) {
            zN = this.f15389c.p().n();
        } else {
            zN = a0Var.getContext() instanceof Activity ? !((Activity) this.f15410x.getContext()).isChangingConfigurations() : true;
        }
        if (zN) {
            Iterator<f4.c> it = this.f15398l.values().iterator();
            while (it.hasNext()) {
                Iterator<String> it2 = it.next().f15293a.iterator();
                while (it2.hasNext()) {
                    this.f15389c.p().g(it2.next(), false);
                }
            }
        }
    }

    @NonNull
    public x w0() {
        return this.f15411y;
    }

    public final void w1(@NonNull f4.q qVar) {
        ViewGroup viewGroupX0 = x0(qVar);
        if (viewGroupX0 == null || qVar.x() + qVar.B() + qVar.N() + qVar.O() <= 0) {
            return;
        }
        if (viewGroupX0.getTag(e4.b.f13178c) == null) {
            viewGroupX0.setTag(e4.b.f13178c, qVar);
        }
        ((f4.q) viewGroupX0.getTag(e4.b.f13178c)).T1(qVar.M());
    }

    public final void x(@NonNull String str) {
        this.f15399m.remove(str);
        if (N0(2)) {
            Log.v("FragmentManager", "Clearing fragment result with key " + str);
        }
    }

    public final ViewGroup x0(@NonNull f4.q qVar) {
        ViewGroup viewGroup = qVar.J;
        if (viewGroup != null) {
            return viewGroup;
        }
        if (qVar.A > 0 && this.f15411y.e()) {
            View viewD = this.f15411y.d(qVar.A);
            if (viewD instanceof ViewGroup) {
                return (ViewGroup) viewD;
            }
        }
        return null;
    }

    public void x1(@NonNull f4.q qVar) {
        if (N0(2)) {
            Log.v("FragmentManager", "show: " + qVar);
        }
        if (qVar.C) {
            qVar.C = false;
            qVar.Q = !qVar.Q;
        }
    }

    public final Set<c1> y() {
        HashSet hashSet = new HashSet();
        Iterator<r0> it = this.f15389c.k().iterator();
        while (it.hasNext()) {
            ViewGroup viewGroup = it.next().k().J;
            if (viewGroup != null) {
                hashSet.add(c1.v(viewGroup, F0()));
            }
        }
        return hashSet;
    }

    @NonNull
    public z y0() {
        z zVar = this.B;
        if (zVar != null) {
            return zVar;
        }
        f4.q qVar = this.f15412z;
        return qVar != null ? qVar.f15494v.y0() : this.C;
    }

    public final void y1() {
        Iterator<r0> it = this.f15389c.k().iterator();
        while (it.hasNext()) {
            Z0(it.next());
        }
    }

    public Set<c1> z(@NonNull ArrayList<f4.a> arrayList, int i10, int i11) {
        ViewGroup viewGroup;
        HashSet hashSet = new HashSet();
        while (i10 < i11) {
            ArrayList<t0.a> arrayList2 = arrayList.get(i10).f15560c;
            int size = arrayList2.size();
            int i12 = 0;
            while (i12 < size) {
                t0.a aVar = arrayList2.get(i12);
                i12++;
                f4.q qVar = aVar.b;
                if (qVar != null && (viewGroup = qVar.J) != null) {
                    hashSet.add(c1.u(viewGroup, this));
                }
            }
            i10++;
        }
        return hashSet;
    }

    @NonNull
    public List<f4.q> z0() {
        return this.f15389c.o();
    }

    public final void z1(RuntimeException runtimeException) {
        Log.e("FragmentManager", runtimeException.getMessage());
        Log.e("FragmentManager", "Activity state:");
        PrintWriter printWriter = new PrintWriter(new z0("FragmentManager"));
        a0<?> a0Var = this.f15410x;
        if (a0Var != null) {
            try {
                a0Var.k("  ", null, printWriter, new String[0]);
                throw runtimeException;
            } catch (Exception e10) {
                Log.e("FragmentManager", "Failed dumping state", e10);
                throw runtimeException;
            }
        }
        try {
            b0("  ", null, printWriter, new String[0]);
            throw runtimeException;
        } catch (Exception e11) {
            Log.e("FragmentManager", "Failed dumping state", e11);
            throw runtimeException;
        }
    }

    @SuppressLint({"BanParcelableUsage"})
    public static class m implements Parcelable {
        public static final Parcelable.Creator<m> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f15423a;
        public int b;

        public class a implements Parcelable.Creator<m> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public m createFromParcel(Parcel parcel) {
                return new m(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public m[] newArray(int i10) {
                return new m[i10];
            }
        }

        public m(@NonNull String str, int i10) {
            this.f15423a = str;
            this.b = i10;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            parcel.writeString(this.f15423a);
            parcel.writeInt(this.b);
        }

        public m(@NonNull Parcel parcel) {
            this.f15423a = parcel.readString();
            this.b = parcel.readInt();
        }
    }
}
