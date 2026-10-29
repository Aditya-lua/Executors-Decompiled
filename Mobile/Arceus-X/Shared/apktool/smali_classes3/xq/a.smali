.class public abstract Lxq/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u000f\u0008&\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\u00082\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\t\u0010\nJ\'\u0010\r\u001a\u00020\u00082\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u000c\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H \u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\u00082\u0006\u0010\u0005\u001a\u00020\u0004H \u00a2\u0006\u0004\u0008\u000f\u0010\u0010R\u0016\u0010\u0013\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0011\u0010\u0012R\u0016\u0010\u0014\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\t\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00048 X\u00a0\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0011\u0010\u0015\u00a8\u0006\u0017"
    }
    d2 = {
        "Lxq/a;",
        "",
        "<init>",
        "()V",
        "",
        "position",
        "",
        "positionOffset",
        "",
        "b",
        "(IF)V",
        "selectedPosition",
        "nextPosition",
        "c",
        "(IIF)V",
        "d",
        "(I)V",
        "a",
        "I",
        "lastLeftPosition",
        "lastRightPosition",
        "()I",
        "pageCount",
        "shared_release"
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
.field public a:I

.field public b:I


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, -0x1

    iput v0, p0, Lxq/a;->a:I

    iput v0, p0, Lxq/a;->b:I

    return-void
.end method


# virtual methods
.method public abstract a()I
.end method

.method public final b(IF)V
    .locals 5

    int-to-float p1, p1

    add-float/2addr p1, p2

    invoke-virtual {p0}, Lxq/a;->a()I

    move-result p2

    const/4 v0, 0x1

    sub-int/2addr p2, v0

    int-to-float p2, p2

    float-to-int v1, p1

    add-int/lit8 v2, v1, 0x1

    const/4 v3, -0x1

    if-gez v1, :cond_0

    move v1, v3

    :cond_0
    int-to-float v4, v2

    cmpl-float p2, v4, p2

    if-lez p2, :cond_1

    move v2, v3

    :cond_1
    int-to-float p2, v0

    rem-float/2addr p1, p2

    invoke-virtual {p0, v1, v2, p1}, Lxq/a;->c(IIF)V

    iget p1, p0, Lxq/a;->a:I

    if-eq p1, v3, :cond_3

    if-eq v1, v3, :cond_2

    if-le v1, p1, :cond_2

    invoke-static {p1, v1}, Lkotlin/ranges/d;->q(II)Lkotlin/ranges/IntRange;

    move-result-object p1

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_2

    move-object p2, p1

    check-cast p2, Lkotlin/collections/e0;

    invoke-virtual {p2}, Lkotlin/collections/e0;->nextInt()I

    move-result p2

    invoke-virtual {p0, p2}, Lxq/a;->d(I)V

    goto :goto_0

    :cond_2
    if-eq v2, v3, :cond_3

    iget p1, p0, Lxq/a;->b:I

    if-ge v2, p1, :cond_3

    invoke-virtual {p0, p1}, Lxq/a;->d(I)V

    new-instance p1, Lkotlin/ranges/IntRange;

    add-int/lit8 p2, v2, 0x1

    iget v0, p0, Lxq/a;->b:I

    invoke-direct {p1, p2, v0}, Lkotlin/ranges/IntRange;-><init>(II)V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_3

    move-object p2, p1

    check-cast p2, Lkotlin/collections/e0;

    invoke-virtual {p2}, Lkotlin/collections/e0;->nextInt()I

    move-result p2

    invoke-virtual {p0, p2}, Lxq/a;->d(I)V

    goto :goto_1

    :cond_3
    iput v1, p0, Lxq/a;->a:I

    iput v2, p0, Lxq/a;->b:I

    return-void
.end method

.method public abstract c(IIF)V
.end method

.method public abstract d(I)V
.end method
