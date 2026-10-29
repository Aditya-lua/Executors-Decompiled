package p140g0;

import p296n0.C8720a1;
import p296n0.C8729b4;
import p296n0.InterfaceC8797n3;
import p533x2.C12637g;

/* JADX INFO: renamed from: g0.c2 */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC5872c2 {

    /* JADX INFO: renamed from: a */
    public static final InterfaceC5872c2 f22388a = new InterfaceC5872c2() { // from class: g0.b2
        @Override // p140g0.InterfaceC5872c2
        /* JADX INFO: renamed from: e */
        public final InterfaceC5872c2.c mo26311e(InterfaceC5872c2.b bVar) {
            return InterfaceC5872c2.c.f22393d;
        }
    };

    /* JADX INFO: renamed from: b */
    public static final InterfaceC5872c2 f22389b = new C8720a1.b(m26315c());

    /* JADX INFO: renamed from: c */
    public static final InterfaceC5872c2 f22390c = new C8720a1(m26315c());

    /* JADX INFO: renamed from: g0.c2$a */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public final InterfaceC5872c2 f22391a;

        /* JADX INFO: renamed from: b */
        public long f22392b;

        public a(InterfaceC5872c2 interfaceC5872c2) {
            this.f22391a = interfaceC5872c2;
            this.f22392b = interfaceC5872c2.mo26317a();
        }

        /* JADX INFO: renamed from: a */
        public InterfaceC5872c2 m26318a() {
            InterfaceC5872c2 interfaceC5872c2 = this.f22391a;
            return interfaceC5872c2 instanceof InterfaceC8797n3 ? ((InterfaceC8797n3) interfaceC5872c2).mo34975b(this.f22392b) : new C8729b4(this.f22392b, this.f22391a);
        }
    }

    /* JADX INFO: renamed from: g0.c2$b */
    public interface b {
        /* JADX INFO: renamed from: m */
        int mo26319m();

        /* JADX INFO: renamed from: n */
        Throwable mo26320n();

        /* JADX INFO: renamed from: o */
        long mo26321o();
    }

    /* JADX INFO: renamed from: g0.c2$c */
    public static final class c {

        /* JADX INFO: renamed from: d */
        public static final c f22393d = new c(false, 0);

        /* JADX INFO: renamed from: e */
        public static final c f22394e = new c(true);

        /* JADX INFO: renamed from: f */
        public static final c f22395f = new c(true, 100);

        /* JADX INFO: renamed from: g */
        public static c f22396g = new c(false, 0, true);

        /* JADX INFO: renamed from: a */
        public final long f22397a;

        /* JADX INFO: renamed from: b */
        public final boolean f22398b;

        /* JADX INFO: renamed from: c */
        public final boolean f22399c;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public c(boolean z10) {
            this(z10, m26322a());
        }

        /* JADX INFO: renamed from: a */
        public static long m26322a() {
            return 500L;
        }

        /* JADX INFO: renamed from: b */
        public long m26323b() {
            return this.f22397a;
        }

        /* JADX INFO: renamed from: c */
        public boolean m26324c() {
            return this.f22399c;
        }

        /* JADX INFO: renamed from: d */
        public boolean m26325d() {
            return this.f22398b;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public c(boolean z10, long j10) {
            this(z10, j10, false);
        }

        public c(boolean z10, long j10, boolean z11) {
            this.f22398b = z10;
            this.f22397a = j10;
            if (z11) {
                C12637g.m47070b(!z10, "shouldRetry must be false when completeWithoutFailure is set to true");
            }
            this.f22399c = z11;
        }
    }

    /* JADX INFO: renamed from: c */
    static long m26315c() {
        return 6000L;
    }

    /* JADX INFO: renamed from: a */
    default long mo26317a() {
        return 0L;
    }

    /* JADX INFO: renamed from: e */
    c mo26311e(b bVar);
}
