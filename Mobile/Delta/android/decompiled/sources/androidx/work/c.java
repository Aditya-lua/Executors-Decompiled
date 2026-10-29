package androidx.work;

import android.content.Context;
import android.net.Network;
import android.net.Uri;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import me.x;
import x5.k;
import x5.u0;

/* JADX INFO: loaded from: classes.dex */
public abstract class c {
    private Context mAppContext;
    private final AtomicInteger mStopReason = new AtomicInteger(-256);
    private boolean mUsed;
    private WorkerParameters mWorkerParams;

    public static abstract class a {

        /* JADX INFO: renamed from: androidx.work.c$a$a, reason: collision with other inner class name */
        public static final class C0065a extends a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final androidx.work.b f3503a;

            public C0065a() {
                this(androidx.work.b.f3500c);
            }

            public androidx.work.b e() {
                return this.f3503a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || C0065a.class != obj.getClass()) {
                    return false;
                }
                return this.f3503a.equals(((C0065a) obj).f3503a);
            }

            public int hashCode() {
                return (C0065a.class.getName().hashCode() * 31) + this.f3503a.hashCode();
            }

            public String toString() {
                return "Failure {mOutputData=" + this.f3503a + '}';
            }

            public C0065a(androidx.work.b bVar) {
                this.f3503a = bVar;
            }
        }

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

        /* JADX INFO: renamed from: androidx.work.c$a$c, reason: collision with other inner class name */
        public static final class C0066c extends a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final androidx.work.b f3504a;

            public C0066c() {
                this(androidx.work.b.f3500c);
            }

            public androidx.work.b e() {
                return this.f3504a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || C0066c.class != obj.getClass()) {
                    return false;
                }
                return this.f3504a.equals(((C0066c) obj).f3504a);
            }

            public int hashCode() {
                return (C0066c.class.getName().hashCode() * 31) + this.f3504a.hashCode();
            }

            public String toString() {
                return "Success {mOutputData=" + this.f3504a + '}';
            }

            public C0066c(androidx.work.b bVar) {
                this.f3504a = bVar;
            }
        }

        public static a a() {
            return new C0065a();
        }

        public static a b(androidx.work.b bVar) {
            return new C0065a(bVar);
        }

        public static a c() {
            return new b();
        }

        public static a d() {
            return new C0066c();
        }
    }

    public c(Context context, WorkerParameters workerParameters) {
        if (context == null) {
            throw new IllegalArgumentException("Application Context is null");
        }
        if (workerParameters == null) {
            throw new IllegalArgumentException("WorkerParameters is null");
        }
        this.mAppContext = context;
        this.mWorkerParams = workerParameters;
    }

    public static /* synthetic */ Object a(y1.c.a aVar) {
        aVar.f(new IllegalStateException("Expedited WorkRequests require a ListenableWorker to provide an implementation for`getForegroundInfoAsync()`"));
        return "default failing getForegroundInfoAsync";
    }

    public final Context getApplicationContext() {
        return this.mAppContext;
    }

    public Executor getBackgroundExecutor() {
        return this.mWorkerParams.a();
    }

    public x<k> getForegroundInfoAsync() {
        return y1.c.a(new y1.c.InterfaceC0650c() { // from class: x5.v
            @Override // y1.c.InterfaceC0650c
            public final Object a(y1.c.a aVar) {
                return androidx.work.c.a(aVar);
            }
        });
    }

    public final UUID getId() {
        return this.mWorkerParams.c();
    }

    public final b getInputData() {
        return this.mWorkerParams.d();
    }

    public final Network getNetwork() {
        return this.mWorkerParams.e();
    }

    public final int getRunAttemptCount() {
        return this.mWorkerParams.g();
    }

    public final int getStopReason() {
        return this.mStopReason.get();
    }

    public final Set<String> getTags() {
        return this.mWorkerParams.h();
    }

    public h6.b getTaskExecutor() {
        return this.mWorkerParams.i();
    }

    public final List<String> getTriggeredContentAuthorities() {
        return this.mWorkerParams.j();
    }

    public final List<Uri> getTriggeredContentUris() {
        return this.mWorkerParams.k();
    }

    public u0 getWorkerFactory() {
        return this.mWorkerParams.m();
    }

    public final boolean isStopped() {
        return this.mStopReason.get() != -256;
    }

    public final boolean isUsed() {
        return this.mUsed;
    }

    public void onStopped() {
    }

    public final x<Void> setForegroundAsync(k kVar) {
        return this.mWorkerParams.b().a(getApplicationContext(), getId(), kVar);
    }

    public x<Void> setProgressAsync(b bVar) {
        return this.mWorkerParams.f().a(getApplicationContext(), getId(), bVar);
    }

    public final void setUsed() {
        this.mUsed = true;
    }

    public abstract x<a> startWork();

    public final void stop(int i10) {
        if (this.mStopReason.compareAndSet(-256, i10)) {
            onStopped();
        }
    }
}
