package jv;

import java.io.IOException;
import java.util.Objects;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
import xu.r0;

/* JADX INFO: loaded from: classes2.dex */
public final class q<T> implements d<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w f21876a;
    public final Object b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object[] f21877c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Call.Factory f21878d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final h<ResponseBody, T> f21879e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public volatile boolean f21880f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Call f21881g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Throwable f21882h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f21883i;

    public class a implements Callback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ f f21884a;

        public a(f fVar) {
            this.f21884a = fVar;
        }

        public final void a(Throwable th2) {
            try {
                this.f21884a.b(q.this, th2);
            } catch (Throwable th3) {
                c0.t(th3);
                th3.printStackTrace();
            }
        }

        @Override // okhttp3.Callback
        public void onFailure(Call call, IOException iOException) {
            a(iOException);
        }

        @Override // okhttp3.Callback
        public void onResponse(Call call, Response response) {
            try {
                try {
                    this.f21884a.a(q.this, q.this.e(response));
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

    public static final class b extends ResponseBody {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ResponseBody f21885a;
        public final xu.g b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public IOException f21886c;

        public class a extends xu.p {
            public a(r0 r0Var) {
                super(r0Var);
            }

            @Override // xu.p, xu.r0
            public long read(xu.e eVar, long j10) throws IOException {
                try {
                    return super.read(eVar, j10);
                } catch (IOException e10) {
                    b.this.f21886c = e10;
                    throw e10;
                }
            }
        }

        public b(ResponseBody responseBody) {
            this.f21885a = responseBody;
            this.b = xu.b0.c(new a(responseBody.getSource()));
        }

        public void a() throws IOException {
            IOException iOException = this.f21886c;
            if (iOException != null) {
                throw iOException;
            }
        }

        @Override // okhttp3.ResponseBody, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.f21885a.close();
        }

        @Override // okhttp3.ResponseBody
        /* JADX INFO: renamed from: contentLength */
        public long getContentLength() {
            return this.f21885a.getContentLength();
        }

        @Override // okhttp3.ResponseBody
        /* JADX INFO: renamed from: contentType */
        public MediaType getMediaType() {
            return this.f21885a.getMediaType();
        }

        @Override // okhttp3.ResponseBody
        /* JADX INFO: renamed from: source */
        public xu.g getSource() {
            return this.b;
        }
    }

    public static final class c extends ResponseBody {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final MediaType f21888a;
        public final long b;

        public c(MediaType mediaType, long j10) {
            this.f21888a = mediaType;
            this.b = j10;
        }

        @Override // okhttp3.ResponseBody
        /* JADX INFO: renamed from: contentLength */
        public long getContentLength() {
            return this.b;
        }

        @Override // okhttp3.ResponseBody
        /* JADX INFO: renamed from: contentType */
        public MediaType getMediaType() {
            return this.f21888a;
        }

        @Override // okhttp3.ResponseBody
        /* JADX INFO: renamed from: source */
        public xu.g getSource() {
            throw new IllegalStateException("Cannot read raw response body of a converted body.");
        }
    }

    public q(w wVar, Object obj, Object[] objArr, Call.Factory factory, h<ResponseBody, T> hVar) {
        this.f21876a = wVar;
        this.b = obj;
        this.f21877c = objArr;
        this.f21878d = factory;
        this.f21879e = hVar;
    }

    @Override // jv.d
    public void B(f<T> fVar) {
        Call call;
        Throwable th2;
        Objects.requireNonNull(fVar, "callback == null");
        synchronized (this) {
            try {
                if (this.f21883i) {
                    throw new IllegalStateException("Already executed.");
                }
                this.f21883i = true;
                call = this.f21881g;
                th2 = this.f21882h;
                if (call == null && th2 == null) {
                    try {
                        Call callB = b();
                        this.f21881g = callB;
                        call = callB;
                    } catch (Throwable th3) {
                        th2 = th3;
                        c0.t(th2);
                        this.f21882h = th2;
                    }
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
        if (th2 != null) {
            fVar.b(this, th2);
            return;
        }
        if (this.f21880f) {
            call.cancel();
        }
        call.enqueue(new a(fVar));
    }

    @Override // jv.d
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public q<T> clone() {
        return new q<>(this.f21876a, this.b, this.f21877c, this.f21878d, this.f21879e);
    }

    public final Call b() {
        Call callNewCall = this.f21878d.newCall(this.f21876a.a(this.b, this.f21877c));
        if (callNewCall != null) {
            return callNewCall;
        }
        throw new NullPointerException("Call.Factory returned null.");
    }

    public final Call c() throws IOException {
        Call call = this.f21881g;
        if (call != null) {
            return call;
        }
        Throwable th2 = this.f21882h;
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
            Call callB = b();
            this.f21881g = callB;
            return callB;
        } catch (IOException | Error | RuntimeException e10) {
            c0.t(e10);
            this.f21882h = e10;
            throw e10;
        }
    }

    @Override // jv.d
    public void cancel() {
        Call call;
        this.f21880f = true;
        synchronized (this) {
            call = this.f21881g;
        }
        if (call != null) {
            call.cancel();
        }
    }

    public x<T> e(Response response) throws IOException {
        ResponseBody responseBodyBody = response.body();
        Response responseBuild = response.newBuilder().body(new c(responseBodyBody.getMediaType(), responseBodyBody.getContentLength())).build();
        int iCode = responseBuild.code();
        if (iCode < 200 || iCode >= 300) {
            try {
                return x.d(c0.a(responseBodyBody), responseBuild);
            } finally {
                responseBodyBody.close();
            }
        }
        if (iCode == 204 || iCode == 205) {
            responseBodyBody.close();
            return x.j(null, responseBuild);
        }
        b bVar = new b(responseBodyBody);
        try {
            return x.j(this.f21879e.a(bVar), responseBuild);
        } catch (RuntimeException e10) {
            bVar.a();
            throw e10;
        }
    }

    @Override // jv.d
    public x<T> execute() {
        Call callC;
        synchronized (this) {
            if (this.f21883i) {
                throw new IllegalStateException("Already executed.");
            }
            this.f21883i = true;
            callC = c();
        }
        if (this.f21880f) {
            callC.cancel();
        }
        return e(callC.execute());
    }

    @Override // jv.d
    public boolean isCanceled() {
        boolean z10 = true;
        if (this.f21880f) {
            return true;
        }
        synchronized (this) {
            try {
                Call call = this.f21881g;
                if (call == null || !call.getCanceled()) {
                    z10 = false;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return z10;
    }

    @Override // jv.d
    public synchronized Request request() {
        try {
        } catch (IOException e10) {
            throw new RuntimeException("Unable to create request.", e10);
        }
        return c().request();
    }
}
