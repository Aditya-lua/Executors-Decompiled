package p171hg;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: renamed from: hg.d */
/* JADX INFO: loaded from: classes2.dex */
public class C6399d {

    /* JADX INFO: renamed from: b */
    public static volatile C6399d f24332b;

    /* JADX INFO: renamed from: a */
    public final Set<AbstractC6401f> f24333a = new HashSet();

    /* JADX INFO: renamed from: a */
    public static C6399d m27981a() {
        C6399d c6399d;
        C6399d c6399d2 = f24332b;
        if (c6399d2 != null) {
            return c6399d2;
        }
        synchronized (C6399d.class) {
            try {
                c6399d = f24332b;
                if (c6399d == null) {
                    c6399d = new C6399d();
                    f24332b = c6399d;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return c6399d;
    }

    /* JADX INFO: renamed from: b */
    public Set<AbstractC6401f> m27982b() {
        Set<AbstractC6401f> setUnmodifiableSet;
        synchronized (this.f24333a) {
            setUnmodifiableSet = Collections.unmodifiableSet(this.f24333a);
        }
        return setUnmodifiableSet;
    }
}
