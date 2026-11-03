package z;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public final class t2 implements n0.j4 {
    public final q3 b;

    public t2(Context context) {
        this.b = q3.c(context);
    }

    @Override // n0.j4
    public n0.n1 a(n0.j4.b bVar, int i10) {
        n0.x2 x2VarK0 = n0.x2.k0();
        n0.o3.b bVar2 = new n0.o3.b();
        bVar2.B(t5.b(bVar, i10));
        x2VarK0.G(n0.i4.f25518w, bVar2.p());
        x2VarK0.G(n0.i4.f25520y, s2.f37503a);
        n0.l1.a aVar = new n0.l1.a();
        aVar.v(t5.a(bVar, i10));
        x2VarK0.G(n0.i4.f25519x, aVar.h());
        x2VarK0.G(n0.i4.f25521z, bVar == n0.j4.b.IMAGE_CAPTURE ? n4.f37413c : b1.f37137a);
        if (bVar == n0.j4.b.PREVIEW) {
            x2VarK0.G(n0.i2.f25511s, this.b.f());
        }
        x2VarK0.G(n0.i2.f25506n, Integer.valueOf(this.b.d(true).getRotation()));
        if (bVar == n0.j4.b.VIDEO_CAPTURE || bVar == n0.j4.b.STREAM_SHARING) {
            x2VarK0.G(n0.i4.E, Boolean.TRUE);
        }
        return n0.c3.j0(x2VarK0);
    }
}
