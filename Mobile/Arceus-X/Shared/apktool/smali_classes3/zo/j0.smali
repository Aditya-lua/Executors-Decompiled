.class public final Lzo/j0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lft/d;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lft/d<",
        "Lcom/withpersona/sdk2/inquiry/internal/q;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:Lft/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lft/i<",
            "Lzo/k0;",
            ">;"
        }
    .end annotation
.end field

.field public final b:Lft/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lft/i<",
            "Lku/l0;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lft/i;Lft/i;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lft/i<",
            "Lzo/k0;",
            ">;",
            "Lft/i<",
            "Lku/l0;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lzo/j0;->a:Lft/i;

    iput-object p2, p0, Lzo/j0;->b:Lft/i;

    return-void
.end method

.method public static a(Lft/i;Lft/i;)Lzo/j0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lft/i<",
            "Lzo/k0;",
            ">;",
            "Lft/i<",
            "Lku/l0;",
            ">;)",
            "Lzo/j0;"
        }
    .end annotation

    new-instance v0, Lzo/j0;

    invoke-direct {v0, p0, p1}, Lzo/j0;-><init>(Lft/i;Lft/i;)V

    return-object v0
.end method

.method public static c(Lzo/k0;Lku/l0;)Lcom/withpersona/sdk2/inquiry/internal/q;
    .locals 1

    new-instance v0, Lcom/withpersona/sdk2/inquiry/internal/q;

    invoke-direct {v0, p0, p1}, Lcom/withpersona/sdk2/inquiry/internal/q;-><init>(Lzo/k0;Lku/l0;)V

    return-object v0
.end method


# virtual methods
.method public b()Lcom/withpersona/sdk2/inquiry/internal/q;
    .locals 2

    iget-object v0, p0, Lzo/j0;->a:Lft/i;

    invoke-interface {v0}, Lht/a;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lzo/k0;

    iget-object v1, p0, Lzo/j0;->b:Lft/i;

    invoke-interface {v1}, Lht/a;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lku/l0;

    invoke-static {v0, v1}, Lzo/j0;->c(Lzo/k0;Lku/l0;)Lcom/withpersona/sdk2/inquiry/internal/q;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lzo/j0;->b()Lcom/withpersona/sdk2/inquiry/internal/q;

    move-result-object v0

    return-object v0
.end method
