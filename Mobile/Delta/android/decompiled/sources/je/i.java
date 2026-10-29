package je;

import ge.n;
import he.w;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ie.a<File> f21372a = new a();

    public class a implements ie.a<File> {
    }

    public static final class b extends je.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final File f21373a;
        public final w<g> b;

        public /* synthetic */ b(File file, g[] gVarArr, h hVar) {
            this(file, gVarArr);
        }

        @Override // je.b
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public FileOutputStream a() {
            return new FileOutputStream(this.f21373a, this.b.contains(g.APPEND));
        }

        public String toString() {
            String strValueOf = String.valueOf(this.f21373a);
            String strValueOf2 = String.valueOf(this.b);
            StringBuilder sb2 = new StringBuilder(strValueOf.length() + 20 + strValueOf2.length());
            sb2.append("Files.asByteSink(");
            sb2.append(strValueOf);
            sb2.append(", ");
            sb2.append(strValueOf2);
            sb2.append(")");
            return sb2.toString();
        }

        public b(File file, g... gVarArr) {
            this.f21373a = (File) n.l(file);
            this.b = w.l(gVarArr);
        }
    }

    public static final class c extends je.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final File f21374a;

        public /* synthetic */ c(File file, h hVar) {
            this(file);
        }

        @Override // je.c
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public FileInputStream b() {
            return new FileInputStream(this.f21374a);
        }

        public String toString() {
            String strValueOf = String.valueOf(this.f21374a);
            StringBuilder sb2 = new StringBuilder(strValueOf.length() + 20);
            sb2.append("Files.asByteSource(");
            sb2.append(strValueOf);
            sb2.append(")");
            return sb2.toString();
        }

        public c(File file) {
            this.f21374a = (File) n.l(file);
        }
    }

    public static je.b a(File file, g... gVarArr) {
        return new b(file, gVarArr, null);
    }

    public static je.c b(File file) {
        return new c(file, null);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: X */
    public static void c(File file, File file2) throws X {
        n.i(!file.equals(file2), "Source %s and destination %s must be different", file, file2);
        b(file).a(a(file2, new g[0]));
    }

    public static void d(File file) throws IOException {
        n.l(file);
        File parentFile = file.getCanonicalFile().getParentFile();
        if (parentFile == null) {
            return;
        }
        parentFile.mkdirs();
        if (parentFile.isDirectory()) {
            return;
        }
        String strValueOf = String.valueOf(file);
        StringBuilder sb2 = new StringBuilder(strValueOf.length() + 39);
        sb2.append("Unable to create parent directories of ");
        sb2.append(strValueOf);
        throw new IOException(sb2.toString());
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: X */
    public static void e(File file, File file2) throws X, IOException {
        n.l(file);
        n.l(file2);
        n.i(!file.equals(file2), "Source %s and destination %s must be different", file, file2);
        if (file.renameTo(file2)) {
            return;
        }
        c(file, file2);
        if (file.delete()) {
            return;
        }
        if (file2.delete()) {
            String strValueOf = String.valueOf(file);
            StringBuilder sb2 = new StringBuilder(strValueOf.length() + 17);
            sb2.append("Unable to delete ");
            sb2.append(strValueOf);
            throw new IOException(sb2.toString());
        }
        String strValueOf2 = String.valueOf(file2);
        StringBuilder sb3 = new StringBuilder(strValueOf2.length() + 17);
        sb3.append("Unable to delete ");
        sb3.append(strValueOf2);
        throw new IOException(sb3.toString());
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: X */
    public static void f(byte[] bArr, File file) throws X {
        a(file, new g[0]).b(bArr);
    }
}
