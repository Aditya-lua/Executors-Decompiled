.class public final Lun/e;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lwt/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lwt/i<",
            "Lun/b0$a;",
            ">;"
        }
    .end annotation
.end field

.field public final b:Lwt/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lwt/i<",
            "Lun/i0;",
            ">;"
        }
    .end annotation
.end field

.field public final c:Lwt/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lwt/i<",
            "Lav/p0;",
            ">;"
        }
    .end annotation
.end field

.field public final d:Lwt/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lwt/i<",
            "Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lwt/i;Lwt/i;Lwt/i;Lwt/i;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lwt/i<",
            "Lun/b0$a;",
            ">;",
            "Lwt/i<",
            "Lun/i0;",
            ">;",
            "Lwt/i<",
            "Lav/p0;",
            ">;",
            "Lwt/i<",
            "Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lun/e;->a:Lwt/i;

    iput-object p2, p0, Lun/e;->b:Lwt/i;

    iput-object p3, p0, Lun/e;->c:Lwt/i;

    iput-object p4, p0, Lun/e;->d:Lwt/i;

    return-void
.end method

.method public static a(Lwt/i;Lwt/i;Lwt/i;Lwt/i;)Lun/e;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lwt/i<",
            "Lun/b0$a;",
            ">;",
            "Lwt/i<",
            "Lun/i0;",
            ">;",
            "Lwt/i<",
            "Lav/p0;",
            ">;",
            "Lwt/i<",
            "Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;",
            ">;)",
            "Lun/e;"
        }
    .end annotation

    new-instance v0, Lun/e;

    invoke-direct {v0, p0, p1, p2, p3}, Lun/e;-><init>(Lwt/i;Lwt/i;Lwt/i;Lwt/i;)V

    return-object v0
.end method

.method public static c(Lun/b0$a;Lun/i0;Lav/p0;Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;Lun/k0;Lcom/withpersona/sdk2/camera/camera2/Camera2PreviewView;Lun/g;Lzn/a;Lks/a;Z)Lun/c;
    .locals 11
    .param p8    # Lks/a;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    new-instance v0, Lun/c;

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    move-object/from16 v9, p8

    move/from16 v10, p9

    invoke-direct/range {v0 .. v10}, Lun/c;-><init>(Lun/b0$a;Lun/i0;Lav/p0;Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;Lun/k0;Lcom/withpersona/sdk2/camera/camera2/Camera2PreviewView;Lun/g;Lzn/a;Lks/a;Z)V

    return-object v0
.end method


# virtual methods
.method public b(Lun/k0;Lcom/withpersona/sdk2/camera/camera2/Camera2PreviewView;Lun/g;Lzn/a;Lks/a;Z)Lun/c;
    .locals 11
    .param p5    # Lks/a;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    iget-object v0, p0, Lun/e;->a:Lwt/i;

    invoke-interface {v0}, Lyt/a;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Lun/b0$a;

    iget-object v0, p0, Lun/e;->b:Lwt/i;

    invoke-interface {v0}, Lyt/a;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lun/i0;

    iget-object v0, p0, Lun/e;->c:Lwt/i;

    invoke-interface {v0}, Lyt/a;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lav/p0;

    iget-object v0, p0, Lun/e;->d:Lwt/i;

    invoke-interface {v0}, Lyt/a;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;

    move-object v5, p1

    move-object v6, p2

    move-object v7, p3

    move-object v8, p4

    move-object/from16 v9, p5

    move/from16 v10, p6

    invoke-static/range {v1 .. v10}, Lun/e;->c(Lun/b0$a;Lun/i0;Lav/p0;Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;Lun/k0;Lcom/withpersona/sdk2/camera/camera2/Camera2PreviewView;Lun/g;Lzn/a;Lks/a;Z)Lun/c;

    move-result-object p1

    return-object p1
.end method
