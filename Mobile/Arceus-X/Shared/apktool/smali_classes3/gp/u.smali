.class public final Lgp/u;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lft/d;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lft/d<",
        "Lan/c0;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:Lft/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lft/i<",
            "Ljava/util/Set<",
            "Lan/a0<",
            "*>;>;>;"
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
            "Ljava/util/Set<",
            "Lan/a0<",
            "*>;>;>;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lgp/u;->a:Lft/i;

    return-void
.end method

.method public static a(Lft/i;)Lgp/u;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lft/i<",
            "Ljava/util/Set<",
            "Lan/a0<",
            "*>;>;>;)",
            "Lgp/u;"
        }
    .end annotation

    new-instance v0, Lgp/u;

    invoke-direct {v0, p0}, Lgp/u;-><init>(Lft/i;)V

    return-object v0
.end method

.method public static c(Ljava/util/Set;)Lan/c0;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set<",
            "Lan/a0<",
            "*>;>;)",
            "Lan/c0;"
        }
    .end annotation

    invoke-static {p0}, Lcom/withpersona/sdk2/inquiry/internal/network/f;->p(Ljava/util/Set;)Lan/c0;

    move-result-object p0

    invoke-static {p0}, Lft/h;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lan/c0;

    return-object p0
.end method


# virtual methods
.method public b()Lan/c0;
    .locals 1

    iget-object v0, p0, Lgp/u;->a:Lft/i;

    invoke-interface {v0}, Lht/a;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Set;

    invoke-static {v0}, Lgp/u;->c(Ljava/util/Set;)Lan/c0;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lgp/u;->b()Lan/c0;

    move-result-object v0

    return-object v0
.end method
