package sw;

import ew.l0;
import java.io.IOException;
import java.util.Objects;
import mv.f0;
import mv.h0;
import mv.i0;

/* JADX INFO: loaded from: classes2.dex */
public final class q<T> implements d<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w f31983a;
    public final Object b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object[] f31984c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final mv.e.a f31985d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final h<i0, T> f31986e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public volatile boolean f31987f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public mv.e f31988g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Throwable f31989h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f31990i;

    public class a implements mv.f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ f f31991a;

        public a(f fVar) {
            this.f31991a = fVar;
        }

        public final void a(Throwable th2) {
            try {
                this.f31991a.a(q.this, th2);
            } catch (Throwable th3) {
                c0.t(th3);
                th3.printStackTrace();
            }
        }

        @Override // mv.f
        public void onFailure(mv.e eVar, IOException iOException) {
            a(iOException);
        }

        @Override // mv.f
        public void onResponse(mv.e eVar, h0 h0Var) {
            try {
                try {
                    this.f31991a.b(q.this, q.this.e(h0Var));
                } catch (Throwable th2) {
                    c0.t(th2);
                    th2.printStackTrace();
                }
            } catch (Throwable th3) {
                c0.t(th3);
                a(th3);
            }
        }
    }

    public static final class b extends i0 {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final i0 f31992d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final ew.g f31993e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public IOException f31994f;

        public class a extends ew.n {
            public a(l0 l0Var) {
                super(l0Var);
            }

            @Override // ew.n, ew.l0
            public long f3(ew.e eVar, long j10) throws IOException {
                try {
                    return super.f3(eVar, j10);
                } catch (IOException e10) {
                    b.this.f31994f = e10;
                    throw e10;
                }
            }
        }

        public b(i0 i0Var) {
            this.f31992d = i0Var;
            this.f31993e = ew.v.c(new a(i0Var.getCom.appsflyer.sdk_base.referrer.Payload.SOURCE java.lang.String()));
        }

        @Override // mv.i0, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.f31992d.close();
        }

        @Override // mv.i0
        /* JADX INFO: renamed from: e */
        public long getContentLength() {
            return this.f31992d.getContentLength();
        }

        @Override // mv.i0
        /* JADX INFO: renamed from: f */
        public mv.b0 getMediaType() {
            return this.f31992d.getMediaType();
        }

        public void k() throws IOException {
            IOException iOException = this.f31994f;
            if (iOException != null) {
                throw iOException;
            }
        }

        @Override // mv.i0
        /* JADX INFO: renamed from: l3 */
        public ew.g getCom.appsflyer.sdk_base.referrer.Payload.SOURCE java.lang.String() {
            return this.f31993e;
        }
    }

    public static final class c extends i0 {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final mv.b0 f31995d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final long f31996e;

        public c(mv.b0 b0Var, long j10) {
            this.f31995d = b0Var;
            this.f31996e = j10;
        }

        @Override // mv.i0
        /* JADX INFO: renamed from: e */
        public long getContentLength() {
            return this.f31996e;
        }

        @Override // mv.i0
        /* JADX INFO: renamed from: f */
        public mv.b0 getMediaType() {
            return this.f31995d;
        }

        @Override // mv.i0
        /* JADX INFO: renamed from: l3 */
        public ew.g getCom.appsflyer.sdk_base.referrer.Payload.SOURCE java.lang.String() {
            throw new IllegalStateException("Cannot read raw response body of a converted body.");
        }
    }

    public q(w wVar, Object obj, Object[] objArr, mv.e.a aVar, h<i0, T> hVar) {
        this.f31983a = wVar;
        this.b = obj;
        this.f31984c = objArr;
        this.f31985d = aVar;
        this.f31986e = hVar;
    }

    @Override // sw.d
    public void L(f<T> fVar) {
        mv.e eVar;
        Throwable th2;
        Objects.requireNonNull(fVar, "callback == null");
        synchronized (this) {
            try {
                if (this.f31990i) {
                    throw new IllegalStateException("Already executed.");
                }
                this.f31990i = true;
                eVar = this.f31988g;
                th2 = this.f31989h;
                if (eVar == null && th2 == null) {
                    try {
                        mv.e eVarB = b();
                        this.f31988g = eVarB;
                        eVar = eVarB;
                    } catch (Throwable th3) {
                        th2 = th3;
                        c0.t(th2);
                        this.f31989h = th2;
                    }
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
        if (th2 != null) {
            fVar.a(this, th2);
            return;
        }
        if (this.f31987f) {
            eVar.cancel();
        }
        eVar.b0(new a(fVar));
    }

    @Override // sw.d
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public q<T> clone() {
        return new q<>(this.f31983a, this.b, this.f31984c, this.f31985d, this.f31986e);
    }

    public final mv.e b() {
        mv.e eVarA = this.f31985d.a(this.f31983a.a(this.b, this.f31984c));
        if (eVarA != null) {
            return eVarA;
        }
        throw new NullPointerException("Call.Factory returned null.");
    }

    public final mv.e c() throws IOException {
        mv.e eVar = this.f31988g;
        if (eVar != null) {
            return eVar;
        }
        Throwable th2 = this.f31989h;
        if (th2 != null) {
            if (th2 instanceof IOException) {
                throw ((IOException) th2);
            }
            if (th2 instanceof RuntimeException) {
                throw ((RuntimeException) th2);
            }
            throw ((Error) th2);
        }
        try {
            mv.e eVarB = b();
            this.f31988g = eVarB;
            return eVarB;
        } catch (IOException | Error | RuntimeException e10) {
            c0.t(e10);
            this.f31989h = e10;
            throw e10;
        }
    }

    @Override // sw.d
    public void cancel() {
        mv.e eVar;
        this.f31987f = true;
        synchronized (this) {
            eVar = this.f31988g;
        }
        if (eVar != null) {
            eVar.cancel();
        }
    }

    public x<T> e(h0 h0Var) throws IOException {
        i0 body = h0Var.getBody();
        h0 h0VarC = h0Var.s().b(new c(body.getMediaType(), body.getContentLength())).c();
        int code = h0VarC.getCode();
        if (code < 200 || code >= 300) {
            try {
                return x.d(c0.a(body), h0VarC);
            } finally {
                body.close();
            }
        }
        if (code == 204 || code == 205) {
            body.close();
            return x.j(null, h0VarC);
        }
        b bVar = new b(body);
        try {
            return x.j(this.f31986e.a(bVar), h0VarC);
        } catch (RuntimeException e10) {
            bVar.k();
            throw e10;
        }
    }

    @Override // sw.d
    public synchronized f0 h() {
        try {
        } catch (IOException e10) {
            throw new RuntimeException("Unable to create request.", e10);
        }
        return c().getOriginalRequest();
    }

    @Override // sw.d
    public x<T> j() {
        mv.e eVarC;
        synchronized (this) {
            if (this.f31990i) {
                throw new IllegalStateException("Already executed.");
            }
            this.f31990i = true;
            eVarC = c();
        }
        if (this.f31987f) {
            eVarC.cancel();
        }
        return e(eVarC.j());
    }

    @Override // sw.d
    public boolean m() {
        boolean z10 = true;
        if (this.f31987f) {
            return true;
        }
        synchronized (this) {
            try {
                mv.e eVar = this.f31988g;
                if (eVar == null || !eVar.getCanceled()) {
                    z10 = false;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return z10;
    }
}
