package r7;

import java.io.Closeable;
import java.io.IOException;
import java.util.Arrays;
import vu.f;
import vu.f0;
import vu.g;
import vu.h;

/* JADX INFO: loaded from: classes3.dex */
public abstract class c implements Closeable {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String[] f30197g = new String[128];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f30198a;
    public int[] b = new int[32];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String[] f30199c = new String[32];

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int[] f30200d = new int[32];

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f30201e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f30202f;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String[] f30203a;
        public final f0 b;

        public a(String[] strArr, f0 f0Var) {
            this.f30203a = strArr;
            this.b = f0Var;
        }

        public static a a(String... strArr) {
            try {
                h[] hVarArr = new h[strArr.length];
                vu.e eVar = new vu.e();
                for (int i10 = 0; i10 < strArr.length; i10++) {
                    c.v(eVar, strArr[i10]);
                    eVar.readByte();
                    hVarArr[i10] = eVar.G2();
                }
                return new a((String[]) strArr.clone(), f0.l(hVarArr));
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
            f30197g[i10] = String.format("\\u%04x", Integer.valueOf(i10));
        }
        String[] strArr = f30197g;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
    }

    public static c n(g gVar) {
        return new e(gVar);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x002b  */
    public static void v(f fVar, String str) {
        String str2;
        String[] strArr = f30197g;
        fVar.writeByte(34);
        int length = str.length();
        int i10 = 0;
        for (int i11 = 0; i11 < length; i11++) {
            char cCharAt = str.charAt(i11);
            if (cCharAt < 128) {
                str2 = strArr[cCharAt];
                if (str2 != null) {
                    if (i10 < i11) {
                        fVar.G0(str, i10, i11);
                    }
                    fVar.y0(str2);
                    i10 = i11 + 1;
                }
            } else {
                if (cCharAt == 8232) {
                    str2 = "\\u2028";
                } else if (cCharAt == 8233) {
                    str2 = "\\u2029";
                }
                if (i10 < i11) {
                    fVar.G0(str, i10, i11);
                }
                fVar.y0(str2);
                i10 = i11 + 1;
            }
        }
        if (i10 < length) {
            fVar.G0(str, i10, length);
        }
        fVar.writeByte(34);
    }

    public abstract void b();

    public abstract void c();

    public abstract void d();

    public abstract void e();

    public abstract boolean f();

    public abstract boolean g();

    public final String getPath() {
        return d.a(this.f30198a, this.b, this.f30199c, this.f30200d);
    }

    public abstract double h();

    public abstract int j();

    public abstract String l();

    public abstract String m();

    public abstract b o();

    public final void q(int i10) {
        int i11 = this.f30198a;
        int[] iArr = this.b;
        if (i11 == iArr.length) {
            if (i11 == 256) {
                throw new r7.a("Nesting too deep at " + getPath());
            }
            this.b = Arrays.copyOf(iArr, iArr.length * 2);
            String[] strArr = this.f30199c;
            this.f30199c = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
            int[] iArr2 = this.f30200d;
            this.f30200d = Arrays.copyOf(iArr2, iArr2.length * 2);
        }
        int[] iArr3 = this.b;
        int i12 = this.f30198a;
        this.f30198a = i12 + 1;
        iArr3[i12] = i10;
    }

    public abstract int r(a aVar);

    public abstract void s();

    public abstract void u();

    public final r7.b w(String str) throws r7.b {
        throw new r7.b(str + " at path " + getPath());
    }
}
