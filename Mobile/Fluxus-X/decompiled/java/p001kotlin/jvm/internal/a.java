package p001kotlin.jvm.internal;

import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public class a implements i, Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f21566a;
    public final Class b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f21567c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f21568d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f21569e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f21570f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f21571g;

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
        return this.f21569e == aVar.f21569e && this.f21570f == aVar.f21570f && this.f21571g == aVar.f21571g && Intrinsics.c(this.f21566a, aVar.f21566a) && Intrinsics.c(this.b, aVar.b) && this.f21567c.equals(aVar.f21567c) && this.f21568d.equals(aVar.f21568d);
    }

    @Override // p001kotlin.jvm.internal.i
    public int getArity() {
        return this.f21570f;
    }

    public int hashCode() {
        Object obj = this.f21566a;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * 31;
        Class cls = this.b;
        return ((((((((((iHashCode + (cls != null ? cls.hashCode() : 0)) * 31) + this.f21567c.hashCode()) * 31) + this.f21568d.hashCode()) * 31) + (this.f21569e ? 1231 : 1237)) * 31) + this.f21570f) * 31) + this.f21571g;
    }

    public String toString() {
        return d0.i(this);
    }

    public a(int i10, Object obj, Class cls, String str, String str2, int i11) {
        this.f21566a = obj;
        this.b = cls;
        this.f21567c = str;
        this.f21568d = str2;
        this.f21569e = (i11 & 1) == 1;
        this.f21570f = i10;
        this.f21571g = i11 >> 1;
    }
}
