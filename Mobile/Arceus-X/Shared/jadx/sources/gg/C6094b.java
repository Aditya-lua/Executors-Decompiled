package gg;

import android.annotation.SuppressLint;
import androidx.annotation.NonNull;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: gg.b */
/* JADX INFO: loaded from: classes2.dex */
public class C6094b {

    /* JADX INFO: renamed from: a */
    public static final InterfaceC6093a f23415a;

    /* JADX INFO: renamed from: b */
    public static volatile InterfaceC6093a f23416b;

    /* JADX INFO: renamed from: gg.b$b */
    public static class b implements InterfaceC6093a {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public b() {
        }

        @Override // gg.InterfaceC6093a
        @NonNull
        /* JADX INFO: renamed from: a */
        public ExecutorService mo26970a(ThreadFactory threadFactory, EnumC6095c enumC6095c) {
            return m26972b(1, threadFactory, enumC6095c);
        }

        @NonNull
        @SuppressLint({"ThreadPoolCreation"})
        /* JADX INFO: renamed from: b */
        public ExecutorService m26972b(int i10, ThreadFactory threadFactory, EnumC6095c enumC6095c) {
            ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(i10, i10, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), threadFactory);
            threadPoolExecutor.allowCoreThreadTimeOut(true);
            return Executors.unconfigurableExecutorService(threadPoolExecutor);
        }
    }

    static {
        b bVar = new b();
        f23415a = bVar;
        f23416b = bVar;
    }

    /* JADX INFO: renamed from: a */
    public static InterfaceC6093a m26971a() {
        return f23416b;
    }
}
