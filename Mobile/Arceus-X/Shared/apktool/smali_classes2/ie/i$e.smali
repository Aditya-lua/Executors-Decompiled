.class public abstract Lie/i$e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/Iterator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lie/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x401
    name = "e"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Ljava/util/Iterator<",
        "TT;>;"
    }
.end annotation


# instance fields
.field public a:I

.field public b:I

.field public c:I

.field public final synthetic d:Lie/i;


# direct methods
.method public constructor <init>(Lie/i;)V
    .locals 1

    .line 1
    iput-object p1, p0, Lie/i$e;->d:Lie/i;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    invoke-static {p1}, Lie/i;->a(Lie/i;)I

    move-result v0

    iput v0, p0, Lie/i$e;->a:I

    .line 3
    invoke-virtual {p1}, Lie/i;->B()I

    move-result p1

    iput p1, p0, Lie/i$e;->b:I

    const/4 p1, -0x1

    .line 4
    iput p1, p0, Lie/i$e;->c:I

    return-void
.end method

.method public synthetic constructor <init>(Lie/i;Lie/i$a;)V
    .locals 0

    .line 5
    invoke-direct {p0, p1}, Lie/i$e;-><init>(Lie/i;)V

    return-void
.end method


# virtual methods
.method public final b()V
    .locals 2

    iget-object v0, p0, Lie/i$e;->d:Lie/i;

    invoke-static {v0}, Lie/i;->a(Lie/i;)I

    move-result v0

    iget v1, p0, Lie/i$e;->a:I

    if-ne v0, v1, :cond_0

    return-void

    :cond_0
    new-instance v0, Ljava/util/ConcurrentModificationException;

    invoke-direct {v0}, Ljava/util/ConcurrentModificationException;-><init>()V

    throw v0
.end method

.method public abstract d(I)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)TT;"
        }
    .end annotation
.end method

.method public e()V
    .locals 1

    iget v0, p0, Lie/i$e;->a:I

    add-int/lit8 v0, v0, 0x20

    iput v0, p0, Lie/i$e;->a:I

    return-void
.end method

.method public hasNext()Z
    .locals 1

    iget v0, p0, Lie/i$e;->b:I

    if-ltz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public next()Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    invoke-virtual {p0}, Lie/i$e;->b()V

    invoke-virtual {p0}, Lie/i$e;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    iget v0, p0, Lie/i$e;->b:I

    iput v0, p0, Lie/i$e;->c:I

    invoke-virtual {p0, v0}, Lie/i$e;->d(I)Ljava/lang/Object;

    move-result-object v0

    iget-object v1, p0, Lie/i$e;->d:Lie/i;

    iget v2, p0, Lie/i$e;->b:I

    invoke-virtual {v1, v2}, Lie/i;->C(I)I

    move-result v1

    iput v1, p0, Lie/i$e;->b:I

    return-object v0

    :cond_0
    new-instance v0, Ljava/util/NoSuchElementException;

    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    throw v0
.end method

.method public remove()V
    .locals 3

    invoke-virtual {p0}, Lie/i$e;->b()V

    iget v0, p0, Lie/i$e;->c:I

    if-ltz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-static {v0}, Lie/g;->c(Z)V

    invoke-virtual {p0}, Lie/i$e;->e()V

    iget-object v0, p0, Lie/i$e;->d:Lie/i;

    iget v1, p0, Lie/i$e;->c:I

    invoke-static {v0, v1}, Lie/i;->b(Lie/i;I)Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v0, v1}, Lie/i;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lie/i$e;->d:Lie/i;

    iget v1, p0, Lie/i$e;->b:I

    iget v2, p0, Lie/i$e;->c:I

    invoke-virtual {v0, v1, v2}, Lie/i;->p(II)I

    move-result v0

    iput v0, p0, Lie/i$e;->b:I

    const/4 v0, -0x1

    iput v0, p0, Lie/i$e;->c:I

    return-void
.end method
