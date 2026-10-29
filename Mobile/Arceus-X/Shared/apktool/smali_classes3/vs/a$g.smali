.class public Lvs/a$g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lus/m$c;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lvs/a;->G(Lus/m$b;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lus/m$c<",
        "Lqn/b0;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic a:Lvs/a;


# direct methods
.method public constructor <init>(Lvs/a;)V
    .locals 0

    iput-object p1, p0, Lvs/a$g;->a:Lvs/a;

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

    check-cast p2, Lqn/b0;

    invoke-virtual {p0, p1, p2}, Lvs/a$g;->b(Lus/m;Lqn/b0;)V

    return-void
.end method

.method public b(Lus/m;Lqn/b0;)V
    .locals 3
    .param p1    # Lus/m;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lqn/b0;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    invoke-virtual {p2}, Lqn/b0;->o()Ljava/lang/String;

    move-result-object p2

    invoke-interface {p1}, Lus/m;->builder()Lus/u;

    move-result-object v0

    invoke-virtual {v0, p2}, Lus/u;->d(Ljava/lang/String;)Lus/u;

    iget-object v0, p0, Lvs/a$g;->a:Lvs/a;

    invoke-static {v0}, Lvs/a;->l(Lvs/a;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-interface {p1}, Lus/m;->length()I

    move-result v0

    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result v1

    sub-int/2addr v0, v1

    iget-object v1, p0, Lvs/a$g;->a:Lvs/a;

    invoke-static {v1}, Lvs/a;->l(Lvs/a;)Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lvs/a$p;

    invoke-interface {v2, p1, p2, v0}, Lvs/a$p;->a(Lus/m;Ljava/lang/String;I)V

    goto :goto_0

    :cond_0
    return-void
.end method
