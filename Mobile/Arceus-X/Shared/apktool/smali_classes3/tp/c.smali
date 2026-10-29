.class public final Ltp/c;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lft/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lft/i<",
            "Lcom/withpersona/sdk2/inquiry/permissions/state/PermissionRequestStateManager$c;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lft/i;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lft/i<",
            "Lcom/withpersona/sdk2/inquiry/permissions/state/PermissionRequestStateManager$c;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ltp/c;->a:Lft/i;

    return-void
.end method

.method public static a(Lft/i;)Ltp/c;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lft/i<",
            "Lcom/withpersona/sdk2/inquiry/permissions/state/PermissionRequestStateManager$c;",
            ">;)",
            "Ltp/c;"
        }
    .end annotation

    new-instance v0, Ltp/c;

    invoke-direct {v0, p0}, Ltp/c;-><init>(Lft/i;)V

    return-object v0
.end method

.method public static c(Landroidx/lifecycle/l0;Lcom/withpersona/sdk2/inquiry/permissions/state/PermissionRequestStateManager$c;)Lcom/withpersona/sdk2/inquiry/permissions/permissionRequest/c;
    .locals 1

    new-instance v0, Lcom/withpersona/sdk2/inquiry/permissions/permissionRequest/c;

    invoke-direct {v0, p0, p1}, Lcom/withpersona/sdk2/inquiry/permissions/permissionRequest/c;-><init>(Landroidx/lifecycle/l0;Lcom/withpersona/sdk2/inquiry/permissions/state/PermissionRequestStateManager$c;)V

    return-object v0
.end method


# virtual methods
.method public b(Landroidx/lifecycle/l0;)Lcom/withpersona/sdk2/inquiry/permissions/permissionRequest/c;
    .locals 1

    iget-object v0, p0, Ltp/c;->a:Lft/i;

    invoke-interface {v0}, Lht/a;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/withpersona/sdk2/inquiry/permissions/state/PermissionRequestStateManager$c;

    invoke-static {p1, v0}, Ltp/c;->c(Landroidx/lifecycle/l0;Lcom/withpersona/sdk2/inquiry/permissions/state/PermissionRequestStateManager$c;)Lcom/withpersona/sdk2/inquiry/permissions/permissionRequest/c;

    move-result-object p1

    return-object p1
.end method
