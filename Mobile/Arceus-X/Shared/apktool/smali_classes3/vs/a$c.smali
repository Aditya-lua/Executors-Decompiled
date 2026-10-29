.class public Lvs/a$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lus/m$c;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lvs/a;->E(Lus/m$b;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lus/m$c<",
        "Lqn/x;",
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

    check-cast p2, Lqn/x;

    invoke-virtual {p0, p1, p2}, Lvs/a$c;->b(Lus/m;Lqn/x;)V

    return-void
.end method

.method public b(Lus/m;Lqn/x;)V
    .locals 0
    .param p1    # Lus/m;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lqn/x;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    invoke-interface {p1}, Lus/m;->builder()Lus/u;

    move-result-object p1

    const/16 p2, 0x20

    invoke-virtual {p1, p2}, Lus/u;->a(C)Lus/u;

    return-void
.end method
