package p281m0;

import android.graphics.Bitmap;
import androidx.camera.core.InterfaceC0494d;
import java.util.Objects;
import p347p0.C10091g;
import p503w0.C12272b;
import p531x0.AbstractC12578b0;
import p531x0.C12617v;
import p531x0.C12623y;
import p531x0.InterfaceC12576a0;

/* JADX INFO: renamed from: m0.l */
/* JADX INFO: loaded from: classes.dex */
public class C8305l implements InterfaceC12576a0<AbstractC12578b0<Bitmap>, AbstractC12578b0<Bitmap>> {

    /* JADX INFO: renamed from: a */
    public final C12623y f30653a;

    public C8305l(C12623y c12623y) {
        this.f30653a = c12623y;
    }

    /* JADX DEBUG: Method merged with bridge method: apply(Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // p531x0.InterfaceC12576a0
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public AbstractC12578b0<Bitmap> apply(AbstractC12578b0<Bitmap> abstractC12578b0) {
        InterfaceC0494d interfaceC0494dM26523a = this.f30653a.m47020c(new C12617v(new C8335z0(abstractC12578b0), 1)).m26523a();
        Objects.requireNonNull(interfaceC0494dM26523a);
        Bitmap bitmapM45555d = C12272b.m45555d(interfaceC0494dM26523a.mo2186H1(), interfaceC0494dM26523a.getWidth(), interfaceC0494dM26523a.getHeight());
        C10091g c10091gMo46930d = abstractC12578b0.mo46930d();
        Objects.requireNonNull(c10091gMo46930d);
        return AbstractC12578b0.m46935j(bitmapM45555d, c10091gMo46930d, abstractC12578b0.mo46928b(), abstractC12578b0.mo46932f(), abstractC12578b0.mo46933g(), abstractC12578b0.mo46927a());
    }
}
