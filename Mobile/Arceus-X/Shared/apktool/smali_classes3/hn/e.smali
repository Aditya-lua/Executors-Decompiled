.class public final Lhn/e;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lft/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lft/i<",
            "Lhn/b0$a;",
            ">;"
        }
    .end annotation
.end field

.field public final b:Lft/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lft/i<",
            "Lhn/i0;",
            ">;"
        }
    .end annotation
.end field

.field public final c:Lft/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lft/i<",
            "Lku/p0;",
            ">;"
        }
    .end annotation
.end field

.field public final d:Lft/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lft/i<",
            "Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lft/i;Lft/i;Lft/i;Lft/i;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lft/i<",
            "Lhn/b0$a;",
            ">;",
            "Lft/i<",
            "Lhn/i0;",
            ">;",
            "Lft/i<",
            "Lku/p0;",
            ">;",
            "Lft/i<",
            "Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lhn/e;->a:Lft/i;

    iput-object p2, p0, Lhn/e;->b:Lft/i;

    iput-object p3, p0, Lhn/e;->c:Lft/i;

    iput-object p4, p0, Lhn/e;->d:Lft/i;

    return-void
.end method

.method public static a(Lft/i;Lft/i;Lft/i;Lft/i;)Lhn/e;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lft/i<",
            "Lhn/b0$a;",
            ">;",
            "Lft/i<",
            "Lhn/i0;",
            ">;",
            "Lft/i<",
            "Lku/p0;",
            ">;",
            "Lft/i<",
            "Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;",
            ">;)",
            "Lhn/e;"
        }
    .end annotation

    new-instance v0, Lhn/e;

    invoke-direct {v0, p0, p1, p2, p3}, Lhn/e;-><init>(Lft/i;Lft/i;Lft/i;Lft/i;)V

    return-object v0
.end method

.method public static c(Lhn/b0$a;Lhn/i0;Lku/p0;Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;Lhn/k0;Lcom/withpersona/sdk2/camera/camera2/Camera2PreviewView;Lhn/g;Lmn/a;Lur/a;Z)Lhn/c;
    .locals 11
    .param p8    # Lur/a;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    new-instance v0, Lhn/c;

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

    invoke-direct/range {v0 .. v10}, Lhn/c;-><init>(Lhn/b0$a;Lhn/i0;Lku/p0;Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;Lhn/k0;Lcom/withpersona/sdk2/camera/camera2/Camera2PreviewView;Lhn/g;Lmn/a;Lur/a;Z)V

    return-object v0
.end method


# virtual methods
.method public b(Lhn/k0;Lcom/withpersona/sdk2/camera/camera2/Camera2PreviewView;Lhn/g;Lmn/a;Lur/a;Z)Lhn/c;
    .locals 11
    .param p5    # Lur/a;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    iget-object v0, p0, Lhn/e;->a:Lft/i;

    invoke-interface {v0}, Lht/a;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Lhn/b0$a;

    iget-object v0, p0, Lhn/e;->b:Lft/i;

    invoke-interface {v0}, Lht/a;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lhn/i0;

    iget-object v0, p0, Lhn/e;->c:Lft/i;

    invoke-interface {v0}, Lht/a;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lku/p0;

    iget-object v0, p0, Lhn/e;->d:Lft/i;

    invoke-interface {v0}, Lht/a;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;

    move-object v5, p1

    move-object v6, p2

    move-object v7, p3

    move-object v8, p4

    move-object/from16 v9, p5

    move/from16 v10, p6

    invoke-static/range {v1 .. v10}, Lhn/e;->c(Lhn/b0$a;Lhn/i0;Lku/p0;Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;Lhn/k0;Lcom/withpersona/sdk2/camera/camera2/Camera2PreviewView;Lhn/g;Lmn/a;Lur/a;Z)Lhn/c;

    move-result-object p1

    return-object p1
.end method
