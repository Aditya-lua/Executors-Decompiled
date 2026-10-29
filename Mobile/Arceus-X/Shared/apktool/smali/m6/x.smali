.class public final Lm6/x;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lm6/i;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lm6/x$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0008\n\u0008\u0007\u0018\u00002\u00020\u0001:\u0001\u000eB+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005\u0012\u0006\u0010\u0008\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u0010\u0010\u000e\u001a\u00020\rH\u0096@\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u0013\u0010\u0012\u001a\u00020\u0011*\u00020\u0010H\u0002\u00a2\u0006\u0004\u0008\u0012\u0010\u0013R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000e\u0010\u0014R\u0018\u0010\u0006\u001a\u00060\u0004j\u0002`\u00058\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0015\u0010\u0016R\u0014\u0010\u0008\u001a\u00020\u00078\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0017\u0010\u0018R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0019\u0010\u001a\u00a8\u0006\u001b"
    }
    d2 = {
        "Lm6/x;",
        "Lm6/i;",
        "Landroid/graphics/ImageDecoder$Source;",
        "source",
        "Ljava/lang/AutoCloseable;",
        "Lkotlin/AutoCloseable;",
        "closeable",
        "Lx6/p;",
        "options",
        "Luu/h;",
        "parallelismLock",
        "<init>",
        "(Landroid/graphics/ImageDecoder$Source;Ljava/lang/AutoCloseable;Lx6/p;Luu/h;)V",
        "Lm6/g;",
        "a",
        "(Lnt/b;)Ljava/lang/Object;",
        "Landroid/graphics/ImageDecoder;",
        "",
        "e",
        "(Landroid/graphics/ImageDecoder;)V",
        "Landroid/graphics/ImageDecoder$Source;",
        "b",
        "Ljava/lang/AutoCloseable;",
        "c",
        "Lx6/p;",
        "d",
        "Luu/h;",
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


# instance fields
.field public final a:Landroid/graphics/ImageDecoder$Source;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final b:Ljava/lang/AutoCloseable;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final c:Lx6/p;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final d:Luu/h;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/graphics/ImageDecoder$Source;Ljava/lang/AutoCloseable;Lx6/p;Luu/h;)V
    .locals 0
    .param p1    # Landroid/graphics/ImageDecoder$Source;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/AutoCloseable;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Lx6/p;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p4    # Luu/h;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lm6/x;->a:Landroid/graphics/ImageDecoder$Source;

    iput-object p2, p0, Lm6/x;->b:Ljava/lang/AutoCloseable;

    iput-object p3, p0, Lm6/x;->c:Lx6/p;

    iput-object p4, p0, Lm6/x;->d:Luu/h;

    return-void
.end method

.method public static synthetic b(Landroid/graphics/ImageDecoder$DecodeException;)Z
    .locals 0

    invoke-static {p0}, Lm6/x;->f(Landroid/graphics/ImageDecoder$DecodeException;)Z

    move-result p0

    return p0
.end method

.method public static final synthetic c(Lm6/x;Landroid/graphics/ImageDecoder;)V
    .locals 0

    invoke-virtual {p0, p1}, Lm6/x;->e(Landroid/graphics/ImageDecoder;)V

    return-void
.end method

.method public static final synthetic d(Lm6/x;)Lx6/p;
    .locals 0

    iget-object p0, p0, Lm6/x;->c:Lx6/p;

    return-object p0
.end method

.method public static final f(Landroid/graphics/ImageDecoder$DecodeException;)Z
    .locals 0

    const/4 p0, 0x1

    return p0
.end method


# virtual methods
.method public a(Lnt/b;)Ljava/lang/Object;
    .locals 7
    .param p1    # Lnt/b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnt/b<",
            "-",
            "Lm6/g;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    instance-of v0, p1, Lm6/x$b;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lm6/x$b;

    iget v1, v0, Lm6/x$b;->x:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lm6/x$b;->x:I

    goto :goto_0

    :cond_0
    new-instance v0, Lm6/x$b;

    invoke-direct {v0, p0, p1}, Lm6/x$b;-><init>(Lm6/x;Lnt/b;)V

    :goto_0
    iget-object p1, v0, Lm6/x$b;->v:Ljava/lang/Object;

    invoke-static {}, Lot/c;->e()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, Lm6/x$b;->x:I

    const/4 v3, 0x0

    const/4 v4, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v4, :cond_1

    iget-object v0, v0, Lm6/x$b;->t:Ljava/lang/Object;

    check-cast v0, Luu/h;

    invoke-static {p1}, Ljt/o;->b(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p1}, Ljt/o;->b(Ljava/lang/Object;)V

    iget-object p1, p0, Lm6/x;->d:Luu/h;

    iput-object p1, v0, Lm6/x$b;->t:Ljava/lang/Object;

    iput v3, v0, Lm6/x$b;->u:I

    iput v4, v0, Lm6/x$b;->x:I

    invoke-interface {p1, v0}, Luu/h;->b(Lnt/b;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v1, :cond_3

    return-object v1

    :cond_3
    move-object v0, p1

    :goto_1
    :try_start_0
    iget-object p1, p0, Lm6/x;->b:Ljava/lang/AutoCloseable;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :try_start_1
    new-instance v1, Lkotlin/jvm/internal/y;

    invoke-direct {v1}, Lkotlin/jvm/internal/y;-><init>()V

    iget-object v2, p0, Lm6/x;->a:Landroid/graphics/ImageDecoder$Source;

    new-instance v5, Lm6/x$c;

    invoke-direct {v5, p0, v1}, Lm6/x$c;-><init>(Lm6/x;Lkotlin/jvm/internal/y;)V

    invoke-static {v2, v5}, Landroid/graphics/ImageDecoder;->decodeBitmap(Landroid/graphics/ImageDecoder$Source;Landroid/graphics/ImageDecoder$OnHeaderDecodedListener;)Landroid/graphics/Bitmap;

    move-result-object v2

    new-instance v5, Lm6/g;

    const/4 v6, 0x0

    invoke-static {v2, v3, v4, v6}, Lk6/v;->d(Landroid/graphics/Bitmap;ZILjava/lang/Object;)Lk6/a;

    move-result-object v2

    iget-boolean v1, v1, Lkotlin/jvm/internal/y;->a:Z

    invoke-direct {v5, v2, v1}, Lm6/g;-><init>(Lk6/n;Z)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :try_start_2
    invoke-static {p1, v6}, Lxt/a;->a(Ljava/lang/AutoCloseable;Ljava/lang/Throwable;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    invoke-interface {v0}, Luu/h;->a()V

    return-object v5

    :catchall_0
    move-exception p1

    goto :goto_2

    :catchall_1
    move-exception v1

    :try_start_3
    throw v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    :catchall_2
    move-exception v2

    :try_start_4
    invoke-static {p1, v1}, Lxt/a;->a(Ljava/lang/AutoCloseable;Ljava/lang/Throwable;)V

    throw v2
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    :goto_2
    invoke-interface {v0}, Luu/h;->a()V

    throw p1
.end method

.method public final e(Landroid/graphics/ImageDecoder;)V
    .locals 2

    new-instance v0, Lm6/w;

    invoke-direct {v0}, Lm6/w;-><init>()V

    invoke-virtual {p1, v0}, Landroid/graphics/ImageDecoder;->setOnPartialImageListener(Landroid/graphics/ImageDecoder$OnPartialImageListener;)V

    iget-object v0, p0, Lm6/x;->c:Lx6/p;

    invoke-static {v0}, Lx6/j;->j(Lx6/p;)Landroid/graphics/Bitmap$Config;

    move-result-object v0

    invoke-static {v0}, Le7/b;->d(Landroid/graphics/Bitmap$Config;)Z

    move-result v0

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    const/4 v0, 0x3

    goto :goto_0

    :cond_0
    move v0, v1

    :goto_0
    invoke-virtual {p1, v0}, Landroid/graphics/ImageDecoder;->setAllocator(I)V

    iget-object v0, p0, Lm6/x;->c:Lx6/p;

    invoke-static {v0}, Lx6/j;->h(Lx6/p;)Z

    move-result v0

    xor-int/2addr v0, v1

    invoke-virtual {p1, v0}, Landroid/graphics/ImageDecoder;->setMemorySizePolicy(I)V

    iget-object v0, p0, Lm6/x;->c:Lx6/p;

    invoke-static {v0}, Lx6/j;->l(Lx6/p;)Landroid/graphics/ColorSpace;

    move-result-object v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lm6/x;->c:Lx6/p;

    invoke-static {v0}, Lx6/j;->l(Lx6/p;)Landroid/graphics/ColorSpace;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/graphics/ImageDecoder;->setTargetColorSpace(Landroid/graphics/ColorSpace;)V

    :cond_1
    iget-object v0, p0, Lm6/x;->c:Lx6/p;

    invoke-static {v0}, Lx6/j;->n(Lx6/p;)Z

    move-result v0

    xor-int/2addr v0, v1

    invoke-virtual {p1, v0}, Landroid/graphics/ImageDecoder;->setUnpremultipliedRequired(Z)V

    return-void
.end method
