package l1;

import android.util.Range;
import android.util.Size;
import f1.c2;
import g0.k0;
import g0.r1;
import m1.p1;
import n0.a4;

/* JADX INFO: loaded from: classes.dex */
public class n implements x2.h<p1> {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Size f22911g = new Size(1280, 720);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f22912a;
    public final a4 b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c2 f22913c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Size f22914d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final k0 f22915e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Range<Integer> f22916f;

    public n(String str, a4 a4Var, c2 c2Var, Size size, k0 k0Var, Range<Integer> range) {
        this.f22912a = str;
        this.b = a4Var;
        this.f22913c = c2Var;
        this.f22914d = size;
        this.f22915e = k0Var;
        this.f22916f = range;
    }

    @Override // x2.h
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public p1 get() {
        CaptureEncodeRates captureEncodeRatesC = m.c(this.f22913c, this.f22916f);
        r1.a("VidEncCfgDefaultRslvr", "Resolved VIDEO frame rates: Capture frame rate = " + captureEncodeRatesC.getCaptureRate() + "fps. Encode frame rate = " + captureEncodeRatesC.getEncodeRate() + "fps.");
        Range<Integer> rangeC = this.f22913c.c();
        r1.a("VidEncCfgDefaultRslvr", "Using fallback VIDEO bitrate");
        int iA = this.f22915e.a();
        int encodeRate = captureEncodeRatesC.getEncodeRate();
        int width = this.f22914d.getWidth();
        Size size = f22911g;
        int iF = m.f(14000000, iA, 8, encodeRate, 30, width, size.getWidth(), this.f22914d.getHeight(), size.getHeight(), rangeC);
        int iA2 = n1.b.a(this.f22912a, this.f22915e);
        return p1.d().i(this.f22912a).h(this.b).k(this.f22914d).b(iF).c(captureEncodeRatesC.getCaptureRate()).f(captureEncodeRatesC.getEncodeRate()).j(iA2).e(m.b(this.f22912a, iA2)).a();
    }
}
