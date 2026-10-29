.class public final Luq/a$a;
.super Lpt/m;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Luq/a;->f()V
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
    c = "com.withpersona.sdk2.inquiry.shared.navigation.NavigationStateManager$updateScreenState$1"
    f = "NavigationStateManager.kt"
    l = {
        0x4f
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field public t:I

.field public final synthetic u:Luq/a;

.field public final synthetic v:Lcom/withpersona/sdk2/inquiry/shared/navigation/NavigationState;


# direct methods
.method public constructor <init>(Luq/a;Lcom/withpersona/sdk2/inquiry/shared/navigation/NavigationState;Lnt/b;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Luq/a;",
            "Lcom/withpersona/sdk2/inquiry/shared/navigation/NavigationState;",
            "Lnt/b<",
            "-",
            "Luq/a$a;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Luq/a$a;->u:Luq/a;

    iput-object p2, p0, Luq/a$a;->v:Lcom/withpersona/sdk2/inquiry/shared/navigation/NavigationState;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Lpt/m;-><init>(ILnt/b;)V

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

    new-instance p1, Luq/a$a;

    iget-object v0, p0, Luq/a$a;->u:Luq/a;

    iget-object v1, p0, Luq/a$a;->v:Lcom/withpersona/sdk2/inquiry/shared/navigation/NavigationState;

    invoke-direct {p1, v0, v1, p2}, Luq/a$a;-><init>(Luq/a;Lcom/withpersona/sdk2/inquiry/shared/navigation/NavigationState;Lnt/b;)V

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lku/p0;

    check-cast p2, Lnt/b;

    invoke-virtual {p0, p1, p2}, Luq/a$a;->invoke(Lku/p0;Lnt/b;)Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, Luq/a$a;->create(Ljava/lang/Object;Lnt/b;)Lnt/b;

    move-result-object p1

    check-cast p1, Luq/a$a;

    sget-object p2, Lkotlin/Unit;->a:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Luq/a$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    invoke-static {}, Lot/c;->e()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Luq/a$a;->t:I

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

    iget-object p1, p0, Luq/a$a;->u:Luq/a;

    invoke-static {p1}, Luq/a;->a(Luq/a;)Lpq/e;

    move-result-object p1

    invoke-interface {p1}, Lpq/e;->b()Lnu/c0;

    move-result-object p1

    new-instance v1, Lwo/c;

    iget-object v3, p0, Luq/a$a;->v:Lcom/withpersona/sdk2/inquiry/shared/navigation/NavigationState;

    invoke-virtual {v3}, Lcom/withpersona/sdk2/inquiry/shared/navigation/NavigationState;->f()Z

    move-result v3

    iget-object v4, p0, Luq/a$a;->v:Lcom/withpersona/sdk2/inquiry/shared/navigation/NavigationState;

    invoke-virtual {v4}, Lcom/withpersona/sdk2/inquiry/shared/navigation/NavigationState;->g()Z

    move-result v4

    iget-object v5, p0, Luq/a$a;->v:Lcom/withpersona/sdk2/inquiry/shared/navigation/NavigationState;

    invoke-virtual {v5}, Lcom/withpersona/sdk2/inquiry/shared/navigation/NavigationState;->k()Z

    move-result v5

    iget-object v6, p0, Luq/a$a;->v:Lcom/withpersona/sdk2/inquiry/shared/navigation/NavigationState;

    invoke-virtual {v6}, Lcom/withpersona/sdk2/inquiry/shared/navigation/NavigationState;->i()Z

    move-result v6

    invoke-direct {v1, v3, v4, v5, v6}, Lwo/c;-><init>(ZZZZ)V

    iput v2, p0, Luq/a$a;->t:I

    invoke-interface {p1, v1, p0}, Lnu/b0;->emit(Ljava/lang/Object;Lnt/b;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    :goto_0
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p1
.end method
