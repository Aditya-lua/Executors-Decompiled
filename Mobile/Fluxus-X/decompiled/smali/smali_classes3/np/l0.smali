.class public final Lnp/l0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lwt/d;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lwt/d<",
        "Lcom/withpersona/sdk2/inquiry/internal/t;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:Lwt/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lwt/i<",
            "Lnp/m0;",
            ">;"
        }
    .end annotation
.end field

.field public final b:Lwt/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lwt/i<",
            "Lav/l0;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lwt/i;Lwt/i;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lwt/i<",
            "Lnp/m0;",
            ">;",
            "Lwt/i<",
            "Lav/l0;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lnp/l0;->a:Lwt/i;

    iput-object p2, p0, Lnp/l0;->b:Lwt/i;

    return-void
.end method

.method public static a(Lwt/i;Lwt/i;)Lnp/l0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lwt/i<",
            "Lnp/m0;",
            ">;",
            "Lwt/i<",
            "Lav/l0;",
            ">;)",
            "Lnp/l0;"
        }
    .end annotation

    new-instance v0, Lnp/l0;

    invoke-direct {v0, p0, p1}, Lnp/l0;-><init>(Lwt/i;Lwt/i;)V

    return-object v0
.end method

.method public static c(Lnp/m0;Lav/l0;)Lcom/withpersona/sdk2/inquiry/internal/t;
    .locals 1

    new-instance v0, Lcom/withpersona/sdk2/inquiry/internal/t;

    invoke-direct {v0, p0, p1}, Lcom/withpersona/sdk2/inquiry/internal/t;-><init>(Lnp/m0;Lav/l0;)V

    return-object v0
.end method


# virtual methods
.method public b()Lcom/withpersona/sdk2/inquiry/internal/t;
    .locals 2

    iget-object v0, p0, Lnp/l0;->a:Lwt/i;

    invoke-interface {v0}, Lyt/a;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lnp/m0;

    iget-object v1, p0, Lnp/l0;->b:Lwt/i;

    invoke-interface {v1}, Lyt/a;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lav/l0;

    invoke-static {v0, v1}, Lnp/l0;->c(Lnp/m0;Lav/l0;)Lcom/withpersona/sdk2/inquiry/internal/t;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lnp/l0;->b()Lcom/withpersona/sdk2/inquiry/internal/t;

    move-result-object v0

    return-object v0
.end method
