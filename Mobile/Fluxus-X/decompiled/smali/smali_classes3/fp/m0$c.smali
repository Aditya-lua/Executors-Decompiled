.class public final Lfp/m0$c;
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
    c = "com.withpersona.sdk2.inquiry.governmentid.persona_workflow.renderers.GovIdCaptureRenderer$renderHolographicTorchDelay$2"
    f = "GovIdCaptureRenderer.kt"
    l = {}
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

.field public final synthetic u:Lfp/m0;

.field public final synthetic v:Lvo/d2$a;

.field public final synthetic w:Lvo/j0$g;

.field public final synthetic x:Lls/g;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lls/g<",
            "Lvo/j0;",
            ">;"
        }
    .end annotation
.end field

.field public final synthetic y:Lip/l;


# direct methods
.method public constructor <init>(Lfp/m0;Lvo/d2$a;Lvo/j0$g;Lls/g;Lip/l;Leu/b;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lfp/m0;",
            "Lvo/d2$a;",
            "Lvo/j0$g;",
            "Lls/g<",
            "Lvo/j0;",
            ">;",
            "Lip/l;",
            "Leu/b<",
            "-",
            "Lfp/m0$c;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lfp/m0$c;->u:Lfp/m0;

    iput-object p2, p0, Lfp/m0$c;->v:Lvo/d2$a;

    iput-object p3, p0, Lfp/m0$c;->w:Lvo/j0$g;

    iput-object p4, p0, Lfp/m0$c;->x:Lls/g;

    iput-object p5, p0, Lfp/m0$c;->y:Lip/l;

    const/4 p1, 0x1

    invoke-direct {p0, p1, p6}, Lgu/m;-><init>(ILeu/b;)V

    return-void
.end method


# virtual methods
.method public final create(Leu/b;)Leu/b;
    .locals 7
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

    new-instance v0, Lfp/m0$c;

    iget-object v1, p0, Lfp/m0$c;->u:Lfp/m0;

    iget-object v2, p0, Lfp/m0$c;->v:Lvo/d2$a;

    iget-object v3, p0, Lfp/m0$c;->w:Lvo/j0$g;

    iget-object v4, p0, Lfp/m0$c;->x:Lls/g;

    iget-object v5, p0, Lfp/m0$c;->y:Lip/l;

    move-object v6, p1

    invoke-direct/range {v0 .. v6}, Lfp/m0$c;-><init>(Lfp/m0;Lvo/d2$a;Lvo/j0$g;Lls/g;Lip/l;Leu/b;)V

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Leu/b;

    invoke-virtual {p0, p1}, Lfp/m0$c;->m(Leu/b;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    invoke-static {}, Lfu/c;->e()Ljava/lang/Object;

    iget v0, p0, Lfp/m0$c;->t:I

    if-nez v0, :cond_0

    invoke-static {p1}, Lzt/o;->b(Ljava/lang/Object;)V

    iget-object v1, p0, Lfp/m0$c;->u:Lfp/m0;

    iget-object v2, p0, Lfp/m0$c;->v:Lvo/d2$a;

    iget-object v3, p0, Lfp/m0$c;->w:Lvo/j0$g;

    iget-object v4, p0, Lfp/m0$c;->x:Lls/g;

    invoke-virtual {v3}, Lvo/j0$g;->J()Lvo/f;

    move-result-object v5

    iget-object v6, p0, Lfp/m0$c;->y:Lip/l;

    iget-object p1, p0, Lfp/m0$c;->w:Lvo/j0$g;

    invoke-virtual {p1}, Lvo/j0$g;->f()Lsn/v;

    move-result-object v7

    iget-object p1, p0, Lfp/m0$c;->w:Lvo/j0$g;

    invoke-virtual {p1}, Lvo/j0$g;->L()Lvo/n$b;

    move-result-object v8

    invoke-static/range {v1 .. v8}, Lfp/m0;->B(Lfp/m0;Lvo/d2$a;Lvo/j0;Lls/g;Lvo/f;Lip/l;Lsn/v;Lvo/n$b;)V

    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
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

    invoke-virtual {p0, p1}, Lfp/m0$c;->create(Leu/b;)Leu/b;

    move-result-object p1

    check-cast p1, Lfp/m0$c;

    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    invoke-virtual {p1, v0}, Lfp/m0$c;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
