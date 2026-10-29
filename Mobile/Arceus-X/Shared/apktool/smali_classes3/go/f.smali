.class public final Lgo/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lft/d;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lft/d<",
        "Lgo/e;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:Lft/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lft/i<",
            "Ljava/util/Set<",
            "Lgo/d;",
            ">;>;"
        }
    .end annotation
.end field

.field public final b:Lft/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lft/i<",
            "Landroid/content/Context;",
            ">;"
        }
    .end annotation
.end field

.field public final c:Lft/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lft/i<",
            "Landroidx/lifecycle/l0;",
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
            "Ljava/util/Set<",
            "Lgo/d;",
            ">;>;",
            "Lft/i<",
            "Landroid/content/Context;",
            ">;",
            "Lft/i<",
            "Landroidx/lifecycle/l0;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lgo/f;->a:Lft/i;

    iput-object p2, p0, Lgo/f;->b:Lft/i;

    iput-object p3, p0, Lgo/f;->c:Lft/i;

    return-void
.end method

.method public static a(Lft/i;Lft/i;Lft/i;)Lgo/f;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lft/i<",
            "Ljava/util/Set<",
            "Lgo/d;",
            ">;>;",
            "Lft/i<",
            "Landroid/content/Context;",
            ">;",
            "Lft/i<",
            "Landroidx/lifecycle/l0;",
            ">;)",
            "Lgo/f;"
        }
    .end annotation

    new-instance v0, Lgo/f;

    invoke-direct {v0, p0, p1, p2}, Lgo/f;-><init>(Lft/i;Lft/i;Lft/i;)V

    return-object v0
.end method

.method public static c(Ljava/util/Set;Landroid/content/Context;Landroidx/lifecycle/l0;)Lgo/e;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set<",
            "Lgo/d;",
            ">;",
            "Landroid/content/Context;",
            "Landroidx/lifecycle/l0;",
            ")",
            "Lgo/e;"
        }
    .end annotation

    new-instance v0, Lgo/e;

    invoke-direct {v0, p0, p1, p2}, Lgo/e;-><init>(Ljava/util/Set;Landroid/content/Context;Landroidx/lifecycle/l0;)V

    return-object v0
.end method


# virtual methods
.method public b()Lgo/e;
    .locals 3

    iget-object v0, p0, Lgo/f;->a:Lft/i;

    invoke-interface {v0}, Lht/a;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Set;

    iget-object v1, p0, Lgo/f;->b:Lft/i;

    invoke-interface {v1}, Lht/a;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/content/Context;

    iget-object v2, p0, Lgo/f;->c:Lft/i;

    invoke-interface {v2}, Lht/a;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroidx/lifecycle/l0;

    invoke-static {v0, v1, v2}, Lgo/f;->c(Ljava/util/Set;Landroid/content/Context;Landroidx/lifecycle/l0;)Lgo/e;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lgo/f;->b()Lgo/e;

    move-result-object v0

    return-object v0
.end method
