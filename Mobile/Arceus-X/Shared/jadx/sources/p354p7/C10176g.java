package p354p7;

import android.util.Pair;
import androidx.annotation.NonNull;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import p431s7.C11189e;

/* JADX INFO: renamed from: p7.g */
/* JADX INFO: loaded from: classes3.dex */
public class C10176g {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final InterfaceC10174e f36744a;

    public C10176g(@NonNull InterfaceC10174e interfaceC10174e) {
        this.f36744a = interfaceC10174e;
    }

    /* JADX INFO: renamed from: b */
    public static String m39190b(String str, EnumC10172c enumC10172c, boolean z10) {
        String strM39189b = z10 ? enumC10172c.m39189b() : enumC10172c.f36743a;
        String strReplaceAll = str.replaceAll("\\W+", "");
        int length = 242 - strM39189b.length();
        if (strReplaceAll.length() > length) {
            strReplaceAll = m39191d(strReplaceAll, length);
        }
        return "lottie_cache_" + strReplaceAll + strM39189b;
    }

    /* JADX INFO: renamed from: d */
    public static String m39191d(String str, int i10) {
        try {
            byte[] bArrDigest = MessageDigest.getInstance("MD5").digest(str.getBytes());
            StringBuilder sb2 = new StringBuilder();
            for (byte b : bArrDigest) {
                sb2.append(String.format("%02x", Byte.valueOf(b)));
            }
            return sb2.toString();
        } catch (NoSuchAlgorithmException unused) {
            return str.substring(0, i10);
        }
    }

    /* JADX INFO: renamed from: a */
    public Pair<EnumC10172c, InputStream> m39192a(String str) {
        EnumC10172c enumC10172c;
        try {
            File fileM39193c = m39193c(str);
            if (fileM39193c == null) {
                return null;
            }
            FileInputStream fileInputStream = new FileInputStream(fileM39193c);
            if (fileM39193c.getAbsolutePath().endsWith(".zip")) {
                enumC10172c = EnumC10172c.ZIP;
            } else {
                enumC10172c = fileM39193c.getAbsolutePath().endsWith(".gz") ? EnumC10172c.GZIP : EnumC10172c.JSON;
            }
            C11189e.m42151a("Cache hit for " + str + " at " + fileM39193c.getAbsolutePath());
            return new Pair<>(enumC10172c, fileInputStream);
        } catch (FileNotFoundException unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: c */
    public final File m39193c(String str) {
        File file = new File(m39194e(), m39190b(str, EnumC10172c.JSON, false));
        if (file.exists()) {
            return file;
        }
        File file2 = new File(m39194e(), m39190b(str, EnumC10172c.ZIP, false));
        if (file2.exists()) {
            return file2;
        }
        File file3 = new File(m39194e(), m39190b(str, EnumC10172c.GZIP, false));
        if (file3.exists()) {
            return file3;
        }
        return null;
    }

    /* JADX INFO: renamed from: e */
    public final File m39194e() {
        File fileMo24921a = this.f36744a.mo24921a();
        if (fileMo24921a.isFile()) {
            fileMo24921a.delete();
        }
        if (!fileMo24921a.exists()) {
            fileMo24921a.mkdirs();
        }
        return fileMo24921a;
    }

    /* JADX INFO: renamed from: f */
    public void m39195f(String str, EnumC10172c enumC10172c) {
        File file = new File(m39194e(), m39190b(str, enumC10172c, true));
        File file2 = new File(file.getAbsolutePath().replace(".temp", ""));
        boolean zRenameTo = file.renameTo(file2);
        C11189e.m42151a("Copying temp file to real file (" + file2 + ")");
        if (zRenameTo) {
            return;
        }
        C11189e.m42153c("Unable to rename cache file " + file.getAbsolutePath() + " to " + file2.getAbsolutePath() + ".");
    }

    /* JADX INFO: renamed from: g */
    public File m39196g(String str, InputStream inputStream, EnumC10172c enumC10172c) throws IOException {
        File file = new File(m39194e(), m39190b(str, enumC10172c, true));
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            try {
                byte[] bArr = new byte[1024];
                while (true) {
                    int i10 = inputStream.read(bArr);
                    if (i10 == -1) {
                        fileOutputStream.flush();
                        fileOutputStream.close();
                        inputStream.close();
                        return file;
                    }
                    fileOutputStream.write(bArr, 0, i10);
                }
            } catch (Throwable th2) {
                fileOutputStream.close();
                throw th2;
            }
        } catch (Throwable th3) {
            inputStream.close();
            throw th3;
        }
    }
}
