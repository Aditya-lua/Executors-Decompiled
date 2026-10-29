.class public final Lcom/withpersona/sdk2/inquiry/permissions/DeviceFeatureRequestWorkflow$c;
.super Lpt/m;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/withpersona/sdk2/inquiry/permissions/DeviceFeatureRequestWorkflow;->u(Lcom/withpersona/sdk2/inquiry/permissions/DeviceFeatureRequestWorkflow$b;Lcom/withpersona/sdk2/inquiry/permissions/DeviceFeatureRequestWorkflow$DeviceFeatureRequestState;Lym/k$a;)Ljava/lang/Object;
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
    c = "com.withpersona.sdk2.inquiry.permissions.DeviceFeatureRequestWorkflow$render$1"
    f = "DeviceFeatureRequestWorkflow.kt"
    l = {}
    m = "invokeSuspend"
.end annotation


# instance fields
.field public t:I

.field public final synthetic u:Lcom/withpersona/sdk2/inquiry/permissions/DeviceFeatureRequestWorkflow;

.field public final synthetic v:Lym/k$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lym/k<",
            "Lcom/withpersona/sdk2/inquiry/permissions/DeviceFeatureRequestWorkflow$b;",
            "Lcom/withpersona/sdk2/inquiry/permissions/DeviceFeatureRequestWorkflow$DeviceFeatureRequestState;",
            "Lcom/withpersona/sdk2/inquiry/permissions/DeviceFeatureRequestWorkflow$a;",
            "Ljava/lang/Object;",
            ">.a;"
        }
    .end annotation
.end field

.field public final synthetic w:Lcom/withpersona/sdk2/inquiry/permissions/DeviceFeatureRequestWorkflow$b;


# direct methods
.method public constructor <init>(Lcom/withpersona/sdk2/inquiry/permissions/DeviceFeatureRequestWorkflow;Lym/k$a;Lcom/withpersona/sdk2/inquiry/permissions/DeviceFeatureRequestWorkflow$b;Lnt/b;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/withpersona/sdk2/inquiry/permissions/DeviceFeatureRequestWorkflow;",
            "Lym/k<",
            "-",
            "Lcom/withpersona/sdk2/inquiry/permissions/DeviceFeatureRequestWorkflow$b;",
            "Lcom/withpersona/sdk2/inquiry/permissions/DeviceFeatureRequestWorkflow$DeviceFeatureRequestState;",
            "Lcom/withpersona/sdk2/inquiry/permissions/DeviceFeatureRequestWorkflow$a;",
            "+",
            "Ljava/lang/Object;",
            ">.a;",
            "Lcom/withpersona/sdk2/inquiry/permissions/DeviceFeatureRequestWorkflow$b;",
            "Lnt/b<",
            "-",
            "Lcom/withpersona/sdk2/inquiry/permissions/DeviceFeatureRequestWorkflow$c;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/permissions/DeviceFeatureRequestWorkflow$c;->u:Lcom/withpersona/sdk2/inquiry/permissions/DeviceFeatureRequestWorkflow;

    iput-object p2, p0, Lcom/withpersona/sdk2/inquiry/permissions/DeviceFeatureRequestWorkflow$c;->v:Lym/k$a;

    iput-object p3, p0, Lcom/withpersona/sdk2/inquiry/permissions/DeviceFeatureRequestWorkflow$c;->w:Lcom/withpersona/sdk2/inquiry/permissions/DeviceFeatureRequestWorkflow$b;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, Lpt/m;-><init>(ILnt/b;)V

    return-void
.end method

.method public static synthetic q(Lym/r$c;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0}, Lcom/withpersona/sdk2/inquiry/permissions/DeviceFeatureRequestWorkflow$c;->t(Lym/r$c;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic r(Lcom/withpersona/sdk2/inquiry/permissions/DeviceFeatureRequestWorkflow;Lcom/withpersona/sdk2/inquiry/permissions/DeviceFeatureRequestWorkflow$b;Lym/r$c;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/withpersona/sdk2/inquiry/permissions/DeviceFeatureRequestWorkflow$c;->s(Lcom/withpersona/sdk2/inquiry/permissions/DeviceFeatureRequestWorkflow;Lcom/withpersona/sdk2/inquiry/permissions/DeviceFeatureRequestWorkflow$b;Lym/r$c;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static final s(Lcom/withpersona/sdk2/inquiry/permissions/DeviceFeatureRequestWorkflow;Lcom/withpersona/sdk2/inquiry/permissions/DeviceFeatureRequestWorkflow$b;Lym/r$c;)Lkotlin/Unit;
    .locals 2

    new-instance v0, Lcom/withpersona/sdk2/inquiry/permissions/DeviceFeatureState;

    invoke-virtual {p1}, Lcom/withpersona/sdk2/inquiry/permissions/DeviceFeatureRequestWorkflow$b;->a()Lrp/u;

    move-result-object p1

    sget-object v1, Lrp/v;->a:Lrp/v;

    invoke-direct {v0, p1, v1}, Lcom/withpersona/sdk2/inquiry/permissions/DeviceFeatureState;-><init>(Lrp/u;Lrp/v;)V

    invoke-static {p0, p2, v0}, Lcom/withpersona/sdk2/inquiry/permissions/DeviceFeatureRequestWorkflow;->p(Lcom/withpersona/sdk2/inquiry/permissions/DeviceFeatureRequestWorkflow;Lym/r$c;Lcom/withpersona/sdk2/inquiry/permissions/DeviceFeatureState;)V

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method

.method public static final t(Lym/r$c;)Lkotlin/Unit;
    .locals 1

    sget-object v0, Lcom/withpersona/sdk2/inquiry/permissions/DeviceFeatureRequestWorkflow$DeviceFeatureRequestState$ShowDeviceFeaturePrompt;->a:Lcom/withpersona/sdk2/inquiry/permissions/DeviceFeatureRequestWorkflow$DeviceFeatureRequestState$ShowDeviceFeaturePrompt;

    invoke-virtual {p0, v0}, Lym/r$c;->e(Ljava/lang/Object;)V

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lnt/b;)Lnt/b;
    .locals 3
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

    new-instance p1, Lcom/withpersona/sdk2/inquiry/permissions/DeviceFeatureRequestWorkflow$c;

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/permissions/DeviceFeatureRequestWorkflow$c;->u:Lcom/withpersona/sdk2/inquiry/permissions/DeviceFeatureRequestWorkflow;

    iget-object v1, p0, Lcom/withpersona/sdk2/inquiry/permissions/DeviceFeatureRequestWorkflow$c;->v:Lym/k$a;

    iget-object v2, p0, Lcom/withpersona/sdk2/inquiry/permissions/DeviceFeatureRequestWorkflow$c;->w:Lcom/withpersona/sdk2/inquiry/permissions/DeviceFeatureRequestWorkflow$b;

    invoke-direct {p1, v0, v1, v2, p2}, Lcom/withpersona/sdk2/inquiry/permissions/DeviceFeatureRequestWorkflow$c;-><init>(Lcom/withpersona/sdk2/inquiry/permissions/DeviceFeatureRequestWorkflow;Lym/k$a;Lcom/withpersona/sdk2/inquiry/permissions/DeviceFeatureRequestWorkflow$b;Lnt/b;)V

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lku/p0;

    check-cast p2, Lnt/b;

    invoke-virtual {p0, p1, p2}, Lcom/withpersona/sdk2/inquiry/permissions/DeviceFeatureRequestWorkflow$c;->invoke(Lku/p0;Lnt/b;)Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, Lcom/withpersona/sdk2/inquiry/permissions/DeviceFeatureRequestWorkflow$c;->create(Ljava/lang/Object;Lnt/b;)Lnt/b;

    move-result-object p1

    check-cast p1, Lcom/withpersona/sdk2/inquiry/permissions/DeviceFeatureRequestWorkflow$c;

    sget-object p2, Lkotlin/Unit;->a:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcom/withpersona/sdk2/inquiry/permissions/DeviceFeatureRequestWorkflow$c;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    invoke-static {}, Lot/c;->e()Ljava/lang/Object;

    iget v0, p0, Lcom/withpersona/sdk2/inquiry/permissions/DeviceFeatureRequestWorkflow$c;->t:I

    if-nez v0, :cond_1

    invoke-static {p1}, Ljt/o;->b(Ljava/lang/Object;)V

    iget-object p1, p0, Lcom/withpersona/sdk2/inquiry/permissions/DeviceFeatureRequestWorkflow$c;->u:Lcom/withpersona/sdk2/inquiry/permissions/DeviceFeatureRequestWorkflow;

    invoke-static {p1}, Lcom/withpersona/sdk2/inquiry/permissions/DeviceFeatureRequestWorkflow;->q(Lcom/withpersona/sdk2/inquiry/permissions/DeviceFeatureRequestWorkflow;)Landroid/content/Context;

    move-result-object p1

    invoke-static {p1}, Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/a;->b(Landroid/content/Context;)Z

    move-result p1

    const/4 v0, 0x1

    const/4 v1, 0x0

    if-eqz p1, :cond_0

    iget-object p1, p0, Lcom/withpersona/sdk2/inquiry/permissions/DeviceFeatureRequestWorkflow$c;->v:Lym/k$a;

    invoke-virtual {p1}, Lym/k$a;->d()Lym/h;

    move-result-object p1

    iget-object v2, p0, Lcom/withpersona/sdk2/inquiry/permissions/DeviceFeatureRequestWorkflow$c;->u:Lcom/withpersona/sdk2/inquiry/permissions/DeviceFeatureRequestWorkflow;

    iget-object v3, p0, Lcom/withpersona/sdk2/inquiry/permissions/DeviceFeatureRequestWorkflow$c;->w:Lcom/withpersona/sdk2/inquiry/permissions/DeviceFeatureRequestWorkflow$b;

    new-instance v4, Lrp/s;

    invoke-direct {v4, v2, v3}, Lrp/s;-><init>(Lcom/withpersona/sdk2/inquiry/permissions/DeviceFeatureRequestWorkflow;Lcom/withpersona/sdk2/inquiry/permissions/DeviceFeatureRequestWorkflow$b;)V

    invoke-static {v2, v1, v4, v0, v1}, Lym/w;->g(Lym/k;Ljava/lang/String;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Lym/r;

    move-result-object v0

    invoke-interface {p1, v0}, Lym/h;->a(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lcom/withpersona/sdk2/inquiry/permissions/DeviceFeatureRequestWorkflow$c;->v:Lym/k$a;

    invoke-virtual {p1}, Lym/k$a;->d()Lym/h;

    move-result-object p1

    iget-object v2, p0, Lcom/withpersona/sdk2/inquiry/permissions/DeviceFeatureRequestWorkflow$c;->u:Lcom/withpersona/sdk2/inquiry/permissions/DeviceFeatureRequestWorkflow;

    new-instance v3, Lrp/t;

    invoke-direct {v3}, Lrp/t;-><init>()V

    invoke-static {v2, v1, v3, v0, v1}, Lym/w;->g(Lym/k;Ljava/lang/String;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Lym/r;

    move-result-object v0

    invoke-interface {p1, v0}, Lym/h;->a(Ljava/lang/Object;)V

    :goto_0
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
