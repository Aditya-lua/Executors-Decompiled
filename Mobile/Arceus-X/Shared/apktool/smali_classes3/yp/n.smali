.class public final Lyp/n;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lft/d;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lft/d<",
        "Lcom/withpersona/sdk2/inquiry/selfie/d;",
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
            "Lhn/i0;",
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
            "Lcom/withpersona/sdk2/camera/b;",
            ">;",
            "Lft/i<",
            "Lfn/n0;",
            ">;",
            "Lft/i<",
            "Lhn/i0;",
            ">;",
            "Lft/i<",
            "Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lyp/n;->a:Lft/i;

    iput-object p2, p0, Lyp/n;->b:Lft/i;

    iput-object p3, p0, Lyp/n;->c:Lft/i;

    iput-object p4, p0, Lyp/n;->d:Lft/i;

    return-void
.end method

.method public static a(Lft/i;Lft/i;Lft/i;Lft/i;)Lyp/n;
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
            "Lhn/i0;",
            ">;",
            "Lft/i<",
            "Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;",
            ">;)",
            "Lyp/n;"
        }
    .end annotation

    new-instance v0, Lyp/n;

    invoke-direct {v0, p0, p1, p2, p3}, Lyp/n;-><init>(Lft/i;Lft/i;Lft/i;Lft/i;)V

    return-object v0
.end method

.method public static c(Lcom/withpersona/sdk2/camera/b;Lct/a;Lhn/i0;Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;)Lcom/withpersona/sdk2/inquiry/selfie/d;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/withpersona/sdk2/camera/b;",
            "Lct/a<",
            "Lfn/n0;",
            ">;",
            "Lhn/i0;",
            "Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;",
            ")",
            "Lcom/withpersona/sdk2/inquiry/selfie/d;"
        }
    .end annotation

    new-instance v0, Lcom/withpersona/sdk2/inquiry/selfie/d;

    invoke-direct {v0, p0, p1, p2, p3}, Lcom/withpersona/sdk2/inquiry/selfie/d;-><init>(Lcom/withpersona/sdk2/camera/b;Lct/a;Lhn/i0;Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;)V

    return-object v0
.end method


# virtual methods
.method public b()Lcom/withpersona/sdk2/inquiry/selfie/d;
    .locals 4

    iget-object v0, p0, Lyp/n;->a:Lft/i;

    invoke-interface {v0}, Lht/a;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/withpersona/sdk2/camera/b;

    iget-object v1, p0, Lyp/n;->b:Lft/i;

    invoke-static {v1}, Lft/c;->b(Lft/i;)Lct/a;

    move-result-object v1

    iget-object v2, p0, Lyp/n;->c:Lft/i;

    invoke-interface {v2}, Lht/a;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lhn/i0;

    iget-object v3, p0, Lyp/n;->d:Lft/i;

    invoke-interface {v3}, Lht/a;->get()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;

    invoke-static {v0, v1, v2, v3}, Lyp/n;->c(Lcom/withpersona/sdk2/camera/b;Lct/a;Lhn/i0;Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;)Lcom/withpersona/sdk2/inquiry/selfie/d;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lyp/n;->b()Lcom/withpersona/sdk2/inquiry/selfie/d;

    move-result-object v0

    return-object v0
.end method
