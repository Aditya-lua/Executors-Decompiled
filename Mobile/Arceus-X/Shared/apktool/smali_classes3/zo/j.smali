.class public final Lzo/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lft/d;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lft/d<",
        "Lzo/i;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:Lft/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lft/i<",
            "Lgp/w;",
            ">;"
        }
    .end annotation
.end field

.field public final b:Lft/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lft/i<",
            "Lum/w;",
            ">;"
        }
    .end annotation
.end field

.field public final c:Lft/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lft/i<",
            "Lnp/b;",
            ">;"
        }
    .end annotation
.end field

.field public final d:Lft/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lft/i<",
            "Lku/p0;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lft/i;Lft/i;Lft/i;Lft/i;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lft/i<",
            "Lgp/w;",
            ">;",
            "Lft/i<",
            "Lum/w;",
            ">;",
            "Lft/i<",
            "Lnp/b;",
            ">;",
            "Lft/i<",
            "Lku/p0;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lzo/j;->a:Lft/i;

    iput-object p2, p0, Lzo/j;->b:Lft/i;

    iput-object p3, p0, Lzo/j;->c:Lft/i;

    iput-object p4, p0, Lzo/j;->d:Lft/i;

    return-void
.end method

.method public static a(Lft/i;Lft/i;Lft/i;Lft/i;)Lzo/j;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lft/i<",
            "Lgp/w;",
            ">;",
            "Lft/i<",
            "Lum/w;",
            ">;",
            "Lft/i<",
            "Lnp/b;",
            ">;",
            "Lft/i<",
            "Lku/p0;",
            ">;)",
            "Lzo/j;"
        }
    .end annotation

    new-instance v0, Lzo/j;

    invoke-direct {v0, p0, p1, p2, p3}, Lzo/j;-><init>(Lft/i;Lft/i;Lft/i;Lft/i;)V

    return-object v0
.end method

.method public static c(Lgp/w;Lum/w;Lnp/b;Lku/p0;)Lzo/i;
    .locals 1

    new-instance v0, Lzo/i;

    invoke-direct {v0, p0, p1, p2, p3}, Lzo/i;-><init>(Lgp/w;Lum/w;Lnp/b;Lku/p0;)V

    return-object v0
.end method


# virtual methods
.method public b()Lzo/i;
    .locals 4

    iget-object v0, p0, Lzo/j;->a:Lft/i;

    invoke-interface {v0}, Lht/a;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lgp/w;

    iget-object v1, p0, Lzo/j;->b:Lft/i;

    invoke-interface {v1}, Lht/a;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lum/w;

    iget-object v2, p0, Lzo/j;->c:Lft/i;

    invoke-interface {v2}, Lht/a;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lnp/b;

    iget-object v3, p0, Lzo/j;->d:Lft/i;

    invoke-interface {v3}, Lht/a;->get()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lku/p0;

    invoke-static {v0, v1, v2, v3}, Lzo/j;->c(Lgp/w;Lum/w;Lnp/b;Lku/p0;)Lzo/i;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lzo/j;->b()Lzo/i;

    move-result-object v0

    return-object v0
.end method
