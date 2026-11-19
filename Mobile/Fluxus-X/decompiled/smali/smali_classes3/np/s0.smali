.class public final Lnp/s0;
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

    iput-object p1, p0, Lnp/s0;->a:Lwt/i;

    return-void
.end method

.method public static a(Lwt/i;)Lnp/s0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lwt/i<",
            "Lcom/withpersona/sdk2/inquiry/internal/network/e;",
            ">;)",
            "Lnp/s0;"
        }
    .end annotation

    new-instance v0, Lnp/s0;

    invoke-direct {v0, p0}, Lnp/s0;-><init>(Lwt/i;)V

    return-object v0
.end method

.method public static c(Ljava/lang/String;Ljava/lang/String;Lhr/g;Lcom/withpersona/sdk2/inquiry/internal/network/e;)Lcom/withpersona/sdk2/inquiry/internal/a0;
    .locals 1

    new-instance v0, Lcom/withpersona/sdk2/inquiry/internal/a0;

    invoke-direct {v0, p0, p1, p2, p3}, Lcom/withpersona/sdk2/inquiry/internal/a0;-><init>(Ljava/lang/String;Ljava/lang/String;Lhr/g;Lcom/withpersona/sdk2/inquiry/internal/network/e;)V

    return-object v0
.end method


# virtual methods
.method public b(Ljava/lang/String;Ljava/lang/String;Lhr/g;)Lcom/withpersona/sdk2/inquiry/internal/a0;
    .locals 1

    iget-object v0, p0, Lnp/s0;->a:Lwt/i;

    invoke-interface {v0}, Lyt/a;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/withpersona/sdk2/inquiry/internal/network/e;

    invoke-static {p1, p2, p3, v0}, Lnp/s0;->c(Ljava/lang/String;Ljava/lang/String;Lhr/g;Lcom/withpersona/sdk2/inquiry/internal/network/e;)Lcom/withpersona/sdk2/inquiry/internal/a0;

    move-result-object p1

    return-object p1
.end method
