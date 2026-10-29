package androidx.fragment.app;

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
import androidx.activity.result.ActivityResult;
import androidx.activity.result.IntentSenderRequest;
import androidx.annotation.NonNull;
import androidx.fragment.app.FragmentManager;
import androidx.p000lifecycle.b1;
import androidx.p000lifecycle.c1;
import e.BackEventCompat;
import e.m0;
import e.p0;
import e.r0;
import e4.d0;
import e4.e0;
import e4.f0;
import e4.g0;
import e4.r;
import e4.t;
import e4.v;
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
import k2.s;

/* JADX INFO: loaded from: classes.dex */
public abstract class FragmentManager {
    public static boolean U = false;
    public static boolean V = true;
    public androidx.fragment.app.c A;
    public g.c<Intent> F;
    public g.c<IntentSenderRequest> G;
    public g.c<String[]> H;
    public boolean J;
    public boolean K;
    public boolean L;
    public boolean M;
    public boolean N;
    public ArrayList<androidx.fragment.app.a> O;
    public ArrayList<Boolean> P;
    public ArrayList<androidx.fragment.app.c> Q;
    public d0 R;
    public f4.c.C0306c S;
    public boolean b;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ArrayList<androidx.fragment.app.c> f2487e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public p0 f2489g;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public t<?> f2506x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public r f2507y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public androidx.fragment.app.c f2508z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList<o> f2484a = new ArrayList<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g0 f2485c = new g0();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ArrayList<androidx.fragment.app.a> f2486d = new ArrayList<>();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final v f2488f = new v(this);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public androidx.fragment.app.a f2490h = null;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f2491i = false;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final m0 f2492j = new b(false);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final AtomicInteger f2493k = new AtomicInteger();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Map<String, BackStackState> f2494l = Collections.synchronizedMap(new HashMap());

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Map<String, Bundle> f2495m = Collections.synchronizedMap(new HashMap());

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Map<String, m> f2496n = Collections.synchronizedMap(new HashMap());

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public ArrayList<n> f2497o = new ArrayList<>();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final androidx.fragment.app.f f2498p = new androidx.fragment.app.f(this);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final CopyOnWriteArrayList<e0> f2499q = new CopyOnWriteArrayList<>();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final x2.a<Configuration> f2500r = new x2.a() { // from class: e4.w
        @Override // x2.a
        public final void accept(Object obj) {
            FragmentManager.f(this.f15164a, (Configuration) obj);
        }
    };

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final x2.a<Integer> f2501s = new x2.a() { // from class: e4.x
        @Override // x2.a
        public final void accept(Object obj) {
            FragmentManager.a(this.f15165a, (Integer) obj);
        }
    };

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final x2.a<k2.h> f2502t = new x2.a() { // from class: e4.y
        @Override // x2.a
        public final void accept(Object obj) {
            FragmentManager.e(this.f15166a, (k2.h) obj);
        }
    };

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final x2.a<s> f2503u = new x2.a() { // from class: e4.z
        @Override // x2.a
        public final void accept(Object obj) {
            FragmentManager.d(this.f15167a, (k2.s) obj);
        }
    };

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final androidx.core.view.r f2504v = new c();

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f2505w = -1;
    public androidx.fragment.app.e B = null;
    public androidx.fragment.app.e C = new d();
    public e4.p0 D = null;
    public e4.p0 E = new e();
    public ArrayDeque<LaunchedFragmentInfo> I = new ArrayDeque<>();
    public Runnable T = new f();

    public class a implements g.a<Map<String, Boolean>> {
        public a() {
        }

        @Override // g.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(Map<String, Boolean> map) {
            String[] strArr = (String[]) map.keySet().toArray(new String[0]);
            ArrayList arrayList = new ArrayList(map.values());
            int[] iArr = new int[arrayList.size()];
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                iArr[i10] = ((Boolean) arrayList.get(i10)).booleanValue() ? 0 : -1;
            }
            LaunchedFragmentInfo launchedFragmentInfoPollFirst = FragmentManager.this.I.pollFirst();
            if (launchedFragmentInfoPollFirst == null) {
                Log.w("FragmentManager", "No permissions were requested for " + this);
                return;
            }
            String str = launchedFragmentInfoPollFirst.f2509a;
            int i11 = launchedFragmentInfoPollFirst.b;
            androidx.fragment.app.c cVarI = FragmentManager.this.f2485c.i(str);
            if (cVarI != null) {
                cVarI.Z0(i11, strArr, iArr);
                return;
            }
            Log.w("FragmentManager", "Permission request result delivered for unknown Fragment " + str);
        }
    }

    public class b extends m0 {
        public b(boolean z10) {
            super(z10);
        }

        @Override // e.m0
        public void handleOnBackCancelled() {
            if (FragmentManager.N0(3)) {
                Log.d("FragmentManager", "handleOnBackCancelled. PREDICTIVE_BACK = " + FragmentManager.V + " fragment manager " + FragmentManager.this);
            }
            if (FragmentManager.V) {
                FragmentManager.this.s();
            }
        }

        @Override // e.m0
        public void handleOnBackPressed() {
            if (FragmentManager.N0(3)) {
                Log.d("FragmentManager", "handleOnBackPressed. PREDICTIVE_BACK = " + FragmentManager.V + " fragment manager " + FragmentManager.this);
            }
            FragmentManager.this.J0();
        }

        @Override // e.m0
        public void handleOnBackProgressed(@NonNull BackEventCompat backEventCompat) {
            if (FragmentManager.N0(2)) {
                Log.v("FragmentManager", "handleOnBackProgressed. PREDICTIVE_BACK = " + FragmentManager.V + " fragment manager " + FragmentManager.this);
            }
            FragmentManager fragmentManager = FragmentManager.this;
            if (fragmentManager.f2490h != null) {
                int i10 = 0;
                Iterator<androidx.fragment.app.i> it = fragmentManager.z(new ArrayList<>(Collections.singletonList(FragmentManager.this.f2490h)), 0, 1).iterator();
                while (it.hasNext()) {
                    it.next().A(backEventCompat);
                }
                ArrayList<n> arrayList = FragmentManager.this.f2497o;
                int size = arrayList.size();
                while (i10 < size) {
                    n nVar = arrayList.get(i10);
                    i10++;
                    nVar.b(backEventCompat);
                }
            }
        }

        @Override // e.m0
        public void handleOnBackStarted(@NonNull BackEventCompat backEventCompat) {
            if (FragmentManager.N0(3)) {
                Log.d("FragmentManager", "handleOnBackStarted. PREDICTIVE_BACK = " + FragmentManager.V + " fragment manager " + FragmentManager.this);
            }
            if (FragmentManager.V) {
                FragmentManager.this.c0();
                FragmentManager.this.i1();
            }
        }
    }

    public class c implements androidx.core.view.r {
        public c() {
        }

        @Override // androidx.core.view.r
        public void a(@NonNull Menu menu) {
            FragmentManager.this.P(menu);
        }

        @Override // androidx.core.view.r
        public void b(@NonNull Menu menu) {
            FragmentManager.this.T(menu);
        }

        @Override // androidx.core.view.r
        public boolean c(@NonNull MenuItem menuItem) {
            return FragmentManager.this.O(menuItem);
        }

        @Override // androidx.core.view.r
        public void d(@NonNull Menu menu, @NonNull MenuInflater menuInflater) {
            FragmentManager.this.H(menu, menuInflater);
        }
    }

    public class d extends androidx.fragment.app.e {
        public d() {
        }

        @Override // androidx.fragment.app.e
        @NonNull
        public androidx.fragment.app.c a(@NonNull ClassLoader classLoader, @NonNull String str) {
            return FragmentManager.this.A0().c(FragmentManager.this.A0().getContext(), str, null);
        }
    }

    public class e implements e4.p0 {
        public e() {
        }

        @Override // e4.p0
        @NonNull
        public androidx.fragment.app.i a(@NonNull ViewGroup viewGroup) {
            return new androidx.fragment.app.b(viewGroup);
        }
    }

    public class f implements Runnable {
        public f() {
        }

        @Override // java.lang.Runnable
        public void run() {
            FragmentManager.this.f0(true);
        }
    }

    public class g implements androidx.p000lifecycle.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f2514a;
        public final /* synthetic */ f0 b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ androidx.p000lifecycle.l f2515c;

        public g(String str, f0 f0Var, androidx.p000lifecycle.l lVar) {
            this.f2514a = str;
            this.b = f0Var;
            this.f2515c = lVar;
        }

        @Override // androidx.p000lifecycle.p
        public void g(@NonNull androidx.p000lifecycle.s sVar, @NonNull androidx.lifecycle.l.a aVar) {
            Bundle bundle;
            if (aVar == androidx.lifecycle.l.a.ON_START && (bundle = (Bundle) FragmentManager.this.f2495m.get(this.f2514a)) != null) {
                this.b.a(this.f2514a, bundle);
                FragmentManager.this.x(this.f2514a);
            }
            if (aVar == androidx.lifecycle.l.a.ON_DESTROY) {
                this.f2515c.d(this);
                FragmentManager.this.f2496n.remove(this.f2514a);
            }
        }
    }

    public class h implements e0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ androidx.fragment.app.c f2517a;

        public h(androidx.fragment.app.c cVar) {
            this.f2517a = cVar;
        }

        @Override // e4.e0
        public void b(@NonNull FragmentManager fragmentManager, @NonNull androidx.fragment.app.c cVar) {
            this.f2517a.D0(cVar);
        }
    }

    public class i implements g.a<ActivityResult> {
        public i() {
        }

        @Override // g.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(ActivityResult activityResult) {
            LaunchedFragmentInfo launchedFragmentInfoPollLast = FragmentManager.this.I.pollLast();
            if (launchedFragmentInfoPollLast == null) {
                Log.w("FragmentManager", "No Activities were started for result for " + this);
                return;
            }
            String str = launchedFragmentInfoPollLast.f2509a;
            int i10 = launchedFragmentInfoPollLast.b;
            androidx.fragment.app.c cVarI = FragmentManager.this.f2485c.i(str);
            if (cVarI != null) {
                cVarI.A0(i10, activityResult.getResultCode(), activityResult.getData());
                return;
            }
            Log.w("FragmentManager", "Activity result delivered for unknown Fragment " + str);
        }
    }

    public class j implements g.a<ActivityResult> {
        public j() {
        }

        @Override // g.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(ActivityResult activityResult) {
            LaunchedFragmentInfo launchedFragmentInfoPollFirst = FragmentManager.this.I.pollFirst();
            if (launchedFragmentInfoPollFirst == null) {
                Log.w("FragmentManager", "No IntentSenders were started for " + this);
                return;
            }
            String str = launchedFragmentInfoPollFirst.f2509a;
            int i10 = launchedFragmentInfoPollFirst.b;
            androidx.fragment.app.c cVarI = FragmentManager.this.f2485c.i(str);
            if (cVarI != null) {
                cVarI.A0(i10, activityResult.getResultCode(), activityResult.getData());
                return;
            }
            Log.w("FragmentManager", "Intent Sender result delivered for unknown Fragment " + str);
        }
    }

    public static class k extends h.a<IntentSenderRequest, ActivityResult> {
        @Override // h.a
        @NonNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Intent createIntent(@NonNull Context context, IntentSenderRequest intentSenderRequest) {
            Bundle bundleExtra;
            Intent intent = new Intent("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST");
            Intent fillInIntent = intentSenderRequest.getFillInIntent();
            if (fillInIntent != null && (bundleExtra = fillInIntent.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) != null) {
                intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundleExtra);
                fillInIntent.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                if (fillInIntent.getBooleanExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", false)) {
                    intentSenderRequest = new IntentSenderRequest.a(intentSenderRequest.getIntentSender()).b(null).c(intentSenderRequest.getFlagsValues(), intentSenderRequest.getFlagsMask()).a();
                }
            }
            intent.putExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST", intentSenderRequest);
            if (FragmentManager.N0(2)) {
                Log.v("FragmentManager", "CreateIntent created the following intent: " + intent);
            }
            return intent;
        }

        @Override // h.a
        @NonNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public ActivityResult parseResult(int i10, Intent intent) {
            return new ActivityResult(i10, intent);
        }
    }

    public static abstract class l {
    }

    public static class m implements f0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final androidx.p000lifecycle.l f2520a;
        public final f0 b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final androidx.p000lifecycle.p f2521c;

        public m(@NonNull androidx.p000lifecycle.l lVar, @NonNull f0 f0Var, @NonNull androidx.p000lifecycle.p pVar) {
            this.f2520a = lVar;
            this.b = f0Var;
            this.f2521c = pVar;
        }

        @Override // e4.f0
        public void a(@NonNull String str, @NonNull Bundle bundle) {
            this.b.a(str, bundle);
        }

        public boolean b(androidx.lifecycle.l.b bVar) {
            return this.f2520a.getState().b(bVar);
        }

        public void c() {
            this.f2520a.d(this.f2521c);
        }
    }

    public interface n {
        default void a(@NonNull androidx.fragment.app.c cVar, boolean z10) {
        }

        default void b(@NonNull BackEventCompat backEventCompat) {
        }

        default void c(@NonNull androidx.fragment.app.c cVar, boolean z10) {
        }

        default void d() {
        }

        void onBackStackChanged();
    }

    public interface o {
        boolean a(@NonNull ArrayList<androidx.fragment.app.a> arrayList, @NonNull ArrayList<Boolean> arrayList2);
    }

    public class p implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f2522a;
        public final int b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f2523c;

        public p(String str, int i10, int i11) {
            this.f2522a = str;
            this.b = i10;
            this.f2523c = i11;
        }

        @Override // androidx.fragment.app.FragmentManager.o
        public boolean a(@NonNull ArrayList<androidx.fragment.app.a> arrayList, @NonNull ArrayList<Boolean> arrayList2) {
            androidx.fragment.app.c cVar = FragmentManager.this.A;
            if (cVar == null || this.b >= 0 || this.f2522a != null || !cVar.v().d1()) {
                return FragmentManager.this.g1(arrayList, arrayList2, this.f2522a, this.b, this.f2523c);
            }
            return false;
        }
    }

    public class q implements o {
        public q() {
        }

        @Override // androidx.fragment.app.FragmentManager.o
        public boolean a(@NonNull ArrayList<androidx.fragment.app.a> arrayList, @NonNull ArrayList<Boolean> arrayList2) {
            boolean zH1 = FragmentManager.this.h1(arrayList, arrayList2);
            if (!FragmentManager.this.f2497o.isEmpty() && arrayList.size() > 0) {
                boolean zBooleanValue = arrayList2.get(arrayList.size() - 1).booleanValue();
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                int size = arrayList.size();
                int i10 = 0;
                int i11 = 0;
                while (i11 < size) {
                    androidx.fragment.app.a aVar = arrayList.get(i11);
                    i11++;
                    linkedHashSet.addAll(FragmentManager.this.s0(aVar));
                }
                ArrayList<n> arrayList3 = FragmentManager.this.f2497o;
                int size2 = arrayList3.size();
                while (i10 < size2) {
                    n nVar = arrayList3.get(i10);
                    i10++;
                    n nVar2 = nVar;
                    Iterator it = linkedHashSet.iterator();
                    while (it.hasNext()) {
                        nVar2.c((androidx.fragment.app.c) it.next(), zBooleanValue);
                    }
                }
            }
            return zH1;
        }
    }

    public static androidx.fragment.app.c H0(@NonNull View view) {
        Object tag = view.getTag(d4.b.f14428a);
        if (tag instanceof androidx.fragment.app.c) {
            return (androidx.fragment.app.c) tag;
        }
        return null;
    }

    public static boolean N0(int i10) {
        return U || Log.isLoggable("FragmentManager", i10);
    }

    public static /* synthetic */ void a(FragmentManager fragmentManager, Integer num) {
        if (fragmentManager.P0() && num.intValue() == 80) {
            fragmentManager.K(false);
        }
    }

    public static /* synthetic */ void c(FragmentManager fragmentManager) {
        ArrayList<n> arrayList = fragmentManager.f2497o;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            n nVar = arrayList.get(i10);
            i10++;
            nVar.d();
        }
    }

    public static /* synthetic */ void d(FragmentManager fragmentManager, s sVar) {
        if (fragmentManager.P0()) {
            fragmentManager.S(sVar.getIsInPictureInPictureMode(), false);
        }
    }

    public static /* synthetic */ void e(FragmentManager fragmentManager, k2.h hVar) {
        if (fragmentManager.P0()) {
            fragmentManager.L(hVar.getIsInMultiWindowMode(), false);
        }
    }

    public static /* synthetic */ void f(FragmentManager fragmentManager, Configuration configuration) {
        if (fragmentManager.P0()) {
            fragmentManager.E(configuration, false);
        }
    }

    public static void h0(@NonNull ArrayList<androidx.fragment.app.a> arrayList, @NonNull ArrayList<Boolean> arrayList2, int i10, int i11) {
        while (i10 < i11) {
            androidx.fragment.app.a aVar = arrayList.get(i10);
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
    public static FragmentManager p0(@NonNull View view) {
        e4.q qVar;
        androidx.fragment.app.c cVarQ0 = q0(view);
        if (cVarQ0 != null) {
            if (cVarQ0.p0()) {
                return cVarQ0.v();
            }
            throw new IllegalStateException("The Fragment " + cVarQ0 + " that owns View " + view + " has already been destroyed. Nested fragments should always use the child FragmentManager.");
        }
        Context context = view.getContext();
        while (true) {
            if (!(context instanceof ContextWrapper)) {
                qVar = null;
                break;
            }
            if (context instanceof e4.q) {
                qVar = (e4.q) context;
                break;
            }
            context = ((ContextWrapper) context).getBaseContext();
        }
        if (qVar != null) {
            return qVar.l1();
        }
        throw new IllegalStateException("View " + view + " is not within a subclass of FragmentActivity.");
    }

    public static androidx.fragment.app.c q0(@NonNull View view) {
        while (view != null) {
            androidx.fragment.app.c cVarH0 = H0(view);
            if (cVarH0 != null) {
                return cVarH0;
            }
            Object parent = view.getParent();
            view = parent instanceof View ? (View) parent : null;
        }
        return null;
    }

    @NonNull
    public androidx.fragment.app.g A(@NonNull androidx.fragment.app.c cVar) {
        androidx.fragment.app.g gVarN = this.f2485c.n(cVar.f2604f);
        if (gVarN != null) {
            return gVarN;
        }
        androidx.fragment.app.g gVar = new androidx.fragment.app.g(this.f2498p, this.f2485c, cVar);
        gVar.o(this.f2506x.getContext().getClassLoader());
        gVar.s(this.f2505w);
        return gVar;
    }

    @NonNull
    public t<?> A0() {
        return this.f2506x;
    }

    public final void A1() {
        synchronized (this.f2484a) {
            try {
                if (!this.f2484a.isEmpty()) {
                    this.f2492j.setEnabled(true);
                    if (N0(3)) {
                        Log.d("FragmentManager", "FragmentManager " + this + " enabling OnBackPressedCallback, caused by non-empty pending actions");
                    }
                    return;
                }
                boolean z10 = u0() > 0 && S0(this.f2508z);
                if (N0(3)) {
                    Log.d("FragmentManager", "OnBackPressedCallback for FragmentManager " + this + " enabled state is " + z10);
                }
                this.f2492j.setEnabled(z10);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void B(@NonNull androidx.fragment.app.c cVar) {
        if (N0(2)) {
            Log.v("FragmentManager", "detach: " + cVar);
        }
        if (cVar.D) {
            return;
        }
        cVar.D = true;
        if (cVar.f2610l) {
            if (N0(2)) {
                Log.v("FragmentManager", "remove from detach: " + cVar);
            }
            this.f2485c.u(cVar);
            if (O0(cVar)) {
                this.J = true;
            }
            w1(cVar);
        }
    }

    @NonNull
    public LayoutInflater.Factory2 B0() {
        return this.f2488f;
    }

    public void C() {
        this.K = false;
        this.L = false;
        this.R.p(false);
        X(4);
    }

    @NonNull
    public androidx.fragment.app.f C0() {
        return this.f2498p;
    }

    public void D() {
        this.K = false;
        this.L = false;
        this.R.p(false);
        X(0);
    }

    public androidx.fragment.app.c D0() {
        return this.f2508z;
    }

    public void E(@NonNull Configuration configuration, boolean z10) {
        if (z10 && (this.f2506x instanceof l2.e)) {
            z1(new IllegalStateException("Do not call dispatchConfigurationChanged() on host. Host implements OnConfigurationChangedProvider and automatically dispatches configuration changes to fragments."));
        }
        for (androidx.fragment.app.c cVar : this.f2485c.o()) {
            if (cVar != null) {
                cVar.i1(configuration);
                if (z10) {
                    cVar.f2622x.E(configuration, true);
                }
            }
        }
    }

    public androidx.fragment.app.c E0() {
        return this.A;
    }

    public boolean F(@NonNull MenuItem menuItem) {
        if (this.f2505w < 1) {
            return false;
        }
        for (androidx.fragment.app.c cVar : this.f2485c.o()) {
            if (cVar != null && cVar.j1(menuItem)) {
                return true;
            }
        }
        return false;
    }

    @NonNull
    public e4.p0 F0() {
        e4.p0 p0Var = this.D;
        if (p0Var != null) {
            return p0Var;
        }
        androidx.fragment.app.c cVar = this.f2508z;
        return cVar != null ? cVar.f2620v.F0() : this.E;
    }

    public void G() {
        this.K = false;
        this.L = false;
        this.R.p(false);
        X(1);
    }

    public f4.c.C0306c G0() {
        return this.S;
    }

    public boolean H(@NonNull Menu menu, @NonNull MenuInflater menuInflater) {
        if (this.f2505w < 1) {
            return false;
        }
        ArrayList<androidx.fragment.app.c> arrayList = null;
        boolean z10 = false;
        for (androidx.fragment.app.c cVar : this.f2485c.o()) {
            if (cVar != null && R0(cVar) && cVar.l1(menu, menuInflater)) {
                if (arrayList == null) {
                    arrayList = new ArrayList<>();
                }
                arrayList.add(cVar);
                z10 = true;
            }
        }
        if (this.f2487e != null) {
            for (int i10 = 0; i10 < this.f2487e.size(); i10++) {
                androidx.fragment.app.c cVar2 = this.f2487e.get(i10);
                if (arrayList == null || !arrayList.contains(cVar2)) {
                    cVar2.L0();
                }
            }
        }
        this.f2487e = arrayList;
        return z10;
    }

    public void I() {
        this.M = true;
        f0(true);
        c0();
        w();
        X(-1);
        Object obj = this.f2506x;
        if (obj instanceof l2.f) {
            ((l2.f) obj).j(this.f2501s);
        }
        Object obj2 = this.f2506x;
        if (obj2 instanceof l2.e) {
            ((l2.e) obj2).p0(this.f2500r);
        }
        Object obj3 = this.f2506x;
        if (obj3 instanceof k2.o) {
            ((k2.o) obj3).y(this.f2502t);
        }
        Object obj4 = this.f2506x;
        if (obj4 instanceof k2.p) {
            ((k2.p) obj4).h0(this.f2503u);
        }
        Object obj5 = this.f2506x;
        if ((obj5 instanceof androidx.core.view.o) && this.f2508z == null) {
            ((androidx.core.view.o) obj5).R(this.f2504v);
        }
        this.f2506x = null;
        this.f2507y = null;
        this.f2508z = null;
        if (this.f2489g != null) {
            this.f2492j.remove();
            this.f2489g = null;
        }
        g.c<Intent> cVar = this.F;
        if (cVar != null) {
            cVar.d();
            this.G.d();
            this.H.d();
        }
    }

    @NonNull
    public b1 I0(@NonNull androidx.fragment.app.c cVar) {
        return this.R.m(cVar);
    }

    public void J() {
        X(1);
    }

    public void J0() {
        this.f2491i = true;
        f0(true);
        int i10 = 0;
        this.f2491i = false;
        if (!V || this.f2490h == null) {
            if (this.f2492j.getIsEnabled()) {
                if (N0(3)) {
                    Log.d("FragmentManager", "Calling popBackStackImmediate via onBackPressed callback");
                }
                d1();
                return;
            } else {
                if (N0(3)) {
                    Log.d("FragmentManager", "Calling onBackPressed via onBackPressed callback");
                }
                this.f2489g.i();
                return;
            }
        }
        if (!this.f2497o.isEmpty()) {
            LinkedHashSet linkedHashSet = new LinkedHashSet(s0(this.f2490h));
            ArrayList<n> arrayList = this.f2497o;
            int size = arrayList.size();
            int i11 = 0;
            while (i11 < size) {
                n nVar = arrayList.get(i11);
                i11++;
                n nVar2 = nVar;
                Iterator it = linkedHashSet.iterator();
                while (it.hasNext()) {
                    nVar2.a((androidx.fragment.app.c) it.next(), true);
                }
            }
        }
        ArrayList<androidx.fragment.app.h.a> arrayList2 = this.f2490h.f2674c;
        int size2 = arrayList2.size();
        int i12 = 0;
        while (i12 < size2) {
            androidx.fragment.app.h.a aVar = arrayList2.get(i12);
            i12++;
            androidx.fragment.app.c cVar = aVar.b;
            if (cVar != null) {
                cVar.f2612n = false;
            }
        }
        Iterator<androidx.fragment.app.i> it2 = z(new ArrayList<>(Collections.singletonList(this.f2490h)), 0, 1).iterator();
        while (it2.hasNext()) {
            it2.next().f();
        }
        ArrayList<androidx.fragment.app.h.a> arrayList3 = this.f2490h.f2674c;
        int size3 = arrayList3.size();
        while (i10 < size3) {
            androidx.fragment.app.h.a aVar2 = arrayList3.get(i10);
            i10++;
            androidx.fragment.app.c cVar2 = aVar2.b;
            if (cVar2 != null && cVar2.J == null) {
                A(cVar2).m();
            }
        }
        this.f2490h = null;
        A1();
        if (N0(3)) {
            Log.d("FragmentManager", "Op is being set to null");
            Log.d("FragmentManager", "OnBackPressedCallback enabled=" + this.f2492j.getIsEnabled() + " for  FragmentManager " + this);
        }
    }

    public void K(boolean z10) {
        if (z10 && (this.f2506x instanceof l2.f)) {
            z1(new IllegalStateException("Do not call dispatchLowMemory() on host. Host implements OnTrimMemoryProvider and automatically dispatches low memory callbacks to fragments."));
        }
        for (androidx.fragment.app.c cVar : this.f2485c.o()) {
            if (cVar != null) {
                cVar.r1();
                if (z10) {
                    cVar.f2622x.K(true);
                }
            }
        }
    }

    public void K0(@NonNull androidx.fragment.app.c cVar) {
        if (N0(2)) {
            Log.v("FragmentManager", "hide: " + cVar);
        }
        if (cVar.C) {
            return;
        }
        cVar.C = true;
        cVar.Q = true ^ cVar.Q;
        w1(cVar);
    }

    public void L(boolean z10, boolean z11) {
        if (z11 && (this.f2506x instanceof k2.o)) {
            z1(new IllegalStateException("Do not call dispatchMultiWindowModeChanged() on host. Host implements OnMultiWindowModeChangedProvider and automatically dispatches multi-window mode changes to fragments."));
        }
        for (androidx.fragment.app.c cVar : this.f2485c.o()) {
            if (cVar != null) {
                cVar.s1(z10);
                if (z11) {
                    cVar.f2622x.L(z10, true);
                }
            }
        }
    }

    public void L0(@NonNull androidx.fragment.app.c cVar) {
        if (cVar.f2610l && O0(cVar)) {
            this.J = true;
        }
    }

    public void M(@NonNull androidx.fragment.app.c cVar) {
        Iterator<e0> it = this.f2499q.iterator();
        while (it.hasNext()) {
            it.next().b(this, cVar);
        }
    }

    public boolean M0() {
        return this.M;
    }

    public void N() {
        for (androidx.fragment.app.c cVar : this.f2485c.l()) {
            if (cVar != null) {
                cVar.P0(cVar.r0());
                cVar.f2622x.N();
            }
        }
    }

    public boolean O(@NonNull MenuItem menuItem) {
        if (this.f2505w < 1) {
            return false;
        }
        for (androidx.fragment.app.c cVar : this.f2485c.o()) {
            if (cVar != null && cVar.t1(menuItem)) {
                return true;
            }
        }
        return false;
    }

    public final boolean O0(@NonNull androidx.fragment.app.c cVar) {
        return (cVar.G && cVar.H) || cVar.f2622x.t();
    }

    public void P(@NonNull Menu menu) {
        if (this.f2505w < 1) {
            return;
        }
        for (androidx.fragment.app.c cVar : this.f2485c.o()) {
            if (cVar != null) {
                cVar.u1(menu);
            }
        }
    }

    public final boolean P0() {
        androidx.fragment.app.c cVar = this.f2508z;
        if (cVar == null) {
            return true;
        }
        return cVar.p0() && this.f2508z.M().P0();
    }

    public final void Q(androidx.fragment.app.c cVar) {
        if (cVar == null || !cVar.equals(k0(cVar.f2604f))) {
            return;
        }
        cVar.y1();
    }

    public boolean Q0(androidx.fragment.app.c cVar) {
        if (cVar == null) {
            return false;
        }
        return cVar.r0();
    }

    public void R() {
        X(5);
    }

    public boolean R0(androidx.fragment.app.c cVar) {
        if (cVar == null) {
            return true;
        }
        return cVar.t0();
    }

    public void S(boolean z10, boolean z11) {
        if (z11 && (this.f2506x instanceof k2.p)) {
            z1(new IllegalStateException("Do not call dispatchPictureInPictureModeChanged() on host. Host implements OnPictureInPictureModeChangedProvider and automatically dispatches picture-in-picture mode changes to fragments."));
        }
        for (androidx.fragment.app.c cVar : this.f2485c.o()) {
            if (cVar != null) {
                cVar.w1(z10);
                if (z11) {
                    cVar.f2622x.S(z10, true);
                }
            }
        }
    }

    public boolean S0(androidx.fragment.app.c cVar) {
        if (cVar == null) {
            return true;
        }
        FragmentManager fragmentManager = cVar.f2620v;
        return cVar.equals(fragmentManager.E0()) && S0(fragmentManager.f2508z);
    }

    public boolean T(@NonNull Menu menu) {
        boolean z10 = false;
        if (this.f2505w < 1) {
            return false;
        }
        for (androidx.fragment.app.c cVar : this.f2485c.o()) {
            if (cVar != null && R0(cVar) && cVar.x1(menu)) {
                z10 = true;
            }
        }
        return z10;
    }

    public boolean T0(int i10) {
        return this.f2505w >= i10;
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

    public void V0(@NonNull androidx.fragment.app.c cVar, @NonNull Intent intent, int i10, Bundle bundle) {
        if (this.F == null) {
            this.f2506x.n(cVar, intent, i10, bundle);
            return;
        }
        this.I.addLast(new LaunchedFragmentInfo(cVar.f2604f, i10));
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
        t<?> tVar;
        if (this.f2506x == null && i10 != -1) {
            throw new IllegalStateException("No activity");
        }
        if (z10 || i10 != this.f2505w) {
            this.f2505w = i10;
            this.f2485c.t();
            y1();
            if (this.J && (tVar = this.f2506x) != null && this.f2505w == 7) {
                tVar.o();
                this.J = false;
            }
        }
    }

    public final void X(int i10) {
        try {
            this.b = true;
            this.f2485c.d(i10);
            W0(i10, false);
            Iterator<androidx.fragment.app.i> it = y().iterator();
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
        if (this.f2506x == null) {
            return;
        }
        this.K = false;
        this.L = false;
        this.R.p(false);
        for (androidx.fragment.app.c cVar : this.f2485c.o()) {
            if (cVar != null) {
                cVar.y0();
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
        for (androidx.fragment.app.g gVar : this.f2485c.k()) {
            androidx.fragment.app.c cVarK = gVar.k();
            if (cVarK.A == fragmentContainerView.getId() && (view = cVarK.K) != null && view.getParent() == null) {
                cVarK.J = fragmentContainerView;
                gVar.b();
                gVar.m();
            }
        }
    }

    public void Z() {
        X(2);
    }

    public void Z0(@NonNull androidx.fragment.app.g gVar) {
        androidx.fragment.app.c cVarK = gVar.k();
        if (cVarK.L) {
            if (this.b) {
                this.N = true;
            } else {
                cVarK.L = false;
                gVar.m();
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
        d0(new p(null, -1, 0), false);
    }

    public void b0(@NonNull String str, FileDescriptor fileDescriptor, @NonNull PrintWriter printWriter, String[] strArr) {
        int size;
        String str2 = str + "    ";
        this.f2485c.e(str, fileDescriptor, printWriter, strArr);
        ArrayList<androidx.fragment.app.c> arrayList = this.f2487e;
        if (arrayList != null && (size = arrayList.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Fragments Created Menus:");
            for (int i10 = 0; i10 < size; i10++) {
                androidx.fragment.app.c cVar = this.f2487e.get(i10);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i10);
                printWriter.print(": ");
                printWriter.println(cVar.toString());
            }
        }
        int size2 = this.f2486d.size();
        if (size2 > 0) {
            printWriter.print(str);
            printWriter.println("Back Stack:");
            for (int i11 = 0; i11 < size2; i11++) {
                androidx.fragment.app.a aVar = this.f2486d.get(i11);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i11);
                printWriter.print(": ");
                printWriter.println(aVar.toString());
                aVar.x(str2, printWriter);
            }
        }
        printWriter.print(str);
        printWriter.println("Back Stack Index: " + this.f2493k.get());
        synchronized (this.f2484a) {
            try {
                int size3 = this.f2484a.size();
                if (size3 > 0) {
                    printWriter.print(str);
                    printWriter.println("Pending Actions:");
                    for (int i12 = 0; i12 < size3; i12++) {
                        o oVar = this.f2484a.get(i12);
                        printWriter.print(str);
                        printWriter.print("  #");
                        printWriter.print(i12);
                        printWriter.print(": ");
                        printWriter.println(oVar);
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
        printWriter.println(this.f2506x);
        printWriter.print(str);
        printWriter.print("  mContainer=");
        printWriter.println(this.f2507y);
        if (this.f2508z != null) {
            printWriter.print(str);
            printWriter.print("  mParent=");
            printWriter.println(this.f2508z);
        }
        printWriter.print(str);
        printWriter.print("  mCurState=");
        printWriter.print(this.f2505w);
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
            d0(new p(null, i10, i11), z10);
            return;
        }
        throw new IllegalArgumentException("Bad id: " + i10);
    }

    public final void c0() {
        Iterator<androidx.fragment.app.i> it = y().iterator();
        while (it.hasNext()) {
            it.next().q();
        }
    }

    public void c1(String str, int i10) {
        d0(new p(str, -1, i10), false);
    }

    public void d0(@NonNull o oVar, boolean z10) {
        if (!z10) {
            if (this.f2506x == null) {
                if (!this.M) {
                    throw new IllegalStateException("FragmentManager has not been attached to a host.");
                }
                throw new IllegalStateException("FragmentManager has been destroyed");
            }
            u();
        }
        synchronized (this.f2484a) {
            try {
                if (this.f2506x == null) {
                    if (!z10) {
                        throw new IllegalStateException("Activity has been destroyed");
                    }
                } else {
                    this.f2484a.add(oVar);
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
        if (this.f2506x == null) {
            if (!this.M) {
                throw new IllegalStateException("FragmentManager has not been attached to a host.");
            }
            throw new IllegalStateException("FragmentManager has been destroyed");
        }
        if (Looper.myLooper() != this.f2506x.getHandler().getLooper()) {
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
        androidx.fragment.app.a aVar;
        e0(z10);
        boolean z11 = false;
        if (!this.f2491i && (aVar = this.f2490h) != null) {
            aVar.f2548u = false;
            aVar.v();
            if (N0(3)) {
                Log.d("FragmentManager", "Reversing mTransitioningOp " + this.f2490h + " as part of execPendingActions for actions " + this.f2484a);
            }
            this.f2490h.w(false, false);
            this.f2484a.add(0, this.f2490h);
            ArrayList<androidx.fragment.app.h.a> arrayList = this.f2490h.f2674c;
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                androidx.fragment.app.h.a aVar2 = arrayList.get(i10);
                i10++;
                androidx.fragment.app.c cVar = aVar2.b;
                if (cVar != null) {
                    cVar.f2612n = false;
                }
            }
            this.f2490h = null;
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
        this.f2485c.b();
        return z11;
    }

    public final boolean f1(String str, int i10, int i11) {
        f0(false);
        e0(true);
        androidx.fragment.app.c cVar = this.A;
        if (cVar != null && i10 < 0 && str == null && cVar.v().d1()) {
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
        this.f2485c.b();
        return zG1;
    }

    public void g0(@NonNull o oVar, boolean z10) {
        if (z10 && (this.f2506x == null || this.M)) {
            return;
        }
        e0(z10);
        androidx.fragment.app.a aVar = this.f2490h;
        boolean z11 = false;
        if (aVar != null) {
            aVar.f2548u = false;
            aVar.v();
            if (N0(3)) {
                Log.d("FragmentManager", "Reversing mTransitioningOp " + this.f2490h + " as part of execSingleAction for action " + oVar);
            }
            this.f2490h.w(false, false);
            boolean zA = this.f2490h.a(this.O, this.P);
            ArrayList<androidx.fragment.app.h.a> arrayList = this.f2490h.f2674c;
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                androidx.fragment.app.h.a aVar2 = arrayList.get(i10);
                i10++;
                androidx.fragment.app.c cVar = aVar2.b;
                if (cVar != null) {
                    cVar.f2612n = false;
                }
            }
            this.f2490h = null;
            z11 = zA;
        }
        boolean zA2 = oVar.a(this.O, this.P);
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
        this.f2485c.b();
    }

    public boolean g1(@NonNull ArrayList<androidx.fragment.app.a> arrayList, @NonNull ArrayList<Boolean> arrayList2, String str, int i10, int i11) {
        int iL0 = l0(str, i10, (i11 & 1) != 0);
        if (iL0 < 0) {
            return false;
        }
        for (int size = this.f2486d.size() - 1; size >= iL0; size--) {
            arrayList.add(this.f2486d.remove(size));
            arrayList2.add(Boolean.TRUE);
        }
        return true;
    }

    public boolean h1(@NonNull ArrayList<androidx.fragment.app.a> arrayList, @NonNull ArrayList<Boolean> arrayList2) {
        if (N0(2)) {
            Log.v("FragmentManager", "FragmentManager has the following pending actions inside of prepareBackStackState: " + this.f2484a);
        }
        int i10 = 0;
        if (this.f2486d.isEmpty()) {
            Log.i("FragmentManager", "Ignoring call to start back stack pop because the back stack is empty.");
            return false;
        }
        ArrayList<androidx.fragment.app.a> arrayList3 = this.f2486d;
        androidx.fragment.app.a aVar = arrayList3.get(arrayList3.size() - 1);
        this.f2490h = aVar;
        ArrayList<androidx.fragment.app.h.a> arrayList4 = aVar.f2674c;
        int size = arrayList4.size();
        while (i10 < size) {
            androidx.fragment.app.h.a aVar2 = arrayList4.get(i10);
            i10++;
            androidx.fragment.app.c cVar = aVar2.b;
            if (cVar != null) {
                cVar.f2612n = true;
            }
        }
        return g1(arrayList, arrayList2, null, -1, 0);
    }

    public final void i0(@NonNull ArrayList<androidx.fragment.app.a> arrayList, @NonNull ArrayList<Boolean> arrayList2, int i10, int i11) {
        boolean z10 = arrayList.get(i10).f2689r;
        ArrayList<androidx.fragment.app.c> arrayList3 = this.Q;
        if (arrayList3 == null) {
            this.Q = new ArrayList<>();
        } else {
            arrayList3.clear();
        }
        this.Q.addAll(this.f2485c.o());
        androidx.fragment.app.c cVarE0 = E0();
        boolean z11 = false;
        for (int i12 = i10; i12 < i11; i12++) {
            androidx.fragment.app.a aVar = arrayList.get(i12);
            cVarE0 = !arrayList2.get(i12).booleanValue() ? aVar.B(this.Q, cVarE0) : aVar.E(this.Q, cVarE0);
            z11 = z11 || aVar.f2680i;
        }
        this.Q.clear();
        if (!z10 && this.f2505w >= 1) {
            for (int i13 = i10; i13 < i11; i13++) {
                ArrayList<androidx.fragment.app.h.a> arrayList4 = arrayList.get(i13).f2674c;
                int size = arrayList4.size();
                int i14 = 0;
                while (i14 < size) {
                    androidx.fragment.app.h.a aVar2 = arrayList4.get(i14);
                    i14++;
                    androidx.fragment.app.c cVar = aVar2.b;
                    if (cVar != null && cVar.f2620v != null) {
                        this.f2485c.r(A(cVar));
                    }
                }
            }
        }
        h0(arrayList, arrayList2, i10, i11);
        boolean zBooleanValue = arrayList2.get(i11 - 1).booleanValue();
        if (z11 && !this.f2497o.isEmpty()) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            int size2 = arrayList.size();
            int i15 = 0;
            while (i15 < size2) {
                androidx.fragment.app.a aVar3 = arrayList.get(i15);
                i15++;
                linkedHashSet.addAll(s0(aVar3));
            }
            if (this.f2490h == null) {
                ArrayList<n> arrayList5 = this.f2497o;
                int size3 = arrayList5.size();
                int i16 = 0;
                while (i16 < size3) {
                    n nVar = arrayList5.get(i16);
                    i16++;
                    n nVar2 = nVar;
                    Iterator it = linkedHashSet.iterator();
                    while (it.hasNext()) {
                        nVar2.c((androidx.fragment.app.c) it.next(), zBooleanValue);
                    }
                }
                ArrayList<n> arrayList6 = this.f2497o;
                int size4 = arrayList6.size();
                int i17 = 0;
                while (i17 < size4) {
                    n nVar3 = arrayList6.get(i17);
                    i17++;
                    n nVar4 = nVar3;
                    Iterator it2 = linkedHashSet.iterator();
                    while (it2.hasNext()) {
                        nVar4.a((androidx.fragment.app.c) it2.next(), zBooleanValue);
                    }
                }
            }
        }
        for (int i18 = i10; i18 < i11; i18++) {
            androidx.fragment.app.a aVar4 = arrayList.get(i18);
            if (zBooleanValue) {
                for (int size5 = aVar4.f2674c.size() - 1; size5 >= 0; size5--) {
                    androidx.fragment.app.c cVar2 = aVar4.f2674c.get(size5).b;
                    if (cVar2 != null) {
                        A(cVar2).m();
                    }
                }
            } else {
                ArrayList<androidx.fragment.app.h.a> arrayList7 = aVar4.f2674c;
                int size6 = arrayList7.size();
                int i19 = 0;
                while (i19 < size6) {
                    androidx.fragment.app.h.a aVar5 = arrayList7.get(i19);
                    i19++;
                    androidx.fragment.app.c cVar3 = aVar5.b;
                    if (cVar3 != null) {
                        A(cVar3).m();
                    }
                }
            }
        }
        W0(this.f2505w, true);
        for (androidx.fragment.app.i iVar : z(arrayList, i10, i11)) {
            iVar.D(zBooleanValue);
            iVar.z();
            iVar.n();
        }
        while (i10 < i11) {
            androidx.fragment.app.a aVar6 = arrayList.get(i10);
            if (arrayList2.get(i10).booleanValue() && aVar6.f2549v >= 0) {
                aVar6.f2549v = -1;
            }
            aVar6.D();
            i10++;
        }
        if (z11) {
            m1();
        }
    }

    public void i1() {
        d0(new q(), false);
    }

    public boolean j0() {
        boolean zF0 = f0(true);
        r0();
        return zF0;
    }

    public void j1(@NonNull androidx.fragment.app.c cVar) {
        if (N0(2)) {
            Log.v("FragmentManager", "remove: " + cVar + " nesting=" + cVar.f2619u);
        }
        boolean zS0 = cVar.s0();
        if (cVar.D && zS0) {
            return;
        }
        this.f2485c.u(cVar);
        if (O0(cVar)) {
            this.J = true;
        }
        cVar.f2611m = true;
        w1(cVar);
    }

    public void k(androidx.fragment.app.a aVar) {
        this.f2486d.add(aVar);
    }

    public androidx.fragment.app.c k0(@NonNull String str) {
        return this.f2485c.f(str);
    }

    public final void k1(@NonNull ArrayList<androidx.fragment.app.a> arrayList, @NonNull ArrayList<Boolean> arrayList2) {
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
            if (!arrayList.get(i10).f2689r) {
                if (i11 != i10) {
                    i0(arrayList, arrayList2, i11, i10);
                }
                i11 = i10 + 1;
                if (arrayList2.get(i10).booleanValue()) {
                    while (i11 < size && arrayList2.get(i11).booleanValue() && !arrayList.get(i11).f2689r) {
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

    public androidx.fragment.app.g l(@NonNull androidx.fragment.app.c cVar) {
        String str = cVar.T;
        if (str != null) {
            f4.c.f(cVar, str);
        }
        if (N0(2)) {
            Log.v("FragmentManager", "add: " + cVar);
        }
        androidx.fragment.app.g gVarA = A(cVar);
        cVar.f2620v = this;
        this.f2485c.r(gVarA);
        if (!cVar.D) {
            this.f2485c.a(cVar);
            cVar.f2611m = false;
            if (cVar.K == null) {
                cVar.Q = false;
            }
            if (O0(cVar)) {
                this.J = true;
            }
        }
        return gVarA;
    }

    public final int l0(String str, int i10, boolean z10) {
        if (this.f2486d.isEmpty()) {
            return -1;
        }
        if (str == null && i10 < 0) {
            if (z10) {
                return 0;
            }
            return this.f2486d.size() - 1;
        }
        int size = this.f2486d.size() - 1;
        while (size >= 0) {
            androidx.fragment.app.a aVar = this.f2486d.get(size);
            if ((str != null && str.equals(aVar.C())) || (i10 >= 0 && i10 == aVar.f2549v)) {
                break;
            }
            size--;
        }
        if (size < 0) {
            return size;
        }
        if (!z10) {
            if (size == this.f2486d.size() - 1) {
                return -1;
            }
            return size + 1;
        }
        while (size > 0) {
            androidx.fragment.app.a aVar2 = this.f2486d.get(size - 1);
            if ((str == null || !str.equals(aVar2.C())) && (i10 < 0 || i10 != aVar2.f2549v)) {
                break;
            }
            size--;
        }
        return size;
    }

    public void l1(@NonNull androidx.fragment.app.c cVar) {
        this.R.o(cVar);
    }

    public void m(@NonNull e0 e0Var) {
        this.f2499q.add(e0Var);
    }

    public androidx.fragment.app.c m0(int i10) {
        return this.f2485c.g(i10);
    }

    public final void m1() {
        for (int i10 = 0; i10 < this.f2497o.size(); i10++) {
            this.f2497o.get(i10).onBackStackChanged();
        }
    }

    public void n(@NonNull androidx.fragment.app.c cVar) {
        this.R.e(cVar);
    }

    public androidx.fragment.app.c n0(String str) {
        return this.f2485c.h(str);
    }

    public void n1(Parcelable parcelable) {
        androidx.fragment.app.g gVar;
        Bundle bundle;
        Bundle bundle2;
        if (parcelable == null) {
            return;
        }
        Bundle bundle3 = (Bundle) parcelable;
        for (String str : bundle3.keySet()) {
            if (str.startsWith("result_") && (bundle2 = bundle3.getBundle(str)) != null) {
                bundle2.setClassLoader(this.f2506x.getContext().getClassLoader());
                this.f2495m.put(str.substring(7), bundle2);
            }
        }
        HashMap<String, Bundle> map = new HashMap<>();
        for (String str2 : bundle3.keySet()) {
            if (str2.startsWith("fragment_") && (bundle = bundle3.getBundle(str2)) != null) {
                bundle.setClassLoader(this.f2506x.getContext().getClassLoader());
                map.put(str2.substring(9), bundle);
            }
        }
        this.f2485c.x(map);
        FragmentManagerState fragmentManagerState = (FragmentManagerState) bundle3.getParcelable("state");
        if (fragmentManagerState == null) {
            return;
        }
        this.f2485c.v();
        ArrayList<String> arrayList = fragmentManagerState.f2526a;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            String str3 = arrayList.get(i10);
            i10++;
            Bundle bundleB = this.f2485c.B(str3, null);
            if (bundleB != null) {
                androidx.fragment.app.c cVarI = this.R.i(((FragmentState) bundleB.getParcelable("state")).b);
                if (cVarI != null) {
                    if (N0(2)) {
                        Log.v("FragmentManager", "restoreSaveState: re-attaching retained " + cVarI);
                    }
                    gVar = new androidx.fragment.app.g(this.f2498p, this.f2485c, cVarI, bundleB);
                } else {
                    gVar = new androidx.fragment.app.g(this.f2498p, this.f2485c, this.f2506x.getContext().getClassLoader(), y0(), bundleB);
                }
                androidx.fragment.app.c cVarK = gVar.k();
                cVarK.b = bundleB;
                cVarK.f2620v = this;
                if (N0(2)) {
                    Log.v("FragmentManager", "restoreSaveState: active (" + cVarK.f2604f + "): " + cVarK);
                }
                gVar.o(this.f2506x.getContext().getClassLoader());
                this.f2485c.r(gVar);
                gVar.s(this.f2505w);
            }
        }
        for (androidx.fragment.app.c cVar : this.R.l()) {
            if (!this.f2485c.c(cVar.f2604f)) {
                if (N0(2)) {
                    Log.v("FragmentManager", "Discarding retained Fragment " + cVar + " that was not found in the set of active Fragments " + fragmentManagerState.f2526a);
                }
                this.R.o(cVar);
                cVar.f2620v = this;
                androidx.fragment.app.g gVar2 = new androidx.fragment.app.g(this.f2498p, this.f2485c, cVar);
                gVar2.s(1);
                gVar2.m();
                cVar.f2611m = true;
                gVar2.m();
            }
        }
        this.f2485c.w(fragmentManagerState.b);
        if (fragmentManagerState.f2527c != null) {
            this.f2486d = new ArrayList<>(fragmentManagerState.f2527c.length);
            int i11 = 0;
            while (true) {
                BackStackRecordState[] backStackRecordStateArr = fragmentManagerState.f2527c;
                if (i11 >= backStackRecordStateArr.length) {
                    break;
                }
                androidx.fragment.app.a aVarF = backStackRecordStateArr[i11].f(this);
                if (N0(2)) {
                    Log.v("FragmentManager", "restoreAllState: back stack #" + i11 + " (index " + aVarF.f2549v + "): " + aVarF);
                    PrintWriter printWriter = new PrintWriter(new e4.m0("FragmentManager"));
                    aVarF.y("  ", printWriter, false);
                    printWriter.close();
                }
                this.f2486d.add(aVarF);
                i11++;
            }
        } else {
            this.f2486d = new ArrayList<>();
        }
        this.f2493k.set(fragmentManagerState.f2528d);
        String str4 = fragmentManagerState.f2529e;
        if (str4 != null) {
            androidx.fragment.app.c cVarK0 = k0(str4);
            this.A = cVarK0;
            Q(cVarK0);
        }
        ArrayList<String> arrayList2 = fragmentManagerState.f2530f;
        if (arrayList2 != null) {
            for (int i12 = 0; i12 < arrayList2.size(); i12++) {
                this.f2494l.put(arrayList2.get(i12), fragmentManagerState.f2531g.get(i12));
            }
        }
        this.I = new ArrayDeque<>(fragmentManagerState.f2532h);
    }

    public int o() {
        return this.f2493k.getAndIncrement();
    }

    public androidx.fragment.app.c o0(@NonNull String str) {
        return this.f2485c.i(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void p(@NonNull t<?> tVar, @NonNull r rVar, androidx.fragment.app.c cVar) {
        String str;
        androidx.p000lifecycle.s sVar;
        if (this.f2506x != null) {
            throw new IllegalStateException("Already attached");
        }
        this.f2506x = tVar;
        this.f2507y = rVar;
        this.f2508z = cVar;
        if (cVar != null) {
            m(new h(cVar));
        } else if (tVar instanceof e0) {
            m((e0) tVar);
        }
        if (this.f2508z != null) {
            A1();
        }
        if (tVar instanceof r0) {
            r0 r0Var = (r0) tVar;
            p0 p0VarQ = r0Var.Q();
            this.f2489g = p0VarQ;
            if (cVar != null) {
                sVar = r0Var;
                sVar = cVar;
            }
            sVar = r0Var;
            p0VarQ.d(sVar, this.f2492j);
        }
        if (cVar != null) {
            this.R = cVar.f2620v.v0(cVar);
        } else if (tVar instanceof c1) {
            this.R = d0.k(((c1) tVar).w());
        } else {
            this.R = new d0(false);
        }
        this.R.p(U0());
        this.f2485c.A(this.R);
        Object obj = this.f2506x;
        if ((obj instanceof d5.i) && cVar == null) {
            d5.f fVarA = ((d5.i) obj).A();
            fVarA.c("android:support:fragments", new d5.f.b() { // from class: e4.a0
                @Override // d5.f.b
                public final Bundle a() {
                    return this.f15076a.p1();
                }
            });
            Bundle bundleA = fVarA.a("android:support:fragments");
            if (bundleA != null) {
                n1(bundleA);
            }
        }
        Object obj2 = this.f2506x;
        if (obj2 instanceof g.g) {
            g.f fVarQ = ((g.g) obj2).getActivityResultRegistry();
            if (cVar != null) {
                str = cVar.f2604f + ":";
            } else {
                str = "";
            }
            String str2 = "FragmentManager:" + str;
            this.F = fVarQ.o(str2 + "StartActivityForResult", new h.i(), new i());
            this.G = fVarQ.o(str2 + "StartIntentSenderForResult", new k(), new j());
            this.H = fVarQ.o(str2 + "RequestPermissions", new h.g(), new a());
        }
        Object obj3 = this.f2506x;
        if (obj3 instanceof l2.e) {
            ((l2.e) obj3).g0(this.f2500r);
        }
        Object obj4 = this.f2506x;
        if (obj4 instanceof l2.f) {
            ((l2.f) obj4).d0(this.f2501s);
        }
        Object obj5 = this.f2506x;
        if (obj5 instanceof k2.o) {
            ((k2.o) obj5).e0(this.f2502t);
        }
        Object obj6 = this.f2506x;
        if (obj6 instanceof k2.p) {
            ((k2.p) obj6).z(this.f2503u);
        }
        Object obj7 = this.f2506x;
        if ((obj7 instanceof androidx.core.view.o) && cVar == null) {
            ((androidx.core.view.o) obj7).l0(this.f2504v);
        }
    }

    @NonNull
    public Bundle p1() {
        BackStackRecordState[] backStackRecordStateArr;
        Bundle bundle = new Bundle();
        r0();
        c0();
        f0(true);
        this.K = true;
        this.R.p(true);
        ArrayList<String> arrayListY = this.f2485c.y();
        HashMap<String, Bundle> mapM = this.f2485c.m();
        if (!mapM.isEmpty()) {
            ArrayList<String> arrayListZ = this.f2485c.z();
            int size = this.f2486d.size();
            if (size > 0) {
                backStackRecordStateArr = new BackStackRecordState[size];
                for (int i10 = 0; i10 < size; i10++) {
                    backStackRecordStateArr[i10] = new BackStackRecordState(this.f2486d.get(i10));
                    if (N0(2)) {
                        Log.v("FragmentManager", "saveAllState: adding back stack #" + i10 + ": " + this.f2486d.get(i10));
                    }
                }
            } else {
                backStackRecordStateArr = null;
            }
            FragmentManagerState fragmentManagerState = new FragmentManagerState();
            fragmentManagerState.f2526a = arrayListY;
            fragmentManagerState.b = arrayListZ;
            fragmentManagerState.f2527c = backStackRecordStateArr;
            fragmentManagerState.f2528d = this.f2493k.get();
            androidx.fragment.app.c cVar = this.A;
            if (cVar != null) {
                fragmentManagerState.f2529e = cVar.f2604f;
            }
            fragmentManagerState.f2530f.addAll(this.f2494l.keySet());
            fragmentManagerState.f2531g.addAll(this.f2494l.values());
            fragmentManagerState.f2532h = new ArrayList<>(this.I);
            bundle.putParcelable("state", fragmentManagerState);
            for (String str : this.f2495m.keySet()) {
                bundle.putBundle("result_" + str, this.f2495m.get(str));
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

    public void q(@NonNull androidx.fragment.app.c cVar) {
        if (N0(2)) {
            Log.v("FragmentManager", "attach: " + cVar);
        }
        if (cVar.D) {
            cVar.D = false;
            if (cVar.f2610l) {
                return;
            }
            this.f2485c.a(cVar);
            if (N0(2)) {
                Log.v("FragmentManager", "add from attach: " + cVar);
            }
            if (O0(cVar)) {
                this.J = true;
            }
        }
    }

    public void q1() {
        synchronized (this.f2484a) {
            try {
                if (this.f2484a.size() == 1) {
                    this.f2506x.getHandler().removeCallbacks(this.T);
                    this.f2506x.getHandler().post(this.T);
                    A1();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @NonNull
    public androidx.fragment.app.h r() {
        return new androidx.fragment.app.a(this);
    }

    public final void r0() {
        Iterator<androidx.fragment.app.i> it = y().iterator();
        while (it.hasNext()) {
            it.next().r();
        }
    }

    public void r1(@NonNull androidx.fragment.app.c cVar, boolean z10) {
        ViewGroup viewGroupX0 = x0(cVar);
        if (viewGroupX0 == null || !(viewGroupX0 instanceof FragmentContainerView)) {
            return;
        }
        ((FragmentContainerView) viewGroupX0).setDrawDisappearingViewsLast(!z10);
    }

    public void s() {
        if (N0(3)) {
            Log.d("FragmentManager", "cancelBackStackTransition for transition " + this.f2490h);
        }
        androidx.fragment.app.a aVar = this.f2490h;
        if (aVar != null) {
            aVar.f2548u = false;
            aVar.v();
            this.f2490h.p(true, new Runnable() { // from class: e4.b0
                @Override // java.lang.Runnable
                public final void run() {
                    FragmentManager.c(this.f15079a);
                }
            });
            this.f2490h.g();
            this.f2491i = true;
            j0();
            this.f2491i = false;
            this.f2490h = null;
        }
    }

    public Set<androidx.fragment.app.c> s0(@NonNull androidx.fragment.app.a aVar) {
        HashSet hashSet = new HashSet();
        for (int i10 = 0; i10 < aVar.f2674c.size(); i10++) {
            androidx.fragment.app.c cVar = aVar.f2674c.get(i10).b;
            if (cVar != null && aVar.f2680i) {
                hashSet.add(cVar);
            }
        }
        return hashSet;
    }

    public final void s1(@NonNull String str, @NonNull Bundle bundle) {
        m mVar = this.f2496n.get(str);
        if (mVar == null || !mVar.b(androidx.lifecycle.l.b.STARTED)) {
            this.f2495m.put(str, bundle);
        } else {
            mVar.a(str, bundle);
        }
        if (N0(2)) {
            Log.v("FragmentManager", "Setting fragment result with key " + str + " and result " + bundle);
        }
    }

    public boolean t() {
        boolean zO0 = false;
        for (androidx.fragment.app.c cVar : this.f2485c.l()) {
            if (cVar != null) {
                zO0 = O0(cVar);
            }
            if (zO0) {
                return true;
            }
        }
        return false;
    }

    public final boolean t0(@NonNull ArrayList<androidx.fragment.app.a> arrayList, @NonNull ArrayList<Boolean> arrayList2) {
        synchronized (this.f2484a) {
            if (this.f2484a.isEmpty()) {
                return false;
            }
            try {
                int size = this.f2484a.size();
                boolean zA = false;
                for (int i10 = 0; i10 < size; i10++) {
                    zA |= this.f2484a.get(i10).a(arrayList, arrayList2);
                }
                this.f2484a.clear();
                this.f2506x.getHandler().removeCallbacks(this.T);
                return zA;
            } catch (Throwable th2) {
                this.f2484a.clear();
                this.f2506x.getHandler().removeCallbacks(this.T);
                throw th2;
            }
        }
    }

    public final void t1(@NonNull String str, @NonNull androidx.p000lifecycle.s sVar, @NonNull f0 f0Var) {
        androidx.p000lifecycle.l lVarA = sVar.a();
        if (lVarA.getState() == androidx.lifecycle.l.b.DESTROYED) {
            return;
        }
        g gVar = new g(str, f0Var, lVarA);
        m mVarPut = this.f2496n.put(str, new m(lVarA, f0Var, gVar));
        if (mVarPut != null) {
            mVarPut.c();
        }
        if (N0(2)) {
            Log.v("FragmentManager", "Setting FragmentResultListener with key " + str + " lifecycleOwner " + lVarA + " and listener " + f0Var);
        }
        lVarA.a(gVar);
    }

    @NonNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder(128);
        sb2.append("FragmentManager{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append(" in ");
        androidx.fragment.app.c cVar = this.f2508z;
        if (cVar != null) {
            sb2.append(cVar.getClass().getSimpleName());
            sb2.append("{");
            sb2.append(Integer.toHexString(System.identityHashCode(this.f2508z)));
            sb2.append("}");
        } else {
            t<?> tVar = this.f2506x;
            if (tVar != null) {
                sb2.append(tVar.getClass().getSimpleName());
                sb2.append("{");
                sb2.append(Integer.toHexString(System.identityHashCode(this.f2506x)));
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
        return this.f2486d.size() + (this.f2490h != null ? 1 : 0);
    }

    public void u1(@NonNull androidx.fragment.app.c cVar, @NonNull androidx.lifecycle.l.b bVar) {
        if (cVar.equals(k0(cVar.f2604f)) && (cVar.f2621w == null || cVar.f2620v == this)) {
            cVar.U = bVar;
            return;
        }
        throw new IllegalArgumentException("Fragment " + cVar + " is not an active fragment of FragmentManager " + this);
    }

    public final void v() {
        this.b = false;
        this.P.clear();
        this.O.clear();
    }

    @NonNull
    public final d0 v0(@NonNull androidx.fragment.app.c cVar) {
        return this.R.j(cVar);
    }

    public void v1(androidx.fragment.app.c cVar) {
        if (cVar == null || (cVar.equals(k0(cVar.f2604f)) && (cVar.f2621w == null || cVar.f2620v == this))) {
            androidx.fragment.app.c cVar2 = this.A;
            this.A = cVar;
            Q(cVar2);
            Q(this.A);
            return;
        }
        throw new IllegalArgumentException("Fragment " + cVar + " is not an active fragment of FragmentManager " + this);
    }

    public final void w() {
        boolean zN;
        t<?> tVar = this.f2506x;
        if (tVar instanceof c1) {
            zN = this.f2485c.p().n();
        } else {
            zN = tVar.getContext() instanceof Activity ? !((Activity) this.f2506x.getContext()).isChangingConfigurations() : true;
        }
        if (zN) {
            Iterator<BackStackState> it = this.f2494l.values().iterator();
            while (it.hasNext()) {
                Iterator<String> it2 = it.next().f2479a.iterator();
                while (it2.hasNext()) {
                    this.f2485c.p().g(it2.next(), false);
                }
            }
        }
    }

    @NonNull
    public r w0() {
        return this.f2507y;
    }

    public final void w1(@NonNull androidx.fragment.app.c cVar) {
        ViewGroup viewGroupX0 = x0(cVar);
        if (viewGroupX0 == null || cVar.y() + cVar.C() + cVar.O() + cVar.P() <= 0) {
            return;
        }
        int i10 = d4.b.f14429c;
        if (viewGroupX0.getTag(i10) == null) {
            viewGroupX0.setTag(i10, cVar);
        }
        ((androidx.fragment.app.c) viewGroupX0.getTag(i10)).T1(cVar.N());
    }

    public final void x(@NonNull String str) {
        this.f2495m.remove(str);
        if (N0(2)) {
            Log.v("FragmentManager", "Clearing fragment result with key " + str);
        }
    }

    public final ViewGroup x0(@NonNull androidx.fragment.app.c cVar) {
        ViewGroup viewGroup = cVar.J;
        if (viewGroup != null) {
            return viewGroup;
        }
        if (cVar.A > 0 && this.f2507y.e()) {
            View viewD = this.f2507y.d(cVar.A);
            if (viewD instanceof ViewGroup) {
                return (ViewGroup) viewD;
            }
        }
        return null;
    }

    public void x1(@NonNull androidx.fragment.app.c cVar) {
        if (N0(2)) {
            Log.v("FragmentManager", "show: " + cVar);
        }
        if (cVar.C) {
            cVar.C = false;
            cVar.Q = !cVar.Q;
        }
    }

    public final Set<androidx.fragment.app.i> y() {
        HashSet hashSet = new HashSet();
        Iterator<androidx.fragment.app.g> it = this.f2485c.k().iterator();
        while (it.hasNext()) {
            ViewGroup viewGroup = it.next().k().J;
            if (viewGroup != null) {
                hashSet.add(androidx.fragment.app.i.v(viewGroup, F0()));
            }
        }
        return hashSet;
    }

    @NonNull
    public androidx.fragment.app.e y0() {
        androidx.fragment.app.e eVar = this.B;
        if (eVar != null) {
            return eVar;
        }
        androidx.fragment.app.c cVar = this.f2508z;
        return cVar != null ? cVar.f2620v.y0() : this.C;
    }

    public final void y1() {
        Iterator<androidx.fragment.app.g> it = this.f2485c.k().iterator();
        while (it.hasNext()) {
            Z0(it.next());
        }
    }

    public Set<androidx.fragment.app.i> z(@NonNull ArrayList<androidx.fragment.app.a> arrayList, int i10, int i11) {
        ViewGroup viewGroup;
        HashSet hashSet = new HashSet();
        while (i10 < i11) {
            ArrayList<androidx.fragment.app.h.a> arrayList2 = arrayList.get(i10).f2674c;
            int size = arrayList2.size();
            int i12 = 0;
            while (i12 < size) {
                androidx.fragment.app.h.a aVar = arrayList2.get(i12);
                i12++;
                androidx.fragment.app.c cVar = aVar.b;
                if (cVar != null && (viewGroup = cVar.J) != null) {
                    hashSet.add(androidx.fragment.app.i.u(viewGroup, this));
                }
            }
            i10++;
        }
        return hashSet;
    }

    @NonNull
    public List<androidx.fragment.app.c> z0() {
        return this.f2485c.o();
    }

    public final void z1(RuntimeException runtimeException) {
        Log.e("FragmentManager", runtimeException.getMessage());
        Log.e("FragmentManager", "Activity state:");
        PrintWriter printWriter = new PrintWriter(new e4.m0("FragmentManager"));
        t<?> tVar = this.f2506x;
        if (tVar != null) {
            try {
                tVar.k("  ", null, printWriter, new String[0]);
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
    public static class LaunchedFragmentInfo implements Parcelable {
        public static final Parcelable.Creator<LaunchedFragmentInfo> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f2509a;
        public int b;

        public class a implements Parcelable.Creator<LaunchedFragmentInfo> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public LaunchedFragmentInfo createFromParcel(Parcel parcel) {
                return new LaunchedFragmentInfo(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public LaunchedFragmentInfo[] newArray(int i10) {
                return new LaunchedFragmentInfo[i10];
            }
        }

        public LaunchedFragmentInfo(@NonNull String str, int i10) {
            this.f2509a = str;
            this.b = i10;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            parcel.writeString(this.f2509a);
            parcel.writeInt(this.b);
        }

        public LaunchedFragmentInfo(@NonNull Parcel parcel) {
            this.f2509a = parcel.readString();
            this.b = parcel.readInt();
        }
    }
}
