.class public Lmt/a$e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Llt/m$c;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lmt/a;->D(Llt/m$b;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Llt/m$c<",
        "Leo/w;",
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

    check-cast p2, Leo/w;

    invoke-virtual {p0, p1, p2}, Lmt/a$e;->b(Llt/m;Leo/w;)V

    return-void
.end method

.method public b(Llt/m;Leo/w;)V
    .locals 5
    .param p1    # Llt/m;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Leo/w;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    invoke-static {p2}, Lmt/a;->m(Leo/w;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-interface {p1, p2}, Llt/m;->s(Leo/s;)V

    :cond_0
    invoke-interface {p1}, Llt/m;->length()I

    move-result v1

    invoke-interface {p1, p2}, Llt/m;->E(Leo/s;)V

    sget-object v2, Lmt/b;->f:Llt/p;

    invoke-interface {p1}, Llt/m;->k()Llt/r;

    move-result-object v3

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v4

    invoke-virtual {v2, v3, v4}, Llt/p;->d(Llt/r;Ljava/lang/Object;)V

    invoke-interface {p1, p2, v1}, Llt/m;->i(Leo/s;I)V

    if-nez v0, :cond_1

    invoke-interface {p1, p2}, Llt/m;->n(Leo/s;)V

    :cond_1
    return-void
.end method
