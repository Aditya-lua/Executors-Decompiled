.class public final Lpo/d;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lft/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lft/i<",
            "Landroid/content/Context;",
            ">;"
        }
    .end annotation
.end field

.field public final b:Lft/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lft/i<",
            "Lcom/withpersona/sdk2/inquiry/governmentid/network/b;",
            ">;"
        }
    .end annotation
.end field

.field public final c:Lft/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lft/i<",
            "Lmq/a;",
            ">;"
        }
    .end annotation
.end field

.field public final d:Lft/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lft/i<",
            "Lfo/a;",
            ">;"
        }
    .end annotation
.end field

.field public final e:Lft/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lft/i<",
            "Lrq/a;",
            ">;"
        }
    .end annotation
.end field

.field public final f:Lft/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lft/i<",
            "Lln/a;",
            ">;"
        }
    .end annotation
.end field

.field public final g:Lft/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lft/i<",
            "Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lft/i;Lft/i;Lft/i;Lft/i;Lft/i;Lft/i;Lft/i;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lft/i<",
            "Landroid/content/Context;",
            ">;",
            "Lft/i<",
            "Lcom/withpersona/sdk2/inquiry/governmentid/network/b;",
            ">;",
            "Lft/i<",
            "Lmq/a;",
            ">;",
            "Lft/i<",
            "Lfo/a;",
            ">;",
            "Lft/i<",
            "Lrq/a;",
            ">;",
            "Lft/i<",
            "Lln/a;",
            ">;",
            "Lft/i<",
            "Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpo/d;->a:Lft/i;

    iput-object p2, p0, Lpo/d;->b:Lft/i;

    iput-object p3, p0, Lpo/d;->c:Lft/i;

    iput-object p4, p0, Lpo/d;->d:Lft/i;

    iput-object p5, p0, Lpo/d;->e:Lft/i;

    iput-object p6, p0, Lpo/d;->f:Lft/i;

    iput-object p7, p0, Lpo/d;->g:Lft/i;

    return-void
.end method

.method public static a(Lft/i;Lft/i;Lft/i;Lft/i;Lft/i;Lft/i;Lft/i;)Lpo/d;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lft/i<",
            "Landroid/content/Context;",
            ">;",
            "Lft/i<",
            "Lcom/withpersona/sdk2/inquiry/governmentid/network/b;",
            ">;",
            "Lft/i<",
            "Lmq/a;",
            ">;",
            "Lft/i<",
            "Lfo/a;",
            ">;",
            "Lft/i<",
            "Lrq/a;",
            ">;",
            "Lft/i<",
            "Lln/a;",
            ">;",
            "Lft/i<",
            "Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;",
            ">;)",
            "Lpo/d;"
        }
    .end annotation

    new-instance v0, Lpo/d;

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    move-object v7, p6

    invoke-direct/range {v0 .. v7}, Lpo/d;-><init>(Lft/i;Lft/i;Lft/i;Lft/i;Lft/i;Lft/i;Lft/i;)V

    return-object v0
.end method

.method public static c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/governmentid/network/b;Lcom/withpersona/sdk2/inquiry/governmentid/network/GovernmentIdRequestArguments;Lmq/a;Lfo/a;Lrq/a;Ljava/lang/String;Lcom/withpersona/sdk2/camera/CameraProperties;Lln/a;Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;)Lpo/c;
    .locals 15
    .param p6    # Lcom/withpersona/sdk2/inquiry/governmentid/network/GovernmentIdRequestArguments;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p10    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    new-instance v0, Lpo/c;

    move-object v1, p0

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

    invoke-direct/range {v0 .. v14}, Lpo/c;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/governmentid/network/b;Lcom/withpersona/sdk2/inquiry/governmentid/network/GovernmentIdRequestArguments;Lmq/a;Lfo/a;Lrq/a;Ljava/lang/String;Lcom/withpersona/sdk2/camera/CameraProperties;Lln/a;Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;)V

    return-object v0
.end method


# virtual methods
.method public b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/governmentid/network/GovernmentIdRequestArguments;Ljava/lang/String;Lcom/withpersona/sdk2/camera/CameraProperties;)Lpo/c;
    .locals 16
    .param p5    # Lcom/withpersona/sdk2/inquiry/governmentid/network/GovernmentIdRequestArguments;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p6    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    move-object/from16 v0, p0

    iget-object v1, v0, Lpo/d;->a:Lft/i;

    invoke-interface {v1}, Lht/a;->get()Ljava/lang/Object;

    move-result-object v1

    move-object v2, v1

    check-cast v2, Landroid/content/Context;

    iget-object v1, v0, Lpo/d;->b:Lft/i;

    invoke-interface {v1}, Lht/a;->get()Ljava/lang/Object;

    move-result-object v1

    move-object v7, v1

    check-cast v7, Lcom/withpersona/sdk2/inquiry/governmentid/network/b;

    iget-object v1, v0, Lpo/d;->c:Lft/i;

    invoke-interface {v1}, Lht/a;->get()Ljava/lang/Object;

    move-result-object v1

    move-object v9, v1

    check-cast v9, Lmq/a;

    iget-object v1, v0, Lpo/d;->d:Lft/i;

    invoke-interface {v1}, Lht/a;->get()Ljava/lang/Object;

    move-result-object v1

    move-object v10, v1

    check-cast v10, Lfo/a;

    iget-object v1, v0, Lpo/d;->e:Lft/i;

    invoke-interface {v1}, Lht/a;->get()Ljava/lang/Object;

    move-result-object v1

    move-object v11, v1

    check-cast v11, Lrq/a;

    iget-object v1, v0, Lpo/d;->f:Lft/i;

    invoke-interface {v1}, Lht/a;->get()Ljava/lang/Object;

    move-result-object v1

    move-object v14, v1

    check-cast v14, Lln/a;

    iget-object v1, v0, Lpo/d;->g:Lft/i;

    invoke-interface {v1}, Lht/a;->get()Ljava/lang/Object;

    move-result-object v1

    move-object v15, v1

    check-cast v15, Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;

    move-object/from16 v3, p1

    move-object/from16 v4, p2

    move-object/from16 v5, p3

    move-object/from16 v6, p4

    move-object/from16 v8, p5

    move-object/from16 v12, p6

    move-object/from16 v13, p7

    invoke-static/range {v2 .. v15}, Lpo/d;->c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/governmentid/network/b;Lcom/withpersona/sdk2/inquiry/governmentid/network/GovernmentIdRequestArguments;Lmq/a;Lfo/a;Lrq/a;Ljava/lang/String;Lcom/withpersona/sdk2/camera/CameraProperties;Lln/a;Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;)Lpo/c;

    move-result-object v1

    return-object v1
.end method
