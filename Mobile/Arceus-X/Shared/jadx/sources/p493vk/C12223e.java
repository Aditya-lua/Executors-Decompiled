package p493vk;

import android.os.Handler;
import android.os.Looper;
import androidx.annotation.NonNull;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: vk.e */
/* JADX INFO: loaded from: classes2.dex */
public class C12223e implements InterfaceC12221c {

    /* JADX INFO: renamed from: a */
    public final Executor f43090a;

    /* JADX INFO: renamed from: b */
    public final Executor f43091b;

    /* JADX INFO: renamed from: vk.e$a */
    public static class a implements Executor {

        /* JADX INFO: renamed from: a */
        public Handler f43092a = new Handler(Looper.getMainLooper());

        @Override // java.util.concurrent.Executor
        public void execute(@NonNull Runnable runnable) {
            this.f43092a.post(runnable);
        }
    }

    public C12223e(Executor executor, Executor executor2) {
        this.f43090a = executor;
        this.f43091b = executor2;
    }

    @Override // p493vk.InterfaceC12221c
    /* JADX INFO: renamed from: a */
    public Executor mo45313a() {
        return this.f43091b;
    }

    @Override // p493vk.InterfaceC12221c
    /* JADX INFO: renamed from: b */
    public Executor mo45314b() {
        return this.f43090a;
    }
}
