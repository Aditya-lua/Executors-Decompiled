.class public final Lnp/k0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lwt/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lwt/i<",
            "Lnp/q0;",
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
            "Lnp/q0;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lnp/k0;->a:Lwt/i;

    return-void
.end method

.method public static a(Lwt/i;)Lnp/k0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lwt/i<",
            "Lnp/q0;",
            ">;)",
            "Lnp/k0;"
        }
    .end annotation

    new-instance v0, Lnp/k0;

    invoke-direct {v0, p0}, Lnp/k0;-><init>(Lwt/i;)V

    return-object v0
.end method

.method public static c(Lnp/q0;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/withpersona/sdk2/inquiry/internal/r;
    .locals 1

    new-instance v0, Lcom/withpersona/sdk2/inquiry/internal/r;

    invoke-direct {v0, p0, p1, p2, p3}, Lcom/withpersona/sdk2/inquiry/internal/r;-><init>(Lnp/q0;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-object v0
.end method


# virtual methods
.method public b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/withpersona/sdk2/inquiry/internal/r;
    .locals 1

    iget-object v0, p0, Lnp/k0;->a:Lwt/i;

    invoke-interface {v0}, Lyt/a;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lnp/q0;

    invoke-static {v0, p1, p2, p3}, Lnp/k0;->c(Lnp/q0;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/withpersona/sdk2/inquiry/internal/r;

    move-result-object p1

    return-object p1
.end method
