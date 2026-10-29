.class public final Lt3/k$y;
.super Lpt/m;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lt3/k;->B(Ljava/lang/Object;ZLnt/b;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lpt/m;",
        "Lkotlin/jvm/functions/Function2<",
        "Lt3/k0<",
        "TT;>;",
        "Lnt/b<",
        "-",
        "Lkotlin/Unit;",
        ">;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\u0008\u0000\u0010\u0000*\u0008\u0012\u0004\u0012\u00028\u00000\u0001H\u008a@\u00a2\u0006\u0004\u0008\u0003\u0010\u0004"
    }
    d2 = {
        "T",
        "Lt3/k0;",
        "",
        "<anonymous>",
        "(Lt3/k0;)V"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation

.annotation runtime Lpt/f;
    c = "androidx.datastore.core.DataStoreImpl$writeData$2"
    f = "DataStoreImpl.kt"
    l = {
        0x160,
        0x161
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field public t:Ljava/lang/Object;

.field public u:I

.field public synthetic v:Ljava/lang/Object;

.field public final synthetic w:Lkotlin/jvm/internal/a0;

.field public final synthetic x:Lt3/k;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lt3/k<",
            "TT;>;"
        }
    .end annotation
.end field

.field public final synthetic y:Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TT;"
        }
    .end annotation
.end field

.field public final synthetic z:Z


# direct methods
.method public constructor <init>(Lkotlin/jvm/internal/a0;Lt3/k;Ljava/lang/Object;ZLnt/b;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/internal/a0;",
            "Lt3/k<",
            "TT;>;TT;Z",
            "Lnt/b<",
            "-",
            "Lt3/k$y;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lt3/k$y;->w:Lkotlin/jvm/internal/a0;

    iput-object p2, p0, Lt3/k$y;->x:Lt3/k;

    iput-object p3, p0, Lt3/k$y;->y:Ljava/lang/Object;

    iput-boolean p4, p0, Lt3/k$y;->z:Z

    const/4 p1, 0x2

    invoke-direct {p0, p1, p5}, Lpt/m;-><init>(ILnt/b;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lnt/b;)Lnt/b;
    .locals 6
    .param p1    # Ljava/lang/Object;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p2    # Lnt/b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Lnt/b<",
            "*>;)",
            "Lnt/b<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    new-instance v0, Lt3/k$y;

    iget-object v1, p0, Lt3/k$y;->w:Lkotlin/jvm/internal/a0;

    iget-object v2, p0, Lt3/k$y;->x:Lt3/k;

    iget-object v3, p0, Lt3/k$y;->y:Ljava/lang/Object;

    iget-boolean v4, p0, Lt3/k$y;->z:Z

    move-object v5, p2

    invoke-direct/range {v0 .. v5}, Lt3/k$y;-><init>(Lkotlin/jvm/internal/a0;Lt3/k;Ljava/lang/Object;ZLnt/b;)V

    iput-object p1, v0, Lt3/k$y;->v:Ljava/lang/Object;

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lt3/k0;

    check-cast p2, Lnt/b;

    invoke-virtual {p0, p1, p2}, Lt3/k$y;->q(Lt3/k0;Lnt/b;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6
    .param p1    # Ljava/lang/Object;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    invoke-static {}, Lot/c;->e()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Lt3/k$y;->u:I

    const/4 v2, 0x2

    const/4 v3, 0x1

    if-eqz v1, :cond_2

    if-eq v1, v3, :cond_1

    if-ne v1, v2, :cond_0

    invoke-static {p1}, Ljt/o;->b(Ljava/lang/Object;)V

    goto :goto_2

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    iget-object v1, p0, Lt3/k$y;->t:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/internal/a0;

    iget-object v3, p0, Lt3/k$y;->v:Ljava/lang/Object;

    check-cast v3, Lt3/k0;

    invoke-static {p1}, Ljt/o;->b(Ljava/lang/Object;)V

    goto :goto_0

    :cond_2
    invoke-static {p1}, Ljt/o;->b(Ljava/lang/Object;)V

    iget-object p1, p0, Lt3/k$y;->v:Ljava/lang/Object;

    check-cast p1, Lt3/k0;

    iget-object v1, p0, Lt3/k$y;->w:Lkotlin/jvm/internal/a0;

    iget-object v4, p0, Lt3/k$y;->x:Lt3/k;

    invoke-static {v4}, Lt3/k;->c(Lt3/k;)Lt3/t;

    move-result-object v4

    iput-object p1, p0, Lt3/k$y;->v:Ljava/lang/Object;

    iput-object v1, p0, Lt3/k$y;->t:Ljava/lang/Object;

    iput v3, p0, Lt3/k$y;->u:I

    invoke-interface {v4, p0}, Lt3/t;->e(Lnt/b;)Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v0, :cond_3

    goto :goto_1

    :cond_3
    move-object v5, v3

    move-object v3, p1

    move-object p1, v5

    :goto_0
    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result p1

    iput p1, v1, Lkotlin/jvm/internal/a0;->a:I

    iget-object p1, p0, Lt3/k$y;->y:Ljava/lang/Object;

    const/4 v1, 0x0

    iput-object v1, p0, Lt3/k$y;->v:Ljava/lang/Object;

    iput-object v1, p0, Lt3/k$y;->t:Ljava/lang/Object;

    iput v2, p0, Lt3/k$y;->u:I

    invoke-interface {v3, p1, p0}, Lt3/k0;->b(Ljava/lang/Object;Lnt/b;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_4

    :goto_1
    return-object v0

    :cond_4
    :goto_2
    iget-boolean p1, p0, Lt3/k$y;->z:Z

    if-eqz p1, :cond_6

    iget-object p1, p0, Lt3/k$y;->x:Lt3/k;

    invoke-static {p1}, Lt3/k;->d(Lt3/k;)Lt3/l;

    move-result-object p1

    new-instance v0, Lt3/f;

    iget-object v1, p0, Lt3/k$y;->y:Ljava/lang/Object;

    if-eqz v1, :cond_5

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v2

    goto :goto_3

    :cond_5
    const/4 v2, 0x0

    :goto_3
    iget-object v3, p0, Lt3/k$y;->w:Lkotlin/jvm/internal/a0;

    iget v3, v3, Lkotlin/jvm/internal/a0;->a:I

    invoke-direct {v0, v1, v2, v3}, Lt3/f;-><init>(Ljava/lang/Object;II)V

    invoke-virtual {p1, v0}, Lt3/l;->c(Lt3/d0;)Lt3/d0;

    :cond_6
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p1
.end method

.method public final q(Lt3/k0;Lnt/b;)Ljava/lang/Object;
    .locals 0
    .param p1    # Lt3/k0;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lnt/b;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lt3/k0<",
            "TT;>;",
            "Lnt/b<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    invoke-virtual {p0, p1, p2}, Lt3/k$y;->create(Ljava/lang/Object;Lnt/b;)Lnt/b;

    move-result-object p1

    check-cast p1, Lt3/k$y;

    sget-object p2, Lkotlin/Unit;->a:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lt3/k$y;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
