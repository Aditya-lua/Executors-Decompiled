.class public final Lcom/withpersona/sdk2/inquiry/network/core/NetworkCoreModule_RetrofitFactory;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lwt/d;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lwt/d<",
        "Lsw/y;",
        ">;"
    }
.end annotation


# instance fields
.field private final module:Lcom/withpersona/sdk2/inquiry/network/core/NetworkCoreModule;

.field private final moshiProvider:Lwt/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lwt/i<",
            "Lhn/w;",
            ">;"
        }
    .end annotation
.end field

.field private final okHttpClientProvider:Lwt/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lwt/i<",
            "Lmv/d0;",
            ">;"
        }
    .end annotation
.end field

.field private final serverEndpointProvider:Lwt/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lwt/i<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method private constructor <init>(Lcom/withpersona/sdk2/inquiry/network/core/NetworkCoreModule;Lwt/i;Lwt/i;Lwt/i;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/withpersona/sdk2/inquiry/network/core/NetworkCoreModule;",
            "Lwt/i<",
            "Ljava/lang/String;",
            ">;",
            "Lwt/i<",
            "Lmv/d0;",
            ">;",
            "Lwt/i<",
            "Lhn/w;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/network/core/NetworkCoreModule_RetrofitFactory;->module:Lcom/withpersona/sdk2/inquiry/network/core/NetworkCoreModule;

    iput-object p2, p0, Lcom/withpersona/sdk2/inquiry/network/core/NetworkCoreModule_RetrofitFactory;->serverEndpointProvider:Lwt/i;

    iput-object p3, p0, Lcom/withpersona/sdk2/inquiry/network/core/NetworkCoreModule_RetrofitFactory;->okHttpClientProvider:Lwt/i;

    iput-object p4, p0, Lcom/withpersona/sdk2/inquiry/network/core/NetworkCoreModule_RetrofitFactory;->moshiProvider:Lwt/i;

    return-void
.end method

.method public static create(Lcom/withpersona/sdk2/inquiry/network/core/NetworkCoreModule;Lwt/i;Lwt/i;Lwt/i;)Lcom/withpersona/sdk2/inquiry/network/core/NetworkCoreModule_RetrofitFactory;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/withpersona/sdk2/inquiry/network/core/NetworkCoreModule;",
            "Lwt/i<",
            "Ljava/lang/String;",
            ">;",
            "Lwt/i<",
            "Lmv/d0;",
            ">;",
            "Lwt/i<",
            "Lhn/w;",
            ">;)",
            "Lcom/withpersona/sdk2/inquiry/network/core/NetworkCoreModule_RetrofitFactory;"
        }
    .end annotation

    new-instance v0, Lcom/withpersona/sdk2/inquiry/network/core/NetworkCoreModule_RetrofitFactory;

    invoke-direct {v0, p0, p1, p2, p3}, Lcom/withpersona/sdk2/inquiry/network/core/NetworkCoreModule_RetrofitFactory;-><init>(Lcom/withpersona/sdk2/inquiry/network/core/NetworkCoreModule;Lwt/i;Lwt/i;Lwt/i;)V

    return-object v0
.end method

.method public static retrofit(Lcom/withpersona/sdk2/inquiry/network/core/NetworkCoreModule;Ljava/lang/String;Lmv/d0;Lhn/w;)Lsw/y;
    .locals 0

    invoke-virtual {p0, p1, p2, p3}, Lcom/withpersona/sdk2/inquiry/network/core/NetworkCoreModule;->retrofit(Ljava/lang/String;Lmv/d0;Lhn/w;)Lsw/y;

    move-result-object p0

    invoke-static {p0}, Lwt/h;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lsw/y;

    return-object p0
.end method


# virtual methods
.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/withpersona/sdk2/inquiry/network/core/NetworkCoreModule_RetrofitFactory;->get()Lsw/y;

    move-result-object v0

    return-object v0
.end method

.method public get()Lsw/y;
    .locals 4

    .line 2
    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/network/core/NetworkCoreModule_RetrofitFactory;->module:Lcom/withpersona/sdk2/inquiry/network/core/NetworkCoreModule;

    iget-object v1, p0, Lcom/withpersona/sdk2/inquiry/network/core/NetworkCoreModule_RetrofitFactory;->serverEndpointProvider:Lwt/i;

    invoke-interface {v1}, Lyt/a;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    iget-object v2, p0, Lcom/withpersona/sdk2/inquiry/network/core/NetworkCoreModule_RetrofitFactory;->okHttpClientProvider:Lwt/i;

    invoke-interface {v2}, Lyt/a;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lmv/d0;

    iget-object v3, p0, Lcom/withpersona/sdk2/inquiry/network/core/NetworkCoreModule_RetrofitFactory;->moshiProvider:Lwt/i;

    invoke-interface {v3}, Lyt/a;->get()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lhn/w;

    invoke-static {v0, v1, v2, v3}, Lcom/withpersona/sdk2/inquiry/network/core/NetworkCoreModule_RetrofitFactory;->retrofit(Lcom/withpersona/sdk2/inquiry/network/core/NetworkCoreModule;Ljava/lang/String;Lmv/d0;Lhn/w;)Lsw/y;

    move-result-object v0

    return-object v0
.end method
