.class public abstract Leu/d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Leu/d$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\n\n\u0002\u0010\u0006\n\u0002\u0008\u0008\u0008\'\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H&\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u000f\u0010\u0008\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u0017\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\u0008\u000b\u0010\u0007J\u001f\u0010\r\u001a\u00020\u00042\u0006\u0010\u000c\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\u0017\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\u000fH\u0016\u00a2\u0006\u0004\u0008\u0012\u0010\u0013J\u001f\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u000c\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\u000fH\u0016\u00a2\u0006\u0004\u0008\u0014\u0010\u0015\u00a8\u0006\u0017"
    }
    d2 = {
        "Leu/d;",
        "",
        "<init>",
        "()V",
        "",
        "bitCount",
        "b",
        "(I)I",
        "f",
        "()I",
        "until",
        "g",
        "from",
        "h",
        "(II)I",
        "",
        "c",
        "()D",
        "d",
        "(D)D",
        "e",
        "(DD)D",
        "a",
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


# static fields
.field public static final a:Leu/d$a;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final b:Leu/d;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Leu/d$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Leu/d$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Leu/d;->a:Leu/d$a;

    sget-object v0, Lrt/b;->a:Lrt/a;

    invoke-virtual {v0}, Lrt/a;->b()Leu/d;

    move-result-object v0

    sput-object v0, Leu/d;->b:Leu/d;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static final synthetic a()Leu/d;
    .locals 1

    sget-object v0, Leu/d;->b:Leu/d;

    return-object v0
.end method


# virtual methods
.method public abstract b(I)I
.end method

.method public c()D
    .locals 2

    const/16 v0, 0x1a

    invoke-virtual {p0, v0}, Leu/d;->b(I)I

    move-result v0

    const/16 v1, 0x1b

    invoke-virtual {p0, v1}, Leu/d;->b(I)I

    move-result v1

    invoke-static {v0, v1}, Leu/c;->a(II)D

    move-result-wide v0

    return-wide v0
.end method

.method public d(D)D
    .locals 2

    const-wide/16 v0, 0x0

    invoke-virtual {p0, v0, v1, p1, p2}, Leu/d;->e(DD)D

    move-result-wide p1

    return-wide p1
.end method

.method public e(DD)D
    .locals 6

    invoke-static {p1, p2, p3, p4}, Leu/e;->b(DD)V

    sub-double v0, p3, p1

    invoke-static {v0, v1}, Ljava/lang/Double;->isInfinite(D)Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-static {p1, p2}, Ljava/lang/Math;->abs(D)D

    move-result-wide v2

    const-wide v4, 0x7fefffffffffffffL    # Double.MAX_VALUE

    cmpg-double v2, v2, v4

    if-gtz v2, :cond_0

    invoke-static {p3, p4}, Ljava/lang/Math;->abs(D)D

    move-result-wide v2

    cmpg-double v2, v2, v4

    if-gtz v2, :cond_0

    invoke-virtual {p0}, Leu/d;->c()D

    move-result-wide v0

    const/4 v2, 0x2

    int-to-double v2, v2

    div-double v4, p3, v2

    div-double v2, p1, v2

    sub-double/2addr v4, v2

    mul-double/2addr v0, v4

    add-double/2addr p1, v0

    add-double/2addr p1, v0

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Leu/d;->c()D

    move-result-wide v2

    mul-double/2addr v2, v0

    add-double/2addr p1, v2

    :goto_0
    cmpl-double v0, p1, p3

    if-ltz v0, :cond_1

    const-wide/high16 p1, -0x10000000000000L    # Double.NEGATIVE_INFINITY

    invoke-static {p3, p4, p1, p2}, Ljava/lang/Math;->nextAfter(DD)D

    move-result-wide p1

    :cond_1
    return-wide p1
.end method

.method public f()I
    .locals 1

    const/16 v0, 0x20

    invoke-virtual {p0, v0}, Leu/d;->b(I)I

    move-result v0

    return v0
.end method

.method public g(I)I
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, v0, p1}, Leu/d;->h(II)I

    move-result p1

    return p1
.end method

.method public h(II)I
    .locals 3

    invoke-static {p1, p2}, Leu/e;->c(II)V

    sub-int v0, p2, p1

    if-gtz v0, :cond_1

    const/high16 v1, -0x80000000

    if-ne v0, v1, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Leu/d;->f()I

    move-result v0

    if-gt p1, v0, :cond_0

    if-ge v0, p2, :cond_0

    return v0

    :cond_1
    :goto_0
    neg-int p2, v0

    and-int/2addr p2, v0

    if-ne p2, v0, :cond_2

    invoke-static {v0}, Leu/e;->d(I)I

    move-result p2

    invoke-virtual {p0, p2}, Leu/d;->b(I)I

    move-result p2

    goto :goto_1

    :cond_2
    invoke-virtual {p0}, Leu/d;->f()I

    move-result p2

    ushr-int/lit8 p2, p2, 0x1

    rem-int v1, p2, v0

    sub-int/2addr p2, v1

    add-int/lit8 v2, v0, -0x1

    add-int/2addr p2, v2

    if-ltz p2, :cond_2

    move p2, v1

    :goto_1
    add-int/2addr p1, p2

    return p1
.end method
