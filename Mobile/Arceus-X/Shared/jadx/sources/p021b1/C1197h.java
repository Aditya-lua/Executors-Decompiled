package p021b1;

import java.util.UUID;
import p296n0.C8734c3;
import p296n0.C8846x2;
import p296n0.InterfaceC8771i4;
import p296n0.InterfaceC8777j4;
import p296n0.InterfaceC8841w2;
import p424s0.InterfaceC11156q;

/* JADX INFO: renamed from: b1.h */
/* JADX INFO: loaded from: classes.dex */
public class C1197h implements InterfaceC8771i4.b<C1196g, C1198i, C1197h> {

    /* JADX INFO: renamed from: a */
    public final C8846x2 f4981a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1197h() {
        this(C8846x2.m35505k0());
    }

    @Override // p140g0.InterfaceC5906l0
    /* JADX INFO: renamed from: a */
    public InterfaceC8841w2 mo6684a() {
        return this.f4981a;
    }

    /* JADX DEBUG: Method merged with bridge method: e()Ln0/i4; */
    @Override // p296n0.InterfaceC8771i4.b
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public C1198i mo6688e() {
        return new C1198i(C8734c3.m35022j0(this.f4981a));
    }

    /* JADX INFO: renamed from: c */
    public C1197h m6686c(InterfaceC8777j4.b bVar) {
        mo6684a().mo35473G(InterfaceC8771i4.f31902G, bVar);
        return this;
    }

    /* JADX INFO: renamed from: d */
    public C1197h m6687d(Class<C1196g> cls) {
        mo6684a().mo35473G(InterfaceC11156q.f39401N, cls);
        if (mo6684a().mo35030h(InterfaceC11156q.f39400M, null) == null) {
            m6689f(cls.getCanonicalName() + "-" + UUID.randomUUID());
        }
        return this;
    }

    /* JADX INFO: renamed from: f */
    public C1197h m6689f(String str) {
        mo6684a().mo35473G(InterfaceC11156q.f39400M, str);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public C1197h(C8846x2 c8846x2) {
        this.f4981a = c8846x2;
        Class cls = (Class) c8846x2.mo35030h(InterfaceC11156q.f39401N, null);
        if (cls == null || cls.equals(C1196g.class)) {
            m6686c(InterfaceC8777j4.b.STREAM_SHARING);
            m6687d(C1196g.class);
            return;
        }
        throw new IllegalArgumentException("Invalid target class configuration for " + this + ": " + cls);
    }
}
