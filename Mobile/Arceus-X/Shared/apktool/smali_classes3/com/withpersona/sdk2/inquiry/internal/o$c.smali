.class public final Lcom/withpersona/sdk2/inquiry/internal/o$c;
.super Lpt/m;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/withpersona/sdk2/inquiry/internal/o;->run()Lnu/h;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lpt/m;",
        "Lkotlin/jvm/functions/Function2<",
        "Lnu/i<",
        "-",
        "Lcom/withpersona/sdk2/inquiry/internal/o$b;",
        ">;",
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
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0010\u0003\u001a\u00020\u0002*\u0008\u0012\u0004\u0012\u00020\u00010\u0000H\n\u00a2\u0006\u0004\u0008\u0003\u0010\u0004"
    }
    d2 = {
        "Lnu/i;",
        "Lcom/withpersona/sdk2/inquiry/internal/o$b;",
        "",
        "<anonymous>",
        "(Lnu/i;)V"
    }
    k = 0x3
    mv = {
        0x2,
        0x2,
        0x0
    }
.end annotation

.annotation runtime Lpt/f;
    c = "com.withpersona.sdk2.inquiry.internal.RestoreUiStepStateWorker$run$1"
    f = "RestoreUiStepStateWorker.kt"
    l = {
        0x21,
        0x28,
        0x2a
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field public t:Ljava/lang/Object;

.field public u:I

.field public synthetic v:Ljava/lang/Object;

.field public final synthetic w:Lcom/withpersona/sdk2/inquiry/internal/o;


# direct methods
.method public constructor <init>(Lcom/withpersona/sdk2/inquiry/internal/o;Lnt/b;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/withpersona/sdk2/inquiry/internal/o;",
            "Lnt/b<",
            "-",
            "Lcom/withpersona/sdk2/inquiry/internal/o$c;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/internal/o$c;->w:Lcom/withpersona/sdk2/inquiry/internal/o;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Lpt/m;-><init>(ILnt/b;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lnt/b;)Lnt/b;
    .locals 2
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

    new-instance v0, Lcom/withpersona/sdk2/inquiry/internal/o$c;

    iget-object v1, p0, Lcom/withpersona/sdk2/inquiry/internal/o$c;->w:Lcom/withpersona/sdk2/inquiry/internal/o;

    invoke-direct {v0, v1, p2}, Lcom/withpersona/sdk2/inquiry/internal/o$c;-><init>(Lcom/withpersona/sdk2/inquiry/internal/o;Lnt/b;)V

    iput-object p1, v0, Lcom/withpersona/sdk2/inquiry/internal/o$c;->v:Ljava/lang/Object;

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lnu/i;

    check-cast p2, Lnt/b;

    invoke-virtual {p0, p1, p2}, Lcom/withpersona/sdk2/inquiry/internal/o$c;->q(Lnu/i;Lnt/b;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/internal/o$c;->v:Ljava/lang/Object;

    check-cast v0, Lnu/i;

    invoke-static {}, Lot/c;->e()Ljava/lang/Object;

    move-result-object v1

    iget v2, p0, Lcom/withpersona/sdk2/inquiry/internal/o$c;->u:I

    const/4 v3, 0x3

    const/4 v4, 0x2

    const/4 v5, 0x1

    if-eqz v2, :cond_3

    if-eq v2, v5, :cond_2

    if-eq v2, v4, :cond_1

    if-ne v2, v3, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/internal/o$c;->t:Ljava/lang/Object;

    check-cast v0, Ljava/util/List;

    invoke-static {p1}, Ljt/o;->b(Ljava/lang/Object;)V

    goto :goto_3

    :cond_2
    invoke-static {p1}, Ljt/o;->b(Ljava/lang/Object;)V

    goto :goto_1

    :cond_3
    invoke-static {p1}, Ljt/o;->b(Ljava/lang/Object;)V

    iget-object p1, p0, Lcom/withpersona/sdk2/inquiry/internal/o$c;->w:Lcom/withpersona/sdk2/inquiry/internal/o;

    invoke-static {p1}, Lcom/withpersona/sdk2/inquiry/internal/o;->f(Lcom/withpersona/sdk2/inquiry/internal/o;)Lcom/withpersona/sdk2/inquiry/internal/UiStepSavedStateHelper;

    move-result-object p1

    iget-object v2, p0, Lcom/withpersona/sdk2/inquiry/internal/o$c;->w:Lcom/withpersona/sdk2/inquiry/internal/o;

    invoke-static {v2}, Lcom/withpersona/sdk2/inquiry/internal/o;->d(Lcom/withpersona/sdk2/inquiry/internal/o;)Ljava/lang/String;

    move-result-object v2

    iget-object v6, p0, Lcom/withpersona/sdk2/inquiry/internal/o$c;->w:Lcom/withpersona/sdk2/inquiry/internal/o;

    invoke-static {v6}, Lcom/withpersona/sdk2/inquiry/internal/o;->b(Lcom/withpersona/sdk2/inquiry/internal/o;)Ljava/lang/String;

    move-result-object v6

    iget-object v7, p0, Lcom/withpersona/sdk2/inquiry/internal/o$c;->w:Lcom/withpersona/sdk2/inquiry/internal/o;

    invoke-static {v7}, Lcom/withpersona/sdk2/inquiry/internal/o;->e(Lcom/withpersona/sdk2/inquiry/internal/o;)Ljava/lang/String;

    move-result-object v7

    iput-object v0, p0, Lcom/withpersona/sdk2/inquiry/internal/o$c;->v:Ljava/lang/Object;

    iput v5, p0, Lcom/withpersona/sdk2/inquiry/internal/o$c;->u:I

    invoke-virtual {p1, v2, v6, v7, p0}, Lcom/withpersona/sdk2/inquiry/internal/UiStepSavedStateHelper;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lnt/b;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_4

    goto :goto_2

    :cond_4
    :goto_1
    check-cast p1, Ljava/util/List;

    if-eqz p1, :cond_5

    new-instance v2, Lcom/withpersona/sdk2/inquiry/internal/o$b$b;

    invoke-direct {v2, p1}, Lcom/withpersona/sdk2/inquiry/internal/o$b$b;-><init>(Ljava/util/List;)V

    invoke-static {v0}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    iput-object v3, p0, Lcom/withpersona/sdk2/inquiry/internal/o$c;->v:Ljava/lang/Object;

    invoke-static {p1}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/internal/o$c;->t:Ljava/lang/Object;

    iput v4, p0, Lcom/withpersona/sdk2/inquiry/internal/o$c;->u:I

    invoke-interface {v0, v2, p0}, Lnu/i;->emit(Ljava/lang/Object;Lnt/b;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_6

    goto :goto_2

    :cond_5
    sget-object v2, Lcom/withpersona/sdk2/inquiry/internal/o$b$a;->a:Lcom/withpersona/sdk2/inquiry/internal/o$b$a;

    invoke-static {v0}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    iput-object v4, p0, Lcom/withpersona/sdk2/inquiry/internal/o$c;->v:Ljava/lang/Object;

    invoke-static {p1}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/internal/o$c;->t:Ljava/lang/Object;

    iput v3, p0, Lcom/withpersona/sdk2/inquiry/internal/o$c;->u:I

    invoke-interface {v0, v2, p0}, Lnu/i;->emit(Ljava/lang/Object;Lnt/b;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_6

    :goto_2
    return-object v1

    :cond_6
    :goto_3
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p1
.end method

.method public final q(Lnu/i;Lnt/b;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnu/i<",
            "-",
            "Lcom/withpersona/sdk2/inquiry/internal/o$b;",
            ">;",
            "Lnt/b<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-virtual {p0, p1, p2}, Lcom/withpersona/sdk2/inquiry/internal/o$c;->create(Ljava/lang/Object;Lnt/b;)Lnt/b;

    move-result-object p1

    check-cast p1, Lcom/withpersona/sdk2/inquiry/internal/o$c;

    sget-object p2, Lkotlin/Unit;->a:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcom/withpersona/sdk2/inquiry/internal/o$c;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
