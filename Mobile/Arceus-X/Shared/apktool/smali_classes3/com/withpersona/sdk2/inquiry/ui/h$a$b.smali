.class public final Lcom/withpersona/sdk2/inquiry/ui/h$a$b;
.super Lpt/m;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/withpersona/sdk2/inquiry/ui/h$a;->b(Ljava/lang/String;[Ljava/lang/String;I)Lcom/withpersona/sdk2/inquiry/ui/h;
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
        "Ljava/util/List<",
        "+",
        "Landroid/net/Uri;",
        ">;>;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\n\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\u0010\u0000\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0001H\n"
    }
    d2 = {
        "<anonymous>",
        "",
        "Landroid/net/Uri;"
    }
    k = 0x3
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation

.annotation runtime Lpt/f;
    c = "com.withpersona.sdk2.inquiry.ui.UiStepFileSelectWorker$Factory$create$3"
    f = "UiStepFileSelectWorker.kt"
    l = {
        0x7c,
        0x7f
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field public t:I

.field public final synthetic u:I


# direct methods
.method public constructor <init>(ILnt/b;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Lnt/b<",
            "-",
            "Lcom/withpersona/sdk2/inquiry/ui/h$a$b;",
            ">;)V"
        }
    .end annotation

    iput p1, p0, Lcom/withpersona/sdk2/inquiry/ui/h$a$b;->u:I

    const/4 p1, 0x1

    invoke-direct {p0, p1, p2}, Lpt/m;-><init>(ILnt/b;)V

    return-void
.end method


# virtual methods
.method public final create(Lnt/b;)Lnt/b;
    .locals 2
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

    new-instance v0, Lcom/withpersona/sdk2/inquiry/ui/h$a$b;

    iget v1, p0, Lcom/withpersona/sdk2/inquiry/ui/h$a$b;->u:I

    invoke-direct {v0, v1, p1}, Lcom/withpersona/sdk2/inquiry/ui/h$a$b;-><init>(ILnt/b;)V

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lnt/b;

    invoke-virtual {p0, p1}, Lcom/withpersona/sdk2/inquiry/ui/h$a$b;->q(Lnt/b;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    invoke-static {}, Lot/c;->e()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Lcom/withpersona/sdk2/inquiry/ui/h$a$b;->t:I

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
    invoke-static {p1}, Ljt/o;->b(Ljava/lang/Object;)V

    goto :goto_0

    :cond_2
    invoke-static {p1}, Ljt/o;->b(Ljava/lang/Object;)V

    iget p1, p0, Lcom/withpersona/sdk2/inquiry/ui/h$a$b;->u:I

    if-ne p1, v3, :cond_5

    new-instance p1, Lmp/u;

    invoke-direct {p1}, Lmp/u;-><init>()V

    iput v3, p0, Lcom/withpersona/sdk2/inquiry/ui/h$a$b;->t:I

    invoke-static {p1, p0}, Lnu/j;->v(Lnu/h;Lnt/b;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_3

    goto :goto_1

    :cond_3
    :goto_0
    check-cast p1, Landroid/net/Uri;

    if-eqz p1, :cond_4

    invoke-static {p1}, Lkotlin/collections/o;->d(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    return-object p1

    :cond_4
    const/4 p1, 0x0

    return-object p1

    :cond_5
    new-instance p1, Lmp/v;

    invoke-direct {p1}, Lmp/v;-><init>()V

    iput v2, p0, Lcom/withpersona/sdk2/inquiry/ui/h$a$b;->t:I

    invoke-static {p1, p0}, Lnu/j;->v(Lnu/h;Lnt/b;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_6

    :goto_1
    return-object v0

    :cond_6
    :goto_2
    check-cast p1, Ljava/util/List;

    return-object p1
.end method

.method public final q(Lnt/b;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnt/b<",
            "-",
            "Ljava/util/List<",
            "+",
            "Landroid/net/Uri;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-virtual {p0, p1}, Lcom/withpersona/sdk2/inquiry/ui/h$a$b;->create(Lnt/b;)Lnt/b;

    move-result-object p1

    check-cast p1, Lcom/withpersona/sdk2/inquiry/ui/h$a$b;

    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    invoke-virtual {p1, v0}, Lcom/withpersona/sdk2/inquiry/ui/h$a$b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
