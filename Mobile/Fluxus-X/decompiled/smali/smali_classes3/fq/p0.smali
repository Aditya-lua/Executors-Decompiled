.class public final Lfq/p0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lwt/d;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lwt/d<",
        "Lfq/o0$a;",
        ">;"
    }
.end annotation


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
            "Lg/d<",
            "Ljava/lang/String;",
            ">;>;"
        }
    .end annotation
.end field

.field public final c:Lwt/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lwt/i<",
            "Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lwt/i;Lwt/i;Lwt/i;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lwt/i<",
            "Landroid/content/Context;",
            ">;",
            "Lwt/i<",
            "Lg/d<",
            "Ljava/lang/String;",
            ">;>;",
            "Lwt/i<",
            "Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lfq/p0;->a:Lwt/i;

    iput-object p2, p0, Lfq/p0;->b:Lwt/i;

    iput-object p3, p0, Lfq/p0;->c:Lwt/i;

    return-void
.end method

.method public static a(Lwt/i;Lwt/i;Lwt/i;)Lfq/p0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lwt/i<",
            "Landroid/content/Context;",
            ">;",
            "Lwt/i<",
            "Lg/d<",
            "Ljava/lang/String;",
            ">;>;",
            "Lwt/i<",
            "Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;",
            ">;)",
            "Lfq/p0;"
        }
    .end annotation

    new-instance v0, Lfq/p0;

    invoke-direct {v0, p0, p1, p2}, Lfq/p0;-><init>(Lwt/i;Lwt/i;Lwt/i;)V

    return-object v0
.end method

.method public static c(Landroid/content/Context;Lg/d;Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;)Lfq/o0$a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Lg/d<",
            "Ljava/lang/String;",
            ">;",
            "Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;",
            ")",
            "Lfq/o0$a;"
        }
    .end annotation

    new-instance v0, Lfq/o0$a;

    invoke-direct {v0, p0, p1, p2}, Lfq/o0$a;-><init>(Landroid/content/Context;Lg/d;Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;)V

    return-object v0
.end method


# virtual methods
.method public b()Lfq/o0$a;
    .locals 3

    iget-object v0, p0, Lfq/p0;->a:Lwt/i;

    invoke-interface {v0}, Lyt/a;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/Context;

    iget-object v1, p0, Lfq/p0;->b:Lwt/i;

    invoke-interface {v1}, Lyt/a;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lg/d;

    iget-object v2, p0, Lfq/p0;->c:Lwt/i;

    invoke-interface {v2}, Lyt/a;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;

    invoke-static {v0, v1, v2}, Lfq/p0;->c(Landroid/content/Context;Lg/d;Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;)Lfq/o0$a;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lfq/p0;->b()Lfq/o0$a;

    move-result-object v0

    return-object v0
.end method
