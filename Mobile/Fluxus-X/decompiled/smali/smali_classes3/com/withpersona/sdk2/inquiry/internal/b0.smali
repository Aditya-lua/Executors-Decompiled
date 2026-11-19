.class public final Lcom/withpersona/sdk2/inquiry/internal/b0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/withpersona/sdk2/inquiry/internal/a0$a;


# instance fields
.field public final a:Lnp/s0;


# direct methods
.method public constructor <init>(Lnp/s0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/internal/b0;->a:Lnp/s0;

    return-void
.end method

.method public static b(Lnp/s0;)Lwt/i;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnp/s0;",
            ")",
            "Lwt/i<",
            "Lcom/withpersona/sdk2/inquiry/internal/a0$a;",
            ">;"
        }
    .end annotation

    new-instance v0, Lcom/withpersona/sdk2/inquiry/internal/b0;

    invoke-direct {v0, p0}, Lcom/withpersona/sdk2/inquiry/internal/b0;-><init>(Lnp/s0;)V

    invoke-static {v0}, Lwt/e;->a(Ljava/lang/Object;)Lwt/d;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public a(Ljava/lang/String;Ljava/lang/String;Lhr/g;)Lcom/withpersona/sdk2/inquiry/internal/a0;
    .locals 1

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/internal/b0;->a:Lnp/s0;

    invoke-virtual {v0, p1, p2, p3}, Lnp/s0;->b(Ljava/lang/String;Ljava/lang/String;Lhr/g;)Lcom/withpersona/sdk2/inquiry/internal/a0;

    move-result-object p1

    return-object p1
.end method
