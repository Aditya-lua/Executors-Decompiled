.class public abstract Lpe/j;
.super Lpe/g;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lpe/j$b;,
        Lpe/j$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<V:",
        "Ljava/lang/Object;",
        "C:",
        "Ljava/lang/Object;",
        ">",
        "Lpe/g<",
        "TV;TC;>;"
    }
.end annotation


# instance fields
.field public p:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lpe/j$b<",
            "TV;>;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lke/r;Z)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lke/r<",
            "+",
            "Lpe/x<",
            "+TV;>;>;Z)V"
        }
    .end annotation

    const/4 v0, 0x1

    invoke-direct {p0, p1, p2, v0}, Lpe/g;-><init>(Lke/r;ZZ)V

    invoke-virtual {p1}, Ljava/util/AbstractCollection;->isEmpty()Z

    move-result p2

    if-eqz p2, :cond_0

    sget-object p2, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Ljava/util/AbstractCollection;->size()I

    move-result p2

    invoke-static {p2}, Lke/d0;->h(I)Ljava/util/ArrayList;

    move-result-object p2

    :goto_0
    const/4 v0, 0x0

    :goto_1
    invoke-virtual {p1}, Ljava/util/AbstractCollection;->size()I

    move-result v1

    if-ge v0, v1, :cond_1

    const/4 v1, 0x0

    invoke-interface {p2, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_1
    iput-object p2, p0, Lpe/j;->p:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public final R(ILjava/lang/Object;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ITV;)V"
        }
    .end annotation

    iget-object v0, p0, Lpe/j;->p:Ljava/util/List;

    if-eqz v0, :cond_0

    new-instance v1, Lpe/j$b;

    invoke-direct {v1, p2}, Lpe/j$b;-><init>(Ljava/lang/Object;)V

    invoke-interface {v0, p1, v1}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    :cond_0
    return-void
.end method

.method public final U()V
    .locals 1

    iget-object v0, p0, Lpe/j;->p:Ljava/util/List;

    if-eqz v0, :cond_0

    invoke-virtual {p0, v0}, Lpe/j;->a0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p0, v0}, Lpe/b;->D(Ljava/lang/Object;)Z

    :cond_0
    return-void
.end method

.method public Z(Lpe/g$a;)V
    .locals 0

    invoke-super {p0, p1}, Lpe/g;->Z(Lpe/g$a;)V

    const/4 p1, 0x0

    iput-object p1, p0, Lpe/j;->p:Ljava/util/List;

    return-void
.end method

.method public abstract a0(Ljava/util/List;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lpe/j$b<",
            "TV;>;>;)TC;"
        }
    .end annotation
.end method
