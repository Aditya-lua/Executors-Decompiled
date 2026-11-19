.class public final Lnp/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lwt/d;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lwt/d<",
        "Lnp/f;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:Lwt/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lwt/i<",
            "Lmo/d;",
            ">;"
        }
    .end annotation
.end field

.field public final b:Lwt/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lwt/i<",
            "Lcom/withpersona/sdk2/inquiry/internal/network/e;",
            ">;"
        }
    .end annotation
.end field

.field public final c:Lwt/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lwt/i<",
            "Lav/l0;",
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
            "Lmo/d;",
            ">;",
            "Lwt/i<",
            "Lcom/withpersona/sdk2/inquiry/internal/network/e;",
            ">;",
            "Lwt/i<",
            "Lav/l0;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lnp/g;->a:Lwt/i;

    iput-object p2, p0, Lnp/g;->b:Lwt/i;

    iput-object p3, p0, Lnp/g;->c:Lwt/i;

    return-void
.end method

.method public static a(Lwt/i;Lwt/i;Lwt/i;)Lnp/g;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lwt/i<",
            "Lmo/d;",
            ">;",
            "Lwt/i<",
            "Lcom/withpersona/sdk2/inquiry/internal/network/e;",
            ">;",
            "Lwt/i<",
            "Lav/l0;",
            ">;)",
            "Lnp/g;"
        }
    .end annotation

    new-instance v0, Lnp/g;

    invoke-direct {v0, p0, p1, p2}, Lnp/g;-><init>(Lwt/i;Lwt/i;Lwt/i;)V

    return-object v0
.end method

.method public static c(Lmo/d;Lcom/withpersona/sdk2/inquiry/internal/network/e;Lav/l0;)Lnp/f;
    .locals 1

    new-instance v0, Lnp/f;

    invoke-direct {v0, p0, p1, p2}, Lnp/f;-><init>(Lmo/d;Lcom/withpersona/sdk2/inquiry/internal/network/e;Lav/l0;)V

    return-object v0
.end method


# virtual methods
.method public b()Lnp/f;
    .locals 3

    iget-object v0, p0, Lnp/g;->a:Lwt/i;

    invoke-interface {v0}, Lyt/a;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lmo/d;

    iget-object v1, p0, Lnp/g;->b:Lwt/i;

    invoke-interface {v1}, Lyt/a;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/withpersona/sdk2/inquiry/internal/network/e;

    iget-object v2, p0, Lnp/g;->c:Lwt/i;

    invoke-interface {v2}, Lyt/a;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lav/l0;

    invoke-static {v0, v1, v2}, Lnp/g;->c(Lmo/d;Lcom/withpersona/sdk2/inquiry/internal/network/e;Lav/l0;)Lnp/f;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lnp/g;->b()Lnp/f;

    move-result-object v0

    return-object v0
.end method
