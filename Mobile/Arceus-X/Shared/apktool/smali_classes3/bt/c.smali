.class public abstract Lbt/c;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a(ILjava/lang/CharSequence;Ljava/lang/Object;)Z
    .locals 1

    instance-of v0, p1, Landroid/text/Spanned;

    if-eqz v0, :cond_0

    check-cast p1, Landroid/text/Spanned;

    invoke-interface {p1, p2}, Landroid/text/Spanned;->getSpanEnd(Ljava/lang/Object;)I

    move-result p1

    if-ne p1, p0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method public static b(ILjava/lang/CharSequence;Ljava/lang/Object;)Z
    .locals 1

    instance-of v0, p1, Landroid/text/Spanned;

    if-eqz v0, :cond_0

    check-cast p1, Landroid/text/Spanned;

    invoke-interface {p1, p2}, Landroid/text/Spanned;->getSpanStart(Ljava/lang/Object;)I

    move-result p1

    if-ne p1, p0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method
