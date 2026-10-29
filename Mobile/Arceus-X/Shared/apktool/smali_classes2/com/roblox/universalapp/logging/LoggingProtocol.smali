.class public final Lcom/roblox/universalapp/logging/LoggingProtocol;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/roblox/universalapp/logging/LoggingProtocol$a;,
        Lcom/roblox/universalapp/logging/LoggingProtocol$b;,
        Lcom/roblox/universalapp/logging/LoggingProtocol$c;,
        Lcom/roblox/universalapp/logging/LoggingProtocol$d;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\t\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u000b\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u00c6\u0002\u0018\u00002\u00020\u0001:\u0004.\u0018\u0016\u0014B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J#\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0008\u001a\u00020\u00072\n\u0008\u0002\u0010\t\u001a\u0004\u0018\u00010\u0004H\u0007\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ!\u0010\u000e\u001a\u00020\n2\u0006\u0010\u0008\u001a\u00020\u00072\u0008\u0008\u0002\u0010\r\u001a\u00020\u0004H\u0007\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u0010H\u0007\u00a2\u0006\u0004\u0008\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\nH\u0007\u00a2\u0006\u0004\u0008\u0014\u0010\u0003J\u000f\u0010\u0015\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\u0008\u0015\u0010\u0006J\u0010\u0010\u0016\u001a\u00020\nH\u0082@\u00a2\u0006\u0004\u0008\u0016\u0010\u0017R\u001b\u0010\u001b\u001a\u00020\u00048BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0018\u0010\u0019\u001a\u0004\u0008\u001a\u0010\u0006R(\u0010#\u001a\u00020\u001c8\u0000@\u0000X\u0081\u000e\u00a2\u0006\u0018\n\u0004\u0008\u0016\u0010\u001d\u0012\u0004\u0008\"\u0010\u0003\u001a\u0004\u0008\u001e\u0010\u001f\"\u0004\u0008 \u0010!R \u0010)\u001a\u00020$8\u0000X\u0081\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0014\u0010%\u0012\u0004\u0008(\u0010\u0003\u001a\u0004\u0008&\u0010\'R\u001a\u0010-\u001a\u0008\u0012\u0004\u0012\u00020+0*8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001a\u0010,\u00a8\u0006/"
    }
    d2 = {
        "Lcom/roblox/universalapp/logging/LoggingProtocol;",
        "",
        "<init>",
        "()V",
        "",
        "getProcessTimestamp",
        "()J",
        "",
        "eventName",
        "systemClockTime",
        "",
        "l",
        "(Ljava/lang/String;Ljava/lang/Long;)V",
        "timestamp",
        "h",
        "(Ljava/lang/String;J)V",
        "Lcom/roblox/engine/jni/autovalue/RobloxTelemetryEvent;",
        "event",
        "j",
        "(Lcom/roblox/engine/jni/autovalue/RobloxTelemetryEvent;)V",
        "d",
        "f",
        "c",
        "(Lnt/b;)Ljava/lang/Object;",
        "b",
        "Ljt/h;",
        "e",
        "processStartTime",
        "Lku/p0;",
        "Lku/p0;",
        "getScope$universalapp_googleProdRelease",
        "()Lku/p0;",
        "setScope$universalapp_googleProdRelease",
        "(Lku/p0;)V",
        "getScope$universalapp_googleProdRelease$annotations",
        "scope",
        "Lkotlin/concurrent/atomics/AtomicBoolean;",
        "Ljava/util/concurrent/atomic/AtomicBoolean;",
        "getConsumerStarted$universalapp_googleProdRelease",
        "()Ljava/util/concurrent/atomic/AtomicBoolean;",
        "getConsumerStarted$universalapp_googleProdRelease$annotations",
        "consumerStarted",
        "Lmu/g;",
        "Lcom/roblox/universalapp/logging/LoggingProtocol$a;",
        "Lmu/g;",
        "channel",
        "a",
        "universalapp_googleProdRelease"
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
.field public static final a:Lcom/roblox/universalapp/logging/LoggingProtocol;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final b:Ljt/h;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static c:Lku/p0;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final d:Ljava/util/concurrent/atomic/AtomicBoolean;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final e:Lmu/g;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lmu/g<",
            "Lcom/roblox/universalapp/logging/LoggingProtocol$a;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lcom/roblox/universalapp/logging/LoggingProtocol;

    invoke-direct {v0}, Lcom/roblox/universalapp/logging/LoggingProtocol;-><init>()V

    sput-object v0, Lcom/roblox/universalapp/logging/LoggingProtocol;->a:Lcom/roblox/universalapp/logging/LoggingProtocol;

    new-instance v0, Llm/a;

    invoke-direct {v0}, Llm/a;-><init>()V

    invoke-static {v0}, Ljt/i;->b(Lkotlin/jvm/functions/Function0;)Ljt/h;

    move-result-object v0

    sput-object v0, Lcom/roblox/universalapp/logging/LoggingProtocol;->b:Ljt/h;

    invoke-static {}, Lku/g1;->a()Lku/l0;

    move-result-object v0

    invoke-static {v0}, Lku/q0;->a(Lkotlin/coroutines/CoroutineContext;)Lku/p0;

    move-result-object v0

    sput-object v0, Lcom/roblox/universalapp/logging/LoggingProtocol;->c:Lku/p0;

    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    sput-object v0, Lcom/roblox/universalapp/logging/LoggingProtocol;->d:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v0, 0x0

    const/4 v1, 0x6

    const v2, 0x7fffffff

    invoke-static {v2, v0, v0, v1, v0}, Lmu/j;->b(ILmu/a;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Lmu/g;

    move-result-object v0

    sput-object v0, Lcom/roblox/universalapp/logging/LoggingProtocol;->e:Lmu/g;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a()J
    .locals 2

    invoke-static {}, Lcom/roblox/universalapp/logging/LoggingProtocol;->n()J

    move-result-wide v0

    return-wide v0
.end method

.method public static final synthetic b(Lcom/roblox/universalapp/logging/LoggingProtocol;Lnt/b;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, Lcom/roblox/universalapp/logging/LoggingProtocol;->c(Lnt/b;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final d()V
    .locals 7

    sget-object v0, Lcom/roblox/universalapp/logging/LoggingProtocol;->d:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object v1, Lcom/roblox/universalapp/logging/LoggingProtocol;->c:Lku/p0;

    new-instance v4, Lcom/roblox/universalapp/logging/LoggingProtocol$f;

    const/4 v0, 0x0

    invoke-direct {v4, v0}, Lcom/roblox/universalapp/logging/LoggingProtocol$f;-><init>(Lnt/b;)V

    const/4 v5, 0x3

    const/4 v6, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static/range {v1 .. v6}, Lku/i;->d(Lku/p0;Lkotlin/coroutines/CoroutineContext;Lku/r0;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lku/d2;

    :cond_0
    return-void
.end method

.method public static final g(Ljava/lang/String;)V
    .locals 4
    .param p0    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "eventName"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x2

    const/4 v1, 0x0

    const-wide/16 v2, 0x0

    invoke-static {p0, v2, v3, v0, v1}, Lcom/roblox/universalapp/logging/LoggingProtocol;->i(Ljava/lang/String;JILjava/lang/Object;)V

    return-void
.end method

.method public static final getProcessTimestamp()J
    .locals 4
    .annotation build Landroidx/annotation/Keep;
    .end annotation

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v0

    sget-object v2, Lcom/roblox/universalapp/logging/LoggingProtocol;->a:Lcom/roblox/universalapp/logging/LoggingProtocol;

    invoke-virtual {v2}, Lcom/roblox/universalapp/logging/LoggingProtocol;->e()J

    move-result-wide v2

    sub-long/2addr v0, v2

    return-wide v0
.end method

.method public static final h(Ljava/lang/String;J)V
    .locals 2
    .param p0    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "eventName"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/roblox/universalapp/logging/LoggingProtocol;->e:Lmu/g;

    new-instance v1, Lcom/roblox/universalapp/logging/LoggingProtocol$d;

    invoke-direct {v1, p0, p1, p2}, Lcom/roblox/universalapp/logging/LoggingProtocol$d;-><init>(Ljava/lang/String;J)V

    invoke-interface {v0, v1}, Lmu/y;->w(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static synthetic i(Ljava/lang/String;JILjava/lang/Object;)V
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    const-wide/16 p1, 0x0

    :cond_0
    invoke-static {p0, p1, p2}, Lcom/roblox/universalapp/logging/LoggingProtocol;->h(Ljava/lang/String;J)V

    return-void
.end method

.method public static final j(Lcom/roblox/engine/jni/autovalue/RobloxTelemetryEvent;)V
    .locals 2
    .param p0    # Lcom/roblox/engine/jni/autovalue/RobloxTelemetryEvent;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "event"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/roblox/universalapp/logging/LoggingProtocol;->e:Lmu/g;

    new-instance v1, Lcom/roblox/universalapp/logging/LoggingProtocol$b;

    invoke-direct {v1, p0}, Lcom/roblox/universalapp/logging/LoggingProtocol$b;-><init>(Lcom/roblox/engine/jni/autovalue/RobloxTelemetryEvent;)V

    invoke-interface {v0, v1}, Lmu/y;->w(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static final k(Ljava/lang/String;)V
    .locals 2
    .param p0    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "eventName"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    const/4 v1, 0x2

    invoke-static {p0, v0, v1, v0}, Lcom/roblox/universalapp/logging/LoggingProtocol;->m(Ljava/lang/String;Ljava/lang/Long;ILjava/lang/Object;)V

    return-void
.end method

.method public static final l(Ljava/lang/String;Ljava/lang/Long;)V
    .locals 3
    .param p0    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p1    # Ljava/lang/Long;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    const-string v0, "eventName"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    goto :goto_0

    :cond_0
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v0

    :goto_0
    sget-object p1, Lcom/roblox/universalapp/logging/LoggingProtocol;->e:Lmu/g;

    new-instance v2, Lcom/roblox/universalapp/logging/LoggingProtocol$c;

    invoke-direct {v2, p0, v0, v1}, Lcom/roblox/universalapp/logging/LoggingProtocol$c;-><init>(Ljava/lang/String;J)V

    invoke-interface {p1, v2}, Lmu/y;->w(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static synthetic m(Ljava/lang/String;Ljava/lang/Long;ILjava/lang/Object;)V
    .locals 0

    and-int/lit8 p2, p2, 0x2

    if-eqz p2, :cond_0

    const/4 p1, 0x0

    :cond_0
    invoke-static {p0, p1}, Lcom/roblox/universalapp/logging/LoggingProtocol;->l(Ljava/lang/String;Ljava/lang/Long;)V

    return-void
.end method

.method public static final n()J
    .locals 2

    invoke-static {}, Landroid/os/Process;->getStartElapsedRealtime()J

    move-result-wide v0

    return-wide v0
.end method


# virtual methods
.method public final c(Lnt/b;)Ljava/lang/Object;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnt/b<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p1, Lcom/roblox/universalapp/logging/LoggingProtocol$e;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lcom/roblox/universalapp/logging/LoggingProtocol$e;

    iget v1, v0, Lcom/roblox/universalapp/logging/LoggingProtocol$e;->w:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/roblox/universalapp/logging/LoggingProtocol$e;->w:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/roblox/universalapp/logging/LoggingProtocol$e;

    invoke-direct {v0, p0, p1}, Lcom/roblox/universalapp/logging/LoggingProtocol$e;-><init>(Lcom/roblox/universalapp/logging/LoggingProtocol;Lnt/b;)V

    :goto_0
    iget-object p1, v0, Lcom/roblox/universalapp/logging/LoggingProtocol$e;->u:Ljava/lang/Object;

    invoke-static {}, Lot/c;->e()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, Lcom/roblox/universalapp/logging/LoggingProtocol$e;->w:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object v2, v0, Lcom/roblox/universalapp/logging/LoggingProtocol$e;->t:Ljava/lang/Object;

    check-cast v2, Lmu/i;

    invoke-static {p1}, Ljt/o;->b(Ljava/lang/Object;)V

    goto :goto_2

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p1}, Ljt/o;->b(Ljava/lang/Object;)V

    sget-object p1, Lcom/roblox/universalapp/logging/LoggingProtocol;->e:Lmu/g;

    invoke-interface {p1}, Lmu/x;->iterator()Lmu/i;

    move-result-object p1

    move-object v2, p1

    :goto_1
    iput-object v2, v0, Lcom/roblox/universalapp/logging/LoggingProtocol$e;->t:Ljava/lang/Object;

    iput v3, v0, Lcom/roblox/universalapp/logging/LoggingProtocol$e;->w:I

    invoke-interface {v2, v0}, Lmu/i;->a(Lnt/b;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_3

    return-object v1

    :cond_3
    :goto_2
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-eqz p1, :cond_7

    invoke-interface {v2}, Lmu/i;->next()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/roblox/universalapp/logging/LoggingProtocol$a;

    instance-of v4, p1, Lcom/roblox/universalapp/logging/LoggingProtocol$b;

    if-eqz v4, :cond_4

    check-cast p1, Lcom/roblox/universalapp/logging/LoggingProtocol$b;

    invoke-virtual {p1}, Lcom/roblox/universalapp/logging/LoggingProtocol$b;->a()Lcom/roblox/engine/jni/autovalue/RobloxTelemetryEvent;

    move-result-object p1

    invoke-static {p1}, Lcom/roblox/universalapp/logging/JNILoggingProtocol;->nativeLogRobloxTelemetryEvent(Lcom/roblox/engine/jni/autovalue/RobloxTelemetryEvent;)V

    goto :goto_1

    :cond_4
    instance-of v4, p1, Lcom/roblox/universalapp/logging/LoggingProtocol$c;

    const/4 v5, 0x0

    if-eqz v4, :cond_5

    check-cast p1, Lcom/roblox/universalapp/logging/LoggingProtocol$c;

    invoke-virtual {p1}, Lcom/roblox/universalapp/logging/LoggingProtocol$c;->a()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p1}, Lcom/roblox/universalapp/logging/LoggingProtocol$c;->b()J

    move-result-wide v6

    invoke-virtual {p0}, Lcom/roblox/universalapp/logging/LoggingProtocol;->f()J

    move-result-wide v8

    add-long/2addr v6, v8

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v8

    sub-long/2addr v6, v8

    new-array p1, v5, [Ljava/lang/Object;

    invoke-static {v4, v6, v7, p1}, Lcom/roblox/universalapp/logging/JNILoggingProtocol;->a(Ljava/lang/String;J[Ljava/lang/Object;)V

    goto :goto_1

    :cond_5
    instance-of v4, p1, Lcom/roblox/universalapp/logging/LoggingProtocol$d;

    if-eqz v4, :cond_6

    check-cast p1, Lcom/roblox/universalapp/logging/LoggingProtocol$d;

    invoke-virtual {p1}, Lcom/roblox/universalapp/logging/LoggingProtocol$d;->a()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p1}, Lcom/roblox/universalapp/logging/LoggingProtocol$d;->b()J

    move-result-wide v6

    new-array p1, v5, [Ljava/lang/Object;

    invoke-static {v4, v6, v7, p1}, Lcom/roblox/universalapp/logging/JNILoggingProtocol;->a(Ljava/lang/String;J[Ljava/lang/Object;)V

    goto :goto_1

    :cond_6
    new-instance p1, Ljt/l;

    invoke-direct {p1}, Ljt/l;-><init>()V

    throw p1

    :cond_7
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p1
.end method

.method public final e()J
    .locals 2

    sget-object v0, Lcom/roblox/universalapp/logging/LoggingProtocol;->b:Ljt/h;

    invoke-interface {v0}, Ljt/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->longValue()J

    move-result-wide v0

    return-wide v0
.end method

.method public final f()J
    .locals 2

    :try_start_0
    sget-object v0, Ljt/n;->b:Ljt/n$a;

    invoke-static {}, Lcom/roblox/universalapp/logging/JNILoggingProtocol;->nativeGetTimestamp()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-static {v0}, Ljt/n;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    sget-object v1, Ljt/n;->b:Ljt/n$a;

    invoke-static {v0}, Ljt/o;->a(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Ljt/n;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    :goto_0
    invoke-static {v0}, Ljt/n;->e(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v1

    if-nez v1, :cond_0

    goto :goto_1

    :cond_0
    const-string v0, "LoggingProtocol"

    const-string v1, "Calling into the game engine before linking to the library."

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    const-wide/16 v0, 0x0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    :goto_1
    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->longValue()J

    move-result-wide v0

    return-wide v0
.end method
