package n9;

import android.content.ComponentName;

/* JADX INFO: loaded from: classes.dex */
public final class e1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f26073a;
    public final String b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ComponentName f26074c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f26075d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f26076e;

    public e1(String str, String str2, int i10, boolean z10) {
        m.f(str);
        this.f26073a = str;
        m.f(str2);
        this.b = str2;
        this.f26074c = null;
        this.f26075d = 4225;
        this.f26076e = z10;
    }

    public final String a() {
        return this.f26073a;
    }

    public final String b() {
        return this.b;
    }

    public final ComponentName c() {
        return this.f26074c;
    }

    public final boolean d() {
        return this.f26076e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e1)) {
            return false;
        }
        e1 e1Var = (e1) obj;
        return k.b(this.f26073a, e1Var.f26073a) && k.b(this.b, e1Var.b) && k.b(this.f26074c, e1Var.f26074c) && this.f26076e == e1Var.f26076e;
    }

    public final int hashCode() {
        return k.c(this.f26073a, this.b, this.f26074c, 4225, Boolean.valueOf(this.f26076e));
    }

    public final String toString() {
        String str = this.f26073a;
        if (str != null) {
            return str;
        }
        ComponentName componentName = this.f26074c;
        m.l(componentName);
        return componentName.flattenToString();
    }
}
