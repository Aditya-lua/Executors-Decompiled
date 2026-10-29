package p281m0;

import androidx.camera.core.C0496f;
import androidx.camera.core.ImageProcessingUtil;
import androidx.camera.core.InterfaceC0494d;
import java.util.Objects;
import p140g0.C5915n1;
import p347p0.C10091g;
import p531x0.AbstractC12578b0;
import p531x0.InterfaceC12576a0;

/* JADX INFO: renamed from: m0.g0 */
/* JADX INFO: loaded from: classes.dex */
public class C8291g0 implements InterfaceC12576a0<AbstractC12578b0<byte[]>, AbstractC12578b0<InterfaceC0494d>> {
    /* JADX DEBUG: Method merged with bridge method: apply(Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // p531x0.InterfaceC12576a0
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public AbstractC12578b0<InterfaceC0494d> apply(AbstractC12578b0<byte[]> abstractC12578b0) {
        C0496f c0496f = new C0496f(C5915n1.m26550a(abstractC12578b0.mo46934h().getWidth(), abstractC12578b0.mo46934h().getHeight(), 256, 2));
        InterfaceC0494d interfaceC0494dM2173e = ImageProcessingUtil.m2173e(c0496f, abstractC12578b0.mo46929c());
        c0496f.m2225j();
        Objects.requireNonNull(interfaceC0494dM2173e);
        C10091g c10091gMo46930d = abstractC12578b0.mo46930d();
        Objects.requireNonNull(c10091gMo46930d);
        return AbstractC12578b0.m46936k(interfaceC0494dM2173e, c10091gMo46930d, abstractC12578b0.mo46928b(), abstractC12578b0.mo46932f(), abstractC12578b0.mo46933g(), abstractC12578b0.mo46927a());
    }
}
