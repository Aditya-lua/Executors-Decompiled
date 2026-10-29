.class public Lvs/a$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lus/m$c;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lvs/a;->v(Lus/m$b;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lus/m$c<",
        "Lqn/j;",
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

    check-cast p2, Lqn/j;

    invoke-virtual {p0, p1, p2}, Lvs/a$b;->b(Lus/m;Lqn/j;)V

    return-void
.end method

.method public b(Lus/m;Lqn/j;)V
    .locals 4
    .param p1    # Lus/m;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lqn/j;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    invoke-interface {p1, p2}, Lus/m;->t(Lqn/s;)V

    invoke-interface {p1}, Lus/m;->length()I

    move-result v0

    invoke-interface {p1, p2}, Lus/m;->h(Lqn/s;)V

    sget-object v1, Lvs/b;->d:Lus/p;

    invoke-interface {p1}, Lus/m;->o()Lus/r;

    move-result-object v2

    invoke-virtual {p2}, Lqn/j;->p()I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Lus/p;->d(Lus/r;Ljava/lang/Object;)V

    invoke-interface {p1, p2, v0}, Lus/m;->k(Lqn/s;I)V

    invoke-interface {p1, p2}, Lus/m;->D(Lqn/s;)V

    return-void
.end method
