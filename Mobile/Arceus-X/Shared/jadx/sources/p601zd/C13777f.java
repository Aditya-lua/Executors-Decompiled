package p601zd;

import android.content.Context;
import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: renamed from: zd.f */
/* JADX INFO: loaded from: classes2.dex */
public final class C13777f {

    /* JADX INFO: renamed from: a */
    public final long f48363a;

    /* JADX INFO: renamed from: b */
    public final Context f48364b;

    /* JADX INFO: renamed from: c */
    public File f48365c;

    public C13777f(Context context) {
        this.f48364b = context;
        this.f48363a = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
    }

    /* JADX INFO: renamed from: l */
    public static void m50206l(File file) throws IOException {
        File[] fileArrListFiles;
        if (file.isDirectory() && (fileArrListFiles = file.listFiles()) != null) {
            for (File file2 : fileArrListFiles) {
                m50206l(file2);
            }
        }
        if (file.exists() && !file.delete()) {
            throw new IOException(String.format("Failed to delete '%s'", file.getAbsolutePath()));
        }
    }

    /* JADX INFO: renamed from: m */
    public static void m50207m(File file) {
        file.setWritable(false, true);
        file.setWritable(false, false);
    }

    /* JADX INFO: renamed from: p */
    public static boolean m50208p(File file) {
        return !file.canWrite();
    }

    /* JADX INFO: renamed from: q */
    public static File m50209q(File file, String str) {
        File file2 = new File(file, str);
        if (file2.getCanonicalPath().startsWith(file.getCanonicalPath())) {
            return file2;
        }
        throw new IllegalArgumentException("split ID cannot be placed in target directory");
    }

    /* JADX INFO: renamed from: u */
    public static File m50210u(File file) throws IOException {
        if (!file.exists()) {
            file.mkdirs();
            if (!file.isDirectory()) {
                throw new IOException("Unable to create directory: ".concat(String.valueOf(file.getAbsolutePath())));
            }
        } else if (!file.isDirectory()) {
            throw new IllegalArgumentException("File input must be directory when it exists.");
        }
        return file;
    }

    /* JADX INFO: renamed from: x */
    public static String m50211x(String str) {
        return String.valueOf(str).concat(".apk");
    }

    /* JADX INFO: renamed from: a */
    public final File m50212a(String str) throws IOException {
        File file = new File(m50229w(), "dex");
        m50210u(file);
        File fileM50209q = m50209q(file, str);
        m50210u(fileM50209q);
        return fileM50209q;
    }

    /* JADX INFO: renamed from: b */
    public final File m50213b() throws IOException {
        File file = new File(m50229w(), "unverified-splits");
        m50210u(file);
        return file;
    }

    /* JADX INFO: renamed from: c */
    public final File m50214c(String str, String str2) {
        return m50209q(m50226s(str), str2);
    }

    /* JADX INFO: renamed from: d */
    public final File m50215d() {
        return new File(m50229w(), "lock.tmp");
    }

    /* JADX INFO: renamed from: e */
    public final File m50216e(String str) {
        return m50209q(m50213b(), m50211x(str));
    }

    /* JADX INFO: renamed from: f */
    public final File m50217f(File file) {
        return m50209q(m50227t(), file.getName());
    }

    /* JADX INFO: renamed from: g */
    public final File m50218g(String str) {
        return m50209q(m50227t(), m50211x(str));
    }

    /* JADX INFO: renamed from: h */
    public final List m50219h() {
        ArrayList arrayList = new ArrayList();
        File[] fileArrListFiles = m50225r().listFiles();
        if (fileArrListFiles != null) {
            for (File file : fileArrListFiles) {
                if (file.isDirectory()) {
                    arrayList.add(file.getName());
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: i */
    public final Set m50220i(String str) {
        HashSet hashSet = new HashSet();
        File[] fileArrListFiles = m50226s(str).listFiles();
        if (fileArrListFiles != null) {
            for (File file : fileArrListFiles) {
                if (file.isFile()) {
                    hashSet.add(file);
                }
            }
        }
        return hashSet;
    }

    /* JADX INFO: renamed from: j */
    public final Set m50221j() throws IOException {
        File fileM50227t = m50227t();
        HashSet hashSet = new HashSet();
        File[] fileArrListFiles = fileM50227t.listFiles();
        if (fileArrListFiles != null) {
            for (File file : fileArrListFiles) {
                if (file.isFile() && file.getName().endsWith(".apk") && m50208p(file)) {
                    String name = file.getName();
                    hashSet.add(new C13774c(file, name.substring(0, name.length() - 4)));
                }
            }
        }
        return hashSet;
    }

    /* JADX INFO: renamed from: k */
    public final void m50222k() throws IOException {
        File fileM50228v = m50228v();
        String[] list = fileM50228v.list();
        if (list != null) {
            for (String str : list) {
                if (!str.equals(Long.toString(this.f48363a))) {
                    File file = new File(fileM50228v, str);
                    Log.d("SplitCompat", "FileStorage: removing directory for different version code (directory = " + file.toString() + ", current version code = " + this.f48363a + ")");
                    m50206l(file);
                }
            }
        }
    }

    /* JADX INFO: renamed from: n */
    public final void m50223n(String str) throws IOException {
        m50206l(m50226s(str));
    }

    /* JADX INFO: renamed from: o */
    public final void m50224o(File file) throws IOException {
        if (!file.getParentFile().getParentFile().equals(m50225r())) {
            throw new IllegalStateException("File to remove is not a native library");
        }
        m50206l(file);
    }

    /* JADX INFO: renamed from: r */
    public final File m50225r() throws IOException {
        File file = new File(m50229w(), "native-libraries");
        m50210u(file);
        return file;
    }

    /* JADX INFO: renamed from: s */
    public final File m50226s(String str) throws IOException {
        File fileM50209q = m50209q(m50225r(), str);
        m50210u(fileM50209q);
        return fileM50209q;
    }

    /* JADX INFO: renamed from: t */
    public final File m50227t() throws IOException {
        File file = new File(m50229w(), "verified-splits");
        m50210u(file);
        return file;
    }

    /* JADX INFO: renamed from: v */
    public final File m50228v() throws IOException {
        if (this.f48365c == null) {
            Context context = this.f48364b;
            if (context == null) {
                throw new IllegalStateException("context must be non-null to populate null filesDir");
            }
            this.f48365c = context.getFilesDir();
        }
        File file = new File(this.f48365c, "splitcompat");
        m50210u(file);
        return file;
    }

    /* JADX INFO: renamed from: w */
    public final File m50229w() throws IOException {
        File file = new File(m50228v(), Long.toString(this.f48363a));
        m50210u(file);
        return file;
    }
}
