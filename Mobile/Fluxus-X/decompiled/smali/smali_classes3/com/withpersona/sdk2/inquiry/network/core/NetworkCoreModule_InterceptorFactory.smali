.class public final Lcom/withpersona/sdk2/inquiry/network/core/NetworkCoreModule_InterceptorFactory;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lwt/d;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lwt/d<",
        "Lmv/a0;",
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


# direct methods
.method private constructor <init>(Lcom/withpersona/sdk2/inquiry/network/core/NetworkCoreModule;Lwt/i;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/withpersona/sdk2/inquiry/network/core/NetworkCoreModule;",
            "Lwt/i<",
            "Lhn/w;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/network/core/NetworkCoreModule_InterceptorFactory;->module:Lcom/withpersona/sdk2/inquiry/network/core/NetworkCoreModule;

    iput-object p2, p0, Lcom/withpersona/sdk2/inquiry/network/core/NetworkCoreModule_InterceptorFactory;->moshiProvider:Lwt/i;

    return-void
.end method

.method public static create(Lcom/withpersona/sdk2/inquiry/network/core/NetworkCoreModule;Lwt/i;)Lcom/withpersona/sdk2/inquiry/network/core/NetworkCoreModule_InterceptorFactory;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/withpersona/sdk2/inquiry/network/core/NetworkCoreModule;",
            "Lwt/i<",
            "Lhn/w;",
            ">;)",
            "Lcom/withpersona/sdk2/inquiry/network/core/NetworkCoreModule_InterceptorFactory;"
        }
    .end annotation

    new-instance v0, Lcom/withpersona/sdk2/inquiry/network/core/NetworkCoreModule_InterceptorFactory;

    invoke-direct {v0, p0, p1}, Lcom/withpersona/sdk2/inquiry/network/core/NetworkCoreModule_InterceptorFactory;-><init>(Lcom/withpersona/sdk2/inquiry/network/core/NetworkCoreModule;Lwt/i;)V

    return-object v0
.end method

.method public static interceptor(Lcom/withpersona/sdk2/inquiry/network/core/NetworkCoreModule;Lhn/w;)Lmv/a0;
    .locals 0

    invoke-virtual {p0, p1}, Lcom/withpersona/sdk2/inquiry/network/core/NetworkCoreModule;->interceptor(Lhn/w;)Lmv/a0;

    move-result-object p0

    invoke-static {p0}, Lwt/h;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lmv/a0;

    return-object p0
.end method


# virtual methods
.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/withpersona/sdk2/inquiry/network/core/NetworkCoreModule_InterceptorFactory;->get()Lmv/a0;

    move-result-object v0

    return-object v0
.end method

.method public get()Lmv/a0;
    .locals 2

    .line 2
    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/network/core/NetworkCoreModule_InterceptorFactory;->module:Lcom/withpersona/sdk2/inquiry/network/core/NetworkCoreModule;

    iget-object v1, p0, Lcom/withpersona/sdk2/inquiry/network/core/NetworkCoreModule_InterceptorFactory;->moshiProvider:Lwt/i;

    invoke-interface {v1}, Lyt/a;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lhn/w;

    invoke-static {v0, v1}, Lcom/withpersona/sdk2/inquiry/network/core/NetworkCoreModule_InterceptorFactory;->interceptor(Lcom/withpersona/sdk2/inquiry/network/core/NetworkCoreModule;Lhn/w;)Lmv/a0;

    move-result-object v0

    return-object v0
.end method
