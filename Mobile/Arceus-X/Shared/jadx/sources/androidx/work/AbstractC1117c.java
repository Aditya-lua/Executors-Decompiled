package androidx.work;

import android.content.Context;
import android.net.Network;
import android.net.Uri;
import androidx.core.view.InputDeviceCompat;
import androidx.work.AbstractC1117c;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import ne.InterfaceFutureC9440x;
import p161h6.InterfaceC6292b;
import p536x5.AbstractC12729u0;
import p536x5.C12708k;
import p563y1.C12997c;

/* JADX INFO: renamed from: androidx.work.c */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1117c {
    private Context mAppContext;
    private final AtomicInteger mStopReason = new AtomicInteger(InputDeviceCompat.SOURCE_ANY);
    private boolean mUsed;
    private WorkerParameters mWorkerParams;

    /* JADX INFO: renamed from: androidx.work.c$a */
    public static abstract class a {

        /* JADX INFO: renamed from: androidx.work.c$a$a, reason: collision with other inner class name */
        public static final class C14089a extends a {

            /* JADX INFO: renamed from: a */
            public final C1116b f4584a;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            public C14089a() {
                this(C1116b.f4581c);
            }

            /* JADX INFO: renamed from: e */
            public C1116b m6343e() {
                return this.f4584a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || C14089a.class != obj.getClass()) {
                    return false;
                }
                return this.f4584a.equals(((C14089a) obj).f4584a);
            }

            public int hashCode() {
                return (C14089a.class.getName().hashCode() * 31) + this.f4584a.hashCode();
            }

            public String toString() {
                return "Failure {mOutputData=" + this.f4584a + '}';
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
            public C14089a(C1116b c1116b) {
                this.f4584a = c1116b;
            }
        }

        /* JADX INFO: renamed from: androidx.work.c$a$b */
        public static final class b extends a {
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return obj != null && b.class == obj.getClass();
            }

            public int hashCode() {
                return b.class.getName().hashCode();
            }

            public String toString() {
                return "Retry";
            }
        }

        /* JADX INFO: renamed from: androidx.work.c$a$c */
        public static final class c extends a {

            /* JADX INFO: renamed from: a */
            public final C1116b f4585a;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            public c() {
                this(C1116b.f4581c);
            }

            /* JADX INFO: renamed from: e */
            public C1116b m6344e() {
                return this.f4585a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || c.class != obj.getClass()) {
                    return false;
                }
                return this.f4585a.equals(((c) obj).f4585a);
            }

            public int hashCode() {
                return (c.class.getName().hashCode() * 31) + this.f4585a.hashCode();
            }

            public String toString() {
                return "Success {mOutputData=" + this.f4585a + '}';
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
            public c(C1116b c1116b) {
                this.f4585a = c1116b;
            }
        }

        /* JADX INFO: renamed from: a */
        public static a m6339a() {
            return new C14089a();
        }

        /* JADX INFO: renamed from: b */
        public static a m6340b(C1116b c1116b) {
            return new C14089a(c1116b);
        }

        /* JADX INFO: renamed from: c */
        public static a m6341c() {
            return new b();
        }

        /* JADX INFO: renamed from: d */
        public static a m6342d() {
            return new c();
        }
    }

    public AbstractC1117c(Context context, WorkerParameters workerParameters) {
        if (context == null) {
            throw new IllegalArgumentException("Application Context is null");
        }
        if (workerParameters == null) {
            throw new IllegalArgumentException("WorkerParameters is null");
        }
        this.mAppContext = context;
        this.mWorkerParams = workerParameters;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ Object m6338a(C12997c.a aVar) {
        aVar.m48317f(new IllegalStateException("Expedited WorkRequests require a ListenableWorker to provide an implementation for`getForegroundInfoAsync()`"));
        return "default failing getForegroundInfoAsync";
    }

    public final Context getApplicationContext() {
        return this.mAppContext;
    }

    public Executor getBackgroundExecutor() {
        return this.mWorkerParams.m6255a();
    }

    public InterfaceFutureC9440x<C12708k> getForegroundInfoAsync() {
        return C12997c.m48311a(new C12997c.c() { // from class: x5.v
            @Override // p563y1.C12997c.c
            /* JADX INFO: renamed from: a */
            public final Object mo22051a(C12997c.a aVar) {
                return AbstractC1117c.m6338a(aVar);
            }
        });
    }

    public final UUID getId() {
        return this.mWorkerParams.m6257c();
    }

    public final C1116b getInputData() {
        return this.mWorkerParams.m6258d();
    }

    public final Network getNetwork() {
        return this.mWorkerParams.m6259e();
    }

    public final int getRunAttemptCount() {
        return this.mWorkerParams.m6261g();
    }

    public final int getStopReason() {
        return this.mStopReason.get();
    }

    public final Set<String> getTags() {
        return this.mWorkerParams.m6262h();
    }

    public InterfaceC6292b getTaskExecutor() {
        return this.mWorkerParams.m6263i();
    }

    public final List<String> getTriggeredContentAuthorities() {
        return this.mWorkerParams.m6264j();
    }

    public final List<Uri> getTriggeredContentUris() {
        return this.mWorkerParams.m6265k();
    }

    public AbstractC12729u0 getWorkerFactory() {
        return this.mWorkerParams.m6267m();
    }

    public final boolean isStopped() {
        return this.mStopReason.get() != -256;
    }

    public final boolean isUsed() {
        return this.mUsed;
    }

    public void onStopped() {
    }

    public final InterfaceFutureC9440x<Void> setForegroundAsync(C12708k c12708k) {
        return this.mWorkerParams.m6256b().mo26801a(getApplicationContext(), getId(), c12708k);
    }

    public InterfaceFutureC9440x<Void> setProgressAsync(C1116b c1116b) {
        return this.mWorkerParams.m6260f().mo26803a(getApplicationContext(), getId(), c1116b);
    }

    public final void setUsed() {
        this.mUsed = true;
    }

    public abstract InterfaceFutureC9440x<a> startWork();

    public final void stop(int i10) {
        if (this.mStopReason.compareAndSet(InputDeviceCompat.SOURCE_ANY, i10)) {
            onStopped();
        }
    }
}
