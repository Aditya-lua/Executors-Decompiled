package p138fv;

import java.lang.reflect.Method;
import org.greenrobot.eventbus.ThreadMode;

/* JADX INFO: renamed from: fv.l */
/* JADX INFO: loaded from: classes2.dex */
public class C5849l {

    /* JADX INFO: renamed from: a */
    public final Method f22300a;

    /* JADX INFO: renamed from: b */
    public final ThreadMode f22301b;

    /* JADX INFO: renamed from: c */
    public final Class<?> f22302c;

    /* JADX INFO: renamed from: d */
    public final int f22303d;

    /* JADX INFO: renamed from: e */
    public final boolean f22304e;

    /* JADX INFO: renamed from: f */
    public String f22305f;

    public C5849l(Method method, Class<?> cls, ThreadMode threadMode, int i10, boolean z10) {
        this.f22300a = method;
        this.f22301b = threadMode;
        this.f22302c = cls;
        this.f22303d = i10;
        this.f22304e = z10;
    }

    /* JADX INFO: renamed from: a */
    public final synchronized void m26227a() {
        if (this.f22305f == null) {
            StringBuilder sb2 = new StringBuilder(64);
            sb2.append(this.f22300a.getDeclaringClass().getName());
            sb2.append('#');
            sb2.append(this.f22300a.getName());
            sb2.append('(');
            sb2.append(this.f22302c.getName());
            this.f22305f = sb2.toString();
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C5849l)) {
            return false;
        }
        m26227a();
        C5849l c5849l = (C5849l) obj;
        c5849l.m26227a();
        return this.f22305f.equals(c5849l.f22305f);
    }

    public int hashCode() {
        return this.f22300a.hashCode();
    }
}
