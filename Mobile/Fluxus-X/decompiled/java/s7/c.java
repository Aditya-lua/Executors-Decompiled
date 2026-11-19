package s7;

import com.google.mlkit.vision.barcode.common.Barcode;
import ew.f;
import ew.g;
import ew.h;
import ew.z;
import java.io.Closeable;
import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public abstract class c implements Closeable {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String[] f31220g = new String[Barcode.FORMAT_ITF];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f31221a;
    public int[] b = new int[32];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String[] f31222c = new String[32];

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int[] f31223d = new int[32];

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f31224e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f31225f;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String[] f31226a;
        public final z b;

        public a(String[] strArr, z zVar) {
            this.f31226a = strArr;
            this.b = zVar;
        }

        public static a a(String... strArr) {
            try {
                h[] hVarArr = new h[strArr.length];
                ew.e eVar = new ew.e();
                for (int i10 = 0; i10 < strArr.length; i10++) {
                    c.y(eVar, strArr[i10]);
                    eVar.readByte();
                    hVarArr[i10] = eVar.J2();
                }
                return new a((String[]) strArr.clone(), z.j(hVarArr));
            } catch (IOException e10) {
                throw new AssertionError(e10);
            }
        }
    }

    public enum b {
        BEGIN_ARRAY,
        END_ARRAY,
        BEGIN_OBJECT,
        END_OBJECT,
        NAME,
        STRING,
        NUMBER,
        BOOLEAN,
        NULL,
        END_DOCUMENT
    }

    static {
        for (int i10 = 0; i10 <= 31; i10++) {
            f31220g[i10] = String.format("\\u%04x", Integer.valueOf(i10));
        }
        String[] strArr = f31220g;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
    }

    public static c o(g gVar) {
        return new e(gVar);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x002b  */
    public static void y(f fVar, String str) {
        String str2;
        String[] strArr = f31220g;
        fVar.writeByte(34);
        int length = str.length();
        int i10 = 0;
        for (int i11 = 0; i11 < length; i11++) {
            char cCharAt = str.charAt(i11);
            if (cCharAt < 128) {
                str2 = strArr[cCharAt];
                if (str2 != null) {
                    if (i10 < i11) {
                        fVar.L0(str, i10, i11);
                    }
                    fVar.D0(str2);
                    i10 = i11 + 1;
                }
            } else {
                if (cCharAt == 8232) {
                    str2 = "\\u2028";
                } else if (cCharAt == 8233) {
                    str2 = "\\u2029";
                }
                if (i10 < i11) {
                    fVar.L0(str, i10, i11);
                }
                fVar.D0(str2);
                i10 = i11 + 1;
            }
        }
        if (i10 < length) {
            fVar.L0(str, i10, length);
        }
        fVar.writeByte(34);
    }

    public abstract void b();

    public abstract void c();

    public abstract void d();

    public abstract void e();

    public abstract boolean f();

    public abstract boolean g();

    public abstract double h();

    public abstract int k();

    public abstract String m();

    public abstract String n();

    public abstract b p();

    public final void r(int i10) {
        int i11 = this.f31221a;
        int[] iArr = this.b;
        if (i11 == iArr.length) {
            if (i11 == 256) {
                throw new s7.a("Nesting too deep at " + x());
            }
            this.b = Arrays.copyOf(iArr, iArr.length * 2);
            String[] strArr = this.f31222c;
            this.f31222c = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
            int[] iArr2 = this.f31223d;
            this.f31223d = Arrays.copyOf(iArr2, iArr2.length * 2);
        }
        int[] iArr3 = this.b;
        int i12 = this.f31221a;
        this.f31221a = i12 + 1;
        iArr3[i12] = i10;
    }

    public abstract int s(a aVar);

    public abstract void u();

    public abstract void w();

    public final String x() {
        return d.a(this.f31221a, this.b, this.f31222c, this.f31223d);
    }

    public final s7.b z(String str) throws s7.b {
        throw new s7.b(str + " at path " + x());
    }
}
