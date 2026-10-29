package xm;

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
    public static final Logger f35248g = Logger.getLogger(a.class.getName());

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final byte[] f35249h = new byte[Barcode.FORMAT_AZTEC];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RandomAccessFile f35250a;
    public int b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f35251c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public b f35252d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public b f35253e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final byte[] f35254f = new byte[16];

    /* JADX INFO: renamed from: xm.a$a, reason: collision with other inner class name */
    public class C0644a implements d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f35255a = true;
        public final /* synthetic */ StringBuilder b;

        public C0644a(StringBuilder sb2) {
            this.b = sb2;
        }

        @Override // xm.a.d
        public void a(InputStream inputStream, int i10) {
            if (this.f35255a) {
                this.f35255a = false;
            } else {
                this.b.append(", ");
            }
            this.b.append(i10);
        }
    }

    public static class b {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final b f35257c = new b(0, 0);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f35258a;
        public final int b;

        public b(int i10, int i11) {
            this.f35258a = i10;
            this.b = i11;
        }

        public String toString() {
            return getClass().getSimpleName() + "[position = " + this.f35258a + ", length = " + this.b + "]";
        }
    }

    public final class c extends InputStream {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f35259a;
        public int b;

        public /* synthetic */ c(a aVar, b bVar, C0644a c0644a) {
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
            a.this.s(this.f35259a, bArr, i10, i11);
            this.f35259a = a.this.w(this.f35259a + i11);
            this.b -= i11;
            return i11;
        }

        public c(b bVar) {
            this.f35259a = a.this.w(bVar.f35258a + 4);
            this.b = bVar.b;
        }

        @Override // java.io.InputStream
        public int read() throws IOException {
            if (this.b == 0) {
                return -1;
            }
            a.this.f35250a.seek(this.f35259a);
            int i10 = a.this.f35250a.read();
            this.f35259a = a.this.w(this.f35259a + 1);
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
        this.f35250a = l(file);
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
                b bVar = this.f35253e;
                iW = w(bVar.f35258a + 4 + bVar.b);
            }
            b bVar2 = new b(iW, i11);
            y(this.f35254f, 0, i11);
            t(bVar2.f35258a, this.f35254f, 0, 4);
            t(bVar2.f35258a + 4, bArr, i10, i11);
            x(this.b, this.f35251c + 1, zJ ? bVar2.f35258a : this.f35252d.f35258a, bVar2.f35258a);
            this.f35253e = bVar2;
            this.f35251c++;
            if (zJ) {
                this.f35252d = bVar2;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized void f() {
        try {
            this.f35250a.seek(0L);
            this.f35250a.write(f35249h);
            x(Barcode.FORMAT_AZTEC, 0, 0, 0);
            this.f35251c = 0;
            b bVar = b.f35257c;
            this.f35252d = bVar;
            this.f35253e = bVar;
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
        b bVar = this.f35253e;
        int iW = w(bVar.f35258a + 4 + bVar.b);
        if (iW <= this.f35252d.f35258a) {
            FileChannel channel = this.f35250a.getChannel();
            channel.position(this.b);
            int i13 = iW - 16;
            long j10 = i13;
            if (channel.transferTo(16L, j10, channel) != j10) {
                throw new AssertionError("Copied insufficient number of bytes!");
            }
            r(16, i13);
        }
        int i14 = this.f35253e.f35258a;
        int i15 = this.f35252d.f35258a;
        if (i14 < i15) {
            int i16 = (this.b + i14) - 16;
            x(i12, this.f35251c, i15, i16);
            this.f35253e = new b(i16, this.f35253e.b);
        } else {
            x(i12, this.f35251c, i15, i14);
        }
        this.b = i12;
    }

    public synchronized void h(d dVar) {
        int iW = this.f35252d.f35258a;
        for (int i10 = 0; i10 < this.f35251c; i10++) {
            b bVarM = m(iW);
            dVar.a(new c(this, bVarM, null), bVarM.b);
            iW = w(bVarM.f35258a + 4 + bVarM.b);
        }
    }

    public synchronized boolean j() {
        return this.f35251c == 0;
    }

    public final b m(int i10) throws IOException {
        if (i10 == 0) {
            return b.f35257c;
        }
        s(i10, this.f35254f, 0, 4);
        return new b(i10, o(this.f35254f, 0));
    }

    public final void n() throws IOException {
        this.f35250a.seek(0L);
        this.f35250a.readFully(this.f35254f);
        int iO = o(this.f35254f, 0);
        this.b = iO;
        if (iO > this.f35250a.length()) {
            throw new IOException("File is truncated. Expected length: " + this.b + ", Actual length: " + this.f35250a.length());
        }
        if (this.b == 0) {
            throw new IOException("File is corrupt; length stored in header is 0.");
        }
        this.f35251c = o(this.f35254f, 4);
        int iO2 = o(this.f35254f, 8);
        int iO3 = o(this.f35254f, 12);
        this.f35252d = m(iO2);
        this.f35253e = m(iO3);
    }

    public final int p() {
        return this.b - v();
    }

    public synchronized void q() {
        try {
            if (j()) {
                throw new NoSuchElementException();
            }
            if (this.f35251c == 1) {
                f();
            } else {
                b bVar = this.f35252d;
                int i10 = bVar.b + 4;
                r(bVar.f35258a, i10);
                int iW = w(this.f35252d.f35258a + i10);
                s(iW, this.f35254f, 0, 4);
                int iO = o(this.f35254f, 0);
                x(this.b, this.f35251c - 1, iW, this.f35253e.f35258a);
                this.f35251c--;
                this.f35252d = new b(iW, iO);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final void r(int i10, int i11) throws IOException {
        while (i11 > 0) {
            byte[] bArr = f35249h;
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
            this.f35250a.seek(iW);
            this.f35250a.readFully(bArr, i11, i12);
            return;
        }
        int i15 = i14 - iW;
        this.f35250a.seek(iW);
        this.f35250a.readFully(bArr, i11, i15);
        this.f35250a.seek(16L);
        this.f35250a.readFully(bArr, i11 + i15, i12 - i15);
    }

    public final void t(int i10, byte[] bArr, int i11, int i12) throws IOException {
        int iW = w(i10);
        int i13 = iW + i12;
        int i14 = this.b;
        if (i13 <= i14) {
            this.f35250a.seek(iW);
            this.f35250a.write(bArr, i11, i12);
            return;
        }
        int i15 = i14 - iW;
        this.f35250a.seek(iW);
        this.f35250a.write(bArr, i11, i15);
        this.f35250a.seek(16L);
        this.f35250a.write(bArr, i11 + i15, i12 - i15);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(getClass().getSimpleName());
        sb2.append('[');
        sb2.append("fileLength=");
        sb2.append(this.b);
        sb2.append(", size=");
        sb2.append(this.f35251c);
        sb2.append(", first=");
        sb2.append(this.f35252d);
        sb2.append(", last=");
        sb2.append(this.f35253e);
        sb2.append(", element lengths=[");
        try {
            h(new C0644a(sb2));
        } catch (IOException e10) {
            f35248g.log(Level.WARNING, "read error", (Throwable) e10);
        }
        sb2.append("]]");
        return sb2.toString();
    }

    public final void u(int i10) throws IOException {
        this.f35250a.setLength(i10);
        this.f35250a.getChannel().force(true);
    }

    public final int v() {
        if (this.f35251c == 0) {
            return 16;
        }
        b bVar = this.f35253e;
        int i10 = bVar.f35258a;
        int i11 = this.f35252d.f35258a;
        return i10 >= i11 ? (i10 - i11) + 4 + bVar.b + 16 : (((i10 + 4) + bVar.b) + this.b) - i11;
    }

    public final int w(int i10) {
        int i11 = this.b;
        return i10 < i11 ? i10 : (i10 + 16) - i11;
    }

    public final void x(int i10, int i11, int i12, int i13) throws IOException {
        z(this.f35254f, i10, i11, i12, i13);
        this.f35250a.seek(0L);
        this.f35250a.write(this.f35254f);
    }
}
