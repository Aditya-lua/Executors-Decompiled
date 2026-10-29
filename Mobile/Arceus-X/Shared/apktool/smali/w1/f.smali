.class public abstract Lw1/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/Iterator;
.implements Lau/a;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Ljava/util/Iterator<",
        "TT;>;",
        "Lau/a;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010)\n\u0002\u0010\u0008\n\u0002\u0008\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u000c\u0008 \u0018\u0000*\u0004\u0008\u0000\u0010\u00012\u0008\u0012\u0004\u0012\u00028\u00000\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J\u0017\u0010\u0008\u001a\u00028\u00002\u0006\u0010\u0007\u001a\u00020\u0003H$\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u0003H$\u00a2\u0006\u0004\u0008\u000b\u0010\u0006J\u0010\u0010\r\u001a\u00020\u000cH\u0096\u0002\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00028\u0000H\u0096\u0002\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\nH\u0016\u00a2\u0006\u0004\u0008\u0011\u0010\u0012R\u0016\u0010\u0014\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0008\u0010\u0013R\u0016\u0010\u0007\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u000b\u0010\u0013R\u0016\u0010\u0017\u001a\u00020\u000c8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0015\u0010\u0016\u00a8\u0006\u0018"
    }
    d2 = {
        "Lw1/f;",
        "T",
        "",
        "",
        "startingSize",
        "<init>",
        "(I)V",
        "index",
        "a",
        "(I)Ljava/lang/Object;",
        "",
        "b",
        "",
        "hasNext",
        "()Z",
        "next",
        "()Ljava/lang/Object;",
        "remove",
        "()V",
        "I",
        "size",
        "c",
        "Z",
        "canRemove",
        "collection"
    }
    k = 0x1
    mv = {
        0x1,
        0x9,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field public a:I

.field public b:I

.field public c:Z


# direct methods
.method public constructor <init>(I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lw1/f;->a:I

    return-void
.end method


# virtual methods
.method public abstract a(I)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)TT;"
        }
    .end annotation
.end method

.method public abstract b(I)V
.end method

.method public hasNext()Z
    .locals 2

    iget v0, p0, Lw1/f;->b:I

    iget v1, p0, Lw1/f;->a:I

    if-ge v0, v1, :cond_0

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

    invoke-virtual {p0}, Lw1/f;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    iget v0, p0, Lw1/f;->b:I

    invoke-virtual {p0, v0}, Lw1/f;->a(I)Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Lw1/f;->b:I

    const/4 v2, 0x1

    add-int/2addr v1, v2

    iput v1, p0, Lw1/f;->b:I

    iput-boolean v2, p0, Lw1/f;->c:Z

    return-object v0

    :cond_0
    new-instance v0, Ljava/util/NoSuchElementException;

    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    throw v0
.end method

.method public remove()V
    .locals 1

    iget-boolean v0, p0, Lw1/f;->c:Z

    if-nez v0, :cond_0

    const-string v0, "Call next() before removing an element."

    invoke-static {v0}, Lx1/d;->b(Ljava/lang/String;)V

    :cond_0
    iget v0, p0, Lw1/f;->b:I

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Lw1/f;->b:I

    invoke-virtual {p0, v0}, Lw1/f;->b(I)V

    iget v0, p0, Lw1/f;->a:I

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Lw1/f;->a:I

    const/4 v0, 0x0

    iput-boolean v0, p0, Lw1/f;->c:Z

    return-void
.end method
