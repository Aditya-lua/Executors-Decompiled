.class public final Lcom/withpersona/sdk2/inquiry/internal/q;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/withpersona/sdk2/inquiry/internal/p$a;


# instance fields
.field public final a:Lnp/j0;


# direct methods
.method public constructor <init>(Lnp/j0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/internal/q;->a:Lnp/j0;

    return-void
.end method

.method public static a(Lnp/j0;)Lwt/i;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnp/j0;",
            ")",
            "Lwt/i<",
            "Lcom/withpersona/sdk2/inquiry/internal/p$a;",
            ">;"
        }
    .end annotation

    new-instance v0, Lcom/withpersona/sdk2/inquiry/internal/q;

    invoke-direct {v0, p0}, Lcom/withpersona/sdk2/inquiry/internal/q;-><init>(Lnp/j0;)V

    invoke-static {v0}, Lwt/e;->a(Ljava/lang/Object;)Lwt/d;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public create(Ljava/lang/String;)Lcom/withpersona/sdk2/inquiry/internal/p;
    .locals 1

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/internal/q;->a:Lnp/j0;

    invoke-virtual {v0, p1}, Lnp/j0;->b(Ljava/lang/String;)Lcom/withpersona/sdk2/inquiry/internal/p;

    move-result-object p1

    return-object p1
.end method
