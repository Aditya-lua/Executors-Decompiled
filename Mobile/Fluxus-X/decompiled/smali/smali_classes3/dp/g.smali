.class public final Ldp/g;
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
            "Lcom/withpersona/sdk2/inquiry/governmentid/network/b;",
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


# direct methods
.method public constructor <init>(Lwt/i;Lwt/i;Lwt/i;Lwt/i;Lwt/i;Lwt/i;Lwt/i;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lwt/i<",
            "Landroid/content/Context;",
            ">;",
            "Lwt/i<",
            "Lcom/withpersona/sdk2/inquiry/governmentid/network/b;",
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
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ldp/g;->a:Lwt/i;

    iput-object p2, p0, Ldp/g;->b:Lwt/i;

    iput-object p3, p0, Ldp/g;->c:Lwt/i;

    iput-object p4, p0, Ldp/g;->d:Lwt/i;

    iput-object p5, p0, Ldp/g;->e:Lwt/i;

    iput-object p6, p0, Ldp/g;->f:Lwt/i;

    iput-object p7, p0, Ldp/g;->g:Lwt/i;

    return-void
.end method

.method public static a(Lwt/i;Lwt/i;Lwt/i;Lwt/i;Lwt/i;Lwt/i;Lwt/i;)Ldp/g;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lwt/i<",
            "Landroid/content/Context;",
            ">;",
            "Lwt/i<",
            "Lcom/withpersona/sdk2/inquiry/governmentid/network/b;",
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
            ">;)",
            "Ldp/g;"
        }
    .end annotation

    new-instance v0, Ldp/g;

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    move-object v7, p6

    invoke-direct/range {v0 .. v7}, Ldp/g;-><init>(Lwt/i;Lwt/i;Lwt/i;Lwt/i;Lwt/i;Lwt/i;Lwt/i;)V

    return-object v0
.end method

.method public static c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/governmentid/network/b;Ldp/c;Lar/a;Lso/a;Lfr/a;Ljava/lang/String;Lsn/v;Lyn/a;Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;)Ldp/f;
    .locals 15
    .param p6    # Ldp/c;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p10    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    new-instance v0, Ldp/f;

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

    invoke-direct/range {v0 .. v14}, Ldp/f;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/governmentid/network/b;Ldp/c;Lar/a;Lso/a;Lfr/a;Ljava/lang/String;Lsn/v;Lyn/a;Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;)V

    return-object v0
.end method


# virtual methods
.method public b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ldp/c;Ljava/lang/String;Lsn/v;)Ldp/f;
    .locals 16
    .param p5    # Ldp/c;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p6    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    move-object/from16 v0, p0

    iget-object v1, v0, Ldp/g;->a:Lwt/i;

    invoke-interface {v1}, Lyt/a;->get()Ljava/lang/Object;

    move-result-object v1

    move-object v2, v1

    check-cast v2, Landroid/content/Context;

    iget-object v1, v0, Ldp/g;->b:Lwt/i;

    invoke-interface {v1}, Lyt/a;->get()Ljava/lang/Object;

    move-result-object v1

    move-object v7, v1

    check-cast v7, Lcom/withpersona/sdk2/inquiry/governmentid/network/b;

    iget-object v1, v0, Ldp/g;->c:Lwt/i;

    invoke-interface {v1}, Lyt/a;->get()Ljava/lang/Object;

    move-result-object v1

    move-object v9, v1

    check-cast v9, Lar/a;

    iget-object v1, v0, Ldp/g;->d:Lwt/i;

    invoke-interface {v1}, Lyt/a;->get()Ljava/lang/Object;

    move-result-object v1

    move-object v10, v1

    check-cast v10, Lso/a;

    iget-object v1, v0, Ldp/g;->e:Lwt/i;

    invoke-interface {v1}, Lyt/a;->get()Ljava/lang/Object;

    move-result-object v1

    move-object v11, v1

    check-cast v11, Lfr/a;

    iget-object v1, v0, Ldp/g;->f:Lwt/i;

    invoke-interface {v1}, Lyt/a;->get()Ljava/lang/Object;

    move-result-object v1

    move-object v14, v1

    check-cast v14, Lyn/a;

    iget-object v1, v0, Ldp/g;->g:Lwt/i;

    invoke-interface {v1}, Lyt/a;->get()Ljava/lang/Object;

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

    invoke-static/range {v2 .. v15}, Ldp/g;->c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/governmentid/network/b;Ldp/c;Lar/a;Lso/a;Lfr/a;Ljava/lang/String;Lsn/v;Lyn/a;Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;)Ldp/f;

    move-result-object v1

    return-object v1
.end method
