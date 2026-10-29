.class public final Lkt/b$a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/ListIterator;
.implements Lau/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lkt/b$a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<E:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Ljava/util/ListIterator<",
        "TE;>;",
        "Lau/a;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010+\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\n\n\u0002\u0010\u0002\n\u0002\u0008\u000e\u0008\u0002\u0018\u0000*\u0004\u0008\u0002\u0010\u00012\u0008\u0012\u0004\u0012\u00028\u00020\u0002B\u001d\u0012\u000c\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00028\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u000f\u0010\n\u001a\u00020\tH\u0016\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u0010\u0010\u000c\u001a\u00020\tH\u0096\u0002\u00a2\u0006\u0004\u0008\u000c\u0010\u000bJ\u000f\u0010\r\u001a\u00020\u0005H\u0016\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0005H\u0016\u00a2\u0006\u0004\u0008\u000f\u0010\u000eJ\u000f\u0010\u0010\u001a\u00028\u0002H\u0016\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00028\u0002H\u0096\u0002\u00a2\u0006\u0004\u0008\u0012\u0010\u0011J\u0017\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00028\u0002H\u0016\u00a2\u0006\u0004\u0008\u0015\u0010\u0016J\u0017\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00028\u0002H\u0016\u00a2\u0006\u0004\u0008\u0017\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0014H\u0016\u00a2\u0006\u0004\u0008\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0014H\u0002\u00a2\u0006\u0004\u0008\u001a\u0010\u0019R\u001a\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00028\u00020\u00038\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001b\u0010\u001cR\u0016\u0010\u0006\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u001a\u0010\u001dR\u0016\u0010\u001f\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u001e\u0010\u001dR\u0016\u0010!\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008 \u0010\u001d\u00a8\u0006\""
    }
    d2 = {
        "Lkt/b$a$a;",
        "E",
        "",
        "Lkt/b$a;",
        "list",
        "",
        "index",
        "<init>",
        "(Lkt/b$a;I)V",
        "",
        "hasPrevious",
        "()Z",
        "hasNext",
        "previousIndex",
        "()I",
        "nextIndex",
        "previous",
        "()Ljava/lang/Object;",
        "next",
        "element",
        "",
        "set",
        "(Ljava/lang/Object;)V",
        "add",
        "remove",
        "()V",
        "b",
        "a",
        "Lkt/b$a;",
        "I",
        "c",
        "lastIndex",
        "d",
        "expectedModCount",
        "kotlin-stdlib"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field public final a:Lkt/b$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkt/b$a<",
            "TE;>;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public b:I

.field public c:I

.field public d:I


# direct methods
.method public constructor <init>(Lkt/b$a;I)V
    .locals 1
    .param p1    # Lkt/b$a;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkt/b$a<",
            "TE;>;I)V"
        }
    .end annotation

    const-string v0, "list"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lkt/b$a$a;->a:Lkt/b$a;

    iput p2, p0, Lkt/b$a$a;->b:I

    const/4 p2, -0x1

    iput p2, p0, Lkt/b$a$a;->c:I

    invoke-static {p1}, Lkt/b$a;->e(Lkt/b$a;)I

    move-result p1

    iput p1, p0, Lkt/b$a$a;->d:I

    return-void
.end method


# virtual methods
.method public add(Ljava/lang/Object;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TE;)V"
        }
    .end annotation

    invoke-virtual {p0}, Lkt/b$a$a;->b()V

    iget-object v0, p0, Lkt/b$a$a;->a:Lkt/b$a;

    iget v1, p0, Lkt/b$a$a;->b:I

    add-int/lit8 v2, v1, 0x1

    iput v2, p0, Lkt/b$a$a;->b:I

    invoke-virtual {v0, v1, p1}, Lkt/b$a;->add(ILjava/lang/Object;)V

    const/4 p1, -0x1

    iput p1, p0, Lkt/b$a$a;->c:I

    iget-object p1, p0, Lkt/b$a$a;->a:Lkt/b$a;

    invoke-static {p1}, Lkt/b$a;->e(Lkt/b$a;)I

    move-result p1

    iput p1, p0, Lkt/b$a$a;->d:I

    return-void
.end method

.method public final b()V
    .locals 2

    iget-object v0, p0, Lkt/b$a$a;->a:Lkt/b$a;

    invoke-static {v0}, Lkt/b$a;->g(Lkt/b$a;)Lkt/b;

    move-result-object v0

    invoke-static {v0}, Lkt/b;->g(Lkt/b;)I

    move-result v0

    iget v1, p0, Lkt/b$a$a;->d:I

    if-ne v0, v1, :cond_0

    return-void

    :cond_0
    new-instance v0, Ljava/util/ConcurrentModificationException;

    invoke-direct {v0}, Ljava/util/ConcurrentModificationException;-><init>()V

    throw v0
.end method

.method public hasNext()Z
    .locals 2

    iget v0, p0, Lkt/b$a$a;->b:I

    iget-object v1, p0, Lkt/b$a$a;->a:Lkt/b$a;

    invoke-static {v1}, Lkt/b$a;->d(Lkt/b$a;)I

    move-result v1

    if-ge v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public hasPrevious()Z
    .locals 1

    iget v0, p0, Lkt/b$a$a;->b:I

    if-lez v0, :cond_0

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

    invoke-virtual {p0}, Lkt/b$a$a;->b()V

    iget v0, p0, Lkt/b$a$a;->b:I

    iget-object v1, p0, Lkt/b$a$a;->a:Lkt/b$a;

    invoke-static {v1}, Lkt/b$a;->d(Lkt/b$a;)I

    move-result v1

    if-ge v0, v1, :cond_0

    iget v0, p0, Lkt/b$a$a;->b:I

    add-int/lit8 v1, v0, 0x1

    iput v1, p0, Lkt/b$a$a;->b:I

    iput v0, p0, Lkt/b$a$a;->c:I

    iget-object v0, p0, Lkt/b$a$a;->a:Lkt/b$a;

    invoke-static {v0}, Lkt/b$a;->c(Lkt/b$a;)[Ljava/lang/Object;

    move-result-object v0

    iget-object v1, p0, Lkt/b$a$a;->a:Lkt/b$a;

    invoke-static {v1}, Lkt/b$a;->f(Lkt/b$a;)I

    move-result v1

    iget v2, p0, Lkt/b$a$a;->c:I

    add-int/2addr v1, v2

    aget-object v0, v0, v1

    return-object v0

    :cond_0
    new-instance v0, Ljava/util/NoSuchElementException;

    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    throw v0
.end method

.method public nextIndex()I
    .locals 1

    iget v0, p0, Lkt/b$a$a;->b:I

    return v0
.end method

.method public previous()Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TE;"
        }
    .end annotation

    invoke-virtual {p0}, Lkt/b$a$a;->b()V

    iget v0, p0, Lkt/b$a$a;->b:I

    if-lez v0, :cond_0

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Lkt/b$a$a;->b:I

    iput v0, p0, Lkt/b$a$a;->c:I

    iget-object v0, p0, Lkt/b$a$a;->a:Lkt/b$a;

    invoke-static {v0}, Lkt/b$a;->c(Lkt/b$a;)[Ljava/lang/Object;

    move-result-object v0

    iget-object v1, p0, Lkt/b$a$a;->a:Lkt/b$a;

    invoke-static {v1}, Lkt/b$a;->f(Lkt/b$a;)I

    move-result v1

    iget v2, p0, Lkt/b$a$a;->c:I

    add-int/2addr v1, v2

    aget-object v0, v0, v1

    return-object v0

    :cond_0
    new-instance v0, Ljava/util/NoSuchElementException;

    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    throw v0
.end method

.method public previousIndex()I
    .locals 1

    iget v0, p0, Lkt/b$a$a;->b:I

    add-int/lit8 v0, v0, -0x1

    return v0
.end method

.method public remove()V
    .locals 3

    invoke-virtual {p0}, Lkt/b$a$a;->b()V

    iget v0, p0, Lkt/b$a$a;->c:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    iget-object v2, p0, Lkt/b$a$a;->a:Lkt/b$a;

    invoke-virtual {v2, v0}, Lkt/b$a;->b(I)Ljava/lang/Object;

    iget v0, p0, Lkt/b$a$a;->c:I

    iput v0, p0, Lkt/b$a$a;->b:I

    iput v1, p0, Lkt/b$a$a;->c:I

    iget-object v0, p0, Lkt/b$a$a;->a:Lkt/b$a;

    invoke-static {v0}, Lkt/b$a;->e(Lkt/b$a;)I

    move-result v0

    iput v0, p0, Lkt/b$a$a;->d:I

    return-void

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Call next() or previous() before removing element from the iterator."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public set(Ljava/lang/Object;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TE;)V"
        }
    .end annotation

    invoke-virtual {p0}, Lkt/b$a$a;->b()V

    iget v0, p0, Lkt/b$a$a;->c:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    iget-object v1, p0, Lkt/b$a$a;->a:Lkt/b$a;

    invoke-virtual {v1, v0, p1}, Lkt/b$a;->set(ILjava/lang/Object;)Ljava/lang/Object;

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Call next() or previous() before replacing element from the iterator."

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
