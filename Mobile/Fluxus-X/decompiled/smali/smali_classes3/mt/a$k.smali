.class public Lmt/a$k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Llt/m$c;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lmt/a;->q(Llt/m$b;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Llt/m$c<",
        "Leo/d;",
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

    check-cast p2, Leo/d;

    invoke-virtual {p0, p1, p2}, Lmt/a$k;->b(Llt/m;Leo/d;)V

    return-void
.end method

.method public b(Llt/m;Leo/d;)V
    .locals 4
    .param p1    # Llt/m;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Leo/d;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    invoke-interface {p1}, Llt/m;->length()I

    move-result v0

    invoke-interface {p1}, Llt/m;->builder()Llt/u;

    move-result-object v1

    const/16 v2, 0xa0

    invoke-virtual {v1, v2}, Llt/u;->a(C)Llt/u;

    move-result-object v1

    invoke-virtual {p2}, Leo/d;->o()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Llt/u;->d(Ljava/lang/String;)Llt/u;

    move-result-object v1

    invoke-virtual {v1, v2}, Llt/u;->a(C)Llt/u;

    invoke-interface {p1, p2, v0}, Llt/m;->i(Leo/s;I)V

    return-void
.end method
