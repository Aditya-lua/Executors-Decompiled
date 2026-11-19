.class public final Lln/f$a;
.super Lgu/m;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lln/f;->a(Lln/q;Lav/p0;Ldv/p0;Lln/m;Ljava/util/List;Lkotlin/jvm/functions/Function2;)Ldv/p0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lgu/m;",
        "Lkotlin/jvm/functions/Function2<",
        "Lav/p0;",
        "Leu/b<",
        "-",
        "Lkotlin/Unit;",
        ">;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation

.annotation runtime Lgu/f;
    c = "com.squareup.workflow1.RenderWorkflowKt$renderWorkflowIn$1"
    f = "RenderWorkflow.kt"
    l = {
        0x88,
        0x91
    }
    m = "invokeSuspend"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\u0008\u0000\u0010\u0000\"\u0004\u0008\u0001\u0010\u0001\"\u0004\u0008\u0002\u0010\u0002*\u00020\u0003H\u008a@\u00a2\u0006\u0004\u0008\u0005\u0010\u0006"
    }
    d2 = {
        "PropsT",
        "OutputT",
        "RenderingT",
        "Lav/p0;",
        "",
        "<anonymous>",
        "(Lav/p0;)V"
    }
    k = 0x3
    mv = {
        0x1,
        0x6,
        0x0
    }
.end annotation


# instance fields
.field public t:I

.field public synthetic u:Ljava/lang/Object;

.field public final synthetic v:Lmn/m;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lmn/m<",
            "TPropsT;TOutputT;TRenderingT;>;"
        }
    .end annotation
.end field

.field public final synthetic w:Ldv/c0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldv/c0<",
            "Lln/g<",
            "TRenderingT;>;>;"
        }
    .end annotation
.end field

.field public final synthetic x:Lkotlin/jvm/functions/Function2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function2<",
            "TOutputT;",
            "Leu/b<",
            "-",
            "Lkotlin/Unit;",
            ">;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lmn/m;Ldv/c0;Lkotlin/jvm/functions/Function2;Leu/b;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lmn/m<",
            "TPropsT;TOutputT;TRenderingT;>;",
            "Ldv/c0<",
            "Lln/g<",
            "TRenderingT;>;>;",
            "Lkotlin/jvm/functions/Function2<",
            "-TOutputT;-",
            "Leu/b<",
            "-",
            "Lkotlin/Unit;",
            ">;+",
            "Ljava/lang/Object;",
            ">;",
            "Leu/b<",
            "-",
            "Lln/f$a;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lln/f$a;->v:Lmn/m;

    iput-object p2, p0, Lln/f$a;->w:Ldv/c0;

    iput-object p3, p0, Lln/f$a;->x:Lkotlin/jvm/functions/Function2;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, Lgu/m;-><init>(ILeu/b;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Leu/b;)Leu/b;
    .locals 4
    .param p1    # Ljava/lang/Object;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p2    # Leu/b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Leu/b<",
            "*>;)",
            "Leu/b<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    new-instance v0, Lln/f$a;

    iget-object v1, p0, Lln/f$a;->v:Lmn/m;

    iget-object v2, p0, Lln/f$a;->w:Ldv/c0;

    iget-object v3, p0, Lln/f$a;->x:Lkotlin/jvm/functions/Function2;

    invoke-direct {v0, v1, v2, v3, p2}, Lln/f$a;-><init>(Lmn/m;Ldv/c0;Lkotlin/jvm/functions/Function2;Leu/b;)V

    iput-object p1, v0, Lln/f$a;->u:Ljava/lang/Object;

    return-object v0
.end method

.method public final invoke(Lav/p0;Leu/b;)Ljava/lang/Object;
    .locals 0
    .param p1    # Lav/p0;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Leu/b;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lav/p0;",
            "Leu/b<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, Lln/f$a;->create(Ljava/lang/Object;Leu/b;)Leu/b;

    move-result-object p1

    check-cast p1, Lln/f$a;

    sget-object p2, Lkotlin/Unit;->a:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lln/f$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lav/p0;

    check-cast p2, Leu/b;

    invoke-virtual {p0, p1, p2}, Lln/f$a;->invoke(Lav/p0;Leu/b;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7
    .param p1    # Ljava/lang/Object;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    invoke-static {}, Lfu/c;->e()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Lln/f$a;->t:I

    const/4 v2, 0x2

    const/4 v3, 0x1

    if-eqz v1, :cond_2

    if-eq v1, v3, :cond_1

    if-ne v1, v2, :cond_0

    iget-object v1, p0, Lln/f$a;->u:Ljava/lang/Object;

    check-cast v1, Lav/p0;

    invoke-static {p1}, Lzt/o;->b(Ljava/lang/Object;)V

    goto :goto_2

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    iget-object v1, p0, Lln/f$a;->u:Ljava/lang/Object;

    check-cast v1, Lav/p0;

    invoke-static {p1}, Lzt/o;->b(Ljava/lang/Object;)V

    goto :goto_1

    :cond_2
    invoke-static {p1}, Lzt/o;->b(Ljava/lang/Object;)V

    iget-object p1, p0, Lln/f$a;->u:Ljava/lang/Object;

    check-cast p1, Lav/p0;

    :goto_0
    invoke-static {p1}, Lav/q0;->i(Lav/p0;)Z

    move-result v1

    if-eqz v1, :cond_7

    iget-object v1, p0, Lln/f$a;->v:Lmn/m;

    iput-object p1, p0, Lln/f$a;->u:Ljava/lang/Object;

    iput v3, p0, Lln/f$a;->t:I

    invoke-virtual {v1, p0}, Lmn/m;->f(Leu/b;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v0, :cond_3

    goto :goto_3

    :cond_3
    move-object v6, v1

    move-object v1, p1

    move-object p1, v6

    :goto_1
    check-cast p1, Lln/v;

    invoke-static {v1}, Lav/q0;->i(Lav/p0;)Z

    move-result v4

    if-nez v4, :cond_4

    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p1

    :cond_4
    iget-object v4, p0, Lln/f$a;->w:Ldv/c0;

    iget-object v5, p0, Lln/f$a;->v:Lmn/m;

    invoke-virtual {v5}, Lmn/m;->g()Lln/g;

    move-result-object v5

    invoke-interface {v4, v5}, Ldv/c0;->setValue(Ljava/lang/Object;)V

    if-nez p1, :cond_6

    :cond_5
    :goto_2
    move-object p1, v1

    goto :goto_0

    :cond_6
    iget-object v4, p0, Lln/f$a;->x:Lkotlin/jvm/functions/Function2;

    invoke-virtual {p1}, Lln/v;->a()Ljava/lang/Object;

    move-result-object p1

    iput-object v1, p0, Lln/f$a;->u:Ljava/lang/Object;

    iput v2, p0, Lln/f$a;->t:I

    invoke-interface {v4, p1, p0}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_5

    :goto_3
    return-object v0

    :cond_7
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p1
.end method
