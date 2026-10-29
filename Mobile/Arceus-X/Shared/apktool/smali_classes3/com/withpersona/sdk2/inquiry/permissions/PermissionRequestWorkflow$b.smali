.class public final Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$b;
.super Lpt/m;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow;->J(Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$Props;Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$PermissionRequestState;Lym/k$a;)Ljava/lang/Object;
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
    c = "com.withpersona.sdk2.inquiry.permissions.PermissionRequestWorkflow$render$1"
    f = "PermissionRequestWorkflow.kt"
    l = {}
    m = "invokeSuspend"
.end annotation


# instance fields
.field public t:I

.field public final synthetic u:Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow;

.field public final synthetic v:Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$Props;

.field public final synthetic w:Lym/k$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lym/k<",
            "Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$Props;",
            "Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$PermissionRequestState;",
            "Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$Output;",
            "Ljava/lang/Object;",
            ">.a;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow;Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$Props;Lym/k$a;Lnt/b;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow;",
            "Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$Props;",
            "Lym/k<",
            "-",
            "Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$Props;",
            "Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$PermissionRequestState;",
            "Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$Output;",
            "+",
            "Ljava/lang/Object;",
            ">.a;",
            "Lnt/b<",
            "-",
            "Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$b;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$b;->u:Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow;

    iput-object p2, p0, Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$b;->v:Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$Props;

    iput-object p3, p0, Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$b;->w:Lym/k$a;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, Lpt/m;-><init>(ILnt/b;)V

    return-void
.end method

.method public static synthetic q(Lym/r$c;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0}, Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$b;->t(Lym/r$c;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic r(Lym/r$c;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0}, Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$b;->s(Lym/r$c;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method private static final s(Lym/r$c;)Lkotlin/Unit;
    .locals 1

    sget-object v0, Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$PermissionRequestState$RequestDeviceFeature;->a:Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$PermissionRequestState$RequestDeviceFeature;

    invoke-virtual {p0, v0}, Lym/r$c;->e(Ljava/lang/Object;)V

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method

.method private static final t(Lym/r$c;)Lkotlin/Unit;
    .locals 1

    sget-object v0, Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$PermissionRequestState$CheckPermissionRationaleState;->a:Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$PermissionRequestState$CheckPermissionRationaleState;

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

    new-instance p1, Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$b;

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$b;->u:Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow;

    iget-object v1, p0, Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$b;->v:Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$Props;

    iget-object v2, p0, Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$b;->w:Lym/k$a;

    invoke-direct {p1, v0, v1, v2, p2}, Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$b;-><init>(Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow;Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$Props;Lym/k$a;Lnt/b;)V

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lku/p0;

    check-cast p2, Lnt/b;

    invoke-virtual {p0, p1, p2}, Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$b;->invoke(Lku/p0;Lnt/b;)Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$b;->create(Ljava/lang/Object;Lnt/b;)Lnt/b;

    move-result-object p1

    check-cast p1, Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$b;

    sget-object p2, Lkotlin/Unit;->a:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    invoke-static {}, Lot/c;->e()Ljava/lang/Object;

    iget v0, p0, Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$b;->t:I

    if-nez v0, :cond_1

    invoke-static {p1}, Ljt/o;->b(Ljava/lang/Object;)V

    iget-object p1, p0, Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$b;->u:Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow;

    invoke-static {p1}, Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow;->F(Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow;)Landroid/content/Context;

    move-result-object p1

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$b;->v:Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$Props;

    invoke-virtual {v0}, Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$Props;->k()Lrp/i0;

    move-result-object v0

    invoke-static {p1, v0}, Lcom/withpersona/sdk2/inquiry/permissions/g;->b(Landroid/content/Context;Lrp/i0;)Z

    move-result p1

    const/4 v0, 0x1

    const/4 v1, 0x0

    if-eqz p1, :cond_0

    iget-object p1, p0, Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$b;->w:Lym/k$a;

    invoke-virtual {p1}, Lym/k$a;->d()Lym/h;

    move-result-object p1

    iget-object v2, p0, Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$b;->u:Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow;

    new-instance v3, Lrp/g1;

    invoke-direct {v3}, Lrp/g1;-><init>()V

    invoke-static {v2, v1, v3, v0, v1}, Lym/w;->g(Lym/k;Ljava/lang/String;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Lym/r;

    move-result-object v0

    invoke-interface {p1, v0}, Lym/h;->a(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$b;->w:Lym/k$a;

    invoke-virtual {p1}, Lym/k$a;->d()Lym/h;

    move-result-object p1

    iget-object v2, p0, Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$b;->u:Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow;

    new-instance v3, Lrp/h1;

    invoke-direct {v3}, Lrp/h1;-><init>()V

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
