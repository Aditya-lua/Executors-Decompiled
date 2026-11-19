.class public final Lrj/b0;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\t\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0008\u0008\u00c6\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J$\u0010\t\u001a\u0004\u0018\u00010\u00082\u0006\u0010\u0005\u001a\u00020\u00042\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0086@\u00a2\u0006\u0004\u0008\t\u0010\nJ\"\u0010\r\u001a\u0004\u0018\u00010\u00082\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000c\u001a\u00020\u000bH\u0086@\u00a2\u0006\u0004\u0008\r\u0010\u000eJ/\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0005\u001a\u00020\u00042\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u000e\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00080\u000f\u00a2\u0006\u0004\u0008\u0012\u0010\u0013J-\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000c\u001a\u00020\u000b2\u000e\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00080\u000f\u00a2\u0006\u0004\u0008\u0014\u0010\u0015R(\u0010\u001d\u001a\u00020\u00168\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0018\n\u0004\u0008\u0012\u0010\u0017\u0012\u0004\u0008\u001c\u0010\u0003\u001a\u0004\u0008\u0018\u0010\u0019\"\u0004\u0008\u001a\u0010\u001b\u00a8\u0006\u001e"
    }
    d2 = {
        "Lrj/b0;",
        "",
        "<init>",
        "()V",
        "Landroid/content/Context;",
        "context",
        "",
        "url",
        "Landroid/graphics/Bitmap;",
        "a",
        "(Landroid/content/Context;Ljava/lang/String;Leu/b;)Ljava/lang/Object;",
        "",
        "userId",
        "d",
        "(Landroid/content/Context;JLeu/b;)Ljava/lang/Object;",
        "Ljava/util/function/Consumer;",
        "callback",
        "",
        "b",
        "(Landroid/content/Context;Ljava/lang/String;Ljava/util/function/Consumer;)V",
        "c",
        "(Landroid/content/Context;JLjava/util/function/Consumer;)V",
        "Lkotlin/coroutines/CoroutineContext;",
        "Lkotlin/coroutines/CoroutineContext;",
        "getCoroutineContext",
        "()Lkotlin/coroutines/CoroutineContext;",
        "setCoroutineContext",
        "(Lkotlin/coroutines/CoroutineContext;)V",
        "getCoroutineContext$annotations",
        "coroutineContext",
        "NativeShell_googleProdRelease"
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
.field public static final a:Lrj/b0;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static b:Lkotlin/coroutines/CoroutineContext;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lrj/b0;

    invoke-direct {v0}, Lrj/b0;-><init>()V

    sput-object v0, Lrj/b0;->a:Lrj/b0;

    invoke-static {}, Lav/g1;->b()Lav/l0;

    move-result-object v0

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-static {v1, v2, v1}, Lav/z2;->b(Lav/d2;ILjava/lang/Object;)Lav/a0;

    move-result-object v1

    invoke-virtual {v0, v1}, Lkotlin/coroutines/a;->plus(Lkotlin/coroutines/CoroutineContext;)Lkotlin/coroutines/CoroutineContext;

    move-result-object v0

    sput-object v0, Lrj/b0;->b:Lkotlin/coroutines/CoroutineContext;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Landroid/content/Context;Ljava/lang/String;Leu/b;)Ljava/lang/Object;
    .locals 5
    .param p1    # Landroid/content/Context;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p3    # Leu/b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/lang/String;",
            "Leu/b<",
            "-",
            "Landroid/graphics/Bitmap;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    const/4 v0, 0x1

    const/4 v1, 0x0

    if-eqz p2, :cond_1

    invoke-interface {p2}, Ljava/lang/CharSequence;->length()I

    move-result v2

    if-nez v2, :cond_0

    goto :goto_0

    :cond_0
    move v2, v1

    goto :goto_1

    :cond_1
    :goto_0
    move v2, v0

    :goto_1
    const/4 v3, 0x0

    if-nez v2, :cond_2

    goto :goto_2

    :cond_2
    move-object p2, v3

    :goto_2
    if-eqz p2, :cond_4

    invoke-static {p1}, Ll6/d0;->a(Landroid/content/Context;)Ll6/s;

    move-result-object v2

    new-instance v4, Ly6/g$a;

    invoke-direct {v4, p1}, Ly6/g$a;-><init>(Landroid/content/Context;)V

    invoke-virtual {v4, p2}, Ly6/g$a;->c(Ljava/lang/Object;)Ly6/g$a;

    move-result-object p1

    new-instance p2, Ld7/a;

    invoke-direct {p2}, Ld7/a;-><init>()V

    new-array v0, v0, [Ld7/c;

    aput-object p2, v0, v1

    invoke-static {p1, v0}, Ly6/i;->j(Ly6/g$a;[Ld7/c;)Ly6/g$a;

    move-result-object p1

    invoke-virtual {p1}, Ly6/g$a;->b()Ly6/g;

    move-result-object p1

    sget-object p2, Lrj/b0;->b:Lkotlin/coroutines/CoroutineContext;

    new-instance v0, Lrj/b0$a;

    invoke-direct {v0, v2, p1, v3}, Lrj/b0$a;-><init>(Ll6/s;Ly6/g;Leu/b;)V

    invoke-static {p2, v0, p3}, Lav/i;->g(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;Leu/b;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, Lfu/c;->e()Ljava/lang/Object;

    move-result-object p2

    if-ne p1, p2, :cond_3

    return-object p1

    :cond_3
    check-cast p1, Landroid/graphics/Bitmap;

    return-object p1

    :cond_4
    return-object v3
.end method

.method public final b(Landroid/content/Context;Ljava/lang/String;Ljava/util/function/Consumer;)V
    .locals 7
    .param p1    # Landroid/content/Context;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p3    # Ljava/util/function/Consumer;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/lang/String;",
            "Ljava/util/function/Consumer<",
            "Landroid/graphics/Bitmap;",
            ">;)V"
        }
    .end annotation

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "callback"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lrj/b0;->b:Lkotlin/coroutines/CoroutineContext;

    invoke-static {v0}, Lav/q0;->a(Lkotlin/coroutines/CoroutineContext;)Lav/p0;

    move-result-object v1

    new-instance v4, Lrj/b0$b;

    const/4 v0, 0x0

    invoke-direct {v4, p3, p1, p2, v0}, Lrj/b0$b;-><init>(Ljava/util/function/Consumer;Landroid/content/Context;Ljava/lang/String;Leu/b;)V

    const/4 v5, 0x3

    const/4 v6, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static/range {v1 .. v6}, Lav/i;->d(Lav/p0;Lkotlin/coroutines/CoroutineContext;Lav/r0;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lav/d2;

    return-void
.end method

.method public final c(Landroid/content/Context;JLjava/util/function/Consumer;)V
    .locals 8
    .param p1    # Landroid/content/Context;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p4    # Ljava/util/function/Consumer;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "J",
            "Ljava/util/function/Consumer<",
            "Landroid/graphics/Bitmap;",
            ">;)V"
        }
    .end annotation

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "callback"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lrj/b0;->b:Lkotlin/coroutines/CoroutineContext;

    invoke-static {v0}, Lav/q0;->a(Lkotlin/coroutines/CoroutineContext;)Lav/p0;

    move-result-object v1

    new-instance v2, Lrj/b0$c;

    const/4 v7, 0x0

    move-object v4, p1

    move-wide v5, p2

    move-object v3, p4

    invoke-direct/range {v2 .. v7}, Lrj/b0$c;-><init>(Ljava/util/function/Consumer;Landroid/content/Context;JLeu/b;)V

    const/4 v5, 0x3

    const/4 v6, 0x0

    move-object v4, v2

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static/range {v1 .. v6}, Lav/i;->d(Lav/p0;Lkotlin/coroutines/CoroutineContext;Lav/r0;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lav/d2;

    return-void
.end method

.method public final d(Landroid/content/Context;JLeu/b;)Ljava/lang/Object;
    .locals 16
    .param p1    # Landroid/content/Context;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p4    # Leu/b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "J",
            "Leu/b<",
            "-",
            "Landroid/graphics/Bitmap;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    move-object/from16 v1, p0

    move-wide/from16 v2, p2

    move-object/from16 v0, p4

    instance-of v4, v0, Lrj/b0$d;

    if-eqz v4, :cond_0

    move-object v4, v0

    check-cast v4, Lrj/b0$d;

    iget v5, v4, Lrj/b0$d;->A:I

    const/high16 v6, -0x80000000

    and-int v7, v5, v6

    if-eqz v7, :cond_0

    sub-int/2addr v5, v6

    iput v5, v4, Lrj/b0$d;->A:I

    :goto_0
    move-object v10, v4

    goto :goto_1

    :cond_0
    new-instance v4, Lrj/b0$d;

    invoke-direct {v4, v1, v0}, Lrj/b0$d;-><init>(Lrj/b0;Leu/b;)V

    goto :goto_0

    :goto_1
    iget-object v0, v10, Lrj/b0$d;->y:Ljava/lang/Object;

    invoke-static {}, Lfu/c;->e()Ljava/lang/Object;

    move-result-object v4

    iget v5, v10, Lrj/b0$d;->A:I

    const/4 v11, 0x2

    const/4 v12, 0x0

    const/4 v13, 0x1

    const/4 v14, 0x0

    if-eqz v5, :cond_3

    if-eq v5, v13, :cond_2

    if-ne v5, v11, :cond_1

    iget-object v2, v10, Lrj/b0$d;->v:Ljava/lang/Object;

    check-cast v2, Ljava/lang/String;

    iget-object v2, v10, Lrj/b0$d;->u:Ljava/lang/Object;

    check-cast v2, Ljava/lang/String;

    iget-object v2, v10, Lrj/b0$d;->t:Ljava/lang/Object;

    check-cast v2, Landroid/content/Context;

    invoke-static {v0}, Lzt/o;->b(Ljava/lang/Object;)V

    return-object v0

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    iget-wide v2, v10, Lrj/b0$d;->w:J

    iget-object v5, v10, Lrj/b0$d;->v:Ljava/lang/Object;

    check-cast v5, Lrj/b0;

    iget-object v5, v10, Lrj/b0$d;->u:Ljava/lang/Object;

    check-cast v5, Ljava/lang/String;

    iget-object v6, v10, Lrj/b0$d;->t:Ljava/lang/Object;

    check-cast v6, Landroid/content/Context;

    :try_start_0
    invoke-static {v0}, Lzt/o;->b(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_5

    :catchall_0
    move-exception v0

    goto/16 :goto_9

    :cond_3
    invoke-static {v0}, Lzt/o;->b(Ljava/lang/Object;)V

    invoke-static {}, Lrj/u;->c()Lrj/u;

    move-result-object v0

    invoke-virtual {v0, v2, v3}, Lrj/u;->f(J)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_5

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v5

    if-nez v5, :cond_4

    goto :goto_2

    :cond_4
    move v5, v12

    goto :goto_3

    :cond_5
    :goto_2
    move v5, v13

    :goto_3
    if-nez v5, :cond_6

    move-object v15, v0

    goto :goto_4

    :cond_6
    move-object v15, v14

    :goto_4
    if-nez v15, :cond_d

    :try_start_1
    sget-object v0, Lzt/n;->b:Lzt/n$a;

    invoke-static {}, Lcl/g;->d()Lcl/d;

    move-result-object v0

    invoke-interface {v0}, Lcl/d;->f()Lcom/roblox/platform/http/interfaces/ThumbnailsInterface;

    move-result-object v5

    invoke-static {v2, v3}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v6

    const-string v7, "150x150"

    const-string v8, "Png"

    move-object/from16 v9, p1

    iput-object v9, v10, Lrj/b0$d;->t:Ljava/lang/Object;

    invoke-static {v15}, Lgu/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    iput-object v0, v10, Lrj/b0$d;->u:Ljava/lang/Object;

    invoke-static {v1}, Lgu/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    iput-object v0, v10, Lrj/b0$d;->v:Ljava/lang/Object;

    iput-wide v2, v10, Lrj/b0$d;->w:J

    iput v12, v10, Lrj/b0$d;->x:I

    iput v13, v10, Lrj/b0$d;->A:I

    const/4 v9, 0x0

    invoke-interface/range {v5 .. v10}, Lcom/roblox/platform/http/interfaces/ThumbnailsInterface;->getAvatarHeadshot(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLeu/b;)Ljava/lang/Object;

    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    if-ne v0, v4, :cond_7

    goto/16 :goto_c

    :cond_7
    move-object/from16 v6, p1

    move-object v5, v15

    :goto_5
    :try_start_2
    check-cast v0, Lql/b;

    iget-object v0, v0, Lql/b;->data:Ljava/util/List;

    if-eqz v0, :cond_8

    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lql/a;

    if-eqz v0, :cond_8

    iget-object v0, v0, Lql/a;->imageUrl:Ljava/lang/String;

    goto :goto_6

    :cond_8
    move-object v0, v14

    :goto_6
    if-eqz v0, :cond_9

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v7

    if-nez v7, :cond_a

    :cond_9
    move v12, v13

    :cond_a
    if-nez v12, :cond_b

    goto :goto_7

    :cond_b
    move-object v0, v14

    :goto_7
    invoke-static {v0}, Lzt/n;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :goto_8
    move-object v15, v5

    goto :goto_a

    :catchall_1
    move-exception v0

    move-object/from16 v6, p1

    move-object v5, v15

    :goto_9
    sget-object v7, Lzt/n;->b:Lzt/n$a;

    invoke-static {v0}, Lzt/o;->a(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lzt/n;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    goto :goto_8

    :goto_a
    invoke-static {v0}, Lzt/n;->g(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_c

    move-object v0, v14

    :cond_c
    check-cast v0, Ljava/lang/String;

    if-eqz v0, :cond_e

    invoke-static {}, Lrj/u;->c()Lrj/u;

    move-result-object v5

    invoke-virtual {v5, v2, v3, v0}, Lrj/u;->h(JLjava/lang/String;)Ljava/lang/String;

    move-object v14, v0

    goto :goto_b

    :cond_d
    move-object/from16 v6, p1

    move-object v14, v15

    :cond_e
    :goto_b
    invoke-static {v6}, Lgu/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    iput-object v0, v10, Lrj/b0$d;->t:Ljava/lang/Object;

    invoke-static {v15}, Lgu/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    iput-object v0, v10, Lrj/b0$d;->u:Ljava/lang/Object;

    invoke-static {v14}, Lgu/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    iput-object v0, v10, Lrj/b0$d;->v:Ljava/lang/Object;

    iput-wide v2, v10, Lrj/b0$d;->w:J

    iput v11, v10, Lrj/b0$d;->A:I

    invoke-virtual {v1, v6, v14, v10}, Lrj/b0;->a(Landroid/content/Context;Ljava/lang/String;Leu/b;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v4, :cond_f

    :goto_c
    return-object v4

    :cond_f
    return-object v0
.end method
