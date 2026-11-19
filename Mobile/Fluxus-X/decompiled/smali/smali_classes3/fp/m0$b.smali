.class public final Lfp/m0$b;
.super Lgu/m;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lfp/m0;->M(Lvo/d2$a;Lvo/j0$g;Lls/g;Lip/l;Lkotlin/jvm/functions/Function1;)Lvo/y3;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lgu/m;",
        "Lkotlin/jvm/functions/Function1<",
        "Leu/b<",
        "-",
        "Lkotlin/Unit;",
        ">;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation

.annotation runtime Lgu/f;
    c = "com.withpersona.sdk2.inquiry.governmentid.persona_workflow.renderers.GovIdCaptureRenderer$renderHolographicTorchDelay$1"
    f = "GovIdCaptureRenderer.kt"
    l = {
        0x1f9
    }
    m = "invokeSuspend"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"
    }
    d2 = {
        "<anonymous>",
        ""
    }
    k = 0x3
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field public t:I

.field public final synthetic u:Lvo/j0$g;

.field public final synthetic v:Lls/g;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lls/g<",
            "Lvo/j0;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lvo/j0$g;Lls/g;Leu/b;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lvo/j0$g;",
            "Lls/g<",
            "Lvo/j0;",
            ">;",
            "Leu/b<",
            "-",
            "Lfp/m0$b;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lfp/m0$b;->u:Lvo/j0$g;

    iput-object p2, p0, Lfp/m0$b;->v:Lls/g;

    const/4 p1, 0x1

    invoke-direct {p0, p1, p3}, Lgu/m;-><init>(ILeu/b;)V

    return-void
.end method


# virtual methods
.method public final create(Leu/b;)Leu/b;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Leu/b<",
            "*>;)",
            "Leu/b<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    new-instance v0, Lfp/m0$b;

    iget-object v1, p0, Lfp/m0$b;->u:Lvo/j0$g;

    iget-object v2, p0, Lfp/m0$b;->v:Lls/g;

    invoke-direct {v0, v1, v2, p1}, Lfp/m0$b;-><init>(Lvo/j0$g;Lls/g;Leu/b;)V

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Leu/b;

    invoke-virtual {p0, p1}, Lfp/m0$b;->m(Leu/b;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 14

    invoke-static {}, Lfu/c;->e()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Lfp/m0$b;->t:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    invoke-static {p1}, Lzt/o;->b(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lzt/o;->b(Ljava/lang/Object;)V

    sget-object p1, Lkotlin/time/a;->b:Lkotlin/time/a$a;

    iget-object p1, p0, Lfp/m0$b;->u:Lvo/j0$g;

    invoke-virtual {p1}, Lvo/j0$g;->O()I

    move-result p1

    sget-object v1, Lzu/b;->d:Lzu/b;

    invoke-static {p1, v1}, Lkotlin/time/b;->p(ILzu/b;)J

    move-result-wide v3

    iput v2, p0, Lfp/m0$b;->t:I

    invoke-static {v3, v4, p0}, Lav/z0;->c(JLeu/b;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    :goto_0
    iget-object p1, p0, Lfp/m0$b;->v:Lls/g;

    invoke-virtual {p1}, Lls/g;->i()Lls/h;

    move-result-object p1

    instance-of v0, p1, Lvo/j0$g;

    if-eqz v0, :cond_3

    check-cast p1, Lvo/j0$g;

    :goto_1
    move-object v0, p1

    goto :goto_2

    :cond_3
    const/4 p1, 0x0

    goto :goto_1

    :goto_2
    if-nez v0, :cond_4

    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p1

    :cond_4
    iget-object p1, p0, Lfp/m0$b;->v:Lls/g;

    const/16 v12, 0x3ff

    const/4 v13, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    invoke-static/range {v0 .. v13}, Lvo/j0$g;->H(Lvo/j0$g;Lvo/i3$a;Ljava/util/List;Ljava/util/List;ILvo/j0;Ljava/lang/String;Lvo/f;Lsn/v;ILvo/n$b;ZILjava/lang/Object;)Lvo/j0$g;

    move-result-object v0

    invoke-virtual {p1, v0}, Lls/g;->p(Lls/h;)V

    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p1
.end method

.method public final m(Leu/b;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Leu/b<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-virtual {p0, p1}, Lfp/m0$b;->create(Leu/b;)Leu/b;

    move-result-object p1

    check-cast p1, Lfp/m0$b;

    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    invoke-virtual {p1, v0}, Lfp/m0$b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
