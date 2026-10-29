package kotlin.jvm.internal;

import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public class a implements i, Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f22543a;
    public final Class b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f22544c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f22545d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f22546e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f22547f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f22548g;

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
        return this.f22546e == aVar.f22546e && this.f22547f == aVar.f22547f && this.f22548g == aVar.f22548g && Intrinsics.c(this.f22543a, aVar.f22543a) && Intrinsics.c(this.b, aVar.b) && this.f22544c.equals(aVar.f22544c) && this.f22545d.equals(aVar.f22545d);
    }

    @Override // kotlin.jvm.internal.i
    public int getArity() {
        return this.f22547f;
    }

    public int hashCode() {
        Object obj = this.f22543a;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * 31;
        Class cls = this.b;
        return ((((((((((iHashCode + (cls != null ? cls.hashCode() : 0)) * 31) + this.f22544c.hashCode()) * 31) + this.f22545d.hashCode()) * 31) + (this.f22546e ? 1231 : 1237)) * 31) + this.f22547f) * 31) + this.f22548g;
    }

    public String toString() {
        return d0.i(this);
    }

    public a(int i10, Object obj, Class cls, String str, String str2, int i11) {
        this.f22543a = obj;
        this.b = cls;
        this.f22544c = str;
        this.f22545d = str2;
        this.f22546e = (i11 & 1) == 1;
        this.f22547f = i10;
        this.f22548g = i11 >> 1;
    }
}
