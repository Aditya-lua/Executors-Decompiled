.class public final Lcom/roblox/client/scheduledwork/OtaPollingWorker;
.super Landroidx/work/CoroutineWorker;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/roblox/client/scheduledwork/OtaPollingWorker$a;,
        Lcom/roblox/client/scheduledwork/OtaPollingWorker$b;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\"\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u000b\u0018\u0000 22\u00020\u0001:\u000202B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\u0008H\u0096@\u00a2\u0006\u0004\u0008\t\u0010\nJ*\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u000c\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0082@\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J%\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u000f\u001a\u00020\u000e2\u000c\u0010\u0014\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\u0013H\u0002\u00a2\u0006\u0004\u0008\u0016\u0010\u0017J \u0010\u001b\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\u001a\u001a\u00020\u0019H\u0082@\u00a2\u0006\u0004\u0008\u001b\u0010\u001cJ\u0018\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u0018\u001a\u00020\u000bH\u0082@\u00a2\u0006\u0004\u0008\u001e\u0010\u001fJ\u0017\u0010!\u001a\u00020 2\u0006\u0010\u0018\u001a\u00020\u000bH\u0002\u00a2\u0006\u0004\u0008!\u0010\"J\u000f\u0010$\u001a\u00020#H\u0002\u00a2\u0006\u0004\u0008$\u0010%J\'\u0010*\u001a\u00020\u00152\u0006\u0010&\u001a\u00020\u000b2\u000e\u0008\u0002\u0010)\u001a\u0008\u0012\u0004\u0012\u00020(0\'H\u0002\u00a2\u0006\u0004\u0008*\u0010+J\u0019\u0010-\u001a\u00020\u000b2\u0008\u0010,\u001a\u0004\u0018\u00010\u000bH\u0002\u00a2\u0006\u0004\u0008-\u0010.J\u000f\u0010/\u001a\u00020#H\u0002\u00a2\u0006\u0004\u0008/\u0010%R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u00080\u00101\u00a8\u00063"
    }
    d2 = {
        "Lcom/roblox/client/scheduledwork/OtaPollingWorker;",
        "Landroidx/work/CoroutineWorker;",
        "Landroid/content/Context;",
        "context",
        "Landroidx/work/WorkerParameters;",
        "params",
        "<init>",
        "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V",
        "Landroidx/work/c$a;",
        "doWork",
        "(Lnt/b;)Ljava/lang/Object;",
        "",
        "behaviorName",
        "configUrl",
        "Landroid/content/SharedPreferences;",
        "prefs",
        "Lcom/roblox/client/scheduledwork/OtaPollingWorker$b;",
        "r",
        "(Ljava/lang/String;Ljava/lang/String;Landroid/content/SharedPreferences;Lnt/b;)Ljava/lang/Object;",
        "",
        "behaviorNames",
        "",
        "s",
        "(Landroid/content/SharedPreferences;Ljava/util/Set;)V",
        "url",
        "Ljava/io/File;",
        "dest",
        "j",
        "(Ljava/lang/String;Ljava/io/File;Lnt/b;)Ljava/lang/Object;",
        "Lorg/json/JSONArray;",
        "l",
        "(Ljava/lang/String;Lnt/b;)Ljava/lang/Object;",
        "Ljava/net/HttpURLConnection;",
        "q",
        "(Ljava/lang/String;)Ljava/net/HttpURLConnection;",
        "",
        "m",
        "()Z",
        "eventName",
        "",
        "Lcom/roblox/client/datastructures/NameValuePair;",
        "extraParams",
        "o",
        "(Ljava/lang/String;Ljava/util/List;)V",
        "message",
        "k",
        "(Ljava/lang/String;)Ljava/lang/String;",
        "n",
        "a",
        "Landroid/content/Context;",
        "b",
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
.field public static final b:Lcom/roblox/client/scheduledwork/OtaPollingWorker$a;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final c:J

.field public static final d:J


# instance fields
.field public final a:Landroid/content/Context;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lcom/roblox/client/scheduledwork/OtaPollingWorker$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/roblox/client/scheduledwork/OtaPollingWorker$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/roblox/client/scheduledwork/OtaPollingWorker;->b:Lcom/roblox/client/scheduledwork/OtaPollingWorker$a;

    sget-object v0, Lkotlin/time/a;->b:Lkotlin/time/a$a;

    sget-object v0, Lju/b;->e:Lju/b;

    const/16 v1, 0xa

    invoke-static {v1, v0}, Lkotlin/time/b;->p(ILju/b;)J

    move-result-wide v1

    sput-wide v1, Lcom/roblox/client/scheduledwork/OtaPollingWorker;->c:J

    const/16 v1, 0x1e

    invoke-static {v1, v0}, Lkotlin/time/b;->p(ILju/b;)J

    move-result-wide v0

    sput-wide v0, Lcom/roblox/client/scheduledwork/OtaPollingWorker;->d:J

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

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "params"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1, p2}, Landroidx/work/CoroutineWorker;-><init>(Landroid/content/Context;Landroidx/work/WorkerParameters;)V

    iput-object p1, p0, Lcom/roblox/client/scheduledwork/OtaPollingWorker;->a:Landroid/content/Context;

    return-void
.end method

.method public static synthetic b(Landroid/content/SharedPreferences;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    invoke-static {p0, p1}, Lcom/roblox/client/scheduledwork/OtaPollingWorker;->t(Landroid/content/SharedPreferences;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Ljava/util/List;)Z
    .locals 0

    invoke-static {p0}, Lcom/roblox/client/scheduledwork/OtaPollingWorker;->v(Ljava/util/List;)Z

    move-result p0

    return p0
.end method

.method public static synthetic d(Ljava/util/List;)Ljava/lang/String;
    .locals 0

    invoke-static {p0}, Lcom/roblox/client/scheduledwork/OtaPollingWorker;->w(Ljava/util/List;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Ljava/lang/String;)Ljava/util/List;
    .locals 0

    invoke-static {p0}, Lcom/roblox/client/scheduledwork/OtaPollingWorker;->u(Ljava/lang/String;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic f(Lcom/roblox/client/scheduledwork/OtaPollingWorker;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    invoke-virtual {p0, p1}, Lcom/roblox/client/scheduledwork/OtaPollingWorker;->k(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic g(Lcom/roblox/client/scheduledwork/OtaPollingWorker;Ljava/lang/String;Ljava/util/List;)V
    .locals 0

    invoke-virtual {p0, p1, p2}, Lcom/roblox/client/scheduledwork/OtaPollingWorker;->o(Ljava/lang/String;Ljava/util/List;)V

    return-void
.end method

.method public static final synthetic h(Lcom/roblox/client/scheduledwork/OtaPollingWorker;Ljava/lang/String;Ljava/lang/String;Landroid/content/SharedPreferences;Lnt/b;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/roblox/client/scheduledwork/OtaPollingWorker;->r(Ljava/lang/String;Ljava/lang/String;Landroid/content/SharedPreferences;Lnt/b;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic i(Lcom/roblox/client/scheduledwork/OtaPollingWorker;Landroid/content/SharedPreferences;Ljava/util/Set;)V
    .locals 0

    invoke-virtual {p0, p1, p2}, Lcom/roblox/client/scheduledwork/OtaPollingWorker;->s(Landroid/content/SharedPreferences;Ljava/util/Set;)V

    return-void
.end method

.method public static synthetic p(Lcom/roblox/client/scheduledwork/OtaPollingWorker;Ljava/lang/String;Ljava/util/List;ILjava/lang/Object;)V
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    invoke-static {}, Lkotlin/collections/p;->k()Ljava/util/List;

    move-result-object p2

    :cond_0
    invoke-virtual {p0, p1, p2}, Lcom/roblox/client/scheduledwork/OtaPollingWorker;->o(Ljava/lang/String;Ljava/util/List;)V

    return-void
.end method

.method public static final t(Landroid/content/SharedPreferences;Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "ota_worker_pending_"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const/4 v0, 0x0

    invoke-interface {p0, p1, v0}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static final u(Ljava/lang/String;)Ljava/util/List;
    .locals 7

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, ":"

    filled-new-array {v0}, [Ljava/lang/String;

    move-result-object v2

    const/4 v5, 0x2

    const/4 v6, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x3

    move-object v1, p0

    invoke-static/range {v1 .. v6}, Lkotlin/text/StringsKt;->split$default(Ljava/lang/CharSequence;[Ljava/lang/String;ZIILjava/lang/Object;)Ljava/util/List;

    move-result-object p0

    check-cast p0, Ljava/lang/Iterable;

    const/4 v0, 0x2

    invoke-static {p0, v0}, Lkotlin/collections/CollectionsKt;->H0(Ljava/lang/Iterable;I)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method public static final v(Ljava/util/List;)Z
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result p0

    const/4 v0, 0x2

    if-ne p0, v0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method public static final w(Ljava/util/List;)Ljava/lang/String;
    .locals 3

    const-string v0, "<destruct>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    invoke-interface {p0, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    const/4 v1, 0x1

    invoke-interface {p0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "WorkerBlob_"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "_"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static final x(Landroid/content/Context;)V
    .locals 1
    .param p0    # Landroid/content/Context;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    sget-object v0, Lcom/roblox/client/scheduledwork/OtaPollingWorker;->b:Lcom/roblox/client/scheduledwork/OtaPollingWorker$a;

    invoke-virtual {v0, p0}, Lcom/roblox/client/scheduledwork/OtaPollingWorker$a;->c(Landroid/content/Context;)V

    return-void
.end method


# virtual methods
.method public doWork(Lnt/b;)Ljava/lang/Object;
    .locals 23
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

    move-object/from16 v1, p0

    move-object/from16 v0, p1

    instance-of v2, v0, Lcom/roblox/client/scheduledwork/OtaPollingWorker$c;

    if-eqz v2, :cond_0

    move-object v2, v0

    check-cast v2, Lcom/roblox/client/scheduledwork/OtaPollingWorker$c;

    iget v3, v2, Lcom/roblox/client/scheduledwork/OtaPollingWorker$c;->D:I

    const/high16 v4, -0x80000000

    and-int v5, v3, v4

    if-eqz v5, :cond_0

    sub-int/2addr v3, v4

    iput v3, v2, Lcom/roblox/client/scheduledwork/OtaPollingWorker$c;->D:I

    :goto_0
    move-object v6, v2

    goto :goto_1

    :cond_0
    new-instance v2, Lcom/roblox/client/scheduledwork/OtaPollingWorker$c;

    invoke-direct {v2, v1, v0}, Lcom/roblox/client/scheduledwork/OtaPollingWorker$c;-><init>(Lcom/roblox/client/scheduledwork/OtaPollingWorker;Lnt/b;)V

    goto :goto_0

    :goto_1
    iget-object v0, v6, Lcom/roblox/client/scheduledwork/OtaPollingWorker$c;->B:Ljava/lang/Object;

    invoke-static {}, Lot/c;->e()Ljava/lang/Object;

    move-result-object v7

    iget v2, v6, Lcom/roblox/client/scheduledwork/OtaPollingWorker$c;->D:I

    const-string v8, "retry(...)"

    const/4 v9, 0x1

    const-string v10, "duration_ms"

    const-string v11, "ota_polling_worker_end"

    const-string v12, "run_attempt_count"

    const-string v13, "success(...)"

    const-string v14, "OtaPollingWorker"

    if-eqz v2, :cond_2

    if-ne v2, v9, :cond_1

    iget-wide v2, v6, Lcom/roblox/client/scheduledwork/OtaPollingWorker$c;->A:J

    iget-object v4, v6, Lcom/roblox/client/scheduledwork/OtaPollingWorker$c;->y:Ljava/lang/Object;

    check-cast v4, Ljava/util/Set;

    iget-object v4, v6, Lcom/roblox/client/scheduledwork/OtaPollingWorker$c;->x:Ljava/lang/Object;

    check-cast v4, Landroid/content/SharedPreferences;

    iget-object v4, v6, Lcom/roblox/client/scheduledwork/OtaPollingWorker$c;->w:Ljava/lang/Object;

    check-cast v4, Lkotlin/jvm/internal/y;

    iget-object v5, v6, Lcom/roblox/client/scheduledwork/OtaPollingWorker$c;->v:Ljava/lang/Object;

    check-cast v5, Ljava/lang/String;

    :try_start_0
    invoke-static {v0}, Ljt/o;->b(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-object/from16 v17, v11

    move-object/from16 v18, v12

    move-object/from16 v20, v13

    goto/16 :goto_2

    :catchall_0
    move-exception v0

    move-object v5, v12

    move-wide/from16 v21, v2

    move-object v2, v11

    move-wide/from16 v11, v21

    goto/16 :goto_4

    :catch_0
    move-exception v0

    move-object v5, v12

    move-object/from16 v16, v14

    move-wide/from16 v21, v2

    move-object v2, v11

    move-wide/from16 v11, v21

    goto/16 :goto_3

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    invoke-static {v0}, Ljt/o;->b(Ljava/lang/Object;)V

    invoke-virtual {v1}, Lcom/roblox/client/scheduledwork/OtaPollingWorker;->m()Z

    move-result v0

    const/4 v2, 0x2

    const/4 v3, 0x0

    if-nez v0, :cond_3

    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object v0

    invoke-interface {v0}, Lth/i;->D1()Z

    move-result v0

    if-nez v0, :cond_3

    const-string v0, "ota_polling_worker_flag_disabled_cancelled"

    invoke-static {v1, v0, v3, v2, v3}, Lcom/roblox/client/scheduledwork/OtaPollingWorker;->p(Lcom/roblox/client/scheduledwork/OtaPollingWorker;Ljava/lang/String;Ljava/util/List;ILjava/lang/Object;)V

    sget-object v0, Lcom/roblox/client/scheduledwork/OtaPollingWorker;->b:Lcom/roblox/client/scheduledwork/OtaPollingWorker$a;

    iget-object v2, v1, Lcom/roblox/client/scheduledwork/OtaPollingWorker;->a:Landroid/content/Context;

    invoke-virtual {v0, v2}, Lcom/roblox/client/scheduledwork/OtaPollingWorker$a;->a(Landroid/content/Context;)V

    invoke-static {}, Landroidx/work/c$a;->d()Landroidx/work/c$a;

    move-result-object v0

    invoke-static {v0, v13}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0

    :cond_3
    invoke-virtual {v1}, Landroidx/work/c;->getTags()Ljava/util/Set;

    move-result-object v0

    const-string v4, "background_ota_polling_debug_once"

    invoke-interface {v0, v4}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v15

    iget-object v0, v1, Lcom/roblox/client/scheduledwork/OtaPollingWorker;->a:Landroid/content/Context;

    invoke-static {v0}, Lgk/w;->a(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v9, "OtaPollingWorker started: clientState="

    invoke-virtual {v5, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v9, " isDebugOnce="

    invoke-virtual {v5, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v15}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-static {v14, v5}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    if-nez v15, :cond_4

    const-string v5, "foreground"

    invoke-static {v0, v5}, Lkotlin/jvm/internal/Intrinsics;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_4

    const-string v0, "OtaPollingWorker: app in foreground, skipping (in-process timer active)"

    invoke-static {v14, v0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    const-string v0, "ota_polling_worker_skipped_foreground"

    invoke-static {v1, v0, v3, v2, v3}, Lcom/roblox/client/scheduledwork/OtaPollingWorker;->p(Lcom/roblox/client/scheduledwork/OtaPollingWorker;Ljava/lang/String;Ljava/util/List;ILjava/lang/Object;)V

    invoke-static {}, Landroidx/work/c$a;->d()Landroidx/work/c$a;

    move-result-object v0

    invoke-static {v0, v13}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0

    :cond_4
    invoke-virtual {v1}, Lcom/roblox/client/scheduledwork/OtaPollingWorker;->n()Z

    move-result v5

    if-nez v5, :cond_5

    const-string v0, "OtaPollingWorker: app inactive beyond threshold, cancelling work"

    invoke-static {v14, v0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    const-string v0, "ota_polling_worker_inactivity_cancelled"

    invoke-static {v1, v0, v3, v2, v3}, Lcom/roblox/client/scheduledwork/OtaPollingWorker;->p(Lcom/roblox/client/scheduledwork/OtaPollingWorker;Ljava/lang/String;Ljava/util/List;ILjava/lang/Object;)V

    sget-object v0, Lcom/roblox/client/scheduledwork/OtaPollingWorker;->b:Lcom/roblox/client/scheduledwork/OtaPollingWorker$a;

    iget-object v2, v1, Lcom/roblox/client/scheduledwork/OtaPollingWorker;->a:Landroid/content/Context;

    invoke-virtual {v0, v2}, Lcom/roblox/client/scheduledwork/OtaPollingWorker$a;->a(Landroid/content/Context;)V

    sget-object v0, Lx5/p0;->a:Lx5/p0$a;

    iget-object v2, v1, Lcom/roblox/client/scheduledwork/OtaPollingWorker;->a:Landroid/content/Context;

    invoke-virtual {v0, v2}, Lx5/p0$a;->a(Landroid/content/Context;)Lx5/p0;

    move-result-object v0

    invoke-virtual {v0, v4}, Lx5/p0;->b(Ljava/lang/String;)Lx5/a0;

    invoke-static {}, Landroidx/work/c$a;->d()Landroidx/work/c$a;

    move-result-object v0

    invoke-static {v0, v13}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0

    :cond_5
    invoke-virtual {v1}, Landroidx/work/c;->getInputData()Landroidx/work/b;

    move-result-object v4

    const-string v5, "max_retry_attempts"

    const/4 v9, 0x3

    invoke-virtual {v4, v5, v9}, Landroidx/work/b;->d(Ljava/lang/String;I)I

    move-result v9

    invoke-virtual {v1}, Landroidx/work/c;->getRunAttemptCount()I

    move-result v4

    if-le v4, v9, :cond_6

    invoke-virtual {v1}, Landroidx/work/c;->getRunAttemptCount()I

    move-result v0

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "OtaPollingWorker: exceeded "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v5, " consecutive retries (attempt "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, "), giving up for this period"

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v14, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    const-string v0, "ota_polling_worker_retry_exhausted"

    invoke-static {v1, v0, v3, v2, v3}, Lcom/roblox/client/scheduledwork/OtaPollingWorker;->p(Lcom/roblox/client/scheduledwork/OtaPollingWorker;Ljava/lang/String;Ljava/util/List;ILjava/lang/Object;)V

    invoke-static {}, Landroidx/work/c$a;->a()Landroidx/work/c$a;

    move-result-object v0

    const-string v2, "failure(...)"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0

    :cond_6
    sget-object v2, Lcom/roblox/client/flags/b;->a:Lcom/roblox/client/flags/b;

    invoke-virtual {v2}, Lcom/roblox/client/flags/b;->g()Z

    move-result v2

    new-instance v3, Lcom/roblox/client/datastructures/NameValuePair;

    const-string v4, "native_lib_loaded"

    invoke-static {v2}, Ljava/lang/String;->valueOf(Z)Ljava/lang/String;

    move-result-object v5

    invoke-direct {v3, v4, v5}, Lcom/roblox/client/datastructures/NameValuePair;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v4, Lcom/roblox/client/datastructures/NameValuePair;

    invoke-virtual {v1}, Landroidx/work/c;->getRunAttemptCount()I

    move-result v5

    invoke-static {v5}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v5

    invoke-direct {v4, v12, v5}, Lcom/roblox/client/datastructures/NameValuePair;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    filled-new-array {v3, v4}, [Lcom/roblox/client/datastructures/NameValuePair;

    move-result-object v3

    invoke-static {v3}, Lkotlin/collections/p;->n([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v3

    const-string v4, "ota_polling_worker_start"

    invoke-virtual {v1, v4, v3}, Lcom/roblox/client/scheduledwork/OtaPollingWorker;->o(Ljava/lang/String;Ljava/util/List;)V

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v3

    move-wide/from16 v16, v3

    new-instance v4, Lkotlin/jvm/internal/y;

    invoke-direct {v4}, Lkotlin/jvm/internal/y;-><init>()V

    :try_start_1
    iget-object v3, v1, Lcom/roblox/client/scheduledwork/OtaPollingWorker;->a:Landroid/content/Context;

    invoke-static {v3}, Lcom/roblox/client/scheduledwork/OtaConfigHandler;->getOtaPrefs(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v3

    move v5, v2

    move-object v2, v3

    invoke-static {v2}, Lcom/roblox/client/scheduledwork/OtaConfigHandler;->getActiveBehaviorNames(Landroid/content/SharedPreferences;)Ljava/util/Set;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/Set;->isEmpty()Z

    move-result v18

    if-eqz v18, :cond_7

    const-string v0, "OtaPollingWorker: no behaviors registered yet, nothing to poll"

    invoke-static {v14, v0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    invoke-static {}, Landroidx/work/c$a;->d()Landroidx/work/c$a;

    move-result-object v0

    invoke-static {v0, v13}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v2

    sub-long v2, v2, v16

    new-instance v4, Lcom/roblox/client/datastructures/NameValuePair;

    invoke-static {v2, v3}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v4, v10, v2}, Lcom/roblox/client/datastructures/NameValuePair;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v2, Lcom/roblox/client/datastructures/NameValuePair;

    invoke-virtual {v1}, Landroidx/work/c;->getRunAttemptCount()I

    move-result v3

    invoke-static {v3}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v3

    invoke-direct {v2, v12, v3}, Lcom/roblox/client/datastructures/NameValuePair;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    filled-new-array {v4, v2}, [Lcom/roblox/client/datastructures/NameValuePair;

    move-result-object v2

    invoke-static {v2}, Lkotlin/collections/p;->n([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2

    invoke-virtual {v1, v11, v2}, Lcom/roblox/client/scheduledwork/OtaPollingWorker;->o(Ljava/lang/String;Ljava/util/List;)V

    return-object v0

    :catchall_1
    move-exception v0

    move-object v2, v11

    move-object v5, v12

    move-wide/from16 v11, v16

    goto/16 :goto_4

    :catch_1
    move-exception v0

    move-object v2, v11

    move-object v5, v12

    move-wide/from16 v11, v16

    move-object/from16 v16, v14

    goto/16 :goto_3

    :cond_7
    move/from16 v18, v5

    :try_start_2
    invoke-static {}, Lku/g1;->b()Lku/l0;

    move-result-object v5

    move-object/from16 v19, v0

    new-instance v0, Lcom/roblox/client/scheduledwork/OtaPollingWorker$d;
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    move-object/from16 v20, v5

    const/4 v5, 0x0

    move-object/from16 v21, v20

    move-object/from16 v20, v13

    move-object/from16 v13, v21

    move-wide/from16 v21, v16

    move-object/from16 v17, v11

    move-object/from16 v16, v14

    move/from16 v14, v18

    move-object/from16 v18, v12

    move-wide/from16 v11, v21

    :try_start_3
    invoke-direct/range {v0 .. v5}, Lcom/roblox/client/scheduledwork/OtaPollingWorker$d;-><init>(Lcom/roblox/client/scheduledwork/OtaPollingWorker;Landroid/content/SharedPreferences;Ljava/util/Set;Lkotlin/jvm/internal/y;Lnt/b;)V

    invoke-static/range {v19 .. v19}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    iput-object v5, v6, Lcom/roblox/client/scheduledwork/OtaPollingWorker$c;->v:Ljava/lang/Object;

    iput-object v4, v6, Lcom/roblox/client/scheduledwork/OtaPollingWorker$c;->w:Ljava/lang/Object;

    invoke-static {v2}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    iput-object v2, v6, Lcom/roblox/client/scheduledwork/OtaPollingWorker$c;->x:Ljava/lang/Object;

    invoke-static {v3}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    iput-object v2, v6, Lcom/roblox/client/scheduledwork/OtaPollingWorker$c;->y:Ljava/lang/Object;

    iput-boolean v15, v6, Lcom/roblox/client/scheduledwork/OtaPollingWorker$c;->t:Z

    iput v9, v6, Lcom/roblox/client/scheduledwork/OtaPollingWorker$c;->z:I

    iput-boolean v14, v6, Lcom/roblox/client/scheduledwork/OtaPollingWorker$c;->u:Z

    iput-wide v11, v6, Lcom/roblox/client/scheduledwork/OtaPollingWorker$c;->A:J

    const/4 v2, 0x1

    iput v2, v6, Lcom/roblox/client/scheduledwork/OtaPollingWorker$c;->D:I

    invoke-static {v13, v0, v6}, Lku/i;->g(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;Lnt/b;)Ljava/lang/Object;

    move-result-object v0
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_2
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    if-ne v0, v7, :cond_8

    return-object v7

    :cond_8
    move-wide v2, v11

    :goto_2
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v5

    sub-long/2addr v5, v2

    new-instance v0, Lcom/roblox/client/datastructures/NameValuePair;

    invoke-static {v5, v6}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v10, v2}, Lcom/roblox/client/datastructures/NameValuePair;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v2, Lcom/roblox/client/datastructures/NameValuePair;

    invoke-virtual {v1}, Landroidx/work/c;->getRunAttemptCount()I

    move-result v3

    invoke-static {v3}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v3

    move-object/from16 v5, v18

    invoke-direct {v2, v5, v3}, Lcom/roblox/client/datastructures/NameValuePair;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    filled-new-array {v0, v2}, [Lcom/roblox/client/datastructures/NameValuePair;

    move-result-object v0

    invoke-static {v0}, Lkotlin/collections/p;->n([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    move-object/from16 v2, v17

    invoke-virtual {v1, v2, v0}, Lcom/roblox/client/scheduledwork/OtaPollingWorker;->o(Ljava/lang/String;Ljava/util/List;)V

    iget-boolean v0, v4, Lkotlin/jvm/internal/y;->a:Z

    if-eqz v0, :cond_9

    invoke-static {}, Landroidx/work/c$a;->c()Landroidx/work/c$a;

    move-result-object v0

    invoke-static {v0, v8}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0

    :cond_9
    invoke-static {}, Landroidx/work/c$a;->d()Landroidx/work/c$a;

    move-result-object v0

    move-object/from16 v2, v20

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0

    :catchall_2
    move-exception v0

    move-object/from16 v2, v17

    move-object/from16 v5, v18

    goto :goto_4

    :catch_2
    move-exception v0

    move-object/from16 v2, v17

    move-object/from16 v5, v18

    :goto_3
    :try_start_4
    instance-of v3, v0, Ljava/util/concurrent/CancellationException;

    if-nez v3, :cond_a

    const-string v3, "OtaPollingWorker: fatal error"

    move-object/from16 v4, v16

    invoke-static {v4, v3, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    const-string v3, "ota_polling_worker_error"

    new-instance v4, Lcom/roblox/client/datastructures/NameValuePair;

    const-string v6, "error_type"

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v7

    invoke-virtual {v7}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v7

    invoke-direct {v4, v6, v7}, Lcom/roblox/client/datastructures/NameValuePair;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v6, Lcom/roblox/client/datastructures/NameValuePair;

    const-string v7, "failed_host"

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/roblox/client/scheduledwork/OtaPollingWorker;->k(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v6, v7, v0}, Lcom/roblox/client/datastructures/NameValuePair;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    filled-new-array {v4, v6}, [Lcom/roblox/client/datastructures/NameValuePair;

    move-result-object v0

    invoke-static {v0}, Lkotlin/collections/p;->n([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    invoke-virtual {v1, v3, v0}, Lcom/roblox/client/scheduledwork/OtaPollingWorker;->o(Ljava/lang/String;Ljava/util/List;)V

    invoke-static {}, Landroidx/work/c$a;->c()Landroidx/work/c$a;

    move-result-object v0

    invoke-static {v0, v8}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v3

    sub-long/2addr v3, v11

    new-instance v6, Lcom/roblox/client/datastructures/NameValuePair;

    invoke-static {v3, v4}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v3

    invoke-direct {v6, v10, v3}, Lcom/roblox/client/datastructures/NameValuePair;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v3, Lcom/roblox/client/datastructures/NameValuePair;

    invoke-virtual {v1}, Landroidx/work/c;->getRunAttemptCount()I

    move-result v4

    invoke-static {v4}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v4

    invoke-direct {v3, v5, v4}, Lcom/roblox/client/datastructures/NameValuePair;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    filled-new-array {v6, v3}, [Lcom/roblox/client/datastructures/NameValuePair;

    move-result-object v3

    invoke-static {v3}, Lkotlin/collections/p;->n([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Lcom/roblox/client/scheduledwork/OtaPollingWorker;->o(Ljava/lang/String;Ljava/util/List;)V

    return-object v0

    :catchall_3
    move-exception v0

    goto :goto_4

    :cond_a
    :try_start_5
    throw v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    :goto_4
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v3

    sub-long/2addr v3, v11

    new-instance v6, Lcom/roblox/client/datastructures/NameValuePair;

    invoke-static {v3, v4}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v3

    invoke-direct {v6, v10, v3}, Lcom/roblox/client/datastructures/NameValuePair;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v3, Lcom/roblox/client/datastructures/NameValuePair;

    invoke-virtual {v1}, Landroidx/work/c;->getRunAttemptCount()I

    move-result v4

    invoke-static {v4}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v4

    invoke-direct {v3, v5, v4}, Lcom/roblox/client/datastructures/NameValuePair;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    filled-new-array {v6, v3}, [Lcom/roblox/client/datastructures/NameValuePair;

    move-result-object v3

    invoke-static {v3}, Lkotlin/collections/p;->n([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Lcom/roblox/client/scheduledwork/OtaPollingWorker;->o(Ljava/lang/String;Ljava/util/List;)V

    throw v0
.end method

.method public final j(Ljava/lang/String;Ljava/io/File;Lnt/b;)Ljava/lang/Object;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/io/File;",
            "Lnt/b<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    const-string p3, " dest="

    const-string v0, "OtaPollingWorker"

    new-instance v1, Ljava/io/File;

    invoke-virtual {p2}, Ljava/io/File;->getParent()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p2}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p0}, Landroidx/work/c;->getId()Ljava/util/UUID;

    move-result-object v4

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, ".tmp."

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v1, v2, v3}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    :try_start_0
    invoke-virtual {p0, p1}, Lcom/roblox/client/scheduledwork/OtaPollingWorker;->q(Ljava/lang/String;)Ljava/net/HttpURLConnection;

    move-result-object v2

    invoke-virtual {v2}, Ljava/net/HttpURLConnection;->getResponseCode()I

    move-result v3

    const/16 v4, 0xc8

    if-ne v3, v4, :cond_1

    invoke-virtual {v2}, Ljava/net/URLConnection;->getContentLengthLong()J

    move-result-wide v4

    invoke-virtual {p2}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object p1

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "OtaPollingWorker: blob HTTP "

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v3, " contentLength="

    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v6, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    invoke-virtual {v2}, Ljava/net/URLConnection;->getInputStream()Ljava/io/InputStream;

    move-result-object p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :try_start_1
    new-instance v2, Ljava/io/FileOutputStream;

    invoke-direct {v2, v1}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    const/4 v3, 0x0

    const/4 v4, 0x2

    const/4 v5, 0x0

    invoke-static {p1, v2, v3, v4, v5}, Lut/b;->b(Ljava/io/InputStream;Ljava/io/OutputStream;IILjava/lang/Object;)J
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    :try_start_3
    invoke-static {v2, v5}, Lut/c;->a(Ljava/io/Closeable;Ljava/lang/Throwable;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :try_start_4
    invoke-static {p1, v5}, Lut/c;->a(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    invoke-virtual {v1}, Ljava/io/File;->length()J

    move-result-wide v2

    invoke-virtual {p2}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object p1

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "OtaPollingWorker: blob copy complete size="

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v4, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    invoke-virtual {v1, p2}, Ljava/io/File;->renameTo(Ljava/io/File;)Z

    move-result p1
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_0

    if-eqz p1, :cond_0

    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p1

    :cond_0
    :try_start_5
    new-instance p1, Ljava/io/IOException;

    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "Failed to rename "

    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, " to "

    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_0

    :catch_0
    move-exception p1

    goto :goto_1

    :catchall_0
    move-exception p2

    goto :goto_0

    :catchall_1
    move-exception p2

    :try_start_6
    throw p2
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    :catchall_2
    move-exception p3

    :try_start_7
    invoke-static {v2, p2}, Lut/c;->a(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    throw p3
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    :goto_0
    :try_start_8
    throw p2
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_3

    :catchall_3
    move-exception p3

    :try_start_9
    invoke-static {p1, p2}, Lut/c;->a(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    throw p3

    :cond_1
    new-instance p2, Ljava/io/IOException;

    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "HTTP "

    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, " downloading blob "

    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p2
    :try_end_9
    .catch Ljava/lang/Exception; {:try_start_9 .. :try_end_9} :catch_0

    :goto_1
    invoke-virtual {v1}, Ljava/io/File;->delete()Z

    throw p1
.end method

.method public final k(Ljava/lang/String;)Ljava/lang/String;
    .locals 5

    const-string v0, "unknown"

    if-nez p1, :cond_0

    return-object v0

    :cond_0
    :try_start_0
    sget-object v1, Ljt/n;->b:Ljt/n$a;

    new-instance v1, Ljava/net/URL;

    const-string v2, " "

    const/4 v3, 0x2

    const/4 v4, 0x0

    invoke-static {p1, v2, v4, v3, v4}, Lkotlin/text/StringsKt;->f1(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {v1, p1}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1}, Ljava/net/URL;->getHost()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Ljt/n;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    sget-object v1, Ljt/n;->b:Ljt/n$a;

    invoke-static {p1}, Ljt/o;->a(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Ljt/n;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    :goto_0
    invoke-static {p1}, Ljt/n;->g(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    goto :goto_1

    :cond_1
    move-object v0, p1

    :goto_1
    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public final l(Ljava/lang/String;Lnt/b;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lnt/b<",
            "-",
            "Lorg/json/JSONArray;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-virtual {p0, p1}, Lcom/roblox/client/scheduledwork/OtaPollingWorker;->q(Ljava/lang/String;)Ljava/net/HttpURLConnection;

    move-result-object p2

    invoke-virtual {p2}, Ljava/net/HttpURLConnection;->getResponseCode()I

    move-result v0

    const/16 v1, 0xc8

    if-ne v0, v1, :cond_0

    invoke-virtual {p2}, Ljava/net/URLConnection;->getInputStream()Ljava/io/InputStream;

    move-result-object p1

    const-string p2, "getInputStream(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p2, Lkotlin/text/Charsets;->UTF_8:Ljava/nio/charset/Charset;

    new-instance v0, Ljava/io/InputStreamReader;

    invoke-direct {v0, p1, p2}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;Ljava/nio/charset/Charset;)V

    new-instance p1, Ljava/io/BufferedReader;

    const/16 p2, 0x2000

    invoke-direct {p1, v0, p2}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;I)V

    :try_start_0
    invoke-static {p1}, Lut/n;->h(Ljava/io/Reader;)Ljava/lang/String;

    move-result-object p2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 v0, 0x0

    invoke-static {p1, v0}, Lut/c;->a(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    new-instance p1, Lorg/json/JSONArray;

    invoke-direct {p1, p2}, Lorg/json/JSONArray;-><init>(Ljava/lang/String;)V

    return-object p1

    :catchall_0
    move-exception p2

    :try_start_1
    throw p2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :catchall_1
    move-exception v0

    invoke-static {p1, p2}, Lut/c;->a(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    throw v0

    :cond_0
    new-instance p2, Ljava/io/IOException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "HTTP "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, " fetching "

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p2
.end method

.method public final m()Z
    .locals 3

    invoke-virtual {p0}, Landroidx/work/c;->getInputData()Landroidx/work/b;

    move-result-object v0

    const-string v1, "flags_from_schedule"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroidx/work/b;->c(Ljava/lang/String;Z)Z

    move-result v0

    return v0
.end method

.method public final n()Z
    .locals 7

    iget-object v0, p0, Lcom/roblox/client/scheduledwork/OtaPollingWorker;->a:Landroid/content/Context;

    invoke-static {v0}, Lsg/a1;->U(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v0

    sget-object v1, Lkotlin/time/a;->b:Lkotlin/time/a$a;

    const-string v1, "last_startup_time"

    const-wide/16 v2, 0x0

    invoke-interface {v0, v1, v2, v3}, Landroid/content/SharedPreferences;->getLong(Ljava/lang/String;J)J

    move-result-wide v0

    sget-object v2, Lju/b;->d:Lju/b;

    invoke-static {v0, v1, v2}, Lkotlin/time/b;->q(JLju/b;)J

    move-result-wide v0

    invoke-virtual {p0}, Landroidx/work/c;->getInputData()Landroidx/work/b;

    move-result-object v3

    const-string v4, "inactivity_days"

    const/4 v5, 0x3

    invoke-virtual {v3, v4, v5}, Landroidx/work/b;->d(Ljava/lang/String;I)I

    move-result v3

    int-to-long v3, v3

    sget-object v5, Lju/b;->h:Lju/b;

    invoke-static {v3, v4, v5}, Lkotlin/time/b;->q(JLju/b;)J

    move-result-wide v3

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v5

    invoke-static {v5, v6, v2}, Lkotlin/time/b;->q(JLju/b;)J

    move-result-wide v5

    invoke-static {v5, v6, v0, v1}, Lkotlin/time/a;->L(JJ)J

    move-result-wide v0

    invoke-static {v0, v1, v3, v4}, Lkotlin/time/a;->j(JJ)I

    move-result v0

    if-gtz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final o(Ljava/lang/String;Ljava/util/List;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "+",
            "Lcom/roblox/client/datastructures/NameValuePair;",
            ">;)V"
        }
    .end annotation

    sget-object v0, Lcom/roblox/client/scheduledwork/OtaConfigHandler;->INSTANCE:Lcom/roblox/client/scheduledwork/OtaConfigHandler;

    const-string v1, "background_ota_worker"

    invoke-virtual {v0, p1, v1, p2}, Lcom/roblox/client/scheduledwork/OtaConfigHandler;->logEvent$NativeShell_googleProdRelease(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V

    return-void
.end method

.method public final q(Ljava/lang/String;)Ljava/net/HttpURLConnection;
    .locals 2

    new-instance v0, Ljava/net/URL;

    invoke-direct {v0, p1}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;

    move-result-object p1

    const-string v0, "null cannot be cast to non-null type java.net.HttpURLConnection"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Ljava/net/HttpURLConnection;

    sget-wide v0, Lcom/roblox/client/scheduledwork/OtaPollingWorker;->c:J

    invoke-static {v0, v1}, Lkotlin/time/a;->w(J)J

    move-result-wide v0

    long-to-int v0, v0

    invoke-virtual {p1, v0}, Ljava/net/URLConnection;->setConnectTimeout(I)V

    sget-wide v0, Lcom/roblox/client/scheduledwork/OtaPollingWorker;->d:J

    invoke-static {v0, v1}, Lkotlin/time/a;->w(J)J

    move-result-wide v0

    long-to-int v0, v0

    invoke-virtual {p1, v0}, Ljava/net/URLConnection;->setReadTimeout(I)V

    const-string v0, "GET"

    invoke-virtual {p1, v0}, Ljava/net/HttpURLConnection;->setRequestMethod(Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/net/URLConnection;->connect()V

    return-object p1
.end method

.method public final r(Ljava/lang/String;Ljava/lang/String;Landroid/content/SharedPreferences;Lnt/b;)Ljava/lang/Object;
    .locals 34
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Landroid/content/SharedPreferences;",
            "Lnt/b<",
            "-",
            "Lcom/roblox/client/scheduledwork/OtaPollingWorker$b;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    move-object/from16 v1, p0

    move-object/from16 v0, p1

    move-object/from16 v2, p2

    move-object/from16 v3, p3

    move-object/from16 v4, p4

    instance-of v5, v4, Lcom/roblox/client/scheduledwork/OtaPollingWorker$e;

    if-eqz v5, :cond_0

    move-object v5, v4

    check-cast v5, Lcom/roblox/client/scheduledwork/OtaPollingWorker$e;

    iget v6, v5, Lcom/roblox/client/scheduledwork/OtaPollingWorker$e;->N:I

    const/high16 v7, -0x80000000

    and-int v8, v6, v7

    if-eqz v8, :cond_0

    sub-int/2addr v6, v7

    iput v6, v5, Lcom/roblox/client/scheduledwork/OtaPollingWorker$e;->N:I

    goto :goto_0

    :cond_0
    new-instance v5, Lcom/roblox/client/scheduledwork/OtaPollingWorker$e;

    invoke-direct {v5, v1, v4}, Lcom/roblox/client/scheduledwork/OtaPollingWorker$e;-><init>(Lcom/roblox/client/scheduledwork/OtaPollingWorker;Lnt/b;)V

    :goto_0
    iget-object v4, v5, Lcom/roblox/client/scheduledwork/OtaPollingWorker$e;->L:Ljava/lang/Object;

    invoke-static {}, Lot/c;->e()Ljava/lang/Object;

    move-result-object v6

    iget v7, v5, Lcom/roblox/client/scheduledwork/OtaPollingWorker$e;->N:I

    const-string v8, ")"

    const-string v9, " assetVersion="

    const-string v10, " assetId="

    const/4 v11, 0x2

    const/4 v12, 0x1

    const-string v13, ":"

    const-string v15, "OtaPollingWorker"

    if-eqz v7, :cond_3

    if-eq v7, v12, :cond_2

    if-ne v7, v11, :cond_1

    iget-boolean v0, v5, Lcom/roblox/client/scheduledwork/OtaPollingWorker$e;->K:Z

    iget-wide v2, v5, Lcom/roblox/client/scheduledwork/OtaPollingWorker$e;->I:J

    iget-wide v6, v5, Lcom/roblox/client/scheduledwork/OtaPollingWorker$e;->H:J

    iget-object v11, v5, Lcom/roblox/client/scheduledwork/OtaPollingWorker$e;->G:Ljava/lang/Object;

    check-cast v11, Ljava/lang/String;

    iget-object v11, v5, Lcom/roblox/client/scheduledwork/OtaPollingWorker$e;->F:Ljava/lang/Object;

    check-cast v11, Ljava/lang/String;

    iget-object v11, v5, Lcom/roblox/client/scheduledwork/OtaPollingWorker$e;->E:Ljava/lang/Object;

    check-cast v11, Landroid/net/Uri;

    iget-object v11, v5, Lcom/roblox/client/scheduledwork/OtaPollingWorker$e;->D:Ljava/lang/Object;

    check-cast v11, Ljava/io/File;

    iget-object v12, v5, Lcom/roblox/client/scheduledwork/OtaPollingWorker$e;->C:Ljava/lang/Object;

    check-cast v12, Ljava/lang/Long;

    iget-object v12, v5, Lcom/roblox/client/scheduledwork/OtaPollingWorker$e;->B:Ljava/lang/Object;

    check-cast v12, Ljava/lang/String;

    iget-object v12, v5, Lcom/roblox/client/scheduledwork/OtaPollingWorker$e;->A:Ljava/lang/Object;

    check-cast v12, Lorg/json/JSONObject;

    iget-object v14, v5, Lcom/roblox/client/scheduledwork/OtaPollingWorker$e;->z:Ljava/lang/Object;

    check-cast v14, Lorg/json/JSONArray;

    iget-object v14, v5, Lcom/roblox/client/scheduledwork/OtaPollingWorker$e;->y:Ljava/lang/Object;

    check-cast v14, Ljava/lang/String;

    iget-object v14, v5, Lcom/roblox/client/scheduledwork/OtaPollingWorker$e;->x:Ljava/lang/Object;

    check-cast v14, Ljava/lang/String;

    iget-object v14, v5, Lcom/roblox/client/scheduledwork/OtaPollingWorker$e;->w:Ljava/lang/Object;

    check-cast v14, Ljava/lang/String;

    iget-object v14, v5, Lcom/roblox/client/scheduledwork/OtaPollingWorker$e;->v:Ljava/lang/Object;

    check-cast v14, Landroid/content/SharedPreferences;

    move/from16 p1, v0

    iget-object v0, v5, Lcom/roblox/client/scheduledwork/OtaPollingWorker$e;->u:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    iget-object v0, v5, Lcom/roblox/client/scheduledwork/OtaPollingWorker$e;->t:Ljava/lang/Object;

    move-object v5, v0

    check-cast v5, Ljava/lang/String;

    :try_start_0
    invoke-static {v4}, Ljt/o;->b(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    move/from16 v0, p1

    goto/16 :goto_d

    :catch_0
    move-exception v0

    move-object/from16 v19, v8

    move-object v12, v9

    goto/16 :goto_f

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    iget-object v0, v5, Lcom/roblox/client/scheduledwork/OtaPollingWorker$e;->y:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    iget-object v2, v5, Lcom/roblox/client/scheduledwork/OtaPollingWorker$e;->x:Ljava/lang/Object;

    check-cast v2, Ljava/lang/String;

    iget-object v3, v5, Lcom/roblox/client/scheduledwork/OtaPollingWorker$e;->w:Ljava/lang/Object;

    check-cast v3, Ljava/lang/String;

    iget-object v7, v5, Lcom/roblox/client/scheduledwork/OtaPollingWorker$e;->v:Ljava/lang/Object;

    check-cast v7, Landroid/content/SharedPreferences;

    iget-object v12, v5, Lcom/roblox/client/scheduledwork/OtaPollingWorker$e;->u:Ljava/lang/Object;

    check-cast v12, Ljava/lang/String;

    const/16 p4, 0x0

    iget-object v14, v5, Lcom/roblox/client/scheduledwork/OtaPollingWorker$e;->t:Ljava/lang/Object;

    check-cast v14, Ljava/lang/String;

    invoke-static {v4}, Ljt/o;->b(Ljava/lang/Object;)V

    move-object/from16 v33, v4

    move-object v4, v0

    move-object/from16 v0, v33

    move-object/from16 v33, v7

    move-object v7, v3

    move-object/from16 v3, v33

    goto/16 :goto_1

    :cond_3
    const/16 p4, 0x0

    invoke-static {v4}, Ljt/o;->b(Ljava/lang/Object;)V

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "OtaPollingWorker: polling "

    invoke-virtual {v4, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v7, " from "

    invoke-virtual {v4, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v15, v4}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    sget-object v4, Lcom/roblox/client/scheduledwork/OtaConfigHandler;->INSTANCE:Lcom/roblox/client/scheduledwork/OtaConfigHandler;

    invoke-virtual {v4, v3, v0}, Lcom/roblox/client/scheduledwork/OtaConfigHandler;->getPatchStorageKey(Landroid/content/SharedPreferences;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    const-string v14, " yet, skipping"

    if-nez v7, :cond_4

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "OtaPollingWorker: no patchStorageKey for "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v15, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    return-object p4

    :cond_4
    invoke-virtual {v4, v3}, Lcom/roblox/client/scheduledwork/OtaConfigHandler;->getBaseUrl(Landroid/content/SharedPreferences;)Ljava/lang/String;

    move-result-object v11

    if-nez v11, :cond_5

    const-string v0, "OtaPollingWorker: no base URL for blob download yet, skipping"

    invoke-static {v15, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    return-object p4

    :cond_5
    invoke-virtual {v4, v3, v0}, Lcom/roblox/client/scheduledwork/OtaConfigHandler;->getPerUserPatchKey(Landroid/content/SharedPreferences;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    if-nez v4, :cond_6

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "OtaPollingWorker: no perUserPatchKey for "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v15, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    return-object p4

    :cond_6
    iput-object v0, v5, Lcom/roblox/client/scheduledwork/OtaPollingWorker$e;->t:Ljava/lang/Object;

    invoke-static {v2}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v14

    iput-object v14, v5, Lcom/roblox/client/scheduledwork/OtaPollingWorker$e;->u:Ljava/lang/Object;

    iput-object v3, v5, Lcom/roblox/client/scheduledwork/OtaPollingWorker$e;->v:Ljava/lang/Object;

    iput-object v7, v5, Lcom/roblox/client/scheduledwork/OtaPollingWorker$e;->w:Ljava/lang/Object;

    iput-object v11, v5, Lcom/roblox/client/scheduledwork/OtaPollingWorker$e;->x:Ljava/lang/Object;

    iput-object v4, v5, Lcom/roblox/client/scheduledwork/OtaPollingWorker$e;->y:Ljava/lang/Object;

    iput v12, v5, Lcom/roblox/client/scheduledwork/OtaPollingWorker$e;->N:I

    invoke-virtual {v1, v2, v5}, Lcom/roblox/client/scheduledwork/OtaPollingWorker;->l(Ljava/lang/String;Lnt/b;)Ljava/lang/Object;

    move-result-object v12

    if-ne v12, v6, :cond_7

    move-object v3, v6

    goto/16 :goto_c

    :cond_7
    move-object v14, v0

    move-object v0, v12

    move-object v12, v2

    move-object v2, v11

    :goto_1
    move-object v11, v0

    check-cast v11, Lorg/json/JSONArray;

    invoke-virtual {v11}, Lorg/json/JSONArray;->length()I

    move-result v0

    if-nez v0, :cond_8

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "OtaPollingWorker: empty config array for "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v15, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    return-object p4

    :cond_8
    move-object/from16 p1, v2

    const/4 v2, 0x0

    move-object/from16 p2, v12

    invoke-virtual {v11, v2}, Lorg/json/JSONArray;->optJSONObject(I)Lorg/json/JSONObject;

    move-result-object v12

    if-nez v12, :cond_9

    return-object p4

    :cond_9
    const-string v0, "assetId"

    move-object/from16 p3, v3

    const-wide/16 v2, 0x0

    move-object/from16 v18, v5

    move-object/from16 v17, v6

    invoke-virtual {v12, v0, v2, v3}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;J)J

    move-result-wide v5

    const-string v0, "assetVersion"

    move-object/from16 v19, v8

    move-object/from16 v20, v9

    invoke-virtual {v12, v0, v2, v3}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;J)J

    move-result-wide v8

    cmp-long v0, v5, v2

    if-eqz v0, :cond_a

    cmp-long v0, v8, v2

    if-nez v0, :cond_b

    :cond_a
    move-object/from16 v2, v19

    goto/16 :goto_10

    :cond_b
    invoke-static {}, Lsg/a1;->d1()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1}, Lcom/roblox/client/scheduledwork/OtaPollingWorker;->m()Z

    move-result v0

    if-eqz v0, :cond_c

    invoke-virtual {v1}, Landroidx/work/c;->getInputData()Landroidx/work/b;

    move-result-object v0

    const-string v3, "max_app_version_check"

    move-object/from16 v21, v11

    const/4 v11, 0x0

    invoke-virtual {v0, v3, v11}, Landroidx/work/b;->c(Ljava/lang/String;Z)Z

    move-result v0

    :goto_2
    move v3, v0

    goto :goto_3

    :cond_c
    move-object/from16 v21, v11

    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object v0

    invoke-interface {v0}, Lth/i;->j()Z

    move-result v0

    goto :goto_2

    :goto_3
    const-string v0, "asset_version"

    const-string v11, "behavior_name"

    move/from16 v22, v3

    const-string v3, ", skipping download"

    move-object/from16 v23, v13

    const-string v13, "OtaPollingWorker: "

    move-object/from16 v24, v10

    if-eqz v22, :cond_d

    sget-object v10, Lcom/roblox/client/scheduledwork/OtaPollingWorker;->b:Lcom/roblox/client/scheduledwork/OtaPollingWorker$a;

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {v10, v12, v2}, Lcom/roblox/client/scheduledwork/OtaPollingWorker$a;->b(Lorg/json/JSONObject;Ljava/lang/String;)Z

    move-result v10

    if-eqz v10, :cond_d

    const-string v4, "maxAppVersion"

    invoke-virtual {v12, v4}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v7, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v10, " maxAppVersion "

    invoke-virtual {v7, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v10, " is below app version "

    invoke-virtual {v7, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v15, v3}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    new-instance v3, Lcom/roblox/client/datastructures/NameValuePair;

    invoke-direct {v3, v11, v14}, Lcom/roblox/client/datastructures/NameValuePair;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v7, Lcom/roblox/client/datastructures/NameValuePair;

    const-string v10, "asset_id"

    invoke-static {v5, v6}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v5

    invoke-direct {v7, v10, v5}, Lcom/roblox/client/datastructures/NameValuePair;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v5, Lcom/roblox/client/datastructures/NameValuePair;

    invoke-static {v8, v9}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v6

    invoke-direct {v5, v0, v6}, Lcom/roblox/client/datastructures/NameValuePair;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v0, Lcom/roblox/client/datastructures/NameValuePair;

    const-string v6, "max_app_version"

    invoke-direct {v0, v6, v4}, Lcom/roblox/client/datastructures/NameValuePair;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v4, Lcom/roblox/client/datastructures/NameValuePair;

    const-string v6, "app_version"

    invoke-direct {v4, v6, v2}, Lcom/roblox/client/datastructures/NameValuePair;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    filled-new-array {v3, v7, v5, v0, v4}, [Lcom/roblox/client/datastructures/NameValuePair;

    move-result-object v0

    invoke-static {v0}, Lkotlin/collections/p;->n([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    const-string v2, "ota_polling_worker_incompatible_config_skipped"

    invoke-virtual {v1, v2, v0}, Lcom/roblox/client/scheduledwork/OtaPollingWorker;->o(Ljava/lang/String;Ljava/util/List;)V

    return-object p4

    :cond_d
    sget-object v10, Lcom/roblox/client/scheduledwork/OtaConfigHandler;->INSTANCE:Lcom/roblox/client/scheduledwork/OtaConfigHandler;

    move-object/from16 v25, v2

    move-object/from16 v2, p3

    invoke-virtual {v10, v2, v14}, Lcom/roblox/client/scheduledwork/OtaConfigHandler;->getPendingWorkerBlobVersion(Landroid/content/SharedPreferences;Ljava/lang/String;)Ljava/lang/Long;

    move-result-object v26

    move-object/from16 p3, v12

    if-nez v26, :cond_e

    iget-object v12, v1, Lcom/roblox/client/scheduledwork/OtaPollingWorker;->a:Landroid/content/Context;

    invoke-virtual {v10, v12, v7, v4}, Lcom/roblox/client/scheduledwork/OtaConfigHandler;->getCachedAssetVersionFromAppStorage(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Long;

    move-result-object v26

    :cond_e
    if-nez v26, :cond_f

    goto :goto_4

    :cond_f
    invoke-virtual/range {v26 .. v26}, Ljava/lang/Long;->longValue()J

    move-result-wide v27

    cmp-long v10, v27, v8

    if-nez v10, :cond_10

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, " already at version "

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v8, v9}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v15, v2}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    new-instance v2, Lcom/roblox/client/datastructures/NameValuePair;

    invoke-direct {v2, v11, v14}, Lcom/roblox/client/datastructures/NameValuePair;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v3, Lcom/roblox/client/datastructures/NameValuePair;

    invoke-static {v8, v9}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v4

    invoke-direct {v3, v0, v4}, Lcom/roblox/client/datastructures/NameValuePair;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    filled-new-array {v2, v3}, [Lcom/roblox/client/datastructures/NameValuePair;

    move-result-object v0

    invoke-static {v0}, Lkotlin/collections/p;->n([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    const-string v2, "ota_polling_worker_no_update"

    invoke-virtual {v1, v2, v0}, Lcom/roblox/client/scheduledwork/OtaPollingWorker;->o(Ljava/lang/String;Ljava/util/List;)V

    return-object p4

    :cond_10
    :goto_4
    new-instance v0, Ljava/io/File;

    iget-object v3, v1, Lcom/roblox/client/scheduledwork/OtaPollingWorker;->a:Landroid/content/Context;

    invoke-virtual {v3}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    move-result-object v3

    const-string v10, "appData/OTAWorkerBlobs"

    invoke-direct {v0, v3, v10}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/io/File;->mkdirs()Z

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v10, "WorkerBlob_"

    invoke-virtual {v3, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v5, v6}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v10, "_"

    invoke-virtual {v3, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v8, v9}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    new-instance v11, Ljava/io/File;

    invoke-direct {v11, v0, v3}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    invoke-virtual {v1}, Lcom/roblox/client/scheduledwork/OtaPollingWorker;->m()Z

    move-result v0

    if-eqz v0, :cond_11

    invoke-virtual {v1}, Landroidx/work/c;->getInputData()Landroidx/work/b;

    move-result-object v0

    const-string v3, "debug_mode"

    const/4 v10, 0x0

    invoke-virtual {v0, v3, v10}, Landroidx/work/b;->c(Ljava/lang/String;Z)Z

    move-result v0

    goto :goto_7

    :cond_11
    :try_start_1
    sget-object v0, Ljt/n;->b:Ljt/n$a;

    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object v0

    invoke-interface {v0}, Lth/i;->M5()Z

    move-result v0

    invoke-static {v0}, Lpt/b;->a(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-static {v0}, Ljt/n;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :goto_5
    const/16 v16, 0x0

    goto :goto_6

    :catchall_0
    move-exception v0

    sget-object v3, Ljt/n;->b:Ljt/n$a;

    invoke-static {v0}, Ljt/o;->a(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Ljt/n;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    goto :goto_5

    :goto_6
    invoke-static/range {v16 .. v16}, Lpt/b;->a(Z)Ljava/lang/Boolean;

    move-result-object v3

    invoke-static {v0}, Ljt/n;->g(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_12

    move-object v0, v3

    :cond_12
    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    :goto_7
    if-eqz v0, :cond_13

    invoke-virtual {v11}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v3

    new-instance v10, Ljava/lang/StringBuilder;

    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    const-string v12, "DEV: blobFile path="

    invoke-virtual {v10, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, " perUserPatchKey="

    invoke-virtual {v10, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v15, v3}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    :cond_13
    invoke-virtual {v11}, Ljava/io/File;->exists()Z

    move-result v3

    if-eqz v3, :cond_14

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "OtaPollingWorker: blob for "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, " already on disk, updating pending marker"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v15, v3}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    move-result v3

    invoke-static {v3}, Lpt/b;->d(I)Ljava/lang/Integer;

    move-object/from16 v12, p3

    move-object v3, v2

    move-object/from16 v13, v23

    goto/16 :goto_e

    :cond_14
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v10, "OtaPollingWorker: downloading patch for "

    invoke-virtual {v3, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v10, v24

    invoke-virtual {v3, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v5, v6}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-object/from16 v12, v20

    invoke-virtual {v3, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v8, v9}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v15, v3}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    invoke-static/range {p1 .. p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v3

    invoke-virtual {v3}, Landroid/net/Uri;->getHost()Ljava/lang/String;

    move-result-object v27

    if-eqz v27, :cond_16

    const/16 v31, 0x4

    const/16 v32, 0x0

    const-string v28, "www."

    const-string v29, "assetdelivery."

    const/16 v30, 0x0

    invoke-static/range {v27 .. v32}, Lkotlin/text/x;->P(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Ljava/lang/String;

    move-result-object v13

    if-nez v13, :cond_15

    goto :goto_9

    :cond_15
    :goto_8
    move-object/from16 p4, v3

    goto :goto_a

    :cond_16
    :goto_9
    invoke-virtual {v3}, Landroid/net/Uri;->getHost()Ljava/lang/String;

    move-result-object v13

    goto :goto_8

    :goto_a
    new-instance v3, Landroid/net/Uri$Builder;

    invoke-direct {v3}, Landroid/net/Uri$Builder;-><init>()V

    move-object/from16 v16, v4

    invoke-virtual/range {p4 .. p4}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Landroid/net/Uri$Builder;->scheme(Ljava/lang/String;)Landroid/net/Uri$Builder;

    move-result-object v3

    invoke-virtual/range {p4 .. p4}, Landroid/net/Uri;->getPort()I

    move-result v4

    move-object/from16 v20, v7

    const/4 v7, -0x1

    if-eq v4, v7, :cond_17

    invoke-virtual/range {p4 .. p4}, Landroid/net/Uri;->getPort()I

    move-result v4

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v7, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v24, v13

    move-object/from16 v13, v23

    invoke-virtual {v7, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    goto :goto_b

    :cond_17
    move-object/from16 v24, v13

    move-object/from16 v13, v23

    move-object/from16 v4, v24

    :goto_b
    invoke-virtual {v3, v4}, Landroid/net/Uri$Builder;->encodedAuthority(Ljava/lang/String;)Landroid/net/Uri$Builder;

    move-result-object v3

    const-string v4, "/v1/asset/"

    invoke-virtual {v3, v4}, Landroid/net/Uri$Builder;->path(Ljava/lang/String;)Landroid/net/Uri$Builder;

    move-result-object v3

    const-string v4, "id"

    invoke-static {v5, v6}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v3, v4, v7}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;

    move-result-object v3

    const-string v4, "version"

    invoke-static {v8, v9}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v3, v4, v7}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;

    move-result-object v3

    invoke-virtual {v3}, Landroid/net/Uri$Builder;->build()Landroid/net/Uri;

    move-result-object v3

    invoke-virtual {v3}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object v3

    const-string v4, "toString(...)"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v4, v18

    :try_start_2
    iput-object v14, v4, Lcom/roblox/client/scheduledwork/OtaPollingWorker$e;->t:Ljava/lang/Object;

    invoke-static/range {p2 .. p2}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    iput-object v7, v4, Lcom/roblox/client/scheduledwork/OtaPollingWorker$e;->u:Ljava/lang/Object;

    iput-object v2, v4, Lcom/roblox/client/scheduledwork/OtaPollingWorker$e;->v:Ljava/lang/Object;

    invoke-static/range {v20 .. v20}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    iput-object v7, v4, Lcom/roblox/client/scheduledwork/OtaPollingWorker$e;->w:Ljava/lang/Object;

    invoke-static/range {p1 .. p1}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    iput-object v7, v4, Lcom/roblox/client/scheduledwork/OtaPollingWorker$e;->x:Ljava/lang/Object;

    invoke-static/range {v16 .. v16}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    iput-object v7, v4, Lcom/roblox/client/scheduledwork/OtaPollingWorker$e;->y:Ljava/lang/Object;

    invoke-static/range {v21 .. v21}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    iput-object v7, v4, Lcom/roblox/client/scheduledwork/OtaPollingWorker$e;->z:Ljava/lang/Object;

    move-object/from16 v7, p3

    iput-object v7, v4, Lcom/roblox/client/scheduledwork/OtaPollingWorker$e;->A:Ljava/lang/Object;

    move-object/from16 p3, v2

    invoke-static/range {v25 .. v25}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    iput-object v2, v4, Lcom/roblox/client/scheduledwork/OtaPollingWorker$e;->B:Ljava/lang/Object;

    invoke-static/range {v26 .. v26}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    iput-object v2, v4, Lcom/roblox/client/scheduledwork/OtaPollingWorker$e;->C:Ljava/lang/Object;

    iput-object v11, v4, Lcom/roblox/client/scheduledwork/OtaPollingWorker$e;->D:Ljava/lang/Object;

    invoke-static/range {p4 .. p4}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    iput-object v2, v4, Lcom/roblox/client/scheduledwork/OtaPollingWorker$e;->E:Ljava/lang/Object;

    invoke-static/range {v24 .. v24}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    iput-object v2, v4, Lcom/roblox/client/scheduledwork/OtaPollingWorker$e;->F:Ljava/lang/Object;

    invoke-static {v3}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    iput-object v2, v4, Lcom/roblox/client/scheduledwork/OtaPollingWorker$e;->G:Ljava/lang/Object;

    iput-wide v5, v4, Lcom/roblox/client/scheduledwork/OtaPollingWorker$e;->H:J

    iput-wide v8, v4, Lcom/roblox/client/scheduledwork/OtaPollingWorker$e;->I:J

    move/from16 v2, v22

    iput-boolean v2, v4, Lcom/roblox/client/scheduledwork/OtaPollingWorker$e;->J:Z

    iput-boolean v0, v4, Lcom/roblox/client/scheduledwork/OtaPollingWorker$e;->K:Z

    const/4 v2, 0x2

    iput v2, v4, Lcom/roblox/client/scheduledwork/OtaPollingWorker$e;->N:I

    invoke-virtual {v1, v3, v11, v4}, Lcom/roblox/client/scheduledwork/OtaPollingWorker;->j(Ljava/lang/String;Ljava/io/File;Lnt/b;)Ljava/lang/Object;

    move-result-object v2
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_1

    move-object/from16 v3, v17

    if-ne v2, v3, :cond_18

    :goto_c
    return-object v3

    :cond_18
    move-object v12, v7

    move-wide v2, v8

    move-wide v6, v5

    move-object v5, v14

    move-object/from16 v14, p3

    :goto_d
    move-wide v8, v2

    move-object v3, v14

    move-object v14, v5

    move-wide v5, v6

    :goto_e
    invoke-interface {v3}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "ota_worker_pending_"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v5, v6}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v8, v9}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-interface {v2, v3, v4}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "ota_config_json_"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    sget-object v4, Lcom/roblox/client/scheduledwork/OtaConfigHandler;->INSTANCE:Lcom/roblox/client/scheduledwork/OtaConfigHandler;

    invoke-virtual {v4, v12}, Lcom/roblox/client/scheduledwork/OtaConfigHandler;->buildStorageConfig(Lorg/json/JSONObject;)Lorg/json/JSONObject;

    move-result-object v4

    invoke-virtual {v4}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-interface {v2, v3, v4}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    invoke-interface {v2}, Landroid/content/SharedPreferences$Editor;->apply()V

    if-eqz v0, :cond_19

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "DEV: pending marker written for "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "="

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v5, v6}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v8, v9}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v15, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    :cond_19
    invoke-virtual {v11}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v0

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "OtaPollingWorker: blob downloaded for "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, " at "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v15, v0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    new-instance v0, Lcom/roblox/client/scheduledwork/OtaPollingWorker$b;

    invoke-direct {v0, v5, v6, v8, v9}, Lcom/roblox/client/scheduledwork/OtaPollingWorker$b;-><init>(JJ)V

    return-object v0

    :catch_1
    move-exception v0

    move-wide v6, v5

    move-wide v2, v8

    move-object v5, v14

    :goto_f
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v8

    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    const-string v11, "OtaPollingWorker: download failed for "

    invoke-virtual {v9, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v6, v7}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v2, " ("

    invoke-virtual {v9, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, ": "

    invoke-virtual {v9, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v2, v19

    invoke-virtual {v9, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v15, v2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    throw v0

    :goto_10
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "OtaPollingWorker: invalid patch config for "

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, " (assetId="

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v5, v6}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v3, ", assetVersion="

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v8, v9}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v15, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    return-object p4
.end method

.method public final s(Landroid/content/SharedPreferences;Ljava/util/Set;)V
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/SharedPreferences;",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    invoke-interface {p2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    const-string v2, "OtaPollingWorker"

    const/4 v3, 0x0

    if-eqz v1, :cond_4

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "ota_worker_pending_"

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    const/4 v5, 0x0

    invoke-interface {p1, v4, v5}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    if-nez v6, :cond_1

    goto :goto_0

    :cond_1
    const-string v4, ":"

    filled-new-array {v4}, [Ljava/lang/String;

    move-result-object v7

    const/4 v10, 0x6

    const/4 v11, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    invoke-static/range {v6 .. v11}, Lkotlin/text/StringsKt;->split$default(Ljava/lang/CharSequence;[Ljava/lang/String;ZIILjava/lang/Object;)Ljava/util/List;

    move-result-object v4

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v7

    const/4 v8, 0x2

    if-lt v7, v8, :cond_2

    move-object v5, v4

    :cond_2
    if-nez v5, :cond_3

    goto :goto_0

    :cond_3
    invoke-interface {v5, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    const/4 v4, 0x1

    invoke-interface {v5, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    new-instance v5, Ljava/io/File;

    iget-object v7, p0, Lcom/roblox/client/scheduledwork/OtaPollingWorker;->a:Landroid/content/Context;

    invoke-virtual {v7}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    move-result-object v7

    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    const-string v9, "appData/OTAWorkerBlobs/WorkerBlob_"

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, "_"

    invoke-virtual {v8, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v5, v7, v3}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    invoke-virtual {v5}, Ljava/io/File;->exists()Z

    move-result v3

    if-nez v3, :cond_0

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "OtaPollingWorker: clearing marker for missing blob "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, "="

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    new-instance v2, Lcom/roblox/client/datastructures/NameValuePair;

    const-string v3, "behavior_name"

    invoke-direct {v2, v3, v1}, Lcom/roblox/client/datastructures/NameValuePair;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {v2}, Lkotlin/collections/o;->d(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2

    const-string v3, "ota_polling_worker_orphan_marker_cleared"

    invoke-virtual {p0, v3, v2}, Lcom/roblox/client/scheduledwork/OtaPollingWorker;->o(Ljava/lang/String;Ljava/util/List;)V

    sget-object v2, Lcom/roblox/client/scheduledwork/OtaConfigHandler;->INSTANCE:Lcom/roblox/client/scheduledwork/OtaConfigHandler;

    invoke-virtual {v2, p1, v1}, Lcom/roblox/client/scheduledwork/OtaConfigHandler;->clearPendingWorkerBlob(Landroid/content/SharedPreferences;Ljava/lang/String;)V

    goto/16 :goto_0

    :cond_4
    new-instance v0, Ljava/io/File;

    iget-object v1, p0, Lcom/roblox/client/scheduledwork/OtaPollingWorker;->a:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    move-result-object v1

    const-string v4, "appData/OTAWorkerBlobs"

    invoke-direct {v0, v1, v4}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v1

    if-nez v1, :cond_5

    goto :goto_2

    :cond_5
    check-cast p2, Ljava/lang/Iterable;

    invoke-static {p2}, Lkotlin/collections/CollectionsKt;->U(Ljava/lang/Iterable;)Lkotlin/sequences/Sequence;

    move-result-object p2

    new-instance v1, Luj/a;

    invoke-direct {v1, p1}, Luj/a;-><init>(Landroid/content/SharedPreferences;)V

    invoke-static {p2, v1}, Liu/p;->y(Lkotlin/sequences/Sequence;Lkotlin/jvm/functions/Function1;)Lkotlin/sequences/Sequence;

    move-result-object p1

    new-instance p2, Luj/b;

    invoke-direct {p2}, Luj/b;-><init>()V

    invoke-static {p1, p2}, Liu/p;->x(Lkotlin/sequences/Sequence;Lkotlin/jvm/functions/Function1;)Lkotlin/sequences/Sequence;

    move-result-object p1

    new-instance p2, Luj/c;

    invoke-direct {p2}, Luj/c;-><init>()V

    invoke-static {p1, p2}, Liu/p;->p(Lkotlin/sequences/Sequence;Lkotlin/jvm/functions/Function1;)Lkotlin/sequences/Sequence;

    move-result-object p1

    new-instance p2, Luj/d;

    invoke-direct {p2}, Luj/d;-><init>()V

    invoke-static {p1, p2}, Liu/p;->x(Lkotlin/sequences/Sequence;Lkotlin/jvm/functions/Function1;)Lkotlin/sequences/Sequence;

    move-result-object p1

    invoke-static {p1}, Liu/p;->A(Lkotlin/sequences/Sequence;)Ljava/util/Set;

    move-result-object p1

    invoke-virtual {v0}, Ljava/io/File;->listFiles()[Ljava/io/File;

    move-result-object p2

    if-eqz p2, :cond_7

    array-length v0, p2

    :goto_1
    if-ge v3, v0, :cond_7

    aget-object v1, p2, v3

    invoke-virtual {v1}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v4

    invoke-interface {p1, v4}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_6

    invoke-virtual {v1}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v4

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "OtaPollingWorker: pruning orphaned blob "

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v2, v4}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    new-instance v4, Lcom/roblox/client/datastructures/NameValuePair;

    const-string v5, "blob_name"

    invoke-virtual {v1}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v6

    invoke-direct {v4, v5, v6}, Lcom/roblox/client/datastructures/NameValuePair;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {v4}, Lkotlin/collections/o;->d(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v4

    const-string v5, "ota_polling_worker_orphan_blob_pruned"

    invoke-virtual {p0, v5, v4}, Lcom/roblox/client/scheduledwork/OtaPollingWorker;->o(Ljava/lang/String;Ljava/util/List;)V

    invoke-virtual {v1}, Ljava/io/File;->delete()Z

    :cond_6
    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    :cond_7
    :goto_2
    return-void
.end method
