package i1;

import android.annotation.SuppressLint;
import com.google.mlkit.vision.barcode.common.Barcode;
import g0.r1;
import java.nio.ByteBuffer;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public class c0 implements p {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final p f20280g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f20281h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f20282i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f20283j;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f20285l;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicBoolean f20275a = new AtomicBoolean(false);
    public final AtomicBoolean b = new AtomicBoolean(false);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Queue<a> f20276c = new ConcurrentLinkedQueue();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Executor f20277d = q0.c.g(q0.c.a());

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f20278e = new Object();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public a f20279f = null;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final AtomicBoolean f20284k = new AtomicBoolean(false);

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f20286a;
        public final int b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final ByteBuffer f20287c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public long f20288d;

        public a(ByteBuffer byteBuffer, p.c cVar, int i10, int i11) {
            byteBuffer.rewind();
            int iLimit = byteBuffer.limit() - byteBuffer.position();
            if (iLimit == cVar.a()) {
                this.f20286a = i10;
                this.b = i11;
                this.f20287c = byteBuffer;
                this.f20288d = cVar.b();
                return;
            }
            throw new IllegalStateException("Byte buffer size is not match with packet info: " + iLimit + " != " + cVar.a());
        }

        public int a() {
            return this.f20287c.remaining();
        }

        public p.c b(ByteBuffer byteBuffer) {
            int iRemaining;
            long j10 = this.f20288d;
            int iPosition = this.f20287c.position();
            int iPosition2 = byteBuffer.position();
            if (this.f20287c.remaining() > byteBuffer.remaining()) {
                iRemaining = byteBuffer.remaining();
                this.f20288d += t.d(t.g(iRemaining, this.f20286a), this.b);
                ByteBuffer byteBufferDuplicate = this.f20287c.duplicate();
                byteBufferDuplicate.position(iPosition).limit(iPosition + iRemaining);
                byteBuffer.put(byteBufferDuplicate).limit(iPosition2 + iRemaining).position(iPosition2);
            } else {
                iRemaining = this.f20287c.remaining();
                byteBuffer.put(this.f20287c).limit(iPosition2 + iRemaining).position(iPosition2);
            }
            this.f20287c.position(iPosition + iRemaining);
            return p.c.c(iRemaining, j10);
        }
    }

    public c0(p pVar, i1.a aVar) {
        this.f20280g = pVar;
        int iD = aVar.d();
        this.f20281h = iD;
        int iE = aVar.e();
        this.f20282i = iE;
        x2.g.b(((long) iD) > 0, "mBytesPerFrame must be greater than 0.");
        x2.g.b(((long) iE) > 0, "mSampleRate must be greater than 0.");
        this.f20283j = 500;
        this.f20285l = iD * Barcode.FORMAT_UPC_E;
    }

    public static /* synthetic */ void c(c0 c0Var) {
        c0Var.f20284k.set(false);
        c0Var.f20280g.stop();
        synchronized (c0Var.f20278e) {
            c0Var.f20279f = null;
            c0Var.f20276c.clear();
        }
    }

    public static /* synthetic */ void d(c0 c0Var) {
        c0Var.getClass();
        try {
            c0Var.f20280g.start();
            c0Var.l();
        } catch (p.b e10) {
            throw new RuntimeException(e10);
        }
    }

    public static /* synthetic */ void e(c0 c0Var) {
        c0Var.f20284k.set(false);
        c0Var.f20280g.a();
        synchronized (c0Var.f20278e) {
            c0Var.f20279f = null;
            c0Var.f20276c.clear();
        }
    }

    private void i() {
        x2.g.j(!this.b.get(), "AudioStream has been released.");
    }

    private void j() {
        x2.g.j(this.f20275a.get(), "AudioStream has not been started.");
    }

    @Override // i1.p
    public void a() {
        if (this.b.getAndSet(true)) {
            return;
        }
        this.f20277d.execute(new Runnable() { // from class: i1.b0
            @Override // java.lang.Runnable
            public final void run() {
                c0.e(this.f20273a);
            }
        });
    }

    @Override // i1.p
    public void b(final p.a aVar, final Executor executor) {
        boolean z10 = true;
        x2.g.j(!this.f20275a.get(), "AudioStream can not be started when setCallback.");
        i();
        if (aVar != null && executor == null) {
            z10 = false;
        }
        x2.g.b(z10, "executor can't be null with non-null callback.");
        this.f20277d.execute(new Runnable() { // from class: i1.x
            @Override // java.lang.Runnable
            public final void run() {
                this.f20359a.f20280g.b(aVar, executor);
            }
        });
    }

    public final void k() {
        if (this.f20284k.get()) {
            ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(this.f20285l);
            a aVar = new a(byteBufferAllocateDirect, this.f20280g.read(byteBufferAllocateDirect), this.f20281h, this.f20282i);
            int i10 = this.f20283j;
            synchronized (this.f20278e) {
                try {
                    this.f20276c.offer(aVar);
                    while (this.f20276c.size() > i10) {
                        this.f20276c.poll();
                        r1.l("BufferedAudioStream", "Drop audio data due to full of queue.");
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            if (this.f20284k.get()) {
                this.f20277d.execute(new Runnable() { // from class: i1.a0
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f20271a.k();
                    }
                });
            }
        }
    }

    public final void l() {
        if (this.f20284k.getAndSet(true)) {
            return;
        }
        k();
    }

    public final void m(int i10) {
        int i11 = this.f20285l;
        if (i11 == i10) {
            return;
        }
        int i12 = this.f20281h;
        this.f20285l = (i10 / i12) * i12;
        r1.a("BufferedAudioStream", "Update buffer size from " + i11 + " to " + this.f20285l);
    }

    public final void n(final int i10) {
        this.f20277d.execute(new Runnable() { // from class: i1.z
            @Override // java.lang.Runnable
            public final void run() {
                this.f20362a.m(i10);
            }
        });
    }

    @Override // i1.p
    @SuppressLint({"BanThreadSleep"})
    public p.c read(ByteBuffer byteBuffer) {
        boolean z10;
        i();
        j();
        n(byteBuffer.remaining());
        p.c cVarC = p.c.c(0, 0L);
        do {
            synchronized (this.f20278e) {
                try {
                    a aVarPoll = this.f20279f;
                    this.f20279f = null;
                    if (aVarPoll == null) {
                        aVarPoll = this.f20276c.poll();
                    }
                    if (aVarPoll != null) {
                        cVarC = aVarPoll.b(byteBuffer);
                        if (aVarPoll.a() > 0) {
                            this.f20279f = aVarPoll;
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            z10 = cVarC.a() <= 0 && this.f20275a.get() && !this.b.get();
            if (z10) {
                try {
                    Thread.sleep(1L);
                } catch (InterruptedException e10) {
                    r1.m("BufferedAudioStream", "Interruption while waiting for audio data", e10);
                    return cVarC;
                }
            }
        } while (z10);
        return cVarC;
    }

    @Override // i1.p
    public void start() throws p.b {
        i();
        if (this.f20275a.getAndSet(true)) {
            return;
        }
        FutureTask futureTask = new FutureTask(new Runnable() { // from class: i1.y
            @Override // java.lang.Runnable
            public final void run() {
                c0.d(this.f20361a);
            }
        }, null);
        this.f20277d.execute(futureTask);
        try {
            futureTask.get();
        } catch (InterruptedException | ExecutionException e10) {
            this.f20275a.set(false);
            throw new p.b(e10);
        }
    }

    @Override // i1.p
    public void stop() {
        i();
        if (this.f20275a.getAndSet(false)) {
            this.f20277d.execute(new Runnable() { // from class: i1.w
                @Override // java.lang.Runnable
                public final void run() {
                    c0.c(this.f20358a);
                }
            });
        }
    }
}
