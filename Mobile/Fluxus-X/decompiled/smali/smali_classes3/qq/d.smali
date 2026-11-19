.class public final Lqq/d;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lwt/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lwt/i<",
            "Landroid/content/Context;",
            ">;"
        }
    .end annotation
.end field

.field public final b:Lwt/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lwt/i<",
            "Lqq/a;",
            ">;"
        }
    .end annotation
.end field

.field public final c:Lwt/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lwt/i<",
            "Lar/a;",
            ">;"
        }
    .end annotation
.end field

.field public final d:Lwt/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lwt/i<",
            "Lso/a;",
            ">;"
        }
    .end annotation
.end field

.field public final e:Lwt/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lwt/i<",
            "Lfr/a;",
            ">;"
        }
    .end annotation
.end field

.field public final f:Lwt/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lwt/i<",
            "Lyn/a;",
            ">;"
        }
    .end annotation
.end field

.field public final g:Lwt/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lwt/i<",
            "Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;",
            ">;"
        }
    .end annotation
.end field

.field public final h:Lwt/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lwt/i<",
            "Lpq/a;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lwt/i;Lwt/i;Lwt/i;Lwt/i;Lwt/i;Lwt/i;Lwt/i;Lwt/i;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lwt/i<",
            "Landroid/content/Context;",
            ">;",
            "Lwt/i<",
            "Lqq/a;",
            ">;",
            "Lwt/i<",
            "Lar/a;",
            ">;",
            "Lwt/i<",
            "Lso/a;",
            ">;",
            "Lwt/i<",
            "Lfr/a;",
            ">;",
            "Lwt/i<",
            "Lyn/a;",
            ">;",
            "Lwt/i<",
            "Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;",
            ">;",
            "Lwt/i<",
            "Lpq/a;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lqq/d;->a:Lwt/i;

    iput-object p2, p0, Lqq/d;->b:Lwt/i;

    iput-object p3, p0, Lqq/d;->c:Lwt/i;

    iput-object p4, p0, Lqq/d;->d:Lwt/i;

    iput-object p5, p0, Lqq/d;->e:Lwt/i;

    iput-object p6, p0, Lqq/d;->f:Lwt/i;

    iput-object p7, p0, Lqq/d;->g:Lwt/i;

    iput-object p8, p0, Lqq/d;->h:Lwt/i;

    return-void
.end method

.method public static a(Lwt/i;Lwt/i;Lwt/i;Lwt/i;Lwt/i;Lwt/i;Lwt/i;Lwt/i;)Lqq/d;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lwt/i<",
            "Landroid/content/Context;",
            ">;",
            "Lwt/i<",
            "Lqq/a;",
            ">;",
            "Lwt/i<",
            "Lar/a;",
            ">;",
            "Lwt/i<",
            "Lso/a;",
            ">;",
            "Lwt/i<",
            "Lfr/a;",
            ">;",
            "Lwt/i<",
            "Lyn/a;",
            ">;",
            "Lwt/i<",
            "Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;",
            ">;",
            "Lwt/i<",
            "Lpq/a;",
            ">;)",
            "Lqq/d;"
        }
    .end annotation

    new-instance v0, Lqq/d;

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    move-object v7, p6

    move-object/from16 v8, p7

    invoke-direct/range {v0 .. v8}, Lqq/d;-><init>(Lwt/i;Lwt/i;Lwt/i;Lwt/i;Lwt/i;Lwt/i;Lwt/i;Lwt/i;)V

    return-object v0
.end method

.method public static c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Lmq/z0;Ljava/util/List;Lqq/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lar/a;Lso/a;Lfr/a;Ljava/lang/String;Lsn/v;Lyn/a;JLcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;Ljava/lang/String;Lpq/a;Lrq/b;)Lqq/c;
    .locals 22
    .param p12    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p18    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lmq/z0;",
            "Ljava/util/List<",
            "+",
            "Lmq/b0;",
            ">;",
            "Lqq/a;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lar/a;",
            "Lso/a;",
            "Lfr/a;",
            "Ljava/lang/String;",
            "Lsn/v;",
            "Lyn/a;",
            "J",
            "Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;",
            "Ljava/lang/String;",
            "Lpq/a;",
            "Lrq/b;",
            ")",
            "Lqq/c;"
        }
    .end annotation

    new-instance v0, Lqq/c;

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move-object/from16 v4, p3

    move-object/from16 v5, p4

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    move-object/from16 v9, p8

    move-object/from16 v10, p9

    move-object/from16 v11, p10

    move-object/from16 v12, p11

    move-object/from16 v13, p12

    move-object/from16 v14, p13

    move-object/from16 v15, p14

    move-wide/from16 v16, p15

    move-object/from16 v18, p17

    move-object/from16 v19, p18

    move-object/from16 v20, p19

    move-object/from16 v21, p20

    invoke-direct/range {v0 .. v21}, Lqq/c;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Lmq/z0;Ljava/util/List;Lqq/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lar/a;Lso/a;Lfr/a;Ljava/lang/String;Lsn/v;Lyn/a;JLcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;Ljava/lang/String;Lpq/a;Lrq/b;)V

    return-object v0
.end method


# virtual methods
.method public b(Ljava/lang/String;Ljava/lang/String;Lmq/z0;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lsn/v;JLjava/lang/String;Lrq/b;)Lqq/c;
    .locals 23
    .param p8    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p12    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lmq/z0;",
            "Ljava/util/List<",
            "+",
            "Lmq/b0;",
            ">;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lsn/v;",
            "J",
            "Ljava/lang/String;",
            "Lrq/b;",
            ")",
            "Lqq/c;"
        }
    .end annotation

    move-object/from16 v0, p0

    iget-object v1, v0, Lqq/d;->a:Lwt/i;

    invoke-interface {v1}, Lyt/a;->get()Ljava/lang/Object;

    move-result-object v1

    move-object v2, v1

    check-cast v2, Landroid/content/Context;

    iget-object v1, v0, Lqq/d;->b:Lwt/i;

    invoke-interface {v1}, Lyt/a;->get()Ljava/lang/Object;

    move-result-object v1

    move-object v7, v1

    check-cast v7, Lqq/a;

    iget-object v1, v0, Lqq/d;->c:Lwt/i;

    invoke-interface {v1}, Lyt/a;->get()Ljava/lang/Object;

    move-result-object v1

    move-object v11, v1

    check-cast v11, Lar/a;

    iget-object v1, v0, Lqq/d;->d:Lwt/i;

    invoke-interface {v1}, Lyt/a;->get()Ljava/lang/Object;

    move-result-object v1

    move-object v12, v1

    check-cast v12, Lso/a;

    iget-object v1, v0, Lqq/d;->e:Lwt/i;

    invoke-interface {v1}, Lyt/a;->get()Ljava/lang/Object;

    move-result-object v1

    move-object v13, v1

    check-cast v13, Lfr/a;

    iget-object v1, v0, Lqq/d;->f:Lwt/i;

    invoke-interface {v1}, Lyt/a;->get()Ljava/lang/Object;

    move-result-object v1

    move-object/from16 v16, v1

    check-cast v16, Lyn/a;

    iget-object v1, v0, Lqq/d;->g:Lwt/i;

    invoke-interface {v1}, Lyt/a;->get()Ljava/lang/Object;

    move-result-object v1

    move-object/from16 v19, v1

    check-cast v19, Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;

    iget-object v1, v0, Lqq/d;->h:Lwt/i;

    invoke-interface {v1}, Lyt/a;->get()Ljava/lang/Object;

    move-result-object v1

    move-object/from16 v21, v1

    check-cast v21, Lpq/a;

    move-object/from16 v3, p1

    move-object/from16 v4, p2

    move-object/from16 v5, p3

    move-object/from16 v6, p4

    move-object/from16 v8, p5

    move-object/from16 v9, p6

    move-object/from16 v10, p7

    move-object/from16 v14, p8

    move-object/from16 v15, p9

    move-wide/from16 v17, p10

    move-object/from16 v20, p12

    move-object/from16 v22, p13

    invoke-static/range {v2 .. v22}, Lqq/d;->c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Lmq/z0;Ljava/util/List;Lqq/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lar/a;Lso/a;Lfr/a;Ljava/lang/String;Lsn/v;Lyn/a;JLcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;Ljava/lang/String;Lpq/a;Lrq/b;)Lqq/c;

    move-result-object v1

    return-object v1
.end method
