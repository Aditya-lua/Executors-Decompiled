.class public final Lcom/withpersona/sdk2/inquiry/permissions/permissionRequest/PermissionRequestFragment$d$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lnu/i;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/withpersona/sdk2/inquiry/permissions/permissionRequest/PermissionRequestFragment$d;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lnu/i;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field public final synthetic a:Lcom/withpersona/sdk2/inquiry/permissions/state/PermissionRequestStateManager;

.field public final synthetic b:Lcom/withpersona/sdk2/inquiry/permissions/permissionRequest/PermissionRequestFragment;


# direct methods
.method public constructor <init>(Lcom/withpersona/sdk2/inquiry/permissions/state/PermissionRequestStateManager;Lcom/withpersona/sdk2/inquiry/permissions/permissionRequest/PermissionRequestFragment;)V
    .locals 0

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/permissions/permissionRequest/PermissionRequestFragment$d$a;->a:Lcom/withpersona/sdk2/inquiry/permissions/state/PermissionRequestStateManager;

    iput-object p2, p0, Lcom/withpersona/sdk2/inquiry/permissions/permissionRequest/PermissionRequestFragment$d$a;->b:Lcom/withpersona/sdk2/inquiry/permissions/permissionRequest/PermissionRequestFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final b(Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$Output;Lnt/b;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$Output;",
            "Lnt/b<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    if-nez p1, :cond_0

    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p1

    :cond_0
    iget-object p2, p0, Lcom/withpersona/sdk2/inquiry/permissions/permissionRequest/PermissionRequestFragment$d$a;->a:Lcom/withpersona/sdk2/inquiry/permissions/state/PermissionRequestStateManager;

    invoke-virtual {p2}, Lvr/c;->a()Lnu/c0;

    move-result-object p2

    const/4 v0, 0x0

    invoke-interface {p2, v0}, Lnu/c0;->setValue(Ljava/lang/Object;)V

    iget-object p2, p0, Lcom/withpersona/sdk2/inquiry/permissions/permissionRequest/PermissionRequestFragment$d$a;->b:Lcom/withpersona/sdk2/inquiry/permissions/permissionRequest/PermissionRequestFragment;

    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    iget-object v1, p0, Lcom/withpersona/sdk2/inquiry/permissions/permissionRequest/PermissionRequestFragment$d$a;->b:Lcom/withpersona/sdk2/inquiry/permissions/permissionRequest/PermissionRequestFragment;

    new-instance v2, Lcom/withpersona/sdk2/inquiry/permissions/permissionRequest/PermissionRequestFragment$PermissionRequestFragmentResult;

    invoke-static {v1}, Lcom/withpersona/sdk2/inquiry/permissions/permissionRequest/PermissionRequestFragment;->k2(Lcom/withpersona/sdk2/inquiry/permissions/permissionRequest/PermissionRequestFragment;)Lcom/withpersona/sdk2/inquiry/permissions/permissionRequest/PermissionRequestFragment$PermissionRequestFragmentArgs;

    move-result-object v1

    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/permissions/permissionRequest/PermissionRequestFragment$PermissionRequestFragmentArgs;->f()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$Output;->a()Lcom/withpersona/sdk2/inquiry/permissions/PermissionState;

    move-result-object p1

    invoke-direct {v2, v1, p1}, Lcom/withpersona/sdk2/inquiry/permissions/permissionRequest/PermissionRequestFragment$PermissionRequestFragmentResult;-><init>(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/permissions/PermissionState;)V

    const-string p1, "pi2_result"

    invoke-virtual {v0, p1, v2}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    const-string p1, "pi2_permission_request_request"

    invoke-static {p2, p1, v0}, Le4/u;->a(Landroidx/fragment/app/c;Ljava/lang/String;Landroid/os/Bundle;)V

    iget-object p1, p0, Lcom/withpersona/sdk2/inquiry/permissions/permissionRequest/PermissionRequestFragment$d$a;->b:Lcom/withpersona/sdk2/inquiry/permissions/permissionRequest/PermissionRequestFragment;

    invoke-virtual {p1}, Landroidx/fragment/app/c;->M()Landroidx/fragment/app/FragmentManager;

    move-result-object p1

    const-string p2, "getParentFragmentManager(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p2, p0, Lcom/withpersona/sdk2/inquiry/permissions/permissionRequest/PermissionRequestFragment$d$a;->b:Lcom/withpersona/sdk2/inquiry/permissions/permissionRequest/PermissionRequestFragment;

    invoke-virtual {p1}, Landroidx/fragment/app/FragmentManager;->r()Landroidx/fragment/app/h;

    move-result-object p1

    invoke-virtual {p1, p2}, Landroidx/fragment/app/h;->m(Landroidx/fragment/app/c;)Landroidx/fragment/app/h;

    invoke-virtual {p1}, Landroidx/fragment/app/h;->g()I

    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p1
.end method

.method public bridge synthetic emit(Ljava/lang/Object;Lnt/b;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$Output;

    invoke-virtual {p0, p1, p2}, Lcom/withpersona/sdk2/inquiry/permissions/permissionRequest/PermissionRequestFragment$d$a;->b(Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$Output;Lnt/b;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
