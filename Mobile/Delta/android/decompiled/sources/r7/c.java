package r7;

import java.io.Closeable;
import java.io.IOException;
import java.util.Arrays;
import xu.f;
import xu.f0;
import xu.g;
import xu.h;

/* JADX INFO: loaded from: classes3.dex */
public abstract class c implements Closeable {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String[] f29795g = new String[128];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f29796a;
    public int[] b = new int[32];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String[] f29797c = new String[32];

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int[] f29798d = new int[32];

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f29799e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f29800f;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String[] f29801a;
        public final f0 b;

        public a(String[] strArr, f0 f0Var) {
            this.f29801a = strArr;
            this.b = f0Var;
        }

        public static a a(String... strArr) {
            try {
                h[] hVarArr = new h[strArr.length];
                xu.e eVar = new xu.e();
                for (int i10 = 0; i10 < strArr.length; i10++) {
                    c.v(eVar, strArr[i10]);
                    eVar.readByte();
                    hVarArr[i10] = eVar.F2();
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
            f29795g[i10] = String.format("\\u%04x", Integer.valueOf(i10));
        }
        String[] strArr = f29795g;
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
        String[] strArr = f29795g;
        fVar.writeByte(34);
        int length = str.length();
        int i10 = 0;
        for (int i11 = 0; i11 < length; i11++) {
            char cCharAt = str.charAt(i11);
            if (cCharAt < 128) {
                str2 = strArr[cCharAt];
                if (str2 != null) {
                    if (i10 < i11) {
                        fVar.K0(str, i10, i11);
                    }
                    fVar.C0(str2);
                    i10 = i11 + 1;
                }
            } else {
                if (cCharAt == 8232) {
                    str2 = "\\u2028";
                } else if (cCharAt == 8233) {
                    str2 = "\\u2029";
                }
                if (i10 < i11) {
                    fVar.K0(str, i10, i11);
                }
                fVar.C0(str2);
                i10 = i11 + 1;
            }
        }
        if (i10 < length) {
            fVar.K0(str, i10, length);
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
        return d.a(this.f29796a, this.b, this.f29797c, this.f29798d);
    }

    public abstract double h();

    public abstract int j();

    public abstract String l();

    public abstract String m();

    public abstract b o();

    public final void q(int i10) {
        int i11 = this.f29796a;
        int[] iArr = this.b;
        if (i11 == iArr.length) {
            if (i11 == 256) {
                throw new r7.a("Nesting too deep at " + getPath());
            }
            this.b = Arrays.copyOf(iArr, iArr.length * 2);
            String[] strArr = this.f29797c;
            this.f29797c = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
            int[] iArr2 = this.f29798d;
            this.f29798d = Arrays.copyOf(iArr2, iArr2.length * 2);
        }
        int[] iArr3 = this.b;
        int i12 = this.f29796a;
        this.f29796a = i12 + 1;
        iArr3[i12] = i10;
    }

    public abstract int r(a aVar);

    public abstract void s();

    public abstract void u();

    public final r7.b w(String str) throws r7.b {
        throw new r7.b(str + " at path " + getPath());
    }
}
