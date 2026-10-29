package p601zd;

import android.util.Log;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.util.Set;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

/* JADX INFO: renamed from: zd.k */
/* JADX INFO: loaded from: classes2.dex */
public final class C13782k implements InterfaceC13784m {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Set f48374a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ AbstractC13792u f48375b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ZipFile f48376c;

    public C13782k(C13786o c13786o, Set set, AbstractC13792u abstractC13792u, ZipFile zipFile) {
        this.f48374a = set;
        this.f48375b = abstractC13792u;
        this.f48376c = zipFile;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0070 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // p601zd.InterfaceC13784m
    /* JADX INFO: renamed from: a */
    public final void mo50231a(C13785n c13785n, File file, boolean z10) throws IllegalAccessException, IOException, InvocationTargetException {
        this.f48374a.add(file);
        if (z10) {
            return;
        }
        Log.i("SplitCompat", String.format("NativeLibraryExtractor: split '%s' has native library '%s' that does not exist; extracting from '%s!%s' to '%s'", this.f48375b.mo50204b(), c13785n.f48377a, this.f48375b.mo50203a().getAbsolutePath(), c13785n.f48378b.getName(), file.getAbsolutePath()));
        ZipFile zipFile = this.f48376c;
        ZipEntry zipEntry = c13785n.f48378b;
        byte[] bArr = new byte[4096];
        if (file.exists()) {
            file.delete();
        }
        InputStream inputStream = zipFile.getInputStream(zipEntry);
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            try {
                C13777f.m50207m(file);
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
