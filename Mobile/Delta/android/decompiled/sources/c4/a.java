package c4;

import android.content.res.AssetManager;
import android.location.Location;
import android.media.MediaDataSource;
import android.media.MediaMetadataRetriever;
import android.os.Build;
import android.system.Os;
import android.system.OsConstants;
import android.util.Log;
import android.util.Pair;
import backtraceio.library.anr.BacktraceANRSettings;
import com.google.mlkit.common.MlKitException;
import com.google.mlkit.vision.barcode.common.Barcode;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.CRC32;
import okhttp3.internal.ws.WebSocketProtocol;

/* JADX INFO: loaded from: classes.dex */
public class a {
    public static final SimpleDateFormat V;
    public static final SimpleDateFormat W;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public static final e[] f4477a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public static final e[] f4478b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public static final e[] f4479c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public static final e[] f4480d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public static final e[] f4481e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public static final e f4482f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public static final e[] f4483g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public static final e[] f4484h0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public static final e[] f4485i0;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public static final e[] f4486j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public static final e[][] f4487k0;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public static final e[] f4488l0;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public static final HashMap<Integer, e>[] f4489m0;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public static final HashMap<String, e>[] f4490n0;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public static final Set<String> f4491o0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final HashMap<Integer, Integer> f4492p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public static final Charset f4493q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public static final byte[] f4494r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public static final byte[] f4495s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public static final Pattern f4496t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public static final Pattern f4497u0;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public static final Pattern f4498v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public static final Pattern f4500w0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f4504a;
    public FileDescriptor b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public AssetManager.AssetInputStream f4505c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f4506d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f4507e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final HashMap<String, d>[] f4508f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Set<Integer> f4509g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public ByteOrder f4510h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f4511i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f4512j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f4513k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f4514l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f4515m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public byte[] f4516n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f4517o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f4518p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f4519q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f4520r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f4521s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f4522t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public d f4523u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f4524v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final boolean f4499w = Log.isLoggable("ExifInterface", 3);

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final List<Integer> f4501x = Arrays.asList(1, 6, 3, 8);

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final List<Integer> f4502y = Arrays.asList(2, 7, 4, 5);

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final int[] f4503z = {8, 8, 8};
    public static final int[] A = {4};
    public static final int[] B = {8};
    public static final byte[] C = {-1, -40, -1};
    public static final byte[] D = {102, 116, 121, 112};
    public static final byte[] E = {109, 105, 102, 49};
    public static final byte[] F = {104, 101, 105, 99};
    public static final byte[] G = {97, 118, 105, 102};
    public static final byte[] H = {97, 118, 105, 115};
    public static final byte[] I = {79, 76, 89, 77, 80, 0};
    public static final byte[] J = {79, 76, 89, 77, 80, 85, 83, 0, 73, 73};
    public static final byte[] K = {-119, 80, 78, 71, 13, 10, 26, 10};
    public static final byte[] L = "XML:com.adobe.xmp\u0000\u0000\u0000\u0000\u0000".getBytes(StandardCharsets.UTF_8);
    public static final byte[] M = {82, 73, 70, 70};
    public static final byte[] N = {87, 69, 66, 80};
    public static final byte[] O = {69, 88, 73, 70};
    public static final byte[] P = {-99, 1, 42};
    public static final byte[] Q = "VP8X".getBytes(Charset.defaultCharset());
    public static final byte[] R = "VP8L".getBytes(Charset.defaultCharset());
    public static final byte[] S = "VP8 ".getBytes(Charset.defaultCharset());
    public static final byte[] T = "ANIM".getBytes(Charset.defaultCharset());
    public static final byte[] U = "ANMF".getBytes(Charset.defaultCharset());
    public static final String[] X = {"", "BYTE", "STRING", "USHORT", "ULONG", "URATIONAL", "SBYTE", "UNDEFINED", "SSHORT", "SLONG", "SRATIONAL", "SINGLE", "DOUBLE", "IFD"};
    public static final int[] Y = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8, 1};
    public static final byte[] Z = {65, 83, 67, 73, 73, 0, 0, 0};

    /* JADX INFO: renamed from: c4.a$a, reason: collision with other inner class name */
    public class C0094a extends MediaDataSource {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public long f4525a;
        public final /* synthetic */ g b;

        public C0094a(g gVar) {
            this.b = gVar;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }

        @Override // android.media.MediaDataSource
        public long getSize() {
            return -1L;
        }

        @Override // android.media.MediaDataSource
        public int readAt(long j10, byte[] bArr, int i10, int i11) {
            if (i11 == 0) {
                return 0;
            }
            if (j10 < 0) {
                return -1;
            }
            try {
                long j11 = this.f4525a;
                if (j11 != j10) {
                    if (j11 >= 0 && j10 >= j11 + ((long) this.b.available())) {
                        return -1;
                    }
                    this.b.g(j10);
                    this.f4525a = j10;
                }
                if (i11 > this.b.available()) {
                    i11 = this.b.available();
                }
                int i12 = this.b.read(bArr, i10, i11);
                if (i12 >= 0) {
                    this.f4525a += (long) i12;
                    return i12;
                }
            } catch (IOException unused) {
            }
            this.f4525a = -1L;
            return -1;
        }
    }

    public static class c extends FilterOutputStream {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final DataOutputStream f4531a;
        public ByteOrder b;

        public c(OutputStream outputStream, ByteOrder byteOrder) {
            super(outputStream);
            this.f4531a = new DataOutputStream(outputStream);
            this.b = byteOrder;
        }

        public void a(ByteOrder byteOrder) {
            this.b = byteOrder;
        }

        public void b(int i10) throws IOException {
            this.f4531a.write(i10);
        }

        public void c(int i10) throws IOException {
            ByteOrder byteOrder = this.b;
            if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
                this.f4531a.write(i10 & 255);
                this.f4531a.write((i10 >>> 8) & 255);
                this.f4531a.write((i10 >>> 16) & 255);
                this.f4531a.write((i10 >>> 24) & 255);
                return;
            }
            if (byteOrder == ByteOrder.BIG_ENDIAN) {
                this.f4531a.write((i10 >>> 24) & 255);
                this.f4531a.write((i10 >>> 16) & 255);
                this.f4531a.write((i10 >>> 8) & 255);
                this.f4531a.write(i10 & 255);
            }
        }

        public void d(short s8) throws IOException {
            ByteOrder byteOrder = this.b;
            if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
                this.f4531a.write(s8 & 255);
                this.f4531a.write((s8 >>> 8) & 255);
            } else if (byteOrder == ByteOrder.BIG_ENDIAN) {
                this.f4531a.write((s8 >>> 8) & 255);
                this.f4531a.write(s8 & 255);
            }
        }

        public void e(long j10) throws IOException {
            if (j10 > 4294967295L) {
                throw new IllegalArgumentException("val is larger than the maximum value of a 32-bit unsigned integer");
            }
            c((int) j10);
        }

        public void f(int i10) throws IOException {
            if (i10 > 65535) {
                throw new IllegalArgumentException("val is larger than the maximum value of a 16-bit unsigned integer");
            }
            d((short) i10);
        }

        @Override // java.io.FilterOutputStream, java.io.OutputStream
        public void write(byte[] bArr) throws IOException {
            this.f4531a.write(bArr);
        }

        @Override // java.io.FilterOutputStream, java.io.OutputStream
        public void write(byte[] bArr, int i10, int i11) throws IOException {
            this.f4531a.write(bArr, i10, i11);
        }
    }

    public static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f4532a;
        public final int b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f4533c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final byte[] f4534d;

        public d(int i10, int i11, byte[] bArr) {
            this(i10, i11, -1L, bArr);
        }

        public static d a(String str) {
            if (str.length() == 1 && str.charAt(0) >= '0' && str.charAt(0) <= '1') {
                return new d(1, 1, new byte[]{(byte) (str.charAt(0) - '0')});
            }
            byte[] bytes = str.getBytes(a.f4493q0);
            return new d(1, bytes.length, bytes);
        }

        public static d b(double[] dArr, ByteOrder byteOrder) {
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[a.Y[12] * dArr.length]);
            byteBufferWrap.order(byteOrder);
            for (double d10 : dArr) {
                byteBufferWrap.putDouble(d10);
            }
            return new d(12, dArr.length, byteBufferWrap.array());
        }

        public static d c(int[] iArr, ByteOrder byteOrder) {
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[a.Y[9] * iArr.length]);
            byteBufferWrap.order(byteOrder);
            for (int i10 : iArr) {
                byteBufferWrap.putInt(i10);
            }
            return new d(9, iArr.length, byteBufferWrap.array());
        }

        public static d d(f[] fVarArr, ByteOrder byteOrder) {
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[a.Y[10] * fVarArr.length]);
            byteBufferWrap.order(byteOrder);
            for (f fVar : fVarArr) {
                byteBufferWrap.putInt((int) fVar.f4538a);
                byteBufferWrap.putInt((int) fVar.b);
            }
            return new d(10, fVarArr.length, byteBufferWrap.array());
        }

        public static d e(String str) {
            byte[] bytes = (str + (char) 0).getBytes(a.f4493q0);
            return new d(2, bytes.length, bytes);
        }

        public static d f(long j10, ByteOrder byteOrder) {
            return g(new long[]{j10}, byteOrder);
        }

        public static d g(long[] jArr, ByteOrder byteOrder) {
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[a.Y[4] * jArr.length]);
            byteBufferWrap.order(byteOrder);
            for (long j10 : jArr) {
                byteBufferWrap.putInt((int) j10);
            }
            return new d(4, jArr.length, byteBufferWrap.array());
        }

        public static d h(f fVar, ByteOrder byteOrder) {
            return i(new f[]{fVar}, byteOrder);
        }

        public static d i(f[] fVarArr, ByteOrder byteOrder) {
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[a.Y[5] * fVarArr.length]);
            byteBufferWrap.order(byteOrder);
            for (f fVar : fVarArr) {
                byteBufferWrap.putInt((int) fVar.f4538a);
                byteBufferWrap.putInt((int) fVar.b);
            }
            return new d(5, fVarArr.length, byteBufferWrap.array());
        }

        public static d j(int i10, ByteOrder byteOrder) {
            return k(new int[]{i10}, byteOrder);
        }

        public static d k(int[] iArr, ByteOrder byteOrder) {
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[a.Y[3] * iArr.length]);
            byteBufferWrap.order(byteOrder);
            for (int i10 : iArr) {
                byteBufferWrap.putShort((short) i10);
            }
            return new d(3, iArr.length, byteBufferWrap.array());
        }

        public double l(ByteOrder byteOrder) throws Throwable {
            Object objO = o(byteOrder);
            if (objO == null) {
                throw new NumberFormatException("NULL can't be converted to a double value");
            }
            if (objO instanceof String) {
                return Double.parseDouble((String) objO);
            }
            if (objO instanceof long[]) {
                long[] jArr = (long[]) objO;
                if (jArr.length == 1) {
                    return jArr[0];
                }
                throw new NumberFormatException("There are more than one component");
            }
            if (objO instanceof int[]) {
                int[] iArr = (int[]) objO;
                if (iArr.length == 1) {
                    return iArr[0];
                }
                throw new NumberFormatException("There are more than one component");
            }
            if (objO instanceof double[]) {
                double[] dArr = (double[]) objO;
                if (dArr.length == 1) {
                    return dArr[0];
                }
                throw new NumberFormatException("There are more than one component");
            }
            if (!(objO instanceof f[])) {
                throw new NumberFormatException("Couldn't find a double value");
            }
            f[] fVarArr = (f[]) objO;
            if (fVarArr.length == 1) {
                return fVarArr[0].a();
            }
            throw new NumberFormatException("There are more than one component");
        }

        public int m(ByteOrder byteOrder) throws Throwable {
            Object objO = o(byteOrder);
            if (objO == null) {
                throw new NumberFormatException("NULL can't be converted to a integer value");
            }
            if (objO instanceof String) {
                return Integer.parseInt((String) objO);
            }
            if (objO instanceof long[]) {
                long[] jArr = (long[]) objO;
                if (jArr.length == 1) {
                    return (int) jArr[0];
                }
                throw new NumberFormatException("There are more than one component");
            }
            if (!(objO instanceof int[])) {
                throw new NumberFormatException("Couldn't find a integer value");
            }
            int[] iArr = (int[]) objO;
            if (iArr.length == 1) {
                return iArr[0];
            }
            throw new NumberFormatException("There are more than one component");
        }

        public String n(ByteOrder byteOrder) throws Throwable {
            Object objO = o(byteOrder);
            if (objO == null) {
                return null;
            }
            if (objO instanceof String) {
                return (String) objO;
            }
            StringBuilder sb2 = new StringBuilder();
            int i10 = 0;
            if (objO instanceof long[]) {
                long[] jArr = (long[]) objO;
                while (i10 < jArr.length) {
                    sb2.append(jArr[i10]);
                    i10++;
                    if (i10 != jArr.length) {
                        sb2.append(",");
                    }
                }
                return sb2.toString();
            }
            if (objO instanceof int[]) {
                int[] iArr = (int[]) objO;
                while (i10 < iArr.length) {
                    sb2.append(iArr[i10]);
                    i10++;
                    if (i10 != iArr.length) {
                        sb2.append(",");
                    }
                }
                return sb2.toString();
            }
            if (objO instanceof double[]) {
                double[] dArr = (double[]) objO;
                while (i10 < dArr.length) {
                    sb2.append(dArr[i10]);
                    i10++;
                    if (i10 != dArr.length) {
                        sb2.append(",");
                    }
                }
                return sb2.toString();
            }
            if (!(objO instanceof f[])) {
                return null;
            }
            f[] fVarArr = (f[]) objO;
            while (i10 < fVarArr.length) {
                sb2.append(fVarArr[i10].f4538a);
                sb2.append('/');
                sb2.append(fVarArr[i10].b);
                i10++;
                if (i10 != fVarArr.length) {
                    sb2.append(",");
                }
            }
            return sb2.toString();
        }

        /* JADX WARN: Code duplicated, block: B:108:0x0163 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:124:? A[SYNTHETIC] */
        /* JADX WARN: Not initialized variable reg: 4, insn: 0x0032: MOVE (r3 I:??[OBJECT, ARRAY]) = (r4 I:??[OBJECT, ARRAY]), block:B:18:0x0031 */
        public Object o(ByteOrder byteOrder) throws Throwable {
            Throwable th2;
            IOException iOException;
            b bVar;
            InputStream inputStream;
            byte b;
            byte b10;
            Object str;
            InputStream inputStream2 = null;
            try {
                try {
                    bVar = new b(this.f4534d);
                    try {
                        bVar.e(byteOrder);
                        int length = 0;
                        switch (this.f4532a) {
                            case 1:
                            case 6:
                                byte[] bArr = this.f4534d;
                                if (bArr.length == 1 && (b = bArr[0]) >= 0 && b <= 1) {
                                    str = new String(new char[]{(char) (b + 48)});
                                    break;
                                } else {
                                    String str2 = new String(bArr, a.f4493q0);
                                    try {
                                        bVar.close();
                                        return str2;
                                    } catch (IOException e10) {
                                        Log.e("ExifInterface", "IOException occurred while closing InputStream", e10);
                                        return str2;
                                    }
                                }
                                break;
                            case 2:
                            case 7:
                                if (this.b >= a.Z.length) {
                                    int i10 = 0;
                                    while (true) {
                                        if (i10 >= a.Z.length) {
                                            length = a.Z.length;
                                        } else if (this.f4534d[i10] == a.Z[i10]) {
                                            i10++;
                                        }
                                    }
                                }
                                StringBuilder sb2 = new StringBuilder();
                                while (length < this.b && (b10 = this.f4534d[length]) != 0) {
                                    if (b10 >= 32) {
                                        sb2.append((char) b10);
                                    } else {
                                        sb2.append('?');
                                    }
                                    length++;
                                }
                                str = sb2.toString();
                                break;
                            case 3:
                                int[] iArr = new int[this.b];
                                while (true) {
                                    str = iArr;
                                    if (length < this.b) {
                                        iArr[length] = bVar.readUnsignedShort();
                                        length++;
                                    }
                                }
                                break;
                            case 4:
                                long[] jArr = new long[this.b];
                                while (true) {
                                    str = jArr;
                                    if (length < this.b) {
                                        jArr[length] = bVar.d();
                                        length++;
                                    }
                                }
                                break;
                            case 5:
                                f[] fVarArr = new f[this.b];
                                while (true) {
                                    str = fVarArr;
                                    if (length < this.b) {
                                        fVarArr[length] = new f(bVar.d(), bVar.d(), null);
                                        length++;
                                    }
                                }
                                break;
                            case 8:
                                int[] iArr2 = new int[this.b];
                                while (true) {
                                    str = iArr2;
                                    if (length < this.b) {
                                        iArr2[length] = bVar.readShort();
                                        length++;
                                    }
                                }
                                break;
                            case 9:
                                int[] iArr3 = new int[this.b];
                                while (true) {
                                    str = iArr3;
                                    if (length < this.b) {
                                        iArr3[length] = bVar.readInt();
                                        length++;
                                    }
                                }
                                break;
                            case 10:
                                f[] fVarArr2 = new f[this.b];
                                while (true) {
                                    str = fVarArr2;
                                    if (length < this.b) {
                                        fVarArr2[length] = new f(bVar.readInt(), bVar.readInt(), null);
                                        length++;
                                    }
                                }
                                break;
                            case 11:
                                double[] dArr = new double[this.b];
                                while (true) {
                                    str = dArr;
                                    if (length < this.b) {
                                        dArr[length] = bVar.readFloat();
                                        length++;
                                    }
                                }
                                break;
                            case 12:
                                double[] dArr2 = new double[this.b];
                                while (true) {
                                    str = dArr2;
                                    if (length < this.b) {
                                        dArr2[length] = bVar.readDouble();
                                        length++;
                                    }
                                }
                                break;
                            default:
                                try {
                                    bVar.close();
                                    return null;
                                } catch (IOException e11) {
                                    Log.e("ExifInterface", "IOException occurred while closing InputStream", e11);
                                    return null;
                                }
                        }
                        try {
                            bVar.close();
                            return str;
                        } catch (IOException e12) {
                            Log.e("ExifInterface", "IOException occurred while closing InputStream", e12);
                            return str;
                        }
                    } catch (IOException e13) {
                        iOException = e13;
                        Log.w("ExifInterface", "IOException occurred during reading a value", iOException);
                        if (bVar != null) {
                            try {
                                bVar.close();
                            } catch (IOException e14) {
                                Log.e("ExifInterface", "IOException occurred while closing InputStream", e14);
                            }
                        }
                        return null;
                    }
                } catch (Throwable th3) {
                    th2 = th3;
                    inputStream2 = inputStream;
                    if (inputStream2 != null) {
                        throw th2;
                    }
                    try {
                        inputStream2.close();
                        throw th2;
                    } catch (IOException e15) {
                        Log.e("ExifInterface", "IOException occurred while closing InputStream", e15);
                        throw th2;
                    }
                }
            } catch (IOException e16) {
                iOException = e16;
                bVar = null;
            } catch (Throwable th4) {
                th2 = th4;
                if (inputStream2 != null) {
                    throw th2;
                }
                inputStream2.close();
                throw th2;
            }
        }

        public int p() {
            return a.Y[this.f4532a] * this.b;
        }

        public String toString() {
            return "(" + a.X[this.f4532a] + ", data length:" + this.f4534d.length + ")";
        }

        public d(int i10, int i11, long j10, byte[] bArr) {
            this.f4532a = i10;
            this.b = i11;
            this.f4533c = j10;
            this.f4534d = bArr;
        }
    }

    public static class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f4538a;
        public final long b;

        public /* synthetic */ f(long j10, long j11, C0094a c0094a) {
            this(j10, j11);
        }

        public static f b(double d10) {
            long j10;
            long j11;
            long j12 = 1;
            if (d10 >= 9.223372036854776E18d || d10 <= -9.223372036854776E18d) {
                return new f(d10 > 0.0d ? Long.MAX_VALUE : Long.MIN_VALUE, 1L);
            }
            double dAbs = Math.abs(d10);
            long j13 = 0;
            long j14 = 1;
            double d11 = dAbs;
            long j15 = 0;
            while (true) {
                double d12 = d11 % 1.0d;
                long j16 = (long) (d11 - d12);
                j10 = j15 + (j16 * j12);
                j11 = (j16 * j13) + j14;
                d11 = 1.0d / d12;
                long j17 = j12;
                if (Math.abs(dAbs - (j10 / j11)) <= 1.0E-8d * dAbs) {
                    break;
                }
                j14 = j13;
                j12 = j10;
                j15 = j17;
                j13 = j11;
            }
            if (d10 < 0.0d) {
                j10 = -j10;
            }
            return new f(j10, j11);
        }

        public double a() {
            return this.f4538a / this.b;
        }

        public String toString() {
            return this.f4538a + "/" + this.b;
        }

        public f(long j10, long j11) {
            if (j11 == 0) {
                this.f4538a = 0L;
                this.b = 1L;
            } else {
                this.f4538a = j10;
                this.b = j11;
            }
        }
    }

    static {
        e[] eVarArr = {new e("NewSubfileType", 254, 4), new e("SubfileType", 255, 4), new e("ImageWidth", Barcode.FORMAT_QR_CODE, 3, 4), new e("ImageLength", 257, 3, 4), new e("BitsPerSample", 258, 3), new e("Compression", 259, 3), new e("PhotometricInterpretation", 262, 3), new e("ImageDescription", 270, 2), new e("Make", 271, 2), new e("Model", 272, 2), new e("StripOffsets", 273, 3, 4), new e("Orientation", 274, 3), new e("SamplesPerPixel", 277, 3), new e("RowsPerStrip", 278, 3, 4), new e("StripByteCounts", 279, 3, 4), new e("XResolution", 282, 5), new e("YResolution", 283, 5), new e("PlanarConfiguration", 284, 3), new e("ResolutionUnit", 296, 3), new e("TransferFunction", MlKitException.LOW_LIGHT_IMAGE_CAPTURE_PROCESSING_FAILURE, 3), new e("Software", 305, 2), new e("DateTime", 306, 2), new e("Artist", 315, 2), new e("WhitePoint", 318, 5), new e("PrimaryChromaticities", 319, 5), new e("SubIFDPointer", 330, 4), new e("JPEGInterchangeFormat", 513, 4), new e("JPEGInterchangeFormatLength", 514, 4), new e("YCbCrCoefficients", 529, 5), new e("YCbCrSubSampling", 530, 3), new e("YCbCrPositioning", 531, 3), new e("ReferenceBlackWhite", 532, 5), new e("Copyright", 33432, 2), new e("ExifIFDPointer", 34665, 4), new e("GPSInfoIFDPointer", 34853, 4), new e("SensorTopBorder", 4, 4), new e("SensorLeftBorder", 5, 4), new e("SensorBottomBorder", 6, 4), new e("SensorRightBorder", 7, 4), new e("ISO", 23, 3), new e("JpgFromRaw", 46, 7), new e("Xmp", 700, 1)};
        f4477a0 = eVarArr;
        e[] eVarArr2 = {new e("ExposureTime", 33434, 5), new e("FNumber", 33437, 5), new e("ExposureProgram", 34850, 3), new e("SpectralSensitivity", 34852, 2), new e("PhotographicSensitivity", 34855, 3), new e("OECF", 34856, 7), new e("SensitivityType", 34864, 3), new e("StandardOutputSensitivity", 34865, 4), new e("RecommendedExposureIndex", 34866, 4), new e("ISOSpeed", 34867, 4), new e("ISOSpeedLatitudeyyy", 34868, 4), new e("ISOSpeedLatitudezzz", 34869, 4), new e("ExifVersion", 36864, 2), new e("DateTimeOriginal", 36867, 2), new e("DateTimeDigitized", 36868, 2), new e("OffsetTime", 36880, 2), new e("OffsetTimeOriginal", 36881, 2), new e("OffsetTimeDigitized", 36882, 2), new e("ComponentsConfiguration", 37121, 7), new e("CompressedBitsPerPixel", 37122, 5), new e("ShutterSpeedValue", 37377, 10), new e("ApertureValue", 37378, 5), new e("BrightnessValue", 37379, 10), new e("ExposureBiasValue", 37380, 10), new e("MaxApertureValue", 37381, 5), new e("SubjectDistance", 37382, 5), new e("MeteringMode", 37383, 3), new e("LightSource", 37384, 3), new e("Flash", 37385, 3), new e("FocalLength", 37386, 5), new e("SubjectArea", 37396, 3), new e("MakerNote", 37500, 7), new e("UserComment", 37510, 7), new e("SubSecTime", 37520, 2), new e("SubSecTimeOriginal", 37521, 2), new e("SubSecTimeDigitized", 37522, 2), new e("FlashpixVersion", 40960, 7), new e("ColorSpace", 40961, 3), new e("PixelXDimension", 40962, 3, 4), new e("PixelYDimension", 40963, 3, 4), new e("RelatedSoundFile", 40964, 2), new e("InteroperabilityIFDPointer", 40965, 4), new e("FlashEnergy", 41483, 5), new e("SpatialFrequencyResponse", 41484, 7), new e("FocalPlaneXResolution", 41486, 5), new e("FocalPlaneYResolution", 41487, 5), new e("FocalPlaneResolutionUnit", 41488, 3), new e("SubjectLocation", 41492, 3), new e("ExposureIndex", 41493, 5), new e("SensingMethod", 41495, 3), new e("FileSource", 41728, 7), new e("SceneType", 41729, 7), new e("CFAPattern", 41730, 7), new e("CustomRendered", 41985, 3), new e("ExposureMode", 41986, 3), new e("WhiteBalance", 41987, 3), new e("DigitalZoomRatio", 41988, 5), new e("FocalLengthIn35mmFilm", 41989, 3), new e("SceneCaptureType", 41990, 3), new e("GainControl", 41991, 3), new e("Contrast", 41992, 3), new e("Saturation", 41993, 3), new e("Sharpness", 41994, 3), new e("DeviceSettingDescription", 41995, 7), new e("SubjectDistanceRange", 41996, 3), new e("ImageUniqueID", 42016, 2), new e("CameraOwnerName", 42032, 2), new e("BodySerialNumber", 42033, 2), new e("LensSpecification", 42034, 5), new e("LensMake", 42035, 2), new e("LensModel", 42036, 2), new e("Gamma", 42240, 5), new e("DNGVersion", 50706, 1), new e("DefaultCropSize", 50720, 3, 4)};
        f4478b0 = eVarArr2;
        e[] eVarArr3 = {new e("GPSVersionID", 0, 1), new e("GPSLatitudeRef", 1, 2), new e("GPSLatitude", 2, 5, 10), new e("GPSLongitudeRef", 3, 2), new e("GPSLongitude", 4, 5, 10), new e("GPSAltitudeRef", 5, 1), new e("GPSAltitude", 6, 5), new e("GPSTimeStamp", 7, 5), new e("GPSSatellites", 8, 2), new e("GPSStatus", 9, 2), new e("GPSMeasureMode", 10, 2), new e("GPSDOP", 11, 5), new e("GPSSpeedRef", 12, 2), new e("GPSSpeed", 13, 5), new e("GPSTrackRef", 14, 2), new e("GPSTrack", 15, 5), new e("GPSImgDirectionRef", 16, 2), new e("GPSImgDirection", 17, 5), new e("GPSMapDatum", 18, 2), new e("GPSDestLatitudeRef", 19, 2), new e("GPSDestLatitude", 20, 5), new e("GPSDestLongitudeRef", 21, 2), new e("GPSDestLongitude", 22, 5), new e("GPSDestBearingRef", 23, 2), new e("GPSDestBearing", 24, 5), new e("GPSDestDistanceRef", 25, 2), new e("GPSDestDistance", 26, 5), new e("GPSProcessingMethod", 27, 7), new e("GPSAreaInformation", 28, 7), new e("GPSDateStamp", 29, 2), new e("GPSDifferential", 30, 3), new e("GPSHPositioningError", 31, 5)};
        f4479c0 = eVarArr3;
        e[] eVarArr4 = {new e("InteroperabilityIndex", 1, 2)};
        f4480d0 = eVarArr4;
        e[] eVarArr5 = {new e("NewSubfileType", 254, 4), new e("SubfileType", 255, 4), new e("ThumbnailImageWidth", Barcode.FORMAT_QR_CODE, 3, 4), new e("ThumbnailImageLength", 257, 3, 4), new e("BitsPerSample", 258, 3), new e("Compression", 259, 3), new e("PhotometricInterpretation", 262, 3), new e("ImageDescription", 270, 2), new e("Make", 271, 2), new e("Model", 272, 2), new e("StripOffsets", 273, 3, 4), new e("ThumbnailOrientation", 274, 3), new e("SamplesPerPixel", 277, 3), new e("RowsPerStrip", 278, 3, 4), new e("StripByteCounts", 279, 3, 4), new e("XResolution", 282, 5), new e("YResolution", 283, 5), new e("PlanarConfiguration", 284, 3), new e("ResolutionUnit", 296, 3), new e("TransferFunction", MlKitException.LOW_LIGHT_IMAGE_CAPTURE_PROCESSING_FAILURE, 3), new e("Software", 305, 2), new e("DateTime", 306, 2), new e("Artist", 315, 2), new e("WhitePoint", 318, 5), new e("PrimaryChromaticities", 319, 5), new e("SubIFDPointer", 330, 4), new e("JPEGInterchangeFormat", 513, 4), new e("JPEGInterchangeFormatLength", 514, 4), new e("YCbCrCoefficients", 529, 5), new e("YCbCrSubSampling", 530, 3), new e("YCbCrPositioning", 531, 3), new e("ReferenceBlackWhite", 532, 5), new e("Copyright", 33432, 2), new e("ExifIFDPointer", 34665, 4), new e("GPSInfoIFDPointer", 34853, 4), new e("DNGVersion", 50706, 1), new e("DefaultCropSize", 50720, 3, 4)};
        f4481e0 = eVarArr5;
        f4482f0 = new e("StripOffsets", 273, 3);
        e[] eVarArr6 = {new e("ThumbnailImage", Barcode.FORMAT_QR_CODE, 7), new e("CameraSettingsIFDPointer", 8224, 4), new e("ImageProcessingIFDPointer", 8256, 4)};
        f4483g0 = eVarArr6;
        e[] eVarArr7 = {new e("PreviewImageStart", 257, 4), new e("PreviewImageLength", 258, 4)};
        f4484h0 = eVarArr7;
        e[] eVarArr8 = {new e("AspectFrame", 4371, 3)};
        f4485i0 = eVarArr8;
        e[] eVarArr9 = {new e("ColorSpace", 55, 3)};
        f4486j0 = eVarArr9;
        e[][] eVarArr10 = {eVarArr, eVarArr2, eVarArr3, eVarArr4, eVarArr5, eVarArr, eVarArr6, eVarArr7, eVarArr8, eVarArr9};
        f4487k0 = eVarArr10;
        f4488l0 = new e[]{new e("SubIFDPointer", 330, 4), new e("ExifIFDPointer", 34665, 4), new e("GPSInfoIFDPointer", 34853, 4), new e("InteroperabilityIFDPointer", 40965, 4), new e("CameraSettingsIFDPointer", 8224, 1), new e("ImageProcessingIFDPointer", 8256, 1)};
        f4489m0 = new HashMap[eVarArr10.length];
        f4490n0 = new HashMap[eVarArr10.length];
        f4491o0 = Collections.unmodifiableSet(new HashSet(Arrays.asList("FNumber", "DigitalZoomRatio", "ExposureTime", "SubjectDistance")));
        f4492p0 = new HashMap<>();
        Charset charsetForName = Charset.forName("US-ASCII");
        f4493q0 = charsetForName;
        f4494r0 = "Exif\u0000\u0000".getBytes(charsetForName);
        f4495s0 = "http://ns.adobe.com/xap/1.0/\u0000".getBytes(charsetForName);
        Locale locale = Locale.US;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy:MM:dd HH:mm:ss", locale);
        V = simpleDateFormat;
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", locale);
        W = simpleDateFormat2;
        simpleDateFormat2.setTimeZone(TimeZone.getTimeZone("UTC"));
        int i10 = 0;
        while (true) {
            e[][] eVarArr11 = f4487k0;
            if (i10 >= eVarArr11.length) {
                HashMap<Integer, Integer> map = f4492p0;
                e[] eVarArr12 = f4488l0;
                map.put(Integer.valueOf(eVarArr12[0].f4535a), 5);
                map.put(Integer.valueOf(eVarArr12[1].f4535a), 1);
                map.put(Integer.valueOf(eVarArr12[2].f4535a), 2);
                map.put(Integer.valueOf(eVarArr12[3].f4535a), 3);
                map.put(Integer.valueOf(eVarArr12[4].f4535a), 7);
                map.put(Integer.valueOf(eVarArr12[5].f4535a), 8);
                f4496t0 = Pattern.compile(".*[1-9].*");
                f4497u0 = Pattern.compile("^(\\d{2}):(\\d{2}):(\\d{2})$");
                f4498v0 = Pattern.compile("^(\\d{4}):(\\d{2}):(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
                f4500w0 = Pattern.compile("^(\\d{4})-(\\d{2})-(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
                return;
            }
            f4489m0[i10] = new HashMap<>();
            f4490n0[i10] = new HashMap<>();
            for (e eVar : eVarArr11[i10]) {
                f4489m0[i10].put(Integer.valueOf(eVar.f4535a), eVar);
                f4490n0[i10].put(eVar.b, eVar);
            }
            i10++;
        }
    }

    public a(String str) throws Throwable {
        e[][] eVarArr = f4487k0;
        this.f4508f = new HashMap[eVarArr.length];
        this.f4509g = new HashSet(eVarArr.length);
        this.f4510h = ByteOrder.BIG_ENDIAN;
        if (str == null) {
            throw new NullPointerException("filename cannot be null");
        }
        G(str);
    }

    public static int C(int i10) {
        if (i10 != 4) {
            return (i10 == 9 || i10 == 15 || i10 == 12 || i10 == 13) ? 2 : 1;
        }
        return 3;
    }

    public static Pair<Integer, Integer> D(String str) {
        if (str.contains(",")) {
            String[] strArrSplit = str.split(",", -1);
            Pair<Integer, Integer> pairD = D(strArrSplit[0]);
            if (((Integer) pairD.first).intValue() == 2) {
                return pairD;
            }
            for (int i10 = 1; i10 < strArrSplit.length; i10++) {
                Pair<Integer, Integer> pairD2 = D(strArrSplit[i10]);
                int iIntValue = (((Integer) pairD2.first).equals(pairD.first) || ((Integer) pairD2.second).equals(pairD.first)) ? ((Integer) pairD.first).intValue() : -1;
                int iIntValue2 = (((Integer) pairD.second).intValue() == -1 || !(((Integer) pairD2.first).equals(pairD.second) || ((Integer) pairD2.second).equals(pairD.second))) ? -1 : ((Integer) pairD.second).intValue();
                if (iIntValue == -1 && iIntValue2 == -1) {
                    return new Pair<>(2, -1);
                }
                if (iIntValue == -1) {
                    pairD = new Pair<>(Integer.valueOf(iIntValue2), -1);
                } else if (iIntValue2 == -1) {
                    pairD = new Pair<>(Integer.valueOf(iIntValue), -1);
                }
            }
            return pairD;
        }
        if (!str.contains("/")) {
            try {
                try {
                    long j10 = Long.parseLong(str);
                    if (j10 < 0 || j10 > WebSocketProtocol.PAYLOAD_SHORT_MAX) {
                        return j10 < 0 ? new Pair<>(9, -1) : new Pair<>(4, -1);
                    }
                    return new Pair<>(3, 4);
                } catch (NumberFormatException unused) {
                    return new Pair<>(2, -1);
                }
            } catch (NumberFormatException unused2) {
                Double.parseDouble(str);
                return new Pair<>(12, -1);
            }
        }
        String[] strArrSplit2 = str.split("/", -1);
        if (strArrSplit2.length == 2) {
            try {
                long j11 = (long) Double.parseDouble(strArrSplit2[0]);
                long j12 = (long) Double.parseDouble(strArrSplit2[1]);
                if (j11 >= 0 && j12 >= 0) {
                    if (j11 <= 2147483647L && j12 <= 2147483647L) {
                        return new Pair<>(10, 5);
                    }
                    return new Pair<>(5, -1);
                }
                return new Pair<>(10, -1);
            } catch (NumberFormatException unused3) {
            }
        }
        return new Pair<>(2, -1);
    }

    public static boolean J(byte[] bArr) {
        int i10 = 0;
        while (true) {
            byte[] bArr2 = C;
            if (i10 >= bArr2.length) {
                return true;
            }
            if (bArr[i10] != bArr2[i10]) {
                return false;
            }
            i10++;
        }
    }

    public static boolean O(FileDescriptor fileDescriptor) {
        try {
            Os.lseek(fileDescriptor, 0L, OsConstants.SEEK_CUR);
            return true;
        } catch (Exception unused) {
            if (!f4499w) {
                return false;
            }
            Log.d("ExifInterface", "The file descriptor for the given input is not seekable");
            return false;
        }
    }

    public static boolean Q(int i10) {
        return i10 == 4 || i10 == 13 || i10 == 14;
    }

    public static double g(String str, String str2) {
        try {
            String[] strArrSplit = str.split(",", -1);
            String[] strArrSplit2 = strArrSplit[0].split("/", -1);
            double d10 = Double.parseDouble(strArrSplit2[0].trim()) / Double.parseDouble(strArrSplit2[1].trim());
            String[] strArrSplit3 = strArrSplit[1].split("/", -1);
            double d11 = Double.parseDouble(strArrSplit3[0].trim()) / Double.parseDouble(strArrSplit3[1].trim());
            String[] strArrSplit4 = strArrSplit[2].split("/", -1);
            double d12 = d10 + (d11 / 60.0d) + ((Double.parseDouble(strArrSplit4[0].trim()) / Double.parseDouble(strArrSplit4[1].trim())) / 3600.0d);
            if (!str2.equals("S") && !str2.equals("W")) {
                if (!str2.equals("N") && !str2.equals("E")) {
                    throw new IllegalArgumentException();
                }
                return d12;
            }
            return -d12;
        } catch (ArrayIndexOutOfBoundsException | NumberFormatException e10) {
            throw new IllegalArgumentException(e10);
        }
    }

    public static boolean l0(int i10) {
        return (i10 == 4 || i10 == 9 || i10 == 13 || i10 == 14) ? false : true;
    }

    public static void n0(CRC32 crc32, int i10) {
        crc32.update(i10 >>> 24);
        crc32.update(i10 >>> 16);
        crc32.update(i10 >>> 8);
        crc32.update(i10);
    }

    /* JADX WARN: Code duplicated, block: B:48:0x008c  */
    /* JADX WARN: Code duplicated, block: B:52:0x0095  */
    public byte[] A() throws Throwable {
        FileDescriptor fileDescriptor;
        InputStream fileInputStream;
        Exception e10;
        InputStream inputStream = null;
        if (!this.f4511i) {
            return null;
        }
        byte[] bArr = this.f4516n;
        if (bArr != null) {
            return bArr;
        }
        try {
            fileInputStream = this.f4505c;
            if (fileInputStream != null) {
                try {
                    if (!fileInputStream.markSupported()) {
                        Log.d("ExifInterface", "Cannot read thumbnail from inputstream without mark/reset support");
                        c4.b.b(fileInputStream);
                        return null;
                    }
                    fileInputStream.reset();
                    fileDescriptor = null;
                } catch (Exception e11) {
                    e10 = e11;
                    fileDescriptor = null;
                    Log.d("ExifInterface", "Encountered exception while getting thumbnail", e10);
                    c4.b.b(fileInputStream);
                    if (fileDescriptor != null) {
                        c4.b.a(fileDescriptor);
                    }
                    return null;
                } catch (Throwable th2) {
                    th = th2;
                    fileDescriptor = null;
                    inputStream = fileInputStream;
                    c4.b.b(inputStream);
                    if (fileDescriptor != null) {
                        c4.b.a(fileDescriptor);
                    }
                    throw th;
                }
            } else if (this.f4504a != null) {
                fileInputStream = new FileInputStream(this.f4504a);
                fileDescriptor = null;
            } else {
                FileDescriptor fileDescriptorDup = Os.dup(this.b);
                try {
                    Os.lseek(fileDescriptorDup, 0L, OsConstants.SEEK_SET);
                    fileDescriptor = fileDescriptorDup;
                    fileInputStream = new FileInputStream(fileDescriptorDup);
                } catch (Exception e12) {
                    e10 = e12;
                    fileDescriptor = fileDescriptorDup;
                    fileInputStream = null;
                    Log.d("ExifInterface", "Encountered exception while getting thumbnail", e10);
                    c4.b.b(fileInputStream);
                    if (fileDescriptor != null) {
                        c4.b.a(fileDescriptor);
                    }
                    return null;
                } catch (Throwable th3) {
                    th = th3;
                    fileDescriptor = fileDescriptorDup;
                    c4.b.b(inputStream);
                    if (fileDescriptor != null) {
                        c4.b.a(fileDescriptor);
                    }
                    throw th;
                }
            }
            try {
                try {
                    b bVar = new b(fileInputStream);
                    bVar.f(this.f4514l + this.f4518p);
                    byte[] bArr2 = new byte[this.f4515m];
                    bVar.readFully(bArr2);
                    this.f4516n = bArr2;
                    c4.b.b(fileInputStream);
                    if (fileDescriptor != null) {
                        c4.b.a(fileDescriptor);
                    }
                    return bArr2;
                } catch (Exception e13) {
                    e10 = e13;
                    Log.d("ExifInterface", "Encountered exception while getting thumbnail", e10);
                    c4.b.b(fileInputStream);
                    if (fileDescriptor != null) {
                        c4.b.a(fileDescriptor);
                    }
                    return null;
                }
            } catch (Throwable th4) {
                th = th4;
                inputStream = fileInputStream;
                c4.b.b(inputStream);
                if (fileDescriptor != null) {
                    c4.b.a(fileDescriptor);
                }
                throw th;
            }
        } catch (Exception e14) {
            fileInputStream = null;
            e10 = e14;
            fileDescriptor = null;
        } catch (Throwable th5) {
            th = th5;
            fileDescriptor = null;
        }
    }

    public final void B(b bVar) throws Throwable {
        if (f4499w) {
            Log.d("ExifInterface", "getWebpAttributes starting with: " + bVar);
        }
        bVar.e(ByteOrder.LITTLE_ENDIAN);
        bVar.f(M.length);
        int i10 = bVar.readInt() + 8;
        byte[] bArr = N;
        bVar.f(bArr.length);
        int length = bArr.length + 8;
        while (true) {
            try {
                byte[] bArr2 = new byte[4];
                bVar.readFully(bArr2);
                int i11 = bVar.readInt();
                int i12 = length + 8;
                if (Arrays.equals(O, bArr2)) {
                    byte[] bArrCopyOfRange = new byte[i11];
                    bVar.readFully(bArrCopyOfRange);
                    byte[] bArr3 = f4494r0;
                    if (c4.b.f(bArrCopyOfRange, bArr3)) {
                        bArrCopyOfRange = Arrays.copyOfRange(bArrCopyOfRange, bArr3.length, i11);
                    }
                    this.f4518p = i12;
                    X(bArrCopyOfRange, 0);
                    k0(new b(bArrCopyOfRange));
                    return;
                }
                if (i11 % 2 == 1) {
                    i11++;
                }
                length = i12 + i11;
                if (length == i10) {
                    return;
                }
                if (length > i10) {
                    throw new IOException("Encountered WebP file with invalid chunk size");
                }
                bVar.f(i11);
            } catch (EOFException e10) {
                throw new IOException("Encountered corrupt WebP file.", e10);
            }
        }
    }

    public final void E(b bVar, HashMap<String, d> map) throws Throwable {
        d dVar = map.get("JPEGInterchangeFormat");
        d dVar2 = map.get("JPEGInterchangeFormatLength");
        if (dVar == null || dVar2 == null) {
            return;
        }
        int iM = dVar.m(this.f4510h);
        int iM2 = dVar2.m(this.f4510h);
        if (this.f4506d == 7) {
            iM += this.f4519q;
        }
        if (iM > 0 && iM2 > 0) {
            this.f4511i = true;
            if (this.f4504a == null && this.f4505c == null && this.b == null) {
                byte[] bArr = new byte[iM2];
                bVar.f(iM);
                bVar.readFully(bArr);
                this.f4516n = bArr;
            }
            this.f4514l = iM;
            this.f4515m = iM2;
        }
        if (f4499w) {
            Log.d("ExifInterface", "Setting thumbnail attributes with offset: " + iM + ", length: " + iM2);
        }
    }

    public final void F(b bVar, HashMap<String, d> map) throws IOException {
        int i10;
        d dVar = map.get("StripOffsets");
        d dVar2 = map.get("StripByteCounts");
        if (dVar == null || dVar2 == null) {
            return;
        }
        long[] jArrC = c4.b.c(dVar.o(this.f4510h));
        long[] jArrC2 = c4.b.c(dVar2.o(this.f4510h));
        if (jArrC == null || jArrC.length == 0) {
            Log.w("ExifInterface", "stripOffsets should not be null or have zero length.");
            return;
        }
        if (jArrC2 == null || jArrC2.length == 0) {
            Log.w("ExifInterface", "stripByteCounts should not be null or have zero length.");
            return;
        }
        if (jArrC.length != jArrC2.length) {
            Log.w("ExifInterface", "stripOffsets and stripByteCounts should have same length.");
            return;
        }
        long j10 = 0;
        for (long j11 : jArrC2) {
            j10 += j11;
        }
        int i11 = (int) j10;
        byte[] bArr = new byte[i11];
        int i12 = 1;
        this.f4513k = true;
        this.f4512j = true;
        this.f4511i = true;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        while (i13 < jArrC.length) {
            int i16 = (int) jArrC[i13];
            int i17 = (int) jArrC2[i13];
            if (i13 < jArrC.length - i12) {
                i10 = i13;
                if (i16 + i17 != jArrC[i10 + 1]) {
                    this.f4513k = false;
                }
            } else {
                i10 = i13;
            }
            int i18 = i16 - i14;
            if (i18 < 0) {
                Log.d("ExifInterface", "Invalid strip offset value");
                return;
            }
            try {
                bVar.f(i18);
                int i19 = i14 + i18;
                byte[] bArr2 = new byte[i17];
                try {
                    bVar.readFully(bArr2);
                    i14 = i19 + i17;
                    System.arraycopy(bArr2, 0, bArr, i15, i17);
                    i15 += i17;
                    i13 = i10 + 1;
                    i12 = 1;
                } catch (EOFException unused) {
                    Log.d("ExifInterface", "Failed to read " + i17 + " bytes.");
                    return;
                }
            } catch (EOFException unused2) {
                Log.d("ExifInterface", "Failed to skip " + i18 + " bytes.");
                return;
            }
        }
        this.f4516n = bArr;
        if (this.f4513k) {
            this.f4514l = (int) jArrC[0];
            this.f4515m = i11;
        }
    }

    public final void G(String str) throws Throwable {
        if (str == null) {
            throw new NullPointerException("filename cannot be null");
        }
        FileInputStream fileInputStream = null;
        this.f4505c = null;
        this.f4504a = str;
        try {
            FileInputStream fileInputStream2 = new FileInputStream(str);
            try {
                if (O(fileInputStream2.getFD())) {
                    this.b = fileInputStream2.getFD();
                } else {
                    this.b = null;
                }
                T(fileInputStream2);
                c4.b.b(fileInputStream2);
            } catch (Throwable th2) {
                th = th2;
                fileInputStream = fileInputStream2;
                c4.b.b(fileInputStream);
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    public boolean H() {
        int iM = m("Orientation", 1);
        return iM == 2 || iM == 7 || iM == 4 || iM == 5;
    }

    public final int I(byte[] bArr) throws Throwable {
        long j10;
        b bVar = null;
        try {
            try {
                b bVar2 = new b(bArr);
                try {
                    long length = bVar2.readInt();
                    byte[] bArr2 = new byte[4];
                    bVar2.readFully(bArr2);
                    if (!Arrays.equals(bArr2, D)) {
                        bVar2.close();
                        return 0;
                    }
                    if (length == 1) {
                        length = bVar2.readLong();
                        j10 = 16;
                        if (length < 16) {
                            bVar2.close();
                            return 0;
                        }
                    } else {
                        j10 = 8;
                    }
                    if (length > bArr.length) {
                        length = bArr.length;
                    }
                    long j11 = length - j10;
                    if (j11 < 8) {
                        bVar2.close();
                        return 0;
                    }
                    byte[] bArr3 = new byte[4];
                    boolean z10 = false;
                    boolean z11 = false;
                    boolean z12 = false;
                    for (long j12 = 0; j12 < j11 / 4; j12++) {
                        try {
                            bVar2.readFully(bArr3);
                            if (j12 != 1) {
                                if (Arrays.equals(bArr3, E)) {
                                    z10 = true;
                                } else if (Arrays.equals(bArr3, F)) {
                                    z11 = true;
                                } else if (Arrays.equals(bArr3, G) || Arrays.equals(bArr3, H)) {
                                    z12 = true;
                                }
                                if (!z10) {
                                    continue;
                                } else {
                                    if (z11) {
                                        bVar2.close();
                                        return 12;
                                    }
                                    if (z12) {
                                        bVar2.close();
                                        return 15;
                                    }
                                }
                            }
                        } catch (EOFException unused) {
                            bVar2.close();
                            return 0;
                        }
                    }
                    bVar2.close();
                } catch (Exception e10) {
                    e = e10;
                    bVar = bVar2;
                    if (f4499w) {
                        Log.d("ExifInterface", "Exception parsing HEIF file type box.", e);
                    }
                    if (bVar != null) {
                        bVar.close();
                    }
                } catch (Throwable th2) {
                    th = th2;
                    bVar = bVar2;
                    if (bVar != null) {
                        bVar.close();
                    }
                    throw th;
                }
            } catch (Exception e11) {
                e = e11;
            }
            return 0;
        } catch (Throwable th3) {
            th = th3;
        }
    }

    public final boolean K(byte[] bArr) throws Throwable {
        b bVar = null;
        try {
            b bVar2 = new b(bArr);
            try {
                ByteOrder byteOrderW = W(bVar2);
                this.f4510h = byteOrderW;
                bVar2.e(byteOrderW);
                short s8 = bVar2.readShort();
                boolean z10 = s8 == 20306 || s8 == 21330;
                bVar2.close();
                return z10;
            } catch (Exception unused) {
                bVar = bVar2;
                if (bVar != null) {
                    bVar.close();
                }
                return false;
            } catch (Throwable th2) {
                th = th2;
                bVar = bVar2;
                if (bVar != null) {
                    bVar.close();
                }
                throw th;
            }
        } catch (Exception unused2) {
        } catch (Throwable th3) {
            th = th3;
        }
    }

    public final boolean L(byte[] bArr) {
        int i10 = 0;
        while (true) {
            byte[] bArr2 = K;
            if (i10 >= bArr2.length) {
                return true;
            }
            if (bArr[i10] != bArr2[i10]) {
                return false;
            }
            i10++;
        }
    }

    public final boolean M(byte[] bArr) {
        byte[] bytes = "FUJIFILMCCD-RAW".getBytes(Charset.defaultCharset());
        for (int i10 = 0; i10 < bytes.length; i10++) {
            if (bArr[i10] != bytes[i10]) {
                return false;
            }
        }
        return true;
    }

    public final boolean N(byte[] bArr) throws Throwable {
        b bVar = null;
        try {
            b bVar2 = new b(bArr);
            try {
                ByteOrder byteOrderW = W(bVar2);
                this.f4510h = byteOrderW;
                bVar2.e(byteOrderW);
                boolean z10 = bVar2.readShort() == 85;
                bVar2.close();
                return z10;
            } catch (Exception unused) {
                bVar = bVar2;
                if (bVar != null) {
                    bVar.close();
                }
                return false;
            } catch (Throwable th2) {
                th = th2;
                bVar = bVar2;
                if (bVar != null) {
                    bVar.close();
                }
                throw th;
            }
        } catch (Exception unused2) {
        } catch (Throwable th3) {
            th = th3;
        }
    }

    public final boolean P(HashMap<String, d> map) {
        d dVar;
        int iM;
        d dVar2 = map.get("BitsPerSample");
        if (dVar2 != null) {
            int[] iArr = (int[]) dVar2.o(this.f4510h);
            int[] iArr2 = f4503z;
            if (Arrays.equals(iArr2, iArr)) {
                return true;
            }
            if (this.f4506d == 3 && (dVar = map.get("PhotometricInterpretation")) != null && (((iM = dVar.m(this.f4510h)) == 1 && Arrays.equals(iArr, B)) || (iM == 6 && Arrays.equals(iArr, iArr2)))) {
                return true;
            }
        }
        if (!f4499w) {
            return false;
        }
        Log.d("ExifInterface", "Unsupported data type value");
        return false;
    }

    public final boolean R(HashMap<String, d> map) {
        d dVar = map.get("ImageLength");
        d dVar2 = map.get("ImageWidth");
        if (dVar == null || dVar2 == null) {
            return false;
        }
        return dVar.m(this.f4510h) <= 512 && dVar2.m(this.f4510h) <= 512;
    }

    public final boolean S(byte[] bArr) {
        int i10 = 0;
        while (true) {
            byte[] bArr2 = M;
            if (i10 >= bArr2.length) {
                int i11 = 0;
                while (true) {
                    byte[] bArr3 = N;
                    if (i11 >= bArr3.length) {
                        return true;
                    }
                    if (bArr[M.length + i11 + 4] != bArr3[i11]) {
                        return false;
                    }
                    i11++;
                }
            } else {
                if (bArr[i10] != bArr2[i10]) {
                    return false;
                }
                i10++;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:57:0x00af A[Catch: all -> 0x0013, TRY_LEAVE, TryCatch #2 {all -> 0x0013, blocks: (B:3:0x0002, B:5:0x0007, B:12:0x001c, B:14:0x0020, B:15:0x002e, B:17:0x0036, B:19:0x003f, B:38:0x0071, B:25:0x0050, B:32:0x005e, B:35:0x0066, B:36:0x006a, B:37:0x006e, B:39:0x007b, B:41:0x0085, B:44:0x008d, B:47:0x0095, B:50:0x009d, B:55:0x00ab, B:57:0x00af), top: B:66:0x0002 }] */
    /* JADX WARN: Code duplicated, block: B:60:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:70:? A[RETURN, SYNTHETIC] */
    public final void T(InputStream inputStream) {
        boolean z10;
        for (int i10 = 0; i10 < f4487k0.length; i10++) {
            try {
                try {
                    this.f4508f[i10] = new HashMap<>();
                } catch (Throwable th2) {
                    e();
                    if (f4499w) {
                        V();
                    }
                    throw th2;
                }
            } catch (IOException e10) {
                e = e10;
                z10 = f4499w;
                if (z10) {
                    Log.w("ExifInterface", "Invalid image: ExifInterface got an unsupported image format file (ExifInterface supports JPEG and some RAW image formats only) or a corrupted JPEG file to ExifInterface.", e);
                }
                e();
                if (z10) {
                    V();
                    return;
                }
                return;
            } catch (UnsupportedOperationException e11) {
                e = e11;
                z10 = f4499w;
                if (z10) {
                    Log.w("ExifInterface", "Invalid image: ExifInterface got an unsupported image format file (ExifInterface supports JPEG and some RAW image formats only) or a corrupted JPEG file to ExifInterface.", e);
                }
                e();
                if (z10) {
                    V();
                    return;
                }
                return;
            }
        }
        if (!this.f4507e) {
            BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream, BacktraceANRSettings.DEFAULT_ANR_TIMEOUT);
            this.f4506d = r(bufferedInputStream);
            inputStream = bufferedInputStream;
        }
        if (l0(this.f4506d)) {
            g gVar = new g(inputStream);
            if (!this.f4507e) {
                int i11 = this.f4506d;
                if (i11 == 12 || i11 == 15) {
                    o(gVar, i11);
                } else if (i11 == 7) {
                    s(gVar);
                } else if (i11 == 10) {
                    x(gVar);
                } else {
                    v(gVar);
                }
            } else if (!y(gVar)) {
                e();
                if (f4499w) {
                    V();
                    return;
                }
                return;
            }
            gVar.g(this.f4518p);
            k0(gVar);
        } else {
            b bVar = new b(inputStream);
            int i12 = this.f4506d;
            if (i12 == 4) {
                p(bVar, 0, 0);
            } else if (i12 == 13) {
                t(bVar);
            } else if (i12 == 9) {
                u(bVar);
            } else if (i12 == 14) {
                B(bVar);
            }
        }
        e();
        if (f4499w) {
            V();
        }
    }

    public final void U(b bVar) throws IOException {
        ByteOrder byteOrderW = W(bVar);
        this.f4510h = byteOrderW;
        bVar.e(byteOrderW);
        int unsignedShort = bVar.readUnsignedShort();
        int i10 = this.f4506d;
        if (i10 != 7 && i10 != 10 && unsignedShort != 42) {
            throw new IOException("Invalid start code: " + Integer.toHexString(unsignedShort));
        }
        int i11 = bVar.readInt();
        if (i11 < 8) {
            throw new IOException("Invalid first Ifd offset: " + i11);
        }
        int i12 = i11 - 8;
        if (i12 > 0) {
            bVar.f(i12);
        }
    }

    public final void V() {
        for (int i10 = 0; i10 < this.f4508f.length; i10++) {
            Log.d("ExifInterface", "The size of tag group[" + i10 + "]: " + this.f4508f[i10].size());
            for (Map.Entry<String, d> entry : this.f4508f[i10].entrySet()) {
                d value = entry.getValue();
                Log.d("ExifInterface", "tagName: " + entry.getKey() + ", tagType: " + value.toString() + ", tagValue: '" + value.n(this.f4510h) + "'");
            }
        }
    }

    public final ByteOrder W(b bVar) throws IOException {
        short s8 = bVar.readShort();
        if (s8 == 18761) {
            if (f4499w) {
                Log.d("ExifInterface", "readExifSegment: Byte Align II");
            }
            return ByteOrder.LITTLE_ENDIAN;
        }
        if (s8 == 19789) {
            if (f4499w) {
                Log.d("ExifInterface", "readExifSegment: Byte Align MM");
            }
            return ByteOrder.BIG_ENDIAN;
        }
        throw new IOException("Invalid byte order: " + Integer.toHexString(s8));
    }

    public final void X(byte[] bArr, int i10) throws IOException {
        g gVar = new g(bArr);
        U(gVar);
        Y(gVar, i10);
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0287  */
    /* JADX WARN: Code duplicated, block: B:102:0x029e  */
    /* JADX WARN: Code duplicated, block: B:105:0x02c2  */
    /* JADX WARN: Code duplicated, block: B:107:0x02f1  */
    /* JADX WARN: Code duplicated, block: B:110:0x02fd  */
    /* JADX WARN: Code duplicated, block: B:112:0x0307  */
    /* JADX WARN: Code duplicated, block: B:121:0x0333  */
    /* JADX WARN: Code duplicated, block: B:148:0x0336 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:46:0x0133  */
    /* JADX WARN: Code duplicated, block: B:47:0x0138  */
    /* JADX WARN: Code duplicated, block: B:49:0x013e  */
    /* JADX WARN: Code duplicated, block: B:51:0x0144  */
    /* JADX WARN: Code duplicated, block: B:54:0x015d  */
    /* JADX WARN: Code duplicated, block: B:56:0x016b  */
    /* JADX WARN: Code duplicated, block: B:58:0x0170  */
    /* JADX WARN: Code duplicated, block: B:60:0x0173  */
    /* JADX WARN: Code duplicated, block: B:63:0x01b6  */
    /* JADX WARN: Code duplicated, block: B:65:0x01c1  */
    /* JADX WARN: Code duplicated, block: B:68:0x01d5  */
    /* JADX WARN: Code duplicated, block: B:71:0x01f6 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:72:0x01f8  */
    /* JADX WARN: Code duplicated, block: B:74:0x01fc A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:75:0x01fe  */
    /* JADX WARN: Code duplicated, block: B:77:0x0202  */
    /* JADX WARN: Code duplicated, block: B:82:0x020f  */
    /* JADX WARN: Code duplicated, block: B:83:0x0214  */
    /* JADX WARN: Code duplicated, block: B:84:0x0219  */
    /* JADX WARN: Code duplicated, block: B:86:0x0220  */
    /* JADX WARN: Code duplicated, block: B:89:0x023a  */
    /* JADX WARN: Code duplicated, block: B:99:0x0285 A[DONT_INVERT] */
    /* JADX WARN: Instruction removed from duplicated block: B:100:0x0287, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:102:0x029e, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:51:0x0144, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:68:0x01d5, please report this as an issue */
    public final void Y(g gVar, int i10) throws IOException {
        int i11;
        e eVar;
        long j10;
        boolean z10;
        boolean z11;
        e eVar2;
        Integer num;
        e eVar3;
        long j11;
        int unsignedShort;
        long jD;
        String str;
        int i12;
        this.f4509g.add(Integer.valueOf(gVar.b()));
        short s8 = gVar.readShort();
        if (f4499w) {
            Log.d("ExifInterface", "numberOfDirectoryEntry: " + ((int) s8));
        }
        if (s8 <= 0) {
            return;
        }
        short s10 = 0;
        while (s10 < s8) {
            int unsignedShort2 = gVar.readUnsignedShort();
            int unsignedShort3 = gVar.readUnsignedShort();
            int i13 = gVar.readInt();
            long jB = ((long) gVar.b()) + 4;
            e eVar4 = f4489m0[i10].get(Integer.valueOf(unsignedShort2));
            boolean z12 = f4499w;
            if (z12) {
                i11 = 4;
                Log.d("ExifInterface", String.format("ifdType: %d, tagNumber: %d, tagName: %s, dataFormat: %d, numberOfComponents: %d", Integer.valueOf(i10), Integer.valueOf(unsignedShort2), eVar4 != null ? eVar4.b : null, Integer.valueOf(unsignedShort3), Integer.valueOf(i13)));
            } else {
                i11 = 4;
            }
            if (eVar4 != null) {
                if (unsignedShort3 > 0) {
                    int[] iArr = Y;
                    if (unsignedShort3 < iArr.length) {
                        if (eVar4.a(unsignedShort3)) {
                            if (unsignedShort3 == 7) {
                                unsignedShort3 = eVar4.f4536c;
                            }
                            eVar = eVar4;
                            j10 = ((long) i13) * ((long) iArr[unsignedShort3]);
                            if (j10 < 0 || j10 > 2147483647L) {
                                if (z12) {
                                    Log.d("ExifInterface", "Skip the tag entry since the number of components is invalid: " + i13);
                                }
                                z10 = false;
                            } else {
                                z10 = true;
                            }
                        } else if (z12) {
                            Log.d("ExifInterface", "Skip the tag entry since data format (" + X[unsignedShort3] + ") is unexpected for tag: " + eVar4.b);
                        }
                    }
                    if (z10) {
                        if (j10 > 4) {
                            i12 = gVar.readInt();
                            if (z12) {
                                Log.d("ExifInterface", "seek to data offset: " + i12);
                            }
                            if (this.f4506d == 7) {
                                z11 = z12;
                                eVar2 = eVar;
                                if ("MakerNote".equals(eVar2.b)) {
                                    this.f4519q = i12;
                                } else if (i10 != 6 && "ThumbnailImage".equals(eVar2.b)) {
                                    this.f4520r = i12;
                                    this.f4521s = i13;
                                    d dVarJ = d.j(6, this.f4510h);
                                    d dVarF = d.f(this.f4520r, this.f4510h);
                                    d dVarF2 = d.f(this.f4521s, this.f4510h);
                                    this.f4508f[i11].put("Compression", dVarJ);
                                    this.f4508f[i11].put("JPEGInterchangeFormat", dVarF);
                                    this.f4508f[i11].put("JPEGInterchangeFormatLength", dVarF2);
                                }
                            } else {
                                z11 = z12;
                                eVar2 = eVar;
                            }
                            gVar.g(i12);
                        } else {
                            z11 = z12;
                            jB = jB;
                            eVar2 = eVar;
                        }
                        num = f4492p0.get(Integer.valueOf(unsignedShort2));
                        if (z11) {
                            Log.d("ExifInterface", "nextIfdType: " + num + " byteCount: " + j10);
                        }
                        if (num != null) {
                            if (unsignedShort3 != 3) {
                                if (unsignedShort3 == i11) {
                                    jD = gVar.d();
                                } else if (unsignedShort3 == 8) {
                                    unsignedShort = gVar.readShort();
                                } else if (unsignedShort3 != 9 || unsignedShort3 == 13) {
                                    unsignedShort = gVar.readInt();
                                } else {
                                    jD = -1;
                                }
                                if (z11) {
                                    Log.d("ExifInterface", String.format("Offset: %d, tagName: %s", Long.valueOf(jD), eVar2.b));
                                }
                                if (jD > 0 || (gVar.a() != -1 && jD >= gVar.a())) {
                                    if (z11) {
                                        str = "Skip jump into the IFD since its offset is invalid: " + jD;
                                        if (gVar.a() != -1) {
                                            str = str + " (total length: " + gVar.a() + ")";
                                        }
                                        Log.d("ExifInterface", str);
                                    }
                                } else if (!this.f4509g.contains(Integer.valueOf((int) jD))) {
                                    gVar.g(jD);
                                    Y(gVar, num.intValue());
                                } else if (z11) {
                                    Log.d("ExifInterface", "Skip jump into the IFD since it has already been read: IfdType " + num + " (at " + jD + ")");
                                }
                                gVar.g(jB);
                            } else {
                                unsignedShort = gVar.readUnsignedShort();
                            }
                            jD = unsignedShort;
                            if (z11) {
                                Log.d("ExifInterface", String.format("Offset: %d, tagName: %s", Long.valueOf(jD), eVar2.b));
                            }
                            if (jD > 0) {
                                if (z11) {
                                    str = "Skip jump into the IFD since its offset is invalid: " + jD;
                                    if (gVar.a() != -1) {
                                        str = str + " (total length: " + gVar.a() + ")";
                                    }
                                    Log.d("ExifInterface", str);
                                }
                            } else if (z11) {
                                str = "Skip jump into the IFD since its offset is invalid: " + jD;
                                if (gVar.a() != -1) {
                                    str = str + " (total length: " + gVar.a() + ")";
                                }
                                Log.d("ExifInterface", str);
                            }
                            gVar.g(jB);
                        } else {
                            int iB = gVar.b() + this.f4518p;
                            byte[] bArr = new byte[(int) j10];
                            gVar.readFully(bArr);
                            long j12 = iB;
                            eVar3 = eVar2;
                            j11 = jB;
                            d dVar = new d(unsignedShort3, i13, j12, bArr);
                            this.f4508f[i10].put(eVar3.b, dVar);
                            if ("DNGVersion".equals(eVar3.b)) {
                                this.f4506d = 3;
                            }
                            if (((!"Make".equals(eVar3.b) || "Model".equals(eVar3.b)) && dVar.n(this.f4510h).contains("PENTAX")) || ("Compression".equals(eVar3.b) && dVar.m(this.f4510h) == 65535)) {
                                this.f4506d = 8;
                            }
                            if (gVar.b() != j11) {
                                gVar.g(j11);
                            }
                        }
                    } else {
                        gVar.g(jB);
                    }
                    s10 = (short) (s10 + 1);
                    s8 = s8;
                }
                eVar = eVar4;
                if (z12) {
                    Log.d("ExifInterface", "Skip the tag entry since data format is invalid: " + unsignedShort3);
                }
                j10 = 0;
                z10 = false;
                if (z10) {
                    gVar.g(jB);
                } else {
                    if (j10 > 4) {
                        i12 = gVar.readInt();
                        if (z12) {
                            Log.d("ExifInterface", "seek to data offset: " + i12);
                        }
                        if (this.f4506d == 7) {
                            z11 = z12;
                            eVar2 = eVar;
                            if ("MakerNote".equals(eVar2.b)) {
                                this.f4519q = i12;
                            } else if (i10 != 6) {
                            }
                        } else {
                            z11 = z12;
                            eVar2 = eVar;
                        }
                        gVar.g(i12);
                    } else {
                        z11 = z12;
                        jB = jB;
                        eVar2 = eVar;
                    }
                    num = f4492p0.get(Integer.valueOf(unsignedShort2));
                    if (z11) {
                        Log.d("ExifInterface", "nextIfdType: " + num + " byteCount: " + j10);
                    }
                    if (num != null) {
                        if (unsignedShort3 != 3) {
                            if (unsignedShort3 == i11) {
                                jD = gVar.d();
                            } else if (unsignedShort3 == 8) {
                                if (unsignedShort3 != 9) {
                                }
                                unsignedShort = gVar.readInt();
                            } else {
                                unsignedShort = gVar.readShort();
                            }
                            if (z11) {
                                Log.d("ExifInterface", String.format("Offset: %d, tagName: %s", Long.valueOf(jD), eVar2.b));
                            }
                            if (jD > 0) {
                                if (z11) {
                                    str = "Skip jump into the IFD since its offset is invalid: " + jD;
                                    if (gVar.a() != -1) {
                                        str = str + " (total length: " + gVar.a() + ")";
                                    }
                                    Log.d("ExifInterface", str);
                                }
                            } else if (z11) {
                                str = "Skip jump into the IFD since its offset is invalid: " + jD;
                                if (gVar.a() != -1) {
                                    str = str + " (total length: " + gVar.a() + ")";
                                }
                                Log.d("ExifInterface", str);
                            }
                            gVar.g(jB);
                        } else {
                            unsignedShort = gVar.readUnsignedShort();
                        }
                        jD = unsignedShort;
                        if (z11) {
                            Log.d("ExifInterface", String.format("Offset: %d, tagName: %s", Long.valueOf(jD), eVar2.b));
                        }
                        if (jD > 0) {
                            if (z11) {
                                str = "Skip jump into the IFD since its offset is invalid: " + jD;
                                if (gVar.a() != -1) {
                                    str = str + " (total length: " + gVar.a() + ")";
                                }
                                Log.d("ExifInterface", str);
                            }
                        } else if (z11) {
                            str = "Skip jump into the IFD since its offset is invalid: " + jD;
                            if (gVar.a() != -1) {
                                str = str + " (total length: " + gVar.a() + ")";
                            }
                            Log.d("ExifInterface", str);
                        }
                        gVar.g(jB);
                    } else {
                        int iB2 = gVar.b() + this.f4518p;
                        byte[] bArr2 = new byte[(int) j10];
                        gVar.readFully(bArr2);
                        long j13 = iB2;
                        eVar3 = eVar2;
                        j11 = jB;
                        d dVar2 = new d(unsignedShort3, i13, j13, bArr2);
                        this.f4508f[i10].put(eVar3.b, dVar2);
                        if ("DNGVersion".equals(eVar3.b)) {
                            this.f4506d = 3;
                        }
                        if (!"Make".equals(eVar3.b)) {
                        }
                        this.f4506d = 8;
                        if (gVar.b() != j11) {
                            gVar.g(j11);
                        }
                    }
                }
                s10 = (short) (s10 + 1);
                s8 = s8;
            } else if (z12) {
                Log.d("ExifInterface", "Skip the tag entry since tag number is not defined: " + unsignedShort2);
            }
            eVar = eVar4;
            j10 = 0;
            z10 = false;
            if (z10) {
                gVar.g(jB);
            } else {
                if (j10 > 4) {
                    i12 = gVar.readInt();
                    if (z12) {
                        Log.d("ExifInterface", "seek to data offset: " + i12);
                    }
                    if (this.f4506d == 7) {
                        z11 = z12;
                        eVar2 = eVar;
                        if ("MakerNote".equals(eVar2.b)) {
                            this.f4519q = i12;
                        } else if (i10 != 6) {
                        }
                    } else {
                        z11 = z12;
                        eVar2 = eVar;
                    }
                    gVar.g(i12);
                } else {
                    z11 = z12;
                    jB = jB;
                    eVar2 = eVar;
                }
                num = f4492p0.get(Integer.valueOf(unsignedShort2));
                if (z11) {
                    Log.d("ExifInterface", "nextIfdType: " + num + " byteCount: " + j10);
                }
                if (num != null) {
                    if (unsignedShort3 != 3) {
                        if (unsignedShort3 == i11) {
                            jD = gVar.d();
                        } else if (unsignedShort3 == 8) {
                            if (unsignedShort3 != 9) {
                            }
                            unsignedShort = gVar.readInt();
                        } else {
                            unsignedShort = gVar.readShort();
                        }
                        if (z11) {
                            Log.d("ExifInterface", String.format("Offset: %d, tagName: %s", Long.valueOf(jD), eVar2.b));
                        }
                        if (jD > 0) {
                            if (z11) {
                                str = "Skip jump into the IFD since its offset is invalid: " + jD;
                                if (gVar.a() != -1) {
                                    str = str + " (total length: " + gVar.a() + ")";
                                }
                                Log.d("ExifInterface", str);
                            }
                        } else if (z11) {
                            str = "Skip jump into the IFD since its offset is invalid: " + jD;
                            if (gVar.a() != -1) {
                                str = str + " (total length: " + gVar.a() + ")";
                            }
                            Log.d("ExifInterface", str);
                        }
                        gVar.g(jB);
                    } else {
                        unsignedShort = gVar.readUnsignedShort();
                    }
                    jD = unsignedShort;
                    if (z11) {
                        Log.d("ExifInterface", String.format("Offset: %d, tagName: %s", Long.valueOf(jD), eVar2.b));
                    }
                    if (jD > 0) {
                        if (z11) {
                            str = "Skip jump into the IFD since its offset is invalid: " + jD;
                            if (gVar.a() != -1) {
                                str = str + " (total length: " + gVar.a() + ")";
                            }
                            Log.d("ExifInterface", str);
                        }
                    } else if (z11) {
                        str = "Skip jump into the IFD since its offset is invalid: " + jD;
                        if (gVar.a() != -1) {
                            str = str + " (total length: " + gVar.a() + ")";
                        }
                        Log.d("ExifInterface", str);
                    }
                    gVar.g(jB);
                } else {
                    int iB3 = gVar.b() + this.f4518p;
                    byte[] bArr3 = new byte[(int) j10];
                    gVar.readFully(bArr3);
                    long j14 = iB3;
                    eVar3 = eVar2;
                    j11 = jB;
                    d dVar3 = new d(unsignedShort3, i13, j14, bArr3);
                    this.f4508f[i10].put(eVar3.b, dVar3);
                    if ("DNGVersion".equals(eVar3.b)) {
                        this.f4506d = 3;
                    }
                    if (!"Make".equals(eVar3.b)) {
                    }
                    this.f4506d = 8;
                    if (gVar.b() != j11) {
                        gVar.g(j11);
                    }
                }
            }
            s10 = (short) (s10 + 1);
            s8 = s8;
        }
        int i14 = gVar.readInt();
        boolean z13 = f4499w;
        if (z13) {
            Log.d("ExifInterface", String.format("nextIfdOffset: %d", Integer.valueOf(i14)));
        }
        long j15 = i14;
        if (j15 <= 0) {
            if (z13) {
                Log.d("ExifInterface", "Stop reading file since a wrong offset may cause an infinite loop: " + i14);
                return;
            }
            return;
        }
        if (this.f4509g.contains(Integer.valueOf(i14))) {
            if (z13) {
                Log.d("ExifInterface", "Stop reading file since re-reading an IFD may cause an infinite loop: " + i14);
                return;
            }
            return;
        }
        gVar.g(j15);
        if (this.f4508f[4].isEmpty()) {
            Y(gVar, 4);
        } else if (this.f4508f[5].isEmpty()) {
            Y(gVar, 5);
        }
    }

    public final void Z(String str) {
        for (int i10 = 0; i10 < f4487k0.length; i10++) {
            this.f4508f[i10].remove(str);
        }
    }

    public final void a0(int i10, String str, String str2) {
        if (this.f4508f[i10].isEmpty() || this.f4508f[i10].get(str) == null) {
            return;
        }
        HashMap<String, d> map = this.f4508f[i10];
        map.put(str2, map.get(str));
        this.f4508f[i10].remove(str);
    }

    public final void b0(g gVar, int i10) throws Throwable {
        d dVar = this.f4508f[i10].get("ImageLength");
        d dVar2 = this.f4508f[i10].get("ImageWidth");
        if (dVar == null || dVar2 == null) {
            d dVar3 = this.f4508f[i10].get("JPEGInterchangeFormat");
            d dVar4 = this.f4508f[i10].get("JPEGInterchangeFormatLength");
            if (dVar3 == null || dVar4 == null) {
                return;
            }
            int iM = dVar3.m(this.f4510h);
            int iM2 = dVar3.m(this.f4510h);
            gVar.g(iM);
            byte[] bArr = new byte[iM2];
            gVar.readFully(bArr);
            p(new b(bArr), iM, i10);
        }
    }

    /* JADX WARN: Code duplicated, block: B:70:0x00f1 A[Catch: all -> 0x00fa, Exception -> 0x00fd, TryCatch #17 {Exception -> 0x00fd, all -> 0x00fa, blocks: (B:68:0x00ed, B:70:0x00f1, B:77:0x010e, B:76:0x00ff), top: B:125:0x00ed }] */
    /* JADX WARN: Code duplicated, block: B:76:0x00ff A[Catch: all -> 0x00fa, Exception -> 0x00fd, TryCatch #17 {Exception -> 0x00fd, all -> 0x00fa, blocks: (B:68:0x00ed, B:70:0x00f1, B:77:0x010e, B:76:0x00ff), top: B:125:0x00ed }] */
    /* JADX WARN: Code duplicated, block: B:92:0x0152  */
    public void c0() throws Throwable {
        FileOutputStream fileOutputStream;
        FileInputStream fileInputStream;
        FileOutputStream fileOutputStream2;
        Exception exc;
        FileOutputStream fileOutputStream3;
        InputStream fileInputStream2;
        Exception e10;
        FileOutputStream fileOutputStream4;
        if (!Q(this.f4506d)) {
            throw new IOException("ExifInterface only supports saving attributes for JPEG, PNG, and WebP formats.");
        }
        if (this.b == null && this.f4504a == null) {
            throw new IOException("ExifInterface does not support saving attributes for the current input.");
        }
        if (this.f4511i && this.f4512j && !this.f4513k) {
            throw new IOException("ExifInterface does not support saving attributes when the image file has non-consecutive thumbnail strips");
        }
        this.f4522t = true;
        this.f4516n = z();
        InputStream inputStream = null;
        try {
            File fileCreateTempFile = File.createTempFile("temp", "tmp");
            if (this.f4504a != null) {
                fileInputStream = new FileInputStream(this.f4504a);
            } else {
                Os.lseek(this.b, 0L, OsConstants.SEEK_SET);
                fileInputStream = new FileInputStream(this.b);
            }
            try {
                fileOutputStream = new FileOutputStream(fileCreateTempFile);
                try {
                    c4.b.d(fileInputStream, fileOutputStream);
                    c4.b.b(fileInputStream);
                    c4.b.b(fileOutputStream);
                    try {
                        try {
                            try {
                                FileInputStream fileInputStream3 = new FileInputStream(fileCreateTempFile);
                                try {
                                    if (this.f4504a != null) {
                                        fileOutputStream3 = new FileOutputStream(this.f4504a);
                                    } else {
                                        Os.lseek(this.b, 0L, OsConstants.SEEK_SET);
                                        fileOutputStream3 = new FileOutputStream(this.b);
                                    }
                                    try {
                                        BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream3);
                                        try {
                                            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream3);
                                            try {
                                                int i10 = this.f4506d;
                                                if (i10 == 4) {
                                                    d0(bufferedInputStream, bufferedOutputStream);
                                                } else if (i10 == 13) {
                                                    e0(bufferedInputStream, bufferedOutputStream);
                                                } else if (i10 == 14) {
                                                    f0(bufferedInputStream, bufferedOutputStream);
                                                }
                                                c4.b.b(bufferedInputStream);
                                                c4.b.b(bufferedOutputStream);
                                                fileCreateTempFile.delete();
                                                this.f4516n = null;
                                            } catch (Exception e11) {
                                                exc = e11;
                                                inputStream = fileInputStream3;
                                                try {
                                                    fileInputStream2 = new FileInputStream(fileCreateTempFile);
                                                    try {
                                                        if (this.f4504a != null) {
                                                            fileOutputStream4 = new FileOutputStream(this.f4504a);
                                                        } else {
                                                            Os.lseek(this.b, 0L, OsConstants.SEEK_SET);
                                                            fileOutputStream4 = new FileOutputStream(this.b);
                                                        }
                                                        fileOutputStream3 = fileOutputStream4;
                                                        c4.b.d(fileInputStream2, fileOutputStream3);
                                                        c4.b.b(fileInputStream2);
                                                        c4.b.b(fileOutputStream3);
                                                        throw new IOException("Failed to save new file", exc);
                                                    } catch (Exception e12) {
                                                        e10 = e12;
                                                        try {
                                                            throw new IOException("Failed to save new file. Original file is stored in " + fileCreateTempFile.getAbsolutePath(), e10);
                                                        } catch (Throwable th2) {
                                                            th = th2;
                                                            inputStream = fileInputStream2;
                                                            c4.b.b(inputStream);
                                                            c4.b.b(fileOutputStream3);
                                                            throw th;
                                                        }
                                                    } catch (Throwable th3) {
                                                        th = th3;
                                                        inputStream = fileInputStream2;
                                                        c4.b.b(inputStream);
                                                        c4.b.b(fileOutputStream3);
                                                        throw th;
                                                    }
                                                } catch (Exception e13) {
                                                    fileInputStream2 = inputStream;
                                                    e10 = e13;
                                                } catch (Throwable th4) {
                                                    th = th4;
                                                    c4.b.b(inputStream);
                                                    c4.b.b(fileOutputStream3);
                                                    throw th;
                                                }
                                            }
                                        } catch (Exception e14) {
                                            inputStream = fileInputStream3;
                                            exc = e14;
                                        } catch (Throwable th5) {
                                            th = th5;
                                            inputStream = bufferedInputStream;
                                            c4.b.b(inputStream);
                                            c4.b.b(0);
                                            if (0 == 0) {
                                                fileCreateTempFile.delete();
                                            }
                                            throw th;
                                        }
                                    } catch (Exception e15) {
                                        inputStream = fileInputStream3;
                                        exc = e15;
                                    }
                                } catch (Exception e16) {
                                    e = e16;
                                    fileOutputStream2 = null;
                                    inputStream = fileInputStream3;
                                    exc = e;
                                    fileOutputStream3 = fileOutputStream2;
                                    fileInputStream2 = new FileInputStream(fileCreateTempFile);
                                    if (this.f4504a != null) {
                                        fileOutputStream4 = new FileOutputStream(this.f4504a);
                                    } else {
                                        Os.lseek(this.b, 0L, OsConstants.SEEK_SET);
                                        fileOutputStream4 = new FileOutputStream(this.b);
                                    }
                                    fileOutputStream3 = fileOutputStream4;
                                    c4.b.d(fileInputStream2, fileOutputStream3);
                                    c4.b.b(fileInputStream2);
                                    c4.b.b(fileOutputStream3);
                                    throw new IOException("Failed to save new file", exc);
                                }
                            } catch (Throwable th6) {
                                th = th6;
                                c4.b.b(inputStream);
                                c4.b.b(0);
                                if (0 == 0) {
                                    fileCreateTempFile.delete();
                                }
                                throw th;
                            }
                        } catch (Exception e17) {
                            e = e17;
                            fileOutputStream2 = null;
                        }
                    } catch (Throwable th7) {
                        th = th7;
                    }
                } catch (Exception e18) {
                    e = e18;
                    inputStream = fileInputStream;
                    try {
                        throw new IOException("Failed to copy original file to temp file", e);
                    } catch (Throwable th8) {
                        th = th8;
                        c4.b.b(inputStream);
                        c4.b.b(fileOutputStream);
                        throw th;
                    }
                } catch (Throwable th9) {
                    th = th9;
                    inputStream = fileInputStream;
                    c4.b.b(inputStream);
                    c4.b.b(fileOutputStream);
                    throw th;
                }
            } catch (Exception e19) {
                e = e19;
                fileOutputStream = null;
            } catch (Throwable th10) {
                th = th10;
                fileOutputStream = null;
            }
        } catch (Exception e20) {
            e = e20;
            fileOutputStream = null;
        } catch (Throwable th11) {
            th = th11;
            fileOutputStream = null;
        }
    }

    public final void d0(InputStream inputStream, OutputStream outputStream) throws IOException {
        byte[] bArr;
        if (f4499w) {
            Log.d("ExifInterface", "saveJpegAttributes starting with (inputStream: " + inputStream + ", outputStream: " + outputStream + ")");
        }
        b bVar = new b(inputStream);
        c cVar = new c(outputStream, ByteOrder.BIG_ENDIAN);
        if (bVar.readByte() != -1) {
            throw new IOException("Invalid marker");
        }
        cVar.b(-1);
        if (bVar.readByte() != -40) {
            throw new IOException("Invalid marker");
        }
        cVar.b(-40);
        cVar.b(-1);
        cVar.b(-31);
        this.f4518p = q0(cVar);
        if (this.f4523u != null) {
            cVar.write(-1);
            cVar.b(-31);
            byte[] bArr2 = f4495s0;
            cVar.f(bArr2.length + 2 + this.f4523u.f4534d.length);
            cVar.write(bArr2);
            cVar.write(this.f4523u.f4534d);
            this.f4524v = true;
        }
        byte[] bArr3 = new byte[Barcode.FORMAT_AZTEC];
        while (bVar.readByte() == -1) {
            byte b10 = bVar.readByte();
            if (b10 == -39 || b10 == -38) {
                cVar.b(-1);
                cVar.b(b10);
                c4.b.d(bVar, cVar);
                return;
            }
            if (b10 != -31) {
                cVar.b(-1);
                cVar.b(b10);
                int unsignedShort = bVar.readUnsignedShort();
                cVar.f(unsignedShort);
                int i10 = unsignedShort - 2;
                if (i10 < 0) {
                    throw new IOException("Invalid length");
                }
                while (i10 > 0) {
                    int i11 = bVar.read(bArr3, 0, Math.min(i10, Barcode.FORMAT_AZTEC));
                    if (i11 < 0) {
                        break;
                    }
                    cVar.write(bArr3, 0, i11);
                    i10 -= i11;
                }
            } else {
                int unsignedShort2 = bVar.readUnsignedShort();
                int length = unsignedShort2 - 2;
                if (length < 0) {
                    throw new IOException("Invalid length");
                }
                byte[] bArr4 = f4495s0;
                if (length >= bArr4.length) {
                    bArr = new byte[bArr4.length];
                } else {
                    byte[] bArr5 = f4494r0;
                    bArr = length >= bArr5.length ? new byte[bArr5.length] : null;
                }
                if (bArr != null) {
                    bVar.readFully(bArr);
                    if (c4.b.f(bArr, f4494r0) || c4.b.f(bArr, bArr4)) {
                        bVar.f(length - bArr.length);
                    }
                }
                cVar.b(-1);
                cVar.b(b10);
                cVar.f(unsignedShort2);
                if (bArr != null) {
                    length -= bArr.length;
                    cVar.write(bArr);
                }
                while (length > 0) {
                    int i12 = bVar.read(bArr3, 0, Math.min(length, Barcode.FORMAT_AZTEC));
                    if (i12 < 0) {
                        break;
                    }
                    cVar.write(bArr3, 0, i12);
                    length -= i12;
                }
            }
        }
        throw new IOException("Invalid marker");
    }

    public final void e() {
        String strK = k("DateTimeOriginal");
        if (strK != null && k("DateTime") == null) {
            this.f4508f[0].put("DateTime", d.e(strK));
        }
        if (k("ImageWidth") == null) {
            this.f4508f[0].put("ImageWidth", d.f(0L, this.f4510h));
        }
        if (k("ImageLength") == null) {
            this.f4508f[0].put("ImageLength", d.f(0L, this.f4510h));
        }
        if (k("Orientation") == null) {
            this.f4508f[0].put("Orientation", d.f(0L, this.f4510h));
        }
        if (k("LightSource") == null) {
            this.f4508f[1].put("LightSource", d.f(0L, this.f4510h));
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0046 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:19:0x0069  */
    /* JADX WARN: Code duplicated, block: B:28:0x007f A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:32:0x0090  */
    /* JADX WARN: Code duplicated, block: B:38:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:40:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:42:0x007a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:43:0x0071 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:46:0x005a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:47:0x008b A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:49:0x00bd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:50:0x00a5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:52:0x00bd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:53:0x0095 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:58:0x0044 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x0078 -> B:10:0x0044). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0044
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final void e0(java.io.InputStream r9, java.io.OutputStream r10) {
        /*
            Method dump skipped, instruction units count: 202
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: c4.a.e0(java.io.InputStream, java.io.OutputStream):void");
    }

    public final String f(double d10) {
        long j10 = (long) d10;
        double d11 = d10 - j10;
        long j11 = (long) (d11 * 60.0d);
        return j10 + "/1," + j11 + "/1," + Math.round((d11 - (j11 / 60.0d)) * 3600.0d * 1.0E7d) + "/10000000";
    }

    /* JADX WARN: Code duplicated, block: B:82:0x0213 A[Catch: all -> 0x007e, Exception -> 0x0082, TryCatch #5 {Exception -> 0x0082, all -> 0x007e, blocks: (B:7:0x004f, B:9:0x005b, B:11:0x006f, B:12:0x0071, B:80:0x01f7, B:82:0x0213, B:83:0x021c, B:19:0x0086, B:21:0x0095, B:23:0x009d, B:25:0x00a1, B:28:0x00b1, B:30:0x00bc, B:31:0x00c1, B:32:0x00c3, B:36:0x00d1, B:37:0x00d6, B:38:0x00da, B:39:0x00e6, B:41:0x00ee, B:45:0x00fc, B:47:0x0104, B:50:0x010b, B:52:0x011a, B:54:0x012a, B:69:0x0186, B:71:0x0192, B:72:0x0199, B:74:0x01d3, B:79:0x01f0, B:76:0x01e1, B:78:0x01e9, B:55:0x013e, B:56:0x0145, B:57:0x0146, B:59:0x0150, B:61:0x0156, B:65:0x016f, B:66:0x0177, B:67:0x017e), top: B:97:0x004f }] */
    public final void f0(InputStream inputStream, OutputStream outputStream) throws Throwable {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int iQ0;
        boolean z10;
        if (f4499w) {
            Log.d("ExifInterface", "saveWebpAttributes starting with (inputStream: " + inputStream + ", outputStream: " + outputStream + ")");
        }
        ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
        b bVar = new b(inputStream, byteOrder);
        c cVar = new c(outputStream, byteOrder);
        byte[] bArr = M;
        c4.b.e(bVar, cVar, bArr.length);
        int i15 = bVar.readInt();
        byte[] bArr2 = N;
        bVar.f(bArr2.length);
        ByteArrayOutputStream byteArrayOutputStream = null;
        try {
            try {
                ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                try {
                    c cVar2 = new c(byteArrayOutputStream2, byteOrder);
                    int i16 = this.f4518p;
                    if (i16 == 0) {
                        byte[] bArr3 = new byte[4];
                        bVar.readFully(bArr3);
                        byte[] bArr4 = Q;
                        boolean z11 = true;
                        if (Arrays.equals(bArr3, bArr4)) {
                            int i17 = bVar.readInt();
                            byte[] bArr5 = new byte[i17 % 2 == 1 ? i17 + 1 : i17];
                            bVar.readFully(bArr5);
                            byte b10 = (byte) (bArr5[0] | 8);
                            bArr5[0] = b10;
                            boolean z12 = ((b10 >> 1) & 1) == 1;
                            cVar2.write(bArr4);
                            cVar2.c(i17);
                            cVar2.write(bArr5);
                            if (z12) {
                                h(bVar, cVar2, T, null);
                                while (true) {
                                    byte[] bArr6 = new byte[4];
                                    try {
                                        bVar.readFully(bArr6);
                                        z10 = !Arrays.equals(bArr6, U);
                                    } catch (EOFException unused) {
                                        z10 = true;
                                    }
                                    if (z10) {
                                        break;
                                    } else {
                                        i(bVar, cVar2, bArr6);
                                    }
                                }
                                iQ0 = q0(cVar2);
                            } else {
                                h(bVar, cVar2, S, R);
                                iQ0 = q0(cVar2);
                            }
                        } else {
                            byte[] bArr7 = S;
                            if (Arrays.equals(bArr3, bArr7) || Arrays.equals(bArr3, R)) {
                                int i18 = bVar.readInt();
                                int i19 = i18 % 2 == 1 ? i18 + 1 : i18;
                                byte[] bArr8 = new byte[3];
                                if (Arrays.equals(bArr3, bArr7)) {
                                    bVar.readFully(bArr8);
                                    byte[] bArr9 = new byte[3];
                                    bVar.readFully(bArr9);
                                    if (!Arrays.equals(P, bArr9)) {
                                        throw new IOException("Error checking VP8 signature");
                                    }
                                    i13 = bVar.readInt();
                                    i10 = -1;
                                    i12 = (i13 >> 16) & 16383;
                                    i11 = i19 - 10;
                                    i14 = i13 & 16383;
                                    z11 = false;
                                } else {
                                    i10 = -1;
                                    if (!Arrays.equals(bArr3, R)) {
                                        i11 = i19;
                                        i12 = 0;
                                        i13 = 0;
                                        z11 = false;
                                        i14 = 0;
                                    } else {
                                        if (bVar.readByte() != 47) {
                                            throw new IOException("Error checking VP8L signature");
                                        }
                                        i13 = bVar.readInt();
                                        int i20 = (i13 & 16383) + 1;
                                        int i21 = ((i13 & 268419072) >>> 14) + 1;
                                        if ((i13 & 268435456) == 0) {
                                            z11 = false;
                                        }
                                        i11 = i19 - 5;
                                        i14 = i20;
                                        i12 = i21;
                                    }
                                }
                                cVar2.write(bArr4);
                                cVar2.c(10);
                                byte[] bArr10 = new byte[10];
                                if (z11) {
                                    bArr10[0] = (byte) (bArr10[0] | 16);
                                }
                                bArr10[0] = (byte) (bArr10[0] | 8);
                                int i22 = i14 - 1;
                                int i23 = i12 - 1;
                                bArr10[4] = (byte) i22;
                                bArr10[5] = (byte) (i22 >> 8);
                                bArr10[6] = (byte) (i22 >> 16);
                                bArr10[7] = (byte) i23;
                                bArr10[8] = (byte) (i23 >> 8);
                                bArr10[9] = (byte) (i23 >> 16);
                                cVar2.write(bArr10);
                                cVar2.write(bArr3);
                                cVar2.c(i18);
                                if (Arrays.equals(bArr3, bArr7)) {
                                    cVar2.write(bArr8);
                                    cVar2.write(P);
                                    cVar2.c(i13);
                                } else if (Arrays.equals(bArr3, R)) {
                                    cVar2.write(47);
                                    cVar2.c(i13);
                                }
                                c4.b.e(bVar, cVar2, i11);
                                iQ0 = q0(cVar2);
                            } else {
                                iQ0 = -1;
                                i10 = -1;
                            }
                        }
                        c4.b.e(bVar, cVar2, (i15 + 8) - bVar.b());
                        int size = byteArrayOutputStream2.size();
                        byte[] bArr11 = N;
                        cVar.c(size + bArr11.length);
                        cVar.write(bArr11);
                        if (iQ0 != i10) {
                            this.f4518p = cVar.f4531a.size() + iQ0;
                        }
                        byteArrayOutputStream2.writeTo(cVar);
                        c4.b.d(bVar, cVar);
                        c4.b.b(byteArrayOutputStream2);
                    }
                    c4.b.e(bVar, cVar2, (i16 - ((bArr.length + 4) + bArr2.length)) - 8);
                    bVar.f(4);
                    int i24 = bVar.readInt();
                    if (i24 % 2 != 0) {
                        i24++;
                    }
                    bVar.f(i24);
                    iQ0 = q0(cVar2);
                    i10 = -1;
                    c4.b.e(bVar, cVar2, (i15 + 8) - bVar.b());
                    int size2 = byteArrayOutputStream2.size();
                    byte[] bArr12 = N;
                    cVar.c(size2 + bArr12.length);
                    cVar.write(bArr12);
                    if (iQ0 != i10) {
                        this.f4518p = cVar.f4531a.size() + iQ0;
                    }
                    byteArrayOutputStream2.writeTo(cVar);
                    c4.b.d(bVar, cVar);
                    c4.b.b(byteArrayOutputStream2);
                } catch (Exception e10) {
                    e = e10;
                    throw new IOException("Failed to save WebP file", e);
                } catch (Throwable th2) {
                    th = th2;
                    byteArrayOutputStream = byteArrayOutputStream2;
                    c4.b.b(byteArrayOutputStream);
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (Exception e11) {
            e = e11;
        }
    }

    public void g0(double d10) {
        String str = d10 >= 0.0d ? "0" : "1";
        h0("GPSAltitude", f.b(Math.abs(d10)).toString());
        h0("GPSAltitudeRef", str);
    }

    public final void h(b bVar, c cVar, byte[] bArr, byte[] bArr2) throws IOException {
        while (true) {
            byte[] bArr3 = new byte[4];
            bVar.readFully(bArr3);
            i(bVar, cVar, bArr3);
            if (Arrays.equals(bArr3, bArr)) {
                return;
            }
            if (bArr2 != null && Arrays.equals(bArr3, bArr2)) {
                return;
            }
        }
    }

    public void h0(String str, String str2) {
        e eVar;
        int i10;
        String str3;
        int i11;
        int i12;
        String str4 = str;
        String strReplaceAll = str2;
        if (str4 == null) {
            throw new NullPointerException("tag shouldn't be null");
        }
        if ("ISOSpeedRatings".equals(str4)) {
            if (f4499w) {
                Log.d("ExifInterface", "setAttribute: Replacing TAG_ISO_SPEED_RATINGS with TAG_PHOTOGRAPHIC_SENSITIVITY.");
            }
            str4 = "PhotographicSensitivity";
        }
        int i13 = 2;
        String str5 = "/";
        int i14 = 1;
        if (strReplaceAll != null) {
            if (f4491o0.contains(str4) && !strReplaceAll.contains("/")) {
                try {
                    strReplaceAll = f.b(Double.parseDouble(strReplaceAll)).toString();
                } catch (NumberFormatException unused) {
                    Log.w("ExifInterface", "Invalid value for " + str4 + " : " + strReplaceAll);
                    return;
                }
            } else if (str4.equals("GPSTimeStamp")) {
                Matcher matcher = f4497u0.matcher(strReplaceAll);
                if (!matcher.find()) {
                    Log.w("ExifInterface", "Invalid value for " + str4 + " : " + strReplaceAll);
                    return;
                }
                strReplaceAll = Integer.parseInt(matcher.group(1)) + "/1," + Integer.parseInt(matcher.group(2)) + "/1," + Integer.parseInt(matcher.group(3)) + "/1";
            } else if ("DateTime".equals(str4) || "DateTimeOriginal".equals(str4) || "DateTimeDigitized".equals(str4)) {
                boolean zFind = f4498v0.matcher(strReplaceAll).find();
                boolean zFind2 = f4500w0.matcher(strReplaceAll).find();
                if (strReplaceAll.length() != 19 || (!zFind && !zFind2)) {
                    Log.w("ExifInterface", "Invalid value for " + str4 + " : " + strReplaceAll);
                    return;
                }
                if (zFind2) {
                    strReplaceAll = strReplaceAll.replaceAll("-", ":");
                }
            }
        }
        int i15 = 0;
        if ("Xmp".equals(str4)) {
            boolean z10 = this.f4508f[0].containsKey("Xmp") || this.f4508f[5].containsKey("Xmp");
            int iC = C(this.f4506d);
            if ((iC == 2 && (this.f4523u != null || !z10)) || (iC == 3 && !z10)) {
                this.f4523u = strReplaceAll != null ? d.a(strReplaceAll) : null;
                return;
            }
        }
        int i16 = 0;
        while (i16 < f4487k0.length) {
            if ((i16 != 4 || this.f4511i) && (eVar = f4490n0[i16].get(str4)) != null) {
                if (strReplaceAll != null) {
                    Pair<Integer, Integer> pairD = D(strReplaceAll);
                    if (eVar.f4536c == ((Integer) pairD.first).intValue() || eVar.f4536c == ((Integer) pairD.second).intValue()) {
                        i10 = eVar.f4536c;
                    } else {
                        int i17 = eVar.f4537d;
                        if (i17 == -1 || !(i17 == ((Integer) pairD.first).intValue() || eVar.f4537d == ((Integer) pairD.second).intValue())) {
                            int i18 = eVar.f4536c;
                            if (i18 == i14 || i18 == 7 || i18 == i13) {
                                i10 = i18;
                            } else if (f4499w) {
                                StringBuilder sb2 = new StringBuilder();
                                sb2.append("Given tag (");
                                sb2.append(str4);
                                sb2.append(") value didn't match with one of expected formats: ");
                                String[] strArr = X;
                                sb2.append(strArr[eVar.f4536c]);
                                sb2.append(eVar.f4537d == -1 ? "" : ", " + strArr[eVar.f4537d]);
                                sb2.append(" (guess: ");
                                sb2.append(strArr[((Integer) pairD.first).intValue()]);
                                sb2.append(((Integer) pairD.second).intValue() != -1 ? ", " + strArr[((Integer) pairD.second).intValue()] : "");
                                sb2.append(")");
                                Log.d("ExifInterface", sb2.toString());
                            }
                        } else {
                            i10 = eVar.f4537d;
                        }
                    }
                    switch (i10) {
                        case 1:
                            str3 = str5;
                            i11 = i14;
                            i12 = i15;
                            this.f4508f[i16].put(str4, d.a(strReplaceAll));
                            break;
                        case 2:
                        case 7:
                            str3 = str5;
                            i11 = i14;
                            i12 = i15;
                            this.f4508f[i16].put(str4, d.e(strReplaceAll));
                            break;
                        case 3:
                            str3 = str5;
                            i11 = i14;
                            i12 = i15;
                            String[] strArrSplit = strReplaceAll.split(",", -1);
                            int[] iArr = new int[strArrSplit.length];
                            for (int i19 = i12; i19 < strArrSplit.length; i19++) {
                                iArr[i19] = Integer.parseInt(strArrSplit[i19]);
                            }
                            this.f4508f[i16].put(str4, d.k(iArr, this.f4510h));
                            break;
                        case 4:
                            str3 = str5;
                            i11 = i14;
                            i12 = i15;
                            String[] strArrSplit2 = strReplaceAll.split(",", -1);
                            long[] jArr = new long[strArrSplit2.length];
                            for (int i20 = i12; i20 < strArrSplit2.length; i20++) {
                                jArr[i20] = Long.parseLong(strArrSplit2[i20]);
                            }
                            this.f4508f[i16].put(str4, d.g(jArr, this.f4510h));
                            break;
                        case 5:
                            i11 = i14;
                            i12 = i15;
                            String[] strArrSplit3 = strReplaceAll.split(",", -1);
                            f[] fVarArr = new f[strArrSplit3.length];
                            int i21 = i12;
                            while (i21 < strArrSplit3.length) {
                                String[] strArrSplit4 = strArrSplit3[i21].split(str5, -1);
                                fVarArr[i21] = new f((long) Double.parseDouble(strArrSplit4[i12]), (long) Double.parseDouble(strArrSplit4[i11]), null);
                                i21++;
                                str5 = str5;
                            }
                            str3 = str5;
                            this.f4508f[i16].put(str4, d.i(fVarArr, this.f4510h));
                            break;
                        case 6:
                        case 8:
                        case 11:
                        default:
                            if (f4499w) {
                                Log.d("ExifInterface", "Data format isn't one of expected formats: " + i10);
                            }
                            break;
                        case 9:
                            i11 = i14;
                            i12 = i15;
                            String[] strArrSplit5 = strReplaceAll.split(",", -1);
                            int[] iArr2 = new int[strArrSplit5.length];
                            for (int i22 = i12; i22 < strArrSplit5.length; i22++) {
                                iArr2[i22] = Integer.parseInt(strArrSplit5[i22]);
                            }
                            this.f4508f[i16].put(str4, d.c(iArr2, this.f4510h));
                            str3 = str5;
                            break;
                        case 10:
                            String[] strArrSplit6 = strReplaceAll.split(",", -1);
                            f[] fVarArr2 = new f[strArrSplit6.length];
                            int i23 = i15;
                            while (i23 < strArrSplit6.length) {
                                String[] strArrSplit7 = strArrSplit6[i23].split(str5, -1);
                                int i24 = i14;
                                int i25 = i23;
                                fVarArr2[i25] = new f((long) Double.parseDouble(strArrSplit7[i15]), (long) Double.parseDouble(strArrSplit7[i24]), null);
                                i23 = i25 + 1;
                                i14 = i24;
                                strArrSplit6 = strArrSplit6;
                                i15 = i15;
                            }
                            i11 = i14;
                            i12 = i15;
                            this.f4508f[i16].put(str4, d.d(fVarArr2, this.f4510h));
                            str3 = str5;
                            break;
                        case 12:
                            String[] strArrSplit8 = strReplaceAll.split(",", -1);
                            double[] dArr = new double[strArrSplit8.length];
                            for (int i26 = i15; i26 < strArrSplit8.length; i26++) {
                                dArr[i26] = Double.parseDouble(strArrSplit8[i26]);
                            }
                            this.f4508f[i16].put(str4, d.b(dArr, this.f4510h));
                            break;
                    }
                } else {
                    this.f4508f[i16].remove(str4);
                }
                str3 = str5;
                i11 = i14;
                i12 = i15;
            } else {
                str3 = str5;
                i11 = i14;
                i12 = i15;
            }
            i16++;
            i14 = i11;
            i15 = i12;
            str5 = str3;
            i13 = 2;
        }
    }

    public final void i(b bVar, c cVar, byte[] bArr) throws IOException {
        int i10 = bVar.readInt();
        cVar.write(bArr);
        cVar.c(i10);
        if (i10 % 2 == 1) {
            i10++;
        }
        c4.b.e(bVar, cVar, i10);
    }

    public void i0(Location location) {
        if (location == null) {
            return;
        }
        h0("GPSProcessingMethod", location.getProvider());
        j0(location.getLatitude(), location.getLongitude());
        g0(location.getAltitude());
        h0("GPSSpeedRef", "K");
        h0("GPSSpeed", f.b((location.getSpeed() * TimeUnit.HOURS.toSeconds(1L)) / 1000.0f).toString());
        String[] strArrSplit = V.format(new Date(location.getTime())).split("\\s+", -1);
        h0("GPSDateStamp", strArrSplit[0]);
        h0("GPSTimeStamp", strArrSplit[1]);
    }

    public double j(double d10) {
        double dL = l("GPSAltitude", -1.0d);
        int iM = m("GPSAltitudeRef", -1);
        if (dL < 0.0d || iM < 0) {
            return d10;
        }
        return dL * ((double) (iM != 1 ? 1 : -1));
    }

    public void j0(double d10, double d11) {
        if (d10 < -90.0d || d10 > 90.0d || Double.isNaN(d10)) {
            throw new IllegalArgumentException("Latitude value " + d10 + " is not valid.");
        }
        if (d11 < -180.0d || d11 > 180.0d || Double.isNaN(d11)) {
            throw new IllegalArgumentException("Longitude value " + d11 + " is not valid.");
        }
        h0("GPSLatitudeRef", d10 >= 0.0d ? "N" : "S");
        h0("GPSLatitude", f(Math.abs(d10)));
        h0("GPSLongitudeRef", d11 >= 0.0d ? "E" : "W");
        h0("GPSLongitude", f(Math.abs(d11)));
    }

    public String k(String str) {
        if (str == null) {
            throw new NullPointerException("tag shouldn't be null");
        }
        d dVarN = n(str);
        if (dVarN == null) {
            return null;
        }
        if (!str.equals("GPSTimeStamp")) {
            if (!f4491o0.contains(str)) {
                return dVarN.n(this.f4510h);
            }
            try {
                return Double.toString(dVarN.l(this.f4510h));
            } catch (NumberFormatException unused) {
                return null;
            }
        }
        int i10 = dVarN.f4532a;
        if (i10 != 5 && i10 != 10) {
            Log.w("ExifInterface", "GPS Timestamp format is not rational. format=" + dVarN.f4532a);
            return null;
        }
        f[] fVarArr = (f[]) dVarN.o(this.f4510h);
        if (fVarArr == null || fVarArr.length != 3) {
            Log.w("ExifInterface", "Invalid GPS Timestamp array. array=" + Arrays.toString(fVarArr));
            return null;
        }
        f fVar = fVarArr[0];
        Integer numValueOf = Integer.valueOf((int) (fVar.f4538a / fVar.b));
        f fVar2 = fVarArr[1];
        Integer numValueOf2 = Integer.valueOf((int) (fVar2.f4538a / fVar2.b));
        f fVar3 = fVarArr[2];
        return String.format("%02d:%02d:%02d", numValueOf, numValueOf2, Integer.valueOf((int) (fVar3.f4538a / fVar3.b)));
    }

    public final void k0(b bVar) throws Throwable {
        HashMap<String, d> map = this.f4508f[4];
        d dVar = map.get("Compression");
        if (dVar == null) {
            this.f4517o = 6;
            E(bVar, map);
            return;
        }
        int iM = dVar.m(this.f4510h);
        this.f4517o = iM;
        if (iM != 1) {
            if (iM == 6) {
                E(bVar, map);
                return;
            } else if (iM != 7) {
                return;
            }
        }
        if (P(map)) {
            F(bVar, map);
        }
    }

    public double l(String str, double d10) {
        if (str == null) {
            throw new NullPointerException("tag shouldn't be null");
        }
        d dVarN = n(str);
        if (dVarN != null) {
            try {
                return dVarN.l(this.f4510h);
            } catch (NumberFormatException unused) {
            }
        }
        return d10;
    }

    public int m(String str, int i10) {
        if (str == null) {
            throw new NullPointerException("tag shouldn't be null");
        }
        d dVarN = n(str);
        if (dVarN != null) {
            try {
                return dVarN.m(this.f4510h);
            } catch (NumberFormatException unused) {
            }
        }
        return i10;
    }

    public final void m0(int i10, int i11) throws Throwable {
        if (this.f4508f[i10].isEmpty() || this.f4508f[i11].isEmpty()) {
            if (f4499w) {
                Log.d("ExifInterface", "Cannot perform swap since only one image data exists");
                return;
            }
            return;
        }
        d dVar = this.f4508f[i10].get("ImageLength");
        d dVar2 = this.f4508f[i10].get("ImageWidth");
        d dVar3 = this.f4508f[i11].get("ImageLength");
        d dVar4 = this.f4508f[i11].get("ImageWidth");
        if (dVar == null || dVar2 == null) {
            if (f4499w) {
                Log.d("ExifInterface", "First image does not contain valid size information");
                return;
            }
            return;
        }
        if (dVar3 == null || dVar4 == null) {
            if (f4499w) {
                Log.d("ExifInterface", "Second image does not contain valid size information");
                return;
            }
            return;
        }
        int iM = dVar.m(this.f4510h);
        int iM2 = dVar2.m(this.f4510h);
        int iM3 = dVar3.m(this.f4510h);
        int iM4 = dVar4.m(this.f4510h);
        if (iM >= iM3 || iM2 >= iM4) {
            return;
        }
        HashMap<String, d>[] mapArr = this.f4508f;
        HashMap<String, d> map = mapArr[i10];
        mapArr[i10] = mapArr[i11];
        mapArr[i11] = map;
    }

    public final d n(String str) {
        d dVar;
        d dVar2;
        if (str == null) {
            throw new NullPointerException("tag shouldn't be null");
        }
        if ("ISOSpeedRatings".equals(str)) {
            if (f4499w) {
                Log.d("ExifInterface", "getExifAttribute: Replacing TAG_ISO_SPEED_RATINGS with TAG_PHOTOGRAPHIC_SENSITIVITY.");
            }
            str = "PhotographicSensitivity";
        }
        if ("Xmp".equals(str) && C(this.f4506d) == 2 && (dVar2 = this.f4523u) != null) {
            return dVar2;
        }
        for (int i10 = 0; i10 < f4487k0.length; i10++) {
            d dVar3 = this.f4508f[i10].get(str);
            if (dVar3 != null) {
                return dVar3;
            }
        }
        if (!"Xmp".equals(str) || (dVar = this.f4523u) == null) {
            return null;
        }
        return dVar;
    }

    public final void o(g gVar, int i10) {
        String strExtractMetadata;
        String strExtractMetadata2;
        String strExtractMetadata3;
        int i11;
        int i12 = Build.VERSION.SDK_INT;
        if (i12 < 28) {
            throw new UnsupportedOperationException("Reading EXIF from HEIC files is supported from SDK 28 and above");
        }
        if (i10 == 15 && i12 < 31) {
            throw new UnsupportedOperationException("Reading EXIF from AVIF files is supported from SDK 31 and above");
        }
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        try {
            try {
                c4.b.a.a(mediaMetadataRetriever, new C0094a(gVar));
                String strExtractMetadata4 = mediaMetadataRetriever.extractMetadata(33);
                String strExtractMetadata5 = mediaMetadataRetriever.extractMetadata(34);
                String strExtractMetadata6 = mediaMetadataRetriever.extractMetadata(26);
                String strExtractMetadata7 = mediaMetadataRetriever.extractMetadata(17);
                if ("yes".equals(strExtractMetadata6)) {
                    strExtractMetadata = mediaMetadataRetriever.extractMetadata(29);
                    strExtractMetadata3 = mediaMetadataRetriever.extractMetadata(30);
                    strExtractMetadata2 = mediaMetadataRetriever.extractMetadata(31);
                } else if ("yes".equals(strExtractMetadata7)) {
                    strExtractMetadata = mediaMetadataRetriever.extractMetadata(18);
                    strExtractMetadata3 = mediaMetadataRetriever.extractMetadata(19);
                    strExtractMetadata2 = mediaMetadataRetriever.extractMetadata(24);
                } else {
                    strExtractMetadata = null;
                    strExtractMetadata2 = null;
                    strExtractMetadata3 = null;
                }
                if (strExtractMetadata != null) {
                    this.f4508f[0].put("ImageWidth", d.j(Integer.parseInt(strExtractMetadata), this.f4510h));
                }
                if (strExtractMetadata3 != null) {
                    this.f4508f[0].put("ImageLength", d.j(Integer.parseInt(strExtractMetadata3), this.f4510h));
                }
                if (strExtractMetadata2 != null) {
                    int i13 = Integer.parseInt(strExtractMetadata2);
                    if (i13 == 90) {
                        i11 = 6;
                    } else if (i13 != 180) {
                        i11 = i13 != 270 ? 1 : 8;
                    } else {
                        i11 = 3;
                    }
                    this.f4508f[0].put("Orientation", d.j(i11, this.f4510h));
                }
                if (strExtractMetadata4 != null && strExtractMetadata5 != null) {
                    int i14 = Integer.parseInt(strExtractMetadata4);
                    int i15 = Integer.parseInt(strExtractMetadata5);
                    if (i15 <= 6) {
                        throw new IOException("Invalid exif length");
                    }
                    gVar.g(i14);
                    byte[] bArr = new byte[6];
                    gVar.readFully(bArr);
                    int i16 = i14 + 6;
                    int i17 = i15 - 6;
                    if (!Arrays.equals(bArr, f4494r0)) {
                        throw new IOException("Invalid identifier");
                    }
                    byte[] bArr2 = new byte[i17];
                    gVar.readFully(bArr2);
                    this.f4518p = i16;
                    X(bArr2, 0);
                }
                String strExtractMetadata8 = mediaMetadataRetriever.extractMetadata(41);
                String strExtractMetadata9 = mediaMetadataRetriever.extractMetadata(42);
                if (strExtractMetadata8 != null && strExtractMetadata9 != null) {
                    int i18 = Integer.parseInt(strExtractMetadata8);
                    int i19 = Integer.parseInt(strExtractMetadata9);
                    long j10 = i18;
                    gVar.g(j10);
                    byte[] bArr3 = new byte[i19];
                    gVar.readFully(bArr3);
                    this.f4523u = new d(1, i19, j10, bArr3);
                    this.f4524v = true;
                }
                if (f4499w) {
                    Log.d("ExifInterface", "Heif meta: " + strExtractMetadata + "x" + strExtractMetadata3 + ", rotation " + strExtractMetadata2);
                }
                try {
                    mediaMetadataRetriever.release();
                } catch (IOException unused) {
                }
            } catch (Throwable th2) {
                try {
                    mediaMetadataRetriever.release();
                    throw th2;
                } catch (IOException unused2) {
                    throw th2;
                }
            }
        } catch (RuntimeException e10) {
            throw new UnsupportedOperationException("Failed to read EXIF from HEIF file. Given stream is either malformed or unsupported.", e10);
        }
    }

    public final void o0(g gVar, int i10) throws Throwable {
        d dVarJ;
        d dVarJ2;
        d dVar = this.f4508f[i10].get("DefaultCropSize");
        d dVar2 = this.f4508f[i10].get("SensorTopBorder");
        d dVar3 = this.f4508f[i10].get("SensorLeftBorder");
        d dVar4 = this.f4508f[i10].get("SensorBottomBorder");
        d dVar5 = this.f4508f[i10].get("SensorRightBorder");
        if (dVar == null) {
            if (dVar2 == null || dVar3 == null || dVar4 == null || dVar5 == null) {
                b0(gVar, i10);
                return;
            }
            int iM = dVar2.m(this.f4510h);
            int iM2 = dVar4.m(this.f4510h);
            int iM3 = dVar5.m(this.f4510h);
            int iM4 = dVar3.m(this.f4510h);
            if (iM2 <= iM || iM3 <= iM4) {
                return;
            }
            d dVarJ3 = d.j(iM2 - iM, this.f4510h);
            d dVarJ4 = d.j(iM3 - iM4, this.f4510h);
            this.f4508f[i10].put("ImageLength", dVarJ3);
            this.f4508f[i10].put("ImageWidth", dVarJ4);
            return;
        }
        if (dVar.f4532a == 5) {
            f[] fVarArr = (f[]) dVar.o(this.f4510h);
            if (fVarArr == null || fVarArr.length != 2) {
                Log.w("ExifInterface", "Invalid crop size values. cropSize=" + Arrays.toString(fVarArr));
                return;
            }
            dVarJ = d.h(fVarArr[0], this.f4510h);
            dVarJ2 = d.h(fVarArr[1], this.f4510h);
        } else {
            int[] iArr = (int[]) dVar.o(this.f4510h);
            if (iArr == null || iArr.length != 2) {
                Log.w("ExifInterface", "Invalid crop size values. cropSize=" + Arrays.toString(iArr));
                return;
            }
            dVarJ = d.j(iArr[0], this.f4510h);
            dVarJ2 = d.j(iArr[1], this.f4510h);
        }
        this.f4508f[i10].put("ImageWidth", dVarJ);
        this.f4508f[i10].put("ImageLength", dVarJ2);
    }

    /* JADX WARN: Code duplicated, block: B:34:0x00b5 A[FALL_THROUGH] */
    /* JADX WARN: Code duplicated, block: B:36:0x00be  */
    /* JADX WARN: Code duplicated, block: B:37:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:40:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:41:0x00da  */
    /* JADX WARN: Code duplicated, block: B:55:0x0159 A[LOOP:0: B:10:0x0037->B:55:0x0159, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:72:0x015f A[SYNTHETIC] */
    /* JADX WARN: Failed to find 'out' block for switch in B:29:0x00a7. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:30:0x00aa. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:31:0x00ad. Please report as an issue. */
    /*  JADX ERROR: UnsupportedOperationException in pass: RegionMakerVisitor
        java.lang.UnsupportedOperationException
        	at java.base/java.util.Collections$UnmodifiableCollection.add(Collections.java:1092)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker$1.leaveRegion(SwitchRegionMaker.java:419)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:91)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:31)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.insertBreaksForCase(SwitchRegionMaker.java:399)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.insertBreaks(SwitchRegionMaker.java:89)
        	at jadx.core.dex.visitors.regions.PostProcessRegions.leaveRegion(PostProcessRegions.java:31)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:91)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
        	at jadx.core.dex.visitors.regions.PostProcessRegions.process(PostProcessRegions.java:21)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:31)
        */
    public final void p(c4.a.b r21, int r22, int r23) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 494
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: c4.a.p(c4.a$b, int, int):void");
    }

    public final void p0() throws Throwable {
        m0(0, 5);
        m0(0, 4);
        m0(5, 4);
        d dVar = this.f4508f[1].get("PixelXDimension");
        d dVar2 = this.f4508f[1].get("PixelYDimension");
        if (dVar != null && dVar2 != null) {
            this.f4508f[0].put("ImageWidth", dVar);
            this.f4508f[0].put("ImageLength", dVar2);
        }
        if (this.f4508f[4].isEmpty() && R(this.f4508f[5])) {
            HashMap<String, d>[] mapArr = this.f4508f;
            mapArr[4] = mapArr[5];
            mapArr[5] = new HashMap<>();
        }
        if (!R(this.f4508f[4])) {
            Log.d("ExifInterface", "No image meets the size requirements of a thumbnail image.");
        }
        a0(0, "ThumbnailOrientation", "Orientation");
        a0(0, "ThumbnailImageLength", "ImageLength");
        a0(0, "ThumbnailImageWidth", "ImageWidth");
        a0(5, "ThumbnailOrientation", "Orientation");
        a0(5, "ThumbnailImageLength", "ImageLength");
        a0(5, "ThumbnailImageWidth", "ImageWidth");
        a0(4, "Orientation", "ThumbnailOrientation");
        a0(4, "ImageLength", "ThumbnailImageLength");
        a0(4, "ImageWidth", "ThumbnailImageWidth");
    }

    public double[] q() {
        String strK = k("GPSLatitude");
        String strK2 = k("GPSLatitudeRef");
        String strK3 = k("GPSLongitude");
        String strK4 = k("GPSLongitudeRef");
        if (strK == null || strK2 == null || strK3 == null || strK4 == null) {
            return null;
        }
        try {
            return new double[]{g(strK, strK2), g(strK3, strK4)};
        } catch (IllegalArgumentException unused) {
            Log.w("ExifInterface", "Latitude/longitude values are not parsable. " + String.format("latValue=%s, latRef=%s, lngValue=%s, lngRef=%s", strK, strK2, strK3, strK4));
            return null;
        }
    }

    public final int q0(c cVar) throws IOException {
        long j10;
        e[][] eVarArr = f4487k0;
        int[] iArr = new int[eVarArr.length];
        int[] iArr2 = new int[eVarArr.length];
        for (e eVar : f4488l0) {
            Z(eVar.b);
        }
        if (this.f4511i) {
            if (this.f4512j) {
                Z("StripOffsets");
                Z("StripByteCounts");
            } else {
                Z("JPEGInterchangeFormat");
                Z("JPEGInterchangeFormatLength");
            }
        }
        for (int i10 = 0; i10 < f4487k0.length; i10++) {
            Iterator<Map.Entry<String, d>> it = this.f4508f[i10].entrySet().iterator();
            while (it.hasNext()) {
                if (it.next().getValue() == null) {
                    it.remove();
                }
            }
        }
        long j11 = 0;
        if (!this.f4508f[1].isEmpty()) {
            this.f4508f[0].put(f4488l0[1].b, d.f(0L, this.f4510h));
        }
        if (!this.f4508f[2].isEmpty()) {
            this.f4508f[0].put(f4488l0[2].b, d.f(0L, this.f4510h));
        }
        if (!this.f4508f[3].isEmpty()) {
            this.f4508f[1].put(f4488l0[3].b, d.f(0L, this.f4510h));
        }
        if (this.f4511i) {
            if (this.f4512j) {
                this.f4508f[4].put("StripOffsets", d.j(0, this.f4510h));
                this.f4508f[4].put("StripByteCounts", d.j(this.f4515m, this.f4510h));
            } else {
                this.f4508f[4].put("JPEGInterchangeFormat", d.f(0L, this.f4510h));
                this.f4508f[4].put("JPEGInterchangeFormatLength", d.f(this.f4515m, this.f4510h));
            }
        }
        for (int i11 = 0; i11 < f4487k0.length; i11++) {
            Iterator<Map.Entry<String, d>> it2 = this.f4508f[i11].entrySet().iterator();
            int i12 = 0;
            while (it2.hasNext()) {
                int iP = it2.next().getValue().p();
                if (iP > 4) {
                    i12 += iP;
                }
            }
            iArr2[i11] = iArr2[i11] + i12;
        }
        int size = 8;
        for (int i13 = 0; i13 < f4487k0.length; i13++) {
            if (!this.f4508f[i13].isEmpty()) {
                iArr[i13] = size;
                size += (this.f4508f[i13].size() * 12) + 6 + iArr2[i13];
            }
        }
        if (this.f4511i) {
            if (this.f4512j) {
                this.f4508f[4].put("StripOffsets", d.j(size, this.f4510h));
            } else {
                this.f4508f[4].put("JPEGInterchangeFormat", d.f(size, this.f4510h));
            }
            this.f4514l = size;
            size += this.f4515m;
        }
        if (this.f4506d == 4) {
            size += 8;
        }
        if (f4499w) {
            for (int i14 = 0; i14 < f4487k0.length; i14++) {
                Log.d("ExifInterface", String.format("index: %d, offsets: %d, tag count: %d, data sizes: %d, total size: %d", Integer.valueOf(i14), Integer.valueOf(iArr[i14]), Integer.valueOf(this.f4508f[i14].size()), Integer.valueOf(iArr2[i14]), Integer.valueOf(size)));
            }
        }
        if (!this.f4508f[1].isEmpty()) {
            this.f4508f[0].put(f4488l0[1].b, d.f(iArr[1], this.f4510h));
        }
        if (!this.f4508f[r13].isEmpty()) {
            this.f4508f[0].put(f4488l0[r13].b, d.f(iArr[2], this.f4510h));
        }
        if (!this.f4508f[r14].isEmpty()) {
            this.f4508f[1].put(f4488l0[r14].b, d.f(iArr[3], this.f4510h));
        }
        int i15 = this.f4506d;
        if (i15 == 4) {
            if (size > 65535) {
                throw new IllegalStateException("Size of exif data (" + size + " bytes) exceeds the max size of a JPEG APP1 segment (65536 bytes)");
            }
            cVar.f(size);
            cVar.write(f4494r0);
        } else if (i15 == 13) {
            cVar.c(size);
            cVar.c(1700284774);
        } else if (i15 == 14) {
            cVar.write(O);
            cVar.c(size);
        }
        int size2 = cVar.f4531a.size();
        cVar.d(this.f4510h == ByteOrder.BIG_ENDIAN ? (short) 19789 : (short) 18761);
        cVar.a(this.f4510h);
        cVar.f(42);
        cVar.e(8L);
        int i16 = 0;
        while (i16 < f4487k0.length) {
            if (this.f4508f[i16].isEmpty()) {
                j10 = j11;
            } else {
                cVar.f(this.f4508f[i16].size());
                int size3 = iArr[i16] + 2 + (this.f4508f[i16].size() * 12) + 4;
                for (Map.Entry<String, d> entry : this.f4508f[i16].entrySet()) {
                    int i17 = f4490n0[i16].get(entry.getKey()).f4535a;
                    d value = entry.getValue();
                    int iP2 = value.p();
                    cVar.f(i17);
                    cVar.f(value.f4532a);
                    cVar.c(value.b);
                    if (iP2 > 4) {
                        cVar.e(size3);
                        size3 += iP2;
                    } else {
                        cVar.write(value.f4534d);
                        if (iP2 < 4) {
                            while (iP2 < 4) {
                                cVar.b(0);
                                iP2++;
                            }
                        }
                    }
                }
                if (i16 != 0 || this.f4508f[4].isEmpty()) {
                    j10 = 0;
                    cVar.e(0L);
                } else {
                    cVar.e(iArr[4]);
                    j10 = 0;
                }
                Iterator<Map.Entry<String, d>> it3 = this.f4508f[i16].entrySet().iterator();
                while (it3.hasNext()) {
                    byte[] bArr = it3.next().getValue().f4534d;
                    if (bArr.length > 4) {
                        cVar.write(bArr, 0, bArr.length);
                    }
                }
            }
            i16++;
            j11 = j10;
        }
        if (this.f4511i) {
            cVar.write(A());
        }
        if (this.f4506d == 14 && size % 2 == 1) {
            cVar.b(0);
        }
        cVar.a(ByteOrder.BIG_ENDIAN);
        return size2;
    }

    public final int r(BufferedInputStream bufferedInputStream) throws Throwable {
        bufferedInputStream.mark(BacktraceANRSettings.DEFAULT_ANR_TIMEOUT);
        byte[] bArr = new byte[BacktraceANRSettings.DEFAULT_ANR_TIMEOUT];
        bufferedInputStream.read(bArr);
        bufferedInputStream.reset();
        if (J(bArr)) {
            return 4;
        }
        if (M(bArr)) {
            return 9;
        }
        int I2 = I(bArr);
        if (I2 != 0) {
            return I2;
        }
        if (K(bArr)) {
            return 7;
        }
        if (N(bArr)) {
            return 10;
        }
        if (L(bArr)) {
            return 13;
        }
        return S(bArr) ? 14 : 0;
    }

    public final void r0(c cVar) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        this.f4518p = cVar.f4531a.size() + q0(new c(byteArrayOutputStream, ByteOrder.BIG_ENDIAN));
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        cVar.write(byteArray);
        CRC32 crc32 = new CRC32();
        crc32.update(byteArray, 4, byteArray.length - 4);
        cVar.c((int) crc32.getValue());
    }

    public final void s(g gVar) throws Throwable {
        int i10;
        int i11;
        v(gVar);
        d dVar = this.f4508f[1].get("MakerNote");
        if (dVar != null) {
            g gVar2 = new g(dVar.f4534d);
            gVar2.e(this.f4510h);
            byte[] bArr = I;
            byte[] bArr2 = new byte[bArr.length];
            gVar2.readFully(bArr2);
            gVar2.g(0L);
            byte[] bArr3 = J;
            byte[] bArr4 = new byte[bArr3.length];
            gVar2.readFully(bArr4);
            if (Arrays.equals(bArr2, bArr)) {
                gVar2.g(8L);
            } else if (Arrays.equals(bArr4, bArr3)) {
                gVar2.g(12L);
            }
            Y(gVar2, 6);
            d dVar2 = this.f4508f[7].get("PreviewImageStart");
            d dVar3 = this.f4508f[7].get("PreviewImageLength");
            if (dVar2 != null && dVar3 != null) {
                this.f4508f[5].put("JPEGInterchangeFormat", dVar2);
                this.f4508f[5].put("JPEGInterchangeFormatLength", dVar3);
            }
            d dVar4 = this.f4508f[8].get("AspectFrame");
            if (dVar4 != null) {
                int[] iArr = (int[]) dVar4.o(this.f4510h);
                if (iArr == null || iArr.length != 4) {
                    Log.w("ExifInterface", "Invalid aspect frame values. frame=" + Arrays.toString(iArr));
                    return;
                }
                int i12 = iArr[2];
                int i13 = iArr[0];
                if (i12 <= i13 || (i10 = iArr[3]) <= (i11 = iArr[1])) {
                    return;
                }
                int i14 = (i12 - i13) + 1;
                int i15 = (i10 - i11) + 1;
                if (i14 < i15) {
                    int i16 = i14 + i15;
                    i15 = i16 - i15;
                    i14 = i16 - i15;
                }
                d dVarJ = d.j(i14, this.f4510h);
                d dVarJ2 = d.j(i15, this.f4510h);
                this.f4508f[0].put("ImageWidth", dVarJ);
                this.f4508f[0].put("ImageLength", dVarJ2);
            }
        }
    }

    public final void s0(c cVar) throws IOException {
        cVar.c(this.f4523u.f4534d.length + 22);
        CRC32 crc32 = new CRC32();
        cVar.c(1767135348);
        n0(crc32, 1767135348);
        byte[] bArr = L;
        cVar.write(bArr);
        crc32.update(bArr);
        cVar.write(this.f4523u.f4534d);
        crc32.update(this.f4523u.f4534d);
        cVar.c((int) crc32.getValue());
        this.f4524v = true;
    }

    public final void t(b bVar) throws Throwable {
        if (f4499w) {
            Log.d("ExifInterface", "getPngAttributes starting with: " + bVar);
        }
        bVar.e(ByteOrder.BIG_ENDIAN);
        int iB = bVar.b();
        bVar.f(K.length);
        boolean z10 = false;
        boolean z11 = false;
        while (true) {
            if (z10 && z11) {
                break;
            }
            try {
                int i10 = bVar.readInt();
                int i11 = bVar.readInt();
                int iB2 = bVar.b() + i10 + 4;
                if (bVar.b() - iB == 16 && i11 != 1229472850) {
                    throw new IOException("Encountered invalid PNG file--IHDR chunk should appear as the first chunk");
                }
                if (i11 == 1229278788) {
                    break;
                }
                if (i11 == 1700284774 && !z10) {
                    this.f4518p = bVar.b() - iB;
                    byte[] bArr = new byte[i10];
                    bVar.readFully(bArr);
                    int i12 = bVar.readInt();
                    CRC32 crc32 = new CRC32();
                    n0(crc32, i11);
                    crc32.update(bArr);
                    if (((int) crc32.getValue()) != i12) {
                        throw new IOException("Encountered invalid CRC value for PNG-EXIF chunk.\n recorded CRC value: " + i12 + ", calculated CRC value: " + crc32.getValue());
                    }
                    X(bArr, 0);
                    p0();
                    k0(new b(bArr));
                    z10 = true;
                } else if (i11 == 1767135348 && !z11) {
                    byte[] bArr2 = L;
                    if (i10 >= bArr2.length) {
                        int length = bArr2.length;
                        byte[] bArr3 = new byte[length];
                        bVar.readFully(bArr3);
                        if (Arrays.equals(bArr3, bArr2)) {
                            int iB3 = bVar.b() - iB;
                            int i13 = i10 - length;
                            byte[] bArr4 = new byte[i13];
                            bVar.readFully(bArr4);
                            this.f4523u = new d(1, i13, iB3, bArr4);
                            z11 = true;
                        }
                    }
                }
                bVar.f(iB2 - bVar.b());
            } catch (EOFException e10) {
                throw new IOException("Encountered corrupt PNG file.", e10);
            }
        }
        this.f4524v = z11;
    }

    public final void u(b bVar) throws Throwable {
        boolean z10 = f4499w;
        if (z10) {
            Log.d("ExifInterface", "getRafAttributes starting with: " + bVar);
        }
        bVar.f(84);
        byte[] bArr = new byte[4];
        byte[] bArr2 = new byte[4];
        byte[] bArr3 = new byte[4];
        bVar.readFully(bArr);
        bVar.readFully(bArr2);
        bVar.readFully(bArr3);
        int i10 = ByteBuffer.wrap(bArr).getInt();
        int i11 = ByteBuffer.wrap(bArr2).getInt();
        int i12 = ByteBuffer.wrap(bArr3).getInt();
        byte[] bArr4 = new byte[i11];
        bVar.f(i10 - bVar.b());
        bVar.readFully(bArr4);
        p(new b(bArr4), i10, 5);
        bVar.f(i12 - bVar.b());
        bVar.e(ByteOrder.BIG_ENDIAN);
        int i13 = bVar.readInt();
        if (z10) {
            Log.d("ExifInterface", "numberOfDirectoryEntry: " + i13);
        }
        for (int i14 = 0; i14 < i13; i14++) {
            int unsignedShort = bVar.readUnsignedShort();
            int unsignedShort2 = bVar.readUnsignedShort();
            if (unsignedShort == f4482f0.f4535a) {
                short s8 = bVar.readShort();
                short s10 = bVar.readShort();
                d dVarJ = d.j(s8, this.f4510h);
                d dVarJ2 = d.j(s10, this.f4510h);
                this.f4508f[0].put("ImageLength", dVarJ);
                this.f4508f[0].put("ImageWidth", dVarJ2);
                if (f4499w) {
                    Log.d("ExifInterface", "Updated to length: " + ((int) s8) + ", width: " + ((int) s10));
                    return;
                }
                return;
            }
            bVar.f(unsignedShort2);
        }
    }

    public final void v(g gVar) throws Throwable {
        d dVar;
        U(gVar);
        Y(gVar, 0);
        o0(gVar, 0);
        o0(gVar, 5);
        o0(gVar, 4);
        p0();
        if (this.f4506d != 8 || (dVar = this.f4508f[1].get("MakerNote")) == null) {
            return;
        }
        g gVar2 = new g(dVar.f4534d);
        gVar2.e(this.f4510h);
        gVar2.f(6);
        Y(gVar2, 9);
        d dVar2 = this.f4508f[9].get("ColorSpace");
        if (dVar2 != null) {
            this.f4508f[1].put("ColorSpace", dVar2);
        }
    }

    public int w() {
        switch (m("Orientation", 1)) {
            case 3:
            case 4:
                return 180;
            case 5:
            case 8:
                return 270;
            case 6:
            case 7:
                return 90;
            default:
                return 0;
        }
    }

    public final void x(g gVar) throws Throwable {
        if (f4499w) {
            Log.d("ExifInterface", "getRw2Attributes starting with: " + gVar);
        }
        v(gVar);
        d dVar = this.f4508f[0].get("JpgFromRaw");
        if (dVar != null) {
            p(new b(dVar.f4534d), (int) dVar.f4533c, 5);
        }
        d dVar2 = this.f4508f[0].get("ISO");
        d dVar3 = this.f4508f[1].get("PhotographicSensitivity");
        if (dVar2 == null || dVar3 != null) {
            return;
        }
        this.f4508f[1].put("PhotographicSensitivity", dVar2);
    }

    public final boolean y(g gVar) throws IOException {
        byte[] bArr = f4494r0;
        byte[] bArr2 = new byte[bArr.length];
        gVar.readFully(bArr2);
        if (!Arrays.equals(bArr2, bArr)) {
            Log.w("ExifInterface", "Given data is not EXIF-only.");
            return false;
        }
        byte[] bArrC = gVar.c();
        this.f4518p = bArr.length;
        X(bArrC, 0);
        return true;
    }

    public byte[] z() {
        int i10 = this.f4517o;
        if (i10 == 6 || i10 == 7) {
            return A();
        }
        return null;
    }

    public static class b extends InputStream implements DataInput {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final DataInputStream f4527a;
        public int b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public ByteOrder f4528c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public byte[] f4529d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f4530e;

        public b(byte[] bArr) {
            this(new ByteArrayInputStream(bArr), ByteOrder.BIG_ENDIAN);
            this.f4530e = bArr.length;
        }

        public int a() {
            return this.f4530e;
        }

        @Override // java.io.InputStream
        public int available() {
            return this.f4527a.available();
        }

        public int b() {
            return this.b;
        }

        public byte[] c() throws IOException {
            byte[] bArrCopyOf = new byte[Barcode.FORMAT_UPC_E];
            int i10 = 0;
            while (true) {
                if (i10 == bArrCopyOf.length) {
                    bArrCopyOf = Arrays.copyOf(bArrCopyOf, bArrCopyOf.length * 2);
                }
                int i11 = this.f4527a.read(bArrCopyOf, i10, bArrCopyOf.length - i10);
                if (i11 == -1) {
                    return Arrays.copyOf(bArrCopyOf, i10);
                }
                i10 += i11;
                this.b += i11;
            }
        }

        public long d() {
            return ((long) readInt()) & 4294967295L;
        }

        public void e(ByteOrder byteOrder) {
            this.f4528c = byteOrder;
        }

        public void f(int i10) throws IOException {
            int i11 = 0;
            while (i11 < i10) {
                int i12 = i10 - i11;
                int iSkip = (int) this.f4527a.skip(i12);
                if (iSkip <= 0) {
                    if (this.f4529d == null) {
                        this.f4529d = new byte[8192];
                    }
                    iSkip = this.f4527a.read(this.f4529d, 0, Math.min(8192, i12));
                    if (iSkip == -1) {
                        throw new EOFException("Reached EOF while skipping " + i10 + " bytes.");
                    }
                }
                i11 += iSkip;
            }
            this.b += i11;
        }

        @Override // java.io.InputStream
        public void mark(int i10) {
            throw new UnsupportedOperationException("Mark is currently unsupported");
        }

        @Override // java.io.InputStream
        public int read() {
            this.b++;
            return this.f4527a.read();
        }

        @Override // java.io.DataInput
        public boolean readBoolean() {
            this.b++;
            return this.f4527a.readBoolean();
        }

        @Override // java.io.DataInput
        public byte readByte() throws IOException {
            this.b++;
            int i10 = this.f4527a.read();
            if (i10 >= 0) {
                return (byte) i10;
            }
            throw new EOFException();
        }

        @Override // java.io.DataInput
        public char readChar() {
            this.b += 2;
            return this.f4527a.readChar();
        }

        @Override // java.io.DataInput
        public double readDouble() {
            return Double.longBitsToDouble(readLong());
        }

        @Override // java.io.DataInput
        public float readFloat() {
            return Float.intBitsToFloat(readInt());
        }

        @Override // java.io.DataInput
        public void readFully(byte[] bArr, int i10, int i11) throws IOException {
            this.b += i11;
            this.f4527a.readFully(bArr, i10, i11);
        }

        @Override // java.io.DataInput
        public int readInt() throws IOException {
            this.b += 4;
            int i10 = this.f4527a.read();
            int i11 = this.f4527a.read();
            int i12 = this.f4527a.read();
            int i13 = this.f4527a.read();
            if ((i10 | i11 | i12 | i13) < 0) {
                throw new EOFException();
            }
            ByteOrder byteOrder = this.f4528c;
            if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
                return (i13 << 24) + (i12 << 16) + (i11 << 8) + i10;
            }
            if (byteOrder == ByteOrder.BIG_ENDIAN) {
                return (i10 << 24) + (i11 << 16) + (i12 << 8) + i13;
            }
            throw new IOException("Invalid byte order: " + this.f4528c);
        }

        @Override // java.io.DataInput
        public String readLine() {
            Log.d("ExifInterface", "Currently unsupported");
            return null;
        }

        @Override // java.io.DataInput
        public long readLong() throws IOException {
            this.b += 8;
            int i10 = this.f4527a.read();
            int i11 = this.f4527a.read();
            int i12 = this.f4527a.read();
            int i13 = this.f4527a.read();
            int i14 = this.f4527a.read();
            int i15 = this.f4527a.read();
            int i16 = this.f4527a.read();
            int i17 = this.f4527a.read();
            if ((i10 | i11 | i12 | i13 | i14 | i15 | i16 | i17) < 0) {
                throw new EOFException();
            }
            ByteOrder byteOrder = this.f4528c;
            if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
                return (((long) i17) << 56) + (((long) i16) << 48) + (((long) i15) << 40) + (((long) i14) << 32) + (((long) i13) << 24) + (((long) i12) << 16) + (((long) i11) << 8) + ((long) i10);
            }
            if (byteOrder == ByteOrder.BIG_ENDIAN) {
                return (((long) i10) << 56) + (((long) i11) << 48) + (((long) i12) << 40) + (((long) i13) << 32) + (((long) i14) << 24) + (((long) i15) << 16) + (((long) i16) << 8) + ((long) i17);
            }
            throw new IOException("Invalid byte order: " + this.f4528c);
        }

        @Override // java.io.DataInput
        public short readShort() throws IOException {
            this.b += 2;
            int i10 = this.f4527a.read();
            int i11 = this.f4527a.read();
            if ((i10 | i11) < 0) {
                throw new EOFException();
            }
            ByteOrder byteOrder = this.f4528c;
            if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
                return (short) ((i11 << 8) + i10);
            }
            if (byteOrder == ByteOrder.BIG_ENDIAN) {
                return (short) ((i10 << 8) + i11);
            }
            throw new IOException("Invalid byte order: " + this.f4528c);
        }

        @Override // java.io.DataInput
        public String readUTF() {
            this.b += 2;
            return this.f4527a.readUTF();
        }

        @Override // java.io.DataInput
        public int readUnsignedByte() {
            this.b++;
            return this.f4527a.readUnsignedByte();
        }

        @Override // java.io.DataInput
        public int readUnsignedShort() throws IOException {
            this.b += 2;
            int i10 = this.f4527a.read();
            int i11 = this.f4527a.read();
            if ((i10 | i11) < 0) {
                throw new EOFException();
            }
            ByteOrder byteOrder = this.f4528c;
            if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
                return (i11 << 8) + i10;
            }
            if (byteOrder == ByteOrder.BIG_ENDIAN) {
                return (i10 << 8) + i11;
            }
            throw new IOException("Invalid byte order: " + this.f4528c);
        }

        @Override // java.io.InputStream
        public void reset() {
            throw new UnsupportedOperationException("Reset is currently unsupported");
        }

        @Override // java.io.DataInput
        public int skipBytes(int i10) {
            throw new UnsupportedOperationException("skipBytes is currently unsupported");
        }

        public b(InputStream inputStream) {
            this(inputStream, ByteOrder.BIG_ENDIAN);
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i10, int i11) throws IOException {
            int i12 = this.f4527a.read(bArr, i10, i11);
            this.b += i12;
            return i12;
        }

        @Override // java.io.DataInput
        public void readFully(byte[] bArr) throws IOException {
            this.b += bArr.length;
            this.f4527a.readFully(bArr);
        }

        public b(InputStream inputStream, ByteOrder byteOrder) {
            DataInputStream dataInputStream = new DataInputStream(inputStream);
            this.f4527a = dataInputStream;
            dataInputStream.mark(0);
            this.b = 0;
            this.f4528c = byteOrder;
            this.f4530e = inputStream instanceof b ? ((b) inputStream).a() : -1;
        }
    }

    public static class g extends b {
        public g(byte[] bArr) {
            super(bArr);
            this.f4527a.mark(Integer.MAX_VALUE);
        }

        public void g(long j10) throws IOException {
            int i10 = this.b;
            if (i10 > j10) {
                this.b = 0;
                this.f4527a.reset();
            } else {
                j10 -= (long) i10;
            }
            f((int) j10);
        }

        public g(InputStream inputStream) {
            super(inputStream);
            if (inputStream.markSupported()) {
                this.f4527a.mark(Integer.MAX_VALUE);
                return;
            }
            throw new IllegalArgumentException("Cannot create SeekableByteOrderedDataInputStream with stream that does not support mark/reset");
        }
    }

    public static class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f4535a;
        public final String b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f4536c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f4537d;

        public e(String str, int i10, int i11) {
            this.b = str;
            this.f4535a = i10;
            this.f4536c = i11;
            this.f4537d = -1;
        }

        public boolean a(int i10) {
            int i11;
            int i12 = this.f4536c;
            if (i12 == 7 || i10 == 7 || i12 == i10 || (i11 = this.f4537d) == i10) {
                return true;
            }
            if ((i12 == 4 || i11 == 4) && i10 == 3) {
                return true;
            }
            if ((i12 == 9 || i11 == 9) && i10 == 8) {
                return true;
            }
            return (i12 == 12 || i11 == 12) && i10 == 11;
        }

        public e(String str, int i10, int i11, int i12) {
            this.b = str;
            this.f4535a = i10;
            this.f4536c = i11;
            this.f4537d = i12;
        }
    }

    public a(InputStream inputStream) {
        this(inputStream, 0);
    }

    /* JADX WARN: Code duplicated, block: B:19:0x004f  */
    public a(InputStream inputStream, int i10) {
        e[][] eVarArr = f4487k0;
        this.f4508f = new HashMap[eVarArr.length];
        this.f4509g = new HashSet(eVarArr.length);
        this.f4510h = ByteOrder.BIG_ENDIAN;
        if (inputStream != null) {
            this.f4504a = null;
            boolean z10 = i10 == 1;
            this.f4507e = z10;
            if (z10) {
                this.f4505c = null;
                this.b = null;
            } else if (inputStream instanceof AssetManager.AssetInputStream) {
                this.f4505c = (AssetManager.AssetInputStream) inputStream;
                this.b = null;
            } else if (inputStream instanceof FileInputStream) {
                FileInputStream fileInputStream = (FileInputStream) inputStream;
                if (O(fileInputStream.getFD())) {
                    this.f4505c = null;
                    this.b = fileInputStream.getFD();
                } else {
                    this.f4505c = null;
                    this.b = null;
                }
            } else {
                this.f4505c = null;
                this.b = null;
            }
            T(inputStream);
            return;
        }
        throw new NullPointerException("inputStream cannot be null");
    }
}
