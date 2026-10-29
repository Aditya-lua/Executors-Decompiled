.class public Lvs/a$n;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lus/m$c;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lvs/a;->w(Lus/m$b;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lus/m$c<",
        "Lqn/m;",
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

    check-cast p2, Lqn/m;

    invoke-virtual {p0, p1, p2}, Lvs/a$n;->b(Lus/m;Lqn/m;)V

    return-void
.end method

.method public b(Lus/m;Lqn/m;)V
    .locals 6
    .param p1    # Lus/m;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lqn/m;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    invoke-interface {p1}, Lus/m;->w()Lus/g;

    move-result-object v0

    invoke-virtual {v0}, Lus/g;->c()Lus/k;

    move-result-object v0

    const-class v1, Lqn/m;

    invoke-interface {v0, v1}, Lus/k;->a(Ljava/lang/Class;)Lus/t;

    move-result-object v0

    if-nez v0, :cond_0

    invoke-interface {p1, p2}, Lus/m;->h(Lqn/s;)V

    return-void

    :cond_0
    invoke-interface {p1}, Lus/m;->length()I

    move-result v1

    invoke-interface {p1, p2}, Lus/m;->h(Lqn/s;)V

    invoke-interface {p1}, Lus/m;->length()I

    move-result v2

    if-ne v1, v2, :cond_1

    invoke-interface {p1}, Lus/m;->builder()Lus/u;

    move-result-object v2

    const v3, 0xfffc

    invoke-virtual {v2, v3}, Lus/u;->a(C)Lus/u;

    :cond_1
    invoke-interface {p1}, Lus/m;->w()Lus/g;

    move-result-object v2

    invoke-virtual {p2}, Lqn/s;->g()Lqn/s;

    move-result-object v3

    instance-of v3, v3, Lqn/o;

    invoke-virtual {v2}, Lus/g;->a()Lzs/a;

    move-result-object v4

    invoke-virtual {p2}, Lqn/m;->o()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v4, p2}, Lzs/a;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-interface {p1}, Lus/m;->o()Lus/r;

    move-result-object v4

    sget-object v5, Lys/c;->a:Lus/p;

    invoke-virtual {v5, v4, p2}, Lus/p;->d(Lus/r;Ljava/lang/Object;)V

    sget-object p2, Lys/c;->b:Lus/p;

    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v3

    invoke-virtual {p2, v4, v3}, Lus/p;->d(Lus/r;Ljava/lang/Object;)V

    sget-object p2, Lys/c;->c:Lus/p;

    const/4 v3, 0x0

    invoke-virtual {p2, v4, v3}, Lus/p;->d(Lus/r;Ljava/lang/Object;)V

    invoke-interface {v0, v2, v4}, Lus/t;->a(Lus/g;Lus/r;)Ljava/lang/Object;

    move-result-object p2

    invoke-interface {p1, v1, p2}, Lus/m;->d(ILjava/lang/Object;)V

    return-void
.end method
