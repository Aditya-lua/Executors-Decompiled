package kotlin.jvm.internal;

import java.io.Serializable;

/* JADX INFO: renamed from: kotlin.jvm.internal.a */
/* JADX INFO: loaded from: classes2.dex */
public class C7724a implements InterfaceC7740i, Serializable {

    /* JADX INFO: renamed from: a */
    public final Object f29414a;

    /* JADX INFO: renamed from: b */
    public final Class f29415b;

    /* JADX INFO: renamed from: c */
    public final String f29416c;

    /* JADX INFO: renamed from: d */
    public final String f29417d;

    /* JADX INFO: renamed from: e */
    public final boolean f29418e;

    /* JADX INFO: renamed from: f */
    public final int f29419f;

    /* JADX INFO: renamed from: g */
    public final int f29420g;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C7724a(int i10, Class cls, String str, String str2, int i11) {
        this(i10, AbstractC7730d.NO_RECEIVER, cls, str, str2, i11);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7724a)) {
            return false;
        }
        C7724a c7724a = (C7724a) obj;
        return this.f29418e == c7724a.f29418e && this.f29419f == c7724a.f29419f && this.f29420g == c7724a.f29420g && Intrinsics.m31980c(this.f29414a, c7724a.f29414a) && Intrinsics.m31980c(this.f29415b, c7724a.f29415b) && this.f29416c.equals(c7724a.f29416c) && this.f29417d.equals(c7724a.f29417d);
    }

    @Override // kotlin.jvm.internal.InterfaceC7740i
    public int getArity() {
        return this.f29419f;
    }

    public int hashCode() {
        Object obj = this.f29414a;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * 31;
        Class cls = this.f29415b;
        return ((((((((((iHashCode + (cls != null ? cls.hashCode() : 0)) * 31) + this.f29416c.hashCode()) * 31) + this.f29417d.hashCode()) * 31) + (this.f29418e ? 1231 : 1237)) * 31) + this.f29419f) * 31) + this.f29420g;
    }

    public String toString() {
        return C7731d0.m32009i(this);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public C7724a(int i10, Object obj, Class cls, String str, String str2, int i11) {
        this.f29414a = obj;
        this.f29415b = cls;
        this.f29416c = str;
        this.f29417d = str2;
        this.f29418e = (i11 & 1) == 1;
        this.f29419f = i10;
        this.f29420g = i11 >> 1;
    }
}
