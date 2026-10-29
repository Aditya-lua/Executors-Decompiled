package p404r7;

import java.io.Closeable;
import java.io.IOException;
import java.util.Arrays;
import p560xu.C12924e;
import p560xu.C12927f0;
import p560xu.C12930h;
import p560xu.InterfaceC12926f;
import p560xu.InterfaceC12928g;

/* JADX INFO: renamed from: r7.c */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC10794c implements Closeable {

    /* JADX INFO: renamed from: g */
    public static final String[] f38458g = new String[128];

    /* JADX INFO: renamed from: a */
    public int f38459a;

    /* JADX INFO: renamed from: b */
    public int[] f38460b = new int[32];

    /* JADX INFO: renamed from: c */
    public String[] f38461c = new String[32];

    /* JADX INFO: renamed from: d */
    public int[] f38462d = new int[32];

    /* JADX INFO: renamed from: e */
    public boolean f38463e;

    /* JADX INFO: renamed from: f */
    public boolean f38464f;

    /* JADX INFO: renamed from: r7.c$a */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public final String[] f38465a;

        /* JADX INFO: renamed from: b */
        public final C12927f0 f38466b;

        public a(String[] strArr, C12927f0 c12927f0) {
            this.f38465a = strArr;
            this.f38466b = c12927f0;
        }

        /* JADX INFO: renamed from: a */
        public static a m41143a(String... strArr) {
            try {
                C12930h[] c12930hArr = new C12930h[strArr.length];
                C12924e c12924e = new C12924e();
                for (int i10 = 0; i10 < strArr.length; i10++) {
                    AbstractC10794c.m41126v(c12924e, strArr[i10]);
                    c12924e.readByte();
                    c12930hArr[i10] = c12924e.mo47997F2();
                }
                return new a((String[]) strArr.clone(), C12927f0.m48066l(c12930hArr));
            } catch (IOException e10) {
                throw new AssertionError(e10);
            }
        }
    }

    /* JADX INFO: renamed from: r7.c$b */
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
            f38458g[i10] = String.format("\\u%04x", Integer.valueOf(i10));
        }
        String[] strArr = f38458g;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
    }

    /* JADX INFO: renamed from: n */
    public static AbstractC10794c m41125n(InterfaceC12928g interfaceC12928g) {
        return new C10796e(interfaceC12928g);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x002b  */
    /* JADX INFO: renamed from: v */
    public static void m41126v(InterfaceC12926f interfaceC12926f, String str) {
        String str2;
        String[] strArr = f38458g;
        interfaceC12926f.writeByte(34);
        int length = str.length();
        int i10 = 0;
        for (int i11 = 0; i11 < length; i11++) {
            char cCharAt = str.charAt(i11);
            if (cCharAt < 128) {
                str2 = strArr[cCharAt];
                if (str2 != null) {
                    if (i10 < i11) {
                        interfaceC12926f.mo48001K0(str, i10, i11);
                    }
                    interfaceC12926f.mo47992C0(str2);
                    i10 = i11 + 1;
                }
            } else {
                if (cCharAt == 8232) {
                    str2 = "\\u2028";
                } else if (cCharAt == 8233) {
                    str2 = "\\u2029";
                }
                if (i10 < i11) {
                    interfaceC12926f.mo48001K0(str, i10, i11);
                }
                interfaceC12926f.mo47992C0(str2);
                i10 = i11 + 1;
            }
        }
        if (i10 < length) {
            interfaceC12926f.mo48001K0(str, i10, length);
        }
        interfaceC12926f.writeByte(34);
    }

    /* JADX INFO: renamed from: b */
    public abstract void mo41127b();

    /* JADX INFO: renamed from: c */
    public abstract void mo41128c();

    /* JADX INFO: renamed from: d */
    public abstract void mo41129d();

    /* JADX INFO: renamed from: e */
    public abstract void mo41130e();

    /* JADX INFO: renamed from: f */
    public abstract boolean mo41131f();

    /* JADX INFO: renamed from: g */
    public abstract boolean mo41132g();

    public final String getPath() {
        return C10795d.m41145a(this.f38459a, this.f38460b, this.f38461c, this.f38462d);
    }

    /* JADX INFO: renamed from: h */
    public abstract double mo41133h();

    /* JADX INFO: renamed from: j */
    public abstract int mo41134j();

    /* JADX INFO: renamed from: l */
    public abstract String mo41135l();

    /* JADX INFO: renamed from: m */
    public abstract String mo41136m();

    /* JADX INFO: renamed from: o */
    public abstract b mo41137o();

    /* JADX INFO: renamed from: q */
    public final void m41138q(int i10) {
        int i11 = this.f38459a;
        int[] iArr = this.f38460b;
        if (i11 == iArr.length) {
            if (i11 == 256) {
                throw new C10792a("Nesting too deep at " + getPath());
            }
            this.f38460b = Arrays.copyOf(iArr, iArr.length * 2);
            String[] strArr = this.f38461c;
            this.f38461c = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
            int[] iArr2 = this.f38462d;
            this.f38462d = Arrays.copyOf(iArr2, iArr2.length * 2);
        }
        int[] iArr3 = this.f38460b;
        int i12 = this.f38459a;
        this.f38459a = i12 + 1;
        iArr3[i12] = i10;
    }

    /* JADX INFO: renamed from: r */
    public abstract int mo41139r(a aVar);

    /* JADX INFO: renamed from: s */
    public abstract void mo41140s();

    /* JADX INFO: renamed from: u */
    public abstract void mo41141u();

    /* JADX INFO: renamed from: w */
    public final C10793b m41142w(String str) throws C10793b {
        throw new C10793b(str + " at path " + getPath());
    }
}
