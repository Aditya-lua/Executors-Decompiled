.class public final Lu3/k$b;
.super Lu3/z;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lu3/k;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "b"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0002\u0008\t\u0008\u0082\u0004\u0018\u00002\u00020\u0001B7\u0012.\u0010\u0008\u001a*\u0012&\u0012$\u0008\u0001\u0012\n\u0012\u0008\u0012\u0004\u0012\u00028\u00000\u0004\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00030\u0002\u00a2\u0006\u0004\u0008\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0006H\u0094@\u00a2\u0006\u0004\u0008\u000b\u0010\u000cR@\u0010\u000f\u001a,\u0012&\u0012$\u0008\u0001\u0012\n\u0012\u0008\u0012\u0004\u0012\u00028\u00000\u0004\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0003\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\r\u0010\u000e\u00a8\u0006\u0010"
    }
    d2 = {
        "Lu3/k$b;",
        "Lu3/z;",
        "",
        "Lkotlin/Function2;",
        "Lu3/s;",
        "Leu/b;",
        "",
        "",
        "initTasksList",
        "<init>",
        "(Lu3/k;Ljava/util/List;)V",
        "b",
        "(Leu/b;)Ljava/lang/Object;",
        "c",
        "Ljava/util/List;",
        "initTasks",
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
.field public c:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "+",
            "Lkotlin/jvm/functions/Function2<",
            "-",
            "Lu3/s<",
            "TT;>;-",
            "Leu/b<",
            "-",
            "Lkotlin/Unit;",
            ">;+",
            "Ljava/lang/Object;",
            ">;>;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field public final synthetic d:Lu3/k;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lu3/k<",
            "TT;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lu3/k;Ljava/util/List;)V
    .locals 1
    .param p1    # Lu3/k;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Lkotlin/jvm/functions/Function2<",
            "-",
            "Lu3/s<",
            "TT;>;-",
            "Leu/b<",
            "-",
            "Lkotlin/Unit;",
            ">;+",
            "Ljava/lang/Object;",
            ">;>;)V"
        }
    .end annotation

    const-string v0, "initTasksList"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lu3/k$b;->d:Lu3/k;

    invoke-direct {p0}, Lu3/z;-><init>()V

    check-cast p2, Ljava/lang/Iterable;

    invoke-static {p2}, Lkotlin/collections/CollectionsKt;->M0(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, Lu3/k$b;->c:Ljava/util/List;

    return-void
.end method

.method public static final synthetic d(Lu3/k$b;)Ljava/util/List;
    .locals 0

    iget-object p0, p0, Lu3/k$b;->c:Ljava/util/List;

    return-object p0
.end method

.method public static final synthetic e(Lu3/k$b;Ljava/util/List;)V
    .locals 0

    iput-object p1, p0, Lu3/k$b;->c:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public b(Leu/b;)Ljava/lang/Object;
    .locals 6
    .param p1    # Leu/b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Leu/b<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    instance-of v0, p1, Lu3/k$b$a;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lu3/k$b$a;

    iget v1, v0, Lu3/k$b$a;->w:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lu3/k$b$a;->w:I

    goto :goto_0

    :cond_0
    new-instance v0, Lu3/k$b$a;

    invoke-direct {v0, p0, p1}, Lu3/k$b$a;-><init>(Lu3/k$b;Leu/b;)V

    :goto_0
    iget-object p1, v0, Lu3/k$b$a;->u:Ljava/lang/Object;

    invoke-static {}, Lfu/c;->e()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, Lu3/k$b$a;->w:I

    const/4 v3, 0x2

    const/4 v4, 0x1

    if-eqz v2, :cond_3

    if-eq v2, v4, :cond_2

    if-ne v2, v3, :cond_1

    iget-object v0, v0, Lu3/k$b$a;->t:Ljava/lang/Object;

    check-cast v0, Lu3/k$b;

    invoke-static {p1}, Lzt/o;->b(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget-object v0, v0, Lu3/k$b$a;->t:Ljava/lang/Object;

    check-cast v0, Lu3/k$b;

    invoke-static {p1}, Lzt/o;->b(Ljava/lang/Object;)V

    goto :goto_4

    :cond_3
    invoke-static {p1}, Lzt/o;->b(Ljava/lang/Object;)V

    iget-object p1, p0, Lu3/k$b;->c:Ljava/util/List;

    if-eqz p1, :cond_6

    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_4

    goto :goto_2

    :cond_4
    iget-object p1, p0, Lu3/k$b;->d:Lu3/k;

    invoke-static {p1}, Lu3/k;->c(Lu3/k;)Lu3/t;

    move-result-object p1

    new-instance v2, Lu3/k$b$b;

    iget-object v4, p0, Lu3/k$b;->d:Lu3/k;

    const/4 v5, 0x0

    invoke-direct {v2, v4, p0, v5}, Lu3/k$b$b;-><init>(Lu3/k;Lu3/k$b;Leu/b;)V

    iput-object p0, v0, Lu3/k$b$a;->t:Ljava/lang/Object;

    iput v3, v0, Lu3/k$b$a;->w:I

    invoke-interface {p1, v2, v0}, Lu3/t;->e(Lkotlin/jvm/functions/Function1;Leu/b;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_5

    goto :goto_3

    :cond_5
    move-object v0, p0

    :goto_1
    check-cast p1, Lu3/f;

    goto :goto_5

    :cond_6
    :goto_2
    iget-object p1, p0, Lu3/k$b;->d:Lu3/k;

    iput-object p0, v0, Lu3/k$b$a;->t:Ljava/lang/Object;

    iput v4, v0, Lu3/k$b$a;->w:I

    const/4 v2, 0x0

    invoke-static {p1, v2, v0}, Lu3/k;->n(Lu3/k;ZLeu/b;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_7

    :goto_3
    return-object v1

    :cond_7
    move-object v0, p0

    :goto_4
    check-cast p1, Lu3/f;

    :goto_5
    iget-object v0, v0, Lu3/k$b;->d:Lu3/k;

    invoke-static {v0}, Lu3/k;->d(Lu3/k;)Lu3/l;

    move-result-object v0

    invoke-virtual {v0, p1}, Lu3/l;->c(Lu3/d0;)Lu3/d0;

    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p1
.end method
