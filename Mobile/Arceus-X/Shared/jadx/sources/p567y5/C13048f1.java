package p567y5;

import android.content.BroadcastReceiver;
import android.content.Context;
import androidx.work.C1115a;
import androidx.work.impl.C1120a;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.utils.ForceStopRunnable;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import p007a6.C0078f;
import p069d6.C4463n;
import p120f6.WorkGenerationalId;
import p146g6.C6027h;
import p146g6.C6043w;
import p146g6.RunnableC6046z;
import p161h6.InterfaceC6292b;
import p256ku.InterfaceC7906p0;
import p536x5.AbstractC12719p0;
import p536x5.AbstractC12721q0;
import p536x5.AbstractC12732w;
import p536x5.C12701g0;
import p536x5.C12713m0;
import p536x5.C12738z;
import p536x5.EnumC12704i;
import p536x5.EnumC12706j;
import p536x5.InterfaceC12689a0;

/* JADX INFO: renamed from: y5.f1 */
/* JADX INFO: loaded from: classes.dex */
public class C13048f1 extends AbstractC12719p0 {

    /* JADX INFO: renamed from: m */
    public static final String f46194m = AbstractC12732w.m47443i("WorkManagerImpl");

    /* JADX INFO: renamed from: n */
    public static C13048f1 f46195n = null;

    /* JADX INFO: renamed from: o */
    public static C13048f1 f46196o = null;

    /* JADX INFO: renamed from: p */
    public static final Object f46197p = new Object();

    /* JADX INFO: renamed from: b */
    public Context f46198b;

    /* JADX INFO: renamed from: c */
    public C1115a f46199c;

    /* JADX INFO: renamed from: d */
    public WorkDatabase f46200d;

    /* JADX INFO: renamed from: e */
    public InterfaceC6292b f46201e;

    /* JADX INFO: renamed from: f */
    public List<InterfaceC13090u> f46202f;

    /* JADX INFO: renamed from: g */
    public C13085s f46203g;

    /* JADX INFO: renamed from: h */
    public C6043w f46204h;

    /* JADX INFO: renamed from: i */
    public boolean f46205i = false;

    /* JADX INFO: renamed from: j */
    public BroadcastReceiver.PendingResult f46206j;

    /* JADX INFO: renamed from: k */
    public final C4463n f46207k;

    /* JADX INFO: renamed from: l */
    public final InterfaceC7906p0 f46208l;

    /* JADX INFO: renamed from: y5.f1$a */
    public static class a {
        /* JADX INFO: renamed from: a */
        public static boolean m48595a(Context context) {
            return context.isDeviceProtectedStorage();
        }
    }

    public C13048f1(Context context, C1115a c1115a, InterfaceC6292b interfaceC6292b, WorkDatabase workDatabase, List<InterfaceC13090u> list, C13085s c13085s, C4463n c4463n) {
        Context applicationContext = context.getApplicationContext();
        if (a.m48595a(applicationContext)) {
            throw new IllegalStateException("Cannot initialize WorkManager in direct boot mode");
        }
        AbstractC12732w.m47442h(new AbstractC12732w.a(c1115a.getMinimumLoggingLevel()));
        this.f46198b = applicationContext;
        this.f46201e = interfaceC6292b;
        this.f46200d = workDatabase;
        this.f46203g = c13085s;
        this.f46207k = c4463n;
        this.f46199c = c1115a;
        this.f46202f = list;
        InterfaceC7906p0 interfaceC7906p0M6390f = C1120a.m6390f(interfaceC6292b);
        this.f46208l = interfaceC7906p0M6390f;
        this.f46204h = new C6043w(this.f46200d);
        C13096x.m48688e(list, this.f46203g, interfaceC6292b.mo27572c(), this.f46200d, c1115a);
        this.f46201e.m27573d(new ForceStopRunnable(applicationContext, this));
        C13041d0.m48559c(interfaceC7906p0M6390f, this.f46198b, c1115a, workDatabase);
    }

    /* JADX INFO: renamed from: i */
    public static void m48577i(Context context, C1115a c1115a) {
        synchronized (f46197p) {
            try {
                C13048f1 c13048f1 = f46195n;
                if (c13048f1 != null && f46196o != null) {
                    throw new IllegalStateException("WorkManager is already initialized.  Did you try to initialize it manually without disabling WorkManagerInitializer? See WorkManager#initialize(Context, Configuration) or the class level Javadoc for more information.");
                }
                if (c13048f1 == null) {
                    Context applicationContext = context.getApplicationContext();
                    if (f46196o == null) {
                        f46196o = C1120a.m6387c(applicationContext, c1115a);
                    }
                    f46195n = f46196o;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: j */
    public static /* synthetic */ Unit m48578j(C13048f1 c13048f1) {
        C0078f.m187d(c13048f1.m48583m());
        c13048f1.m48589u().mo6350c0().mo24792p();
        C13096x.m48689f(c13048f1.m48584n(), c13048f1.m48589u(), c13048f1.m48587s());
        return Unit.f29331a;
    }

    @Deprecated
    /* JADX INFO: renamed from: o */
    public static C13048f1 m48579o() {
        synchronized (f46197p) {
            try {
                C13048f1 c13048f1 = f46195n;
                if (c13048f1 != null) {
                    return c13048f1;
                }
                return f46196o;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v2, resolved type: android.content.Context */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: p */
    public static C13048f1 m48580p(Context context) {
        C13048f1 c13048f1M48579o;
        synchronized (f46197p) {
            try {
                c13048f1M48579o = m48579o();
                if (c13048f1M48579o == null) {
                    Context applicationContext = context.getApplicationContext();
                    if (!(applicationContext instanceof C1115a.c)) {
                        throw new IllegalStateException("WorkManager is not initialized properly.  You have explicitly disabled WorkManagerInitializer in your manifest, have not manually called WorkManager#initialize at this point, and your Application does not implement Configuration.Provider.");
                    }
                    m48577i(applicationContext, ((C1115a.c) applicationContext).mo6310b());
                    c13048f1M48579o = m48580p(applicationContext);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return c13048f1M48579o;
    }

    @Override // p536x5.AbstractC12719p0
    /* JADX INFO: renamed from: a */
    public InterfaceC12689a0 mo47394a(String str) {
        return C6027h.m26818o(str, this);
    }

    @Override // p536x5.AbstractC12719p0
    /* JADX INFO: renamed from: b */
    public InterfaceC12689a0 mo47395b(String str) {
        return C6027h.m26814k(str, this);
    }

    @Override // p536x5.AbstractC12719p0
    /* JADX INFO: renamed from: c */
    public InterfaceC12689a0 mo47396c(List<? extends AbstractC12721q0> list) {
        if (list.isEmpty()) {
            throw new IllegalArgumentException("enqueue needs at least one WorkRequest.");
        }
        return new C13047f0(this, list).m48567b();
    }

    @Override // p536x5.AbstractC12719p0
    /* JADX INFO: renamed from: e */
    public InterfaceC12689a0 mo47398e(String str, EnumC12704i enumC12704i, C12701g0 c12701g0) {
        return enumC12704i == EnumC12704i.UPDATE ? C13069m1.m48607e(this, str, c12701g0) : m48582l(str, enumC12704i, c12701g0).m48567b();
    }

    @Override // p536x5.AbstractC12719p0
    /* JADX INFO: renamed from: f */
    public InterfaceC12689a0 mo47399f(String str, EnumC12706j enumC12706j, List<C12738z> list) {
        return new C13047f0(this, str, enumC12706j, list).m48567b();
    }

    /* JADX INFO: renamed from: k */
    public InterfaceC12689a0 m48581k(UUID uuid) {
        return C6027h.m26811h(uuid, this);
    }

    /* JADX INFO: renamed from: l */
    public C13047f0 m48582l(String str, EnumC12704i enumC12704i, C12701g0 c12701g0) {
        return new C13047f0(this, str, enumC12704i == EnumC12704i.KEEP ? EnumC12706j.KEEP : EnumC12706j.REPLACE, Collections.singletonList(c12701g0));
    }

    /* JADX INFO: renamed from: m */
    public Context m48583m() {
        return this.f46198b;
    }

    /* JADX INFO: renamed from: n */
    public C1115a m48584n() {
        return this.f46199c;
    }

    /* JADX INFO: renamed from: q */
    public C6043w m48585q() {
        return this.f46204h;
    }

    /* JADX INFO: renamed from: r */
    public C13085s m48586r() {
        return this.f46203g;
    }

    /* JADX INFO: renamed from: s */
    public List<InterfaceC13090u> m48587s() {
        return this.f46202f;
    }

    /* JADX INFO: renamed from: t */
    public C4463n m48588t() {
        return this.f46207k;
    }

    /* JADX INFO: renamed from: u */
    public WorkDatabase m48589u() {
        return this.f46200d;
    }

    /* JADX INFO: renamed from: v */
    public InterfaceC6292b m48590v() {
        return this.f46201e;
    }

    /* JADX INFO: renamed from: w */
    public void m48591w() {
        synchronized (f46197p) {
            try {
                this.f46205i = true;
                BroadcastReceiver.PendingResult pendingResult = this.f46206j;
                if (pendingResult != null) {
                    pendingResult.finish();
                    this.f46206j = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: x */
    public void m48592x() {
        C12713m0.m47386a(m48584n().getTracer(), "ReschedulingWork", new Function0() { // from class: y5.e1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C13048f1.m48578j(this.f46182a);
            }
        });
    }

    /* JADX INFO: renamed from: y */
    public void m48593y(BroadcastReceiver.PendingResult pendingResult) {
        synchronized (f46197p) {
            try {
                BroadcastReceiver.PendingResult pendingResult2 = this.f46206j;
                if (pendingResult2 != null) {
                    pendingResult2.finish();
                }
                this.f46206j = pendingResult;
                if (this.f46205i) {
                    pendingResult.finish();
                    this.f46206j = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: z */
    public void m48594z(WorkGenerationalId workGenerationalId, int i10) {
        this.f46201e.m27573d(new RunnableC6046z(this.f46203g, new C13098y(workGenerationalId), true, i10));
    }
}
