.class public final Lis/d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0010 \n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u0011\n\u0002\u0008\u0002\n\u0002\u0010\u0006\n\u0002\u0008\u0004\n\u0002\u0010\u0004\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0008\u0003\u0008\u00c0\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J$\u0010\u0006\u001a\u000c\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u00052\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0001H\u0086\u0002\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u001d\u0010\u000b\u001a\u0008\u0012\u0004\u0012\u00020\u00010\n2\u0006\u0010\t\u001a\u00020\u0008H\u0002\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u001d\u0010\u000e\u001a\u0008\u0012\u0004\u0012\u00020\u00010\n2\u0006\u0010\t\u001a\u00020\rH\u0002\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u001f\u0010\u0010\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u0005*\u0008\u0012\u0004\u0012\u00020\u00010\u0005H\u0002\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\u001f\u0010\u0013\u001a\u0008\u0012\u0004\u0012\u00020\u00120\u0005*\u0008\u0012\u0004\u0012\u00020\u00120\u0005H\u0002\u00a2\u0006\u0004\u0008\u0013\u0010\u0011J\u001f\u0010\u0014\u001a\u0008\u0012\u0004\u0012\u00020\u00120\u0005*\u0008\u0012\u0004\u0012\u00020\u00120\u0005H\u0002\u00a2\u0006\u0004\u0008\u0014\u0010\u0011J\u001f\u0010\u0016\u001a\u0008\u0012\u0004\u0012\u00020\u00150\u0005*\u0008\u0012\u0004\u0012\u00020\u00120\u0005H\u0002\u00a2\u0006\u0004\u0008\u0016\u0010\u0011R*\u0010\u0019\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0012\u000c\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00050\u00178\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000e\u0010\u0018\u00a8\u0006\u001a"
    }
    d2 = {
        "Lis/d;",
        "",
        "<init>",
        "()V",
        "key",
        "",
        "a",
        "(Ljava/lang/Object;)Ljava/util/List;",
        "",
        "value",
        "",
        "c",
        "(I)[Ljava/lang/Object;",
        "",
        "b",
        "(D)[Ljava/lang/Object;",
        "f",
        "(Ljava/util/List;)Ljava/util/List;",
        "",
        "d",
        "e",
        "Ljava/io/Serializable;",
        "g",
        "",
        "Ljava/util/Map;",
        "tableOfTruth",
        "core_release"
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
.field public static final a:Lis/d;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final b:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/Object;",
            "Ljava/util/List<",
            "Ljava/lang/Object;",
            ">;>;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 40

    new-instance v0, Lis/d;

    invoke-direct {v0}, Lis/d;-><init>()V

    sput-object v0, Lis/d;->a:Lis/d;

    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    new-instance v2, Lkotlin/jvm/internal/f0;

    const/4 v3, 0x2

    invoke-direct {v2, v3}, Lkotlin/jvm/internal/f0;-><init>(I)V

    invoke-virtual {v2, v1}, Lkotlin/jvm/internal/f0;->a(Ljava/lang/Object;)V

    const/4 v4, 0x1

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-virtual {v0, v4}, Lis/d;->c(I)[Ljava/lang/Object;

    move-result-object v5

    invoke-virtual {v2, v5}, Lkotlin/jvm/internal/f0;->b(Ljava/lang/Object;)V

    invoke-virtual {v2}, Lkotlin/jvm/internal/f0;->c()I

    move-result v5

    new-array v5, v5, [Ljava/lang/Object;

    invoke-virtual {v2, v5}, Lkotlin/jvm/internal/f0;->d([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v2

    invoke-static {v2}, Lkotlin/collections/p;->n([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2

    invoke-static {v1, v2}, Ljt/s;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v9

    sget-object v10, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    new-instance v2, Lkotlin/jvm/internal/f0;

    const/4 v5, 0x7

    invoke-direct {v2, v5}, Lkotlin/jvm/internal/f0;-><init>(I)V

    invoke-virtual {v2, v10}, Lkotlin/jvm/internal/f0;->a(Ljava/lang/Object;)V

    const/4 v7, 0x0

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    invoke-virtual {v0, v7}, Lis/d;->c(I)[Ljava/lang/Object;

    move-result-object v8

    invoke-virtual {v2, v8}, Lkotlin/jvm/internal/f0;->b(Ljava/lang/Object;)V

    const-string v8, ""

    invoke-virtual {v2, v8}, Lkotlin/jvm/internal/f0;->a(Ljava/lang/Object;)V

    invoke-static {}, Lkotlin/collections/p;->k()Ljava/util/List;

    move-result-object v12

    invoke-virtual {v2, v12}, Lkotlin/jvm/internal/f0;->a(Ljava/lang/Object;)V

    new-instance v12, Lks/b;

    invoke-static {}, Lkotlin/collections/p;->k()Ljava/util/List;

    move-result-object v13

    invoke-direct {v12, v13}, Lks/b;-><init>(Ljava/lang/Object;)V

    invoke-virtual {v2, v12}, Lkotlin/jvm/internal/f0;->a(Ljava/lang/Object;)V

    new-instance v12, Lks/b;

    invoke-direct {v12, v8}, Lks/b;-><init>(Ljava/lang/Object;)V

    invoke-virtual {v2, v12}, Lkotlin/jvm/internal/f0;->a(Ljava/lang/Object;)V

    new-instance v12, Lks/b;

    const/4 v13, 0x0

    invoke-direct {v12, v13}, Lks/b;-><init>(Ljava/lang/Object;)V

    invoke-virtual {v2, v12}, Lkotlin/jvm/internal/f0;->a(Ljava/lang/Object;)V

    invoke-virtual {v2}, Lkotlin/jvm/internal/f0;->c()I

    move-result v12

    new-array v12, v12, [Ljava/lang/Object;

    invoke-virtual {v2, v12}, Lkotlin/jvm/internal/f0;->d([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v2

    invoke-static {v2}, Lkotlin/collections/p;->n([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2

    invoke-static {v10, v2}, Ljt/s;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v17

    new-instance v2, Lkotlin/jvm/internal/f0;

    invoke-direct {v2, v3}, Lkotlin/jvm/internal/f0;-><init>(I)V

    invoke-virtual {v2, v1}, Lkotlin/jvm/internal/f0;->a(Ljava/lang/Object;)V

    invoke-virtual {v0, v4}, Lis/d;->c(I)[Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v2, v3}, Lkotlin/jvm/internal/f0;->b(Ljava/lang/Object;)V

    invoke-virtual {v2}, Lkotlin/jvm/internal/f0;->c()I

    move-result v3

    new-array v3, v3, [Ljava/lang/Object;

    invoke-virtual {v2, v3}, Lkotlin/jvm/internal/f0;->d([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v2

    invoke-static {v2}, Lkotlin/collections/p;->n([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2

    invoke-static {v6, v2}, Ljt/s;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v18

    new-instance v2, Lkotlin/jvm/internal/f0;

    invoke-direct {v2, v5}, Lkotlin/jvm/internal/f0;-><init>(I)V

    invoke-virtual {v2, v10}, Lkotlin/jvm/internal/f0;->a(Ljava/lang/Object;)V

    invoke-virtual {v0, v7}, Lis/d;->c(I)[Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v2, v3}, Lkotlin/jvm/internal/f0;->b(Ljava/lang/Object;)V

    invoke-virtual {v2, v8}, Lkotlin/jvm/internal/f0;->a(Ljava/lang/Object;)V

    invoke-static {}, Lkotlin/collections/p;->k()Ljava/util/List;

    move-result-object v3

    invoke-virtual {v2, v3}, Lkotlin/jvm/internal/f0;->a(Ljava/lang/Object;)V

    new-instance v3, Lks/b;

    invoke-static {}, Lkotlin/collections/p;->k()Ljava/util/List;

    move-result-object v4

    invoke-direct {v3, v4}, Lks/b;-><init>(Ljava/lang/Object;)V

    invoke-virtual {v2, v3}, Lkotlin/jvm/internal/f0;->a(Ljava/lang/Object;)V

    new-instance v3, Lks/b;

    invoke-direct {v3, v8}, Lks/b;-><init>(Ljava/lang/Object;)V

    invoke-virtual {v2, v3}, Lkotlin/jvm/internal/f0;->a(Ljava/lang/Object;)V

    new-instance v3, Lks/b;

    invoke-direct {v3, v13}, Lks/b;-><init>(Ljava/lang/Object;)V

    invoke-virtual {v2, v3}, Lkotlin/jvm/internal/f0;->a(Ljava/lang/Object;)V

    invoke-virtual {v2}, Lkotlin/jvm/internal/f0;->c()I

    move-result v3

    new-array v3, v3, [Ljava/lang/Object;

    invoke-virtual {v2, v3}, Lkotlin/jvm/internal/f0;->d([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v2

    invoke-static {v2}, Lkotlin/collections/p;->n([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2

    invoke-static {v11, v2}, Ljt/s;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v19

    const-string v2, "true"

    invoke-static {v2}, Lkotlin/collections/o;->d(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v3

    invoke-static {v2, v3}, Ljt/s;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v20

    const-string v2, "false"

    invoke-static {v2}, Lkotlin/collections/o;->d(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v3

    invoke-static {v2, v3}, Ljt/s;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v21

    const-wide/high16 v2, 0x3ff0000000000000L    # 1.0

    invoke-static {v2, v3}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v3

    new-instance v5, Lks/b;

    invoke-direct {v5, v6}, Lks/b;-><init>(Ljava/lang/Object;)V

    move-object v2, v6

    new-instance v6, Lks/b;

    invoke-direct {v6, v3}, Lks/b;-><init>(Ljava/lang/Object;)V

    new-instance v7, Lks/b;

    const-string v12, "1"

    invoke-direct {v7, v12}, Lks/b;-><init>(Ljava/lang/Object;)V

    const-string v4, "1"

    filled-new-array/range {v1 .. v7}, [Ljava/lang/Object;

    move-result-object v4

    invoke-static {v4}, Lkotlin/collections/p;->n([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v4

    invoke-static {v12, v4}, Ljt/s;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v22

    const-wide/16 v4, 0x0

    move-object v6, v12

    invoke-static {v4, v5}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v12

    new-instance v14, Lks/b;

    invoke-direct {v14, v11}, Lks/b;-><init>(Ljava/lang/Object;)V

    new-instance v15, Lks/b;

    invoke-direct {v15, v12}, Lks/b;-><init>(Ljava/lang/Object;)V

    new-instance v7, Lks/b;

    const-string v4, "0"

    invoke-direct {v7, v4}, Lks/b;-><init>(Ljava/lang/Object;)V

    move-object v5, v13

    const-string v13, "0"

    move-object/from16 v16, v7

    filled-new-array/range {v10 .. v16}, [Ljava/lang/Object;

    move-result-object v7

    invoke-static {v7}, Lkotlin/collections/p;->n([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v7

    invoke-static {v4, v7}, Ljt/s;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v25

    invoke-static {}, Lkotlin/collections/p;->k()Ljava/util/List;

    move-result-object v13

    new-instance v14, Lks/b;

    invoke-static {}, Lkotlin/collections/p;->k()Ljava/util/List;

    move-result-object v7

    invoke-direct {v14, v7}, Lks/b;-><init>(Ljava/lang/Object;)V

    new-instance v15, Lks/b;

    invoke-direct {v15, v8}, Lks/b;-><init>(Ljava/lang/Object;)V

    new-instance v7, Lks/b;

    invoke-direct {v7, v5}, Lks/b;-><init>(Ljava/lang/Object;)V

    move-object/from16 v16, v12

    const-string v12, ""

    move-object/from16 v39, v16

    move-object/from16 v16, v7

    move-object/from16 v7, v39

    filled-new-array/range {v10 .. v16}, [Ljava/lang/Object;

    move-result-object v12

    invoke-static {v12}, Lkotlin/collections/p;->n([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v12

    invoke-static {v8, v12}, Ljt/s;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v15

    invoke-static {v5}, Lkotlin/collections/o;->d(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v12

    invoke-static {v5, v12}, Ljt/s;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v16

    invoke-static {}, Lkotlin/collections/p;->k()Ljava/util/List;

    move-result-object v12

    filled-new-array {v10, v11, v7, v8}, [Ljava/lang/Object;

    move-result-object v13

    invoke-static {v13}, Lkotlin/collections/p;->n([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v13

    invoke-static {v12, v13}, Ljt/s;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v12

    new-instance v13, Lks/b;

    invoke-direct {v13, v5}, Lks/b;-><init>(Ljava/lang/Object;)V

    filled-new-array {v10, v11, v7, v8}, [Ljava/lang/Object;

    move-result-object v5

    invoke-static {v5}, Lkotlin/collections/p;->n([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v5

    invoke-static {v13, v5}, Ljt/s;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v13

    new-instance v5, Lks/b;

    invoke-direct {v5, v8}, Lks/b;-><init>(Ljava/lang/Object;)V

    filled-new-array {v10, v11, v7, v8}, [Ljava/lang/Object;

    move-result-object v14

    invoke-static {v14}, Lkotlin/collections/p;->n([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v14

    invoke-static {v5, v14}, Ljt/s;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v14

    new-instance v5, Lks/b;

    move-object/from16 v26, v9

    invoke-static {}, Lkotlin/collections/p;->k()Ljava/util/List;

    move-result-object v9

    invoke-direct {v5, v9}, Lks/b;-><init>(Ljava/lang/Object;)V

    filled-new-array {v10, v11, v7, v8}, [Ljava/lang/Object;

    move-result-object v8

    invoke-static {v8}, Lkotlin/collections/p;->n([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v8

    invoke-static {v5, v8}, Ljt/s;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v9

    new-instance v5, Lks/b;

    invoke-direct {v5, v11}, Lks/b;-><init>(Ljava/lang/Object;)V

    filled-new-array {v10, v11, v7, v4}, [Ljava/lang/Object;

    move-result-object v8

    invoke-static {v8}, Lkotlin/collections/p;->n([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v8

    invoke-static {v5, v8}, Ljt/s;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v27

    new-instance v5, Lks/b;

    invoke-direct {v5, v2}, Lks/b;-><init>(Ljava/lang/Object;)V

    filled-new-array {v1, v2, v3, v6}, [Ljava/lang/Object;

    move-result-object v8

    invoke-static {v8}, Lkotlin/collections/p;->n([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v8

    invoke-static {v5, v8}, Ljt/s;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v28

    new-instance v5, Lks/b;

    invoke-direct {v5, v6}, Lks/b;-><init>(Ljava/lang/Object;)V

    filled-new-array {v1, v2, v3, v6}, [Ljava/lang/Object;

    move-result-object v8

    invoke-static {v8}, Lkotlin/collections/p;->n([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v8

    invoke-static {v5, v8}, Ljt/s;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v29

    new-instance v5, Lks/b;

    invoke-direct {v5, v4}, Lks/b;-><init>(Ljava/lang/Object;)V

    filled-new-array {v10, v11, v7, v4}, [Ljava/lang/Object;

    move-result-object v8

    invoke-static {v8}, Lkotlin/collections/p;->n([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v8

    invoke-static {v5, v8}, Ljt/s;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v30

    new-instance v5, Lks/b;

    invoke-direct {v5, v7}, Lks/b;-><init>(Ljava/lang/Object;)V

    filled-new-array {v10, v11, v7, v4}, [Ljava/lang/Object;

    move-result-object v4

    invoke-static {v4}, Lkotlin/collections/p;->n([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v4

    invoke-static {v5, v4}, Ljt/s;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v31

    new-instance v4, Lks/b;

    invoke-direct {v4, v3}, Lks/b;-><init>(Ljava/lang/Object;)V

    filled-new-array {v1, v2, v3, v6}, [Ljava/lang/Object;

    move-result-object v5

    invoke-static {v5}, Lkotlin/collections/p;->n([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v5

    invoke-static {v4, v5}, Ljt/s;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v32

    new-instance v4, Lks/b;

    const-string v5, "1.0"

    invoke-direct {v4, v5}, Lks/b;-><init>(Ljava/lang/Object;)V

    filled-new-array {v1, v2, v3}, [Ljava/lang/Object;

    move-result-object v6

    invoke-static {v6}, Lkotlin/collections/p;->n([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v6

    invoke-static {v4, v6}, Ljt/s;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v33

    new-instance v4, Lks/b;

    const-string v6, "0.0"

    invoke-direct {v4, v6}, Lks/b;-><init>(Ljava/lang/Object;)V

    filled-new-array {v10, v11, v7}, [Ljava/lang/Object;

    move-result-object v8

    invoke-static {v8}, Lkotlin/collections/p;->n([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v8

    invoke-static {v4, v8}, Ljt/s;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v34

    new-instance v4, Lks/b;

    invoke-direct {v4, v3}, Lks/b;-><init>(Ljava/lang/Object;)V

    move-object v8, v7

    move-object v7, v1

    move-object v1, v3

    new-instance v3, Lks/b;

    invoke-direct {v3, v2}, Lks/b;-><init>(Ljava/lang/Object;)V

    move-object/from16 v35, v6

    move-object v6, v2

    move-object v2, v4

    new-instance v4, Lks/b;

    invoke-direct {v4, v5}, Lks/b;-><init>(Ljava/lang/Object;)V

    move-object/from16 v36, v5

    const-string v5, "1"

    move-object/from16 v37, v8

    const-string v8, "1.0"

    move-object/from16 v38, v9

    move-object/from16 v23, v12

    move-object/from16 v24, v13

    move-object/from16 v13, v35

    move-object/from16 v12, v36

    move-object/from16 v9, v37

    filled-new-array/range {v1 .. v8}, [Ljava/lang/Object;

    move-result-object v2

    move-object v3, v1

    move-object v1, v7

    invoke-static {v2}, Lkotlin/collections/p;->n([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2

    invoke-static {v3, v2}, Ljt/s;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    filled-new-array {v12, v3, v6, v1}, [Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1}, Lkotlin/collections/p;->n([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    invoke-static {v12, v1}, Ljt/s;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    new-instance v3, Lkotlin/jvm/internal/f0;

    const/4 v4, 0x4

    invoke-direct {v3, v4}, Lkotlin/jvm/internal/f0;-><init>(I)V

    const-wide/16 v4, 0x0

    invoke-virtual {v0, v4, v5}, Lis/d;->b(D)[Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v3, v0}, Lkotlin/jvm/internal/f0;->b(Ljava/lang/Object;)V

    invoke-virtual {v3, v10}, Lkotlin/jvm/internal/f0;->a(Ljava/lang/Object;)V

    invoke-static {}, Lkotlin/collections/p;->k()Ljava/util/List;

    move-result-object v0

    invoke-virtual {v3, v0}, Lkotlin/jvm/internal/f0;->a(Ljava/lang/Object;)V

    new-instance v0, Lks/b;

    invoke-static {}, Lkotlin/collections/p;->k()Ljava/util/List;

    move-result-object v4

    invoke-direct {v0, v4}, Lks/b;-><init>(Ljava/lang/Object;)V

    invoke-virtual {v3, v0}, Lkotlin/jvm/internal/f0;->a(Ljava/lang/Object;)V

    invoke-virtual {v3}, Lkotlin/jvm/internal/f0;->c()I

    move-result v0

    new-array v0, v0, [Ljava/lang/Object;

    invoke-virtual {v3, v0}, Lkotlin/jvm/internal/f0;->d([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lkotlin/collections/p;->n([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    invoke-static {v9, v0}, Ljt/s;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    filled-new-array {v13, v9, v11, v10}, [Ljava/lang/Object;

    move-result-object v3

    invoke-static {v3}, Lkotlin/collections/p;->n([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v3

    invoke-static {v13, v3}, Ljt/s;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    move-object/from16 v8, v17

    move-object/from16 v9, v18

    move-object/from16 v10, v19

    move-object/from16 v11, v20

    move-object/from16 v12, v21

    move-object/from16 v13, v22

    move-object/from16 v17, v23

    move-object/from16 v18, v24

    move-object/from16 v7, v26

    move-object/from16 v21, v27

    move-object/from16 v22, v28

    move-object/from16 v23, v29

    move-object/from16 v24, v30

    move-object/from16 v26, v32

    move-object/from16 v27, v33

    move-object/from16 v28, v34

    move-object/from16 v20, v38

    move-object/from16 v30, v1

    move-object/from16 v29, v2

    move-object/from16 v32, v3

    move-object/from16 v19, v14

    move-object/from16 v14, v25

    move-object/from16 v25, v31

    move-object/from16 v31, v0

    filled-new-array/range {v7 .. v32}, [Lkotlin/Pair;

    move-result-object v0

    invoke-static {v0}, Lkotlin/collections/k0;->m([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v0

    sput-object v0, Lis/d;->b:Ljava/util/Map;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;)Ljava/util/List;
    .locals 1
    .param p1    # Ljava/lang/Object;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            ")",
            "Ljava/util/List<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    sget-object v0, Lis/d;->b:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/List;

    return-object p1
.end method

.method public final b(D)[Ljava/lang/Object;
    .locals 0

    invoke-static {p1, p2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object p1

    invoke-static {p1}, Lkotlin/collections/o;->d(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    invoke-virtual {p0, p1}, Lis/d;->e(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    invoke-virtual {p0, p1}, Lis/d;->g(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    invoke-virtual {p0, p1}, Lis/d;->f(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/util/Collection;

    const/4 p2, 0x0

    new-array p2, p2, [Ljava/lang/Object;

    invoke-interface {p1, p2}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final c(I)[Ljava/lang/Object;
    .locals 1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-static {p1}, Lkotlin/collections/o;->d(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    invoke-virtual {p0, p1}, Lis/d;->d(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    invoke-virtual {p0, p1}, Lis/d;->g(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    invoke-virtual {p0, p1}, Lis/d;->f(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/util/Collection;

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Object;

    invoke-interface {p1, v0}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final d(Ljava/util/List;)Ljava/util/List;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Ljava/lang/Number;",
            ">;)",
            "Ljava/util/List<",
            "Ljava/lang/Number;",
            ">;"
        }
    .end annotation

    move-object v0, p1

    check-cast v0, Ljava/util/Collection;

    check-cast p1, Ljava/lang/Iterable;

    new-instance v1, Ljava/util/ArrayList;

    const/16 v2, 0xa

    invoke-static {p1, v2}, Lkotlin/collections/q;->u(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->doubleValue()D

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    invoke-static {v0, v1}, Lkotlin/collections/CollectionsKt;->w0(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method public final e(Ljava/util/List;)Ljava/util/List;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Ljava/lang/Number;",
            ">;)",
            "Ljava/util/List<",
            "Ljava/lang/Number;",
            ">;"
        }
    .end annotation

    move-object v0, p1

    check-cast v0, Ljava/util/Collection;

    check-cast p1, Ljava/lang/Iterable;

    new-instance v1, Ljava/util/ArrayList;

    const/16 v2, 0xa

    invoke-static {p1, v2}, Lkotlin/collections/q;->u(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    invoke-static {v0, v1}, Lkotlin/collections/CollectionsKt;->w0(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method public final f(Ljava/util/List;)Ljava/util/List;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Ljava/lang/Object;",
            ">;)",
            "Ljava/util/List<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    move-object v0, p1

    check-cast v0, Ljava/util/Collection;

    check-cast p1, Ljava/lang/Iterable;

    new-instance v1, Ljava/util/ArrayList;

    const/16 v2, 0xa

    invoke-static {p1, v2}, Lkotlin/collections/q;->u(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    new-instance v3, Lks/b;

    invoke-direct {v3, v2}, Lks/b;-><init>(Ljava/lang/Object;)V

    invoke-interface {v1, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    invoke-static {v0, v1}, Lkotlin/collections/CollectionsKt;->w0(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method public final g(Ljava/util/List;)Ljava/util/List;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Ljava/lang/Number;",
            ">;)",
            "Ljava/util/List<",
            "Ljava/io/Serializable;",
            ">;"
        }
    .end annotation

    move-object v0, p1

    check-cast v0, Ljava/util/Collection;

    check-cast p1, Ljava/lang/Iterable;

    new-instance v1, Ljava/util/ArrayList;

    const/16 v2, 0xa

    invoke-static {p1, v2}, Lkotlin/collections/q;->u(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    invoke-static {v0, v1}, Lkotlin/collections/CollectionsKt;->w0(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method
