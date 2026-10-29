.class public final Lcom/withpersona/sdk2/inquiry/permissions/permissionRequest/c;
.super Landroidx/lifecycle/x0;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/withpersona/sdk2/inquiry/permissions/permissionRequest/c$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u000b\u0018\u00002\u00020\u0001:\u0001\u0014B\u001b\u0008\u0001\u0012\u0008\u0008\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\u000b\u0010\u000cR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\r\u0010\u000eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000f\u0010\u0010R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0011\u0010\u0012\u00a8\u0006\u0015"
    }
    d2 = {
        "Lcom/withpersona/sdk2/inquiry/permissions/permissionRequest/c;",
        "Landroidx/lifecycle/x0;",
        "Landroidx/lifecycle/l0;",
        "savedStateHandle",
        "Lcom/withpersona/sdk2/inquiry/permissions/state/PermissionRequestStateManager$c;",
        "permissionRequestStateManagerFactory",
        "<init>",
        "(Landroidx/lifecycle/l0;Lcom/withpersona/sdk2/inquiry/permissions/state/PermissionRequestStateManager$c;)V",
        "Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$Props;",
        "props",
        "Lcom/withpersona/sdk2/inquiry/permissions/state/PermissionRequestStateManager;",
        "e",
        "(Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$Props;)Lcom/withpersona/sdk2/inquiry/permissions/state/PermissionRequestStateManager;",
        "b",
        "Landroidx/lifecycle/l0;",
        "c",
        "Lcom/withpersona/sdk2/inquiry/permissions/state/PermissionRequestStateManager$c;",
        "d",
        "Lcom/withpersona/sdk2/inquiry/permissions/state/PermissionRequestStateManager;",
        "permissionRequestStateManager",
        "a",
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
.field public final b:Landroidx/lifecycle/l0;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final c:Lcom/withpersona/sdk2/inquiry/permissions/state/PermissionRequestStateManager$c;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public d:Lcom/withpersona/sdk2/inquiry/permissions/state/PermissionRequestStateManager;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroidx/lifecycle/l0;Lcom/withpersona/sdk2/inquiry/permissions/state/PermissionRequestStateManager$c;)V
    .locals 1
    .param p1    # Landroidx/lifecycle/l0;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lcom/withpersona/sdk2/inquiry/permissions/state/PermissionRequestStateManager$c;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "savedStateHandle"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "permissionRequestStateManagerFactory"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Landroidx/lifecycle/x0;-><init>()V

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/permissions/permissionRequest/c;->b:Landroidx/lifecycle/l0;

    iput-object p2, p0, Lcom/withpersona/sdk2/inquiry/permissions/permissionRequest/c;->c:Lcom/withpersona/sdk2/inquiry/permissions/state/PermissionRequestStateManager$c;

    return-void
.end method


# virtual methods
.method public final e(Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$Props;)Lcom/withpersona/sdk2/inquiry/permissions/state/PermissionRequestStateManager;
    .locals 2
    .param p1    # Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$Props;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "props"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/permissions/permissionRequest/c;->d:Lcom/withpersona/sdk2/inquiry/permissions/state/PermissionRequestStateManager;

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/permissions/permissionRequest/c;->c:Lcom/withpersona/sdk2/inquiry/permissions/state/PermissionRequestStateManager$c;

    iget-object v1, p0, Lcom/withpersona/sdk2/inquiry/permissions/permissionRequest/c;->b:Landroidx/lifecycle/l0;

    invoke-interface {v0, p1, v1}, Lcom/withpersona/sdk2/inquiry/permissions/state/PermissionRequestStateManager$c;->a(Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$Props;Landroidx/lifecycle/l0;)Lcom/withpersona/sdk2/inquiry/permissions/state/PermissionRequestStateManager;

    move-result-object p1

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/permissions/permissionRequest/c;->d:Lcom/withpersona/sdk2/inquiry/permissions/state/PermissionRequestStateManager;

    return-object p1

    :cond_0
    return-object v0
.end method
