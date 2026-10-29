package p040c4;

import android.content.res.AssetManager;
import android.location.Location;
import android.media.MediaDataSource;
import android.media.MediaMetadataRetriever;
import android.os.Build;
import android.system.Os;
import android.system.OsConstants;
import android.util.Log;
import android.util.Pair;
import androidx.core.view.InputDeviceCompat;
import backtraceio.library.anr.BacktraceANRSettings;
import com.google.mlkit.common.MlKitException;
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
import okhttp3.internal.p336ws.WebSocketProtocol;

/* JADX INFO: renamed from: c4.a */
/* JADX INFO: loaded from: classes.dex */
public class C1523a {

    /* JADX INFO: renamed from: V */
    public static final SimpleDateFormat f6048V;

    /* JADX INFO: renamed from: W */
    public static final SimpleDateFormat f6049W;

    /* JADX INFO: renamed from: a0 */
    public static final e[] f6053a0;

    /* JADX INFO: renamed from: b0 */
    public static final e[] f6054b0;

    /* JADX INFO: renamed from: c0 */
    public static final e[] f6055c0;

    /* JADX INFO: renamed from: d0 */
    public static final e[] f6056d0;

    /* JADX INFO: renamed from: e0 */
    public static final e[] f6057e0;

    /* JADX INFO: renamed from: f0 */
    public static final e f6058f0;

    /* JADX INFO: renamed from: g0 */
    public static final e[] f6059g0;

    /* JADX INFO: renamed from: h0 */
    public static final e[] f6060h0;

    /* JADX INFO: renamed from: i0 */
    public static final e[] f6061i0;

    /* JADX INFO: renamed from: j0 */
    public static final e[] f6062j0;

    /* JADX INFO: renamed from: k0 */
    public static final e[][] f6063k0;

    /* JADX INFO: renamed from: l0 */
    public static final e[] f6064l0;

    /* JADX INFO: renamed from: m0 */
    public static final HashMap<Integer, e>[] f6065m0;

    /* JADX INFO: renamed from: n0 */
    public static final HashMap<String, e>[] f6066n0;

    /* JADX INFO: renamed from: o0 */
    public static final Set<String> f6067o0;

    /* JADX INFO: renamed from: p0 */
    public static final HashMap<Integer, Integer> f6068p0;

    /* JADX INFO: renamed from: q0 */
    public static final Charset f6069q0;

    /* JADX INFO: renamed from: r0 */
    public static final byte[] f6070r0;

    /* JADX INFO: renamed from: s0 */
    public static final byte[] f6071s0;

    /* JADX INFO: renamed from: t0 */
    public static final Pattern f6072t0;

    /* JADX INFO: renamed from: u0 */
    public static final Pattern f6073u0;

    /* JADX INFO: renamed from: v0 */
    public static final Pattern f6074v0;

    /* JADX INFO: renamed from: w0 */
    public static final Pattern f6076w0;

    /* JADX INFO: renamed from: a */
    public String f6080a;

    /* JADX INFO: renamed from: b */
    public FileDescriptor f6081b;

    /* JADX INFO: renamed from: c */
    public AssetManager.AssetInputStream f6082c;

    /* JADX INFO: renamed from: d */
    public int f6083d;

    /* JADX INFO: renamed from: e */
    public boolean f6084e;

    /* JADX INFO: renamed from: f */
    public final HashMap<String, d>[] f6085f;

    /* JADX INFO: renamed from: g */
    public Set<Integer> f6086g;

    /* JADX INFO: renamed from: h */
    public ByteOrder f6087h;

    /* JADX INFO: renamed from: i */
    public boolean f6088i;

    /* JADX INFO: renamed from: j */
    public boolean f6089j;

    /* JADX INFO: renamed from: k */
    public boolean f6090k;

    /* JADX INFO: renamed from: l */
    public int f6091l;

    /* JADX INFO: renamed from: m */
    public int f6092m;

    /* JADX INFO: renamed from: n */
    public byte[] f6093n;

    /* JADX INFO: renamed from: o */
    public int f6094o;

    /* JADX INFO: renamed from: p */
    public int f6095p;

    /* JADX INFO: renamed from: q */
    public int f6096q;

    /* JADX INFO: renamed from: r */
    public int f6097r;

    /* JADX INFO: renamed from: s */
    public int f6098s;

    /* JADX INFO: renamed from: t */
    public boolean f6099t;

    /* JADX INFO: renamed from: u */
    public d f6100u;

    /* JADX INFO: renamed from: v */
    public boolean f6101v;

    /* JADX INFO: renamed from: w */
    public static final boolean f6075w = Log.isLoggable("ExifInterface", 3);

    /* JADX INFO: renamed from: x */
    public static final List<Integer> f6077x = Arrays.asList(1, 6, 3, 8);

    /* JADX INFO: renamed from: y */
    public static final List<Integer> f6078y = Arrays.asList(2, 7, 4, 5);

    /* JADX INFO: renamed from: z */
    public static final int[] f6079z = {8, 8, 8};

    /* JADX INFO: renamed from: A */
    public static final int[] f6027A = {4};

    /* JADX INFO: renamed from: B */
    public static final int[] f6028B = {8};

    /* JADX INFO: renamed from: C */
    public static final byte[] f6029C = {-1, -40, -1};

    /* JADX INFO: renamed from: D */
    public static final byte[] f6030D = {102, 116, 121, 112};

    /* JADX INFO: renamed from: E */
    public static final byte[] f6031E = {109, 105, 102, 49};

    /* JADX INFO: renamed from: F */
    public static final byte[] f6032F = {104, 101, 105, 99};

    /* JADX INFO: renamed from: G */
    public static final byte[] f6033G = {97, 118, 105, 102};

    /* JADX INFO: renamed from: H */
    public static final byte[] f6034H = {97, 118, 105, 115};

    /* JADX INFO: renamed from: I */
    public static final byte[] f6035I = {79, 76, 89, 77, 80, 0};

    /* JADX INFO: renamed from: J */
    public static final byte[] f6036J = {79, 76, 89, 77, 80, 85, 83, 0, 73, 73};

    /* JADX INFO: renamed from: K */
    public static final byte[] f6037K = {-119, 80, 78, 71, 13, 10, 26, 10};

    /* JADX INFO: renamed from: L */
    public static final byte[] f6038L = "XML:com.adobe.xmp\u0000\u0000\u0000\u0000\u0000".getBytes(StandardCharsets.UTF_8);

    /* JADX INFO: renamed from: M */
    public static final byte[] f6039M = {82, 73, 70, 70};

    /* JADX INFO: renamed from: N */
    public static final byte[] f6040N = {87, 69, 66, 80};

    /* JADX INFO: renamed from: O */
    public static final byte[] f6041O = {69, 88, 73, 70};

    /* JADX INFO: renamed from: P */
    public static final byte[] f6042P = {-99, 1, 42};

    /* JADX INFO: renamed from: Q */
    public static final byte[] f6043Q = "VP8X".getBytes(Charset.defaultCharset());

    /* JADX INFO: renamed from: R */
    public static final byte[] f6044R = "VP8L".getBytes(Charset.defaultCharset());

    /* JADX INFO: renamed from: S */
    public static final byte[] f6045S = "VP8 ".getBytes(Charset.defaultCharset());

    /* JADX INFO: renamed from: T */
    public static final byte[] f6046T = "ANIM".getBytes(Charset.defaultCharset());

    /* JADX INFO: renamed from: U */
    public static final byte[] f6047U = "ANMF".getBytes(Charset.defaultCharset());

    /* JADX INFO: renamed from: X */
    public static final String[] f6050X = {"", "BYTE", "STRING", "USHORT", "ULONG", "URATIONAL", "SBYTE", "UNDEFINED", "SSHORT", "SLONG", "SRATIONAL", "SINGLE", "DOUBLE", "IFD"};

    /* JADX INFO: renamed from: Y */
    public static final int[] f6051Y = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8, 1};

    /* JADX INFO: renamed from: Z */
    public static final byte[] f6052Z = {65, 83, 67, 73, 73, 0, 0, 0};

    /* JADX INFO: renamed from: c4.a$a */
    public class a extends MediaDataSource {

        /* JADX INFO: renamed from: a */
        public long f6102a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ g f6103b;

        public a(g gVar) {
            this.f6103b = gVar;
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
                long j11 = this.f6102a;
                if (j11 != j10) {
                    if (j11 >= 0 && j10 >= j11 + ((long) this.f6103b.available())) {
                        return -1;
                    }
                    this.f6103b.m8055g(j10);
                    this.f6102a = j10;
                }
                if (i11 > this.f6103b.available()) {
                    i11 = this.f6103b.available();
                }
                int i12 = this.f6103b.read(bArr, i10, i11);
                if (i12 >= 0) {
                    this.f6102a += (long) i12;
                    return i12;
                }
            } catch (IOException unused) {
            }
            this.f6102a = -1L;
            return -1;
        }
    }

    /* JADX INFO: renamed from: c4.a$c */
    public static class c extends FilterOutputStream {

        /* JADX INFO: renamed from: a */
        public final DataOutputStream f6110a;

        /* JADX INFO: renamed from: b */
        public ByteOrder f6111b;

        public c(OutputStream outputStream, ByteOrder byteOrder) {
            super(outputStream);
            this.f6110a = new DataOutputStream(outputStream);
            this.f6111b = byteOrder;
        }

        /* JADX INFO: renamed from: a */
        public void m8030a(ByteOrder byteOrder) {
            this.f6111b = byteOrder;
        }

        /* JADX INFO: renamed from: b */
        public void m8031b(int i10) throws IOException {
            this.f6110a.write(i10);
        }

        /* JADX INFO: renamed from: c */
        public void m8032c(int i10) throws IOException {
            ByteOrder byteOrder = this.f6111b;
            if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
                this.f6110a.write(i10 & 255);
                this.f6110a.write((i10 >>> 8) & 255);
                this.f6110a.write((i10 >>> 16) & 255);
                this.f6110a.write((i10 >>> 24) & 255);
                return;
            }
            if (byteOrder == ByteOrder.BIG_ENDIAN) {
                this.f6110a.write((i10 >>> 24) & 255);
                this.f6110a.write((i10 >>> 16) & 255);
                this.f6110a.write((i10 >>> 8) & 255);
                this.f6110a.write(i10 & 255);
            }
        }

        /* JADX INFO: renamed from: d */
        public void m8033d(short s8) throws IOException {
            ByteOrder byteOrder = this.f6111b;
            if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
                this.f6110a.write(s8 & 255);
                this.f6110a.write((s8 >>> 8) & 255);
            } else if (byteOrder == ByteOrder.BIG_ENDIAN) {
                this.f6110a.write((s8 >>> 8) & 255);
                this.f6110a.write(s8 & 255);
            }
        }

        /* JADX INFO: renamed from: e */
        public void m8034e(long j10) throws IOException {
            if (j10 > 4294967295L) {
                throw new IllegalArgumentException("val is larger than the maximum value of a 32-bit unsigned integer");
            }
            m8032c((int) j10);
        }

        /* JADX INFO: renamed from: f */
        public void m8035f(int i10) throws IOException {
            if (i10 > 65535) {
                throw new IllegalArgumentException("val is larger than the maximum value of a 16-bit unsigned integer");
            }
            m8033d((short) i10);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Override // java.io.FilterOutputStream, java.io.OutputStream
        public void write(byte[] bArr) throws IOException {
            this.f6110a.write(bArr);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        @Override // java.io.FilterOutputStream, java.io.OutputStream
        public void write(byte[] bArr, int i10, int i11) throws IOException {
            this.f6110a.write(bArr, i10, i11);
        }
    }

    /* JADX INFO: renamed from: c4.a$d */
    public static class d {

        /* JADX INFO: renamed from: a */
        public final int f6112a;

        /* JADX INFO: renamed from: b */
        public final int f6113b;

        /* JADX INFO: renamed from: c */
        public final long f6114c;

        /* JADX INFO: renamed from: d */
        public final byte[] f6115d;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public d(int i10, int i11, byte[] bArr) {
            this(i10, i11, -1L, bArr);
        }

        /* JADX INFO: renamed from: a */
        public static d m8036a(String str) {
            if (str.length() == 1 && str.charAt(0) >= '0' && str.charAt(0) <= '1') {
                return new d(1, 1, new byte[]{(byte) (str.charAt(0) - '0')});
            }
            byte[] bytes = str.getBytes(C1523a.f6069q0);
            return new d(1, bytes.length, bytes);
        }

        /* JADX INFO: renamed from: b */
        public static d m8037b(double[] dArr, ByteOrder byteOrder) {
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[C1523a.f6051Y[12] * dArr.length]);
            byteBufferWrap.order(byteOrder);
            for (double d10 : dArr) {
                byteBufferWrap.putDouble(d10);
            }
            return new d(12, dArr.length, byteBufferWrap.array());
        }

        /* JADX INFO: renamed from: c */
        public static d m8038c(int[] iArr, ByteOrder byteOrder) {
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[C1523a.f6051Y[9] * iArr.length]);
            byteBufferWrap.order(byteOrder);
            for (int i10 : iArr) {
                byteBufferWrap.putInt(i10);
            }
            return new d(9, iArr.length, byteBufferWrap.array());
        }

        /* JADX INFO: renamed from: d */
        public static d m8039d(f[] fVarArr, ByteOrder byteOrder) {
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[C1523a.f6051Y[10] * fVarArr.length]);
            byteBufferWrap.order(byteOrder);
            for (f fVar : fVarArr) {
                byteBufferWrap.putInt((int) fVar.f6120a);
                byteBufferWrap.putInt((int) fVar.f6121b);
            }
            return new d(10, fVarArr.length, byteBufferWrap.array());
        }

        /* JADX INFO: renamed from: e */
        public static d m8040e(String str) {
            byte[] bytes = (str + (char) 0).getBytes(C1523a.f6069q0);
            return new d(2, bytes.length, bytes);
        }

        /* JADX INFO: renamed from: f */
        public static d m8041f(long j10, ByteOrder byteOrder) {
            return m8042g(new long[]{j10}, byteOrder);
        }

        /* JADX INFO: renamed from: g */
        public static d m8042g(long[] jArr, ByteOrder byteOrder) {
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[C1523a.f6051Y[4] * jArr.length]);
            byteBufferWrap.order(byteOrder);
            for (long j10 : jArr) {
                byteBufferWrap.putInt((int) j10);
            }
            return new d(4, jArr.length, byteBufferWrap.array());
        }

        /* JADX INFO: renamed from: h */
        public static d m8043h(f fVar, ByteOrder byteOrder) {
            return m8044i(new f[]{fVar}, byteOrder);
        }

        /* JADX INFO: renamed from: i */
        public static d m8044i(f[] fVarArr, ByteOrder byteOrder) {
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[C1523a.f6051Y[5] * fVarArr.length]);
            byteBufferWrap.order(byteOrder);
            for (f fVar : fVarArr) {
                byteBufferWrap.putInt((int) fVar.f6120a);
                byteBufferWrap.putInt((int) fVar.f6121b);
            }
            return new d(5, fVarArr.length, byteBufferWrap.array());
        }

        /* JADX INFO: renamed from: j */
        public static d m8045j(int i10, ByteOrder byteOrder) {
            return m8046k(new int[]{i10}, byteOrder);
        }

        /* JADX INFO: renamed from: k */
        public static d m8046k(int[] iArr, ByteOrder byteOrder) {
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[C1523a.f6051Y[3] * iArr.length]);
            byteBufferWrap.order(byteOrder);
            for (int i10 : iArr) {
                byteBufferWrap.putShort((short) i10);
            }
            return new d(3, iArr.length, byteBufferWrap.array());
        }

        /* JADX INFO: renamed from: l */
        public double m8047l(ByteOrder byteOrder) throws Throwable {
            Object objM8050o = m8050o(byteOrder);
            if (objM8050o == null) {
                throw new NumberFormatException("NULL can't be converted to a double value");
            }
            if (objM8050o instanceof String) {
                return Double.parseDouble((String) objM8050o);
            }
            if (objM8050o instanceof long[]) {
                long[] jArr = (long[]) objM8050o;
                if (jArr.length == 1) {
                    return jArr[0];
                }
                throw new NumberFormatException("There are more than one component");
            }
            if (objM8050o instanceof int[]) {
                int[] iArr = (int[]) objM8050o;
                if (iArr.length == 1) {
                    return iArr[0];
                }
                throw new NumberFormatException("There are more than one component");
            }
            if (objM8050o instanceof double[]) {
                double[] dArr = (double[]) objM8050o;
                if (dArr.length == 1) {
                    return dArr[0];
                }
                throw new NumberFormatException("There are more than one component");
            }
            if (!(objM8050o instanceof f[])) {
                throw new NumberFormatException("Couldn't find a double value");
            }
            f[] fVarArr = (f[]) objM8050o;
            if (fVarArr.length == 1) {
                return fVarArr[0].m8054a();
            }
            throw new NumberFormatException("There are more than one component");
        }

        /* JADX INFO: renamed from: m */
        public int m8048m(ByteOrder byteOrder) throws Throwable {
            Object objM8050o = m8050o(byteOrder);
            if (objM8050o == null) {
                throw new NumberFormatException("NULL can't be converted to a integer value");
            }
            if (objM8050o instanceof String) {
                return Integer.parseInt((String) objM8050o);
            }
            if (objM8050o instanceof long[]) {
                long[] jArr = (long[]) objM8050o;
                if (jArr.length == 1) {
                    return (int) jArr[0];
                }
                throw new NumberFormatException("There are more than one component");
            }
            if (!(objM8050o instanceof int[])) {
                throw new NumberFormatException("Couldn't find a integer value");
            }
            int[] iArr = (int[]) objM8050o;
            if (iArr.length == 1) {
                return iArr[0];
            }
            throw new NumberFormatException("There are more than one component");
        }

        /* JADX INFO: renamed from: n */
        public String m8049n(ByteOrder byteOrder) throws Throwable {
            Object objM8050o = m8050o(byteOrder);
            if (objM8050o == null) {
                return null;
            }
            if (objM8050o instanceof String) {
                return (String) objM8050o;
            }
            StringBuilder sb2 = new StringBuilder();
            int i10 = 0;
            if (objM8050o instanceof long[]) {
                long[] jArr = (long[]) objM8050o;
                while (i10 < jArr.length) {
                    sb2.append(jArr[i10]);
                    i10++;
                    if (i10 != jArr.length) {
                        sb2.append(",");
                    }
                }
                return sb2.toString();
            }
            if (objM8050o instanceof int[]) {
                int[] iArr = (int[]) objM8050o;
                while (i10 < iArr.length) {
                    sb2.append(iArr[i10]);
                    i10++;
                    if (i10 != iArr.length) {
                        sb2.append(",");
                    }
                }
                return sb2.toString();
            }
            if (objM8050o instanceof double[]) {
                double[] dArr = (double[]) objM8050o;
                while (i10 < dArr.length) {
                    sb2.append(dArr[i10]);
                    i10++;
                    if (i10 != dArr.length) {
                        sb2.append(",");
                    }
                }
                return sb2.toString();
            }
            if (!(objM8050o instanceof f[])) {
                return null;
            }
            f[] fVarArr = (f[]) objM8050o;
            while (i10 < fVarArr.length) {
                sb2.append(fVarArr[i10].f6120a);
                sb2.append('/');
                sb2.append(fVarArr[i10].f6121b);
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
        /* JADX INFO: renamed from: o */
        public Object m8050o(ByteOrder byteOrder) throws Throwable {
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
                    bVar = new b(this.f6115d);
                    try {
                        bVar.m8028e(byteOrder);
                        int length = 0;
                        switch (this.f6112a) {
                            case 1:
                            case 6:
                                byte[] bArr = this.f6115d;
                                if (bArr.length == 1 && (b = bArr[0]) >= 0 && b <= 1) {
                                    str = new String(new char[]{(char) (b + 48)});
                                    break;
                                } else {
                                    String str2 = new String(bArr, C1523a.f6069q0);
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
                                if (this.f6113b >= C1523a.f6052Z.length) {
                                    int i10 = 0;
                                    while (true) {
                                        if (i10 >= C1523a.f6052Z.length) {
                                            length = C1523a.f6052Z.length;
                                        } else if (this.f6115d[i10] == C1523a.f6052Z[i10]) {
                                            i10++;
                                        }
                                    }
                                }
                                StringBuilder sb2 = new StringBuilder();
                                while (length < this.f6113b && (b10 = this.f6115d[length]) != 0) {
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
                                int[] iArr = new int[this.f6113b];
                                while (true) {
                                    str = iArr;
                                    if (length < this.f6113b) {
                                        iArr[length] = bVar.readUnsignedShort();
                                        length++;
                                    }
                                }
                                break;
                            case 4:
                                long[] jArr = new long[this.f6113b];
                                while (true) {
                                    str = jArr;
                                    if (length < this.f6113b) {
                                        jArr[length] = bVar.m8027d();
                                        length++;
                                    }
                                }
                                break;
                            case 5:
                                f[] fVarArr = new f[this.f6113b];
                                while (true) {
                                    str = fVarArr;
                                    if (length < this.f6113b) {
                                        fVarArr[length] = new f(bVar.m8027d(), bVar.m8027d(), null);
                                        length++;
                                    }
                                }
                                break;
                            case 8:
                                int[] iArr2 = new int[this.f6113b];
                                while (true) {
                                    str = iArr2;
                                    if (length < this.f6113b) {
                                        iArr2[length] = bVar.readShort();
                                        length++;
                                    }
                                }
                                break;
                            case 9:
                                int[] iArr3 = new int[this.f6113b];
                                while (true) {
                                    str = iArr3;
                                    if (length < this.f6113b) {
                                        iArr3[length] = bVar.readInt();
                                        length++;
                                    }
                                }
                                break;
                            case 10:
                                f[] fVarArr2 = new f[this.f6113b];
                                while (true) {
                                    str = fVarArr2;
                                    if (length < this.f6113b) {
                                        fVarArr2[length] = new f(bVar.readInt(), bVar.readInt(), null);
                                        length++;
                                    }
                                }
                                break;
                            case 11:
                                double[] dArr = new double[this.f6113b];
                                while (true) {
                                    str = dArr;
                                    if (length < this.f6113b) {
                                        dArr[length] = bVar.readFloat();
                                        length++;
                                    }
                                }
                                break;
                            case 12:
                                double[] dArr2 = new double[this.f6113b];
                                while (true) {
                                    str = dArr2;
                                    if (length < this.f6113b) {
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

        /* JADX INFO: renamed from: p */
        public int m8051p() {
            return C1523a.f6051Y[this.f6112a] * this.f6113b;
        }

        public String toString() {
            return "(" + C1523a.f6050X[this.f6112a] + ", data length:" + this.f6115d.length + ")";
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public d(int i10, int i11, long j10, byte[] bArr) {
            this.f6112a = i10;
            this.f6113b = i11;
            this.f6114c = j10;
            this.f6115d = bArr;
        }
    }

    /* JADX INFO: renamed from: c4.a$f */
    public static class f {

        /* JADX INFO: renamed from: a */
        public final long f6120a;

        /* JADX INFO: renamed from: b */
        public final long f6121b;

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 long), (r3v0 long) A[MD:(long, long):void (m)] (LINE:1) call: c4.a.f.<init>(long, long):void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ f(long j10, long j11, a aVar) {
            this(j10, j11);
        }

        /* JADX INFO: renamed from: b */
        public static f m8053b(double d10) {
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

        /* JADX INFO: renamed from: a */
        public double m8054a() {
            return this.f6120a / this.f6121b;
        }

        public String toString() {
            return this.f6120a + "/" + this.f6121b;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public f(long j10, long j11) {
            if (j11 == 0) {
                this.f6120a = 0L;
                this.f6121b = 1L;
            } else {
                this.f6120a = j10;
                this.f6121b = j11;
            }
        }
    }

    static {
        e[] eVarArr = {new e("NewSubfileType", 254, 4), new e("SubfileType", 255, 4), new e("ImageWidth", 256, 3, 4), new e("ImageLength", InputDeviceCompat.SOURCE_KEYBOARD, 3, 4), new e("BitsPerSample", 258, 3), new e("Compression", 259, 3), new e("PhotometricInterpretation", 262, 3), new e("ImageDescription", 270, 2), new e("Make", 271, 2), new e("Model", 272, 2), new e("StripOffsets", 273, 3, 4), new e("Orientation", 274, 3), new e("SamplesPerPixel", 277, 3), new e("RowsPerStrip", 278, 3, 4), new e("StripByteCounts", 279, 3, 4), new e("XResolution", 282, 5), new e("YResolution", 283, 5), new e("PlanarConfiguration", 284, 3), new e("ResolutionUnit", 296, 3), new e("TransferFunction", MlKitException.LOW_LIGHT_IMAGE_CAPTURE_PROCESSING_FAILURE, 3), new e("Software", 305, 2), new e("DateTime", 306, 2), new e("Artist", 315, 2), new e("WhitePoint", 318, 5), new e("PrimaryChromaticities", 319, 5), new e("SubIFDPointer", 330, 4), new e("JPEGInterchangeFormat", InputDeviceCompat.SOURCE_DPAD, 4), new e("JPEGInterchangeFormatLength", 514, 4), new e("YCbCrCoefficients", 529, 5), new e("YCbCrSubSampling", 530, 3), new e("YCbCrPositioning", 531, 3), new e("ReferenceBlackWhite", 532, 5), new e("Copyright", 33432, 2), new e("ExifIFDPointer", 34665, 4), new e("GPSInfoIFDPointer", 34853, 4), new e("SensorTopBorder", 4, 4), new e("SensorLeftBorder", 5, 4), new e("SensorBottomBorder", 6, 4), new e("SensorRightBorder", 7, 4), new e("ISO", 23, 3), new e("JpgFromRaw", 46, 7), new e("Xmp", 700, 1)};
        f6053a0 = eVarArr;
        e[] eVarArr2 = {new e("ExposureTime", 33434, 5), new e("FNumber", 33437, 5), new e("ExposureProgram", 34850, 3), new e("SpectralSensitivity", 34852, 2), new e("PhotographicSensitivity", 34855, 3), new e("OECF", 34856, 7), new e("SensitivityType", 34864, 3), new e("StandardOutputSensitivity", 34865, 4), new e("RecommendedExposureIndex", 34866, 4), new e("ISOSpeed", 34867, 4), new e("ISOSpeedLatitudeyyy", 34868, 4), new e("ISOSpeedLatitudezzz", 34869, 4), new e("ExifVersion", 36864, 2), new e("DateTimeOriginal", 36867, 2), new e("DateTimeDigitized", 36868, 2), new e("OffsetTime", 36880, 2), new e("OffsetTimeOriginal", 36881, 2), new e("OffsetTimeDigitized", 36882, 2), new e("ComponentsConfiguration", 37121, 7), new e("CompressedBitsPerPixel", 37122, 5), new e("ShutterSpeedValue", 37377, 10), new e("ApertureValue", 37378, 5), new e("BrightnessValue", 37379, 10), new e("ExposureBiasValue", 37380, 10), new e("MaxApertureValue", 37381, 5), new e("SubjectDistance", 37382, 5), new e("MeteringMode", 37383, 3), new e("LightSource", 37384, 3), new e("Flash", 37385, 3), new e("FocalLength", 37386, 5), new e("SubjectArea", 37396, 3), new e("MakerNote", 37500, 7), new e("UserComment", 37510, 7), new e("SubSecTime", 37520, 2), new e("SubSecTimeOriginal", 37521, 2), new e("SubSecTimeDigitized", 37522, 2), new e("FlashpixVersion", 40960, 7), new e("ColorSpace", 40961, 3), new e("PixelXDimension", 40962, 3, 4), new e("PixelYDimension", 40963, 3, 4), new e("RelatedSoundFile", 40964, 2), new e("InteroperabilityIFDPointer", 40965, 4), new e("FlashEnergy", 41483, 5), new e("SpatialFrequencyResponse", 41484, 7), new e("FocalPlaneXResolution", 41486, 5), new e("FocalPlaneYResolution", 41487, 5), new e("FocalPlaneResolutionUnit", 41488, 3), new e("SubjectLocation", 41492, 3), new e("ExposureIndex", 41493, 5), new e("SensingMethod", 41495, 3), new e("FileSource", 41728, 7), new e("SceneType", 41729, 7), new e("CFAPattern", 41730, 7), new e("CustomRendered", 41985, 3), new e("ExposureMode", 41986, 3), new e("WhiteBalance", 41987, 3), new e("DigitalZoomRatio", 41988, 5), new e("FocalLengthIn35mmFilm", 41989, 3), new e("SceneCaptureType", 41990, 3), new e("GainControl", 41991, 3), new e("Contrast", 41992, 3), new e("Saturation", 41993, 3), new e("Sharpness", 41994, 3), new e("DeviceSettingDescription", 41995, 7), new e("SubjectDistanceRange", 41996, 3), new e("ImageUniqueID", 42016, 2), new e("CameraOwnerName", 42032, 2), new e("BodySerialNumber", 42033, 2), new e("LensSpecification", 42034, 5), new e("LensMake", 42035, 2), new e("LensModel", 42036, 2), new e("Gamma", 42240, 5), new e("DNGVersion", 50706, 1), new e("DefaultCropSize", 50720, 3, 4)};
        f6054b0 = eVarArr2;
        e[] eVarArr3 = {new e("GPSVersionID", 0, 1), new e("GPSLatitudeRef", 1, 2), new e("GPSLatitude", 2, 5, 10), new e("GPSLongitudeRef", 3, 2), new e("GPSLongitude", 4, 5, 10), new e("GPSAltitudeRef", 5, 1), new e("GPSAltitude", 6, 5), new e("GPSTimeStamp", 7, 5), new e("GPSSatellites", 8, 2), new e("GPSStatus", 9, 2), new e("GPSMeasureMode", 10, 2), new e("GPSDOP", 11, 5), new e("GPSSpeedRef", 12, 2), new e("GPSSpeed", 13, 5), new e("GPSTrackRef", 14, 2), new e("GPSTrack", 15, 5), new e("GPSImgDirectionRef", 16, 2), new e("GPSImgDirection", 17, 5), new e("GPSMapDatum", 18, 2), new e("GPSDestLatitudeRef", 19, 2), new e("GPSDestLatitude", 20, 5), new e("GPSDestLongitudeRef", 21, 2), new e("GPSDestLongitude", 22, 5), new e("GPSDestBearingRef", 23, 2), new e("GPSDestBearing", 24, 5), new e("GPSDestDistanceRef", 25, 2), new e("GPSDestDistance", 26, 5), new e("GPSProcessingMethod", 27, 7), new e("GPSAreaInformation", 28, 7), new e("GPSDateStamp", 29, 2), new e("GPSDifferential", 30, 3), new e("GPSHPositioningError", 31, 5)};
        f6055c0 = eVarArr3;
        e[] eVarArr4 = {new e("InteroperabilityIndex", 1, 2)};
        f6056d0 = eVarArr4;
        e[] eVarArr5 = {new e("NewSubfileType", 254, 4), new e("SubfileType", 255, 4), new e("ThumbnailImageWidth", 256, 3, 4), new e("ThumbnailImageLength", InputDeviceCompat.SOURCE_KEYBOARD, 3, 4), new e("BitsPerSample", 258, 3), new e("Compression", 259, 3), new e("PhotometricInterpretation", 262, 3), new e("ImageDescription", 270, 2), new e("Make", 271, 2), new e("Model", 272, 2), new e("StripOffsets", 273, 3, 4), new e("ThumbnailOrientation", 274, 3), new e("SamplesPerPixel", 277, 3), new e("RowsPerStrip", 278, 3, 4), new e("StripByteCounts", 279, 3, 4), new e("XResolution", 282, 5), new e("YResolution", 283, 5), new e("PlanarConfiguration", 284, 3), new e("ResolutionUnit", 296, 3), new e("TransferFunction", MlKitException.LOW_LIGHT_IMAGE_CAPTURE_PROCESSING_FAILURE, 3), new e("Software", 305, 2), new e("DateTime", 306, 2), new e("Artist", 315, 2), new e("WhitePoint", 318, 5), new e("PrimaryChromaticities", 319, 5), new e("SubIFDPointer", 330, 4), new e("JPEGInterchangeFormat", InputDeviceCompat.SOURCE_DPAD, 4), new e("JPEGInterchangeFormatLength", 514, 4), new e("YCbCrCoefficients", 529, 5), new e("YCbCrSubSampling", 530, 3), new e("YCbCrPositioning", 531, 3), new e("ReferenceBlackWhite", 532, 5), new e("Copyright", 33432, 2), new e("ExifIFDPointer", 34665, 4), new e("GPSInfoIFDPointer", 34853, 4), new e("DNGVersion", 50706, 1), new e("DefaultCropSize", 50720, 3, 4)};
        f6057e0 = eVarArr5;
        f6058f0 = new e("StripOffsets", 273, 3);
        e[] eVarArr6 = {new e("ThumbnailImage", 256, 7), new e("CameraSettingsIFDPointer", 8224, 4), new e("ImageProcessingIFDPointer", 8256, 4)};
        f6059g0 = eVarArr6;
        e[] eVarArr7 = {new e("PreviewImageStart", InputDeviceCompat.SOURCE_KEYBOARD, 4), new e("PreviewImageLength", 258, 4)};
        f6060h0 = eVarArr7;
        e[] eVarArr8 = {new e("AspectFrame", 4371, 3)};
        f6061i0 = eVarArr8;
        e[] eVarArr9 = {new e("ColorSpace", 55, 3)};
        f6062j0 = eVarArr9;
        e[][] eVarArr10 = {eVarArr, eVarArr2, eVarArr3, eVarArr4, eVarArr5, eVarArr, eVarArr6, eVarArr7, eVarArr8, eVarArr9};
        f6063k0 = eVarArr10;
        f6064l0 = new e[]{new e("SubIFDPointer", 330, 4), new e("ExifIFDPointer", 34665, 4), new e("GPSInfoIFDPointer", 34853, 4), new e("InteroperabilityIFDPointer", 40965, 4), new e("CameraSettingsIFDPointer", 8224, 1), new e("ImageProcessingIFDPointer", 8256, 1)};
        f6065m0 = new HashMap[eVarArr10.length];
        f6066n0 = new HashMap[eVarArr10.length];
        f6067o0 = Collections.unmodifiableSet(new HashSet(Arrays.asList("FNumber", "DigitalZoomRatio", "ExposureTime", "SubjectDistance")));
        f6068p0 = new HashMap<>();
        Charset charsetForName = Charset.forName("US-ASCII");
        f6069q0 = charsetForName;
        f6070r0 = "Exif\u0000\u0000".getBytes(charsetForName);
        f6071s0 = "http://ns.adobe.com/xap/1.0/\u0000".getBytes(charsetForName);
        Locale locale = Locale.US;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy:MM:dd HH:mm:ss", locale);
        f6048V = simpleDateFormat;
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", locale);
        f6049W = simpleDateFormat2;
        simpleDateFormat2.setTimeZone(TimeZone.getTimeZone("UTC"));
        int i10 = 0;
        while (true) {
            e[][] eVarArr11 = f6063k0;
            if (i10 >= eVarArr11.length) {
                HashMap<Integer, Integer> map = f6068p0;
                e[] eVarArr12 = f6064l0;
                map.put(Integer.valueOf(eVarArr12[0].f6116a), 5);
                map.put(Integer.valueOf(eVarArr12[1].f6116a), 1);
                map.put(Integer.valueOf(eVarArr12[2].f6116a), 2);
                map.put(Integer.valueOf(eVarArr12[3].f6116a), 3);
                map.put(Integer.valueOf(eVarArr12[4].f6116a), 7);
                map.put(Integer.valueOf(eVarArr12[5].f6116a), 8);
                f6072t0 = Pattern.compile(".*[1-9].*");
                f6073u0 = Pattern.compile("^(\\d{2}):(\\d{2}):(\\d{2})$");
                f6074v0 = Pattern.compile("^(\\d{4}):(\\d{2}):(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
                f6076w0 = Pattern.compile("^(\\d{4})-(\\d{2})-(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
                return;
            }
            f6065m0[i10] = new HashMap<>();
            f6066n0[i10] = new HashMap<>();
            for (e eVar : eVarArr11[i10]) {
                f6065m0[i10].put(Integer.valueOf(eVar.f6116a), eVar);
                f6066n0[i10].put(eVar.f6117b, eVar);
            }
            i10++;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1523a(String str) throws Throwable {
        e[][] eVarArr = f6063k0;
        this.f6085f = new HashMap[eVarArr.length];
        this.f6086g = new HashSet(eVarArr.length);
        this.f6087h = ByteOrder.BIG_ENDIAN;
        if (str == null) {
            throw new NullPointerException("filename cannot be null");
        }
        m7969G(str);
    }

    /* JADX INFO: renamed from: C */
    public static int m7953C(int i10) {
        if (i10 != 4) {
            return (i10 == 9 || i10 == 15 || i10 == 12 || i10 == 13) ? 2 : 1;
        }
        return 3;
    }

    /* JADX INFO: renamed from: D */
    public static Pair<Integer, Integer> m7954D(String str) {
        if (str.contains(",")) {
            String[] strArrSplit = str.split(",", -1);
            Pair<Integer, Integer> pairM7954D = m7954D(strArrSplit[0]);
            if (((Integer) pairM7954D.first).intValue() == 2) {
                return pairM7954D;
            }
            for (int i10 = 1; i10 < strArrSplit.length; i10++) {
                Pair<Integer, Integer> pairM7954D2 = m7954D(strArrSplit[i10]);
                int iIntValue = (((Integer) pairM7954D2.first).equals(pairM7954D.first) || ((Integer) pairM7954D2.second).equals(pairM7954D.first)) ? ((Integer) pairM7954D.first).intValue() : -1;
                int iIntValue2 = (((Integer) pairM7954D.second).intValue() == -1 || !(((Integer) pairM7954D2.first).equals(pairM7954D.second) || ((Integer) pairM7954D2.second).equals(pairM7954D.second))) ? -1 : ((Integer) pairM7954D.second).intValue();
                if (iIntValue == -1 && iIntValue2 == -1) {
                    return new Pair<>(2, -1);
                }
                if (iIntValue == -1) {
                    pairM7954D = new Pair<>(Integer.valueOf(iIntValue2), -1);
                } else if (iIntValue2 == -1) {
                    pairM7954D = new Pair<>(Integer.valueOf(iIntValue), -1);
                }
            }
            return pairM7954D;
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

    /* JADX INFO: renamed from: J */
    public static boolean m7955J(byte[] bArr) {
        int i10 = 0;
        while (true) {
            byte[] bArr2 = f6029C;
            if (i10 >= bArr2.length) {
                return true;
            }
            if (bArr[i10] != bArr2[i10]) {
                return false;
            }
            i10++;
        }
    }

    /* JADX INFO: renamed from: O */
    public static boolean m7956O(FileDescriptor fileDescriptor) {
        try {
            Os.lseek(fileDescriptor, 0L, OsConstants.SEEK_CUR);
            return true;
        } catch (Exception unused) {
            if (!f6075w) {
                return false;
            }
            Log.d("ExifInterface", "The file descriptor for the given input is not seekable");
            return false;
        }
    }

    /* JADX INFO: renamed from: Q */
    public static boolean m7957Q(int i10) {
        return i10 == 4 || i10 == 13 || i10 == 14;
    }

    /* JADX INFO: renamed from: g */
    public static double m7962g(String str, String str2) {
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

    /* JADX INFO: renamed from: l0 */
    public static boolean m7963l0(int i10) {
        return (i10 == 4 || i10 == 9 || i10 == 13 || i10 == 14) ? false : true;
    }

    /* JADX INFO: renamed from: n0 */
    public static void m7964n0(CRC32 crc32, int i10) {
        crc32.update(i10 >>> 24);
        crc32.update(i10 >>> 16);
        crc32.update(i10 >>> 8);
        crc32.update(i10);
    }

    /* JADX WARN: Code duplicated, block: B:48:0x008c  */
    /* JADX WARN: Code duplicated, block: B:52:0x0095  */
    /* JADX INFO: renamed from: A */
    public byte[] m7965A() throws Throwable {
        FileDescriptor fileDescriptor;
        InputStream fileInputStream;
        Exception e10;
        InputStream inputStream = null;
        if (!this.f6088i) {
            return null;
        }
        byte[] bArr = this.f6093n;
        if (bArr != null) {
            return bArr;
        }
        try {
            fileInputStream = this.f6082c;
            if (fileInputStream != null) {
                try {
                    if (!fileInputStream.markSupported()) {
                        Log.d("ExifInterface", "Cannot read thumbnail from inputstream without mark/reset support");
                        C1524b.m8057b(fileInputStream);
                        return null;
                    }
                    fileInputStream.reset();
                    fileDescriptor = null;
                } catch (Exception e11) {
                    e10 = e11;
                    fileDescriptor = null;
                    Log.d("ExifInterface", "Encountered exception while getting thumbnail", e10);
                    C1524b.m8057b(fileInputStream);
                    if (fileDescriptor != null) {
                        C1524b.m8056a(fileDescriptor);
                    }
                    return null;
                } catch (Throwable th2) {
                    th = th2;
                    fileDescriptor = null;
                    inputStream = fileInputStream;
                    C1524b.m8057b(inputStream);
                    if (fileDescriptor != null) {
                        C1524b.m8056a(fileDescriptor);
                    }
                    throw th;
                }
            } else if (this.f6080a != null) {
                fileInputStream = new FileInputStream(this.f6080a);
                fileDescriptor = null;
            } else {
                FileDescriptor fileDescriptorDup = Os.dup(this.f6081b);
                try {
                    Os.lseek(fileDescriptorDup, 0L, OsConstants.SEEK_SET);
                    fileDescriptor = fileDescriptorDup;
                    fileInputStream = new FileInputStream(fileDescriptorDup);
                } catch (Exception e12) {
                    e10 = e12;
                    fileDescriptor = fileDescriptorDup;
                    fileInputStream = null;
                    Log.d("ExifInterface", "Encountered exception while getting thumbnail", e10);
                    C1524b.m8057b(fileInputStream);
                    if (fileDescriptor != null) {
                        C1524b.m8056a(fileDescriptor);
                    }
                    return null;
                } catch (Throwable th3) {
                    th = th3;
                    fileDescriptor = fileDescriptorDup;
                    C1524b.m8057b(inputStream);
                    if (fileDescriptor != null) {
                        C1524b.m8056a(fileDescriptor);
                    }
                    throw th;
                }
            }
            try {
                try {
                    b bVar = new b(fileInputStream);
                    bVar.m8029f(this.f6091l + this.f6095p);
                    byte[] bArr2 = new byte[this.f6092m];
                    bVar.readFully(bArr2);
                    this.f6093n = bArr2;
                    C1524b.m8057b(fileInputStream);
                    if (fileDescriptor != null) {
                        C1524b.m8056a(fileDescriptor);
                    }
                    return bArr2;
                } catch (Exception e13) {
                    e10 = e13;
                    Log.d("ExifInterface", "Encountered exception while getting thumbnail", e10);
                    C1524b.m8057b(fileInputStream);
                    if (fileDescriptor != null) {
                        C1524b.m8056a(fileDescriptor);
                    }
                    return null;
                }
            } catch (Throwable th4) {
                th = th4;
                inputStream = fileInputStream;
                C1524b.m8057b(inputStream);
                if (fileDescriptor != null) {
                    C1524b.m8056a(fileDescriptor);
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

    /* JADX INFO: renamed from: B */
    public final void m7966B(b bVar) throws Throwable {
        if (f6075w) {
            Log.d("ExifInterface", "getWebpAttributes starting with: " + bVar);
        }
        bVar.m8028e(ByteOrder.LITTLE_ENDIAN);
        bVar.m8029f(f6039M.length);
        int i10 = bVar.readInt() + 8;
        byte[] bArr = f6040N;
        bVar.m8029f(bArr.length);
        int length = bArr.length + 8;
        while (true) {
            try {
                byte[] bArr2 = new byte[4];
                bVar.readFully(bArr2);
                int i11 = bVar.readInt();
                int i12 = length + 8;
                if (Arrays.equals(f6041O, bArr2)) {
                    byte[] bArrCopyOfRange = new byte[i11];
                    bVar.readFully(bArrCopyOfRange);
                    byte[] bArr3 = f6070r0;
                    if (C1524b.m8061f(bArrCopyOfRange, bArr3)) {
                        bArrCopyOfRange = Arrays.copyOfRange(bArrCopyOfRange, bArr3.length, i11);
                    }
                    this.f6095p = i12;
                    m7983X(bArrCopyOfRange, 0);
                    m8002k0(new b(bArrCopyOfRange));
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
                bVar.m8029f(i11);
            } catch (EOFException e10) {
                throw new IOException("Encountered corrupt WebP file.", e10);
            }
        }
    }

    /* JADX INFO: renamed from: E */
    public final void m7967E(b bVar, HashMap<String, d> map) throws Throwable {
        d dVar = map.get("JPEGInterchangeFormat");
        d dVar2 = map.get("JPEGInterchangeFormatLength");
        if (dVar == null || dVar2 == null) {
            return;
        }
        int iM8048m = dVar.m8048m(this.f6087h);
        int iM8048m2 = dVar2.m8048m(this.f6087h);
        if (this.f6083d == 7) {
            iM8048m += this.f6096q;
        }
        if (iM8048m > 0 && iM8048m2 > 0) {
            this.f6088i = true;
            if (this.f6080a == null && this.f6082c == null && this.f6081b == null) {
                byte[] bArr = new byte[iM8048m2];
                bVar.m8029f(iM8048m);
                bVar.readFully(bArr);
                this.f6093n = bArr;
            }
            this.f6091l = iM8048m;
            this.f6092m = iM8048m2;
        }
        if (f6075w) {
            Log.d("ExifInterface", "Setting thumbnail attributes with offset: " + iM8048m + ", length: " + iM8048m2);
        }
    }

    /* JADX INFO: renamed from: F */
    public final void m7968F(b bVar, HashMap<String, d> map) throws IOException {
        int i10;
        d dVar = map.get("StripOffsets");
        d dVar2 = map.get("StripByteCounts");
        if (dVar == null || dVar2 == null) {
            return;
        }
        long[] jArrM8058c = C1524b.m8058c(dVar.m8050o(this.f6087h));
        long[] jArrM8058c2 = C1524b.m8058c(dVar2.m8050o(this.f6087h));
        if (jArrM8058c == null || jArrM8058c.length == 0) {
            Log.w("ExifInterface", "stripOffsets should not be null or have zero length.");
            return;
        }
        if (jArrM8058c2 == null || jArrM8058c2.length == 0) {
            Log.w("ExifInterface", "stripByteCounts should not be null or have zero length.");
            return;
        }
        if (jArrM8058c.length != jArrM8058c2.length) {
            Log.w("ExifInterface", "stripOffsets and stripByteCounts should have same length.");
            return;
        }
        long j10 = 0;
        for (long j11 : jArrM8058c2) {
            j10 += j11;
        }
        int i11 = (int) j10;
        byte[] bArr = new byte[i11];
        int i12 = 1;
        this.f6090k = true;
        this.f6089j = true;
        this.f6088i = true;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        while (i13 < jArrM8058c.length) {
            int i16 = (int) jArrM8058c[i13];
            int i17 = (int) jArrM8058c2[i13];
            if (i13 < jArrM8058c.length - i12) {
                i10 = i13;
                if (i16 + i17 != jArrM8058c[i10 + 1]) {
                    this.f6090k = false;
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
                bVar.m8029f(i18);
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
        this.f6093n = bArr;
        if (this.f6090k) {
            this.f6091l = (int) jArrM8058c[0];
            this.f6092m = i11;
        }
    }

    /* JADX INFO: renamed from: G */
    public final void m7969G(String str) throws Throwable {
        if (str == null) {
            throw new NullPointerException("filename cannot be null");
        }
        FileInputStream fileInputStream = null;
        this.f6082c = null;
        this.f6080a = str;
        try {
            FileInputStream fileInputStream2 = new FileInputStream(str);
            try {
                if (m7956O(fileInputStream2.getFD())) {
                    this.f6081b = fileInputStream2.getFD();
                } else {
                    this.f6081b = null;
                }
                m7979T(fileInputStream2);
                C1524b.m8057b(fileInputStream2);
            } catch (Throwable th2) {
                th = th2;
                fileInputStream = fileInputStream2;
                C1524b.m8057b(fileInputStream);
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    /* JADX INFO: renamed from: H */
    public boolean m7970H() {
        int iM8004m = m8004m("Orientation", 1);
        return iM8004m == 2 || iM8004m == 7 || iM8004m == 4 || iM8004m == 5;
    }

    /* JADX INFO: renamed from: I */
    public final int m7971I(byte[] bArr) throws Throwable {
        long j10;
        b bVar = null;
        try {
            try {
                b bVar2 = new b(bArr);
                try {
                    long length = bVar2.readInt();
                    byte[] bArr2 = new byte[4];
                    bVar2.readFully(bArr2);
                    if (!Arrays.equals(bArr2, f6030D)) {
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
                                if (Arrays.equals(bArr3, f6031E)) {
                                    z10 = true;
                                } else if (Arrays.equals(bArr3, f6032F)) {
                                    z11 = true;
                                } else if (Arrays.equals(bArr3, f6033G) || Arrays.equals(bArr3, f6034H)) {
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
                    if (f6075w) {
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

    /* JADX INFO: renamed from: K */
    public final boolean m7972K(byte[] bArr) throws Throwable {
        b bVar = null;
        try {
            b bVar2 = new b(bArr);
            try {
                ByteOrder byteOrderM7982W = m7982W(bVar2);
                this.f6087h = byteOrderM7982W;
                bVar2.m8028e(byteOrderM7982W);
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

    /* JADX INFO: renamed from: L */
    public final boolean m7973L(byte[] bArr) {
        int i10 = 0;
        while (true) {
            byte[] bArr2 = f6037K;
            if (i10 >= bArr2.length) {
                return true;
            }
            if (bArr[i10] != bArr2[i10]) {
                return false;
            }
            i10++;
        }
    }

    /* JADX INFO: renamed from: M */
    public final boolean m7974M(byte[] bArr) {
        byte[] bytes = "FUJIFILMCCD-RAW".getBytes(Charset.defaultCharset());
        for (int i10 = 0; i10 < bytes.length; i10++) {
            if (bArr[i10] != bytes[i10]) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: N */
    public final boolean m7975N(byte[] bArr) throws Throwable {
        b bVar = null;
        try {
            b bVar2 = new b(bArr);
            try {
                ByteOrder byteOrderM7982W = m7982W(bVar2);
                this.f6087h = byteOrderM7982W;
                bVar2.m8028e(byteOrderM7982W);
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

    /* JADX INFO: renamed from: P */
    public final boolean m7976P(HashMap<String, d> map) {
        d dVar;
        int iM8048m;
        d dVar2 = map.get("BitsPerSample");
        if (dVar2 != null) {
            int[] iArr = (int[]) dVar2.m8050o(this.f6087h);
            int[] iArr2 = f6079z;
            if (Arrays.equals(iArr2, iArr)) {
                return true;
            }
            if (this.f6083d == 3 && (dVar = map.get("PhotometricInterpretation")) != null && (((iM8048m = dVar.m8048m(this.f6087h)) == 1 && Arrays.equals(iArr, f6028B)) || (iM8048m == 6 && Arrays.equals(iArr, iArr2)))) {
                return true;
            }
        }
        if (!f6075w) {
            return false;
        }
        Log.d("ExifInterface", "Unsupported data type value");
        return false;
    }

    /* JADX INFO: renamed from: R */
    public final boolean m7977R(HashMap<String, d> map) {
        d dVar = map.get("ImageLength");
        d dVar2 = map.get("ImageWidth");
        if (dVar == null || dVar2 == null) {
            return false;
        }
        return dVar.m8048m(this.f6087h) <= 512 && dVar2.m8048m(this.f6087h) <= 512;
    }

    /* JADX INFO: renamed from: S */
    public final boolean m7978S(byte[] bArr) {
        int i10 = 0;
        while (true) {
            byte[] bArr2 = f6039M;
            if (i10 >= bArr2.length) {
                int i11 = 0;
                while (true) {
                    byte[] bArr3 = f6040N;
                    if (i11 >= bArr3.length) {
                        return true;
                    }
                    if (bArr[f6039M.length + i11 + 4] != bArr3[i11]) {
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
    /* JADX INFO: renamed from: T */
    public final void m7979T(InputStream inputStream) {
        boolean z10;
        for (int i10 = 0; i10 < f6063k0.length; i10++) {
            try {
                try {
                    this.f6085f[i10] = new HashMap<>();
                } catch (Throwable th2) {
                    m7990e();
                    if (f6075w) {
                        m7981V();
                    }
                    throw th2;
                }
            } catch (IOException e10) {
                e = e10;
                z10 = f6075w;
                if (z10) {
                    Log.w("ExifInterface", "Invalid image: ExifInterface got an unsupported image format file (ExifInterface supports JPEG and some RAW image formats only) or a corrupted JPEG file to ExifInterface.", e);
                }
                m7990e();
                if (z10) {
                    m7981V();
                    return;
                }
                return;
            } catch (UnsupportedOperationException e11) {
                e = e11;
                z10 = f6075w;
                if (z10) {
                    Log.w("ExifInterface", "Invalid image: ExifInterface got an unsupported image format file (ExifInterface supports JPEG and some RAW image formats only) or a corrupted JPEG file to ExifInterface.", e);
                }
                m7990e();
                if (z10) {
                    m7981V();
                    return;
                }
                return;
            }
        }
        if (!this.f6084e) {
            BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream, BacktraceANRSettings.DEFAULT_ANR_TIMEOUT);
            this.f6083d = m8013r(bufferedInputStream);
            inputStream = bufferedInputStream;
        }
        if (m7963l0(this.f6083d)) {
            g gVar = new g(inputStream);
            if (!this.f6084e) {
                int i11 = this.f6083d;
                if (i11 == 12 || i11 == 15) {
                    m8007o(gVar, i11);
                } else if (i11 == 7) {
                    m8015s(gVar);
                } else if (i11 == 10) {
                    m8021x(gVar);
                } else {
                    m8019v(gVar);
                }
            } else if (!m8022y(gVar)) {
                m7990e();
                if (f6075w) {
                    m7981V();
                    return;
                }
                return;
            }
            gVar.m8055g(this.f6095p);
            m8002k0(gVar);
        } else {
            b bVar = new b(inputStream);
            int i12 = this.f6083d;
            if (i12 == 4) {
                m8009p(bVar, 0, 0);
            } else if (i12 == 13) {
                m8017t(bVar);
            } else if (i12 == 9) {
                m8018u(bVar);
            } else if (i12 == 14) {
                m7966B(bVar);
            }
        }
        m7990e();
        if (f6075w) {
            m7981V();
        }
    }

    /* JADX INFO: renamed from: U */
    public final void m7980U(b bVar) throws IOException {
        ByteOrder byteOrderM7982W = m7982W(bVar);
        this.f6087h = byteOrderM7982W;
        bVar.m8028e(byteOrderM7982W);
        int unsignedShort = bVar.readUnsignedShort();
        int i10 = this.f6083d;
        if (i10 != 7 && i10 != 10 && unsignedShort != 42) {
            throw new IOException("Invalid start code: " + Integer.toHexString(unsignedShort));
        }
        int i11 = bVar.readInt();
        if (i11 < 8) {
            throw new IOException("Invalid first Ifd offset: " + i11);
        }
        int i12 = i11 - 8;
        if (i12 > 0) {
            bVar.m8029f(i12);
        }
    }

    /* JADX INFO: renamed from: V */
    public final void m7981V() {
        for (int i10 = 0; i10 < this.f6085f.length; i10++) {
            Log.d("ExifInterface", "The size of tag group[" + i10 + "]: " + this.f6085f[i10].size());
            for (Map.Entry<String, d> entry : this.f6085f[i10].entrySet()) {
                d value = entry.getValue();
                Log.d("ExifInterface", "tagName: " + entry.getKey() + ", tagType: " + value.toString() + ", tagValue: '" + value.m8049n(this.f6087h) + "'");
            }
        }
    }

    /* JADX INFO: renamed from: W */
    public final ByteOrder m7982W(b bVar) throws IOException {
        short s8 = bVar.readShort();
        if (s8 == 18761) {
            if (f6075w) {
                Log.d("ExifInterface", "readExifSegment: Byte Align II");
            }
            return ByteOrder.LITTLE_ENDIAN;
        }
        if (s8 == 19789) {
            if (f6075w) {
                Log.d("ExifInterface", "readExifSegment: Byte Align MM");
            }
            return ByteOrder.BIG_ENDIAN;
        }
        throw new IOException("Invalid byte order: " + Integer.toHexString(s8));
    }

    /* JADX INFO: renamed from: X */
    public final void m7983X(byte[] bArr, int i10) throws IOException {
        g gVar = new g(bArr);
        m7980U(gVar);
        m7984Y(gVar, i10);
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
    /* JADX INFO: renamed from: Y */
    public final void m7984Y(g gVar, int i10) throws IOException {
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
        long jM8027d;
        String str;
        int i12;
        this.f6086g.add(Integer.valueOf(gVar.m8025b()));
        short s8 = gVar.readShort();
        if (f6075w) {
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
            long jM8025b = ((long) gVar.m8025b()) + 4;
            e eVar4 = f6065m0[i10].get(Integer.valueOf(unsignedShort2));
            boolean z12 = f6075w;
            if (z12) {
                i11 = 4;
                Log.d("ExifInterface", String.format("ifdType: %d, tagNumber: %d, tagName: %s, dataFormat: %d, numberOfComponents: %d", Integer.valueOf(i10), Integer.valueOf(unsignedShort2), eVar4 != null ? eVar4.f6117b : null, Integer.valueOf(unsignedShort3), Integer.valueOf(i13)));
            } else {
                i11 = 4;
            }
            if (eVar4 != null) {
                if (unsignedShort3 > 0) {
                    int[] iArr = f6051Y;
                    if (unsignedShort3 < iArr.length) {
                        if (eVar4.m8052a(unsignedShort3)) {
                            if (unsignedShort3 == 7) {
                                unsignedShort3 = eVar4.f6118c;
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
                            Log.d("ExifInterface", "Skip the tag entry since data format (" + f6050X[unsignedShort3] + ") is unexpected for tag: " + eVar4.f6117b);
                        }
                    }
                    if (z10) {
                        if (j10 > 4) {
                            i12 = gVar.readInt();
                            if (z12) {
                                Log.d("ExifInterface", "seek to data offset: " + i12);
                            }
                            if (this.f6083d == 7) {
                                z11 = z12;
                                eVar2 = eVar;
                                if ("MakerNote".equals(eVar2.f6117b)) {
                                    this.f6096q = i12;
                                } else if (i10 != 6 && "ThumbnailImage".equals(eVar2.f6117b)) {
                                    this.f6097r = i12;
                                    this.f6098s = i13;
                                    d dVarM8045j = d.m8045j(6, this.f6087h);
                                    d dVarM8041f = d.m8041f(this.f6097r, this.f6087h);
                                    d dVarM8041f2 = d.m8041f(this.f6098s, this.f6087h);
                                    this.f6085f[i11].put("Compression", dVarM8045j);
                                    this.f6085f[i11].put("JPEGInterchangeFormat", dVarM8041f);
                                    this.f6085f[i11].put("JPEGInterchangeFormatLength", dVarM8041f2);
                                }
                            } else {
                                z11 = z12;
                                eVar2 = eVar;
                            }
                            gVar.m8055g(i12);
                        } else {
                            z11 = z12;
                            jM8025b = jM8025b;
                            eVar2 = eVar;
                        }
                        num = f6068p0.get(Integer.valueOf(unsignedShort2));
                        if (z11) {
                            Log.d("ExifInterface", "nextIfdType: " + num + " byteCount: " + j10);
                        }
                        if (num != null) {
                            if (unsignedShort3 != 3) {
                                if (unsignedShort3 == i11) {
                                    jM8027d = gVar.m8027d();
                                } else if (unsignedShort3 == 8) {
                                    unsignedShort = gVar.readShort();
                                } else if (unsignedShort3 != 9 || unsignedShort3 == 13) {
                                    unsignedShort = gVar.readInt();
                                } else {
                                    jM8027d = -1;
                                }
                                if (z11) {
                                    Log.d("ExifInterface", String.format("Offset: %d, tagName: %s", Long.valueOf(jM8027d), eVar2.f6117b));
                                }
                                if (jM8027d > 0 || (gVar.m8024a() != -1 && jM8027d >= gVar.m8024a())) {
                                    if (z11) {
                                        str = "Skip jump into the IFD since its offset is invalid: " + jM8027d;
                                        if (gVar.m8024a() != -1) {
                                            str = str + " (total length: " + gVar.m8024a() + ")";
                                        }
                                        Log.d("ExifInterface", str);
                                    }
                                } else if (!this.f6086g.contains(Integer.valueOf((int) jM8027d))) {
                                    gVar.m8055g(jM8027d);
                                    m7984Y(gVar, num.intValue());
                                } else if (z11) {
                                    Log.d("ExifInterface", "Skip jump into the IFD since it has already been read: IfdType " + num + " (at " + jM8027d + ")");
                                }
                                gVar.m8055g(jM8025b);
                            } else {
                                unsignedShort = gVar.readUnsignedShort();
                            }
                            jM8027d = unsignedShort;
                            if (z11) {
                                Log.d("ExifInterface", String.format("Offset: %d, tagName: %s", Long.valueOf(jM8027d), eVar2.f6117b));
                            }
                            if (jM8027d > 0) {
                                if (z11) {
                                    str = "Skip jump into the IFD since its offset is invalid: " + jM8027d;
                                    if (gVar.m8024a() != -1) {
                                        str = str + " (total length: " + gVar.m8024a() + ")";
                                    }
                                    Log.d("ExifInterface", str);
                                }
                            } else if (z11) {
                                str = "Skip jump into the IFD since its offset is invalid: " + jM8027d;
                                if (gVar.m8024a() != -1) {
                                    str = str + " (total length: " + gVar.m8024a() + ")";
                                }
                                Log.d("ExifInterface", str);
                            }
                            gVar.m8055g(jM8025b);
                        } else {
                            int iM8025b = gVar.m8025b() + this.f6095p;
                            byte[] bArr = new byte[(int) j10];
                            gVar.readFully(bArr);
                            long j12 = iM8025b;
                            eVar3 = eVar2;
                            j11 = jM8025b;
                            d dVar = new d(unsignedShort3, i13, j12, bArr);
                            this.f6085f[i10].put(eVar3.f6117b, dVar);
                            if ("DNGVersion".equals(eVar3.f6117b)) {
                                this.f6083d = 3;
                            }
                            if (((!"Make".equals(eVar3.f6117b) || "Model".equals(eVar3.f6117b)) && dVar.m8049n(this.f6087h).contains("PENTAX")) || ("Compression".equals(eVar3.f6117b) && dVar.m8048m(this.f6087h) == 65535)) {
                                this.f6083d = 8;
                            }
                            if (gVar.m8025b() != j11) {
                                gVar.m8055g(j11);
                            }
                        }
                    } else {
                        gVar.m8055g(jM8025b);
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
                    gVar.m8055g(jM8025b);
                } else {
                    if (j10 > 4) {
                        i12 = gVar.readInt();
                        if (z12) {
                            Log.d("ExifInterface", "seek to data offset: " + i12);
                        }
                        if (this.f6083d == 7) {
                            z11 = z12;
                            eVar2 = eVar;
                            if ("MakerNote".equals(eVar2.f6117b)) {
                                this.f6096q = i12;
                            } else if (i10 != 6) {
                            }
                        } else {
                            z11 = z12;
                            eVar2 = eVar;
                        }
                        gVar.m8055g(i12);
                    } else {
                        z11 = z12;
                        jM8025b = jM8025b;
                        eVar2 = eVar;
                    }
                    num = f6068p0.get(Integer.valueOf(unsignedShort2));
                    if (z11) {
                        Log.d("ExifInterface", "nextIfdType: " + num + " byteCount: " + j10);
                    }
                    if (num != null) {
                        if (unsignedShort3 != 3) {
                            if (unsignedShort3 == i11) {
                                jM8027d = gVar.m8027d();
                            } else if (unsignedShort3 == 8) {
                                if (unsignedShort3 != 9) {
                                }
                                unsignedShort = gVar.readInt();
                            } else {
                                unsignedShort = gVar.readShort();
                            }
                            if (z11) {
                                Log.d("ExifInterface", String.format("Offset: %d, tagName: %s", Long.valueOf(jM8027d), eVar2.f6117b));
                            }
                            if (jM8027d > 0) {
                                if (z11) {
                                    str = "Skip jump into the IFD since its offset is invalid: " + jM8027d;
                                    if (gVar.m8024a() != -1) {
                                        str = str + " (total length: " + gVar.m8024a() + ")";
                                    }
                                    Log.d("ExifInterface", str);
                                }
                            } else if (z11) {
                                str = "Skip jump into the IFD since its offset is invalid: " + jM8027d;
                                if (gVar.m8024a() != -1) {
                                    str = str + " (total length: " + gVar.m8024a() + ")";
                                }
                                Log.d("ExifInterface", str);
                            }
                            gVar.m8055g(jM8025b);
                        } else {
                            unsignedShort = gVar.readUnsignedShort();
                        }
                        jM8027d = unsignedShort;
                        if (z11) {
                            Log.d("ExifInterface", String.format("Offset: %d, tagName: %s", Long.valueOf(jM8027d), eVar2.f6117b));
                        }
                        if (jM8027d > 0) {
                            if (z11) {
                                str = "Skip jump into the IFD since its offset is invalid: " + jM8027d;
                                if (gVar.m8024a() != -1) {
                                    str = str + " (total length: " + gVar.m8024a() + ")";
                                }
                                Log.d("ExifInterface", str);
                            }
                        } else if (z11) {
                            str = "Skip jump into the IFD since its offset is invalid: " + jM8027d;
                            if (gVar.m8024a() != -1) {
                                str = str + " (total length: " + gVar.m8024a() + ")";
                            }
                            Log.d("ExifInterface", str);
                        }
                        gVar.m8055g(jM8025b);
                    } else {
                        int iM8025b2 = gVar.m8025b() + this.f6095p;
                        byte[] bArr2 = new byte[(int) j10];
                        gVar.readFully(bArr2);
                        long j13 = iM8025b2;
                        eVar3 = eVar2;
                        j11 = jM8025b;
                        d dVar2 = new d(unsignedShort3, i13, j13, bArr2);
                        this.f6085f[i10].put(eVar3.f6117b, dVar2);
                        if ("DNGVersion".equals(eVar3.f6117b)) {
                            this.f6083d = 3;
                        }
                        if (!"Make".equals(eVar3.f6117b)) {
                        }
                        this.f6083d = 8;
                        if (gVar.m8025b() != j11) {
                            gVar.m8055g(j11);
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
                gVar.m8055g(jM8025b);
            } else {
                if (j10 > 4) {
                    i12 = gVar.readInt();
                    if (z12) {
                        Log.d("ExifInterface", "seek to data offset: " + i12);
                    }
                    if (this.f6083d == 7) {
                        z11 = z12;
                        eVar2 = eVar;
                        if ("MakerNote".equals(eVar2.f6117b)) {
                            this.f6096q = i12;
                        } else if (i10 != 6) {
                        }
                    } else {
                        z11 = z12;
                        eVar2 = eVar;
                    }
                    gVar.m8055g(i12);
                } else {
                    z11 = z12;
                    jM8025b = jM8025b;
                    eVar2 = eVar;
                }
                num = f6068p0.get(Integer.valueOf(unsignedShort2));
                if (z11) {
                    Log.d("ExifInterface", "nextIfdType: " + num + " byteCount: " + j10);
                }
                if (num != null) {
                    if (unsignedShort3 != 3) {
                        if (unsignedShort3 == i11) {
                            jM8027d = gVar.m8027d();
                        } else if (unsignedShort3 == 8) {
                            if (unsignedShort3 != 9) {
                            }
                            unsignedShort = gVar.readInt();
                        } else {
                            unsignedShort = gVar.readShort();
                        }
                        if (z11) {
                            Log.d("ExifInterface", String.format("Offset: %d, tagName: %s", Long.valueOf(jM8027d), eVar2.f6117b));
                        }
                        if (jM8027d > 0) {
                            if (z11) {
                                str = "Skip jump into the IFD since its offset is invalid: " + jM8027d;
                                if (gVar.m8024a() != -1) {
                                    str = str + " (total length: " + gVar.m8024a() + ")";
                                }
                                Log.d("ExifInterface", str);
                            }
                        } else if (z11) {
                            str = "Skip jump into the IFD since its offset is invalid: " + jM8027d;
                            if (gVar.m8024a() != -1) {
                                str = str + " (total length: " + gVar.m8024a() + ")";
                            }
                            Log.d("ExifInterface", str);
                        }
                        gVar.m8055g(jM8025b);
                    } else {
                        unsignedShort = gVar.readUnsignedShort();
                    }
                    jM8027d = unsignedShort;
                    if (z11) {
                        Log.d("ExifInterface", String.format("Offset: %d, tagName: %s", Long.valueOf(jM8027d), eVar2.f6117b));
                    }
                    if (jM8027d > 0) {
                        if (z11) {
                            str = "Skip jump into the IFD since its offset is invalid: " + jM8027d;
                            if (gVar.m8024a() != -1) {
                                str = str + " (total length: " + gVar.m8024a() + ")";
                            }
                            Log.d("ExifInterface", str);
                        }
                    } else if (z11) {
                        str = "Skip jump into the IFD since its offset is invalid: " + jM8027d;
                        if (gVar.m8024a() != -1) {
                            str = str + " (total length: " + gVar.m8024a() + ")";
                        }
                        Log.d("ExifInterface", str);
                    }
                    gVar.m8055g(jM8025b);
                } else {
                    int iM8025b3 = gVar.m8025b() + this.f6095p;
                    byte[] bArr3 = new byte[(int) j10];
                    gVar.readFully(bArr3);
                    long j14 = iM8025b3;
                    eVar3 = eVar2;
                    j11 = jM8025b;
                    d dVar3 = new d(unsignedShort3, i13, j14, bArr3);
                    this.f6085f[i10].put(eVar3.f6117b, dVar3);
                    if ("DNGVersion".equals(eVar3.f6117b)) {
                        this.f6083d = 3;
                    }
                    if (!"Make".equals(eVar3.f6117b)) {
                    }
                    this.f6083d = 8;
                    if (gVar.m8025b() != j11) {
                        gVar.m8055g(j11);
                    }
                }
            }
            s10 = (short) (s10 + 1);
            s8 = s8;
        }
        int i14 = gVar.readInt();
        boolean z13 = f6075w;
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
        if (this.f6086g.contains(Integer.valueOf(i14))) {
            if (z13) {
                Log.d("ExifInterface", "Stop reading file since re-reading an IFD may cause an infinite loop: " + i14);
                return;
            }
            return;
        }
        gVar.m8055g(j15);
        if (this.f6085f[4].isEmpty()) {
            m7984Y(gVar, 4);
        } else if (this.f6085f[5].isEmpty()) {
            m7984Y(gVar, 5);
        }
    }

    /* JADX INFO: renamed from: Z */
    public final void m7985Z(String str) {
        for (int i10 = 0; i10 < f6063k0.length; i10++) {
            this.f6085f[i10].remove(str);
        }
    }

    /* JADX INFO: renamed from: a0 */
    public final void m7986a0(int i10, String str, String str2) {
        if (this.f6085f[i10].isEmpty() || this.f6085f[i10].get(str) == null) {
            return;
        }
        HashMap<String, d> map = this.f6085f[i10];
        map.put(str2, map.get(str));
        this.f6085f[i10].remove(str);
    }

    /* JADX INFO: renamed from: b0 */
    public final void m7987b0(g gVar, int i10) throws Throwable {
        d dVar = this.f6085f[i10].get("ImageLength");
        d dVar2 = this.f6085f[i10].get("ImageWidth");
        if (dVar == null || dVar2 == null) {
            d dVar3 = this.f6085f[i10].get("JPEGInterchangeFormat");
            d dVar4 = this.f6085f[i10].get("JPEGInterchangeFormatLength");
            if (dVar3 == null || dVar4 == null) {
                return;
            }
            int iM8048m = dVar3.m8048m(this.f6087h);
            int iM8048m2 = dVar3.m8048m(this.f6087h);
            gVar.m8055g(iM8048m);
            byte[] bArr = new byte[iM8048m2];
            gVar.readFully(bArr);
            m8009p(new b(bArr), iM8048m, i10);
        }
    }

    /* JADX WARN: Code duplicated, block: B:70:0x00f1 A[Catch: all -> 0x00fa, Exception -> 0x00fd, TryCatch #17 {Exception -> 0x00fd, all -> 0x00fa, blocks: (B:68:0x00ed, B:70:0x00f1, B:77:0x010e, B:76:0x00ff), top: B:125:0x00ed }] */
    /* JADX WARN: Code duplicated, block: B:76:0x00ff A[Catch: all -> 0x00fa, Exception -> 0x00fd, TryCatch #17 {Exception -> 0x00fd, all -> 0x00fa, blocks: (B:68:0x00ed, B:70:0x00f1, B:77:0x010e, B:76:0x00ff), top: B:125:0x00ed }] */
    /* JADX WARN: Code duplicated, block: B:92:0x0152  */
    /* JADX INFO: renamed from: c0 */
    public void m7988c0() throws Throwable {
        FileOutputStream fileOutputStream;
        FileInputStream fileInputStream;
        FileOutputStream fileOutputStream2;
        Exception exc;
        FileOutputStream fileOutputStream3;
        InputStream fileInputStream2;
        Exception e10;
        FileOutputStream fileOutputStream4;
        if (!m7957Q(this.f6083d)) {
            throw new IOException("ExifInterface only supports saving attributes for JPEG, PNG, and WebP formats.");
        }
        if (this.f6081b == null && this.f6080a == null) {
            throw new IOException("ExifInterface does not support saving attributes for the current input.");
        }
        if (this.f6088i && this.f6089j && !this.f6090k) {
            throw new IOException("ExifInterface does not support saving attributes when the image file has non-consecutive thumbnail strips");
        }
        this.f6099t = true;
        this.f6093n = m8023z();
        InputStream inputStream = null;
        try {
            File fileCreateTempFile = File.createTempFile("temp", "tmp");
            if (this.f6080a != null) {
                fileInputStream = new FileInputStream(this.f6080a);
            } else {
                Os.lseek(this.f6081b, 0L, OsConstants.SEEK_SET);
                fileInputStream = new FileInputStream(this.f6081b);
            }
            try {
                fileOutputStream = new FileOutputStream(fileCreateTempFile);
                try {
                    C1524b.m8059d(fileInputStream, fileOutputStream);
                    C1524b.m8057b(fileInputStream);
                    C1524b.m8057b(fileOutputStream);
                    try {
                        try {
                            try {
                                FileInputStream fileInputStream3 = new FileInputStream(fileCreateTempFile);
                                try {
                                    if (this.f6080a != null) {
                                        fileOutputStream3 = new FileOutputStream(this.f6080a);
                                    } else {
                                        Os.lseek(this.f6081b, 0L, OsConstants.SEEK_SET);
                                        fileOutputStream3 = new FileOutputStream(this.f6081b);
                                    }
                                    try {
                                        BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream3);
                                        try {
                                            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream3);
                                            try {
                                                int i10 = this.f6083d;
                                                if (i10 == 4) {
                                                    m7989d0(bufferedInputStream, bufferedOutputStream);
                                                } else if (i10 == 13) {
                                                    m7991e0(bufferedInputStream, bufferedOutputStream);
                                                } else if (i10 == 14) {
                                                    m7993f0(bufferedInputStream, bufferedOutputStream);
                                                }
                                                C1524b.m8057b(bufferedInputStream);
                                                C1524b.m8057b(bufferedOutputStream);
                                                fileCreateTempFile.delete();
                                                this.f6093n = null;
                                            } catch (Exception e11) {
                                                exc = e11;
                                                inputStream = fileInputStream3;
                                                try {
                                                    fileInputStream2 = new FileInputStream(fileCreateTempFile);
                                                    try {
                                                        if (this.f6080a != null) {
                                                            fileOutputStream4 = new FileOutputStream(this.f6080a);
                                                        } else {
                                                            Os.lseek(this.f6081b, 0L, OsConstants.SEEK_SET);
                                                            fileOutputStream4 = new FileOutputStream(this.f6081b);
                                                        }
                                                        fileOutputStream3 = fileOutputStream4;
                                                        C1524b.m8059d(fileInputStream2, fileOutputStream3);
                                                        C1524b.m8057b(fileInputStream2);
                                                        C1524b.m8057b(fileOutputStream3);
                                                        throw new IOException("Failed to save new file", exc);
                                                    } catch (Exception e12) {
                                                        e10 = e12;
                                                        try {
                                                            throw new IOException("Failed to save new file. Original file is stored in " + fileCreateTempFile.getAbsolutePath(), e10);
                                                        } catch (Throwable th2) {
                                                            th = th2;
                                                            inputStream = fileInputStream2;
                                                            C1524b.m8057b(inputStream);
                                                            C1524b.m8057b(fileOutputStream3);
                                                            throw th;
                                                        }
                                                    } catch (Throwable th3) {
                                                        th = th3;
                                                        inputStream = fileInputStream2;
                                                        C1524b.m8057b(inputStream);
                                                        C1524b.m8057b(fileOutputStream3);
                                                        throw th;
                                                    }
                                                } catch (Exception e13) {
                                                    fileInputStream2 = inputStream;
                                                    e10 = e13;
                                                } catch (Throwable th4) {
                                                    th = th4;
                                                    C1524b.m8057b(inputStream);
                                                    C1524b.m8057b(fileOutputStream3);
                                                    throw th;
                                                }
                                            }
                                        } catch (Exception e14) {
                                            inputStream = fileInputStream3;
                                            exc = e14;
                                        } catch (Throwable th5) {
                                            th = th5;
                                            inputStream = bufferedInputStream;
                                            C1524b.m8057b(inputStream);
                                            C1524b.m8057b(0);
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
                                    if (this.f6080a != null) {
                                        fileOutputStream4 = new FileOutputStream(this.f6080a);
                                    } else {
                                        Os.lseek(this.f6081b, 0L, OsConstants.SEEK_SET);
                                        fileOutputStream4 = new FileOutputStream(this.f6081b);
                                    }
                                    fileOutputStream3 = fileOutputStream4;
                                    C1524b.m8059d(fileInputStream2, fileOutputStream3);
                                    C1524b.m8057b(fileInputStream2);
                                    C1524b.m8057b(fileOutputStream3);
                                    throw new IOException("Failed to save new file", exc);
                                }
                            } catch (Throwable th6) {
                                th = th6;
                                C1524b.m8057b(inputStream);
                                C1524b.m8057b(0);
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
                        C1524b.m8057b(inputStream);
                        C1524b.m8057b(fileOutputStream);
                        throw th;
                    }
                } catch (Throwable th9) {
                    th = th9;
                    inputStream = fileInputStream;
                    C1524b.m8057b(inputStream);
                    C1524b.m8057b(fileOutputStream);
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

    /* JADX INFO: renamed from: d0 */
    public final void m7989d0(InputStream inputStream, OutputStream outputStream) throws IOException {
        byte[] bArr;
        if (f6075w) {
            Log.d("ExifInterface", "saveJpegAttributes starting with (inputStream: " + inputStream + ", outputStream: " + outputStream + ")");
        }
        b bVar = new b(inputStream);
        c cVar = new c(outputStream, ByteOrder.BIG_ENDIAN);
        if (bVar.readByte() != -1) {
            throw new IOException("Invalid marker");
        }
        cVar.m8031b(-1);
        if (bVar.readByte() != -40) {
            throw new IOException("Invalid marker");
        }
        cVar.m8031b(-40);
        cVar.m8031b(-1);
        cVar.m8031b(-31);
        this.f6095p = m8012q0(cVar);
        if (this.f6100u != null) {
            cVar.write(-1);
            cVar.m8031b(-31);
            byte[] bArr2 = f6071s0;
            cVar.m8035f(bArr2.length + 2 + this.f6100u.f6115d.length);
            cVar.write(bArr2);
            cVar.write(this.f6100u.f6115d);
            this.f6101v = true;
        }
        byte[] bArr3 = new byte[4096];
        while (bVar.readByte() == -1) {
            byte b10 = bVar.readByte();
            if (b10 == -39 || b10 == -38) {
                cVar.m8031b(-1);
                cVar.m8031b(b10);
                C1524b.m8059d(bVar, cVar);
                return;
            }
            if (b10 != -31) {
                cVar.m8031b(-1);
                cVar.m8031b(b10);
                int unsignedShort = bVar.readUnsignedShort();
                cVar.m8035f(unsignedShort);
                int i10 = unsignedShort - 2;
                if (i10 < 0) {
                    throw new IOException("Invalid length");
                }
                while (i10 > 0) {
                    int i11 = bVar.read(bArr3, 0, Math.min(i10, 4096));
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
                byte[] bArr4 = f6071s0;
                if (length >= bArr4.length) {
                    bArr = new byte[bArr4.length];
                } else {
                    byte[] bArr5 = f6070r0;
                    bArr = length >= bArr5.length ? new byte[bArr5.length] : null;
                }
                if (bArr != null) {
                    bVar.readFully(bArr);
                    if (C1524b.m8061f(bArr, f6070r0) || C1524b.m8061f(bArr, bArr4)) {
                        bVar.m8029f(length - bArr.length);
                    }
                }
                cVar.m8031b(-1);
                cVar.m8031b(b10);
                cVar.m8035f(unsignedShort2);
                if (bArr != null) {
                    length -= bArr.length;
                    cVar.write(bArr);
                }
                while (length > 0) {
                    int i12 = bVar.read(bArr3, 0, Math.min(length, 4096));
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

    /* JADX INFO: renamed from: e */
    public final void m7990e() {
        String strM8001k = m8001k("DateTimeOriginal");
        if (strM8001k != null && m8001k("DateTime") == null) {
            this.f6085f[0].put("DateTime", d.m8040e(strM8001k));
        }
        if (m8001k("ImageWidth") == null) {
            this.f6085f[0].put("ImageWidth", d.m8041f(0L, this.f6087h));
        }
        if (m8001k("ImageLength") == null) {
            this.f6085f[0].put("ImageLength", d.m8041f(0L, this.f6087h));
        }
        if (m8001k("Orientation") == null) {
            this.f6085f[0].put("Orientation", d.m8041f(0L, this.f6087h));
        }
        if (m8001k("LightSource") == null) {
            this.f6085f[1].put("LightSource", d.m8041f(0L, this.f6087h));
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
    /* JADX INFO: renamed from: e0 */
    public final void m7991e0(java.io.InputStream r9, java.io.OutputStream r10) {
        /*
            r8 = this;
            boolean r0 = p040c4.C1523a.f6075w
            if (r0 == 0) goto L27
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "savePngAttributes starting with (inputStream: "
            r0.append(r1)
            r0.append(r9)
            java.lang.String r1 = ", outputStream: "
            r0.append(r1)
            r0.append(r10)
            java.lang.String r1 = ")"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "ExifInterface"
            android.util.Log.d(r1, r0)
        L27:
            c4.a$b r0 = new c4.a$b
            r0.<init>(r9)
            c4.a$c r9 = new c4.a$c
            java.nio.ByteOrder r1 = java.nio.ByteOrder.BIG_ENDIAN
            r9.<init>(r10, r1)
            byte[] r10 = p040c4.C1523a.f6037K
            int r10 = r10.length
            p040c4.C1524b.m8060e(r0, r9, r10)
            c4.a$d r10 = r8.f6100u
            r1 = 1
            r2 = 0
            if (r10 != 0) goto L43
            boolean r10 = r8.f6101v
            if (r10 == 0) goto L78
        L43:
            r10 = r1
        L44:
            if (r1 != 0) goto L4d
            if (r10 == 0) goto L49
            goto L4d
        L49:
            p040c4.C1524b.m8059d(r0, r9)
            return
        L4d:
            int r3 = r0.readInt()
            int r4 = r0.readInt()
            r5 = 1229472850(0x49484452, float:820293.1)
            if (r4 != r5) goto L7a
            r9.m8032c(r3)
            r9.m8032c(r4)
            int r3 = r3 + 4
            p040c4.C1524b.m8060e(r0, r9, r3)
            int r3 = r8.f6095p
            if (r3 != 0) goto L6d
            r8.m8014r0(r9)
            r1 = r2
        L6d:
            c4.a$d r3 = r8.f6100u
            if (r3 == 0) goto L44
            boolean r3 = r8.f6101v
            if (r3 != 0) goto L44
            r8.m8016s0(r9)
        L78:
            r10 = r2
            goto L44
        L7a:
            r5 = 1700284774(0x65584966, float:6.383657E22)
            if (r4 != r5) goto L8b
            if (r1 == 0) goto L8b
            r8.m8014r0(r9)
            int r3 = r3 + 4
            r0.m8029f(r3)
            r1 = r2
            goto L44
        L8b:
            r5 = 1767135348(0x69545874, float:1.6044374E25)
            if (r4 != r5) goto Lbd
            byte[] r5 = p040c4.C1523a.f6038L
            int r6 = r5.length
            if (r3 < r6) goto Lbd
            int r6 = r5.length
            byte[] r7 = new byte[r6]
            r0.readFully(r7)
            int r6 = r3 - r6
            int r6 = r6 + 4
            boolean r5 = java.util.Arrays.equals(r7, r5)
            if (r5 == 0) goto Lb0
            c4.a$d r10 = r8.f6100u
            if (r10 == 0) goto Lac
            r8.m8016s0(r9)
        Lac:
            r0.m8029f(r6)
            goto L78
        Lb0:
            r9.m8032c(r3)
            r9.m8032c(r4)
            r9.write(r7)
            p040c4.C1524b.m8060e(r0, r9, r6)
            goto L44
        Lbd:
            r9.m8032c(r3)
            r9.m8032c(r4)
            int r3 = r3 + 4
            p040c4.C1524b.m8060e(r0, r9, r3)
            goto L44
        */
        throw new UnsupportedOperationException("Method not decompiled: p040c4.C1523a.m7991e0(java.io.InputStream, java.io.OutputStream):void");
    }

    /* JADX INFO: renamed from: f */
    public final String m7992f(double d10) {
        long j10 = (long) d10;
        double d11 = d10 - j10;
        long j11 = (long) (d11 * 60.0d);
        return j10 + "/1," + j11 + "/1," + Math.round((d11 - (j11 / 60.0d)) * 3600.0d * 1.0E7d) + "/10000000";
    }

    /* JADX WARN: Code duplicated, block: B:82:0x0213 A[Catch: all -> 0x007e, Exception -> 0x0082, TryCatch #5 {Exception -> 0x0082, all -> 0x007e, blocks: (B:7:0x004f, B:9:0x005b, B:11:0x006f, B:12:0x0071, B:80:0x01f7, B:82:0x0213, B:83:0x021c, B:19:0x0086, B:21:0x0095, B:23:0x009d, B:25:0x00a1, B:28:0x00b1, B:30:0x00bc, B:31:0x00c1, B:32:0x00c3, B:36:0x00d1, B:37:0x00d6, B:38:0x00da, B:39:0x00e6, B:41:0x00ee, B:45:0x00fc, B:47:0x0104, B:50:0x010b, B:52:0x011a, B:54:0x012a, B:69:0x0186, B:71:0x0192, B:72:0x0199, B:74:0x01d3, B:79:0x01f0, B:76:0x01e1, B:78:0x01e9, B:55:0x013e, B:56:0x0145, B:57:0x0146, B:59:0x0150, B:61:0x0156, B:65:0x016f, B:66:0x0177, B:67:0x017e), top: B:97:0x004f }] */
    /* JADX INFO: renamed from: f0 */
    public final void m7993f0(InputStream inputStream, OutputStream outputStream) throws Throwable {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int iM8012q0;
        boolean z10;
        if (f6075w) {
            Log.d("ExifInterface", "saveWebpAttributes starting with (inputStream: " + inputStream + ", outputStream: " + outputStream + ")");
        }
        ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
        b bVar = new b(inputStream, byteOrder);
        c cVar = new c(outputStream, byteOrder);
        byte[] bArr = f6039M;
        C1524b.m8060e(bVar, cVar, bArr.length);
        int i15 = bVar.readInt();
        byte[] bArr2 = f6040N;
        bVar.m8029f(bArr2.length);
        ByteArrayOutputStream byteArrayOutputStream = null;
        try {
            try {
                ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                try {
                    c cVar2 = new c(byteArrayOutputStream2, byteOrder);
                    int i16 = this.f6095p;
                    if (i16 == 0) {
                        byte[] bArr3 = new byte[4];
                        bVar.readFully(bArr3);
                        byte[] bArr4 = f6043Q;
                        boolean z11 = true;
                        if (Arrays.equals(bArr3, bArr4)) {
                            int i17 = bVar.readInt();
                            byte[] bArr5 = new byte[i17 % 2 == 1 ? i17 + 1 : i17];
                            bVar.readFully(bArr5);
                            byte b10 = (byte) (bArr5[0] | 8);
                            bArr5[0] = b10;
                            boolean z12 = ((b10 >> 1) & 1) == 1;
                            cVar2.write(bArr4);
                            cVar2.m8032c(i17);
                            cVar2.write(bArr5);
                            if (z12) {
                                m7995h(bVar, cVar2, f6046T, null);
                                while (true) {
                                    byte[] bArr6 = new byte[4];
                                    try {
                                        bVar.readFully(bArr6);
                                        z10 = !Arrays.equals(bArr6, f6047U);
                                    } catch (EOFException unused) {
                                        z10 = true;
                                    }
                                    if (z10) {
                                        break;
                                    } else {
                                        m7997i(bVar, cVar2, bArr6);
                                    }
                                }
                                iM8012q0 = m8012q0(cVar2);
                            } else {
                                m7995h(bVar, cVar2, f6045S, f6044R);
                                iM8012q0 = m8012q0(cVar2);
                            }
                        } else {
                            byte[] bArr7 = f6045S;
                            if (Arrays.equals(bArr3, bArr7) || Arrays.equals(bArr3, f6044R)) {
                                int i18 = bVar.readInt();
                                int i19 = i18 % 2 == 1 ? i18 + 1 : i18;
                                byte[] bArr8 = new byte[3];
                                if (Arrays.equals(bArr3, bArr7)) {
                                    bVar.readFully(bArr8);
                                    byte[] bArr9 = new byte[3];
                                    bVar.readFully(bArr9);
                                    if (!Arrays.equals(f6042P, bArr9)) {
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
                                    if (!Arrays.equals(bArr3, f6044R)) {
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
                                cVar2.m8032c(10);
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
                                cVar2.m8032c(i18);
                                if (Arrays.equals(bArr3, bArr7)) {
                                    cVar2.write(bArr8);
                                    cVar2.write(f6042P);
                                    cVar2.m8032c(i13);
                                } else if (Arrays.equals(bArr3, f6044R)) {
                                    cVar2.write(47);
                                    cVar2.m8032c(i13);
                                }
                                C1524b.m8060e(bVar, cVar2, i11);
                                iM8012q0 = m8012q0(cVar2);
                            } else {
                                iM8012q0 = -1;
                                i10 = -1;
                            }
                        }
                        C1524b.m8060e(bVar, cVar2, (i15 + 8) - bVar.m8025b());
                        int size = byteArrayOutputStream2.size();
                        byte[] bArr11 = f6040N;
                        cVar.m8032c(size + bArr11.length);
                        cVar.write(bArr11);
                        if (iM8012q0 != i10) {
                            this.f6095p = cVar.f6110a.size() + iM8012q0;
                        }
                        byteArrayOutputStream2.writeTo(cVar);
                        C1524b.m8059d(bVar, cVar);
                        C1524b.m8057b(byteArrayOutputStream2);
                    }
                    C1524b.m8060e(bVar, cVar2, (i16 - ((bArr.length + 4) + bArr2.length)) - 8);
                    bVar.m8029f(4);
                    int i24 = bVar.readInt();
                    if (i24 % 2 != 0) {
                        i24++;
                    }
                    bVar.m8029f(i24);
                    iM8012q0 = m8012q0(cVar2);
                    i10 = -1;
                    C1524b.m8060e(bVar, cVar2, (i15 + 8) - bVar.m8025b());
                    int size2 = byteArrayOutputStream2.size();
                    byte[] bArr12 = f6040N;
                    cVar.m8032c(size2 + bArr12.length);
                    cVar.write(bArr12);
                    if (iM8012q0 != i10) {
                        this.f6095p = cVar.f6110a.size() + iM8012q0;
                    }
                    byteArrayOutputStream2.writeTo(cVar);
                    C1524b.m8059d(bVar, cVar);
                    C1524b.m8057b(byteArrayOutputStream2);
                } catch (Exception e10) {
                    e = e10;
                    throw new IOException("Failed to save WebP file", e);
                } catch (Throwable th2) {
                    th = th2;
                    byteArrayOutputStream = byteArrayOutputStream2;
                    C1524b.m8057b(byteArrayOutputStream);
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (Exception e11) {
            e = e11;
        }
    }

    /* JADX INFO: renamed from: g0 */
    public void m7994g0(double d10) {
        String str = d10 >= 0.0d ? "0" : "1";
        m7996h0("GPSAltitude", f.m8053b(Math.abs(d10)).toString());
        m7996h0("GPSAltitudeRef", str);
    }

    /* JADX INFO: renamed from: h */
    public final void m7995h(b bVar, c cVar, byte[] bArr, byte[] bArr2) throws IOException {
        while (true) {
            byte[] bArr3 = new byte[4];
            bVar.readFully(bArr3);
            m7997i(bVar, cVar, bArr3);
            if (Arrays.equals(bArr3, bArr)) {
                return;
            }
            if (bArr2 != null && Arrays.equals(bArr3, bArr2)) {
                return;
            }
        }
    }

    /* JADX INFO: renamed from: h0 */
    public void m7996h0(String str, String str2) {
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
            if (f6075w) {
                Log.d("ExifInterface", "setAttribute: Replacing TAG_ISO_SPEED_RATINGS with TAG_PHOTOGRAPHIC_SENSITIVITY.");
            }
            str4 = "PhotographicSensitivity";
        }
        int i13 = 2;
        String str5 = "/";
        int i14 = 1;
        if (strReplaceAll != null) {
            if (f6067o0.contains(str4) && !strReplaceAll.contains("/")) {
                try {
                    strReplaceAll = f.m8053b(Double.parseDouble(strReplaceAll)).toString();
                } catch (NumberFormatException unused) {
                    Log.w("ExifInterface", "Invalid value for " + str4 + " : " + strReplaceAll);
                    return;
                }
            } else if (str4.equals("GPSTimeStamp")) {
                Matcher matcher = f6073u0.matcher(strReplaceAll);
                if (!matcher.find()) {
                    Log.w("ExifInterface", "Invalid value for " + str4 + " : " + strReplaceAll);
                    return;
                }
                strReplaceAll = Integer.parseInt(matcher.group(1)) + "/1," + Integer.parseInt(matcher.group(2)) + "/1," + Integer.parseInt(matcher.group(3)) + "/1";
            } else if ("DateTime".equals(str4) || "DateTimeOriginal".equals(str4) || "DateTimeDigitized".equals(str4)) {
                boolean zFind = f6074v0.matcher(strReplaceAll).find();
                boolean zFind2 = f6076w0.matcher(strReplaceAll).find();
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
            boolean z10 = this.f6085f[0].containsKey("Xmp") || this.f6085f[5].containsKey("Xmp");
            int iM7953C = m7953C(this.f6083d);
            if ((iM7953C == 2 && (this.f6100u != null || !z10)) || (iM7953C == 3 && !z10)) {
                this.f6100u = strReplaceAll != null ? d.m8036a(strReplaceAll) : null;
                return;
            }
        }
        int i16 = 0;
        while (i16 < f6063k0.length) {
            if ((i16 != 4 || this.f6088i) && (eVar = f6066n0[i16].get(str4)) != null) {
                if (strReplaceAll != null) {
                    Pair<Integer, Integer> pairM7954D = m7954D(strReplaceAll);
                    if (eVar.f6118c == ((Integer) pairM7954D.first).intValue() || eVar.f6118c == ((Integer) pairM7954D.second).intValue()) {
                        i10 = eVar.f6118c;
                    } else {
                        int i17 = eVar.f6119d;
                        if (i17 == -1 || !(i17 == ((Integer) pairM7954D.first).intValue() || eVar.f6119d == ((Integer) pairM7954D.second).intValue())) {
                            int i18 = eVar.f6118c;
                            if (i18 == i14 || i18 == 7 || i18 == i13) {
                                i10 = i18;
                            } else if (f6075w) {
                                StringBuilder sb2 = new StringBuilder();
                                sb2.append("Given tag (");
                                sb2.append(str4);
                                sb2.append(") value didn't match with one of expected formats: ");
                                String[] strArr = f6050X;
                                sb2.append(strArr[eVar.f6118c]);
                                sb2.append(eVar.f6119d == -1 ? "" : ", " + strArr[eVar.f6119d]);
                                sb2.append(" (guess: ");
                                sb2.append(strArr[((Integer) pairM7954D.first).intValue()]);
                                sb2.append(((Integer) pairM7954D.second).intValue() != -1 ? ", " + strArr[((Integer) pairM7954D.second).intValue()] : "");
                                sb2.append(")");
                                Log.d("ExifInterface", sb2.toString());
                            }
                        } else {
                            i10 = eVar.f6119d;
                        }
                    }
                    switch (i10) {
                        case 1:
                            str3 = str5;
                            i11 = i14;
                            i12 = i15;
                            this.f6085f[i16].put(str4, d.m8036a(strReplaceAll));
                            break;
                        case 2:
                        case 7:
                            str3 = str5;
                            i11 = i14;
                            i12 = i15;
                            this.f6085f[i16].put(str4, d.m8040e(strReplaceAll));
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
                            this.f6085f[i16].put(str4, d.m8046k(iArr, this.f6087h));
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
                            this.f6085f[i16].put(str4, d.m8042g(jArr, this.f6087h));
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
                            this.f6085f[i16].put(str4, d.m8044i(fVarArr, this.f6087h));
                            break;
                        case 6:
                        case 8:
                        case 11:
                        default:
                            if (f6075w) {
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
                            this.f6085f[i16].put(str4, d.m8038c(iArr2, this.f6087h));
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
                            this.f6085f[i16].put(str4, d.m8039d(fVarArr2, this.f6087h));
                            str3 = str5;
                            break;
                        case 12:
                            String[] strArrSplit8 = strReplaceAll.split(",", -1);
                            double[] dArr = new double[strArrSplit8.length];
                            for (int i26 = i15; i26 < strArrSplit8.length; i26++) {
                                dArr[i26] = Double.parseDouble(strArrSplit8[i26]);
                            }
                            this.f6085f[i16].put(str4, d.m8037b(dArr, this.f6087h));
                            break;
                    }
                } else {
                    this.f6085f[i16].remove(str4);
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

    /* JADX INFO: renamed from: i */
    public final void m7997i(b bVar, c cVar, byte[] bArr) throws IOException {
        int i10 = bVar.readInt();
        cVar.write(bArr);
        cVar.m8032c(i10);
        if (i10 % 2 == 1) {
            i10++;
        }
        C1524b.m8060e(bVar, cVar, i10);
    }

    /* JADX INFO: renamed from: i0 */
    public void m7998i0(Location location) {
        if (location == null) {
            return;
        }
        m7996h0("GPSProcessingMethod", location.getProvider());
        m8000j0(location.getLatitude(), location.getLongitude());
        m7994g0(location.getAltitude());
        m7996h0("GPSSpeedRef", "K");
        m7996h0("GPSSpeed", f.m8053b((location.getSpeed() * TimeUnit.HOURS.toSeconds(1L)) / 1000.0f).toString());
        String[] strArrSplit = f6048V.format(new Date(location.getTime())).split("\\s+", -1);
        m7996h0("GPSDateStamp", strArrSplit[0]);
        m7996h0("GPSTimeStamp", strArrSplit[1]);
    }

    /* JADX INFO: renamed from: j */
    public double m7999j(double d10) {
        double dM8003l = m8003l("GPSAltitude", -1.0d);
        int iM8004m = m8004m("GPSAltitudeRef", -1);
        if (dM8003l < 0.0d || iM8004m < 0) {
            return d10;
        }
        return dM8003l * ((double) (iM8004m != 1 ? 1 : -1));
    }

    /* JADX INFO: renamed from: j0 */
    public void m8000j0(double d10, double d11) {
        if (d10 < -90.0d || d10 > 90.0d || Double.isNaN(d10)) {
            throw new IllegalArgumentException("Latitude value " + d10 + " is not valid.");
        }
        if (d11 < -180.0d || d11 > 180.0d || Double.isNaN(d11)) {
            throw new IllegalArgumentException("Longitude value " + d11 + " is not valid.");
        }
        m7996h0("GPSLatitudeRef", d10 >= 0.0d ? "N" : "S");
        m7996h0("GPSLatitude", m7992f(Math.abs(d10)));
        m7996h0("GPSLongitudeRef", d11 >= 0.0d ? "E" : "W");
        m7996h0("GPSLongitude", m7992f(Math.abs(d11)));
    }

    /* JADX INFO: renamed from: k */
    public String m8001k(String str) {
        if (str == null) {
            throw new NullPointerException("tag shouldn't be null");
        }
        d dVarM8006n = m8006n(str);
        if (dVarM8006n == null) {
            return null;
        }
        if (!str.equals("GPSTimeStamp")) {
            if (!f6067o0.contains(str)) {
                return dVarM8006n.m8049n(this.f6087h);
            }
            try {
                return Double.toString(dVarM8006n.m8047l(this.f6087h));
            } catch (NumberFormatException unused) {
                return null;
            }
        }
        int i10 = dVarM8006n.f6112a;
        if (i10 != 5 && i10 != 10) {
            Log.w("ExifInterface", "GPS Timestamp format is not rational. format=" + dVarM8006n.f6112a);
            return null;
        }
        f[] fVarArr = (f[]) dVarM8006n.m8050o(this.f6087h);
        if (fVarArr == null || fVarArr.length != 3) {
            Log.w("ExifInterface", "Invalid GPS Timestamp array. array=" + Arrays.toString(fVarArr));
            return null;
        }
        f fVar = fVarArr[0];
        Integer numValueOf = Integer.valueOf((int) (fVar.f6120a / fVar.f6121b));
        f fVar2 = fVarArr[1];
        Integer numValueOf2 = Integer.valueOf((int) (fVar2.f6120a / fVar2.f6121b));
        f fVar3 = fVarArr[2];
        return String.format("%02d:%02d:%02d", numValueOf, numValueOf2, Integer.valueOf((int) (fVar3.f6120a / fVar3.f6121b)));
    }

    /* JADX INFO: renamed from: k0 */
    public final void m8002k0(b bVar) throws Throwable {
        HashMap<String, d> map = this.f6085f[4];
        d dVar = map.get("Compression");
        if (dVar == null) {
            this.f6094o = 6;
            m7967E(bVar, map);
            return;
        }
        int iM8048m = dVar.m8048m(this.f6087h);
        this.f6094o = iM8048m;
        if (iM8048m != 1) {
            if (iM8048m == 6) {
                m7967E(bVar, map);
                return;
            } else if (iM8048m != 7) {
                return;
            }
        }
        if (m7976P(map)) {
            m7968F(bVar, map);
        }
    }

    /* JADX INFO: renamed from: l */
    public double m8003l(String str, double d10) {
        if (str == null) {
            throw new NullPointerException("tag shouldn't be null");
        }
        d dVarM8006n = m8006n(str);
        if (dVarM8006n != null) {
            try {
                return dVarM8006n.m8047l(this.f6087h);
            } catch (NumberFormatException unused) {
            }
        }
        return d10;
    }

    /* JADX INFO: renamed from: m */
    public int m8004m(String str, int i10) {
        if (str == null) {
            throw new NullPointerException("tag shouldn't be null");
        }
        d dVarM8006n = m8006n(str);
        if (dVarM8006n != null) {
            try {
                return dVarM8006n.m8048m(this.f6087h);
            } catch (NumberFormatException unused) {
            }
        }
        return i10;
    }

    /* JADX INFO: renamed from: m0 */
    public final void m8005m0(int i10, int i11) throws Throwable {
        if (this.f6085f[i10].isEmpty() || this.f6085f[i11].isEmpty()) {
            if (f6075w) {
                Log.d("ExifInterface", "Cannot perform swap since only one image data exists");
                return;
            }
            return;
        }
        d dVar = this.f6085f[i10].get("ImageLength");
        d dVar2 = this.f6085f[i10].get("ImageWidth");
        d dVar3 = this.f6085f[i11].get("ImageLength");
        d dVar4 = this.f6085f[i11].get("ImageWidth");
        if (dVar == null || dVar2 == null) {
            if (f6075w) {
                Log.d("ExifInterface", "First image does not contain valid size information");
                return;
            }
            return;
        }
        if (dVar3 == null || dVar4 == null) {
            if (f6075w) {
                Log.d("ExifInterface", "Second image does not contain valid size information");
                return;
            }
            return;
        }
        int iM8048m = dVar.m8048m(this.f6087h);
        int iM8048m2 = dVar2.m8048m(this.f6087h);
        int iM8048m3 = dVar3.m8048m(this.f6087h);
        int iM8048m4 = dVar4.m8048m(this.f6087h);
        if (iM8048m >= iM8048m3 || iM8048m2 >= iM8048m4) {
            return;
        }
        HashMap<String, d>[] mapArr = this.f6085f;
        HashMap<String, d> map = mapArr[i10];
        mapArr[i10] = mapArr[i11];
        mapArr[i11] = map;
    }

    /* JADX INFO: renamed from: n */
    public final d m8006n(String str) {
        d dVar;
        d dVar2;
        if (str == null) {
            throw new NullPointerException("tag shouldn't be null");
        }
        if ("ISOSpeedRatings".equals(str)) {
            if (f6075w) {
                Log.d("ExifInterface", "getExifAttribute: Replacing TAG_ISO_SPEED_RATINGS with TAG_PHOTOGRAPHIC_SENSITIVITY.");
            }
            str = "PhotographicSensitivity";
        }
        if ("Xmp".equals(str) && m7953C(this.f6083d) == 2 && (dVar2 = this.f6100u) != null) {
            return dVar2;
        }
        for (int i10 = 0; i10 < f6063k0.length; i10++) {
            d dVar3 = this.f6085f[i10].get(str);
            if (dVar3 != null) {
                return dVar3;
            }
        }
        if (!"Xmp".equals(str) || (dVar = this.f6100u) == null) {
            return null;
        }
        return dVar;
    }

    /* JADX INFO: renamed from: o */
    public final void m8007o(g gVar, int i10) {
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
                C1524b.a.m8062a(mediaMetadataRetriever, new a(gVar));
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
                    this.f6085f[0].put("ImageWidth", d.m8045j(Integer.parseInt(strExtractMetadata), this.f6087h));
                }
                if (strExtractMetadata3 != null) {
                    this.f6085f[0].put("ImageLength", d.m8045j(Integer.parseInt(strExtractMetadata3), this.f6087h));
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
                    this.f6085f[0].put("Orientation", d.m8045j(i11, this.f6087h));
                }
                if (strExtractMetadata4 != null && strExtractMetadata5 != null) {
                    int i14 = Integer.parseInt(strExtractMetadata4);
                    int i15 = Integer.parseInt(strExtractMetadata5);
                    if (i15 <= 6) {
                        throw new IOException("Invalid exif length");
                    }
                    gVar.m8055g(i14);
                    byte[] bArr = new byte[6];
                    gVar.readFully(bArr);
                    int i16 = i14 + 6;
                    int i17 = i15 - 6;
                    if (!Arrays.equals(bArr, f6070r0)) {
                        throw new IOException("Invalid identifier");
                    }
                    byte[] bArr2 = new byte[i17];
                    gVar.readFully(bArr2);
                    this.f6095p = i16;
                    m7983X(bArr2, 0);
                }
                String strExtractMetadata8 = mediaMetadataRetriever.extractMetadata(41);
                String strExtractMetadata9 = mediaMetadataRetriever.extractMetadata(42);
                if (strExtractMetadata8 != null && strExtractMetadata9 != null) {
                    int i18 = Integer.parseInt(strExtractMetadata8);
                    int i19 = Integer.parseInt(strExtractMetadata9);
                    long j10 = i18;
                    gVar.m8055g(j10);
                    byte[] bArr3 = new byte[i19];
                    gVar.readFully(bArr3);
                    this.f6100u = new d(1, i19, j10, bArr3);
                    this.f6101v = true;
                }
                if (f6075w) {
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

    /* JADX INFO: renamed from: o0 */
    public final void m8008o0(g gVar, int i10) throws Throwable {
        d dVarM8045j;
        d dVarM8045j2;
        d dVar = this.f6085f[i10].get("DefaultCropSize");
        d dVar2 = this.f6085f[i10].get("SensorTopBorder");
        d dVar3 = this.f6085f[i10].get("SensorLeftBorder");
        d dVar4 = this.f6085f[i10].get("SensorBottomBorder");
        d dVar5 = this.f6085f[i10].get("SensorRightBorder");
        if (dVar == null) {
            if (dVar2 == null || dVar3 == null || dVar4 == null || dVar5 == null) {
                m7987b0(gVar, i10);
                return;
            }
            int iM8048m = dVar2.m8048m(this.f6087h);
            int iM8048m2 = dVar4.m8048m(this.f6087h);
            int iM8048m3 = dVar5.m8048m(this.f6087h);
            int iM8048m4 = dVar3.m8048m(this.f6087h);
            if (iM8048m2 <= iM8048m || iM8048m3 <= iM8048m4) {
                return;
            }
            d dVarM8045j3 = d.m8045j(iM8048m2 - iM8048m, this.f6087h);
            d dVarM8045j4 = d.m8045j(iM8048m3 - iM8048m4, this.f6087h);
            this.f6085f[i10].put("ImageLength", dVarM8045j3);
            this.f6085f[i10].put("ImageWidth", dVarM8045j4);
            return;
        }
        if (dVar.f6112a == 5) {
            f[] fVarArr = (f[]) dVar.m8050o(this.f6087h);
            if (fVarArr == null || fVarArr.length != 2) {
                Log.w("ExifInterface", "Invalid crop size values. cropSize=" + Arrays.toString(fVarArr));
                return;
            }
            dVarM8045j = d.m8043h(fVarArr[0], this.f6087h);
            dVarM8045j2 = d.m8043h(fVarArr[1], this.f6087h);
        } else {
            int[] iArr = (int[]) dVar.m8050o(this.f6087h);
            if (iArr == null || iArr.length != 2) {
                Log.w("ExifInterface", "Invalid crop size values. cropSize=" + Arrays.toString(iArr));
                return;
            }
            dVarM8045j = d.m8045j(iArr[0], this.f6087h);
            dVarM8045j2 = d.m8045j(iArr[1], this.f6087h);
        }
        this.f6085f[i10].put("ImageWidth", dVarM8045j);
        this.f6085f[i10].put("ImageLength", dVarM8045j2);
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
        	at java.base/java.util.Collections$UnmodifiableCollection.add(Collections.java:1068)
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
    /* JADX INFO: renamed from: p */
    public final void m8009p(p040c4.C1523a.b r21, int r22, int r23) throws java.lang.Throwable {
        /*
            r20 = this;
            r0 = r20
            r1 = r21
            r2 = r23
            boolean r3 = p040c4.C1523a.f6075w
            java.lang.String r4 = "ExifInterface"
            if (r3 == 0) goto L20
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r5 = "getJpegAttributes starting with: "
            r3.append(r5)
            r3.append(r1)
            java.lang.String r3 = r3.toString()
            android.util.Log.d(r4, r3)
        L20:
            java.nio.ByteOrder r3 = java.nio.ByteOrder.BIG_ENDIAN
            r1.m8028e(r3)
            byte r3 = r1.readByte()
            java.lang.String r5 = "Invalid marker: "
            r6 = -1
            if (r3 != r6) goto L1a9
            byte r7 = r1.readByte()
            r8 = -40
            if (r7 != r8) goto L18e
            r3 = 2
        L37:
            byte r5 = r1.readByte()
            if (r5 != r6) goto L171
            byte r5 = r1.readByte()
            boolean r7 = p040c4.C1523a.f6075w
            if (r7 == 0) goto L5f
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = "Found JPEG segment indicator: "
            r8.append(r9)
            r9 = r5 & 255(0xff, float:3.57E-43)
            java.lang.String r9 = java.lang.Integer.toHexString(r9)
            r8.append(r9)
            java.lang.String r8 = r8.toString()
            android.util.Log.d(r4, r8)
        L5f:
            r8 = -39
            if (r5 == r8) goto L16b
            r8 = -38
            if (r5 != r8) goto L69
            goto L16b
        L69:
            int r8 = r1.readUnsignedShort()
            int r9 = r8 + (-2)
            r10 = 4
            int r3 = r3 + r10
            if (r7 == 0) goto L9a
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r11 = "JPEG segment: "
            r7.append(r11)
            r11 = r5 & 255(0xff, float:3.57E-43)
            java.lang.String r11 = java.lang.Integer.toHexString(r11)
            r7.append(r11)
            java.lang.String r11 = " (length: "
            r7.append(r11)
            r7.append(r8)
            java.lang.String r11 = ")"
            r7.append(r11)
            java.lang.String r7 = r7.toString()
            android.util.Log.d(r4, r7)
        L9a:
            java.lang.String r7 = "Invalid length"
            if (r9 < 0) goto L165
            r11 = -31
            r12 = 0
            r13 = 1
            if (r5 == r11) goto L10e
            r11 = -2
            if (r5 == r11) goto Led
            switch(r5) {
                case -64: goto Lb5;
                case -63: goto Lb5;
                case -62: goto Lb5;
                case -61: goto Lb5;
                default: goto Laa;
            }
        Laa:
            switch(r5) {
                case -59: goto Lb5;
                case -58: goto Lb5;
                case -57: goto Lb5;
                default: goto Lad;
            }
        Lad:
            switch(r5) {
                case -55: goto Lb5;
                case -54: goto Lb5;
                case -53: goto Lb5;
                default: goto Lb0;
            }
        Lb0:
            switch(r5) {
                case -51: goto Lb5;
                case -50: goto Lb5;
                case -49: goto Lb5;
                default: goto Lb3;
            }
        Lb3:
            goto L157
        Lb5:
            r1.m8029f(r13)
            java.util.HashMap<java.lang.String, c4.a$d>[] r5 = r0.f6085f
            r5 = r5[r2]
            if (r2 == r10) goto Lc1
            java.lang.String r9 = "ImageLength"
            goto Lc3
        Lc1:
            java.lang.String r9 = "ThumbnailImageLength"
        Lc3:
            int r11 = r1.readUnsignedShort()
            long r11 = (long) r11
            java.nio.ByteOrder r13 = r0.f6087h
            c4.a$d r11 = p040c4.C1523a.d.m8041f(r11, r13)
            r5.put(r9, r11)
            java.util.HashMap<java.lang.String, c4.a$d>[] r5 = r0.f6085f
            r5 = r5[r2]
            if (r2 == r10) goto Lda
            java.lang.String r9 = "ImageWidth"
            goto Ldc
        Lda:
            java.lang.String r9 = "ThumbnailImageWidth"
        Ldc:
            int r10 = r1.readUnsignedShort()
            long r10 = (long) r10
            java.nio.ByteOrder r12 = r0.f6087h
            c4.a$d r10 = p040c4.C1523a.d.m8041f(r10, r12)
            r5.put(r9, r10)
            int r9 = r8 + (-7)
            goto L157
        Led:
            byte[] r5 = new byte[r9]
            r1.readFully(r5)
            java.lang.String r8 = "UserComment"
            java.lang.String r9 = r0.m8001k(r8)
            if (r9 != 0) goto L10c
            java.util.HashMap<java.lang.String, c4.a$d>[] r9 = r0.f6085f
            r9 = r9[r13]
            java.lang.String r10 = new java.lang.String
            java.nio.charset.Charset r11 = p040c4.C1523a.f6069q0
            r10.<init>(r5, r11)
            c4.a$d r5 = p040c4.C1523a.d.m8040e(r10)
            r9.put(r8, r5)
        L10c:
            r9 = r12
            goto L157
        L10e:
            byte[] r5 = new byte[r9]
            r1.readFully(r5)
            int r8 = r3 + r9
            byte[] r10 = p040c4.C1523a.f6070r0
            boolean r11 = p040c4.C1524b.m8061f(r5, r10)
            if (r11 == 0) goto L134
            int r11 = r10.length
            byte[] r5 = java.util.Arrays.copyOfRange(r5, r11, r9)
            int r3 = r22 + r3
            int r9 = r10.length
            int r3 = r3 + r9
            r0.f6095p = r3
            r0.m7983X(r5, r2)
            c4.a$b r3 = new c4.a$b
            r3.<init>(r5)
            r0.m8002k0(r3)
            goto L155
        L134:
            byte[] r10 = p040c4.C1523a.f6071s0
            boolean r11 = p040c4.C1524b.m8061f(r5, r10)
            if (r11 == 0) goto L155
            int r11 = r10.length
            int r3 = r3 + r11
            int r10 = r10.length
            byte[] r5 = java.util.Arrays.copyOfRange(r5, r10, r9)
            c4.a$d r14 = new c4.a$d
            int r9 = r5.length
            long r10 = (long) r3
            r15 = 1
            r19 = r5
            r16 = r9
            r17 = r10
            r14.<init>(r15, r16, r17, r19)
            r0.f6100u = r14
            r0.f6101v = r13
        L155:
            r3 = r8
            goto L10c
        L157:
            if (r9 < 0) goto L15f
            r1.m8029f(r9)
            int r3 = r3 + r9
            goto L37
        L15f:
            java.io.IOException r1 = new java.io.IOException
            r1.<init>(r7)
            throw r1
        L165:
            java.io.IOException r1 = new java.io.IOException
            r1.<init>(r7)
            throw r1
        L16b:
            java.nio.ByteOrder r2 = r0.f6087h
            r1.m8028e(r2)
            return
        L171:
            java.io.IOException r1 = new java.io.IOException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Invalid marker:"
            r2.append(r3)
            r3 = r5 & 255(0xff, float:3.57E-43)
            java.lang.String r3 = java.lang.Integer.toHexString(r3)
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L18e:
            java.io.IOException r1 = new java.io.IOException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r5)
            r3 = r3 & 255(0xff, float:3.57E-43)
            java.lang.String r3 = java.lang.Integer.toHexString(r3)
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L1a9:
            java.io.IOException r1 = new java.io.IOException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r5)
            r3 = r3 & 255(0xff, float:3.57E-43)
            java.lang.String r3 = java.lang.Integer.toHexString(r3)
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p040c4.C1523a.m8009p(c4.a$b, int, int):void");
    }

    /* JADX INFO: renamed from: p0 */
    public final void m8010p0() throws Throwable {
        m8005m0(0, 5);
        m8005m0(0, 4);
        m8005m0(5, 4);
        d dVar = this.f6085f[1].get("PixelXDimension");
        d dVar2 = this.f6085f[1].get("PixelYDimension");
        if (dVar != null && dVar2 != null) {
            this.f6085f[0].put("ImageWidth", dVar);
            this.f6085f[0].put("ImageLength", dVar2);
        }
        if (this.f6085f[4].isEmpty() && m7977R(this.f6085f[5])) {
            HashMap<String, d>[] mapArr = this.f6085f;
            mapArr[4] = mapArr[5];
            mapArr[5] = new HashMap<>();
        }
        if (!m7977R(this.f6085f[4])) {
            Log.d("ExifInterface", "No image meets the size requirements of a thumbnail image.");
        }
        m7986a0(0, "ThumbnailOrientation", "Orientation");
        m7986a0(0, "ThumbnailImageLength", "ImageLength");
        m7986a0(0, "ThumbnailImageWidth", "ImageWidth");
        m7986a0(5, "ThumbnailOrientation", "Orientation");
        m7986a0(5, "ThumbnailImageLength", "ImageLength");
        m7986a0(5, "ThumbnailImageWidth", "ImageWidth");
        m7986a0(4, "Orientation", "ThumbnailOrientation");
        m7986a0(4, "ImageLength", "ThumbnailImageLength");
        m7986a0(4, "ImageWidth", "ThumbnailImageWidth");
    }

    /* JADX INFO: renamed from: q */
    public double[] m8011q() {
        String strM8001k = m8001k("GPSLatitude");
        String strM8001k2 = m8001k("GPSLatitudeRef");
        String strM8001k3 = m8001k("GPSLongitude");
        String strM8001k4 = m8001k("GPSLongitudeRef");
        if (strM8001k == null || strM8001k2 == null || strM8001k3 == null || strM8001k4 == null) {
            return null;
        }
        try {
            return new double[]{m7962g(strM8001k, strM8001k2), m7962g(strM8001k3, strM8001k4)};
        } catch (IllegalArgumentException unused) {
            Log.w("ExifInterface", "Latitude/longitude values are not parsable. " + String.format("latValue=%s, latRef=%s, lngValue=%s, lngRef=%s", strM8001k, strM8001k2, strM8001k3, strM8001k4));
            return null;
        }
    }

    /* JADX INFO: renamed from: q0 */
    public final int m8012q0(c cVar) throws IOException {
        long j10;
        e[][] eVarArr = f6063k0;
        int[] iArr = new int[eVarArr.length];
        int[] iArr2 = new int[eVarArr.length];
        for (e eVar : f6064l0) {
            m7985Z(eVar.f6117b);
        }
        if (this.f6088i) {
            if (this.f6089j) {
                m7985Z("StripOffsets");
                m7985Z("StripByteCounts");
            } else {
                m7985Z("JPEGInterchangeFormat");
                m7985Z("JPEGInterchangeFormatLength");
            }
        }
        for (int i10 = 0; i10 < f6063k0.length; i10++) {
            Iterator<Map.Entry<String, d>> it = this.f6085f[i10].entrySet().iterator();
            while (it.hasNext()) {
                if (it.next().getValue() == null) {
                    it.remove();
                }
            }
        }
        long j11 = 0;
        if (!this.f6085f[1].isEmpty()) {
            this.f6085f[0].put(f6064l0[1].f6117b, d.m8041f(0L, this.f6087h));
        }
        if (!this.f6085f[2].isEmpty()) {
            this.f6085f[0].put(f6064l0[2].f6117b, d.m8041f(0L, this.f6087h));
        }
        if (!this.f6085f[3].isEmpty()) {
            this.f6085f[1].put(f6064l0[3].f6117b, d.m8041f(0L, this.f6087h));
        }
        if (this.f6088i) {
            if (this.f6089j) {
                this.f6085f[4].put("StripOffsets", d.m8045j(0, this.f6087h));
                this.f6085f[4].put("StripByteCounts", d.m8045j(this.f6092m, this.f6087h));
            } else {
                this.f6085f[4].put("JPEGInterchangeFormat", d.m8041f(0L, this.f6087h));
                this.f6085f[4].put("JPEGInterchangeFormatLength", d.m8041f(this.f6092m, this.f6087h));
            }
        }
        for (int i11 = 0; i11 < f6063k0.length; i11++) {
            Iterator<Map.Entry<String, d>> it2 = this.f6085f[i11].entrySet().iterator();
            int i12 = 0;
            while (it2.hasNext()) {
                int iM8051p = it2.next().getValue().m8051p();
                if (iM8051p > 4) {
                    i12 += iM8051p;
                }
            }
            iArr2[i11] = iArr2[i11] + i12;
        }
        int size = 8;
        for (int i13 = 0; i13 < f6063k0.length; i13++) {
            if (!this.f6085f[i13].isEmpty()) {
                iArr[i13] = size;
                size += (this.f6085f[i13].size() * 12) + 6 + iArr2[i13];
            }
        }
        if (this.f6088i) {
            if (this.f6089j) {
                this.f6085f[4].put("StripOffsets", d.m8045j(size, this.f6087h));
            } else {
                this.f6085f[4].put("JPEGInterchangeFormat", d.m8041f(size, this.f6087h));
            }
            this.f6091l = size;
            size += this.f6092m;
        }
        if (this.f6083d == 4) {
            size += 8;
        }
        if (f6075w) {
            for (int i14 = 0; i14 < f6063k0.length; i14++) {
                Log.d("ExifInterface", String.format("index: %d, offsets: %d, tag count: %d, data sizes: %d, total size: %d", Integer.valueOf(i14), Integer.valueOf(iArr[i14]), Integer.valueOf(this.f6085f[i14].size()), Integer.valueOf(iArr2[i14]), Integer.valueOf(size)));
            }
        }
        if (!this.f6085f[1].isEmpty()) {
            this.f6085f[0].put(f6064l0[1].f6117b, d.m8041f(iArr[1], this.f6087h));
        }
        if (!this.f6085f[r13].isEmpty()) {
            this.f6085f[0].put(f6064l0[r13].f6117b, d.m8041f(iArr[2], this.f6087h));
        }
        if (!this.f6085f[r14].isEmpty()) {
            this.f6085f[1].put(f6064l0[r14].f6117b, d.m8041f(iArr[3], this.f6087h));
        }
        int i15 = this.f6083d;
        if (i15 == 4) {
            if (size > 65535) {
                throw new IllegalStateException("Size of exif data (" + size + " bytes) exceeds the max size of a JPEG APP1 segment (65536 bytes)");
            }
            cVar.m8035f(size);
            cVar.write(f6070r0);
        } else if (i15 == 13) {
            cVar.m8032c(size);
            cVar.m8032c(1700284774);
        } else if (i15 == 14) {
            cVar.write(f6041O);
            cVar.m8032c(size);
        }
        int size2 = cVar.f6110a.size();
        cVar.m8033d(this.f6087h == ByteOrder.BIG_ENDIAN ? (short) 19789 : (short) 18761);
        cVar.m8030a(this.f6087h);
        cVar.m8035f(42);
        cVar.m8034e(8L);
        int i16 = 0;
        while (i16 < f6063k0.length) {
            if (this.f6085f[i16].isEmpty()) {
                j10 = j11;
            } else {
                cVar.m8035f(this.f6085f[i16].size());
                int size3 = iArr[i16] + 2 + (this.f6085f[i16].size() * 12) + 4;
                for (Map.Entry<String, d> entry : this.f6085f[i16].entrySet()) {
                    int i17 = f6066n0[i16].get(entry.getKey()).f6116a;
                    d value = entry.getValue();
                    int iM8051p2 = value.m8051p();
                    cVar.m8035f(i17);
                    cVar.m8035f(value.f6112a);
                    cVar.m8032c(value.f6113b);
                    if (iM8051p2 > 4) {
                        cVar.m8034e(size3);
                        size3 += iM8051p2;
                    } else {
                        cVar.write(value.f6115d);
                        if (iM8051p2 < 4) {
                            while (iM8051p2 < 4) {
                                cVar.m8031b(0);
                                iM8051p2++;
                            }
                        }
                    }
                }
                if (i16 != 0 || this.f6085f[4].isEmpty()) {
                    j10 = 0;
                    cVar.m8034e(0L);
                } else {
                    cVar.m8034e(iArr[4]);
                    j10 = 0;
                }
                Iterator<Map.Entry<String, d>> it3 = this.f6085f[i16].entrySet().iterator();
                while (it3.hasNext()) {
                    byte[] bArr = it3.next().getValue().f6115d;
                    if (bArr.length > 4) {
                        cVar.write(bArr, 0, bArr.length);
                    }
                }
            }
            i16++;
            j11 = j10;
        }
        if (this.f6088i) {
            cVar.write(m7965A());
        }
        if (this.f6083d == 14 && size % 2 == 1) {
            cVar.m8031b(0);
        }
        cVar.m8030a(ByteOrder.BIG_ENDIAN);
        return size2;
    }

    /* JADX INFO: renamed from: r */
    public final int m8013r(BufferedInputStream bufferedInputStream) throws Throwable {
        bufferedInputStream.mark(BacktraceANRSettings.DEFAULT_ANR_TIMEOUT);
        byte[] bArr = new byte[BacktraceANRSettings.DEFAULT_ANR_TIMEOUT];
        bufferedInputStream.read(bArr);
        bufferedInputStream.reset();
        if (m7955J(bArr)) {
            return 4;
        }
        if (m7974M(bArr)) {
            return 9;
        }
        int iM7971I = m7971I(bArr);
        if (iM7971I != 0) {
            return iM7971I;
        }
        if (m7972K(bArr)) {
            return 7;
        }
        if (m7975N(bArr)) {
            return 10;
        }
        if (m7973L(bArr)) {
            return 13;
        }
        return m7978S(bArr) ? 14 : 0;
    }

    /* JADX INFO: renamed from: r0 */
    public final void m8014r0(c cVar) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        this.f6095p = cVar.f6110a.size() + m8012q0(new c(byteArrayOutputStream, ByteOrder.BIG_ENDIAN));
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        cVar.write(byteArray);
        CRC32 crc32 = new CRC32();
        crc32.update(byteArray, 4, byteArray.length - 4);
        cVar.m8032c((int) crc32.getValue());
    }

    /* JADX INFO: renamed from: s */
    public final void m8015s(g gVar) throws Throwable {
        int i10;
        int i11;
        m8019v(gVar);
        d dVar = this.f6085f[1].get("MakerNote");
        if (dVar != null) {
            g gVar2 = new g(dVar.f6115d);
            gVar2.m8028e(this.f6087h);
            byte[] bArr = f6035I;
            byte[] bArr2 = new byte[bArr.length];
            gVar2.readFully(bArr2);
            gVar2.m8055g(0L);
            byte[] bArr3 = f6036J;
            byte[] bArr4 = new byte[bArr3.length];
            gVar2.readFully(bArr4);
            if (Arrays.equals(bArr2, bArr)) {
                gVar2.m8055g(8L);
            } else if (Arrays.equals(bArr4, bArr3)) {
                gVar2.m8055g(12L);
            }
            m7984Y(gVar2, 6);
            d dVar2 = this.f6085f[7].get("PreviewImageStart");
            d dVar3 = this.f6085f[7].get("PreviewImageLength");
            if (dVar2 != null && dVar3 != null) {
                this.f6085f[5].put("JPEGInterchangeFormat", dVar2);
                this.f6085f[5].put("JPEGInterchangeFormatLength", dVar3);
            }
            d dVar4 = this.f6085f[8].get("AspectFrame");
            if (dVar4 != null) {
                int[] iArr = (int[]) dVar4.m8050o(this.f6087h);
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
                d dVarM8045j = d.m8045j(i14, this.f6087h);
                d dVarM8045j2 = d.m8045j(i15, this.f6087h);
                this.f6085f[0].put("ImageWidth", dVarM8045j);
                this.f6085f[0].put("ImageLength", dVarM8045j2);
            }
        }
    }

    /* JADX INFO: renamed from: s0 */
    public final void m8016s0(c cVar) throws IOException {
        cVar.m8032c(this.f6100u.f6115d.length + 22);
        CRC32 crc32 = new CRC32();
        cVar.m8032c(1767135348);
        m7964n0(crc32, 1767135348);
        byte[] bArr = f6038L;
        cVar.write(bArr);
        crc32.update(bArr);
        cVar.write(this.f6100u.f6115d);
        crc32.update(this.f6100u.f6115d);
        cVar.m8032c((int) crc32.getValue());
        this.f6101v = true;
    }

    /* JADX INFO: renamed from: t */
    public final void m8017t(b bVar) throws Throwable {
        if (f6075w) {
            Log.d("ExifInterface", "getPngAttributes starting with: " + bVar);
        }
        bVar.m8028e(ByteOrder.BIG_ENDIAN);
        int iM8025b = bVar.m8025b();
        bVar.m8029f(f6037K.length);
        boolean z10 = false;
        boolean z11 = false;
        while (true) {
            if (z10 && z11) {
                break;
            }
            try {
                int i10 = bVar.readInt();
                int i11 = bVar.readInt();
                int iM8025b2 = bVar.m8025b() + i10 + 4;
                if (bVar.m8025b() - iM8025b == 16 && i11 != 1229472850) {
                    throw new IOException("Encountered invalid PNG file--IHDR chunk should appear as the first chunk");
                }
                if (i11 == 1229278788) {
                    break;
                }
                if (i11 == 1700284774 && !z10) {
                    this.f6095p = bVar.m8025b() - iM8025b;
                    byte[] bArr = new byte[i10];
                    bVar.readFully(bArr);
                    int i12 = bVar.readInt();
                    CRC32 crc32 = new CRC32();
                    m7964n0(crc32, i11);
                    crc32.update(bArr);
                    if (((int) crc32.getValue()) != i12) {
                        throw new IOException("Encountered invalid CRC value for PNG-EXIF chunk.\n recorded CRC value: " + i12 + ", calculated CRC value: " + crc32.getValue());
                    }
                    m7983X(bArr, 0);
                    m8010p0();
                    m8002k0(new b(bArr));
                    z10 = true;
                } else if (i11 == 1767135348 && !z11) {
                    byte[] bArr2 = f6038L;
                    if (i10 >= bArr2.length) {
                        int length = bArr2.length;
                        byte[] bArr3 = new byte[length];
                        bVar.readFully(bArr3);
                        if (Arrays.equals(bArr3, bArr2)) {
                            int iM8025b3 = bVar.m8025b() - iM8025b;
                            int i13 = i10 - length;
                            byte[] bArr4 = new byte[i13];
                            bVar.readFully(bArr4);
                            this.f6100u = new d(1, i13, iM8025b3, bArr4);
                            z11 = true;
                        }
                    }
                }
                bVar.m8029f(iM8025b2 - bVar.m8025b());
            } catch (EOFException e10) {
                throw new IOException("Encountered corrupt PNG file.", e10);
            }
        }
        this.f6101v = z11;
    }

    /* JADX INFO: renamed from: u */
    public final void m8018u(b bVar) throws Throwable {
        boolean z10 = f6075w;
        if (z10) {
            Log.d("ExifInterface", "getRafAttributes starting with: " + bVar);
        }
        bVar.m8029f(84);
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
        bVar.m8029f(i10 - bVar.m8025b());
        bVar.readFully(bArr4);
        m8009p(new b(bArr4), i10, 5);
        bVar.m8029f(i12 - bVar.m8025b());
        bVar.m8028e(ByteOrder.BIG_ENDIAN);
        int i13 = bVar.readInt();
        if (z10) {
            Log.d("ExifInterface", "numberOfDirectoryEntry: " + i13);
        }
        for (int i14 = 0; i14 < i13; i14++) {
            int unsignedShort = bVar.readUnsignedShort();
            int unsignedShort2 = bVar.readUnsignedShort();
            if (unsignedShort == f6058f0.f6116a) {
                short s8 = bVar.readShort();
                short s10 = bVar.readShort();
                d dVarM8045j = d.m8045j(s8, this.f6087h);
                d dVarM8045j2 = d.m8045j(s10, this.f6087h);
                this.f6085f[0].put("ImageLength", dVarM8045j);
                this.f6085f[0].put("ImageWidth", dVarM8045j2);
                if (f6075w) {
                    Log.d("ExifInterface", "Updated to length: " + ((int) s8) + ", width: " + ((int) s10));
                    return;
                }
                return;
            }
            bVar.m8029f(unsignedShort2);
        }
    }

    /* JADX INFO: renamed from: v */
    public final void m8019v(g gVar) throws Throwable {
        d dVar;
        m7980U(gVar);
        m7984Y(gVar, 0);
        m8008o0(gVar, 0);
        m8008o0(gVar, 5);
        m8008o0(gVar, 4);
        m8010p0();
        if (this.f6083d != 8 || (dVar = this.f6085f[1].get("MakerNote")) == null) {
            return;
        }
        g gVar2 = new g(dVar.f6115d);
        gVar2.m8028e(this.f6087h);
        gVar2.m8029f(6);
        m7984Y(gVar2, 9);
        d dVar2 = this.f6085f[9].get("ColorSpace");
        if (dVar2 != null) {
            this.f6085f[1].put("ColorSpace", dVar2);
        }
    }

    /* JADX INFO: renamed from: w */
    public int m8020w() {
        switch (m8004m("Orientation", 1)) {
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

    /* JADX INFO: renamed from: x */
    public final void m8021x(g gVar) throws Throwable {
        if (f6075w) {
            Log.d("ExifInterface", "getRw2Attributes starting with: " + gVar);
        }
        m8019v(gVar);
        d dVar = this.f6085f[0].get("JpgFromRaw");
        if (dVar != null) {
            m8009p(new b(dVar.f6115d), (int) dVar.f6114c, 5);
        }
        d dVar2 = this.f6085f[0].get("ISO");
        d dVar3 = this.f6085f[1].get("PhotographicSensitivity");
        if (dVar2 == null || dVar3 != null) {
            return;
        }
        this.f6085f[1].put("PhotographicSensitivity", dVar2);
    }

    /* JADX INFO: renamed from: y */
    public final boolean m8022y(g gVar) throws IOException {
        byte[] bArr = f6070r0;
        byte[] bArr2 = new byte[bArr.length];
        gVar.readFully(bArr2);
        if (!Arrays.equals(bArr2, bArr)) {
            Log.w("ExifInterface", "Given data is not EXIF-only.");
            return false;
        }
        byte[] bArrM8026c = gVar.m8026c();
        this.f6095p = bArr.length;
        m7983X(bArrM8026c, 0);
        return true;
    }

    /* JADX INFO: renamed from: z */
    public byte[] m8023z() {
        int i10 = this.f6094o;
        if (i10 == 6 || i10 == 7) {
            return m7965A();
        }
        return null;
    }

    /* JADX INFO: renamed from: c4.a$b */
    public static class b extends InputStream implements DataInput {

        /* JADX INFO: renamed from: a */
        public final DataInputStream f6105a;

        /* JADX INFO: renamed from: b */
        public int f6106b;

        /* JADX INFO: renamed from: c */
        public ByteOrder f6107c;

        /* JADX INFO: renamed from: d */
        public byte[] f6108d;

        /* JADX INFO: renamed from: e */
        public int f6109e;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public b(byte[] bArr) {
            this(new ByteArrayInputStream(bArr), ByteOrder.BIG_ENDIAN);
            this.f6109e = bArr.length;
        }

        /* JADX INFO: renamed from: a */
        public int m8024a() {
            return this.f6109e;
        }

        @Override // java.io.InputStream
        public int available() {
            return this.f6105a.available();
        }

        /* JADX INFO: renamed from: b */
        public int m8025b() {
            return this.f6106b;
        }

        /* JADX INFO: renamed from: c */
        public byte[] m8026c() throws IOException {
            byte[] bArrCopyOf = new byte[1024];
            int i10 = 0;
            while (true) {
                if (i10 == bArrCopyOf.length) {
                    bArrCopyOf = Arrays.copyOf(bArrCopyOf, bArrCopyOf.length * 2);
                }
                int i11 = this.f6105a.read(bArrCopyOf, i10, bArrCopyOf.length - i10);
                if (i11 == -1) {
                    return Arrays.copyOf(bArrCopyOf, i10);
                }
                i10 += i11;
                this.f6106b += i11;
            }
        }

        /* JADX INFO: renamed from: d */
        public long m8027d() {
            return ((long) readInt()) & 4294967295L;
        }

        /* JADX INFO: renamed from: e */
        public void m8028e(ByteOrder byteOrder) {
            this.f6107c = byteOrder;
        }

        /* JADX INFO: renamed from: f */
        public void m8029f(int i10) throws IOException {
            int i11 = 0;
            while (i11 < i10) {
                int i12 = i10 - i11;
                int iSkip = (int) this.f6105a.skip(i12);
                if (iSkip <= 0) {
                    if (this.f6108d == null) {
                        this.f6108d = new byte[8192];
                    }
                    iSkip = this.f6105a.read(this.f6108d, 0, Math.min(8192, i12));
                    if (iSkip == -1) {
                        throw new EOFException("Reached EOF while skipping " + i10 + " bytes.");
                    }
                }
                i11 += iSkip;
            }
            this.f6106b += i11;
        }

        @Override // java.io.InputStream
        public void mark(int i10) {
            throw new UnsupportedOperationException("Mark is currently unsupported");
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Override // java.io.InputStream
        public int read() {
            this.f6106b++;
            return this.f6105a.read();
        }

        @Override // java.io.DataInput
        public boolean readBoolean() {
            this.f6106b++;
            return this.f6105a.readBoolean();
        }

        @Override // java.io.DataInput
        public byte readByte() throws IOException {
            this.f6106b++;
            int i10 = this.f6105a.read();
            if (i10 >= 0) {
                return (byte) i10;
            }
            throw new EOFException();
        }

        @Override // java.io.DataInput
        public char readChar() {
            this.f6106b += 2;
            return this.f6105a.readChar();
        }

        @Override // java.io.DataInput
        public double readDouble() {
            return Double.longBitsToDouble(readLong());
        }

        @Override // java.io.DataInput
        public float readFloat() {
            return Float.intBitsToFloat(readInt());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Override // java.io.DataInput
        public void readFully(byte[] bArr, int i10, int i11) throws IOException {
            this.f6106b += i11;
            this.f6105a.readFully(bArr, i10, i11);
        }

        @Override // java.io.DataInput
        public int readInt() throws IOException {
            this.f6106b += 4;
            int i10 = this.f6105a.read();
            int i11 = this.f6105a.read();
            int i12 = this.f6105a.read();
            int i13 = this.f6105a.read();
            if ((i10 | i11 | i12 | i13) < 0) {
                throw new EOFException();
            }
            ByteOrder byteOrder = this.f6107c;
            if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
                return (i13 << 24) + (i12 << 16) + (i11 << 8) + i10;
            }
            if (byteOrder == ByteOrder.BIG_ENDIAN) {
                return (i10 << 24) + (i11 << 16) + (i12 << 8) + i13;
            }
            throw new IOException("Invalid byte order: " + this.f6107c);
        }

        @Override // java.io.DataInput
        public String readLine() {
            Log.d("ExifInterface", "Currently unsupported");
            return null;
        }

        @Override // java.io.DataInput
        public long readLong() throws IOException {
            this.f6106b += 8;
            int i10 = this.f6105a.read();
            int i11 = this.f6105a.read();
            int i12 = this.f6105a.read();
            int i13 = this.f6105a.read();
            int i14 = this.f6105a.read();
            int i15 = this.f6105a.read();
            int i16 = this.f6105a.read();
            int i17 = this.f6105a.read();
            if ((i10 | i11 | i12 | i13 | i14 | i15 | i16 | i17) < 0) {
                throw new EOFException();
            }
            ByteOrder byteOrder = this.f6107c;
            if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
                return (((long) i17) << 56) + (((long) i16) << 48) + (((long) i15) << 40) + (((long) i14) << 32) + (((long) i13) << 24) + (((long) i12) << 16) + (((long) i11) << 8) + ((long) i10);
            }
            if (byteOrder == ByteOrder.BIG_ENDIAN) {
                return (((long) i10) << 56) + (((long) i11) << 48) + (((long) i12) << 40) + (((long) i13) << 32) + (((long) i14) << 24) + (((long) i15) << 16) + (((long) i16) << 8) + ((long) i17);
            }
            throw new IOException("Invalid byte order: " + this.f6107c);
        }

        @Override // java.io.DataInput
        public short readShort() throws IOException {
            this.f6106b += 2;
            int i10 = this.f6105a.read();
            int i11 = this.f6105a.read();
            if ((i10 | i11) < 0) {
                throw new EOFException();
            }
            ByteOrder byteOrder = this.f6107c;
            if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
                return (short) ((i11 << 8) + i10);
            }
            if (byteOrder == ByteOrder.BIG_ENDIAN) {
                return (short) ((i10 << 8) + i11);
            }
            throw new IOException("Invalid byte order: " + this.f6107c);
        }

        @Override // java.io.DataInput
        public String readUTF() {
            this.f6106b += 2;
            return this.f6105a.readUTF();
        }

        @Override // java.io.DataInput
        public int readUnsignedByte() {
            this.f6106b++;
            return this.f6105a.readUnsignedByte();
        }

        @Override // java.io.DataInput
        public int readUnsignedShort() throws IOException {
            this.f6106b += 2;
            int i10 = this.f6105a.read();
            int i11 = this.f6105a.read();
            if ((i10 | i11) < 0) {
                throw new EOFException();
            }
            ByteOrder byteOrder = this.f6107c;
            if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
                return (i11 << 8) + i10;
            }
            if (byteOrder == ByteOrder.BIG_ENDIAN) {
                return (i10 << 8) + i11;
            }
            throw new IOException("Invalid byte order: " + this.f6107c);
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
            int i12 = this.f6105a.read(bArr, i10, i11);
            this.f6106b += i12;
            return i12;
        }

        @Override // java.io.DataInput
        public void readFully(byte[] bArr) throws IOException {
            this.f6106b += bArr.length;
            this.f6105a.readFully(bArr);
        }

        public b(InputStream inputStream, ByteOrder byteOrder) {
            DataInputStream dataInputStream = new DataInputStream(inputStream);
            this.f6105a = dataInputStream;
            dataInputStream.mark(0);
            this.f6106b = 0;
            this.f6107c = byteOrder;
            this.f6109e = inputStream instanceof b ? ((b) inputStream).m8024a() : -1;
        }
    }

    /* JADX INFO: renamed from: c4.a$g */
    public static class g extends b {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public g(byte[] bArr) {
            super(bArr);
            this.f6105a.mark(Integer.MAX_VALUE);
        }

        /* JADX INFO: renamed from: g */
        public void m8055g(long j10) throws IOException {
            int i10 = this.f6106b;
            if (i10 > j10) {
                this.f6106b = 0;
                this.f6105a.reset();
            } else {
                j10 -= (long) i10;
            }
            m8029f((int) j10);
        }

        public g(InputStream inputStream) {
            super(inputStream);
            if (inputStream.markSupported()) {
                this.f6105a.mark(Integer.MAX_VALUE);
                return;
            }
            throw new IllegalArgumentException("Cannot create SeekableByteOrderedDataInputStream with stream that does not support mark/reset");
        }
    }

    /* JADX INFO: renamed from: c4.a$e */
    public static class e {

        /* JADX INFO: renamed from: a */
        public final int f6116a;

        /* JADX INFO: renamed from: b */
        public final String f6117b;

        /* JADX INFO: renamed from: c */
        public final int f6118c;

        /* JADX INFO: renamed from: d */
        public final int f6119d;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public e(String str, int i10, int i11) {
            this.f6117b = str;
            this.f6116a = i10;
            this.f6118c = i11;
            this.f6119d = -1;
        }

        /* JADX INFO: renamed from: a */
        public boolean m8052a(int i10) {
            int i11;
            int i12 = this.f6118c;
            if (i12 == 7 || i10 == 7 || i12 == i10 || (i11 = this.f6119d) == i10) {
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
            this.f6117b = str;
            this.f6116a = i10;
            this.f6118c = i11;
            this.f6119d = i12;
        }
    }

    public C1523a(InputStream inputStream) {
        this(inputStream, 0);
    }

    /* JADX WARN: Code duplicated, block: B:19:0x004f  */
    public C1523a(InputStream inputStream, int i10) {
        e[][] eVarArr = f6063k0;
        this.f6085f = new HashMap[eVarArr.length];
        this.f6086g = new HashSet(eVarArr.length);
        this.f6087h = ByteOrder.BIG_ENDIAN;
        if (inputStream != null) {
            this.f6080a = null;
            boolean z10 = i10 == 1;
            this.f6084e = z10;
            if (z10) {
                this.f6082c = null;
                this.f6081b = null;
            } else if (inputStream instanceof AssetManager.AssetInputStream) {
                this.f6082c = (AssetManager.AssetInputStream) inputStream;
                this.f6081b = null;
            } else if (inputStream instanceof FileInputStream) {
                FileInputStream fileInputStream = (FileInputStream) inputStream;
                if (m7956O(fileInputStream.getFD())) {
                    this.f6082c = null;
                    this.f6081b = fileInputStream.getFD();
                } else {
                    this.f6082c = null;
                    this.f6081b = null;
                }
            } else {
                this.f6082c = null;
                this.f6081b = null;
            }
            m7979T(inputStream);
            return;
        }
        throw new NullPointerException("inputStream cannot be null");
    }
}
