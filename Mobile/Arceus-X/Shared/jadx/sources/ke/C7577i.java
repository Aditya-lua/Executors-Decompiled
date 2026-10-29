package ke;

import ie.AbstractC6802w;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import je.InterfaceC7149a;
import p169he.C6384n;

/* JADX INFO: renamed from: ke.i */
/* JADX INFO: loaded from: classes2.dex */
public final class C7577i {

    /* JADX INFO: renamed from: a */
    public static final InterfaceC7149a<File> f29035a = new a();

    /* JADX INFO: renamed from: ke.i$a */
    public class a implements InterfaceC7149a<File> {
    }

    /* JADX INFO: renamed from: ke.i$b */
    public static final class b extends AbstractC7570b {

        /* JADX INFO: renamed from: a */
        public final File f29036a;

        /* JADX INFO: renamed from: b */
        public final AbstractC6802w<EnumC7575g> f29037b;

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 java.io.File), (r2v0 ke.g[]) A[MD:(java.io.File, ke.g[]):void VARARG (m), VARARG_CALL] (LINE:1) call: ke.i.b.<init>(java.io.File, ke.g[]):void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ b(File file, EnumC7575g[] enumC7575gArr, C7576h c7576h) {
            this(file, enumC7575gArr);
        }

        /* JADX DEBUG: Method merged with bridge method: a()Ljava/io/OutputStream; */
        @Override // ke.AbstractC7570b
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public FileOutputStream mo31364a() {
            return new FileOutputStream(this.f29036a, this.f29037b.contains(EnumC7575g.APPEND));
        }

        public String toString() {
            String strValueOf = String.valueOf(this.f29036a);
            String strValueOf2 = String.valueOf(this.f29037b);
            StringBuilder sb2 = new StringBuilder(strValueOf.length() + 20 + strValueOf2.length());
            sb2.append("Files.asByteSink(");
            sb2.append(strValueOf);
            sb2.append(", ");
            sb2.append(strValueOf2);
            sb2.append(")");
            return sb2.toString();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public b(File file, EnumC7575g... enumC7575gArr) {
            this.f29036a = (File) C6384n.m27928l(file);
            this.f29037b = AbstractC6802w.m29139l(enumC7575gArr);
        }
    }

    /* JADX INFO: renamed from: ke.i$c */
    public static final class c extends AbstractC7571c {

        /* JADX INFO: renamed from: a */
        public final File f29038a;

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 java.io.File) A[MD:(java.io.File):void (m)] (LINE:1) call: ke.i.c.<init>(java.io.File):void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ c(File file, C7576h c7576h) {
            this(file);
        }

        /* JADX DEBUG: Method merged with bridge method: b()Ljava/io/InputStream; */
        @Override // ke.AbstractC7571c
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public FileInputStream mo31367b() {
            return new FileInputStream(this.f29038a);
        }

        public String toString() {
            String strValueOf = String.valueOf(this.f29038a);
            StringBuilder sb2 = new StringBuilder(strValueOf.length() + 20);
            sb2.append("Files.asByteSource(");
            sb2.append(strValueOf);
            sb2.append(")");
            return sb2.toString();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public c(File file) {
            this.f29038a = (File) C6384n.m27928l(file);
        }
    }

    /* JADX INFO: renamed from: a */
    public static AbstractC7570b m31379a(File file, EnumC7575g... enumC7575gArr) {
        return new b(file, enumC7575gArr, null);
    }

    /* JADX INFO: renamed from: b */
    public static AbstractC7571c m31380b(File file) {
        return new c(file, null);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: X */
    /* JADX INFO: renamed from: c */
    public static void m31381c(File file, File file2) throws X {
        C6384n.m27925i(!file.equals(file2), "Source %s and destination %s must be different", file, file2);
        m31380b(file).m31366a(m31379a(file2, new EnumC7575g[0]));
    }

    /* JADX INFO: renamed from: d */
    public static void m31382d(File file) throws IOException {
        C6384n.m27928l(file);
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
    /* JADX INFO: renamed from: e */
    public static void m31383e(File file, File file2) throws X, IOException {
        C6384n.m27928l(file);
        C6384n.m27928l(file2);
        C6384n.m27925i(!file.equals(file2), "Source %s and destination %s must be different", file, file2);
        if (file.renameTo(file2)) {
            return;
        }
        m31381c(file, file2);
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
    /* JADX INFO: renamed from: f */
    public static void m31384f(byte[] bArr, File file) throws X {
        m31379a(file, new EnumC7575g[0]).m31365b(bArr);
    }
}
