package me;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import je.n;
import ke.w;

/* JADX INFO: loaded from: classes2.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final le.a<File> f23238a = new a();

    public class a implements le.a<File> {
    }

    public static final class b extends me.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final File f23239a;
        public final w<g> b;

        public /* synthetic */ b(File file, g[] gVarArr, h hVar) {
            this(file, gVarArr);
        }

        @Override // me.b
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public FileOutputStream a() {
            return new FileOutputStream(this.f23239a, this.b.contains(g.APPEND));
        }

        public String toString() {
            String strValueOf = String.valueOf(this.f23239a);
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
            this.f23239a = (File) n.l(file);
            this.b = w.l(gVarArr);
        }
    }

    public static final class c extends me.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final File f23240a;

        public /* synthetic */ c(File file, h hVar) {
            this(file);
        }

        @Override // me.c
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public FileInputStream b() {
            return new FileInputStream(this.f23240a);
        }

        public String toString() {
            String strValueOf = String.valueOf(this.f23240a);
            StringBuilder sb2 = new StringBuilder(strValueOf.length() + 20);
            sb2.append("Files.asByteSource(");
            sb2.append(strValueOf);
            sb2.append(")");
            return sb2.toString();
        }

        public c(File file) {
            this.f23240a = (File) n.l(file);
        }
    }

    public static me.b a(File file, g... gVarArr) {
        return new b(file, gVarArr, null);
    }

    public static me.c b(File file) {
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
