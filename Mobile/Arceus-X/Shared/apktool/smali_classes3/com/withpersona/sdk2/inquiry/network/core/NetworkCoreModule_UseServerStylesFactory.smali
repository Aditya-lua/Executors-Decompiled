.class public final Lcom/withpersona/sdk2/inquiry/network/core/NetworkCoreModule_UseServerStylesFactory;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lft/d;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lft/d<",
        "Ljava/lang/String;",
        ">;"
    }
.end annotation


# instance fields
.field private final module:Lcom/withpersona/sdk2/inquiry/network/core/NetworkCoreModule;


# direct methods
.method private constructor <init>(Lcom/withpersona/sdk2/inquiry/network/core/NetworkCoreModule;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/network/core/NetworkCoreModule_UseServerStylesFactory;->module:Lcom/withpersona/sdk2/inquiry/network/core/NetworkCoreModule;

    return-void
.end method

.method public static create(Lcom/withpersona/sdk2/inquiry/network/core/NetworkCoreModule;)Lcom/withpersona/sdk2/inquiry/network/core/NetworkCoreModule_UseServerStylesFactory;
    .locals 1

    new-instance v0, Lcom/withpersona/sdk2/inquiry/network/core/NetworkCoreModule_UseServerStylesFactory;

    invoke-direct {v0, p0}, Lcom/withpersona/sdk2/inquiry/network/core/NetworkCoreModule_UseServerStylesFactory;-><init>(Lcom/withpersona/sdk2/inquiry/network/core/NetworkCoreModule;)V

    return-object v0
.end method

.method public static useServerStyles(Lcom/withpersona/sdk2/inquiry/network/core/NetworkCoreModule;)Ljava/lang/String;
    .locals 0

    invoke-virtual {p0}, Lcom/withpersona/sdk2/inquiry/network/core/NetworkCoreModule;->useServerStyles()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Lft/h;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/String;

    return-object p0
.end method


# virtual methods
.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/withpersona/sdk2/inquiry/network/core/NetworkCoreModule_UseServerStylesFactory;->get()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public get()Ljava/lang/String;
    .locals 1

    .line 2
    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/network/core/NetworkCoreModule_UseServerStylesFactory;->module:Lcom/withpersona/sdk2/inquiry/network/core/NetworkCoreModule;

    invoke-static {v0}, Lcom/withpersona/sdk2/inquiry/network/core/NetworkCoreModule_UseServerStylesFactory;->useServerStyles(Lcom/withpersona/sdk2/inquiry/network/core/NetworkCoreModule;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
