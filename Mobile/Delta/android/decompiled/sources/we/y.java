package we;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public final class y {
    public static final y b = new y();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b f34479c = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicReference<s> f34480a = new AtomicReference<>();

    public static class b implements s {
        public b() {
        }

        @Override // we.s
        public s.a a(t tVar, String str, String str2) {
            return u.f34474a;
        }
    }

    public static y b() {
        return b;
    }

    public s a() {
        s sVar = this.f34480a.get();
        return sVar == null ? f34479c : sVar;
    }
}
