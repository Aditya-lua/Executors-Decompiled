.class public final Lgp/t;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lft/d;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lft/d<",
        "Lcom/withpersona/sdk2/inquiry/network/upload/UploadService;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:Lcom/withpersona/sdk2/inquiry/internal/network/f;

.field public final b:Lft/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lft/i<",
            "Ljv/y;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/withpersona/sdk2/inquiry/internal/network/f;Lft/i;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/withpersona/sdk2/inquiry/internal/network/f;",
            "Lft/i<",
            "Ljv/y;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lgp/t;->a:Lcom/withpersona/sdk2/inquiry/internal/network/f;

    iput-object p2, p0, Lgp/t;->b:Lft/i;

    return-void
.end method

.method public static a(Lcom/withpersona/sdk2/inquiry/internal/network/f;Lft/i;)Lgp/t;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/withpersona/sdk2/inquiry/internal/network/f;",
            "Lft/i<",
            "Ljv/y;",
            ">;)",
            "Lgp/t;"
        }
    .end annotation

    new-instance v0, Lgp/t;

    invoke-direct {v0, p0, p1}, Lgp/t;-><init>(Lcom/withpersona/sdk2/inquiry/internal/network/f;Lft/i;)V

    return-object v0
.end method

.method public static c(Lcom/withpersona/sdk2/inquiry/internal/network/f;Ljv/y;)Lcom/withpersona/sdk2/inquiry/network/upload/UploadService;
    .locals 0

    invoke-virtual {p0, p1}, Lcom/withpersona/sdk2/inquiry/internal/network/f;->o(Ljv/y;)Lcom/withpersona/sdk2/inquiry/network/upload/UploadService;

    move-result-object p0

    invoke-static {p0}, Lft/h;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/withpersona/sdk2/inquiry/network/upload/UploadService;

    return-object p0
.end method


# virtual methods
.method public b()Lcom/withpersona/sdk2/inquiry/network/upload/UploadService;
    .locals 2

    iget-object v0, p0, Lgp/t;->a:Lcom/withpersona/sdk2/inquiry/internal/network/f;

    iget-object v1, p0, Lgp/t;->b:Lft/i;

    invoke-interface {v1}, Lht/a;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljv/y;

    invoke-static {v0, v1}, Lgp/t;->c(Lcom/withpersona/sdk2/inquiry/internal/network/f;Ljv/y;)Lcom/withpersona/sdk2/inquiry/network/upload/UploadService;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lgp/t;->b()Lcom/withpersona/sdk2/inquiry/network/upload/UploadService;

    move-result-object v0

    return-object v0
.end method
