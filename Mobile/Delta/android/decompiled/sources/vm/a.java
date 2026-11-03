package vm;

import com.google.mlkit.vision.barcode.common.Barcode;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.util.NoSuchElementException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes2.dex */
public class a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Logger f33570g = Logger.getLogger(a.class.getName());

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final byte[] f33571h = new byte[Barcode.FORMAT_AZTEC];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RandomAccessFile f33572a;
    public int b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f33573c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public b f33574d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public b f33575e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final byte[] f33576f = new byte[16];

    /* JADX INFO: renamed from: vm.a$a, reason: collision with other inner class name */
    public class C0616a implements d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f33577a = true;
        public final /* synthetic */ StringBuilder b;

        public C0616a(StringBuilder sb2) {
            this.b = sb2;
        }

        @Override // vm.a.d
        public void a(InputStream inputStream, int i10) {
            if (this.f33577a) {
                this.f33577a = false;
            } else {
                this.b.append(", ");
            }
            this.b.append(i10);
        }
    }

    public static class b {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final b f33579c = new b(0, 0);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f33580a;
        public final int b;

        public b(int i10, int i11) {
            this.f33580a = i10;
            this.b = i11;
        }

        public String toString() {
            return getClass().getSimpleName() + "[position = " + this.f33580a + ", length = " + this.b + "]";
        }
    }

    public final class c extends InputStream {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f33581a;
        public int b;

        public /* synthetic */ c(a aVar, b bVar, C0616a c0616a) {
            this(bVar);
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i10, int i11) throws IOException {
            a.k(bArr, "buffer");
            if ((i10 | i11) < 0 || i11 > bArr.length - i10) {
                throw new ArrayIndexOutOfBoundsException();
            }
            int i12 = this.b;
            if (i12 <= 0) {
                return -1;
            }
            if (i11 > i12) {
                i11 = i12;
            }
            a.this.s(this.f33581a, bArr, i10, i11);
            this.f33581a = a.this.w(this.f33581a + i11);
            this.b -= i11;
            return i11;
        }

        public c(b bVar) {
            this.f33581a = a.this.w(bVar.f33580a + 4);
            this.b = bVar.b;
        }

        @Override // java.io.InputStream
        public int read() throws IOException {
            if (this.b == 0) {
                return -1;
            }
            a.this.f33572a.seek(this.f33581a);
            int i10 = a.this.f33572a.read();
            this.f33581a = a.this.w(this.f33581a + 1);
            this.b--;
            return i10;
        }
    }

    public interface d {
        void a(InputStream inputStream, int i10);
    }

    public a(File file) throws IOException {
        if (!file.exists()) {
            i(file);
        }
        this.f33572a = l(file);
        n();
    }

    public static void i(File file) throws IOException {
        File file2 = new File(file.getPath() + ".tmp");
        RandomAccessFile randomAccessFileL = l(file2);
        try {
            randomAccessFileL.setLength(4096L);
            randomAccessFileL.seek(0L);
            byte[] bArr = new byte[16];
            z(bArr, Barcode.FORMAT_AZTEC, 0, 0, 0);
            randomAccessFileL.write(bArr);
            randomAccessFileL.close();
            if (!file2.renameTo(file)) {
                throw new IOException("Rename failed!");
            }
        } catch (Throwable th2) {
            randomAccessFileL.close();
            throw th2;
        }
    }

    public static <T> T k(T t8, String str) {
        if (t8 != null) {
            return t8;
        }
        throw new NullPointerException(str);
    }

    public static RandomAccessFile l(File file) {
        return new RandomAccessFile(file, "rwd");
    }

    public static int o(byte[] bArr, int i10) {
        return ((bArr[i10] & 255) << 24) + ((bArr[i10 + 1] & 255) << 16) + ((bArr[i10 + 2] & 255) << 8) + (bArr[i10 + 3] & 255);
    }

    public static void y(byte[] bArr, int i10, int i11) {
        bArr[i10] = (byte) (i11 >> 24);
        bArr[i10 + 1] = (byte) (i11 >> 16);
        bArr[i10 + 2] = (byte) (i11 >> 8);
        bArr[i10 + 3] = (byte) i11;
    }

    public static void z(byte[] bArr, int... iArr) {
        int i10 = 0;
        for (int i11 : iArr) {
            y(bArr, i10, i11);
            i10 += 4;
        }
    }

    public void d(byte[] bArr) {
        e(bArr, 0, bArr.length);
    }

    public synchronized void e(byte[] bArr, int i10, int i11) {
        int iW;
        try {
            k(bArr, "buffer");
            if ((i10 | i11) < 0 || i11 > bArr.length - i10) {
                throw new IndexOutOfBoundsException();
            }
            g(i11);
            boolean zJ = j();
            if (zJ) {
                iW = 16;
            } else {
                b bVar = this.f33575e;
                iW = w(bVar.f33580a + 4 + bVar.b);
            }
            b bVar2 = new b(iW, i11);
            y(this.f33576f, 0, i11);
            t(bVar2.f33580a, this.f33576f, 0, 4);
            t(bVar2.f33580a + 4, bArr, i10, i11);
            x(this.b, this.f33573c + 1, zJ ? bVar2.f33580a : this.f33574d.f33580a, bVar2.f33580a);
            this.f33575e = bVar2;
            this.f33573c++;
            if (zJ) {
                this.f33574d = bVar2;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized void f() {
        try {
            this.f33572a.seek(0L);
            this.f33572a.write(f33571h);
            x(Barcode.FORMAT_AZTEC, 0, 0, 0);
            this.f33573c = 0;
            b bVar = b.f33579c;
            this.f33574d = bVar;
            this.f33575e = bVar;
            if (this.b > 4096) {
                u(Barcode.FORMAT_AZTEC);
            }
            this.b = Barcode.FORMAT_AZTEC;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final void g(int i10) throws IOException {
        int i11 = i10 + 4;
        int iP = p();
        if (iP >= i11) {
            return;
        }
        int i12 = this.b;
        do {
            iP += i12;
            i12 <<= 1;
        } while (iP < i11);
        u(i12);
        b bVar = this.f33575e;
        int iW = w(bVar.f33580a + 4 + bVar.b);
        if (iW <= this.f33574d.f33580a) {
            FileChannel channel = this.f33572a.getChannel();
            channel.position(this.b);
            int i13 = iW - 16;
            long j10 = i13;
            if (channel.transferTo(16L, j10, channel) != j10) {
                throw new AssertionError("Copied insufficient number of bytes!");
            }
            r(16, i13);
        }
        int i14 = this.f33575e.f33580a;
        int i15 = this.f33574d.f33580a;
        if (i14 < i15) {
            int i16 = (this.b + i14) - 16;
            x(i12, this.f33573c, i15, i16);
            this.f33575e = new b(i16, this.f33575e.b);
        } else {
            x(i12, this.f33573c, i15, i14);
        }
        this.b = i12;
    }

    public synchronized void h(d dVar) {
        int iW = this.f33574d.f33580a;
        for (int i10 = 0; i10 < this.f33573c; i10++) {
            b bVarM = m(iW);
            dVar.a(new c(this, bVarM, null), bVarM.b);
            iW = w(bVarM.f33580a + 4 + bVarM.b);
        }
    }

    public synchronized boolean j() {
        return this.f33573c == 0;
    }

    public final b m(int i10) throws IOException {
        if (i10 == 0) {
            return b.f33579c;
        }
        s(i10, this.f33576f, 0, 4);
        return new b(i10, o(this.f33576f, 0));
    }

    public final void n() throws IOException {
        this.f33572a.seek(0L);
        this.f33572a.readFully(this.f33576f);
        int iO = o(this.f33576f, 0);
        this.b = iO;
        if (iO > this.f33572a.length()) {
            throw new IOException("File is truncated. Expected length: " + this.b + ", Actual length: " + this.f33572a.length());
        }
        if (this.b == 0) {
            throw new IOException("File is corrupt; length stored in header is 0.");
        }
        this.f33573c = o(this.f33576f, 4);
        int iO2 = o(this.f33576f, 8);
        int iO3 = o(this.f33576f, 12);
        this.f33574d = m(iO2);
        this.f33575e = m(iO3);
    }

    public final int p() {
        return this.b - v();
    }

    public synchronized void q() {
        try {
            if (j()) {
                throw new NoSuchElementException();
            }
            if (this.f33573c == 1) {
                f();
            } else {
                b bVar = this.f33574d;
                int i10 = bVar.b + 4;
                r(bVar.f33580a, i10);
                int iW = w(this.f33574d.f33580a + i10);
                s(iW, this.f33576f, 0, 4);
                int iO = o(this.f33576f, 0);
                x(this.b, this.f33573c - 1, iW, this.f33575e.f33580a);
                this.f33573c--;
                this.f33574d = new b(iW, iO);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final void r(int i10, int i11) throws IOException {
        while (i11 > 0) {
            byte[] bArr = f33571h;
            int iMin = Math.min(i11, bArr.length);
            t(i10, bArr, 0, iMin);
            i11 -= iMin;
            i10 += iMin;
        }
    }

    public final void s(int i10, byte[] bArr, int i11, int i12) throws IOException {
        int iW = w(i10);
        int i13 = iW + i12;
        int i14 = this.b;
        if (i13 <= i14) {
            this.f33572a.seek(iW);
            this.f33572a.readFully(bArr, i11, i12);
            return;
        }
        int i15 = i14 - iW;
        this.f33572a.seek(iW);
        this.f33572a.readFully(bArr, i11, i15);
        this.f33572a.seek(16L);
        this.f33572a.readFully(bArr, i11 + i15, i12 - i15);
    }

    public final void t(int i10, byte[] bArr, int i11, int i12) throws IOException {
        int iW = w(i10);
        int i13 = iW + i12;
        int i14 = this.b;
        if (i13 <= i14) {
            this.f33572a.seek(iW);
            this.f33572a.write(bArr, i11, i12);
            return;
        }
        int i15 = i14 - iW;
        this.f33572a.seek(iW);
        this.f33572a.write(bArr, i11, i15);
        this.f33572a.seek(16L);
        this.f33572a.write(bArr, i11 + i15, i12 - i15);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(getClass().getSimpleName());
        sb2.append('[');
        sb2.append("fileLength=");
        sb2.append(this.b);
        sb2.append(", size=");
        sb2.append(this.f33573c);
        sb2.append(", first=");
        sb2.append(this.f33574d);
        sb2.append(", last=");
        sb2.append(this.f33575e);
        sb2.append(", element lengths=[");
        try {
            h(new C0616a(sb2));
        } catch (IOException e10) {
            f33570g.log(Level.WARNING, "read error", (Throwable) e10);
        }
        sb2.append("]]");
        return sb2.toString();
    }

    public final void u(int i10) throws IOException {
        this.f33572a.setLength(i10);
        this.f33572a.getChannel().force(true);
    }

    public final int v() {
        if (this.f33573c == 0) {
            return 16;
        }
        b bVar = this.f33575e;
        int i10 = bVar.f33580a;
        int i11 = this.f33574d.f33580a;
        return i10 >= i11 ? (i10 - i11) + 4 + bVar.b + 16 : (((i10 + 4) + bVar.b) + this.b) - i11;
    }

    public final int w(int i10) {
        int i11 = this.b;
        return i10 < i11 ? i10 : (i10 + 16) - i11;
    }

    public final void x(int i10, int i11, int i12, int i13) throws IOException {
        z(this.f33576f, i10, i11, i12, i13);
        this.f33572a.seek(0L);
        this.f33572a.write(this.f33576f);
    }
}
