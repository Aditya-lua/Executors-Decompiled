package p306nb;

import android.os.Bundle;
import java.util.Iterator;
import java.util.Map;
import p305n9.C8953m;
import p504w1.C12277a;

/* JADX INFO: renamed from: nb.y1 */
/* JADX INFO: loaded from: classes.dex */
public final class C9376y1 extends C8990a4 {

    /* JADX INFO: renamed from: b */
    public final Map f33665b;

    /* JADX INFO: renamed from: c */
    public final Map f33666c;

    /* JADX INFO: renamed from: d */
    public long f33667d;

    public C9376y1(C9094g7 c9094g7) {
        super(c9094g7);
        this.f33666c = new C12277a();
        this.f33665b = new C12277a();
    }

    /* JADX INFO: renamed from: i */
    public final void m37069i(String str, long j10) {
        if (str == null || str.length() == 0) {
            this.f33067a.mo36321a().m37003o().m36911a("Ad unit id must be a non-empty string");
        } else {
            this.f33067a.mo36322b().m36263t(new RunnableC8985a(this, str, j10));
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m37070j(String str, long j10) {
        if (str == null || str.length() == 0) {
            this.f33067a.mo36321a().m37003o().m36911a("Ad unit id must be a non-empty string");
        } else {
            this.f33067a.mo36322b().m36263t(new RunnableC9374y(this, str, j10));
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m37071k(long j10) {
        C9014bb c9014bbM36380q = this.f33067a.m36314I().m36380q(false);
        Map map = this.f33665b;
        for (String str : map.keySet()) {
            m37076p(str, j10 - ((Long) map.get(str)).longValue(), c9014bbM36380q);
        }
        if (!map.isEmpty()) {
            m37075o(j10 - this.f33667d, c9014bbM36380q);
        }
        m37074n(j10);
    }

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ void m37072l(String str, long j10) {
        mo36088h();
        C8953m.m36041f(str);
        Map map = this.f33666c;
        if (map.isEmpty()) {
            this.f33667d = j10;
        }
        Integer num = (Integer) map.get(str);
        if (num != null) {
            map.put(str, Integer.valueOf(num.intValue() + 1));
        } else if (map.size() >= 100) {
            this.f33067a.mo36321a().m37006r().m36911a("Too many ads visible");
        } else {
            map.put(str, 1);
            this.f33665b.put(str, Long.valueOf(j10));
        }
    }

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ void m37073m(String str, long j10) {
        mo36088h();
        C8953m.m36041f(str);
        Map map = this.f33666c;
        Integer num = (Integer) map.get(str);
        if (num == null) {
            this.f33067a.mo36321a().m37003o().m36912b("Call to endAdUnitExposure for unknown ad unit id", str);
            return;
        }
        C9014bb c9014bbM36380q = this.f33067a.m36314I().m36380q(false);
        int iIntValue = num.intValue() - 1;
        if (iIntValue != 0) {
            map.put(str, Integer.valueOf(iIntValue));
            return;
        }
        map.remove(str);
        Map map2 = this.f33665b;
        Long l10 = (Long) map2.get(str);
        if (l10 == null) {
            this.f33067a.mo36321a().m37003o().m36911a("First ad unit exposure time was never set");
        } else {
            long jLongValue = j10 - l10.longValue();
            map2.remove(str);
            m37076p(str, jLongValue, c9014bbM36380q);
        }
        if (map.isEmpty()) {
            long j11 = this.f33667d;
            if (j11 == 0) {
                this.f33067a.mo36321a().m37003o().m36911a("First ad exposure time was never set");
            } else {
                m37075o(j10 - j11, c9014bbM36380q);
                this.f33667d = 0L;
            }
        }
    }

    /* JADX INFO: renamed from: o */
    public final void m37075o(long j10, C9014bb c9014bb) {
        if (c9014bb == null) {
            this.f33067a.mo36321a().m37011w().m36911a("Not logging ad exposure. No active activity");
            return;
        }
        if (j10 < 1000) {
            this.f33067a.mo36321a().m37011w().m36912b("Not logging ad exposure. Less than 1000 ms. exposure", Long.valueOf(j10));
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putLong("_xt", j10);
        C9341ve.m36931k0(c9014bb, bundle, true);
        this.f33067a.m36307B().m36712t("am", "_xa", bundle);
    }

    /* JADX INFO: renamed from: p */
    public final void m37076p(String str, long j10, C9014bb c9014bb) {
        if (c9014bb == null) {
            this.f33067a.mo36321a().m37011w().m36911a("Not logging ad unit exposure. No active activity");
            return;
        }
        if (j10 < 1000) {
            this.f33067a.mo36321a().m37011w().m36912b("Not logging ad unit exposure. Less than 1000 ms. exposure", Long.valueOf(j10));
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putString("_ai", str);
        bundle.putLong("_xt", j10);
        C9341ve.m36931k0(c9014bb, bundle, true);
        this.f33067a.m36307B().m36712t("am", "_xu", bundle);
    }

    /* JADX DEBUG: Method merged with bridge method: n(J)V */
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public final void m37074n(long j10) {
        Map map = this.f33665b;
        Iterator it = map.keySet().iterator();
        while (it.hasNext()) {
            map.put((String) it.next(), Long.valueOf(j10));
        }
        if (map.isEmpty()) {
            return;
        }
        this.f33667d = j10;
    }
}
