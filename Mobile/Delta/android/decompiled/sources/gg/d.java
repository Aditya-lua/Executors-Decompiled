package gg;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public class d {
    public static volatile d b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set<f> f18208a = new HashSet();

    public static d a() {
        d dVar;
        d dVar2 = b;
        if (dVar2 != null) {
            return dVar2;
        }
        synchronized (d.class) {
            try {
                dVar = b;
                if (dVar == null) {
                    dVar = new d();
                    b = dVar;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return dVar;
    }

    public Set<f> b() {
        Set<f> setUnmodifiableSet;
        synchronized (this.f18208a) {
            setUnmodifiableSet = Collections.unmodifiableSet(this.f18208a);
        }
        return setUnmodifiableSet;
    }
}
