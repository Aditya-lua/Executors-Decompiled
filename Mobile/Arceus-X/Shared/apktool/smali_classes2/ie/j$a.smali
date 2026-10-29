.class public Lie/j$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/Iterator;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lie/j;->iterator()Ljava/util/Iterator;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/util/Iterator<",
        "TE;>;"
    }
.end annotation


# instance fields
.field public a:I

.field public b:I

.field public c:I

.field public final synthetic d:Lie/j;


# direct methods
.method public constructor <init>(Lie/j;)V
    .locals 1

    iput-object p1, p0, Lie/j$a;->d:Lie/j;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Lie/j;->a(Lie/j;)I

    move-result v0

    iput v0, p0, Lie/j$a;->a:I

    invoke-virtual {p1}, Lie/j;->l()I

    move-result p1

    iput p1, p0, Lie/j$a;->b:I

    const/4 p1, -0x1

    iput p1, p0, Lie/j$a;->c:I

    return-void
.end method


# virtual methods
.method public final b()V
    .locals 2

    iget-object v0, p0, Lie/j$a;->d:Lie/j;

    invoke-static {v0}, Lie/j;->a(Lie/j;)I

    move-result v0

    iget v1, p0, Lie/j$a;->a:I

    if-ne v0, v1, :cond_0

    return-void

    :cond_0
    new-instance v0, Ljava/util/ConcurrentModificationException;

    invoke-direct {v0}, Ljava/util/ConcurrentModificationException;-><init>()V

    throw v0
.end method

.method public d()V
    .locals 1

    iget v0, p0, Lie/j$a;->a:I

    add-int/lit8 v0, v0, 0x20

    iput v0, p0, Lie/j$a;->a:I

    return-void
.end method

.method public hasNext()Z
    .locals 1

    iget v0, p0, Lie/j$a;->b:I

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
            "()TE;"
        }
    .end annotation

    invoke-virtual {p0}, Lie/j$a;->b()V

    invoke-virtual {p0}, Lie/j$a;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    iget v0, p0, Lie/j$a;->b:I

    iput v0, p0, Lie/j$a;->c:I

    iget-object v1, p0, Lie/j$a;->d:Lie/j;

    invoke-static {v1, v0}, Lie/j;->b(Lie/j;I)Ljava/lang/Object;

    move-result-object v0

    iget-object v1, p0, Lie/j$a;->d:Lie/j;

    iget v2, p0, Lie/j$a;->b:I

    invoke-virtual {v1, v2}, Lie/j;->m(I)I

    move-result v1

    iput v1, p0, Lie/j$a;->b:I

    return-object v0

    :cond_0
    new-instance v0, Ljava/util/NoSuchElementException;

    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    throw v0
.end method

.method public remove()V
    .locals 3

    invoke-virtual {p0}, Lie/j$a;->b()V

    iget v0, p0, Lie/j$a;->c:I

    if-ltz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-static {v0}, Lie/g;->c(Z)V

    invoke-virtual {p0}, Lie/j$a;->d()V

    iget-object v0, p0, Lie/j$a;->d:Lie/j;

    iget v1, p0, Lie/j$a;->c:I

    invoke-static {v0, v1}, Lie/j;->b(Lie/j;I)Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v0, v1}, Lie/j;->remove(Ljava/lang/Object;)Z

    iget-object v0, p0, Lie/j$a;->d:Lie/j;

    iget v1, p0, Lie/j$a;->b:I

    iget v2, p0, Lie/j$a;->c:I

    invoke-virtual {v0, v1, v2}, Lie/j;->c(II)I

    move-result v0

    iput v0, p0, Lie/j$a;->b:I

    const/4 v0, -0x1

    iput v0, p0, Lie/j$a;->c:I

    return-void
.end method
