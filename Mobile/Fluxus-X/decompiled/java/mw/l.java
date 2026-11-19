package mw;

import java.lang.reflect.Method;
import org.greenrobot.eventbus.ThreadMode;

/* JADX INFO: loaded from: classes2.dex */
public class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Method f24860a;
    public final ThreadMode b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Class<?> f24861c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f24862d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f24863e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f24864f;

    public l(Method method, Class<?> cls, ThreadMode threadMode, int i10, boolean z10) {
        this.f24860a = method;
        this.b = threadMode;
        this.f24861c = cls;
        this.f24862d = i10;
        this.f24863e = z10;
    }

    public final synchronized void a() {
        if (this.f24864f == null) {
            StringBuilder sb2 = new StringBuilder(64);
            sb2.append(this.f24860a.getDeclaringClass().getName());
            sb2.append('#');
            sb2.append(this.f24860a.getName());
            sb2.append('(');
            sb2.append(this.f24861c.getName());
            this.f24864f = sb2.toString();
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
        return this.f24864f.equals(lVar.f24864f);
    }

    public int hashCode() {
        return this.f24860a.hashCode();
    }
}
