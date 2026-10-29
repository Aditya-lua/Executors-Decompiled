package m0;

import android.graphics.Bitmap;
import android.os.Build;
import com.google.mlkit.vision.barcode.common.Barcode;
import java.io.ByteArrayOutputStream;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class k implements x0.a0<b, x0.b0<byte[]>> {

    public static class a {
        public static boolean a(Bitmap bitmap) {
            return bitmap.hasGainmap();
        }
    }

    public static abstract class b {
        public static b c(x0.b0<Bitmap> b0Var, int i10) {
            return new m0.a(b0Var, i10);
        }

        public abstract int a();

        public abstract x0.b0<Bitmap> b();
    }

    public static int b(Bitmap bitmap) {
        if (Build.VERSION.SDK_INT < 34 || !a.a(bitmap)) {
            return Barcode.FORMAT_QR_CODE;
        }
        return 4101;
    }

    @Override // x0.a0
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public x0.b0<byte[]> apply(b bVar) {
        x0.b0<Bitmap> b0VarB = bVar.b();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        b0VarB.c().compress(Bitmap.CompressFormat.JPEG, bVar.a(), byteArrayOutputStream);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        p0.g gVarD = b0VarB.d();
        Objects.requireNonNull(gVarD);
        return x0.b0.m(byteArray, gVarD, b(b0VarB.c()), b0VarB.h(), b0VarB.b(), b0VarB.f(), b0VarB.g(), b0VarB.a());
    }
}
