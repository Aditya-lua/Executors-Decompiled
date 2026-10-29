.class public final Lxu/f0$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lxu/f0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010 \n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0002\u0008\u0006\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J#\u0010\u0008\u001a\u00020\u00072\u0012\u0010\u0006\u001a\n\u0012\u0006\u0008\u0001\u0012\u00020\u00050\u0004\"\u00020\u0005H\u0007\u00a2\u0006\u0004\u0008\u0008\u0010\tJ[\u0010\u0015\u001a\u00020\u00142\u0008\u0008\u0002\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u000c2\u0008\u0008\u0002\u0010\u000f\u001a\u00020\u000e2\u000c\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u00102\u0008\u0008\u0002\u0010\u0011\u001a\u00020\u000e2\u0008\u0008\u0002\u0010\u0012\u001a\u00020\u000e2\u000c\u0010\u0013\u001a\u0008\u0012\u0004\u0012\u00020\u000e0\u0010H\u0002\u00a2\u0006\u0004\u0008\u0015\u0010\u0016R\u0018\u0010\u0019\u001a\u00020\n*\u00020\u000c8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0017\u0010\u0018\u00a8\u0006\u001a"
    }
    d2 = {
        "Lxu/f0$a;",
        "",
        "<init>",
        "()V",
        "",
        "Lxu/h;",
        "byteStrings",
        "Lxu/f0;",
        "d",
        "([Lxu/h;)Lxu/f0;",
        "",
        "nodeOffset",
        "Lxu/e;",
        "node",
        "",
        "byteStringOffset",
        "",
        "fromIndex",
        "toIndex",
        "indexes",
        "",
        "a",
        "(JLxu/e;ILjava/util/List;IILjava/util/List;)V",
        "c",
        "(Lxu/e;)J",
        "intCount",
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


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lxu/f0$a;-><init>()V

    return-void
.end method

.method public static synthetic b(Lxu/f0$a;JLxu/e;ILjava/util/List;IILjava/util/List;ILjava/lang/Object;)V
    .locals 9

    and-int/lit8 v0, p9, 0x1

    if-eqz v0, :cond_0

    const-wide/16 p1, 0x0

    :cond_0
    move-wide v1, p1

    and-int/lit8 p1, p9, 0x4

    const/4 p2, 0x0

    if-eqz p1, :cond_1

    move v4, p2

    goto :goto_0

    :cond_1
    move v4, p4

    :goto_0
    and-int/lit8 p1, p9, 0x10

    if-eqz p1, :cond_2

    move v6, p2

    goto :goto_1

    :cond_2
    move v6, p6

    :goto_1
    and-int/lit8 p1, p9, 0x20

    if-eqz p1, :cond_3

    invoke-interface {p5}, Ljava/util/List;->size()I

    move-result p1

    move v7, p1

    :goto_2
    move-object v0, p0

    move-object v3, p3

    move-object v5, p5

    move-object/from16 v8, p8

    goto :goto_3

    :cond_3
    move/from16 v7, p7

    goto :goto_2

    :goto_3
    invoke-virtual/range {v0 .. v8}, Lxu/f0$a;->a(JLxu/e;ILjava/util/List;IILjava/util/List;)V

    return-void
.end method


# virtual methods
.method public final a(JLxu/e;ILjava/util/List;IILjava/util/List;)V
    .locals 19
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J",
            "Lxu/e;",
            "I",
            "Ljava/util/List<",
            "+",
            "Lxu/h;",
            ">;II",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;)V"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v9, p3

    move/from16 v10, p4

    move-object/from16 v5, p5

    move/from16 v1, p6

    move/from16 v11, p7

    move-object/from16 v8, p8

    const-string v2, "Failed requirement."

    if-ge v1, v11, :cond_11

    move v3, v1

    :goto_0
    if-ge v3, v11, :cond_1

    invoke-interface {v5, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lxu/h;

    invoke-virtual {v4}, Lxu/h;->I()I

    move-result v4

    if-lt v4, v10, :cond_0

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_0
    new-instance v1, Ljava/lang/IllegalArgumentException;

    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_1
    invoke-interface/range {p5 .. p6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lxu/h;

    add-int/lit8 v3, v11, -0x1

    invoke-interface {v5, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lxu/h;

    invoke-virtual {v2}, Lxu/h;->I()I

    move-result v4

    if-ne v10, v4, :cond_2

    invoke-interface {v8, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result v2

    add-int/lit8 v1, v1, 0x1

    invoke-interface {v5, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lxu/h;

    move v6, v1

    move v1, v2

    move-object v2, v4

    goto :goto_1

    :cond_2
    move v6, v1

    const/4 v1, -0x1

    :goto_1
    invoke-virtual {v2, v10}, Lxu/h;->j(I)B

    move-result v4

    invoke-virtual {v3, v10}, Lxu/h;->j(I)B

    move-result v7

    const/4 v13, 0x2

    if-eq v4, v7, :cond_c

    add-int/lit8 v2, v6, 0x1

    const/4 v3, 0x1

    :goto_2
    if-ge v2, v11, :cond_4

    add-int/lit8 v4, v2, -0x1

    invoke-interface {v5, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lxu/h;

    invoke-virtual {v4, v10}, Lxu/h;->j(I)B

    move-result v4

    invoke-interface {v5, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lxu/h;

    invoke-virtual {v7, v10}, Lxu/h;->j(I)B

    move-result v7

    if-eq v4, v7, :cond_3

    add-int/lit8 v3, v3, 0x1

    :cond_3
    add-int/lit8 v2, v2, 0x1

    goto :goto_2

    :cond_4
    invoke-virtual {v0, v9}, Lxu/f0$a;->c(Lxu/e;)J

    move-result-wide v14

    add-long v14, p1, v14

    const/16 v16, -0x1

    int-to-long v12, v13

    add-long/2addr v14, v12

    mul-int/lit8 v2, v3, 0x2

    int-to-long v12, v2

    add-long/2addr v14, v12

    invoke-virtual {v9, v3}, Lxu/e;->t0(I)Lxu/e;

    invoke-virtual {v9, v1}, Lxu/e;->t0(I)Lxu/e;

    move v1, v6

    :goto_3
    if-ge v1, v11, :cond_7

    invoke-interface {v5, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lxu/h;

    invoke-virtual {v2, v10}, Lxu/h;->j(I)B

    move-result v2

    if-eq v1, v6, :cond_5

    add-int/lit8 v3, v1, -0x1

    invoke-interface {v5, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lxu/h;

    invoke-virtual {v3, v10}, Lxu/h;->j(I)B

    move-result v3

    if-eq v2, v3, :cond_6

    :cond_5
    and-int/lit16 v2, v2, 0xff

    invoke-virtual {v9, v2}, Lxu/e;->t0(I)Lxu/e;

    :cond_6
    add-int/lit8 v1, v1, 0x1

    goto :goto_3

    :cond_7
    new-instance v3, Lxu/e;

    invoke-direct {v3}, Lxu/e;-><init>()V

    :goto_4
    if-ge v6, v11, :cond_b

    invoke-interface {v5, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lxu/h;

    invoke-virtual {v1, v10}, Lxu/h;->j(I)B

    move-result v1

    add-int/lit8 v2, v6, 0x1

    move v4, v2

    :goto_5
    if-ge v4, v11, :cond_9

    invoke-interface {v5, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lxu/h;

    invoke-virtual {v7, v10}, Lxu/h;->j(I)B

    move-result v7

    if-eq v1, v7, :cond_8

    move v7, v4

    goto :goto_6

    :cond_8
    add-int/lit8 v4, v4, 0x1

    goto :goto_5

    :cond_9
    move v7, v11

    :goto_6
    if-ne v2, v7, :cond_a

    add-int/lit8 v1, v10, 0x1

    invoke-interface {v5, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lxu/h;

    invoke-virtual {v2}, Lxu/h;->I()I

    move-result v2

    if-ne v1, v2, :cond_a

    invoke-interface {v8, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    move-result v1

    invoke-virtual {v9, v1}, Lxu/e;->t0(I)Lxu/e;

    move-wide v1, v14

    goto :goto_7

    :cond_a
    invoke-virtual {v0, v3}, Lxu/f0$a;->c(Lxu/e;)J

    move-result-wide v1

    add-long/2addr v1, v14

    long-to-int v1, v1

    mul-int/lit8 v1, v1, -0x1

    invoke-virtual {v9, v1}, Lxu/e;->t0(I)Lxu/e;

    add-int/lit8 v4, v10, 0x1

    move-wide v1, v14

    invoke-virtual/range {v0 .. v8}, Lxu/f0$a;->a(JLxu/e;ILjava/util/List;IILjava/util/List;)V

    :goto_7
    move-wide v14, v1

    move v6, v7

    goto :goto_4

    :cond_b
    invoke-virtual {v9, v3}, Lxu/e;->g2(Lxu/r0;)J

    return-void

    :cond_c
    const/16 v16, -0x1

    invoke-virtual {v2}, Lxu/h;->I()I

    move-result v4

    invoke-virtual {v3}, Lxu/h;->I()I

    move-result v7

    invoke-static {v4, v7}, Ljava/lang/Math;->min(II)I

    move-result v4

    const/4 v7, 0x0

    move v12, v10

    :goto_8
    if-ge v12, v4, :cond_d

    invoke-virtual {v2, v12}, Lxu/h;->j(I)B

    move-result v14

    invoke-virtual {v3, v12}, Lxu/h;->j(I)B

    move-result v15

    if-ne v14, v15, :cond_d

    add-int/lit8 v7, v7, 0x1

    add-int/lit8 v12, v12, 0x1

    goto :goto_8

    :cond_d
    invoke-virtual {v0, v9}, Lxu/f0$a;->c(Lxu/e;)J

    move-result-wide v3

    add-long v3, p1, v3

    int-to-long v12, v13

    add-long/2addr v3, v12

    int-to-long v12, v7

    add-long/2addr v3, v12

    const-wide/16 v12, 0x1

    add-long/2addr v3, v12

    neg-int v12, v7

    invoke-virtual {v9, v12}, Lxu/e;->t0(I)Lxu/e;

    invoke-virtual {v9, v1}, Lxu/e;->t0(I)Lxu/e;

    add-int v1, v10, v7

    :goto_9
    if-ge v10, v1, :cond_e

    invoke-virtual {v2, v10}, Lxu/h;->j(I)B

    move-result v7

    and-int/lit16 v7, v7, 0xff

    invoke-virtual {v9, v7}, Lxu/e;->t0(I)Lxu/e;

    add-int/lit8 v10, v10, 0x1

    goto :goto_9

    :cond_e
    add-int/lit8 v2, v6, 0x1

    if-ne v2, v11, :cond_10

    invoke-interface {v5, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lxu/h;

    invoke-virtual {v2}, Lxu/h;->I()I

    move-result v2

    if-ne v1, v2, :cond_f

    invoke-interface {v8, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    move-result v1

    invoke-virtual {v9, v1}, Lxu/e;->t0(I)Lxu/e;

    return-void

    :cond_f
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "Check failed."

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_10
    move-wide/from16 v17, v3

    move v4, v1

    move-wide/from16 v1, v17

    new-instance v3, Lxu/e;

    invoke-direct {v3}, Lxu/e;-><init>()V

    invoke-virtual {v0, v3}, Lxu/f0$a;->c(Lxu/e;)J

    move-result-wide v12

    add-long/2addr v12, v1

    long-to-int v7, v12

    mul-int/lit8 v7, v7, -0x1

    invoke-virtual {v9, v7}, Lxu/e;->t0(I)Lxu/e;

    move v7, v11

    invoke-virtual/range {v0 .. v8}, Lxu/f0$a;->a(JLxu/e;ILjava/util/List;IILjava/util/List;)V

    invoke-virtual {v9, v3}, Lxu/e;->g2(Lxu/r0;)J

    return-void

    :cond_11
    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-direct {v0, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final c(Lxu/e;)J
    .locals 4

    invoke-virtual {p1}, Lxu/e;->size()J

    move-result-wide v0

    const/4 p1, 0x4

    int-to-long v2, p1

    div-long/2addr v0, v2

    return-wide v0
.end method

.method public final varargs d([Lxu/h;)Lxu/f0;
    .locals 16
    .param p1    # [Lxu/h;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    move-object/from16 v0, p1

    const-string v1, "byteStrings"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    array-length v1, v0

    const/4 v2, 0x0

    const/4 v3, -0x1

    const/4 v4, 0x0

    if-nez v1, :cond_0

    new-instance v0, Lxu/f0;

    new-array v1, v4, [Lxu/h;

    filled-new-array {v4, v3}, [I

    move-result-object v3

    invoke-direct {v0, v1, v3, v2}, Lxu/f0;-><init>([Lxu/h;[ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0

    :cond_0
    invoke-static {v0}, Lkotlin/collections/m;->l0([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v5

    invoke-static {v5}, Lkotlin/collections/t;->x(Ljava/util/List;)V

    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v1

    new-instance v13, Ljava/util/ArrayList;

    invoke-direct {v13, v1}, Ljava/util/ArrayList;-><init>(I)V

    move v6, v4

    :goto_0
    if-ge v6, v1, :cond_1

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-virtual {v13, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    :cond_1
    array-length v1, v0

    move v3, v4

    move v11, v3

    :goto_1
    if-ge v3, v1, :cond_2

    aget-object v6, v0, v3

    add-int/lit8 v12, v11, 0x1

    const/4 v9, 0x6

    const/4 v10, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    invoke-static/range {v5 .. v10}, Lkotlin/collections/p;->j(Ljava/util/List;Ljava/lang/Comparable;IIILjava/lang/Object;)I

    move-result v6

    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-interface {v13, v6, v7}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    add-int/lit8 v3, v3, 0x1

    move v11, v12

    goto :goto_1

    :cond_2
    invoke-interface {v5, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lxu/h;

    invoke-virtual {v1}, Lxu/h;->I()I

    move-result v1

    if-lez v1, :cond_8

    move v1, v4

    :goto_2
    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v3

    if-ge v1, v3, :cond_6

    invoke-interface {v5, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lxu/h;

    add-int/lit8 v6, v1, 0x1

    move v7, v6

    :goto_3
    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v8

    if-ge v7, v8, :cond_5

    invoke-interface {v5, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lxu/h;

    invoke-virtual {v8, v3}, Lxu/h;->J(Lxu/h;)Z

    move-result v9

    if-eqz v9, :cond_5

    invoke-virtual {v8}, Lxu/h;->I()I

    move-result v9

    invoke-virtual {v3}, Lxu/h;->I()I

    move-result v10

    if-eq v9, v10, :cond_4

    invoke-interface {v13, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/lang/Number;

    invoke-virtual {v8}, Ljava/lang/Number;->intValue()I

    move-result v8

    invoke-interface {v13, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ljava/lang/Number;

    invoke-virtual {v9}, Ljava/lang/Number;->intValue()I

    move-result v9

    if-le v8, v9, :cond_3

    invoke-interface {v5, v7}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    invoke-interface {v13, v7}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/lang/Number;

    invoke-virtual {v8}, Ljava/lang/Number;->intValue()I

    goto :goto_3

    :cond_3
    add-int/lit8 v7, v7, 0x1

    goto :goto_3

    :cond_4
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "duplicate option: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/IllegalArgumentException;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_5
    move v1, v6

    goto :goto_2

    :cond_6
    new-instance v8, Lxu/e;

    invoke-direct {v8}, Lxu/e;-><init>()V

    const/16 v14, 0x35

    const/4 v15, 0x0

    const-wide/16 v6, 0x0

    const/4 v9, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    move-object v10, v5

    move-object/from16 v5, p0

    invoke-static/range {v5 .. v15}, Lxu/f0$a;->b(Lxu/f0$a;JLxu/e;ILjava/util/List;IILjava/util/List;ILjava/lang/Object;)V

    invoke-virtual {v5, v8}, Lxu/f0$a;->c(Lxu/e;)J

    move-result-wide v6

    long-to-int v1, v6

    new-array v3, v1, [I

    :goto_4
    if-ge v4, v1, :cond_7

    invoke-virtual {v8}, Lxu/e;->readInt()I

    move-result v6

    aput v6, v3, v4

    add-int/lit8 v4, v4, 0x1

    goto :goto_4

    :cond_7
    new-instance v1, Lxu/f0;

    array-length v4, v0

    invoke-static {v0, v4}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v0

    const-string v4, "copyOf(...)"

    invoke-static {v0, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, [Lxu/h;

    invoke-direct {v1, v0, v3, v2}, Lxu/f0;-><init>([Lxu/h;[ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1

    :cond_8
    move-object/from16 v5, p0

    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "the empty byte string is not a supported option"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
