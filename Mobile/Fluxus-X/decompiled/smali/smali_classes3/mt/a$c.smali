.class public Lmt/a$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Llt/m$c;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lmt/a;->E(Llt/m$b;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Llt/m$c<",
        "Leo/x;",
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

    check-cast p2, Leo/x;

    invoke-virtual {p0, p1, p2}, Lmt/a$c;->b(Llt/m;Leo/x;)V

    return-void
.end method

.method public b(Llt/m;Leo/x;)V
    .locals 0
    .param p1    # Llt/m;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Leo/x;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    invoke-interface {p1}, Llt/m;->builder()Llt/u;

    move-result-object p1

    const/16 p2, 0x20

    invoke-virtual {p1, p2}, Llt/u;->a(C)Llt/u;

    return-void
.end method
