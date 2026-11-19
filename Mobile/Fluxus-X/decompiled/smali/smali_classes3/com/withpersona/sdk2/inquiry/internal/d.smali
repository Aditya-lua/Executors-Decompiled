.class public final Lcom/withpersona/sdk2/inquiry/internal/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/withpersona/sdk2/inquiry/internal/c$a;


# instance fields
.field public final a:Lnp/d;


# direct methods
.method public constructor <init>(Lnp/d;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/internal/d;->a:Lnp/d;

    return-void
.end method

.method public static b(Lnp/d;)Lwt/i;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnp/d;",
            ")",
            "Lwt/i<",
            "Lcom/withpersona/sdk2/inquiry/internal/c$a;",
            ">;"
        }
    .end annotation

    new-instance v0, Lcom/withpersona/sdk2/inquiry/internal/d;

    invoke-direct {v0, p0}, Lcom/withpersona/sdk2/inquiry/internal/d;-><init>(Lnp/d;)V

    invoke-static {v0}, Lwt/e;->a(Ljava/lang/Object;)Lwt/d;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public a(Lup/e;)Lcom/withpersona/sdk2/inquiry/internal/c;
    .locals 1

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/internal/d;->a:Lnp/d;

    invoke-virtual {v0, p1}, Lnp/d;->b(Lup/e;)Lcom/withpersona/sdk2/inquiry/internal/c;

    move-result-object p1

    return-object p1
.end method
