package sw;

import java.io.EOFException;
import java.util.regex.Pattern;
import mv.f0;
import mv.g0;

/* JADX INFO: loaded from: classes2.dex */
public final class v {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final char[] f32034l = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final Pattern f32035m = Pattern.compile("(.*/)?(\\.|%2e|%2E){1,2}(/.*)?");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f32036a;
    public final mv.z b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f32037c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public mv.z.a f32038d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final f0.a f32039e = new f0.a();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final mv.y.a f32040f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public mv.b0 f32041g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f32042h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public mv.c0.a f32043i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public mv.t.a f32044j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public g0 f32045k;

    public static class a extends g0 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final g0 f32046c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final mv.b0 f32047d;

        public a(g0 g0Var, mv.b0 b0Var) {
            this.f32046c = g0Var;
            this.f32047d = b0Var;
        }

        @Override // mv.g0
        public long a() {
            return this.f32046c.a();
        }

        @Override // mv.g0
        /* JADX INFO: renamed from: b */
        public mv.b0 getF24606c() {
            return this.f32047d;
        }

        @Override // mv.g0
        public void h(ew.f fVar) {
            this.f32046c.h(fVar);
        }
    }

    public v(String str, mv.z zVar, String str2, mv.y yVar, mv.b0 b0Var, boolean z10, boolean z11, boolean z12) {
        this.f32036a = str;
        this.b = zVar;
        this.f32037c = str2;
        this.f32041g = b0Var;
        this.f32042h = z10;
        if (yVar != null) {
            this.f32040f = yVar.e();
        } else {
            this.f32040f = new mv.y.a();
        }
        if (z11) {
            this.f32044j = new mv.t.a();
        } else if (z12) {
            mv.c0.a aVar = new mv.c0.a();
            this.f32043i = aVar;
            aVar.e(mv.c0.f24493m);
        }
    }

    public static String i(String str, boolean z10) throws EOFException {
        int length = str.length();
        int iCharCount = 0;
        while (iCharCount < length) {
            int iCodePointAt = str.codePointAt(iCharCount);
            if (iCodePointAt < 32 || iCodePointAt >= 127 || " \"<>^`{}|\\?#".indexOf(iCodePointAt) != -1 || (!z10 && (iCodePointAt == 47 || iCodePointAt == 37))) {
                ew.e eVar = new ew.e();
                eVar.L0(str, 0, iCharCount);
                j(eVar, str, iCharCount, length, z10);
                return eVar.V2();
            }
            iCharCount += Character.charCount(iCodePointAt);
        }
        return str;
    }

    public static void j(ew.e eVar, String str, int i10, int i11, boolean z10) throws EOFException {
        ew.e eVar2 = null;
        while (i10 < i11) {
            int iCodePointAt = str.codePointAt(i10);
            if (!z10 || (iCodePointAt != 9 && iCodePointAt != 10 && iCodePointAt != 12 && iCodePointAt != 13)) {
                if (iCodePointAt < 32 || iCodePointAt >= 127 || " \"<>^`{}|\\?#".indexOf(iCodePointAt) != -1 || (!z10 && (iCodePointAt == 47 || iCodePointAt == 37))) {
                    if (eVar2 == null) {
                        eVar2 = new ew.e();
                    }
                    eVar2.X(iCodePointAt);
                    long size = eVar2.getSize();
                    for (long j10 = 0; j10 < size; j10++) {
                        byte bO = eVar2.o(j10);
                        eVar.writeByte(37);
                        char[] cArr = f32034l;
                        eVar.writeByte(cArr[((bO & 255) >> 4) & 15]);
                        eVar.writeByte(cArr[bO & 15]);
                    }
                    eVar2.a();
                } else {
                    eVar.X(iCodePointAt);
                }
            }
            i10 += Character.charCount(iCodePointAt);
        }
    }

    public void a(String str, String str2, boolean z10) {
        if (z10) {
            this.f32044j.b(str, str2);
        } else {
            this.f32044j.a(str, str2);
        }
    }

    public void b(String str, String str2, boolean z10) {
        if (!"Content-Type".equalsIgnoreCase(str)) {
            if (z10) {
                this.f32040f.e(str, str2);
                return;
            } else {
                this.f32040f.a(str, str2);
                return;
            }
        }
        try {
            this.f32041g = mv.b0.e(str2);
        } catch (IllegalArgumentException e10) {
            throw new IllegalArgumentException("Malformed content type: " + str2, e10);
        }
    }

    public void c(mv.y yVar) {
        this.f32040f.b(yVar);
    }

    public void d(mv.y yVar, g0 g0Var) {
        this.f32043i.b(yVar, g0Var);
    }

    public void e(mv.c0.c cVar) {
        this.f32043i.c(cVar);
    }

    public void f(String str, String str2, boolean z10) throws EOFException {
        if (this.f32037c == null) {
            throw new AssertionError();
        }
        String strI = i(str2, z10);
        String strReplace = this.f32037c.replace("{" + str + "}", strI);
        if (!f32035m.matcher(strReplace).matches()) {
            this.f32037c = strReplace;
            return;
        }
        throw new IllegalArgumentException("@Path parameters shouldn't perform path traversal ('.' or '..'): " + str2);
    }

    public void g(String str, String str2, boolean z10) {
        String str3 = this.f32037c;
        if (str3 != null) {
            mv.z.a aVarK = this.b.k(str3);
            this.f32038d = aVarK;
            if (aVarK == null) {
                throw new IllegalArgumentException("Malformed URL. Base: " + this.b + ", Relative: " + this.f32037c);
            }
            this.f32037c = null;
        }
        if (z10) {
            this.f32038d.a(str, str2);
        } else {
            this.f32038d.b(str, str2);
        }
    }

    public <T> void h(Class<T> cls, T t8) {
        this.f32039e.r(cls, t8);
    }

    public f0.a k() {
        mv.z zVarS;
        mv.z.a aVar = this.f32038d;
        if (aVar != null) {
            zVarS = aVar.c();
        } else {
            zVarS = this.b.s(this.f32037c);
            if (zVarS == null) {
                throw new IllegalArgumentException("Malformed URL. Base: " + this.b + ", Relative: " + this.f32037c);
            }
        }
        g0 aVar2 = this.f32045k;
        if (aVar2 == null) {
            mv.t.a aVar3 = this.f32044j;
            if (aVar3 != null) {
                aVar2 = aVar3.c();
            } else {
                mv.c0.a aVar4 = this.f32043i;
                if (aVar4 != null) {
                    aVar2 = aVar4.d();
                } else if (this.f32042h) {
                    aVar2 = g0.e(null, new byte[0]);
                }
            }
        }
        mv.b0 b0Var = this.f32041g;
        if (b0Var != null) {
            if (aVar2 != null) {
                aVar2 = new a(aVar2, b0Var);
            } else {
                this.f32040f.a("Content-Type", b0Var.getMediaType());
            }
        }
        return this.f32039e.v(zVarS).n(this.f32040f.f()).o(this.f32036a, aVar2);
    }

    public void l(g0 g0Var) {
        this.f32045k = g0Var;
    }

    public void m(Object obj) {
        this.f32037c = obj.toString();
    }
}
