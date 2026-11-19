package hn;

import ew.j0;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class s extends t {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Object[] f18388j = new Object[32];

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public String f18389k;

    public class a extends ew.m {
        public final /* synthetic */ ew.e b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(j0 j0Var, ew.e eVar) {
            super(j0Var);
            this.b = eVar;
        }

        @Override // ew.m, ew.j0, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (s.this.s() == 9) {
                s sVar = s.this;
                Object[] objArr = sVar.f18388j;
                int i10 = sVar.f18391a;
                if (objArr[i10] == null) {
                    sVar.f18391a = i10 - 1;
                    Object objE = m.u(this.b).E();
                    s sVar2 = s.this;
                    boolean z10 = sVar2.f18396g;
                    sVar2.f18396g = true;
                    try {
                        sVar2.c0(objE);
                        s sVar3 = s.this;
                        sVar3.f18396g = z10;
                        int[] iArr = sVar3.f18393d;
                        int i11 = sVar3.f18391a - 1;
                        iArr[i11] = iArr[i11] + 1;
                        return;
                    } catch (Throwable th2) {
                        s.this.f18396g = z10;
                        throw th2;
                    }
                }
            }
            throw new AssertionError();
        }
    }

    public s() {
        w(6);
    }

    @Override // hn.t
    public t I(double d10) {
        if (!this.f18395f && (Double.isNaN(d10) || d10 == Double.NEGATIVE_INFINITY || d10 == Double.POSITIVE_INFINITY)) {
            throw new IllegalArgumentException("Numeric values must be finite, but was " + d10);
        }
        if (this.f18397h) {
            this.f18397h = false;
            return o(Double.toString(d10));
        }
        c0(Double.valueOf(d10));
        int[] iArr = this.f18393d;
        int i10 = this.f18391a - 1;
        iArr[i10] = iArr[i10] + 1;
        return this;
    }

    @Override // hn.t
    public t K(long j10) {
        if (this.f18397h) {
            this.f18397h = false;
            return o(Long.toString(j10));
        }
        c0(Long.valueOf(j10));
        int[] iArr = this.f18393d;
        int i10 = this.f18391a - 1;
        iArr[i10] = iArr[i10] + 1;
        return this;
    }

    @Override // hn.t
    public t N(Boolean bool) {
        if (this.f18397h) {
            throw new IllegalStateException("Boolean cannot be used as a map key in JSON at path " + x());
        }
        c0(bool);
        int[] iArr = this.f18393d;
        int i10 = this.f18391a - 1;
        iArr[i10] = iArr[i10] + 1;
        return this;
    }

    @Override // hn.t
    public t O(Number number) {
        if ((number instanceof Byte) || (number instanceof Short) || (number instanceof Integer) || (number instanceof Long)) {
            return K(number.longValue());
        }
        if ((number instanceof Float) || (number instanceof Double)) {
            return I(number.doubleValue());
        }
        if (number == null) {
            return p();
        }
        BigDecimal bigDecimal = number instanceof BigDecimal ? (BigDecimal) number : new BigDecimal(number.toString());
        if (this.f18397h) {
            this.f18397h = false;
            return o(bigDecimal.toString());
        }
        c0(bigDecimal);
        int[] iArr = this.f18393d;
        int i10 = this.f18391a - 1;
        iArr[i10] = iArr[i10] + 1;
        return this;
    }

    @Override // hn.t
    public t Q(String str) {
        if (this.f18397h) {
            this.f18397h = false;
            return o(str);
        }
        c0(str);
        int[] iArr = this.f18393d;
        int i10 = this.f18391a - 1;
        iArr[i10] = iArr[i10] + 1;
        return this;
    }

    @Override // hn.t
    public t T(boolean z10) {
        if (this.f18397h) {
            throw new IllegalStateException("Boolean cannot be used as a map key in JSON at path " + x());
        }
        c0(Boolean.valueOf(z10));
        int[] iArr = this.f18393d;
        int i10 = this.f18391a - 1;
        iArr[i10] = iArr[i10] + 1;
        return this;
    }

    @Override // hn.t
    public ew.f Y() {
        if (this.f18397h) {
            throw new IllegalStateException("BufferedSink cannot be used as a map key in JSON at path " + x());
        }
        if (s() == 9) {
            throw new IllegalStateException("Sink from valueSink() was not closed");
        }
        w(9);
        ew.e eVar = new ew.e();
        return ew.v.b(new a(eVar, eVar));
    }

    @Override // hn.t
    public t a() {
        if (this.f18397h) {
            throw new IllegalStateException("Array cannot be used as a map key in JSON at path " + x());
        }
        int i10 = this.f18391a;
        int i11 = this.f18398i;
        if (i10 == i11 && this.b[i10 - 1] == 1) {
            this.f18398i = ~i11;
            return this;
        }
        d();
        ArrayList arrayList = new ArrayList();
        c0(arrayList);
        Object[] objArr = this.f18388j;
        int i12 = this.f18391a;
        objArr[i12] = arrayList;
        this.f18393d[i12] = 0;
        w(1);
        return this;
    }

    @Override // hn.t
    public t c() {
        if (this.f18397h) {
            throw new IllegalStateException("Object cannot be used as a map key in JSON at path " + x());
        }
        int i10 = this.f18391a;
        int i11 = this.f18398i;
        if (i10 == i11 && this.b[i10 - 1] == 3) {
            this.f18398i = ~i11;
            return this;
        }
        d();
        u uVar = new u();
        c0(uVar);
        this.f18388j[this.f18391a] = uVar;
        w(3);
        return this;
    }

    public final s c0(Object obj) {
        String str;
        Object objPut;
        int iS = s();
        int i10 = this.f18391a;
        if (i10 == 1) {
            if (iS != 6) {
                throw new IllegalStateException("JSON must have only one top-level value.");
            }
            this.b[i10 - 1] = 7;
            this.f18388j[i10 - 1] = obj;
            return this;
        }
        if (iS != 3 || (str = this.f18389k) == null) {
            if (iS == 1) {
                ((List) this.f18388j[i10 - 1]).add(obj);
                return this;
            }
            if (iS == 9) {
                throw new IllegalStateException("Sink from valueSink() was not closed");
            }
            throw new IllegalStateException("Nesting problem.");
        }
        if ((obj == null && !this.f18396g) || (objPut = ((Map) this.f18388j[i10 - 1]).put(str, obj)) == null) {
            this.f18389k = null;
            return this;
        }
        throw new IllegalArgumentException("Map key '" + this.f18389k + "' has multiple values at path " + x() + ": " + objPut + " and " + obj);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        int i10 = this.f18391a;
        if (i10 > 1 || (i10 == 1 && this.b[i10 - 1] != 7)) {
            throw new IOException("Incomplete document");
        }
        this.f18391a = 0;
    }

    public Object d0() {
        int i10 = this.f18391a;
        if (i10 > 1 || (i10 == 1 && this.b[i10 - 1] != 7)) {
            throw new IllegalStateException("Incomplete document");
        }
        return this.f18388j[0];
    }

    @Override // hn.t
    public t e() {
        if (s() != 1) {
            throw new IllegalStateException("Nesting problem.");
        }
        int i10 = this.f18391a;
        int i11 = this.f18398i;
        if (i10 == (~i11)) {
            this.f18398i = ~i11;
            return this;
        }
        int i12 = i10 - 1;
        this.f18391a = i12;
        this.f18388j[i12] = null;
        int[] iArr = this.f18393d;
        int i13 = i10 - 2;
        iArr[i13] = iArr[i13] + 1;
        return this;
    }

    @Override // java.io.Flushable
    public void flush() {
        if (this.f18391a == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        }
    }

    @Override // hn.t
    public t g() {
        if (s() != 3) {
            throw new IllegalStateException("Nesting problem.");
        }
        if (this.f18389k != null) {
            throw new IllegalStateException("Dangling name: " + this.f18389k);
        }
        int i10 = this.f18391a;
        int i11 = this.f18398i;
        if (i10 == (~i11)) {
            this.f18398i = ~i11;
            return this;
        }
        this.f18397h = false;
        int i12 = i10 - 1;
        this.f18391a = i12;
        this.f18388j[i12] = null;
        this.f18392c[i12] = null;
        int[] iArr = this.f18393d;
        int i13 = i10 - 2;
        iArr[i13] = iArr[i13] + 1;
        return this;
    }

    @Override // hn.t
    public t o(String str) {
        if (str == null) {
            throw new NullPointerException("name == null");
        }
        if (this.f18391a == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        }
        if (s() != 3 || this.f18389k != null || this.f18397h) {
            throw new IllegalStateException("Nesting problem.");
        }
        this.f18389k = str;
        this.f18392c[this.f18391a - 1] = str;
        return this;
    }

    @Override // hn.t
    public t p() {
        if (this.f18397h) {
            throw new IllegalStateException("null cannot be used as a map key in JSON at path " + x());
        }
        c0(null);
        int[] iArr = this.f18393d;
        int i10 = this.f18391a - 1;
        iArr[i10] = iArr[i10] + 1;
        return this;
    }
}
