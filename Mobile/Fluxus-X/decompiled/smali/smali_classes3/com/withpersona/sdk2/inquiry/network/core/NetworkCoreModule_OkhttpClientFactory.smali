.class public final Lcom/withpersona/sdk2/inquiry/network/core/NetworkCoreModule_OkhttpClientFactory;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lwt/d;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lwt/d<",
        "Lmv/d0;",
        ">;"
    }
.end annotation


# instance fields
.field private final contextProvider:Lwt/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lwt/i<",
            "Landroid/content/Context;",
            ">;"
        }
    .end annotation
.end field

.field private final deviceInfoProvider:Lwt/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lwt/i<",
            "Lmo/b;",
            ">;"
        }
    .end annotation
.end field

.field private final deviceVendorIDProvider:Lwt/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lwt/i<",
            "Lmo/k;",
            ">;"
        }
    .end annotation
.end field

.field private final headersProvider:Lwt/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lwt/i<",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;>;"
        }
    .end annotation
.end field

.field private final interceptorsProvider:Lwt/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lwt/i<",
            "Ljava/util/Set<",
            "Lmv/a0;",
            ">;>;"
        }
    .end annotation
.end field

.field private final loggerFactoryProvider:Lwt/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lwt/i<",
            "Lbq/e$a;",
            ">;"
        }
    .end annotation
.end field

.field private final module:Lcom/withpersona/sdk2/inquiry/network/core/NetworkCoreModule;

.field private final networkStateManagerProvider:Lwt/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lwt/i<",
            "Lcom/withpersona/sdk2/inquiry/network/core/NetworkStateManager;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method private constructor <init>(Lcom/withpersona/sdk2/inquiry/network/core/NetworkCoreModule;Lwt/i;Lwt/i;Lwt/i;Lwt/i;Lwt/i;Lwt/i;Lwt/i;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/withpersona/sdk2/inquiry/network/core/NetworkCoreModule;",
            "Lwt/i<",
            "Ljava/util/Set<",
            "Lmv/a0;",
            ">;>;",
            "Lwt/i<",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;>;",
            "Lwt/i<",
            "Landroid/content/Context;",
            ">;",
            "Lwt/i<",
            "Lmo/k;",
            ">;",
            "Lwt/i<",
            "Lmo/b;",
            ">;",
            "Lwt/i<",
            "Lbq/e$a;",
            ">;",
            "Lwt/i<",
            "Lcom/withpersona/sdk2/inquiry/network/core/NetworkStateManager;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/network/core/NetworkCoreModule_OkhttpClientFactory;->module:Lcom/withpersona/sdk2/inquiry/network/core/NetworkCoreModule;

    iput-object p2, p0, Lcom/withpersona/sdk2/inquiry/network/core/NetworkCoreModule_OkhttpClientFactory;->interceptorsProvider:Lwt/i;

    iput-object p3, p0, Lcom/withpersona/sdk2/inquiry/network/core/NetworkCoreModule_OkhttpClientFactory;->headersProvider:Lwt/i;

    iput-object p4, p0, Lcom/withpersona/sdk2/inquiry/network/core/NetworkCoreModule_OkhttpClientFactory;->contextProvider:Lwt/i;

    iput-object p5, p0, Lcom/withpersona/sdk2/inquiry/network/core/NetworkCoreModule_OkhttpClientFactory;->deviceVendorIDProvider:Lwt/i;

    iput-object p6, p0, Lcom/withpersona/sdk2/inquiry/network/core/NetworkCoreModule_OkhttpClientFactory;->deviceInfoProvider:Lwt/i;

    iput-object p7, p0, Lcom/withpersona/sdk2/inquiry/network/core/NetworkCoreModule_OkhttpClientFactory;->loggerFactoryProvider:Lwt/i;

    iput-object p8, p0, Lcom/withpersona/sdk2/inquiry/network/core/NetworkCoreModule_OkhttpClientFactory;->networkStateManagerProvider:Lwt/i;

    return-void
.end method

.method public static create(Lcom/withpersona/sdk2/inquiry/network/core/NetworkCoreModule;Lwt/i;Lwt/i;Lwt/i;Lwt/i;Lwt/i;Lwt/i;Lwt/i;)Lcom/withpersona/sdk2/inquiry/network/core/NetworkCoreModule_OkhttpClientFactory;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/withpersona/sdk2/inquiry/network/core/NetworkCoreModule;",
            "Lwt/i<",
            "Ljava/util/Set<",
            "Lmv/a0;",
            ">;>;",
            "Lwt/i<",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;>;",
            "Lwt/i<",
            "Landroid/content/Context;",
            ">;",
            "Lwt/i<",
            "Lmo/k;",
            ">;",
            "Lwt/i<",
            "Lmo/b;",
            ">;",
            "Lwt/i<",
            "Lbq/e$a;",
            ">;",
            "Lwt/i<",
            "Lcom/withpersona/sdk2/inquiry/network/core/NetworkStateManager;",
            ">;)",
            "Lcom/withpersona/sdk2/inquiry/network/core/NetworkCoreModule_OkhttpClientFactory;"
        }
    .end annotation

    new-instance v0, Lcom/withpersona/sdk2/inquiry/network/core/NetworkCoreModule_OkhttpClientFactory;

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    move-object v7, p6

    move-object/from16 v8, p7

    invoke-direct/range {v0 .. v8}, Lcom/withpersona/sdk2/inquiry/network/core/NetworkCoreModule_OkhttpClientFactory;-><init>(Lcom/withpersona/sdk2/inquiry/network/core/NetworkCoreModule;Lwt/i;Lwt/i;Lwt/i;Lwt/i;Lwt/i;Lwt/i;Lwt/i;)V

    return-object v0
.end method

.method public static okhttpClient(Lcom/withpersona/sdk2/inquiry/network/core/NetworkCoreModule;Ljava/util/Set;Ljava/util/Map;Landroid/content/Context;Lmo/k;Lmo/b;Lbq/e$a;Lcom/withpersona/sdk2/inquiry/network/core/NetworkStateManager;)Lmv/d0;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/withpersona/sdk2/inquiry/network/core/NetworkCoreModule;",
            "Ljava/util/Set<",
            "Lmv/a0;",
            ">;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;",
            "Landroid/content/Context;",
            "Lmo/k;",
            "Lmo/b;",
            "Lbq/e$a;",
            "Lcom/withpersona/sdk2/inquiry/network/core/NetworkStateManager;",
            ")",
            "Lmv/d0;"
        }
    .end annotation

    invoke-virtual/range {p0 .. p7}, Lcom/withpersona/sdk2/inquiry/network/core/NetworkCoreModule;->okhttpClient(Ljava/util/Set;Ljava/util/Map;Landroid/content/Context;Lmo/k;Lmo/b;Lbq/e$a;Lcom/withpersona/sdk2/inquiry/network/core/NetworkStateManager;)Lmv/d0;

    move-result-object p0

    invoke-static {p0}, Lwt/h;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lmv/d0;

    return-object p0
.end method


# virtual methods
.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/withpersona/sdk2/inquiry/network/core/NetworkCoreModule_OkhttpClientFactory;->get()Lmv/d0;

    move-result-object v0

    return-object v0
.end method

.method public get()Lmv/d0;
    .locals 8

    .line 2
    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/network/core/NetworkCoreModule_OkhttpClientFactory;->module:Lcom/withpersona/sdk2/inquiry/network/core/NetworkCoreModule;

    iget-object v1, p0, Lcom/withpersona/sdk2/inquiry/network/core/NetworkCoreModule_OkhttpClientFactory;->interceptorsProvider:Lwt/i;

    invoke-interface {v1}, Lyt/a;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Set;

    iget-object v2, p0, Lcom/withpersona/sdk2/inquiry/network/core/NetworkCoreModule_OkhttpClientFactory;->headersProvider:Lwt/i;

    invoke-interface {v2}, Lyt/a;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map;

    iget-object v3, p0, Lcom/withpersona/sdk2/inquiry/network/core/NetworkCoreModule_OkhttpClientFactory;->contextProvider:Lwt/i;

    invoke-interface {v3}, Lyt/a;->get()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroid/content/Context;

    iget-object v4, p0, Lcom/withpersona/sdk2/inquiry/network/core/NetworkCoreModule_OkhttpClientFactory;->deviceVendorIDProvider:Lwt/i;

    invoke-interface {v4}, Lyt/a;->get()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lmo/k;

    iget-object v5, p0, Lcom/withpersona/sdk2/inquiry/network/core/NetworkCoreModule_OkhttpClientFactory;->deviceInfoProvider:Lwt/i;

    invoke-interface {v5}, Lyt/a;->get()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lmo/b;

    iget-object v6, p0, Lcom/withpersona/sdk2/inquiry/network/core/NetworkCoreModule_OkhttpClientFactory;->loggerFactoryProvider:Lwt/i;

    invoke-interface {v6}, Lyt/a;->get()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lbq/e$a;

    iget-object v7, p0, Lcom/withpersona/sdk2/inquiry/network/core/NetworkCoreModule_OkhttpClientFactory;->networkStateManagerProvider:Lwt/i;

    invoke-interface {v7}, Lyt/a;->get()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lcom/withpersona/sdk2/inquiry/network/core/NetworkStateManager;

    invoke-static/range {v0 .. v7}, Lcom/withpersona/sdk2/inquiry/network/core/NetworkCoreModule_OkhttpClientFactory;->okhttpClient(Lcom/withpersona/sdk2/inquiry/network/core/NetworkCoreModule;Ljava/util/Set;Ljava/util/Map;Landroid/content/Context;Lmo/k;Lmo/b;Lbq/e$a;Lcom/withpersona/sdk2/inquiry/network/core/NetworkStateManager;)Lmv/d0;

    move-result-object v0

    return-object v0
.end method
