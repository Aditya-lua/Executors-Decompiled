.class public final Lro/m0$c;
.super Lpt/m;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lro/m0;->M(Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$HolographicTorchDelay;Lvr/f;Luo/l;Lkotlin/jvm/functions/Function1;)Lcom/withpersona/sdk2/inquiry/governmentid/Screen;
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
        "Lkotlin/Unit;",
        ">;",
        "Ljava/lang/Object;",
        ">;"
    }
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

.annotation runtime Lpt/f;
    c = "com.withpersona.sdk2.inquiry.governmentid.persona_workflow.renderers.GovIdCaptureRenderer$renderHolographicTorchDelay$2"
    f = "GovIdCaptureRenderer.kt"
    l = {}
    m = "invokeSuspend"
.end annotation


# instance fields
.field public t:I

.field public final synthetic u:Lro/m0;

.field public final synthetic v:Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;

.field public final synthetic w:Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$HolographicTorchDelay;

.field public final synthetic x:Lvr/f;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lvr/f<",
            "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;",
            ">;"
        }
    .end annotation
.end field

.field public final synthetic y:Luo/l;


# direct methods
.method public constructor <init>(Lro/m0;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$HolographicTorchDelay;Lvr/f;Luo/l;Lnt/b;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lro/m0;",
            "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;",
            "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$HolographicTorchDelay;",
            "Lvr/f<",
            "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;",
            ">;",
            "Luo/l;",
            "Lnt/b<",
            "-",
            "Lro/m0$c;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lro/m0$c;->u:Lro/m0;

    iput-object p2, p0, Lro/m0$c;->v:Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;

    iput-object p3, p0, Lro/m0$c;->w:Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$HolographicTorchDelay;

    iput-object p4, p0, Lro/m0$c;->x:Lvr/f;

    iput-object p5, p0, Lro/m0$c;->y:Luo/l;

    const/4 p1, 0x1

    invoke-direct {p0, p1, p6}, Lpt/m;-><init>(ILnt/b;)V

    return-void
.end method


# virtual methods
.method public final create(Lnt/b;)Lnt/b;
    .locals 7
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

    new-instance v0, Lro/m0$c;

    iget-object v1, p0, Lro/m0$c;->u:Lro/m0;

    iget-object v2, p0, Lro/m0$c;->v:Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;

    iget-object v3, p0, Lro/m0$c;->w:Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$HolographicTorchDelay;

    iget-object v4, p0, Lro/m0$c;->x:Lvr/f;

    iget-object v5, p0, Lro/m0$c;->y:Luo/l;

    move-object v6, p1

    invoke-direct/range {v0 .. v6}, Lro/m0$c;-><init>(Lro/m0;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$HolographicTorchDelay;Lvr/f;Luo/l;Lnt/b;)V

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lnt/b;

    invoke-virtual {p0, p1}, Lro/m0$c;->q(Lnt/b;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    invoke-static {}, Lot/c;->e()Ljava/lang/Object;

    iget v0, p0, Lro/m0$c;->t:I

    if-nez v0, :cond_0

    invoke-static {p1}, Ljt/o;->b(Ljava/lang/Object;)V

    iget-object v1, p0, Lro/m0$c;->u:Lro/m0;

    iget-object v2, p0, Lro/m0$c;->v:Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;

    iget-object v3, p0, Lro/m0$c;->w:Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$HolographicTorchDelay;

    iget-object v4, p0, Lro/m0$c;->x:Lvr/f;

    invoke-virtual {v3}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$HolographicTorchDelay;->K()Lcom/withpersona/sdk2/inquiry/governmentid/CaptureConfig;

    move-result-object v5

    iget-object v6, p0, Lro/m0$c;->y:Luo/l;

    iget-object p1, p0, Lro/m0$c;->w:Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$HolographicTorchDelay;

    invoke-virtual {p1}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$HolographicTorchDelay;->a()Lcom/withpersona/sdk2/camera/CameraProperties;

    move-result-object v7

    iget-object p1, p0, Lro/m0$c;->w:Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$HolographicTorchDelay;

    invoke-virtual {p1}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$HolographicTorchDelay;->L()Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentId$GovernmentIdImage;

    move-result-object v8

    invoke-static/range {v1 .. v8}, Lro/m0;->B(Lro/m0;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;Lvr/f;Lcom/withpersona/sdk2/inquiry/governmentid/CaptureConfig;Luo/l;Lcom/withpersona/sdk2/camera/CameraProperties;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentId$GovernmentIdImage;)V

    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final q(Lnt/b;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnt/b<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-virtual {p0, p1}, Lro/m0$c;->create(Lnt/b;)Lnt/b;

    move-result-object p1

    check-cast p1, Lro/m0$c;

    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    invoke-virtual {p1, v0}, Lro/m0$c;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
