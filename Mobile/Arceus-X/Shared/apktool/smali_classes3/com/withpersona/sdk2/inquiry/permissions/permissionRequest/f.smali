.class public final Lcom/withpersona/sdk2/inquiry/permissions/permissionRequest/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/withpersona/sdk2/inquiry/permissions/permissionRequest/e$a;


# instance fields
.field public final a:Ltp/d;


# direct methods
.method public constructor <init>(Ltp/d;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/permissions/permissionRequest/f;->a:Ltp/d;

    return-void
.end method

.method public static b(Ltp/d;)Lft/i;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ltp/d;",
            ")",
            "Lft/i<",
            "Lcom/withpersona/sdk2/inquiry/permissions/permissionRequest/e$a;",
            ">;"
        }
    .end annotation

    new-instance v0, Lcom/withpersona/sdk2/inquiry/permissions/permissionRequest/f;

    invoke-direct {v0, p0}, Lcom/withpersona/sdk2/inquiry/permissions/permissionRequest/f;-><init>(Ltp/d;)V

    invoke-static {v0}, Lft/e;->a(Ljava/lang/Object;)Lft/d;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public a(Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$Props;)Lcom/withpersona/sdk2/inquiry/permissions/permissionRequest/e;
    .locals 1

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/permissions/permissionRequest/f;->a:Ltp/d;

    invoke-virtual {v0, p1}, Ltp/d;->b(Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$Props;)Lcom/withpersona/sdk2/inquiry/permissions/permissionRequest/e;

    move-result-object p1

    return-object p1
.end method
