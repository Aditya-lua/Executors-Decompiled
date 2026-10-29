.class public Lvs/a$k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lus/m$c;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lvs/a;->q(Lus/m$b;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lus/m$c<",
        "Lqn/d;",
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

    check-cast p2, Lqn/d;

    invoke-virtual {p0, p1, p2}, Lvs/a$k;->b(Lus/m;Lqn/d;)V

    return-void
.end method

.method public b(Lus/m;Lqn/d;)V
    .locals 4
    .param p1    # Lus/m;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lqn/d;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    invoke-interface {p1}, Lus/m;->length()I

    move-result v0

    invoke-interface {p1}, Lus/m;->builder()Lus/u;

    move-result-object v1

    const/16 v2, 0xa0

    invoke-virtual {v1, v2}, Lus/u;->a(C)Lus/u;

    move-result-object v1

    invoke-virtual {p2}, Lqn/d;->o()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Lus/u;->d(Ljava/lang/String;)Lus/u;

    move-result-object v1

    invoke-virtual {v1, v2}, Lus/u;->a(C)Lus/u;

    invoke-interface {p1, p2, v0}, Lus/m;->k(Lqn/s;I)V

    return-void
.end method
