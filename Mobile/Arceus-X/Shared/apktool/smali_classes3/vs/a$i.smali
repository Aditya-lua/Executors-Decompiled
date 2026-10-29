.class public Lvs/a$i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lus/m$c;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lvs/a;->s(Lus/m$b;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lus/m$c<",
        "Lqn/g;",
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

    check-cast p2, Lqn/g;

    invoke-virtual {p0, p1, p2}, Lvs/a$i;->b(Lus/m;Lqn/g;)V

    return-void
.end method

.method public b(Lus/m;Lqn/g;)V
    .locals 1
    .param p1    # Lus/m;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lqn/g;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    invoke-interface {p1}, Lus/m;->length()I

    move-result v0

    invoke-interface {p1, p2}, Lus/m;->h(Lqn/s;)V

    invoke-interface {p1, p2, v0}, Lus/m;->k(Lqn/s;I)V

    return-void
.end method
