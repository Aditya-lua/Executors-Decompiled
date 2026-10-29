package p305n9;

import android.content.ComponentName;

/* JADX INFO: renamed from: n9.e1 */
/* JADX INFO: loaded from: classes.dex */
public final class C8931e1 {

    /* JADX INFO: renamed from: a */
    public final String f32578a;

    /* JADX INFO: renamed from: b */
    public final String f32579b;

    /* JADX INFO: renamed from: c */
    public final ComponentName f32580c;

    /* JADX INFO: renamed from: d */
    public final int f32581d;

    /* JADX INFO: renamed from: e */
    public final boolean f32582e;

    public C8931e1(String str, String str2, int i10, boolean z10) {
        C8953m.m36041f(str);
        this.f32578a = str;
        C8953m.m36041f(str2);
        this.f32579b = str2;
        this.f32580c = null;
        this.f32581d = 4225;
        this.f32582e = z10;
    }

    /* JADX INFO: renamed from: a */
    public final String m35982a() {
        return this.f32578a;
    }

    /* JADX INFO: renamed from: b */
    public final String m35983b() {
        return this.f32579b;
    }

    /* JADX INFO: renamed from: c */
    public final ComponentName m35984c() {
        return this.f32580c;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m35985d() {
        return this.f32582e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8931e1)) {
            return false;
        }
        C8931e1 c8931e1 = (C8931e1) obj;
        return C8947k.m36026b(this.f32578a, c8931e1.f32578a) && C8947k.m36026b(this.f32579b, c8931e1.f32579b) && C8947k.m36026b(this.f32580c, c8931e1.f32580c) && this.f32582e == c8931e1.f32582e;
    }

    public final int hashCode() {
        return C8947k.m36027c(this.f32578a, this.f32579b, this.f32580c, 4225, Boolean.valueOf(this.f32582e));
    }

    public final String toString() {
        String str = this.f32578a;
        if (str != null) {
            return str;
        }
        ComponentName componentName = this.f32580c;
        C8953m.m36047l(componentName);
        return componentName.flattenToString();
    }
}
