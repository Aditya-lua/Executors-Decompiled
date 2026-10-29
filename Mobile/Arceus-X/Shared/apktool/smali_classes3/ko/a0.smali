.class public final Lko/a0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lft/d;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lft/d<",
        "Lko/z;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:Lft/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lft/i<",
            "Lfn/x;",
            ">;"
        }
    .end annotation
.end field

.field public final b:Lft/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lft/i<",
            "Lcom/withpersona/sdk2/camera/b;",
            ">;"
        }
    .end annotation
.end field

.field public final c:Lft/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lft/i<",
            "Lgo/e;",
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
            "Lfn/x;",
            ">;",
            "Lft/i<",
            "Lcom/withpersona/sdk2/camera/b;",
            ">;",
            "Lft/i<",
            "Lgo/e;",
            ">;",
            "Lft/i<",
            "Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lko/a0;->a:Lft/i;

    iput-object p2, p0, Lko/a0;->b:Lft/i;

    iput-object p3, p0, Lko/a0;->c:Lft/i;

    iput-object p4, p0, Lko/a0;->d:Lft/i;

    return-void
.end method

.method public static a(Lft/i;Lft/i;Lft/i;Lft/i;)Lko/a0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lft/i<",
            "Lfn/x;",
            ">;",
            "Lft/i<",
            "Lcom/withpersona/sdk2/camera/b;",
            ">;",
            "Lft/i<",
            "Lgo/e;",
            ">;",
            "Lft/i<",
            "Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;",
            ">;)",
            "Lko/a0;"
        }
    .end annotation

    new-instance v0, Lko/a0;

    invoke-direct {v0, p0, p1, p2, p3}, Lko/a0;-><init>(Lft/i;Lft/i;Lft/i;Lft/i;)V

    return-object v0
.end method

.method public static c(Lfn/x;Lcom/withpersona/sdk2/camera/b;Lgo/e;Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;)Lko/z;
    .locals 1

    new-instance v0, Lko/z;

    invoke-direct {v0, p0, p1, p2, p3}, Lko/z;-><init>(Lfn/x;Lcom/withpersona/sdk2/camera/b;Lgo/e;Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;)V

    return-object v0
.end method


# virtual methods
.method public b()Lko/z;
    .locals 4

    iget-object v0, p0, Lko/a0;->a:Lft/i;

    invoke-interface {v0}, Lht/a;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lfn/x;

    iget-object v1, p0, Lko/a0;->b:Lft/i;

    invoke-interface {v1}, Lht/a;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/withpersona/sdk2/camera/b;

    iget-object v2, p0, Lko/a0;->c:Lft/i;

    invoke-interface {v2}, Lht/a;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lgo/e;

    iget-object v3, p0, Lko/a0;->d:Lft/i;

    invoke-interface {v3}, Lht/a;->get()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;

    invoke-static {v0, v1, v2, v3}, Lko/a0;->c(Lfn/x;Lcom/withpersona/sdk2/camera/b;Lgo/e;Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;)Lko/z;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lko/a0;->b()Lko/z;

    move-result-object v0

    return-object v0
.end method
