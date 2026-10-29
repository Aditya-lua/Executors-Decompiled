.class public final Lcq/c;
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
            "Lcq/a;",
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

.field public final h:Lft/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lft/i<",
            "Lcom/withpersona/sdk2/inquiry/selfie/directFileUploader/DirectFileUploader;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lft/i;Lft/i;Lft/i;Lft/i;Lft/i;Lft/i;Lft/i;Lft/i;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lft/i<",
            "Landroid/content/Context;",
            ">;",
            "Lft/i<",
            "Lcq/a;",
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
            ">;",
            "Lft/i<",
            "Lcom/withpersona/sdk2/inquiry/selfie/directFileUploader/DirectFileUploader;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcq/c;->a:Lft/i;

    iput-object p2, p0, Lcq/c;->b:Lft/i;

    iput-object p3, p0, Lcq/c;->c:Lft/i;

    iput-object p4, p0, Lcq/c;->d:Lft/i;

    iput-object p5, p0, Lcq/c;->e:Lft/i;

    iput-object p6, p0, Lcq/c;->f:Lft/i;

    iput-object p7, p0, Lcq/c;->g:Lft/i;

    iput-object p8, p0, Lcq/c;->h:Lft/i;

    return-void
.end method

.method public static a(Lft/i;Lft/i;Lft/i;Lft/i;Lft/i;Lft/i;Lft/i;Lft/i;)Lcq/c;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lft/i<",
            "Landroid/content/Context;",
            ">;",
            "Lft/i<",
            "Lcq/a;",
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
            ">;",
            "Lft/i<",
            "Lcom/withpersona/sdk2/inquiry/selfie/directFileUploader/DirectFileUploader;",
            ">;)",
            "Lcq/c;"
        }
    .end annotation

    new-instance v0, Lcq/c;

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    move-object v7, p6

    move-object/from16 v8, p7

    invoke-direct/range {v0 .. v8}, Lcq/c;-><init>(Lft/i;Lft/i;Lft/i;Lft/i;Lft/i;Lft/i;Lft/i;Lft/i;)V

    return-object v0
.end method

.method public static c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/selfie/SelfieType;Ljava/util/List;Lcq/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lmq/a;Lfo/a;Lrq/a;Ljava/lang/String;Lcom/withpersona/sdk2/camera/CameraProperties;Lln/a;JLcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/selfie/directFileUploader/DirectFileUploader;Ldq/a;)Lcq/b;
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
            "Lcom/withpersona/sdk2/inquiry/selfie/SelfieType;",
            "Ljava/util/List<",
            "+",
            "Lcom/withpersona/sdk2/inquiry/selfie/Selfie;",
            ">;",
            "Lcq/a;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lmq/a;",
            "Lfo/a;",
            "Lrq/a;",
            "Ljava/lang/String;",
            "Lcom/withpersona/sdk2/camera/CameraProperties;",
            "Lln/a;",
            "J",
            "Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;",
            "Ljava/lang/String;",
            "Lcom/withpersona/sdk2/inquiry/selfie/directFileUploader/DirectFileUploader;",
            "Ldq/a;",
            ")",
            "Lcq/b;"
        }
    .end annotation

    new-instance v0, Lcq/b;

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

    invoke-direct/range {v0 .. v21}, Lcq/b;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/selfie/SelfieType;Ljava/util/List;Lcq/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lmq/a;Lfo/a;Lrq/a;Ljava/lang/String;Lcom/withpersona/sdk2/camera/CameraProperties;Lln/a;JLcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/selfie/directFileUploader/DirectFileUploader;Ldq/a;)V

    return-object v0
.end method


# virtual methods
.method public b(Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/selfie/SelfieType;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/camera/CameraProperties;JLjava/lang/String;Ldq/a;)Lcq/b;
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
            "Lcom/withpersona/sdk2/inquiry/selfie/SelfieType;",
            "Ljava/util/List<",
            "+",
            "Lcom/withpersona/sdk2/inquiry/selfie/Selfie;",
            ">;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lcom/withpersona/sdk2/camera/CameraProperties;",
            "J",
            "Ljava/lang/String;",
            "Ldq/a;",
            ")",
            "Lcq/b;"
        }
    .end annotation

    move-object/from16 v0, p0

    iget-object v1, v0, Lcq/c;->a:Lft/i;

    invoke-interface {v1}, Lht/a;->get()Ljava/lang/Object;

    move-result-object v1

    move-object v2, v1

    check-cast v2, Landroid/content/Context;

    iget-object v1, v0, Lcq/c;->b:Lft/i;

    invoke-interface {v1}, Lht/a;->get()Ljava/lang/Object;

    move-result-object v1

    move-object v7, v1

    check-cast v7, Lcq/a;

    iget-object v1, v0, Lcq/c;->c:Lft/i;

    invoke-interface {v1}, Lht/a;->get()Ljava/lang/Object;

    move-result-object v1

    move-object v11, v1

    check-cast v11, Lmq/a;

    iget-object v1, v0, Lcq/c;->d:Lft/i;

    invoke-interface {v1}, Lht/a;->get()Ljava/lang/Object;

    move-result-object v1

    move-object v12, v1

    check-cast v12, Lfo/a;

    iget-object v1, v0, Lcq/c;->e:Lft/i;

    invoke-interface {v1}, Lht/a;->get()Ljava/lang/Object;

    move-result-object v1

    move-object v13, v1

    check-cast v13, Lrq/a;

    iget-object v1, v0, Lcq/c;->f:Lft/i;

    invoke-interface {v1}, Lht/a;->get()Ljava/lang/Object;

    move-result-object v1

    move-object/from16 v16, v1

    check-cast v16, Lln/a;

    iget-object v1, v0, Lcq/c;->g:Lft/i;

    invoke-interface {v1}, Lht/a;->get()Ljava/lang/Object;

    move-result-object v1

    move-object/from16 v19, v1

    check-cast v19, Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;

    iget-object v1, v0, Lcq/c;->h:Lft/i;

    invoke-interface {v1}, Lht/a;->get()Ljava/lang/Object;

    move-result-object v1

    move-object/from16 v21, v1

    check-cast v21, Lcom/withpersona/sdk2/inquiry/selfie/directFileUploader/DirectFileUploader;

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

    invoke-static/range {v2 .. v22}, Lcq/c;->c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/selfie/SelfieType;Ljava/util/List;Lcq/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lmq/a;Lfo/a;Lrq/a;Ljava/lang/String;Lcom/withpersona/sdk2/camera/CameraProperties;Lln/a;JLcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/selfie/directFileUploader/DirectFileUploader;Ldq/a;)Lcq/b;

    move-result-object v1

    return-object v1
.end method
