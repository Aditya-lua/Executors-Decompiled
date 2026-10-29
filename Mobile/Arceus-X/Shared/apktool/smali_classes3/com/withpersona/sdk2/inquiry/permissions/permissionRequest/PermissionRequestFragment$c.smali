.class public final Lcom/withpersona/sdk2/inquiry/permissions/permissionRequest/PermissionRequestFragment$c;
.super Le/m0;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/withpersona/sdk2/inquiry/permissions/permissionRequest/PermissionRequestFragment;->e1(Landroid/view/View;Landroid/os/Bundle;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0003*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\u0008\u0003\u0010\u0004\u00a8\u0006\u0005"
    }
    d2 = {
        "com/withpersona/sdk2/inquiry/permissions/permissionRequest/PermissionRequestFragment$c",
        "Le/m0;",
        "",
        "handleOnBackPressed",
        "()V",
        "permissions_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field public final synthetic X:Lcom/withpersona/sdk2/inquiry/permissions/state/PermissionRequestStateManager;

.field public final synthetic Y:Lcom/withpersona/sdk2/inquiry/permissions/permissionRequest/PermissionRequestFragment;


# direct methods
.method public constructor <init>(Lcom/withpersona/sdk2/inquiry/permissions/state/PermissionRequestStateManager;Lcom/withpersona/sdk2/inquiry/permissions/permissionRequest/PermissionRequestFragment;)V
    .locals 0

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/permissions/permissionRequest/PermissionRequestFragment$c;->X:Lcom/withpersona/sdk2/inquiry/permissions/state/PermissionRequestStateManager;

    iput-object p2, p0, Lcom/withpersona/sdk2/inquiry/permissions/permissionRequest/PermissionRequestFragment$c;->Y:Lcom/withpersona/sdk2/inquiry/permissions/permissionRequest/PermissionRequestFragment;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Le/m0;-><init>(Z)V

    return-void
.end method


# virtual methods
.method public handleOnBackPressed()V
    .locals 5

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/permissions/permissionRequest/PermissionRequestFragment$c;->X:Lcom/withpersona/sdk2/inquiry/permissions/state/PermissionRequestStateManager;

    invoke-virtual {v0}, Lvr/c;->a()Lnu/c0;

    move-result-object v0

    new-instance v1, Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$Output;

    new-instance v2, Lcom/withpersona/sdk2/inquiry/permissions/PermissionState;

    iget-object v3, p0, Lcom/withpersona/sdk2/inquiry/permissions/permissionRequest/PermissionRequestFragment$c;->Y:Lcom/withpersona/sdk2/inquiry/permissions/permissionRequest/PermissionRequestFragment;

    invoke-static {v3}, Lcom/withpersona/sdk2/inquiry/permissions/permissionRequest/PermissionRequestFragment;->k2(Lcom/withpersona/sdk2/inquiry/permissions/permissionRequest/PermissionRequestFragment;)Lcom/withpersona/sdk2/inquiry/permissions/permissionRequest/PermissionRequestFragment$PermissionRequestFragmentArgs;

    move-result-object v3

    invoke-virtual {v3}, Lcom/withpersona/sdk2/inquiry/permissions/permissionRequest/PermissionRequestFragment$PermissionRequestFragmentArgs;->a()Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$Props;

    move-result-object v3

    invoke-virtual {v3}, Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$Props;->k()Lrp/i0;

    move-result-object v3

    sget-object v4, Lrp/j1;->b:Lrp/j1;

    invoke-direct {v2, v3, v4}, Lcom/withpersona/sdk2/inquiry/permissions/PermissionState;-><init>(Lrp/i0;Lrp/j1;)V

    invoke-direct {v1, v2}, Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$Output;-><init>(Lcom/withpersona/sdk2/inquiry/permissions/PermissionState;)V

    invoke-interface {v0, v1}, Lnu/c0;->setValue(Ljava/lang/Object;)V

    return-void
.end method
