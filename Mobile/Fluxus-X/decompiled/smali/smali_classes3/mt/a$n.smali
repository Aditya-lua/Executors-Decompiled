.class public Lmt/a$n;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Llt/m$c;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lmt/a;->w(Llt/m$b;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Llt/m$c<",
        "Leo/m;",
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
.method public bridge synthetic a(Llt/m;Leo/s;)V
    .locals 0
    .param p1    # Llt/m;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Leo/s;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    check-cast p2, Leo/m;

    invoke-virtual {p0, p1, p2}, Lmt/a$n;->b(Llt/m;Leo/m;)V

    return-void
.end method

.method public b(Llt/m;Leo/m;)V
    .locals 6
    .param p1    # Llt/m;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Leo/m;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    invoke-interface {p1}, Llt/m;->u()Llt/g;

    move-result-object v0

    invoke-virtual {v0}, Llt/g;->c()Llt/k;

    move-result-object v0

    const-class v1, Leo/m;

    invoke-interface {v0, v1}, Llt/k;->a(Ljava/lang/Class;)Llt/t;

    move-result-object v0

    if-nez v0, :cond_0

    invoke-interface {p1, p2}, Llt/m;->E(Leo/s;)V

    return-void

    :cond_0
    invoke-interface {p1}, Llt/m;->length()I

    move-result v1

    invoke-interface {p1, p2}, Llt/m;->E(Leo/s;)V

    invoke-interface {p1}, Llt/m;->length()I

    move-result v2

    if-ne v1, v2, :cond_1

    invoke-interface {p1}, Llt/m;->builder()Llt/u;

    move-result-object v2

    const v3, 0xfffc

    invoke-virtual {v2, v3}, Llt/u;->a(C)Llt/u;

    :cond_1
    invoke-interface {p1}, Llt/m;->u()Llt/g;

    move-result-object v2

    invoke-virtual {p2}, Leo/s;->g()Leo/s;

    move-result-object v3

    instance-of v3, v3, Leo/o;

    invoke-virtual {v2}, Llt/g;->a()Lqt/a;

    move-result-object v4

    invoke-virtual {p2}, Leo/m;->o()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v4, p2}, Lqt/a;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-interface {p1}, Llt/m;->k()Llt/r;

    move-result-object v4

    sget-object v5, Lpt/c;->a:Llt/p;

    invoke-virtual {v5, v4, p2}, Llt/p;->d(Llt/r;Ljava/lang/Object;)V

    sget-object p2, Lpt/c;->b:Llt/p;

    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v3

    invoke-virtual {p2, v4, v3}, Llt/p;->d(Llt/r;Ljava/lang/Object;)V

    sget-object p2, Lpt/c;->c:Llt/p;

    const/4 v3, 0x0

    invoke-virtual {p2, v4, v3}, Llt/p;->d(Llt/r;Ljava/lang/Object;)V

    invoke-interface {v0, v2, v4}, Llt/t;->a(Llt/g;Llt/r;)Ljava/lang/Object;

    move-result-object p2

    invoke-interface {p1, v1, p2}, Llt/m;->c(ILjava/lang/Object;)V

    return-void
.end method
