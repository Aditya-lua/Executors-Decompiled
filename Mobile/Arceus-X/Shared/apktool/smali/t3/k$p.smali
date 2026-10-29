.class public final Lt3/k$p;
.super Lpt/m;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lt3/k;->y(ZLnt/b;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lpt/m;",
        "Lkotlin/jvm/functions/Function1<",
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
        "\u0000\u0008\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\u0004\u0008\u0000\u0010\u0002H\u008a@"
    }
    d2 = {
        "<anonymous>",
        "",
        "T"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation

.annotation runtime Lpt/f;
    c = "androidx.datastore.core.DataStoreImpl$readDataOrHandleCorruption$3"
    f = "DataStoreImpl.kt"
    l = {
        0x183,
        0x184,
        0x186
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field public t:Ljava/lang/Object;

.field public u:I

.field public final synthetic v:Lkotlin/jvm/internal/c0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/internal/c0<",
            "TT;>;"
        }
    .end annotation
.end field

.field public final synthetic w:Lt3/k;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lt3/k<",
            "TT;>;"
        }
    .end annotation
.end field

.field public final synthetic x:Lkotlin/jvm/internal/a0;


# direct methods
.method public constructor <init>(Lkotlin/jvm/internal/c0;Lt3/k;Lkotlin/jvm/internal/a0;Lnt/b;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/internal/c0<",
            "TT;>;",
            "Lt3/k<",
            "TT;>;",
            "Lkotlin/jvm/internal/a0;",
            "Lnt/b<",
            "-",
            "Lt3/k$p;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lt3/k$p;->v:Lkotlin/jvm/internal/c0;

    iput-object p2, p0, Lt3/k$p;->w:Lt3/k;

    iput-object p3, p0, Lt3/k$p;->x:Lkotlin/jvm/internal/a0;

    const/4 p1, 0x1

    invoke-direct {p0, p1, p4}, Lpt/m;-><init>(ILnt/b;)V

    return-void
.end method


# virtual methods
.method public final create(Lnt/b;)Lnt/b;
    .locals 4
    .param p1    # Lnt/b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnt/b<",
            "*>;)",
            "Lnt/b<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    new-instance v0, Lt3/k$p;

    iget-object v1, p0, Lt3/k$p;->v:Lkotlin/jvm/internal/c0;

    iget-object v2, p0, Lt3/k$p;->w:Lt3/k;

    iget-object v3, p0, Lt3/k$p;->x:Lkotlin/jvm/internal/a0;

    invoke-direct {v0, v1, v2, v3, p1}, Lt3/k$p;-><init>(Lkotlin/jvm/internal/c0;Lt3/k;Lkotlin/jvm/internal/a0;Lnt/b;)V

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lnt/b;

    invoke-virtual {p0, p1}, Lt3/k$p;->q(Lnt/b;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5
    .param p1    # Ljava/lang/Object;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    invoke-static {}, Lot/c;->e()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Lt3/k$p;->u:I

    const/4 v2, 0x3

    const/4 v3, 0x2

    const/4 v4, 0x1

    if-eqz v1, :cond_3

    if-eq v1, v4, :cond_2

    if-eq v1, v3, :cond_1

    if-ne v1, v2, :cond_0

    iget-object v0, p0, Lt3/k$p;->t:Ljava/lang/Object;

    check-cast v0, Lkotlin/jvm/internal/a0;

    invoke-static {p1}, Ljt/o;->b(Ljava/lang/Object;)V

    goto :goto_3

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    iget-object v1, p0, Lt3/k$p;->t:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/internal/a0;

    :try_start_0
    invoke-static {p1}, Ljt/o;->b(Ljava/lang/Object;)V
    :try_end_0
    .catch Lt3/d; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :cond_2
    iget-object v1, p0, Lt3/k$p;->t:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/internal/c0;

    :try_start_1
    invoke-static {p1}, Ljt/o;->b(Ljava/lang/Object;)V
    :try_end_1
    .catch Lt3/d; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_0

    :cond_3
    invoke-static {p1}, Ljt/o;->b(Ljava/lang/Object;)V

    :try_start_2
    iget-object v1, p0, Lt3/k$p;->v:Lkotlin/jvm/internal/c0;

    iget-object p1, p0, Lt3/k$p;->w:Lt3/k;

    iput-object v1, p0, Lt3/k$p;->t:Ljava/lang/Object;

    iput v4, p0, Lt3/k$p;->u:I

    invoke-static {p1, p0}, Lt3/k;->m(Lt3/k;Lnt/b;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_4

    goto :goto_2

    :cond_4
    :goto_0
    iput-object p1, v1, Lkotlin/jvm/internal/c0;->a:Ljava/lang/Object;

    iget-object v1, p0, Lt3/k$p;->x:Lkotlin/jvm/internal/a0;

    iget-object p1, p0, Lt3/k$p;->w:Lt3/k;

    invoke-static {p1}, Lt3/k;->c(Lt3/k;)Lt3/t;

    move-result-object p1

    iput-object v1, p0, Lt3/k$p;->t:Ljava/lang/Object;

    iput v3, p0, Lt3/k$p;->u:I

    invoke-interface {p1, p0}, Lt3/t;->c(Lnt/b;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_5

    goto :goto_2

    :cond_5
    :goto_1
    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result p1

    iput p1, v1, Lkotlin/jvm/internal/a0;->a:I
    :try_end_2
    .catch Lt3/d; {:try_start_2 .. :try_end_2} :catch_0

    goto :goto_4

    :catch_0
    iget-object p1, p0, Lt3/k$p;->x:Lkotlin/jvm/internal/a0;

    iget-object v1, p0, Lt3/k$p;->w:Lt3/k;

    iget-object v3, p0, Lt3/k$p;->v:Lkotlin/jvm/internal/c0;

    iget-object v3, v3, Lkotlin/jvm/internal/c0;->a:Ljava/lang/Object;

    iput-object p1, p0, Lt3/k$p;->t:Ljava/lang/Object;

    iput v2, p0, Lt3/k$p;->u:I

    invoke-virtual {v1, v3, v4, p0}, Lt3/k;->B(Ljava/lang/Object;ZLnt/b;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v0, :cond_6

    :goto_2
    return-object v0

    :cond_6
    move-object v0, p1

    move-object p1, v1

    :goto_3
    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result p1

    iput p1, v0, Lkotlin/jvm/internal/a0;->a:I

    :goto_4
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p1
.end method

.method public final q(Lnt/b;)Ljava/lang/Object;
    .locals 1
    .param p1    # Lnt/b;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnt/b<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    invoke-virtual {p0, p1}, Lt3/k$p;->create(Lnt/b;)Lnt/b;

    move-result-object p1

    check-cast p1, Lt3/k$p;

    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    invoke-virtual {p1, v0}, Lt3/k$p;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
