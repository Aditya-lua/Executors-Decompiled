package m0;

import com.google.mlkit.vision.barcode.common.Barcode;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class f0 implements x0.a0<a, g0.f1.i> {

    public static abstract class a {
        public static a c(x0.b0<byte[]> b0Var, g0.f1.h hVar) {
            return new e(b0Var, hVar);
        }

        public abstract g0.f1.h a();

        public abstract x0.b0<byte[]> b();
    }

    public static void b(File file, byte[] bArr) throws g0.h1 {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            try {
                fileOutputStream.write(bArr, 0, new v0.c().b(bArr));
                fileOutputStream.close();
            } catch (Throwable th2) {
                try {
                    fileOutputStream.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        } catch (IOException e10) {
            throw new g0.h1(1, "Failed to write to temp file", e10);
        }
    }

    @Override // x0.a0
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public g0.f1.i apply(a aVar) throws g0.h1 {
        x0.b0<byte[]> b0VarB = aVar.b();
        g0.f1.h hVarA = aVar.a();
        File fileE = z.e(hVarA);
        b(fileE, b0VarB.c());
        p0.g gVarD = b0VarB.d();
        Objects.requireNonNull(gVarD);
        z.l(fileE, gVarD, hVarA, b0VarB.f());
        return new g0.f1.i(z.j(fileE, hVarA), Barcode.FORMAT_QR_CODE);
    }
}
