package androidx.work;

import android.content.Context;
import android.net.Network;
import android.net.Uri;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import pe.x;
import y5.k;
import y5.u0;

/* JADX INFO: loaded from: classes.dex */
public abstract class c {
    private Context mAppContext;
    private final AtomicInteger mStopReason = new AtomicInteger(-256);
    private boolean mUsed;
    private WorkerParameters mWorkerParams;

    public static abstract class a {

        /* JADX INFO: renamed from: androidx.work.c$a$a, reason: collision with other inner class name */
        public static final class C0069a extends a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final androidx.work.b f3015a;

            public C0069a() {
                this(androidx.work.b.f3012c);
            }

            public androidx.work.b e() {
                return this.f3015a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || C0069a.class != obj.getClass()) {
                    return false;
                }
                return this.f3015a.equals(((C0069a) obj).f3015a);
            }

            public int hashCode() {
                return (C0069a.class.getName().hashCode() * 31) + this.f3015a.hashCode();
            }

            public String toString() {
                return "Failure {mOutputData=" + this.f3015a + '}';
            }

            public C0069a(androidx.work.b bVar) {
                this.f3015a = bVar;
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
        public static final class C0070c extends a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final androidx.work.b f3016a;

            public C0070c() {
                this(androidx.work.b.f3012c);
            }

            public androidx.work.b e() {
                return this.f3016a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || C0070c.class != obj.getClass()) {
                    return false;
                }
                return this.f3016a.equals(((C0070c) obj).f3016a);
            }

            public int hashCode() {
                return (C0070c.class.getName().hashCode() * 31) + this.f3016a.hashCode();
            }

            public String toString() {
                return "Success {mOutputData=" + this.f3016a + '}';
            }

            public C0070c(androidx.work.b bVar) {
                this.f3016a = bVar;
            }
        }

        public static a a() {
            return new C0069a();
        }

        public static a b(androidx.work.b bVar) {
            return new C0069a(bVar);
        }

        public static a c() {
            return new b();
        }

        public static a d() {
            return new C0070c();
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
        return y1.c.a(new y1.c.InterfaceC0761c() { // from class: y5.v
            @Override // y1.c.InterfaceC0761c
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

    public i6.b getTaskExecutor() {
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
