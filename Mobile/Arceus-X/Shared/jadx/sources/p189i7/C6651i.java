package p189i7;

import android.graphics.Path;
import android.graphics.PointF;
import p121f7.C5452i;
import p431s7.C11197m;
import p444t7.C11550a;

/* JADX INFO: renamed from: i7.i */
/* JADX INFO: loaded from: classes3.dex */
public class C6651i extends C11550a<PointF> {

    /* JADX INFO: renamed from: q */
    public Path f25651q;

    /* JADX INFO: renamed from: r */
    public final C11550a<PointF> f25652r;

    public C6651i(C5452i c5452i, C11550a<PointF> c11550a) {
        super(c5452i, c11550a.f40889b, c11550a.f40890c, c11550a.f40891d, c11550a.f40892e, c11550a.f40893f, c11550a.f40894g, c11550a.f40895h);
        this.f25652r = c11550a;
        m28702j();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r1v2, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: j */
    public void m28702j() {
        T t8;
        T t10;
        T t11 = this.f40890c;
        boolean z10 = (t11 == 0 || (t10 = this.f40889b) == 0 || !((PointF) t10).equals(((PointF) t11).x, ((PointF) t11).y)) ? false : true;
        T t12 = this.f40889b;
        if (t12 == 0 || (t8 = this.f40890c) == 0 || z10) {
            return;
        }
        C11550a<PointF> c11550a = this.f25652r;
        this.f25651q = C11197m.m42215d((PointF) t12, (PointF) t8, c11550a.f40902o, c11550a.f40903p);
    }

    /* JADX INFO: renamed from: k */
    public Path m28703k() {
        return this.f25651q;
    }
}
