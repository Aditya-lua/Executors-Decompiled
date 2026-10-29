package p296n0;

import p140g0.C5931r1;
import p140g0.InterfaceC5872c2;

/* JADX INFO: renamed from: n0.a1 */
/* JADX INFO: loaded from: classes.dex */
public final class C8720a1 implements InterfaceC8797n3 {

    /* JADX INFO: renamed from: d */
    public final InterfaceC5872c2 f31743d;

    /* JADX INFO: renamed from: n0.a1$a */
    public class a implements InterfaceC5872c2 {

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ long f31744d;

        /* JADX DEBUG: Incorrect args count in method signature: ()V */
        public a(long j10) {
            this.f31744d = j10;
        }

        @Override // p140g0.InterfaceC5872c2
        /* JADX INFO: renamed from: a */
        public long mo26317a() {
            return this.f31744d;
        }

        @Override // p140g0.InterfaceC5872c2
        /* JADX INFO: renamed from: e */
        public InterfaceC5872c2.c mo26311e(InterfaceC5872c2.b bVar) {
            return bVar.mo26319m() == 1 ? InterfaceC5872c2.c.f22393d : InterfaceC5872c2.c.f22394e;
        }
    }

    /* JADX INFO: renamed from: n0.a1$b */
    public static final class b implements InterfaceC8797n3 {

        /* JADX INFO: renamed from: d */
        public final InterfaceC5872c2 f31746d;

        public b(long j10) {
            this.f31746d = new C8720a1(j10);
        }

        @Override // p140g0.InterfaceC5872c2
        /* JADX INFO: renamed from: a */
        public long mo26317a() {
            return this.f31746d.mo26317a();
        }

        @Override // p296n0.InterfaceC8797n3
        /* JADX INFO: renamed from: b */
        public InterfaceC5872c2 mo34975b(long j10) {
            return new b(j10);
        }

        @Override // p140g0.InterfaceC5872c2
        /* JADX INFO: renamed from: e */
        public InterfaceC5872c2.c mo26311e(InterfaceC5872c2.b bVar) {
            if (this.f31746d.mo26311e(bVar).m26325d()) {
                return InterfaceC5872c2.c.f22394e;
            }
            Throwable thMo26320n = bVar.mo26320n();
            if (thMo26320n instanceof C8774j1.b) {
                C5931r1.m26563c("CameraX", "The device might underreport the amount of the cameras. Finish the initialize task since we are already reaching the maximum number of retries.");
                if (((C8774j1.b) thMo26320n).m35222a() > 0) {
                    return InterfaceC5872c2.c.f22396g;
                }
            }
            return InterfaceC5872c2.c.f22393d;
        }
    }

    public C8720a1(long j10) {
        this.f31743d = new C8729b4(j10, new a(j10));
    }

    @Override // p140g0.InterfaceC5872c2
    /* JADX INFO: renamed from: a */
    public long mo26317a() {
        return this.f31743d.mo26317a();
    }

    @Override // p296n0.InterfaceC8797n3
    /* JADX INFO: renamed from: b */
    public InterfaceC5872c2 mo34975b(long j10) {
        return new C8720a1(j10);
    }

    @Override // p140g0.InterfaceC5872c2
    /* JADX INFO: renamed from: e */
    public InterfaceC5872c2.c mo26311e(InterfaceC5872c2.b bVar) {
        return this.f31743d.mo26311e(bVar);
    }
}
