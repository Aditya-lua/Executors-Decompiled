package uv;

import com.appsflyer.sdk_base.referrer.Payload;
import com.github.luben.zstd.BuildConfig;
import java.io.Closeable;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001kotlin.Metadata;
import p001kotlin.Unit;
import p001kotlin.jvm.functions.Function0;
import p001kotlin.jvm.internal.DefaultConstructorMarker;
import p001kotlin.jvm.internal.Intrinsics;
import p001kotlin.jvm.internal.c0;
import vv.WindowCounter;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000È\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b%\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010%\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010#\n\u0002\b\u0005\u0018\u0000 Ê\u00012\u00020\u00012\u00020\u0002:\u0004Uga[B\u0011\b\u0000\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J-\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\b\u001a\u00020\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0019\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0017\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0016\u001a\u00020\u0007¢\u0006\u0004\b\u0017\u0010\u0018J\u0019\u0010\u001a\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0019\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\u001a\u0010\u0018J\u0017\u0010\u001d\u001a\u00020\u00132\u0006\u0010\u001c\u001a\u00020\u001bH\u0000¢\u0006\u0004\b\u001d\u0010\u001eJ#\u0010\u001f\u001a\u00020\u000e2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u001f\u0010 J-\u0010#\u001a\u00020\u00132\u0006\u0010\u0019\u001a\u00020\u00072\u0006\u0010!\u001a\u00020\f2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0000¢\u0006\u0004\b#\u0010$J/\u0010(\u001a\u00020\u00132\u0006\u0010\u0019\u001a\u00020\u00072\u0006\u0010!\u001a\u00020\f2\b\u0010&\u001a\u0004\u0018\u00010%2\u0006\u0010'\u001a\u00020\u001b¢\u0006\u0004\b(\u0010)J\u001f\u0010,\u001a\u00020\u00132\u0006\u0010\u0019\u001a\u00020\u00072\u0006\u0010+\u001a\u00020*H\u0000¢\u0006\u0004\b,\u0010-J\u001f\u0010/\u001a\u00020\u00132\u0006\u0010\u0019\u001a\u00020\u00072\u0006\u0010.\u001a\u00020*H\u0000¢\u0006\u0004\b/\u0010-J\u001f\u00101\u001a\u00020\u00132\u0006\u0010\u0019\u001a\u00020\u00072\u0006\u00100\u001a\u00020\u001bH\u0000¢\u0006\u0004\b1\u00102J%\u00106\u001a\u00020\u00132\u0006\u00103\u001a\u00020\f2\u0006\u00104\u001a\u00020\u00072\u0006\u00105\u001a\u00020\u0007¢\u0006\u0004\b6\u00107J\r\u00108\u001a\u00020\u0013¢\u0006\u0004\b8\u00109J\u0015\u0010:\u001a\u00020\u00132\u0006\u0010.\u001a\u00020*¢\u0006\u0004\b:\u0010;J\u000f\u0010<\u001a\u00020\u0013H\u0016¢\u0006\u0004\b<\u00109J)\u0010@\u001a\u00020\u00132\u0006\u0010=\u001a\u00020*2\u0006\u0010>\u001a\u00020*2\b\u0010?\u001a\u0004\u0018\u00010\u0011H\u0000¢\u0006\u0004\b@\u0010AJ\u0019\u0010C\u001a\u00020\u00132\b\b\u0002\u0010B\u001a\u00020\fH\u0007¢\u0006\u0004\bC\u0010DJ\u0015\u0010F\u001a\u00020\f2\u0006\u0010E\u001a\u00020\u001b¢\u0006\u0004\bF\u0010GJ\u000f\u0010H\u001a\u00020\u0013H\u0000¢\u0006\u0004\bH\u00109J\u0017\u0010I\u001a\u00020\f2\u0006\u0010\u0019\u001a\u00020\u0007H\u0000¢\u0006\u0004\bI\u0010JJ%\u0010K\u001a\u00020\u00132\u0006\u0010\u0019\u001a\u00020\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0000¢\u0006\u0004\bK\u0010LJ-\u0010N\u001a\u00020\u00132\u0006\u0010\u0019\u001a\u00020\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010M\u001a\u00020\fH\u0000¢\u0006\u0004\bN\u0010OJ/\u0010R\u001a\u00020\u00132\u0006\u0010\u0019\u001a\u00020\u00072\u0006\u0010Q\u001a\u00020P2\u0006\u0010'\u001a\u00020\u00072\u0006\u0010M\u001a\u00020\fH\u0000¢\u0006\u0004\bR\u0010SJ\u001f\u0010T\u001a\u00020\u00132\u0006\u0010\u0019\u001a\u00020\u00072\u0006\u0010+\u001a\u00020*H\u0000¢\u0006\u0004\bT\u0010-R\u001a\u0010Y\u001a\u00020\f8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bU\u0010V\u001a\u0004\bW\u0010XR\u001a\u0010_\u001a\u00020Z8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b[\u0010\\\u001a\u0004\b]\u0010^R&\u0010e\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u000e0`8\u0000X\u0080\u0004¢\u0006\f\n\u0004\ba\u0010b\u001a\u0004\bc\u0010dR\u001a\u0010k\u001a\u00020f8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bg\u0010h\u001a\u0004\bi\u0010jR\"\u0010q\u001a\u00020\u00078\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010l\u001a\u0004\bm\u0010n\"\u0004\bo\u0010pR\"\u0010u\u001a\u00020\u00078\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\br\u0010l\u001a\u0004\bs\u0010n\"\u0004\bt\u0010pR\u0016\u0010w\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bv\u0010VR\u0014\u0010{\u001a\u00020x8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\by\u0010zR\u0014\u0010\u007f\u001a\u00020|8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b}\u0010~R\u0016\u0010\u0081\u0001\u001a\u00020|8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0080\u0001\u0010~R\u0016\u0010\u0083\u0001\u001a\u00020|8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0082\u0001\u0010~R\u0018\u0010\u0087\u0001\u001a\u00030\u0084\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0085\u0001\u0010\u0086\u0001R\u0019\u0010\u008a\u0001\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0088\u0001\u0010\u0089\u0001R\u0019\u0010\u008c\u0001\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008b\u0001\u0010\u0089\u0001R\u0019\u0010\u008e\u0001\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008d\u0001\u0010\u0089\u0001R\u0019\u0010\u0090\u0001\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008f\u0001\u0010\u0089\u0001R\u0019\u0010\u0092\u0001\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0091\u0001\u0010\u0089\u0001R\u0019\u0010\u0094\u0001\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0093\u0001\u0010\u0089\u0001R \u0010\u009a\u0001\u001a\u00030\u0095\u00018\u0000X\u0080\u0004¢\u0006\u0010\n\u0006\b\u0096\u0001\u0010\u0097\u0001\u001a\u0006\b\u0098\u0001\u0010\u0099\u0001R\u001d\u0010 \u0001\u001a\u00030\u009b\u00018\u0006¢\u0006\u0010\n\u0006\b\u009c\u0001\u0010\u009d\u0001\u001a\u0006\b\u009e\u0001\u0010\u009f\u0001R*\u0010¥\u0001\u001a\u00030\u009b\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b¡\u0001\u0010\u009d\u0001\u001a\u0006\b¢\u0001\u0010\u009f\u0001\"\u0006\b£\u0001\u0010¤\u0001R\u001d\u0010«\u0001\u001a\u00030¦\u00018\u0006¢\u0006\u0010\n\u0006\b§\u0001\u0010¨\u0001\u001a\u0006\b©\u0001\u0010ª\u0001R*\u0010°\u0001\u001a\u00020\u001b2\u0007\u0010¬\u0001\u001a\u00020\u001b8\u0006@BX\u0086\u000e¢\u0006\u0010\n\u0006\b\u00ad\u0001\u0010\u0089\u0001\u001a\u0006\b®\u0001\u0010¯\u0001R*\u0010³\u0001\u001a\u00020\u001b2\u0007\u0010¬\u0001\u001a\u00020\u001b8\u0006@BX\u0086\u000e¢\u0006\u0010\n\u0006\b±\u0001\u0010\u0089\u0001\u001a\u0006\b²\u0001\u0010¯\u0001R \u0010¹\u0001\u001a\u00030´\u00018\u0000X\u0080\u0004¢\u0006\u0010\n\u0006\bµ\u0001\u0010¶\u0001\u001a\u0006\b·\u0001\u0010¸\u0001R\u001d\u0010¿\u0001\u001a\u00030º\u00018\u0006¢\u0006\u0010\n\u0006\b»\u0001\u0010¼\u0001\u001a\u0006\b½\u0001\u0010¾\u0001R!\u0010Å\u0001\u001a\u00070À\u0001R\u00020\u00008\u0006¢\u0006\u0010\n\u0006\bÁ\u0001\u0010Â\u0001\u001a\u0006\bÃ\u0001\u0010Ä\u0001R\u001e\u0010É\u0001\u001a\t\u0012\u0004\u0012\u00020\u00070Æ\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÇ\u0001\u0010È\u0001¨\u0006Ë\u0001"}, d2 = {"Luv/o;", "Ljava/io/Closeable;", BuildConfig.FLAVOR, "Luv/o$a;", "builder", "<init>", "(Luv/o$a;)V", BuildConfig.FLAVOR, "associatedStreamId", BuildConfig.FLAVOR, "Luv/d;", "requestHeaders", BuildConfig.FLAVOR, "out", "Luv/v;", "s0", "(ILjava/util/List;Z)Luv/v;", "Ljava/io/IOException;", "e", BuildConfig.FLAVOR, "N", "(Ljava/io/IOException;)V", "id", "f0", "(I)Luv/v;", "streamId", "O0", BuildConfig.FLAVOR, "read", "W0", "(J)V", "w0", "(Ljava/util/List;Z)Luv/v;", "outFinished", "alternating", "Y0", "(IZLjava/util/List;)V", "Lew/e;", "buffer", "byteCount", "X0", "(IZLew/e;J)V", "Luv/b;", "errorCode", "e1", "(ILuv/b;)V", "statusCode", "a1", "unacknowledgedBytesRead", "g1", "(IJ)V", "reply", "payload1", "payload2", "Z0", "(ZII)V", "flush", "()V", "T0", "(Luv/b;)V", "close", "connectionCode", "streamCode", "cause", "L", "(Luv/b;Luv/b;Ljava/io/IOException;)V", "sendConnectionPreface", "U0", "(Z)V", "nowNs", "n0", "(J)Z", "Q0", "M0", "(I)Z", "G0", "(ILjava/util/List;)V", "inFinished", "E0", "(ILjava/util/List;Z)V", "Lew/g;", Payload.SOURCE, "z0", "(ILew/g;IZ)V", "K0", "a", "Z", "O", "()Z", "client", "Luv/o$c;", "b", "Luv/o$c;", "b0", "()Luv/o$c;", "listener", BuildConfig.FLAVOR, "c", "Ljava/util/Map;", "h0", "()Ljava/util/Map;", "streams", BuildConfig.FLAVOR, "d", "Ljava/lang/String;", "Q", "()Ljava/lang/String;", "connectionName", "I", "Y", "()I", "R0", "(I)V", "lastGoodStreamId", "f", "c0", "setNextStreamId$okhttp", "nextStreamId", "g", "isShutdown", "Lqv/d;", "h", "Lqv/d;", "taskRunner", "Lqv/c;", "i", "Lqv/c;", "writerQueue", "j", "pushQueue", "k", "settingsListenerQueue", "Luv/y;", "l", "Luv/y;", "pushObserver", "m", "J", "intervalPingsSent", "n", "intervalPongsReceived", "o", "degradedPingsSent", "p", "degradedPongsReceived", "q", "awaitPongsReceived", "r", "degradedPongDeadlineNs", "Luv/c;", "s", "Luv/c;", "T", "()Luv/c;", "flowControlListener", "Luv/z;", "t", "Luv/z;", "d0", "()Luv/z;", "okHttpSettings", "u", "e0", "S0", "(Luv/z;)V", "peerSettings", "Lvv/a;", "v", "Lvv/a;", "getReadBytes", "()Lvv/a;", "readBytes", "value", "w", "getWriteBytesTotal", "()J", "writeBytesTotal", "x", "i0", "writeBytesMaximum", "Lrv/a;", "y", "Lrv/a;", "getSocket$okhttp", "()Lrv/a;", "socket", "Luv/w;", "z", "Luv/w;", "k0", "()Luv/w;", "writer", "Luv/o$d;", "A", "Luv/o$d;", "getReaderRunnable", "()Luv/o$d;", "readerRunnable", BuildConfig.FLAVOR, "B", "Ljava/util/Set;", "currentPushRequests", "C", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class o implements Closeable {

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final z D;

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    @NotNull
    public final d readerRunnable;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    @NotNull
    public final Set<Integer> currentPushRequests;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final boolean client;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final c listener;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Map<Integer, v> streams;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String connectionName;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public int lastGoodStreamId;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    public int nextStreamId;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    public boolean isShutdown;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final qv.d taskRunner;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final qv.c writerQueue;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final qv.c pushQueue;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final qv.c settingsListenerQueue;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final y pushObserver;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    public long intervalPingsSent;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    public long intervalPongsReceived;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    public long degradedPingsSent;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    public long degradedPongsReceived;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    public long awaitPongsReceived;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    public long degradedPongDeadlineNs;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final uv.c flowControlListener;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final z okHttpSettings;

    /* JADX INFO: renamed from: u, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public z peerSettings;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final WindowCounter readBytes;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    public long writeBytesTotal;

    /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata */
    public long writeBytesMaximum;

    /* JADX INFO: renamed from: y, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final rv.a socket;

    /* JADX INFO: renamed from: z, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final w writer;

    @Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0018\u0002\n\u0002\b\u0010\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\f\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\r\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001b\u0010\u001cR\"\u0010\u0003\u001a\u00020\u00028\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u001a\u0010\u0005\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0018\u0010\"\u001a\u0004\b#\u0010$R\"\u0010\t\u001a\u00020\b8\u0000@\u0000X\u0080.¢\u0006\u0012\n\u0004\b\u001e\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R\"\u0010/\u001a\u00020\n8\u0000@\u0000X\u0080.¢\u0006\u0012\n\u0004\b*\u0010+\u001a\u0004\b*\u0010,\"\u0004\b-\u0010.R\"\u0010\u000f\u001a\u00020\u000e8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b0\u00101\u001a\u0004\b2\u00103\"\u0004\b4\u00105R\"\u0010<\u001a\u0002068\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b2\u00107\u001a\u0004\b8\u00109\"\u0004\b:\u0010;R\"\u0010\u0013\u001a\u00020\u00128\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b=\u0010>\u001a\u0004\b=\u0010?\"\u0004\b@\u0010AR\"\u0010\u0017\u001a\u00020\u00168\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b8\u0010B\u001a\u0004\b0\u0010C\"\u0004\bD\u0010E¨\u0006F"}, d2 = {"Luv/o$a;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "client", "Lqv/d;", "taskRunner", "<init>", "(ZLqv/d;)V", "Lrv/a;", "socket", BuildConfig.FLAVOR, "peerName", "o", "(Lrv/a;Ljava/lang/String;)Luv/o$a;", "Luv/o$c;", "listener", "k", "(Luv/o$c;)Luv/o$a;", BuildConfig.FLAVOR, "pingIntervalMillis", "l", "(I)Luv/o$a;", "Luv/c;", "flowControlListener", "b", "(Luv/c;)Luv/o$a;", "Luv/o;", "a", "()Luv/o;", "Z", "c", "()Z", "setClient$okhttp", "(Z)V", "Lqv/d;", "j", "()Lqv/d;", "Lrv/a;", "i", "()Lrv/a;", "n", "(Lrv/a;)V", "d", "Ljava/lang/String;", "()Ljava/lang/String;", "m", "(Ljava/lang/String;)V", "connectionName", "e", "Luv/o$c;", "f", "()Luv/o$c;", "setListener$okhttp", "(Luv/o$c;)V", "Luv/y;", "Luv/y;", "h", "()Luv/y;", "setPushObserver$okhttp", "(Luv/y;)V", "pushObserver", "g", "I", "()I", "setPingIntervalMillis$okhttp", "(I)V", "Luv/c;", "()Luv/c;", "setFlowControlListener$okhttp", "(Luv/c;)V", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        public boolean client;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        public final qv.d taskRunner;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        public rv.a socket;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        public String connectionName;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public c listener;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public y pushObserver;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
        public int pingIntervalMillis;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public uv.c flowControlListener;

        public a(boolean z10, @NotNull qv.d taskRunner) {
            Intrinsics.checkNotNullParameter(taskRunner, "taskRunner");
            this.client = z10;
            this.taskRunner = taskRunner;
            this.listener = c.b;
            this.pushObserver = y.b;
            this.flowControlListener = uv.c.a.f33970a;
        }

        @NotNull
        public final o a() {
            return new o(this);
        }

        @NotNull
        public final a b(@NotNull uv.c flowControlListener) {
            Intrinsics.checkNotNullParameter(flowControlListener, "flowControlListener");
            this.flowControlListener = flowControlListener;
            return this;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final boolean getClient() {
            return this.client;
        }

        @NotNull
        public final String d() {
            String str = this.connectionName;
            if (str != null) {
                return str;
            }
            Intrinsics.u("connectionName");
            return null;
        }

        @NotNull
        /* JADX INFO: renamed from: e, reason: from getter */
        public final uv.c getFlowControlListener() {
            return this.flowControlListener;
        }

        @NotNull
        /* JADX INFO: renamed from: f, reason: from getter */
        public final c getListener() {
            return this.listener;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final int getPingIntervalMillis() {
            return this.pingIntervalMillis;
        }

        @NotNull
        /* JADX INFO: renamed from: h, reason: from getter */
        public final y getPushObserver() {
            return this.pushObserver;
        }

        @NotNull
        public final rv.a i() {
            rv.a aVar = this.socket;
            if (aVar != null) {
                return aVar;
            }
            Intrinsics.u("socket");
            return null;
        }

        @NotNull
        /* JADX INFO: renamed from: j, reason: from getter */
        public final qv.d getTaskRunner() {
            return this.taskRunner;
        }

        @NotNull
        public final a k(@NotNull c listener) {
            Intrinsics.checkNotNullParameter(listener, "listener");
            this.listener = listener;
            return this;
        }

        @NotNull
        public final a l(int pingIntervalMillis) {
            this.pingIntervalMillis = pingIntervalMillis;
            return this;
        }

        public final void m(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.connectionName = str;
        }

        public final void n(@NotNull rv.a aVar) {
            Intrinsics.checkNotNullParameter(aVar, "<set-?>");
            this.socket = aVar;
        }

        @NotNull
        public final a o(@NotNull rv.a socket, @NotNull String peerName) {
            String str;
            Intrinsics.checkNotNullParameter(socket, "socket");
            Intrinsics.checkNotNullParameter(peerName, "peerName");
            n(socket);
            if (this.client) {
                str = nv.q.f26640c + ' ' + peerName;
            } else {
                str = "MockWebServer " + peerName;
            }
            m(str);
            return this;
        }
    }

    /* JADX INFO: renamed from: uv.o$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u000bR\u0014\u0010\r\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\u000bR\u0014\u0010\u000f\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\u000b¨\u0006\u0010"}, d2 = {"Luv/o$b;", BuildConfig.FLAVOR, "<init>", "()V", "Luv/z;", "DEFAULT_SETTINGS", "Luv/z;", "a", "()Luv/z;", BuildConfig.FLAVOR, "OKHTTP_CLIENT_WINDOW_SIZE", "I", "INTERVAL_PING", "DEGRADED_PING", "AWAIT_PING", "DEGRADED_PONG_TIMEOUT_NS", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final z a() {
            return o.D;
        }

        public Companion() {
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b&\u0018\u0000 \u000f2\u00020\u0001:\u0001\rB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\r\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"Luv/o$c;", BuildConfig.FLAVOR, "<init>", "()V", "Luv/v;", "stream", BuildConfig.FLAVOR, "c", "(Luv/v;)V", "Luv/o;", "connection", "Luv/z;", "settings", "b", "(Luv/o;Luv/z;)V", "a", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static abstract class c {

        @NotNull
        public static final c b = new a();

        @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"uv/o$c$a", "Luv/o$c;", "Luv/v;", "stream", BuildConfig.FLAVOR, "c", "(Luv/v;)V", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class a extends c {
            @Override // uv.o.c
            public void c(v stream) {
                Intrinsics.checkNotNullParameter(stream, "stream");
                stream.g(b.REFUSED_STREAM, null);
            }
        }

        public void b(@NotNull o connection, @NotNull z settings) {
            Intrinsics.checkNotNullParameter(connection, "connection");
            Intrinsics.checkNotNullParameter(settings, "settings");
        }

        public abstract void c(@NotNull v stream);
    }

    @Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0010\b\u0086\u0004\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002B\u0011\b\u0000\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\b\u0010\tJ/\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J5\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\f2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u001b\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u001f\u0010 \u001a\u00020\u00032\u0006\u0010\u001d\u001a\u00020\n2\u0006\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b \u0010!J\u001d\u0010\"\u001a\u00020\u00032\u0006\u0010\u001d\u001a\u00020\n2\u0006\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b\"\u0010!J\u000f\u0010#\u001a\u00020\u0003H\u0016¢\u0006\u0004\b#\u0010\tJ'\u0010'\u001a\u00020\u00032\u0006\u0010$\u001a\u00020\n2\u0006\u0010%\u001a\u00020\f2\u0006\u0010&\u001a\u00020\fH\u0016¢\u0006\u0004\b'\u0010(J'\u0010,\u001a\u00020\u00032\u0006\u0010)\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010+\u001a\u00020*H\u0016¢\u0006\u0004\b,\u0010-J\u001f\u00100\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\f2\u0006\u0010/\u001a\u00020.H\u0016¢\u0006\u0004\b0\u00101J/\u00105\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\f2\u0006\u00102\u001a\u00020\f2\u0006\u00103\u001a\u00020\f2\u0006\u00104\u001a\u00020\nH\u0016¢\u0006\u0004\b5\u00106J-\u00109\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\f2\u0006\u00107\u001a\u00020\f2\f\u00108\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014H\u0016¢\u0006\u0004\b9\u0010:R\u001a\u0010\u0005\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0017\u0010;\u001a\u0004\b<\u0010=¨\u0006>"}, d2 = {"Luv/o$d;", "Luv/u$c;", "Lkotlin/Function0;", BuildConfig.FLAVOR, "Luv/u;", "reader", "<init>", "(Luv/o;Luv/u;)V", "w", "()V", BuildConfig.FLAVOR, "inFinished", BuildConfig.FLAVOR, "streamId", "Lew/g;", Payload.SOURCE, "length", "k", "(ZILew/g;I)V", "associatedStreamId", BuildConfig.FLAVOR, "Luv/d;", "headerBlock", "a", "(ZIILjava/util/List;)V", "Luv/b;", "errorCode", "d", "(ILuv/b;)V", "clearPrevious", "Luv/z;", "settings", "i", "(ZLuv/z;)V", "t", "h", "ack", "payload1", "payload2", "l", "(ZII)V", "lastGoodStreamId", "Lew/h;", "debugData", "j", "(ILuv/b;Lew/h;)V", BuildConfig.FLAVOR, "windowSizeIncrement", "b", "(IJ)V", "streamDependency", "weight", "exclusive", "m", "(IIIZ)V", "promisedStreamId", "requestHeaders", "f", "(IILjava/util/List;)V", "Luv/u;", "getReader$okhttp", "()Luv/u;", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public final class d implements u.c, Function0<Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final u reader;
        public final /* synthetic */ o b;

        public d(@NotNull o oVar, u reader) {
            Intrinsics.checkNotNullParameter(reader, "reader");
            this.b = oVar;
            this.reader = reader;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static final Unit u(o oVar, c0 c0Var) {
            oVar.getListener().b(oVar, (z) c0Var.f21575a);
            return Unit.f21506a;
        }

        public static final Unit v(o oVar, v vVar) {
            try {
                oVar.getListener().c(vVar);
            } catch (IOException e10) {
                okhttp3.internal.platform.c.INSTANCE.e().m("Http2Connection.Listener failure for " + oVar.getConnectionName(), 4, e10);
                try {
                    vVar.g(b.PROTOCOL_ERROR, e10);
                } catch (IOException unused) {
                }
            }
            return Unit.f21506a;
        }

        public static final Unit x(o oVar, int i10, int i11) {
            oVar.Z0(true, i10, i11);
            return Unit.f21506a;
        }

        public static final Unit y(d dVar, boolean z10, z zVar) {
            dVar.t(z10, zVar);
            return Unit.f21506a;
        }

        @Override // uv.u.c
        public void a(boolean inFinished, int streamId, int associatedStreamId, @NotNull List<uv.d> headerBlock) {
            Intrinsics.checkNotNullParameter(headerBlock, "headerBlock");
            if (this.b.M0(streamId)) {
                this.b.E0(streamId, headerBlock, inFinished);
                return;
            }
            final o oVar = this.b;
            synchronized (oVar) {
                v vVarF0 = oVar.f0(streamId);
                if (vVarF0 != null) {
                    Unit unit = Unit.f21506a;
                    vVarF0.A(nv.q.s(headerBlock), inFinished);
                    return;
                }
                if (oVar.isShutdown) {
                    return;
                }
                if (streamId <= oVar.getLastGoodStreamId()) {
                    return;
                }
                if (streamId % 2 == oVar.getNextStreamId() % 2) {
                    return;
                }
                final v vVar = new v(streamId, oVar, false, inFinished, nv.q.s(headerBlock));
                oVar.R0(streamId);
                oVar.h0().put(Integer.valueOf(streamId), vVar);
                qv.c.d(oVar.taskRunner.k(), oVar.getConnectionName() + '[' + streamId + "] onStream", 0L, false, new Function0() { // from class: uv.q
                    @Override // p001kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return o.d.v(oVar, vVar);
                    }
                }, 6, null);
            }
        }

        @Override // uv.u.c
        public void b(int streamId, long windowSizeIncrement) {
            if (streamId == 0) {
                o oVar = this.b;
                synchronized (oVar) {
                    oVar.writeBytesMaximum = oVar.getWriteBytesMaximum() + windowSizeIncrement;
                    Intrinsics.d(oVar, "null cannot be cast to non-null type java.lang.Object");
                    oVar.notifyAll();
                    Unit unit = Unit.f21506a;
                }
                return;
            }
            v vVarF0 = this.b.f0(streamId);
            if (vVarF0 != null) {
                synchronized (vVarF0) {
                    vVarF0.d(windowSizeIncrement);
                    Unit unit2 = Unit.f21506a;
                }
            }
        }

        @Override // uv.u.c
        public void d(int streamId, @NotNull b errorCode) {
            Intrinsics.checkNotNullParameter(errorCode, "errorCode");
            if (this.b.M0(streamId)) {
                this.b.K0(streamId, errorCode);
                return;
            }
            v vVarO0 = this.b.O0(streamId);
            if (vVarO0 != null) {
                vVarO0.B(errorCode);
            }
        }

        @Override // uv.u.c
        public void f(int streamId, int promisedStreamId, @NotNull List<uv.d> requestHeaders) {
            Intrinsics.checkNotNullParameter(requestHeaders, "requestHeaders");
            this.b.G0(promisedStreamId, requestHeaders);
        }

        @Override // uv.u.c
        public void h() {
        }

        @Override // uv.u.c
        public void i(final boolean clearPrevious, @NotNull final z settings) {
            Intrinsics.checkNotNullParameter(settings, "settings");
            qv.c.d(this.b.writerQueue, this.b.getConnectionName() + " applyAndAckSettings", 0L, false, new Function0() { // from class: uv.r
                @Override // p001kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return o.d.y(this.f34056a, clearPrevious, settings);
                }
            }, 6, null);
        }

        @Override // p001kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() throws Throwable {
            w();
            return Unit.f21506a;
        }

        @Override // uv.u.c
        public void j(int lastGoodStreamId, @NotNull b errorCode, @NotNull ew.h debugData) {
            int i10;
            Object[] array;
            Intrinsics.checkNotNullParameter(errorCode, "errorCode");
            Intrinsics.checkNotNullParameter(debugData, "debugData");
            debugData.I();
            o oVar = this.b;
            synchronized (oVar) {
                array = oVar.h0().values().toArray(new v[0]);
                oVar.isShutdown = true;
                Unit unit = Unit.f21506a;
            }
            for (v vVar : (v[]) array) {
                if (vVar.getId() > lastGoodStreamId && vVar.v()) {
                    vVar.B(b.REFUSED_STREAM);
                    this.b.O0(vVar.getId());
                }
            }
        }

        @Override // uv.u.c
        public void k(boolean inFinished, int streamId, @NotNull ew.g source, int length) {
            Intrinsics.checkNotNullParameter(source, "source");
            if (this.b.M0(streamId)) {
                this.b.z0(streamId, source, length, inFinished);
                return;
            }
            v vVarF0 = this.b.f0(streamId);
            if (vVarF0 == null) {
                this.b.e1(streamId, b.PROTOCOL_ERROR);
                long j10 = length;
                this.b.W0(j10);
                source.skip(j10);
                return;
            }
            vVarF0.z(source, length);
            if (inFinished) {
                vVarF0.A(mv.y.f24791c, true);
            }
        }

        @Override // uv.u.c
        public void l(boolean ack, final int payload1, final int payload2) {
            if (!ack) {
                qv.c cVar = this.b.writerQueue;
                String str = this.b.getConnectionName() + " ping";
                final o oVar = this.b;
                qv.c.d(cVar, str, 0L, false, new Function0() { // from class: uv.p
                    @Override // p001kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return o.d.x(oVar, payload1, payload2);
                    }
                }, 6, null);
                return;
            }
            o oVar2 = this.b;
            synchronized (oVar2) {
                try {
                    if (payload1 == 1) {
                        oVar2.intervalPongsReceived++;
                    } else if (payload1 != 2) {
                        if (payload1 == 3) {
                            oVar2.awaitPongsReceived++;
                            Intrinsics.d(oVar2, "null cannot be cast to non-null type java.lang.Object");
                            oVar2.notifyAll();
                        }
                        Unit unit = Unit.f21506a;
                    } else {
                        oVar2.degradedPongsReceived++;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // uv.u.c
        public void m(int streamId, int streamDependency, int weight, boolean exclusive) {
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v25 */
        /* JADX WARN: Type inference failed for: r0v3 */
        /* JADX WARN: Type inference failed for: r0v4, types: [T, uv.z] */
        public final void t(boolean clearPrevious, @NotNull z settings) {
            ?? r10;
            long jC;
            int i10;
            v[] vVarArr;
            z settings2 = settings;
            Intrinsics.checkNotNullParameter(settings2, "settings");
            final c0 c0Var = new c0();
            w writer = this.b.getWriter();
            final o oVar = this.b;
            synchronized (writer) {
                synchronized (oVar) {
                    try {
                        z peerSettings = oVar.getPeerSettings();
                        if (clearPrevious) {
                            r10 = settings2;
                        } else {
                            z zVar = new z();
                            zVar.g(peerSettings);
                            zVar.g(settings2);
                            r10 = zVar;
                        }
                        c0Var.f21575a = r10;
                        jC = ((long) r10.c()) - ((long) peerSettings.c());
                        vVarArr = (jC == 0 || oVar.h0().isEmpty()) ? null : (v[]) oVar.h0().values().toArray(new v[0]);
                        oVar.S0((z) c0Var.f21575a);
                        qv.c.d(oVar.settingsListenerQueue, oVar.getConnectionName() + " onSettings", 0L, false, new Function0() { // from class: uv.s
                            @Override // p001kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return o.d.u(oVar, c0Var);
                            }
                        }, 6, null);
                        Unit unit = Unit.f21506a;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                try {
                    oVar.getWriter().a((z) c0Var.f21575a);
                } catch (IOException e10) {
                    oVar.N(e10);
                }
                Unit unit2 = Unit.f21506a;
            }
            if (vVarArr != null) {
                for (v vVar : vVarArr) {
                    synchronized (vVar) {
                        vVar.d(jC);
                        Unit unit3 = Unit.f21506a;
                    }
                }
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v0, types: [uv.b] */
        /* JADX WARN: Type inference failed for: r0v3 */
        /* JADX WARN: Type inference failed for: r0v5, types: [java.io.Closeable, uv.u] */
        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        public void w() throws Throwable {
            b bVar;
            b bVar2 = b.INTERNAL_ERROR;
            IOException e10 = null;
            try {
                try {
                    this.reader.c(this);
                    while (this.reader.b(false, this)) {
                    }
                    b bVar3 = b.NO_ERROR;
                    try {
                        this.b.L(bVar3, b.CANCEL, null);
                        bVar = bVar3;
                    } catch (IOException e11) {
                        e10 = e11;
                        b bVar4 = b.PROTOCOL_ERROR;
                        o oVar = this.b;
                        oVar.L(bVar4, bVar4, e10);
                        bVar = oVar;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    this.b.L(bVar, bVar2, e10);
                    nv.n.f(this.reader);
                    throw th;
                }
            } catch (IOException e12) {
                e10 = e12;
            } catch (Throwable th3) {
                th = th3;
                bVar = bVar2;
                this.b.L(bVar, bVar2, e10);
                nv.n.f(this.reader);
                throw th;
            }
            bVar2 = this.reader;
            nv.n.f(bVar2);
        }
    }

    static {
        z zVar = new z();
        zVar.h(4, 65535);
        zVar.h(5, 16384);
        D = zVar;
    }

    public o(@NotNull a builder) {
        Intrinsics.checkNotNullParameter(builder, "builder");
        boolean client = builder.getClient();
        this.client = client;
        this.listener = builder.getListener();
        this.streams = new LinkedHashMap();
        String strD = builder.d();
        this.connectionName = strD;
        this.nextStreamId = builder.getClient() ? 3 : 2;
        qv.d taskRunner = builder.getTaskRunner();
        this.taskRunner = taskRunner;
        qv.c cVarK = taskRunner.k();
        this.writerQueue = cVarK;
        this.pushQueue = taskRunner.k();
        this.settingsListenerQueue = taskRunner.k();
        this.pushObserver = builder.getPushObserver();
        this.flowControlListener = builder.getFlowControlListener();
        z zVar = new z();
        if (builder.getClient()) {
            zVar.h(4, 16777216);
        }
        this.okHttpSettings = zVar;
        this.peerSettings = D;
        this.readBytes = new WindowCounter(0);
        this.writeBytesMaximum = this.peerSettings.c();
        rv.a aVarI = builder.i();
        this.socket = aVarI;
        this.writer = new w(aVarI.getSink(), client);
        this.readerRunnable = new d(this, new u(aVarI.getCom.appsflyer.sdk_base.referrer.Payload.SOURCE java.lang.String(), client));
        this.currentPushRequests = new LinkedHashSet();
        if (builder.getPingIntervalMillis() != 0) {
            final long nanos = TimeUnit.MILLISECONDS.toNanos(builder.getPingIntervalMillis());
            cVarK.k(strD + " ping", nanos, new Function0() { // from class: uv.g
                @Override // p001kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Long.valueOf(o.k(this.f34002a, nanos));
                }
            });
        }
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0014 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013 A[Catch: IOException -> 0x0024, TRY_LEAVE, TryCatch #1 {IOException -> 0x0024, blocks: (B:4:0x0008, B:7:0x0013, B:9:0x001f, B:12:0x0022, B:13:0x0023, B:8:0x0014), top: B:19:0x0008, inners: #0 }] */
    public static final Unit A0(o oVar, int i10, List list, boolean z10) {
        boolean zC = oVar.pushObserver.c(i10, list, z10);
        if (zC) {
            try {
                oVar.writer.n(i10, b.CANCEL);
                if (zC || z10) {
                    synchronized (oVar) {
                        oVar.currentPushRequests.remove(Integer.valueOf(i10));
                        Unit unit = Unit.f21506a;
                    }
                }
            } catch (IOException unused) {
            }
        } else if (zC) {
            synchronized (oVar) {
                oVar.currentPushRequests.remove(Integer.valueOf(i10));
                Unit unit2 = Unit.f21506a;
            }
        } else {
            synchronized (oVar) {
                oVar.currentPushRequests.remove(Integer.valueOf(i10));
                Unit unit3 = Unit.f21506a;
            }
        }
        return Unit.f21506a;
    }

    public static final Unit F0(o oVar, int i10, List list) {
        if (oVar.pushObserver.b(i10, list)) {
            try {
                oVar.writer.n(i10, b.CANCEL);
                synchronized (oVar) {
                    oVar.currentPushRequests.remove(Integer.valueOf(i10));
                    Unit unit = Unit.f21506a;
                }
            } catch (IOException unused) {
            }
        }
        return Unit.f21506a;
    }

    public static final Unit I0(o oVar, int i10, b bVar) {
        oVar.pushObserver.a(i10, bVar);
        synchronized (oVar) {
            oVar.currentPushRequests.remove(Integer.valueOf(i10));
        }
        return Unit.f21506a;
    }

    public static final Unit P0(o oVar) {
        oVar.Z0(false, 2, 0);
        return Unit.f21506a;
    }

    public static /* synthetic */ void V0(o oVar, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        oVar.U0(z10);
    }

    public static final Unit c1(o oVar, int i10, b bVar) {
        try {
            oVar.a1(i10, bVar);
        } catch (IOException e10) {
            oVar.N(e10);
        }
        return Unit.f21506a;
    }

    public static final Unit f1(o oVar, int i10, long j10) {
        try {
            oVar.writer.p(i10, j10);
        } catch (IOException e10) {
            oVar.N(e10);
        }
        return Unit.f21506a;
    }

    public static final long k(o oVar, long j10) {
        boolean z10;
        synchronized (oVar) {
            long j11 = oVar.intervalPongsReceived;
            long j12 = oVar.intervalPingsSent;
            if (j11 < j12) {
                z10 = true;
            } else {
                oVar.intervalPingsSent = j12 + 1;
                z10 = false;
            }
        }
        if (z10) {
            oVar.N(null);
            return -1L;
        }
        oVar.Z0(false, 1, 0);
        return j10;
    }

    public static final Unit x0(o oVar, int i10, ew.e eVar, int i11, boolean z10) {
        try {
            boolean zD = oVar.pushObserver.d(i10, eVar, i11, z10);
            if (zD) {
                oVar.writer.n(i10, b.CANCEL);
            }
            if (zD || z10) {
                synchronized (oVar) {
                    oVar.currentPushRequests.remove(Integer.valueOf(i10));
                    Unit unit = Unit.f21506a;
                }
            }
        } catch (IOException unused) {
        }
        return Unit.f21506a;
    }

    public final void E0(final int streamId, @NotNull final List<uv.d> requestHeaders, final boolean inFinished) {
        Intrinsics.checkNotNullParameter(requestHeaders, "requestHeaders");
        qv.c.d(this.pushQueue, this.connectionName + '[' + streamId + "] onHeaders", 0L, false, new Function0() { // from class: uv.n
            @Override // p001kotlin.jvm.functions.Function0
            public final Object invoke() {
                return o.A0(this.f34016a, streamId, requestHeaders, inFinished);
            }
        }, 6, null);
    }

    public final void G0(final int streamId, @NotNull final List<uv.d> requestHeaders) {
        Intrinsics.checkNotNullParameter(requestHeaders, "requestHeaders");
        synchronized (this) {
            if (this.currentPushRequests.contains(Integer.valueOf(streamId))) {
                e1(streamId, b.PROTOCOL_ERROR);
                return;
            }
            this.currentPushRequests.add(Integer.valueOf(streamId));
            qv.c.d(this.pushQueue, this.connectionName + '[' + streamId + "] onRequest", 0L, false, new Function0() { // from class: uv.l
                @Override // p001kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return o.F0(this.f34012a, streamId, requestHeaders);
                }
            }, 6, null);
        }
    }

    public final void K0(final int streamId, @NotNull final b errorCode) {
        Intrinsics.checkNotNullParameter(errorCode, "errorCode");
        qv.c.d(this.pushQueue, this.connectionName + '[' + streamId + "] onReset", 0L, false, new Function0() { // from class: uv.m
            @Override // p001kotlin.jvm.functions.Function0
            public final Object invoke() {
                return o.I0(this.f34014a, streamId, errorCode);
            }
        }, 6, null);
    }

    public final void L(@NotNull b connectionCode, @NotNull b streamCode, @Nullable IOException cause) {
        int i10;
        Object[] array;
        Intrinsics.checkNotNullParameter(connectionCode, "connectionCode");
        Intrinsics.checkNotNullParameter(streamCode, "streamCode");
        if (nv.q.b && Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + this);
        }
        try {
            T0(connectionCode);
        } catch (IOException unused) {
        }
        synchronized (this) {
            try {
                if (this.streams.isEmpty()) {
                    array = null;
                } else {
                    array = this.streams.values().toArray(new v[0]);
                    this.streams.clear();
                }
                Unit unit = Unit.f21506a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        v[] vVarArr = (v[]) array;
        if (vVarArr != null) {
            for (v vVar : vVarArr) {
                try {
                    vVar.g(streamCode, cause);
                } catch (IOException unused2) {
                }
            }
        }
        try {
            this.writer.close();
        } catch (IOException unused3) {
        }
        try {
            this.socket.cancel();
        } catch (IOException unused4) {
        }
        this.writerQueue.q();
        this.pushQueue.q();
        this.settingsListenerQueue.q();
    }

    public final boolean M0(int streamId) {
        return streamId != 0 && (streamId & 1) == 0;
    }

    public final void N(IOException e10) {
        b bVar = b.PROTOCOL_ERROR;
        L(bVar, bVar, e10);
    }

    /* JADX INFO: renamed from: O, reason: from getter */
    public final boolean getClient() {
        return this.client;
    }

    @Nullable
    public final v O0(int streamId) {
        v vVarRemove;
        synchronized (this) {
            vVarRemove = this.streams.remove(Integer.valueOf(streamId));
            Intrinsics.d(this, "null cannot be cast to non-null type java.lang.Object");
            notifyAll();
        }
        return vVarRemove;
    }

    @NotNull
    /* JADX INFO: renamed from: Q, reason: from getter */
    public final String getConnectionName() {
        return this.connectionName;
    }

    public final void Q0() {
        synchronized (this) {
            long j10 = this.degradedPongsReceived;
            long j11 = this.degradedPingsSent;
            if (j10 < j11) {
                return;
            }
            this.degradedPingsSent = j11 + 1;
            this.degradedPongDeadlineNs = System.nanoTime() + ((long) 1000000000);
            Unit unit = Unit.f21506a;
            qv.c.d(this.writerQueue, this.connectionName + " ping", 0L, false, new Function0() { // from class: uv.i
                @Override // p001kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return o.P0(this.f34005a);
                }
            }, 6, null);
        }
    }

    public final void R0(int i10) {
        this.lastGoodStreamId = i10;
    }

    public final void S0(@NotNull z zVar) {
        Intrinsics.checkNotNullParameter(zVar, "<set-?>");
        this.peerSettings = zVar;
    }

    @NotNull
    /* JADX INFO: renamed from: T, reason: from getter */
    public final uv.c getFlowControlListener() {
        return this.flowControlListener;
    }

    public final void T0(@NotNull b statusCode) {
        Intrinsics.checkNotNullParameter(statusCode, "statusCode");
        synchronized (this.writer) {
            synchronized (this) {
                if (this.isShutdown) {
                    return;
                }
                this.isShutdown = true;
                int i10 = this.lastGoodStreamId;
                Unit unit = Unit.f21506a;
                this.writer.f(i10, statusCode, nv.n.f26636a);
            }
        }
    }

    public final void U0(boolean sendConnectionPreface) {
        if (sendConnectionPreface) {
            this.writer.b();
            this.writer.o(this.okHttpSettings);
            int iC = this.okHttpSettings.c();
            if (iC != 65535) {
                this.writer.p(0, iC - 65535);
            }
        }
        qv.c.d(this.taskRunner.k(), this.connectionName, 0L, false, this.readerRunnable, 6, null);
    }

    public final void W0(long read) {
        synchronized (this) {
            try {
                WindowCounter.c(this.readBytes, read, 0L, 2, null);
                long jA = this.readBytes.a();
                if (jA >= this.okHttpSettings.c() / 2) {
                    g1(0, jA);
                    WindowCounter.c(this.readBytes, 0L, jA, 1, null);
                }
                this.flowControlListener.b(this.readBytes);
                Unit unit = Unit.f21506a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void X0(int streamId, boolean outFinished, @Nullable ew.e buffer, long byteCount) {
        long j10;
        long j11;
        int iMin;
        long j12;
        if (byteCount == 0) {
            this.writer.c(outFinished, streamId, buffer, 0);
            return;
        }
        while (byteCount > 0) {
            synchronized (this) {
                while (true) {
                    try {
                        try {
                            j10 = this.writeBytesTotal;
                            j11 = this.writeBytesMaximum;
                            if (j10 >= j11) {
                                if (!this.streams.containsKey(Integer.valueOf(streamId))) {
                                    throw new IOException("stream closed");
                                }
                                Intrinsics.d(this, "null cannot be cast to non-null type java.lang.Object");
                                wait();
                            }
                        } catch (InterruptedException unused) {
                            Thread.currentThread().interrupt();
                            throw new InterruptedIOException();
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                    throw th2;
                }
                iMin = Math.min((int) Math.min(byteCount, j11 - j10), this.writer.getMaxFrameSize());
                j12 = iMin;
                this.writeBytesTotal += j12;
                Unit unit = Unit.f21506a;
            }
            byteCount -= j12;
            this.writer.c(outFinished && byteCount == 0, streamId, buffer, iMin);
        }
    }

    /* JADX INFO: renamed from: Y, reason: from getter */
    public final int getLastGoodStreamId() {
        return this.lastGoodStreamId;
    }

    public final void Y0(int streamId, boolean outFinished, @NotNull List<uv.d> alternating) {
        Intrinsics.checkNotNullParameter(alternating, "alternating");
        this.writer.g(outFinished, streamId, alternating);
    }

    public final void Z0(boolean reply, int payload1, int payload2) {
        try {
            this.writer.k(reply, payload1, payload2);
        } catch (IOException e10) {
            N(e10);
        }
    }

    public final void a1(int streamId, @NotNull b statusCode) {
        Intrinsics.checkNotNullParameter(statusCode, "statusCode");
        this.writer.n(streamId, statusCode);
    }

    @NotNull
    /* JADX INFO: renamed from: b0, reason: from getter */
    public final c getListener() {
        return this.listener;
    }

    /* JADX INFO: renamed from: c0, reason: from getter */
    public final int getNextStreamId() {
        return this.nextStreamId;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        L(b.NO_ERROR, b.CANCEL, null);
    }

    @NotNull
    /* JADX INFO: renamed from: d0, reason: from getter */
    public final z getOkHttpSettings() {
        return this.okHttpSettings;
    }

    @NotNull
    /* JADX INFO: renamed from: e0, reason: from getter */
    public final z getPeerSettings() {
        return this.peerSettings;
    }

    public final void e1(final int streamId, @NotNull final b errorCode) {
        Intrinsics.checkNotNullParameter(errorCode, "errorCode");
        qv.c.d(this.writerQueue, this.connectionName + '[' + streamId + "] writeSynReset", 0L, false, new Function0() { // from class: uv.j
            @Override // p001kotlin.jvm.functions.Function0
            public final Object invoke() {
                return o.c1(this.f34006a, streamId, errorCode);
            }
        }, 6, null);
    }

    @Nullable
    public final v f0(int id2) {
        v vVar;
        synchronized (this) {
            vVar = this.streams.get(Integer.valueOf(id2));
        }
        return vVar;
    }

    public final void flush() {
        this.writer.flush();
    }

    public final void g1(final int streamId, final long unacknowledgedBytesRead) {
        qv.c.d(this.writerQueue, this.connectionName + '[' + streamId + "] windowUpdate", 0L, false, new Function0() { // from class: uv.h
            @Override // p001kotlin.jvm.functions.Function0
            public final Object invoke() {
                return o.f1(this.f34003a, streamId, unacknowledgedBytesRead);
            }
        }, 6, null);
    }

    @NotNull
    public final Map<Integer, v> h0() {
        return this.streams;
    }

    /* JADX INFO: renamed from: i0, reason: from getter */
    public final long getWriteBytesMaximum() {
        return this.writeBytesMaximum;
    }

    @NotNull
    /* JADX INFO: renamed from: k0, reason: from getter */
    public final w getWriter() {
        return this.writer;
    }

    public final boolean n0(long nowNs) {
        synchronized (this) {
            if (this.isShutdown) {
                return false;
            }
            return this.degradedPongsReceived >= this.degradedPingsSent || nowNs < this.degradedPongDeadlineNs;
        }
    }

    public final v s0(int associatedStreamId, List<uv.d> requestHeaders, boolean out) throws Throwable {
        Throwable th2;
        boolean z10 = !out;
        synchronized (this.writer) {
            try {
                try {
                    synchronized (this) {
                        try {
                            if (this.nextStreamId > 1073741823) {
                                try {
                                    T0(b.REFUSED_STREAM);
                                } catch (Throwable th3) {
                                    th2 = th3;
                                }
                            }
                            try {
                                if (this.isShutdown) {
                                    throw new uv.a();
                                }
                                int i10 = this.nextStreamId;
                                this.nextStreamId = i10 + 2;
                                v vVar = new v(i10, this, z10, false, null);
                                boolean z11 = !out || this.writeBytesTotal >= this.writeBytesMaximum || vVar.getWriteBytesTotal() >= vVar.getWriteBytesMaximum();
                                if (vVar.w()) {
                                    this.streams.put(Integer.valueOf(i10), vVar);
                                }
                                Unit unit = Unit.f21506a;
                                if (associatedStreamId == 0) {
                                    this.writer.g(z10, i10, requestHeaders);
                                } else {
                                    if (this.client) {
                                        throw new IllegalArgumentException("client streams shouldn't have associated stream IDs");
                                    }
                                    this.writer.m(associatedStreamId, i10, requestHeaders);
                                }
                                if (z11) {
                                    this.writer.flush();
                                }
                                return vVar;
                            } catch (Throwable th4) {
                                th = th4;
                            }
                        } catch (Throwable th5) {
                            th = th5;
                        }
                        th2 = th;
                        throw th2;
                    }
                } catch (Throwable th6) {
                    th = th6;
                    throw th;
                }
            } catch (Throwable th7) {
                th = th7;
                throw th;
            }
        }
    }

    @NotNull
    public final v w0(@NotNull List<uv.d> requestHeaders, boolean out) {
        Intrinsics.checkNotNullParameter(requestHeaders, "requestHeaders");
        return s0(0, requestHeaders, out);
    }

    public final void z0(final int streamId, @NotNull ew.g source, final int byteCount, final boolean inFinished) {
        Intrinsics.checkNotNullParameter(source, "source");
        final ew.e eVar = new ew.e();
        long j10 = byteCount;
        source.w1(j10);
        source.f3(eVar, j10);
        qv.c.d(this.pushQueue, this.connectionName + '[' + streamId + "] onData", 0L, false, new Function0() { // from class: uv.k
            @Override // p001kotlin.jvm.functions.Function0
            public final Object invoke() {
                return o.x0(this.f34008a, streamId, eVar, byteCount, inFinished);
            }
        }, 6, null);
    }
}
