package p281m0;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapRegionDecoder;
import android.graphics.Rect;
import java.io.IOException;
import java.util.Objects;
import p140g0.C5891h1;
import p347p0.C10085a0;
import p347p0.C10091g;
import p531x0.AbstractC12578b0;
import p531x0.InterfaceC12576a0;

/* JADX INFO: renamed from: m0.e0 */
/* JADX INFO: loaded from: classes.dex */
public final class C8285e0 implements InterfaceC12576a0<AbstractC12578b0<byte[]>, AbstractC12578b0<Bitmap>> {
    /* JADX DEBUG: Method merged with bridge method: apply(Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // p531x0.InterfaceC12576a0
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public AbstractC12578b0<Bitmap> apply(AbstractC12578b0<byte[]> abstractC12578b0) throws C5891h1 {
        Rect rectMo46928b = abstractC12578b0.mo46928b();
        Bitmap bitmapM33713b = m33713b(abstractC12578b0.mo46929c(), rectMo46928b);
        C10091g c10091gMo46930d = abstractC12578b0.mo46930d();
        Objects.requireNonNull(c10091gMo46930d);
        return AbstractC12578b0.m46935j(bitmapM33713b, c10091gMo46930d, new Rect(0, 0, bitmapM33713b.getWidth(), bitmapM33713b.getHeight()), abstractC12578b0.mo46932f(), C10085a0.m38894v(abstractC12578b0.mo46933g(), rectMo46928b), abstractC12578b0.mo46927a());
    }

    /* JADX INFO: renamed from: b */
    public final Bitmap m33713b(byte[] bArr, Rect rect) throws C5891h1 {
        try {
            return BitmapRegionDecoder.newInstance(bArr, 0, bArr.length, false).decodeRegion(rect, new BitmapFactory.Options());
        } catch (IOException e10) {
            throw new C5891h1(1, "Failed to decode JPEG.", e10);
        }
    }
}
