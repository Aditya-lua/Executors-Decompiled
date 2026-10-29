.class public final Lan/s;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u0001\n\u0002\u0008\u0003\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0007\u00a2\u0006\u0004\u0008\u0004\u0010\u0005\u001a-\u0010\u000b\u001a\u00020\n*\u00020\u00062\u0014\u0010\t\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0008\u0012\u0004\u0012\u00020\u00030\u0007H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\u000b\u0010\u000c\u0082\u0002\u0004\n\u0002\u0008\u0019\u00a8\u0006\r"
    }
    d2 = {
        "Lan/r;",
        "Landroid/widget/EditText;",
        "view",
        "",
        "b",
        "(Lan/r;Landroid/widget/EditText;)V",
        "Landroid/widget/TextView;",
        "Lkotlin/Function1;",
        "",
        "handler",
        "",
        "c",
        "(Landroid/widget/TextView;Lkotlin/jvm/functions/Function1;Lnt/b;)Ljava/lang/Object;",
        "wf1-core-android"
    }
    k = 0x2
    mv = {
        0x1,
        0x6,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public static final synthetic a(Landroid/widget/TextView;Lkotlin/jvm/functions/Function1;Lnt/b;)Ljava/lang/Object;
    .locals 0

    invoke-static {p0, p1, p2}, Lan/s;->c(Landroid/widget/TextView;Lkotlin/jvm/functions/Function1;Lnt/b;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final b(Lan/r;Landroid/widget/EditText;)V
    .locals 4
    .param p0    # Lan/r;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p1    # Landroid/widget/EditText;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    sget v0, Lan/o;->a:I

    invoke-virtual {p1, v0}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    move-result-object v1

    instance-of v2, v1, Lan/v;

    const/4 v3, 0x0

    if-eqz v2, :cond_0

    check-cast v1, Lan/v;

    goto :goto_0

    :cond_0
    move-object v1, v3

    :goto_0
    if-nez v1, :cond_1

    move-object v2, v3

    goto :goto_1

    :cond_1
    invoke-virtual {v1}, Lan/v;->a()Lan/r;

    move-result-object v2

    :goto_1
    if-ne v2, p0, :cond_2

    invoke-virtual {v1}, Lan/v;->b()Lku/d2;

    move-result-object v2

    invoke-interface {v2}, Lku/d2;->b()Z

    move-result v2

    if-eqz v2, :cond_2

    return-void

    :cond_2
    const/4 v2, 0x1

    if-nez v1, :cond_3

    goto :goto_2

    :cond_3
    invoke-virtual {v1}, Lan/v;->b()Lku/d2;

    move-result-object v1

    if-nez v1, :cond_4

    goto :goto_2

    :cond_4
    invoke-static {v1, v3, v2, v3}, Lku/d2$a;->a(Lku/d2;Ljava/util/concurrent/CancellationException;ILjava/lang/Object;)V

    :goto_2
    invoke-interface {p0}, Lan/r;->b()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    new-instance v1, Lan/s$a;

    invoke-direct {v1, p0, p1, v3}, Lan/s$a;-><init>(Lan/r;Landroid/widget/EditText;Lnt/b;)V

    invoke-static {p1, v3, v1, v2, v3}, Lan/b0;->c(Landroid/view/View;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lku/d2;

    move-result-object v1

    new-instance v2, Lan/v;

    invoke-direct {v2, p0, v1}, Lan/v;-><init>(Lan/r;Lku/d2;)V

    invoke-virtual {p1, v0, v2}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    return-void
.end method

.method public static final c(Landroid/widget/TextView;Lkotlin/jvm/functions/Function1;Lnt/b;)Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/widget/TextView;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Ljava/lang/CharSequence;",
            "Lkotlin/Unit;",
            ">;",
            "Lnt/b<",
            "*>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p2, Lan/s$b;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lan/s$b;

    iget v1, v0, Lan/s$b;->w:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lan/s$b;->w:I

    goto :goto_0

    :cond_0
    new-instance v0, Lan/s$b;

    invoke-direct {v0, p2}, Lan/s$b;-><init>(Lnt/b;)V

    :goto_0
    iget-object p2, v0, Lan/s$b;->v:Ljava/lang/Object;

    invoke-static {}, Lot/c;->e()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, Lan/s$b;->w:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-eq v2, v3, :cond_1

    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_1
    iget-object p0, v0, Lan/s$b;->u:Ljava/lang/Object;

    check-cast p0, Lkotlin/jvm/functions/Function1;

    iget-object p0, v0, Lan/s$b;->t:Ljava/lang/Object;

    check-cast p0, Landroid/widget/TextView;

    invoke-static {p2}, Ljt/o;->b(Ljava/lang/Object;)V

    goto :goto_1

    :cond_2
    invoke-static {p2}, Ljt/o;->b(Ljava/lang/Object;)V

    iput-object p0, v0, Lan/s$b;->t:Ljava/lang/Object;

    iput-object p1, v0, Lan/s$b;->u:Ljava/lang/Object;

    iput v3, v0, Lan/s$b;->w:I

    new-instance p2, Lku/p;

    invoke-static {v0}, Lot/b;->c(Lnt/b;)Lnt/b;

    move-result-object v2

    invoke-direct {p2, v2, v3}, Lku/p;-><init>(Lnt/b;I)V

    invoke-virtual {p2}, Lku/p;->H()V

    new-instance v2, Lan/s$d;

    invoke-direct {v2, p1}, Lan/s$d;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p0, v2}, Landroid/widget/TextView;->addTextChangedListener(Landroid/text/TextWatcher;)V

    new-instance p1, Lan/s$c;

    invoke-direct {p1, p0, v2}, Lan/s$c;-><init>(Landroid/widget/TextView;Lan/s$d;)V

    invoke-interface {p2, p1}, Lku/n;->n(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p2}, Lku/p;->A()Ljava/lang/Object;

    move-result-object p0

    invoke-static {}, Lot/c;->e()Ljava/lang/Object;

    move-result-object p1

    if-ne p0, p1, :cond_3

    invoke-static {v0}, Lpt/h;->c(Lnt/b;)V

    :cond_3
    if-ne p0, v1, :cond_4

    return-object v1

    :cond_4
    :goto_1
    new-instance p0, Ljt/d;

    invoke-direct {p0}, Ljt/d;-><init>()V

    throw p0
.end method
