.class public final Lcom/roblox/client/analytics/TelemetryFlushWorker;
.super Landroidx/work/CoroutineWorker;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/roblox/client/analytics/TelemetryFlushWorker$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0010\u0018\u0000 \u001b2\u00020\u0001:\u0001\rB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\u0008H\u0096@\u00a2\u0006\u0004\u0008\t\u0010\nR.\u0010\u0015\u001a\u0008\u0012\u0004\u0012\u00020\u000c0\u000b8\u0000@\u0000X\u0081\u000e\u00a2\u0006\u0018\n\u0004\u0008\r\u0010\u000e\u0012\u0004\u0008\u0013\u0010\u0014\u001a\u0004\u0008\u000f\u0010\u0010\"\u0004\u0008\u0011\u0010\u0012R.\u0010\u001a\u001a\u0008\u0012\u0004\u0012\u00020\u000c0\u000b8\u0000@\u0000X\u0081\u000e\u00a2\u0006\u0018\n\u0004\u0008\u0016\u0010\u000e\u0012\u0004\u0008\u0019\u0010\u0014\u001a\u0004\u0008\u0017\u0010\u0010\"\u0004\u0008\u0018\u0010\u0012\u00a8\u0006\u001c"
    }
    d2 = {
        "Lcom/roblox/client/analytics/TelemetryFlushWorker;",
        "Landroidx/work/CoroutineWorker;",
        "Landroid/content/Context;",
        "appContext",
        "Landroidx/work/WorkerParameters;",
        "params",
        "<init>",
        "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V",
        "Landroidx/work/c$a;",
        "doWork",
        "(Lnt/b;)Ljava/lang/Object;",
        "Lkotlin/Function0;",
        "",
        "a",
        "Lkotlin/jvm/functions/Function0;",
        "e",
        "()Lkotlin/jvm/functions/Function0;",
        "setNativeFlushV1$NativeShell_googleProdRelease",
        "(Lkotlin/jvm/functions/Function0;)V",
        "getNativeFlushV1$NativeShell_googleProdRelease$annotations",
        "()V",
        "nativeFlushV1",
        "b",
        "f",
        "setNativeFlushV2$NativeShell_googleProdRelease",
        "getNativeFlushV2$NativeShell_googleProdRelease$annotations",
        "nativeFlushV2",
        "c",
        "NativeShell_googleProdRelease"
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
.field public static final c:Lcom/roblox/client/analytics/TelemetryFlushWorker$a;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# instance fields
.field public a:Lkotlin/jvm/functions/Function0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public b:Lkotlin/jvm/functions/Function0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/roblox/client/analytics/TelemetryFlushWorker$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/roblox/client/analytics/TelemetryFlushWorker$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/roblox/client/analytics/TelemetryFlushWorker;->c:Lcom/roblox/client/analytics/TelemetryFlushWorker$a;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroidx/work/WorkerParameters;)V
    .locals 1
    .param p1    # Landroid/content/Context;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Landroidx/work/WorkerParameters;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "appContext"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "params"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1, p2}, Landroidx/work/CoroutineWorker;-><init>(Landroid/content/Context;Landroidx/work/WorkerParameters;)V

    new-instance p1, Lvg/t;

    invoke-direct {p1}, Lvg/t;-><init>()V

    iput-object p1, p0, Lcom/roblox/client/analytics/TelemetryFlushWorker;->a:Lkotlin/jvm/functions/Function0;

    new-instance p1, Lvg/u;

    invoke-direct {p1}, Lvg/u;-><init>()V

    iput-object p1, p0, Lcom/roblox/client/analytics/TelemetryFlushWorker;->b:Lkotlin/jvm/functions/Function0;

    return-void
.end method

.method public static synthetic b()Lkotlin/Unit;
    .locals 1

    invoke-static {}, Lcom/roblox/client/analytics/TelemetryFlushWorker;->h()Lkotlin/Unit;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic c()Lkotlin/Unit;
    .locals 1

    invoke-static {}, Lcom/roblox/client/analytics/TelemetryFlushWorker;->g()Lkotlin/Unit;

    move-result-object v0

    return-object v0
.end method

.method public static final d(Landroid/content/Context;)V
    .locals 1
    .param p0    # Landroid/content/Context;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    sget-object v0, Lcom/roblox/client/analytics/TelemetryFlushWorker;->c:Lcom/roblox/client/analytics/TelemetryFlushWorker$a;

    invoke-virtual {v0, p0}, Lcom/roblox/client/analytics/TelemetryFlushWorker$a;->a(Landroid/content/Context;)V

    return-void
.end method

.method public static final g()Lkotlin/Unit;
    .locals 1

    invoke-static {}, Lcom/roblox/engine/jni/NativeReportingInterface;->flushEngineTelemetryV1Events()V

    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object v0
.end method

.method public static final h()Lkotlin/Unit;
    .locals 1

    invoke-static {}, Lcom/roblox/engine/jni/NativeReportingInterface;->flushEngineTelemetryV2Events()V

    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object v0
.end method


# virtual methods
.method public doWork(Lnt/b;)Ljava/lang/Object;
    .locals 5
    .param p1    # Lnt/b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnt/b<",
            "-",
            "Landroidx/work/c$a;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    instance-of v0, p1, Lcom/roblox/client/analytics/TelemetryFlushWorker$b;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lcom/roblox/client/analytics/TelemetryFlushWorker$b;

    iget v1, v0, Lcom/roblox/client/analytics/TelemetryFlushWorker$b;->v:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/roblox/client/analytics/TelemetryFlushWorker$b;->v:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/roblox/client/analytics/TelemetryFlushWorker$b;

    invoke-direct {v0, p0, p1}, Lcom/roblox/client/analytics/TelemetryFlushWorker$b;-><init>(Lcom/roblox/client/analytics/TelemetryFlushWorker;Lnt/b;)V

    :goto_0
    iget-object p1, v0, Lcom/roblox/client/analytics/TelemetryFlushWorker$b;->t:Ljava/lang/Object;

    invoke-static {}, Lot/c;->e()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, Lcom/roblox/client/analytics/TelemetryFlushWorker$b;->v:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p1}, Ljt/o;->b(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p1}, Ljt/o;->b(Ljava/lang/Object;)V

    invoke-static {}, Lku/g1;->b()Lku/l0;

    move-result-object p1

    new-instance v2, Lcom/roblox/client/analytics/TelemetryFlushWorker$c;

    const/4 v4, 0x0

    invoke-direct {v2, p0, v4}, Lcom/roblox/client/analytics/TelemetryFlushWorker$c;-><init>(Lcom/roblox/client/analytics/TelemetryFlushWorker;Lnt/b;)V

    iput v3, v0, Lcom/roblox/client/analytics/TelemetryFlushWorker$b;->v:I

    invoke-static {p1, v2, v0}, Lku/i;->g(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;Lnt/b;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_3

    return-object v1

    :cond_3
    :goto_1
    const-string v0, "withContext(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public final e()Lkotlin/jvm/functions/Function0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object v0, p0, Lcom/roblox/client/analytics/TelemetryFlushWorker;->a:Lkotlin/jvm/functions/Function0;

    return-object v0
.end method

.method public final f()Lkotlin/jvm/functions/Function0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object v0, p0, Lcom/roblox/client/analytics/TelemetryFlushWorker;->b:Lkotlin/jvm/functions/Function0;

    return-object v0
.end method
