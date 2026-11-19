package ye;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public final class y {
    public static final y b = new y();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b f37836c = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicReference<s> f37837a = new AtomicReference<>();

    public static class b implements s {
        public b() {
        }

        @Override // ye.s
        public s.a a(t tVar, String str, String str2) {
            return u.f37831a;
        }
    }

    public static y b() {
        return b;
    }

    public s a() {
        s sVar = this.f37837a.get();
        return sVar == null ? f37836c : sVar;
    }
}
