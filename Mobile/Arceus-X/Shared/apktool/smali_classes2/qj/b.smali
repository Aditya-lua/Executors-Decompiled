.class public final Lqj/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lqj/b$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u00c6\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003JK\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u00042\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\u0008\u0002\u0010\u0008\u001a\u0004\u0018\u00010\u00062\u0008\u0008\u0002\u0010\n\u001a\u00020\t2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u000c\u0012\u0004\u0012\u00020\r0\u000b\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J.\u0010\u0015\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u0013*\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0011H\u0082@\u00a2\u0006\u0004\u0008\u0015\u0010\u0016R\u0014\u0010\u0018\u001a\u00020\u00118\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0015\u0010\u0017R\u0014\u0010\u001b\u001a\u00020\u00198\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000f\u0010\u001a\u00a8\u0006\u001c"
    }
    d2 = {
        "Lqj/b;",
        "",
        "<init>",
        "()V",
        "Landroid/content/Context;",
        "context",
        "Lcom/roblox/client/pushnotification/v2/richpushnotifications/PushNotificationImageConfig;",
        "largeIconConfig",
        "bigPictureConfig",
        "",
        "timeoutMs",
        "Lkotlin/Function1;",
        "Lqj/a;",
        "",
        "onComplete",
        "c",
        "(Landroid/content/Context;Lcom/roblox/client/pushnotification/v2/richpushnotifications/PushNotificationImageConfig;Lcom/roblox/client/pushnotification/v2/richpushnotifications/PushNotificationImageConfig;JLkotlin/jvm/functions/Function1;)V",
        "Lkotlin/time/a;",
        "timeout",
        "Ljt/n;",
        "Landroid/graphics/Bitmap;",
        "b",
        "(Lcom/roblox/client/pushnotification/v2/richpushnotifications/PushNotificationImageConfig;Landroid/content/Context;JLnt/b;)Ljava/lang/Object;",
        "J",
        "DEFAULT_TIMEOUT",
        "Lku/p0;",
        "Lku/p0;",
        "scope",
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
.field public static final a:Lqj/b;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final b:J

.field public static final c:Lku/p0;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lqj/b;

    invoke-direct {v0}, Lqj/b;-><init>()V

    sput-object v0, Lqj/b;->a:Lqj/b;

    sget-object v0, Lkotlin/time/a;->b:Lkotlin/time/a$a;

    const/4 v0, 0x5

    sget-object v1, Lju/b;->e:Lju/b;

    invoke-static {v0, v1}, Lkotlin/time/b;->p(ILju/b;)J

    move-result-wide v0

    sput-wide v0, Lqj/b;->b:J

    invoke-static {}, Lku/g1;->b()Lku/l0;

    move-result-object v0

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-static {v1, v2, v1}, Lku/z2;->b(Lku/d2;ILjava/lang/Object;)Lku/a0;

    move-result-object v1

    invoke-virtual {v0, v1}, Lkotlin/coroutines/a;->plus(Lkotlin/coroutines/CoroutineContext;)Lkotlin/coroutines/CoroutineContext;

    move-result-object v0

    invoke-static {v0}, Lku/q0;->a(Lkotlin/coroutines/CoroutineContext;)Lku/p0;

    move-result-object v0

    sput-object v0, Lqj/b;->c:Lku/p0;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static final synthetic a(Lqj/b;Lcom/roblox/client/pushnotification/v2/richpushnotifications/PushNotificationImageConfig;Landroid/content/Context;JLnt/b;)Ljava/lang/Object;
    .locals 0

    invoke-virtual/range {p0 .. p5}, Lqj/b;->b(Lcom/roblox/client/pushnotification/v2/richpushnotifications/PushNotificationImageConfig;Landroid/content/Context;JLnt/b;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final b(Lcom/roblox/client/pushnotification/v2/richpushnotifications/PushNotificationImageConfig;Landroid/content/Context;JLnt/b;)Ljava/lang/Object;
    .locals 17
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/roblox/client/pushnotification/v2/richpushnotifications/PushNotificationImageConfig;",
            "Landroid/content/Context;",
            "J",
            "Lnt/b<",
            "-",
            "Ljt/n<",
            "Landroid/graphics/Bitmap;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move-wide/from16 v3, p3

    move-object/from16 v0, p5

    instance-of v5, v0, Lqj/b$b;

    if-eqz v5, :cond_0

    move-object v5, v0

    check-cast v5, Lqj/b$b;

    iget v6, v5, Lqj/b$b;->C:I

    const/high16 v7, -0x80000000

    and-int v8, v6, v7

    if-eqz v8, :cond_0

    sub-int/2addr v6, v7

    iput v6, v5, Lqj/b$b;->C:I

    move-object/from16 v6, p0

    goto :goto_0

    :cond_0
    new-instance v5, Lqj/b$b;

    move-object/from16 v6, p0

    invoke-direct {v5, v6, v0}, Lqj/b$b;-><init>(Lqj/b;Lnt/b;)V

    :goto_0
    iget-object v0, v5, Lqj/b$b;->A:Ljava/lang/Object;

    invoke-static {}, Lot/c;->e()Ljava/lang/Object;

    move-result-object v7

    iget v8, v5, Lqj/b$b;->C:I

    const-string v9, "PushNotificationImageFetcher"

    const/4 v10, 0x3

    const/4 v11, 0x1

    const/4 v12, 0x0

    const/4 v13, 0x0

    if-eqz v8, :cond_2

    if-ne v8, v11, :cond_1

    iget-object v1, v5, Lqj/b$b;->w:Ljava/lang/Object;

    check-cast v1, Lk6/s;

    iget-object v1, v5, Lqj/b$b;->v:Ljava/lang/Object;

    check-cast v1, Lx6/g$a;

    iget-object v1, v5, Lqj/b$b;->u:Ljava/lang/Object;

    check-cast v1, Landroid/content/Context;

    iget-object v1, v5, Lqj/b$b;->t:Ljava/lang/Object;

    check-cast v1, Lcom/roblox/client/pushnotification/v2/richpushnotifications/PushNotificationImageConfig;

    :try_start_0
    invoke-static {v0}, Ljt/o;->b(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto/16 :goto_4

    :catchall_0
    move-exception v0

    goto/16 :goto_5

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    invoke-static {v0}, Ljt/o;->b(Ljava/lang/Object;)V

    if-nez v1, :cond_3

    invoke-static {v13}, Ljt/n;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    return-object v0

    :cond_3
    new-instance v0, Lx6/g$a;

    invoke-direct {v0, v2}, Lx6/g$a;-><init>(Landroid/content/Context;)V

    invoke-virtual {v1}, Lcom/roblox/client/pushnotification/v2/richpushnotifications/PushNotificationImageConfig;->getUrl()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v0, v8}, Lx6/g$a;->c(Ljava/lang/Object;)Lx6/g$a;

    move-result-object v8

    invoke-static {}, Lkotlin/collections/o;->c()Ljava/util/List;

    move-result-object v14

    invoke-virtual {v1}, Lcom/roblox/client/pushnotification/v2/richpushnotifications/PushNotificationImageConfig;->getAddBackgroundColor()Z

    move-result v0

    const/4 v15, 0x2

    if-eqz v0, :cond_4

    new-instance v0, Ljk/a;

    invoke-direct {v0, v2, v12, v15, v13}, Ljk/a;-><init>(Landroid/content/Context;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v14, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_4
    :try_start_1
    sget-object v0, Ljt/n;->b:Ljt/n$a;

    invoke-virtual {v1}, Lcom/roblox/client/pushnotification/v2/richpushnotifications/PushNotificationImageConfig;->getShape()Lqj/c;

    move-result-object v0

    sget-object v16, Lqj/b$a;->a:[I

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    aget v0, v16, v0

    if-eq v0, v11, :cond_7

    if-eq v0, v15, :cond_6

    if-eq v0, v10, :cond_5

    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    goto :goto_1

    :catchall_1
    move-exception v0

    goto :goto_2

    :cond_5
    new-instance v0, Ljk/b;

    const/4 v15, 0x0

    invoke-direct {v0, v15, v11, v13}, Ljk/b;-><init>(FILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v14, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    move-result v0

    invoke-static {v0}, Lpt/b;->a(Z)Ljava/lang/Boolean;

    move-result-object v0

    goto :goto_1

    :cond_6
    new-instance v0, Ljk/c;

    invoke-direct {v0}, Ljk/c;-><init>()V

    invoke-interface {v14, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    move-result v0

    invoke-static {v0}, Lpt/b;->a(Z)Ljava/lang/Boolean;

    move-result-object v0

    goto :goto_1

    :cond_7
    new-instance v0, Lc7/a;

    invoke-direct {v0}, Lc7/a;-><init>()V

    invoke-interface {v14, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    move-result v0

    invoke-static {v0}, Lpt/b;->a(Z)Ljava/lang/Boolean;

    move-result-object v0

    :goto_1
    invoke-static {v0}, Ljt/n;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_3

    :goto_2
    sget-object v15, Ljt/n;->b:Ljt/n$a;

    invoke-static {v0}, Ljt/o;->a(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Ljt/n;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    :goto_3
    invoke-static {v0}, Ljt/n;->e(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v0

    if-eqz v0, :cond_8

    const-string v15, "Error occurred while getting image shape."

    invoke-static {v9, v15, v0}, Lgk/q;->f(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    :cond_8
    invoke-static {v14}, Lkotlin/collections/o;->a(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    invoke-static {v8, v0}, Lx6/i;->i(Lx6/g$a;Ljava/util/List;)Lx6/g$a;

    move-result-object v0

    invoke-static {v2}, Lk6/d0;->a(Landroid/content/Context;)Lk6/s;

    move-result-object v8

    :try_start_2
    new-instance v14, Lqj/b$c;

    invoke-direct {v14, v8, v0, v13}, Lqj/b$c;-><init>(Lk6/s;Lx6/g$a;Lnt/b;)V

    iput-object v1, v5, Lqj/b$b;->t:Ljava/lang/Object;

    invoke-static {v2}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    iput-object v2, v5, Lqj/b$b;->u:Ljava/lang/Object;

    invoke-static {v0}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    iput-object v0, v5, Lqj/b$b;->v:Ljava/lang/Object;

    invoke-static {v8}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    iput-object v0, v5, Lqj/b$b;->w:Ljava/lang/Object;

    iput-wide v3, v5, Lqj/b$b;->x:J

    iput v12, v5, Lqj/b$b;->y:I

    iput v12, v5, Lqj/b$b;->z:I

    iput v11, v5, Lqj/b$b;->C:I

    invoke-static {v3, v4, v14, v5}, Lku/g3;->d(JLkotlin/jvm/functions/Function2;Lnt/b;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v7, :cond_9

    return-object v7

    :cond_9
    :goto_4
    check-cast v0, Lx6/k;

    invoke-static {v0}, Ljt/n;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_6

    :goto_5
    sget-object v2, Ljt/n;->b:Ljt/n$a;

    invoke-static {v0}, Ljt/o;->a(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Ljt/n;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    :goto_6
    invoke-static {v0}, Ljt/n;->h(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_c

    :try_start_3
    check-cast v0, Lx6/k;

    instance-of v2, v0, Lx6/t;

    if-eqz v2, :cond_a

    check-cast v0, Lx6/t;

    invoke-virtual {v0}, Lx6/t;->p()Lk6/n;

    move-result-object v0

    invoke-static {v0, v12, v12, v10, v13}, Lk6/v;->g(Lk6/n;IIILjava/lang/Object;)Landroid/graphics/Bitmap;

    move-result-object v0

    invoke-static {v0}, Ljt/n;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    goto :goto_8

    :catchall_2
    move-exception v0

    goto :goto_7

    :cond_a
    instance-of v2, v0, Lx6/e;

    if-eqz v2, :cond_b

    check-cast v0, Lx6/e;

    invoke-virtual {v0}, Lx6/e;->b()Ljava/lang/Throwable;

    move-result-object v0

    throw v0

    :cond_b
    new-instance v0, Ljt/l;

    invoke-direct {v0}, Ljt/l;-><init>()V

    throw v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    :goto_7
    sget-object v2, Ljt/n;->b:Ljt/n$a;

    invoke-static {v0}, Ljt/o;->a(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object v0

    :cond_c
    invoke-static {v0}, Ljt/n;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    :goto_8
    invoke-static {v0}, Ljt/n;->e(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v2

    if-eqz v2, :cond_d

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Error loading image. "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v9, v1, v2}, Lgk/q;->f(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    :cond_d
    return-object v0
.end method

.method public final c(Landroid/content/Context;Lcom/roblox/client/pushnotification/v2/richpushnotifications/PushNotificationImageConfig;Lcom/roblox/client/pushnotification/v2/richpushnotifications/PushNotificationImageConfig;JLkotlin/jvm/functions/Function1;)V
    .locals 8
    .param p1    # Landroid/content/Context;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lcom/roblox/client/pushnotification/v2/richpushnotifications/PushNotificationImageConfig;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p3    # Lcom/roblox/client/pushnotification/v2/richpushnotifications/PushNotificationImageConfig;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p6    # Lkotlin/jvm/functions/Function1;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Lcom/roblox/client/pushnotification/v2/richpushnotifications/PushNotificationImageConfig;",
            "Lcom/roblox/client/pushnotification/v2/richpushnotifications/PushNotificationImageConfig;",
            "J",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lqj/a;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onComplete"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v3, p1

    sget-object p1, Lqj/b;->c:Lku/p0;

    new-instance v0, Lqj/b$d;

    const/4 v7, 0x0

    move-object v2, p2

    move-object v6, p3

    move-wide v4, p4

    move-object v1, p6

    invoke-direct/range {v0 .. v7}, Lqj/b$d;-><init>(Lkotlin/jvm/functions/Function1;Lcom/roblox/client/pushnotification/v2/richpushnotifications/PushNotificationImageConfig;Landroid/content/Context;JLcom/roblox/client/pushnotification/v2/richpushnotifications/PushNotificationImageConfig;Lnt/b;)V

    move-object p4, v0

    const/4 p5, 0x3

    const/4 p6, 0x0

    const/4 p2, 0x0

    const/4 p3, 0x0

    invoke-static/range {p1 .. p6}, Lku/i;->d(Lku/p0;Lkotlin/coroutines/CoroutineContext;Lku/r0;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lku/d2;

    return-void
.end method
