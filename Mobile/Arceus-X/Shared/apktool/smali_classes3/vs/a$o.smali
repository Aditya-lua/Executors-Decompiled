.class public Lvs/a$o;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lus/m$c;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lvs/a;->A(Lus/m$b;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lus/m$c<",
        "Lqn/r;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Lus/m;Lqn/s;)V
    .locals 0
    .param p1    # Lus/m;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lqn/s;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    check-cast p2, Lqn/r;

    invoke-virtual {p0, p1, p2}, Lvs/a$o;->b(Lus/m;Lqn/r;)V

    return-void
.end method

.method public b(Lus/m;Lqn/r;)V
    .locals 6
    .param p1    # Lus/m;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lqn/r;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    invoke-interface {p1}, Lus/m;->length()I

    move-result v0

    invoke-interface {p1, p2}, Lus/m;->h(Lqn/s;)V

    invoke-virtual {p2}, Lqn/a;->o()Lqn/a;

    move-result-object v1

    instance-of v2, v1, Lqn/v;

    if-eqz v2, :cond_0

    check-cast v1, Lqn/v;

    invoke-virtual {v1}, Lqn/v;->t()I

    move-result v2

    sget-object v3, Lvs/b;->a:Lus/p;

    invoke-interface {p1}, Lus/m;->o()Lus/r;

    move-result-object v4

    sget-object v5, Lvs/b$a;->b:Lvs/b$a;

    invoke-virtual {v3, v4, v5}, Lus/p;->d(Lus/r;Ljava/lang/Object;)V

    sget-object v3, Lvs/b;->c:Lus/p;

    invoke-interface {p1}, Lus/m;->o()Lus/r;

    move-result-object v4

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v3, v4, v2}, Lus/p;->d(Lus/r;Ljava/lang/Object;)V

    invoke-virtual {v1}, Lqn/v;->t()I

    move-result v2

    add-int/lit8 v2, v2, 0x1

    invoke-virtual {v1, v2}, Lqn/v;->w(I)V

    goto :goto_0

    :cond_0
    sget-object v1, Lvs/b;->a:Lus/p;

    invoke-interface {p1}, Lus/m;->o()Lus/r;

    move-result-object v2

    sget-object v3, Lvs/b$a;->a:Lvs/b$a;

    invoke-virtual {v1, v2, v3}, Lus/p;->d(Lus/r;Ljava/lang/Object;)V

    sget-object v1, Lvs/b;->b:Lus/p;

    invoke-interface {p1}, Lus/m;->o()Lus/r;

    move-result-object v2

    invoke-static {p2}, Lvs/a;->n(Lqn/s;)I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Lus/p;->d(Lus/r;Ljava/lang/Object;)V

    :goto_0
    invoke-interface {p1, p2, v0}, Lus/m;->k(Lqn/s;I)V

    invoke-interface {p1, p2}, Lus/m;->c(Lqn/s;)Z

    move-result p2

    if-eqz p2, :cond_1

    invoke-interface {p1}, Lus/m;->B()V

    :cond_1
    return-void
.end method
