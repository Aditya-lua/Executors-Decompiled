.class public final Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger$TrackingEventsWorker;
.super Landroidx/work/CoroutineWorker;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "TrackingEventsWorker"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\u0008H\u0096@\u00a2\u0006\u0004\u0008\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0003\u0010\u000b\u00a8\u0006\u000c"
    }
    d2 = {
        "Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger$TrackingEventsWorker;",
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
        "Landroid/content/Context;",
        "tracking-events_release"
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
.field private final context:Landroid/content/Context;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroidx/work/WorkerParameters;)V
    .locals 0
    .param p1    # Landroid/content/Context;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Landroidx/work/WorkerParameters;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-direct {p0, p1, p2}, Landroidx/work/CoroutineWorker;-><init>(Landroid/content/Context;Landroidx/work/WorkerParameters;)V

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger$TrackingEventsWorker;->context:Landroid/content/Context;

    return-void
.end method


# virtual methods
.method public doWork(Lnt/b;)Ljava/lang/Object;
    .locals 20
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

    instance-of v2, v0, Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger$TrackingEventsWorker$doWork$1;

    if-eqz v2, :cond_0

    move-object v2, v0

    check-cast v2, Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger$TrackingEventsWorker$doWork$1;

    iget v3, v2, Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger$TrackingEventsWorker$doWork$1;->label:I

    const/high16 v4, -0x80000000

    and-int v5, v3, v4

    if-eqz v5, :cond_0

    sub-int/2addr v3, v4

    iput v3, v2, Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger$TrackingEventsWorker$doWork$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v2, Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger$TrackingEventsWorker$doWork$1;

    invoke-direct {v2, v1, v0}, Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger$TrackingEventsWorker$doWork$1;-><init>(Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger$TrackingEventsWorker;Lnt/b;)V

    :goto_0
    iget-object v0, v2, Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger$TrackingEventsWorker$doWork$1;->result:Ljava/lang/Object;

    invoke-static {}, Lot/c;->e()Ljava/lang/Object;

    move-result-object v3

    iget v4, v2, Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger$TrackingEventsWorker$doWork$1;->label:I

    const-string v5, "error_stacktrace"

    const-string v6, "error_message"

    const/4 v7, 0x2

    const/4 v10, 0x0

    packed-switch v4, :pswitch_data_0

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_0
    iget-object v3, v2, Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger$TrackingEventsWorker$doWork$1;->L$2:Ljava/lang/Object;

    check-cast v3, Ljava/lang/Throwable;

    iget-object v4, v2, Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger$TrackingEventsWorker$doWork$1;->L$1:Ljava/lang/Object;

    check-cast v4, Ljava/io/File;

    iget-object v2, v2, Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger$TrackingEventsWorker$doWork$1;->L$0:Ljava/lang/Object;

    check-cast v2, Ljava/lang/String;

    invoke-static {v0}, Ljt/o;->b(Ljava/lang/Object;)V

    goto/16 :goto_13

    :pswitch_1
    iget-object v3, v2, Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger$TrackingEventsWorker$doWork$1;->L$4:Ljava/lang/Object;

    check-cast v3, Landroidx/work/c$a;

    iget-object v4, v2, Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger$TrackingEventsWorker$doWork$1;->L$3:Ljava/lang/Object;

    check-cast v4, Landroidx/work/b;

    iget-object v4, v2, Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger$TrackingEventsWorker$doWork$1;->L$2:Ljava/lang/Object;

    check-cast v4, Ljava/lang/Exception;

    iget-object v4, v2, Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger$TrackingEventsWorker$doWork$1;->L$1:Ljava/lang/Object;

    check-cast v4, Ljava/io/File;

    iget-object v2, v2, Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger$TrackingEventsWorker$doWork$1;->L$0:Ljava/lang/Object;

    check-cast v2, Ljava/lang/String;

    invoke-static {v0}, Ljt/o;->b(Ljava/lang/Object;)V

    return-object v3

    :pswitch_2
    iget-object v3, v2, Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger$TrackingEventsWorker$doWork$1;->L$8:Ljava/lang/Object;

    check-cast v3, Landroidx/work/c$a;

    iget-object v4, v2, Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger$TrackingEventsWorker$doWork$1;->L$6:Ljava/lang/Object;

    check-cast v4, Lcom/withpersona/sdk2/inquiry/tracking/network/EncryptedTrackingEventsRequest;

    iget-object v4, v2, Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger$TrackingEventsWorker$doWork$1;->L$5:Ljava/lang/Object;

    check-cast v4, Lum/h;

    iget-object v4, v2, Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger$TrackingEventsWorker$doWork$1;->L$4:Ljava/lang/Object;

    check-cast v4, Ljava/lang/String;

    iget-object v4, v2, Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger$TrackingEventsWorker$doWork$1;->L$3:Ljava/lang/Object;

    check-cast v4, Ljava/lang/String;

    iget-object v4, v2, Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger$TrackingEventsWorker$doWork$1;->L$2:Ljava/lang/Object;

    check-cast v4, Ljava/lang/String;

    iget-object v4, v2, Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger$TrackingEventsWorker$doWork$1;->L$1:Ljava/lang/Object;

    check-cast v4, Ljava/io/File;

    iget-object v2, v2, Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger$TrackingEventsWorker$doWork$1;->L$0:Ljava/lang/Object;

    check-cast v2, Ljava/lang/String;

    invoke-static {v0}, Ljt/o;->b(Ljava/lang/Object;)V

    return-object v3

    :pswitch_3
    iget v4, v2, Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger$TrackingEventsWorker$doWork$1;->I$0:I

    iget-object v11, v2, Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger$TrackingEventsWorker$doWork$1;->L$6:Ljava/lang/Object;

    check-cast v11, Lcom/withpersona/sdk2/inquiry/tracking/network/EncryptedTrackingEventsRequest;

    iget-object v12, v2, Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger$TrackingEventsWorker$doWork$1;->L$5:Ljava/lang/Object;

    check-cast v12, Lum/h;

    iget-object v13, v2, Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger$TrackingEventsWorker$doWork$1;->L$4:Ljava/lang/Object;

    check-cast v13, Ljava/lang/String;

    iget-object v14, v2, Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger$TrackingEventsWorker$doWork$1;->L$3:Ljava/lang/Object;

    check-cast v14, Ljava/lang/String;

    iget-object v15, v2, Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger$TrackingEventsWorker$doWork$1;->L$2:Ljava/lang/Object;

    check-cast v15, Ljava/lang/String;

    iget-object v8, v2, Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger$TrackingEventsWorker$doWork$1;->L$1:Ljava/lang/Object;

    check-cast v8, Ljava/io/File;

    iget-object v9, v2, Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger$TrackingEventsWorker$doWork$1;->L$0:Ljava/lang/Object;

    check-cast v9, Ljava/lang/String;

    :try_start_0
    invoke-static {v0}, Ljt/o;->b(Ljava/lang/Object;)V

    check-cast v0, Ljt/n;

    invoke-virtual {v0}, Ljt/n;->j()Ljava/lang/Object;

    move-result-object v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_3

    goto/16 :goto_2

    :catch_0
    move-exception v0

    goto/16 :goto_c

    :pswitch_4
    iget-object v3, v2, Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger$TrackingEventsWorker$doWork$1;->L$7:Ljava/lang/Object;

    check-cast v3, Landroidx/work/c$a;

    iget-object v4, v2, Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger$TrackingEventsWorker$doWork$1;->L$6:Ljava/lang/Object;

    check-cast v4, Lcom/withpersona/sdk2/inquiry/tracking/network/EncryptedTrackingEventsRequest;

    iget-object v4, v2, Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger$TrackingEventsWorker$doWork$1;->L$5:Ljava/lang/Object;

    check-cast v4, Lum/h;

    iget-object v4, v2, Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger$TrackingEventsWorker$doWork$1;->L$4:Ljava/lang/Object;

    check-cast v4, Ljava/lang/String;

    iget-object v4, v2, Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger$TrackingEventsWorker$doWork$1;->L$3:Ljava/lang/Object;

    check-cast v4, Ljava/lang/String;

    iget-object v4, v2, Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger$TrackingEventsWorker$doWork$1;->L$2:Ljava/lang/Object;

    check-cast v4, Ljava/lang/String;

    iget-object v4, v2, Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger$TrackingEventsWorker$doWork$1;->L$1:Ljava/lang/Object;

    check-cast v4, Ljava/io/File;

    iget-object v2, v2, Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger$TrackingEventsWorker$doWork$1;->L$0:Ljava/lang/Object;

    check-cast v2, Ljava/lang/String;

    invoke-static {v0}, Ljt/o;->b(Ljava/lang/Object;)V

    return-object v3

    :pswitch_5
    iget-object v3, v2, Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger$TrackingEventsWorker$doWork$1;->L$5:Ljava/lang/Object;

    check-cast v3, Landroidx/work/c$a;

    iget-object v4, v2, Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger$TrackingEventsWorker$doWork$1;->L$4:Ljava/lang/Object;

    check-cast v4, Ljava/lang/String;

    iget-object v4, v2, Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger$TrackingEventsWorker$doWork$1;->L$3:Ljava/lang/Object;

    check-cast v4, Ljava/lang/String;

    iget-object v4, v2, Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger$TrackingEventsWorker$doWork$1;->L$2:Ljava/lang/Object;

    check-cast v4, Ljava/lang/String;

    iget-object v4, v2, Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger$TrackingEventsWorker$doWork$1;->L$1:Ljava/lang/Object;

    check-cast v4, Ljava/io/File;

    iget-object v2, v2, Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger$TrackingEventsWorker$doWork$1;->L$0:Ljava/lang/Object;

    check-cast v2, Ljava/lang/String;

    invoke-static {v0}, Ljt/o;->b(Ljava/lang/Object;)V

    return-object v3

    :pswitch_6
    iget-object v3, v2, Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger$TrackingEventsWorker$doWork$1;->L$3:Ljava/lang/Object;

    check-cast v3, Landroidx/work/c$a;

    iget-object v4, v2, Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger$TrackingEventsWorker$doWork$1;->L$2:Ljava/lang/Object;

    check-cast v4, Ljava/lang/String;

    iget-object v4, v2, Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger$TrackingEventsWorker$doWork$1;->L$1:Ljava/lang/Object;

    check-cast v4, Ljava/lang/String;

    iget-object v2, v2, Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger$TrackingEventsWorker$doWork$1;->L$0:Ljava/lang/Object;

    check-cast v2, Ljava/lang/String;

    invoke-static {v0}, Ljt/o;->b(Ljava/lang/Object;)V

    return-object v3

    :pswitch_7
    iget-object v3, v2, Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger$TrackingEventsWorker$doWork$1;->L$2:Ljava/lang/Object;

    check-cast v3, Landroidx/work/c$a;

    iget-object v4, v2, Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger$TrackingEventsWorker$doWork$1;->L$1:Ljava/lang/Object;

    check-cast v4, Ljava/lang/String;

    iget-object v2, v2, Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger$TrackingEventsWorker$doWork$1;->L$0:Ljava/lang/Object;

    check-cast v2, Ljava/lang/String;

    invoke-static {v0}, Ljt/o;->b(Ljava/lang/Object;)V

    return-object v3

    :pswitch_8
    iget-object v3, v2, Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger$TrackingEventsWorker$doWork$1;->L$1:Ljava/lang/Object;

    check-cast v3, Landroidx/work/c$a;

    iget-object v2, v2, Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger$TrackingEventsWorker$doWork$1;->L$0:Ljava/lang/Object;

    check-cast v2, Ljava/lang/String;

    invoke-static {v0}, Ljt/o;->b(Ljava/lang/Object;)V

    return-object v3

    :pswitch_9
    iget-object v2, v2, Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger$TrackingEventsWorker$doWork$1;->L$0:Ljava/lang/Object;

    check-cast v2, Landroidx/work/c$a;

    invoke-static {v0}, Ljt/o;->b(Ljava/lang/Object;)V

    return-object v2

    :pswitch_a
    invoke-static {v0}, Ljt/o;->b(Ljava/lang/Object;)V

    :try_start_1
    invoke-virtual {v1}, Landroidx/work/c;->getInputData()Landroidx/work/b;

    move-result-object v0

    const-string v4, "flush_token"

    invoke-virtual {v0, v4}, Landroidx/work/b;->g(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    if-nez v4, :cond_1

    invoke-static {}, Landroidx/work/c$a;->a()Landroidx/work/c$a;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    return-object v0

    :catchall_0
    move-exception v0

    goto/16 :goto_a

    :catch_1
    move-exception v0

    goto/16 :goto_b

    :cond_1
    :try_start_2
    invoke-virtual {v1}, Landroidx/work/c;->getInputData()Landroidx/work/b;

    move-result-object v0

    const-string v8, "session_token"

    invoke-virtual {v0, v8}, Landroidx/work/b;->g(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v15

    if-nez v15, :cond_3

    invoke-static {}, Landroidx/work/c$a;->a()Landroidx/work/c$a;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    sget-object v5, Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsCache;->Companion:Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsCache$Companion;

    invoke-virtual {v5}, Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsCache$Companion;->getInstance()Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsCache;

    move-result-object v5

    if-eqz v5, :cond_2

    invoke-static {v4}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    iput-object v6, v2, Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger$TrackingEventsWorker$doWork$1;->L$0:Ljava/lang/Object;

    iput-object v0, v2, Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger$TrackingEventsWorker$doWork$1;->L$1:Ljava/lang/Object;

    iput v10, v2, Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger$TrackingEventsWorker$doWork$1;->I$0:I

    iput v7, v2, Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger$TrackingEventsWorker$doWork$1;->label:I

    invoke-virtual {v5, v4, v10, v2}, Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsCache;->onFlushFinished(Ljava/lang/String;ZLnt/b;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v3, :cond_2

    goto/16 :goto_12

    :cond_2
    return-object v0

    :catchall_1
    move-exception v0

    goto/16 :goto_7

    :catch_2
    move-exception v0

    goto/16 :goto_9

    :cond_3
    :try_start_3
    invoke-virtual {v1}, Landroidx/work/c;->getInputData()Landroidx/work/b;

    move-result-object v0

    const-string v8, "server_endpoint"

    invoke-virtual {v0, v8}, Landroidx/work/b;->g(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v14

    if-nez v14, :cond_5

    invoke-static {}, Landroidx/work/c$a;->a()Landroidx/work/c$a;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_2
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    sget-object v5, Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsCache;->Companion:Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsCache$Companion;

    invoke-virtual {v5}, Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsCache$Companion;->getInstance()Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsCache;

    move-result-object v5

    if-eqz v5, :cond_4

    invoke-static {v4}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    iput-object v6, v2, Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger$TrackingEventsWorker$doWork$1;->L$0:Ljava/lang/Object;

    invoke-static {v15}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    iput-object v6, v2, Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger$TrackingEventsWorker$doWork$1;->L$1:Ljava/lang/Object;

    iput-object v0, v2, Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger$TrackingEventsWorker$doWork$1;->L$2:Ljava/lang/Object;

    iput v10, v2, Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger$TrackingEventsWorker$doWork$1;->I$0:I

    const/4 v6, 0x3

    iput v6, v2, Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger$TrackingEventsWorker$doWork$1;->label:I

    invoke-virtual {v5, v4, v10, v2}, Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsCache;->onFlushFinished(Ljava/lang/String;ZLnt/b;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v3, :cond_4

    goto/16 :goto_12

    :cond_4
    return-object v0

    :cond_5
    :try_start_4
    invoke-virtual {v1}, Landroidx/work/c;->getInputData()Landroidx/work/b;

    move-result-object v0

    const-string v8, "encrypted_request_file"

    invoke-virtual {v0, v8}, Landroidx/work/b;->g(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v13

    if-nez v13, :cond_7

    invoke-static {}, Landroidx/work/c$a;->a()Landroidx/work/c$a;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_2
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    sget-object v5, Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsCache;->Companion:Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsCache$Companion;

    invoke-virtual {v5}, Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsCache$Companion;->getInstance()Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsCache;

    move-result-object v5

    if-eqz v5, :cond_6

    invoke-static {v4}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    iput-object v6, v2, Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger$TrackingEventsWorker$doWork$1;->L$0:Ljava/lang/Object;

    invoke-static {v15}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    iput-object v6, v2, Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger$TrackingEventsWorker$doWork$1;->L$1:Ljava/lang/Object;

    invoke-static {v14}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    iput-object v6, v2, Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger$TrackingEventsWorker$doWork$1;->L$2:Ljava/lang/Object;

    iput-object v0, v2, Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger$TrackingEventsWorker$doWork$1;->L$3:Ljava/lang/Object;

    iput v10, v2, Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger$TrackingEventsWorker$doWork$1;->I$0:I

    const/4 v6, 0x4

    iput v6, v2, Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger$TrackingEventsWorker$doWork$1;->label:I

    invoke-virtual {v5, v4, v10, v2}, Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsCache;->onFlushFinished(Ljava/lang/String;ZLnt/b;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v3, :cond_6

    goto/16 :goto_12

    :cond_6
    return-object v0

    :cond_7
    :try_start_5
    new-instance v8, Ljava/io/File;

    invoke-direct {v8, v13}, Ljava/io/File;-><init>(Ljava/lang/String;)V
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_2
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    :try_start_6
    invoke-virtual {v8}, Ljava/io/File;->exists()Z

    move-result v0
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_5

    if-nez v0, :cond_9

    :try_start_7
    invoke-static {}, Landroidx/work/c$a;->a()Landroidx/work/c$a;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_7
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_3
    .catchall {:try_start_7 .. :try_end_7} :catchall_2

    invoke-virtual {v8}, Ljava/io/File;->delete()Z

    sget-object v5, Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsCache;->Companion:Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsCache$Companion;

    invoke-virtual {v5}, Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsCache$Companion;->getInstance()Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsCache;

    move-result-object v5

    if-eqz v5, :cond_8

    invoke-static {v4}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    iput-object v6, v2, Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger$TrackingEventsWorker$doWork$1;->L$0:Ljava/lang/Object;

    invoke-static {v8}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    iput-object v6, v2, Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger$TrackingEventsWorker$doWork$1;->L$1:Ljava/lang/Object;

    invoke-static {v15}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    iput-object v6, v2, Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger$TrackingEventsWorker$doWork$1;->L$2:Ljava/lang/Object;

    invoke-static {v14}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    iput-object v6, v2, Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger$TrackingEventsWorker$doWork$1;->L$3:Ljava/lang/Object;

    invoke-static {v13}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    iput-object v6, v2, Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger$TrackingEventsWorker$doWork$1;->L$4:Ljava/lang/Object;

    iput-object v0, v2, Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger$TrackingEventsWorker$doWork$1;->L$5:Ljava/lang/Object;

    iput v10, v2, Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger$TrackingEventsWorker$doWork$1;->I$0:I

    const/4 v6, 0x5

    iput v6, v2, Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger$TrackingEventsWorker$doWork$1;->label:I

    invoke-virtual {v5, v4, v10, v2}, Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsCache;->onFlushFinished(Ljava/lang/String;ZLnt/b;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v3, :cond_8

    goto/16 :goto_12

    :cond_8
    return-object v0

    :catchall_2
    move-exception v0

    move v9, v10

    goto/16 :goto_10

    :catch_3
    move-exception v0

    move v9, v10

    goto/16 :goto_6

    :cond_9
    :try_start_8
    new-instance v0, Lum/w$b;

    invoke-direct {v0}, Lum/w$b;-><init>()V

    invoke-virtual {v0}, Lum/w$b;->d()Lum/w;

    move-result-object v0

    const-class v9, Lcom/withpersona/sdk2/inquiry/tracking/network/EncryptedTrackingEventsRequest;

    invoke-virtual {v0, v9}, Lum/w;->c(Ljava/lang/Class;)Lum/h;

    move-result-object v12
    :try_end_8
    .catch Ljava/lang/Exception; {:try_start_8 .. :try_end_8} :catch_6
    .catchall {:try_start_8 .. :try_end_8} :catchall_5

    const/4 v9, 0x1

    const/4 v11, 0x0

    :try_start_9
    invoke-static {v8, v11, v9, v11}, Lut/i;->i(Ljava/io/File;Ljava/nio/charset/Charset;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v12, v0}, Lum/h;->fromJson(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/withpersona/sdk2/inquiry/tracking/network/EncryptedTrackingEventsRequest;
    :try_end_9
    .catch Ljava/lang/Exception; {:try_start_9 .. :try_end_9} :catch_4
    .catchall {:try_start_9 .. :try_end_9} :catchall_2

    move-object v11, v0

    goto :goto_1

    :catch_4
    const/4 v11, 0x0

    :goto_1
    if-nez v11, :cond_b

    :try_start_a
    invoke-static {}, Landroidx/work/c$a;->a()Landroidx/work/c$a;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_a
    .catch Ljava/lang/Exception; {:try_start_a .. :try_end_a} :catch_3
    .catchall {:try_start_a .. :try_end_a} :catchall_2

    invoke-virtual {v8}, Ljava/io/File;->delete()Z

    sget-object v5, Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsCache;->Companion:Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsCache$Companion;

    invoke-virtual {v5}, Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsCache$Companion;->getInstance()Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsCache;

    move-result-object v5

    if-eqz v5, :cond_a

    invoke-static {v4}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    iput-object v6, v2, Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger$TrackingEventsWorker$doWork$1;->L$0:Ljava/lang/Object;

    invoke-static {v8}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    iput-object v6, v2, Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger$TrackingEventsWorker$doWork$1;->L$1:Ljava/lang/Object;

    invoke-static {v15}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    iput-object v6, v2, Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger$TrackingEventsWorker$doWork$1;->L$2:Ljava/lang/Object;

    invoke-static {v14}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    iput-object v6, v2, Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger$TrackingEventsWorker$doWork$1;->L$3:Ljava/lang/Object;

    invoke-static {v13}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    iput-object v6, v2, Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger$TrackingEventsWorker$doWork$1;->L$4:Ljava/lang/Object;

    invoke-static {v12}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    iput-object v6, v2, Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger$TrackingEventsWorker$doWork$1;->L$5:Ljava/lang/Object;

    invoke-static {v11}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    iput-object v6, v2, Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger$TrackingEventsWorker$doWork$1;->L$6:Ljava/lang/Object;

    iput-object v0, v2, Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger$TrackingEventsWorker$doWork$1;->L$7:Ljava/lang/Object;

    iput v10, v2, Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger$TrackingEventsWorker$doWork$1;->I$0:I

    const/4 v6, 0x6

    iput v6, v2, Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger$TrackingEventsWorker$doWork$1;->label:I

    invoke-virtual {v5, v4, v10, v2}, Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsCache;->onFlushFinished(Ljava/lang/String;ZLnt/b;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v3, :cond_a

    goto/16 :goto_12

    :cond_a
    return-object v0

    :cond_b
    :try_start_b
    sget-object v0, Lcom/withpersona/sdk2/inquiry/tracking/network/TrackingEventsServiceComponentManager;->INSTANCE:Lcom/withpersona/sdk2/inquiry/tracking/network/TrackingEventsServiceComponentManager;

    iget-object v9, v1, Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger$TrackingEventsWorker;->context:Landroid/content/Context;

    invoke-virtual {v0, v9, v14}, Lcom/withpersona/sdk2/inquiry/tracking/network/TrackingEventsServiceComponentManager;->getInstance(Landroid/content/Context;Ljava/lang/String;)Lcom/withpersona/sdk2/inquiry/tracking/network/TrackingEventsServiceComponent;

    move-result-object v0

    invoke-interface {v0}, Lcom/withpersona/sdk2/inquiry/tracking/network/TrackingEventsServiceComponent;->trackingEventsService()Lcom/withpersona/sdk2/inquiry/tracking/network/TrackingEventsService;

    move-result-object v0

    iput-object v4, v2, Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger$TrackingEventsWorker$doWork$1;->L$0:Ljava/lang/Object;

    iput-object v8, v2, Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger$TrackingEventsWorker$doWork$1;->L$1:Ljava/lang/Object;

    invoke-static {v15}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    iput-object v9, v2, Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger$TrackingEventsWorker$doWork$1;->L$2:Ljava/lang/Object;

    invoke-static {v14}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    iput-object v9, v2, Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger$TrackingEventsWorker$doWork$1;->L$3:Ljava/lang/Object;

    invoke-static {v13}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    iput-object v9, v2, Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger$TrackingEventsWorker$doWork$1;->L$4:Ljava/lang/Object;

    invoke-static {v12}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    iput-object v9, v2, Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger$TrackingEventsWorker$doWork$1;->L$5:Ljava/lang/Object;

    invoke-static {v11}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    iput-object v9, v2, Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger$TrackingEventsWorker$doWork$1;->L$6:Ljava/lang/Object;

    const/4 v9, 0x1

    iput v9, v2, Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger$TrackingEventsWorker$doWork$1;->I$0:I

    const/4 v9, 0x7

    iput v9, v2, Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger$TrackingEventsWorker$doWork$1;->label:I

    invoke-virtual {v0, v15, v11, v2}, Lcom/withpersona/sdk2/inquiry/tracking/network/TrackingEventsService;->sendEvents-0E7RQCE$tracking_events_release(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/tracking/network/EncryptedTrackingEventsRequest;Lnt/b;)Ljava/lang/Object;

    move-result-object v0
    :try_end_b
    .catch Ljava/lang/Exception; {:try_start_b .. :try_end_b} :catch_5
    .catchall {:try_start_b .. :try_end_b} :catchall_4

    if-ne v0, v3, :cond_c

    goto/16 :goto_12

    :cond_c
    move-object v9, v4

    const/4 v4, 0x1

    :goto_2
    :try_start_c
    invoke-static {v0}, Ljt/n;->e(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v16

    if-nez v16, :cond_d

    move-object/from16 v16, v0

    check-cast v16, Lkotlin/Unit;

    invoke-static {}, Landroidx/work/c$a;->d()Landroidx/work/c$a;

    move-result-object v16

    move-object/from16 v19, v16

    move-object/from16 v16, v0

    move-object/from16 v0, v19

    goto :goto_4

    :cond_d
    invoke-virtual/range {v16 .. v16}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v10

    invoke-static {v6, v10}, Ljt/s;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v10

    invoke-static/range {v16 .. v16}, Ljt/a;->b(Ljava/lang/Throwable;)Ljava/lang/String;

    move-result-object v7

    invoke-static {v5, v7}, Ljt/s;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v7

    filled-new-array {v10, v7}, [Lkotlin/Pair;

    move-result-object v7

    new-instance v10, Landroidx/work/b$a;

    invoke-direct {v10}, Landroidx/work/b$a;-><init>()V

    move-object/from16 v16, v0

    const/4 v0, 0x0

    :goto_3
    const/4 v1, 0x2

    if-ge v0, v1, :cond_e

    aget-object v1, v7, v0

    invoke-virtual {v1}, Lkotlin/Pair;->c()Ljava/lang/Object;

    move-result-object v17

    move/from16 v18, v0

    move-object/from16 v0, v17

    check-cast v0, Ljava/lang/String;

    invoke-virtual {v1}, Lkotlin/Pair;->d()Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v10, v0, v1}, Landroidx/work/b$a;->b(Ljava/lang/String;Ljava/lang/Object;)Landroidx/work/b$a;

    add-int/lit8 v0, v18, 0x1

    goto :goto_3

    :cond_e
    invoke-virtual {v10}, Landroidx/work/b$a;->a()Landroidx/work/b;

    move-result-object v0

    invoke-static {v0}, Landroidx/work/c$a;->b(Landroidx/work/b;)Landroidx/work/c$a;

    move-result-object v0

    :goto_4
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_c
    .catch Ljava/lang/Exception; {:try_start_c .. :try_end_c} :catch_0
    .catchall {:try_start_c .. :try_end_c} :catchall_3

    if-eqz v8, :cond_f

    invoke-virtual {v8}, Ljava/io/File;->delete()Z

    move-result v1

    invoke-static {v1}, Lpt/b;->a(Z)Ljava/lang/Boolean;

    :cond_f
    if-eqz v9, :cond_11

    sget-object v1, Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsCache;->Companion:Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsCache$Companion;

    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsCache$Companion;->getInstance()Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsCache;

    move-result-object v1

    if-eqz v1, :cond_11

    if-eqz v4, :cond_10

    const/4 v5, 0x1

    goto :goto_5

    :cond_10
    const/4 v5, 0x0

    :goto_5
    invoke-static {v9}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    iput-object v6, v2, Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger$TrackingEventsWorker$doWork$1;->L$0:Ljava/lang/Object;

    invoke-static {v8}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    iput-object v6, v2, Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger$TrackingEventsWorker$doWork$1;->L$1:Ljava/lang/Object;

    invoke-static {v15}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    iput-object v6, v2, Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger$TrackingEventsWorker$doWork$1;->L$2:Ljava/lang/Object;

    invoke-static {v14}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    iput-object v6, v2, Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger$TrackingEventsWorker$doWork$1;->L$3:Ljava/lang/Object;

    invoke-static {v13}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    iput-object v6, v2, Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger$TrackingEventsWorker$doWork$1;->L$4:Ljava/lang/Object;

    invoke-static {v12}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    iput-object v6, v2, Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger$TrackingEventsWorker$doWork$1;->L$5:Ljava/lang/Object;

    invoke-static {v11}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    iput-object v6, v2, Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger$TrackingEventsWorker$doWork$1;->L$6:Ljava/lang/Object;

    invoke-static/range {v16 .. v16}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    iput-object v6, v2, Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger$TrackingEventsWorker$doWork$1;->L$7:Ljava/lang/Object;

    iput-object v0, v2, Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger$TrackingEventsWorker$doWork$1;->L$8:Ljava/lang/Object;

    iput v4, v2, Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger$TrackingEventsWorker$doWork$1;->I$0:I

    const/16 v4, 0x8

    iput v4, v2, Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger$TrackingEventsWorker$doWork$1;->label:I

    invoke-virtual {v1, v9, v5, v2}, Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsCache;->onFlushFinished(Ljava/lang/String;ZLnt/b;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v3, :cond_11

    goto/16 :goto_12

    :cond_11
    return-object v0

    :catchall_3
    move-exception v0

    goto/16 :goto_f

    :catchall_4
    move-exception v0

    const/4 v9, 0x1

    goto/16 :goto_10

    :catch_5
    move-exception v0

    const/4 v9, 0x1

    goto :goto_6

    :catchall_5
    move-exception v0

    goto :goto_8

    :catch_6
    move-exception v0

    const/4 v9, 0x0

    :goto_6
    move/from16 v19, v9

    move-object v9, v4

    move/from16 v4, v19

    goto :goto_c

    :goto_7
    const/4 v8, 0x0

    :goto_8
    const/4 v9, 0x0

    goto/16 :goto_10

    :goto_9
    move-object v9, v4

    const/4 v4, 0x0

    const/4 v8, 0x0

    goto :goto_c

    :goto_a
    const/4 v4, 0x0

    goto :goto_7

    :goto_b
    const/4 v4, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    :goto_c
    :try_start_d
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_12

    const-string v1, "Unknown error"

    :cond_12
    invoke-static {v6, v1}, Ljt/s;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    invoke-static {v0}, Ljt/a;->b(Ljava/lang/Throwable;)Ljava/lang/String;

    move-result-object v6

    invoke-static {v5, v6}, Ljt/s;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v5

    filled-new-array {v1, v5}, [Lkotlin/Pair;

    move-result-object v1

    new-instance v5, Landroidx/work/b$a;

    invoke-direct {v5}, Landroidx/work/b$a;-><init>()V

    const/4 v6, 0x0

    const/4 v7, 0x2

    :goto_d
    if-ge v6, v7, :cond_13

    aget-object v10, v1, v6

    invoke-virtual {v10}, Lkotlin/Pair;->c()Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Ljava/lang/String;

    invoke-virtual {v10}, Lkotlin/Pair;->d()Ljava/lang/Object;

    move-result-object v10

    invoke-virtual {v5, v11, v10}, Landroidx/work/b$a;->b(Ljava/lang/String;Ljava/lang/Object;)Landroidx/work/b$a;

    add-int/lit8 v6, v6, 0x1

    goto :goto_d

    :cond_13
    invoke-virtual {v5}, Landroidx/work/b$a;->a()Landroidx/work/b;

    move-result-object v1

    invoke-static {v1}, Landroidx/work/c$a;->b(Landroidx/work/b;)Landroidx/work/c$a;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_3

    if-eqz v8, :cond_14

    invoke-virtual {v8}, Ljava/io/File;->delete()Z

    move-result v6

    invoke-static {v6}, Lpt/b;->a(Z)Ljava/lang/Boolean;

    :cond_14
    if-eqz v9, :cond_16

    sget-object v6, Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsCache;->Companion:Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsCache$Companion;

    invoke-virtual {v6}, Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsCache$Companion;->getInstance()Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsCache;

    move-result-object v6

    if-eqz v6, :cond_16

    if-eqz v4, :cond_15

    const/4 v7, 0x1

    goto :goto_e

    :cond_15
    const/4 v7, 0x0

    :goto_e
    invoke-static {v9}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    iput-object v10, v2, Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger$TrackingEventsWorker$doWork$1;->L$0:Ljava/lang/Object;

    invoke-static {v8}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    iput-object v8, v2, Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger$TrackingEventsWorker$doWork$1;->L$1:Ljava/lang/Object;

    invoke-static {v0}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    iput-object v0, v2, Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger$TrackingEventsWorker$doWork$1;->L$2:Ljava/lang/Object;

    invoke-static {v1}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    iput-object v0, v2, Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger$TrackingEventsWorker$doWork$1;->L$3:Ljava/lang/Object;

    iput-object v5, v2, Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger$TrackingEventsWorker$doWork$1;->L$4:Ljava/lang/Object;

    const/4 v11, 0x0

    iput-object v11, v2, Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger$TrackingEventsWorker$doWork$1;->L$5:Ljava/lang/Object;

    iput-object v11, v2, Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger$TrackingEventsWorker$doWork$1;->L$6:Ljava/lang/Object;

    iput v4, v2, Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger$TrackingEventsWorker$doWork$1;->I$0:I

    const/16 v0, 0x9

    iput v0, v2, Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger$TrackingEventsWorker$doWork$1;->label:I

    invoke-virtual {v6, v9, v7, v2}, Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsCache;->onFlushFinished(Ljava/lang/String;ZLnt/b;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v3, :cond_16

    goto :goto_12

    :cond_16
    return-object v5

    :goto_f
    move-object/from16 v19, v9

    move v9, v4

    move-object/from16 v4, v19

    :goto_10
    if-eqz v8, :cond_17

    invoke-virtual {v8}, Ljava/io/File;->delete()Z

    move-result v1

    invoke-static {v1}, Lpt/b;->a(Z)Ljava/lang/Boolean;

    :cond_17
    if-eqz v4, :cond_19

    sget-object v1, Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsCache;->Companion:Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsCache$Companion;

    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsCache$Companion;->getInstance()Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsCache;

    move-result-object v1

    if-eqz v1, :cond_19

    if-eqz v9, :cond_18

    const/4 v5, 0x1

    goto :goto_11

    :cond_18
    const/4 v5, 0x0

    :goto_11
    invoke-static {v4}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    iput-object v6, v2, Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger$TrackingEventsWorker$doWork$1;->L$0:Ljava/lang/Object;

    invoke-static {v8}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    iput-object v6, v2, Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger$TrackingEventsWorker$doWork$1;->L$1:Ljava/lang/Object;

    iput-object v0, v2, Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger$TrackingEventsWorker$doWork$1;->L$2:Ljava/lang/Object;

    const/4 v11, 0x0

    iput-object v11, v2, Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger$TrackingEventsWorker$doWork$1;->L$3:Ljava/lang/Object;

    iput-object v11, v2, Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger$TrackingEventsWorker$doWork$1;->L$4:Ljava/lang/Object;

    iput-object v11, v2, Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger$TrackingEventsWorker$doWork$1;->L$5:Ljava/lang/Object;

    iput-object v11, v2, Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger$TrackingEventsWorker$doWork$1;->L$6:Ljava/lang/Object;

    iput v9, v2, Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger$TrackingEventsWorker$doWork$1;->I$0:I

    const/16 v6, 0xa

    iput v6, v2, Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger$TrackingEventsWorker$doWork$1;->label:I

    invoke-virtual {v1, v4, v5, v2}, Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsCache;->onFlushFinished(Ljava/lang/String;ZLnt/b;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v3, :cond_19

    :goto_12
    return-object v3

    :cond_19
    move-object v3, v0

    :goto_13
    throw v3

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
