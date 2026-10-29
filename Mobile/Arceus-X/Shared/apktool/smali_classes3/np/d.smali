.class public final Lnp/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lft/d;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lft/d<",
        "Lnp/b;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:Lft/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lft/i<",
            "Landroid/content/Context;",
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
            "Landroid/content/Context;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lnp/d;->a:Lft/i;

    return-void
.end method

.method public static a(Lft/i;)Lnp/d;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lft/i<",
            "Landroid/content/Context;",
            ">;)",
            "Lnp/d;"
        }
    .end annotation

    new-instance v0, Lnp/d;

    invoke-direct {v0, p0}, Lnp/d;-><init>(Lft/i;)V

    return-object v0
.end method

.method public static c(Landroid/content/Context;)Lnp/b;
    .locals 1

    new-instance v0, Lnp/b;

    invoke-direct {v0, p0}, Lnp/b;-><init>(Landroid/content/Context;)V

    return-object v0
.end method


# virtual methods
.method public b()Lnp/b;
    .locals 1

    iget-object v0, p0, Lnp/d;->a:Lft/i;

    invoke-interface {v0}, Lht/a;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/Context;

    invoke-static {v0}, Lnp/d;->c(Landroid/content/Context;)Lnp/b;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lnp/d;->b()Lnp/b;

    move-result-object v0

    return-object v0
.end method
