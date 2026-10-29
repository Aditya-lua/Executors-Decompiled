.class public final Lcom/withpersona/sdk2/inquiry/permissions/permissionRequest/PermissionRequestFragment$d;
.super Lpt/m;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/withpersona/sdk2/inquiry/permissions/permissionRequest/PermissionRequestFragment;->e1(Landroid/view/View;Landroid/os/Bundle;)V
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
    c = "com.withpersona.sdk2.inquiry.permissions.permissionRequest.PermissionRequestFragment$onViewCreated$2"
    f = "PermissionRequestFragment.kt"
    l = {
        0x60
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field public t:I

.field public final synthetic u:Lcom/withpersona/sdk2/inquiry/permissions/state/PermissionRequestStateManager;

.field public final synthetic v:Lcom/withpersona/sdk2/inquiry/permissions/permissionRequest/PermissionRequestFragment;


# direct methods
.method public constructor <init>(Lcom/withpersona/sdk2/inquiry/permissions/state/PermissionRequestStateManager;Lcom/withpersona/sdk2/inquiry/permissions/permissionRequest/PermissionRequestFragment;Lnt/b;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/withpersona/sdk2/inquiry/permissions/state/PermissionRequestStateManager;",
            "Lcom/withpersona/sdk2/inquiry/permissions/permissionRequest/PermissionRequestFragment;",
            "Lnt/b<",
            "-",
            "Lcom/withpersona/sdk2/inquiry/permissions/permissionRequest/PermissionRequestFragment$d;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/permissions/permissionRequest/PermissionRequestFragment$d;->u:Lcom/withpersona/sdk2/inquiry/permissions/state/PermissionRequestStateManager;

    iput-object p2, p0, Lcom/withpersona/sdk2/inquiry/permissions/permissionRequest/PermissionRequestFragment$d;->v:Lcom/withpersona/sdk2/inquiry/permissions/permissionRequest/PermissionRequestFragment;

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

    new-instance p1, Lcom/withpersona/sdk2/inquiry/permissions/permissionRequest/PermissionRequestFragment$d;

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/permissions/permissionRequest/PermissionRequestFragment$d;->u:Lcom/withpersona/sdk2/inquiry/permissions/state/PermissionRequestStateManager;

    iget-object v1, p0, Lcom/withpersona/sdk2/inquiry/permissions/permissionRequest/PermissionRequestFragment$d;->v:Lcom/withpersona/sdk2/inquiry/permissions/permissionRequest/PermissionRequestFragment;

    invoke-direct {p1, v0, v1, p2}, Lcom/withpersona/sdk2/inquiry/permissions/permissionRequest/PermissionRequestFragment$d;-><init>(Lcom/withpersona/sdk2/inquiry/permissions/state/PermissionRequestStateManager;Lcom/withpersona/sdk2/inquiry/permissions/permissionRequest/PermissionRequestFragment;Lnt/b;)V

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lku/p0;

    check-cast p2, Lnt/b;

    invoke-virtual {p0, p1, p2}, Lcom/withpersona/sdk2/inquiry/permissions/permissionRequest/PermissionRequestFragment$d;->invoke(Lku/p0;Lnt/b;)Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, Lcom/withpersona/sdk2/inquiry/permissions/permissionRequest/PermissionRequestFragment$d;->create(Ljava/lang/Object;Lnt/b;)Lnt/b;

    move-result-object p1

    check-cast p1, Lcom/withpersona/sdk2/inquiry/permissions/permissionRequest/PermissionRequestFragment$d;

    sget-object p2, Lkotlin/Unit;->a:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcom/withpersona/sdk2/inquiry/permissions/permissionRequest/PermissionRequestFragment$d;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    invoke-static {}, Lot/c;->e()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Lcom/withpersona/sdk2/inquiry/permissions/permissionRequest/PermissionRequestFragment$d;->t:I

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

    iget-object p1, p0, Lcom/withpersona/sdk2/inquiry/permissions/permissionRequest/PermissionRequestFragment$d;->u:Lcom/withpersona/sdk2/inquiry/permissions/state/PermissionRequestStateManager;

    invoke-virtual {p1}, Lvr/c;->a()Lnu/c0;

    move-result-object p1

    new-instance v1, Lcom/withpersona/sdk2/inquiry/permissions/permissionRequest/PermissionRequestFragment$d$a;

    iget-object v3, p0, Lcom/withpersona/sdk2/inquiry/permissions/permissionRequest/PermissionRequestFragment$d;->u:Lcom/withpersona/sdk2/inquiry/permissions/state/PermissionRequestStateManager;

    iget-object v4, p0, Lcom/withpersona/sdk2/inquiry/permissions/permissionRequest/PermissionRequestFragment$d;->v:Lcom/withpersona/sdk2/inquiry/permissions/permissionRequest/PermissionRequestFragment;

    invoke-direct {v1, v3, v4}, Lcom/withpersona/sdk2/inquiry/permissions/permissionRequest/PermissionRequestFragment$d$a;-><init>(Lcom/withpersona/sdk2/inquiry/permissions/state/PermissionRequestStateManager;Lcom/withpersona/sdk2/inquiry/permissions/permissionRequest/PermissionRequestFragment;)V

    iput v2, p0, Lcom/withpersona/sdk2/inquiry/permissions/permissionRequest/PermissionRequestFragment$d;->t:I

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
