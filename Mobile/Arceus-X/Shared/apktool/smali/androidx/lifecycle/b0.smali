.class public Landroidx/lifecycle/b0;
.super Landroidx/lifecycle/d0;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/lifecycle/b0$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Landroidx/lifecycle/d0<",
        "TT;>;"
    }
.end annotation


# instance fields
.field public l:Ls/b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ls/b<",
            "Landroidx/lifecycle/a0<",
            "*>;",
            "Landroidx/lifecycle/b0$a<",
            "*>;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Landroidx/lifecycle/d0;-><init>()V

    new-instance v0, Ls/b;

    invoke-direct {v0}, Ls/b;-><init>()V

    iput-object v0, p0, Landroidx/lifecycle/b0;->l:Ls/b;

    return-void
.end method


# virtual methods
.method public k()V
    .locals 2

    iget-object v0, p0, Landroidx/lifecycle/b0;->l:Ls/b;

    invoke-virtual {v0}, Ls/b;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/lifecycle/b0$a;

    invoke-virtual {v1}, Landroidx/lifecycle/b0$a;->b()V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public l()V
    .locals 2

    iget-object v0, p0, Landroidx/lifecycle/b0;->l:Ls/b;

    invoke-virtual {v0}, Ls/b;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/lifecycle/b0$a;

    invoke-virtual {v1}, Landroidx/lifecycle/b0$a;->c()V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public p(Landroidx/lifecycle/a0;Landroidx/lifecycle/e0;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<S:",
            "Ljava/lang/Object;",
            ">(",
            "Landroidx/lifecycle/a0<",
            "TS;>;",
            "Landroidx/lifecycle/e0<",
            "-TS;>;)V"
        }
    .end annotation

    if-eqz p1, :cond_4

    new-instance v0, Landroidx/lifecycle/b0$a;

    invoke-direct {v0, p1, p2}, Landroidx/lifecycle/b0$a;-><init>(Landroidx/lifecycle/a0;Landroidx/lifecycle/e0;)V

    iget-object v1, p0, Landroidx/lifecycle/b0;->l:Ls/b;

    invoke-virtual {v1, p1, v0}, Ls/b;->f(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroidx/lifecycle/b0$a;

    if-eqz p1, :cond_1

    iget-object v1, p1, Landroidx/lifecycle/b0$a;->b:Landroidx/lifecycle/e0;

    if-ne v1, p2, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "This source was already added with the different observer"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    :goto_0
    if-eqz p1, :cond_2

    goto :goto_1

    :cond_2
    invoke-virtual {p0}, Landroidx/lifecycle/a0;->h()Z

    move-result p1

    if-eqz p1, :cond_3

    invoke-virtual {v0}, Landroidx/lifecycle/b0$a;->b()V

    :cond_3
    :goto_1
    return-void

    :cond_4
    new-instance p1, Ljava/lang/NullPointerException;

    const-string p2, "source cannot be null"

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public q(Landroidx/lifecycle/a0;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<S:",
            "Ljava/lang/Object;",
            ">(",
            "Landroidx/lifecycle/a0<",
            "TS;>;)V"
        }
    .end annotation

    iget-object v0, p0, Landroidx/lifecycle/b0;->l:Ls/b;

    invoke-virtual {v0, p1}, Ls/b;->g(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroidx/lifecycle/b0$a;

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Landroidx/lifecycle/b0$a;->c()V

    :cond_0
    return-void
.end method
