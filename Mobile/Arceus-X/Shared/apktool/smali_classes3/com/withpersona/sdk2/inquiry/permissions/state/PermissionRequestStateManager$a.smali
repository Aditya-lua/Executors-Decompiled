.class public final Lcom/withpersona/sdk2/inquiry/permissions/state/PermissionRequestStateManager$a;
.super Lpt/m;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/withpersona/sdk2/inquiry/permissions/state/PermissionRequestStateManager;-><init>(Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$Props;Landroidx/lifecycle/l0;Landroid/content/Context;Lcom/withpersona/sdk2/inquiry/permissions/d$a;Lcom/withpersona/sdk2/inquiry/permissions/a$a;Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;Lku/p0;)V
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
    c = "com.withpersona.sdk2.inquiry.permissions.state.PermissionRequestStateManager$1$1"
    f = "PermissionRequestStateManager.kt"
    l = {}
    m = "invokeSuspend"
.end annotation


# instance fields
.field public t:I

.field public final synthetic u:Lcom/withpersona/sdk2/inquiry/permissions/state/PermissionRequestStateManager;

.field public final synthetic v:Lcom/withpersona/sdk2/inquiry/permissions/state/PermissionRequestStateManager$PermissionRequestState;


# direct methods
.method public constructor <init>(Lcom/withpersona/sdk2/inquiry/permissions/state/PermissionRequestStateManager;Lcom/withpersona/sdk2/inquiry/permissions/state/PermissionRequestStateManager$PermissionRequestState;Lnt/b;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/withpersona/sdk2/inquiry/permissions/state/PermissionRequestStateManager;",
            "Lcom/withpersona/sdk2/inquiry/permissions/state/PermissionRequestStateManager$PermissionRequestState;",
            "Lnt/b<",
            "-",
            "Lcom/withpersona/sdk2/inquiry/permissions/state/PermissionRequestStateManager$a;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/permissions/state/PermissionRequestStateManager$a;->u:Lcom/withpersona/sdk2/inquiry/permissions/state/PermissionRequestStateManager;

    iput-object p2, p0, Lcom/withpersona/sdk2/inquiry/permissions/state/PermissionRequestStateManager$a;->v:Lcom/withpersona/sdk2/inquiry/permissions/state/PermissionRequestStateManager$PermissionRequestState;

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

    new-instance p1, Lcom/withpersona/sdk2/inquiry/permissions/state/PermissionRequestStateManager$a;

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/permissions/state/PermissionRequestStateManager$a;->u:Lcom/withpersona/sdk2/inquiry/permissions/state/PermissionRequestStateManager;

    iget-object v1, p0, Lcom/withpersona/sdk2/inquiry/permissions/state/PermissionRequestStateManager$a;->v:Lcom/withpersona/sdk2/inquiry/permissions/state/PermissionRequestStateManager$PermissionRequestState;

    invoke-direct {p1, v0, v1, p2}, Lcom/withpersona/sdk2/inquiry/permissions/state/PermissionRequestStateManager$a;-><init>(Lcom/withpersona/sdk2/inquiry/permissions/state/PermissionRequestStateManager;Lcom/withpersona/sdk2/inquiry/permissions/state/PermissionRequestStateManager$PermissionRequestState;Lnt/b;)V

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lku/p0;

    check-cast p2, Lnt/b;

    invoke-virtual {p0, p1, p2}, Lcom/withpersona/sdk2/inquiry/permissions/state/PermissionRequestStateManager$a;->invoke(Lku/p0;Lnt/b;)Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, Lcom/withpersona/sdk2/inquiry/permissions/state/PermissionRequestStateManager$a;->create(Ljava/lang/Object;Lnt/b;)Lnt/b;

    move-result-object p1

    check-cast p1, Lcom/withpersona/sdk2/inquiry/permissions/state/PermissionRequestStateManager$a;

    sget-object p2, Lkotlin/Unit;->a:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcom/withpersona/sdk2/inquiry/permissions/state/PermissionRequestStateManager$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    invoke-static {}, Lot/c;->e()Ljava/lang/Object;

    iget v0, p0, Lcom/withpersona/sdk2/inquiry/permissions/state/PermissionRequestStateManager$a;->t:I

    if-nez v0, :cond_0

    invoke-static {p1}, Ljt/o;->b(Ljava/lang/Object;)V

    iget-object p1, p0, Lcom/withpersona/sdk2/inquiry/permissions/state/PermissionRequestStateManager$a;->u:Lcom/withpersona/sdk2/inquiry/permissions/state/PermissionRequestStateManager;

    invoke-virtual {p1}, Lvr/c;->b()Lnu/c0;

    move-result-object v0

    invoke-interface {v0}, Lnu/c0;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$Props;

    iget-object v1, p0, Lcom/withpersona/sdk2/inquiry/permissions/state/PermissionRequestStateManager$a;->v:Lcom/withpersona/sdk2/inquiry/permissions/state/PermissionRequestStateManager$PermissionRequestState;

    invoke-static {p1, v0, v1}, Lcom/withpersona/sdk2/inquiry/permissions/state/PermissionRequestStateManager;->u(Lcom/withpersona/sdk2/inquiry/permissions/state/PermissionRequestStateManager;Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$Props;Lcom/withpersona/sdk2/inquiry/permissions/state/PermissionRequestStateManager$PermissionRequestState;)V

    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
