package m0;

import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.DngCreator;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public class y implements x0.a0<a, g0.f1.i> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public DngCreator f23680a;

    public static abstract class a {
        public static a d(androidx.camera.core.d dVar, int i10, g0.f1.h hVar) {
            return new c(dVar, i10, hVar);
        }

        public abstract androidx.camera.core.d a();

        public abstract g0.f1.h b();

        public abstract int c();
    }

    public y(CameraCharacteristics cameraCharacteristics, CaptureResult captureResult) {
        this(new DngCreator(cameraCharacteristics, captureResult));
    }

    public static int b(int i10) {
        if (i10 == 0) {
            return 1;
        }
        if (i10 == 90) {
            return 6;
        }
        if (i10 != 180) {
            return i10 != 270 ? 0 : 8;
        }
        return 3;
    }

    @Override // x0.a0
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public g0.f1.i apply(a aVar) {
        g0.f1.h hVarB = aVar.b();
        File fileE = z.e(hVarB);
        c(fileE, aVar.a(), aVar.c());
        return new g0.f1.i(z.j(fileE, hVarB), 32);
    }

    public final void c(File file, androidx.camera.core.d dVar, int i10) {
        try {
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(file);
                try {
                    this.f23680a.setOrientation(b(i10));
                    this.f23680a.writeImage(fileOutputStream, dVar.p());
                    fileOutputStream.close();
                    dVar.close();
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
            } catch (IllegalArgumentException e11) {
                throw new g0.h1(1, "Image with an unsupported format was used", e11);
            } catch (IllegalStateException e12) {
                throw new g0.h1(1, "Not enough metadata information has been set to write a well-formatted DNG file", e12);
            }
        } catch (Throwable th4) {
            dVar.close();
            throw th4;
        }
    }

    public y(DngCreator dngCreator) {
        this.f23680a = dngCreator;
    }
}
