package dv;

import java.lang.reflect.Method;
import org.greenrobot.eventbus.ThreadMode;

/* JADX INFO: loaded from: classes2.dex */
public class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Method f15479a;
    public final ThreadMode b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Class<?> f15480c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f15481d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f15482e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f15483f;

    public l(Method method, Class<?> cls, ThreadMode threadMode, int i10, boolean z10) {
        this.f15479a = method;
        this.b = threadMode;
        this.f15480c = cls;
        this.f15481d = i10;
        this.f15482e = z10;
    }

    public final synchronized void a() {
        if (this.f15483f == null) {
            StringBuilder sb2 = new StringBuilder(64);
            sb2.append(this.f15479a.getDeclaringClass().getName());
            sb2.append('#');
            sb2.append(this.f15479a.getName());
            sb2.append('(');
            sb2.append(this.f15480c.getName());
            this.f15483f = sb2.toString();
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        a();
        l lVar = (l) obj;
        lVar.a();
        return this.f15483f.equals(lVar.f15483f);
    }

    public int hashCode() {
        return this.f15479a.hashCode();
    }
}
