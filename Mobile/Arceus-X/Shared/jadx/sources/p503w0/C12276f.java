package p503w0;

import androidx.camera.core.InterfaceC0494d;
import p140g0.InterfaceC5895i1;
import p296n0.C8749f0;
import p296n0.EnumC8719a0;
import p296n0.EnumC8731c0;
import p296n0.EnumC8848y;
import p296n0.InterfaceC8743e0;

/* JADX INFO: renamed from: w0.f */
/* JADX INFO: loaded from: classes.dex */
public final class C12276f extends C12271a<InterfaceC0494d> {
    public C12276f(int i10, InterfaceC12273c.a<InterfaceC0494d> aVar) {
        super(i10, aVar);
    }

    /* JADX DEBUG: Method merged with bridge method: b(Ljava/lang/Object;)V */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // p503w0.C12271a, p503w0.InterfaceC12273c
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void mo45551b(InterfaceC0494d interfaceC0494d) {
        if (m45575d(interfaceC0494d.mo2192H2())) {
            super.mo45551b(interfaceC0494d);
        } else {
            this.f43474d.mo45568a((T) interfaceC0494d);
        }
    }

    /* JADX INFO: renamed from: d */
    public final boolean m45575d(InterfaceC5895i1 interfaceC5895i1) {
        InterfaceC8743e0 interfaceC8743e0M35087a = C8749f0.m35087a(interfaceC5895i1);
        if (interfaceC8743e0M35087a == null) {
            return false;
        }
        return (interfaceC8743e0M35087a.mo6738g() == EnumC8719a0.LOCKED_FOCUSED || interfaceC8743e0M35087a.mo6738g() == EnumC8719a0.PASSIVE_FOCUSED) && interfaceC8743e0M35087a.mo6741j() == EnumC8848y.CONVERGED && interfaceC8743e0M35087a.mo6739h() == EnumC8731c0.CONVERGED;
    }
}
