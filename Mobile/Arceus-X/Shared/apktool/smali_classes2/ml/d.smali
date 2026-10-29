.class public final Lml/d;
.super Lcom/roblox/protocols/systemdialogplatforminterface/generated/ISystemDialogCallback;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0018\u00002\u00020\u0001B\u0011\u0012\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\u00082\u0006\u0010\u0007\u001a\u00020\u0006H\u0016\u00a2\u0006\u0004\u0008\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\u00082\u0006\u0010\u0007\u001a\u00020\u0006H\u0016\u00a2\u0006\u0004\u0008\u000b\u0010\nJ\u0017\u0010\u000c\u001a\u00020\u00082\u0006\u0010\u0007\u001a\u00020\u0006H\u0016\u00a2\u0006\u0004\u0008\u000c\u0010\nJ\u0017\u0010\r\u001a\u00020\u00082\u0006\u0010\u0007\u001a\u00020\u0006H\u0016\u00a2\u0006\u0004\u0008\r\u0010\nJ\u0015\u0010\u0010\u001a\u00020\u00082\u0006\u0010\u000f\u001a\u00020\u000e\u00a2\u0006\u0004\u0008\u0010\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0012\u0010\u0013R\u0014\u0010\u0017\u001a\u00020\u00148\u0002X\u0082D\u00a2\u0006\u0006\n\u0004\u0008\u0015\u0010\u0016R\u001c\u0010\u001c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00190\u00188\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001a\u0010\u001b\u00a8\u0006\u001d"
    }
    d2 = {
        "Lml/d;",
        "Lcom/roblox/protocols/systemdialogplatforminterface/generated/ISystemDialogCallback;",
        "Lku/p0;",
        "coroutineScope",
        "<init>",
        "(Lku/p0;)V",
        "Lcom/roblox/protocols/systemdialogplatforminterface/generated/SystemDialogContext;",
        "context",
        "",
        "onOpened",
        "(Lcom/roblox/protocols/systemdialogplatforminterface/generated/SystemDialogContext;)V",
        "onClosed",
        "onOkClicked",
        "onCancelClicked",
        "Ljava/lang/Runnable;",
        "work",
        "g",
        "(Ljava/lang/Runnable;)V",
        "a",
        "Lku/p0;",
        "",
        "b",
        "Ljava/lang/String;",
        "TAG",
        "Ljava/util/concurrent/atomic/AtomicReference;",
        "Ljava/util/concurrent/CountDownLatch;",
        "c",
        "Ljava/util/concurrent/atomic/AtomicReference;",
        "latch",
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


# instance fields
.field public final a:Lku/p0;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final b:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final c:Ljava/util/concurrent/atomic/AtomicReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/atomic/AtomicReference<",
            "Ljava/util/concurrent/CountDownLatch;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 2

    const/4 v0, 0x0

    const/4 v1, 0x1

    .line 1
    invoke-direct {p0, v0, v1, v0}, Lml/d;-><init>(Lku/p0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Lku/p0;)V
    .locals 1
    .param p1    # Lku/p0;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "coroutineScope"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Lcom/roblox/protocols/systemdialogplatforminterface/generated/ISystemDialogCallback;-><init>()V

    .line 3
    iput-object p1, p0, Lml/d;->a:Lku/p0;

    .line 4
    const-string p1, "rbx.DeferredWorkSystemDialogObserver"

    iput-object p1, p0, Lml/d;->b:Ljava/lang/String;

    .line 5
    new-instance p1, Ljava/util/concurrent/atomic/AtomicReference;

    const/4 v0, 0x0

    invoke-direct {p1, v0}, Ljava/util/concurrent/atomic/AtomicReference;-><init>(Ljava/lang/Object;)V

    iput-object p1, p0, Lml/d;->c:Ljava/util/concurrent/atomic/AtomicReference;

    return-void
.end method

.method public synthetic constructor <init>(Lku/p0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    .line 6
    invoke-static {}, Lku/g1;->a()Lku/l0;

    move-result-object p1

    invoke-static {p1}, Lku/q0;->a(Lkotlin/coroutines/CoroutineContext;)Lku/p0;

    move-result-object p1

    .line 7
    :cond_0
    invoke-direct {p0, p1}, Lml/d;-><init>(Lku/p0;)V

    return-void
.end method

.method public static synthetic a(Ljava/util/concurrent/CountDownLatch;)Ljava/util/concurrent/CountDownLatch;
    .locals 0

    invoke-static {p0}, Lml/d;->f(Ljava/util/concurrent/CountDownLatch;)Ljava/util/concurrent/CountDownLatch;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Ljava/util/concurrent/CountDownLatch;)Ljava/util/concurrent/CountDownLatch;
    .locals 0

    invoke-static {p0}, Lml/d;->e(Ljava/util/concurrent/CountDownLatch;)Ljava/util/concurrent/CountDownLatch;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic c(Lml/d;)Ljava/util/concurrent/atomic/AtomicReference;
    .locals 0

    iget-object p0, p0, Lml/d;->c:Ljava/util/concurrent/atomic/AtomicReference;

    return-object p0
.end method

.method public static final synthetic d(Lml/d;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lml/d;->b:Ljava/lang/String;

    return-object p0
.end method

.method public static final e(Ljava/util/concurrent/CountDownLatch;)Ljava/util/concurrent/CountDownLatch;
    .locals 0

    if-eqz p0, :cond_0

    invoke-virtual {p0}, Ljava/util/concurrent/CountDownLatch;->countDown()V

    :cond_0
    return-object p0
.end method

.method public static final f(Ljava/util/concurrent/CountDownLatch;)Ljava/util/concurrent/CountDownLatch;
    .locals 1

    if-nez p0, :cond_0

    new-instance p0, Ljava/util/concurrent/CountDownLatch;

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Ljava/util/concurrent/CountDownLatch;-><init>(I)V

    :cond_0
    return-object p0
.end method


# virtual methods
.method public final g(Ljava/lang/Runnable;)V
    .locals 7
    .param p1    # Ljava/lang/Runnable;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "work"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v1, p0, Lml/d;->a:Lku/p0;

    new-instance v4, Lml/d$a;

    const/4 v0, 0x0

    invoke-direct {v4, p0, p1, v0}, Lml/d$a;-><init>(Lml/d;Ljava/lang/Runnable;Lnt/b;)V

    const/4 v5, 0x3

    const/4 v6, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static/range {v1 .. v6}, Lku/i;->d(Lku/p0;Lkotlin/coroutines/CoroutineContext;Lku/r0;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lku/d2;

    return-void
.end method

.method public onCancelClicked(Lcom/roblox/protocols/systemdialogplatforminterface/generated/SystemDialogContext;)V
    .locals 1
    .param p1    # Lcom/roblox/protocols/systemdialogplatforminterface/generated/SystemDialogContext;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public onClosed(Lcom/roblox/protocols/systemdialogplatforminterface/generated/SystemDialogContext;)V
    .locals 4
    .param p1    # Lcom/roblox/protocols/systemdialogplatforminterface/generated/SystemDialogContext;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/roblox/protocols/systemdialogplatforminterface/generated/SystemDialogContext;->getId()J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long p1, v0, v2

    if-gez p1, :cond_0

    return-void

    :cond_0
    iget-object p1, p0, Lml/d;->c:Ljava/util/concurrent/atomic/AtomicReference;

    new-instance v0, Lml/c;

    invoke-direct {v0}, Lml/c;-><init>()V

    invoke-virtual {p1, v0}, Ljava/util/concurrent/atomic/AtomicReference;->getAndUpdate(Ljava/util/function/UnaryOperator;)Ljava/lang/Object;

    return-void
.end method

.method public onOkClicked(Lcom/roblox/protocols/systemdialogplatforminterface/generated/SystemDialogContext;)V
    .locals 1
    .param p1    # Lcom/roblox/protocols/systemdialogplatforminterface/generated/SystemDialogContext;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public onOpened(Lcom/roblox/protocols/systemdialogplatforminterface/generated/SystemDialogContext;)V
    .locals 4
    .param p1    # Lcom/roblox/protocols/systemdialogplatforminterface/generated/SystemDialogContext;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/roblox/protocols/systemdialogplatforminterface/generated/SystemDialogContext;->getId()J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long p1, v0, v2

    if-gez p1, :cond_0

    return-void

    :cond_0
    iget-object p1, p0, Lml/d;->c:Ljava/util/concurrent/atomic/AtomicReference;

    new-instance v0, Lml/b;

    invoke-direct {v0}, Lml/b;-><init>()V

    invoke-virtual {p1, v0}, Ljava/util/concurrent/atomic/AtomicReference;->getAndUpdate(Ljava/util/function/UnaryOperator;)Ljava/lang/Object;

    return-void
.end method
