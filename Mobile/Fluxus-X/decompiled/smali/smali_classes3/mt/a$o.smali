.class public Lmt/a$o;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Llt/m$c;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lmt/a;->A(Llt/m$b;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Llt/m$c<",
        "Leo/r;",
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

    check-cast p2, Leo/r;

    invoke-virtual {p0, p1, p2}, Lmt/a$o;->b(Llt/m;Leo/r;)V

    return-void
.end method

.method public b(Llt/m;Leo/r;)V
    .locals 6
    .param p1    # Llt/m;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Leo/r;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    invoke-interface {p1}, Llt/m;->length()I

    move-result v0

    invoke-interface {p1, p2}, Llt/m;->E(Leo/s;)V

    invoke-virtual {p2}, Leo/a;->o()Leo/a;

    move-result-object v1

    instance-of v2, v1, Leo/v;

    if-eqz v2, :cond_0

    check-cast v1, Leo/v;

    invoke-virtual {v1}, Leo/v;->t()I

    move-result v2

    sget-object v3, Lmt/b;->a:Llt/p;

    invoke-interface {p1}, Llt/m;->k()Llt/r;

    move-result-object v4

    sget-object v5, Lmt/b$a;->b:Lmt/b$a;

    invoke-virtual {v3, v4, v5}, Llt/p;->d(Llt/r;Ljava/lang/Object;)V

    sget-object v3, Lmt/b;->c:Llt/p;

    invoke-interface {p1}, Llt/m;->k()Llt/r;

    move-result-object v4

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v3, v4, v2}, Llt/p;->d(Llt/r;Ljava/lang/Object;)V

    invoke-virtual {v1}, Leo/v;->t()I

    move-result v2

    add-int/lit8 v2, v2, 0x1

    invoke-virtual {v1, v2}, Leo/v;->w(I)V

    goto :goto_0

    :cond_0
    sget-object v1, Lmt/b;->a:Llt/p;

    invoke-interface {p1}, Llt/m;->k()Llt/r;

    move-result-object v2

    sget-object v3, Lmt/b$a;->a:Lmt/b$a;

    invoke-virtual {v1, v2, v3}, Llt/p;->d(Llt/r;Ljava/lang/Object;)V

    sget-object v1, Lmt/b;->b:Llt/p;

    invoke-interface {p1}, Llt/m;->k()Llt/r;

    move-result-object v2

    invoke-static {p2}, Lmt/a;->n(Leo/s;)I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Llt/p;->d(Llt/r;Ljava/lang/Object;)V

    :goto_0
    invoke-interface {p1, p2, v0}, Llt/m;->i(Leo/s;I)V

    invoke-interface {p1, p2}, Llt/m;->d(Leo/s;)Z

    move-result p2

    if-eqz p2, :cond_1

    invoke-interface {p1}, Llt/m;->y()V

    :cond_1
    return-void
.end method
