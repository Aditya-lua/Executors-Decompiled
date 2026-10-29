.class public final Lhr/j$a$a;
.super Lpt/m;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lhr/j$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lpt/m;",
        "Lkotlin/jvm/functions/Function2<",
        "Lku/p0;",
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
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0002\u0010\u0003"
    }
    d2 = {
        "Lku/p0;",
        "",
        "<anonymous>",
        "(Lku/p0;)V"
    }
    k = 0x3
    mv = {
        0x2,
        0x2,
        0x0
    }
.end annotation

.annotation runtime Lpt/f;
    c = "com.withpersona.sdk2.inquiry.steps.ui.inputSelect.InputSelectBottomSheetController$runAfterKeyboardShown$1$1"
    f = "InputSelectBottomSheetController.kt"
    l = {
        0x128,
        0xc6
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field public t:Ljava/lang/Object;

.field public u:I

.field public v:I

.field public final synthetic w:Lku/a0;

.field public final synthetic x:Lhr/j;

.field public final synthetic y:Lkotlin/jvm/functions/Function0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lku/a0;Lhr/j;Lkotlin/jvm/functions/Function0;Lnt/b;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lku/a0;",
            "Lhr/j;",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;",
            "Lnt/b<",
            "-",
            "Lhr/j$a$a;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lhr/j$a$a;->w:Lku/a0;

    iput-object p2, p0, Lhr/j$a$a;->x:Lhr/j;

    iput-object p3, p0, Lhr/j$a$a;->y:Lkotlin/jvm/functions/Function0;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, Lpt/m;-><init>(ILnt/b;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lnt/b;)Lnt/b;
    .locals 3
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

    new-instance p1, Lhr/j$a$a;

    iget-object v0, p0, Lhr/j$a$a;->w:Lku/a0;

    iget-object v1, p0, Lhr/j$a$a;->x:Lhr/j;

    iget-object v2, p0, Lhr/j$a$a;->y:Lkotlin/jvm/functions/Function0;

    invoke-direct {p1, v0, v1, v2, p2}, Lhr/j$a$a;-><init>(Lku/a0;Lhr/j;Lkotlin/jvm/functions/Function0;Lnt/b;)V

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lku/p0;

    check-cast p2, Lnt/b;

    invoke-virtual {p0, p1, p2}, Lhr/j$a$a;->invoke(Lku/p0;Lnt/b;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lku/p0;Lnt/b;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lku/p0;",
            "Lnt/b<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 2
    invoke-virtual {p0, p1, p2}, Lhr/j$a$a;->create(Ljava/lang/Object;Lnt/b;)Lnt/b;

    move-result-object p1

    check-cast p1, Lhr/j$a$a;

    sget-object p2, Lkotlin/Unit;->a:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lhr/j$a$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    invoke-static {}, Lot/c;->e()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Lhr/j$a$a;->v:I

    const/4 v2, 0x2

    const/4 v3, 0x0

    const/4 v4, 0x1

    if-eqz v1, :cond_2

    if-eq v1, v4, :cond_1

    if-ne v1, v2, :cond_0

    invoke-static {p1}, Ljt/o;->b(Ljava/lang/Object;)V

    goto :goto_2

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    iget-object v1, p0, Lhr/j$a$a;->t:Ljava/lang/Object;

    check-cast v1, Lhr/j;

    invoke-static {p1}, Ljt/o;->b(Ljava/lang/Object;)V

    goto :goto_0

    :cond_2
    invoke-static {p1}, Ljt/o;->b(Ljava/lang/Object;)V

    iget-object p1, p0, Lhr/j$a$a;->x:Lhr/j;

    iput-object p1, p0, Lhr/j$a$a;->t:Ljava/lang/Object;

    const/4 v1, 0x0

    iput v1, p0, Lhr/j$a$a;->u:I

    iput v4, p0, Lhr/j$a$a;->v:I

    new-instance v1, Lku/p;

    invoke-static {p0}, Lot/b;->c(Lnt/b;)Lnt/b;

    move-result-object v5

    invoke-direct {v1, v5, v4}, Lku/p;-><init>(Lnt/b;I)V

    invoke-virtual {v1}, Lku/p;->H()V

    new-instance v5, Lkotlin/jvm/internal/y;

    invoke-direct {v5}, Lkotlin/jvm/internal/y;-><init>()V

    invoke-static {p1}, Lhr/j;->j(Lhr/j;)Lgr/a;

    move-result-object p1

    invoke-virtual {p1}, Lgr/a;->b()Landroid/widget/FrameLayout;

    move-result-object p1

    const-string v6, "getRoot(...)"

    invoke-static {p1, v6}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v6, Lhr/j$a$a$a;

    invoke-direct {v6, v5, v1}, Lhr/j$a$a$a;-><init>(Lkotlin/jvm/internal/y;Lku/n;)V

    invoke-static {p1, v6}, Lwq/g;->g(Landroid/view/View;Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v1}, Lku/p;->A()Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, Lot/c;->e()Ljava/lang/Object;

    move-result-object v1

    if-ne p1, v1, :cond_3

    invoke-static {p0}, Lpt/h;->c(Lnt/b;)V

    :cond_3
    if-ne p1, v0, :cond_4

    goto :goto_1

    :cond_4
    :goto_0
    invoke-static {}, Lku/g1;->c()Lku/n2;

    move-result-object p1

    new-instance v1, Lhr/j$a$a$b;

    iget-object v5, p0, Lhr/j$a$a;->y:Lkotlin/jvm/functions/Function0;

    invoke-direct {v1, v5, v3}, Lhr/j$a$a$b;-><init>(Lkotlin/jvm/functions/Function0;Lnt/b;)V

    iput-object v3, p0, Lhr/j$a$a;->t:Ljava/lang/Object;

    iput v2, p0, Lhr/j$a$a;->v:I

    invoke-static {p1, v1, p0}, Lku/i;->g(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;Lnt/b;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_5

    :goto_1
    return-object v0

    :cond_5
    :goto_2
    iget-object p1, p0, Lhr/j$a$a;->w:Lku/a0;

    invoke-static {p1, v3, v4, v3}, Lku/d2$a;->a(Lku/d2;Ljava/util/concurrent/CancellationException;ILjava/lang/Object;)V

    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p1
.end method
