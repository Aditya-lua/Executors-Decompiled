.class public final Lcom/withpersona/sdk2/inquiry/network/core/NetworkCoreModule_MoshiFactory;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lft/d;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lft/d<",
        "Lum/w;",
        ">;"
    }
.end annotation


# instance fields
.field private final jsonAdapterBindingsProvider:Lft/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lft/i<",
            "Ljava/util/Set<",
            "Lcom/withpersona/sdk2/inquiry/network/core/JsonAdapterBinding<",
            "*>;>;>;"
        }
    .end annotation
.end field

.field private final jsonAdapterFactoryProvider:Lft/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lft/i<",
            "Ljava/util/Set<",
            "Lum/h$e;",
            ">;>;"
        }
    .end annotation
.end field

.field private final jsonAdaptersProvider:Lft/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lft/i<",
            "Ljava/util/Set<",
            "Ljava/lang/Object;",
            ">;>;"
        }
    .end annotation
.end field

.field private final module:Lcom/withpersona/sdk2/inquiry/network/core/NetworkCoreModule;


# direct methods
.method private constructor <init>(Lcom/withpersona/sdk2/inquiry/network/core/NetworkCoreModule;Lft/i;Lft/i;Lft/i;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/withpersona/sdk2/inquiry/network/core/NetworkCoreModule;",
            "Lft/i<",
            "Ljava/util/Set<",
            "Ljava/lang/Object;",
            ">;>;",
            "Lft/i<",
            "Ljava/util/Set<",
            "Lcom/withpersona/sdk2/inquiry/network/core/JsonAdapterBinding<",
            "*>;>;>;",
            "Lft/i<",
            "Ljava/util/Set<",
            "Lum/h$e;",
            ">;>;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/network/core/NetworkCoreModule_MoshiFactory;->module:Lcom/withpersona/sdk2/inquiry/network/core/NetworkCoreModule;

    iput-object p2, p0, Lcom/withpersona/sdk2/inquiry/network/core/NetworkCoreModule_MoshiFactory;->jsonAdaptersProvider:Lft/i;

    iput-object p3, p0, Lcom/withpersona/sdk2/inquiry/network/core/NetworkCoreModule_MoshiFactory;->jsonAdapterBindingsProvider:Lft/i;

    iput-object p4, p0, Lcom/withpersona/sdk2/inquiry/network/core/NetworkCoreModule_MoshiFactory;->jsonAdapterFactoryProvider:Lft/i;

    return-void
.end method

.method public static create(Lcom/withpersona/sdk2/inquiry/network/core/NetworkCoreModule;Lft/i;Lft/i;Lft/i;)Lcom/withpersona/sdk2/inquiry/network/core/NetworkCoreModule_MoshiFactory;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/withpersona/sdk2/inquiry/network/core/NetworkCoreModule;",
            "Lft/i<",
            "Ljava/util/Set<",
            "Ljava/lang/Object;",
            ">;>;",
            "Lft/i<",
            "Ljava/util/Set<",
            "Lcom/withpersona/sdk2/inquiry/network/core/JsonAdapterBinding<",
            "*>;>;>;",
            "Lft/i<",
            "Ljava/util/Set<",
            "Lum/h$e;",
            ">;>;)",
            "Lcom/withpersona/sdk2/inquiry/network/core/NetworkCoreModule_MoshiFactory;"
        }
    .end annotation

    new-instance v0, Lcom/withpersona/sdk2/inquiry/network/core/NetworkCoreModule_MoshiFactory;

    invoke-direct {v0, p0, p1, p2, p3}, Lcom/withpersona/sdk2/inquiry/network/core/NetworkCoreModule_MoshiFactory;-><init>(Lcom/withpersona/sdk2/inquiry/network/core/NetworkCoreModule;Lft/i;Lft/i;Lft/i;)V

    return-object v0
.end method

.method public static moshi(Lcom/withpersona/sdk2/inquiry/network/core/NetworkCoreModule;Ljava/util/Set;Ljava/util/Set;Ljava/util/Set;)Lum/w;
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
            "Lum/h$e;",
            ">;)",
            "Lum/w;"
        }
    .end annotation

    invoke-virtual {p0, p1, p2, p3}, Lcom/withpersona/sdk2/inquiry/network/core/NetworkCoreModule;->moshi(Ljava/util/Set;Ljava/util/Set;Ljava/util/Set;)Lum/w;

    move-result-object p0

    invoke-static {p0}, Lft/h;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lum/w;

    return-object p0
.end method


# virtual methods
.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/withpersona/sdk2/inquiry/network/core/NetworkCoreModule_MoshiFactory;->get()Lum/w;

    move-result-object v0

    return-object v0
.end method

.method public get()Lum/w;
    .locals 4

    .line 2
    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/network/core/NetworkCoreModule_MoshiFactory;->module:Lcom/withpersona/sdk2/inquiry/network/core/NetworkCoreModule;

    iget-object v1, p0, Lcom/withpersona/sdk2/inquiry/network/core/NetworkCoreModule_MoshiFactory;->jsonAdaptersProvider:Lft/i;

    invoke-interface {v1}, Lht/a;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Set;

    iget-object v2, p0, Lcom/withpersona/sdk2/inquiry/network/core/NetworkCoreModule_MoshiFactory;->jsonAdapterBindingsProvider:Lft/i;

    invoke-interface {v2}, Lht/a;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Set;

    iget-object v3, p0, Lcom/withpersona/sdk2/inquiry/network/core/NetworkCoreModule_MoshiFactory;->jsonAdapterFactoryProvider:Lft/i;

    invoke-interface {v3}, Lht/a;->get()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/Set;

    invoke-static {v0, v1, v2, v3}, Lcom/withpersona/sdk2/inquiry/network/core/NetworkCoreModule_MoshiFactory;->moshi(Lcom/withpersona/sdk2/inquiry/network/core/NetworkCoreModule;Ljava/util/Set;Ljava/util/Set;Ljava/util/Set;)Lum/w;

    move-result-object v0

    return-object v0
.end method
