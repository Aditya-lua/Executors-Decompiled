.class public final Lcom/roblox/protocols/systemdialog/PlatformSystemDialogHandler;
.super Lcom/roblox/protocols/systemdialogplatforminterface/generated/IPlatformSystemDialogHandler;
.source "SourceFile"

# interfaces
.implements Landroid/app/Application$ActivityLifecycleCallbacks;


# annotations
.annotation build Landroidx/annotation/Keep;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/roblox/protocols/systemdialog/PlatformSystemDialogHandler$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u000c\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\t\n\u0002\u0008\u0006\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u00c7\u0002\u0018\u00002\u00020\u00012\u00020\u0002:\u0001:B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0003\u0010\u0004J\u0015\u0010\u0008\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u0015\u0010\n\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\u0004\u0008\n\u0010\tJ\u0015\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000c\u001a\u00020\u000b\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u0015\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000b\u00a2\u0006\u0004\u0008\u0011\u0010\u000fJ!\u0010\u0014\u001a\u00020\r2\u0006\u0010\u000c\u001a\u00020\u000b2\u0008\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0016\u00a2\u0006\u0004\u0008\u0014\u0010\u0015J\u0017\u0010\u0016\u001a\u00020\r2\u0006\u0010\u000c\u001a\u00020\u000bH\u0016\u00a2\u0006\u0004\u0008\u0016\u0010\u000fJ\u0017\u0010\u0017\u001a\u00020\r2\u0006\u0010\u000c\u001a\u00020\u000bH\u0016\u00a2\u0006\u0004\u0008\u0017\u0010\u000fJ\u0017\u0010\u0018\u001a\u00020\r2\u0006\u0010\u000c\u001a\u00020\u000bH\u0016\u00a2\u0006\u0004\u0008\u0018\u0010\u000fJ\u0017\u0010\u0019\u001a\u00020\r2\u0006\u0010\u000c\u001a\u00020\u000bH\u0016\u00a2\u0006\u0004\u0008\u0019\u0010\u000fJ\u001f\u0010\u001b\u001a\u00020\r2\u0006\u0010\u000c\u001a\u00020\u000b2\u0006\u0010\u001a\u001a\u00020\u0012H\u0016\u00a2\u0006\u0004\u0008\u001b\u0010\u0015J\u0017\u0010\u001c\u001a\u00020\r2\u0006\u0010\u000c\u001a\u00020\u000bH\u0016\u00a2\u0006\u0004\u0008\u001c\u0010\u000fJ\u000f\u0010\u001d\u001a\u00020\u0007H\u0016\u00a2\u0006\u0004\u0008\u001d\u0010\u001eJ\u001f\u0010#\u001a\u00020\"2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\u0005H\u0016\u00a2\u0006\u0004\u0008#\u0010$J\u0017\u0010&\u001a\u00020\r2\u0006\u0010%\u001a\u00020\"H\u0016\u00a2\u0006\u0004\u0008&\u0010\'J\u000f\u0010(\u001a\u00020\rH\u0016\u00a2\u0006\u0004\u0008(\u0010\u0004R\u0014\u0010*\u001a\u00020)8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\u0008*\u0010+R\u0014\u0010-\u001a\u00020,8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008-\u0010.R\u0014\u00100\u001a\u00020/8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u00080\u00101R\u001c\u00103\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u00083\u00104R\u001c\u00106\u001a\n\u0012\u0006\u0012\u0004\u0018\u000105028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u00086\u00104R\u001a\u00108\u001a\u0008\u0012\u0004\u0012\u00020\u0005078\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u00088\u00109\u00a8\u0006;"
    }
    d2 = {
        "Lcom/roblox/protocols/systemdialog/PlatformSystemDialogHandler;",
        "Landroid/app/Application$ActivityLifecycleCallbacks;",
        "Lcom/roblox/protocols/systemdialogplatforminterface/generated/IPlatformSystemDialogHandler;",
        "<init>",
        "()V",
        "Lcom/roblox/protocols/systemdialogplatforminterface/generated/ISystemDialogCallback;",
        "observer",
        "",
        "attachObserver",
        "(Lcom/roblox/protocols/systemdialogplatforminterface/generated/ISystemDialogCallback;)Z",
        "detachObserver",
        "Landroid/app/Activity;",
        "activity",
        "",
        "setActivity",
        "(Landroid/app/Activity;)V",
        "activityToMatch",
        "unsetActivityIfMatches",
        "Landroid/os/Bundle;",
        "savedInstanceState",
        "onActivityCreated",
        "(Landroid/app/Activity;Landroid/os/Bundle;)V",
        "onActivityStarted",
        "onActivityStopped",
        "onActivityResumed",
        "onActivityPaused",
        "outState",
        "onActivitySaveInstanceState",
        "onActivityDestroyed",
        "isAvailable",
        "()Z",
        "Lcom/roblox/protocols/systemdialogplatforminterface/generated/SystemDialogRequest;",
        "request",
        "callback",
        "",
        "open",
        "(Lcom/roblox/protocols/systemdialogplatforminterface/generated/SystemDialogRequest;Lcom/roblox/protocols/systemdialogplatforminterface/generated/ISystemDialogCallback;)J",
        "id",
        "dismiss",
        "(J)V",
        "dismissAll",
        "",
        "TAG",
        "Ljava/lang/String;",
        "Lku/p0;",
        "coroutineScope",
        "Lku/p0;",
        "Luu/a;",
        "contextMutex",
        "Luu/a;",
        "Ljava/util/concurrent/atomic/AtomicReference;",
        "currentActivity",
        "Ljava/util/concurrent/atomic/AtomicReference;",
        "Lml/a;",
        "activeBlockingDialog",
        "Ljava/util/Queue;",
        "activeDialogObservers",
        "Ljava/util/Queue;",
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
.field public static final INSTANCE:Lcom/roblox/protocols/systemdialog/PlatformSystemDialogHandler;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private static final TAG:Ljava/lang/String; = "rbx.PlatformSystemDialogHandler"
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private static final activeBlockingDialog:Ljava/util/concurrent/atomic/AtomicReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/atomic/AtomicReference<",
            "Lml/a;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private static final activeDialogObservers:Ljava/util/Queue;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Queue<",
            "Lcom/roblox/protocols/systemdialogplatforminterface/generated/ISystemDialogCallback;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private static final contextMutex:Luu/a;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private static final coroutineScope:Lku/p0;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private static final currentActivity:Ljava/util/concurrent/atomic/AtomicReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/atomic/AtomicReference<",
            "Landroid/app/Activity;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lcom/roblox/protocols/systemdialog/PlatformSystemDialogHandler;

    invoke-direct {v0}, Lcom/roblox/protocols/systemdialog/PlatformSystemDialogHandler;-><init>()V

    sput-object v0, Lcom/roblox/protocols/systemdialog/PlatformSystemDialogHandler;->INSTANCE:Lcom/roblox/protocols/systemdialog/PlatformSystemDialogHandler;

    invoke-static {}, Lku/g1;->c()Lku/n2;

    move-result-object v0

    invoke-static {v0}, Lku/q0;->a(Lkotlin/coroutines/CoroutineContext;)Lku/p0;

    move-result-object v0

    sput-object v0, Lcom/roblox/protocols/systemdialog/PlatformSystemDialogHandler;->coroutineScope:Lku/p0;

    const/4 v0, 0x0

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Luu/g;->b(ZILjava/lang/Object;)Luu/a;

    move-result-object v0

    sput-object v0, Lcom/roblox/protocols/systemdialog/PlatformSystemDialogHandler;->contextMutex:Luu/a;

    new-instance v0, Ljava/util/concurrent/atomic/AtomicReference;

    invoke-direct {v0, v2}, Ljava/util/concurrent/atomic/AtomicReference;-><init>(Ljava/lang/Object;)V

    sput-object v0, Lcom/roblox/protocols/systemdialog/PlatformSystemDialogHandler;->currentActivity:Ljava/util/concurrent/atomic/AtomicReference;

    new-instance v0, Ljava/util/concurrent/atomic/AtomicReference;

    invoke-direct {v0, v2}, Ljava/util/concurrent/atomic/AtomicReference;-><init>(Ljava/lang/Object;)V

    sput-object v0, Lcom/roblox/protocols/systemdialog/PlatformSystemDialogHandler;->activeBlockingDialog:Ljava/util/concurrent/atomic/AtomicReference;

    new-instance v0, Ljava/util/concurrent/ConcurrentLinkedQueue;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentLinkedQueue;-><init>()V

    sput-object v0, Lcom/roblox/protocols/systemdialog/PlatformSystemDialogHandler;->activeDialogObservers:Ljava/util/Queue;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/roblox/protocols/systemdialogplatforminterface/generated/IPlatformSystemDialogHandler;-><init>()V

    return-void
.end method

.method public static synthetic a(JLml/a;)Lml/a;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/roblox/protocols/systemdialog/PlatformSystemDialogHandler;->dismiss$lambda$0(JLml/a;)Lml/a;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$getActiveDialogObservers$p()Ljava/util/Queue;
    .locals 1

    sget-object v0, Lcom/roblox/protocols/systemdialog/PlatformSystemDialogHandler;->activeDialogObservers:Ljava/util/Queue;

    return-object v0
.end method

.method public static final synthetic access$getContextMutex$p()Luu/a;
    .locals 1

    sget-object v0, Lcom/roblox/protocols/systemdialog/PlatformSystemDialogHandler;->contextMutex:Luu/a;

    return-object v0
.end method

.method public static final synthetic access$getCurrentActivity$p()Ljava/util/concurrent/atomic/AtomicReference;
    .locals 1

    sget-object v0, Lcom/roblox/protocols/systemdialog/PlatformSystemDialogHandler;->currentActivity:Ljava/util/concurrent/atomic/AtomicReference;

    return-object v0
.end method

.method public static synthetic b(JLcom/roblox/protocols/systemdialogplatforminterface/generated/ISystemDialogCallback;Lcom/roblox/protocols/systemdialogplatforminterface/generated/SystemDialogRequest;Landroid/app/Activity;)V
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lcom/roblox/protocols/systemdialog/PlatformSystemDialogHandler;->open$lambda$0$0(JLcom/roblox/protocols/systemdialogplatforminterface/generated/ISystemDialogCallback;Lcom/roblox/protocols/systemdialogplatforminterface/generated/SystemDialogRequest;Landroid/app/Activity;)V

    return-void
.end method

.method private static final dismiss$lambda$0(JLml/a;)Lml/a;
    .locals 2

    if-eqz p2, :cond_0

    invoke-virtual {p2}, Lml/a;->e()J

    move-result-wide v0

    cmp-long p0, v0, p0

    if-nez p0, :cond_0

    invoke-virtual {p2}, Lml/a;->b()V

    const/4 p0, 0x0

    return-object p0

    :cond_0
    return-object p2
.end method

.method private static final open$lambda$0$0(JLcom/roblox/protocols/systemdialogplatforminterface/generated/ISystemDialogCallback;Lcom/roblox/protocols/systemdialogplatforminterface/generated/SystemDialogRequest;Landroid/app/Activity;)V
    .locals 2

    new-instance v0, Lml/a;

    new-instance v1, Lcom/roblox/protocols/systemdialog/PlatformSystemDialogHandler$a;

    invoke-direct {v1, p2}, Lcom/roblox/protocols/systemdialog/PlatformSystemDialogHandler$a;-><init>(Lcom/roblox/protocols/systemdialogplatforminterface/generated/ISystemDialogCallback;)V

    invoke-direct {v0, p0, p1, v1}, Lml/a;-><init>(JLcom/roblox/protocols/systemdialogplatforminterface/generated/ISystemDialogCallback;)V

    invoke-virtual {v0, p3, p4}, Lml/a;->a(Lcom/roblox/protocols/systemdialogplatforminterface/generated/SystemDialogRequest;Landroid/app/Activity;)V

    sget-object p0, Lcom/roblox/protocols/systemdialog/PlatformSystemDialogHandler;->activeBlockingDialog:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {p0, v0}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final attachObserver(Lcom/roblox/protocols/systemdialogplatforminterface/generated/ISystemDialogCallback;)Z
    .locals 1
    .param p1    # Lcom/roblox/protocols/systemdialogplatforminterface/generated/ISystemDialogCallback;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "observer"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/roblox/protocols/systemdialog/PlatformSystemDialogHandler;->activeDialogObservers:Ljava/util/Queue;

    invoke-interface {v0, p1}, Ljava/util/Queue;->add(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public final detachObserver(Lcom/roblox/protocols/systemdialogplatforminterface/generated/ISystemDialogCallback;)Z
    .locals 1
    .param p1    # Lcom/roblox/protocols/systemdialogplatforminterface/generated/ISystemDialogCallback;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "observer"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/roblox/protocols/systemdialog/PlatformSystemDialogHandler;->activeDialogObservers:Ljava/util/Queue;

    invoke-interface {v0, p1}, Ljava/util/Collection;->remove(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public dismiss(J)V
    .locals 2

    const-string v0, "rbx.PlatformSystemDialogHandler"

    const-string v1, "Handler call to dismiss."

    invoke-static {v0, v1}, Lgk/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    sget-object v0, Lcom/roblox/protocols/systemdialog/PlatformSystemDialogHandler;->activeBlockingDialog:Ljava/util/concurrent/atomic/AtomicReference;

    new-instance v1, Lml/f;

    invoke-direct {v1, p1, p2}, Lml/f;-><init>(J)V

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicReference;->getAndUpdate(Ljava/util/function/UnaryOperator;)Ljava/lang/Object;

    return-void
.end method

.method public dismissAll()V
    .locals 2

    const-string v0, "rbx.PlatformSystemDialogHandler"

    const-string v1, "Handler call to dismissAll."

    invoke-static {v0, v1}, Lgk/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    sget-object v0, Lcom/roblox/protocols/systemdialog/PlatformSystemDialogHandler;->activeBlockingDialog:Ljava/util/concurrent/atomic/AtomicReference;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicReference;->getAndSet(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lml/a;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lml/a;->b()V

    :cond_0
    return-void
.end method

.method public isAvailable()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public onActivityCreated(Landroid/app/Activity;Landroid/os/Bundle;)V
    .locals 0
    .param p1    # Landroid/app/Activity;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Landroid/os/Bundle;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    const-string p2, "activity"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public onActivityDestroyed(Landroid/app/Activity;)V
    .locals 1
    .param p1    # Landroid/app/Activity;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "activity"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Lcom/roblox/protocols/systemdialog/PlatformSystemDialogHandler;->unsetActivityIfMatches(Landroid/app/Activity;)V

    return-void
.end method

.method public onActivityPaused(Landroid/app/Activity;)V
    .locals 1
    .param p1    # Landroid/app/Activity;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "activity"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Lcom/roblox/protocols/systemdialog/PlatformSystemDialogHandler;->unsetActivityIfMatches(Landroid/app/Activity;)V

    return-void
.end method

.method public onActivityResumed(Landroid/app/Activity;)V
    .locals 1
    .param p1    # Landroid/app/Activity;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "activity"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Lcom/roblox/protocols/systemdialog/PlatformSystemDialogHandler;->setActivity(Landroid/app/Activity;)V

    return-void
.end method

.method public onActivitySaveInstanceState(Landroid/app/Activity;Landroid/os/Bundle;)V
    .locals 1
    .param p1    # Landroid/app/Activity;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Landroid/os/Bundle;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "activity"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "outState"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public onActivityStarted(Landroid/app/Activity;)V
    .locals 1
    .param p1    # Landroid/app/Activity;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "activity"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public onActivityStopped(Landroid/app/Activity;)V
    .locals 1
    .param p1    # Landroid/app/Activity;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "activity"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public open(Lcom/roblox/protocols/systemdialogplatforminterface/generated/SystemDialogRequest;Lcom/roblox/protocols/systemdialogplatforminterface/generated/ISystemDialogCallback;)J
    .locals 10
    .param p1    # Lcom/roblox/protocols/systemdialogplatforminterface/generated/SystemDialogRequest;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lcom/roblox/protocols/systemdialogplatforminterface/generated/ISystemDialogCallback;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "request"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "callback"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "Handler call to open."

    const-string v1, "rbx.PlatformSystemDialogHandler"

    invoke-static {v1, v0}, Lgk/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    sget-object v0, Lcom/roblox/protocols/systemdialog/PlatformSystemDialogHandler;->activeBlockingDialog:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    const-wide/16 v2, -0x1

    if-eqz v0, :cond_0

    const-string p1, "openBlockingDialog: Another dialog is already active. First cancel all dialogs."

    invoke-static {v1, p1}, Lgk/q;->e(Ljava/lang/String;Ljava/lang/String;)I

    return-wide v2

    :cond_0
    sget-object v0, Lcom/roblox/protocols/systemdialog/PlatformSystemDialogHandler;->currentActivity:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v9, v0

    check-cast v9, Landroid/app/Activity;

    if-eqz v9, :cond_1

    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/UUID;->getMostSignificantBits()J

    move-result-wide v0

    const-wide v2, 0x7fffffffffffffffL

    and-long v5, v0, v2

    new-instance v4, Lml/e;

    move-object v8, p1

    move-object v7, p2

    invoke-direct/range {v4 .. v9}, Lml/e;-><init>(JLcom/roblox/protocols/systemdialogplatforminterface/generated/ISystemDialogCallback;Lcom/roblox/protocols/systemdialogplatforminterface/generated/SystemDialogRequest;Landroid/app/Activity;)V

    invoke-virtual {v9, v4}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    return-wide v5

    :cond_1
    const-string p1, "openBlockingDialog: No activity is running."

    invoke-static {v1, p1}, Lgk/q;->e(Ljava/lang/String;Ljava/lang/String;)I

    return-wide v2
.end method

.method public final setActivity(Landroid/app/Activity;)V
    .locals 2
    .param p1    # Landroid/app/Activity;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "activity"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/roblox/protocols/systemdialog/PlatformSystemDialogHandler$b;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, Lcom/roblox/protocols/systemdialog/PlatformSystemDialogHandler$b;-><init>(Landroid/app/Activity;Lnt/b;)V

    const/4 p1, 0x1

    invoke-static {v1, v0, p1, v1}, Lku/i;->f(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public final unsetActivityIfMatches(Landroid/app/Activity;)V
    .locals 2
    .param p1    # Landroid/app/Activity;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "activityToMatch"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/roblox/protocols/systemdialog/PlatformSystemDialogHandler$c;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, Lcom/roblox/protocols/systemdialog/PlatformSystemDialogHandler$c;-><init>(Landroid/app/Activity;Lnt/b;)V

    const/4 p1, 0x1

    invoke-static {v1, v0, p1, v1}, Lku/i;->f(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Ljava/lang/Object;

    return-void
.end method
