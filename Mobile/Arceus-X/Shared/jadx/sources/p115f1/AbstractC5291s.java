package p115f1;

import android.annotation.SuppressLint;
import java.util.Objects;
import p533x2.InterfaceC12631a;

/* JADX INFO: renamed from: f1.s */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5291s {

    /* JADX INFO: renamed from: f1.s$a */
    public static abstract class a {
        /* JADX INFO: renamed from: a */
        public abstract AbstractC5291s mo24308a();

        /* JADX INFO: renamed from: b */
        public a m24572b(InterfaceC12631a<AbstractC5245c2.a> interfaceC12631a) {
            AbstractC5245c2.a aVarMo24267f = mo24309c().mo24267f();
            interfaceC12631a.accept(aVarMo24267f);
            mo24312f(aVarMo24267f.mo24268a());
            return this;
        }

        @SuppressLint({"KotlinPropertyAccess"})
        /* JADX INFO: renamed from: c */
        public abstract AbstractC5245c2 mo24309c();

        /* JADX INFO: renamed from: d */
        public abstract a mo24310d(AbstractC5234a abstractC5234a);

        /* JADX INFO: renamed from: e */
        public abstract a mo24311e(int i10);

        /* JADX INFO: renamed from: f */
        public abstract a mo24312f(AbstractC5245c2 abstractC5245c2);
    }

    /* JADX INFO: renamed from: a */
    public static a m24567a() {
        return new C5255g.b().mo24311e(-1).mo24310d(AbstractC5234a.m24218a().mo24224a()).mo24312f(AbstractC5245c2.m24262a().mo24268a());
    }

    /* JADX INFO: renamed from: e */
    public static String m24568e(int i10) {
        return i10 != 1 ? "audio/mp4a-latm" : "audio/vorbis";
    }

    /* JADX INFO: renamed from: f */
    public static int m24569f(int i10) {
        return Objects.equals(m24568e(i10), "audio/mp4a-latm") ? 2 : -1;
    }

    /* JADX INFO: renamed from: g */
    public static int m24570g(int i10) {
        return i10 != 1 ? 0 : 1;
    }

    /* JADX INFO: renamed from: h */
    public static String m24571h(int i10) {
        return i10 != 1 ? "video/avc" : "video/x-vnd.on2.vp8";
    }

    /* JADX INFO: renamed from: b */
    public abstract AbstractC5234a mo24304b();

    /* JADX INFO: renamed from: c */
    public abstract int mo24305c();

    /* JADX INFO: renamed from: d */
    public abstract AbstractC5245c2 mo24306d();

    /* JADX INFO: renamed from: i */
    public abstract a mo24307i();
}
