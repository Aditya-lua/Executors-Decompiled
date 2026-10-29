package p552xm;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.util.NoSuchElementException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: renamed from: xm.a */
/* JADX INFO: loaded from: classes2.dex */
public class C12865a {

    /* JADX INFO: renamed from: g */
    public static final Logger f45701g = Logger.getLogger(C12865a.class.getName());

    /* JADX INFO: renamed from: h */
    public static final byte[] f45702h = new byte[4096];

    /* JADX INFO: renamed from: a */
    public final RandomAccessFile f45703a;

    /* JADX INFO: renamed from: b */
    public int f45704b;

    /* JADX INFO: renamed from: c */
    public int f45705c;

    /* JADX INFO: renamed from: d */
    public b f45706d;

    /* JADX INFO: renamed from: e */
    public b f45707e;

    /* JADX INFO: renamed from: f */
    public final byte[] f45708f = new byte[16];

    /* JADX INFO: renamed from: xm.a$a */
    public class a implements d {

        /* JADX INFO: renamed from: a */
        public boolean f45709a = true;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ StringBuilder f45710b;

        public a(StringBuilder sb2) {
            this.f45710b = sb2;
        }

        @Override // p552xm.C12865a.d
        /* JADX INFO: renamed from: a */
        public void mo47887a(InputStream inputStream, int i10) {
            if (this.f45709a) {
                this.f45709a = false;
            } else {
                this.f45710b.append(", ");
            }
            this.f45710b.append(i10);
        }
    }

    /* JADX INFO: renamed from: xm.a$b */
    public static class b {

        /* JADX INFO: renamed from: c */
        public static final b f45712c = new b(0, 0);

        /* JADX INFO: renamed from: a */
        public final int f45713a;

        /* JADX INFO: renamed from: b */
        public final int f45714b;

        public b(int i10, int i11) {
            this.f45713a = i10;
            this.f45714b = i11;
        }

        public String toString() {
            return getClass().getSimpleName() + "[position = " + this.f45713a + ", length = " + this.f45714b + "]";
        }
    }

    /* JADX INFO: renamed from: xm.a$c */
    public final class c extends InputStream {

        /* JADX INFO: renamed from: a */
        public int f45715a;

        /* JADX INFO: renamed from: b */
        public int f45716b;

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 xm.a), (r2v0 xm.a$b) A[MD:(xm.a, xm.a$b):void (m)] (LINE:1) call: xm.a.c.<init>(xm.a, xm.a$b):void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ c(C12865a c12865a, b bVar, a aVar) {
            this(bVar);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Override // java.io.InputStream
        public int read(byte[] bArr, int i10, int i11) throws IOException {
            C12865a.m47865k(bArr, "buffer");
            if ((i10 | i11) < 0 || i11 > bArr.length - i10) {
                throw new ArrayIndexOutOfBoundsException();
            }
            int i12 = this.f45716b;
            if (i12 <= 0) {
                return -1;
            }
            if (i11 > i12) {
                i11 = i12;
            }
            C12865a.this.m47881s(this.f45715a, bArr, i10, i11);
            this.f45715a = C12865a.this.m47885w(this.f45715a + i11);
            this.f45716b -= i11;
            return i11;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public c(b bVar) {
            this.f45715a = C12865a.this.m47885w(bVar.f45713a + 4);
            this.f45716b = bVar.f45714b;
        }

        @Override // java.io.InputStream
        public int read() throws IOException {
            if (this.f45716b == 0) {
                return -1;
            }
            C12865a.this.f45703a.seek(this.f45715a);
            int i10 = C12865a.this.f45703a.read();
            this.f45715a = C12865a.this.m47885w(this.f45715a + 1);
            this.f45716b--;
            return i10;
        }
    }

    /* JADX INFO: renamed from: xm.a$d */
    public interface d {
        /* JADX INFO: renamed from: a */
        void mo47887a(InputStream inputStream, int i10);
    }

    public C12865a(File file) throws IOException {
        if (!file.exists()) {
            m47864i(file);
        }
        this.f45703a = m47866l(file);
        m47877n();
    }

    /* JADX INFO: renamed from: i */
    public static void m47864i(File file) throws IOException {
        File file2 = new File(file.getPath() + ".tmp");
        RandomAccessFile randomAccessFileM47866l = m47866l(file2);
        try {
            randomAccessFileM47866l.setLength(4096L);
            randomAccessFileM47866l.seek(0L);
            byte[] bArr = new byte[16];
            m47869z(bArr, 4096, 0, 0, 0);
            randomAccessFileM47866l.write(bArr);
            randomAccessFileM47866l.close();
            if (!file2.renameTo(file)) {
                throw new IOException("Rename failed!");
            }
        } catch (Throwable th2) {
            randomAccessFileM47866l.close();
            throw th2;
        }
    }

    /* JADX INFO: renamed from: k */
    public static <T> T m47865k(T t8, String str) {
        if (t8 != null) {
            return t8;
        }
        throw new NullPointerException(str);
    }

    /* JADX INFO: renamed from: l */
    public static RandomAccessFile m47866l(File file) {
        return new RandomAccessFile(file, "rwd");
    }

    /* JADX INFO: renamed from: o */
    public static int m47867o(byte[] bArr, int i10) {
        return ((bArr[i10] & 255) << 24) + ((bArr[i10 + 1] & 255) << 16) + ((bArr[i10 + 2] & 255) << 8) + (bArr[i10 + 3] & 255);
    }

    /* JADX INFO: renamed from: y */
    public static void m47868y(byte[] bArr, int i10, int i11) {
        bArr[i10] = (byte) (i11 >> 24);
        bArr[i10 + 1] = (byte) (i11 >> 16);
        bArr[i10 + 2] = (byte) (i11 >> 8);
        bArr[i10 + 3] = (byte) i11;
    }

    /* JADX INFO: renamed from: z */
    public static void m47869z(byte[] bArr, int... iArr) {
        int i10 = 0;
        for (int i11 : iArr) {
            m47868y(bArr, i10, i11);
            i10 += 4;
        }
    }

    /* JADX INFO: renamed from: d */
    public void m47870d(byte[] bArr) {
        m47871e(bArr, 0, bArr.length);
    }

    /* JADX INFO: renamed from: e */
    public synchronized void m47871e(byte[] bArr, int i10, int i11) {
        int iM47885w;
        try {
            m47865k(bArr, "buffer");
            if ((i10 | i11) < 0 || i11 > bArr.length - i10) {
                throw new IndexOutOfBoundsException();
            }
            m47873g(i11);
            boolean zM47875j = m47875j();
            if (zM47875j) {
                iM47885w = 16;
            } else {
                b bVar = this.f45707e;
                iM47885w = m47885w(bVar.f45713a + 4 + bVar.f45714b);
            }
            b bVar2 = new b(iM47885w, i11);
            m47868y(this.f45708f, 0, i11);
            m47882t(bVar2.f45713a, this.f45708f, 0, 4);
            m47882t(bVar2.f45713a + 4, bArr, i10, i11);
            m47886x(this.f45704b, this.f45705c + 1, zM47875j ? bVar2.f45713a : this.f45706d.f45713a, bVar2.f45713a);
            this.f45707e = bVar2;
            this.f45705c++;
            if (zM47875j) {
                this.f45706d = bVar2;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX INFO: renamed from: f */
    public synchronized void m47872f() {
        try {
            this.f45703a.seek(0L);
            this.f45703a.write(f45702h);
            m47886x(4096, 0, 0, 0);
            this.f45705c = 0;
            b bVar = b.f45712c;
            this.f45706d = bVar;
            this.f45707e = bVar;
            if (this.f45704b > 4096) {
                m47883u(4096);
            }
            this.f45704b = 4096;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m47873g(int i10) throws IOException {
        int i11 = i10 + 4;
        int iM47878p = m47878p();
        if (iM47878p >= i11) {
            return;
        }
        int i12 = this.f45704b;
        do {
            iM47878p += i12;
            i12 <<= 1;
        } while (iM47878p < i11);
        m47883u(i12);
        b bVar = this.f45707e;
        int iM47885w = m47885w(bVar.f45713a + 4 + bVar.f45714b);
        if (iM47885w <= this.f45706d.f45713a) {
            FileChannel channel = this.f45703a.getChannel();
            channel.position(this.f45704b);
            int i13 = iM47885w - 16;
            long j10 = i13;
            if (channel.transferTo(16L, j10, channel) != j10) {
                throw new AssertionError("Copied insufficient number of bytes!");
            }
            m47880r(16, i13);
        }
        int i14 = this.f45707e.f45713a;
        int i15 = this.f45706d.f45713a;
        if (i14 < i15) {
            int i16 = (this.f45704b + i14) - 16;
            m47886x(i12, this.f45705c, i15, i16);
            this.f45707e = new b(i16, this.f45707e.f45714b);
        } else {
            m47886x(i12, this.f45705c, i15, i14);
        }
        this.f45704b = i12;
    }

    /* JADX INFO: renamed from: h */
    public synchronized void m47874h(d dVar) {
        int iM47885w = this.f45706d.f45713a;
        for (int i10 = 0; i10 < this.f45705c; i10++) {
            b bVarM47876m = m47876m(iM47885w);
            dVar.mo47887a(new c(this, bVarM47876m, null), bVarM47876m.f45714b);
            iM47885w = m47885w(bVarM47876m.f45713a + 4 + bVarM47876m.f45714b);
        }
    }

    /* JADX INFO: renamed from: j */
    public synchronized boolean m47875j() {
        return this.f45705c == 0;
    }

    /* JADX INFO: renamed from: m */
    public final b m47876m(int i10) throws IOException {
        if (i10 == 0) {
            return b.f45712c;
        }
        m47881s(i10, this.f45708f, 0, 4);
        return new b(i10, m47867o(this.f45708f, 0));
    }

    /* JADX INFO: renamed from: n */
    public final void m47877n() throws IOException {
        this.f45703a.seek(0L);
        this.f45703a.readFully(this.f45708f);
        int iM47867o = m47867o(this.f45708f, 0);
        this.f45704b = iM47867o;
        if (iM47867o > this.f45703a.length()) {
            throw new IOException("File is truncated. Expected length: " + this.f45704b + ", Actual length: " + this.f45703a.length());
        }
        if (this.f45704b == 0) {
            throw new IOException("File is corrupt; length stored in header is 0.");
        }
        this.f45705c = m47867o(this.f45708f, 4);
        int iM47867o2 = m47867o(this.f45708f, 8);
        int iM47867o3 = m47867o(this.f45708f, 12);
        this.f45706d = m47876m(iM47867o2);
        this.f45707e = m47876m(iM47867o3);
    }

    /* JADX INFO: renamed from: p */
    public final int m47878p() {
        return this.f45704b - m47884v();
    }

    /* JADX INFO: renamed from: q */
    public synchronized void m47879q() {
        try {
            if (m47875j()) {
                throw new NoSuchElementException();
            }
            if (this.f45705c == 1) {
                m47872f();
            } else {
                b bVar = this.f45706d;
                int i10 = bVar.f45714b + 4;
                m47880r(bVar.f45713a, i10);
                int iM47885w = m47885w(this.f45706d.f45713a + i10);
                m47881s(iM47885w, this.f45708f, 0, 4);
                int iM47867o = m47867o(this.f45708f, 0);
                m47886x(this.f45704b, this.f45705c - 1, iM47885w, this.f45707e.f45713a);
                this.f45705c--;
                this.f45706d = new b(iM47885w, iM47867o);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX INFO: renamed from: r */
    public final void m47880r(int i10, int i11) throws IOException {
        while (i11 > 0) {
            byte[] bArr = f45702h;
            int iMin = Math.min(i11, bArr.length);
            m47882t(i10, bArr, 0, iMin);
            i11 -= iMin;
            i10 += iMin;
        }
    }

    /* JADX INFO: renamed from: s */
    public final void m47881s(int i10, byte[] bArr, int i11, int i12) throws IOException {
        int iM47885w = m47885w(i10);
        int i13 = iM47885w + i12;
        int i14 = this.f45704b;
        if (i13 <= i14) {
            this.f45703a.seek(iM47885w);
            this.f45703a.readFully(bArr, i11, i12);
            return;
        }
        int i15 = i14 - iM47885w;
        this.f45703a.seek(iM47885w);
        this.f45703a.readFully(bArr, i11, i15);
        this.f45703a.seek(16L);
        this.f45703a.readFully(bArr, i11 + i15, i12 - i15);
    }

    /* JADX INFO: renamed from: t */
    public final void m47882t(int i10, byte[] bArr, int i11, int i12) throws IOException {
        int iM47885w = m47885w(i10);
        int i13 = iM47885w + i12;
        int i14 = this.f45704b;
        if (i13 <= i14) {
            this.f45703a.seek(iM47885w);
            this.f45703a.write(bArr, i11, i12);
            return;
        }
        int i15 = i14 - iM47885w;
        this.f45703a.seek(iM47885w);
        this.f45703a.write(bArr, i11, i15);
        this.f45703a.seek(16L);
        this.f45703a.write(bArr, i11 + i15, i12 - i15);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(getClass().getSimpleName());
        sb2.append('[');
        sb2.append("fileLength=");
        sb2.append(this.f45704b);
        sb2.append(", size=");
        sb2.append(this.f45705c);
        sb2.append(", first=");
        sb2.append(this.f45706d);
        sb2.append(", last=");
        sb2.append(this.f45707e);
        sb2.append(", element lengths=[");
        try {
            m47874h(new a(sb2));
        } catch (IOException e10) {
            f45701g.log(Level.WARNING, "read error", (Throwable) e10);
        }
        sb2.append("]]");
        return sb2.toString();
    }

    /* JADX INFO: renamed from: u */
    public final void m47883u(int i10) throws IOException {
        this.f45703a.setLength(i10);
        this.f45703a.getChannel().force(true);
    }

    /* JADX INFO: renamed from: v */
    public final int m47884v() {
        if (this.f45705c == 0) {
            return 16;
        }
        b bVar = this.f45707e;
        int i10 = bVar.f45713a;
        int i11 = this.f45706d.f45713a;
        return i10 >= i11 ? (i10 - i11) + 4 + bVar.f45714b + 16 : (((i10 + 4) + bVar.f45714b) + this.f45704b) - i11;
    }

    /* JADX INFO: renamed from: w */
    public final int m47885w(int i10) {
        int i11 = this.f45704b;
        return i10 < i11 ? i10 : (i10 + 16) - i11;
    }

    /* JADX INFO: renamed from: x */
    public final void m47886x(int i10, int i11, int i12, int i13) throws IOException {
        m47869z(this.f45708f, i10, i11, i12, i13);
        this.f45703a.seek(0L);
        this.f45703a.write(this.f45708f);
    }
}
