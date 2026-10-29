package n9;

import android.content.ComponentName;

/* JADX INFO: loaded from: classes.dex */
public final class e1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f25252a;
    public final String b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ComponentName f25253c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f25254d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f25255e;

    public e1(String str, String str2, int i10, boolean z10) {
        m.f(str);
        this.f25252a = str;
        m.f(str2);
        this.b = str2;
        this.f25253c = null;
        this.f25254d = 4225;
        this.f25255e = z10;
    }

    public final String a() {
        return this.f25252a;
    }

    public final String b() {
        return this.b;
    }

    public final ComponentName c() {
        return this.f25253c;
    }

    public final boolean d() {
        return this.f25255e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e1)) {
            return false;
        }
        e1 e1Var = (e1) obj;
        return k.b(this.f25252a, e1Var.f25252a) && k.b(this.b, e1Var.b) && k.b(this.f25253c, e1Var.f25253c) && this.f25255e == e1Var.f25255e;
    }

    public final int hashCode() {
        return k.c(this.f25252a, this.b, this.f25253c, 4225, Boolean.valueOf(this.f25255e));
    }

    public final String toString() {
        String str = this.f25252a;
        if (str != null) {
            return str;
        }
        ComponentName componentName = this.f25253c;
        m.l(componentName);
        return componentName.flattenToString();
    }
}
