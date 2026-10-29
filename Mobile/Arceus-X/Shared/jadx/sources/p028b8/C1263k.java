package p028b8;

import java.util.concurrent.Executor;
import p071d8.C4472d;
import p071d8.InterfaceC4470b;

/* JADX INFO: renamed from: b8.k */
/* JADX INFO: loaded from: classes.dex */
public final class C1263k implements InterfaceC4470b<Executor> {

    /* JADX INFO: renamed from: b8.k$a */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public static final C1263k f5279a = new C1263k();
    }

    /* JADX INFO: renamed from: a */
    public static C1263k m7032a() {
        return a.f5279a;
    }

    /* JADX INFO: renamed from: b */
    public static Executor m7033b() {
        return (Executor) C4472d.m22419c(AbstractC1262j.m7031a(), "Cannot return null from a non-@Nullable @Provides method");
    }

    /* JADX DEBUG: Method merged with bridge method: get()Ljava/lang/Object; */
    @Override // ht.InterfaceC6564a
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public Executor get() {
        return m7033b();
    }
}
