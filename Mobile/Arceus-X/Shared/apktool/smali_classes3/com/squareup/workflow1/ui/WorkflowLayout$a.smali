.class public final Lcom/squareup/workflow1/ui/WorkflowLayout$a;
.super Lpt/m;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/squareup/workflow1/ui/WorkflowLayout;->a(Landroidx/lifecycle/l;Lnu/h;Landroidx/lifecycle/l$b;Lan/y;)V
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
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@\u00a2\u0006\u0004\u0008\u0002\u0010\u0003"
    }
    d2 = {
        "Lku/p0;",
        "",
        "<anonymous>",
        "(Lku/p0;)V"
    }
    k = 0x3
    mv = {
        0x1,
        0x6,
        0x0
    }
.end annotation

.annotation runtime Lpt/f;
    c = "com.squareup.workflow1.ui.WorkflowLayout$start$1"
    f = "WorkflowLayout.kt"
    l = {
        0x57
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field public t:I

.field public final synthetic u:Landroidx/lifecycle/l;

.field public final synthetic v:Landroidx/lifecycle/l$b;

.field public final synthetic w:Lnu/h;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lnu/h<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field public final synthetic x:Lcom/squareup/workflow1/ui/WorkflowLayout;

.field public final synthetic y:Lan/y;


# direct methods
.method public constructor <init>(Landroidx/lifecycle/l;Landroidx/lifecycle/l$b;Lnu/h;Lcom/squareup/workflow1/ui/WorkflowLayout;Lan/y;Lnt/b;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/lifecycle/l;",
            "Landroidx/lifecycle/l$b;",
            "Lnu/h<",
            "+",
            "Ljava/lang/Object;",
            ">;",
            "Lcom/squareup/workflow1/ui/WorkflowLayout;",
            "Lan/y;",
            "Lnt/b<",
            "-",
            "Lcom/squareup/workflow1/ui/WorkflowLayout$a;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/squareup/workflow1/ui/WorkflowLayout$a;->u:Landroidx/lifecycle/l;

    iput-object p2, p0, Lcom/squareup/workflow1/ui/WorkflowLayout$a;->v:Landroidx/lifecycle/l$b;

    iput-object p3, p0, Lcom/squareup/workflow1/ui/WorkflowLayout$a;->w:Lnu/h;

    iput-object p4, p0, Lcom/squareup/workflow1/ui/WorkflowLayout$a;->x:Lcom/squareup/workflow1/ui/WorkflowLayout;

    iput-object p5, p0, Lcom/squareup/workflow1/ui/WorkflowLayout$a;->y:Lan/y;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p6}, Lpt/m;-><init>(ILnt/b;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lnt/b;)Lnt/b;
    .locals 7
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

    new-instance v0, Lcom/squareup/workflow1/ui/WorkflowLayout$a;

    iget-object v1, p0, Lcom/squareup/workflow1/ui/WorkflowLayout$a;->u:Landroidx/lifecycle/l;

    iget-object v2, p0, Lcom/squareup/workflow1/ui/WorkflowLayout$a;->v:Landroidx/lifecycle/l$b;

    iget-object v3, p0, Lcom/squareup/workflow1/ui/WorkflowLayout$a;->w:Lnu/h;

    iget-object v4, p0, Lcom/squareup/workflow1/ui/WorkflowLayout$a;->x:Lcom/squareup/workflow1/ui/WorkflowLayout;

    iget-object v5, p0, Lcom/squareup/workflow1/ui/WorkflowLayout$a;->y:Lan/y;

    move-object v6, p2

    invoke-direct/range {v0 .. v6}, Lcom/squareup/workflow1/ui/WorkflowLayout$a;-><init>(Landroidx/lifecycle/l;Landroidx/lifecycle/l$b;Lnu/h;Lcom/squareup/workflow1/ui/WorkflowLayout;Lan/y;Lnt/b;)V

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lku/p0;

    check-cast p2, Lnt/b;

    invoke-virtual {p0, p1, p2}, Lcom/squareup/workflow1/ui/WorkflowLayout$a;->invoke(Lku/p0;Lnt/b;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lku/p0;Lnt/b;)Ljava/lang/Object;
    .locals 0
    .param p1    # Lku/p0;
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
            "Lku/p0;",
            "Lnt/b<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 2
    invoke-virtual {p0, p1, p2}, Lcom/squareup/workflow1/ui/WorkflowLayout$a;->create(Ljava/lang/Object;Lnt/b;)Lnt/b;

    move-result-object p1

    check-cast p1, Lcom/squareup/workflow1/ui/WorkflowLayout$a;

    sget-object p2, Lkotlin/Unit;->a:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcom/squareup/workflow1/ui/WorkflowLayout$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8
    .param p1    # Ljava/lang/Object;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    invoke-static {}, Lot/c;->e()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Lcom/squareup/workflow1/ui/WorkflowLayout$a;->t:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    invoke-static {p1}, Ljt/o;->b(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Ljt/o;->b(Ljava/lang/Object;)V

    iget-object p1, p0, Lcom/squareup/workflow1/ui/WorkflowLayout$a;->u:Landroidx/lifecycle/l;

    iget-object v1, p0, Lcom/squareup/workflow1/ui/WorkflowLayout$a;->v:Landroidx/lifecycle/l$b;

    new-instance v3, Lcom/squareup/workflow1/ui/WorkflowLayout$a$a;

    iget-object v4, p0, Lcom/squareup/workflow1/ui/WorkflowLayout$a;->w:Lnu/h;

    iget-object v5, p0, Lcom/squareup/workflow1/ui/WorkflowLayout$a;->x:Lcom/squareup/workflow1/ui/WorkflowLayout;

    iget-object v6, p0, Lcom/squareup/workflow1/ui/WorkflowLayout$a;->y:Lan/y;

    const/4 v7, 0x0

    invoke-direct {v3, v4, v5, v6, v7}, Lcom/squareup/workflow1/ui/WorkflowLayout$a$a;-><init>(Lnu/h;Lcom/squareup/workflow1/ui/WorkflowLayout;Lan/y;Lnt/b;)V

    iput v2, p0, Lcom/squareup/workflow1/ui/WorkflowLayout$a;->t:I

    invoke-static {p1, v1, v3, p0}, Landroidx/lifecycle/j0;->a(Landroidx/lifecycle/l;Landroidx/lifecycle/l$b;Lkotlin/jvm/functions/Function2;Lnt/b;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    :goto_0
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p1
.end method
