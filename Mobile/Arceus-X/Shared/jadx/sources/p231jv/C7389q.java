package p231jv;

import java.io.IOException;
import java.util.Objects;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
import p560xu.AbstractC12946p;
import p560xu.C12919b0;
import p560xu.C12924e;
import p560xu.InterfaceC12928g;
import p560xu.InterfaceC12951r0;

/* JADX INFO: renamed from: jv.q */
/* JADX INFO: loaded from: classes2.dex */
public final class C7389q<T> implements InterfaceC7376d<T> {

    /* JADX INFO: renamed from: a */
    public final C7395w f28342a;

    /* JADX INFO: renamed from: b */
    public final Object f28343b;

    /* JADX INFO: renamed from: c */
    public final Object[] f28344c;

    /* JADX INFO: renamed from: d */
    public final Call.Factory f28345d;

    /* JADX INFO: renamed from: e */
    public final InterfaceC7380h<ResponseBody, T> f28346e;

    /* JADX INFO: renamed from: f */
    public volatile boolean f28347f;

    /* JADX INFO: renamed from: g */
    public Call f28348g;

    /* JADX INFO: renamed from: h */
    public Throwable f28349h;

    /* JADX INFO: renamed from: i */
    public boolean f28350i;

    /* JADX INFO: renamed from: jv.q$a */
    public class a implements Callback {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ InterfaceC7378f f28351a;

        public a(InterfaceC7378f interfaceC7378f) {
            this.f28351a = interfaceC7378f;
        }

        /* JADX INFO: renamed from: a */
        public final void m30608a(Throwable th2) {
            try {
                this.f28351a.mo23949b(C7389q.this, th2);
            } catch (Throwable th3) {
                C7375c0.m30569t(th3);
                th3.printStackTrace();
            }
        }

        @Override // okhttp3.Callback
        public void onFailure(Call call, IOException iOException) {
            m30608a(iOException);
        }

        @Override // okhttp3.Callback
        public void onResponse(Call call, Response response) {
            try {
                try {
                    this.f28351a.mo23948a(C7389q.this, C7389q.this.m30607e(response));
                } catch (Throwable th2) {
                    C7375c0.m30569t(th2);
                    th2.printStackTrace();
                }
            } catch (Throwable th3) {
                C7375c0.m30569t(th3);
                m30608a(th3);
            }
        }
    }

    /* JADX INFO: renamed from: jv.q$b */
    public static final class b extends ResponseBody {

        /* JADX INFO: renamed from: a */
        public final ResponseBody f28353a;

        /* JADX INFO: renamed from: b */
        public final InterfaceC12928g f28354b;

        /* JADX INFO: renamed from: c */
        public IOException f28355c;

        /* JADX INFO: renamed from: jv.q$b$a */
        public class a extends AbstractC12946p {
            public a(InterfaceC12951r0 interfaceC12951r0) {
                super(interfaceC12951r0);
            }

            @Override // p560xu.AbstractC12946p, p560xu.InterfaceC12951r0
            public long read(C12924e c12924e, long j10) throws IOException {
                try {
                    return super.read(c12924e, j10);
                } catch (IOException e10) {
                    b.this.f28355c = e10;
                    throw e10;
                }
            }
        }

        public b(ResponseBody responseBody) {
            this.f28353a = responseBody;
            this.f28354b = C12919b0.m47961c(new a(responseBody.getSource()));
        }

        /* JADX INFO: renamed from: a */
        public void m30609a() throws IOException {
            IOException iOException = this.f28355c;
            if (iOException != null) {
                throw iOException;
            }
        }

        @Override // okhttp3.ResponseBody, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.f28353a.close();
        }

        @Override // okhttp3.ResponseBody
        /* JADX INFO: renamed from: contentLength */
        public long getContentLength() {
            return this.f28353a.getContentLength();
        }

        @Override // okhttp3.ResponseBody
        /* JADX INFO: renamed from: contentType */
        public MediaType getMediaType() {
            return this.f28353a.getMediaType();
        }

        @Override // okhttp3.ResponseBody
        /* JADX INFO: renamed from: source */
        public InterfaceC12928g getSource() {
            return this.f28354b;
        }
    }

    /* JADX INFO: renamed from: jv.q$c */
    public static final class c extends ResponseBody {

        /* JADX INFO: renamed from: a */
        public final MediaType f28357a;

        /* JADX INFO: renamed from: b */
        public final long f28358b;

        public c(MediaType mediaType, long j10) {
            this.f28357a = mediaType;
            this.f28358b = j10;
        }

        @Override // okhttp3.ResponseBody
        /* JADX INFO: renamed from: contentLength */
        public long getContentLength() {
            return this.f28358b;
        }

        @Override // okhttp3.ResponseBody
        /* JADX INFO: renamed from: contentType */
        public MediaType getMediaType() {
            return this.f28357a;
        }

        @Override // okhttp3.ResponseBody
        /* JADX INFO: renamed from: source */
        public InterfaceC12928g getSource() {
            throw new IllegalStateException("Cannot read raw response body of a converted body.");
        }
    }

    public C7389q(C7395w c7395w, Object obj, Object[] objArr, Call.Factory factory, InterfaceC7380h<ResponseBody, T> interfaceC7380h) {
        this.f28342a = c7395w;
        this.f28343b = obj;
        this.f28344c = objArr;
        this.f28345d = factory;
        this.f28346e = interfaceC7380h;
    }

    @Override // p231jv.InterfaceC7376d
    /* JADX INFO: renamed from: B */
    public void mo30571B(InterfaceC7378f<T> interfaceC7378f) {
        Call call;
        Throwable th2;
        Objects.requireNonNull(interfaceC7378f, "callback == null");
        synchronized (this) {
            try {
                if (this.f28350i) {
                    throw new IllegalStateException("Already executed.");
                }
                this.f28350i = true;
                call = this.f28348g;
                th2 = this.f28349h;
                if (call == null && th2 == null) {
                    try {
                        Call callM30605b = m30605b();
                        this.f28348g = callM30605b;
                        call = callM30605b;
                    } catch (Throwable th3) {
                        th2 = th3;
                        C7375c0.m30569t(th2);
                        this.f28349h = th2;
                    }
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
        if (th2 != null) {
            interfaceC7378f.mo23949b(this, th2);
            return;
        }
        if (this.f28347f) {
            call.cancel();
        }
        call.enqueue(new a(interfaceC7378f));
    }

    /* JADX DEBUG: Method merged with bridge method: clone()Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: clone()Ljv/d; */
    @Override // p231jv.InterfaceC7376d
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public C7389q<T> clone() {
        return new C7389q<>(this.f28342a, this.f28343b, this.f28344c, this.f28345d, this.f28346e);
    }

    /* JADX INFO: renamed from: b */
    public final Call m30605b() {
        Call callNewCall = this.f28345d.newCall(this.f28342a.m30638a(this.f28343b, this.f28344c));
        if (callNewCall != null) {
            return callNewCall;
        }
        throw new NullPointerException("Call.Factory returned null.");
    }

    /* JADX INFO: renamed from: c */
    public final Call m30606c() throws IOException {
        Call call = this.f28348g;
        if (call != null) {
            return call;
        }
        Throwable th2 = this.f28349h;
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
            Call callM30605b = m30605b();
            this.f28348g = callM30605b;
            return callM30605b;
        } catch (IOException | Error | RuntimeException e10) {
            C7375c0.m30569t(e10);
            this.f28349h = e10;
            throw e10;
        }
    }

    @Override // p231jv.InterfaceC7376d
    public void cancel() {
        Call call;
        this.f28347f = true;
        synchronized (this) {
            call = this.f28348g;
        }
        if (call != null) {
            call.cancel();
        }
    }

    /* JADX INFO: renamed from: e */
    public C7396x<T> m30607e(Response response) throws IOException {
        ResponseBody responseBodyBody = response.body();
        Response responseBuild = response.newBuilder().body(new c(responseBodyBody.getMediaType(), responseBodyBody.getContentLength())).build();
        int iCode = responseBuild.code();
        if (iCode < 200 || iCode >= 300) {
            try {
                return C7396x.m30650d(C7375c0.m30550a(responseBodyBody), responseBuild);
            } finally {
                responseBodyBody.close();
            }
        }
        if (iCode == 204 || iCode == 205) {
            responseBodyBody.close();
            return C7396x.m30652j(null, responseBuild);
        }
        b bVar = new b(responseBodyBody);
        try {
            return C7396x.m30652j(this.f28346e.mo30540a(bVar), responseBuild);
        } catch (RuntimeException e10) {
            bVar.m30609a();
            throw e10;
        }
    }

    @Override // p231jv.InterfaceC7376d
    public C7396x<T> execute() {
        Call callM30606c;
        synchronized (this) {
            if (this.f28350i) {
                throw new IllegalStateException("Already executed.");
            }
            this.f28350i = true;
            callM30606c = m30606c();
        }
        if (this.f28347f) {
            callM30606c.cancel();
        }
        return m30607e(callM30606c.execute());
    }

    @Override // p231jv.InterfaceC7376d
    public boolean isCanceled() {
        boolean z10 = true;
        if (this.f28347f) {
            return true;
        }
        synchronized (this) {
            try {
                Call call = this.f28348g;
                if (call == null || !call.getCanceled()) {
                    z10 = false;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return z10;
    }

    @Override // p231jv.InterfaceC7376d
    public synchronized Request request() {
        try {
        } catch (IOException e10) {
            throw new RuntimeException("Unable to create request.", e10);
        }
        return m30606c().request();
    }
}
