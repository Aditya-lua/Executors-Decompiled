.class public final Lcom/withpersona/sdk2/inquiry/permissions/permissionRequest/PermissionRequestFragment$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/withpersona/sdk2/inquiry/permissions/permissionRequest/PermissionRequestFragment;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0003\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J-\u0010\r\u001a\u00020\u000c2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00082\u0006\u0010\u000b\u001a\u00020\n\u00a2\u0006\u0004\u0008\r\u0010\u000e\u00a8\u0006\u000f"
    }
    d2 = {
        "Lcom/withpersona/sdk2/inquiry/permissions/permissionRequest/PermissionRequestFragment$b;",
        "",
        "<init>",
        "()V",
        "Landroidx/fragment/app/FragmentManager;",
        "fragmentManager",
        "",
        "viewId",
        "",
        "requestId",
        "Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$Props;",
        "props",
        "",
        "a",
        "(Landroidx/fragment/app/FragmentManager;ILjava/lang/String;Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$Props;)V",
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


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/withpersona/sdk2/inquiry/permissions/permissionRequest/PermissionRequestFragment$b;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Landroidx/fragment/app/FragmentManager;ILjava/lang/String;Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$Props;)V
    .locals 2
    .param p1    # Landroidx/fragment/app/FragmentManager;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p4    # Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$Props;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "fragmentManager"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "requestId"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "props"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Landroidx/fragment/app/FragmentManager;->r()Landroidx/fragment/app/h;

    move-result-object p1

    new-instance v0, Lcom/withpersona/sdk2/inquiry/permissions/permissionRequest/PermissionRequestFragment;

    invoke-direct {v0}, Lcom/withpersona/sdk2/inquiry/permissions/permissionRequest/PermissionRequestFragment;-><init>()V

    new-instance v1, Lcom/withpersona/sdk2/inquiry/permissions/permissionRequest/PermissionRequestFragment$PermissionRequestFragmentArgs;

    invoke-direct {v1, p3, p4}, Lcom/withpersona/sdk2/inquiry/permissions/permissionRequest/PermissionRequestFragment$PermissionRequestFragmentArgs;-><init>(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$Props;)V

    invoke-static {v0, v1}, Lkq/b;->a(Lkq/a;Landroid/os/Parcelable;)Lkq/a;

    move-result-object p3

    const-string p4, "Pi2PermissionRequestFragment"

    invoke-virtual {p1, p2, p3, p4}, Landroidx/fragment/app/h;->b(ILandroidx/fragment/app/c;Ljava/lang/String;)Landroidx/fragment/app/h;

    invoke-virtual {p1}, Landroidx/fragment/app/h;->i()V

    return-void
.end method
