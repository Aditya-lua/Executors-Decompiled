.class public final Luv/o;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Closeable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Luv/o$a;,
        Luv/o$b;,
        Luv/o$c;,
        Luv/o$d;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u00c8\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0007\n\u0002\u0010\t\n\u0002\u0008\t\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008%\n\u0002\u0018\u0002\n\u0002\u0008\t\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010%\n\u0002\u0008\u0005\n\u0002\u0010\u000e\n\u0002\u0008\u0011\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0010\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\n\n\u0002\u0018\u0002\n\u0002\u0008\r\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010#\n\u0002\u0008\u0005\u0018\u0000 \u00ca\u00012\u00020\u00012\u00020\u0002:\u0004Uga[B\u0011\u0008\u0000\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J-\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0008\u001a\u00020\u00072\u000c\u0010\u000b\u001a\u0008\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\r\u001a\u00020\u000cH\u0002\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\u0019\u0010\u0014\u001a\u00020\u00132\u0008\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0002\u00a2\u0006\u0004\u0008\u0014\u0010\u0015J\u0017\u0010\u0017\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0016\u001a\u00020\u0007\u00a2\u0006\u0004\u0008\u0017\u0010\u0018J\u0019\u0010\u001a\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0019\u001a\u00020\u0007H\u0000\u00a2\u0006\u0004\u0008\u001a\u0010\u0018J\u0017\u0010\u001d\u001a\u00020\u00132\u0006\u0010\u001c\u001a\u00020\u001bH\u0000\u00a2\u0006\u0004\u0008\u001d\u0010\u001eJ#\u0010\u001f\u001a\u00020\u000e2\u000c\u0010\u000b\u001a\u0008\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\r\u001a\u00020\u000c\u00a2\u0006\u0004\u0008\u001f\u0010 J-\u0010#\u001a\u00020\u00132\u0006\u0010\u0019\u001a\u00020\u00072\u0006\u0010!\u001a\u00020\u000c2\u000c\u0010\"\u001a\u0008\u0012\u0004\u0012\u00020\n0\tH\u0000\u00a2\u0006\u0004\u0008#\u0010$J/\u0010(\u001a\u00020\u00132\u0006\u0010\u0019\u001a\u00020\u00072\u0006\u0010!\u001a\u00020\u000c2\u0008\u0010&\u001a\u0004\u0018\u00010%2\u0006\u0010\'\u001a\u00020\u001b\u00a2\u0006\u0004\u0008(\u0010)J\u001f\u0010,\u001a\u00020\u00132\u0006\u0010\u0019\u001a\u00020\u00072\u0006\u0010+\u001a\u00020*H\u0000\u00a2\u0006\u0004\u0008,\u0010-J\u001f\u0010/\u001a\u00020\u00132\u0006\u0010\u0019\u001a\u00020\u00072\u0006\u0010.\u001a\u00020*H\u0000\u00a2\u0006\u0004\u0008/\u0010-J\u001f\u00101\u001a\u00020\u00132\u0006\u0010\u0019\u001a\u00020\u00072\u0006\u00100\u001a\u00020\u001bH\u0000\u00a2\u0006\u0004\u00081\u00102J%\u00106\u001a\u00020\u00132\u0006\u00103\u001a\u00020\u000c2\u0006\u00104\u001a\u00020\u00072\u0006\u00105\u001a\u00020\u0007\u00a2\u0006\u0004\u00086\u00107J\r\u00108\u001a\u00020\u0013\u00a2\u0006\u0004\u00088\u00109J\u0015\u0010:\u001a\u00020\u00132\u0006\u0010.\u001a\u00020*\u00a2\u0006\u0004\u0008:\u0010;J\u000f\u0010<\u001a\u00020\u0013H\u0016\u00a2\u0006\u0004\u0008<\u00109J)\u0010@\u001a\u00020\u00132\u0006\u0010=\u001a\u00020*2\u0006\u0010>\u001a\u00020*2\u0008\u0010?\u001a\u0004\u0018\u00010\u0011H\u0000\u00a2\u0006\u0004\u0008@\u0010AJ\u0019\u0010C\u001a\u00020\u00132\u0008\u0008\u0002\u0010B\u001a\u00020\u000cH\u0007\u00a2\u0006\u0004\u0008C\u0010DJ\u0015\u0010F\u001a\u00020\u000c2\u0006\u0010E\u001a\u00020\u001b\u00a2\u0006\u0004\u0008F\u0010GJ\u000f\u0010H\u001a\u00020\u0013H\u0000\u00a2\u0006\u0004\u0008H\u00109J\u0017\u0010I\u001a\u00020\u000c2\u0006\u0010\u0019\u001a\u00020\u0007H\u0000\u00a2\u0006\u0004\u0008I\u0010JJ%\u0010K\u001a\u00020\u00132\u0006\u0010\u0019\u001a\u00020\u00072\u000c\u0010\u000b\u001a\u0008\u0012\u0004\u0012\u00020\n0\tH\u0000\u00a2\u0006\u0004\u0008K\u0010LJ-\u0010N\u001a\u00020\u00132\u0006\u0010\u0019\u001a\u00020\u00072\u000c\u0010\u000b\u001a\u0008\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010M\u001a\u00020\u000cH\u0000\u00a2\u0006\u0004\u0008N\u0010OJ/\u0010R\u001a\u00020\u00132\u0006\u0010\u0019\u001a\u00020\u00072\u0006\u0010Q\u001a\u00020P2\u0006\u0010\'\u001a\u00020\u00072\u0006\u0010M\u001a\u00020\u000cH\u0000\u00a2\u0006\u0004\u0008R\u0010SJ\u001f\u0010T\u001a\u00020\u00132\u0006\u0010\u0019\u001a\u00020\u00072\u0006\u0010+\u001a\u00020*H\u0000\u00a2\u0006\u0004\u0008T\u0010-R\u001a\u0010Y\u001a\u00020\u000c8\u0000X\u0080\u0004\u00a2\u0006\u000c\n\u0004\u0008U\u0010V\u001a\u0004\u0008W\u0010XR\u001a\u0010_\u001a\u00020Z8\u0000X\u0080\u0004\u00a2\u0006\u000c\n\u0004\u0008[\u0010\\\u001a\u0004\u0008]\u0010^R&\u0010e\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u000e0`8\u0000X\u0080\u0004\u00a2\u0006\u000c\n\u0004\u0008a\u0010b\u001a\u0004\u0008c\u0010dR\u001a\u0010k\u001a\u00020f8\u0000X\u0080\u0004\u00a2\u0006\u000c\n\u0004\u0008g\u0010h\u001a\u0004\u0008i\u0010jR\"\u0010q\u001a\u00020\u00078\u0000@\u0000X\u0080\u000e\u00a2\u0006\u0012\n\u0004\u0008\u0012\u0010l\u001a\u0004\u0008m\u0010n\"\u0004\u0008o\u0010pR\"\u0010u\u001a\u00020\u00078\u0000@\u0000X\u0080\u000e\u00a2\u0006\u0012\n\u0004\u0008r\u0010l\u001a\u0004\u0008s\u0010n\"\u0004\u0008t\u0010pR\u0016\u0010w\u001a\u00020\u000c8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008v\u0010VR\u0014\u0010{\u001a\u00020x8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008y\u0010zR\u0014\u0010\u007f\u001a\u00020|8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008}\u0010~R\u0016\u0010\u0081\u0001\u001a\u00020|8\u0002X\u0082\u0004\u00a2\u0006\u0007\n\u0005\u0008\u0080\u0001\u0010~R\u0016\u0010\u0083\u0001\u001a\u00020|8\u0002X\u0082\u0004\u00a2\u0006\u0007\n\u0005\u0008\u0082\u0001\u0010~R\u0018\u0010\u0087\u0001\u001a\u00030\u0084\u00018\u0002X\u0082\u0004\u00a2\u0006\u0008\n\u0006\u0008\u0085\u0001\u0010\u0086\u0001R\u0019\u0010\u008a\u0001\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0008\n\u0006\u0008\u0088\u0001\u0010\u0089\u0001R\u0019\u0010\u008c\u0001\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0008\n\u0006\u0008\u008b\u0001\u0010\u0089\u0001R\u0019\u0010\u008e\u0001\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0008\n\u0006\u0008\u008d\u0001\u0010\u0089\u0001R\u0019\u0010\u0090\u0001\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0008\n\u0006\u0008\u008f\u0001\u0010\u0089\u0001R\u0019\u0010\u0092\u0001\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0008\n\u0006\u0008\u0091\u0001\u0010\u0089\u0001R\u0019\u0010\u0094\u0001\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0008\n\u0006\u0008\u0093\u0001\u0010\u0089\u0001R \u0010\u009a\u0001\u001a\u00030\u0095\u00018\u0000X\u0080\u0004\u00a2\u0006\u0010\n\u0006\u0008\u0096\u0001\u0010\u0097\u0001\u001a\u0006\u0008\u0098\u0001\u0010\u0099\u0001R\u001d\u0010\u00a0\u0001\u001a\u00030\u009b\u00018\u0006\u00a2\u0006\u0010\n\u0006\u0008\u009c\u0001\u0010\u009d\u0001\u001a\u0006\u0008\u009e\u0001\u0010\u009f\u0001R*\u0010\u00a5\u0001\u001a\u00030\u009b\u00018\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0018\n\u0006\u0008\u00a1\u0001\u0010\u009d\u0001\u001a\u0006\u0008\u00a2\u0001\u0010\u009f\u0001\"\u0006\u0008\u00a3\u0001\u0010\u00a4\u0001R\u001d\u0010\u00ab\u0001\u001a\u00030\u00a6\u00018\u0006\u00a2\u0006\u0010\n\u0006\u0008\u00a7\u0001\u0010\u00a8\u0001\u001a\u0006\u0008\u00a9\u0001\u0010\u00aa\u0001R*\u0010\u00b0\u0001\u001a\u00020\u001b2\u0007\u0010\u00ac\u0001\u001a\u00020\u001b8\u0006@BX\u0086\u000e\u00a2\u0006\u0010\n\u0006\u0008\u00ad\u0001\u0010\u0089\u0001\u001a\u0006\u0008\u00ae\u0001\u0010\u00af\u0001R*\u0010\u00b3\u0001\u001a\u00020\u001b2\u0007\u0010\u00ac\u0001\u001a\u00020\u001b8\u0006@BX\u0086\u000e\u00a2\u0006\u0010\n\u0006\u0008\u00b1\u0001\u0010\u0089\u0001\u001a\u0006\u0008\u00b2\u0001\u0010\u00af\u0001R \u0010\u00b9\u0001\u001a\u00030\u00b4\u00018\u0000X\u0080\u0004\u00a2\u0006\u0010\n\u0006\u0008\u00b5\u0001\u0010\u00b6\u0001\u001a\u0006\u0008\u00b7\u0001\u0010\u00b8\u0001R\u001d\u0010\u00bf\u0001\u001a\u00030\u00ba\u00018\u0006\u00a2\u0006\u0010\n\u0006\u0008\u00bb\u0001\u0010\u00bc\u0001\u001a\u0006\u0008\u00bd\u0001\u0010\u00be\u0001R!\u0010\u00c5\u0001\u001a\u00070\u00c0\u0001R\u00020\u00008\u0006\u00a2\u0006\u0010\n\u0006\u0008\u00c1\u0001\u0010\u00c2\u0001\u001a\u0006\u0008\u00c3\u0001\u0010\u00c4\u0001R\u001e\u0010\u00c9\u0001\u001a\t\u0012\u0004\u0012\u00020\u00070\u00c6\u00018\u0002X\u0082\u0004\u00a2\u0006\u0008\n\u0006\u0008\u00c7\u0001\u0010\u00c8\u0001\u00a8\u0006\u00cb\u0001"
    }
    d2 = {
        "Luv/o;",
        "Ljava/io/Closeable;",
        "",
        "Luv/o$a;",
        "builder",
        "<init>",
        "(Luv/o$a;)V",
        "",
        "associatedStreamId",
        "",
        "Luv/d;",
        "requestHeaders",
        "",
        "out",
        "Luv/v;",
        "s0",
        "(ILjava/util/List;Z)Luv/v;",
        "Ljava/io/IOException;",
        "e",
        "",
        "N",
        "(Ljava/io/IOException;)V",
        "id",
        "f0",
        "(I)Luv/v;",
        "streamId",
        "O0",
        "",
        "read",
        "W0",
        "(J)V",
        "w0",
        "(Ljava/util/List;Z)Luv/v;",
        "outFinished",
        "alternating",
        "Y0",
        "(IZLjava/util/List;)V",
        "Lew/e;",
        "buffer",
        "byteCount",
        "X0",
        "(IZLew/e;J)V",
        "Luv/b;",
        "errorCode",
        "e1",
        "(ILuv/b;)V",
        "statusCode",
        "a1",
        "unacknowledgedBytesRead",
        "g1",
        "(IJ)V",
        "reply",
        "payload1",
        "payload2",
        "Z0",
        "(ZII)V",
        "flush",
        "()V",
        "T0",
        "(Luv/b;)V",
        "close",
        "connectionCode",
        "streamCode",
        "cause",
        "L",
        "(Luv/b;Luv/b;Ljava/io/IOException;)V",
        "sendConnectionPreface",
        "U0",
        "(Z)V",
        "nowNs",
        "n0",
        "(J)Z",
        "Q0",
        "M0",
        "(I)Z",
        "G0",
        "(ILjava/util/List;)V",
        "inFinished",
        "E0",
        "(ILjava/util/List;Z)V",
        "Lew/g;",
        "source",
        "z0",
        "(ILew/g;IZ)V",
        "K0",
        "a",
        "Z",
        "O",
        "()Z",
        "client",
        "Luv/o$c;",
        "b",
        "Luv/o$c;",
        "b0",
        "()Luv/o$c;",
        "listener",
        "",
        "c",
        "Ljava/util/Map;",
        "h0",
        "()Ljava/util/Map;",
        "streams",
        "",
        "d",
        "Ljava/lang/String;",
        "Q",
        "()Ljava/lang/String;",
        "connectionName",
        "I",
        "Y",
        "()I",
        "R0",
        "(I)V",
        "lastGoodStreamId",
        "f",
        "c0",
        "setNextStreamId$okhttp",
        "nextStreamId",
        "g",
        "isShutdown",
        "Lqv/d;",
        "h",
        "Lqv/d;",
        "taskRunner",
        "Lqv/c;",
        "i",
        "Lqv/c;",
        "writerQueue",
        "j",
        "pushQueue",
        "k",
        "settingsListenerQueue",
        "Luv/y;",
        "l",
        "Luv/y;",
        "pushObserver",
        "m",
        "J",
        "intervalPingsSent",
        "n",
        "intervalPongsReceived",
        "o",
        "degradedPingsSent",
        "p",
        "degradedPongsReceived",
        "q",
        "awaitPongsReceived",
        "r",
        "degradedPongDeadlineNs",
        "Luv/c;",
        "s",
        "Luv/c;",
        "T",
        "()Luv/c;",
        "flowControlListener",
        "Luv/z;",
        "t",
        "Luv/z;",
        "d0",
        "()Luv/z;",
        "okHttpSettings",
        "u",
        "e0",
        "S0",
        "(Luv/z;)V",
        "peerSettings",
        "Lvv/a;",
        "v",
        "Lvv/a;",
        "getReadBytes",
        "()Lvv/a;",
        "readBytes",
        "value",
        "w",
        "getWriteBytesTotal",
        "()J",
        "writeBytesTotal",
        "x",
        "i0",
        "writeBytesMaximum",
        "Lrv/a;",
        "y",
        "Lrv/a;",
        "getSocket$okhttp",
        "()Lrv/a;",
        "socket",
        "Luv/w;",
        "z",
        "Luv/w;",
        "k0",
        "()Luv/w;",
        "writer",
        "Luv/o$d;",
        "A",
        "Luv/o$d;",
        "getReaderRunnable",
        "()Luv/o$d;",
        "readerRunnable",
        "",
        "B",
        "Ljava/util/Set;",
        "currentPushRequests",
        "C",
        "okhttp"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final C:Luv/o$b;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final D:Luv/z;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# instance fields
.field public final A:Luv/o$d;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final B:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final a:Z

.field public final b:Luv/o$c;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final c:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/Integer;",
            "Luv/v;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final d:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public e:I

.field public f:I

.field public g:Z

.field public final h:Lqv/d;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final i:Lqv/c;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final j:Lqv/c;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final k:Lqv/c;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final l:Luv/y;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public m:J

.field public n:J

.field public o:J

.field public p:J

.field public q:J

.field public r:J

.field public final s:Luv/c;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final t:Luv/z;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public u:Luv/z;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final v:Lvv/a;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public w:J

.field public x:J

.field public final y:Lrv/a;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final z:Luv/w;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Luv/o$b;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Luv/o$b;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Luv/o;->C:Luv/o$b;

    new-instance v0, Luv/z;

    invoke-direct {v0}, Luv/z;-><init>()V

    const/4 v1, 0x4

    const v2, 0xffff

    invoke-virtual {v0, v1, v2}, Luv/z;->h(II)Luv/z;

    const/4 v1, 0x5

    const/16 v2, 0x4000

    invoke-virtual {v0, v1, v2}, Luv/z;->h(II)Luv/z;

    sput-object v0, Luv/o;->D:Luv/z;

    return-void
.end method

.method public constructor <init>(Luv/o$a;)V
    .locals 6
    .param p1    # Luv/o$a;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "builder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p1}, Luv/o$a;->c()Z

    move-result v0

    iput-boolean v0, p0, Luv/o;->a:Z

    invoke-virtual {p1}, Luv/o$a;->f()Luv/o$c;

    move-result-object v1

    iput-object v1, p0, Luv/o;->b:Luv/o$c;

    new-instance v1, Ljava/util/LinkedHashMap;

    invoke-direct {v1}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object v1, p0, Luv/o;->c:Ljava/util/Map;

    invoke-virtual {p1}, Luv/o$a;->d()Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Luv/o;->d:Ljava/lang/String;

    invoke-virtual {p1}, Luv/o$a;->c()Z

    move-result v2

    if-eqz v2, :cond_0

    const/4 v2, 0x3

    goto :goto_0

    :cond_0
    const/4 v2, 0x2

    :goto_0
    iput v2, p0, Luv/o;->f:I

    invoke-virtual {p1}, Luv/o$a;->j()Lqv/d;

    move-result-object v2

    iput-object v2, p0, Luv/o;->h:Lqv/d;

    invoke-virtual {v2}, Lqv/d;->k()Lqv/c;

    move-result-object v3

    iput-object v3, p0, Luv/o;->i:Lqv/c;

    invoke-virtual {v2}, Lqv/d;->k()Lqv/c;

    move-result-object v4

    iput-object v4, p0, Luv/o;->j:Lqv/c;

    invoke-virtual {v2}, Lqv/d;->k()Lqv/c;

    move-result-object v2

    iput-object v2, p0, Luv/o;->k:Lqv/c;

    invoke-virtual {p1}, Luv/o$a;->h()Luv/y;

    move-result-object v2

    iput-object v2, p0, Luv/o;->l:Luv/y;

    invoke-virtual {p1}, Luv/o$a;->e()Luv/c;

    move-result-object v2

    iput-object v2, p0, Luv/o;->s:Luv/c;

    new-instance v2, Luv/z;

    invoke-direct {v2}, Luv/z;-><init>()V

    invoke-virtual {p1}, Luv/o$a;->c()Z

    move-result v4

    if-eqz v4, :cond_1

    const/4 v4, 0x4

    const/high16 v5, 0x1000000

    invoke-virtual {v2, v4, v5}, Luv/z;->h(II)Luv/z;

    :cond_1
    iput-object v2, p0, Luv/o;->t:Luv/z;

    sget-object v2, Luv/o;->D:Luv/z;

    iput-object v2, p0, Luv/o;->u:Luv/z;

    new-instance v2, Lvv/a;

    const/4 v4, 0x0

    invoke-direct {v2, v4}, Lvv/a;-><init>(I)V

    iput-object v2, p0, Luv/o;->v:Lvv/a;

    iget-object v2, p0, Luv/o;->u:Luv/z;

    invoke-virtual {v2}, Luv/z;->c()I

    move-result v2

    int-to-long v4, v2

    iput-wide v4, p0, Luv/o;->x:J

    invoke-virtual {p1}, Luv/o$a;->i()Lrv/a;

    move-result-object v2

    iput-object v2, p0, Luv/o;->y:Lrv/a;

    new-instance v4, Luv/w;

    invoke-interface {v2}, Lrv/a;->b()Lew/f;

    move-result-object v5

    invoke-direct {v4, v5, v0}, Luv/w;-><init>(Lew/f;Z)V

    iput-object v4, p0, Luv/o;->z:Luv/w;

    new-instance v4, Luv/o$d;

    new-instance v5, Luv/u;

    invoke-interface {v2}, Lrv/a;->a()Lew/g;

    move-result-object v2

    invoke-direct {v5, v2, v0}, Luv/u;-><init>(Lew/g;Z)V

    invoke-direct {v4, p0, v5}, Luv/o$d;-><init>(Luv/o;Luv/u;)V

    iput-object v4, p0, Luv/o;->A:Luv/o$d;

    new-instance v0, Ljava/util/LinkedHashSet;

    invoke-direct {v0}, Ljava/util/LinkedHashSet;-><init>()V

    iput-object v0, p0, Luv/o;->B:Ljava/util/Set;

    invoke-virtual {p1}, Luv/o$a;->g()I

    move-result v0

    if-eqz v0, :cond_2

    sget-object v0, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {p1}, Luv/o$a;->g()I

    move-result p1

    int-to-long v4, p1

    invoke-virtual {v0, v4, v5}, Ljava/util/concurrent/TimeUnit;->toNanos(J)J

    move-result-wide v4

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " ping"

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance v0, Luv/g;

    invoke-direct {v0, p0, v4, v5}, Luv/g;-><init>(Luv/o;J)V

    invoke-virtual {v3, p1, v4, v5, v0}, Lqv/c;->k(Ljava/lang/String;JLkotlin/jvm/functions/Function0;)V

    :cond_2
    return-void
.end method

.method public static final synthetic A(Luv/o;J)V
    .locals 0

    iput-wide p1, p0, Luv/o;->p:J

    return-void
.end method

.method public static final A0(Luv/o;ILjava/util/List;Z)Lkotlin/Unit;
    .locals 2

    iget-object v0, p0, Luv/o;->l:Luv/y;

    invoke-interface {v0, p1, p2, p3}, Luv/y;->c(ILjava/util/List;Z)Z

    move-result p2

    if-eqz p2, :cond_0

    :try_start_0
    iget-object v0, p0, Luv/o;->z:Luv/w;

    sget-object v1, Luv/b;->k:Luv/b;

    invoke-virtual {v0, p1, v1}, Luv/w;->n(ILuv/b;)V

    :cond_0
    if-nez p2, :cond_1

    if-eqz p3, :cond_2

    :cond_1
    monitor-enter p0
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    :try_start_1
    iget-object p2, p0, Luv/o;->B:Ljava/util/Set;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-interface {p2, p1}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    monitor-exit p0

    goto :goto_0

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0

    :catch_0
    :cond_2
    :goto_0
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method

.method public static final synthetic E(Luv/o;J)V
    .locals 0

    iput-wide p1, p0, Luv/o;->n:J

    return-void
.end method

.method public static final F0(Luv/o;ILjava/util/List;)Lkotlin/Unit;
    .locals 1

    iget-object v0, p0, Luv/o;->l:Luv/y;

    invoke-interface {v0, p1, p2}, Luv/y;->b(ILjava/util/List;)Z

    move-result p2

    if-eqz p2, :cond_0

    :try_start_0
    iget-object p2, p0, Luv/o;->z:Luv/w;

    sget-object v0, Luv/b;->k:Luv/b;

    invoke-virtual {p2, p1, v0}, Luv/w;->n(ILuv/b;)V

    monitor-enter p0
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    :try_start_1
    iget-object p2, p0, Luv/o;->B:Ljava/util/Set;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-interface {p2, p1}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    monitor-exit p0

    goto :goto_0

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0

    :catch_0
    :cond_0
    :goto_0
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method

.method public static final synthetic I(Luv/o;Z)V
    .locals 0

    iput-boolean p1, p0, Luv/o;->g:Z

    return-void
.end method

.method public static final I0(Luv/o;ILuv/b;)Lkotlin/Unit;
    .locals 1

    iget-object v0, p0, Luv/o;->l:Luv/y;

    invoke-interface {v0, p1, p2}, Luv/y;->a(ILuv/b;)V

    monitor-enter p0

    :try_start_0
    iget-object p2, p0, Luv/o;->B:Ljava/util/Set;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-interface {p2, p1}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public static final synthetic K(Luv/o;J)V
    .locals 0

    iput-wide p1, p0, Luv/o;->x:J

    return-void
.end method

.method public static final P0(Luv/o;)Lkotlin/Unit;
    .locals 2

    const/4 v0, 0x0

    const/4 v1, 0x2

    invoke-virtual {p0, v0, v1, v0}, Luv/o;->Z0(ZII)V

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method

.method public static synthetic V0(Luv/o;ZILjava/lang/Object;)V
    .locals 0

    const/4 p3, 0x1

    and-int/2addr p2, p3

    if-eqz p2, :cond_0

    move p1, p3

    :cond_0
    invoke-virtual {p0, p1}, Luv/o;->U0(Z)V

    return-void
.end method

.method public static synthetic a(Luv/o;ILjava/util/List;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2}, Luv/o;->F0(Luv/o;ILjava/util/List;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Luv/o;ILuv/b;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2}, Luv/o;->I0(Luv/o;ILuv/b;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Luv/o;IJ)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Luv/o;->f1(Luv/o;IJ)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static final c1(Luv/o;ILuv/b;)Lkotlin/Unit;
    .locals 0

    :try_start_0
    invoke-virtual {p0, p1, p2}, Luv/o;->a1(ILuv/b;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    invoke-virtual {p0, p1}, Luv/o;->N(Ljava/io/IOException;)V

    :goto_0
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method

.method public static synthetic d(Luv/o;ILew/e;IZ)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Luv/o;->x0(Luv/o;ILew/e;IZ)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Luv/o;J)J
    .locals 0

    invoke-static {p0, p1, p2}, Luv/o;->k(Luv/o;J)J

    move-result-wide p0

    return-wide p0
.end method

.method public static synthetic f(Luv/o;ILjava/util/List;Z)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Luv/o;->A0(Luv/o;ILjava/util/List;Z)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static final f1(Luv/o;IJ)Lkotlin/Unit;
    .locals 1

    :try_start_0
    iget-object v0, p0, Luv/o;->z:Luv/w;

    invoke-virtual {v0, p1, p2, p3}, Luv/w;->p(IJ)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    invoke-virtual {p0, p1}, Luv/o;->N(Ljava/io/IOException;)V

    :goto_0
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method

.method public static synthetic g(Luv/o;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0}, Luv/o;->P0(Luv/o;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic h(Luv/o;ILuv/b;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2}, Luv/o;->c1(Luv/o;ILuv/b;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static final k(Luv/o;J)J
    .locals 7

    monitor-enter p0

    :try_start_0
    iget-wide v0, p0, Luv/o;->n:J

    iget-wide v2, p0, Luv/o;->m:J

    cmp-long v0, v0, v2

    const/4 v1, 0x1

    const/4 v4, 0x0

    if-gez v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    const-wide/16 v5, 0x1

    add-long/2addr v2, v5

    iput-wide v2, p0, Luv/o;->m:J
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move v0, v4

    :goto_0
    monitor-exit p0

    if-eqz v0, :cond_1

    const/4 p1, 0x0

    invoke-virtual {p0, p1}, Luv/o;->N(Ljava/io/IOException;)V

    const-wide/16 p0, -0x1

    return-wide p0

    :cond_1
    invoke-virtual {p0, v4, v1, v4}, Luv/o;->Z0(ZII)V

    return-wide p1

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public static final synthetic m(Luv/o;Ljava/io/IOException;)V
    .locals 0

    invoke-virtual {p0, p1}, Luv/o;->N(Ljava/io/IOException;)V

    return-void
.end method

.method public static final synthetic n(Luv/o;)J
    .locals 2

    iget-wide v0, p0, Luv/o;->q:J

    return-wide v0
.end method

.method public static final synthetic o()Luv/z;
    .locals 1

    sget-object v0, Luv/o;->D:Luv/z;

    return-object v0
.end method

.method public static final synthetic p(Luv/o;)J
    .locals 2

    iget-wide v0, p0, Luv/o;->p:J

    return-wide v0
.end method

.method public static final synthetic r(Luv/o;)J
    .locals 2

    iget-wide v0, p0, Luv/o;->n:J

    return-wide v0
.end method

.method public static final synthetic s(Luv/o;)Lqv/c;
    .locals 0

    iget-object p0, p0, Luv/o;->k:Lqv/c;

    return-object p0
.end method

.method public static final synthetic u(Luv/o;)Lqv/d;
    .locals 0

    iget-object p0, p0, Luv/o;->h:Lqv/d;

    return-object p0
.end method

.method public static final synthetic w(Luv/o;)Lqv/c;
    .locals 0

    iget-object p0, p0, Luv/o;->i:Lqv/c;

    return-object p0
.end method

.method public static final x0(Luv/o;ILew/e;IZ)Lkotlin/Unit;
    .locals 1

    :try_start_0
    iget-object v0, p0, Luv/o;->l:Luv/y;

    invoke-interface {v0, p1, p2, p3, p4}, Luv/y;->d(ILew/g;IZ)Z

    move-result p2

    if-eqz p2, :cond_0

    iget-object p3, p0, Luv/o;->z:Luv/w;

    sget-object v0, Luv/b;->k:Luv/b;

    invoke-virtual {p3, p1, v0}, Luv/w;->n(ILuv/b;)V

    :cond_0
    if-nez p2, :cond_1

    if-eqz p4, :cond_2

    :cond_1
    monitor-enter p0
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    :try_start_1
    iget-object p2, p0, Luv/o;->B:Ljava/util/Set;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-interface {p2, p1}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    monitor-exit p0

    goto :goto_0

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0

    :catch_0
    :cond_2
    :goto_0
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method

.method public static final synthetic y(Luv/o;)Z
    .locals 0

    iget-boolean p0, p0, Luv/o;->g:Z

    return p0
.end method

.method public static final synthetic z(Luv/o;J)V
    .locals 0

    iput-wide p1, p0, Luv/o;->q:J

    return-void
.end method


# virtual methods
.method public final E0(ILjava/util/List;Z)V
    .locals 9
    .param p2    # Ljava/util/List;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/util/List<",
            "Luv/d;",
            ">;Z)V"
        }
    .end annotation

    const-string v0, "requestHeaders"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v1, p0, Luv/o;->j:Lqv/c;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, p0, Luv/o;->d:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v2, 0x5b

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, "] onHeaders"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    new-instance v6, Luv/n;

    invoke-direct {v6, p0, p1, p2, p3}, Luv/n;-><init>(Luv/o;ILjava/util/List;Z)V

    const/4 v7, 0x6

    const/4 v8, 0x0

    const-wide/16 v3, 0x0

    const/4 v5, 0x0

    invoke-static/range {v1 .. v8}, Lqv/c;->d(Lqv/c;Ljava/lang/String;JZLkotlin/jvm/functions/Function0;ILjava/lang/Object;)V

    return-void
.end method

.method public final G0(ILjava/util/List;)V
    .locals 10
    .param p2    # Ljava/util/List;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/util/List<",
            "Luv/d;",
            ">;)V"
        }
    .end annotation

    const-string v0, "requestHeaders"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Luv/o;->B:Ljava/util/Set;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object p2, Luv/b;->d:Luv/b;

    invoke-virtual {p0, p1, p2}, Luv/o;->e1(ILuv/b;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    move-object p1, v0

    goto :goto_0

    :cond_0
    :try_start_1
    iget-object v0, p0, Luv/o;->B:Ljava/util/Set;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit p0

    iget-object v2, p0, Luv/o;->j:Lqv/c;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Luv/o;->d:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x5b

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, "] onRequest"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    new-instance v7, Luv/l;

    invoke-direct {v7, p0, p1, p2}, Luv/l;-><init>(Luv/o;ILjava/util/List;)V

    const/4 v8, 0x6

    const/4 v9, 0x0

    const-wide/16 v4, 0x0

    const/4 v6, 0x0

    invoke-static/range {v2 .. v9}, Lqv/c;->d(Lqv/c;Ljava/lang/String;JZLkotlin/jvm/functions/Function0;ILjava/lang/Object;)V

    return-void

    :goto_0
    monitor-exit p0

    throw p1
.end method

.method public final K0(ILuv/b;)V
    .locals 9
    .param p2    # Luv/b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "errorCode"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v1, p0, Luv/o;->j:Lqv/c;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, p0, Luv/o;->d:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v2, 0x5b

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, "] onReset"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    new-instance v6, Luv/m;

    invoke-direct {v6, p0, p1, p2}, Luv/m;-><init>(Luv/o;ILuv/b;)V

    const/4 v7, 0x6

    const/4 v8, 0x0

    const-wide/16 v3, 0x0

    const/4 v5, 0x0

    invoke-static/range {v1 .. v8}, Lqv/c;->d(Lqv/c;Ljava/lang/String;JZLkotlin/jvm/functions/Function0;ILjava/lang/Object;)V

    return-void
.end method

.method public final L(Luv/b;Luv/b;Ljava/io/IOException;)V
    .locals 3
    .param p1    # Luv/b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Luv/b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Ljava/io/IOException;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    const-string v0, "connectionCode"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "streamCode"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    sget-boolean v0, Lnv/q;->b:Z

    if-eqz v0, :cond_1

    invoke-static {p0}, Ljava/lang/Thread;->holdsLock(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/AssertionError;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string p3, "Thread "

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object p3

    invoke-virtual {p3}, Ljava/lang/Thread;->getName()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p3, " MUST NOT hold lock on "

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw p1

    :cond_1
    :goto_0
    :try_start_0
    invoke-virtual {p0, p1}, Luv/o;->T0(Luv/b;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    monitor-enter p0

    :try_start_1
    iget-object p1, p0, Luv/o;->c:Ljava/util/Map;

    invoke-interface {p1}, Ljava/util/Map;->isEmpty()Z

    move-result p1

    const/4 v0, 0x0

    if-nez p1, :cond_2

    iget-object p1, p0, Luv/o;->c:Ljava/util/Map;

    invoke-interface {p1}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object p1

    new-array v1, v0, [Luv/v;

    invoke-interface {p1, v1}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p1

    iget-object v1, p0, Luv/o;->c:Ljava/util/Map;

    invoke-interface {v1}, Ljava/util/Map;->clear()V

    goto :goto_1

    :catchall_0
    move-exception p1

    goto :goto_3

    :cond_2
    const/4 p1, 0x0

    :goto_1
    sget-object v1, Lkotlin/Unit;->a:Lkotlin/Unit;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit p0

    check-cast p1, [Luv/v;

    if-eqz p1, :cond_3

    array-length v1, p1

    :goto_2
    if-ge v0, v1, :cond_3

    aget-object v2, p1, v0

    :try_start_2
    invoke-virtual {v2, p2, p3}, Luv/v;->g(Luv/b;Ljava/io/IOException;)V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_1

    :catch_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_2

    :cond_3
    :try_start_3
    iget-object p1, p0, Luv/o;->z:Luv/w;

    invoke-virtual {p1}, Luv/w;->close()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_2

    :catch_2
    :try_start_4
    iget-object p1, p0, Luv/o;->y:Lrv/a;

    invoke-interface {p1}, Lew/k0;->cancel()V
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_3

    :catch_3
    iget-object p1, p0, Luv/o;->i:Lqv/c;

    invoke-virtual {p1}, Lqv/c;->q()V

    iget-object p1, p0, Luv/o;->j:Lqv/c;

    invoke-virtual {p1}, Lqv/c;->q()V

    iget-object p1, p0, Luv/o;->k:Lqv/c;

    invoke-virtual {p1}, Lqv/c;->q()V

    return-void

    :goto_3
    monitor-exit p0

    throw p1
.end method

.method public final M0(I)Z
    .locals 1

    if-eqz p1, :cond_0

    const/4 v0, 0x1

    and-int/2addr p1, v0

    if-nez p1, :cond_0

    return v0

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final N(Ljava/io/IOException;)V
    .locals 1

    sget-object v0, Luv/b;->d:Luv/b;

    invoke-virtual {p0, v0, v0, p1}, Luv/o;->L(Luv/b;Luv/b;Ljava/io/IOException;)V

    return-void
.end method

.method public final O()Z
    .locals 1

    iget-boolean v0, p0, Luv/o;->a:Z

    return v0
.end method

.method public final O0(I)Luv/v;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Luv/o;->c:Ljava/util/Map;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-interface {v0, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Luv/v;

    const-string v0, "null cannot be cast to non-null type java.lang.Object"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Ljava/lang/Object;->notifyAll()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object p1

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public final Q()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object v0, p0, Luv/o;->d:Ljava/lang/String;

    return-object v0
.end method

.method public final Q0()V
    .locals 9

    monitor-enter p0

    :try_start_0
    iget-wide v0, p0, Luv/o;->p:J

    iget-wide v2, p0, Luv/o;->o:J
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    cmp-long v0, v0, v2

    if-gez v0, :cond_0

    monitor-exit p0

    return-void

    :cond_0
    const-wide/16 v0, 0x1

    add-long/2addr v2, v0

    :try_start_1
    iput-wide v2, p0, Luv/o;->o:J

    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v0

    const v2, 0x3b9aca00

    int-to-long v2, v2

    add-long/2addr v0, v2

    iput-wide v0, p0, Luv/o;->r:J

    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit p0

    iget-object v1, p0, Luv/o;->i:Lqv/c;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, p0, Luv/o;->d:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, " ping"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    new-instance v6, Luv/i;

    invoke-direct {v6, p0}, Luv/i;-><init>(Luv/o;)V

    const/4 v7, 0x6

    const/4 v8, 0x0

    const-wide/16 v3, 0x0

    const/4 v5, 0x0

    invoke-static/range {v1 .. v8}, Lqv/c;->d(Lqv/c;Ljava/lang/String;JZLkotlin/jvm/functions/Function0;ILjava/lang/Object;)V

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public final R0(I)V
    .locals 0

    iput p1, p0, Luv/o;->e:I

    return-void
.end method

.method public final S0(Luv/z;)V
    .locals 1
    .param p1    # Luv/z;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Luv/o;->u:Luv/z;

    return-void
.end method

.method public final T()Luv/c;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object v0, p0, Luv/o;->s:Luv/c;

    return-object v0
.end method

.method public final T0(Luv/b;)V
    .locals 4
    .param p1    # Luv/b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "statusCode"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Luv/o;->z:Luv/w;

    monitor-enter v0

    :try_start_0
    monitor-enter p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :try_start_1
    iget-boolean v1, p0, Luv/o;->g:Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    if-eqz v1, :cond_0

    :try_start_2
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    goto :goto_0

    :cond_0
    const/4 v1, 0x1

    :try_start_3
    iput-boolean v1, p0, Luv/o;->g:Z

    iget v1, p0, Luv/o;->e:I

    sget-object v2, Lkotlin/Unit;->a:Lkotlin/Unit;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    :try_start_4
    monitor-exit p0

    iget-object v2, p0, Luv/o;->z:Luv/w;

    sget-object v3, Lnv/n;->a:[B

    invoke-virtual {v2, v1, p1, v3}, Luv/w;->f(ILuv/b;[B)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    monitor-exit v0

    return-void

    :catchall_1
    move-exception p1

    :try_start_5
    monitor-exit p0

    throw p1
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    :goto_0
    monitor-exit v0

    throw p1
.end method

.method public final U0(Z)V
    .locals 8

    if-eqz p1, :cond_0

    iget-object p1, p0, Luv/o;->z:Luv/w;

    invoke-virtual {p1}, Luv/w;->b()V

    iget-object p1, p0, Luv/o;->z:Luv/w;

    iget-object v0, p0, Luv/o;->t:Luv/z;

    invoke-virtual {p1, v0}, Luv/w;->o(Luv/z;)V

    iget-object p1, p0, Luv/o;->t:Luv/z;

    invoke-virtual {p1}, Luv/z;->c()I

    move-result p1

    const v0, 0xffff

    if-eq p1, v0, :cond_0

    iget-object v1, p0, Luv/o;->z:Luv/w;

    sub-int/2addr p1, v0

    int-to-long v2, p1

    const/4 p1, 0x0

    invoke-virtual {v1, p1, v2, v3}, Luv/w;->p(IJ)V

    :cond_0
    iget-object p1, p0, Luv/o;->h:Lqv/d;

    invoke-virtual {p1}, Lqv/d;->k()Lqv/c;

    move-result-object v0

    iget-object v1, p0, Luv/o;->d:Ljava/lang/String;

    iget-object v5, p0, Luv/o;->A:Luv/o$d;

    const/4 v6, 0x6

    const/4 v7, 0x0

    const-wide/16 v2, 0x0

    const/4 v4, 0x0

    invoke-static/range {v0 .. v7}, Lqv/c;->d(Lqv/c;Ljava/lang/String;JZLkotlin/jvm/functions/Function0;ILjava/lang/Object;)V

    return-void
.end method

.method public final W0(J)V
    .locals 7

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Luv/o;->v:Lvv/a;

    const/4 v5, 0x2

    const/4 v6, 0x0

    const-wide/16 v3, 0x0

    move-wide v1, p1

    invoke-static/range {v0 .. v6}, Lvv/a;->c(Lvv/a;JJILjava/lang/Object;)V

    iget-object p1, p0, Luv/o;->v:Lvv/a;

    invoke-virtual {p1}, Lvv/a;->a()J

    move-result-wide v3

    iget-object p1, p0, Luv/o;->t:Luv/z;

    invoke-virtual {p1}, Luv/z;->c()I

    move-result p1

    div-int/lit8 p1, p1, 0x2

    int-to-long p1, p1

    cmp-long p1, v3, p1

    if-ltz p1, :cond_0

    const/4 p1, 0x0

    invoke-virtual {p0, p1, v3, v4}, Luv/o;->g1(IJ)V

    iget-object v0, p0, Luv/o;->v:Lvv/a;

    const/4 v5, 0x1

    const/4 v6, 0x0

    const-wide/16 v1, 0x0

    invoke-static/range {v0 .. v6}, Lvv/a;->c(Lvv/a;JJILjava/lang/Object;)V

    goto :goto_0

    :catchall_0
    move-exception v0

    move-object p1, v0

    goto :goto_1

    :cond_0
    :goto_0
    iget-object p1, p0, Luv/o;->s:Luv/c;

    iget-object p2, p0, Luv/o;->v:Lvv/a;

    invoke-interface {p1, p2}, Luv/c;->b(Lvv/a;)V

    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :goto_1
    monitor-exit p0

    throw p1
.end method

.method public final X0(IZLew/e;J)V
    .locals 8
    .param p3    # Lew/e;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    const-wide/16 v0, 0x0

    cmp-long v2, p4, v0

    const/4 v3, 0x0

    if-nez v2, :cond_0

    iget-object p4, p0, Luv/o;->z:Luv/w;

    invoke-virtual {p4, p2, p1, p3, v3}, Luv/w;->c(ZILew/e;I)V

    return-void

    :cond_0
    :goto_0
    cmp-long v2, p4, v0

    if-lez v2, :cond_4

    monitor-enter p0

    :goto_1
    :try_start_0
    iget-wide v4, p0, Luv/o;->w:J

    iget-wide v6, p0, Luv/o;->x:J

    cmp-long v2, v4, v6

    if-ltz v2, :cond_2

    iget-object v2, p0, Luv/o;->c:Ljava/util/Map;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-interface {v2, v4}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    const-string v2, "null cannot be cast to non-null type java.lang.Object"

    invoke-static {p0, v2}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Ljava/lang/Object;->wait()V

    goto :goto_1

    :catchall_0
    move-exception p1

    goto :goto_3

    :cond_1
    new-instance p1, Ljava/io/IOException;

    const-string p2, "stream closed"

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_2
    sub-long/2addr v6, v4

    :try_start_1
    invoke-static {p4, p5, v6, v7}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v4

    long-to-int v2, v4

    iget-object v4, p0, Luv/o;->z:Luv/w;

    invoke-virtual {v4}, Luv/w;->h()I

    move-result v4

    invoke-static {v2, v4}, Ljava/lang/Math;->min(II)I

    move-result v2

    iget-wide v4, p0, Luv/o;->w:J

    int-to-long v6, v2

    add-long/2addr v4, v6

    iput-wide v4, p0, Luv/o;->w:J

    sget-object v4, Lkotlin/Unit;->a:Lkotlin/Unit;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit p0

    sub-long/2addr p4, v6

    iget-object v4, p0, Luv/o;->z:Luv/w;

    if-eqz p2, :cond_3

    cmp-long v5, p4, v0

    if-nez v5, :cond_3

    const/4 v5, 0x1

    goto :goto_2

    :cond_3
    move v5, v3

    :goto_2
    invoke-virtual {v4, v5, p1, p3, v2}, Luv/w;->c(ZILew/e;I)V

    goto :goto_0

    :catch_0
    :try_start_2
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Thread;->interrupt()V

    new-instance p1, Ljava/io/InterruptedIOException;

    invoke-direct {p1}, Ljava/io/InterruptedIOException;-><init>()V

    throw p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :goto_3
    monitor-exit p0

    throw p1

    :cond_4
    return-void
.end method

.method public final Y()I
    .locals 1

    iget v0, p0, Luv/o;->e:I

    return v0
.end method

.method public final Y0(IZLjava/util/List;)V
    .locals 1
    .param p3    # Ljava/util/List;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(IZ",
            "Ljava/util/List<",
            "Luv/d;",
            ">;)V"
        }
    .end annotation

    const-string v0, "alternating"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Luv/o;->z:Luv/w;

    invoke-virtual {v0, p2, p1, p3}, Luv/w;->g(ZILjava/util/List;)V

    return-void
.end method

.method public final Z0(ZII)V
    .locals 1

    :try_start_0
    iget-object v0, p0, Luv/o;->z:Luv/w;

    invoke-virtual {v0, p1, p2, p3}, Luv/w;->k(ZII)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    invoke-virtual {p0, p1}, Luv/o;->N(Ljava/io/IOException;)V

    return-void
.end method

.method public final a1(ILuv/b;)V
    .locals 1
    .param p2    # Luv/b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "statusCode"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Luv/o;->z:Luv/w;

    invoke-virtual {v0, p1, p2}, Luv/w;->n(ILuv/b;)V

    return-void
.end method

.method public final b0()Luv/o$c;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object v0, p0, Luv/o;->b:Luv/o$c;

    return-object v0
.end method

.method public final c0()I
    .locals 1

    iget v0, p0, Luv/o;->f:I

    return v0
.end method

.method public close()V
    .locals 3

    sget-object v0, Luv/b;->c:Luv/b;

    sget-object v1, Luv/b;->k:Luv/b;

    const/4 v2, 0x0

    invoke-virtual {p0, v0, v1, v2}, Luv/o;->L(Luv/b;Luv/b;Ljava/io/IOException;)V

    return-void
.end method

.method public final d0()Luv/z;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object v0, p0, Luv/o;->t:Luv/z;

    return-object v0
.end method

.method public final e0()Luv/z;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object v0, p0, Luv/o;->u:Luv/z;

    return-object v0
.end method

.method public final e1(ILuv/b;)V
    .locals 9
    .param p2    # Luv/b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "errorCode"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v1, p0, Luv/o;->i:Lqv/c;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, p0, Luv/o;->d:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v2, 0x5b

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, "] writeSynReset"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    new-instance v6, Luv/j;

    invoke-direct {v6, p0, p1, p2}, Luv/j;-><init>(Luv/o;ILuv/b;)V

    const/4 v7, 0x6

    const/4 v8, 0x0

    const-wide/16 v3, 0x0

    const/4 v5, 0x0

    invoke-static/range {v1 .. v8}, Lqv/c;->d(Lqv/c;Ljava/lang/String;JZLkotlin/jvm/functions/Function0;ILjava/lang/Object;)V

    return-void
.end method

.method public final f0(I)Luv/v;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Luv/o;->c:Ljava/util/Map;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Luv/v;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object p1

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public final flush()V
    .locals 1

    iget-object v0, p0, Luv/o;->z:Luv/w;

    invoke-virtual {v0}, Luv/w;->flush()V

    return-void
.end method

.method public final g1(IJ)V
    .locals 8

    iget-object v0, p0, Luv/o;->i:Lqv/c;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, p0, Luv/o;->d:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v2, 0x5b

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, "] windowUpdate"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    new-instance v5, Luv/h;

    invoke-direct {v5, p0, p1, p2, p3}, Luv/h;-><init>(Luv/o;IJ)V

    const/4 v6, 0x6

    const/4 v7, 0x0

    const-wide/16 v2, 0x0

    const/4 v4, 0x0

    invoke-static/range {v0 .. v7}, Lqv/c;->d(Lqv/c;Ljava/lang/String;JZLkotlin/jvm/functions/Function0;ILjava/lang/Object;)V

    return-void
.end method

.method public final h0()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/Integer;",
            "Luv/v;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object v0, p0, Luv/o;->c:Ljava/util/Map;

    return-object v0
.end method

.method public final i0()J
    .locals 2

    iget-wide v0, p0, Luv/o;->x:J

    return-wide v0
.end method

.method public final k0()Luv/w;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object v0, p0, Luv/o;->z:Luv/w;

    return-object v0
.end method

.method public final n0(J)Z
    .locals 6

    monitor-enter p0

    :try_start_0
    iget-boolean v0, p0, Luv/o;->g:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    monitor-exit p0

    return v1

    :cond_0
    :try_start_1
    iget-wide v2, p0, Luv/o;->p:J

    iget-wide v4, p0, Luv/o;->o:J

    cmp-long v0, v2, v4

    if-gez v0, :cond_1

    iget-wide v2, p0, Luv/o;->r:J
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    cmp-long p1, p1, v2

    if-ltz p1, :cond_1

    monitor-exit p0

    return v1

    :catchall_0
    move-exception p1

    goto :goto_0

    :cond_1
    monitor-exit p0

    const/4 p1, 0x1

    return p1

    :goto_0
    monitor-exit p0

    throw p1
.end method

.method public final s0(ILjava/util/List;Z)Luv/v;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/util/List<",
            "Luv/d;",
            ">;Z)",
            "Luv/v;"
        }
    .end annotation

    xor-int/lit8 v3, p3, 0x1

    iget-object v6, p0, Luv/o;->z:Luv/w;

    monitor-enter v6

    :try_start_0
    monitor-enter p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_4

    :try_start_1
    iget v0, p0, Luv/o;->f:I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_3

    const v1, 0x3fffffff    # 1.9999999f

    if-le v0, v1, :cond_0

    :try_start_2
    sget-object v0, Luv/b;->j:Luv/b;

    invoke-virtual {p0, v0}, Luv/o;->T0(Luv/b;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    move-object p1, v0

    move-object v2, p0

    goto/16 :goto_6

    :cond_0
    :goto_0
    :try_start_3
    iget-boolean v0, p0, Luv/o;->g:Z

    if-nez v0, :cond_7

    iget v1, p0, Luv/o;->f:I

    add-int/lit8 v0, v1, 0x2

    iput v0, p0, Luv/o;->f:I

    new-instance v0, Luv/v;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    const/4 v5, 0x0

    const/4 v4, 0x0

    move-object v2, p0

    :try_start_4
    invoke-direct/range {v0 .. v5}, Luv/v;-><init>(ILuv/o;ZZLmv/y;)V

    if-eqz p3, :cond_2

    iget-wide v4, v2, Luv/o;->w:J

    iget-wide v7, v2, Luv/o;->x:J

    cmp-long p3, v4, v7

    if-gez p3, :cond_2

    invoke-virtual {v0}, Luv/v;->t()J

    move-result-wide v4

    invoke-virtual {v0}, Luv/v;->s()J

    move-result-wide v7

    cmp-long p3, v4, v7

    if-ltz p3, :cond_1

    goto :goto_2

    :cond_1
    const/4 p3, 0x0

    goto :goto_3

    :catchall_1
    move-exception v0

    :goto_1
    move-object p1, v0

    goto :goto_6

    :cond_2
    :goto_2
    const/4 p3, 0x1

    :goto_3
    invoke-virtual {v0}, Luv/v;->w()Z

    move-result v4

    if-eqz v4, :cond_3

    iget-object v4, v2, Luv/o;->c:Ljava/util/Map;

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-interface {v4, v5, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_3
    sget-object v4, Lkotlin/Unit;->a:Lkotlin/Unit;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    :try_start_5
    monitor-exit p0

    if-nez p1, :cond_4

    iget-object p1, v2, Luv/o;->z:Luv/w;

    invoke-virtual {p1, v3, v1, p2}, Luv/w;->g(ZILjava/util/List;)V

    goto :goto_5

    :catchall_2
    move-exception v0

    :goto_4
    move-object p1, v0

    goto :goto_7

    :cond_4
    iget-boolean v3, v2, Luv/o;->a:Z

    if-nez v3, :cond_6

    iget-object v3, v2, Luv/o;->z:Luv/w;

    invoke-virtual {v3, p1, v1, p2}, Luv/w;->m(IILjava/util/List;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    :goto_5
    monitor-exit v6

    if-eqz p3, :cond_5

    iget-object p1, v2, Luv/o;->z:Luv/w;

    invoke-virtual {p1}, Luv/w;->flush()V

    :cond_5
    return-object v0

    :cond_6
    :try_start_6
    const-string p1, "client streams shouldn\'t have associated stream IDs"

    new-instance p2, Ljava/lang/IllegalArgumentException;

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    :catchall_3
    move-exception v0

    move-object v2, p0

    goto :goto_1

    :cond_7
    move-object v2, p0

    :try_start_7
    new-instance p1, Luv/a;

    invoke-direct {p1}, Luv/a;-><init>()V

    throw p1
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_1

    :goto_6
    :try_start_8
    monitor-exit p0

    throw p1
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_2

    :catchall_4
    move-exception v0

    move-object v2, p0

    goto :goto_4

    :goto_7
    monitor-exit v6

    throw p1
.end method

.method public final w0(Ljava/util/List;Z)Luv/v;
    .locals 1
    .param p1    # Ljava/util/List;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Luv/d;",
            ">;Z)",
            "Luv/v;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "requestHeaders"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    invoke-virtual {p0, v0, p1, p2}, Luv/o;->s0(ILjava/util/List;Z)Luv/v;

    move-result-object p1

    return-object p1
.end method

.method public final z0(ILew/g;IZ)V
    .locals 14
    .param p2    # Lew/g;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    move-object/from16 v0, p2

    const-string v1, "source"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v5, Lew/e;

    invoke-direct {v5}, Lew/e;-><init>()V

    move/from16 v6, p3

    int-to-long v1, v6

    invoke-interface {v0, v1, v2}, Lew/g;->w1(J)V

    invoke-interface {v0, v5, v1, v2}, Lew/l0;->f3(Lew/e;J)J

    iget-object v0, p0, Luv/o;->j:Lqv/c;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, p0, Luv/o;->d:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v2, 0x5b

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, "] onData"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    new-instance v11, Luv/k;

    move-object v3, p0

    move v4, p1

    move/from16 v7, p4

    move-object v2, v11

    invoke-direct/range {v2 .. v7}, Luv/k;-><init>(Luv/o;ILew/e;IZ)V

    const/4 v12, 0x6

    const/4 v13, 0x0

    const-wide/16 v8, 0x0

    const/4 v10, 0x0

    move-object v6, v0

    move-object v7, v1

    invoke-static/range {v6 .. v13}, Lqv/c;->d(Lqv/c;Ljava/lang/String;JZLkotlin/jvm/functions/Function0;ILjava/lang/Object;)V

    return-void
.end method
