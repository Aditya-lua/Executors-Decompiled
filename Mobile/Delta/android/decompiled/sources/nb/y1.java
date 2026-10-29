package nb;

import android.os.Bundle;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class y1 extends a4 {
    public final Map b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map f26117c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f26118d;

    public y1(g7 g7Var) {
        super(g7Var);
        this.f26117c = new w1.a();
        this.b = new w1.a();
    }

    public final void i(String str, long j10) {
        if (str == null || str.length() == 0) {
            this.f25625a.a().o().a("Ad unit id must be a non-empty string");
        } else {
            this.f25625a.b().t(new a(this, str, j10));
        }
    }

    public final void j(String str, long j10) {
        if (str == null || str.length() == 0) {
            this.f25625a.a().o().a("Ad unit id must be a non-empty string");
        } else {
            this.f25625a.b().t(new y(this, str, j10));
        }
    }

    public final void k(long j10) {
        bb bbVarQ = this.f25625a.I().q(false);
        Map map = this.b;
        for (String str : map.keySet()) {
            p(str, j10 - ((Long) map.get(str)).longValue(), bbVarQ);
        }
        if (!map.isEmpty()) {
            o(j10 - this.f26118d, bbVarQ);
        }
        n(j10);
    }

    public final /* synthetic */ void l(String str, long j10) {
        h();
        n9.m.f(str);
        Map map = this.f26117c;
        if (map.isEmpty()) {
            this.f26118d = j10;
        }
        Integer num = (Integer) map.get(str);
        if (num != null) {
            map.put(str, Integer.valueOf(num.intValue() + 1));
        } else if (map.size() >= 100) {
            this.f25625a.a().r().a("Too many ads visible");
        } else {
            map.put(str, 1);
            this.b.put(str, Long.valueOf(j10));
        }
    }

    public final /* synthetic */ void m(String str, long j10) {
        h();
        n9.m.f(str);
        Map map = this.f26117c;
        Integer num = (Integer) map.get(str);
        if (num == null) {
            this.f25625a.a().o().b("Call to endAdUnitExposure for unknown ad unit id", str);
            return;
        }
        bb bbVarQ = this.f25625a.I().q(false);
        int iIntValue = num.intValue() - 1;
        if (iIntValue != 0) {
            map.put(str, Integer.valueOf(iIntValue));
            return;
        }
        map.remove(str);
        Map map2 = this.b;
        Long l10 = (Long) map2.get(str);
        if (l10 == null) {
            this.f25625a.a().o().a("First ad unit exposure time was never set");
        } else {
            long jLongValue = j10 - l10.longValue();
            map2.remove(str);
            p(str, jLongValue, bbVarQ);
        }
        if (map.isEmpty()) {
            long j11 = this.f26118d;
            if (j11 == 0) {
                this.f25625a.a().o().a("First ad exposure time was never set");
            } else {
                o(j10 - j11, bbVarQ);
                this.f26118d = 0L;
            }
        }
    }

    public final void o(long j10, bb bbVar) {
        if (bbVar == null) {
            this.f25625a.a().w().a("Not logging ad exposure. No active activity");
            return;
        }
        if (j10 < 1000) {
            this.f25625a.a().w().b("Not logging ad exposure. Less than 1000 ms. exposure", Long.valueOf(j10));
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putLong("_xt", j10);
        ve.k0(bbVar, bundle, true);
        this.f25625a.B().t("am", "_xa", bundle);
    }

    public final void p(String str, long j10, bb bbVar) {
        if (bbVar == null) {
            this.f25625a.a().w().a("Not logging ad unit exposure. No active activity");
            return;
        }
        if (j10 < 1000) {
            this.f25625a.a().w().b("Not logging ad unit exposure. Less than 1000 ms. exposure", Long.valueOf(j10));
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putString("_ai", str);
        bundle.putLong("_xt", j10);
        ve.k0(bbVar, bundle, true);
        this.f25625a.B().t("am", "_xu", bundle);
    }

    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public final void n(long j10) {
        Map map = this.b;
        Iterator it = map.keySet().iterator();
        while (it.hasNext()) {
            map.put((String) it.next(), Long.valueOf(j10));
        }
        if (map.isEmpty()) {
            return;
        }
        this.f26118d = j10;
    }
}
