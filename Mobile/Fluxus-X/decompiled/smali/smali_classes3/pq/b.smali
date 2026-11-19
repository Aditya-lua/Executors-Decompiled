.class public final Lpq/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lwt/d;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lwt/d<",
        "Lpq/a;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:Lwt/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lwt/i<",
            "Landroidx/lifecycle/l0;",
            ">;"
        }
    .end annotation
.end field

.field public final b:Lwt/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lwt/i<",
            "Lcom/withpersona/sdk2/inquiry/network/upload/UploadService;",
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


# direct methods
.method public constructor <init>(Lwt/i;Lwt/i;Lwt/i;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lwt/i<",
            "Landroidx/lifecycle/l0;",
            ">;",
            "Lwt/i<",
            "Lcom/withpersona/sdk2/inquiry/network/upload/UploadService;",
            ">;",
            "Lwt/i<",
            "Lav/p0;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpq/b;->a:Lwt/i;

    iput-object p2, p0, Lpq/b;->b:Lwt/i;

    iput-object p3, p0, Lpq/b;->c:Lwt/i;

    return-void
.end method

.method public static a(Lwt/i;Lwt/i;Lwt/i;)Lpq/b;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lwt/i<",
            "Landroidx/lifecycle/l0;",
            ">;",
            "Lwt/i<",
            "Lcom/withpersona/sdk2/inquiry/network/upload/UploadService;",
            ">;",
            "Lwt/i<",
            "Lav/p0;",
            ">;)",
            "Lpq/b;"
        }
    .end annotation

    new-instance v0, Lpq/b;

    invoke-direct {v0, p0, p1, p2}, Lpq/b;-><init>(Lwt/i;Lwt/i;Lwt/i;)V

    return-object v0
.end method

.method public static c(Landroidx/lifecycle/l0;Lcom/withpersona/sdk2/inquiry/network/upload/UploadService;Lav/p0;)Lpq/a;
    .locals 1

    new-instance v0, Lpq/a;

    invoke-direct {v0, p0, p1, p2}, Lpq/a;-><init>(Landroidx/lifecycle/l0;Lcom/withpersona/sdk2/inquiry/network/upload/UploadService;Lav/p0;)V

    return-object v0
.end method


# virtual methods
.method public b()Lpq/a;
    .locals 3

    iget-object v0, p0, Lpq/b;->a:Lwt/i;

    invoke-interface {v0}, Lyt/a;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/lifecycle/l0;

    iget-object v1, p0, Lpq/b;->b:Lwt/i;

    invoke-interface {v1}, Lyt/a;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/withpersona/sdk2/inquiry/network/upload/UploadService;

    iget-object v2, p0, Lpq/b;->c:Lwt/i;

    invoke-interface {v2}, Lyt/a;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lav/p0;

    invoke-static {v0, v1, v2}, Lpq/b;->c(Landroidx/lifecycle/l0;Lcom/withpersona/sdk2/inquiry/network/upload/UploadService;Lav/p0;)Lpq/a;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lpq/b;->b()Lpq/a;

    move-result-object v0

    return-object v0
.end method
