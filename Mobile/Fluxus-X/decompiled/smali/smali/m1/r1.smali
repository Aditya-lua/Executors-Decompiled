.class public interface abstract Lm1/r1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lm1/f1;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lm1/r1$a;
    }
.end annotation


# virtual methods
.method public abstract a()Z
.end method

.method public abstract b(I)Landroid/util/Range;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)",
            "Landroid/util/Range<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end method

.method public abstract c()I
.end method

.method public abstract d(II)Z
.end method

.method public e(II)Z
    .locals 1

    invoke-interface {p0, p1, p2}, Lm1/r1;->d(II)Z

    move-result v0

    if-nez v0, :cond_1

    invoke-interface {p0}, Lm1/r1;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p0, p2, p1}, Lm1/r1;->d(II)Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    return p1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    return p1
.end method

.method public abstract f()I
.end method

.method public abstract g()Landroid/util/Range;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroid/util/Range<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end method

.method public abstract h(I)Landroid/util/Range;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)",
            "Landroid/util/Range<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end method

.method public abstract i()Landroid/util/Range;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroid/util/Range<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end method

.method public abstract j()Landroid/util/Range;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroid/util/Range<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end method
