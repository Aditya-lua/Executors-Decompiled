.class public Lvs/a$e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lus/m$c;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lvs/a;->D(Lus/m$b;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lus/m$c<",
        "Lqn/w;",
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

    check-cast p2, Lqn/w;

    invoke-virtual {p0, p1, p2}, Lvs/a$e;->b(Lus/m;Lqn/w;)V

    return-void
.end method

.method public b(Lus/m;Lqn/w;)V
    .locals 5
    .param p1    # Lus/m;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lqn/w;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    invoke-static {p2}, Lvs/a;->m(Lqn/w;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-interface {p1, p2}, Lus/m;->t(Lqn/s;)V

    :cond_0
    invoke-interface {p1}, Lus/m;->length()I

    move-result v1

    invoke-interface {p1, p2}, Lus/m;->h(Lqn/s;)V

    sget-object v2, Lvs/b;->f:Lus/p;

    invoke-interface {p1}, Lus/m;->o()Lus/r;

    move-result-object v3

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v4

    invoke-virtual {v2, v3, v4}, Lus/p;->d(Lus/r;Ljava/lang/Object;)V

    invoke-interface {p1, p2, v1}, Lus/m;->k(Lqn/s;I)V

    if-nez v0, :cond_1

    invoke-interface {p1, p2}, Lus/m;->D(Lqn/s;)V

    :cond_1
    return-void
.end method
