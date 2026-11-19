.class public final Lnp/d;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lwt/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lwt/i<",
            "Lcom/withpersona/sdk2/inquiry/internal/network/e;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lwt/i;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lwt/i<",
            "Lcom/withpersona/sdk2/inquiry/internal/network/e;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lnp/d;->a:Lwt/i;

    return-void
.end method

.method public static a(Lwt/i;)Lnp/d;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lwt/i<",
            "Lcom/withpersona/sdk2/inquiry/internal/network/e;",
            ">;)",
            "Lnp/d;"
        }
    .end annotation

    new-instance v0, Lnp/d;

    invoke-direct {v0, p0}, Lnp/d;-><init>(Lwt/i;)V

    return-object v0
.end method

.method public static c(Lup/e;Lcom/withpersona/sdk2/inquiry/internal/network/e;)Lcom/withpersona/sdk2/inquiry/internal/c;
    .locals 1

    new-instance v0, Lcom/withpersona/sdk2/inquiry/internal/c;

    invoke-direct {v0, p0, p1}, Lcom/withpersona/sdk2/inquiry/internal/c;-><init>(Lup/e;Lcom/withpersona/sdk2/inquiry/internal/network/e;)V

    return-object v0
.end method


# virtual methods
.method public b(Lup/e;)Lcom/withpersona/sdk2/inquiry/internal/c;
    .locals 1

    iget-object v0, p0, Lnp/d;->a:Lwt/i;

    invoke-interface {v0}, Lyt/a;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/withpersona/sdk2/inquiry/internal/network/e;

    invoke-static {p1, v0}, Lnp/d;->c(Lup/e;Lcom/withpersona/sdk2/inquiry/internal/network/e;)Lcom/withpersona/sdk2/inquiry/internal/c;

    move-result-object p1

    return-object p1
.end method
