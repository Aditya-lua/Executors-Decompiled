package p281m0;

import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.DngCreator;
import androidx.camera.core.InterfaceC0494d;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import p140g0.C5883f1;
import p140g0.C5891h1;
import p531x0.InterfaceC12576a0;

/* JADX INFO: renamed from: m0.y */
/* JADX INFO: loaded from: classes.dex */
public class C8332y implements InterfaceC12576a0<a, C5883f1.i> {

    /* JADX INFO: renamed from: a */
    public DngCreator f30728a;

    /* JADX INFO: renamed from: m0.y$a */
    public static abstract class a {
        /* JADX INFO: renamed from: d */
        public static a m33860d(InterfaceC0494d interfaceC0494d, int i10, C5883f1.h hVar) {
            return new C8278c(interfaceC0494d, i10, hVar);
        }

        /* JADX INFO: renamed from: a */
        public abstract InterfaceC0494d mo33694a();

        /* JADX INFO: renamed from: b */
        public abstract C5883f1.h mo33695b();

        /* JADX INFO: renamed from: c */
        public abstract int mo33696c();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C8332y(CameraCharacteristics cameraCharacteristics, CaptureResult captureResult) {
        this(new DngCreator(cameraCharacteristics, captureResult));
    }

    /* JADX INFO: renamed from: b */
    public static int m33857b(int i10) {
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

    /* JADX DEBUG: Method merged with bridge method: apply(Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // p531x0.InterfaceC12576a0
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public C5883f1.i apply(a aVar) {
        C5883f1.h hVarMo33695b = aVar.mo33695b();
        File fileM33876e = C8334z.m33876e(hVarMo33695b);
        m33859c(fileM33876e, aVar.mo33694a(), aVar.mo33696c());
        return new C5883f1.i(C8334z.m33881j(fileM33876e, hVarMo33695b), 32);
    }

    /* JADX INFO: renamed from: c */
    public final void m33859c(File file, InterfaceC0494d interfaceC0494d, int i10) {
        try {
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(file);
                try {
                    this.f30728a.setOrientation(m33857b(i10));
                    this.f30728a.writeImage(fileOutputStream, interfaceC0494d.mo2194p());
                    fileOutputStream.close();
                    interfaceC0494d.close();
                } catch (Throwable th2) {
                    try {
                        fileOutputStream.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                    throw th2;
                }
            } catch (IOException e10) {
                throw new C5891h1(1, "Failed to write to temp file", e10);
            } catch (IllegalArgumentException e11) {
                throw new C5891h1(1, "Image with an unsupported format was used", e11);
            } catch (IllegalStateException e12) {
                throw new C5891h1(1, "Not enough metadata information has been set to write a well-formatted DNG file", e12);
            }
        } catch (Throwable th4) {
            interfaceC0494d.close();
            throw th4;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public C8332y(DngCreator dngCreator) {
        this.f30728a = dngCreator;
    }
}
