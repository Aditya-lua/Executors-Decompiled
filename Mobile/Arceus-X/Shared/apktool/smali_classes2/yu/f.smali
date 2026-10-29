.class public final Lyu/f;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\t\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0003\u001aA\u0010\t\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00062\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u0006H\u0000\u00a2\u0006\u0004\u0008\t\u0010\n\u001a;\u0010\r\u001a\u00020\u000c*\u00020\u000b2\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0008\u001a\u00020\u0006H\u0002\u00a2\u0006\u0004\u0008\r\u0010\u000e\u00a8\u0006\u000f"
    }
    d2 = {
        "Lxu/l0;",
        "Lxu/h;",
        "bytes",
        "",
        "bytesOffset",
        "byteCount",
        "",
        "fromIndex",
        "toIndex",
        "a",
        "(Lxu/l0;Lxu/h;IIJJ)J",
        "Lxu/e;",
        "",
        "c",
        "(Lxu/e;Lxu/h;IIJJ)Z",
        "okio"
    }
    k = 0x2
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public static final a(Lxu/l0;Lxu/h;IIJJ)J
    .locals 16
    .param p0    # Lxu/l0;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p1    # Lxu/h;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    move-object/from16 v0, p0

    const-string v1, "<this>"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "bytes"

    move-object/from16 v3, p1

    invoke-static {v3, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v3}, Lxu/h;->I()I

    move-result v1

    int-to-long v4, v1

    move/from16 v1, p2

    int-to-long v6, v1

    move/from16 v2, p3

    int-to-long v8, v2

    invoke-static/range {v4 .. v9}, Lxu/b;->b(JJJ)V

    move-wide v10, v8

    iget-boolean v4, v0, Lxu/l0;->c:Z

    if-nez v4, :cond_4

    move-wide/from16 v4, p4

    :goto_0
    iget-object v2, v0, Lxu/l0;->b:Lxu/e;

    move/from16 v9, p3

    move-wide/from16 v6, p6

    move v8, v1

    invoke-static/range {v2 .. v9}, Lyu/a;->b(Lxu/e;Lxu/h;JJII)J

    move-result-wide v1

    const-wide/16 v12, -0x1

    cmp-long v3, v1, v12

    if-eqz v3, :cond_0

    return-wide v1

    :cond_0
    iget-object v1, v0, Lxu/l0;->b:Lxu/e;

    invoke-virtual {v1}, Lxu/e;->size()J

    move-result-wide v1

    sub-long/2addr v1, v10

    const-wide/16 v6, 0x1

    add-long v14, v1, v6

    cmp-long v1, v14, p6

    if-ltz v1, :cond_1

    return-wide v12

    :cond_1
    iget-object v2, v0, Lxu/l0;->b:Lxu/e;

    move-object/from16 v3, p1

    move-wide/from16 v8, p6

    move-wide v6, v4

    move/from16 v4, p2

    move/from16 v5, p3

    invoke-static/range {v2 .. v9}, Lyu/f;->c(Lxu/e;Lxu/h;IIJJ)Z

    move-result v1

    move-wide v4, v6

    if-nez v1, :cond_2

    return-wide v12

    :cond_2
    iget-object v1, v0, Lxu/l0;->a:Lxu/r0;

    iget-object v2, v0, Lxu/l0;->b:Lxu/e;

    const-wide/16 v6, 0x2000

    invoke-interface {v1, v2, v6, v7}, Lxu/r0;->read(Lxu/e;J)J

    move-result-wide v1

    cmp-long v1, v1, v12

    if-nez v1, :cond_3

    return-wide v12

    :cond_3
    invoke-static {v4, v5, v14, v15}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v4

    move-object/from16 v3, p1

    move/from16 v1, p2

    goto :goto_0

    :cond_4
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "closed"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static synthetic b(Lxu/l0;Lxu/h;IIJJILjava/lang/Object;)J
    .locals 8

    and-int/lit8 v0, p8, 0x2

    if-eqz v0, :cond_0

    const/4 p2, 0x0

    :cond_0
    move v2, p2

    and-int/lit8 p2, p8, 0x4

    if-eqz p2, :cond_1

    invoke-virtual {p1}, Lxu/h;->I()I

    move-result p3

    :cond_1
    move v3, p3

    and-int/lit8 p2, p8, 0x10

    if-eqz p2, :cond_2

    const-wide p2, 0x7fffffffffffffffL

    move-wide v6, p2

    :goto_0
    move-object v0, p0

    move-object v1, p1

    move-wide v4, p4

    goto :goto_1

    :cond_2
    move-wide v6, p6

    goto :goto_0

    :goto_1
    invoke-static/range {v0 .. v7}, Lyu/f;->a(Lxu/l0;Lxu/h;IIJJ)J

    move-result-wide p0

    return-wide p0
.end method

.method public static final c(Lxu/e;Lxu/h;IIJJ)Z
    .locals 8

    invoke-virtual {p0}, Lxu/e;->size()J

    move-result-wide v0

    cmp-long v0, v0, p6

    const/4 v1, 0x1

    if-gez v0, :cond_0

    return v1

    :cond_0
    invoke-virtual {p0}, Lxu/e;->size()J

    move-result-wide v2

    sub-long/2addr v2, p6

    const-wide/16 p6, 0x1

    add-long/2addr v2, p6

    invoke-static {p6, p7, v2, v3}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v2

    long-to-int v0, v2

    invoke-virtual {p0}, Lxu/e;->size()J

    move-result-wide v2

    sub-long/2addr v2, p4

    add-long/2addr v2, p6

    int-to-long p3, p3

    invoke-static {p3, p4, v2, v3}, Ljava/lang/Math;->min(JJ)J

    move-result-wide p3

    long-to-int p3, p3

    sub-int/2addr p3, v1

    if-gt v0, p3, :cond_2

    move v7, p3

    :goto_0
    invoke-virtual {p0}, Lxu/e;->size()J

    move-result-wide p3

    int-to-long p5, v7

    sub-long v3, p3, p5

    move-object v2, p0

    move-object v5, p1

    move v6, p2

    invoke-virtual/range {v2 .. v7}, Lxu/e;->r(JLxu/h;II)Z

    move-result p0

    if-eqz p0, :cond_1

    return v1

    :cond_1
    if-eq v7, v0, :cond_2

    add-int/lit8 v7, v7, -0x1

    move-object p0, v2

    move-object p1, v5

    move p2, v6

    goto :goto_0

    :cond_2
    const/4 p0, 0x0

    return p0
.end method
