package p296n0;

import android.hardware.camera2.CaptureResult;
import p347p0.C10093i;

/* JADX INFO: renamed from: n0.e0 */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC8743e0 {

    /* JADX INFO: renamed from: n0.e0$a */
    public static final class a implements InterfaceC8743e0 {
        /* JADX INFO: renamed from: k */
        public static InterfaceC8743e0 m35074k() {
            return new a();
        }

        @Override // p296n0.InterfaceC8743e0
        /* JADX INFO: renamed from: b */
        public EnumC8737d0 mo6734b() {
            return EnumC8737d0.UNKNOWN;
        }

        @Override // p296n0.InterfaceC8743e0
        /* JADX INFO: renamed from: c */
        public C8857z3 mo6735c() {
            return C8857z3.m35562b();
        }

        @Override // p296n0.InterfaceC8743e0
        /* JADX INFO: renamed from: d */
        public EnumC8725b0 mo6736d() {
            return EnumC8725b0.UNKNOWN;
        }

        @Override // p296n0.InterfaceC8743e0
        /* JADX INFO: renamed from: e */
        public CaptureResult mo35073e() {
            return null;
        }

        @Override // p296n0.InterfaceC8743e0
        /* JADX INFO: renamed from: f */
        public EnumC8843x mo6737f() {
            return EnumC8843x.UNKNOWN;
        }

        @Override // p296n0.InterfaceC8743e0
        /* JADX INFO: renamed from: g */
        public EnumC8719a0 mo6738g() {
            return EnumC8719a0.UNKNOWN;
        }

        @Override // p296n0.InterfaceC8743e0
        public long getTimestamp() {
            return -1L;
        }

        @Override // p296n0.InterfaceC8743e0
        /* JADX INFO: renamed from: h */
        public EnumC8731c0 mo6739h() {
            return EnumC8731c0.UNKNOWN;
        }

        @Override // p296n0.InterfaceC8743e0
        /* JADX INFO: renamed from: i */
        public EnumC8853z mo6740i() {
            return EnumC8853z.UNKNOWN;
        }

        @Override // p296n0.InterfaceC8743e0
        /* JADX INFO: renamed from: j */
        public EnumC8848y mo6741j() {
            return EnumC8848y.UNKNOWN;
        }
    }

    /* JADX INFO: renamed from: a */
    default void mo35072a(C10093i.b bVar) {
        bVar.m38972g(mo6734b());
    }

    /* JADX INFO: renamed from: b */
    EnumC8737d0 mo6734b();

    /* JADX INFO: renamed from: c */
    C8857z3 mo6735c();

    /* JADX INFO: renamed from: d */
    EnumC8725b0 mo6736d();

    /* JADX INFO: renamed from: e */
    default CaptureResult mo35073e() {
        return null;
    }

    /* JADX INFO: renamed from: f */
    EnumC8843x mo6737f();

    /* JADX INFO: renamed from: g */
    EnumC8719a0 mo6738g();

    long getTimestamp();

    /* JADX INFO: renamed from: h */
    EnumC8731c0 mo6739h();

    /* JADX INFO: renamed from: i */
    EnumC8853z mo6740i();

    /* JADX INFO: renamed from: j */
    EnumC8848y mo6741j();
}
