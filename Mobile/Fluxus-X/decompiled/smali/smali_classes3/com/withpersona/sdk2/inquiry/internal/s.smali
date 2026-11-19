.class public final Lcom/withpersona/sdk2/inquiry/internal/s;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/withpersona/sdk2/inquiry/internal/r$a;


# instance fields
.field public final a:Lnp/k0;


# direct methods
.method public constructor <init>(Lnp/k0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/internal/s;->a:Lnp/k0;

    return-void
.end method

.method public static b(Lnp/k0;)Lwt/i;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnp/k0;",
            ")",
            "Lwt/i<",
            "Lcom/withpersona/sdk2/inquiry/internal/r$a;",
            ">;"
        }
    .end annotation

    new-instance v0, Lcom/withpersona/sdk2/inquiry/internal/s;

    invoke-direct {v0, p0}, Lcom/withpersona/sdk2/inquiry/internal/s;-><init>(Lnp/k0;)V

    invoke-static {v0}, Lwt/e;->a(Ljava/lang/Object;)Lwt/d;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/withpersona/sdk2/inquiry/internal/r;
    .locals 1

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/internal/s;->a:Lnp/k0;

    invoke-virtual {v0, p1, p2, p3}, Lnp/k0;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/withpersona/sdk2/inquiry/internal/r;

    move-result-object p1

    return-object p1
.end method
