package m1;

import android.media.MediaFormat;
import android.util.Size;
import n0.a4;

/* JADX INFO: loaded from: classes.dex */
public abstract class p1 implements n {

    public static abstract class a {
        public abstract p1 a();

        public abstract a b(int i10);

        public abstract a c(int i10);

        public abstract a d(int i10);

        public abstract a e(q1 q1Var);

        public abstract a f(int i10);

        public abstract a g(int i10);

        public abstract a h(a4 a4Var);

        public abstract a i(String str);

        public abstract a j(int i10);

        public abstract a k(Size size);
    }

    public static a d() {
        return new d.b().j(-1).g(1).d(2130708361).e(q1.f23838a);
    }

    @Override // m1.n
    public MediaFormat a() {
        Size sizeL = l();
        MediaFormat mediaFormatCreateVideoFormat = MediaFormat.createVideoFormat(b(), sizeL.getWidth(), sizeL.getHeight());
        mediaFormatCreateVideoFormat.setInteger("color-format", g());
        mediaFormatCreateVideoFormat.setInteger("bitrate", e());
        mediaFormatCreateVideoFormat.setInteger("frame-rate", i());
        if (i() != f()) {
            mediaFormatCreateVideoFormat.setInteger("operating-rate", f());
            mediaFormatCreateVideoFormat.setInteger("priority", 0);
        }
        mediaFormatCreateVideoFormat.setInteger("i-frame-interval", j());
        if (k() != -1) {
            mediaFormatCreateVideoFormat.setInteger("profile", k());
        }
        q1 q1VarH = h();
        if (q1VarH.c() != 0) {
            mediaFormatCreateVideoFormat.setInteger("color-standard", q1VarH.c());
        }
        if (q1VarH.d() != 0) {
            mediaFormatCreateVideoFormat.setInteger("color-transfer", q1VarH.d());
        }
        if (q1VarH.b() != 0) {
            mediaFormatCreateVideoFormat.setInteger("color-range", q1VarH.b());
        }
        return mediaFormatCreateVideoFormat;
    }

    @Override // m1.n
    public abstract String b();

    @Override // m1.n
    public abstract a4 c();

    public abstract int e();

    public abstract int f();

    public abstract int g();

    public abstract q1 h();

    public abstract int i();

    public abstract int j();

    public abstract int k();

    public abstract Size l();

    public abstract a m();
}
