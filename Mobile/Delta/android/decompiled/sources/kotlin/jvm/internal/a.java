package kotlin.jvm.internal;

import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public class a implements i, Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f22998a;
    public final Class b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f22999c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f23000d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f23001e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f23002f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f23003g;

    public a(int i10, Class cls, String str, String str2, int i11) {
        this(i10, d.NO_RECEIVER, cls, str, str2, i11);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f23001e == aVar.f23001e && this.f23002f == aVar.f23002f && this.f23003g == aVar.f23003g && Intrinsics.c(this.f22998a, aVar.f22998a) && Intrinsics.c(this.b, aVar.b) && this.f22999c.equals(aVar.f22999c) && this.f23000d.equals(aVar.f23000d);
    }

    @Override // kotlin.jvm.internal.i
    public int getArity() {
        return this.f23002f;
    }

    public int hashCode() {
        Object obj = this.f22998a;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * 31;
        Class cls = this.b;
        return ((((((((((iHashCode + (cls != null ? cls.hashCode() : 0)) * 31) + this.f22999c.hashCode()) * 31) + this.f23000d.hashCode()) * 31) + (this.f23001e ? 1231 : 1237)) * 31) + this.f23002f) * 31) + this.f23003g;
    }

    public String toString() {
        return d0.i(this);
    }

    public a(int i10, Object obj, Class cls, String str, String str2, int i11) {
        this.f22998a = obj;
        this.b = cls;
        this.f22999c = str;
        this.f23000d = str2;
        this.f23001e = (i11 & 1) == 1;
        this.f23002f = i10;
        this.f23003g = i11 >> 1;
    }
}
