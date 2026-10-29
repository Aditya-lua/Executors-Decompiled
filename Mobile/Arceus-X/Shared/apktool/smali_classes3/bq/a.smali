.class public final Lbq/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lft/d;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lft/d<",
        "Lcom/withpersona/sdk2/inquiry/selfie/directFileUploader/DirectFileUploader;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:Lft/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lft/i<",
            "Landroidx/lifecycle/l0;",
            ">;"
        }
    .end annotation
.end field

.field public final b:Lft/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lft/i<",
            "Lcom/withpersona/sdk2/inquiry/network/upload/UploadService;",
            ">;"
        }
    .end annotation
.end field

.field public final c:Lft/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lft/i<",
            "Lku/p0;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lft/i;Lft/i;Lft/i;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lft/i<",
            "Landroidx/lifecycle/l0;",
            ">;",
            "Lft/i<",
            "Lcom/withpersona/sdk2/inquiry/network/upload/UploadService;",
            ">;",
            "Lft/i<",
            "Lku/p0;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lbq/a;->a:Lft/i;

    iput-object p2, p0, Lbq/a;->b:Lft/i;

    iput-object p3, p0, Lbq/a;->c:Lft/i;

    return-void
.end method

.method public static a(Lft/i;Lft/i;Lft/i;)Lbq/a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lft/i<",
            "Landroidx/lifecycle/l0;",
            ">;",
            "Lft/i<",
            "Lcom/withpersona/sdk2/inquiry/network/upload/UploadService;",
            ">;",
            "Lft/i<",
            "Lku/p0;",
            ">;)",
            "Lbq/a;"
        }
    .end annotation

    new-instance v0, Lbq/a;

    invoke-direct {v0, p0, p1, p2}, Lbq/a;-><init>(Lft/i;Lft/i;Lft/i;)V

    return-object v0
.end method

.method public static c(Landroidx/lifecycle/l0;Lcom/withpersona/sdk2/inquiry/network/upload/UploadService;Lku/p0;)Lcom/withpersona/sdk2/inquiry/selfie/directFileUploader/DirectFileUploader;
    .locals 1

    new-instance v0, Lcom/withpersona/sdk2/inquiry/selfie/directFileUploader/DirectFileUploader;

    invoke-direct {v0, p0, p1, p2}, Lcom/withpersona/sdk2/inquiry/selfie/directFileUploader/DirectFileUploader;-><init>(Landroidx/lifecycle/l0;Lcom/withpersona/sdk2/inquiry/network/upload/UploadService;Lku/p0;)V

    return-object v0
.end method


# virtual methods
.method public b()Lcom/withpersona/sdk2/inquiry/selfie/directFileUploader/DirectFileUploader;
    .locals 3

    iget-object v0, p0, Lbq/a;->a:Lft/i;

    invoke-interface {v0}, Lht/a;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/lifecycle/l0;

    iget-object v1, p0, Lbq/a;->b:Lft/i;

    invoke-interface {v1}, Lht/a;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/withpersona/sdk2/inquiry/network/upload/UploadService;

    iget-object v2, p0, Lbq/a;->c:Lft/i;

    invoke-interface {v2}, Lht/a;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lku/p0;

    invoke-static {v0, v1, v2}, Lbq/a;->c(Landroidx/lifecycle/l0;Lcom/withpersona/sdk2/inquiry/network/upload/UploadService;Lku/p0;)Lcom/withpersona/sdk2/inquiry/selfie/directFileUploader/DirectFileUploader;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lbq/a;->b()Lcom/withpersona/sdk2/inquiry/selfie/directFileUploader/DirectFileUploader;

    move-result-object v0

    return-object v0
.end method
