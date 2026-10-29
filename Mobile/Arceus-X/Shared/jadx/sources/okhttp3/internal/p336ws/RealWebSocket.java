package okhttp3.internal.p336ws;

import androidx.core.app.NotificationCompat;
import androidx.core.view.PointerIconCompat;
import backtraceio.library.models.BacktraceAttributeConsts;
import com.appsflyer.sdk_base.referrer.Payload;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.components.Text;
import java.io.Closeable;
import java.io.IOException;
import java.net.ProtocolException;
import java.net.SocketTimeoutException;
import java.util.ArrayDeque;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7697o;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C7729c0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.C7797x;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.EventListener;
import okhttp3.OkHttpClient;
import okhttp3.Protocol;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.WebSocket;
import okhttp3.WebSocketListener;
import okhttp3.internal._UtilCommonKt;
import okhttp3.internal._UtilJvmKt;
import okhttp3.internal.concurrent.Lockable;
import okhttp3.internal.concurrent.Task;
import okhttp3.internal.concurrent.TaskQueue;
import okhttp3.internal.concurrent.TaskRunner;
import okhttp3.internal.connection.BufferedSocket;
import okhttp3.internal.connection.BufferedSocketKt;
import okhttp3.internal.connection.RealCall;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p560xu.C12930h;
import p560xu.InterfaceC12947p0;
import p560xu.InterfaceC12949q0;
import p560xu.InterfaceC12951r0;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u0000¼\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\r\u0018\u0000 \u0085\u00012\u00020\u00012\u00020\u00022\u00020\u0003:\b\u0086\u0001\u0087\u0001\u0088\u0001\u0085\u0001BI\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\u0006\u0010\u0010\u001a\u00020\f\u0012\u0006\u0010\u0011\u001a\u00020\f¢\u0006\u0004\b\u0012\u0010\u0013J\u0013\u0010\u0015\u001a\u00020\u0014*\u00020\u000eH\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u001b\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001e\u001a\u00020\u001dH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u0006H\u0016¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\fH\u0016¢\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u00020\u001dH\u0016¢\u0006\u0004\b$\u0010\u001fJ\u0015\u0010'\u001a\u00020\u001d2\u0006\u0010&\u001a\u00020%¢\u0006\u0004\b'\u0010(J\u0017\u0010.\u001a\u00020+2\u0006\u0010*\u001a\u00020)H\u0000¢\u0006\u0004\b,\u0010-J%\u00103\u001a\u00020\u001d2\u0006\u00100\u001a\u00020/2\u0006\u00102\u001a\u0002012\u0006\u0010&\u001a\u00020\u0014¢\u0006\u0004\b3\u00104J\u0015\u00105\u001a\u00020\u001d2\u0006\u0010*\u001a\u00020)¢\u0006\u0004\b5\u00106J\r\u00107\u001a\u00020\u0014¢\u0006\u0004\b7\u00108J\r\u00109\u001a\u00020\u001d¢\u0006\u0004\b9\u0010\u001fJ\r\u0010:\u001a\u00020\u001d¢\u0006\u0004\b:\u0010\u001fJ\r\u0010;\u001a\u00020\u0019¢\u0006\u0004\b;\u0010<J\r\u0010=\u001a\u00020\u0019¢\u0006\u0004\b=\u0010<J\r\u0010>\u001a\u00020\u0019¢\u0006\u0004\b>\u0010<J\u0017\u0010@\u001a\u00020\u001d2\u0006\u0010?\u001a\u00020/H\u0016¢\u0006\u0004\b@\u0010AJ\u0017\u0010@\u001a\u00020\u001d2\u0006\u0010B\u001a\u00020\u0017H\u0016¢\u0006\u0004\b@\u0010CJ\u0017\u0010E\u001a\u00020\u001d2\u0006\u0010D\u001a\u00020\u0017H\u0016¢\u0006\u0004\bE\u0010CJ\u0017\u0010F\u001a\u00020\u001d2\u0006\u0010D\u001a\u00020\u0017H\u0016¢\u0006\u0004\bF\u0010CJ\u001f\u0010I\u001a\u00020\u001d2\u0006\u0010G\u001a\u00020\u00192\u0006\u0010H\u001a\u00020/H\u0016¢\u0006\u0004\bI\u0010JJ\u0017\u0010\u001b\u001a\u00020\u00142\u0006\u0010?\u001a\u00020/H\u0016¢\u0006\u0004\b\u001b\u0010KJ\u0017\u0010\u001b\u001a\u00020\u00142\u0006\u0010B\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u001b\u0010LJ\u0015\u0010M\u001a\u00020\u00142\u0006\u0010D\u001a\u00020\u0017¢\u0006\u0004\bM\u0010LJ!\u0010N\u001a\u00020\u00142\u0006\u0010G\u001a\u00020\u00192\b\u0010H\u001a\u0004\u0018\u00010/H\u0016¢\u0006\u0004\bN\u0010OJ'\u0010N\u001a\u00020\u00142\u0006\u0010G\u001a\u00020\u00192\b\u0010H\u001a\u0004\u0018\u00010/2\u0006\u0010P\u001a\u00020\f¢\u0006\u0004\bN\u0010QJ\u000f\u0010S\u001a\u00020\u0014H\u0000¢\u0006\u0004\bR\u00108J\u000f\u0010U\u001a\u00020\u001dH\u0000¢\u0006\u0004\bT\u0010\u001fJ/\u0010Z\u001a\u00020\u001d2\n\u0010X\u001a\u00060Vj\u0002`W2\n\b\u0002\u0010*\u001a\u0004\u0018\u00010)2\b\b\u0002\u0010Y\u001a\u00020\u0014¢\u0006\u0004\bZ\u0010[R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\\R\u001a\u0010\t\u001a\u00020\b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\t\u0010]\u001a\u0004\b^\u0010_R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010`R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010aR\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010bR\u0016\u0010\u0010\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010aR\u0014\u0010\u0011\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010aR\u0014\u0010c\u001a\u00020/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bc\u0010dR$\u0010f\u001a\u0004\u0018\u00010e8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bf\u0010g\u001a\u0004\bh\u0010i\"\u0004\bj\u0010kR\u0018\u0010m\u001a\u0004\u0018\u00010l8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bm\u0010nR\u0018\u0010p\u001a\u0004\u0018\u00010o8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bp\u0010qR\u0018\u0010s\u001a\u0004\u0018\u00010r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bs\u0010tR\u0016\u0010v\u001a\u00020u8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bv\u0010wR\u0018\u00100\u001a\u0004\u0018\u00010/8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u0010dR\u0018\u00102\u001a\u0004\u0018\u00010+8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u0010xR\u001a\u0010z\u001a\b\u0012\u0004\u0012\u00020\u00170y8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bz\u0010{R\u001a\u0010}\u001a\b\u0012\u0004\u0012\u00020|0y8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b}\u0010{R\u0016\u0010\"\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010aR\u0016\u0010~\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b~\u0010\u007fR\u0019\u0010\u0080\u0001\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0080\u0001\u0010\u0081\u0001R\u001a\u0010\u0082\u0001\u001a\u0004\u0018\u00010/8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0082\u0001\u0010dR\u0018\u0010\u0083\u0001\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0083\u0001\u0010\u007fR\u0017\u0010;\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b;\u0010\u0081\u0001R\u0017\u0010=\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b=\u0010\u0081\u0001R\u0017\u0010>\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b>\u0010\u0081\u0001R\u0018\u0010\u0084\u0001\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0084\u0001\u0010\u007f¨\u0006\u0089\u0001"}, m31665d2 = {"Lokhttp3/internal/ws/RealWebSocket;", "Lokhttp3/WebSocket;", "Lokhttp3/internal/ws/WebSocketReader$FrameCallback;", "Lokhttp3/internal/concurrent/Lockable;", "Lokhttp3/internal/concurrent/TaskRunner;", "taskRunner", "Lokhttp3/Request;", "originalRequest", "Lokhttp3/WebSocketListener;", "listener", "Ljava/util/Random;", "random", "", "pingIntervalMillis", "Lokhttp3/internal/ws/WebSocketExtensions;", "extensions", "minimumDeflateSize", "webSocketCloseTimeout", "<init>", "(Lokhttp3/internal/concurrent/TaskRunner;Lokhttp3/Request;Lokhttp3/WebSocketListener;Ljava/util/Random;JLokhttp3/internal/ws/WebSocketExtensions;JJ)V", "", "isValid", "(Lokhttp3/internal/ws/WebSocketExtensions;)Z", "Lxu/h;", "data", "", "formatOpcode", "send", "(Lxu/h;I)Z", "", "runWriter", "()V", "request", "()Lokhttp3/Request;", "queueSize", "()J", "cancel", "Lokhttp3/OkHttpClient;", "client", "connect", "(Lokhttp3/OkHttpClient;)V", "Lokhttp3/Response;", Payload.RESPONSE, "Lxu/q0;", "checkUpgradeSuccess$okhttp", "(Lokhttp3/Response;)Lxu/q0;", "checkUpgradeSuccess", "", "name", "Lokhttp3/internal/connection/BufferedSocket;", "socket", "initReaderAndWriter", "(Ljava/lang/String;Lokhttp3/internal/connection/BufferedSocket;Z)V", "loopReader", "(Lokhttp3/Response;)V", "processNextFrame", "()Z", "finishReader", "tearDown", "sentPingCount", "()I", "receivedPingCount", "receivedPongCount", Text.type, "onReadMessage", "(Ljava/lang/String;)V", "bytes", "(Lxu/h;)V", "payload", "onReadPing", "onReadPong", "code", "reason", "onReadClose", "(ILjava/lang/String;)V", "(Ljava/lang/String;)Z", "(Lxu/h;)Z", "pong", "close", "(ILjava/lang/String;)Z", "cancelAfterCloseMillis", "(ILjava/lang/String;J)Z", "writeOneFrame$okhttp", "writeOneFrame", "writePingFrame$okhttp", "writePingFrame", "Ljava/lang/Exception;", "Lkotlin/Exception;", "e", "isWriter", "failWebSocket", "(Ljava/lang/Exception;Lokhttp3/Response;Z)V", "Lokhttp3/Request;", "Lokhttp3/WebSocketListener;", "getListener$okhttp", "()Lokhttp3/WebSocketListener;", "Ljava/util/Random;", "J", "Lokhttp3/internal/ws/WebSocketExtensions;", "key", "Ljava/lang/String;", "Lokhttp3/Call;", NotificationCompat.CATEGORY_CALL, "Lokhttp3/Call;", "getCall$okhttp", "()Lokhttp3/Call;", "setCall$okhttp", "(Lokhttp3/Call;)V", "Lokhttp3/internal/concurrent/Task;", "writerTask", "Lokhttp3/internal/concurrent/Task;", "Lokhttp3/internal/ws/WebSocketReader;", "reader", "Lokhttp3/internal/ws/WebSocketReader;", "Lokhttp3/internal/ws/WebSocketWriter;", "writer", "Lokhttp3/internal/ws/WebSocketWriter;", "Lokhttp3/internal/concurrent/TaskQueue;", "taskQueue", "Lokhttp3/internal/concurrent/TaskQueue;", "Lxu/q0;", "Ljava/util/ArrayDeque;", "pongQueue", "Ljava/util/ArrayDeque;", "", "messageAndCloseQueue", "enqueuedClose", "Z", "receivedCloseCode", "I", "receivedCloseReason", "failed", "awaitingPong", "Companion", BacktraceAttributeConsts.MessageAttributeType, "Close", "WriterTask", "okhttp"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class RealWebSocket implements WebSocket, WebSocketReader.FrameCallback, Lockable {
    public static final long CANCEL_AFTER_CLOSE_MILLIS = 60000;
    public static final long DEFAULT_MINIMUM_DEFLATE_SIZE = 1024;
    private static final long MAX_QUEUE_SIZE = 16777216;
    private boolean awaitingPong;

    @Nullable
    private Call call;
    private boolean enqueuedClose;

    @Nullable
    private WebSocketExtensions extensions;
    private boolean failed;

    @NotNull
    private final String key;

    @NotNull
    private final WebSocketListener listener;

    @NotNull
    private final ArrayDeque<Object> messageAndCloseQueue;
    private long minimumDeflateSize;

    @Nullable
    private String name;

    @NotNull
    private final Request originalRequest;
    private final long pingIntervalMillis;

    @NotNull
    private final ArrayDeque<C12930h> pongQueue;
    private long queueSize;

    @NotNull
    private final Random random;

    @Nullable
    private WebSocketReader reader;
    private int receivedCloseCode;

    @Nullable
    private String receivedCloseReason;
    private int receivedPingCount;
    private int receivedPongCount;
    private int sentPingCount;

    @Nullable
    private InterfaceC12949q0 socket;

    @NotNull
    private TaskQueue taskQueue;
    private final long webSocketCloseTimeout;

    @Nullable
    private WebSocketWriter writer;

    @Nullable
    private Task writerTask;

    @NotNull
    private static final List<Protocol> ONLY_HTTP1 = C7697o.m31878d(Protocol.HTTP_1_1);

    @Metadata(m31664d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\r\b\u0000\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, m31665d2 = {"Lokhttp3/internal/ws/RealWebSocket$Close;", "", "", "code", "Lxu/h;", "reason", "", "cancelAfterCloseMillis", "<init>", "(ILxu/h;J)V", "I", "getCode", "()I", "Lxu/h;", "getReason", "()Lxu/h;", "J", "getCancelAfterCloseMillis", "()J", "okhttp"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class Close {
        private final long cancelAfterCloseMillis;
        private final int code;

        @Nullable
        private final C12930h reason;

        public Close(int i10, @Nullable C12930h c12930h, long j10) {
            this.code = i10;
            this.reason = c12930h;
            this.cancelAfterCloseMillis = j10;
        }

        public final long getCancelAfterCloseMillis() {
            return this.cancelAfterCloseMillis;
        }

        public final int getCode() {
            return this.code;
        }

        @Nullable
        public final C12930h getReason() {
            return this.reason;
        }
    }

    @Metadata(m31664d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, m31665d2 = {"Lokhttp3/internal/ws/RealWebSocket$Message;", "", "", "formatOpcode", "Lxu/h;", "data", "<init>", "(ILxu/h;)V", "I", "getFormatOpcode", "()I", "Lxu/h;", "getData", "()Lxu/h;", "okhttp"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class Message {

        @NotNull
        private final C12930h data;
        private final int formatOpcode;

        public Message(int i10, @NotNull C12930h data) {
            Intrinsics.checkNotNullParameter(data, "data");
            this.formatOpcode = i10;
            this.data = data;
        }

        @NotNull
        public final C12930h getData() {
            return this.data;
        }

        public final int getFormatOpcode() {
            return this.formatOpcode;
        }
    }

    @Metadata(m31664d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, m31665d2 = {"Lokhttp3/internal/ws/RealWebSocket$WriterTask;", "Lokhttp3/internal/concurrent/Task;", "<init>", "(Lokhttp3/internal/ws/RealWebSocket;)V", "runOnce", "", "okhttp"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public final class WriterTask extends Task {
        /* JADX DEBUG: Incorrect args count in method signature: ()V */
        public WriterTask() {
            super(RealWebSocket.this.name + " writer", false, 2, null);
        }

        @Override // okhttp3.internal.concurrent.Task
        public long runOnce() {
            try {
                return RealWebSocket.this.writeOneFrame$okhttp() ? 0L : -1L;
            } catch (IOException e10) {
                RealWebSocket.failWebSocket$default(RealWebSocket.this, e10, null, true, 2, null);
                return -1L;
            }
        }
    }

    public RealWebSocket(@NotNull TaskRunner taskRunner, @NotNull Request originalRequest, @NotNull WebSocketListener listener, @NotNull Random random, long j10, @Nullable WebSocketExtensions webSocketExtensions, long j11, long j12) {
        Intrinsics.checkNotNullParameter(taskRunner, "taskRunner");
        Intrinsics.checkNotNullParameter(originalRequest, "originalRequest");
        Intrinsics.checkNotNullParameter(listener, "listener");
        Intrinsics.checkNotNullParameter(random, "random");
        this.originalRequest = originalRequest;
        this.listener = listener;
        this.random = random;
        this.pingIntervalMillis = j10;
        this.extensions = webSocketExtensions;
        this.minimumDeflateSize = j11;
        this.webSocketCloseTimeout = j12;
        this.taskQueue = taskRunner.newQueue();
        this.pongQueue = new ArrayDeque<>();
        this.messageAndCloseQueue = new ArrayDeque<>();
        this.receivedCloseCode = -1;
        if (!Intrinsics.m31980c("GET", originalRequest.method())) {
            throw new IllegalArgumentException(("Request must be GET: " + originalRequest.method()).toString());
        }
        C12930h.Companion companion = C12930h.INSTANCE;
        byte[] bArr = new byte[16];
        random.nextBytes(bArr);
        Unit unit = Unit.f29331a;
        this.key = C12930h.Companion.m48113g(companion, bArr, 0, 0, 3, null).mo48097a();
    }

    public static /* synthetic */ void failWebSocket$default(RealWebSocket realWebSocket, Exception exc, Response response, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            response = null;
        }
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        realWebSocket.failWebSocket(exc, response, z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit failWebSocket$lambda$0$0(C7729c0 c7729c0) {
        _UtilCommonKt.closeQuietly((Closeable) c7729c0.f29425a);
        return Unit.f29331a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit finishReader$lambda$0$0(WebSocketWriter webSocketWriter) {
        _UtilCommonKt.closeQuietly(webSocketWriter);
        return Unit.f29331a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long initReaderAndWriter$lambda$0$0(RealWebSocket realWebSocket, long j10) {
        realWebSocket.writePingFrame$okhttp();
        return j10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isValid(WebSocketExtensions webSocketExtensions) {
        if (webSocketExtensions.unknownValues || webSocketExtensions.clientMaxWindowBits != null) {
            return false;
        }
        Integer num = webSocketExtensions.serverMaxWindowBits;
        if (num == null) {
            return true;
        }
        int iIntValue = num.intValue();
        return 8 <= iIntValue && iIntValue < 16;
    }

    private final void runWriter() {
        if (!_UtilJvmKt.assertionsEnabled || Thread.holdsLock(this)) {
            Task task = this.writerTask;
            if (task != null) {
                TaskQueue.schedule$default(this.taskQueue, task, 0L, 2, null);
                return;
            }
            return;
        }
        throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit writeOneFrame$lambda$0$0(RealWebSocket realWebSocket) {
        realWebSocket.cancel();
        return Unit.f29331a;
    }

    @Override // okhttp3.WebSocket
    public void cancel() {
        Call call = this.call;
        Intrinsics.checkNotNull(call);
        call.cancel();
    }

    @NotNull
    public final InterfaceC12949q0 checkUpgradeSuccess$okhttp(@NotNull Response response) throws ProtocolException {
        Intrinsics.checkNotNullParameter(response, "response");
        if (response.code() != 101) {
            throw new ProtocolException("Expected HTTP 101 response but was '" + response.code() + ' ' + response.message() + '\'');
        }
        String strHeader$default = Response.header$default(response, "Connection", null, 2, null);
        if (!C7797x.m32294E("Upgrade", strHeader$default, true)) {
            throw new ProtocolException("Expected 'Connection' header value 'Upgrade' but was '" + strHeader$default + '\'');
        }
        String strHeader$default2 = Response.header$default(response, "Upgrade", null, 2, null);
        if (!C7797x.m32294E("websocket", strHeader$default2, true)) {
            throw new ProtocolException("Expected 'Upgrade' header value 'websocket' but was '" + strHeader$default2 + '\'');
        }
        String strHeader$default3 = Response.header$default(response, "Sec-WebSocket-Accept", null, 2, null);
        String strMo48097a = C12930h.INSTANCE.m48117d(this.key + WebSocketProtocol.ACCEPT_MAGIC).m48087G().mo48097a();
        if (Intrinsics.m31980c(strMo48097a, strHeader$default3)) {
            InterfaceC12949q0 socket = response.getSocket();
            if (socket != null) {
                return socket;
            }
            throw new ProtocolException("Web Socket socket missing: bad interceptor?");
        }
        throw new ProtocolException("Expected 'Sec-WebSocket-Accept' header value '" + strMo48097a + "' but was '" + strHeader$default3 + '\'');
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // okhttp3.WebSocket
    public boolean close(int code, @Nullable String reason) {
        return close(code, reason, this.webSocketCloseTimeout);
    }

    public final void connect(@NotNull OkHttpClient client) {
        Intrinsics.checkNotNullParameter(client, "client");
        if (this.originalRequest.header("Sec-WebSocket-Extensions") != null) {
            failWebSocket$default(this, new ProtocolException("Request header not permitted: 'Sec-WebSocket-Extensions'"), null, false, 6, null);
            return;
        }
        OkHttpClient okHttpClientBuild = client.newBuilder().eventListener(EventListener.NONE).protocols(ONLY_HTTP1).build();
        final Request requestBuild = this.originalRequest.newBuilder().header("Upgrade", "websocket").header("Connection", "Upgrade").header("Sec-WebSocket-Key", this.key).header("Sec-WebSocket-Version", "13").header("Sec-WebSocket-Extensions", "permessage-deflate").build();
        RealCall realCall = new RealCall(okHttpClientBuild, requestBuild, true);
        this.call = realCall;
        Intrinsics.checkNotNull(realCall);
        realCall.enqueue(new Callback() { // from class: okhttp3.internal.ws.RealWebSocket.connect.1
            @Override // okhttp3.Callback
            public void onFailure(Call call, IOException e10) {
                Intrinsics.checkNotNullParameter(call, "call");
                Intrinsics.checkNotNullParameter(e10, "e");
                RealWebSocket.failWebSocket$default(RealWebSocket.this, e10, null, false, 6, null);
            }

            @Override // okhttp3.Callback
            public void onResponse(Call call, Response response) {
                InterfaceC12951r0 source;
                InterfaceC12947p0 sink;
                Intrinsics.checkNotNullParameter(call, "call");
                Intrinsics.checkNotNullParameter(response, "response");
                try {
                    InterfaceC12949q0 interfaceC12949q0CheckUpgradeSuccess$okhttp = RealWebSocket.this.checkUpgradeSuccess$okhttp(response);
                    WebSocketExtensions webSocketExtensions = WebSocketExtensions.INSTANCE.parse(response.headers());
                    RealWebSocket.this.extensions = webSocketExtensions;
                    if (!RealWebSocket.this.isValid(webSocketExtensions)) {
                        RealWebSocket realWebSocket = RealWebSocket.this;
                        synchronized (realWebSocket) {
                            realWebSocket.messageAndCloseQueue.clear();
                            realWebSocket.close(PointerIconCompat.TYPE_ALIAS, "unexpected Sec-WebSocket-Extensions in response header");
                        }
                    }
                    RealWebSocket.this.initReaderAndWriter(_UtilJvmKt.okHttpName + " WebSocket " + requestBuild.url().redact(), BufferedSocketKt.asBufferedSocket(interfaceC12949q0CheckUpgradeSuccess$okhttp), true);
                    RealWebSocket.this.loopReader(response);
                } catch (IOException e10) {
                    RealWebSocket.failWebSocket$default(RealWebSocket.this, e10, response, false, 4, null);
                    _UtilCommonKt.closeQuietly(response);
                    InterfaceC12949q0 socket = response.getSocket();
                    if (socket != null && (sink = socket.getSink()) != null) {
                        _UtilCommonKt.closeQuietly(sink);
                    }
                    InterfaceC12949q0 socket2 = response.getSocket();
                    if (socket2 == null || (source = socket2.getSource()) == null) {
                        return;
                    }
                    _UtilCommonKt.closeQuietly(source);
                }
            }
        });
    }

    /* JADX DEBUG: Multi-variable search result rejected for r13v3, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r14v1, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [T, okhttp3.internal.ws.WebSocketWriter] */
    public final void failWebSocket(@NotNull Exception e10, @Nullable Response response, boolean isWriter) {
        WebSocketWriter webSocketWriter;
        Intrinsics.checkNotNullParameter(e10, "e");
        final C7729c0 c7729c0 = new C7729c0();
        synchronized (this) {
            try {
                if (this.failed) {
                    return;
                }
                this.failed = true;
                InterfaceC12949q0 interfaceC12949q0 = this.socket;
                ?? r8 = this.writer;
                c7729c0.f29425a = r8;
                this.writer = null;
                if (!isWriter && r8 != 0) {
                    TaskQueue.execute$default(this.taskQueue, this.name + " writer close", 0L, false, new Function0() { // from class: okhttp3.internal.ws.d
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return RealWebSocket.failWebSocket$lambda$0$0(c7729c0);
                        }
                    }, 2, null);
                }
                this.taskQueue.shutdown();
                Unit unit = Unit.f29331a;
                try {
                    this.listener.onFailure(this, e10, response);
                } finally {
                    if (interfaceC12949q0 != null) {
                        interfaceC12949q0.cancel();
                    }
                    if (isWriter && (webSocketWriter = (WebSocketWriter) c7729c0.f29425a) != null) {
                        _UtilCommonKt.closeQuietly(webSocketWriter);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void finishReader() {
        int i10;
        String str;
        WebSocketReader webSocketReader;
        boolean z10;
        synchronized (this) {
            try {
                i10 = this.receivedCloseCode;
                str = this.receivedCloseReason;
                webSocketReader = this.reader;
                this.reader = null;
                if (this.enqueuedClose && this.messageAndCloseQueue.isEmpty()) {
                    final WebSocketWriter webSocketWriter = this.writer;
                    if (webSocketWriter != null) {
                        this.writer = null;
                        TaskQueue.execute$default(this.taskQueue, this.name + " writer close", 0L, false, new Function0() { // from class: okhttp3.internal.ws.b
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return RealWebSocket.finishReader$lambda$0$0(webSocketWriter);
                            }
                        }, 2, null);
                    }
                    this.taskQueue.shutdown();
                }
                z10 = (this.failed || this.writer != null || this.receivedCloseCode == -1) ? false : true;
                Unit unit = Unit.f29331a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (z10) {
            WebSocketListener webSocketListener = this.listener;
            Intrinsics.checkNotNull(str);
            webSocketListener.onClosed(this, i10, str);
        }
        if (webSocketReader != null) {
            _UtilCommonKt.closeQuietly(webSocketReader);
        }
    }

    @Nullable
    /* JADX INFO: renamed from: getCall$okhttp, reason: from getter */
    public final Call getCall() {
        return this.call;
    }

    @NotNull
    /* JADX INFO: renamed from: getListener$okhttp, reason: from getter */
    public final WebSocketListener getListener() {
        return this.listener;
    }

    public final void initReaderAndWriter(@NotNull String name, @NotNull BufferedSocket socket, boolean client) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(socket, "socket");
        WebSocketExtensions webSocketExtensions = this.extensions;
        Intrinsics.checkNotNull(webSocketExtensions);
        synchronized (this) {
            try {
                this.name = name;
                this.socket = socket;
                this.writer = new WebSocketWriter(client, socket.getSink(), this.random, webSocketExtensions.perMessageDeflate, webSocketExtensions.noContextTakeover(client), this.minimumDeflateSize);
                this.writerTask = new WriterTask();
                long j10 = this.pingIntervalMillis;
                if (j10 != 0) {
                    final long nanos = TimeUnit.MILLISECONDS.toNanos(j10);
                    this.taskQueue.schedule(name + " ping", nanos, new Function0() { // from class: okhttp3.internal.ws.c
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return Long.valueOf(RealWebSocket.initReaderAndWriter$lambda$0$0(this.f35572a, nanos));
                        }
                    });
                }
                if (!this.messageAndCloseQueue.isEmpty()) {
                    runWriter();
                }
                Unit unit = Unit.f29331a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.reader = new WebSocketReader(client, socket.getSource(), this, webSocketExtensions.perMessageDeflate, webSocketExtensions.noContextTakeover(!client));
    }

    public final void loopReader(@NotNull Response response) {
        Intrinsics.checkNotNullParameter(response, "response");
        try {
            this.listener.onOpen(this, response);
            while (this.receivedCloseCode == -1) {
                WebSocketReader webSocketReader = this.reader;
                Intrinsics.checkNotNull(webSocketReader);
                webSocketReader.processNextFrame();
            }
        } catch (Exception e10) {
            failWebSocket$default(this, e10, null, false, 6, null);
        } finally {
            finishReader();
        }
    }

    @Override // okhttp3.internal.ws.WebSocketReader.FrameCallback
    public void onReadClose(int code, @NotNull String reason) {
        Intrinsics.checkNotNullParameter(reason, "reason");
        if (code == -1) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        synchronized (this) {
            if (this.receivedCloseCode != -1) {
                throw new IllegalStateException("already closed");
            }
            this.receivedCloseCode = code;
            this.receivedCloseReason = reason;
            Unit unit = Unit.f29331a;
        }
        this.listener.onClosing(this, code, reason);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // okhttp3.internal.ws.WebSocketReader.FrameCallback
    public void onReadMessage(@NotNull String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        this.listener.onMessage(this, text);
    }

    @Override // okhttp3.internal.ws.WebSocketReader.FrameCallback
    public synchronized void onReadPing(@NotNull C12930h payload) {
        try {
            Intrinsics.checkNotNullParameter(payload, "payload");
            if (!this.failed && (!this.enqueuedClose || !this.messageAndCloseQueue.isEmpty())) {
                this.pongQueue.add(payload);
                runWriter();
                this.receivedPingCount++;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // okhttp3.internal.ws.WebSocketReader.FrameCallback
    public synchronized void onReadPong(@NotNull C12930h payload) {
        Intrinsics.checkNotNullParameter(payload, "payload");
        this.receivedPongCount++;
        this.awaitingPong = false;
    }

    public final synchronized boolean pong(@NotNull C12930h payload) {
        try {
            Intrinsics.checkNotNullParameter(payload, "payload");
            if (!this.failed && (!this.enqueuedClose || !this.messageAndCloseQueue.isEmpty())) {
                this.pongQueue.add(payload);
                runWriter();
                return true;
            }
            return false;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final boolean processNextFrame() {
        try {
            WebSocketReader webSocketReader = this.reader;
            Intrinsics.checkNotNull(webSocketReader);
            webSocketReader.processNextFrame();
            return this.receivedCloseCode == -1;
        } catch (Exception e10) {
            failWebSocket$default(this, e10, null, false, 6, null);
            return false;
        }
    }

    @Override // okhttp3.WebSocket
    public synchronized long queueSize() {
        return this.queueSize;
    }

    public final synchronized int receivedPingCount() {
        return this.receivedPingCount;
    }

    public final synchronized int receivedPongCount() {
        return this.receivedPongCount;
    }

    @Override // okhttp3.WebSocket
    @NotNull
    /* JADX INFO: renamed from: request, reason: from getter */
    public Request getOriginalRequest() {
        return this.originalRequest;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // okhttp3.WebSocket
    public boolean send(@NotNull String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        return send(C12930h.INSTANCE.m48117d(text), 1);
    }

    public final synchronized int sentPingCount() {
        return this.sentPingCount;
    }

    public final void setCall$okhttp(@Nullable Call call) {
        this.call = call;
    }

    public final void tearDown() throws InterruptedException {
        this.taskQueue.shutdown();
        this.taskQueue.idleLatch().await(10L, TimeUnit.SECONDS);
    }

    public final boolean writeOneFrame$okhttp() {
        String str;
        int i10;
        WebSocketWriter webSocketWriter;
        synchronized (this) {
            try {
                boolean z10 = false;
                if (this.failed) {
                    return false;
                }
                WebSocketWriter webSocketWriter2 = this.writer;
                C12930h c12930hPoll = this.pongQueue.poll();
                Object obj = null;
                if (c12930hPoll == null) {
                    Object objPoll = this.messageAndCloseQueue.poll();
                    if (objPoll instanceof Close) {
                        i10 = this.receivedCloseCode;
                        str = this.receivedCloseReason;
                        if (i10 != -1) {
                            webSocketWriter = this.writer;
                            this.writer = null;
                            if (webSocketWriter != null && this.reader == null) {
                                z10 = true;
                            }
                            this.taskQueue.shutdown();
                        } else {
                            long cancelAfterCloseMillis = ((Close) objPoll).getCancelAfterCloseMillis();
                            TaskQueue.execute$default(this.taskQueue, this.name + " cancel", TimeUnit.MILLISECONDS.toNanos(cancelAfterCloseMillis), false, new Function0() { // from class: okhttp3.internal.ws.a
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return RealWebSocket.writeOneFrame$lambda$0$0(this.f35570a);
                                }
                            }, 4, null);
                            webSocketWriter = null;
                        }
                    } else {
                        if (objPoll == null) {
                            return false;
                        }
                        str = null;
                        i10 = -1;
                        webSocketWriter = null;
                    }
                    obj = objPoll;
                } else {
                    str = null;
                    i10 = -1;
                    webSocketWriter = null;
                }
                Unit unit = Unit.f29331a;
                try {
                    if (c12930hPoll != null) {
                        Intrinsics.checkNotNull(webSocketWriter2);
                        webSocketWriter2.writePong(c12930hPoll);
                    } else if (obj instanceof Message) {
                        Intrinsics.checkNotNull(webSocketWriter2);
                        webSocketWriter2.writeMessageFrame(((Message) obj).getFormatOpcode(), ((Message) obj).getData());
                        synchronized (this) {
                            this.queueSize -= (long) ((Message) obj).getData().m48089I();
                        }
                    } else {
                        if (!(obj instanceof Close)) {
                            throw new AssertionError();
                        }
                        Intrinsics.checkNotNull(webSocketWriter2);
                        webSocketWriter2.writeClose(((Close) obj).getCode(), ((Close) obj).getReason());
                        if (z10) {
                            WebSocketListener webSocketListener = this.listener;
                            Intrinsics.checkNotNull(str);
                            webSocketListener.onClosed(this, i10, str);
                        }
                    }
                    if (webSocketWriter != null) {
                        _UtilCommonKt.closeQuietly(webSocketWriter);
                    }
                    return true;
                } catch (Throwable th2) {
                    if (webSocketWriter != null) {
                        _UtilCommonKt.closeQuietly(webSocketWriter);
                    }
                    throw th2;
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public final void writePingFrame$okhttp() {
        synchronized (this) {
            try {
                if (this.failed) {
                    return;
                }
                WebSocketWriter webSocketWriter = this.writer;
                if (webSocketWriter == null) {
                    return;
                }
                int i10 = this.awaitingPong ? this.sentPingCount : -1;
                this.sentPingCount++;
                this.awaitingPong = true;
                Unit unit = Unit.f29331a;
                if (i10 == -1) {
                    try {
                        webSocketWriter.writePing(C12930h.f45830e);
                        return;
                    } catch (IOException e10) {
                        failWebSocket$default(this, e10, null, true, 2, null);
                        return;
                    }
                }
                failWebSocket$default(this, new SocketTimeoutException("sent ping but didn't receive pong within " + this.pingIntervalMillis + "ms (after " + (i10 - 1) + " successful ping/pongs)"), null, true, 2, null);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public final synchronized boolean close(int code, @Nullable String reason, long cancelAfterCloseMillis) {
        C12930h c12930hM48117d;
        try {
            WebSocketProtocol.INSTANCE.validateCloseCode(code);
            if (reason != null) {
                c12930hM48117d = C12930h.INSTANCE.m48117d(reason);
                if (c12930hM48117d.m48089I() > 123) {
                    throw new IllegalArgumentException(("reason.size() > 123: " + reason).toString());
                }
            } else {
                c12930hM48117d = null;
            }
            if (!this.failed && !this.enqueuedClose) {
                this.enqueuedClose = true;
                this.messageAndCloseQueue.add(new Close(code, c12930hM48117d, cancelAfterCloseMillis));
                runWriter();
                return true;
            }
            return false;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @Override // okhttp3.internal.ws.WebSocketReader.FrameCallback
    public void onReadMessage(@NotNull C12930h bytes) {
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        this.listener.onMessage(this, bytes);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @Override // okhttp3.WebSocket
    public boolean send(@NotNull C12930h bytes) {
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        return send(bytes, 2);
    }

    private final synchronized boolean send(C12930h data, int formatOpcode) {
        if (!this.failed && !this.enqueuedClose) {
            if (this.queueSize + ((long) data.m48089I()) > MAX_QUEUE_SIZE) {
                close(1001, null);
                return false;
            }
            this.queueSize += (long) data.m48089I();
            this.messageAndCloseQueue.add(new Message(formatOpcode, data));
            runWriter();
            return true;
        }
        return false;
    }
}
