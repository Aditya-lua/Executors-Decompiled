.class public Lmt/a$g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Llt/m$c;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lmt/a;->G(Llt/m$b;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Llt/m$c<",
        "Leo/b0;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic a:Lmt/a;


# direct methods
.method public constructor <init>(Lmt/a;)V
    .locals 0

    iput-object p1, p0, Lmt/a$g;->a:Lmt/a;

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

    check-cast p2, Leo/b0;

    invoke-virtual {p0, p1, p2}, Lmt/a$g;->b(Llt/m;Leo/b0;)V

    return-void
.end method

.method public b(Llt/m;Leo/b0;)V
    .locals 3
    .param p1    # Llt/m;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Leo/b0;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    invoke-virtual {p2}, Leo/b0;->o()Ljava/lang/String;

    move-result-object p2

    invoke-interface {p1}, Llt/m;->builder()Llt/u;

    move-result-object v0

    invoke-virtual {v0, p2}, Llt/u;->d(Ljava/lang/String;)Llt/u;

    iget-object v0, p0, Lmt/a$g;->a:Lmt/a;

    invoke-static {v0}, Lmt/a;->l(Lmt/a;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-interface {p1}, Llt/m;->length()I

    move-result v0

    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result v1

    sub-int/2addr v0, v1

    iget-object v1, p0, Lmt/a$g;->a:Lmt/a;

    invoke-static {v1}, Lmt/a;->l(Lmt/a;)Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lmt/a$p;

    invoke-interface {v2, p1, p2, v0}, Lmt/a$p;->a(Llt/m;Ljava/lang/String;I)V

    goto :goto_0

    :cond_0
    return-void
.end method
