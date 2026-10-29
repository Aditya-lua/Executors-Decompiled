package p424s0;

import java.util.concurrent.Executor;
import p296n0.InterfaceC8787l3;
import p296n0.InterfaceC8795n1;

/* JADX INFO: renamed from: s0.r */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC11157r extends InterfaceC8787l3 {

    /* JADX INFO: renamed from: O */
    public static final InterfaceC8795n1.a<Executor> f39402O = InterfaceC8795n1.a.m35291a("camerax.core.thread.backgroundExecutor", Executor.class);

    /* JADX INFO: renamed from: e0 */
    default Executor m42046e0(Executor executor) {
        return (Executor) mo35030h(f39402O, executor);
    }
}
