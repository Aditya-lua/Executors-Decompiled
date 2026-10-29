package okhttp3;

import com.appsflyer.sdk_base.referrer.Payload;
import java.io.Closeable;
import java.io.EOFException;
import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.http1.HeadersReader;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p560xu.C12919b0;
import p560xu.C12924e;
import p560xu.C12927f0;
import p560xu.C12930h;
import p560xu.C12953s0;
import p560xu.InterfaceC12928g;
import p560xu.InterfaceC12951r0;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 &2\u00020\u0001:\u0003'(&B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0011\b\u0016\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\nJ\u0017\u0010\r\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0005\u0010\u0017R\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001b\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001aR\u0016\u0010\u001d\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0016\u0010 \u001a\u00020\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!R\u0016\u0010\"\u001a\u00020\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010!R\u001c\u0010$\u001a\b\u0018\u00010#R\u00020\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%¨\u0006)"}, m31665d2 = {"Lokhttp3/MultipartReader;", "Ljava/io/Closeable;", "Lxu/g;", Payload.SOURCE, "", "boundary", "<init>", "(Lxu/g;Ljava/lang/String;)V", "Lokhttp3/ResponseBody;", Payload.RESPONSE, "(Lokhttp3/ResponseBody;)V", "", "maxByteCount", "currentPartBytesRemaining", "(J)J", "Lokhttp3/MultipartReader$Part;", "nextPart", "()Lokhttp3/MultipartReader$Part;", "", "close", "()V", "Lxu/g;", "Ljava/lang/String;", "()Ljava/lang/String;", "Lxu/h;", "dashDashBoundary", "Lxu/h;", "crlfDashDashBoundary", "", "partCount", "I", "", "closed", "Z", "noMoreParts", "Lokhttp3/MultipartReader$PartSource;", "currentPart", "Lokhttp3/MultipartReader$PartSource;", "Companion", "PartSource", "Part", "okhttp"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class MultipartReader implements Closeable {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final C12927f0 afterBoundaryOptions;

    @NotNull
    private final String boundary;
    private boolean closed;

    @NotNull
    private final C12930h crlfDashDashBoundary;

    @Nullable
    private PartSource currentPart;

    @NotNull
    private final C12930h dashDashBoundary;
    private boolean noMoreParts;
    private int partCount;

    @NotNull
    private final InterfaceC12928g source;

    @Metadata(m31664d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, m31665d2 = {"Lokhttp3/MultipartReader$Companion;", "", "<init>", "()V", "Lxu/f0;", "afterBoundaryOptions", "Lxu/f0;", "getAfterBoundaryOptions", "()Lxu/f0;", "okhttp"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: okhttp3.MultipartReader.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final C12927f0 getAfterBoundaryOptions() {
            return MultipartReader.afterBoundaryOptions;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        private Companion() {
        }
    }

    @Metadata(m31664d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bH\u0096\u0001¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u000b\u001a\u0004\b\u0003\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b\u0005\u0010\r\u001a\u0004\b\u0005\u0010\u000e¨\u0006\u000f"}, m31665d2 = {"Lokhttp3/MultipartReader$Part;", "Ljava/io/Closeable;", "Lokhttp3/Headers;", "headers", "Lxu/g;", "body", "<init>", "(Lokhttp3/Headers;Lxu/g;)V", "", "close", "()V", "Lokhttp3/Headers;", "()Lokhttp3/Headers;", "Lxu/g;", "()Lxu/g;", "okhttp"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class Part implements Closeable {

        @NotNull
        private final InterfaceC12928g body;

        @NotNull
        private final Headers headers;

        public Part(@NotNull Headers headers, @NotNull InterfaceC12928g body) {
            Intrinsics.checkNotNullParameter(headers, "headers");
            Intrinsics.checkNotNullParameter(body, "body");
            this.headers = headers;
            this.body = body;
        }

        @NotNull
        /* JADX INFO: renamed from: body, reason: from getter */
        public final InterfaceC12928g getBody() {
            return this.body;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.body.close();
        }

        @NotNull
        /* JADX INFO: renamed from: headers, reason: from getter */
        public final Headers getHeaders() {
            return this.headers;
        }
    }

    @Metadata(m31664d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\u000b\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0010¨\u0006\u0011"}, m31665d2 = {"Lokhttp3/MultipartReader$PartSource;", "Lxu/r0;", "<init>", "(Lokhttp3/MultipartReader;)V", "", "close", "()V", "Lxu/e;", "sink", "", "byteCount", "read", "(Lxu/e;J)J", "Lxu/s0;", "timeout", "()Lxu/s0;", "Lxu/s0;", "okhttp"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public final class PartSource implements InterfaceC12951r0 {

        @NotNull
        private final C12953s0 timeout = new C12953s0();

        /* JADX DEBUG: Incorrect args count in method signature: ()V */
        public PartSource() {
        }

        @Override // p560xu.InterfaceC12951r0, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (Intrinsics.m31980c(MultipartReader.this.currentPart, this)) {
                MultipartReader.this.currentPart = null;
            }
        }

        @Override // p560xu.InterfaceC12951r0
        public long read(@NotNull C12924e sink, long byteCount) {
            Intrinsics.checkNotNullParameter(sink, "sink");
            if (byteCount < 0) {
                throw new IllegalArgumentException(("byteCount < 0: " + byteCount).toString());
            }
            if (!Intrinsics.m31980c(MultipartReader.this.currentPart, this)) {
                throw new IllegalStateException("closed");
            }
            C12953s0 timeout = MultipartReader.this.source.getTimeout();
            C12953s0 c12953s0 = this.timeout;
            MultipartReader multipartReader = MultipartReader.this;
            long timeoutNanos = timeout.getTimeoutNanos();
            timeout.timeout(C12953s0.INSTANCE.m48192a(c12953s0.getTimeoutNanos(), timeout.getTimeoutNanos()), TimeUnit.NANOSECONDS);
            if (!timeout.getHasDeadline()) {
                if (c12953s0.getHasDeadline()) {
                    timeout.deadlineNanoTime(c12953s0.deadlineNanoTime());
                }
                try {
                    long jCurrentPartBytesRemaining = multipartReader.currentPartBytesRemaining(byteCount);
                    return jCurrentPartBytesRemaining == 0 ? -1L : multipartReader.source.read(sink, jCurrentPartBytesRemaining);
                } finally {
                    timeout.timeout(timeoutNanos, TimeUnit.NANOSECONDS);
                    if (c12953s0.getHasDeadline()) {
                        timeout.clearDeadline();
                    }
                }
            }
            long jDeadlineNanoTime = timeout.deadlineNanoTime();
            if (c12953s0.getHasDeadline()) {
                timeout.deadlineNanoTime(Math.min(timeout.deadlineNanoTime(), c12953s0.deadlineNanoTime()));
            }
            try {
                long jCurrentPartBytesRemaining2 = multipartReader.currentPartBytesRemaining(byteCount);
                return jCurrentPartBytesRemaining2 == 0 ? -1L : multipartReader.source.read(sink, jCurrentPartBytesRemaining2);
            } finally {
                timeout.timeout(timeoutNanos, TimeUnit.NANOSECONDS);
                if (c12953s0.getHasDeadline()) {
                    timeout.deadlineNanoTime(jDeadlineNanoTime);
                }
            }
        }

        @Override // p560xu.InterfaceC12951r0
        @NotNull
        /* JADX INFO: renamed from: timeout, reason: from getter */
        public C12953s0 getTimeout() {
            return this.timeout;
        }
    }

    static {
        C12927f0.Companion companion = C12927f0.INSTANCE;
        C12930h.Companion companion2 = C12930h.INSTANCE;
        afterBoundaryOptions = companion.m48076d(companion2.m48117d("\r\n"), companion2.m48117d("--"), companion2.m48117d(" "), companion2.m48117d("\t"));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public MultipartReader(@NotNull InterfaceC12928g source, @NotNull String boundary) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(boundary, "boundary");
        this.source = source;
        this.boundary = boundary;
        this.dashDashBoundary = new C12924e().mo47992C0("--").mo47992C0(boundary).mo47997F2();
        this.crlfDashDashBoundary = new C12924e().mo47992C0("\r\n--").mo47992C0(boundary).mo47997F2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long currentPartBytesRemaining(long maxByteCount) throws EOFException {
        long jMin = Math.min(this.source.getBufferField().getSize(), maxByteCount) + 1;
        long jMo48050s1 = this.source.mo48050s1(this.crlfDashDashBoundary, 0L, jMin);
        if (jMo48050s1 != -1) {
            return jMo48050s1;
        }
        if (this.source.getBufferField().getSize() >= jMin) {
            return Math.min(jMin, maxByteCount);
        }
        throw new EOFException();
    }

    @NotNull
    /* JADX INFO: renamed from: boundary, reason: from getter */
    public final String getBoundary() {
        return this.boundary;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.closed) {
            return;
        }
        this.closed = true;
        this.currentPart = null;
        this.source.close();
    }

    @Nullable
    public final Part nextPart() throws ProtocolException, EOFException {
        if (this.closed) {
            throw new IllegalStateException("closed");
        }
        if (this.noMoreParts) {
            return null;
        }
        if (this.partCount == 0 && this.source.mo48044o0(0L, this.dashDashBoundary)) {
            this.source.skip(this.dashDashBoundary.m48089I());
        } else {
            while (true) {
                long jCurrentPartBytesRemaining = currentPartBytesRemaining(8192L);
                if (jCurrentPartBytesRemaining == 0) {
                    break;
                }
                this.source.skip(jCurrentPartBytesRemaining);
            }
            this.source.skip(this.crlfDashDashBoundary.m48089I());
        }
        boolean z10 = false;
        while (true) {
            int iMo48039l3 = this.source.mo48039l3(afterBoundaryOptions);
            if (iMo48039l3 == -1) {
                throw new ProtocolException("unexpected characters after boundary");
            }
            if (iMo48039l3 == 0) {
                this.partCount++;
                Headers headers = new HeadersReader(this.source).readHeaders();
                PartSource partSource = new PartSource();
                this.currentPart = partSource;
                return new Part(headers, C12919b0.m47961c(partSource));
            }
            if (iMo48039l3 == 1) {
                if (z10) {
                    throw new ProtocolException("unexpected characters after boundary");
                }
                if (this.partCount == 0) {
                    throw new ProtocolException("expected at least 1 part");
                }
                this.noMoreParts = true;
                return null;
            }
            if (iMo48039l3 == 2 || iMo48039l3 == 3) {
                z10 = true;
            }
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public MultipartReader(@NotNull ResponseBody response) throws ProtocolException {
        String strParameter;
        Intrinsics.checkNotNullParameter(response, "response");
        InterfaceC12928g source = response.getSource();
        MediaType mediaType = response.getMediaType();
        if (mediaType != null && (strParameter = mediaType.parameter("boundary")) != null) {
            this(source, strParameter);
            return;
        }
        throw new ProtocolException("expected the Content-Type to have a boundary parameter");
    }
}
