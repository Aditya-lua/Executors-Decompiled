.class public final Ltp/d;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lft/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lft/i<",
            "Lcom/withpersona/sdk2/inquiry/permissions/permissionRequest/g;",
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
            "Lcom/withpersona/sdk2/inquiry/permissions/permissionRequest/g;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ltp/d;->a:Lft/i;

    return-void
.end method

.method public static a(Lft/i;)Ltp/d;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lft/i<",
            "Lcom/withpersona/sdk2/inquiry/permissions/permissionRequest/g;",
            ">;)",
            "Ltp/d;"
        }
    .end annotation

    new-instance v0, Ltp/d;

    invoke-direct {v0, p0}, Ltp/d;-><init>(Lft/i;)V

    return-object v0
.end method

.method public static c(Lcom/withpersona/sdk2/inquiry/permissions/permissionRequest/g;Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$Props;)Lcom/withpersona/sdk2/inquiry/permissions/permissionRequest/e;
    .locals 1

    new-instance v0, Lcom/withpersona/sdk2/inquiry/permissions/permissionRequest/e;

    invoke-direct {v0, p0, p1}, Lcom/withpersona/sdk2/inquiry/permissions/permissionRequest/e;-><init>(Lcom/withpersona/sdk2/inquiry/permissions/permissionRequest/g;Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$Props;)V

    return-object v0
.end method


# virtual methods
.method public b(Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$Props;)Lcom/withpersona/sdk2/inquiry/permissions/permissionRequest/e;
    .locals 1

    iget-object v0, p0, Ltp/d;->a:Lft/i;

    invoke-interface {v0}, Lht/a;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/withpersona/sdk2/inquiry/permissions/permissionRequest/g;

    invoke-static {v0, p1}, Ltp/d;->c(Lcom/withpersona/sdk2/inquiry/permissions/permissionRequest/g;Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$Props;)Lcom/withpersona/sdk2/inquiry/permissions/permissionRequest/e;

    move-result-object p1

    return-object p1
.end method
