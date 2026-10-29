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
import androidx.core.view.InputDeviceCompat;
import androidx.core.view.InterfaceC0624o;
import androidx.core.view.InterfaceC0630r;
import androidx.fragment.app.FragmentManager;
import androidx.p616lifecycle.AbstractC0966l;
import androidx.p616lifecycle.C0944b1;
import androidx.p616lifecycle.InterfaceC0947c1;
import androidx.p616lifecycle.InterfaceC0974p;
import androidx.p616lifecycle.InterfaceC0980s;
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
import p067d4.C4435b;
import p068d5.C4442f;
import p068d5.InterfaceC4445i;
import p088e.AbstractC4717m0;
import p088e.BackEventCompat;
import p088e.C4723p0;
import p088e.InterfaceC4727r0;
import p093e4.AbstractC4833r;
import p093e4.AbstractC4835t;
import p093e4.ActivityC4831q;
import p093e4.C4806d0;
import p093e4.C4812g0;
import p093e4.C4824m0;
import p093e4.InterfaceC4808e0;
import p093e4.InterfaceC4810f0;
import p093e4.InterfaceC4830p0;
import p093e4.LayoutInflaterFactory2C4837v;
import p118f4.C5348c;
import p139g.AbstractC5854c;
import p139g.AbstractC5857f;
import p139g.InterfaceC5852a;
import p139g.InterfaceC5858g;
import p154h.AbstractC6248a;
import p154h.C6254g;
import p154h.C6256i;
import p235k2.C7416h;
import p235k2.C7427s;
import p235k2.InterfaceC7423o;
import p235k2.InterfaceC7424p;
import p261l2.InterfaceC7978e;
import p261l2.InterfaceC7979f;
import p533x2.InterfaceC12631a;

/* JADX INFO: loaded from: classes.dex */
public abstract class FragmentManager {

    /* JADX INFO: renamed from: U */
    public static boolean f3260U = false;

    /* JADX INFO: renamed from: V */
    public static boolean f3261V = true;

    /* JADX INFO: renamed from: A */
    public ComponentCallbacksC0929c f3262A;

    /* JADX INFO: renamed from: F */
    public AbstractC5854c<Intent> f3267F;

    /* JADX INFO: renamed from: G */
    public AbstractC5854c<IntentSenderRequest> f3268G;

    /* JADX INFO: renamed from: H */
    public AbstractC5854c<String[]> f3269H;

    /* JADX INFO: renamed from: J */
    public boolean f3271J;

    /* JADX INFO: renamed from: K */
    public boolean f3272K;

    /* JADX INFO: renamed from: L */
    public boolean f3273L;

    /* JADX INFO: renamed from: M */
    public boolean f3274M;

    /* JADX INFO: renamed from: N */
    public boolean f3275N;

    /* JADX INFO: renamed from: O */
    public ArrayList<C0927a> f3276O;

    /* JADX INFO: renamed from: P */
    public ArrayList<Boolean> f3277P;

    /* JADX INFO: renamed from: Q */
    public ArrayList<ComponentCallbacksC0929c> f3278Q;

    /* JADX INFO: renamed from: R */
    public C4806d0 f3279R;

    /* JADX INFO: renamed from: S */
    public C5348c.c f3280S;

    /* JADX INFO: renamed from: b */
    public boolean f3283b;

    /* JADX INFO: renamed from: e */
    public ArrayList<ComponentCallbacksC0929c> f3286e;

    /* JADX INFO: renamed from: g */
    public C4723p0 f3288g;

    /* JADX INFO: renamed from: x */
    public AbstractC4835t<?> f3305x;

    /* JADX INFO: renamed from: y */
    public AbstractC4833r f3306y;

    /* JADX INFO: renamed from: z */
    public ComponentCallbacksC0929c f3307z;

    /* JADX INFO: renamed from: a */
    public final ArrayList<InterfaceC0922o> f3282a = new ArrayList<>();

    /* JADX INFO: renamed from: c */
    public final C4812g0 f3284c = new C4812g0();

    /* JADX INFO: renamed from: d */
    public ArrayList<C0927a> f3285d = new ArrayList<>();

    /* JADX INFO: renamed from: f */
    public final LayoutInflaterFactory2C4837v f3287f = new LayoutInflaterFactory2C4837v(this);

    /* JADX INFO: renamed from: h */
    public C0927a f3289h = null;

    /* JADX INFO: renamed from: i */
    public boolean f3290i = false;

    /* JADX INFO: renamed from: j */
    public final AbstractC4717m0 f3291j = new C0909b(false);

    /* JADX INFO: renamed from: k */
    public final AtomicInteger f3292k = new AtomicInteger();

    /* JADX INFO: renamed from: l */
    public final Map<String, BackStackState> f3293l = Collections.synchronizedMap(new HashMap());

    /* JADX INFO: renamed from: m */
    public final Map<String, Bundle> f3294m = Collections.synchronizedMap(new HashMap());

    /* JADX INFO: renamed from: n */
    public final Map<String, C0920m> f3295n = Collections.synchronizedMap(new HashMap());

    /* JADX INFO: renamed from: o */
    public ArrayList<InterfaceC0921n> f3296o = new ArrayList<>();

    /* JADX INFO: renamed from: p */
    public final C0932f f3297p = new C0932f(this);

    /* JADX INFO: renamed from: q */
    public final CopyOnWriteArrayList<InterfaceC4808e0> f3298q = new CopyOnWriteArrayList<>();

    /* JADX INFO: renamed from: r */
    public final InterfaceC12631a<Configuration> f3299r = new InterfaceC12631a() { // from class: e4.w
        @Override // p533x2.InterfaceC12631a
        public final void accept(Object obj) {
            FragmentManager.m4355f(this.f19517a, (Configuration) obj);
        }
    };

    /* JADX INFO: renamed from: s */
    public final InterfaceC12631a<Integer> f3300s = new InterfaceC12631a() { // from class: e4.x
        @Override // p533x2.InterfaceC12631a
        public final void accept(Object obj) {
            FragmentManager.m4350a(this.f19518a, (Integer) obj);
        }
    };

    /* JADX INFO: renamed from: t */
    public final InterfaceC12631a<C7416h> f3301t = new InterfaceC12631a() { // from class: e4.y
        @Override // p533x2.InterfaceC12631a
        public final void accept(Object obj) {
            FragmentManager.m4354e(this.f19519a, (C7416h) obj);
        }
    };

    /* JADX INFO: renamed from: u */
    public final InterfaceC12631a<C7427s> f3302u = new InterfaceC12631a() { // from class: e4.z
        @Override // p533x2.InterfaceC12631a
        public final void accept(Object obj) {
            FragmentManager.m4353d(this.f19520a, (C7427s) obj);
        }
    };

    /* JADX INFO: renamed from: v */
    public final InterfaceC0630r f3303v = new C0910c();

    /* JADX INFO: renamed from: w */
    public int f3304w = -1;

    /* JADX INFO: renamed from: B */
    public C0931e f3263B = null;

    /* JADX INFO: renamed from: C */
    public C0931e f3264C = new C0911d();

    /* JADX INFO: renamed from: D */
    public InterfaceC4830p0 f3265D = null;

    /* JADX INFO: renamed from: E */
    public InterfaceC4830p0 f3266E = new C0912e();

    /* JADX INFO: renamed from: I */
    public ArrayDeque<LaunchedFragmentInfo> f3270I = new ArrayDeque<>();

    /* JADX INFO: renamed from: T */
    public Runnable f3281T = new RunnableC0913f();

    /* JADX INFO: renamed from: androidx.fragment.app.FragmentManager$a */
    public class C0908a implements InterfaceC5852a<Map<String, Boolean>> {
        public C0908a() {
        }

        /* JADX DEBUG: Method merged with bridge method: a(Ljava/lang/Object;)V */
        @Override // p139g.InterfaceC5852a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void mo4481a(Map<String, Boolean> map) {
            String[] strArr = (String[]) map.keySet().toArray(new String[0]);
            ArrayList arrayList = new ArrayList(map.values());
            int[] iArr = new int[arrayList.size()];
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                iArr[i10] = ((Boolean) arrayList.get(i10)).booleanValue() ? 0 : -1;
            }
            LaunchedFragmentInfo launchedFragmentInfoPollFirst = FragmentManager.this.f3270I.pollFirst();
            if (launchedFragmentInfoPollFirst == null) {
                Log.w("FragmentManager", "No permissions were requested for " + this);
                return;
            }
            String str = launchedFragmentInfoPollFirst.f3308a;
            int i11 = launchedFragmentInfoPollFirst.f3309b;
            ComponentCallbacksC0929c componentCallbacksC0929cM23270i = FragmentManager.this.f3284c.m23270i(str);
            if (componentCallbacksC0929cM23270i != null) {
                componentCallbacksC0929cM23270i.m4654Z0(i11, strArr, iArr);
                return;
            }
            Log.w("FragmentManager", "Permission request result delivered for unknown Fragment " + str);
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.FragmentManager$b */
    public class C0909b extends AbstractC4717m0 {
        public C0909b(boolean z10) {
            super(z10);
        }

        @Override // p088e.AbstractC4717m0
        public void handleOnBackCancelled() {
            if (FragmentManager.m4349N0(3)) {
                Log.d("FragmentManager", "handleOnBackCancelled. PREDICTIVE_BACK = " + FragmentManager.f3261V + " fragment manager " + FragmentManager.this);
            }
            if (FragmentManager.f3261V) {
                FragmentManager.this.m4455s();
            }
        }

        @Override // p088e.AbstractC4717m0
        public void handleOnBackPressed() {
            if (FragmentManager.m4349N0(3)) {
                Log.d("FragmentManager", "handleOnBackPressed. PREDICTIVE_BACK = " + FragmentManager.f3261V + " fragment manager " + FragmentManager.this);
            }
            FragmentManager.this.m4383J0();
        }

        @Override // p088e.AbstractC4717m0
        public void handleOnBackProgressed(@NonNull BackEventCompat backEventCompat) {
            if (FragmentManager.m4349N0(2)) {
                Log.v("FragmentManager", "handleOnBackProgressed. PREDICTIVE_BACK = " + FragmentManager.f3261V + " fragment manager " + FragmentManager.this);
            }
            FragmentManager fragmentManager = FragmentManager.this;
            if (fragmentManager.f3289h != null) {
                int i10 = 0;
                Iterator<AbstractC0935i> it = fragmentManager.m4476z(new ArrayList<>(Collections.singletonList(FragmentManager.this.f3289h)), 0, 1).iterator();
                while (it.hasNext()) {
                    it.next().m4793A(backEventCompat);
                }
                ArrayList<InterfaceC0921n> arrayList = FragmentManager.this.f3296o;
                int size = arrayList.size();
                while (i10 < size) {
                    InterfaceC0921n interfaceC0921n = arrayList.get(i10);
                    i10++;
                    interfaceC0921n.m4494b(backEventCompat);
                }
            }
        }

        @Override // p088e.AbstractC4717m0
        public void handleOnBackStarted(@NonNull BackEventCompat backEventCompat) {
            if (FragmentManager.m4349N0(3)) {
                Log.d("FragmentManager", "handleOnBackStarted. PREDICTIVE_BACK = " + FragmentManager.f3261V + " fragment manager " + FragmentManager.this);
            }
            if (FragmentManager.f3261V) {
                FragmentManager.this.m4419c0();
                FragmentManager.this.m4431i1();
            }
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.FragmentManager$c */
    public class C0910c implements InterfaceC0630r {
        public C0910c() {
        }

        @Override // androidx.core.view.InterfaceC0630r
        /* JADX INFO: renamed from: a */
        public void mo3156a(@NonNull Menu menu) {
            FragmentManager.this.m4393P(menu);
        }

        @Override // androidx.core.view.InterfaceC0630r
        /* JADX INFO: renamed from: b */
        public void mo3157b(@NonNull Menu menu) {
            FragmentManager.this.m4401T(menu);
        }

        @Override // androidx.core.view.InterfaceC0630r
        /* JADX INFO: renamed from: c */
        public boolean mo3158c(@NonNull MenuItem menuItem) {
            return FragmentManager.this.m4391O(menuItem);
        }

        @Override // androidx.core.view.InterfaceC0630r
        /* JADX INFO: renamed from: d */
        public void mo3159d(@NonNull Menu menu, @NonNull MenuInflater menuInflater) {
            FragmentManager.this.m4379H(menu, menuInflater);
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.FragmentManager$d */
    public class C0911d extends C0931e {
        public C0911d() {
        }

        @Override // androidx.fragment.app.C0931e
        @NonNull
        /* JADX INFO: renamed from: a */
        public ComponentCallbacksC0929c mo4483a(@NonNull ClassLoader classLoader, @NonNull String str) {
            return FragmentManager.this.m4365A0().m23371c(FragmentManager.this.m4365A0().getContext(), str, null);
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.FragmentManager$e */
    public class C0912e implements InterfaceC4830p0 {
        public C0912e() {
        }

        @Override // p093e4.InterfaceC4830p0
        @NonNull
        /* JADX INFO: renamed from: a */
        public AbstractC0935i mo4484a(@NonNull ViewGroup viewGroup) {
            return new C0928b(viewGroup);
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.FragmentManager$f */
    public class RunnableC0913f implements Runnable {
        public RunnableC0913f() {
        }

        @Override // java.lang.Runnable
        public void run() {
            FragmentManager.this.m4425f0(true);
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.FragmentManager$g */
    public class C0914g implements InterfaceC0974p {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ String f3316a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ InterfaceC4810f0 f3317b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ AbstractC0966l f3318c;

        /* JADX DEBUG: Incorrect args count in method signature: ()V */
        public C0914g(String str, InterfaceC4810f0 interfaceC4810f0, AbstractC0966l abstractC0966l) {
            this.f3316a = str;
            this.f3317b = interfaceC4810f0;
            this.f3318c = abstractC0966l;
        }

        @Override // androidx.p616lifecycle.InterfaceC0974p
        /* JADX INFO: renamed from: g */
        public void mo1334g(@NonNull InterfaceC0980s interfaceC0980s, @NonNull AbstractC0966l.a aVar) {
            Bundle bundle;
            if (aVar == AbstractC0966l.a.ON_START && (bundle = (Bundle) FragmentManager.this.f3294m.get(this.f3316a)) != null) {
                this.f3317b.mo4490a(this.f3316a, bundle);
                FragmentManager.this.m4470x(this.f3316a);
            }
            if (aVar == AbstractC0966l.a.ON_DESTROY) {
                this.f3318c.mo4938d(this);
                FragmentManager.this.f3295n.remove(this.f3316a);
            }
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.FragmentManager$h */
    public class C0915h implements InterfaceC4808e0 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ComponentCallbacksC0929c f3320a;

        /* JADX DEBUG: Incorrect args count in method signature: ()V */
        public C0915h(ComponentCallbacksC0929c componentCallbacksC0929c) {
            this.f3320a = componentCallbacksC0929c;
        }

        @Override // p093e4.InterfaceC4808e0
        /* JADX INFO: renamed from: b */
        public void mo4485b(@NonNull FragmentManager fragmentManager, @NonNull ComponentCallbacksC0929c componentCallbacksC0929c) {
            this.f3320a.m4593D0(componentCallbacksC0929c);
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.FragmentManager$i */
    public class C0916i implements InterfaceC5852a<ActivityResult> {
        public C0916i() {
        }

        /* JADX DEBUG: Method merged with bridge method: a(Ljava/lang/Object;)V */
        @Override // p139g.InterfaceC5852a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void mo4481a(ActivityResult activityResult) {
            LaunchedFragmentInfo launchedFragmentInfoPollLast = FragmentManager.this.f3270I.pollLast();
            if (launchedFragmentInfoPollLast == null) {
                Log.w("FragmentManager", "No Activities were started for result for " + this);
                return;
            }
            String str = launchedFragmentInfoPollLast.f3308a;
            int i10 = launchedFragmentInfoPollLast.f3309b;
            ComponentCallbacksC0929c componentCallbacksC0929cM23270i = FragmentManager.this.f3284c.m23270i(str);
            if (componentCallbacksC0929cM23270i != null) {
                componentCallbacksC0929cM23270i.mo4584A0(i10, activityResult.getResultCode(), activityResult.getData());
                return;
            }
            Log.w("FragmentManager", "Activity result delivered for unknown Fragment " + str);
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.FragmentManager$j */
    public class C0917j implements InterfaceC5852a<ActivityResult> {
        public C0917j() {
        }

        /* JADX DEBUG: Method merged with bridge method: a(Ljava/lang/Object;)V */
        @Override // p139g.InterfaceC5852a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void mo4481a(ActivityResult activityResult) {
            LaunchedFragmentInfo launchedFragmentInfoPollFirst = FragmentManager.this.f3270I.pollFirst();
            if (launchedFragmentInfoPollFirst == null) {
                Log.w("FragmentManager", "No IntentSenders were started for " + this);
                return;
            }
            String str = launchedFragmentInfoPollFirst.f3308a;
            int i10 = launchedFragmentInfoPollFirst.f3309b;
            ComponentCallbacksC0929c componentCallbacksC0929cM23270i = FragmentManager.this.f3284c.m23270i(str);
            if (componentCallbacksC0929cM23270i != null) {
                componentCallbacksC0929cM23270i.mo4584A0(i10, activityResult.getResultCode(), activityResult.getData());
                return;
            }
            Log.w("FragmentManager", "Intent Sender result delivered for unknown Fragment " + str);
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.FragmentManager$k */
    public static class C0918k extends AbstractC6248a<IntentSenderRequest, ActivityResult> {
        /* JADX DEBUG: Method merged with bridge method: createIntent(Landroid/content/Context;Ljava/lang/Object;)Landroid/content/Intent; */
        @Override // p154h.AbstractC6248a
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
                    intentSenderRequest = new IntentSenderRequest.C0401a(intentSenderRequest.getIntentSender()).m1475b(null).m1476c(intentSenderRequest.getFlagsValues(), intentSenderRequest.getFlagsMask()).m1474a();
                }
            }
            intent.putExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST", intentSenderRequest);
            if (FragmentManager.m4349N0(2)) {
                Log.v("FragmentManager", "CreateIntent created the following intent: " + intent);
            }
            return intent;
        }

        /* JADX DEBUG: Method merged with bridge method: parseResult(ILandroid/content/Intent;)Ljava/lang/Object; */
        @Override // p154h.AbstractC6248a
        @NonNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public ActivityResult parseResult(int i10, Intent intent) {
            return new ActivityResult(i10, intent);
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.FragmentManager$l */
    public static abstract class AbstractC0919l {
    }

    /* JADX INFO: renamed from: androidx.fragment.app.FragmentManager$m */
    public static class C0920m implements InterfaceC4810f0 {

        /* JADX INFO: renamed from: a */
        public final AbstractC0966l f3324a;

        /* JADX INFO: renamed from: b */
        public final InterfaceC4810f0 f3325b;

        /* JADX INFO: renamed from: c */
        public final InterfaceC0974p f3326c;

        public C0920m(@NonNull AbstractC0966l abstractC0966l, @NonNull InterfaceC4810f0 interfaceC4810f0, @NonNull InterfaceC0974p interfaceC0974p) {
            this.f3324a = abstractC0966l;
            this.f3325b = interfaceC4810f0;
            this.f3326c = interfaceC0974p;
        }

        @Override // p093e4.InterfaceC4810f0
        /* JADX INFO: renamed from: a */
        public void mo4490a(@NonNull String str, @NonNull Bundle bundle) {
            this.f3325b.mo4490a(str, bundle);
        }

        /* JADX INFO: renamed from: b */
        public boolean m4491b(AbstractC0966l.b bVar) {
            return this.f3324a.getState().m4945b(bVar);
        }

        /* JADX INFO: renamed from: c */
        public void m4492c() {
            this.f3324a.mo4938d(this.f3326c);
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.FragmentManager$n */
    public interface InterfaceC0921n {
        /* JADX INFO: renamed from: a */
        default void m4493a(@NonNull ComponentCallbacksC0929c componentCallbacksC0929c, boolean z10) {
        }

        /* JADX INFO: renamed from: b */
        default void m4494b(@NonNull BackEventCompat backEventCompat) {
        }

        /* JADX INFO: renamed from: c */
        default void m4495c(@NonNull ComponentCallbacksC0929c componentCallbacksC0929c, boolean z10) {
        }

        /* JADX INFO: renamed from: d */
        default void m4496d() {
        }

        void onBackStackChanged();
    }

    /* JADX INFO: renamed from: androidx.fragment.app.FragmentManager$o */
    public interface InterfaceC0922o {
        /* JADX INFO: renamed from: a */
        boolean mo4497a(@NonNull ArrayList<C0927a> arrayList, @NonNull ArrayList<Boolean> arrayList2);
    }

    /* JADX INFO: renamed from: androidx.fragment.app.FragmentManager$p */
    public class C0923p implements InterfaceC0922o {

        /* JADX INFO: renamed from: a */
        public final String f3327a;

        /* JADX INFO: renamed from: b */
        public final int f3328b;

        /* JADX INFO: renamed from: c */
        public final int f3329c;

        public C0923p(String str, int i10, int i11) {
            this.f3327a = str;
            this.f3328b = i10;
            this.f3329c = i11;
        }

        @Override // androidx.fragment.app.FragmentManager.InterfaceC0922o
        /* JADX INFO: renamed from: a */
        public boolean mo4497a(@NonNull ArrayList<C0927a> arrayList, @NonNull ArrayList<Boolean> arrayList2) {
            ComponentCallbacksC0929c componentCallbacksC0929c = FragmentManager.this.f3262A;
            if (componentCallbacksC0929c == null || this.f3328b >= 0 || this.f3327a != null || !componentCallbacksC0929c.m4709v().m4422d1()) {
                return FragmentManager.this.m4428g1(arrayList, arrayList2, this.f3327a, this.f3328b, this.f3329c);
            }
            return false;
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.FragmentManager$q */
    public class C0924q implements InterfaceC0922o {
        public C0924q() {
        }

        @Override // androidx.fragment.app.FragmentManager.InterfaceC0922o
        /* JADX INFO: renamed from: a */
        public boolean mo4497a(@NonNull ArrayList<C0927a> arrayList, @NonNull ArrayList<Boolean> arrayList2) {
            boolean zM4429h1 = FragmentManager.this.m4429h1(arrayList, arrayList2);
            if (!FragmentManager.this.f3296o.isEmpty() && arrayList.size() > 0) {
                boolean zBooleanValue = arrayList2.get(arrayList.size() - 1).booleanValue();
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                int size = arrayList.size();
                int i10 = 0;
                int i11 = 0;
                while (i11 < size) {
                    C0927a c0927a = arrayList.get(i11);
                    i11++;
                    linkedHashSet.addAll(FragmentManager.this.m4456s0(c0927a));
                }
                ArrayList<InterfaceC0921n> arrayList3 = FragmentManager.this.f3296o;
                int size2 = arrayList3.size();
                while (i10 < size2) {
                    InterfaceC0921n interfaceC0921n = arrayList3.get(i10);
                    i10++;
                    InterfaceC0921n interfaceC0921n2 = interfaceC0921n;
                    Iterator it = linkedHashSet.iterator();
                    while (it.hasNext()) {
                        interfaceC0921n2.m4495c((ComponentCallbacksC0929c) it.next(), zBooleanValue);
                    }
                }
            }
            return zM4429h1;
        }
    }

    /* JADX INFO: renamed from: H0 */
    public static ComponentCallbacksC0929c m4348H0(@NonNull View view) {
        Object tag = view.getTag(C4435b.f18437a);
        if (tag instanceof ComponentCallbacksC0929c) {
            return (ComponentCallbacksC0929c) tag;
        }
        return null;
    }

    /* JADX INFO: renamed from: N0 */
    public static boolean m4349N0(int i10) {
        return f3260U || Log.isLoggable("FragmentManager", i10);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m4350a(FragmentManager fragmentManager, Integer num) {
        if (fragmentManager.m4394P0() && num.intValue() == 80) {
            fragmentManager.m4384K(false);
        }
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m4352c(FragmentManager fragmentManager) {
        ArrayList<InterfaceC0921n> arrayList = fragmentManager.f3296o;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            InterfaceC0921n interfaceC0921n = arrayList.get(i10);
            i10++;
            interfaceC0921n.m4496d();
        }
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m4353d(FragmentManager fragmentManager, C7427s c7427s) {
        if (fragmentManager.m4394P0()) {
            fragmentManager.m4399S(c7427s.getIsInPictureInPictureMode(), false);
        }
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m4354e(FragmentManager fragmentManager, C7416h c7416h) {
        if (fragmentManager.m4394P0()) {
            fragmentManager.m4386L(c7416h.getIsInMultiWindowMode(), false);
        }
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ void m4355f(FragmentManager fragmentManager, Configuration configuration) {
        if (fragmentManager.m4394P0()) {
            fragmentManager.m4373E(configuration, false);
        }
    }

    /* JADX INFO: renamed from: h0 */
    public static void m4358h0(@NonNull ArrayList<C0927a> arrayList, @NonNull ArrayList<Boolean> arrayList2, int i10, int i11) {
        while (i10 < i11) {
            C0927a c0927a = arrayList.get(i10);
            if (arrayList2.get(i10).booleanValue()) {
                c0927a.m4515u(-1);
                c0927a.m4503A();
            } else {
                c0927a.m4515u(1);
                c0927a.m4520z();
            }
            i10++;
        }
    }

    /* JADX INFO: renamed from: o1 */
    public static int m4361o1(int i10) {
        if (i10 == 4097) {
            return InputDeviceCompat.SOURCE_MOUSE;
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
    /* JADX INFO: renamed from: p0 */
    public static FragmentManager m4362p0(@NonNull View view) {
        ActivityC4831q activityC4831q;
        ComponentCallbacksC0929c componentCallbacksC0929cM4363q0 = m4363q0(view);
        if (componentCallbacksC0929cM4363q0 != null) {
            if (componentCallbacksC0929cM4363q0.m4694p0()) {
                return componentCallbacksC0929cM4363q0.m4709v();
            }
            throw new IllegalStateException("The Fragment " + componentCallbacksC0929cM4363q0 + " that owns View " + view + " has already been destroyed. Nested fragments should always use the child FragmentManager.");
        }
        Context context = view.getContext();
        while (true) {
            if (!(context instanceof ContextWrapper)) {
                activityC4831q = null;
                break;
            }
            if (context instanceof ActivityC4831q) {
                activityC4831q = (ActivityC4831q) context;
                break;
            }
            context = ((ContextWrapper) context).getBaseContext();
        }
        if (activityC4831q != null) {
            return activityC4831q.m23360l1();
        }
        throw new IllegalStateException("View " + view + " is not within a subclass of FragmentActivity.");
    }

    /* JADX INFO: renamed from: q0 */
    public static ComponentCallbacksC0929c m4363q0(@NonNull View view) {
        while (view != null) {
            ComponentCallbacksC0929c componentCallbacksC0929cM4348H0 = m4348H0(view);
            if (componentCallbacksC0929cM4348H0 != null) {
                return componentCallbacksC0929cM4348H0;
            }
            Object parent = view.getParent();
            view = parent instanceof View ? (View) parent : null;
        }
        return null;
    }

    @NonNull
    /* JADX INFO: renamed from: A */
    public C0933g m4364A(@NonNull ComponentCallbacksC0929c componentCallbacksC0929c) {
        C0933g c0933gM23275n = this.f3284c.m23275n(componentCallbacksC0929c.f3443f);
        if (c0933gM23275n != null) {
            return c0933gM23275n;
        }
        C0933g c0933g = new C0933g(this.f3297p, this.f3284c, componentCallbacksC0929c);
        c0933g.m4768o(this.f3305x.getContext().getClassLoader());
        c0933g.m4772s(this.f3304w);
        return c0933g;
    }

    @NonNull
    /* JADX INFO: renamed from: A0 */
    public AbstractC4835t<?> m4365A0() {
        return this.f3305x;
    }

    /* JADX INFO: renamed from: A1 */
    public final void m4366A1() {
        synchronized (this.f3282a) {
            try {
                if (!this.f3282a.isEmpty()) {
                    this.f3291j.setEnabled(true);
                    if (m4349N0(3)) {
                        Log.d("FragmentManager", "FragmentManager " + this + " enabling OnBackPressedCallback, caused by non-empty pending actions");
                    }
                    return;
                }
                boolean z10 = m4462u0() > 0 && m4400S0(this.f3307z);
                if (m4349N0(3)) {
                    Log.d("FragmentManager", "OnBackPressedCallback for FragmentManager " + this + " enabled state is " + z10);
                }
                this.f3291j.setEnabled(z10);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: B */
    public void m4367B(@NonNull ComponentCallbacksC0929c componentCallbacksC0929c) {
        if (m4349N0(2)) {
            Log.v("FragmentManager", "detach: " + componentCallbacksC0929c);
        }
        if (componentCallbacksC0929c.f3411D) {
            return;
        }
        componentCallbacksC0929c.f3411D = true;
        if (componentCallbacksC0929c.f3449l) {
            if (m4349N0(2)) {
                Log.v("FragmentManager", "remove from detach: " + componentCallbacksC0929c);
            }
            this.f3284c.m23282u(componentCallbacksC0929c);
            if (m4392O0(componentCallbacksC0929c)) {
                this.f3271J = true;
            }
            m4469w1(componentCallbacksC0929c);
        }
    }

    @NonNull
    /* JADX INFO: renamed from: B0 */
    public LayoutInflater.Factory2 m4368B0() {
        return this.f3287f;
    }

    /* JADX INFO: renamed from: C */
    public void m4369C() {
        this.f3272K = false;
        this.f3273L = false;
        this.f3279R.m23258p(false);
        m4409X(4);
    }

    @NonNull
    /* JADX INFO: renamed from: C0 */
    public C0932f m4370C0() {
        return this.f3297p;
    }

    /* JADX INFO: renamed from: D */
    public void m4371D() {
        this.f3272K = false;
        this.f3273L = false;
        this.f3279R.m23258p(false);
        m4409X(0);
    }

    /* JADX INFO: renamed from: D0 */
    public ComponentCallbacksC0929c m4372D0() {
        return this.f3307z;
    }

    /* JADX INFO: renamed from: E */
    public void m4373E(@NonNull Configuration configuration, boolean z10) {
        if (z10 && (this.f3305x instanceof InterfaceC7978e)) {
            m4478z1(new IllegalStateException("Do not call dispatchConfigurationChanged() on host. Host implements OnConfigurationChangedProvider and automatically dispatches configuration changes to fragments."));
        }
        for (ComponentCallbacksC0929c componentCallbacksC0929c : this.f3284c.m23276o()) {
            if (componentCallbacksC0929c != null) {
                componentCallbacksC0929c.m4675i1(configuration);
                if (z10) {
                    componentCallbacksC0929c.f3461x.m4373E(configuration, true);
                }
            }
        }
    }

    /* JADX INFO: renamed from: E0 */
    public ComponentCallbacksC0929c m4374E0() {
        return this.f3262A;
    }

    /* JADX INFO: renamed from: F */
    public boolean m4375F(@NonNull MenuItem menuItem) {
        if (this.f3304w < 1) {
            return false;
        }
        for (ComponentCallbacksC0929c componentCallbacksC0929c : this.f3284c.m23276o()) {
            if (componentCallbacksC0929c != null && componentCallbacksC0929c.m4678j1(menuItem)) {
                return true;
            }
        }
        return false;
    }

    @NonNull
    /* JADX INFO: renamed from: F0 */
    public InterfaceC4830p0 m4376F0() {
        InterfaceC4830p0 interfaceC4830p0 = this.f3265D;
        if (interfaceC4830p0 != null) {
            return interfaceC4830p0;
        }
        ComponentCallbacksC0929c componentCallbacksC0929c = this.f3307z;
        return componentCallbacksC0929c != null ? componentCallbacksC0929c.f3459v.m4376F0() : this.f3266E;
    }

    /* JADX INFO: renamed from: G */
    public void m4377G() {
        this.f3272K = false;
        this.f3273L = false;
        this.f3279R.m23258p(false);
        m4409X(1);
    }

    /* JADX INFO: renamed from: G0 */
    public C5348c.c m4378G0() {
        return this.f3280S;
    }

    /* JADX INFO: renamed from: H */
    public boolean m4379H(@NonNull Menu menu, @NonNull MenuInflater menuInflater) {
        if (this.f3304w < 1) {
            return false;
        }
        ArrayList<ComponentCallbacksC0929c> arrayList = null;
        boolean z10 = false;
        for (ComponentCallbacksC0929c componentCallbacksC0929c : this.f3284c.m23276o()) {
            if (componentCallbacksC0929c != null && m4398R0(componentCallbacksC0929c) && componentCallbacksC0929c.m4684l1(menu, menuInflater)) {
                if (arrayList == null) {
                    arrayList = new ArrayList<>();
                }
                arrayList.add(componentCallbacksC0929c);
                z10 = true;
            }
        }
        if (this.f3286e != null) {
            for (int i10 = 0; i10 < this.f3286e.size(); i10++) {
                ComponentCallbacksC0929c componentCallbacksC0929c2 = this.f3286e.get(i10);
                if (arrayList == null || !arrayList.contains(componentCallbacksC0929c2)) {
                    componentCallbacksC0929c2.m4615L0();
                }
            }
        }
        this.f3286e = arrayList;
        return z10;
    }

    /* JADX INFO: renamed from: I */
    public void m4380I() {
        this.f3274M = true;
        m4425f0(true);
        m4419c0();
        m4467w();
        m4409X(-1);
        Object obj = this.f3305x;
        if (obj instanceof InterfaceC7979f) {
            ((InterfaceC7979f) obj).mo23056j(this.f3300s);
        }
        Object obj2 = this.f3305x;
        if (obj2 instanceof InterfaceC7978e) {
            ((InterfaceC7978e) obj2).mo23057p0(this.f3299r);
        }
        Object obj3 = this.f3305x;
        if (obj3 instanceof InterfaceC7423o) {
            ((InterfaceC7423o) obj3).mo23059y(this.f3301t);
        }
        Object obj4 = this.f3305x;
        if (obj4 instanceof InterfaceC7424p) {
            ((InterfaceC7424p) obj4).mo23055h0(this.f3302u);
        }
        Object obj5 = this.f3305x;
        if ((obj5 instanceof InterfaceC0624o) && this.f3307z == null) {
            ((InterfaceC0624o) obj5).mo1908R(this.f3303v);
        }
        this.f3305x = null;
        this.f3306y = null;
        this.f3307z = null;
        if (this.f3288g != null) {
            this.f3291j.remove();
            this.f3288g = null;
        }
        AbstractC5854c<Intent> abstractC5854c = this.f3267F;
        if (abstractC5854c != null) {
            abstractC5854c.mo4726d();
            this.f3268G.mo4726d();
            this.f3269H.mo4726d();
        }
    }

    @NonNull
    /* JADX INFO: renamed from: I0 */
    public C0944b1 m4381I0(@NonNull ComponentCallbacksC0929c componentCallbacksC0929c) {
        return this.f3279R.m23255m(componentCallbacksC0929c);
    }

    /* JADX INFO: renamed from: J */
    public void m4382J() {
        m4409X(1);
    }

    /* JADX INFO: renamed from: J0 */
    public void m4383J0() {
        this.f3290i = true;
        m4425f0(true);
        int i10 = 0;
        this.f3290i = false;
        if (!f3261V || this.f3289h == null) {
            if (this.f3291j.getIsEnabled()) {
                if (m4349N0(3)) {
                    Log.d("FragmentManager", "Calling popBackStackImmediate via onBackPressed callback");
                }
                m4422d1();
                return;
            } else {
                if (m4349N0(3)) {
                    Log.d("FragmentManager", "Calling onBackPressed via onBackPressed callback");
                }
                this.f3288g.m23081i();
                return;
            }
        }
        if (!this.f3296o.isEmpty()) {
            LinkedHashSet linkedHashSet = new LinkedHashSet(m4456s0(this.f3289h));
            ArrayList<InterfaceC0921n> arrayList = this.f3296o;
            int size = arrayList.size();
            int i11 = 0;
            while (i11 < size) {
                InterfaceC0921n interfaceC0921n = arrayList.get(i11);
                i11++;
                InterfaceC0921n interfaceC0921n2 = interfaceC0921n;
                Iterator it = linkedHashSet.iterator();
                while (it.hasNext()) {
                    interfaceC0921n2.m4493a((ComponentCallbacksC0929c) it.next(), true);
                }
            }
        }
        ArrayList<AbstractC0934h.a> arrayList2 = this.f3289h.f3523c;
        int size2 = arrayList2.size();
        int i12 = 0;
        while (i12 < size2) {
            AbstractC0934h.a aVar = arrayList2.get(i12);
            i12++;
            ComponentCallbacksC0929c componentCallbacksC0929c = aVar.f3541b;
            if (componentCallbacksC0929c != null) {
                componentCallbacksC0929c.f3451n = false;
            }
        }
        Iterator<AbstractC0935i> it2 = m4476z(new ArrayList<>(Collections.singletonList(this.f3289h)), 0, 1).iterator();
        while (it2.hasNext()) {
            it2.next().m4799f();
        }
        ArrayList<AbstractC0934h.a> arrayList3 = this.f3289h.f3523c;
        int size3 = arrayList3.size();
        while (i10 < size3) {
            AbstractC0934h.a aVar2 = arrayList3.get(i10);
            i10++;
            ComponentCallbacksC0929c componentCallbacksC0929c2 = aVar2.f3541b;
            if (componentCallbacksC0929c2 != null && componentCallbacksC0929c2.f3417J == null) {
                m4364A(componentCallbacksC0929c2).m4766m();
            }
        }
        this.f3289h = null;
        m4366A1();
        if (m4349N0(3)) {
            Log.d("FragmentManager", "Op is being set to null");
            Log.d("FragmentManager", "OnBackPressedCallback enabled=" + this.f3291j.getIsEnabled() + " for  FragmentManager " + this);
        }
    }

    /* JADX INFO: renamed from: K */
    public void m4384K(boolean z10) {
        if (z10 && (this.f3305x instanceof InterfaceC7979f)) {
            m4478z1(new IllegalStateException("Do not call dispatchLowMemory() on host. Host implements OnTrimMemoryProvider and automatically dispatches low memory callbacks to fragments."));
        }
        for (ComponentCallbacksC0929c componentCallbacksC0929c : this.f3284c.m23276o()) {
            if (componentCallbacksC0929c != null) {
                componentCallbacksC0929c.m4700r1();
                if (z10) {
                    componentCallbacksC0929c.f3461x.m4384K(true);
                }
            }
        }
    }

    /* JADX INFO: renamed from: K0 */
    public void m4385K0(@NonNull ComponentCallbacksC0929c componentCallbacksC0929c) {
        if (m4349N0(2)) {
            Log.v("FragmentManager", "hide: " + componentCallbacksC0929c);
        }
        if (componentCallbacksC0929c.f3410C) {
            return;
        }
        componentCallbacksC0929c.f3410C = true;
        componentCallbacksC0929c.f3424Q = true ^ componentCallbacksC0929c.f3424Q;
        m4469w1(componentCallbacksC0929c);
    }

    /* JADX INFO: renamed from: L */
    public void m4386L(boolean z10, boolean z11) {
        if (z11 && (this.f3305x instanceof InterfaceC7423o)) {
            m4478z1(new IllegalStateException("Do not call dispatchMultiWindowModeChanged() on host. Host implements OnMultiWindowModeChangedProvider and automatically dispatches multi-window mode changes to fragments."));
        }
        for (ComponentCallbacksC0929c componentCallbacksC0929c : this.f3284c.m23276o()) {
            if (componentCallbacksC0929c != null) {
                componentCallbacksC0929c.m4703s1(z10);
                if (z11) {
                    componentCallbacksC0929c.f3461x.m4386L(z10, true);
                }
            }
        }
    }

    /* JADX INFO: renamed from: L0 */
    public void m4387L0(@NonNull ComponentCallbacksC0929c componentCallbacksC0929c) {
        if (componentCallbacksC0929c.f3449l && m4392O0(componentCallbacksC0929c)) {
            this.f3271J = true;
        }
    }

    /* JADX INFO: renamed from: M */
    public void m4388M(@NonNull ComponentCallbacksC0929c componentCallbacksC0929c) {
        Iterator<InterfaceC4808e0> it = this.f3298q.iterator();
        while (it.hasNext()) {
            it.next().mo4485b(this, componentCallbacksC0929c);
        }
    }

    /* JADX INFO: renamed from: M0 */
    public boolean m4389M0() {
        return this.f3274M;
    }

    /* JADX INFO: renamed from: N */
    public void m4390N() {
        for (ComponentCallbacksC0929c componentCallbacksC0929c : this.f3284c.m23273l()) {
            if (componentCallbacksC0929c != null) {
                componentCallbacksC0929c.mo4627P0(componentCallbacksC0929c.m4699r0());
                componentCallbacksC0929c.f3461x.m4390N();
            }
        }
    }

    /* JADX INFO: renamed from: O */
    public boolean m4391O(@NonNull MenuItem menuItem) {
        if (this.f3304w < 1) {
            return false;
        }
        for (ComponentCallbacksC0929c componentCallbacksC0929c : this.f3284c.m23276o()) {
            if (componentCallbacksC0929c != null && componentCallbacksC0929c.m4706t1(menuItem)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: O0 */
    public final boolean m4392O0(@NonNull ComponentCallbacksC0929c componentCallbacksC0929c) {
        return (componentCallbacksC0929c.f3414G && componentCallbacksC0929c.f3415H) || componentCallbacksC0929c.f3461x.m4458t();
    }

    /* JADX INFO: renamed from: P */
    public void m4393P(@NonNull Menu menu) {
        if (this.f3304w < 1) {
            return;
        }
        for (ComponentCallbacksC0929c componentCallbacksC0929c : this.f3284c.m23276o()) {
            if (componentCallbacksC0929c != null) {
                componentCallbacksC0929c.m4708u1(menu);
            }
        }
    }

    /* JADX INFO: renamed from: P0 */
    public final boolean m4394P0() {
        ComponentCallbacksC0929c componentCallbacksC0929c = this.f3307z;
        if (componentCallbacksC0929c == null) {
            return true;
        }
        return componentCallbacksC0929c.m4694p0() && this.f3307z.m4617M().m4394P0();
    }

    /* JADX INFO: renamed from: Q */
    public final void m4395Q(ComponentCallbacksC0929c componentCallbacksC0929c) {
        if (componentCallbacksC0929c == null || !componentCallbacksC0929c.equals(m4435k0(componentCallbacksC0929c.f3443f))) {
            return;
        }
        componentCallbacksC0929c.m4720y1();
    }

    /* JADX INFO: renamed from: Q0 */
    public boolean m4396Q0(ComponentCallbacksC0929c componentCallbacksC0929c) {
        if (componentCallbacksC0929c == null) {
            return false;
        }
        return componentCallbacksC0929c.m4699r0();
    }

    /* JADX INFO: renamed from: R */
    public void m4397R() {
        m4409X(5);
    }

    /* JADX INFO: renamed from: R0 */
    public boolean m4398R0(ComponentCallbacksC0929c componentCallbacksC0929c) {
        if (componentCallbacksC0929c == null) {
            return true;
        }
        return componentCallbacksC0929c.m4705t0();
    }

    /* JADX INFO: renamed from: S */
    public void m4399S(boolean z10, boolean z11) {
        if (z11 && (this.f3305x instanceof InterfaceC7424p)) {
            m4478z1(new IllegalStateException("Do not call dispatchPictureInPictureModeChanged() on host. Host implements OnPictureInPictureModeChangedProvider and automatically dispatches picture-in-picture mode changes to fragments."));
        }
        for (ComponentCallbacksC0929c componentCallbacksC0929c : this.f3284c.m23276o()) {
            if (componentCallbacksC0929c != null) {
                componentCallbacksC0929c.m4714w1(z10);
                if (z11) {
                    componentCallbacksC0929c.f3461x.m4399S(z10, true);
                }
            }
        }
    }

    /* JADX INFO: renamed from: S0 */
    public boolean m4400S0(ComponentCallbacksC0929c componentCallbacksC0929c) {
        if (componentCallbacksC0929c == null) {
            return true;
        }
        FragmentManager fragmentManager = componentCallbacksC0929c.f3459v;
        return componentCallbacksC0929c.equals(fragmentManager.m4374E0()) && m4400S0(fragmentManager.f3307z);
    }

    /* JADX INFO: renamed from: T */
    public boolean m4401T(@NonNull Menu menu) {
        boolean z10 = false;
        if (this.f3304w < 1) {
            return false;
        }
        for (ComponentCallbacksC0929c componentCallbacksC0929c : this.f3284c.m23276o()) {
            if (componentCallbacksC0929c != null && m4398R0(componentCallbacksC0929c) && componentCallbacksC0929c.m4717x1(menu)) {
                z10 = true;
            }
        }
        return z10;
    }

    /* JADX INFO: renamed from: T0 */
    public boolean m4402T0(int i10) {
        return this.f3304w >= i10;
    }

    /* JADX INFO: renamed from: U */
    public void m4403U() {
        m4366A1();
        m4395Q(this.f3262A);
    }

    /* JADX INFO: renamed from: U0 */
    public boolean m4404U0() {
        return this.f3272K || this.f3273L;
    }

    /* JADX INFO: renamed from: V */
    public void m4405V() {
        this.f3272K = false;
        this.f3273L = false;
        this.f3279R.m23258p(false);
        m4409X(7);
    }

    /* JADX INFO: renamed from: V0 */
    public void m4406V0(@NonNull ComponentCallbacksC0929c componentCallbacksC0929c, @NonNull Intent intent, int i10, Bundle bundle) {
        if (this.f3267F == null) {
            this.f3305x.m23390n(componentCallbacksC0929c, intent, i10, bundle);
            return;
        }
        this.f3270I.addLast(new LaunchedFragmentInfo(componentCallbacksC0929c.f3443f, i10));
        if (bundle != null) {
            intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundle);
        }
        this.f3267F.m26240b(intent);
    }

    /* JADX INFO: renamed from: W */
    public void m4407W() {
        this.f3272K = false;
        this.f3273L = false;
        this.f3279R.m23258p(false);
        m4409X(5);
    }

    /* JADX INFO: renamed from: W0 */
    public void m4408W0(int i10, boolean z10) {
        AbstractC4835t<?> abstractC4835t;
        if (this.f3305x == null && i10 != -1) {
            throw new IllegalStateException("No activity");
        }
        if (z10 || i10 != this.f3304w) {
            this.f3304w = i10;
            this.f3284c.m23281t();
            m4475y1();
            if (this.f3271J && (abstractC4835t = this.f3305x) != null && this.f3304w == 7) {
                abstractC4835t.mo23368o();
                this.f3271J = false;
            }
        }
    }

    /* JADX INFO: renamed from: X */
    public final void m4409X(int i10) {
        try {
            this.f3283b = true;
            this.f3284c.m23265d(i10);
            m4408W0(i10, false);
            Iterator<AbstractC0935i> it = m4473y().iterator();
            while (it.hasNext()) {
                it.next().m4808q();
            }
            this.f3283b = false;
            m4425f0(true);
        } catch (Throwable th2) {
            this.f3283b = false;
            throw th2;
        }
    }

    /* JADX INFO: renamed from: X0 */
    public void m4410X0() {
        if (this.f3305x == null) {
            return;
        }
        this.f3272K = false;
        this.f3273L = false;
        this.f3279R.m23258p(false);
        for (ComponentCallbacksC0929c componentCallbacksC0929c : this.f3284c.m23276o()) {
            if (componentCallbacksC0929c != null) {
                componentCallbacksC0929c.m4719y0();
            }
        }
    }

    /* JADX INFO: renamed from: Y */
    public void m4411Y() {
        this.f3273L = true;
        this.f3279R.m23258p(true);
        m4409X(4);
    }

    /* JADX INFO: renamed from: Y0 */
    public final void m4412Y0(@NonNull FragmentContainerView fragmentContainerView) {
        View view;
        for (C0933g c0933g : this.f3284c.m23272k()) {
            ComponentCallbacksC0929c componentCallbacksC0929cM4764k = c0933g.m4764k();
            if (componentCallbacksC0929cM4764k.f3408A == fragmentContainerView.getId() && (view = componentCallbacksC0929cM4764k.f3418K) != null && view.getParent() == null) {
                componentCallbacksC0929cM4764k.f3417J = fragmentContainerView;
                c0933g.m4755b();
                c0933g.m4766m();
            }
        }
    }

    /* JADX INFO: renamed from: Z */
    public void m4413Z() {
        m4409X(2);
    }

    /* JADX INFO: renamed from: Z0 */
    public void m4414Z0(@NonNull C0933g c0933g) {
        ComponentCallbacksC0929c componentCallbacksC0929cM4764k = c0933g.m4764k();
        if (componentCallbacksC0929cM4764k.f3419L) {
            if (this.f3283b) {
                this.f3275N = true;
            } else {
                componentCallbacksC0929cM4764k.f3419L = false;
                c0933g.m4766m();
            }
        }
    }

    /* JADX INFO: renamed from: a0 */
    public final void m4415a0() {
        if (this.f3275N) {
            this.f3275N = false;
            m4475y1();
        }
    }

    /* JADX INFO: renamed from: a1 */
    public void m4416a1() {
        m4421d0(new C0923p(null, -1, 0), false);
    }

    /* JADX INFO: renamed from: b0 */
    public void m4417b0(@NonNull String str, FileDescriptor fileDescriptor, @NonNull PrintWriter printWriter, String[] strArr) {
        int size;
        String str2 = str + "    ";
        this.f3284c.m23266e(str, fileDescriptor, printWriter, strArr);
        ArrayList<ComponentCallbacksC0929c> arrayList = this.f3286e;
        if (arrayList != null && (size = arrayList.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Fragments Created Menus:");
            for (int i10 = 0; i10 < size; i10++) {
                ComponentCallbacksC0929c componentCallbacksC0929c = this.f3286e.get(i10);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i10);
                printWriter.print(": ");
                printWriter.println(componentCallbacksC0929c.toString());
            }
        }
        int size2 = this.f3285d.size();
        if (size2 > 0) {
            printWriter.print(str);
            printWriter.println("Back Stack:");
            for (int i11 = 0; i11 < size2; i11++) {
                C0927a c0927a = this.f3285d.get(i11);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i11);
                printWriter.print(": ");
                printWriter.println(c0927a.toString());
                c0927a.m4518x(str2, printWriter);
            }
        }
        printWriter.print(str);
        printWriter.println("Back Stack Index: " + this.f3292k.get());
        synchronized (this.f3282a) {
            try {
                int size3 = this.f3282a.size();
                if (size3 > 0) {
                    printWriter.print(str);
                    printWriter.println("Pending Actions:");
                    for (int i12 = 0; i12 < size3; i12++) {
                        InterfaceC0922o interfaceC0922o = this.f3282a.get(i12);
                        printWriter.print(str);
                        printWriter.print("  #");
                        printWriter.print(i12);
                        printWriter.print(": ");
                        printWriter.println(interfaceC0922o);
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
        printWriter.println(this.f3305x);
        printWriter.print(str);
        printWriter.print("  mContainer=");
        printWriter.println(this.f3306y);
        if (this.f3307z != null) {
            printWriter.print(str);
            printWriter.print("  mParent=");
            printWriter.println(this.f3307z);
        }
        printWriter.print(str);
        printWriter.print("  mCurState=");
        printWriter.print(this.f3304w);
        printWriter.print(" mStateSaved=");
        printWriter.print(this.f3272K);
        printWriter.print(" mStopped=");
        printWriter.print(this.f3273L);
        printWriter.print(" mDestroyed=");
        printWriter.println(this.f3274M);
        if (this.f3271J) {
            printWriter.print(str);
            printWriter.print("  mNeedMenuInvalidate=");
            printWriter.println(this.f3271J);
        }
    }

    /* JADX INFO: renamed from: b1 */
    public void m4418b1(int i10, int i11, boolean z10) {
        if (i10 >= 0) {
            m4421d0(new C0923p(null, i10, i11), z10);
            return;
        }
        throw new IllegalArgumentException("Bad id: " + i10);
    }

    /* JADX INFO: renamed from: c0 */
    public final void m4419c0() {
        Iterator<AbstractC0935i> it = m4473y().iterator();
        while (it.hasNext()) {
            it.next().m4808q();
        }
    }

    /* JADX INFO: renamed from: c1 */
    public void m4420c1(String str, int i10) {
        m4421d0(new C0923p(str, -1, i10), false);
    }

    /* JADX INFO: renamed from: d0 */
    public void m4421d0(@NonNull InterfaceC0922o interfaceC0922o, boolean z10) {
        if (!z10) {
            if (this.f3305x == null) {
                if (!this.f3274M) {
                    throw new IllegalStateException("FragmentManager has not been attached to a host.");
                }
                throw new IllegalStateException("FragmentManager has been destroyed");
            }
            m4461u();
        }
        synchronized (this.f3282a) {
            try {
                if (this.f3305x == null) {
                    if (!z10) {
                        throw new IllegalStateException("Activity has been destroyed");
                    }
                } else {
                    this.f3282a.add(interfaceC0922o);
                    m4451q1();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: d1 */
    public boolean m4422d1() {
        return m4426f1(null, -1, 0);
    }

    /* JADX INFO: renamed from: e0 */
    public final void m4423e0(boolean z10) {
        if (this.f3283b) {
            throw new IllegalStateException("FragmentManager is already executing transactions");
        }
        if (this.f3305x == null) {
            if (!this.f3274M) {
                throw new IllegalStateException("FragmentManager has not been attached to a host.");
            }
            throw new IllegalStateException("FragmentManager has been destroyed");
        }
        if (Looper.myLooper() != this.f3305x.getHandler().getLooper()) {
            throw new IllegalStateException("Must be called from main thread of fragment host");
        }
        if (!z10) {
            m4461u();
        }
        if (this.f3276O == null) {
            this.f3276O = new ArrayList<>();
            this.f3277P = new ArrayList<>();
        }
    }

    /* JADX INFO: renamed from: e1 */
    public boolean m4424e1(int i10, int i11) {
        if (i10 >= 0) {
            return m4426f1(null, i10, i11);
        }
        throw new IllegalArgumentException("Bad id: " + i10);
    }

    /* JADX INFO: renamed from: f0 */
    public boolean m4425f0(boolean z10) {
        C0927a c0927a;
        m4423e0(z10);
        boolean z11 = false;
        if (!this.f3290i && (c0927a = this.f3289h) != null) {
            c0927a.f3356u = false;
            c0927a.m4516v();
            if (m4349N0(3)) {
                Log.d("FragmentManager", "Reversing mTransitioningOp " + this.f3289h + " as part of execPendingActions for actions " + this.f3282a);
            }
            this.f3289h.m4517w(false, false);
            this.f3282a.add(0, this.f3289h);
            ArrayList<AbstractC0934h.a> arrayList = this.f3289h.f3523c;
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                AbstractC0934h.a aVar = arrayList.get(i10);
                i10++;
                ComponentCallbacksC0929c componentCallbacksC0929c = aVar.f3541b;
                if (componentCallbacksC0929c != null) {
                    componentCallbacksC0929c.f3451n = false;
                }
            }
            this.f3289h = null;
        }
        while (m4459t0(this.f3276O, this.f3277P)) {
            z11 = true;
            this.f3283b = true;
            try {
                m4436k1(this.f3276O, this.f3277P);
                m4464v();
            } catch (Throwable th2) {
                m4464v();
                throw th2;
            }
        }
        m4366A1();
        m4415a0();
        this.f3284c.m23263b();
        return z11;
    }

    /* JADX INFO: renamed from: f1 */
    public final boolean m4426f1(String str, int i10, int i11) {
        m4425f0(false);
        m4423e0(true);
        ComponentCallbacksC0929c componentCallbacksC0929c = this.f3262A;
        if (componentCallbacksC0929c != null && i10 < 0 && str == null && componentCallbacksC0929c.m4709v().m4422d1()) {
            return true;
        }
        boolean zM4428g1 = m4428g1(this.f3276O, this.f3277P, str, i10, i11);
        if (zM4428g1) {
            this.f3283b = true;
            try {
                m4436k1(this.f3276O, this.f3277P);
                m4464v();
            } catch (Throwable th2) {
                m4464v();
                throw th2;
            }
        }
        m4366A1();
        m4415a0();
        this.f3284c.m23263b();
        return zM4428g1;
    }

    /* JADX INFO: renamed from: g0 */
    public void m4427g0(@NonNull InterfaceC0922o interfaceC0922o, boolean z10) {
        if (z10 && (this.f3305x == null || this.f3274M)) {
            return;
        }
        m4423e0(z10);
        C0927a c0927a = this.f3289h;
        boolean z11 = false;
        if (c0927a != null) {
            c0927a.f3356u = false;
            c0927a.m4516v();
            if (m4349N0(3)) {
                Log.d("FragmentManager", "Reversing mTransitioningOp " + this.f3289h + " as part of execSingleAction for action " + interfaceC0922o);
            }
            this.f3289h.m4517w(false, false);
            boolean zMo4497a = this.f3289h.mo4497a(this.f3276O, this.f3277P);
            ArrayList<AbstractC0934h.a> arrayList = this.f3289h.f3523c;
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                AbstractC0934h.a aVar = arrayList.get(i10);
                i10++;
                ComponentCallbacksC0929c componentCallbacksC0929c = aVar.f3541b;
                if (componentCallbacksC0929c != null) {
                    componentCallbacksC0929c.f3451n = false;
                }
            }
            this.f3289h = null;
            z11 = zMo4497a;
        }
        boolean zMo4497a2 = interfaceC0922o.mo4497a(this.f3276O, this.f3277P);
        if (z11 || zMo4497a2) {
            this.f3283b = true;
            try {
                m4436k1(this.f3276O, this.f3277P);
                m4464v();
            } catch (Throwable th2) {
                m4464v();
                throw th2;
            }
        }
        m4366A1();
        m4415a0();
        this.f3284c.m23263b();
    }

    /* JADX INFO: renamed from: g1 */
    public boolean m4428g1(@NonNull ArrayList<C0927a> arrayList, @NonNull ArrayList<Boolean> arrayList2, String str, int i10, int i11) {
        int iM4438l0 = m4438l0(str, i10, (i11 & 1) != 0);
        if (iM4438l0 < 0) {
            return false;
        }
        for (int size = this.f3285d.size() - 1; size >= iM4438l0; size--) {
            arrayList.add(this.f3285d.remove(size));
            arrayList2.add(Boolean.TRUE);
        }
        return true;
    }

    /* JADX INFO: renamed from: h1 */
    public boolean m4429h1(@NonNull ArrayList<C0927a> arrayList, @NonNull ArrayList<Boolean> arrayList2) {
        if (m4349N0(2)) {
            Log.v("FragmentManager", "FragmentManager has the following pending actions inside of prepareBackStackState: " + this.f3282a);
        }
        int i10 = 0;
        if (this.f3285d.isEmpty()) {
            Log.i("FragmentManager", "Ignoring call to start back stack pop because the back stack is empty.");
            return false;
        }
        ArrayList<C0927a> arrayList3 = this.f3285d;
        C0927a c0927a = arrayList3.get(arrayList3.size() - 1);
        this.f3289h = c0927a;
        ArrayList<AbstractC0934h.a> arrayList4 = c0927a.f3523c;
        int size = arrayList4.size();
        while (i10 < size) {
            AbstractC0934h.a aVar = arrayList4.get(i10);
            i10++;
            ComponentCallbacksC0929c componentCallbacksC0929c = aVar.f3541b;
            if (componentCallbacksC0929c != null) {
                componentCallbacksC0929c.f3451n = true;
            }
        }
        return m4428g1(arrayList, arrayList2, null, -1, 0);
    }

    /* JADX INFO: renamed from: i0 */
    public final void m4430i0(@NonNull ArrayList<C0927a> arrayList, @NonNull ArrayList<Boolean> arrayList2, int i10, int i11) {
        boolean z10 = arrayList.get(i10).f3538r;
        ArrayList<ComponentCallbacksC0929c> arrayList3 = this.f3278Q;
        if (arrayList3 == null) {
            this.f3278Q = new ArrayList<>();
        } else {
            arrayList3.clear();
        }
        this.f3278Q.addAll(this.f3284c.m23276o());
        ComponentCallbacksC0929c componentCallbacksC0929cM4374E0 = m4374E0();
        boolean z11 = false;
        for (int i12 = i10; i12 < i11; i12++) {
            C0927a c0927a = arrayList.get(i12);
            componentCallbacksC0929cM4374E0 = !arrayList2.get(i12).booleanValue() ? c0927a.m4504B(this.f3278Q, componentCallbacksC0929cM4374E0) : c0927a.m4507E(this.f3278Q, componentCallbacksC0929cM4374E0);
            z11 = z11 || c0927a.f3529i;
        }
        this.f3278Q.clear();
        if (!z10 && this.f3304w >= 1) {
            for (int i13 = i10; i13 < i11; i13++) {
                ArrayList<AbstractC0934h.a> arrayList4 = arrayList.get(i13).f3523c;
                int size = arrayList4.size();
                int i14 = 0;
                while (i14 < size) {
                    AbstractC0934h.a aVar = arrayList4.get(i14);
                    i14++;
                    ComponentCallbacksC0929c componentCallbacksC0929c = aVar.f3541b;
                    if (componentCallbacksC0929c != null && componentCallbacksC0929c.f3459v != null) {
                        this.f3284c.m23279r(m4364A(componentCallbacksC0929c));
                    }
                }
            }
        }
        m4358h0(arrayList, arrayList2, i10, i11);
        boolean zBooleanValue = arrayList2.get(i11 - 1).booleanValue();
        if (z11 && !this.f3296o.isEmpty()) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            int size2 = arrayList.size();
            int i15 = 0;
            while (i15 < size2) {
                C0927a c0927a2 = arrayList.get(i15);
                i15++;
                linkedHashSet.addAll(m4456s0(c0927a2));
            }
            if (this.f3289h == null) {
                ArrayList<InterfaceC0921n> arrayList5 = this.f3296o;
                int size3 = arrayList5.size();
                int i16 = 0;
                while (i16 < size3) {
                    InterfaceC0921n interfaceC0921n = arrayList5.get(i16);
                    i16++;
                    InterfaceC0921n interfaceC0921n2 = interfaceC0921n;
                    Iterator it = linkedHashSet.iterator();
                    while (it.hasNext()) {
                        interfaceC0921n2.m4495c((ComponentCallbacksC0929c) it.next(), zBooleanValue);
                    }
                }
                ArrayList<InterfaceC0921n> arrayList6 = this.f3296o;
                int size4 = arrayList6.size();
                int i17 = 0;
                while (i17 < size4) {
                    InterfaceC0921n interfaceC0921n3 = arrayList6.get(i17);
                    i17++;
                    InterfaceC0921n interfaceC0921n4 = interfaceC0921n3;
                    Iterator it2 = linkedHashSet.iterator();
                    while (it2.hasNext()) {
                        interfaceC0921n4.m4493a((ComponentCallbacksC0929c) it2.next(), zBooleanValue);
                    }
                }
            }
        }
        for (int i18 = i10; i18 < i11; i18++) {
            C0927a c0927a3 = arrayList.get(i18);
            if (zBooleanValue) {
                for (int size5 = c0927a3.f3523c.size() - 1; size5 >= 0; size5--) {
                    ComponentCallbacksC0929c componentCallbacksC0929c2 = c0927a3.f3523c.get(size5).f3541b;
                    if (componentCallbacksC0929c2 != null) {
                        m4364A(componentCallbacksC0929c2).m4766m();
                    }
                }
            } else {
                ArrayList<AbstractC0934h.a> arrayList7 = c0927a3.f3523c;
                int size6 = arrayList7.size();
                int i19 = 0;
                while (i19 < size6) {
                    AbstractC0934h.a aVar2 = arrayList7.get(i19);
                    i19++;
                    ComponentCallbacksC0929c componentCallbacksC0929c3 = aVar2.f3541b;
                    if (componentCallbacksC0929c3 != null) {
                        m4364A(componentCallbacksC0929c3).m4766m();
                    }
                }
            }
        }
        m4408W0(this.f3304w, true);
        for (AbstractC0935i abstractC0935i : m4476z(arrayList, i10, i11)) {
            abstractC0935i.m4796D(zBooleanValue);
            abstractC0935i.m4815z();
            abstractC0935i.m4805n();
        }
        while (i10 < i11) {
            C0927a c0927a4 = arrayList.get(i10);
            if (arrayList2.get(i10).booleanValue() && c0927a4.f3357v >= 0) {
                c0927a4.f3357v = -1;
            }
            c0927a4.m4506D();
            i10++;
        }
        if (z11) {
            m4442m1();
        }
    }

    /* JADX INFO: renamed from: i1 */
    public void m4431i1() {
        m4421d0(new C0924q(), false);
    }

    /* JADX INFO: renamed from: j0 */
    public boolean m4432j0() {
        boolean zM4425f0 = m4425f0(true);
        m4453r0();
        return zM4425f0;
    }

    /* JADX INFO: renamed from: j1 */
    public void m4433j1(@NonNull ComponentCallbacksC0929c componentCallbacksC0929c) {
        if (m4349N0(2)) {
            Log.v("FragmentManager", "remove: " + componentCallbacksC0929c + " nesting=" + componentCallbacksC0929c.f3458u);
        }
        boolean zM4702s0 = componentCallbacksC0929c.m4702s0();
        if (componentCallbacksC0929c.f3411D && zM4702s0) {
            return;
        }
        this.f3284c.m23282u(componentCallbacksC0929c);
        if (m4392O0(componentCallbacksC0929c)) {
            this.f3271J = true;
        }
        componentCallbacksC0929c.f3450m = true;
        m4469w1(componentCallbacksC0929c);
    }

    /* JADX INFO: renamed from: k */
    public void m4434k(C0927a c0927a) {
        this.f3285d.add(c0927a);
    }

    /* JADX INFO: renamed from: k0 */
    public ComponentCallbacksC0929c m4435k0(@NonNull String str) {
        return this.f3284c.m23267f(str);
    }

    /* JADX INFO: renamed from: k1 */
    public final void m4436k1(@NonNull ArrayList<C0927a> arrayList, @NonNull ArrayList<Boolean> arrayList2) {
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
            if (!arrayList.get(i10).f3538r) {
                if (i11 != i10) {
                    m4430i0(arrayList, arrayList2, i11, i10);
                }
                i11 = i10 + 1;
                if (arrayList2.get(i10).booleanValue()) {
                    while (i11 < size && arrayList2.get(i11).booleanValue() && !arrayList.get(i11).f3538r) {
                        i11++;
                    }
                }
                m4430i0(arrayList, arrayList2, i10, i11);
                i10 = i11 - 1;
            }
            i10++;
        }
        if (i11 != size) {
            m4430i0(arrayList, arrayList2, i11, size);
        }
    }

    /* JADX INFO: renamed from: l */
    public C0933g m4437l(@NonNull ComponentCallbacksC0929c componentCallbacksC0929c) {
        String str = componentCallbacksC0929c.f3427T;
        if (str != null) {
            C5348c.m24676f(componentCallbacksC0929c, str);
        }
        if (m4349N0(2)) {
            Log.v("FragmentManager", "add: " + componentCallbacksC0929c);
        }
        C0933g c0933gM4364A = m4364A(componentCallbacksC0929c);
        componentCallbacksC0929c.f3459v = this;
        this.f3284c.m23279r(c0933gM4364A);
        if (!componentCallbacksC0929c.f3411D) {
            this.f3284c.m23262a(componentCallbacksC0929c);
            componentCallbacksC0929c.f3450m = false;
            if (componentCallbacksC0929c.f3418K == null) {
                componentCallbacksC0929c.f3424Q = false;
            }
            if (m4392O0(componentCallbacksC0929c)) {
                this.f3271J = true;
            }
        }
        return c0933gM4364A;
    }

    /* JADX INFO: renamed from: l0 */
    public final int m4438l0(String str, int i10, boolean z10) {
        if (this.f3285d.isEmpty()) {
            return -1;
        }
        if (str == null && i10 < 0) {
            if (z10) {
                return 0;
            }
            return this.f3285d.size() - 1;
        }
        int size = this.f3285d.size() - 1;
        while (size >= 0) {
            C0927a c0927a = this.f3285d.get(size);
            if ((str != null && str.equals(c0927a.m4505C())) || (i10 >= 0 && i10 == c0927a.f3357v)) {
                break;
            }
            size--;
        }
        if (size < 0) {
            return size;
        }
        if (!z10) {
            if (size == this.f3285d.size() - 1) {
                return -1;
            }
            return size + 1;
        }
        while (size > 0) {
            C0927a c0927a2 = this.f3285d.get(size - 1);
            if ((str == null || !str.equals(c0927a2.m4505C())) && (i10 < 0 || i10 != c0927a2.f3357v)) {
                break;
            }
            size--;
        }
        return size;
    }

    /* JADX INFO: renamed from: l1 */
    public void m4439l1(@NonNull ComponentCallbacksC0929c componentCallbacksC0929c) {
        this.f3279R.m23257o(componentCallbacksC0929c);
    }

    /* JADX INFO: renamed from: m */
    public void m4440m(@NonNull InterfaceC4808e0 interfaceC4808e0) {
        this.f3298q.add(interfaceC4808e0);
    }

    /* JADX INFO: renamed from: m0 */
    public ComponentCallbacksC0929c m4441m0(int i10) {
        return this.f3284c.m23268g(i10);
    }

    /* JADX INFO: renamed from: m1 */
    public final void m4442m1() {
        for (int i10 = 0; i10 < this.f3296o.size(); i10++) {
            this.f3296o.get(i10).onBackStackChanged();
        }
    }

    /* JADX INFO: renamed from: n */
    public void m4443n(@NonNull ComponentCallbacksC0929c componentCallbacksC0929c) {
        this.f3279R.m23248e(componentCallbacksC0929c);
    }

    /* JADX INFO: renamed from: n0 */
    public ComponentCallbacksC0929c m4444n0(String str) {
        return this.f3284c.m23269h(str);
    }

    /* JADX INFO: renamed from: n1 */
    public void m4445n1(Parcelable parcelable) {
        C0933g c0933g;
        Bundle bundle;
        Bundle bundle2;
        if (parcelable == null) {
            return;
        }
        Bundle bundle3 = (Bundle) parcelable;
        for (String str : bundle3.keySet()) {
            if (str.startsWith("result_") && (bundle2 = bundle3.getBundle(str)) != null) {
                bundle2.setClassLoader(this.f3305x.getContext().getClassLoader());
                this.f3294m.put(str.substring(7), bundle2);
            }
        }
        HashMap<String, Bundle> map = new HashMap<>();
        for (String str2 : bundle3.keySet()) {
            if (str2.startsWith("fragment_") && (bundle = bundle3.getBundle(str2)) != null) {
                bundle.setClassLoader(this.f3305x.getContext().getClassLoader());
                map.put(str2.substring(9), bundle);
            }
        }
        this.f3284c.m23285x(map);
        FragmentManagerState fragmentManagerState = (FragmentManagerState) bundle3.getParcelable("state");
        if (fragmentManagerState == null) {
            return;
        }
        this.f3284c.m23283v();
        ArrayList<String> arrayList = fragmentManagerState.f3332a;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            String str3 = arrayList.get(i10);
            i10++;
            Bundle bundleM23261B = this.f3284c.m23261B(str3, null);
            if (bundleM23261B != null) {
                ComponentCallbacksC0929c componentCallbacksC0929cM23252i = this.f3279R.m23252i(((FragmentState) bundleM23261B.getParcelable("state")).f3341b);
                if (componentCallbacksC0929cM23252i != null) {
                    if (m4349N0(2)) {
                        Log.v("FragmentManager", "restoreSaveState: re-attaching retained " + componentCallbacksC0929cM23252i);
                    }
                    c0933g = new C0933g(this.f3297p, this.f3284c, componentCallbacksC0929cM23252i, bundleM23261B);
                } else {
                    c0933g = new C0933g(this.f3297p, this.f3284c, this.f3305x.getContext().getClassLoader(), m4474y0(), bundleM23261B);
                }
                ComponentCallbacksC0929c componentCallbacksC0929cM4764k = c0933g.m4764k();
                componentCallbacksC0929cM4764k.f3436b = bundleM23261B;
                componentCallbacksC0929cM4764k.f3459v = this;
                if (m4349N0(2)) {
                    Log.v("FragmentManager", "restoreSaveState: active (" + componentCallbacksC0929cM4764k.f3443f + "): " + componentCallbacksC0929cM4764k);
                }
                c0933g.m4768o(this.f3305x.getContext().getClassLoader());
                this.f3284c.m23279r(c0933g);
                c0933g.m4772s(this.f3304w);
            }
        }
        for (ComponentCallbacksC0929c componentCallbacksC0929c : this.f3279R.m23254l()) {
            if (!this.f3284c.m23264c(componentCallbacksC0929c.f3443f)) {
                if (m4349N0(2)) {
                    Log.v("FragmentManager", "Discarding retained Fragment " + componentCallbacksC0929c + " that was not found in the set of active Fragments " + fragmentManagerState.f3332a);
                }
                this.f3279R.m23257o(componentCallbacksC0929c);
                componentCallbacksC0929c.f3459v = this;
                C0933g c0933g2 = new C0933g(this.f3297p, this.f3284c, componentCallbacksC0929c);
                c0933g2.m4772s(1);
                c0933g2.m4766m();
                componentCallbacksC0929c.f3450m = true;
                c0933g2.m4766m();
            }
        }
        this.f3284c.m23284w(fragmentManagerState.f3333b);
        if (fragmentManagerState.f3334c != null) {
            this.f3285d = new ArrayList<>(fragmentManagerState.f3334c.length);
            int i11 = 0;
            while (true) {
                BackStackRecordState[] backStackRecordStateArr = fragmentManagerState.f3334c;
                if (i11 >= backStackRecordStateArr.length) {
                    break;
                }
                C0927a c0927aM4341f = backStackRecordStateArr[i11].m4341f(this);
                if (m4349N0(2)) {
                    Log.v("FragmentManager", "restoreAllState: back stack #" + i11 + " (index " + c0927aM4341f.f3357v + "): " + c0927aM4341f);
                    PrintWriter printWriter = new PrintWriter(new C4824m0("FragmentManager"));
                    c0927aM4341f.m4519y("  ", printWriter, false);
                    printWriter.close();
                }
                this.f3285d.add(c0927aM4341f);
                i11++;
            }
        } else {
            this.f3285d = new ArrayList<>();
        }
        this.f3292k.set(fragmentManagerState.f3335d);
        String str4 = fragmentManagerState.f3336e;
        if (str4 != null) {
            ComponentCallbacksC0929c componentCallbacksC0929cM4435k0 = m4435k0(str4);
            this.f3262A = componentCallbacksC0929cM4435k0;
            m4395Q(componentCallbacksC0929cM4435k0);
        }
        ArrayList<String> arrayList2 = fragmentManagerState.f3337f;
        if (arrayList2 != null) {
            for (int i12 = 0; i12 < arrayList2.size(); i12++) {
                this.f3293l.put(arrayList2.get(i12), fragmentManagerState.f3338g.get(i12));
            }
        }
        this.f3270I = new ArrayDeque<>(fragmentManagerState.f3339h);
    }

    /* JADX INFO: renamed from: o */
    public int m4446o() {
        return this.f3292k.getAndIncrement();
    }

    /* JADX INFO: renamed from: o0 */
    public ComponentCallbacksC0929c m4447o0(@NonNull String str) {
        return this.f3284c.m23270i(str);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: e4.t<?> */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: p */
    public void m4448p(@NonNull AbstractC4835t<?> abstractC4835t, @NonNull AbstractC4833r abstractC4833r, ComponentCallbacksC0929c componentCallbacksC0929c) {
        String str;
        InterfaceC0980s interfaceC0980s;
        if (this.f3305x != null) {
            throw new IllegalStateException("Already attached");
        }
        this.f3305x = abstractC4835t;
        this.f3306y = abstractC4833r;
        this.f3307z = componentCallbacksC0929c;
        if (componentCallbacksC0929c != null) {
            m4440m(new C0915h(componentCallbacksC0929c));
        } else if (abstractC4835t instanceof InterfaceC4808e0) {
            m4440m((InterfaceC4808e0) abstractC4835t);
        }
        if (this.f3307z != null) {
            m4366A1();
        }
        if (abstractC4835t instanceof InterfaceC4727r0) {
            InterfaceC4727r0 interfaceC4727r0 = (InterfaceC4727r0) abstractC4835t;
            C4723p0 c4723p0Mo23043Q = interfaceC4727r0.mo23043Q();
            this.f3288g = c4723p0Mo23043Q;
            if (componentCallbacksC0929c != null) {
                interfaceC0980s = interfaceC4727r0;
                interfaceC0980s = componentCallbacksC0929c;
            }
            interfaceC0980s = interfaceC4727r0;
            c4723p0Mo23043Q.m23077d(interfaceC0980s, this.f3291j);
        }
        if (componentCallbacksC0929c != null) {
            this.f3279R = componentCallbacksC0929c.f3459v.m4465v0(componentCallbacksC0929c);
        } else if (abstractC4835t instanceof InterfaceC0947c1) {
            this.f3279R = C4806d0.m23247k(((InterfaceC0947c1) abstractC4835t).mo4712w());
        } else {
            this.f3279R = new C4806d0(false);
        }
        this.f3279R.m23258p(m4404U0());
        this.f3284c.m23260A(this.f3279R);
        Object obj = this.f3305x;
        if ((obj instanceof InterfaceC4445i) && componentCallbacksC0929c == null) {
            C4442f c4442fMo4583A = ((InterfaceC4445i) obj).mo4583A();
            c4442fMo4583A.m22354c("android:support:fragments", new C4442f.b() { // from class: e4.a0
                @Override // p068d5.C4442f.b
                /* JADX INFO: renamed from: a */
                public final Bundle mo4974a() {
                    return this.f19405a.m4449p1();
                }
            });
            Bundle bundleM22352a = c4442fMo4583A.m22352a("android:support:fragments");
            if (bundleM22352a != null) {
                m4445n1(bundleM22352a);
            }
        }
        Object obj2 = this.f3305x;
        if (obj2 instanceof InterfaceC5858g) {
            AbstractC5857f abstractC5857fMo23058q = ((InterfaceC5858g) obj2).getActivityResultRegistry();
            if (componentCallbacksC0929c != null) {
                str = componentCallbacksC0929c.f3443f + ":";
            } else {
                str = "";
            }
            String str2 = "FragmentManager:" + str;
            this.f3267F = abstractC5857fMo23058q.m26255o(str2 + "StartActivityForResult", new C6256i(), new C0916i());
            this.f3268G = abstractC5857fMo23058q.m26255o(str2 + "StartIntentSenderForResult", new C0918k(), new C0917j());
            this.f3269H = abstractC5857fMo23058q.m26255o(str2 + "RequestPermissions", new C6254g(), new C0908a());
        }
        Object obj3 = this.f3305x;
        if (obj3 instanceof InterfaceC7978e) {
            ((InterfaceC7978e) obj3).mo23054g0(this.f3299r);
        }
        Object obj4 = this.f3305x;
        if (obj4 instanceof InterfaceC7979f) {
            ((InterfaceC7979f) obj4).mo23050d0(this.f3300s);
        }
        Object obj5 = this.f3305x;
        if (obj5 instanceof InterfaceC7423o) {
            ((InterfaceC7423o) obj5).mo23051e0(this.f3301t);
        }
        Object obj6 = this.f3305x;
        if (obj6 instanceof InterfaceC7424p) {
            ((InterfaceC7424p) obj6).mo23060z(this.f3302u);
        }
        Object obj7 = this.f3305x;
        if ((obj7 instanceof InterfaceC0624o) && componentCallbacksC0929c == null) {
            ((InterfaceC0624o) obj7).mo1923l0(this.f3303v);
        }
    }

    @NonNull
    /* JADX INFO: renamed from: p1 */
    public Bundle m4449p1() {
        BackStackRecordState[] backStackRecordStateArr;
        Bundle bundle = new Bundle();
        m4453r0();
        m4419c0();
        m4425f0(true);
        this.f3272K = true;
        this.f3279R.m23258p(true);
        ArrayList<String> arrayListM23286y = this.f3284c.m23286y();
        HashMap<String, Bundle> mapM23274m = this.f3284c.m23274m();
        if (!mapM23274m.isEmpty()) {
            ArrayList<String> arrayListM23287z = this.f3284c.m23287z();
            int size = this.f3285d.size();
            if (size > 0) {
                backStackRecordStateArr = new BackStackRecordState[size];
                for (int i10 = 0; i10 < size; i10++) {
                    backStackRecordStateArr[i10] = new BackStackRecordState(this.f3285d.get(i10));
                    if (m4349N0(2)) {
                        Log.v("FragmentManager", "saveAllState: adding back stack #" + i10 + ": " + this.f3285d.get(i10));
                    }
                }
            } else {
                backStackRecordStateArr = null;
            }
            FragmentManagerState fragmentManagerState = new FragmentManagerState();
            fragmentManagerState.f3332a = arrayListM23286y;
            fragmentManagerState.f3333b = arrayListM23287z;
            fragmentManagerState.f3334c = backStackRecordStateArr;
            fragmentManagerState.f3335d = this.f3292k.get();
            ComponentCallbacksC0929c componentCallbacksC0929c = this.f3262A;
            if (componentCallbacksC0929c != null) {
                fragmentManagerState.f3336e = componentCallbacksC0929c.f3443f;
            }
            fragmentManagerState.f3337f.addAll(this.f3293l.keySet());
            fragmentManagerState.f3338g.addAll(this.f3293l.values());
            fragmentManagerState.f3339h = new ArrayList<>(this.f3270I);
            bundle.putParcelable("state", fragmentManagerState);
            for (String str : this.f3294m.keySet()) {
                bundle.putBundle("result_" + str, this.f3294m.get(str));
            }
            for (String str2 : mapM23274m.keySet()) {
                bundle.putBundle("fragment_" + str2, mapM23274m.get(str2));
            }
        } else if (m4349N0(2)) {
            Log.v("FragmentManager", "saveAllState: no fragments!");
            return bundle;
        }
        return bundle;
    }

    /* JADX INFO: renamed from: q */
    public void m4450q(@NonNull ComponentCallbacksC0929c componentCallbacksC0929c) {
        if (m4349N0(2)) {
            Log.v("FragmentManager", "attach: " + componentCallbacksC0929c);
        }
        if (componentCallbacksC0929c.f3411D) {
            componentCallbacksC0929c.f3411D = false;
            if (componentCallbacksC0929c.f3449l) {
                return;
            }
            this.f3284c.m23262a(componentCallbacksC0929c);
            if (m4349N0(2)) {
                Log.v("FragmentManager", "add from attach: " + componentCallbacksC0929c);
            }
            if (m4392O0(componentCallbacksC0929c)) {
                this.f3271J = true;
            }
        }
    }

    /* JADX INFO: renamed from: q1 */
    public void m4451q1() {
        synchronized (this.f3282a) {
            try {
                if (this.f3282a.size() == 1) {
                    this.f3305x.getHandler().removeCallbacks(this.f3281T);
                    this.f3305x.getHandler().post(this.f3281T);
                    m4366A1();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @NonNull
    /* JADX INFO: renamed from: r */
    public AbstractC0934h m4452r() {
        return new C0927a(this);
    }

    /* JADX INFO: renamed from: r0 */
    public final void m4453r0() {
        Iterator<AbstractC0935i> it = m4473y().iterator();
        while (it.hasNext()) {
            it.next().m4809r();
        }
    }

    /* JADX INFO: renamed from: r1 */
    public void m4454r1(@NonNull ComponentCallbacksC0929c componentCallbacksC0929c, boolean z10) {
        ViewGroup viewGroupM4471x0 = m4471x0(componentCallbacksC0929c);
        if (viewGroupM4471x0 == null || !(viewGroupM4471x0 instanceof FragmentContainerView)) {
            return;
        }
        ((FragmentContainerView) viewGroupM4471x0).setDrawDisappearingViewsLast(!z10);
    }

    /* JADX INFO: renamed from: s */
    public void m4455s() {
        if (m4349N0(3)) {
            Log.d("FragmentManager", "cancelBackStackTransition for transition " + this.f3289h);
        }
        C0927a c0927a = this.f3289h;
        if (c0927a != null) {
            c0927a.f3356u = false;
            c0927a.m4516v();
            this.f3289h.m4783p(true, new Runnable() { // from class: e4.b0
                @Override // java.lang.Runnable
                public final void run() {
                    FragmentManager.m4352c(this.f19409a);
                }
            });
            this.f3289h.mo4508g();
            this.f3290i = true;
            m4432j0();
            this.f3290i = false;
            this.f3289h = null;
        }
    }

    /* JADX INFO: renamed from: s0 */
    public Set<ComponentCallbacksC0929c> m4456s0(@NonNull C0927a c0927a) {
        HashSet hashSet = new HashSet();
        for (int i10 = 0; i10 < c0927a.f3523c.size(); i10++) {
            ComponentCallbacksC0929c componentCallbacksC0929c = c0927a.f3523c.get(i10).f3541b;
            if (componentCallbacksC0929c != null && c0927a.f3529i) {
                hashSet.add(componentCallbacksC0929c);
            }
        }
        return hashSet;
    }

    /* JADX INFO: renamed from: s1 */
    public final void m4457s1(@NonNull String str, @NonNull Bundle bundle) {
        C0920m c0920m = this.f3295n.get(str);
        if (c0920m == null || !c0920m.m4491b(AbstractC0966l.b.STARTED)) {
            this.f3294m.put(str, bundle);
        } else {
            c0920m.mo4490a(str, bundle);
        }
        if (m4349N0(2)) {
            Log.v("FragmentManager", "Setting fragment result with key " + str + " and result " + bundle);
        }
    }

    /* JADX INFO: renamed from: t */
    public boolean m4458t() {
        boolean zM4392O0 = false;
        for (ComponentCallbacksC0929c componentCallbacksC0929c : this.f3284c.m23273l()) {
            if (componentCallbacksC0929c != null) {
                zM4392O0 = m4392O0(componentCallbacksC0929c);
            }
            if (zM4392O0) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: t0 */
    public final boolean m4459t0(@NonNull ArrayList<C0927a> arrayList, @NonNull ArrayList<Boolean> arrayList2) {
        synchronized (this.f3282a) {
            if (this.f3282a.isEmpty()) {
                return false;
            }
            try {
                int size = this.f3282a.size();
                boolean zMo4497a = false;
                for (int i10 = 0; i10 < size; i10++) {
                    zMo4497a |= this.f3282a.get(i10).mo4497a(arrayList, arrayList2);
                }
                this.f3282a.clear();
                this.f3305x.getHandler().removeCallbacks(this.f3281T);
                return zMo4497a;
            } catch (Throwable th2) {
                this.f3282a.clear();
                this.f3305x.getHandler().removeCallbacks(this.f3281T);
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: t1 */
    public final void m4460t1(@NonNull String str, @NonNull InterfaceC0980s interfaceC0980s, @NonNull InterfaceC4810f0 interfaceC4810f0) {
        AbstractC0966l abstractC0966lMo4656a = interfaceC0980s.mo4656a();
        if (abstractC0966lMo4656a.getState() == AbstractC0966l.b.DESTROYED) {
            return;
        }
        C0914g c0914g = new C0914g(str, interfaceC4810f0, abstractC0966lMo4656a);
        C0920m c0920mPut = this.f3295n.put(str, new C0920m(abstractC0966lMo4656a, interfaceC4810f0, c0914g));
        if (c0920mPut != null) {
            c0920mPut.m4492c();
        }
        if (m4349N0(2)) {
            Log.v("FragmentManager", "Setting FragmentResultListener with key " + str + " lifecycleOwner " + abstractC0966lMo4656a + " and listener " + interfaceC4810f0);
        }
        abstractC0966lMo4656a.mo4935a(c0914g);
    }

    @NonNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder(128);
        sb2.append("FragmentManager{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append(" in ");
        ComponentCallbacksC0929c componentCallbacksC0929c = this.f3307z;
        if (componentCallbacksC0929c != null) {
            sb2.append(componentCallbacksC0929c.getClass().getSimpleName());
            sb2.append("{");
            sb2.append(Integer.toHexString(System.identityHashCode(this.f3307z)));
            sb2.append("}");
        } else {
            AbstractC4835t<?> abstractC4835t = this.f3305x;
            if (abstractC4835t != null) {
                sb2.append(abstractC4835t.getClass().getSimpleName());
                sb2.append("{");
                sb2.append(Integer.toHexString(System.identityHashCode(this.f3305x)));
                sb2.append("}");
            } else {
                sb2.append("null");
            }
        }
        sb2.append("}}");
        return sb2.toString();
    }

    /* JADX INFO: renamed from: u */
    public final void m4461u() {
        if (m4404U0()) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
    }

    /* JADX INFO: renamed from: u0 */
    public int m4462u0() {
        return this.f3285d.size() + (this.f3289h != null ? 1 : 0);
    }

    /* JADX INFO: renamed from: u1 */
    public void m4463u1(@NonNull ComponentCallbacksC0929c componentCallbacksC0929c, @NonNull AbstractC0966l.b bVar) {
        if (componentCallbacksC0929c.equals(m4435k0(componentCallbacksC0929c.f3443f)) && (componentCallbacksC0929c.f3460w == null || componentCallbacksC0929c.f3459v == this)) {
            componentCallbacksC0929c.f3428U = bVar;
            return;
        }
        throw new IllegalArgumentException("Fragment " + componentCallbacksC0929c + " is not an active fragment of FragmentManager " + this);
    }

    /* JADX INFO: renamed from: v */
    public final void m4464v() {
        this.f3283b = false;
        this.f3277P.clear();
        this.f3276O.clear();
    }

    @NonNull
    /* JADX INFO: renamed from: v0 */
    public final C4806d0 m4465v0(@NonNull ComponentCallbacksC0929c componentCallbacksC0929c) {
        return this.f3279R.m23253j(componentCallbacksC0929c);
    }

    /* JADX INFO: renamed from: v1 */
    public void m4466v1(ComponentCallbacksC0929c componentCallbacksC0929c) {
        if (componentCallbacksC0929c == null || (componentCallbacksC0929c.equals(m4435k0(componentCallbacksC0929c.f3443f)) && (componentCallbacksC0929c.f3460w == null || componentCallbacksC0929c.f3459v == this))) {
            ComponentCallbacksC0929c componentCallbacksC0929c2 = this.f3262A;
            this.f3262A = componentCallbacksC0929c;
            m4395Q(componentCallbacksC0929c2);
            m4395Q(this.f3262A);
            return;
        }
        throw new IllegalArgumentException("Fragment " + componentCallbacksC0929c + " is not an active fragment of FragmentManager " + this);
    }

    /* JADX INFO: renamed from: w */
    public final void m4467w() {
        boolean zM23256n;
        AbstractC4835t<?> abstractC4835t = this.f3305x;
        if (abstractC4835t instanceof InterfaceC0947c1) {
            zM23256n = this.f3284c.m23277p().m23256n();
        } else {
            zM23256n = abstractC4835t.getContext() instanceof Activity ? !((Activity) this.f3305x.getContext()).isChangingConfigurations() : true;
        }
        if (zM23256n) {
            Iterator<BackStackState> it = this.f3293l.values().iterator();
            while (it.hasNext()) {
                Iterator<String> it2 = it.next().f3253a.iterator();
                while (it2.hasNext()) {
                    this.f3284c.m23277p().m23250g(it2.next(), false);
                }
            }
        }
    }

    @NonNull
    /* JADX INFO: renamed from: w0 */
    public AbstractC4833r m4468w0() {
        return this.f3306y;
    }

    /* JADX INFO: renamed from: w1 */
    public final void m4469w1(@NonNull ComponentCallbacksC0929c componentCallbacksC0929c) {
        ViewGroup viewGroupM4471x0 = m4471x0(componentCallbacksC0929c);
        if (viewGroupM4471x0 == null || componentCallbacksC0929c.m4718y() + componentCallbacksC0929c.m4589C() + componentCallbacksC0929c.m4623O() + componentCallbacksC0929c.m4626P() <= 0) {
            return;
        }
        int i10 = C4435b.f18439c;
        if (viewGroupM4471x0.getTag(i10) == null) {
            viewGroupM4471x0.setTag(i10, componentCallbacksC0929c);
        }
        ((ComponentCallbacksC0929c) viewGroupM4471x0.getTag(i10)).m4639T1(componentCallbacksC0929c.m4620N());
    }

    /* JADX INFO: renamed from: x */
    public final void m4470x(@NonNull String str) {
        this.f3294m.remove(str);
        if (m4349N0(2)) {
            Log.v("FragmentManager", "Clearing fragment result with key " + str);
        }
    }

    /* JADX INFO: renamed from: x0 */
    public final ViewGroup m4471x0(@NonNull ComponentCallbacksC0929c componentCallbacksC0929c) {
        ViewGroup viewGroup = componentCallbacksC0929c.f3417J;
        if (viewGroup != null) {
            return viewGroup;
        }
        if (componentCallbacksC0929c.f3408A > 0 && this.f3306y.mo4729e()) {
            View viewMo4728d = this.f3306y.mo4728d(componentCallbacksC0929c.f3408A);
            if (viewMo4728d instanceof ViewGroup) {
                return (ViewGroup) viewMo4728d;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: x1 */
    public void m4472x1(@NonNull ComponentCallbacksC0929c componentCallbacksC0929c) {
        if (m4349N0(2)) {
            Log.v("FragmentManager", "show: " + componentCallbacksC0929c);
        }
        if (componentCallbacksC0929c.f3410C) {
            componentCallbacksC0929c.f3410C = false;
            componentCallbacksC0929c.f3424Q = !componentCallbacksC0929c.f3424Q;
        }
    }

    /* JADX INFO: renamed from: y */
    public final Set<AbstractC0935i> m4473y() {
        HashSet hashSet = new HashSet();
        Iterator<C0933g> it = this.f3284c.m23272k().iterator();
        while (it.hasNext()) {
            ViewGroup viewGroup = it.next().m4764k().f3417J;
            if (viewGroup != null) {
                hashSet.add(AbstractC0935i.m4792v(viewGroup, m4376F0()));
            }
        }
        return hashSet;
    }

    @NonNull
    /* JADX INFO: renamed from: y0 */
    public C0931e m4474y0() {
        C0931e c0931e = this.f3263B;
        if (c0931e != null) {
            return c0931e;
        }
        ComponentCallbacksC0929c componentCallbacksC0929c = this.f3307z;
        return componentCallbacksC0929c != null ? componentCallbacksC0929c.f3459v.m4474y0() : this.f3264C;
    }

    /* JADX INFO: renamed from: y1 */
    public final void m4475y1() {
        Iterator<C0933g> it = this.f3284c.m23272k().iterator();
        while (it.hasNext()) {
            m4414Z0(it.next());
        }
    }

    /* JADX INFO: renamed from: z */
    public Set<AbstractC0935i> m4476z(@NonNull ArrayList<C0927a> arrayList, int i10, int i11) {
        ViewGroup viewGroup;
        HashSet hashSet = new HashSet();
        while (i10 < i11) {
            ArrayList<AbstractC0934h.a> arrayList2 = arrayList.get(i10).f3523c;
            int size = arrayList2.size();
            int i12 = 0;
            while (i12 < size) {
                AbstractC0934h.a aVar = arrayList2.get(i12);
                i12++;
                ComponentCallbacksC0929c componentCallbacksC0929c = aVar.f3541b;
                if (componentCallbacksC0929c != null && (viewGroup = componentCallbacksC0929c.f3417J) != null) {
                    hashSet.add(AbstractC0935i.m4791u(viewGroup, this));
                }
            }
            i10++;
        }
        return hashSet;
    }

    @NonNull
    /* JADX INFO: renamed from: z0 */
    public List<ComponentCallbacksC0929c> m4477z0() {
        return this.f3284c.m23276o();
    }

    /* JADX INFO: renamed from: z1 */
    public final void m4478z1(RuntimeException runtimeException) {
        Log.e("FragmentManager", runtimeException.getMessage());
        Log.e("FragmentManager", "Activity state:");
        PrintWriter printWriter = new PrintWriter(new C4824m0("FragmentManager"));
        AbstractC4835t<?> abstractC4835t = this.f3305x;
        if (abstractC4835t != null) {
            try {
                abstractC4835t.mo23365k("  ", null, printWriter, new String[0]);
                throw runtimeException;
            } catch (Exception e10) {
                Log.e("FragmentManager", "Failed dumping state", e10);
                throw runtimeException;
            }
        }
        try {
            m4417b0("  ", null, printWriter, new String[0]);
            throw runtimeException;
        } catch (Exception e11) {
            Log.e("FragmentManager", "Failed dumping state", e11);
            throw runtimeException;
        }
    }

    @SuppressLint({"BanParcelableUsage"})
    public static class LaunchedFragmentInfo implements Parcelable {
        public static final Parcelable.Creator<LaunchedFragmentInfo> CREATOR = new C0907a();

        /* JADX INFO: renamed from: a */
        public String f3308a;

        /* JADX INFO: renamed from: b */
        public int f3309b;

        /* JADX INFO: renamed from: androidx.fragment.app.FragmentManager$LaunchedFragmentInfo$a */
        public class C0907a implements Parcelable.Creator<LaunchedFragmentInfo> {
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public LaunchedFragmentInfo createFromParcel(Parcel parcel) {
                return new LaunchedFragmentInfo(parcel);
            }

            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public LaunchedFragmentInfo[] newArray(int i10) {
                return new LaunchedFragmentInfo[i10];
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public LaunchedFragmentInfo(@NonNull String str, int i10) {
            this.f3308a = str;
            this.f3309b = i10;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            parcel.writeString(this.f3308a);
            parcel.writeInt(this.f3309b);
        }

        public LaunchedFragmentInfo(@NonNull Parcel parcel) {
            this.f3308a = parcel.readString();
            this.f3309b = parcel.readInt();
        }
    }
}
