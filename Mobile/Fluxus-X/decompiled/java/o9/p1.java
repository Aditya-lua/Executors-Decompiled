package o9;

import android.content.ComponentName;

/* JADX INFO: loaded from: classes.dex */
public final class p1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f27013a;
    public final String b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ComponentName f27014c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f27015d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f27016e;

    public p1(String str, String str2, int i10, boolean z10) {
        s.f(str);
        this.f27013a = str;
        s.f(str2);
        this.b = str2;
        this.f27014c = null;
        this.f27015d = 4225;
        this.f27016e = z10;
    }

    public final String a() {
        return this.f27013a;
    }

    public final String b() {
        return this.b;
    }

    public final ComponentName c() {
        return this.f27014c;
    }

    public final boolean d() {
        return this.f27016e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p1)) {
            return false;
        }
        p1 p1Var = (p1) obj;
        return q.b(this.f27013a, p1Var.f27013a) && q.b(this.b, p1Var.b) && q.b(this.f27014c, p1Var.f27014c) && this.f27016e == p1Var.f27016e;
    }

    public final int hashCode() {
        return q.c(this.f27013a, this.b, this.f27014c, 4225, Boolean.valueOf(this.f27016e));
    }

    public final String toString() {
        String str = this.f27013a;
        if (str != null) {
            return str;
        }
        ComponentName componentName = this.f27014c;
        s.l(componentName);
        return componentName.flattenToString();
    }
}
