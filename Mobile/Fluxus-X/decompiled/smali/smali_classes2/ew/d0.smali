.class public final Lew/d0;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0002\u0008\u0006\n\u0002\u0010\u0011\n\u0002\u0008\u0003\u0008\u0000\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J\u0015\u0010\t\u001a\u00020\u00082\u0006\u0010\u0007\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\t\u0010\nJ\u0015\u0010\u000b\u001a\u00020\u00082\u0006\u0010\u0007\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u000b\u0010\nJ\u001f\u0010\u000e\u001a\u00020\u00082\u0006\u0010\r\u001a\u00020\u000c2\u0006\u0010\u0007\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u001f\u0010\u0010\u001a\u00020\u00082\u0006\u0010\r\u001a\u00020\u000c2\u0006\u0010\u0007\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\u0008\u0010\u0010\u000fR\u0016\u0010\u0012\u001a\u00020\u000c8\u0000@\u0000X\u0081\u000e\u00a2\u0006\u0006\n\u0004\u0008\t\u0010\u0011R\u001e\u0010\u0015\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00138\u0000@\u0000X\u0081\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0005\u0010\u0014\u00a8\u0006\u0016"
    }
    d2 = {
        "Lew/d0;",
        "",
        "<init>",
        "()V",
        "Lew/c;",
        "b",
        "()Lew/c;",
        "node",
        "",
        "a",
        "(Lew/c;)V",
        "e",
        "",
        "vacantIndex",
        "d",
        "(ILew/c;)V",
        "c",
        "I",
        "size",
        "",
        "[Lew/c;",
        "array",
        "okio"
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

.field public b:[Lew/c;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/16 v0, 0x8

    new-array v0, v0, [Lew/c;

    iput-object v0, p0, Lew/d0;->b:[Lew/c;

    return-void
.end method


# virtual methods
.method public final a(Lew/c;)V
    .locals 8
    .param p1    # Lew/c;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "node"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget v0, p0, Lew/d0;->a:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lew/d0;->a:I

    iget-object v1, p0, Lew/d0;->b:[Lew/c;

    array-length v2, v1

    if-ne v0, v2, :cond_0

    mul-int/lit8 v2, v0, 0x2

    new-array v2, v2, [Lew/c;

    const/16 v6, 0xe

    const/4 v7, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-static/range {v1 .. v7}, Lkotlin/collections/l;->l([Ljava/lang/Object;[Ljava/lang/Object;IIIILjava/lang/Object;)[Ljava/lang/Object;

    iput-object v2, p0, Lew/d0;->b:[Lew/c;

    :cond_0
    invoke-virtual {p0, v0, p1}, Lew/d0;->d(ILew/c;)V

    return-void
.end method

.method public final b()Lew/c;
    .locals 2
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    iget-object v0, p0, Lew/d0;->b:[Lew/c;

    const/4 v1, 0x1

    aget-object v0, v0, v1

    return-object v0
.end method

.method public final c(ILew/c;)V
    .locals 9

    :goto_0
    shl-int/lit8 v0, p1, 0x1

    add-int/lit8 v1, v0, 0x1

    iget v2, p0, Lew/d0;->a:I

    const-wide/16 v3, 0x0

    if-gt v1, v2, :cond_1

    iget-object v2, p0, Lew/d0;->b:[Lew/c;

    aget-object v0, v2, v0

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    iget-object v2, p0, Lew/d0;->b:[Lew/c;

    aget-object v1, v2, v1

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {v0}, Lew/c;->u()J

    move-result-wide v5

    invoke-virtual {v1}, Lew/c;->u()J

    move-result-wide v7

    sub-long/2addr v7, v5

    invoke-static {v3, v4, v7, v8}, Lkotlin/jvm/internal/Intrinsics;->g(JJ)I

    move-result v2

    if-gez v2, :cond_0

    goto :goto_1

    :cond_0
    move-object v0, v1

    goto :goto_1

    :cond_1
    if-gt v0, v2, :cond_2

    iget-object v1, p0, Lew/d0;->b:[Lew/c;

    aget-object v0, v1, v0

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    :goto_1
    invoke-virtual {p2}, Lew/c;->u()J

    move-result-wide v1

    invoke-virtual {v0}, Lew/c;->u()J

    move-result-wide v5

    sub-long/2addr v5, v1

    invoke-static {v3, v4, v5, v6}, Lkotlin/jvm/internal/Intrinsics;->g(JJ)I

    move-result v1

    if-lez v1, :cond_2

    iget v1, v0, Lew/c;->g:I

    iput p1, v0, Lew/c;->g:I

    iget-object v2, p0, Lew/d0;->b:[Lew/c;

    aput-object v0, v2, p1

    move p1, v1

    goto :goto_0

    :cond_2
    iget-object v0, p0, Lew/d0;->b:[Lew/c;

    aput-object p2, v0, p1

    iput p1, p2, Lew/c;->g:I

    return-void
.end method

.method public final d(ILew/c;)V
    .locals 8

    :goto_0
    shr-int/lit8 v0, p1, 0x1

    if-eqz v0, :cond_0

    iget-object v1, p0, Lew/d0;->b:[Lew/c;

    aget-object v1, v1, v0

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {v1}, Lew/c;->u()J

    move-result-wide v2

    invoke-virtual {p2}, Lew/c;->u()J

    move-result-wide v4

    const-wide/16 v6, 0x0

    sub-long/2addr v4, v2

    invoke-static {v6, v7, v4, v5}, Lkotlin/jvm/internal/Intrinsics;->g(JJ)I

    move-result v2

    if-lez v2, :cond_0

    iput p1, v1, Lew/c;->g:I

    iget-object v2, p0, Lew/d0;->b:[Lew/c;

    aput-object v1, v2, p1

    move p1, v0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lew/d0;->b:[Lew/c;

    aput-object p2, v0, p1

    iput p1, p2, Lew/c;->g:I

    return-void
.end method

.method public final e(Lew/c;)V
    .locals 8
    .param p1    # Lew/c;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "node"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget v0, p1, Lew/c;->g:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_3

    iget v2, p0, Lew/d0;->a:I

    iget-object v3, p0, Lew/d0;->b:[Lew/c;

    aget-object v3, v3, v2

    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    iput v1, p1, Lew/c;->g:I

    iget-object v1, p0, Lew/d0;->b:[Lew/c;

    const/4 v4, 0x0

    aput-object v4, v1, v2

    add-int/lit8 v2, v2, -0x1

    iput v2, p0, Lew/d0;->a:I

    if-ne p1, v3, :cond_0

    return-void

    :cond_0
    invoke-virtual {p1}, Lew/c;->u()J

    move-result-wide v1

    invoke-virtual {v3}, Lew/c;->u()J

    move-result-wide v4

    const-wide/16 v6, 0x0

    sub-long/2addr v4, v1

    invoke-static {v6, v7, v4, v5}, Lkotlin/jvm/internal/Intrinsics;->g(JJ)I

    move-result p1

    if-nez p1, :cond_1

    iget-object p1, p0, Lew/d0;->b:[Lew/c;

    aput-object v3, p1, v0

    iput v0, v3, Lew/c;->g:I

    return-void

    :cond_1
    if-gez p1, :cond_2

    invoke-virtual {p0, v0, v3}, Lew/d0;->c(ILew/c;)V

    return-void

    :cond_2
    invoke-virtual {p0, v0, v3}, Lew/d0;->d(ILew/c;)V

    return-void

    :cond_3
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Failed requirement."

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
