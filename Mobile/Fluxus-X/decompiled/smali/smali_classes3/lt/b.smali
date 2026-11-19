.class public Llt/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Llt/m$a;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Llt/m;Leo/s;)V
    .locals 0
    .param p1    # Llt/m;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Leo/s;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    invoke-interface {p1}, Llt/m;->y()V

    return-void
.end method

.method public b(Llt/m;Leo/s;)V
    .locals 0
    .param p1    # Llt/m;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Leo/s;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    invoke-interface {p1, p2}, Llt/m;->d(Leo/s;)Z

    move-result p2

    if-eqz p2, :cond_0

    invoke-interface {p1}, Llt/m;->y()V

    invoke-interface {p1}, Llt/m;->v()V

    :cond_0
    return-void
.end method
