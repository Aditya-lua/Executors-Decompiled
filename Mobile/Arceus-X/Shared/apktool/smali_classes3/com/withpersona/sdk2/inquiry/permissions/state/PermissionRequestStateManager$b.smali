.class public final Lcom/withpersona/sdk2/inquiry/permissions/state/PermissionRequestStateManager$b;
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
    c = "com.withpersona.sdk2.inquiry.permissions.state.PermissionRequestStateManager$2"
    f = "PermissionRequestStateManager.kt"
    l = {
        0x50
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field public t:I

.field public final synthetic u:Lcom/withpersona/sdk2/inquiry/permissions/state/PermissionRequestStateManager;


# direct methods
.method public constructor <init>(Lcom/withpersona/sdk2/inquiry/permissions/state/PermissionRequestStateManager;Lnt/b;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/withpersona/sdk2/inquiry/permissions/state/PermissionRequestStateManager;",
            "Lnt/b<",
            "-",
            "Lcom/withpersona/sdk2/inquiry/permissions/state/PermissionRequestStateManager$b;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/permissions/state/PermissionRequestStateManager$b;->u:Lcom/withpersona/sdk2/inquiry/permissions/state/PermissionRequestStateManager;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Lpt/m;-><init>(ILnt/b;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lnt/b;)Lnt/b;
    .locals 1
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

    new-instance p1, Lcom/withpersona/sdk2/inquiry/permissions/state/PermissionRequestStateManager$b;

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/permissions/state/PermissionRequestStateManager$b;->u:Lcom/withpersona/sdk2/inquiry/permissions/state/PermissionRequestStateManager;

    invoke-direct {p1, v0, p2}, Lcom/withpersona/sdk2/inquiry/permissions/state/PermissionRequestStateManager$b;-><init>(Lcom/withpersona/sdk2/inquiry/permissions/state/PermissionRequestStateManager;Lnt/b;)V

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lku/p0;

    check-cast p2, Lnt/b;

    invoke-virtual {p0, p1, p2}, Lcom/withpersona/sdk2/inquiry/permissions/state/PermissionRequestStateManager$b;->invoke(Lku/p0;Lnt/b;)Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, Lcom/withpersona/sdk2/inquiry/permissions/state/PermissionRequestStateManager$b;->create(Ljava/lang/Object;Lnt/b;)Lnt/b;

    move-result-object p1

    check-cast p1, Lcom/withpersona/sdk2/inquiry/permissions/state/PermissionRequestStateManager$b;

    sget-object p2, Lkotlin/Unit;->a:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcom/withpersona/sdk2/inquiry/permissions/state/PermissionRequestStateManager$b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    invoke-static {}, Lot/c;->e()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Lcom/withpersona/sdk2/inquiry/permissions/state/PermissionRequestStateManager$b;->t:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-eq v1, v2, :cond_0

    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_0
    invoke-static {p1}, Ljt/o;->b(Ljava/lang/Object;)V

    goto :goto_0

    :cond_1
    invoke-static {p1}, Ljt/o;->b(Ljava/lang/Object;)V

    iget-object p1, p0, Lcom/withpersona/sdk2/inquiry/permissions/state/PermissionRequestStateManager$b;->u:Lcom/withpersona/sdk2/inquiry/permissions/state/PermissionRequestStateManager;

    invoke-virtual {p1}, Lvr/c;->b()Lnu/c0;

    move-result-object p1

    new-instance v1, Lcom/withpersona/sdk2/inquiry/permissions/state/PermissionRequestStateManager$b$a;

    iget-object v3, p0, Lcom/withpersona/sdk2/inquiry/permissions/state/PermissionRequestStateManager$b;->u:Lcom/withpersona/sdk2/inquiry/permissions/state/PermissionRequestStateManager;

    invoke-direct {v1, v3}, Lcom/withpersona/sdk2/inquiry/permissions/state/PermissionRequestStateManager$b$a;-><init>(Lcom/withpersona/sdk2/inquiry/permissions/state/PermissionRequestStateManager;)V

    iput v2, p0, Lcom/withpersona/sdk2/inquiry/permissions/state/PermissionRequestStateManager$b;->t:I

    invoke-interface {p1, v1, p0}, Lnu/g0;->collect(Lnu/i;Lnt/b;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    :goto_0
    new-instance p1, Ljt/d;

    invoke-direct {p1}, Ljt/d;-><init>()V

    throw p1
.end method
