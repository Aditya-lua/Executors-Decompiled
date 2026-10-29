.class public final Lzo/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lft/d;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lft/d<",
        "Lzo/f;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:Lft/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lft/i<",
            "Lyn/d;",
            ">;"
        }
    .end annotation
.end field

.field public final b:Lft/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lft/i<",
            "Lcom/withpersona/sdk2/inquiry/internal/network/e;",
            ">;"
        }
    .end annotation
.end field

.field public final c:Lft/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lft/i<",
            "Lku/l0;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lft/i;Lft/i;Lft/i;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lft/i<",
            "Lyn/d;",
            ">;",
            "Lft/i<",
            "Lcom/withpersona/sdk2/inquiry/internal/network/e;",
            ">;",
            "Lft/i<",
            "Lku/l0;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lzo/g;->a:Lft/i;

    iput-object p2, p0, Lzo/g;->b:Lft/i;

    iput-object p3, p0, Lzo/g;->c:Lft/i;

    return-void
.end method

.method public static a(Lft/i;Lft/i;Lft/i;)Lzo/g;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lft/i<",
            "Lyn/d;",
            ">;",
            "Lft/i<",
            "Lcom/withpersona/sdk2/inquiry/internal/network/e;",
            ">;",
            "Lft/i<",
            "Lku/l0;",
            ">;)",
            "Lzo/g;"
        }
    .end annotation

    new-instance v0, Lzo/g;

    invoke-direct {v0, p0, p1, p2}, Lzo/g;-><init>(Lft/i;Lft/i;Lft/i;)V

    return-object v0
.end method

.method public static c(Lyn/d;Lcom/withpersona/sdk2/inquiry/internal/network/e;Lku/l0;)Lzo/f;
    .locals 1

    new-instance v0, Lzo/f;

    invoke-direct {v0, p0, p1, p2}, Lzo/f;-><init>(Lyn/d;Lcom/withpersona/sdk2/inquiry/internal/network/e;Lku/l0;)V

    return-object v0
.end method


# virtual methods
.method public b()Lzo/f;
    .locals 3

    iget-object v0, p0, Lzo/g;->a:Lft/i;

    invoke-interface {v0}, Lht/a;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lyn/d;

    iget-object v1, p0, Lzo/g;->b:Lft/i;

    invoke-interface {v1}, Lht/a;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/withpersona/sdk2/inquiry/internal/network/e;

    iget-object v2, p0, Lzo/g;->c:Lft/i;

    invoke-interface {v2}, Lht/a;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lku/l0;

    invoke-static {v0, v1, v2}, Lzo/g;->c(Lyn/d;Lcom/withpersona/sdk2/inquiry/internal/network/e;Lku/l0;)Lzo/f;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lzo/g;->b()Lzo/f;

    move-result-object v0

    return-object v0
.end method
