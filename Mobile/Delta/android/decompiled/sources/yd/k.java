package yd;

import android.util.Log;
import com.google.mlkit.vision.barcode.common.Barcode;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.util.Set;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

/* JADX INFO: loaded from: classes2.dex */
public final class k implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Set f35844a;
    public final /* synthetic */ u b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ZipFile f35845c;

    public k(o oVar, Set set, u uVar, ZipFile zipFile) {
        this.f35844a = set;
        this.b = uVar;
        this.f35845c = zipFile;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0070 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // yd.m
    public final void a(n nVar, File file, boolean z10) throws IllegalAccessException, IOException, InvocationTargetException {
        this.f35844a.add(file);
        if (z10) {
            return;
        }
        Log.i("SplitCompat", String.format("NativeLibraryExtractor: split '%s' has native library '%s' that does not exist; extracting from '%s!%s' to '%s'", this.b.b(), nVar.f35846a, this.b.a().getAbsolutePath(), nVar.b.getName(), file.getAbsolutePath()));
        ZipFile zipFile = this.f35845c;
        ZipEntry zipEntry = nVar.b;
        byte[] bArr = new byte[Barcode.FORMAT_AZTEC];
        if (file.exists()) {
            file.delete();
        }
        InputStream inputStream = zipFile.getInputStream(zipEntry);
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            try {
                f.m(file);
                while (true) {
                    int i10 = inputStream.read(bArr);
                    if (i10 <= 0) {
                        fileOutputStream.close();
                        inputStream.close();
                        return;
                    }
                    fileOutputStream.write(bArr, 0, i10);
                    if (inputStream != null) {
                        try {
                            inputStream.close();
                        } catch (Throwable th2) {
                            Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                        }
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                try {
                    fileOutputStream.close();
                } catch (Throwable th4) {
                    Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th3, th4);
                }
                throw th3;
            }
        } catch (Throwable th5) {
            if (inputStream != null) {
                inputStream.close();
            }
            throw th5;
        }
    }
}
