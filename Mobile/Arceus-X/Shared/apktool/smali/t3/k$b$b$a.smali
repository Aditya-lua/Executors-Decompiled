.class public final Lt3/k$b$b$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lt3/s;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lt3/k$b$b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lt3/s<",
        "TT;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0004*\u0001\u0000\u0008\n\u0018\u00002\u0008\u0012\u0004\u0012\u00028\u00000\u0001J4\u0010\u0006\u001a\u00028\u00002\"\u0010\u0005\u001a\u001e\u0008\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\u0008\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0002H\u0096@\u00a2\u0006\u0004\u0008\u0006\u0010\u0007\u00a8\u0006\u0008"
    }
    d2 = {
        "t3/k$b$b$a",
        "Lt3/s;",
        "Lkotlin/Function2;",
        "Lnt/b;",
        "",
        "transform",
        "a",
        "(Lkotlin/jvm/functions/Function2;Lnt/b;)Ljava/lang/Object;",
        "datastore-core_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field public final synthetic a:Luu/a;

.field public final synthetic b:Lkotlin/jvm/internal/y;

.field public final synthetic c:Lkotlin/jvm/internal/c0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/internal/c0<",
            "TT;>;"
        }
    .end annotation
.end field

.field public final synthetic d:Lt3/k;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lt3/k<",
            "TT;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Luu/a;Lkotlin/jvm/internal/y;Lkotlin/jvm/internal/c0;Lt3/k;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Luu/a;",
            "Lkotlin/jvm/internal/y;",
            "Lkotlin/jvm/internal/c0<",
            "TT;>;",
            "Lt3/k<",
            "TT;>;)V"
        }
    .end annotation

    iput-object p1, p0, Lt3/k$b$b$a;->a:Luu/a;

    iput-object p2, p0, Lt3/k$b$b$a;->b:Lkotlin/jvm/internal/y;

    iput-object p3, p0, Lt3/k$b$b$a;->c:Lkotlin/jvm/internal/c0;

    iput-object p4, p0, Lt3/k$b$b$a;->d:Lt3/k;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lkotlin/jvm/functions/Function2;Lnt/b;)Ljava/lang/Object;
    .locals 9
    .param p1    # Lkotlin/jvm/functions/Function2;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lnt/b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function2<",
            "-TT;-",
            "Lnt/b<",
            "-TT;>;+",
            "Ljava/lang/Object;",
            ">;",
            "Lnt/b<",
            "-TT;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    instance-of v0, p2, Lt3/k$b$b$a$a;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lt3/k$b$b$a$a;

    iget v1, v0, Lt3/k$b$b$a$a;->A:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lt3/k$b$b$a$a;->A:I

    goto :goto_0

    :cond_0
    new-instance v0, Lt3/k$b$b$a$a;

    invoke-direct {v0, p0, p2}, Lt3/k$b$b$a$a;-><init>(Lt3/k$b$b$a;Lnt/b;)V

    :goto_0
    iget-object p2, v0, Lt3/k$b$b$a$a;->y:Ljava/lang/Object;

    invoke-static {}, Lot/c;->e()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, Lt3/k$b$b$a$a;->A:I

    const/4 v3, 0x3

    const/4 v4, 0x2

    const/4 v5, 0x1

    const/4 v6, 0x0

    if-eqz v2, :cond_4

    if-eq v2, v5, :cond_3

    if-eq v2, v4, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, Lt3/k$b$b$a$a;->v:Ljava/lang/Object;

    iget-object v1, v0, Lt3/k$b$b$a$a;->u:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/internal/c0;

    iget-object v0, v0, Lt3/k$b$b$a$a;->t:Ljava/lang/Object;

    check-cast v0, Luu/a;

    :try_start_0
    invoke-static {p2}, Ljt/o;->b(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto/16 :goto_4

    :catchall_0
    move-exception p1

    goto/16 :goto_6

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget-object p1, v0, Lt3/k$b$b$a$a;->v:Ljava/lang/Object;

    check-cast p1, Lt3/k;

    iget-object v2, v0, Lt3/k$b$b$a$a;->u:Ljava/lang/Object;

    check-cast v2, Lkotlin/jvm/internal/c0;

    iget-object v4, v0, Lt3/k$b$b$a$a;->t:Ljava/lang/Object;

    check-cast v4, Luu/a;

    :try_start_1
    invoke-static {p2}, Ljt/o;->b(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_2

    :catchall_1
    move-exception p1

    move-object v0, v4

    goto/16 :goto_6

    :cond_3
    iget-object p1, v0, Lt3/k$b$b$a$a;->x:Ljava/lang/Object;

    check-cast p1, Lt3/k;

    iget-object v2, v0, Lt3/k$b$b$a$a;->w:Ljava/lang/Object;

    check-cast v2, Lkotlin/jvm/internal/c0;

    iget-object v5, v0, Lt3/k$b$b$a$a;->v:Ljava/lang/Object;

    check-cast v5, Lkotlin/jvm/internal/y;

    iget-object v7, v0, Lt3/k$b$b$a$a;->u:Ljava/lang/Object;

    check-cast v7, Luu/a;

    iget-object v8, v0, Lt3/k$b$b$a$a;->t:Ljava/lang/Object;

    check-cast v8, Lkotlin/jvm/functions/Function2;

    invoke-static {p2}, Ljt/o;->b(Ljava/lang/Object;)V

    move-object p2, v8

    move-object v8, p1

    move-object p1, p2

    move-object p2, v7

    goto :goto_1

    :cond_4
    invoke-static {p2}, Ljt/o;->b(Ljava/lang/Object;)V

    iget-object p2, p0, Lt3/k$b$b$a;->a:Luu/a;

    iget-object v2, p0, Lt3/k$b$b$a;->b:Lkotlin/jvm/internal/y;

    iget-object v7, p0, Lt3/k$b$b$a;->c:Lkotlin/jvm/internal/c0;

    iget-object v8, p0, Lt3/k$b$b$a;->d:Lt3/k;

    iput-object p1, v0, Lt3/k$b$b$a$a;->t:Ljava/lang/Object;

    iput-object p2, v0, Lt3/k$b$b$a$a;->u:Ljava/lang/Object;

    iput-object v2, v0, Lt3/k$b$b$a$a;->v:Ljava/lang/Object;

    iput-object v7, v0, Lt3/k$b$b$a$a;->w:Ljava/lang/Object;

    iput-object v8, v0, Lt3/k$b$b$a$a;->x:Ljava/lang/Object;

    iput v5, v0, Lt3/k$b$b$a$a;->A:I

    invoke-interface {p2, v6, v0}, Luu/a;->f(Ljava/lang/Object;Lnt/b;)Ljava/lang/Object;

    move-result-object v5

    if-ne v5, v1, :cond_5

    goto :goto_3

    :cond_5
    move-object v5, v2

    move-object v2, v7

    :goto_1
    :try_start_2
    iget-boolean v5, v5, Lkotlin/jvm/internal/y;->a:Z

    if-nez v5, :cond_9

    iget-object v5, v2, Lkotlin/jvm/internal/c0;->a:Ljava/lang/Object;

    iput-object p2, v0, Lt3/k$b$b$a$a;->t:Ljava/lang/Object;

    iput-object v2, v0, Lt3/k$b$b$a$a;->u:Ljava/lang/Object;

    iput-object v8, v0, Lt3/k$b$b$a$a;->v:Ljava/lang/Object;

    iput-object v6, v0, Lt3/k$b$b$a$a;->w:Ljava/lang/Object;

    iput-object v6, v0, Lt3/k$b$b$a$a;->x:Ljava/lang/Object;

    iput v4, v0, Lt3/k$b$b$a$a;->A:I

    invoke-interface {p1, v5, v0}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    if-ne p1, v1, :cond_6

    goto :goto_3

    :cond_6
    move-object v4, p2

    move-object p2, p1

    move-object p1, v8

    :goto_2
    :try_start_3
    iget-object v5, v2, Lkotlin/jvm/internal/c0;->a:Ljava/lang/Object;

    invoke-static {p2, v5}, Lkotlin/jvm/internal/Intrinsics;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_8

    iput-object v4, v0, Lt3/k$b$b$a$a;->t:Ljava/lang/Object;

    iput-object v2, v0, Lt3/k$b$b$a$a;->u:Ljava/lang/Object;

    iput-object p2, v0, Lt3/k$b$b$a$a;->v:Ljava/lang/Object;

    iput v3, v0, Lt3/k$b$b$a$a;->A:I

    const/4 v3, 0x0

    invoke-virtual {p1, p2, v3, v0}, Lt3/k;->B(Ljava/lang/Object;ZLnt/b;)Ljava/lang/Object;

    move-result-object p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    if-ne p1, v1, :cond_7

    :goto_3
    return-object v1

    :cond_7
    move-object p1, p2

    move-object v1, v2

    move-object v0, v4

    :goto_4
    :try_start_4
    iput-object p1, v1, Lkotlin/jvm/internal/c0;->a:Ljava/lang/Object;

    move-object v2, v1

    goto :goto_5

    :cond_8
    move-object v0, v4

    :goto_5
    iget-object p1, v2, Lkotlin/jvm/internal/c0;->a:Ljava/lang/Object;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    invoke-interface {v0, v6}, Luu/a;->e(Ljava/lang/Object;)V

    return-object p1

    :catchall_2
    move-exception p1

    move-object v0, p2

    goto :goto_6

    :cond_9
    :try_start_5
    const-string p1, "InitializerApi.updateData should not be called after initialization is complete."

    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    :goto_6
    invoke-interface {v0, v6}, Luu/a;->e(Ljava/lang/Object;)V

    throw p1
.end method
