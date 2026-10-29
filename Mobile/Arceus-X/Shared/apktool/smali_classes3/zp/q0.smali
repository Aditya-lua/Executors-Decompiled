.class public final Lzp/q0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lft/d;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lft/d<",
        "Lzp/p0;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:Lft/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lft/i<",
            "Lcom/withpersona/sdk2/camera/b;",
            ">;"
        }
    .end annotation
.end field

.field public final b:Lft/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lft/i<",
            "Lfn/n0;",
            ">;"
        }
    .end annotation
.end field

.field public final c:Lft/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lft/i<",
            "Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;",
            ">;"
        }
    .end annotation
.end field

.field public final d:Lft/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lft/i<",
            "Lgo/e;",
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
            "Lcom/withpersona/sdk2/camera/b;",
            ">;",
            "Lft/i<",
            "Lfn/n0;",
            ">;",
            "Lft/i<",
            "Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;",
            ">;",
            "Lft/i<",
            "Lgo/e;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lzp/q0;->a:Lft/i;

    iput-object p2, p0, Lzp/q0;->b:Lft/i;

    iput-object p3, p0, Lzp/q0;->c:Lft/i;

    iput-object p4, p0, Lzp/q0;->d:Lft/i;

    return-void
.end method

.method public static a(Lft/i;Lft/i;Lft/i;Lft/i;)Lzp/q0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lft/i<",
            "Lcom/withpersona/sdk2/camera/b;",
            ">;",
            "Lft/i<",
            "Lfn/n0;",
            ">;",
            "Lft/i<",
            "Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;",
            ">;",
            "Lft/i<",
            "Lgo/e;",
            ">;)",
            "Lzp/q0;"
        }
    .end annotation

    new-instance v0, Lzp/q0;

    invoke-direct {v0, p0, p1, p2, p3}, Lzp/q0;-><init>(Lft/i;Lft/i;Lft/i;Lft/i;)V

    return-object v0
.end method

.method public static c(Lcom/withpersona/sdk2/camera/b;Lct/a;Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;Lgo/e;)Lzp/p0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/withpersona/sdk2/camera/b;",
            "Lct/a<",
            "Lfn/n0;",
            ">;",
            "Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;",
            "Lgo/e;",
            ")",
            "Lzp/p0;"
        }
    .end annotation

    new-instance v0, Lzp/p0;

    invoke-direct {v0, p0, p1, p2, p3}, Lzp/p0;-><init>(Lcom/withpersona/sdk2/camera/b;Lct/a;Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;Lgo/e;)V

    return-object v0
.end method


# virtual methods
.method public b()Lzp/p0;
    .locals 4

    iget-object v0, p0, Lzp/q0;->a:Lft/i;

    invoke-interface {v0}, Lht/a;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/withpersona/sdk2/camera/b;

    iget-object v1, p0, Lzp/q0;->b:Lft/i;

    invoke-static {v1}, Lft/c;->b(Lft/i;)Lct/a;

    move-result-object v1

    iget-object v2, p0, Lzp/q0;->c:Lft/i;

    invoke-interface {v2}, Lht/a;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;

    iget-object v3, p0, Lzp/q0;->d:Lft/i;

    invoke-interface {v3}, Lht/a;->get()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lgo/e;

    invoke-static {v0, v1, v2, v3}, Lzp/q0;->c(Lcom/withpersona/sdk2/camera/b;Lct/a;Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;Lgo/e;)Lzp/p0;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lzp/q0;->b()Lzp/p0;

    move-result-object v0

    return-object v0
.end method
