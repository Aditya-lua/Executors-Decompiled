.class public final Lcom/withpersona/sdk2/inquiry/permissions/state/PermissionRequestStateManager$e;
.super Lpt/m;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/withpersona/sdk2/inquiry/permissions/state/PermissionRequestStateManager;->y(Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$Props;Lcom/withpersona/sdk2/inquiry/permissions/state/PermissionRequestStateManager$PermissionRequestState;)V
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
    c = "com.withpersona.sdk2.inquiry.permissions.state.PermissionRequestStateManager$handleState$10"
    f = "PermissionRequestStateManager.kt"
    l = {}
    m = "invokeSuspend"
.end annotation


# instance fields
.field public t:I

.field public final synthetic u:Lcom/withpersona/sdk2/inquiry/permissions/state/PermissionRequestStateManager;

.field public final synthetic v:Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$Props;


# direct methods
.method public constructor <init>(Lcom/withpersona/sdk2/inquiry/permissions/state/PermissionRequestStateManager;Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$Props;Lnt/b;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/withpersona/sdk2/inquiry/permissions/state/PermissionRequestStateManager;",
            "Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$Props;",
            "Lnt/b<",
            "-",
            "Lcom/withpersona/sdk2/inquiry/permissions/state/PermissionRequestStateManager$e;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/permissions/state/PermissionRequestStateManager$e;->u:Lcom/withpersona/sdk2/inquiry/permissions/state/PermissionRequestStateManager;

    iput-object p2, p0, Lcom/withpersona/sdk2/inquiry/permissions/state/PermissionRequestStateManager$e;->v:Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$Props;

    const/4 p1, 0x1

    invoke-direct {p0, p1, p3}, Lpt/m;-><init>(ILnt/b;)V

    return-void
.end method


# virtual methods
.method public final create(Lnt/b;)Lnt/b;
    .locals 3
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

    new-instance v0, Lcom/withpersona/sdk2/inquiry/permissions/state/PermissionRequestStateManager$e;

    iget-object v1, p0, Lcom/withpersona/sdk2/inquiry/permissions/state/PermissionRequestStateManager$e;->u:Lcom/withpersona/sdk2/inquiry/permissions/state/PermissionRequestStateManager;

    iget-object v2, p0, Lcom/withpersona/sdk2/inquiry/permissions/state/PermissionRequestStateManager$e;->v:Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$Props;

    invoke-direct {v0, v1, v2, p1}, Lcom/withpersona/sdk2/inquiry/permissions/state/PermissionRequestStateManager$e;-><init>(Lcom/withpersona/sdk2/inquiry/permissions/state/PermissionRequestStateManager;Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$Props;Lnt/b;)V

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lnt/b;

    invoke-virtual {p0, p1}, Lcom/withpersona/sdk2/inquiry/permissions/state/PermissionRequestStateManager$e;->q(Lnt/b;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    invoke-static {}, Lot/c;->e()Ljava/lang/Object;

    iget v0, p0, Lcom/withpersona/sdk2/inquiry/permissions/state/PermissionRequestStateManager$e;->t:I

    if-nez v0, :cond_1

    invoke-static {p1}, Ljt/o;->b(Ljava/lang/Object;)V

    iget-object p1, p0, Lcom/withpersona/sdk2/inquiry/permissions/state/PermissionRequestStateManager$e;->u:Lcom/withpersona/sdk2/inquiry/permissions/state/PermissionRequestStateManager;

    invoke-static {p1}, Lcom/withpersona/sdk2/inquiry/permissions/state/PermissionRequestStateManager;->t(Lcom/withpersona/sdk2/inquiry/permissions/state/PermissionRequestStateManager;)Landroid/content/Context;

    move-result-object p1

    invoke-static {p1}, Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/a;->b(Landroid/content/Context;)Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lcom/withpersona/sdk2/inquiry/permissions/state/PermissionRequestStateManager$e;->u:Lcom/withpersona/sdk2/inquiry/permissions/state/PermissionRequestStateManager;

    new-instance v0, Lcom/withpersona/sdk2/inquiry/permissions/PermissionState;

    iget-object v1, p0, Lcom/withpersona/sdk2/inquiry/permissions/state/PermissionRequestStateManager$e;->v:Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$Props;

    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$Props;->k()Lrp/i0;

    move-result-object v1

    sget-object v2, Lrp/j1;->a:Lrp/j1;

    invoke-direct {v0, v1, v2}, Lcom/withpersona/sdk2/inquiry/permissions/PermissionState;-><init>(Lrp/i0;Lrp/j1;)V

    invoke-static {p1, v0}, Lcom/withpersona/sdk2/inquiry/permissions/state/PermissionRequestStateManager;->s(Lcom/withpersona/sdk2/inquiry/permissions/state/PermissionRequestStateManager;Lcom/withpersona/sdk2/inquiry/permissions/PermissionState;)V

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lcom/withpersona/sdk2/inquiry/permissions/state/PermissionRequestStateManager$e;->u:Lcom/withpersona/sdk2/inquiry/permissions/state/PermissionRequestStateManager;

    invoke-virtual {p1}, Lvr/c;->d()Lvr/f;

    move-result-object p1

    sget-object v0, Lcom/withpersona/sdk2/inquiry/permissions/state/PermissionRequestStateManager$DeviceFeatureRequestState$ShowDeviceFeaturePrompt;->a:Lcom/withpersona/sdk2/inquiry/permissions/state/PermissionRequestStateManager$DeviceFeatureRequestState$ShowDeviceFeaturePrompt;

    invoke-virtual {p1, v0}, Lvr/f;->p(Lcom/withpersona/sdk2/inquiry/workflows/WorkflowState;)V

    :goto_0
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p1

    :cond_1
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

    invoke-virtual {p0, p1}, Lcom/withpersona/sdk2/inquiry/permissions/state/PermissionRequestStateManager$e;->create(Lnt/b;)Lnt/b;

    move-result-object p1

    check-cast p1, Lcom/withpersona/sdk2/inquiry/permissions/state/PermissionRequestStateManager$e;

    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    invoke-virtual {p1, v0}, Lcom/withpersona/sdk2/inquiry/permissions/state/PermissionRequestStateManager$e;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
