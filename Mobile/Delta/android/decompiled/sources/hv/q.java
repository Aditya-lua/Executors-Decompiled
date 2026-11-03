package hv;

import java.io.IOException;
import java.util.Objects;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
import vu.r0;

/* JADX INFO: loaded from: classes2.dex */
public final class q<T> implements d<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w f19886a;
    public final Object b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object[] f19887c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Call.Factory f19888d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final h<ResponseBody, T> f19889e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public volatile boolean f19890f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Call f19891g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Throwable f19892h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f19893i;

    public class a implements Callback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ f f19894a;

        public a(f fVar) {
            this.f19894a = fVar;
        }

        public final void a(Throwable th2) {
            try {
                this.f19894a.b(q.this, th2);
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
                    this.f19894a.a(q.this, q.this.e(response));
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
        public final ResponseBody f19895a;
        public final vu.g b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public IOException f19896c;

        public class a extends vu.p {
            public a(r0 r0Var) {
                super(r0Var);
            }

            @Override // vu.p, vu.r0
            public long read(vu.e eVar, long j10) throws IOException {
                try {
                    return super.read(eVar, j10);
                } catch (IOException e10) {
                    b.this.f19896c = e10;
                    throw e10;
                }
            }
        }

        public b(ResponseBody responseBody) {
            this.f19895a = responseBody;
            this.b = vu.b0.c(new a(responseBody.getSource()));
        }

        public void a() throws IOException {
            IOException iOException = this.f19896c;
            if (iOException != null) {
                throw iOException;
            }
        }

        @Override // okhttp3.ResponseBody, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.f19895a.close();
        }

        @Override // okhttp3.ResponseBody
        /* JADX INFO: renamed from: contentLength */
        public long getContentLength() {
            return this.f19895a.getContentLength();
        }

        @Override // okhttp3.ResponseBody
        /* JADX INFO: renamed from: contentType */
        public MediaType getMediaType() {
            return this.f19895a.getMediaType();
        }

        @Override // okhttp3.ResponseBody
        /* JADX INFO: renamed from: source */
        public vu.g getSource() {
            return this.b;
        }
    }

    public static final class c extends ResponseBody {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final MediaType f19898a;
        public final long b;

        public c(MediaType mediaType, long j10) {
            this.f19898a = mediaType;
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
            return this.f19898a;
        }

        @Override // okhttp3.ResponseBody
        /* JADX INFO: renamed from: source */
        public vu.g getSource() {
            throw new IllegalStateException("Cannot read raw response body of a converted body.");
        }
    }

    public q(w wVar, Object obj, Object[] objArr, Call.Factory factory, h<ResponseBody, T> hVar) {
        this.f19886a = wVar;
        this.b = obj;
        this.f19887c = objArr;
        this.f19888d = factory;
        this.f19889e = hVar;
    }

    @Override // hv.d
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public q<T> m73clone() {
        return new q<>(this.f19886a, this.b, this.f19887c, this.f19888d, this.f19889e);
    }

    public final Call b() {
        Call callNewCall = this.f19888d.newCall(this.f19886a.a(this.b, this.f19887c));
        if (callNewCall != null) {
            return callNewCall;
        }
        throw new NullPointerException("Call.Factory returned null.");
    }

    public final Call c() throws IOException {
        Call call = this.f19891g;
        if (call != null) {
            return call;
        }
        Throwable th2 = this.f19892h;
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
            this.f19891g = callB;
            return callB;
        } catch (IOException | Error | RuntimeException e10) {
            c0.t(e10);
            this.f19892h = e10;
            throw e10;
        }
    }

    @Override // hv.d
    public void cancel() {
        Call call;
        this.f19890f = true;
        synchronized (this) {
            call = this.f19891g;
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
            return x.j(this.f19889e.a(bVar), responseBuild);
        } catch (RuntimeException e10) {
            bVar.a();
            throw e10;
        }
    }

    @Override // hv.d
    public x<T> execute() {
        Call callC;
        synchronized (this) {
            if (this.f19893i) {
                throw new IllegalStateException("Already executed.");
            }
            this.f19893i = true;
            callC = c();
        }
        if (this.f19890f) {
            callC.cancel();
        }
        return e(callC.execute());
    }

    @Override // hv.d
    public boolean isCanceled() {
        boolean z10 = true;
        if (this.f19890f) {
            return true;
        }
        synchronized (this) {
            try {
                Call call = this.f19891g;
                if (call == null || !call.getCanceled()) {
                    z10 = false;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return z10;
    }

    @Override // hv.d
    public void m(f<T> fVar) {
        Call call;
        Throwable th2;
        Objects.requireNonNull(fVar, "callback == null");
        synchronized (this) {
            try {
                if (this.f19893i) {
                    throw new IllegalStateException("Already executed.");
                }
                this.f19893i = true;
                call = this.f19891g;
                th2 = this.f19892h;
                if (call == null && th2 == null) {
                    try {
                        Call callB = b();
                        this.f19891g = callB;
                        call = callB;
                    } catch (Throwable th3) {
                        th2 = th3;
                        c0.t(th2);
                        this.f19892h = th2;
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
        if (this.f19890f) {
            call.cancel();
        }
        call.enqueue(new a(fVar));
    }

    @Override // hv.d
    public synchronized Request request() {
        try {
        } catch (IOException e10) {
            throw new RuntimeException("Unable to create request.", e10);
        }
        return c().request();
    }
}
