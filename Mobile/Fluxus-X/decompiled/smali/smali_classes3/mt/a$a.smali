.class public Lmt/a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Llt/m$c;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lmt/a;->H(Llt/m$b;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Llt/m$c<",
        "Leo/c0;",
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

    check-cast p2, Leo/c0;

    invoke-virtual {p0, p1, p2}, Lmt/a$a;->b(Llt/m;Leo/c0;)V

    return-void
.end method

.method public b(Llt/m;Leo/c0;)V
    .locals 3
    .param p1    # Llt/m;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Leo/c0;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    invoke-interface {p1, p2}, Llt/m;->s(Leo/s;)V

    invoke-interface {p1}, Llt/m;->length()I

    move-result v0

    invoke-interface {p1}, Llt/m;->builder()Llt/u;

    move-result-object v1

    const/16 v2, 0xa0

    invoke-virtual {v1, v2}, Llt/u;->a(C)Llt/u;

    invoke-interface {p1, p2, v0}, Llt/m;->i(Leo/s;I)V

    invoke-interface {p1, p2}, Llt/m;->n(Leo/s;)V

    return-void
.end method
