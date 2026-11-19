.class public final Lun/c0;
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
            "Lyn/a;",
            ">;"
        }
    .end annotation
.end field

.field public final c:Lwt/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lwt/i<",
            "Ler/c;",
            ">;"
        }
    .end annotation
.end field

.field public final d:Lwt/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lwt/i<",
            "Lun/i0;",
            ">;"
        }
    .end annotation
.end field

.field public final e:Lwt/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lwt/i<",
            "Lzq/a;",
            ">;"
        }
    .end annotation
.end field

.field public final f:Lwt/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lwt/i<",
            "Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;",
            ">;"
        }
    .end annotation
.end field

.field public final g:Lwt/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lwt/i<",
            "Ldr/c;",
            ">;"
        }
    .end annotation
.end field

.field public final h:Lwt/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lwt/i<",
            "Lto/e;",
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
            "Lyn/a;",
            ">;",
            "Lwt/i<",
            "Ler/c;",
            ">;",
            "Lwt/i<",
            "Lun/i0;",
            ">;",
            "Lwt/i<",
            "Lzq/a;",
            ">;",
            "Lwt/i<",
            "Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;",
            ">;",
            "Lwt/i<",
            "Ldr/c;",
            ">;",
            "Lwt/i<",
            "Lto/e;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lun/c0;->a:Lwt/i;

    iput-object p2, p0, Lun/c0;->b:Lwt/i;

    iput-object p3, p0, Lun/c0;->c:Lwt/i;

    iput-object p4, p0, Lun/c0;->d:Lwt/i;

    iput-object p5, p0, Lun/c0;->e:Lwt/i;

    iput-object p6, p0, Lun/c0;->f:Lwt/i;

    iput-object p7, p0, Lun/c0;->g:Lwt/i;

    iput-object p8, p0, Lun/c0;->h:Lwt/i;

    return-void
.end method

.method public static a(Lwt/i;Lwt/i;Lwt/i;Lwt/i;Lwt/i;Lwt/i;Lwt/i;Lwt/i;)Lun/c0;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lwt/i<",
            "Landroid/content/Context;",
            ">;",
            "Lwt/i<",
            "Lyn/a;",
            ">;",
            "Lwt/i<",
            "Ler/c;",
            ">;",
            "Lwt/i<",
            "Lun/i0;",
            ">;",
            "Lwt/i<",
            "Lzq/a;",
            ">;",
            "Lwt/i<",
            "Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;",
            ">;",
            "Lwt/i<",
            "Ldr/c;",
            ">;",
            "Lwt/i<",
            "Lto/e;",
            ">;)",
            "Lun/c0;"
        }
    .end annotation

    new-instance v0, Lun/c0;

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    move-object v7, p6

    move-object/from16 v8, p7

    invoke-direct/range {v0 .. v8}, Lun/c0;-><init>(Lwt/i;Lwt/i;Lwt/i;Lwt/i;Lwt/i;Lwt/i;Lwt/i;Lwt/i;)V

    return-object v0
.end method

.method public static c(Landroid/content/Context;Lyn/a;Ler/c;Lun/i0;Lzq/a;Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;Ldr/c;Lto/e;Lun/k0;Lcom/withpersona/sdk2/camera/camera2/Camera2PreviewView;Lun/g;Lzn/a;Lks/a;Z)Lun/b0;
    .locals 15
    .param p12    # Lks/a;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    new-instance v0, Lun/b0;

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

    move/from16 v14, p13

    invoke-direct/range {v0 .. v14}, Lun/b0;-><init>(Landroid/content/Context;Lyn/a;Ler/c;Lun/i0;Lzq/a;Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;Ldr/c;Lto/e;Lun/k0;Lcom/withpersona/sdk2/camera/camera2/Camera2PreviewView;Lun/g;Lzn/a;Lks/a;Z)V

    return-object v0
.end method


# virtual methods
.method public b(Lun/k0;Lcom/withpersona/sdk2/camera/camera2/Camera2PreviewView;Lun/g;Lzn/a;Lks/a;Z)Lun/b0;
    .locals 16
    .param p5    # Lks/a;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    move-object/from16 v0, p0

    iget-object v1, v0, Lun/c0;->a:Lwt/i;

    invoke-interface {v1}, Lyt/a;->get()Ljava/lang/Object;

    move-result-object v1

    move-object v2, v1

    check-cast v2, Landroid/content/Context;

    iget-object v1, v0, Lun/c0;->b:Lwt/i;

    invoke-interface {v1}, Lyt/a;->get()Ljava/lang/Object;

    move-result-object v1

    move-object v3, v1

    check-cast v3, Lyn/a;

    iget-object v1, v0, Lun/c0;->c:Lwt/i;

    invoke-interface {v1}, Lyt/a;->get()Ljava/lang/Object;

    move-result-object v1

    move-object v4, v1

    check-cast v4, Ler/c;

    iget-object v1, v0, Lun/c0;->d:Lwt/i;

    invoke-interface {v1}, Lyt/a;->get()Ljava/lang/Object;

    move-result-object v1

    move-object v5, v1

    check-cast v5, Lun/i0;

    iget-object v1, v0, Lun/c0;->e:Lwt/i;

    invoke-interface {v1}, Lyt/a;->get()Ljava/lang/Object;

    move-result-object v1

    move-object v6, v1

    check-cast v6, Lzq/a;

    iget-object v1, v0, Lun/c0;->f:Lwt/i;

    invoke-interface {v1}, Lyt/a;->get()Ljava/lang/Object;

    move-result-object v1

    move-object v7, v1

    check-cast v7, Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;

    iget-object v1, v0, Lun/c0;->g:Lwt/i;

    invoke-interface {v1}, Lyt/a;->get()Ljava/lang/Object;

    move-result-object v1

    move-object v8, v1

    check-cast v8, Ldr/c;

    iget-object v1, v0, Lun/c0;->h:Lwt/i;

    invoke-interface {v1}, Lyt/a;->get()Ljava/lang/Object;

    move-result-object v1

    move-object v9, v1

    check-cast v9, Lto/e;

    move-object/from16 v10, p1

    move-object/from16 v11, p2

    move-object/from16 v12, p3

    move-object/from16 v13, p4

    move-object/from16 v14, p5

    move/from16 v15, p6

    invoke-static/range {v2 .. v15}, Lun/c0;->c(Landroid/content/Context;Lyn/a;Ler/c;Lun/i0;Lzq/a;Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;Ldr/c;Lto/e;Lun/k0;Lcom/withpersona/sdk2/camera/camera2/Camera2PreviewView;Lun/g;Lzn/a;Lks/a;Z)Lun/b0;

    move-result-object v1

    return-object v1
.end method
