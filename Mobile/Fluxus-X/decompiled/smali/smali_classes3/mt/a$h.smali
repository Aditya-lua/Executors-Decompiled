.class public Lmt/a$h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Llt/m$c;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lmt/a;->F(Llt/m$b;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Llt/m$c<",
        "Leo/a0;",
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

    check-cast p2, Leo/a0;

    invoke-virtual {p0, p1, p2}, Lmt/a$h;->b(Llt/m;Leo/a0;)V

    return-void
.end method

.method public b(Llt/m;Leo/a0;)V
    .locals 1
    .param p1    # Llt/m;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Leo/a0;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    invoke-interface {p1}, Llt/m;->length()I

    move-result v0

    invoke-interface {p1, p2}, Llt/m;->E(Leo/s;)V

    invoke-interface {p1, p2, v0}, Llt/m;->i(Leo/s;I)V

    return-void
.end method
