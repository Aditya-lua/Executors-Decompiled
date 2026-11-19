.class public final Lcom/withpersona/sdk2/inquiry/internal/a0$b;
.super Lgu/m;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/withpersona/sdk2/inquiry/internal/a0;->run()Ldv/h;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lgu/m;",
        "Lkotlin/jvm/functions/Function2<",
        "Ldv/i<",
        "-",
        "Lcom/withpersona/sdk2/inquiry/internal/network/i;",
        ">;",
        "Leu/b<",
        "-",
        "Lkotlin/Unit;",
        ">;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation

.annotation runtime Lgu/f;
    c = "com.withpersona.sdk2.inquiry.internal.UpdateInquirySessionWorker$run$1"
    f = "UpdateInquirySessionWorker.kt"
    l = {
        0x16,
        0x15
    }
    m = "invokeSuspend"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0010\u0003\u001a\u00020\u0002*\u0008\u0012\u0004\u0012\u00020\u00010\u0000H\n\u00a2\u0006\u0004\u0008\u0003\u0010\u0004"
    }
    d2 = {
        "Ldv/i;",
        "Lcom/withpersona/sdk2/inquiry/internal/network/i;",
        "",
        "<anonymous>",
        "(Ldv/i;)V"
    }
    k = 0x3
    mv = {
        0x2,
        0x2,
        0x0
    }
.end annotation


# instance fields
.field public t:Ljava/lang/Object;

.field public u:I

.field public synthetic v:Ljava/lang/Object;

.field public final synthetic w:Lcom/withpersona/sdk2/inquiry/internal/a0;


# direct methods
.method public constructor <init>(Lcom/withpersona/sdk2/inquiry/internal/a0;Leu/b;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/withpersona/sdk2/inquiry/internal/a0;",
            "Leu/b<",
            "-",
            "Lcom/withpersona/sdk2/inquiry/internal/a0$b;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/internal/a0$b;->w:Lcom/withpersona/sdk2/inquiry/internal/a0;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Lgu/m;-><init>(ILeu/b;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Leu/b;)Leu/b;
    .locals 2
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

    new-instance v0, Lcom/withpersona/sdk2/inquiry/internal/a0$b;

    iget-object v1, p0, Lcom/withpersona/sdk2/inquiry/internal/a0$b;->w:Lcom/withpersona/sdk2/inquiry/internal/a0;

    invoke-direct {v0, v1, p2}, Lcom/withpersona/sdk2/inquiry/internal/a0$b;-><init>(Lcom/withpersona/sdk2/inquiry/internal/a0;Leu/b;)V

    iput-object p1, v0, Lcom/withpersona/sdk2/inquiry/internal/a0$b;->v:Ljava/lang/Object;

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ldv/i;

    check-cast p2, Leu/b;

    invoke-virtual {p0, p1, p2}, Lcom/withpersona/sdk2/inquiry/internal/a0$b;->m(Ldv/i;Leu/b;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/internal/a0$b;->v:Ljava/lang/Object;

    check-cast v0, Ldv/i;

    invoke-static {}, Lfu/c;->e()Ljava/lang/Object;

    move-result-object v1

    iget v2, p0, Lcom/withpersona/sdk2/inquiry/internal/a0$b;->u:I

    const/4 v3, 0x2

    const/4 v4, 0x1

    if-eqz v2, :cond_2

    if-eq v2, v4, :cond_1

    if-ne v2, v3, :cond_0

    invoke-static {p1}, Lzt/o;->b(Ljava/lang/Object;)V

    goto :goto_2

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    iget-object v2, p0, Lcom/withpersona/sdk2/inquiry/internal/a0$b;->t:Ljava/lang/Object;

    check-cast v2, Ldv/i;

    invoke-static {p1}, Lzt/o;->b(Ljava/lang/Object;)V

    goto :goto_0

    :cond_2
    invoke-static {p1}, Lzt/o;->b(Ljava/lang/Object;)V

    iget-object p1, p0, Lcom/withpersona/sdk2/inquiry/internal/a0$b;->w:Lcom/withpersona/sdk2/inquiry/internal/a0;

    invoke-static {p1}, Lcom/withpersona/sdk2/inquiry/internal/a0;->a(Lcom/withpersona/sdk2/inquiry/internal/a0;)Lcom/withpersona/sdk2/inquiry/internal/network/e;

    move-result-object p1

    iget-object v2, p0, Lcom/withpersona/sdk2/inquiry/internal/a0$b;->w:Lcom/withpersona/sdk2/inquiry/internal/a0;

    invoke-virtual {v2}, Lcom/withpersona/sdk2/inquiry/internal/a0;->e()Ljava/lang/String;

    move-result-object v2

    iget-object v5, p0, Lcom/withpersona/sdk2/inquiry/internal/a0$b;->w:Lcom/withpersona/sdk2/inquiry/internal/a0;

    invoke-static {v5}, Lcom/withpersona/sdk2/inquiry/internal/a0;->d(Lcom/withpersona/sdk2/inquiry/internal/a0;)Lhr/g;

    move-result-object v5

    invoke-static {v0}, Lgu/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    iput-object v6, p0, Lcom/withpersona/sdk2/inquiry/internal/a0$b;->v:Ljava/lang/Object;

    iput-object v0, p0, Lcom/withpersona/sdk2/inquiry/internal/a0$b;->t:Ljava/lang/Object;

    iput v4, p0, Lcom/withpersona/sdk2/inquiry/internal/a0$b;->u:I

    invoke-virtual {p1, v2, v5, p0}, Lcom/withpersona/sdk2/inquiry/internal/network/e;->r(Ljava/lang/String;Lhr/g;Leu/b;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_3

    goto :goto_1

    :cond_3
    move-object v2, v0

    :goto_0
    invoke-static {v0}, Lgu/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    iput-object v0, p0, Lcom/withpersona/sdk2/inquiry/internal/a0$b;->v:Ljava/lang/Object;

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/withpersona/sdk2/inquiry/internal/a0$b;->t:Ljava/lang/Object;

    iput v3, p0, Lcom/withpersona/sdk2/inquiry/internal/a0$b;->u:I

    invoke-interface {v2, p1, p0}, Ldv/i;->emit(Ljava/lang/Object;Leu/b;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_4

    :goto_1
    return-object v1

    :cond_4
    :goto_2
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p1
.end method

.method public final m(Ldv/i;Leu/b;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldv/i<",
            "-",
            "Lcom/withpersona/sdk2/inquiry/internal/network/i;",
            ">;",
            "Leu/b<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-virtual {p0, p1, p2}, Lcom/withpersona/sdk2/inquiry/internal/a0$b;->create(Ljava/lang/Object;Leu/b;)Leu/b;

    move-result-object p1

    check-cast p1, Lcom/withpersona/sdk2/inquiry/internal/a0$b;

    sget-object p2, Lkotlin/Unit;->a:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcom/withpersona/sdk2/inquiry/internal/a0$b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
