.class public final Lnp/f;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lft/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lft/i<",
            "Lnp/b;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lft/i;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lft/i<",
            "Lnp/b;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lnp/f;->a:Lft/i;

    return-void
.end method

.method public static a(Lft/i;)Lnp/f;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lft/i<",
            "Lnp/b;",
            ">;)",
            "Lnp/f;"
        }
    .end annotation

    new-instance v0, Lnp/f;

    invoke-direct {v0, p0}, Lnp/f;-><init>(Lft/i;)V

    return-object v0
.end method

.method public static c(Lnp/b;Ljava/lang/String;)Lnp/e;
    .locals 1

    new-instance v0, Lnp/e;

    invoke-direct {v0, p0, p1}, Lnp/e;-><init>(Lnp/b;Ljava/lang/String;)V

    return-object v0
.end method


# virtual methods
.method public b(Ljava/lang/String;)Lnp/e;
    .locals 1

    iget-object v0, p0, Lnp/f;->a:Lft/i;

    invoke-interface {v0}, Lht/a;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lnp/b;

    invoke-static {v0, p1}, Lnp/f;->c(Lnp/b;Ljava/lang/String;)Lnp/e;

    move-result-object p1

    return-object p1
.end method
