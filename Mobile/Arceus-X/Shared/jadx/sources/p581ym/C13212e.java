package p581ym;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p256ku.InterfaceC7906p0;
import p615zt.InterfaceC14057n;

/* JADX INFO: renamed from: ym.e */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m31665d2 = {"Lym/e;", "Lym/t;", "<init>", "()V", "wf1-workflow-runtime"}, m31666k = 1, m31667mv = {1, 6, 0}, m31669xi = 48)
public final class C13212e implements InterfaceC13227t {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C13212e f46507a = new C13212e();

    @Override // p581ym.InterfaceC13227t
    @Nullable
    /* JADX INFO: renamed from: a */
    public <S> Snapshot mo48861a(S s8, @NotNull Function1<? super S, Snapshot> function1, @NotNull InterfaceC13227t.c cVar) {
        return InterfaceC13227t.a.m48917e(this, s8, function1, cVar);
    }

    @Override // p581ym.InterfaceC13227t
    /* JADX INFO: renamed from: b */
    public <P, S> S mo48862b(P p8, P p10, S s8, @NotNull InterfaceC14057n<? super P, ? super P, ? super S, ? extends S> interfaceC14057n, @NotNull InterfaceC13227t.c cVar) {
        return (S) InterfaceC13227t.a.m48914b(this, p8, p10, s8, interfaceC14057n, cVar);
    }

    @Override // p581ym.InterfaceC13227t
    /* JADX INFO: renamed from: c */
    public void mo48863c(@NotNull InterfaceC7906p0 interfaceC7906p0, @NotNull InterfaceC13227t.c cVar) {
        InterfaceC13227t.a.m48916d(this, interfaceC7906p0, cVar);
    }

    @Override // p581ym.InterfaceC13227t
    /* JADX INFO: renamed from: d */
    public <P, S> S mo48864d(P p8, @Nullable Snapshot snapshot, @NotNull Function2<? super P, ? super Snapshot, ? extends S> function2, @NotNull InterfaceC13227t.c cVar) {
        return (S) InterfaceC13227t.a.m48913a(this, p8, snapshot, function2, cVar);
    }

    @Override // p581ym.InterfaceC13227t
    /* JADX INFO: renamed from: e */
    public <P, S, O, R> R mo48865e(P p8, S s8, @NotNull InterfaceC13205a<? extends P, S, ? super O> interfaceC13205a, @NotNull InterfaceC14057n<? super P, ? super S, ? super InterfaceC13227t.b<P, S, O>, ? extends R> interfaceC14057n, @NotNull InterfaceC13227t.c cVar) {
        return (R) InterfaceC13227t.a.m48915c(this, p8, s8, interfaceC13205a, interfaceC14057n, cVar);
    }
}
