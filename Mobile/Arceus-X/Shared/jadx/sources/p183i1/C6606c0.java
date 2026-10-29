package p183i1;

import android.annotation.SuppressLint;
import java.nio.ByteBuffer;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicBoolean;
import p140g0.C5931r1;
import p366q0.C10417c;
import p533x2.C12637g;

/* JADX INFO: renamed from: i1.c0 */
/* JADX INFO: loaded from: classes.dex */
public class C6606c0 implements InterfaceC6621p {

    /* JADX INFO: renamed from: g */
    public final InterfaceC6621p f25476g;

    /* JADX INFO: renamed from: h */
    public final int f25477h;

    /* JADX INFO: renamed from: i */
    public final int f25478i;

    /* JADX INFO: renamed from: j */
    public final int f25479j;

    /* JADX INFO: renamed from: l */
    public int f25481l;

    /* JADX INFO: renamed from: a */
    public final AtomicBoolean f25470a = new AtomicBoolean(false);

    /* JADX INFO: renamed from: b */
    public final AtomicBoolean f25471b = new AtomicBoolean(false);

    /* JADX INFO: renamed from: c */
    public final Queue<a> f25472c = new ConcurrentLinkedQueue();

    /* JADX INFO: renamed from: d */
    public final Executor f25473d = C10417c.m40086g(C10417c.m40080a());

    /* JADX INFO: renamed from: e */
    public final Object f25474e = new Object();

    /* JADX INFO: renamed from: f */
    public a f25475f = null;

    /* JADX INFO: renamed from: k */
    public final AtomicBoolean f25480k = new AtomicBoolean(false);

    /* JADX INFO: renamed from: i1.c0$a */
    public static class a {

        /* JADX INFO: renamed from: a */
        public final int f25482a;

        /* JADX INFO: renamed from: b */
        public final int f25483b;

        /* JADX INFO: renamed from: c */
        public final ByteBuffer f25484c;

        /* JADX INFO: renamed from: d */
        public long f25485d;

        public a(ByteBuffer byteBuffer, InterfaceC6621p.c cVar, int i10, int i11) {
            byteBuffer.rewind();
            int iLimit = byteBuffer.limit() - byteBuffer.position();
            if (iLimit == cVar.mo28586a()) {
                this.f25482a = i10;
                this.f25483b = i11;
                this.f25484c = byteBuffer;
                this.f25485d = cVar.mo28587b();
                return;
            }
            throw new IllegalStateException("Byte buffer size is not match with packet info: " + iLimit + " != " + cVar.mo28586a());
        }

        /* JADX INFO: renamed from: a */
        public int m28536a() {
            return this.f25484c.remaining();
        }

        /* JADX INFO: renamed from: b */
        public InterfaceC6621p.c m28537b(ByteBuffer byteBuffer) {
            int iRemaining;
            long j10 = this.f25485d;
            int iPosition = this.f25484c.position();
            int iPosition2 = byteBuffer.position();
            if (this.f25484c.remaining() > byteBuffer.remaining()) {
                iRemaining = byteBuffer.remaining();
                this.f25485d += C6625t.m28604d(C6625t.m28607g(iRemaining, this.f25482a), this.f25483b);
                ByteBuffer byteBufferDuplicate = this.f25484c.duplicate();
                byteBufferDuplicate.position(iPosition).limit(iPosition + iRemaining);
                byteBuffer.put(byteBufferDuplicate).limit(iPosition2 + iRemaining).position(iPosition2);
            } else {
                iRemaining = this.f25484c.remaining();
                byteBuffer.put(this.f25484c).limit(iPosition2 + iRemaining).position(iPosition2);
            }
            this.f25484c.position(iPosition + iRemaining);
            return InterfaceC6621p.c.m28585c(iRemaining, j10);
        }
    }

    public C6606c0(InterfaceC6621p interfaceC6621p, AbstractC6601a abstractC6601a) {
        this.f25476g = interfaceC6621p;
        int iM28511d = abstractC6601a.m28511d();
        this.f25477h = iM28511d;
        int iMo28512e = abstractC6601a.mo28512e();
        this.f25478i = iMo28512e;
        C12637g.m47070b(((long) iM28511d) > 0, "mBytesPerFrame must be greater than 0.");
        C12637g.m47070b(((long) iMo28512e) > 0, "mSampleRate must be greater than 0.");
        this.f25479j = 500;
        this.f25481l = iM28511d * 1024;
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m28522c(C6606c0 c6606c0) {
        c6606c0.f25480k.set(false);
        c6606c0.f25476g.stop();
        synchronized (c6606c0.f25474e) {
            c6606c0.f25475f = null;
            c6606c0.f25472c.clear();
        }
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m28523d(C6606c0 c6606c0) {
        c6606c0.getClass();
        try {
            c6606c0.f25476g.start();
            c6606c0.m28533l();
        } catch (InterfaceC6621p.b e10) {
            throw new RuntimeException(e10);
        }
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m28524e(C6606c0 c6606c0) {
        c6606c0.f25480k.set(false);
        c6606c0.f25476g.mo28530a();
        synchronized (c6606c0.f25474e) {
            c6606c0.f25475f = null;
            c6606c0.f25472c.clear();
        }
    }

    /* JADX INFO: renamed from: i */
    private void m28528i() {
        C12637g.m47078j(!this.f25471b.get(), "AudioStream has been released.");
    }

    /* JADX INFO: renamed from: j */
    private void m28529j() {
        C12637g.m47078j(this.f25470a.get(), "AudioStream has not been started.");
    }

    @Override // p183i1.InterfaceC6621p
    /* JADX INFO: renamed from: a */
    public void mo28530a() {
        if (this.f25471b.getAndSet(true)) {
            return;
        }
        this.f25473d.execute(new Runnable() { // from class: i1.b0
            @Override // java.lang.Runnable
            public final void run() {
                C6606c0.m28524e(this.f25467a);
            }
        });
    }

    @Override // p183i1.InterfaceC6621p
    /* JADX INFO: renamed from: b */
    public void mo28531b(final InterfaceC6621p.a aVar, final Executor executor) {
        boolean z10 = true;
        C12637g.m47078j(!this.f25470a.get(), "AudioStream can not be started when setCallback.");
        m28528i();
        if (aVar != null && executor == null) {
            z10 = false;
        }
        C12637g.m47070b(z10, "executor can't be null with non-null callback.");
        this.f25473d.execute(new Runnable() { // from class: i1.x
            @Override // java.lang.Runnable
            public final void run() {
                this.f25574a.f25476g.mo28531b(aVar, executor);
            }
        });
    }

    /* JADX INFO: renamed from: k */
    public final void m28532k() {
        if (this.f25480k.get()) {
            ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(this.f25481l);
            a aVar = new a(byteBufferAllocateDirect, this.f25476g.read(byteBufferAllocateDirect), this.f25477h, this.f25478i);
            int i10 = this.f25479j;
            synchronized (this.f25474e) {
                try {
                    this.f25472c.offer(aVar);
                    while (this.f25472c.size() > i10) {
                        this.f25472c.poll();
                        C5931r1.m26572l("BufferedAudioStream", "Drop audio data due to full of queue.");
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            if (this.f25480k.get()) {
                this.f25473d.execute(new Runnable() { // from class: i1.a0
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f25465a.m28532k();
                    }
                });
            }
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m28533l() {
        if (this.f25480k.getAndSet(true)) {
            return;
        }
        m28532k();
    }

    /* JADX INFO: renamed from: m */
    public final void m28534m(int i10) {
        int i11 = this.f25481l;
        if (i11 == i10) {
            return;
        }
        int i12 = this.f25477h;
        this.f25481l = (i10 / i12) * i12;
        C5931r1.m26561a("BufferedAudioStream", "Update buffer size from " + i11 + " to " + this.f25481l);
    }

    /* JADX INFO: renamed from: n */
    public final void m28535n(final int i10) {
        this.f25473d.execute(new Runnable() { // from class: i1.z
            @Override // java.lang.Runnable
            public final void run() {
                this.f25578a.m28534m(i10);
            }
        });
    }

    @Override // p183i1.InterfaceC6621p
    @SuppressLint({"BanThreadSleep"})
    public InterfaceC6621p.c read(ByteBuffer byteBuffer) {
        boolean z10;
        m28528i();
        m28529j();
        m28535n(byteBuffer.remaining());
        InterfaceC6621p.c cVarM28585c = InterfaceC6621p.c.m28585c(0, 0L);
        do {
            synchronized (this.f25474e) {
                try {
                    a aVarPoll = this.f25475f;
                    this.f25475f = null;
                    if (aVarPoll == null) {
                        aVarPoll = this.f25472c.poll();
                    }
                    if (aVarPoll != null) {
                        cVarM28585c = aVarPoll.m28537b(byteBuffer);
                        if (aVarPoll.m28536a() > 0) {
                            this.f25475f = aVarPoll;
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            z10 = cVarM28585c.mo28586a() <= 0 && this.f25470a.get() && !this.f25471b.get();
            if (z10) {
                try {
                    Thread.sleep(1L);
                } catch (InterruptedException e10) {
                    C5931r1.m26573m("BufferedAudioStream", "Interruption while waiting for audio data", e10);
                    return cVarM28585c;
                }
            }
        } while (z10);
        return cVarM28585c;
    }

    @Override // p183i1.InterfaceC6621p
    public void start() throws InterfaceC6621p.b {
        m28528i();
        if (this.f25470a.getAndSet(true)) {
            return;
        }
        FutureTask futureTask = new FutureTask(new Runnable() { // from class: i1.y
            @Override // java.lang.Runnable
            public final void run() {
                C6606c0.m28523d(this.f25577a);
            }
        }, null);
        this.f25473d.execute(futureTask);
        try {
            futureTask.get();
        } catch (InterruptedException | ExecutionException e10) {
            this.f25470a.set(false);
            throw new InterfaceC6621p.b(e10);
        }
    }

    @Override // p183i1.InterfaceC6621p
    public void stop() {
        m28528i();
        if (this.f25470a.getAndSet(false)) {
            this.f25473d.execute(new Runnable() { // from class: i1.w
                @Override // java.lang.Runnable
                public final void run() {
                    C6606c0.m28522c(this.f25573a);
                }
            });
        }
    }
}
