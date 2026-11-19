package m0;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapRegionDecoder;
import android.graphics.Rect;
import java.io.IOException;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class e0 implements x0.a0<x0.b0<byte[]>, x0.b0<Bitmap>> {
    @Override // x0.a0
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public x0.b0<Bitmap> apply(x0.b0<byte[]> b0Var) throws g0.h1 {
        Rect rectB = b0Var.b();
        Bitmap bitmapB = b(b0Var.c(), rectB);
        p0.g gVarD = b0Var.d();
        Objects.requireNonNull(gVarD);
        return x0.b0.j(bitmapB, gVarD, new Rect(0, 0, bitmapB.getWidth(), bitmapB.getHeight()), b0Var.f(), p0.a0.v(b0Var.g(), rectB), b0Var.a());
    }

    public final Bitmap b(byte[] bArr, Rect rect) throws g0.h1 {
        try {
            return BitmapRegionDecoder.newInstance(bArr, 0, bArr.length, false).decodeRegion(rect, new BitmapFactory.Options());
        } catch (IOException e10) {
            throw new g0.h1(1, "Failed to decode JPEG.", e10);
        }
    }
}
