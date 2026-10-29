.class public final Lcom/roblox/client/pushnotification/PushHandlerWorker$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/roblox/client/pushnotification/PushHandlerWorker;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0006\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\u00082\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007\u00a2\u0006\u0004\u0008\t\u0010\nR\u0014\u0010\u000c\u001a\u00020\u000b8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\u0008\u000c\u0010\rR\u0014\u0010\u000e\u001a\u00020\u000b8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\u0008\u000e\u0010\rR\u0014\u0010\u000f\u001a\u00020\u000b8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\u0008\u000f\u0010\rR\u0014\u0010\u0010\u001a\u00020\u000b8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\u0008\u0010\u0010\r\u00a8\u0006\u0011"
    }
    d2 = {
        "Lcom/roblox/client/pushnotification/PushHandlerWorker$a;",
        "",
        "<init>",
        "()V",
        "Landroid/content/Context;",
        "appContext",
        "Lcom/google/firebase/messaging/RemoteMessage;",
        "remoteMessage",
        "",
        "a",
        "(Landroid/content/Context;Lcom/google/firebase/messaging/RemoteMessage;)V",
        "",
        "TAG",
        "Ljava/lang/String;",
        "KEY_PRIORITY",
        "KEY_ORIGINAL_PRIORITY",
        "PUSH_HANDLER_WORK_NAME",
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


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/roblox/client/pushnotification/PushHandlerWorker$a;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Landroid/content/Context;Lcom/google/firebase/messaging/RemoteMessage;)V
    .locals 7
    .param p1    # Landroid/content/Context;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lcom/google/firebase/messaging/RemoteMessage;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "appContext"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "remoteMessage"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lx5/z$a;

    const-class v1, Lcom/roblox/client/pushnotification/PushHandlerWorker;

    invoke-direct {v0, v1}, Lx5/z$a;-><init>(Ljava/lang/Class;)V

    new-instance v1, Lkotlin/jvm/internal/f0;

    const/4 v2, 0x3

    invoke-direct {v1, v2}, Lkotlin/jvm/internal/f0;-><init>(I)V

    invoke-virtual {p2}, Lcom/google/firebase/messaging/RemoteMessage;->y3()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const-string v3, "priority"

    invoke-static {v3, v2}, Ljt/s;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    invoke-virtual {v1, v2}, Lkotlin/jvm/internal/f0;->a(Ljava/lang/Object;)V

    invoke-virtual {p2}, Lcom/google/firebase/messaging/RemoteMessage;->x3()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const-string v3, "originalPriority"

    invoke-static {v3, v2}, Ljt/s;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    invoke-virtual {v1, v2}, Lkotlin/jvm/internal/f0;->a(Ljava/lang/Object;)V

    invoke-virtual {p2}, Lcom/google/firebase/messaging/RemoteMessage;->v3()Ljava/util/Map;

    move-result-object v2

    const-string v3, "getData(...)"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v3, Ljava/util/ArrayList;

    invoke-interface {v2}, Ljava/util/Map;->size()I

    move-result v4

    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v2}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/Map$Entry;

    invoke-interface {v4}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v5

    invoke-interface {v4}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v4

    invoke-static {v5, v4}, Ljt/s;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v4

    invoke-interface {v3, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    new-array v4, v2, [Lkotlin/Pair;

    invoke-interface {v3, v4}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v1, v3}, Lkotlin/jvm/internal/f0;->b(Ljava/lang/Object;)V

    invoke-virtual {v1}, Lkotlin/jvm/internal/f0;->c()I

    move-result v3

    new-array v3, v3, [Lkotlin/Pair;

    invoke-virtual {v1, v3}, Lkotlin/jvm/internal/f0;->d([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [Lkotlin/Pair;

    new-instance v3, Landroidx/work/b$a;

    invoke-direct {v3}, Landroidx/work/b$a;-><init>()V

    array-length v4, v1

    :goto_1
    if-ge v2, v4, :cond_1

    aget-object v5, v1, v2

    invoke-virtual {v5}, Lkotlin/Pair;->c()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/String;

    invoke-virtual {v5}, Lkotlin/Pair;->d()Ljava/lang/Object;

    move-result-object v5

    invoke-virtual {v3, v6, v5}, Landroidx/work/b$a;->b(Ljava/lang/String;Ljava/lang/Object;)Landroidx/work/b$a;

    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_1
    invoke-virtual {v3}, Landroidx/work/b$a;->a()Landroidx/work/b;

    move-result-object v1

    invoke-virtual {v0, v1}, Lx5/q0$a;->o(Landroidx/work/b;)Lx5/q0$a;

    move-result-object v0

    check-cast v0, Lx5/z$a;

    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x1f

    if-lt v1, v2, :cond_2

    invoke-virtual {p2}, Lcom/google/firebase/messaging/RemoteMessage;->y3()I

    move-result p2

    const/4 v1, 0x1

    if-ne p2, v1, :cond_2

    sget-object p2, Lx5/f0;->a:Lx5/f0;

    invoke-virtual {v0, p2}, Lx5/q0$a;->l(Lx5/f0;)Lx5/q0$a;

    :cond_2
    invoke-virtual {v0}, Lx5/q0$a;->b()Lx5/q0;

    move-result-object p2

    check-cast p2, Lx5/z;

    sget-object v0, Lx5/p0;->a:Lx5/p0$a;

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    const-string v1, "getApplicationContext(...)"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Lx5/p0$a;->a(Landroid/content/Context;)Lx5/p0;

    move-result-object p1

    const-string v0, "PushHandlerWorkUniqueWork"

    sget-object v1, Lx5/j;->d:Lx5/j;

    invoke-virtual {p1, v0, v1, p2}, Lx5/p0;->g(Ljava/lang/String;Lx5/j;Lx5/z;)Lx5/a0;

    return-void
.end method
