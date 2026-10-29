package p567y5;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import p146g6.C6030j;
import p536x5.AbstractC12715n0;
import p536x5.AbstractC12721q0;
import p536x5.AbstractC12732w;
import p536x5.C12697e0;
import p536x5.EnumC12706j;
import p536x5.InterfaceC12689a0;

/* JADX INFO: renamed from: y5.f0 */
/* JADX INFO: loaded from: classes.dex */
public class C13047f0 extends AbstractC12715n0 {

    /* JADX INFO: renamed from: j */
    public static final String f46184j = AbstractC12732w.m47443i("WorkContinuationImpl");

    /* JADX INFO: renamed from: a */
    public final C13048f1 f46185a;

    /* JADX INFO: renamed from: b */
    public final String f46186b;

    /* JADX INFO: renamed from: c */
    public final EnumC12706j f46187c;

    /* JADX INFO: renamed from: d */
    public final List<? extends AbstractC12721q0> f46188d;

    /* JADX INFO: renamed from: e */
    public final List<String> f46189e;

    /* JADX INFO: renamed from: f */
    public final List<String> f46190f;

    /* JADX INFO: renamed from: g */
    public final List<C13047f0> f46191g;

    /* JADX INFO: renamed from: h */
    public boolean f46192h;

    /* JADX INFO: renamed from: i */
    public InterfaceC12689a0 f46193i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C13047f0(C13048f1 c13048f1, List<? extends AbstractC12721q0> list) {
        this(c13048f1, null, EnumC12706j.KEEP, list, null);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ Unit m48564a(C13047f0 c13047f0) {
        c13047f0.getClass();
        C6030j.m26826b(c13047f0);
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: j */
    public static boolean m48565j(C13047f0 c13047f0, Set<String> set) {
        set.addAll(c13047f0.m48569d());
        Set<String> setM48566m = m48566m(c13047f0);
        Iterator<String> it = set.iterator();
        while (it.hasNext()) {
            if (setM48566m.contains(it.next())) {
                return true;
            }
        }
        List<C13047f0> listM48571f = c13047f0.m48571f();
        if (listM48571f != null && !listM48571f.isEmpty()) {
            Iterator<C13047f0> it2 = listM48571f.iterator();
            while (it2.hasNext()) {
                if (m48565j(it2.next(), set)) {
                    return true;
                }
            }
        }
        set.removeAll(c13047f0.m48569d());
        return false;
    }

    /* JADX INFO: renamed from: m */
    public static Set<String> m48566m(C13047f0 c13047f0) {
        HashSet hashSet = new HashSet();
        List<C13047f0> listM48571f = c13047f0.m48571f();
        if (listM48571f != null && !listM48571f.isEmpty()) {
            Iterator<C13047f0> it = listM48571f.iterator();
            while (it.hasNext()) {
                hashSet.addAll(it.next().m48569d());
            }
        }
        return hashSet;
    }

    /* JADX INFO: renamed from: b */
    public InterfaceC12689a0 m48567b() {
        if (this.f46192h) {
            AbstractC12732w.m47441e().mo47451k(f46184j, "Already enqueued work ids (" + TextUtils.join(", ", this.f46189e) + ")");
        } else {
            this.f46193i = C12697e0.m47355c(this.f46185a.m48584n().getTracer(), "EnqueueRunnable_" + m48568c().name(), this.f46185a.m48590v().mo27572c(), new Function0() { // from class: y5.e0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return C13047f0.m48564a(this.f46181a);
                }
            });
        }
        return this.f46193i;
    }

    /* JADX INFO: renamed from: c */
    public EnumC12706j m48568c() {
        return this.f46187c;
    }

    /* JADX INFO: renamed from: d */
    public List<String> m48569d() {
        return this.f46189e;
    }

    /* JADX INFO: renamed from: e */
    public String m48570e() {
        return this.f46186b;
    }

    /* JADX INFO: renamed from: f */
    public List<C13047f0> m48571f() {
        return this.f46191g;
    }

    /* JADX INFO: renamed from: g */
    public List<? extends AbstractC12721q0> m48572g() {
        return this.f46188d;
    }

    /* JADX INFO: renamed from: h */
    public C13048f1 m48573h() {
        return this.f46185a;
    }

    /* JADX INFO: renamed from: i */
    public boolean m48574i() {
        return m48565j(this, new HashSet());
    }

    /* JADX INFO: renamed from: k */
    public boolean m48575k() {
        return this.f46192h;
    }

    /* JADX INFO: renamed from: l */
    public void m48576l() {
        this.f46192h = true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public C13047f0(C13048f1 c13048f1, String str, EnumC12706j enumC12706j, List<? extends AbstractC12721q0> list) {
        this(c13048f1, str, enumC12706j, list, null);
    }

    public C13047f0(C13048f1 c13048f1, String str, EnumC12706j enumC12706j, List<? extends AbstractC12721q0> list, List<C13047f0> list2) {
        this.f46185a = c13048f1;
        this.f46186b = str;
        this.f46187c = enumC12706j;
        this.f46188d = list;
        this.f46191g = list2;
        this.f46189e = new ArrayList(list.size());
        this.f46190f = new ArrayList();
        if (list2 != null) {
            Iterator<C13047f0> it = list2.iterator();
            while (it.hasNext()) {
                this.f46190f.addAll(it.next().f46190f);
            }
        }
        for (int i10 = 0; i10 < list.size(); i10++) {
            if (enumC12706j == EnumC12706j.REPLACE && list.get(i10).getWorkSpec().getNextScheduleTimeOverride() != Long.MAX_VALUE) {
                throw new IllegalArgumentException("Next Schedule Time Override must be used with ExistingPeriodicWorkPolicyUPDATE (preferably) or KEEP");
            }
            String strM47405b = list.get(i10).m47405b();
            this.f46189e.add(strM47405b);
            this.f46190f.add(strM47405b);
        }
    }
}
