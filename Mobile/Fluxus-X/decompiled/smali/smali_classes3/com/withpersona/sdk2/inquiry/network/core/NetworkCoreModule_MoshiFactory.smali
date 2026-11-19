.class public final Lcom/withpersona/sdk2/inquiry/network/core/NetworkCoreModule_MoshiFactory;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lwt/d;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lwt/d<",
        "Lhn/w;",
        ">;"
    }
.end annotation


# instance fields
.field private final jsonAdapterBindingsProvider:Lwt/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lwt/i<",
            "Ljava/util/Set<",
            "Lcom/withpersona/sdk2/inquiry/network/core/JsonAdapterBinding<",
            "*>;>;>;"
        }
    .end annotation
.end field

.field private final jsonAdapterFactoryProvider:Lwt/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lwt/i<",
            "Ljava/util/Set<",
            "Lhn/h$e;",
            ">;>;"
        }
    .end annotation
.end field

.field private final jsonAdaptersProvider:Lwt/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lwt/i<",
            "Ljava/util/Set<",
            "Ljava/lang/Object;",
            ">;>;"
        }
    .end annotation
.end field

.field private final module:Lcom/withpersona/sdk2/inquiry/network/core/NetworkCoreModule;


# direct methods
.method private constructor <init>(Lcom/withpersona/sdk2/inquiry/network/core/NetworkCoreModule;Lwt/i;Lwt/i;Lwt/i;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/withpersona/sdk2/inquiry/network/core/NetworkCoreModule;",
            "Lwt/i<",
            "Ljava/util/Set<",
            "Ljava/lang/Object;",
            ">;>;",
            "Lwt/i<",
            "Ljava/util/Set<",
            "Lcom/withpersona/sdk2/inquiry/network/core/JsonAdapterBinding<",
            "*>;>;>;",
            "Lwt/i<",
            "Ljava/util/Set<",
            "Lhn/h$e;",
            ">;>;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/network/core/NetworkCoreModule_MoshiFactory;->module:Lcom/withpersona/sdk2/inquiry/network/core/NetworkCoreModule;

    iput-object p2, p0, Lcom/withpersona/sdk2/inquiry/network/core/NetworkCoreModule_MoshiFactory;->jsonAdaptersProvider:Lwt/i;

    iput-object p3, p0, Lcom/withpersona/sdk2/inquiry/network/core/NetworkCoreModule_MoshiFactory;->jsonAdapterBindingsProvider:Lwt/i;

    iput-object p4, p0, Lcom/withpersona/sdk2/inquiry/network/core/NetworkCoreModule_MoshiFactory;->jsonAdapterFactoryProvider:Lwt/i;

    return-void
.end method

.method public static create(Lcom/withpersona/sdk2/inquiry/network/core/NetworkCoreModule;Lwt/i;Lwt/i;Lwt/i;)Lcom/withpersona/sdk2/inquiry/network/core/NetworkCoreModule_MoshiFactory;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/withpersona/sdk2/inquiry/network/core/NetworkCoreModule;",
            "Lwt/i<",
            "Ljava/util/Set<",
            "Ljava/lang/Object;",
            ">;>;",
            "Lwt/i<",
            "Ljava/util/Set<",
            "Lcom/withpersona/sdk2/inquiry/network/core/JsonAdapterBinding<",
            "*>;>;>;",
            "Lwt/i<",
            "Ljava/util/Set<",
            "Lhn/h$e;",
            ">;>;)",
            "Lcom/withpersona/sdk2/inquiry/network/core/NetworkCoreModule_MoshiFactory;"
        }
    .end annotation

    new-instance v0, Lcom/withpersona/sdk2/inquiry/network/core/NetworkCoreModule_MoshiFactory;

    invoke-direct {v0, p0, p1, p2, p3}, Lcom/withpersona/sdk2/inquiry/network/core/NetworkCoreModule_MoshiFactory;-><init>(Lcom/withpersona/sdk2/inquiry/network/core/NetworkCoreModule;Lwt/i;Lwt/i;Lwt/i;)V

    return-object v0
.end method

.method public static moshi(Lcom/withpersona/sdk2/inquiry/network/core/NetworkCoreModule;Ljava/util/Set;Ljava/util/Set;Ljava/util/Set;)Lhn/w;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/withpersona/sdk2/inquiry/network/core/NetworkCoreModule;",
            "Ljava/util/Set<",
            "Ljava/lang/Object;",
            ">;",
            "Ljava/util/Set<",
            "Lcom/withpersona/sdk2/inquiry/network/core/JsonAdapterBinding<",
            "*>;>;",
            "Ljava/util/Set<",
            "Lhn/h$e;",
            ">;)",
            "Lhn/w;"
        }
    .end annotation

    invoke-virtual {p0, p1, p2, p3}, Lcom/withpersona/sdk2/inquiry/network/core/NetworkCoreModule;->moshi(Ljava/util/Set;Ljava/util/Set;Ljava/util/Set;)Lhn/w;

    move-result-object p0

    invoke-static {p0}, Lwt/h;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lhn/w;

    return-object p0
.end method


# virtual methods
.method public get()Lhn/w;
    .locals 4

    .line 2
    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/network/core/NetworkCoreModule_MoshiFactory;->module:Lcom/withpersona/sdk2/inquiry/network/core/NetworkCoreModule;

    iget-object v1, p0, Lcom/withpersona/sdk2/inquiry/network/core/NetworkCoreModule_MoshiFactory;->jsonAdaptersProvider:Lwt/i;

    invoke-interface {v1}, Lyt/a;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Set;

    iget-object v2, p0, Lcom/withpersona/sdk2/inquiry/network/core/NetworkCoreModule_MoshiFactory;->jsonAdapterBindingsProvider:Lwt/i;

    invoke-interface {v2}, Lyt/a;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Set;

    iget-object v3, p0, Lcom/withpersona/sdk2/inquiry/network/core/NetworkCoreModule_MoshiFactory;->jsonAdapterFactoryProvider:Lwt/i;

    invoke-interface {v3}, Lyt/a;->get()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/Set;

    invoke-static {v0, v1, v2, v3}, Lcom/withpersona/sdk2/inquiry/network/core/NetworkCoreModule_MoshiFactory;->moshi(Lcom/withpersona/sdk2/inquiry/network/core/NetworkCoreModule;Ljava/util/Set;Ljava/util/Set;Ljava/util/Set;)Lhn/w;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/withpersona/sdk2/inquiry/network/core/NetworkCoreModule_MoshiFactory;->get()Lhn/w;

    move-result-object v0

    return-object v0
.end method
