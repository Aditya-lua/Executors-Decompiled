.class public final Lep/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lft/d;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lft/d<",
        "Lep/a;",
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

.field public final b:Lft/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lft/i<",
            "Lnp/e$a;",
            ">;"
        }
    .end annotation
.end field

.field public final c:Lft/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lft/i<",
            "Lep/f;",
            ">;"
        }
    .end annotation
.end field

.field public final d:Lft/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lft/i<",
            "Lku/l0;",
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
            "Landroid/content/Context;",
            ">;",
            "Lft/i<",
            "Lnp/e$a;",
            ">;",
            "Lft/i<",
            "Lep/f;",
            ">;",
            "Lft/i<",
            "Lku/l0;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lep/c;->a:Lft/i;

    iput-object p2, p0, Lep/c;->b:Lft/i;

    iput-object p3, p0, Lep/c;->c:Lft/i;

    iput-object p4, p0, Lep/c;->d:Lft/i;

    return-void
.end method

.method public static a(Lft/i;Lft/i;Lft/i;Lft/i;)Lep/c;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lft/i<",
            "Landroid/content/Context;",
            ">;",
            "Lft/i<",
            "Lnp/e$a;",
            ">;",
            "Lft/i<",
            "Lep/f;",
            ">;",
            "Lft/i<",
            "Lku/l0;",
            ">;)",
            "Lep/c;"
        }
    .end annotation

    new-instance v0, Lep/c;

    invoke-direct {v0, p0, p1, p2, p3}, Lep/c;-><init>(Lft/i;Lft/i;Lft/i;Lft/i;)V

    return-object v0
.end method

.method public static c(Landroid/content/Context;Lnp/e$a;Lep/f;Lku/l0;)Lep/a;
    .locals 1

    new-instance v0, Lep/a;

    invoke-direct {v0, p0, p1, p2, p3}, Lep/a;-><init>(Landroid/content/Context;Lnp/e$a;Lep/f;Lku/l0;)V

    return-object v0
.end method


# virtual methods
.method public b()Lep/a;
    .locals 4

    iget-object v0, p0, Lep/c;->a:Lft/i;

    invoke-interface {v0}, Lht/a;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/Context;

    iget-object v1, p0, Lep/c;->b:Lft/i;

    invoke-interface {v1}, Lht/a;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lnp/e$a;

    iget-object v2, p0, Lep/c;->c:Lft/i;

    invoke-interface {v2}, Lht/a;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lep/f;

    iget-object v3, p0, Lep/c;->d:Lft/i;

    invoke-interface {v3}, Lht/a;->get()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lku/l0;

    invoke-static {v0, v1, v2, v3}, Lep/c;->c(Landroid/content/Context;Lnp/e$a;Lep/f;Lku/l0;)Lep/a;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lep/c;->b()Lep/a;

    move-result-object v0

    return-object v0
.end method
