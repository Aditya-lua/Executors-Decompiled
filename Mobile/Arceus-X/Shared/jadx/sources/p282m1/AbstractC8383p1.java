package p282m1;

import android.media.MediaFormat;
import android.util.Size;
import p296n0.EnumC8723a4;

/* JADX INFO: renamed from: m1.p1 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC8383p1 implements InterfaceC8375n {

    /* JADX INFO: renamed from: m1.p1$a */
    public static abstract class a {
        /* JADX INFO: renamed from: a */
        public abstract AbstractC8383p1 mo33915a();

        /* JADX INFO: renamed from: b */
        public abstract a mo33916b(int i10);

        /* JADX INFO: renamed from: c */
        public abstract a mo33917c(int i10);

        /* JADX INFO: renamed from: d */
        public abstract a mo33918d(int i10);

        /* JADX INFO: renamed from: e */
        public abstract a mo33919e(AbstractC8386q1 abstractC8386q1);

        /* JADX INFO: renamed from: f */
        public abstract a mo33920f(int i10);

        /* JADX INFO: renamed from: g */
        public abstract a mo33921g(int i10);

        /* JADX INFO: renamed from: h */
        public abstract a mo33922h(EnumC8723a4 enumC8723a4);

        /* JADX INFO: renamed from: i */
        public abstract a mo33923i(String str);

        /* JADX INFO: renamed from: j */
        public abstract a mo33924j(int i10);

        /* JADX INFO: renamed from: k */
        public abstract a mo33925k(Size size);
    }

    /* JADX INFO: renamed from: d */
    public static a m34061d() {
        return new C8345d.b().mo33924j(-1).mo33921g(1).mo33918d(2130708361).mo33919e(AbstractC8386q1.f30926a);
    }

    @Override // p282m1.InterfaceC8375n
    /* JADX INFO: renamed from: a */
    public MediaFormat mo33889a() {
        Size sizeMo33913l = mo33913l();
        MediaFormat mediaFormatCreateVideoFormat = MediaFormat.createVideoFormat(mo33890b(), sizeMo33913l.getWidth(), sizeMo33913l.getHeight());
        mediaFormatCreateVideoFormat.setInteger("color-format", mo33908g());
        mediaFormatCreateVideoFormat.setInteger("bitrate", mo33906e());
        mediaFormatCreateVideoFormat.setInteger("frame-rate", mo33910i());
        if (mo33910i() != mo33907f()) {
            mediaFormatCreateVideoFormat.setInteger("operating-rate", mo33907f());
            mediaFormatCreateVideoFormat.setInteger("priority", 0);
        }
        mediaFormatCreateVideoFormat.setInteger("i-frame-interval", mo33911j());
        if (mo33912k() != -1) {
            mediaFormatCreateVideoFormat.setInteger("profile", mo33912k());
        }
        AbstractC8386q1 abstractC8386q1Mo33909h = mo33909h();
        if (abstractC8386q1Mo33909h.mo33928c() != 0) {
            mediaFormatCreateVideoFormat.setInteger("color-standard", abstractC8386q1Mo33909h.mo33928c());
        }
        if (abstractC8386q1Mo33909h.mo33929d() != 0) {
            mediaFormatCreateVideoFormat.setInteger("color-transfer", abstractC8386q1Mo33909h.mo33929d());
        }
        if (abstractC8386q1Mo33909h.mo33927b() != 0) {
            mediaFormatCreateVideoFormat.setInteger("color-range", abstractC8386q1Mo33909h.mo33927b());
        }
        return mediaFormatCreateVideoFormat;
    }

    @Override // p282m1.InterfaceC8375n
    /* JADX INFO: renamed from: b */
    public abstract String mo33890b();

    @Override // p282m1.InterfaceC8375n
    /* JADX INFO: renamed from: c */
    public abstract EnumC8723a4 mo33891c();

    /* JADX INFO: renamed from: e */
    public abstract int mo33906e();

    /* JADX INFO: renamed from: f */
    public abstract int mo33907f();

    /* JADX INFO: renamed from: g */
    public abstract int mo33908g();

    /* JADX INFO: renamed from: h */
    public abstract AbstractC8386q1 mo33909h();

    /* JADX INFO: renamed from: i */
    public abstract int mo33910i();

    /* JADX INFO: renamed from: j */
    public abstract int mo33911j();

    /* JADX INFO: renamed from: k */
    public abstract int mo33912k();

    /* JADX INFO: renamed from: l */
    public abstract Size mo33913l();

    /* JADX INFO: renamed from: m */
    public abstract a mo33914m();
}
