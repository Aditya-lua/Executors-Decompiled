.class public final Lcom/withpersona/sdk2/inquiry/permissions/permissionRequest/g;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/withpersona/sdk2/inquiry/permissions/permissionRequest/g$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0008\u0008\u0007\u0018\u0000 \u00112\u00020\u0001:\u0001\u0013B\t\u0008\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J%\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u001f\u0010\u0011\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0007\u00a2\u0006\u0004\u0008\u0011\u0010\u0012R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0013\u0010\u0014R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0015\u0010\u0016\u00a8\u0006\u0017"
    }
    d2 = {
        "Lcom/withpersona/sdk2/inquiry/permissions/permissionRequest/g;",
        "",
        "<init>",
        "()V",
        "Landroidx/fragment/app/FragmentManager;",
        "fragmentManager",
        "",
        "viewId",
        "Landroidx/lifecycle/s;",
        "lifecycleOwner",
        "",
        "d",
        "(Landroidx/fragment/app/FragmentManager;ILandroidx/lifecycle/s;)V",
        "",
        "requestId",
        "Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$Props;",
        "props",
        "c",
        "(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$Props;)V",
        "a",
        "Landroidx/fragment/app/FragmentManager;",
        "b",
        "Ljava/lang/Integer;",
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


# static fields
.field public static final c:Lcom/withpersona/sdk2/inquiry/permissions/permissionRequest/g$a;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# instance fields
.field public a:Landroidx/fragment/app/FragmentManager;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field public b:Ljava/lang/Integer;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/withpersona/sdk2/inquiry/permissions/permissionRequest/g$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/withpersona/sdk2/inquiry/permissions/permissionRequest/g$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/withpersona/sdk2/inquiry/permissions/permissionRequest/g;->c:Lcom/withpersona/sdk2/inquiry/permissions/permissionRequest/g$a;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(Ljava/lang/String;Landroid/os/Bundle;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/withpersona/sdk2/inquiry/permissions/permissionRequest/g;->e(Ljava/lang/String;Landroid/os/Bundle;)V

    return-void
.end method

.method public static final synthetic b(Lcom/withpersona/sdk2/inquiry/permissions/permissionRequest/g;Landroidx/fragment/app/FragmentManager;)V
    .locals 0

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/permissions/permissionRequest/g;->a:Landroidx/fragment/app/FragmentManager;

    return-void
.end method

.method public static final e(Ljava/lang/String;Landroid/os/Bundle;)V
    .locals 1

    const-string v0, "requestKey"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p0, "result"

    invoke-static {p1, p0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p0, "pi2_result"

    const-class v0, Lcom/withpersona/sdk2/inquiry/permissions/permissionRequest/PermissionRequestFragment$PermissionRequestFragmentResult;

    invoke-static {p1, p0, v0}, Lu2/c;->a(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/withpersona/sdk2/inquiry/permissions/permissionRequest/PermissionRequestFragment$PermissionRequestFragmentResult;

    if-eqz p0, :cond_0

    new-instance p1, Lcom/withpersona/sdk2/inquiry/permissions/permissionRequest/b;

    invoke-direct {p1}, Lcom/withpersona/sdk2/inquiry/permissions/permissionRequest/b;-><init>()V

    invoke-virtual {p1, p0}, Lcom/withpersona/sdk2/inquiry/permissions/permissionRequest/b;->b(Lcom/withpersona/sdk2/inquiry/permissions/permissionRequest/PermissionRequestFragment$PermissionRequestFragmentResult;)Z

    :cond_0
    return-void
.end method


# virtual methods
.method public final c(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$Props;)V
    .locals 3
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$Props;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "requestId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "props"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/permissions/permissionRequest/g;->a:Landroidx/fragment/app/FragmentManager;

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object v1, p0, Lcom/withpersona/sdk2/inquiry/permissions/permissionRequest/g;->b:Ljava/lang/Integer;

    if-eqz v1, :cond_1

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    sget-object v2, Lcom/withpersona/sdk2/inquiry/permissions/permissionRequest/PermissionRequestFragment;->m0:Lcom/withpersona/sdk2/inquiry/permissions/permissionRequest/PermissionRequestFragment$b;

    invoke-virtual {v2, v0, v1, p1, p2}, Lcom/withpersona/sdk2/inquiry/permissions/permissionRequest/PermissionRequestFragment$b;->a(Landroidx/fragment/app/FragmentManager;ILjava/lang/String;Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$Props;)V

    :cond_1
    :goto_0
    return-void
.end method

.method public final d(Landroidx/fragment/app/FragmentManager;ILandroidx/lifecycle/s;)V
    .locals 1
    .param p1    # Landroidx/fragment/app/FragmentManager;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Landroidx/lifecycle/s;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "fragmentManager"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "lifecycleOwner"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/permissions/permissionRequest/g;->a:Landroidx/fragment/app/FragmentManager;

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    iput-object p2, p0, Lcom/withpersona/sdk2/inquiry/permissions/permissionRequest/g;->b:Ljava/lang/Integer;

    new-instance p2, Ltp/e;

    invoke-direct {p2}, Ltp/e;-><init>()V

    const-string v0, "pi2_permission_request_request"

    invoke-virtual {p1, v0, p3, p2}, Landroidx/fragment/app/FragmentManager;->t1(Ljava/lang/String;Landroidx/lifecycle/s;Le4/f0;)V

    invoke-interface {p3}, Landroidx/lifecycle/s;->a()Landroidx/lifecycle/l;

    move-result-object p1

    new-instance p2, Lcom/withpersona/sdk2/inquiry/permissions/permissionRequest/g$b;

    invoke-direct {p2, p0}, Lcom/withpersona/sdk2/inquiry/permissions/permissionRequest/g$b;-><init>(Lcom/withpersona/sdk2/inquiry/permissions/permissionRequest/g;)V

    invoke-virtual {p1, p2}, Landroidx/lifecycle/l;->a(Landroidx/lifecycle/r;)V

    return-void
.end method
