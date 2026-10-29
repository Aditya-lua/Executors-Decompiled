package fv;

import java.lang.reflect.Method;
import org.greenrobot.eventbus.ThreadMode;

/* JADX INFO: loaded from: classes2.dex */
public class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Method f17283a;
    public final ThreadMode b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Class<?> f17284c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f17285d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f17286e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f17287f;

    public l(Method method, Class<?> cls, ThreadMode threadMode, int i10, boolean z10) {
        this.f17283a = method;
        this.b = threadMode;
        this.f17284c = cls;
        this.f17285d = i10;
        this.f17286e = z10;
    }

    public final synchronized void a() {
        if (this.f17287f == null) {
            StringBuilder sb2 = new StringBuilder(64);
            sb2.append(this.f17283a.getDeclaringClass().getName());
            sb2.append('#');
            sb2.append(this.f17283a.getName());
            sb2.append('(');
            sb2.append(this.f17284c.getName());
            this.f17287f = sb2.toString();
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
        return this.f17287f.equals(lVar.f17287f);
    }

    public int hashCode() {
        return this.f17283a.hashCode();
    }
}
