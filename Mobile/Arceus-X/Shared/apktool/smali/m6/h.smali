.class public final Lm6/h;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lm6/h$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0006\n\u0002\u0008\u0002\n\u0002\u0010\u0007\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u00c6\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J7\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0008\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0007\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ7\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0008\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0007\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ7\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u00102\u0006\u0010\u0006\u001a\u00020\u00102\u0006\u0010\u0007\u001a\u00020\u00102\u0006\u0010\u0008\u001a\u00020\u00102\u0006\u0010\n\u001a\u00020\tH\u0007\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J7\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\r2\u0006\u0010\u0008\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\tH\u0007\u00a2\u0006\u0004\u0008\u0013\u0010\u0014J7\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0017\u001a\u00020\u0015H\u0007\u00a2\u0006\u0004\u0008\u0019\u0010\u001aJ\u001b\u0010\u001c\u001a\u00020\u0004*\u00020\u001b2\u0006\u0010\n\u001a\u00020\tH\u0002\u00a2\u0006\u0004\u0008\u001c\u0010\u001d\u00a8\u0006\u001e"
    }
    d2 = {
        "Lm6/h;",
        "",
        "<init>",
        "()V",
        "",
        "srcWidth",
        "srcHeight",
        "dstWidth",
        "dstHeight",
        "Ly6/f;",
        "scale",
        "a",
        "(IIIILy6/f;)I",
        "",
        "d",
        "(IIIILy6/f;)D",
        "",
        "e",
        "(FFFFLy6/f;)F",
        "c",
        "(DDDDLy6/f;)D",
        "Ly6/g;",
        "targetSize",
        "maxSize",
        "Le7/r;",
        "b",
        "(IILy6/g;Ly6/f;Ly6/g;)J",
        "Ly6/a;",
        "f",
        "(Ly6/a;Ly6/f;)I",
        "coil-core_release"
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
.field public static final a:Lm6/h;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lm6/h;

    invoke-direct {v0}, Lm6/h;-><init>()V

    sput-object v0, Lm6/h;->a:Lm6/h;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static final a(IIIILy6/f;)I
    .locals 0
    .param p4    # Ly6/f;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    div-int/2addr p0, p2

    invoke-static {p0}, Ljava/lang/Integer;->highestOneBit(I)I

    move-result p0

    div-int/2addr p1, p3

    invoke-static {p1}, Ljava/lang/Integer;->highestOneBit(I)I

    move-result p1

    sget-object p2, Lm6/h$a;->a:[I

    invoke-virtual {p4}, Ljava/lang/Enum;->ordinal()I

    move-result p3

    aget p2, p2, p3

    const/4 p3, 0x1

    if-eq p2, p3, :cond_1

    const/4 p4, 0x2

    if-ne p2, p4, :cond_0

    invoke-static {p0, p1}, Ljava/lang/Math;->max(II)I

    move-result p0

    goto :goto_0

    :cond_0
    new-instance p0, Ljt/l;

    invoke-direct {p0}, Ljt/l;-><init>()V

    throw p0

    :cond_1
    invoke-static {p0, p1}, Ljava/lang/Math;->min(II)I

    move-result p0

    :goto_0
    invoke-static {p0, p3}, Lkotlin/ranges/d;->c(II)I

    move-result p0

    return p0
.end method

.method public static final b(IILy6/g;Ly6/f;Ly6/g;)J
    .locals 2
    .param p2    # Ly6/g;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Ly6/f;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p4    # Ly6/g;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    invoke-static {p2}, Ly6/h;->b(Ly6/g;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    sget-object p0, Lm6/h;->a:Lm6/h;

    invoke-virtual {p2}, Ly6/g;->d()Ly6/a;

    move-result-object p1

    invoke-virtual {p0, p1, p3}, Lm6/h;->f(Ly6/a;Ly6/f;)I

    move-result p1

    invoke-virtual {p2}, Ly6/g;->c()Ly6/a;

    move-result-object p2

    invoke-virtual {p0, p2, p3}, Lm6/h;->f(Ly6/a;Ly6/f;)I

    move-result p0

    move v1, p1

    move p1, p0

    move p0, v1

    :goto_0
    invoke-virtual {p4}, Ly6/g;->d()Ly6/a;

    move-result-object p2

    instance-of p2, p2, Ly6/a$a;

    if-eqz p2, :cond_1

    invoke-static {p0}, Le7/h0;->o(I)Z

    move-result p2

    if-nez p2, :cond_1

    invoke-virtual {p4}, Ly6/g;->d()Ly6/a;

    move-result-object p2

    check-cast p2, Ly6/a$a;

    invoke-virtual {p2}, Ly6/a$a;->f()I

    move-result p2

    invoke-static {p0, p2}, Lkotlin/ranges/d;->f(II)I

    move-result p0

    :cond_1
    invoke-virtual {p4}, Ly6/g;->c()Ly6/a;

    move-result-object p2

    instance-of p2, p2, Ly6/a$a;

    if-eqz p2, :cond_2

    invoke-static {p1}, Le7/h0;->o(I)Z

    move-result p2

    if-nez p2, :cond_2

    invoke-virtual {p4}, Ly6/g;->c()Ly6/a;

    move-result-object p2

    check-cast p2, Ly6/a$a;

    invoke-virtual {p2}, Ly6/a$a;->f()I

    move-result p2

    invoke-static {p1, p2}, Lkotlin/ranges/d;->f(II)I

    move-result p1

    :cond_2
    invoke-static {p0, p1}, Le7/r;->a(II)J

    move-result-wide p0

    return-wide p0
.end method

.method public static final c(DDDDLy6/f;)D
    .locals 0
    .param p8    # Ly6/f;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    div-double/2addr p4, p0

    div-double/2addr p6, p2

    sget-object p0, Lm6/h$a;->a:[I

    invoke-virtual {p8}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p0, p0, p1

    const/4 p1, 0x1

    if-eq p0, p1, :cond_1

    const/4 p1, 0x2

    if-ne p0, p1, :cond_0

    invoke-static {p4, p5, p6, p7}, Ljava/lang/Math;->min(DD)D

    move-result-wide p0

    return-wide p0

    :cond_0
    new-instance p0, Ljt/l;

    invoke-direct {p0}, Ljt/l;-><init>()V

    throw p0

    :cond_1
    invoke-static {p4, p5, p6, p7}, Ljava/lang/Math;->max(DD)D

    move-result-wide p0

    return-wide p0
.end method

.method public static final d(IIIILy6/f;)D
    .locals 4
    .param p4    # Ly6/f;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    int-to-double v0, p2

    int-to-double v2, p0

    div-double/2addr v0, v2

    int-to-double p2, p3

    int-to-double p0, p1

    div-double/2addr p2, p0

    sget-object p0, Lm6/h$a;->a:[I

    invoke-virtual {p4}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p0, p0, p1

    const/4 p1, 0x1

    if-eq p0, p1, :cond_1

    const/4 p1, 0x2

    if-ne p0, p1, :cond_0

    invoke-static {v0, v1, p2, p3}, Ljava/lang/Math;->min(DD)D

    move-result-wide p0

    return-wide p0

    :cond_0
    new-instance p0, Ljt/l;

    invoke-direct {p0}, Ljt/l;-><init>()V

    throw p0

    :cond_1
    invoke-static {v0, v1, p2, p3}, Ljava/lang/Math;->max(DD)D

    move-result-wide p0

    return-wide p0
.end method

.method public static final e(FFFFLy6/f;)F
    .locals 0
    .param p4    # Ly6/f;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    div-float/2addr p2, p0

    div-float/2addr p3, p1

    sget-object p0, Lm6/h$a;->a:[I

    invoke-virtual {p4}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p0, p0, p1

    const/4 p1, 0x1

    if-eq p0, p1, :cond_1

    const/4 p1, 0x2

    if-ne p0, p1, :cond_0

    invoke-static {p2, p3}, Ljava/lang/Math;->min(FF)F

    move-result p0

    return p0

    :cond_0
    new-instance p0, Ljt/l;

    invoke-direct {p0}, Ljt/l;-><init>()V

    throw p0

    :cond_1
    invoke-static {p2, p3}, Ljava/lang/Math;->max(FF)F

    move-result p0

    return p0
.end method


# virtual methods
.method public final f(Ly6/a;Ly6/f;)I
    .locals 1

    instance-of v0, p1, Ly6/a$a;

    if-eqz v0, :cond_0

    check-cast p1, Ly6/a$a;

    invoke-virtual {p1}, Ly6/a$a;->f()I

    move-result p1

    return p1

    :cond_0
    sget-object p1, Lm6/h$a;->a:[I

    invoke-virtual {p2}, Ljava/lang/Enum;->ordinal()I

    move-result p2

    aget p1, p1, p2

    const/4 p2, 0x1

    if-eq p1, p2, :cond_2

    const/4 p2, 0x2

    if-ne p1, p2, :cond_1

    const p1, 0x7fffffff

    return p1

    :cond_1
    new-instance p1, Ljt/l;

    invoke-direct {p1}, Ljt/l;-><init>()V

    throw p1

    :cond_2
    const/high16 p1, -0x80000000

    return p1
.end method
